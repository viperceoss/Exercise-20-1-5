import java.util.Arrays;

public class SubString {
    /**
     * 1.创建一个数组char a 用来存放字符串string
     * 2.用 String ——> 字符数组
     *      char[] a = str.toCharArray();
     * 3.创建一个新的数组char b 用来接收截取的字段信息
     * 4.因为汉字被算成2个字节是按字节截取所以按照截取的数组下标从i到j循环遍历数组，
     *   判断数组元素是否为汉字如果是汉字的话那么新得到的数组长度应该减1 也就是说要
     *   对j进行减1的操作并且把相应的a[i]赋值给b[i]得到数组b
     * 5.用 数组———>字符串
     *   string a = String.valueof(b).
     */
   String str = "国b中aabab国ba国baba国baa国a国BC";

     char[] a = str.toCharArray();

     String result="";

     public  String subString(int m ,int n){


         /*for(int i = 0,k = n,j=m-1;i <= k-1;i++){
             if (i<j&&a[i] >= 0x4E00 && a[i] <= 0x9FA5){
                 k--;
                 j--;
             }
             else if (i>=j){
                 if (a[i] >= 0x4E00 && a[i] <= 0x9FA5){
                     k--;
                     result+=a[i];
                 }
                 else{
                         result+=a[i];
                 }


             }

             }
         return result;
         }*/

         for(int i=0,j=0;i<n-1;i++){
             if (a[i] >= 0x4E00 && a[i] <= 0x9FA5){
                 j++;
             }
             j++;
             if(j >= m && j<=n){
                 result += a[i];

             }
             }


         return result;
         }




    public static void main(String[] args) {
         SubString k = new SubString();
         System.out.println(k.subString(3,5));
    }

}
