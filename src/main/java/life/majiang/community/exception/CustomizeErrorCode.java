package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND("你找的问题不在了，要不换个试试？",2001),
    TARGET_PARAM_NOT_FOUND("未选中任何问题或评论进行回复",2002),
    NO_LOGIN("当前操作需要登录，请先登录！",2003),
    SYS_ERROR("服务器冒烟了，要不你等会再来？",2004),
    TYPE_PARAM_WRONG("评论类型错误或不存在！",2005),
    COMMENT_NOT_FOUND("回复的评论不存在了，要不换个试试？",2006),
    COMMENT_IS_EMPTY("输入的内容不能为空~",2007),
    READ_NOTIFICATION_FAIL("兄弟你这是读别人的信息呢？",2008),
    NOTIFICATION_NOT_FOUND("消息莫非是不翼而飞了？",2009),
    FILE_UPLOAD_FAIL("图片上传失败！",2010)
    ;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;
   CustomizeErrorCode(String message, Integer code) {
       this.message = message;
       this.code = code;
    }


}
