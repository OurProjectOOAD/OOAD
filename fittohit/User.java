package javafxapplication1.db;

import java.math.BigInteger;

/**
 *
 * @author Marina
 */
public class User {

    private Integer id;
    private String name;
    private String password;
    private String email;
    private Integer age;
    private float height;
  
    private float current_weight;
    private float target_weight;
    private String gender;
    private float calories;
    private float remaining_cal;
    private String workout1;
    private String workout2;
    private String workout3;
    private String workout4;
    private String workout5;

    public float getCurrent_weight() {
        return current_weight;
    }

    public float getTarget_weight() {
        return target_weight;
    }

    public String getGender() {
        return gender;
    }

    public float getCalories() {
        return calories;
    }

    public float getRemaining_cal() {
        return remaining_cal;
    }

    public String getWorkout1() {
        return workout1;
    }

    public String getWorkout2() {
        return workout2;
    }

    public String getWorkout3() {
        return workout3;
    }

    public String getWorkout4() {
        return workout4;
    }

    public String getWorkout5() {
        return workout5;
    }

    public void setCurrent_weight(float current_weight) {
        this.current_weight = current_weight;
    }

    public void setTarget_weight(float target_weight) {
        this.target_weight = target_weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public void setRemaining_cal(float remaining_cal) {
        this.remaining_cal = remaining_cal;
    }

    public void setWorkout1(String workout1) {
        this.workout1 = workout1;
    }

    public void setWorkout2(String workout2) {
        this.workout2 = workout2;
    }

    public void setWorkout3(String workout3) {
        this.workout3 = workout3;
    }

    public void setWorkout4(String workout4) {
        this.workout4 = workout4;
    }

    public void setWorkout5(String workout5) {
        this.workout5 = workout5;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

   
}
