import Chart from 'react-apexcharts';

function BarChart() {
    
        const options = {
            plotOptions: {
                bar: {
                    horizontal: true,
                }
            },
        };
        
        const mockData = { // mockData são usados quando utilizamos dados estáticos.
            labels: {
                categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
            },
            series: [
                {
                    name: "% Sucesso",
                    data: [43.6, 67.1, 67.7, 45.6, 71.1]
                }
            ]
        };

        return (
            <Chart
                options={{...options, xaxis: mockData.labels}} // ... informa para pegar tudo do obj options reaproveita ele, só que você pode colocar mais coisas nesse objeto. 
                series={mockData.series}
                type="bar"
                height="240"
            />
    );
}

export default BarChart;