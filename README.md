# ScrumHub - API
An agile SCRUM board software system. 

## Team Members
- Daniel Robinson : Team Leader
- Francisco Palomino
- Jeff Camacho
- Jordan Delong
- Shane Avery Sistoza

## Required Technologies (API)
- Java 8
- RDS (Oracle DB)
- EC2: Host Application (Production)
- EC2: User Acceptance Testing (Development)
- EC2: Jenkins 

## DevOps Pipeline Glance

1. Developer push their well-tested code to GitHub (Should be a feature type branch).
2. The Developer must submit a pull-request to merge with the Dev Branch.
3. The Git keeper will check the merge files.

	- [ ] No Sysouts
	- [ ] Correct Naming Conventions
		- [ ] Class Names are Pascal Case.
		- [ ] States and Methods are Camel Case.
		- [ ] Package Names are Lower Case.
	- [ ] Passes jUnit Testing
	- [ ] Does not interfere with other methods already in place.

4. If Approved, the git keeper will merge the branch into the dev branch and close it.
5. Jenkins pulls the dev branch and tries to build and deploy to an EC2.
6. Jenkins notifies us if it was a success or not.
7. If not, check what went wrong. Resolve and repeat to step 5.
8. Project is Deployed, and Developers/Users can test the application.

## Technologies/Frameworks Using
- [ ] Spring Boot
	- [ ] Spring Core
	- [ ] Spring MVC
	- [ ] Spring ORM/DATA
		- [ ] Hibernate
