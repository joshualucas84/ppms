/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'lucasj8' at '5/28/16 7:52 PM' with Gradle 2.13
 *
 * @author lucasj8, @date 5/28/16 7:52 PM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
