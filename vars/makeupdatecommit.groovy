import com.example.Git

def call(String repo_name){
    return new Git(this).makeVersionCommit(repo_name)
}