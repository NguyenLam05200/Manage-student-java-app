# Manage-student-java-app
### Database: MySQL, use ORM hibernate.
### UI: Java Swing (See more UI in file Report.pdf)

Ứng dụng điểm danh học sinh đơn giản cho 2 loại người dùng:
- Giáo vụ:
  1. Tạo môn học, qui định tên mã môn, tên môn, thời khóa biểu (ngày bắt đầu học, ngày kết thúc môn, 15 
  tuần, thứ trong tuần, giờ bắt đầu, giờ kết thúc, tên phòng học).
  2. Add danh sách sinh viên vào môn học. Danh sách này có thể được check chọn, hoặc nhập sinh viên 
  mới, hoặc import từ CSV (chương trình sẽ có chức năng lấy template CSV, giáo vụ nhập theo template, 
  và import trở lại).
  3. Xem kết quả điểm danh: chọn môn, hiển thị n dòng là n sinh viên, và 15 cột là 15 tuần. Có thể edit 1 ô 
  điểm danh (đánh dấu vắng hoặc đánh dấu có mặt)
- Sinh viên:
  1. Điểm danh. Chỉ điểm danh khi chọn chức năng đúng ngày, giờ.
  2. Xem kết quả điểm danh của mình, hiển thị những hôm nào vắng, hôm nào có đi học, hôm nào chưa 
  có dữ liệu (do chưa có ngày).
- Yêu cầu khác:
  - Đổi password.
  - Lưu ý, sv mới vào hệ thống, sẽ được phát sinh username/password là MSSV/MSSV. Khi sv log in lần đầu, 
  phải bắt buộc sv đổi password.
  - Mật khẩu phải được hash dưới CSDL.
