class Main {
    static void main(String[] args) {

        def man = new Human(name: "Ivan", age: 31)
        def woman = new Human(name: "Anna", age: 31)
        def child = new Human(name: "Vasia", age: -1)

        println man
        println woman
        println child

        def fammily1 = new Fammily(fammilyName: "Samoilenko")
        def fammily2 = new Fammily(fammilyName: "Andreev")
        println fammily1.fammilyName()
        fammily1.someFammily(man)
        fammily1.someFammily(woman)
        fammily1.someFammily(child)
        println fammily1
        println fammily1.averageAge()
        println fammily2.fammilyName()
        println fammily2

    }
}
