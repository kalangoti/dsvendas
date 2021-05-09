import axios from "axios";
import { useState, useEffect } from "react";
import { SalePage } from "types/sale";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

const DataTable = () => {
  // Hook: useState
  // Manter estado no componente
  const [page, setPage] = useState<SalePage>({
    first: true,
    last: true,
    number: 0,
    totalElements: 0,
    totalPages: 0,
  });

  // Hook: useEffect
  // Executar algo na instanciação ou destruição do componente, observar estado
  useEffect(() => {
    axios
      .get(`${BASE_URL}/sales?page=0&size=20&sort=date,desc`)
      .then((response) => {
        setPage(response.data);
      });
  }, []);

  return (
    <div className="table-responsive">
      <table className="table table-striped table-sm">
        <thead>
          <tr>
            <th>Data</th>
            <th>Vendedor</th>
            <th>Clientes visitados</th>
            <th>Negócios fechados</th>
            <th>Valor</th>
          </tr>
        </thead>
        <tbody>
          {page.content?.map((item) => (
            <tr key={item.id}>
              <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
              <td>{item.seller.name}</td>
              <td>{item.visited}</td>
              <td>{item.deals}</td>
              <td>{item.amount.toFixed(2)}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default DataTable;
