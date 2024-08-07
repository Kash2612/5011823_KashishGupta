BEGIN
    FOR customer_rec IN (
        SELECT customer_id, current_interest_rate, age
        FROM customers
        WHERE age > 60
    ) LOOP
        -- Update loan interest rate with a 1% discount
        UPDATE loans
        SET interest_rate = interest_rate - 0.01
        WHERE customer_id = customer_rec.customer_id;

        -- Optional: Output the result
        DBMS_OUTPUT.PUT_LINE('Updated interest rate for customer ID ' || customer_rec.customer_id || ' to ' || 
                             (SELECT interest_rate FROM loans WHERE customer_id = customer_rec.customer_id));
    END LOOP;
END;
/
