package com.thunder.mylibrary

import android.annotation.SuppressLint
import androidx.annotation.Keep

/**
 * @author Created by M.Moradikia
 * @date  11/15/2022
 * @company Thunder-Light
 */

//https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/StringUtils.html

@SuppressLint("RestrictedApi")
class StringUtilsManager {

    fun strToDigit(value: String): String {
        return StringUtilsMosi.strToDigit(value)
    }

    fun leftPad(str: String, length: Int, car: Char): String {
        return StringUtilsMosi.leftPad(str, length, car)
    }

    fun rightPad(str: String, length: Int, car: Char): String {
        return StringUtilsMosi.rightPad(str, length, car)
    }

    fun unConcatString(length: Int, value: String): String {
        return StringUtilsMosi.unConcatString(length, value)
    }

    fun getStringFromWindowsSystem(value: String) {

    }

    fun getBillAmount(billPaymentId: String): String {
        return StringUtilsMosi.getBillAmount(billPaymentId)
    }

    fun getShaparakResponseMessage2(respCode: Int): String {
        return StringUtilsMosi.getShaparakResponseMessage2(respCode)
    }

    fun getShaparakResponseMessage(respCode: Int): String {
        return StringUtilsMosi.getShaparakResponseMessage(respCode)
    }

    fun getJavaCardResponseMessage3(respCode: String): String {
        return StringUtilsMosi.getJavaCardResponseMessage3(respCode)
    }

    fun hexStringToByteArray2(s: String): ByteArray {

        return StringUtilsMosi.hexStringToByteArray2(s)
    }

}