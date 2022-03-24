package solution;

public class RectanglesCounter {

    public static int countRectangles(boolean[][] arr){
        int counter = 0;

        if(arr == null || arr.length < 2) return 0;
        for(int i = 0; i < arr.length - 1; ++i){
            for(int k = i + 1; k < arr.length; ++k){
                for(int g = 0; g <= arr[i].length - 2; ++g){
                    if(!arr[i][g] || !arr[k][g]) continue;
                    for(int j = arr[i].length - 1; j > g; --j){
                        if(arr[i][j] && arr[k][j]){
                            ++counter;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) throws Exception {

    }
}