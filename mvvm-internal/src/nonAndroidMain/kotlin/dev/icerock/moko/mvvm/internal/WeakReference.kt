/*
 * Copyright 2022 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.mvvm.internal

expect class WeakReference<T: Any>(referred: T) {
    fun get(): T?
}