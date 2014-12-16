package com.javafortesters.domainentities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdminUserTest {

    @Test
    public void anAdminUserDefaultConstructor() {
        AdminUser adminUser = new AdminUser();

        assertEquals("adminuser", adminUser.getUsername());
        assertEquals("password", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void anAdminUserHasElevatedPermissions() {
        AdminUser adminUser = new AdminUser("admin", "Passw0rd");

        assertEquals("admin", adminUser.getUsername());
        assertEquals("Passw0rd", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }


}
