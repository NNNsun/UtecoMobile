package bridge

class Exception(var input: String) {
    enum class BridgeSizeErrorState(val message: String) {
        INTEGER("다리 길이에 정수가 아닌 수는 포함 할 수 없습니다."),
        RANGE("다리 길이는 3부터 20 사이의 숫자여야 합니다.");
    }

    enum class PlayErrorState(val message: String) {
        ZERO("문자를 하나 이상 입력해 주세요."),
        SIZE("두 개 이상의 글자는 입력 할 수 없습니다."),
        STRING("문자만 입력 해 주세요."),
        CHOICE("U(위), D(아래)로만 다음 칸을 선택 할 수 있습니다."),
        OVER("재시도: R, 종료: Q 중에서 선택 해 주세요."),
        UPPERCASE("대문자로 입력 해 주세요.");
    }
}
