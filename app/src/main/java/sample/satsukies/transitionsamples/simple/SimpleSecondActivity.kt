package sample.satsukies.transitionsamples.simple

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ActivitySimpleSecondBinding

class SimpleSecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySimpleSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_second)
    }
}
