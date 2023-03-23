package cp6.classAndInstance;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

/**
 * packageName    : cp6.classAndInstance
 * fileName       : ChatGpt
 * author         : ipeac
 * date           : 2023-03-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-22        ipeac       최초 생성
 */
public class ChatGpt {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException, InterruptedException {
        String apiKey = "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"; // 여기에 실제 API 키를 사용하세요 -> 깃허브에 올라가면 거시기함
        System.out.print("무슨 단어를 찾는지 검색 : ");
        String searchText = br.readLine();

        String input = """
                {
                    "model": "text-davinci-001",
                    "prompt": "%s",
                    "temperature": 1,
                    "max_tokens": 100
                }
                """.formatted(searchText);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openai.com/v1/completions"))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(input))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        bw.write(response.statusCode() + "\n");
        bw.write(response.body() + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    // 2차원 List 출력 메소드
    public static void print2DList(List<List<Integer>> twoDList) throws IOException {
        bw.write("[ ");
        for (List<Integer> row : twoDList) {
            for (Integer value : row) {
                bw.write(value + " ");
            }
            bw.newLine();
        }
    }
}
