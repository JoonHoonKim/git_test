# 소개. 백엔드 스터디
***
- 백엔드 스터디 중 git관련 테스트를 위한 레퍼지토리

# 마크다운 링크 테스트
***
- [링크 테스트](https://google.com)

# 환경 소개
***
- JAVA 17
- Spring Boot 2.7.3
- Gradle 기반 빌드
- H2 인메모리
- JUnit, MockMvc, FixtureMonkey 기반 테스트 케이스 작성
- REST docs 기반 API 명세 작성

# module - application
***
- 도메인 엔티티, 입력 포트, 출력 포트, 그리고 서비스 로직이 포함되어 있습니다.
  - `domain`
  - `service`
  - `port/input`
  - `port/output`

# module - adapter
***
- 출력 포트에 대한 구현체가 포함되어 있습니다.
  - `adapter-persistence`(jpa)
  - `adapter-http`(http-client)

# module - app
***
- 앱을 동작하기 위한 부분이 포함되어 있습니다.
  - `app/app-api`

# API 명세
***
`/apps/app-api/src/docs/index.adoc`을 참고합니다.

# 1. 블로그 검색
***
- 키워드로 블로그를 검색할 수 있습니다.
- 정확도순, 최신순으로 정렬할 수 있습니다.
- 페이지네이션 기능을 제공합니다.
- 검색 소스는 <u>[카카오 블로그 검색 OPEN API](https://google.com)</u>를 활용합니다.
- 카카오 API 가 제대로 작동하지 않으면 <u>[네이버 블로그 검색 OPEN API](https://google.com)</u>로 대체합니다.
- RestTemplate을 활용하여 HTTP 통신을 합니다.

### 사용
> `$ http GET http://localhost:8080...`

### 요청

Parameter

| Name | Type | Description | Required |
| ------- | ------- | --- | ---- |
| `keyword` | `String` | 검색 키워드 | O |
| `url` | `String` | 블로그 url | X |
