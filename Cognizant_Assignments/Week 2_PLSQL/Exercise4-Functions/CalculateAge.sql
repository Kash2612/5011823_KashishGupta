CREATE OR REPLACE FUNCTION CalculateAge(
    p_date_of_birth DATE
) RETURN NUMBER IS
    v_age NUMBER;
BEGIN
    -- Calculate age in years
    SELECT FLOOR(MONTHS_BETWEEN(SYSDATE, p_date_of_birth) / 12) INTO v_age FROM dual;
    RETURN v_age;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error calculating age: ' || SQLERRM);
        RETURN NULL;
END CalculateAge;
/
