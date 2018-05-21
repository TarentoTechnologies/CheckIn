# Facial Recognition Based Attendance System and Check In Application
The goal of this application is to leverage the affordances of smartphones and computer vision technology to provide organizations and social enterprises greater insight into when and how their staff actually starts and stops working.

# How it works
A user is given the option to simply check in through the app when they arrive at work. This is done through a combination of an email based sign-in system and real-time facial recognition during the check in process itself. The user is allowed to sign off in a similar manner when they finsh work.

The application also allows administrators the abilty to create and edit shifts, create and edit infromation about organizations, and even view export, and comment on all check ins for a given organization.

# Capabilities used by the app
1. Camera
2. GPS
3. Promote a good cause

# Services used by the app
1. Facial Recognition (through OpenCV)
2. Firebase (for authentication and persistent data storage)
3. Amazon S3 to store images (if connected to network, otherwise local)

# Project Progress

## Incoming

- [ ] User authentication with firebase
- [ ] JSON data formatting: persistent data storage with Firebase realtime database
- [ ] GPS API
- [ ] Camera API
  - Camera Preview
  - Capturing Photo
  - Storing Photo
- [ ] Datetime API
  - Capture timestamp
- [ ] Integration with OpenCV facial recognition module
- [ ] UI improvemnets
- [ ] Code quality improvemnet

## Planned
- [ ] Set up interaction flow for user registration
  - Name
  - Phone Number
  - Username
  - Password
  - ID type
  - ID number
- [ ] Admin screen for creating and editing organizations
- [ ] Admin screen for creating and editing shifts
- [ ] Admin screen for viewing, exporting, and commenting on all check ins

## Progress
- [x] Done for the day :)

## Done
- [x] Selection screen
  - Starting screen of the app
- [x] Login screen
- [x] Firebase gradle dependencies and installation
- [x] Create android activities for standard user check-in
- [x] Create interaction flow for unsuccessful photo verification
