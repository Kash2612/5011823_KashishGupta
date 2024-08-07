CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(p_EmployeeID IN NUMBER, p_EmployeeName IN VARCHAR2, p_Salary IN NUMBER);
    PROCEDURE UpdateEmployee(p_EmployeeID IN NUMBER, p_NewName IN VARCHAR2, p_NewSalary IN NUMBER);
    FUNCTION CalculateAnnualSalary(p_EmployeeID IN NUMBER) RETURN NUMBER;
END EmployeeManagement;
/
