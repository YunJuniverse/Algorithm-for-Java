package iteration;

public class Iteration {
    public static void main(String[] args) {
        System.out.println(makeOddDigits(5));
        System.out.println(isPrime(2));
        System.out.println(listPrimes(50));
    }

    /** 1. 수를 입력받아 0부터 해당 수까지의 합을 리턴 */
    public int sumTo(int num) {
        int result = 0;
        //TODO :
        for(int i = 0; i <= num; i++){
            result = result + i;
        }
        return result;
    }

    /** 2. 수를 입력받아 홀수인지 여부를 리턴
     * 반복문(while)문을 사용해야 합니다.
     * for문 사용은 금지됩니다.
     * 나눗셈(/), 나머지(%) 연산자 사용은 금지됩니다.
     * 0은 짝수로 간주합니다.
     * */
    public boolean isOdd(int num) {
        //조건문을 사용하여 짝수인 경우 return false를,
        //홀수인 경우 return true;를 작성해야 합니다.
        //TODO :

        // 절댓값으로 변환
        int numAbs = Math.abs(num);

        // 절대값이 0 이하면 반복 끝
        while(numAbs >= 0){
            // 0이면 false(짝수)
            if(numAbs == 0){
                return false;
            }
            // -2씩 제거거
            numAbs = numAbs -2;
        }
        // 홀수는 모두 true
        return true;
    }

    /** 3. 수를 입력받아 n-factorial(n!) 값을 리턴
     * 반복문(for)문을 사용해야 합니다.
     * factorial(0)은 1로 정의됩니다.
     * 음수 입력은 들어오지 않습니다.
     * */
    public int factorial(int num) {
        int result = 1;
        //TODO :

        // 예외처리
        if (num == 0){
            return 1;
        }

        // 1부터 num까지 곱하기기
        for(int i = 1; i <= num; i++){
            result = result * i;
        }

        // 결과값값
        return result;
    }

    /** 4. 수를 입력받아 n-factorial(n!) 값을 리턴
     * 반복문(for)문을 사용해야 합니다.
     * 0을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
     * */
    public String repeatString(String str, int num) {
        String result = "";
        // TODO:
        if(num == 0){
            return result;
        }
        for(int i = 1; i <= num; i++){
            result = result+str;
        }
        return result;
    }

    /** 5. 수(num)를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴
     * 반복문(for)문을 사용해야 합니다.
     * 숫자(number string) 사이의 구분은 없습니다. ('1234567')
     * */
    public String makeDigits(int num) {
        String result = "";
        // TODO:
        for(int i = 1; i <= num; i++){
            result = result + String.valueOf(i);
        }
        return result;
    }

    /** 6. 수(num)를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴
     * 반복문(while)문을 사용해야 합니다.
     * for문 사용은 금지됩니다.
     * 숫자(number string) 사이를 '-'로 구분합니다. ('1-2-3-4-5')
     * */
    public String makeDigits2(int num) {
        // TODO:

        // 1. 1부터 추가할 수 있도록 1씩 더할 변수 i 선언, 최종 결과 변수 선언언
        int i = 1;
        String result = "";

        // 2. num값까지 반복
        while(num >= i){
            // 3. result에 i 문자열 추가
            result = result + String.valueOf(i);

            // 4. 만약 i와 num이 같으면 바로 출력
            if(i == num){
                return result;
            }

            // 5. i가 아직 num에 도달하지 못했다면 구분자 '-'추가
            result = result + "-";
            //6. i를 1씩 추가가
            i++;
        }
        return result;
    }

    /** 7. 수(num)를 입력받아 1을 포함하여 num개의 홀수로 구성된 문자열을 리턴
     * 반복문(while)문을 사용해야 합니다.
     * 숫자(number string) 사이의 구분은 없습니다. ('13579')
     * */
    public static String makeOddDigits(int num) {
        // TODO:
        int i = 1;
        String result = "";

        // 반복 조건!!!!
        while(num >= 0){

            result = result + String.valueOf(i);
            i = i + 2;
            num--;
        }

        return result;
    }

