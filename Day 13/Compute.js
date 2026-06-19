import React from 'react'
import {EventHandling} from './EventHandling'
export const Compute = () => {
    const n1 = 500;
    const n2 = 300;
  return (
    <div>
        <h4>The number:{n1}+{n2}</h4>
        <EventHandling />
    </div>
  )
}
