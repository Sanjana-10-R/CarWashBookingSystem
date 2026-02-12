**Car Wash Booking System:**
The Car Wash Booking System is a Java-based application developed to manage and streamline the process of scheduling car wash appointments. The system allows customers to register, browse available washing packages, select service centers, book preferred time slots, calculate service charges, cancel reservations, and view their booking history. It simulates a real-world appointment booking workflow with proper validation and structured design.

System Requirements:  A real-world car wash booking system must validate user identity, prevent double-booking of time slots, ensure service centers operate within defined schedules, and maintain proper allocation of resources such as slots and packages. The system must also generate unique booking IDs, support cancellation workflows, and maintain booking logs for customer reference.

System Design: The application is organized into multiple packages following a layered architecture approach. The com.wipro.cws.entity package contains entity classes representing users, service centers, packages, and bookings. The com.wipro.cws.util package includes custom exception classes for handling invalid operations. The com.wipro.cws.service package implements the business logic for validating users, checking slot availability, booking services, calculating charges, and handling cancellations. The com.wipro.cws.main package contains the Main class that demonstrates booking and cancellation operations.

Booking Workflow: The booking process begins with user validation, followed by center and package verification. The system then checks whether the selected time slot is available. If all validations pass, the system calculates the fare, generates a unique booking ID, and stores the reservation. In case of cancellation, the system verifies the booking ID and removes the record while freeing the reserved time slot.

Architecture Overview: The project follows a layered architecture consisting of an Entity Layer for data representation, a Service Layer for business logic implementation, a Utility Layer for exception handling, and a Main Layer for application execution. This structured design enhances code readability, scalability, and maintainability.

Technologies Used: The application is developed using Java with Object-Oriented Programming principles. It utilizes ArrayList collections for dynamic data handling and implements custom exception handling to ensure reliable system behavior.

<img width="885" height="293" alt="Screenshot 2026-02-12 102629" src="https://github.com/user-attachments/assets/cdd1c1ac-ae21-48b3-b70d-cca5047f56d1" />
