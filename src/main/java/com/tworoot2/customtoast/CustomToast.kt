package com.tworoot2.customtoast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

class CustomToast {

    companion object {
        fun show(context: Context, message: String?, uiStyle: Int) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val layout: View
            when (uiStyle) {
                1 -> layout = inflater.inflate(R.layout.custom_toast_style_1, null)
                2 -> layout = inflater.inflate(R.layout.custom_toast_style_2, null)
                else -> layout = inflater.inflate(R.layout.custom_toast_default, null)
            }
            val text = layout.findViewById<TextView>(R.id.toast_text)
            text.text = message
            val toast = Toast(context)
            toast.setGravity(Gravity.BOTTOM, 0, 100)
            toast.duration = Toast.LENGTH_SHORT
            toast.setView(layout)
            toast.show()
        }
    }

}