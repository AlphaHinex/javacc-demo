package org.javacc.tutorials.example

import spock.lang.Specification

class ExampleSpec extends Specification {

    def 'test'() {
        expect:
        new Example(new ByteArrayInputStream('abccdef'.getBytes())).Input()

        when:
        new Example(new ByteArrayInputStream('abcdef'.getBytes())).Input()
        then:
        thrown(Error)
    }

}
