/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yuanchanglee
 */
public class Network {
    private List<Enterprise> enterpriseList;
    private String name;
    
    public Network() {
        enterpriseList = new ArrayList<>();
    }
    
    public void addEnterprise(Enterprise enterprise) {
        enterpriseList.add(enterprise);
    }
    
    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}