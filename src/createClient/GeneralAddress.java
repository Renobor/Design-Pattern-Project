package createClient;

class GeneralAddress implements Address {

    static String generalAddress[] = {"부산광역시 부산진구 가야동", "부산광역시 부산진구 부전동", "부산광역시 부산진구 감전동", "부산광역시 동구 초량동 ", "경상남도 창원시 용호동", "경상남도 창원시 마산합포구", "경상남도 창원시 진해구", "부산광역시 남구 문현동", "부산광역시 남구 대연동", "부산광역시 남구 용당동"};

    public GeneralAddress() {
        System.out.println("-----------------------");
        System.out.println("일반 고객주소");
        System.out.println("-----------------------");
        for (int i = 0; i < generalAddress.length; i++) {
            System.out.println(generalAddress[i]);
        }
    }

}
