# 1.1 Audacity
- ***purpose***: เป็นโปรแกรมที่ใช้ในการอัดเสียง, ตัดต่อเสียง, mixเสียง, import/export, แปลงไฟล์ไปมา         

- ***architectural styles***: Audacity ใช้รูปแบบของ **""Plug in""** เป็น architecture โดยมี ***Blockfiles*** เป็น Core System

 ![pic!](https://github.com/kritsanaphat/Software-Architecture/blob/main/audacityARCHITEC.png "layer")

- ***quality attribute scenarious***: 
    ```sh 
    **Modifiability** : เนื่องจากมี architecture แบบ Plug_in และ audacity มีกาแบ่งmoduleเป็นย่อยๆ จึงทำให้การเพิ่ม feature ใหม่นั้นเป็นเรื่องที่สะดวก และรวดเร็ว
    ```

    - Source: developer 
    - Stimulus: ต้องการเพิ่ม feature ใหม่  
    - Artifacts: code
    - Environment: เวลา        
    - Response: change is made
    - Response Measure: ใช้เวลาน้อย ไม่พบปัญหาในการ test
    


    ```sh 
    **Testability** : เนื่องจากมี Scripted Test ในการเช็คไฟล์ทีละส่วน
    ```
    - Source: Developper
    - Stimulus: Complete a code unit
    - Artifacts: code unit
    - Environment: Development      
    - Response: Perform a test sequence
    - Response Measure: effort to perform tests
    



- https://th.wikipedia.org/wiki/%E0%B8%AD%E0%B8%AD%E0%B9%81%E0%B8%94%E0%B8%8B%E0%B8%B4%E0%B8%95%E0%B8%B5
- https://wiki.audacityteam.org/wiki/ArchitecturalDesign

