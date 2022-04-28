package org.javacc.tutorials.example

import org.javacc.tutorials.abcc.AbccParser
import org.javacc.tutorials.semantic.Semantic
import spock.lang.Specification

class TutorialSpec extends Specification {

    def 'Example1.jj only match `abcc`, could not match `abc`'() {
        expect:
        new Example(new ByteArrayInputStream('abcc'.getBytes())).Input()

        when:
        new Example(new ByteArrayInputStream('abc'.getBytes())).Input()
        then:
        thrown(org.javacc.tutorials.example.ParseException)
    }

    def 'Semantic.jj still only match `abcc`, could not match `abc`'() {
        expect:
        new Semantic(new ByteArrayInputStream('abcc'.getBytes())).Input()

        when:
        new Semantic(new ByteArrayInputStream('abc'.getBytes())).Input()
        then:
        thrown(org.javacc.tutorials.semantic.ParseException)
    }

    def 'AbccParser.jj could match both `abcc` and `abc`'() {
        expect:
        new AbccParser(new ByteArrayInputStream('abcc'.getBytes())).Input()
        new AbccParser(new ByteArrayInputStream('abc'.getBytes())).Input()
    }

}
