package com.example.androidstudytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
 */
class MainActivity : AppCompatActivity() {

    // 뷰 참조를 위한 변수들
    private lateinit var titleTextView: TextView
    private lateinit var clickButton: Button
    private lateinit var counterTextView: TextView
    
    // 클릭 카운터 변수
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 레이아웃 파일을 액티비티에 연결
        setContentView(R.layout.activity_main)
        
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
        
        // 초기 텍스트 설정
        updateCounter()
    }
    
    /**
     * 버튼 클릭 이벤트 리스너 설정
     * 람다 표현식을 사용한 간단한 클릭 리스너 구현
     */
    private fun setupClickListener() {
        clickButton.setOnClickListener {
            // 클릭 카운트 증가
            clickCount++
            
            // 카운터 텍스트 업데이트
            updateCounter()
            
            // Toast 메시지 표시 (사용자 피드백)
            Toast.makeText(
                this, 
                "버튼이 ${clickCount}번 클릭되었습니다!", 
                Toast.LENGTH_SHORT
            ).show()
        }
    }
    
    /**
     * 카운터 텍스트를 업데이트하는 메서드
     */
    private fun updateCounter() {
        counterTextView.text = "클릭 횟수: $clickCount"
    }
}