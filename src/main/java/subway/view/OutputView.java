package subway.view;

public class OutputView {
    public static void printMainMenu() {
        System.out.println("## 메인 화면");
        System.out.println("1. 경로 조회");
        System.out.println("Q. 종료");
        printEmptyLine();
    }

    public static void printEmptyLine() {
        System.out.println();
    }
}
