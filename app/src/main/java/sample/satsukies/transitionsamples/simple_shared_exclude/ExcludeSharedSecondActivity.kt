package sample.satsukies.transitionsamples.simple_shared_exclude

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ActivityExcludeSharedSecondBinding

class ExcludeSharedSecondActivity : AppCompatActivity() {

    lateinit var binding: ActivityExcludeSharedSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_exclude_shared_second)
    }
}
