package subway.view;

public class OutputView {
    public static void printMain() {
        System.out.println("## 메인 화면");
        System.out.println("1. 경로 조회");
        System.out.println("Q. 종료");
        printEmptyLine();
    }
    
    private static void printEmptyLine() {
        System.out.println();
    }
}
