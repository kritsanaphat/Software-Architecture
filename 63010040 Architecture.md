# 1.1 Audacity
- ***purpose***: เป็นโปรแกรมที่ใช้ในการอัดเสียง, ตัดต่อเสียง, mixเสียง, import/export, แปลงไฟล์ไปมา         

- ***architectural styles***: Audacity ใช้รูปแบบของ **""Plug in""** เป็น architecture โดยมี ***Blockfiles*** เป็น Core System

 ![pic!](https://github.com/kritsanaphat/Software-Architecture/blob/main/audacityARCHITEC.png "layer")

- ***quality attribute scenarious***: 
    ```sh 
    **Modifiability** :
    ```

    - Source: developer 
    - Stimulus: ต้องการเพิ่ม feature ใหม่  
    - Artifacts: code
    - Environment: เวลา        
    - Response: change is made
    - Response Measure: ใช้เวลาน้อย ไม่พบปัญหาในการ test
    


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
    **Usability** : 
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

- ***architectural styles***: Audacity ใช้รูปแบบของ **""Layers Style""** เป็น architecture 
ประกอบด้วย Scripting Layer -> Artist Layer -> Backend Layer

- https://www2.cs.science.cmu.ac.th/courses/204101/lib/exe/fetch.php?media=w13-lab_-matplotlib.pdf
- https://medium.com/@codingpilot25/architecture-of-matplotlib-1a2d44370f5a
- https://www.aosabook.org/en/matplotlib.html