    /** 8. 1부터 해당 수까지의 수 중에서 3의 배수로만 구성된 문자열을 리턴
     * 반복문(for)문을 사용해야 합니다.
     * 숫자(number string) 사이의 구분은 없습니다. ('3691215')
     * 3의 배수가 없을 경우, 빈 문자열을 리턴해야 합니다.
     * */
    public String makeMultiplesOfDigit(int num) {
        // TODO:
        String result = "";

        for(int i = 3; i <= num; i += 3){
            result = result + String.valueOf(i);
        }
        return result;
    }

    /** 9. 두 개의 수를 입력받아 두 수를 포함해 두 수 사이의 수 중 2의 배수의 개수를 리턴
     * 반복문(for)문을 사용해야 합니다.
     * num1이 num2보다 작지 않을 수도 있습니다.
     * 0은 2의 배수가 아니라고 가정합니다.
     * */
    public int makeMultiplesOfDigit2(int num1, int num2) {
        //TODO:
        // 1. 필요한 변수 선언
        int bigNum;
        int smallNum;
        int result = 0;

        // 2. 큰 수 찾기
        if(num2 >= num1){
            bigNum = num2;
            smallNum = num1;
        } else {
            bigNum = num1;
            smallNum = num2;
        }

        // 3. 2의 배수 개수 찾기
        for(int i = smallNum; i <= bigNum; i++){

            // 3-2. 작은 수가 0이면 1로 강제 증가
            if(i == 0){
                i = i + 1;
            }

            if(i % 2 == 0){
                result++;
            }
        }
        return result;
    }

    /** 10. 문자열을 입력받아 버그('#')의 인덱스를 리턴
     * 모든 문자열의 인덱스는 0부터 시작합니다.
     * String타입의 문자열에서 한가지 문자(char)타입의 값을 사용하려면 word.charAt(문자열의 인덱스) 명령어를 사용해야 합니다.
     * */
    public int findTheBug(String word) {
        // TODO:
        int result = -1;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == '#'){
                result = i;
            }
        }
        return result;

        // for 안써도 되면 아래 방법
        // int result = word.indexOf("#");
        // return result;
    }

    /** 11. 문자열과 문자를 입력받아 문자열에서 문자(letter)가 등장하는 횟수를 리턴
     * 반복문(for)문을 사용해야 합니다.
     * 빈 문자열을 입력받은 경우, 0을 리턴해야 합니다.
     * */
    public int countCharacter(String str, char letter) {
        // TODO:
        int result = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                result++;
            }
        }
        return result;
    }

    /** 12. 숫자 문자열을 입력받아 문자열을 구성하는 각 숫자 중 가장 큰 수를 나타내는 숫자를 리턴
     * 반복문(for)문을 사용해야 합니다.
     * str.split 사용은 금지됩니다.
     * 빈 문자열을 입력받은 경우, 0을 리턴해야 합니다.
     * */
    public int getMaxNumberFromString(String str) {
        // TODO:
        int result = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) < str.charAt(i + 1)){
                result = Character.getNumericValue(str.charAt(i + 1));
            } else result = Character.getNumericValue(str.charAt(i));
        }
        return result;
    }

