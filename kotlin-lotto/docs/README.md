## 문제 요약

- 중복되지않는 숫자 6개와 보너스 번호 1개 존재
- 구입금액(1회:1,000원)을 입력하면 해당하는 금액만큼 로또 자동 발행
- 로또 번호와 당첨번호 비교 후 당첨내역 및 수익률 출력

## 주요 고려 사항

- 로또 자동
    - 범위: 1~45, 중복되지않는 6개 랜덤 숫자 생성
    - 오름차순 정렬
    - 수량 출력
    - 당첨 등수 및 수익

        ```
        - 1등: 6개 번호 일치 / 2,000,000,000원
        - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
        - 3등: 5개 번호 일치 / 1,500,000원
        - 4등: 4개 번호 일치 / 50,000원
        - 5등: 3개 번호 일치 / 5,000원
        ```

- 당첨 번호 생성(입력)
    - 범위: 1~45, 중복되지않는 6개 숫자 입력
    - 보너스볼:  1~45 중 1개 숫자 입력
- 당첨 통계
    - 5등부터 일치한 갯수를 알려준다
    - 수익률(수익/구입금액)
        - 소수점 둘째 자리에서 반올림

## 예외처리 상황

- 당첨 번호 잘 못 입력했을 시
    - 범위 체크
    - 콤마(,)체크
    - 숫자인지 체크
    - 갯수 체크
- 구입금액을 잘못 입력했을 시
    - 최소 구입 금액 체크
    - 숫자 체크
    - 공백 체크

## 기능별 함수 설계