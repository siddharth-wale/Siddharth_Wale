/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.HROrganization;
import Business.Organization.Organization;
import Business.Session.SessionLog;
import Business.UserAccount.UserAccount;
import UserInterfaceHRDepartment.HRDepartmentJPanel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class HRRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Business.Business business,SessionLog session) {
        return new HRDepartmentJPanel(userProcessContainer, account, (HROrganization)organization, enterprise,session);
    }
}
