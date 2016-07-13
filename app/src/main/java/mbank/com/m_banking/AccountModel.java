package mbank.com.m_banking;

public class AccountModel {
    private int id;
    private String name;
    public AccountModel() {
        // TODO Auto-generated constructor stub
    }

    public AccountModel(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
