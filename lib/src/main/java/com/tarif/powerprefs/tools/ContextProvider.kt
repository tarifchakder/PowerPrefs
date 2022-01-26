package com.tarif.powerprefs.tools

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import java.lang.reflect.InvocationTargetException

/**
 * @Author: Tarif Chakder
 * @Date: 26-01-2022
 */


@SuppressLint("StaticFieldLeak")
object ContextProvider {

    private lateinit var context: Context

    val appContext: Context
        @SuppressLint("DiscouragedPrivateApi", "PrivateApi")
        get() {
            return if (ContextProvider::context.isInitialized) context
            else {
                try {
                    context = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication").invoke(null) as Application
                } catch (ignored: IllegalAccessException) {
                } catch (ignored: InvocationTargetException) {
                } catch (ignored: NoSuchMethodException) {
                } catch (ignored: ClassNotFoundException) {
                } catch (ignored: ClassCastException) {}
                context
            }
        }
}
