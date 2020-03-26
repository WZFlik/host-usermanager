这是我清
所有的不同
所有的不同
所有的不同
所有的不同
所有的不同
所有的不同
所有的不同
所有的不同
所有的不同

加了这一行
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
删掉这一行
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

