package javapractice;

class Arrays{
    public static void main(String[] a) {
        /* 1D array
        int arr[]={1,2,3,4};
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        } */

        int arr[][]=new int[3][];
        arr[0]=new int[4];
        arr[1]=new int[5];
        arr[2]=new int[3];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        /* Nested For-loop
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        } */

        /* Enhanced For-loop
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println(" ");
        } */
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println(" ");
        }



    }
}