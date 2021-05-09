import axios from "axios";
import { useState, useEffect } from "react";
import Chart from "react-apexcharts";
import { SaleAmount } from "types/sale";
import { BASE_URL } from "utils/requests";

type ChartData = {
  labels: string[];
  series: number[];
};

const DonutChart = () => {
  // Hook: useState
  // Manter estado no componente
  const [chartData, setChartData] = useState<ChartData>({
    labels: [],
    series: [],
  });

  // Hook: useEffect
  // Executar algo na instanciação ou destruição do componente, observar estado
  useEffect(() => {
    axios.get(`${BASE_URL}/sales/amount-by-seller`).then((response) => {
      const data = response.data as SaleAmount[];
      const labels = data.map((x) => x.sellerName);
      const series = data.map((x) => x.sum);

      setChartData({ labels, series });
    });
  }, []);

  // const mockData = {
  //   series: [477138, 499928, 444867, 220426, 473088],
  //   labels: ["Anakin", "Barry Allen", "Kal-El", "Logan", "Padmé"],
  // };

  const options = {
    legend: {
      show: true,
    },
  };

  return (
    <Chart
      options={{ ...options, labels: chartData.labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />
  );
};

export default DonutChart;
