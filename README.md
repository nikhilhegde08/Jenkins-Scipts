# Jenkins-Scipts
## Steps
1. Login to Jenkins Console.
2. Create a New Item >> Enter a Friendly Name>> Select Pipeline.
3. Check Option This build is parameterized.
4. Create a String Parameter with name:ENV, defaultValue:'null', description:'Environment Value'
5. In the Pipeline script Enter the following code.
```
pipeline {
    // agent should be any to access available agents
    agent any

    stages {
        stage('Build') {
            steps {
                // git checkout snippet
                checkout poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[name: 'Jenkins-Script', url: 'https://github.com/nikhilhegde08/Jenkins-Scipts.git']]]
                
                script{
                    // array to store the params from external grovy script
                    def options = []
                    
                    // load external groovy file
                    def optionsBuilder = load "options.groovy"
                    
                    // call the function to get all the groovy params and append it to array
                    options.addAll(optionsBuilder.buildOptions())
                    
                    // setting the properties
                    properties(options)
                    
                    // load another groovy script that accesses the param
                    def main = load "main.groovy"
                    
                    // call the function inside groovy script
                    main.testMethod(params)
                }
            }
        }
    }
}

```
5. Save the Pipeline and Build the Pipeline with Parameters.
