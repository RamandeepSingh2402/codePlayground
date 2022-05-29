import './App.css';

const Person = (props) =>{
  return (
    <>
    <h1>First Name: {props.FName}</h1>
    <h2>Last Name: {props.LName}</h2>
    <h2>Age: {props.Age}</h2>
    </>
  );
}

const Button = () =>{
  return (
    <Button >
      Let's Chat
    </Button>
  )
}
const App = () => { 
  const name = "John";
  const isNameShowing = true;
  return (
    <div className="App">
      <Person 
        FName={"John"} 
        LName ={"Doe"} 
        Age={25}
      />
      <Button />
      <Person
        FName= {"Mary"} 
        LName={"Doe"} 
        Age={24}
      />
      <Button />
    </div>
  );
}  

export default App;
