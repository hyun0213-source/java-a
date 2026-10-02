void main() {
    int a =5;
    int b =2;
    double c = a / 2;         //2.5 (2,0) //overflow
    double d = (float) a / b; //(float)

    System.out.printf("a = %d, b =%d, c = %.2f, d =%.2f\n", a,b,c,d);
}
