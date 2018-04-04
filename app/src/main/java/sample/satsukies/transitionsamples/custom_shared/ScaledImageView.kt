package sample.satsukies.transitionsamples.custom_shared

import android.content.Context
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

class ScaledImageView : AppCompatImageView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val width = measuredWidth

        val calculatedHeight = width / 16 * 9

        setMeasuredDimension(width, calculatedHeight)
    }
}
