import com.example.Docker

def call(version, String repo){
    return new Docker(this).dockerPush(version, repo)
}