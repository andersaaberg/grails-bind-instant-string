package grails.bind.instant.string

class TestController {

    def index(TestCommand testCommand) {
        render testCommand.testInstant
    }
}
