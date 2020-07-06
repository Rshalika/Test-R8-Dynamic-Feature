package com.strawhat.dynamicfeature

import com.ibm.icu.text.Transliterator

object TestFeature {

    fun test(){
        Transliterator.getInstance("Any-Latin").transliterate("asdasd")
    }
}