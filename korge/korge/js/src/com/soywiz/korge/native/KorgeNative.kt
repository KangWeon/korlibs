package com.soywiz.korge.native

import kotlin.reflect.*

actual object KorgeNative {
	actual fun getClassSimpleName(clazz: KClass<*>): String = clazz.simpleName ?: "unknown"
	actual fun checkEnvironment() {
	}
}
