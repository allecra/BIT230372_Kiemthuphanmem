# Báo cáo thực hành môn Kiểm thử phần mềm
**Sinh viên:** Nguyễn Thị Tâm
**MSSV:** [BIT230372]

## Bài tập tuần 1: Trải nghiệm chất lượng giao diện
Dưới đây là kết quả từ cantunsee.space:

![Kết quả Cantunsee](/Screenshot%202026-01-08%20091652.png)

# 🧪 BÁO CÁO BÀI THỰC HÀNH CYPRESS

## 👨‍🎓 Thông tin sinh viên
- Họ tên: Nguyễn Thị Tâm
- Môn học: Kiểm thử phần mềm
- Nội dung: Kiểm thử tự động với Cypress (End-to-End Testing)

---

## 🎯 Mục tiêu bài thực hành
- Làm quen với công cụ kiểm thử tự động Cypress.
- Viết test case tự động cho các chức năng cơ bản của website.
- Thực hành cấu trúc project Cypress chuẩn.
- Biết cách chạy test và đọc kết quả kiểm thử.
- Quản lý mã nguồn bằng GitHub.

---

## 🗂️ Cấu trúc thư mục dự án

cypress-exercise
├── cypress
│ ├── e2e
│ │ ├── cart_spec.cy.js
│ │ └── login_spec.cy.js
│ ├── fixtures
│ └── support
├── node_modules
├── cypress.config.js
├── package.json
├── README.md
└── Screenshot ...


---

## 🧪 Nội dung kiểm thử

### ✅ 1. Kiểm thử chức năng đăng nhập (login_spec.cy.js)
- Kiểm tra đăng nhập với tài khoản hợp lệ.
- Kiểm tra hiển thị thông báo lỗi khi nhập sai thông tin.
- Đảm bảo hệ thống phản hồi đúng sau khi đăng nhập.

---

### ✅ 2. Kiểm thử chức năng giỏ hàng (cart_spec.cy.js)
- Kiểm tra thêm sản phẩm vào giỏ hàng.
- Kiểm tra số lượng sản phẩm.
- Kiểm tra xóa sản phẩm khỏi giỏ hàng.
- Đảm bảo dữ liệu hiển thị chính xác.

---

## ▶️ Kết quả chạy kiểm thử

### 📸 Hình ảnh kết quả Cypress

**Giao diện chạy test trên Cypress:**

![Cypress Result 1](Screenshot%202026-01-27%20101808.png)

**Kết quả test case chi tiết:**

![Cypress Result 2](Screenshot%202026-01-27%20101821.png)

---

## ✅ Đánh giá kết quả
- Tất cả các test case đều chạy thành công (PASS).
- Các chức năng hoạt động đúng như mong đợi.
- Không phát hiện lỗi trong quá trình kiểm thử.
- Hệ thống ổn định khi chạy test tự động.

---

## 📌 Kết luận
Thông qua bài thực hành, sinh viên đã:
- Hiểu cách cài đặt và cấu hình Cypress.
- Viết được test tự động cho website.
- Biết cách tổ chức source code kiểm thử.
- Nâng cao kỹ năng kiểm thử phần mềm và làm việc với Git.

---


## 5. Mô Tả Kịch Bản Kiểm Thử

### 5.1 Thread Group 1 – Kịch Bản Cơ Bản
- Số người dùng: 10
- Loop Count: 5
- Hành vi: Gửi HTTP GET đến trang chủ

### 5.2 Thread Group 2 – Kịch Bản Tải Nặng
- Số người dùng: 50
- Ramp-up: 30 giây
- Hành vi: Truy cập trang chủ và trang con

### 5.3 Thread Group 3 – Kịch Bản Tùy Chỉnh
- Số người dùng: 20
- Thời gian chạy: 60 giây
- Hành vi: Truy cập nhiều trang con

---

## 6. Kết Quả Kiểm Thử

### 6.1 Thống Kê Tổng Quan

- Tổng số request: 7704
- Thời gian phản hồi trung bình: 2140 ms
- Tỷ lệ lỗi: 29.15%
- Throughput: 2.1 request/giây

### 6.2 Ảnh Minh Chứng

Ảnh kết quả Summary Report:

![Summary Report](Screenshot%202026-03-01%20033731.png)

---

## 7. Phân Tích Kết Quả

- Website có thời gian phản hồi trung bình ở mức chấp nhận được.
- Khi số lượng người dùng tăng, tỷ lệ lỗi cũng tăng.
- Một số request có thời gian phản hồi cao.
- Hệ thống chưa tối ưu khi chịu tải lớn.

---

## 8. Đánh Giá Và Đề Xuất

### 8.1 Ưu Điểm
- Website hoạt động ổn định ở tải thấp.
- Giao diện dễ sử dụng.
- Phản hồi nhanh khi ít người dùng.

### 8.2 Hạn Chế
- Tỷ lệ lỗi cao khi tải nặng.
- Thời gian phản hồi chưa ổn định.
- Dễ bị quá tải khi nhiều user.

### 8.3 Đề Xuất Cải Tiến
- Tối ưu server.
- Cải thiện hệ thống cache.
- Nâng cấp phần cứng.
- Tối ưu database.

---

## 9. Kết Luận

Qua bài kiểm thử hiệu năng bằng JMeter, hệ thống hoạt động tốt ở mức tải thấp và trung bình. Tuy nhiên, khi số lượng người dùng tăng cao, hiệu năng giảm rõ rệt. Cần tối ưu thêm để nâng cao khả năng chịu tải.

---

## 10. Tài Liệu Đính Kèm

- File kịch bản: Summary Report.jmx
- Ảnh kết quả:![Summary Report](Screenshot%202026-03-01%20033731.png)

