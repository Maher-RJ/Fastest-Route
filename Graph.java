public class Graph {
    public static void main(String[] args) {
        int from[] = {0,0,1};
        int to[] = {1,2,3};
        System.out.println(fastestRoute(from, to, 2, 3));
    }
    public static int fastestRoute(int[] from, int[] to, int locationA, int locationB) {
        int count = 1;
        for(int i = 0; i < from.length; i++) {
            if(to[i] == locationA) {
                for(int j = i+1; j < from.length; j++) {
                    count++;
                    if(to[j] == locationB) {
                        count++;
                        break;
                    }
                    else if(to[j] == locationA) {
                        count = 1;
                        i = j;
                        break;
                    }
                }
            }
            if(count > 1) {
                break;
            }
        }
        if(count == 1 || count == 0) {
            count = -1;
        }
        return count;
    }
}