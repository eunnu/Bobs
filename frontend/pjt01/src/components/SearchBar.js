import './SearchBar.css'
import delete_icon from '../img/x.png'
import search_icon from '../img/search_item.png'
import { useState } from 'react';

function SearchBar(props) {
  const [text, setText] = useState('');

  return (
    <div className='search_input'>
      <div className='img_icon'><img src={search_icon} alt="search" className="search_item" /></div>
      <input type="text" value={text} id='search_input'
        onChange={(e) => {
          setText(e.target.value);
          props?.setData(props?.data.filter(i => i.ingredient_name.includes(e.target.value)))
        }}
        placeholder={props.placeholder}/>
      <div className='img_icon'><img src={delete_icon} alt="delete" className="delete_item" onClick={() => setText("")} /></div>
    </div>
  )
}

export default SearchBar