package com.example.imapplication;

public class User {

//    \\\"id\\\": 2558050,\\n\" +\n" +
//     \\\"slug\\\": \\\"d99a7dfae9e4\\\",\\n\" +\n" +
//      \\\"nickname\\\": \\\"阿栈\\\",\\n\" +\n" +
//      \\\"avatar_source\\\": \\\"http://upload.jianshu.io/users/upload_avatars/2558050/7761b285-2805-4534-9870-ba7dcc7538ec.jpg\\\",\\n\" +\n" +
//      \\\"total_likes_count\\\": 1559,\\n\" +\n" +
//      \\\"total_wordage\\\": 472764,\\n\" +\n" +
//      \\\"is_following_user\\\": false\\n\" +\n" +
    private Integer id;
    private String slug;
    private String nickname;
    private String avatar_source;
    private String total_likes_count;
    private String total_wordage;
    private String is_following_user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar_source() {
        return avatar_source;
    }

    public void setAvatar_source(String avatar_source) {
        this.avatar_source = avatar_source;
    }

    public String getTotal_likes_count() {
        return total_likes_count;
    }

    public void setTotal_likes_count(String total_likes_count) {
        this.total_likes_count = total_likes_count;
    }

    public String getTotal_wordage() {
        return total_wordage;
    }

    public void setTotal_wordage(String total_wordage) {
        this.total_wordage = total_wordage;
    }

    public String getIs_following_user() {
        return is_following_user;
    }

    public void setIs_following_user(String is_following_user) {
        this.is_following_user = is_following_user;
    }




}
