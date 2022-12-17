import com.example.Docker

def call(version){
    return new Docker(this).dockerPush(version)
}