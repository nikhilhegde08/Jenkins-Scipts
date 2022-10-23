// external groovy script to specify params

def buildOptions() {
    def options = [
      parameters(
        [
          string(name: 'ENV', defaultValue: 'test', description: 'Environment Value')
        ]
      )
    ]


    return options
}
return this
