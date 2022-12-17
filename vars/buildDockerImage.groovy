import com.example.Docker

def call(String version){
    return new Docker(this).buildDockerImage(version)
}