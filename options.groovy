// groovy script to set params

def getOptions(){
  def options = [
  string(name: 'ENV', description: 'Specify Environment', defaultValue: 'null')
  ]
  
  return options
}
return this
