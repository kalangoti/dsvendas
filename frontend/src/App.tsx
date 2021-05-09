import { Fragment } from "react";
import Navbar from "components/Navbar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";

function App() {
  return (
    <Fragment>
      <Navbar />
      <div className="container">
        <h1 className="text-primary">Olá mundo!</h1>

        <DataTable />
      </div>
      <Footer />
    </Fragment>
  );
}

export default App;
