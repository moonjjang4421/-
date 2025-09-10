# 안드로이드 스튜디오 학습 프로젝트

안드로이드 개발을 학습하기 위한 기본 테스트 프로젝트입니다.

## 📱 프로젝트 개요

이 프로젝트는 안드로이드 스튜디오와 안드로이드 개발의 기본 개념을 학습하기 위해 제작된 교육용 프로젝트입니다.

### 🎯 학습 목표

- **안드로이드 프로젝트 구조** 이해
- **액티비티(Activity)** 와 **레이아웃(Layout)** 기본 개념 학습
- **코틀린(Kotlin)** 을 사용한 안드로이드 개발 경험
- **사용자 인터페이스(UI)** 와 **이벤트 처리** 실습

## 🚀 시작하기

### 필요 환경
- Android Studio (최신 버전 권장)
- Android SDK API 24 이상
- Kotlin 지원

### 프로젝트 열기
1. Android Studio를 실행합니다
2. "Open an Existing Project" 선택
3. 이 프로젝트 폴더를 선택합니다
4. Gradle 동기화를 기다립니다

### 실행하기
1. Android 에뮬레이터를 실행하거나 실제 기기를 연결합니다
2. Run 버튼(▶️)을 클릭하거나 `Shift + F10`을 누릅니다

## 📚 프로젝트 구조 및 학습 포인트

### 주요 파일들

```
app/
├── build.gradle                 # 앱 모듈 설정
├── src/main/
│   ├── AndroidManifest.xml     # 앱 매니페스트 파일
│   ├── java/com/example/androidstudytest/
│   │   └── MainActivity.kt     # 메인 액티비티
│   └── res/
│       ├── layout/
│       │   └── activity_main.xml   # 메인 레이아웃
│       ├── values/
│       │   ├── strings.xml     # 문자열 리소스
│       │   ├── colors.xml      # 색상 리소스
│       │   └── themes.xml      # 테마 설정
│       └── xml/                # XML 설정 파일들
build.gradle                    # 프로젝트 레벨 설정
settings.gradle                 # 프로젝트 설정
```

### 🔍 학습 내용

#### 1. MainActivity.kt
- **액티비티 생명주기**: `onCreate()` 메서드의 역할
- **뷰 바인딩**: `findViewById()`를 사용한 뷰 참조
- **이벤트 처리**: 버튼 클릭 리스너 구현
- **코틀린 문법**: 람다 표현식, 데이터 클래스 등

#### 2. activity_main.xml
- **ConstraintLayout**: 제약 기반 레이아웃 시스템
- **뷰 컴포넌트**: TextView, Button 등 기본 UI 요소
- **리소스 참조**: `@string/`, `@color/` 등 리소스 사용법

#### 3. 리소스 관리
- **문자열 리소스**: 다국어 지원을 위한 문자열 분리
- **색상 및 테마**: 일관된 디자인을 위한 색상 관리
- **레이아웃**: 다양한 화면 크기 대응

## 🛠️ 주요 기능

- **버튼 클릭 카운터**: 사용자 상호작용 학습
- **Toast 메시지**: 사용자 피드백 표시
- **동적 텍스트 업데이트**: 뷰 상태 변경 학습

## 📖 추가 학습 자료

### 안드로이드 개발 기본 개념
- [Android Developer 공식 문서](https://developer.android.com/)
- [Kotlin 공식 문서](https://kotlinlang.org/docs/)
- [Android Studio 사용법](https://developer.android.com/studio)

### 다음 단계 학습 주제
- **Fragment** 사용법
- **RecyclerView** 를 통한 리스트 표시
- **데이터베이스** 연동 (Room)
- **네트워킹** (Retrofit)
- **MVVM 패턴** 적용

## 📝 참고사항

- 이 프로젝트는 학습 목적으로 제작되었습니다
- 코드에는 한글 주석이 포함되어 있어 이해를 돕습니다
- 질문이나 개선사항이 있다면 이슈를 등록해주세요

---

**Happy Coding! 🎉**

*20250910 - Android Development Study Project*
