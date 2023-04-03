public class Main {
    public static void main(String[] args) {
//        String str1 = "abcdefghijklmnop";
//        String str2 = "abcdefghijklmnop";
//        String str3 = "                  abcde";
//        String str4 = "JAHSjsdjITEYU";
//        System.out.println("- độ dài của chuỗi ---> "+str1.length());
//        System.out.println("- trả về kí tự tại vị trí index (5) trong chuỗi ---> " + str1.charAt(5));
//        System.out.println("- chuỗi con bắt đầu từ vị trí ... đến ... "+ str1.substring(0,3));
//        System.out.println("- so sánh chuỗi hiện tại với obj : "+ str1.equals(str2));
//        System.out.println("- so sánh chuỗi hiện tại với obj: "+ str1.equals(str3));
//        System.out.println("- tìm kí tự theo vị trí index: " + str1.indexOf(2));
//        System.out.println("- nối chuỗi :" + str1.concat(str3));
//        System.out.println("- ký tự được chuyển thành chữ thường : " + str4);
//        System.out.println("- ký tự được chuyển thành chữ hoa : " + str1);
//        System.out.println("- thay thế kí tự bằng chuỗi mới: "+ str1.replace("abc","123"));
//        System.out.println("- loại bỏ khoảng trắng trong chuỗi: "+ str3);
//

        ///tringBuilder

//        StringBuilder stringBuilder = new StringBuilder("123abcd");
//        System.out.println(" nối chuỗi ---> "+ stringBuilder.append("345"));
//        System.out.println("chèn chuỗi vào vị trí ---> "  +stringBuilder.insert(2, "tathuha"));
//        System.out.println("xoá kí tự trong khảng ---> " + stringBuilder.delete(2,7));
//        System.out.println("đảo ngược kí tự trong chuỗi -- > " +  stringBuilder.reverse());
//        stringBuilder = new StringBuilder("tathu");
//        stringBuilder.setCharAt(0,'C');
//        System.out.println(stringBuilder);
//        System.out.println("dung lượng bộ nhớ đệm ---> "  + stringBuilder.capacity());
//        System.out.println("so sánh ---> " + stringBuilder.equals("tathu"));


        ////StringBuffer
        StringBuffer stringBuffer = new StringBuffer("123abcd");
        stringBuffer.append("ghi");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.insert(3,"kkk"));
        System.out.println(stringBuffer.delete(3,6));
        System.out.println(stringBuffer.replace(5,9,"pppp"));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.lastIndexOf("p"));



        //////////////////////////////

    }
}