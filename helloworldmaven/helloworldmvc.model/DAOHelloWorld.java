package fr.exia.helloworldmaven;

class DAOHelloWorld{
	
	private String FileName = HelloWorld.txt;
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;

	
	private DAOHelloWorld(){
		readFile();
	}
	
	public DAOHelloWorld getInstance(){
		if (instance == null){
			instance = DAOHelloWorld;
		}
		return instance;
	}
	
	private void setInstance(DAOHelloWorld instance){
		this.instance = instance;
	}
	
	private void readFile(){
		//FileReader reads text files in the default encoding.
		Filereader fileReader = new FileReader();
		
		// Always wrap FileReader in BufferedReader.
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		setHelloWorldMessage() = bufferedReader.readLine();	
		// Always close files.
        bufferedReader.close(); 
	}
	
	public String getHelloWorldMessage(){
		return helloWorldMessage;
	}
	public void setHelloWorldMessage(String helloWorldMessage){
		this.helloWorldMessage = helloWorldMessage;
	}
}
