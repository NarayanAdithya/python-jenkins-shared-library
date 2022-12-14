import com.example.Docker

def call(String Version){
    return new Docker(this).dockerPush(Version)
}