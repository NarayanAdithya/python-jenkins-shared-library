import com.example.Docker

def call(String version, String repo){
    return new Docker(this).buildDockerImage(version, repo)
}