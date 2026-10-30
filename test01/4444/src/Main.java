void main() {
    Scanner keyboard = new Scanner(System.in);

    // 1. 입력 안내 문구 출력 및 값 입력
    System.out.print("첫 번째 변 a : ");
    int a = keyboard.nextInt();

    System.out.print("두 번째 변 b : ");
    int b = keyboard.nextInt();

    System.out.print("세 번째 변 c : ");
    int c = keyboard.nextInt();

    // 2. 삼각형 성립 조건 검사 (a+b > c, a+c > b, b+c > a)
    if (a + b > c && a + c > b && b + c > a) {
        System.out.println("삼각형이 성립합니다.");

        // 직각삼각형 판단 조건 (피타고라스 정리)
        boolean isRight = (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);

        // 3. 삼각형 종류 판정
        String type = "";
        if (a == b && b == c) {
            type = "정삼각형";
        } else if (isRight) {
            type = "일반 삼각형 (직각 삼각형)";
        } else if (a == b || b == c || a == c) {
            type = "이등변 삼각형";
        } else {
            type = "일반 삼각형";
        }

        // 4. 면적 계산 (헤론의 공식)
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // 5. 실행 결과와 동일한 형식으로 출력
        System.out.println("삼각형의 종류 : " + type);
        System.out.printf("삼각형의 면적 : %.2f cm²\n", area);

    } else {
        System.out.println("삼각형이 성립하지 않습니다.");
    }
}