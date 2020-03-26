//没有了import和package
//remote*****1
public class User {
   
    
   
    //删除toString
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //本地加1
    remote加二

    // 用户名
    private String userName;
     @GeneratedValue(strate= GenerationType.IDENTITY)
    private Long id;

    // 密码
    private String password;
    //删除了String

    // 姓名
    private String name;
    @Override
    public String toString() {
        return "User [id=" + id ====s+ ", userName=" + userName + ", password=" + password + ", name=" + name
                + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday + ", created=" + created
                + ", updated=" + updated + "]";
    }
  
    //加三

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private Date birthday;

    // 创建时间
    private Date created;

    // 更新时间
    private Date updated;
    //本地加二

    public Long getId() {
        return id;

    //本地1
    //本地2
    //本地3
    //本地4
    //本地15

}
