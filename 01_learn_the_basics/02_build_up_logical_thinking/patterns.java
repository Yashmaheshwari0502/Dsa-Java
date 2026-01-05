package learn_the_basics.build_up_logical_thinking;

class patterns {
    public static void pat1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void pat4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void pat5(int n) {
        for (int i = 4; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat6(int n) {
        for (int i = n; i >= 1; i--) {
            int count = 1;
            for (int j = i; j >= 1; j--) {
                System.out.print(count++);
            }
            System.out.println("");
        }
    }

    public static void pat7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat8(int n) {
        for (int i = n; i >= 1; i--) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat11(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                value = 0;
            } else {
                value = 1;
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(value);
                if (value == 1) {
                    value = 0;
                } else {
                    value = 1;
                }
            }
            System.out.println("");
        }
    }

    public static void pat12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 2 * n; k > 2 * i; k--) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println("");
        }
    }

    public static void pat13(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", count++);
            }
            System.out.println("");
        }
    }

    public static void pat14(int n) {
        for (int i = 1; i <= n; i++) {
            char v = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(v++);
            }
            System.out.println("");
        }
    }

    public static void pat15(int n) {
        for (int i = n; i >= 1; i--) {
            char v = 'A';
            for (int j = i; j >= 1; j--) {
                System.out.print(v++);
            }
            System.out.println("");
        }
    }

    public static void pat16(int n) {
        char v = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(v);
            }
            v++;
            System.out.println("");
        }
    }

    public static void pat17(int n) {

        for (int i = 1; i <= n; i++) {
            char v = 'A';
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(v);
                if (k < i) {
                    v++;
                } else {
                    v--;
                }
            }
            System.out.println("");

        }
    }

    public static void pat18(int n) {
        char v = 'E';
        for (int i = 1; i <= n; i++) {

            for (char j = v; j <= 'E'; j++) {
                System.out.print(j + " ");
            }
            v--;
            System.out.println("");
        }
    }

    public static void pat19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 2; k < 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2 * n; k > 2 * i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pat20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= (2 * n - 1); i++) {
            int stars = i;
            
            if (i > n)
                stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
            
        }
    }

    public static void pat21(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void pat22(int n){
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int top=i-1;
                int bottom =2*n-1-i;
                int left=j-1;
                int right=2*n-1-j;
                int value=n-Math.min(Math.min(top,bottom), Math.min(left, right));
                System.out.print(value);

            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        // pat1(5);
        // pat2(5);
        // pat3(5);
        // pat4(5);
        // pat5(5);
        // pat6(5);
        // pat7(5);
        // pat8(5);
        // pat9(6);
        // pat10(10);
        // pat11(20);
        // pat12(4);
        // pat13(5);
        // pat14(5);
        // pat15(5);
        // pat16(5);
        // pat17(4);
        // pat18(5);
        // pat19(5);
        // pat20(5);
        // pat21(4);
        pat22(4);
    }
}