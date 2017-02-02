package sessionproblem

import demo.HelperService

class BootStrap {
    HelperService helperService

    def init = { servletContext ->
        helperService.doSomething()
    }
    def destroy = {
    }
}
