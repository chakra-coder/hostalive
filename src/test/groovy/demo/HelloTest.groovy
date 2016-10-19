package demo

/**
 * Created by baracat on 13/10/16.
 */
class HelloTest extends spock.lang.Specification {
    def "SayHello"() {
        expect: hello == "Hello, Gradle!"

        where: hello = new Hello().sayHello()
    }
}
