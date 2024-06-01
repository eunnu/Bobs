import { React } from 'react';
import "./css/SelectedItem.css";
import { useState } from "react";


function SelectedItem(props) {
  const [colorstate, setcolorstate] = useState("");


  const styleclick = {
    background : "#9CCBFE",
    color: "#fcfcfc",
    border : "none"
  }
  const styleclick2 = {
    background : "#fcfcfc",
    color: "#6C6C6C"
  }
  return(
      <div>
        {colorstate ? (
        <div style={styleclick} className='itemlistbox'>
            < div  key={props.index} className='select_item_text'  
              onClick={() => {
                setcolorstate(null);
                props.deleteItem(props.item.ingredient_id);
                props.deleteforItem(props.item.ingredient_name);
            }}
            >
            <div className="itemText">{props.item.ingredient_name}</div>
          </div>
        </div>
        ) : (
        <div style={styleclick2}  className='itemlistbox'>
        <div key={props.index} className='select_item_text'
          onClick={() => {
            setcolorstate(1);
            props.addItem(props.item.ingredient_id);
            props.addforItem(props.item.ingredient_name);
        }}>
          <div className="itemText">{props.item.ingredient_name}</div>
        </div >  
      </div>

      )}
      </div>


  );
}

export default SelectedItem;


  