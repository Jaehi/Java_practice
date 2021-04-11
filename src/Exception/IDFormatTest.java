package Exception;

public class IDFormatTest {
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) throws IDFormatException {
        if (ID == null){
            throw new IDFormatException("아이디는 NULL일 수 없습니다");
        }else if (ID.length() < 8 || ID.length() > 20){
            throw new IDFormatException("아이디는 8자이상 20자 이하입니다");
        }
        this.ID = ID;
    }


    public static void main(String[] args) {
        IDFormatTest idTest = new IDFormatTest();
        String userID = null;

        try {
            idTest.setID(userID);
        }catch (IDFormatException e){
            System.out.println(e);
        }
        userID = "1312";
        try {
            idTest.setID(userID);
        }catch (IDFormatException e){
            System.out.println(e);
        }
    }
}
