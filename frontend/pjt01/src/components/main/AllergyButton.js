import x_btn from "../../img/x.png"
import './AllergyButton.css'


function AllergyButton(props) {
  return(
    <div className="allergy_btn">
      < div key={props.index} className='allergyitem' >{props.item.ingredient_name}
        <img src={x_btn} className="x_btn" alt="x"  onClick={() => {
          props.deleteItem(props.item)
          }}/>
      </div>
      </div>
  );
}

export default AllergyButton;