/** 13. 문자열과 두 개의 문자(from, to)를 입력받아, 문자열에 등장하는 특정 문자(from)가 다른 문자(to)로 바뀐 문자열을 리턴 */
    public String replaceAll(String str, char from, char to) {
        // TODO:
        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == from){
                result = result + to;
            } else result = result + str.charAt(i);
        }
        return result;
    }

    /** 14. 문자열을 입력받아 각 문자(letter) 뒤에 해당 문자의 인덱스가 추가된 문자열을 리턴 */
    public String characterAndNumber(String word) {
        // TODO:
        String result = "";

        for(int i = 0; i < word.length(); i++){
            result = result + word.charAt(i) + i;
        }
        return result;
    }

    /** 15. 밑(base)과 지수(exponent)를 입력받아 밑의 거듭제곱을 리턴
     * 반복문(for)문을 사용해야 합니다.
     * Math.pow, 거듭제곱 연산자 사용은 금지
     * */
    public int computePower(int base, int exponent) {
        // TODO:
        // 1. 결괏값은 base부터 시작
        int result = base;

        // 2. 예외처리
        if(exponent == 0) return 1;


        // 3. 계산이 시작되는 2부터 exponent 숫자만큼 반복
        for(int i = 2; i <= exponent; i++){
            result = result * base;
        }
        return result;

        // 거듭제곱 방법
        // int result = Math. pow(base, exponent);
        // return result;
    }

    /** 16. 수를 입력받아 약수(factor)의 합을 리턴 */
    public int getSumOfFactors(int num) {
        // TODO:
        int result = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                result = result + i;
            }
        }
        return result;
    }

    /** 17. 1 이상의 자연수를 입력받아 소수(prime number)인지 여부를 리턴 */
    public static boolean isPrime(int num) {
        // TODO:
        if(num < 2){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    /** 18. 2 이상의 자연수를 입력받아 2부터 해당 수까지의 소수(prime number)들을 리턴 */
    public static String listPrimes(int num) {
        // TODO:
        String result = "2-3-5-7";

        if(num == 2) return "2";
        if(num < 5) return "2-3";
        if(num < 7) return "2-3-5";

        // i는 8~num이 가지고 있는 수 반복
        // j는 소수 판별 수 반복
        for(int i = 8; i <= num; i++){
            for(int j = 8; j <= i; j++){
                if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    break;
                } else {
                    result = result + "-" + i;
                    break;
                }
            }
        }
        return result;
    }

    public String listPrimes2(int num) {
        String result = "2";
        for (int candi = 3; candi <= num; candi += 2) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(candi);
            for (int divider = 3; divider <= sqrt; divider += 2) {
                if (candi % divider == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                result = result + "-" + candi;
            }
        }

        return result;
    }

    /** 19. 문자열을 입력받아 해당 문자열에 등장하는 각 문자(letter)를 가지고 만들 수 있는 길이 2의 문자열들을 리턴
     * String 타입을 리턴해야 합니다.
     * 입력받은 문자열의 각 문자를 0, 1, 2, ..., n이라고 할 경우, 00,01,02,...,nn 형식으로 리턴해야 합니다.
     * 이중 반복문(double for loop)을 사용해야 합니다.
     * 빈 문자열을 입력받은 경우에는 빈 문자열을 리턴해야 합니다.
     * */
    public String makePermutations(String str) {
        // TODO:
        String result = "";
        if(str == "") return result;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                result = result + str.charAt(i) +  str.charAt(j) + ",";
            }
        }
        result = result.substring(0, result.length()-1);
        return result;
    }

    /** 20. 문자열을 입력받아 해당 문자열에 중복된 문자(letter)가 존재하는지 여부를 리턴 */
    public boolean hasRepeatedCharacter(String str) {
        // TODO:
        boolean isOverlap = true;

        for(int i = str.length()-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(str.charAt(i) == str.charAt(j)){
                    return true;
                }
            }
        }

        return false;
    }

    /** 21. 문자열을 입력받아 해당 문자열을 처음부터 한 글자(letter)씩 다시 작성하
     * 한 글자를 추가할 때마다 부분적으로 완성된 문자열을 전부 이어붙인 문자열을 리턴
     * 이중 반복문(double for loop)을 사용해야 합니다.
     * str.split, str.substring 사용은 금지됩니다.
     * 빈 문자열을 입력받은 경우에는 빈 문자열을 리턴해야 합니다
     * */
    public String makeMarginalString(String str) {
        // TODO:
        String result = "";

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j <= i; j++){
                result = result + str.charAt(j);
            }
        }

        return result;
    }

}
