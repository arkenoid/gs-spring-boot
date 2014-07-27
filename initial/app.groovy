@GrabResolver(name='custom', root='http://localhost:8081/artifactory/remote-repos', m2Compatible=true)
@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello World!"
    }

}
