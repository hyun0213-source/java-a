
import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int width;
    int height;
    char type;
    int area;
    boolean flag;

    System.out.print("사각형의 가로 길이 입력 (예 5) :");
    width = keyboard.nextInt();
    System.out.print("사각형의 세로 길이 입력 (예 5) :");
    height = keyboard.nextInt();

    flag = (width > 0 && height > 0) ? true : false;
    type = (width == height) ? '정' : '직';
    area = width * height;


    String result = flag == true ? String.format("%c사각형 넓이\n\t가로 길이 : %,d Cm\n" +
            "\t세로 길이 : %,d Cm\n\t넓 이 : %,d \u33a0\n",type,width,height,area) : "date 오류 입니다";
    System.out.println(result);
    System.out.printf("%c사각형 넓이\n", type);
    System.out.printf("\t가로 길이 : %,d Cm\n", width);
    System.out.printf("\t세로 길이 : %,d Cm\n", height);
    System.out.printf("\t넓 이 : %,d \u33a0\n",area);




}
