public class Triangle {
    public static void main(String[] args) {
        int height = 8, width = 14;

        for (int i = 0; i <= height; i++) {
            int num = (width * i) / height;
               int space = (width - num) / 2;

         for (int j = 0; j < space; j++) {
           System.out.print(" ");
         }
            for (int j = 0; j < num; j++) {
              System.out.print("T");
            }
            System.out.println();
        }
    }
}
