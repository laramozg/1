package com.ifmo.programming.utility;

public abstract class PersonAbstract {
    private String name;
    private BusinessSuccess success;
    public PersonAbstract(String name, BusinessSuccess success){
        this.name = name;
        this.success = success;
    }
    public PersonAbstract(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getBusinessSuccess() {
        String title = success.title;
        return title;
    }
    public void betterBusinessSuccess(){
        if(success == BusinessSuccess.RICH){
            success = BusinessSuccess.TOP;
        }
        if(success == BusinessSuccess.SUCCESSFUL){
            success = BusinessSuccess.RICH;
        }
        if(success == BusinessSuccess.MIDDLE){
            success = BusinessSuccess.SUCCESSFUL;
        }
        if(success == BusinessSuccess.UNSUCCESSFUL){
            success = BusinessSuccess.MIDDLE;
        }
        System.out.println("Бизнесс " + getName()+ " стал более успешный");
    }

    public void worseBusinessSuccess(){
        if(success == BusinessSuccess.MIDDLE){
            success = BusinessSuccess.UNSUCCESSFUL;
        }
        if(success == BusinessSuccess.SUCCESSFUL){
            success = BusinessSuccess.MIDDLE;
        }
        if(success == BusinessSuccess.RICH){
            success = BusinessSuccess.SUCCESSFUL;
        }
        if(success == BusinessSuccess.TOP){
            success = BusinessSuccess.RICH;
        }
        System.out.println("Бизнесс " + getName()+ " стал менее успешный");
    }
    public abstract void talk(String people);
    public abstract void meet(PersonAbstract person1,PersonAbstract person2);
    public abstract void goTo(Locatoin locatoin);
    public abstract int haveMoney(int profit);

    @Override
    public String toString() {
        return "Имя: " + getName() + ". Бизнесс: " + getBusinessSuccess();
    }
    @Override
    public int hashCode(){
        int result = 0;
        result+= 31 * name.hashCode();
        result+= 32 * success.hashCode();
        return result;
    }

}
