# 1.1 Audacity
- ***purpose***: เป็นโปรแกรมที่ใช้ในการอัดเสียง, ตัดต่อเสียง, mixเสียง, import/export, แปลงไฟล์ไปมา         

- ***architectural styles***: Audacity ใช้รูปแบบของ **""Plug in""** เป็น architecture โดยมี ***Blockfiles*** เป็น Core System

 ![pic!](https://github.com/kritsanaphat/Software-Architecture/blob/main/audacityARCHITEC.png "layer")

- ***quality attribute scenarious***: 
    ```sh 
    **Modifiability** :
    ```

    - Source: developer 
    - Stimulus: add new feature 
    - Artifacts: code
    - Environment: time      
    - Response: change is made
    - Response Measure: less time, no problem in testing
    


    ```sh 
    **Testability** 
    ```
    - Source: Developper
    - Stimulus: Complete a code unit
    - Artifacts: code unit
    - Environment: Development      
    - Response: Perform a test sequence
    - Response Measure: effort to perform tests
    

     ```sh 
    **Usability** 
    ```
    - Source: User
    - Stimulus: Use a system
    - Artifacts: System
    - Environment: Runtime      
    - Response: การแสดงผลถูกต้อง
    - Response Measure: ผู้ใช้พึงพอใจ

- https://th.wikipedia.org/wiki/%E0%B8%AD%E0%B8%AD%E0%B9%81%E0%B8%94%E0%B8%8B%E0%B8%B4%E0%B8%95%E0%B8%B5
- https://wiki.audacityteam.org/wiki/ArchitecturalDesign
- https://www.audacityteam.org/


# 1.2 Matplotlib
- ***purpose***: ไลบรารีที่นิยมใช้มากที่สุดในการพลอตกราฟสองมิติจาก array มีจุดเริ่มต้นมากจากการจำลองคำสั่งพวกกราฟฟิคของ MATLAB
สามารถแสดงผลข้อมูลได้อย่างรวดเร็วและสามารถบันทึกผลที่
ได้ออกมาเป็นรูปภาพได้หลายรูปแบบ 

- ***architectural styles***: ใช้รูปแบบของ **""Layers Style""** เป็น architecture 
ประกอบด้วย Scripting Layer -> Artist Layer -> Backend Layer
Scripting Layer(จะเป็นส่วนที่ผู้ใช้งานสามารถเขียนโปรแกรมเพื่อใช้งานกับ Matplotlib เพื่อสร้างกราฟ),
Artist Layer(ส่วนสร้าง figure และผู้ใช้งานสามารถเขียนโปรแกรมเพื่อใช้งานกับ Matplotlib ได้),
Backend Layer(เป็น layer ที่ใช้สำหรับการแสดงผลของ figure)

- ***quality attribute scenarious***: 
    ```sh 
    **Integrability** 
    ```

    - Source: user
    - Stimulus: Integrate beetween matplotlib and Python 
    - Artifacts: system
    - Environment: Integration        
    - Response: Components is the new configuration are success fully and correctly
    - Response Measure: Success in using the program

    ```sh 
    **Modifiability** 
    ```

    - Source: developer
    - Stimulus: add new feature 
    - Artifacts: code
    - Environment: time        
    - Response: Components change is made
    - Response Measure: less time, no problem in testing


     ```sh 
    **Performance** 
    ```

    - Source: user
    - Stimulus: Commands to create graphs
    - Artifacts: system
    - Environment: Deployment, Runtime       
    - Response: time for created graphs
    - Response Measure: Latency


- https://www2.cs.science.cmu.ac.th/courses/204101/lib/exe/fetch.php?media=w13-lab_-matplotlib.pdf
- https://medium.com/@codingpilot25/architecture-of-matplotlib-1a2d44370f5a
- https://www.aosabook.org/en/matplotlib.html
- https://medium.com/@codingpilot25/architecture-of-matplotlib-1a2d44370f5a

# 2 Joomla

- ***purpose***: คือ CMS, CMS(Content Management System) หมายถึง ระบบบริหารจัดการเนื้อหาของเว็บไซต์  นั่นหมายความว่า สิ่งที่เราจะต้องดูแลก็คือเนื้อหาของเว็บไซต์ เช่น การเพิ่มบทความ การเพิ่มรูปภาพ หรือการปรับแต่งโยกย้ายโมดูลต่าง ๆ  ไม่จำเป็นจะต้องมานั่งเขียน Code เพียงแต่เรียนรู้วิธีการติดตั้ง การใช้งาน และ การปรับแต่ง CMS เท่านั้นเอง ซึ่งทำให้ประหยัดเวลาในการสร้างเว็บไซต์ และออกแบบเว็บไซต์ ได้อย่างมาก

- ***architectural styles***: ใช้รูปแบบของ **""MVC""** เป็น architecture
    - **Database**  คือชุดของข้อมูลและสามารถจัดเก็บ จัดการ และจัดระเบียบในลักษณะเฉพาะได้  ใช้เพื่อเก็บข้อมูลการดูแลระบบเพื่อจัดการไซต์ Joomla 
    - **Joomla Framework**  คือชุดของซอฟต์แวร์โอเพ่นซอร์สที่สร้าง Joomla CMS ได้รับการพัฒนาให้มีความยืดหยุ่นมากขึ้นและแบ่งกรอบงานออกเป็นแพ็คเกจโมดูลาร์เดียว ซึ่งช่วยให้แต่ละแพ็คเกจพัฒนาได้ง่ายขึ้น
    - **Component** ประกอบด้วยสองส่วนคือ Administrator and Site เมื่อใดก็ตามที่มีการโหลดหน้า component จะถูกเรียกเพื่อแสดงเนื้อหาของหน้าหลัก  Administrator จะจัดการองค์ประกอบที่แตกต่างกันและ site  visitor ช่วยในการแสดงหน้าเมื่อมีการร้องขอโดยผู้เยี่ยมชมไซต์ ส่วนประกอบเป็นหน่วยหน้าที่หลักของ Joomla
    - **Module** โมดูลเป็นส่วนเสริมที่ใช้ในการแสดงหน้าใน Joomla นอกจากนี้ยังใช้เพื่อแสดงข้อมูลใหม่จาก component ในผู้ดูแลระบบ Joomla โมดูลจะได้รับการจัดการโดย module manager จะแสดงเนื้อหาและรูปภาพใหม่เมื่อโมดูลเชื่อมโยงกับ Joomla Component
    - **Plug in** เป็นส่วนขยายของ Joomla ซึ่งมีความยืดหยุ่นและมีประสิทธิภาพมากสำหรับการขยายเฟรมเวิร์ก
    - **Templates** จะกำหนดรูปลักษณ์ของเว็บไซต์ Joomla ซึ่งมี 2 ประเภทคือ Front-end และ Back-end โดยที่ Back-end ใช้เพื่อควบคุมฟังก์ชันโดยผู้ดูแลระบบ และ Front-end เป็นวิธีนำเสนอเว็บไซต์แก่ผู้ใช้ ซึ่ง template นั้นง่ายต่อการสร้างหรือปรับแต่งไซต์ และให้ความยืดหยุ่นสูงสุดในการจัดรูปแบบไซต์
    - **Web Browser** เป็นเซิร์ฟเวอร์ที่ผู้ใช้โต้ตอบ มันส่งหน้าเว็บให้กับลูกค้า HTTP ใช้ในการสื่อสารระหว่างไคลเอนต์และเซิร์ฟเวอร์
![pic!](https://github.com/kritsanaphat/Software-Architecture/blob/main/joomla%20architecture.jpg "layer")

- ***quality attribute scenarious***: 
    ```sh 
    **Integrability** 
    ```

    - Source: developer
    - Stimulus: extension deployment
    - Artifacts:  Joomla extension
    - Environment: version    
    - Response: new extension deployment
    - Response Number of extension

     ```sh 
    **security** 
    ```
    - Source: unknown user
    - Stimulus: try to access without authorization
    - Artifacts:  certain service
    - Environment: online 
    - Response: invalid access
    - Response: can't accessed

    ```sh 
    **Modifiability** 
    ```

    - Source: user
    - Stimulus: edit content
    - Artifacts: content to be edited
    - Environment: bulid time  
    - Response: modification made
    - Response Measure: fewer time


    


- https://www.mindphp.com/%E0%B8%84%E0%B8%B9%E0%B9%88%E0%B8%A1%E0%B8%B7%E0%B8%AD/73-%E0%B8%84%E0%B8%B7%E0%B8%AD%E0%B8%AD%E0%B8%B0%E0%B9%84%E0%B8%A3/2620-joomla-cms.html
- https://www.tutorialspoint.com/joomla/joomla_architecture.htm