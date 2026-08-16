# 🧪 Lab 8: Integration Testing

**รายวิชา:** CP353201 Software Quality Assurance (SQA)  
**ภาคการศึกษา:** 1/2569 | สาขาวิชาวิทยาการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น (CS KKU)  

---

## 👤 ข้อมูลผู้จัดทำ (Student Information)
| หัวข้อ | รายละเอียด |
| :--- | :--- |
| **ชื่อ-นามสกุล** | นายแทนคุณ พันธ์นิกุล |
| **รหัสนักศึกษา** | 673380301-0 |
| **สาขาวิชา** | วิทยาการคอมพิวเตอร์ (Computer Science) |
| **คณะ** | วิทยาลัยการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น |

---

## 📂 โครงสร้างโปรเจกต์ (Project Structure)

```
Lab8_IntegrationTesting/
├── LabDemo/
│   └── UniversalConverter/
│       ├── src/
│       │   └── sqa/
│       │       ├── main/
│       │       │   ├── UniversalConverter.java      # คลาสหลักระดับบนสุด (Top-level Module)
│       │       │   ├── DistanceConverter.java       # โมดูลแปลงระยะทาง
│       │       │   ├── WeightConverter.java         # โมดูลแปลงน้ำหนัก
│       │       │   └── TemperatureConverter.java    # โมดูลแปลงอุณหภูมิ
│       │       └── test/
│       │           ├── Stub.java                    # Stub จำลอง getMultiplier ของ DistanceConverter
│       │           ├── Driver.java                  # Driver จำลองการเรียกใช้งาน UniversalConverter
│       │           ├── testWithStub.java            # JUnit Test ตัวอย่างการใช้ Stub
│       │           ├── TopDownIntegrationTest.java  # ชุดทดสอบแบบ Top-Down Integration
│       │           └── BottomUpIntegrationTest.java # ชุดทดสอบแบบ Bottom-Up Integration
├── Resourse/
│   ├── 673380301-0 Template_TestCase.docx           # เอกสารบันทึกการออกแบบและผลการทดสอบ
│   └── 673380301-0 Template_TestCase.pdf
└── README.md
```

---

## 🎯 กิจกรรมการทดสอบ (Testing Activities)

### 1. กิจกรรมที่ 8.1: การวิเคราะห์ Program Structure
- วิเคราะห์ความสัมพันธ์ของโมดูลในระบบ `UniversalConverter`
- โมดูลระดับบนสุด: `UniversalConverter`
- โมดูลระดับล่าง: `DistanceConverter`, `WeightConverter`, `TemperatureConverter`
- โมดูลย่อย (Leaf): `getMultiplier()` ใน `DistanceConverter` และ `WeightConverter`

### 2. กิจกรรมที่ 8.2: Top-Down Integration Testing (การใช้ Stub)
- ทดสอบจากโมดูลชั้นบนลงมาชั้นล่าง โดยใช้ **Stub** แทนโมดูลย่อยที่ยังไม่ได้รวมเข้ามา
- ทดสอบการเลือก `choice` ของ `UniversalConverter` ร่วมกับ Stub
- ค่อยๆ แทนที่ Stub ด้วยโมดูลจริง (`real`) ทีละตัว

### 3. กิจกรรมที่ 8.3: Bottom-Up Integration Testing (การใช้ Driver)
- ทดสอบจากโมดูลชั้นล่างสุด (`Level 1`) ทีละโมดูลโดยใช้ **Driver / JUnit Test Driver**
- รวมโมดูลย่อยเข้ากับโมดูลชั้นบน (`Level 2: UniversalConverter`)

---

## 📊 สรุปผลการทดสอบ (Test Results & Defect Summary)
จากการทำ Integration Testing ทั้งหมด 12 กรณีทดสอบ (Pass: 6, Fail: 6) ตรวจพบบั๊กใน Source Code ดังนี้:

1. **`WeightConverter.java` (บรรทัดที่ 49):**
   - การแปลงจาก `kilogram` เป็น `gram` กำหนดตัวคูณผิดเป็น `multiplier = 1.0/1000;` ส่งผลให้การแปลง 5 kg ได้ค่า `0.005 g` (ที่ถูกต้องคือ `5000.0 g`)
2. **`TemperatureConverter.java` (บรรทัดที่ 33):**
   - สูตรคำนวณการแปลงจาก `C` เป็น `F` มีข้อผิดพลาดจาก Integer Division `(9/5)` ซึ่งใน Java มีค่าเท่ากับ `1` ส่งผลให้การแปลง 100°C ได้ `132.0°F` (ที่ถูกต้องคือ `212.0°F`)

---

## 📚 Acknowledgments & References
This repository contains examples and submitted assignments used in the CP353201 Software Quality Assurance class at CS, KKU. All source code in this repository is for educational purposes only.
