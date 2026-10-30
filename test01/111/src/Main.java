
void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print("나이를 입력하세요 : ");
    age = keyboard.nextInt();

    // 조건 연산자(? :)를 이용한 요금 계산
    int fee = (age >= 18) ? 4000 : (age >= 13) ? 3000 : (age >= 7) ? 1000 : 0;

    System.out.printf("나이: %d세, 입장료: %,d원입니다.\n", age, fee);
}