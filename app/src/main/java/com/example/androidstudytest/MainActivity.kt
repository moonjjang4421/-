package com.example.androidstudytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * MainActivity - 앱의 메인 화면을 담당하는 액티비티
 * 
 * 학습 포인트:
 * 1. AppCompatActivity를 상속받아 안드로이드 액티비티 구현
 * 2. onCreate() 메서드에서 초기화 작업 수행
 * 3. findViewById()를 사용한 뷰 참조
 * 4. 클릭 리스너를 통한 사용자 이벤트 처리
 * 5. 유틸리티 클래스 사용법
 * 6. 로그 출력으로 디버깅하기
 */
class MainActivity : AppCompatActivity() {

    // 뷰 참조를 위한 변수들
    private lateinit var titleTextView: TextView
    private lateinit var clickButton: Button
    private lateinit var counterTextView: TextView
    private lateinit var messageTextView: TextView
    
    // 클릭 카운터 변수
    private var clickCount = 0
    
    // 시작 시간 저장 (클릭 속도 계산용)
    private var startTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 로그 출력 - 생명주기 학습
        Log.d(LearningUtils.LOG_TAG, "MainActivity onCreate 호출됨")
        
        // 레이아웃 파일을 액티비티에 연결
        setContentView(R.layout.activity_main)
        
        // 시작 시간 기록
        startTime = System.currentTimeMillis()
        
        // 뷰 초기화
        initViews()
        
        // 이벤트 리스너 설정
        setupClickListener()
    }
    
    /**
     * 뷰들을 초기화하는 메서드
     * findViewById()를 사용하여 XML 레이아웃의 뷰들을 참조
     */
    private fun initViews() {
        titleTextView = findViewById(R.id.titleTextView)
        clickButton = findViewById(R.id.clickButton)
        counterTextView = findViewById(R.id.counterTextView)
        messageTextView = findViewById(R.id.messageTextView)
        
        // 초기 텍스트 설정
        updateCounter()
        updateMessage()
    }
    
    /**
     * 버튼 클릭 이벤트 리스너 설정
     * 람다 표현식을 사용한 간단한 클릭 리스너 구현
     */
    private fun setupClickListener() {
        clickButton.setOnClickListener {
            // 클릭 카운트 증가
            clickCount++
            
            // 로그 출력
            Log.d(LearningUtils.LOG_TAG, "버튼 클릭됨 - 총 ${clickCount}번")
            
            // 카운터 텍스트 업데이트
            updateCounter()
            updateMessage()
            
            // 유틸리티 함수를 사용한 동적 메시지
            val clickMessage = LearningUtils.getClickMessage(clickCount)
            
            // Toast 메시지 표시 (사용자 피드백)
            Toast.makeText(this, clickMessage, Toast.LENGTH_SHORT).show()
            
            // 특정 클릭 수에서 특별한 동작
            if (clickCount == LearningUtils.CLICK_THRESHOLD) {
                showSpecialMessage()
            }
        }
    }
    
    /**
     * 카운터 텍스트를 업데이트하는 메서드
     */
    private fun updateCounter() {
        // 확장 함수 사용 예시
        val formattedCount = clickCount.let { 
            if (it > 999) LearningUtils.toKoreanFormat(it) else it.toString() 
        }
        counterTextView.text = "클릭 횟수: $formattedCount"
    }
    
    /**
     * 메시지 텍스트를 업데이트하는 메서드
     */
    private fun updateMessage() {
        val currentTime = System.currentTimeMillis()
        val elapsedSeconds = (currentTime - startTime) / 1000
        
        if (elapsedSeconds > 0) {
            val clickRate = LearningUtils.calculateClickRate(clickCount, elapsedSeconds)
            messageTextView.text = String.format("분당 클릭 수: %.1f", clickRate)
        }
    }
    
    /**
     * 특별한 메시지를 표시하는 메서드
     */
    private fun showSpecialMessage() {
        Log.i(LearningUtils.LOG_TAG, "특별한 이벤트 발생! ${LearningUtils.CLICK_THRESHOLD}번 클릭 달성")
        
        Toast.makeText(
            this,
            "축하합니다! 🎉 ${LearningUtils.CLICK_THRESHOLD}번 클릭을 달성했습니다!",
            Toast.LENGTH_LONG
        ).show()
    }
    
    override fun onResume() {
        super.onResume()
        Log.d(LearningUtils.LOG_TAG, "MainActivity onResume 호출됨")
    }
    
    override fun onPause() {
        super.onPause()
        Log.d(LearningUtils.LOG_TAG, "MainActivity onPause 호출됨")
    }
}