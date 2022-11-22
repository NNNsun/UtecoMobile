package bridge

class Exception(var input: String) {
    enum class BridgeSizeErrorState(val message: String) {
        INTEGER("다리 길이에 정수가 아닌 수는 포함 할 수 없습니다."),
        RANGE("다리 길이는 3부터 20 사이의 숫자여야 합니다.");
    }
}
