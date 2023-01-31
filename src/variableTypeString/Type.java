package variableTypeString;

public class Type {
    public static void main(String[] args) {
        System.out.println("S");
    }
    /** 8. 타입 type */
    public String type() {
        int num = 3;
        char thing = 'A';
        return goCheck(num, thing);
    }
    public String goCheck(int num, char thing) {
        return String.format("hey, is this %c or %d?", thing, num);
    }

    /** 9. 타입에 따른 작동방식 */
    public int plusRightType(){
        int score = 99 + 1;
        return score;
    }

    /** 10. 타입 변환 */
    public int convertToNumber(char character) {
        int result;
        result = Character.getNumericValue(character);
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }
    public char convertToChar(int num) {
        char result;
        result = (char)(num+'0');
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }

    /** 11. 문자열 합치기 */
    public String getFullName(String firstName, String lastName) {
        String fullname = firstName + ' ' + lastName;
        return fullname;
    }

    /** 12. 단어의 길이 반환 */
    public int getLengthOfWord(String word) {
        int getLength = word.length();
        return getLength;
    }

    /** 13. 단어의 평균 길이 반환 computeAverageLengthOfWords */
    public int computeAverageLengthOfWords(String word1, String word2) {
        // TODO:
        int lengthAvg = (word1.length() + word2.length())/2;
        return lengthAvg;
    }

    /** 14. 단어의 평균 길이 반환(내림) computeAverageLengthOfWordsWithFloor */
    public int computeAverageLengthOfWords2(String word1, String word2) {
        // TODO;

        return (int)Math.floor((word1.length() + word2.length())/2);
    }

    /** 14. 대소문자 구분없이 문자열 비교 compareOnlyAlphabet */
    public boolean compareOnlyAlphabet(String str1, String str2) {
        // TODO:

        boolean equalTest = str1.equalsIgnoreCase(str2);
        return equalTest;
    }

    /** 15. format 메서드로 시간표현 */
    public String showTime(int hour, int min, int sec) {
        // TODO:
        String result = String.format("현재 시각은 %d시 %d분 %d초 입니다.", hour, min, sec);
        return result;
    }

    /** 16.두 수를 입력 받아 두 수간의 차이를 나타내기 computeDifference */
    public String computeDifference(int num1, int num2) {
        // TODO:
        return String.format("%d, %d의 차이는 %d입니다.", num1, num2, Math.abs(num1-num2));
    }
}

