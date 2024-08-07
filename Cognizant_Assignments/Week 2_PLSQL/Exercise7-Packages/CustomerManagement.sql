CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddCustomer(p_CustomerID IN NUMBER, p_CustomerName IN VARCHAR2, p_Balance IN NUMBER);
    PROCEDURE UpdateCustomer(p_CustomerID IN NUMBER, p_NewName IN VARCHAR2, p_NewBalance IN NUMBER);
    FUNCTION GetCustomerBalance(p_CustomerID IN NUMBER) RETURN NUMBER;
END CustomerManagement;
/
