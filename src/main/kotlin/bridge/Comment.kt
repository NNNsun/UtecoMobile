package bridge

class Comment {
    enum class GameComment(val message: String) {
        START("다리 건너기 게임을 시작합니다.\n"),
        WIN("게임 성공 여부: "),
        RESULT("최종 게임 결과"),
        COUNT("총 시도한 횟수: ");
    }

}




