class PlatformTest {

    fun platformTypeNullTest() {
        val repo = UserRepo()
        val platFormTypeUser = repo.nullUser

        println(platFormTypeUser.age) // platFormTypeUser null이기 때문에 NPE 발생
    }

    fun platformTypeTargetTest() {
        val repo = UserRepo()
        val platFormTypeUser = repo.user // User!(platformType)
        val notNullUser: User = repo.user // User(NotNull)
        val nullableUser: User? = repo.user // User?(Nullable)
    }

    fun statedTypeTest() {
        val repo = UserRepo()
        val platFormTypeUser = repo.user // User!(platformType)
        val notNullUser = repo.notNullUser // User(NotNull)
        val nullableUser = repo.nullUser // User?(Nullable)
    }

    fun statedType() {
        val repo = UserRepo()

        val statedTypeUser: User  = repo.user // NPE 발생
        // TODO ~~~ 로직
        println(statedTypeUser.age)
    }
    fun platformType() {
        val repo = UserRepo()

        val platFormTypeUser = repo.user
        // TODO ~~~ 로직
        println(platFormTypeUser.age) // NPE 발생
    }

    fun test() {
        val repo: UserRepoInft = UserRepoImpl()
        val text :String = repo.getUserName() // RUNTIME NPE 발생

        println(text)
    }

}
