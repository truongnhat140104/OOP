Hướng dẫn sử dụng Library Management System

1. Các thông tin sách, tài khoản dùng để đăng nhập - Member và Librarian - được lưu trong folder "Account&Catalog"
2. Để đăng nhập thành công:
	- Với mỗi tài khoản đều có "loại tài khoản" ứng với (M: member account; L: librarian account). Xin nhập đúng loại tài khoản.
	- Tài khoản có trạng thái (status) "active"
	- Đúng tên đăng nhập (tên đăng nhập là AccountID của tài khoản)

*Một số lưu ý:
- Không tìm thấy sách: chỉ có những cuốn sách trong file "Catalog.txt" ở trong folder "Account&Catalog" mới có thể tìm thấy được.
- Không đăng kí mượn thành công: chỉ có những cuốn sách trong file "Catalog.txt" ở trong folder "Account&Catalog" và tình trạng sách phải là "available" mới có thể đăng kí mượn được.
- Không tìm thấy thành viên: chỉ có những tài khoản trong file "MemberAccount.txt" ở trong folder "Account&Catalog" mới có thể tìm thấy.
- Vì các giá trị đã được lưu trong code ở file "LibraryManagementSystem.java" nên thay đổi giá trị trong folder "Account&Catalog" sẽ không làm thay đổi giá trị kết quả.
Xin không thay đổi các file trong folder "Account&Catalog" để tránh quên khi sử dụng.