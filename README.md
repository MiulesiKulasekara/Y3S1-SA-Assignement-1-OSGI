# Y3S1-SA-Assignement-1-OSGI
<b>Our Team</b>	

<b>Group ID</b> : CSSE_WE_05</br>

<b>Team members : </b></br>
IT21028878	Kulasekara D.A.M.N</br>
IT21034404	Nipun P.G.I</br>
IT21039140 	Dewasurendra S.V</br>
IT21071034	Wanniarachchi T.T</br>

<p><b>Ocean travel</b> is a travel agency that provides four services to its customers. The four services are transportation service, Hotel Booking Service, Travel Budget Planning Service, and Flight Booking Service.</p>

<b>Transportation Service:</b>
<p>Transportation Service helps customers to select the best option to travel the customers. According to the number of passengers, the service has been programmed to display the most suitable vehicle option it has to the customer. This service allows loyal customers to get an offer. other than that, all customers can get a discount. Conditions may apply.</p></br>

<b>Hotel Booking Service:</b>
<p>Hotel booking service allows customers to choose hotels of their choice. Customers can reserve comfortable rooms as per their preference regarding the booked hotel.  All customers can get a discount. Other than that, an offer will be given to loyalty customers. Conditions apply.</p></br>

<b>Travel Budget Planning Service:</b>
<p>This unit will provide customers with the ability to plan their travel budget and calculate the estimated cost of their trip based on their preferred destinations, travel style and activities. Here are some functionalities that the travel budget planning unit has destination selection, travel style selection, activity selection and budget calculation.</p></br>

<b>Flight Booking Service:</b>  
<p>Fight booking service allows customers to enter personal data and validate them. The system confirms the date, and requests the departure and arrival times, chosen class, luggage size, and selected seat. Using entered information the cost will be calculated.
Those four scenarios are developed by using OSGi framework. The below table represent services and subscribers according to the OSGi framework.</p></br>

<table>
  <thead>
    <tr>
      <th>Service</th>
      <th>Producer/Provider</th>
      <th>Subscriber/Consumer</th>
    </tr>  
  </thead> 
  <tbody>
    <tr>
      <td>Transportation Service</td>
       <td>Set it up Transportation Service Provider and Loyalty Program Provider</td>
      <td>Customer (Transportation Service Consumer)</td>
    </tr>    
    <tr>
      <td>Hotel Service</td>
       <td>Hotel Service Provider and Loyalty Program Provider</td>
      <td>Customer (Hotel Service Consumer)</td>
    </tr>    
    <tr>
      <td>Flight Booking Service</td>
       <td>Step it up Flight Booking Service Provider</td>
      <td>Customer (Flight Booking Service Consumer)</td>
    </tr>    
    <tr>
      <td>Travel Budget Planning</td>
       <td>Travel Budget Planning Service Provider</td>
      <td>Customer (Travel Budget Planning Subscriber)</td>
    </tr>
      </tbody> 
 </table>
