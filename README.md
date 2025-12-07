The List of API endpoints are as follows 

GET /discount ===> Fetches all discount coupon

POST /discount ===> Create a new discount coupon 
  it takes  the Discount POJO type schema in JSON Body
  
PUT /discount  ====>  Updates the discount coupon 
  it takes  the Discount POJO type schema in JSON Body
  
Also if you wish to update the customer type i.e ALL to SELECTED then you have have add a field for list of customer ids eligible for discount in the form of array along with the Discount field values in JSON
if the transition from SELECTED to ALL that array should be ignored

DELETE /discount ====> Deletes the discount coupon with title passed as request params

