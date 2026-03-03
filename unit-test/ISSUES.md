# Suggested GitHub issues

1. Issue: Viết hàm countExcellentStudents()

Description: Cần xử lý kiểm tra điểm hợp lệ và đếm số học sinh đạt loại Giỏi (>= 8.0). Bỏ qua điểm < 0 hoặc > 10.

Suggested commit: `feat: implement countExcellentStudents() #1`

2. Issue: Viết hàm calculateValidAverage()

Description: Tính trung bình các điểm hợp lệ (0..10). Trả về 0 nếu không có điểm hợp lệ.

Suggested commit: `feat: implement calculateValidAverage() #2`

3. Issue: Viết test cho 2 hàm trên

Description: Thêm JUnit tests (normal, boundary, exception cases).

Suggested commit: `test: add unit tests for both methods #3`

4. Issue: Viết tài liệu README.md

Description: Mô tả bài toán và hướng dẫn chạy test.

Suggested commit: `docs: add README and ISSUES file #4`

How to create issues using GitHub CLI:

```bash
gh issue create --title "Viết hàm countExcellentStudents()" --body "Cần xử lý kiểm tra..."
```
