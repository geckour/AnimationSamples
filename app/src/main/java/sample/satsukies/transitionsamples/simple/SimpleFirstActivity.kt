package sample.satsukies.transitionsamples.simple

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ActivitySimpleFirstBinding

class SimpleFirstActivity : AppCompatActivity() {

    lateinit var binding: ActivitySimpleFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_first)

        binding.buttonGo.setOnClickListener { startActivity(Intent(this, SimpleSecondActivity::class.java)) }
    }
}
