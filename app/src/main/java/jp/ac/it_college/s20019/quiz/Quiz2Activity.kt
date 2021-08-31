package jp.ac.it_college.s20019.quiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import jp.ac.it_college.s20019.quiz.databinding.ActivityQuiz1Binding


class Quiz2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.visibility = View.INVISIBLE

        binding.answerButton.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.ic_baseline_circle)
            binding.imageView.visibility = View.VISIBLE
        }

        binding.button2.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.s20019batu)
            binding.imageView.visibility = View.VISIBLE
        }

        binding.button3.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.s20019batu)
            binding.imageView.visibility = View.VISIBLE
        }

        binding.button4.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.s20019batu)
            binding.imageView.visibility = View.VISIBLE
        }

        binding.nextButton.setOnClickListener {
            val intent = Intent(this, Quiz3Activity::class.java)
            startActivity(intent)
        }
    }
}