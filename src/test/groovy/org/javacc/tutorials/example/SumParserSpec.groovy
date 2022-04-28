package org.javacc.tutorials.example

import io.github.alphahinex.javacc.demo.sum.SumParser
import spock.lang.Specification
import spock.lang.Unroll

class SumParserSpec extends Specification {

    @Unroll
    def '#formula = #result'() {
        expect:
        new SumParser(new ByteArrayInputStream(formula.getBytes())).Sum() == result

        where:
        formula         | result
        '求和(100,23)'   | 123
        '求和(-100,23)'  | -77
    }

}
