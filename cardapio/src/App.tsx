import { Card } from "./components/card/card";
import { FoodData } from "./components/card/interface/FoodData";

function App() {
  const data: FoodData[] = [];
  return(
    <div className='container'>
      <h1>Cardáipio</h1>
      <div className="card-grid">
        {data.map(foodData => 
        <Card 
        price={foodData.price} 
        title={foodData.title} 
        image={foodData.image}/>)}
      </div>
    </div>
  )
}

export default App
