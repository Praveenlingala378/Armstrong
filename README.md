<h2> Armstrong Number </h2>
<h3> Given N = 135 </h3>
<h3> origin = N </h3>
<h3>  Armstrong = 0 </h3>
<p> while (N>0) </p>
<p> temp = N % 10 </p>
<p> temp = Math.pow(temp,3) // Cube of the digit</p>
<p> Armstrong = Armstrong + temp</p>
<p> N = N % 10 </p>
<p> if ( Armstrong == orgin )</p>
<li> Print Armstrong </li>
else
<li> Not an Armstrong Number</li>
