package com.thunder.mylibrary

import android.annotation.SuppressLint


/**
 * @author Created by M.Moradikia
 * @date  11/15/2022
 * @company Thunder-Light
 */

//https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/StringUtils.html

@SuppressLint("RestrictedApi")
class StringUtilsMosi {

    companion object {

        fun strToDigit(value: String): String {
            return value.replace("[^0-9]".toRegex(), "")
        }

        fun leftPad(str: String, length: Int, car: Char): String {
            return (str + String.format("%" + length + "s", "").replace(" ", car.toString())).substring(0, length)
        }

        fun rightPad(str: String, length: Int, car: Char): String {
            return (str + String.format("%" + length + "s", "").replace(" ", car.toString())).substring(0, length)
        }

        fun unConcatString(length: Int, value: String): String {
            return value.substring(length)
        }

        fun getStringFromWindowsSystem(value: String) {

        }

        private fun getBillAmount(billPaymentId: String): String {
            var amount = ""
            var temp = ""
            if (billPaymentId.isNullOrEmpty() || billPaymentId.length < 6 || billPaymentId.length > 13)
                return ""
            temp = billPaymentId.substring(0, billPaymentId.length - 5)
            val tempAmount = temp.toLongOrNull()
            if (tempAmount != null)
                amount = (tempAmount * 1000).toString()

            return amount
        }

        private fun getShaparakResponseMessage2(respCode: Int): String {
            return when (respCode) {
                -1 -> "کاربر از انجام تراکنش صرف نظر کرد"
                0, 8, 16 -> " تراکنش موفق"
                1, 19, 40, 93 -> " تراکنش ناموفق"
                3 -> "پذیرنده\u200Cی فروشگاهی نامعتبر است"
                5 -> "از انجام تراکنش صرف نظر شده است."
                6 -> "اشکال در مرکز"
                12, 23 -> "تراکنش نامعتبر است"
                13 -> "مبلغ صحیح نیست"
                14 -> "شماره\u200Cی کارت ارسالی نامعتبر است"
                15 -> "چنین صادرکننده\u200Cی کارتی وجود ندارد"
                17 -> "انصراف از انجام تراکنش"
                25 -> "تراکنش غیرمجاز"
                30 -> "قالب پیام دارای اشکال است"
                31 -> "پذیرنده توسط سوییچ پشتیبانی نمی شود."
                33, 54 -> "کارت منقضی است"
                34 -> "دارنده\u200Cی کارت مظنون به تقلب است"
                38, 75 -> "تعداد دفعات ورود رمز اشتباه بیش از حد مجاز است"
                39, 42, 44, 52, 53 -> "کارت نامعتبر است"
                41 -> "کارت مفقودی می باشد."
                43 -> "کارت مسروقه می باشد"
                48 -> "قبض قبلا پرداخت شده"
                51 -> "موجودی کافی نیست"
                55 -> "رمز نامعتبر است"
                56 -> "کارت نامعتبر است"
                57 -> "انجام تراکنش مربوطه توسط دارنده\u200Cی کارت مجاز نمی باشد"
                58 -> "انجام تراکنش مربوطه توسط پایانه\u200Cی انجام دهنده مجاز نمی باشد."
                61 -> "مبلغ تراکنش بیشتر از حد مجاز"
                62 -> "کارت محدود شده است"
                63 -> "تمهیدات امنیتی نقض گردیده است"
                65 -> "محدودیت تعداد خرید کارت"
                68 -> "زمان انجام تراکنش به پایان رسیده است"
                76 -> "مبلغ نامعتبر است"
                77 -> "روز مالی صحیح نیست"
                78 -> "کارت فعالی نیست"
                79 -> "حساب تعریف نشده"//مبلغ سند برگشتی، از مبلغ تراکنش اصلی بیش‌تر است
                80 -> "اشکال در حساب کارت"
                81 -> "کارت باطل شده"
                83, 84, 85 -> "اشکال موقت سیستم مرکزی"
                86 -> "تراکنش مجاز نیست"
                90 -> "بانک مقصد در حال انجام عملیات پایان روز است."
                94 -> "تراکنش تکراری است"
                96, 99 -> "عملیات ناموفق"
                else -> "خطای نامشخص"
            }
        }

        private fun getShaparakResponseMessage(respCode: Int): String {
            return when (respCode) {
                0 -> "عملیات موفق"
                3 -> "پذیرنده نا معتبر"
                5 -> "صرف نظر از تراکنش"
                6 -> "خطا در شروع بکار"
                7 -> "شماره تائید موجود نیست"
                12 -> "تراکنش مردود شد"
                13 -> "مبلغ اشتباه"
                14 -> "کارت ناشناخته"
                15 -> "قبلا باز شده"
                16 -> "قبلا بسته شده"
                19 -> "دوباره سعی کنید"
                20 -> "قبض مورد تایید نیست"
                21 -> "محدودیت زمان کاری"
                24 -> "عملیات پایان روز"
                25 -> "سریال پایانه نامعتبر"
                29 -> "عملیات پایان روز"
                30 -> "فرمت اشتباه"
                31 -> "عدم پذیرش صادرکننده"
                32 -> "پایانه غیرفعال"
                33 -> "کارت منقضی"
                34 -> "تراکنش اصلی نا موفق"
                38 -> "رمز غلط بیش از حد"
                41 -> "کارت مفقودی"
                43 -> "کارت دزدی"
                44 -> "شارژ موجود نیست"
                47 -> "زمان منقضی شده"
                48 -> "قبلا انجام شده"
                51 -> "موجودی ناکافی"
                54 -> "کارت منقضی"
                55 -> "رمز اشتباه"
                56 -> "کارت اشتباه"
                57 -> "عملیات نامعتبر"
                58 -> "عملیات نامعتبر"
                60 -> "لیست سیاه آماده نیست"
                61 -> "محدودیت مبلغ"
                62 -> "محدودیت مبلغ"
                63 -> "مک اشتباه"
                64 -> "تراکنش اشتباه"
                65 -> "تعداد بیش از حد"
                66 -> "حساب مسدود"
                68 -> "موجودی اشتباه"
                70 -> "تراکنش اشتباه"
                71 -> "تراکنش اشتباه"
                75 -> "رمز اشتباه بیش از حد"
                77 -> "روز مالی اشتباه"
                78 -> "کارت فعال نیست"
                79 -> "حساب تعریف نشده"
                80 -> "تراکنش نا موفق"
                81 -> "کارت باطل شده"
                83 -> "مرکز آماده نیست"
                84 -> "مرکز آماده نیست"
                85 -> "خطای داخلی"
                86 -> "پایانه نامعتبر"
                87 -> "خطای رمز"
                88 -> "خطای داخلی"
                89 -> "خطای داخلی"
                90 -> "عملیات پایان روز"
                91 -> "صادر کننده غیر فعال"
                92 -> "بانک صادر کننده نامعتبر"
                93 -> "صف پرشده"
                94 -> "تراکنش تکراری"
                96 -> "خطای مرکزی"
                97 -> "شروع بکار نشده"
                99 -> "پیکره بندي نشده"
                -2 -> "خطا در پارس پیام"
                else -> "خطای نامشخص"
            }
        }


        private fun getJavaCardResponseMessage3(respCode: String): String {
            return when (respCode) {
                "63A0" -> "63 A0: PUK Blocked"
                "63A1" -> "63 A1: PIN Blocked"
                "63A2" -> "63 A2: PIN Verification Needed"
                "63A3" -> "63 A3: KCV Not Valid"
                "63A4" -> "63 A4: Key Slot Initialized"
                "63A5" -> "63 A5: Key Slot Not Initialized"
                "63A6" -> "63 A6: Key Index Not Available"
                "63A7" -> "63 A7: Key Store Full"
                "63FF" -> "63 FF: LOG"
                else -> "Unknown Error"
            }
        }

        private fun hexStringToByteArray2(s: String): ByteArray {
            val len = s.length
            val data = ByteArray(len / 2)
            var i = 0
            while (i < len) {
                data[i / 2] = ((s[i].digitToIntOrNull(16) ?: (-1 shl 4)) + s[i + 1].digitToIntOrNull(16)!!).toByte()
                i += 2
            }
            return data
        }
    }
}