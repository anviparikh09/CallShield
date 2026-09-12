# CallShield - Project Statement

## Problem Statement

Scam and suspicious calls are becoming common, and users may not always recognize the risk associated with them. CallShield provides a simple Java-based system to analyze call details and identify potentially suspicious calls using predefined risk factors.

## Scope of the Project

The project focuses on analyzing call information, calculating a risk score, classifying the call into a risk level, and storing the generated report in a MySQL database using JDBC.

The current system is designed as a basic risk assessment and reporting system and does not automatically block phone calls.

## Target Users

- College students
- General smartphone users
- Users who receive suspicious or unwanted calls
- Users who want to maintain records of suspicious calls

## High-Level Features

- Accepts call details such as phone number and category
- Checks suspicious factors such as personal information requests, repeated calls, and suspicious offers
- Calculates a risk score
- Classifies calls as Low Risk, Suspicious, or High Risk
- Generates a call risk report
- Stores reports in a MySQL database using JDBC
- Allows stored reports to be viewed from the database
