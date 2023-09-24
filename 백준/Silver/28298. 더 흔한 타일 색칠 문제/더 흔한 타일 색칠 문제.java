import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer streamTokenizer = new StringTokenizer(reader.readLine());
        int[] countList = new int[26];
        int sum = 0;

        int N = Integer.parseInt(streamTokenizer.nextToken());
        int M = Integer.parseInt(streamTokenizer.nextToken());
        int K = Integer.parseInt(streamTokenizer.nextToken());

        char[][] tile = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = reader.readLine();
            for (int j = 0; j < M; j++) {
                tile[i][j] = line.charAt(j);
            }
        }

        for (int x = 0; x < K; x++) {
            for (int y = 0; y < K; y++) {

                for (int i = 0; i < 26; i++) {
                    countList[i] = 0;
                }
                for (int i = 0; i <= N - K; i += K) {
                    for (int j = 0; j <= M - K; j += K) {
                        int t = tile[i + x][j + y] - 'A';
                        countList[t]++;
                    }
                }

                int maxTileNum = 0;
                int maxTileIndex = 0;

                for (int i = 0; i < countList.length; i++) {
                    if (countList[i] > maxTileNum) {
                        maxTileNum = countList[i];
                        maxTileIndex = i;
                    }
                }
                int stepNum = N * M / (K * K);

                sum += stepNum - maxTileNum;
                char maxTile = (char) (maxTileIndex + 'A');

                for (int i = 0; i <= N - K; i += K) {
                    for (int j = 0; j <= M - K; j += K) {
                        tile[i + x][j + y] = maxTile;
                    }
                }
            }
        }

        System.out.println(sum);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(tile[i][j]);
            }
            System.out.println();
        }
    }
}

