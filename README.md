# 🧪 CP353201 Software Quality Assurance (SQA)

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-C82D2D?style=for-the-badge)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![KKU](https://img.shields.io/badge/CS-KKU-orange?style=for-the-badge)

<br/>

> **Repository สำหรับส่งงานและแบบฝึกหัด รายวิชาการประกันคุณภาพซอฟต์แวร์ (Software Quality Assurance)**  
> **ภาคการศึกษา:** 1/2569 | **วิทยาลัยการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น (College of Computing, KKU)**  
> **อาจารย์ผู้สอน:** ผศ.ดร.จิตสุภา ชุ่มเล็ก (Asst. Prof. Dr. Chitsutha Soomlek)

</div>

---

## 👤 ข้อมูลนักศึกษา (Student Information)

<div align="center">

| หัวข้อ | รายละเอียด |
| :--- | :--- |
| **ชื่อ-นามสกุล** | **นายแทนคุณ พันธ์นิกุล** (Tankun Phannikul) |
| **รหัสนักศึกษา** | **673380301-0** |
| **สาขาวิชา** | วิทยาการคอมพิวเตอร์ (Computer Science) |
| **สังกัด** | วิทยาลัยการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น |

</div>

---

## 📑 สรุปรายการแบบฝึกหัดและปฏิบัติการ (Lab Assignments Overview)

| ลำดับ | หัวข้อปฏิบัติการ (Topic) | เทคนิค / เครื่องมือที่ใช้ | ลิงก์โฟลเดอร์ |
| :---: | :--- | :--- | :---: |
| **Lab 3** | **Unit Testing with JUnit** | Unit Testing, JUnit 5 Jupiter, Assertions, ShiftCipher | [📂 Lab3_JUnitTest](LabAssignment/Lab3_JUnitTest) |
| **Lab 4** | **Boundary Value Testing (BVT)** | BVT (Standard & Robust Boundary Value Testing), HealthIndexScore | [📂 Lab4_BVT](LabAssignment/Lab4_BVT) |
| **Lab 5** | **Equivalence Class Testing (EC)** | Weak/Strong Normal & Robust Equivalence Class Testing (Competition, ShiftCipher) | [📂 Lab5_EC](LabAssignment/Lab5_EC) |
| **Lab 6** | **Decision Table Testing (DT)** | Decision Table, Rule Analysis, QuadraticEquation | [📂 Lab6_DT](LabAssignment/Lab6_DT) |
| **Lab 8** | **Integration Testing** | Top-Down (Stubs), Bottom-Up (Drivers), UniversalConverter | [📂 Lab8_IntegrationTesting](LabAssignment/Lab8_IntegrationTesting) |
| **Lab 9** | **Test Double (Mockito)** | Test Doubles (Dummy, Stub, Spy, Mock, Fake), Mockito Framework | [📂 Lab9_TestDouble](LabAssignment/Lab9_TestDouble) |

---

## 📂 โครงสร้างโปรเจกต์ (Repository Structure)

```text
📁 673380301-0-SQA/
├── 📁 LabAssignment/                            # รวมแบบฝึกหัดและการทดสอบที่ส่งในรายวิชา
│   ├── 📁 Lab3_JUnitTest/                       # Lab 3: Unit Testing ด้วย JUnit 5
│   │   └── 📁 src/                              # Source code & Test (ShiftCipher)
│   ├── 📁 Lab4_BVT/                             # Lab 4: Boundary Value Testing
│   │   ├── 📁 HealthIndexScore/                 # โปรเจกต์ทดสอบเกณฑ์ดัชนีสุขภาพ (Standard & Robust BVT)
│   │   └── 📁 Resourse/                         # เอกสารผลการทดสอบ
│   ├── 📁 Lab5_EC/                              # Lab 5: Equivalence Partitioning
│   │   ├── 📁 Competition/                      # การทดสอบการคำนวณคะแนนการแข่งขัน
│   │   ├── 📁 ShiftCipher/                      # การทดสอบการเข้ารหัส/ถอดรหัส ShiftCipher
│   │   └── 📁 Resourse/                         # เอกสารแบบบันทึกผลการทดสอบ
│   ├── 📁 Lab6_DT/                              # Lab 6: Decision Table Testing
│   │   ├── 📁 QuadraticEquation/                # การทดสอบการแก้สมการกำลังสองและวิเคราะห์รากสมการ
│   │   └── 📁 Resourse/                         # ตาราง Decision Table และเอกสารผลทดสอบ
│   ├── 📁 Lab8_IntegrationTesting/              # Lab 8: Integration Testing
│   │   ├── 📁 LabDemo/UniversalConverter/       # โมดูล UniversalConverter (Distance, Weight, Temperature)
│   │   │   └── 📁 src/sqa/test/                 # ชุดทดสอบ Top-Down, Bottom-Up, Stubs, Drivers
│   │   ├── 📁 Resourse/                         # Test Case Specification & Defect Report (.docx, .pdf)
│   │   └── 📄 README.md                         # รายละเอียดการทดสอบและบั๊กที่ตรวจพบใน Lab 8
│   └── 📁 Lab9_TestDouble/                      # Lab 9: Test Double & Mockito
│       └── 📁 testdouble-mockito-lab/           # โปรเจกต์ Maven สำหรับ Test Double ด้วย Mockito & JUnit 5
│           └── 📁 src/main/java/sqa/lab/service/# SeatReservation, GateCheckin, SeatDAO, TicketCounter
├── 📁 LabDemo/                                  # โค้ดตัวอย่างประกอบการเรียนการสอน
│   └── 📁 Lab3_JUnit/junit6-labdemo/            # ตัวอย่างการเริ่มต้นใช้งาน JUnit Jupiter
├── 📁 Resourse/                                 # ไฟล์เอกสารและทรัพยากรส่วนกลาง
│   ├── 📄 Git command line.pdf                  # คู่มือคำสั่ง Git
│   └── 📄 Testcase_template (2).xlsx            # เทมเพลตสำหรับเขียน Test Case
└── 📄 README.md                                 # หน้าหลักสรุปภาพรวมของ Repository
```

---

## 🔍 รายละเอียดของแต่ละปฏิบัติการ (Lab Details)

### 🔹 [Lab 3: Unit Testing with JUnit 5](LabAssignment/Lab3_JUnitTest)
- **วัตถุประสงค์:** ทำความเข้าใจพื้นฐานการทำ Unit Testing และการใช้ JUnit Framework
- **เนื้อหา:** การทดสอบฟังก์ชันการเข้ารหัสและถอดรหัสของคลาส `ShiftCipher` เพื่อตรวจสอบความถูกต้องของ Logic ในระดับ Unit

### 🔹 [Lab 4: Boundary Value Testing (BVT)](LabAssignment/Lab4_BVT)
- **วัตถุประสงค์:** ออกแบบกรณีทดสอบเชิงฟังก์ชันโดยใช้เทคนิคค่าขอบเขต (Boundary Value Analysis)
- **เนื้อหา:** ทดสอบระบบ `HealthIndexScore` ทั้งแบบ **Standard BVT** (Min, Min+, Nom, Max-, Max) และ **Robust BVT** (Min-, Max+) เพื่อดักจับข้อผิดพลาดบริเวณรอยต่อของช่วงข้อมูล

### 🔹 [Lab 5: Equivalence Class Testing (EC)](LabAssignment/Lab5_EC)
- **วัตถุประสงค์:** ออกแบบกรณีทดสอบด้วยการแบ่งคลาสสมมูล (Equivalence Partitioning)
- **เนื้อหา:** 
  - ระบบคำนวณคะแนนการแข่งขัน (`CompetitionScore`)
  - การทดสอบการเข้ารหัส/ถอดรหัส (`ShiftCipher`) ครอบคลุมทั้ง Valid Equivalence Classes และ Invalid Equivalence Classes

### 🔹 [Lab 6: Decision Table Testing (DT)](LabAssignment/Lab6_DT)
- **วัตถุประสงค์:** วิเคราะห์เงื่อนไขที่ซับซ้อนและการกระทำที่เกี่ยวข้องกันด้วยตารางการตัดสินใจ (Decision Table)
- **เนื้อหา:** การทดสอบโปรแกรมคำนวณรากสมการกำลังสอง (`QuadraticEquation`) จำแนกเงื่อนไขตามค่า Discriminant ($b^2 - 4ac$) และสัมประสิทธิ์ $a, b, c$

### 🔹 [Lab 8: Integration Testing](LabAssignment/Lab8_IntegrationTesting)
- **วัตถุประสงค์:** ทดสอบการทำงานร่วมกันระหว่างโมดูล (Module Integration)
- **เนื้อหา:** 
  - ระบบ `UniversalConverter` ประกอบด้วยโมดูลย่อย `DistanceConverter`, `WeightConverter`, และ `TemperatureConverter`
  - **Top-Down Integration:** ใช้ **Stub** จำลองโมดูลระดับล่าง
  - **Bottom-Up Integration:** ใช้ **Driver** ทดสอบโมดูลระดับล่างก่อนผสานเข้าสู่โมดูลหลัก
  - รายงานข้อผิดพลาดของระบบ (Multiplier bug ใน WeightConverter และ Integer Division bug ใน TemperatureConverter)

### 🔹 [Lab 9: Test Double & Mocking](LabAssignment/Lab9_TestDouble)
- **วัตถุประสงค์:** ประยุกต์ใช้ Test Double เพื่อทดสอบโมดูลที่มี Dependency ภายนอก (เช่น Database, Third-party API)
- **เนื้อหา:** 
  - การจำลอง Object ด้วยเทคนิค Dummy, Stub, Spy, Mock, และ Fake
  - การใช้ **Mockito** ร่วมกับ **JUnit 5** ในระบบสำรองที่นั่ง (`SeatReservation`, `SeatDAO`) และระบบตรวจบัตรเข้าชม (`GateCheckin`, `TicketCounter`)

---

## 🛠️ เครื่องมือและเทคโนโลยีที่ใช้ (Tools & Technologies)

- **Programming Language:** Java (JDK 17+)
- **Testing Frameworks:** JUnit 5 (JUnit Jupiter), Mockito 5.x
- **Build Tool:** Apache Maven
- **IDE:** Eclipse IDE / Visual Studio Code
- **Version Control:** Git & GitHub

---

## 📚 เอกสารอ้างอิง (Acknowledgments & References)

This repository contains examples and submitted assignments used in the **CP353201 Software Quality Assurance** class at College of Computing, Khon Kaen University (CS KKU). Some examples and source code are adopted or modified from the course textbooks, official JUnit / Mockito documentation, and open courseware. All source code in this repository is strictly for educational purposes.

---

<div align="center">

<i>Submitted by <b>Tankun Phannikul (นายแทนคุณ พันธ์นิกุล)</b> — 673380301-0</i>  
<i>College of Computing, Khon Kaen University</i>

</div>
