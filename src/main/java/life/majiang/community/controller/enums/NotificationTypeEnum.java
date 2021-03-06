package life.majiang.community.controller.enums;

public enum NotificationTypeEnum {
    REPLY_QUESTION(1,"回复了问题"),
    REPLY_COMMENT(2,"回复了评论");
    private int type;
    private String name;

    public int getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    NotificationTypeEnum(int status, String name) {
        this.type = status;
        this.name = name;
    }
    public static String nameofType(int type){
        for (NotificationTypeEnum notificationEnum : NotificationTypeEnum.values()) {
            if(notificationEnum.getType() == type){
                return notificationEnum.getName();
            }
        }
        return "";
    }
}
