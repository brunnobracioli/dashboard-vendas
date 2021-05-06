import Chart from 'react-apexcharts';

function DonutChart() {

    const mockData = {
        series: [477138, 499928, 444867, 220426, 473088],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }
    
    const options = {
        legend: {
            show: true
        }
    }

        return (
            <Chart
                options={{...options, labels: mockData.labels}} // ... informa para pegar tudo do obj options reaproveita ele, só que você pode colocar mais coisas nesse objeto. 
                series={mockData.series}
                type="donut"
                height="240"
            />
    );
}

export default DonutChart;