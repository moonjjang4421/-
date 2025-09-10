# 안드로이드 개발 학습 가이드

## 📚 기본 개념

### 1. 액티비티 (Activity)
- 안드로이드 앱의 화면을 구성하는 기본 단위
- 사용자와 상호작용하는 단일 화면
- 생명주기: onCreate() → onStart() → onResume() → onPause() → onStop() → onDestroy()

### 2. 레이아웃 (Layout)
- XML 파일로 UI 구성 요소들을 정의
- ConstraintLayout: 제약 조건을 통한 유연한 레이아웃
- LinearLayout: 선형으로 뷰를 배치
- RelativeLayout: 상대적 위치로 뷰를 배치

### 3. 뷰 (View)
- 화면의 UI 구성 요소
- TextView: 텍스트 표시
- Button: 클릭 가능한 버튼
- EditText: 사용자 입력 필드

## 🔧 주요 개념

### findViewById()
```kotlin
val textView: TextView = findViewById(R.id.textView)
```
- XML 레이아웃의 뷰를 코드에서 참조
- R.id는 리소스 ID를 나타냄

### 이벤트 리스너
```kotlin
button.setOnClickListener {
    // 클릭 시 실행될 코드
}
```

### Toast 메시지
```kotlin
Toast.makeText(context, "메시지", Toast.LENGTH_SHORT).show()
```

### 로그 출력
```kotlin
Log.d("TAG", "디버그 메시지")
Log.i("TAG", "정보 메시지")
Log.e("TAG", "에러 메시지")
```

## 📁 프로젝트 구조

```
app/
├── src/main/
│   ├── java/                    # Kotlin/Java 소스 파일
│   ├── res/                     # 리소스 파일들
│   │   ├── layout/             # 레이아웃 XML 파일
│   │   ├── values/             # 값 리소스 (문자열, 색상 등)
│   │   ├── mipmap/             # 앱 아이콘
│   │   └── xml/                # 기타 XML 설정
│   └── AndroidManifest.xml     # 앱 구성 정보
├── build.gradle                # 모듈 레벨 빌드 설정
└── proguard-rules.pro          # 코드 난독화 규칙
```

## 🎯 학습 단계

### 초급
1. ✅ 액티비티와 레이아웃 이해
2. ✅ 기본 뷰 컴포넌트 사용
3. ✅ 이벤트 처리
4. ✅ 리소스 관리

### 중급
5. Fragment 사용법
6. RecyclerView로 리스트 만들기
7. Intent로 화면 전환
8. SharedPreferences로 데이터 저장

### 고급
9. Room 데이터베이스
10. Retrofit을 이용한 네트워킹
11. MVVM 패턴
12. Jetpack Compose

## 💡 학습 팁

1. **단계별 학습**: 기본기를 탄탄히 한 후 다음 단계로
2. **실습 위주**: 이론보다는 직접 코딩해보기
3. **공식 문서 활용**: Android Developer 사이트 참고
4. **로그 활용**: Log.d()로 앱의 동작 확인
5. **에러 메시지 읽기**: 컴파일 에러나 런타임 에러 해결 연습

## 🔗 유용한 링크

- [Android Developer 공식 문서](https://developer.android.com/)
- [Kotlin 학습](https://kotlinlang.org/docs/getting-started.html)
- [Material Design](https://material.io/design)
- [Android Code Sample](https://github.com/android/architecture-samples)

---

**즐거운 안드로이드 개발 학습 되세요! 🚀**