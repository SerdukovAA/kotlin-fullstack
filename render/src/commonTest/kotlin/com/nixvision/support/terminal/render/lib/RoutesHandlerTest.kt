package com.nixvision.support.terminal.render.lib

import kotlin.test.Test
import kotlin.test.assertTrue


class RoutesHandlerTest {

    @Test
    fun `Check pathEqualTemplate method`() {

        assertTrue { RoutesHandler.pathEqualTemplate("/index", "/index") }

        assertTrue { RoutesHandler.pathEqualTemplate("/index/{product}", "/index/16") }

    }

}


