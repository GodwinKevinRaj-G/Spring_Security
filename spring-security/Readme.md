# Spring Security Implementation

This project is a basic implementation of Spring Security with user authentication and authorization. 
It is built using

- Spring Boot 3.4.2
- Spring Security
- JPA
- PostgreSQL
- MapStruct

## Project Structure

```
com.kevin.spring.security
│── config
│   └── SecurityConfig.java (Configures Spring Security)
│── controller
│   ├── HomePage.java (Handles basic endpoints)
│   ├── PersonDetailsController.java (Handles user details)
│   └── UserController.java (Manages user-related actions)
│── dto
│   └── UserDataRequest.java (DTO for user data requests)
│── model
│   ├── PersonDetails.java (Stores personal details)
│   ├── UserData.java (Stores user credentials)
│   └── UserPrincipal.java (Implements UserDetails for security)
│── repository
│   └── UserRepo.java (JPA repository for UserData)
│── service
│   ├── MyUserDetailService.java (Implements UserDetailsService for authentication)
│   ├── UserService.java (Interface for user management services)
│   └── UserServiceImpl.java (Implementation of user services)
│── utility
│   └── UserDataMapper.java (MapStruct-based mapper for DTO to Entity conversion)
│── SpringSecurityApplication.java (Main Spring Boot application)
```

## Features Implemented

- **Spring Security Configuration:**
  - Configured using `SecurityConfig.java`.
  - Uses `BCryptPasswordEncoder` for password encryption.
  - Implements `UserDetailsService` for authentication.
  - Stateless session management.
  - Disables CSRF protection (for simplicity in development).
  
- **User Authentication:**
  - `MyUserDetailService.java` loads users by username from the database.
  - `UserPrincipal.java` implements `UserDetails` for authentication.
  
- **User Registration:**
  - `UserServiceImpl.java` handles user registration.
  - Uses `MapStruct` (`UserDataMapper.java`) to convert DTO to Entity.
  - Encodes passwords before saving to the database.
  
- **Database Integration:**
  - Uses PostgreSQL as the database.
  - `UserRepo.java` extends `JpaRepository` for CRUD operations.
  
## Dependencies Used

The project uses the following dependencies:

- `spring-boot-starter-security` (Spring Security)
- `spring-boot-starter-web` (Web functionality)
- `spring-boot-starter-data-jpa` (JPA for database access)
- `postgresql` (PostgreSQL database driver)
- `mapstruct` (For DTO conversion)
- `lombok` (To reduce boilerplate code)

## How to Run

1. **Clone the repository**
   ```sh
   git clone <repository-url>
   cd spring-security
   ```

2. **Configure the database**
   - Set up PostgreSQL.
   - Update `application.properties` with database credentials.

3. **Build and Run**
   ```sh
   mvn spring-boot:run
   ```

4. **Access Endpoints**
   - By default, authentication is required for all endpoints.
   - Use basic authentication with registered user credentials.

## Notes

This project is created for **study purposes** to understand the basics of Spring Security. Future improvements could include:
- Implementing JWT for token-based authentication.
- Adding role-based access control (RBAC).
- Enhancing exception handling.

---

**Author:** Kevin  
**Purpose:** Study and exploration of Spring Security concepts

