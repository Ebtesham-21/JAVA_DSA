public class PatternsHolo {

    public static void hollow_rectangle(int totRows, int totCols){
        // outer loop
        for(int i=1; i<=totRows; i++){
            // inner columns
            for(int j=1; j<=totCols; j++){
                // cell(i, j)
                if( i == 1 || i== totRows || j==1 || j== totCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();

         }
    }


    public static void inverted_rotated_half_pyramid(int n){
        // outer
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inverted_half_pyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int counter = 1;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }

        System.out.println();
        }
        

    }

    public static void EVODDTRIANGLE(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((j+i)%2 == 0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    // public static void Butterfly(int n){
    //     for(int i = 1; i<=n; i++){
    //         if(i<=n/2){
    //             for(int j=1; j<=i; j++){
    //                 System.out.print("*");
    //                 System.out.print(" ");
    //                 System.out.print("*");
    //             }
    //         } else {
    //             for(int j = n/2; j>=1; j--){
    //                 System.out.print("*");
    //                 System.out.print(" ");
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void Butterfly(int n) {
    //     for(int i = 1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=n; i>=1; i--){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     } 
    // }

    // public static void Rohombus(int n){
    //     for (int i = 1; i<=n; i++){
    //         for(int j = 1; j <= n-i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j =1; j<=n; j++){
    //             System.out.print("*");
    //         }
    //         System.err.println();
    //     }

    // }
    // public static void hollow_rhombus(int n) {
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i); j++){
    //             System.out.print(" ");
    //         }

    //         for(int j=1; j<=n; j++){
    //             if(i == 1 || i == n || j == 1 || j == n){
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
     
    // public static void Diamond(int n){
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print(" ");

    //         }
    //         for(int j = 1; j<=(2*i) - 1; j++){
    //             System.out.print("*");

    //         }
    //     System.out.println();    
    //     }


    //     for(int i = n; i>=1; i--){
    //         for(int j = 1; j<=(n-i); j++){
    //             System.out.print(" ");

    //         }
    //         for(int j = 1; j<=(2*i) - 1; j++){
    //             System.out.print("*");

    //         }
    //     System.out.println();    
    //     }

    // }

    public static void NumberPiramid(int n){
        int  counter = 1;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(counter+" ");
            }
            System.out.println();
            counter++;
        }
    }

    public static void palindromeNum(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectangle(10, 7);
        // inverted_rotated_half_pyramid(5);
        // Inverted_half_pyramid(5);
        // EVODDTRIANGLE(5);
        // Butterfly(5);
        // Rohombus(5);
    // hollow_rhombus(5);
    // Diamond(4);
    // NumberPiramid(5);
    palindromeNum(5);
    
    }
    
}
