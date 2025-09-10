package com.example.androidstudytest

/**
 * 안드로이드 개발 학습을 위한 유틸리티 클래스
 * 
 * 학습 포인트:
 * 1. 코틀린 object 키워드를 사용한 싱글톤 패턴
 * 2. 확장 함수(Extension Function) 사용법
 * 3. 상수 정의 및 관리
 */
object LearningUtils {
    
    // 상수 정의 - 로그 태그
    const val LOG_TAG = "AndroidStudyTest"
    
    // 클릭 임계값
    const val CLICK_THRESHOLD = 10
    
    /**
     * 클릭 횟수에 따른 메시지를 반환하는 함수
     * @param clickCount 클릭 횟수
     * @return 상황에 맞는 메시지
     */
    fun getClickMessage(clickCount: Int): String {
        return when {
            clickCount == 0 -> "아직 클릭하지 않았네요!"
            clickCount < 5 -> "좋아요! 계속 클릭해보세요 (${clickCount}번)"
            clickCount < CLICK_THRESHOLD -> "열심히 클릭하고 있네요! (${clickCount}번)"
            clickCount < 20 -> "와! 정말 많이 클릭했어요! (${clickCount}번)"
            else -> "클릭의 달인이시네요! 🎉 (${clickCount}번)"
        }
    }
    
    /**
     * 숫자를 한국어 형식으로 포맷팅하는 확장 함수
     */
    fun Int.toKoreanFormat(): String {
        return when {
            this >= 10000 -> "${this / 10000}만"
            this >= 1000 -> "${this / 1000}천"
            else -> this.toString()
        }
    }
    
    /**
     * 클릭 속도를 계산하는 함수 (시간당 클릭 수)
     * @param clickCount 총 클릭 횟수
     * @param timeInSeconds 경과 시간 (초)
     * @return 분당 클릭 수
     */
    fun calculateClickRate(clickCount: Int, timeInSeconds: Long): Double {
        return if (timeInSeconds > 0) {
            (clickCount.toDouble() / timeInSeconds) * 60
        } else {
            0.0
        }
    }
}