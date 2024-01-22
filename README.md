# hotel-repository
- Hotel repository is for hotel microservice. It will take care about the CRUD opertions w.r.t hotel and room.
- hrs-schema.sql file is uploaded to create schema and little informationa about the tables.
- http://localhost:8081/swagger-ui.html will help you to guide the APIs and basic documentation about the API.

- In this microservice you have to create Hotel first swagger will guide you the basic information that is required to create Hotel.
      - Note: Room is optional here.
- You can create Room in another API and in this API you are mandate to give Hotel Id. A room must be associate with some hotel.
- You can get the hotel information by giving id , and you will get all the room also with the response. You will get all room either booked or not.
- You can update the room information
- You can update the room status from Booked to Cancelled or vice versa.
- You can get the information of specific room. 
