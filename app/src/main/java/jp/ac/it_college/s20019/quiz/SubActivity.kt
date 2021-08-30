package jp.ac.it_college.s20019.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import jp.ac.it_college.s20019.quiz.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding

    inner class MyCountDownTimer(millisInFuture: Long, countDownInterval: Long) : CountDownTimer(millisInFuture, countDownInterval) {
        var isRunning = false

        override fun onTick(millisUntilFinished: Long) {
            val second = millisUntilFinished / 1000L % 60L
            // binding.timerText.text = "%1$02d".format(second)
        }

        override fun onFinish() {

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}