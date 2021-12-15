import axios from "axios";
import { useEffect, useState } from "react";
import Person from "./components/Person";
import "./App.css";

const instance = axios.create({
  baseURL: "http://localhost:8080/api/",
  timeout: 1000,
  headers: { "X-Custom-Header": "Header value" },
});

function App() {
  const [persons, setPersons] = useState([]);

  useEffect(() => {
    const fetchPersons = async () => {
      const { data = [] } = await instance.get("/persons").catch((e) => {
        console.error(e);
      });
      setPersons(data);
    };
    fetchPersons();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <table border="1">
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
          </tr>
          {persons.map((p) => (
            <Person {...p} />
          ))}
        </table>
      </header>
    </div>
  );
}

export default App;
