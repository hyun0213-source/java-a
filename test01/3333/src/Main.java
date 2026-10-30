
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("지출액 입력 : ");
    double expenditure = keyboard.nextDouble();

    System.out.print("저축액 입력 : ");
    double savings = keyboard.nextDouble();

    // 식 생활비 및 엠겔 지수 계산
    double foodExpenses = expenditure - savings;
    double engelIndex = (foodExpenses / expenditure) * 100;

    // 삼항 연산자를 이용한 판정
    String result = (engelIndex <= 30) ? "상류층" : (engelIndex <= 50) ? "중산층" : "하류층";

    // 결과 출력
    System.out.printf("식 생활비 : %.0f원\n", foodExpenses);
    System.out.printf("엠겔 지수 : %.2f\n", engelIndex);
    System.out.println("판정 결과 : " + result);
}