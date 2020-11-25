import org.springframework.jdbc.core.JdbcTemplate;

import pckg.Teacher;
import pckg.User;
import pckg.UserMapping;

import java.util.*;

import static pckg.BDconfig.getJdbcTemplate;

public class Storage {

    private static JdbcTemplate jdbcTemplate = getJdbcTemplate();
    private static List<Teacher> students = new ArrayList<Teacher>();






    public static boolean cheackUser(User user){
        System.out.println("cheackUser1111111111111");
        String sql = "SELECT * "
                + "FROM \"usrLaba4\" "
                + "WHERE login = '"+user.getLogin() + "' AND password = '" + user.getPassword() + "'";
        System.out.println("@@@@@@@@@" + jdbcTemplate.query(sql, new UserMapping()));

         if(jdbcTemplate.queryForObject(sql, new UserMapping()) == null)
             return false;
         return true;
    }











}