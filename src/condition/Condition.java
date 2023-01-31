package condition;

public class Condition {
    public static void main(String[] args) {
        System.out.println("S");
    }

    /** 1. 나이를 입력받아 술을 마실 수 있는지(18세 이상) 여부를 리턴 */
    public boolean isOldEnoughToDrink(int age) {
        // TODO:
        if(age>=18){
            return true;
        } else {
            return false;
        }
    }

    /** 2. 온도를 입력받아 해당 온도가 30이 넘는지 확인 후 알맞은 값을 리턴 */
    public String isGreaterThan30(int temp) {
        // TODO:
        if (temp>=30){
            return "에어컨을 켜야겠다!";
        } else {
            return "여름이 매우 덥네요";
        }
    }

    /** 3. 수를 입력 받아 10과 같은지 여부를 리턴 */
    public boolean equalsTen(int num) {
        // TODO:
        if (num == 10){
            return true;
        } else {
            return false;
        }
    }

    /** 4. 두 개의 수를 입력받아 두번째 수가 첫번째 수보다 큰지 여부를 리턴 */
    public boolean isGreaterThan(int num1, int num2) {
        // TODO:
        if (num1<num2) {
            return true;
        } else {
            return false;
        }
    }

    /** 5. 수를 입력받아 짝수인지 여부를 리턴 */
    public boolean isEven(int num) {
        // TODO:
        if (num%2==0) {
            return true;
        } else {
            return false;
        }
    }

    /** 6. 수를 입력받아 입력된 수가 10보다 크고 짝수인지 여부 리턴 */
    public boolean isEvenAndGreaterThanTen(int num) {
        // TODO:
        if (num>10&&num%2==0) {
            return true;
        } else {
            return false;
        }
    }

    /** 7. 수를 입력 받아 3 그리고 5로 각각 나눈 뒤 나머지 값에 따라 알맞은 메시지를 리턴
     * 3으로 나누어 떨어지는 경우, "Fizz"를 리턴
     * 5으로 나누어 떨어지는 경우, "Buzz"를 리턴
     * 3과 5로 모두 나누어 떨어지는 경우, "FizzBuzz"를 리턴
     * 3이나 5로 나누어 떨어지지 않는 경우, "No FizzBuzz" 리턴
     * */
    public String fizzBuzz(int num) {
        // TODO:
        if (num%3==0 && num%5!=0) {
            return "Fizz";
        } else if (num%5==0 && num%3!=0) {
            return "Buzz";
        } else if (num%3 ==0 && num%5==0) {
            return "FizzBuzz";
        } else {
            return "No FizzBuzz";
        }
    }

    /** 8. 두 개의 수와 기호를 입력 받아 알맞게 계산한 값을 리턴 */
    public int miniCalculator(int num1, int num2, char operator) {
        // TODO:
        if (operator=='+') {
            return num1+num2;
        } else if (operator=='-') {
            return num1-num2;
        } else if (operator=='*') {
            return num1*num2;
        } else if (operator=='/') {
            return num1/num2;
        } else if (operator=='%') {
            return num1%num2;
        } else {
            return 0;
        }
    }

    /** 9. 특정 달(month)을 입력 받아 각 달에 몇 일이 있는지 리턴 */
    public int daysInMonth(int month) {
        // TODO:
        if(month<8&&month%2==1 || month>=8&&month%2==0) {
            return 31;
        } else if (month==2){
            return 28;
        } else {
            return 30;
        }
    }

    /** 10. 요일을 입력받아 해당 요일의 다음 요일을 리턴
     * String.equals 문자열 같은지 비교. 논리형 리턴
     * */
    public String followingDay(String day) {
        // TODO:
        if (day.equals("월요일")){
            return "화요일";
        } else if (day.equals("화요일")) {
            return "수요일";
        } else if (day.equals("수요일")) {
            return "목요일";
        } else if (day.equals("목요일")) {
            return "금요일";
        } else if (day.equals("금요일")) {
            return "토요일";
        } else if (day.equals("토요일")) {
            return "일요일";
        } else if (day.equals("일요일")) {
            return "월요일";
        } else {
            return "올바른 요일이 아닙니다";
        }
    }

