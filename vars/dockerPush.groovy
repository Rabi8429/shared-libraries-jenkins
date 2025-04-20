def call ( String Project, String ImageTag, String dockerhubuser ){
  withCredentials([usernamePassword(credentialsId: 'dockerhubpwd', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
   sh "docker login -u $USERNAME -p $PASSWORD"
}
sh 'docker push ${dockerhubuser}/${Project}:${ImageTag}'

}
  
