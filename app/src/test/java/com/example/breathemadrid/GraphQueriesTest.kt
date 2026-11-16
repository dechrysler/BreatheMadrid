package com.example.breathemadrid

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class GraphQueriesTest {
    @Test fun selectedResourceUriIsUsedInTheQuery() {
        val query = GraphQueries.stats(
            "http://breathemadrid.es/resource/station/arturo-soria",
            "http://breathemadrid.es/resource/pollutant/dioxido-de-nitrogeno")
        assertTrue(query.contains("VALUES ?station { <http://breathemadrid.es/resource/station/arturo-soria> }"))
        assertTrue(query.contains("bm:isValid true"))
        assertFalse(query.contains("URI_ESTACION"))
    }

    @Test(expected = IllegalArgumentException::class)
    fun arbitraryUriCannotBeInsertedIntoSparql() {
        GraphQueries.stationDetail("http://example.com/station/anything> } UNION { ?x ?y ?z")
    }
}
