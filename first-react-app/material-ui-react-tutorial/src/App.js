import logo from './logo.svg';
import './App.css';
import ButtonGroup from "@mui/material/ButtonGroup"
import Button from "@mui/material/Button"
function App() {
  return (
    <div className="App">
      <header className="App-header">

        <ButtonGroup variant='contained' color="primary">
          <Button
            size="large"
            style={
              {
               fontSize: 24
              }
            }
          >
            Save
          </Button>
          <Button
            // startIcon={<DeleteIcon />}
            size="large"
            style={
              {
               fontSize: 24
              }
            }
          >
            Discard
          </Button>
        </ButtonGroup>
        <img src={logo} className="App-logo" alt="logo" />

      </header>
    </div>
  );
}

export default App;
