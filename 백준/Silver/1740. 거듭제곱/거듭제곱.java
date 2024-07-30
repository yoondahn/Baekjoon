import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.toBinaryString;

// 1740 - 거듭제곱
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());     // 입력된 수 (1~500,000,000,000)

        long result = 0L;
        long powerOfTwo = 1L;   // 이진수로 변환

        while (n > 0) {
            if ((n & 1) == 1) result += powerOfTwo; // 현재 비트가 1인지 확인
            n >>= 1;    // 오른쪽 비트로 1비트 이동
            powerOfTwo *= 3;    // 3의 거듭제곱으로 처리
        }
        System.out.println(result);
    }
}
