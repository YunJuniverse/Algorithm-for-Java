package variableTypeString;

public class Variable {
    public static void main(String[] args) {
        /** 1. 변수 선언 Declaration */
        char practice;

        /** 2. 변수 값 할당 Assignment */
        practice = 'A';

        /** 3. 변수 선언 및 값 할당 Declaration and Assignment */
        float num1 = 2.1F;
        double num2 = 2.43;
        boolean yes = true;
        int num3 = 2;
        short num4 = 1283;
        long num5 = 812947120125L;
        byte num6 = 123;
        char hangul = '가';

        /** 4. 값의 표현 Expression */
        int num10 = 10;
        int num20 = 20;
        int result = num10 * num20;
        System.out.println(result);
    }

    /** 5. 속도와 시간으로 거리 구하기 */
    public static int getDistance(int time, int speed){
        int distance = 2;
        distance = speed * time;
        System.out.println(distance);
        return(distance);
    }

    /** 6. 곱셈과 나눗셈 함수 생성 delcareFunctions */
    public int multipleBy2(int input) {
        input = input * 2;
        return input;
    }
    public int devideBy2(int input) {
        // TODO : 첫 번째 인자에 2를 곱하는 함수 multiplyBy2와 비슷하게
        // 첫 번째 인자를 2로 나누는 함수 divideBy2를 선언하세요.
        input = input / 2;
        //아래의 코드는 수정하지 말아야 합니다
        return input;
    }

    /** 7.메서드 호출과 반환 Method Invoke, call and return */
    public String invoke() {
        String word;
        word = returnWordWithJoy("I love coding");
        return word;
    }

    public static String returnWordWithJoy(String str) {
        if(str.equals("")) return "empty value";
        else return str + "!";
    }
}
