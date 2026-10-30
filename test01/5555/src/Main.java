
void main() {
    Scanner keyboard = new Scanner(System.in);

    // 1. 매입원가 입력받기 (또는 고정값 1015000 지정 가능)
    System.out.print("매입원가를 입력하세요 : ");
    double costPrice = keyboard.nextDouble(); // 예: 1015000

    double profitRate = 0.3; // 이익률 30%
    double taxRate = 0.1;    // 세율 10%

    // 2. 제시된 공식에 따른 계산
    // 정가(매출액) = 매입원가 * (1 + 이익률)
    double price = costPrice * (1 + profitRate);

    // 매출 세액 = 매출액 * 세율
    double salesTax = price * taxRate;

    // 매입 세액 = 매입액 * 세율
    double purchaseTax = costPrice * taxRate;

    // 납부세액 = 매출세액 - 매입세액
    double payTax = salesTax - purchaseTax;

    // 3. 결과 출력
    System.out.printf("정가(매출액) : %,.0f원\n", price);
    System.out.printf("매출 세액   : %,.0f원\n", salesTax);
    System.out.printf("매입 세액   : %,.0f원\n", purchaseTax);
    System.out.printf("납부 세액   : %,.0f원\n", payTax);
}