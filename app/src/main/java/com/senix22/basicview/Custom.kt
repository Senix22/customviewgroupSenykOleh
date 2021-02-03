package com.senix22.basicview

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.custom_view.view.*

class Custom @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null, deffAttrStyle :Int = 0) : LinearLayout(context,
    attributeSet,
    deffAttrStyle) {
    private val textView: TextView
    private val typeOf: TextView
    private val price: TextView
    private val ratingBar: RatingBar
    private val imageView: ImageView
    init {
        inflate(context, R.layout.custom_view, this)

        textView = findViewById(R.id.caption)
        typeOf = findViewById(R.id.typeOf)
        imageView = findViewById(R.id.image)
        price = findViewById(R.id.price)
        ratingBar = findViewById(R.id.ratingBar_small)

        val attributes = context.obtainStyledAttributes(attributeSet, R.styleable.BenefintView)
        imageView.setImageDrawable(attributes.getDrawable(R.styleable.BenefintView_image))
        textView.text = attributes.getString(R.styleable.BenefintView_text)
        typeOf.text = attributes.getString(R.styleable.BenefintView_type)
        price.text = attributes.getString(R.styleable.BenefintView_price)

        attributes.recycle()
    }
    fun changeText(@StringRes string: Int) {
        textView.setText(string)
    }
    fun changeType(@StringRes string: Int) {
       typeOf.setText(string)
    }
    fun changePrice(@StringRes string: Int){
        price.setText(string)
    }
    fun setImage(@DrawableRes drawableRes: Int) {
        imageView.setImageDrawable(ContextCompat.getDrawable(context, drawableRes))
    }
}