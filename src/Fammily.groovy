class Fammily {


    def someFammily(human) {
        members[human.getName()] = human
    }

    def fammilyName() {
        "=====${fammilyName}====="
    }


    String toString() {
        def str = ''
        if (members) {
            members.each { name, age -> str += " ${age}\n" }
        } else {
            str = 'no members yet!'
        }
        str
    }

    def averageAge() {

       println members


    }

    def fammilyName
    def members = [:]
}