    /** 11. 두 개 수를 입력받아 아래의 2가지 조건을 모두 만족하는지 검사
     * EitherEven: 적어도 하나의 수는 짝수이다.
     * LessThan9: 두 수 모두 9보다 작다.
     * */
    public boolean isEitherEvenAndLessThan9(int num1, int num2) {
        // TODO:
        if(num1%2==0&&num1<9&&num2<9||num2%2==0&&num1<9&&num2<9) {
            return true;
        } else {
            return false;
        }
    }

    /** 12. 점수를 입력받아 점수에 해당하는 등급을 리턴 */
    public char convertScoreToGrade(int score) {
        // TODO:
        if (score > 100 || score < 0) {
            return 'X';
        }
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 0) {
            return 'F';
        } else {
            return 'X';
        }
    }

    /** 13. 점수를 입력받아 점수에 해당하는 등급을 리턴
     * 90 이상 --> "A"
     * 80 이상 --> "B"
     * 70 이상 --> "C"
     * 60 이상 --> "D"
     * 60 미만 --> "F"
     * 만약 주어진 점수가 100을 초과하거나 0 미만인 경우, 문자열 "INVALID SCORE"를 리턴해야 합니다.
     * 각 등급의 최고 점수보다 7점 이하인 경우, 등급과 함께 "-"를 리턴해야 합니다. (단, 93점의 경우에는 A를 리턴해야 합니다.)
     * 각 등급의 최저 점수보다 8점 이상인 경우, 등급과 함께 "+"를 리턴해야 합니다.
     * F+ 와 F- 는 존재하지 않습니다.
     * */
    public String convertScoreToGradeWithPlusAndMinus(int score) {
        // TODO:

        String grade;

        // 예외처리
        if (score > 100 || score < 0) {
            return "INVALID SCORE";
        }

        if (score == 100) {
            return "A+";
        }

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if (!grade.equals("F")) {
            int extra = score % 10;
            if (extra <= 2) {
                grade = grade + "-";
            } else if (extra >= 8) {
                grade = grade + "+";
            }
        }

        return grade;
    }

    /** 14. 삼각형의 세 변을 입력받아 직각삼각형(pythagorean)인지 여부를 리턴 */
    public boolean isPythagorean(int side1, int side2, int side3) {
        // TODO:
        if (side1*side1+side2*side2==side3*side3){
            return true;
        } else if (side3*side2+side2*side2==side1*side1) {
            return true;
        } else if (side1*side1+side3*side3==side2*side2) {
            return true;
        } else {
            return false;
        }
    }

    /** 15. 두 개의 boolean 값을 입력받아 or 연산을 적용한 것과 같은 결과를 리턴 */
    public boolean or(boolean expression1, boolean expression2) {
        // TODO:
        if (expression1==true&&expression2==true) {
            return true;
        } else if (expression1==true&&!expression2==true){
            return true;
        } else if (!expression1==true&&expression2==true){
            return true;
        } else if (!expression1==true&&!expression2==true){
            return false;
        } else {
            return false;
        }
    }

    /** 16. 시, 분, 초를 입력받아 1초를 더한 결과값을 특정 형태의 메시지로 리턴해 */
    public String addOneSecond(int hour, int minute, int second) {
        // TODO:
        if (second==59) {
            minute = minute + 1;
            second = 0;
        } else {
            second = second+1;
        }
        if (minute==60) {
            hour += 1;
            minute = 0;
        }

        if (hour == 24) {
            hour = 0;
        }

        return String.format("1초 뒤에 %d시 %d분 %d초 입니다",hour,minute,second);
    }

}
