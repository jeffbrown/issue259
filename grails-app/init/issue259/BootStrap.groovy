package issue259

class BootStrap {

    def init = { servletContext ->
        ['John', 'Paul', 'George', 'Ringo'].each {
            new Person(name: it).save()
        }
    }
    def destroy = {
    }
}
