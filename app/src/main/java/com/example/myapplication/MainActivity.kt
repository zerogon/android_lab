package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nCount : Int = 0
    val nMaxCount : Int = 10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogcatTest.setOnClickListener{
            Log.d(javaClass.name,"${nCount++} clicked")
            try{
                val nResult = nMaxCount /(nMaxCount-nCount)
                Log.d("MyLog", "nMaxCount/(nMaxCount-nCount) is ${nResult} ")
            }catch (e:Exception){
                Log.d("MyLog","${nCount}: ${e.toString()}" )
            }
        }
    }
    /*
    *     var nLineNumber = 0

    // Activity가 생성될 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("ALLTEST", String.format("\n%d: onCreate", nLineNumber++))
    }

    // 내 activity 맨앞으로 왔을 때
    public override fun onResume() {
        super.onResume()
        Log.d("ALLTEST", String.format("%d: onResume", nLineNumber++))
    }

    // 내 activity 맨앞에 뭔가가 있을 때
    public override fun onStop() {
        super.onStop()
        Log.d("ALLTEST", String.format("%d: onStop", nLineNumber++))
    }

    // Activity가 최초실행될 때
    public override fun onStart() {
        super.onStart()
        Log.d("ALLTEST", String.format("%d: onStart", nLineNumber++))
    }

    // Activity가 완전히 종료될 때
    public override fun onDestroy() {
        super.onDestroy()
        Log.d("ALLTEST", String.format("%d: onDestroy", nLineNumber++))
    }
    *
    * */
}
