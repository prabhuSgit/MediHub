/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.MedicalSchoolLabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prabh
 */
public class MedicalLabOrganization extends Organization{
    public MedicalLabOrganization() {
        super(Organization.Type.MedicalLab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalSchoolLabRole());
        return roles;
    }
}
