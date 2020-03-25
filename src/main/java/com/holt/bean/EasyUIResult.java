Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@WZFlik 
WZFlik
/
host-usermanager
1
00
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights Settings
host-usermanager
/
src
/
main
/
java
/
com
/
holt
/
bean
/
EasyUIResult.java
 

1
package com.holt.bean;
2
​
3
import java.util.List;
4
​
5
/**
6
 * 封装了User的集合 和user总数
7
 * @author hot
8
 *
9
 */
10
public class EasyUIResult {
11
        
12
        //总条数
13
        private Long total;
14
        
15
        //数据列表
16
        private List<?> rows;
17
        
18
        public EasyUIResult() {
19
                super();
20
        }
21
​
22
        public EasyUIResult(Long total, List<?> rows) {
23
                super();
24
                this.total = total;
25
                this.rows = rows;
26
        }
27
​
28
​
29
        public Long getTotal() {
30
                return total;
31
        }
32
​
33
        public void setTotal(Long total) {
34
                this.total = total;
35
        }
36
​
37
        public List<?> getRows() {
38
                return rows;
39
        }
40
​
41
        public void setRows(List<?> rows) {
42
                this.rows = rows;
43
        }
44
​
45
}
46
​
@WZFlik
Commit changes
Commit summary
Update EasyUIResult.java
Optional extended description
Add an optional extended description…
 Commit directly to the master branch.
 Create a new branch for this commit and start a pull request. Learn more about pull requests.
 
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
