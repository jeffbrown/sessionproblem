package demo

import grails.transaction.Transactional

class HelperService {

    @Transactional
    void doSomething() {
        Person.withNewSession {
            new Person(name: 'Jeff').save()
        }
    }
}
