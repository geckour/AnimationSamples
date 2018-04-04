package sample.satsukies.transitionsamples.custom_shared

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ActivityCustomSharedSecondBinding

class CustomSharedSecondActivity : AppCompatActivity() {

    lateinit var binding: ActivityCustomSharedSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_shared_second)
    }
}
