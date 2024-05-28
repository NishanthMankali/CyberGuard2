package com.example.cyberguard

import android.util.Base64
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

object EncryptionUtil {

    private val cipher: Cipher = Cipher.getInstance("AES")
    private val key: SecretKey = generateKey()

    private fun generateKey(): SecretKey {
        val keyGen = KeyGenerator.getInstance("AES")
        keyGen.init(128)
        return keyGen.generateKey()
    }

    fun encrypt(data: String): String {
        cipher.init(Cipher.ENCRYPT_MODE, key)
        val encrypted = cipher.doFinal(data.toByteArray())
        return Base64.encodeToString(encrypted, Base64.DEFAULT)
    }

    fun decrypt(data: String): String {
        cipher.init(Cipher.DECRYPT_MODE, key)
        val decoded = Base64.decode(data, Base64.DEFAULT)
        return String(cipher.doFinal(decoded))
    }
}
