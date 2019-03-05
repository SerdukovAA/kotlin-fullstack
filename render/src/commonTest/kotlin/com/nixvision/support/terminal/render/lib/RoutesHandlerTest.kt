package com.nixvision.support.terminal.render.lib

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class RoutesHandlerTest {

    @Test
    fun `Check pathEqualTemplate method`() {

        assertTrue { RoutesHandler.isPathMatchTemplate("/index", "/index") }

        assertTrue { RoutesHandler.isPathMatchTemplate("/product/15", "/product/{product}") }

        assertTrue { RoutesHandler.isPathMatchTemplate("/product/15/info", "/product/{product}/info") }

        assertTrue { RoutesHandler.isPathMatchTemplate("/category/red/product/door/info", "/category/{categoryId}/product/{product}/info") }

        assertFalse { RoutesHandler.isPathMatchTemplate("/category/red/product/door/help", "/category/{categoryId}/product/{product}/info") }

        assertFalse { RoutesHandler.isPathMatchTemplate("/product/15", "/category/{product}") }

        assertFalse { RoutesHandler.isPathMatchTemplate("/product/15", "/product/{product}/info") }

        assertFalse { RoutesHandler.isPathMatchTemplate("/product/15", "/product/{product}/info") }

    }

}


