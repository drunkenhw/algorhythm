import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;
 
public class Main {
    static int n,m,r,num;
    static int[][] map;
    static int[][] tmpMap;
 
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
 
        map = new int[n][m];
 
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
 
 
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<r; i++){

            num = Integer.parseInt(st.nextToken());
 
            switch(num){
                case 1:
                    one();
                    break;
                case 2:
                    two();
                    break;
                case 3:
                    three();
                    break;
                case 4:
                    four();
                    break;
                case 5:
                    five();
                    break;
                case 6:
                    six();
                    break;
 
            }
 
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(map[i][j]+ " " );
            }
            System.out.println();
        }
    }
 

    public static void one(){
        tmpMap = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                tmpMap[n-i-1][j] = map[i][j];  
            }
        }
        map = tmpMap;
    }
    public static void two(){
        tmpMap = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               tmpMap[i][m-j-1] = map[i][j]; 
            }
        }
        map = tmpMap;
    }
    public static void three(){
        tmpMap = new int[m][n];
 
        for(int i=0; i<n; i++){
 
            for(int j=0; j<m; j++){
                tmpMap[j][n-i-1] =  map[i][j];
            }
        }
        int tmp = n;
        n = m;
        m= tmp;
 
        map = tmpMap;
 
    }
    public static void four(){
        tmpMap = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                tmpMap[m-j-1][i] =  map[i][j];
            }
        }
        int tmp = n;
        n = m;
        m= tmp;
 
        map = tmpMap;
    }
    public static void five(){
        tmpMap = new int[n][m];
        for(int i=0; i<n/2; i++){
            for(int j=0; j<m/2; j++){
                tmpMap[i][m/2+j] = map[i][j];
 
            }
        }

        for(int i=0; i<n/2; i++){
            for(int j=m/2; j<m; j++){
                tmpMap[n/2+i][j] = map[i][j];
            }
        }
        for(int i=n/2; i<n; i++){
            for(int j=m/2; j<m; j++){
                tmpMap[i][j-m/2] = map[i][j];
            }
        }
        for(int i=n/2; i<n; i++){
            for(int j=0; j<m/2; j++){
                tmpMap[i-n/2][j] = map[i][j];
            }
        }
        map = tmpMap;
 
    }
    public static void six(){
        tmpMap = new int[n][m];
        for(int i=0; i<n/2; i++){
            for(int j=0; j<m/2; j++){
                tmpMap[n/2+i][j] = map[i][j];
 
            }
        }
        
         for(int i=n/2; i<n; i++){
            for(int j=0; j<m/2; j++){
                tmpMap[i][j+m/2] = map[i][j];
            }
        }
 
        for(int i=n/2; i<n; i++){
            for(int j=m/2; j<m; j++){
                tmpMap[i-n/2][j] = map[i][j];
            }
        }
       
        for(int i=0; i<n/2; i++){
            for(int j=m/2; j<m; j++){
                tmpMap[i][j-m/2] = map[i][j];
            }
        }
        
        map = tmpMap;
 
    }
}