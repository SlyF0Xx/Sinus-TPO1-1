import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinusTest {
/*
    @Test
    public void expect_exception_on_negative_sign_power()
    {
        Sinus sinus = new Sinus();
        Assertions.assertThrows(Sinus.NegativePowException.class, ()->{ sinus.sign_pow(-1); });
    }

    @Test
    public void expect_negative_on_first_sign_pow()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-1, sinus.sign_pow(1));
    }

    @Test
    public void expect_negative_on_odd_sign_pow()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-1, sinus.sign_pow(15));
    }

    @Test
    public void expect_positive_on_second_sign_pow()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.sign_pow(2));
    }

    @Test
    public void expect_positive_on_even_sign_pow()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.sign_pow(18));
    }
*/


    @Test
    public void expect_exception_on_negative_power()
    {
        Sinus sinus = new Sinus();
        Assertions.assertThrows(Sinus.NegativePowException.class, ()->{ sinus.pow(5, -1); });
    }

    @Test
    public void expect_one_on_null_power()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.pow(1, 0));
    }

    @Test
    public void expect_one_on_null_power_of_any()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.pow(17, 0));
    }

    @Test
    public void expect_one_on_one_powered_one()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.pow(1, 1));
    }

    @Test
    public void expect_minus_one_on_minus_one_powered_one()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-1, sinus.pow(-1, 1));
    }

    @Test
    public void expect_one_on_one_powered_smth()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.pow(1, 17));
    }

    @Test
    public void expect_value_on_value_powered_one()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(5, sinus.pow(5, 1));
    }

    @Test
    public void expect_four_on_second_powered_twice()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(4, sinus.pow(2, 2));
    }

    @Test
    public void expect_sixty_four_on_four_powered_thirds()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(64, sinus.pow(4, 3));
    }

    @Test
    public void expect_minus_sixty_four_on_minus_four_powered_thirds()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-64, sinus.pow(-4, 3));
    }

    @Test
    public void expect_correct_value_on_non_integer_foundation_power()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(2.25, sinus.pow(1.5, 2));
    }



    @Test
    public void expect_exception_on_factorial_of_negative()
    {
        Sinus sinus = new Sinus();
        Assertions.assertThrows(Sinus.NegativePowException.class, ()->{ sinus.factorial( -1); });
    }

    @Test
    public void expect_one_on_factorial_of_null()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.factorial(0));
    }

    @Test
    public void expect_one_on_factorial_of_one()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.factorial(1));
    }


    @Test
    public void expect_six_on_factorial_of_three()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(6, sinus.factorial(3));
    }

    @Test
    public void expect_twenty_four_on_factorial_of_four()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(24, sinus.factorial(4));
    }



    @Test
    public void expect_one_divided_by_six_on_first_element_of_one()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-1 / 6.0, sinus.element(1, 1));
    }

    @Test
    public void expect_one_on_first_element_of_six()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-36, sinus.element(6, 1));
    }





    @Test
    public void expect_null_sin_of_null()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0, sinus.sin(0), 0.001);
    }

    @Test
    public void expect_null_sin_of_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0, sinus.sin(Sinus.PI * 6), 0.001);
    }

    @Test
    public void expect_null_sin_of_minus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0, sinus.sin(-Sinus.PI * 6), 0.001);
    }




    @Test
    public void expect_null_sin_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0, sinus.sin(Sinus.PI), 0.001);
    }

    @Test
    public void expect_null_sin_of_pi_plus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0, sinus.sin(Sinus.PI + Sinus.PI * 6), 0.001);
    }

    @Test
    public void expect_null_sin_of_pi_minus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0, sinus.sin(Sinus.PI - Sinus.PI * 6), 0.001);
    }




    @Test
    public void expect_one_sin_of_half_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.sin(Sinus.PI / 2), 0.001);
    }

    @Test
    public void expect_one_sin_of_half_plus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.sin(Sinus.PI / 2 + Sinus.PI * 6), 0.001);
    }

    @Test
    public void expect_one_sin_of_half_minus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(1, sinus.sin(Sinus.PI / 2 - Sinus.PI * 6), 0.001);
    }




    @Test
    public void expect_one_sin_of_minus_half_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-1, sinus.sin(-Sinus.PI / 2), 0.001);
    }

    @Test
    public void expect_one_sin_of_minus_half_plus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-1, sinus.sin(-Sinus.PI / 2 + Sinus.PI * 6), 0.001);
    }

    @Test
    public void expect_one_sin_of_minus_half_minus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-1, sinus.sin(-Sinus.PI / 2 - Sinus.PI * 6), 0.001);
    }




    @Test
    public void expect_sqrt_of_three_divide_by_two_sin_of_one_divide_by_three_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.86602540378443864676372317075294, sinus.sin(Sinus.PI / 3), 0.001);
    }

    @Test
    public void expect_sqrt_of_three_divide_by_two_sin_of_one_divide_by_three_plus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.86602540378443864676372317075294, sinus.sin(Sinus.PI / 3 + Sinus.PI * 6), 0.001);
    }

    @Test
    public void expect_sqrt_of_three_divide_by_two_sin_of_one_divide_by_three_minus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.86602540378443864676372317075294, sinus.sin(Sinus.PI / 3 - Sinus.PI * 6), 0.001);
    }



    @Test
    public void expect_minus_sqrt_of_three_divide_by_two_sin_of_minus_one_divide_by_three_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.86602540378443864676372317075294, sinus.sin(-Sinus.PI / 3), 0.001);
    }

    @Test
    public void expect_minus_sqrt_of_three_divide_by_two_sin_of_minus_one_divide_by_three_plus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.86602540378443864676372317075294, sinus.sin(-Sinus.PI / 3 + Sinus.PI * 6), 0.001);
    }

    @Test
    public void expect_minus_sqrt_of_three_divide_by_two_sin_of_minus_one_divide_by_three_minus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.86602540378443864676372317075294, sinus.sin(-Sinus.PI / 3 - Sinus.PI * 6), 0.001);
    }



    @Test
    public void expect_half_sin_of_on_divide_by_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.5, sinus.sin(Sinus.PI / 6), 0.001);
    }

    @Test
    public void expect_half_sin_of_on_divide_by_six_plus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.5, sinus.sin(Sinus.PI / 6 + Sinus.PI * 6), 0.001);
    }


    @Test
    public void expect_half_sin_of_on_divide_by_six_minus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.5, sinus.sin(Sinus.PI / 6 - Sinus.PI * 6), 0.001);
    }




    @Test
    public void expect_sqrt_of_three_divide_by_two_sin_of_pi_minus_one_divide_by_three_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.86602540378443864676372317075294, sinus.sin(Sinus.PI - Sinus.PI / 3), 0.001);
    }

    @Test
    public void expect_sqrt_of_three_divide_by_two_sin_of_pi_minus_one_divide_by_three_of_pi_plus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.86602540378443864676372317075294, sinus.sin(Sinus.PI - Sinus.PI / 3 + Sinus.PI *2), 0.001);
    }

    @Test
    public void expect_sqrt_of_three_divide_by_two_sin_of_pi_minus_one_divide_by_three_of_pi_minus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.86602540378443864676372317075294, sinus.sin(Sinus.PI - Sinus.PI / 3 - Sinus.PI *2), 0.001);
    }




    @Test
    public void expect_minus_sqrt_of_three_divide_by_two_sin_of_minus_pi_plus_one_divide_by_three_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.86602540378443864676372317075294, sinus.sin(-Sinus.PI + Sinus.PI / 3), 0.001);
    }

    @Test
    public void expect_minus_sqrt_of_three_divide_by_two_sin_of_minus_pi_plus_one_divide_by_three_of_pi_plus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.86602540378443864676372317075294, sinus.sin(-Sinus.PI + Sinus.PI / 3 + Sinus.PI *2), 0.001);
    }

    @Test
    public void expect_minus_sqrt_of_three_divide_by_two_sin_of_minus_pi_plus_one_divide_by_three_of_pi_minus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.86602540378443864676372317075294, sinus.sin(-Sinus.PI + Sinus.PI / 3 - Sinus.PI *2), 0.001);
    }



    @Test
    public void expect_minus_half_sin_of_minus_pi_divide_by_six()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.5, sinus.sin(-Sinus.PI / 6), 0.001);
    }

    @Test
    public void expect_minus_half_sin_of_minus_pi_divide_by_six_plus_six_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.5, sinus.sin(-Sinus.PI / 6 + Sinus.PI * 6), 0.001);
    }


    @Test
    public void expect_minus_half_sin_of_minus_pi_divide_by_six_minus_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.5, sinus.sin(-Sinus.PI / 6 - Sinus.PI * 6), 0.001);
    }


    @Test
    public void expect_half_sin_of_pi_minus_one_divide_by_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.5, sinus.sin(Sinus.PI - Sinus.PI / 6), 0.001);
    }

    @Test
    public void expect_half_sin_of_pi_minus_one_divide_by_six_plus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.5, sinus.sin(Sinus.PI - Sinus.PI / 6 + Sinus.PI * 6), 0.001);
    }


    @Test
    public void expect_half_sin_of_pi_minus_one_divide_by_six_minus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(0.5, sinus.sin(Sinus.PI - Sinus.PI / 6 - Sinus.PI * 6), 0.001);
    }



    @Test
    public void expect_minus_half_sin_of_minus_pi_plus_one_divide_by_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.5, sinus.sin(-Sinus.PI + Sinus.PI / 6), 0.001);
    }

    @Test
    public void expect_minus__half_sin_of_minus_pi_plus_one_divide_by_six_plus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.5, sinus.sin(-Sinus.PI + Sinus.PI / 6 + Sinus.PI * 6), 0.001);
    }


    @Test
    public void expect_minus_half_sin_of_minus_pi_plus_one_divide_by_six_minus_six_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.5, sinus.sin(-Sinus.PI + Sinus.PI / 6 - Sinus.PI * 6), 0.001);
    }
    /*
    @Test
    public void expect_minus_sqrt_of_three_divide_by_two_sin_of_one_divide_by_three_plus_half_of_pi()
    {
        Sinus sinus = new Sinus();
        Assertions.assertEquals(-0.86602540378443864676372317075294, sinus.sin(1.0471975511965977461542144610932 + 1.5707963267948966192313216916398), 0.001);
    }
*/

}
