/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)
                    && ua.getPassword().equals(password)
//                    && ua.getStatus().equals("Active")) {
                    ) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createEmployeeAccount(String username, String password, Employee employee, Role role) {

//        if (username.equals("sysadmin")) {
//            UserAccount userAccount = new UserAccount();
//            userAccount.setUsername(username);
//            userAccount.setPassword(password);
//            userAccount.setEmployee(employee);
//            userAccount.setRole(role);
//            userAccount.setStatus("Active");
//            userAccountList.add(userAccount);
//            return userAccount;
//        } else {
            UserAccount userAccount = new UserAccount();
            userAccount.setUsername(username);
            userAccount.setPassword(password);
            userAccount.setEmployee(employee);
            userAccount.setRole(role);
            userAccount.setStatus("Active");
            userAccountList.add(userAccount);
            return userAccount;
//        }

    }

    public UserAccount createCustomerAccount(String username, String password, Customer customer, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCustomer(customer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
