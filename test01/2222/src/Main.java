
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("시간 입력 : ");
    double time = keyboard.nextDouble();

    // 입력받은 시간(hours)을 총 초(seconds) 단위로 변환
    // 1시간 = 3600초 (3.76시간 = 13536초)
    int totalSeconds = (int) (time * 3600);

    // 일, 시간, 분, 초 계산
    int days = totalSeconds / (24 * 3600);       // 일 계산
    int remainingSeconds = totalSeconds % (24 * 3600);

    int hours = remainingSeconds / 3600;         // 시간 계산
    remainingSeconds %= 3600;

    int minutes = remainingSeconds / 60;         // 분 계산
    int seconds = remainingSeconds % 60;          // 초 계산

    // 결과 출력
    System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다\n", time, days, hours, minutes, seconds);
}