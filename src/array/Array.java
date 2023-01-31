package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

    }

    /** 1. 배열을 입력받아 배열의 첫번째 요소를 리턴
     * 빈 배열을 입력받은 경우, -1를 리턴해야 합니다.
     * */
    public int getFirstElement(int[] arr) {
        // TODO:
        int result;
        if(arr.length == 0) return -1; else return result = arr[0];
    }

    /** 2. 배열를 입력받아 배열의 마지막 요소를 리턴
     * 빈 배열을 입력받은 경우, -1를 리턴해야 합니다.
     * */
    public int getLastElement(int[] arr) {
        // TODO:
        int result;
        if(arr.length == 0) return -1; else return arr[arr.length - 1];
    }

    /** 3. 배열과 수를 입력받아 수가 인덱스로 가리키는 배열의 요소를 리턴
     * 빈 배열을 입력받은 경우, -1를 리턴해야 합니다.
     * 배열의 길이를 벗어나는 수를 입력받은 경우, '-2'를 리턴해야 합니다.
     * */
    public int getNthElement(int[] arr, int index) {
        // TODO:
        int result;
        if(arr.length == 0) return -1;
        if(0 > index || arr.length - 1 < index) return -2; else return result = arr[index];
    }

    /** 4. 배열을 입력받아 배열의 모든 요소의 합을 리턴
     * 입력받은 배열이 빈 배열인 경우, 0을 리턴
     * */
    public int computeSumOfAllElements(int[] arr) {
        // TODO:
        int result = 0;

        if(arr.length == 0) return 0;

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }

    /** 5. 문자열을 입력받아 문자열을 구성하는 각 단어를 요소로 갖는 배열을 리턴
     * 반복문(for, while) 사용은 금지됩니다.
     * 단어는 공백 한 칸으로 구분합니다.
     * 연속된 공백은 없다고 가정합니다.
     * */
    public String[] getAllWords(String str) {
        // TODO:
        String[] empty = new String[0];
        if(str.length() == 0) return empty;
        String[] result = str.split(" ");
        return result;
    }

    /** 6. 문자열을 입력받아 문자열을 구성하는 각 문자를 요소로 갖는 배열을 리턴
     * str.split 사용은 금지됩니다.
     * 빈 문자열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * */
    public char[] getAllLetters(String str) {
        // TODO:
        char[] result = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            result[i] = str.charAt(i);
        }
        return result;
    }


    /** 7. 배열을 입력받아 가장 큰 요소를 리턴
     * */
    public int getLargestElement(int[] arr) {
        // TODO:
        int result = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]) result = arr[i + 1]; else result = arr[i];
        }
        return result;
    }

    /** 8. 문자열을 입력받아 문자열에서 가장 긴 단어를 리턴
     * 단어는 공백 한 칸으로 구분합니다.
     * 가장 긴 단어가 2개 이상이면 첫번째로 등장하는 단어를 리턴해야 합니다.
     * */
    public String getLongestWord(String str) {
        // TODO:
        String[] strArr = str.split(" ");

        String result = "";

        for(int i = strArr.length - 1; i >= 0; i--){
            if(strArr[i].length() >= result.length()) result = strArr[i];
        }
        return result;
    }

    /** 9. int 타입를 요소로 갖는 배열을 입력받아 짝수만을 요소로 갖는 배열을 리턴
     * 짝수가 없는 경우, 빈 배열을 리턴해야 합니다.
     * */
    public int[] getEvenNumbers(int[] arr) {
        // TODO:
        int number = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) number++;
        }

        int[] result = new int[number];

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                result[count] = arr[i];
                count++;
            }
        }
        return result;
    }

    /** 10. 배열과 요소를 입력받아 주어진 요소를 배열의 맨 앞에 추가하고 해당 배열을 리턴
     * 주어진 요소가 추가된 형태의 배열을 리턴해야 합니다.
     * [arr[0], arr[1], ..., arr[n-1], el]
     * arr.length는 n
     * */
    public int[] addToFront(int[] arr, int el) {
        // TODO:
        int[] result = new int[arr.length + 1];
        result[0] = el;
        System.arraycopy(arr, 0, result, 1, arr.length);
        return result;
    }

    /** 11. 배열과 요소를 입력받아 주어진 요소를 배열의 맨 뒤에 추가하고 해당 배열을 리턴
     * 기존 배열에 주어진 요소가 추가된 형태의 배열을 리턴해야 합니다.
     * [arr[0], arr[1], ..., arr[n-1], el]
     * arr.length는 n
     * */
    public int[] addToBack(int[] arr, int el) {
        // TODO:
        int[] result = new int[arr.length + 1];
        result[result.length - 1] = el;
        System.arraycopy(arr, 0, result, 0, arr.length);
        return result;
    }

    /** 12. 두 개의 배열을 입력받아 순서대로 합쳐진 배열을 리턴
     * 두 배열이 합쳐진 새로운 배열을 리턴해야 합니다.
     * [arr1[0], ..., arr1[n - 1], arr2[0], ..., arr2[m - 1]]
     * arr1.length는 n
     * arr2.length는 m
     * */
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO:
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    /** 13. 배열과 인덱스를 입력받아 주어진 인덱스 이후의 요소들을 갖는 새로운 배열을 리턴
     * 반복문(for, while) 사용은 금지됩니다.
     * 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * 배열의 길이 이상의 인덱스를 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * */
    public int[] getElementsAfter(int[] arr, int n) {
        // TODO:
        if(n >= arr.length) return new int[]{};
        int[] result = new int[arr.length - n];
        System.arraycopy(arr, n, result, 0, arr.length - n);
        return result;
    }

    /** 14. 배열과 인덱스를 입력받아 주어진 인덱스 이전의 요소들을 갖는 새로운 배열을 리턴
     * 반복문(for, while) 사용은 금지됩니다.
     * 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * 배열의 길이 이상의 인덱스를 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * */
    public int[] getElementsUpTo(int[] arr, int n) {
        // TODO:
        if(n >= arr.length) return new int[]{};
        int[] result = Arrays.copyOfRange(arr, 0, n);
        return result;
    }

    /** 15. 배열을 입력받아 배열의 첫번째 요소를 제외한 배열을 리턴
     * 반복문(for, while) 사용은 금지됩니다.
     * 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * */
    public int[] getAllElementsButFirst(int[] arr) {
        // TODO:
        if(arr.length < 2) return new int[]{};
        int[] result = Arrays.copyOfRange(arr, 1, arr.length); // to는 exclusive
        return result;
    }

    /** 16. 배열을 입력받아 마지막 요소를 제외한 배열을 리턴
     * 반복문(for, while) 사용은 금지됩니다.
     * 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * */
    public int[] getAllElementsButLast(int[] arr) {
        // TODO:
        if(arr.length == 0) return new int[]{};
        int[] result = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return result;
    }

    /** 17. 배열과 인덱스를 입력받아 해당 인덱스의 요소를 제외한 배열을 리턴
     * 배열의 길이보다 큰 인덱스를 입력받은 경우, 배열 그대로를 리턴해야 합니다.
     * 빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.
     * */
    public int[] getAllElementsButNth(int[] arr, int n) {
        // TODO:
        if(arr.length == 0) return new int[]{};
        if(arr.length <= n) return arr;
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, n);
        System.arraycopy(arr, n + 1, result, n, arr.length - (n + 1));
        return result;
    }


    /** 18. 0-9 사이의 정수를 요소로 갖는 배열을 입력받아 전화번호 형식의 문자열을 리턴
     * 반복문(for, while) 사용은 금지됩니다.
     * 배열의 길이가 8인 경우, 앞에 [0, 1, 0]이 있다고 가정합니다.
     * */
    public String createPhoneNumber(int[] arr) {
        // TODO:
        String result = Arrays.toString(arr);
        result = result.replaceAll(",", "")
                .replaceAll(" ", "")
                .replace("[", "")
                .replace("]", "");

        if(result.length() == 8){
            return result = "(010)" + result.substring(0, 4) + "-" + result.substring(4, 8);
        } else {
            return result = "(" + result.substring(0, 3) + ")" + result.substring(3, 7) + "-" + result.substring(7, 11);
        }
    }


    /** 19. 수(num)를 입력받아 num번째까지 총 num + 1개의 피보나치 수열을 리턴
     * 반복문(for)문을 사용해야 합니다.
     * 피보나치 수열은 0번부터 시작합니다.
     * */
    public int[] fibonacci(int num) {
        // TODO:
        if(num == 0) return new int[]{0};

        int[] result = new int[num + 1];
        result[0] = 0;
        result[1] = 1;

        for(int i = 2; i <= num; i++){
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
}

