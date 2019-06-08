package com.example.workdatabinding

import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * make variable observable -> notify when data has changed ->
 * for this we use "Bindable" so the class should extend from BaseObservable
 */
class Contact(_name: String, _email: String) : BaseObservable() {

    @get:Bindable
    var name: String = _name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var email: String = _email
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }

    companion object {
        @JvmStatic
        @BindingAdapter("profileImage")
        fun loadImage(view: ImageView, imgUrl: String) {
            Glide.with(view.context).load(imgUrl).into(view)
        }
    }
}