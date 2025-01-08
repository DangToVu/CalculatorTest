Bài Tập: https://chatgpt.com/c/677b5892-fe48-8004-9855-9d1a6c9c4987

Mô tả mã nguồn: 
![a1](https://github.com/user-attachments/assets/5f15a32b-8c0f-4691-a9f3-16b0f9912c9a)
Đoạn mã trên là một lớp Java có tên Calculator, được sử dụng để thực hiện các phép tính toán học cơ bản:

add(int a, int b): Phép cộng hai số nguyên.
subtract(int a, int b): Phép trừ hai số nguyên.
multiply(int a, int b): Phép nhân hai số nguyên.
divide(int a, int b): Phép chia hai số nguyên. Nếu số chia (b) bằng 0, sẽ ném ra ngoại lệ IllegalArgumentException với thông báo "Cannot divide by zero".

Kiểm thử mã nguồn:
![a2](https://github.com/user-attachments/assets/d8ad5f64-832f-4402-a450-2f44d7523461)
![a3](https://github.com/user-attachments/assets/22241fe0-92ee-47dc-86a4-20c0bc9a5288)
![a4](https://github.com/user-attachments/assets/10ee9287-71ef-4a37-b0de-ba95d03cb8b9)
Đoạn mã trên là một bộ kiểm thử (Unit Test) cho lớp Calculator được sửa đổi để hỗ trợ cả số nguyên và số thập phân.

Lớp Calculator: Hỗ trợ các phép toán cơ bản (cộng, trừ, nhân, chia) cho cả số nguyên và số thập phân.

Các bài kiểm thử (Test Cases):

Cộng (testAdd, testAdditionWithDecimals): Kiểm tra phép cộng với số nguyên, số âm, và số thập phân.
Trừ (testSubtract, testSubtractionWithLargeNumbers): Kiểm tra phép trừ với số nguyên, số lớn, và số âm.
Nhân (testMultiply, testMultiplicationWithDecimals): Kiểm tra phép nhân với số nguyên, số âm, số 0, và số thập phân.
Chia (testDivide): Kiểm tra phép chia với số nguyên, số âm, và kiểm tra ngoại lệ khi chia cho 0.

kết quả:
![result](https://github.com/user-attachments/assets/1beea192-72d6-4d1f-acaa-3961bbfa8a1a)
