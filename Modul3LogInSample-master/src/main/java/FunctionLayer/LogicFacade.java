package FunctionLayer;

import DBAccess.House;
import DBAccess.User;
import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {
    private final Calculator calculator = new Calculator();

    public void updateNumberOfBricks(House house) {
        calculator.updateNumberOfBricks(house);
    }
    
    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }

}
