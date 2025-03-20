package com.javalenciab90.plataform.base

import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

interface CoroutineContextProvider {
    val mainContext: CoroutineContext
    val backgroundContext: CoroutineContext
    val immediateContext: CoroutineContext
}

class DefaultCoroutineContextProvider @Inject constructor() : CoroutineContextProvider {
    override val mainContext = Dispatchers.Main
    override val backgroundContext = Dispatchers.IO
    override val immediateContext = Dispatchers.Main.immediate
}