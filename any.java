public boolean dropTable(Connection con, String tableName) {
        try {
            Statement stmt = null;
            stmt = con.createStatement();
            stmt.executeUpdate("DROP TABLE TRAINING_LOGGEDIN_USERS ");
            System.out.println("TRAINING_LOGGEDIN_USERSE TABLE");
            return true;
        } catch (Exception e) {
            System.out.println("Failed in dropTable and exception is : " + e);
            return false;
        }
    }
}
