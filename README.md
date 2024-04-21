Java Maven Test automation project - Vasil Bogdanov 

Testing functionality of http://training.skillo-bg.com:4200/posts/all for Edge browser

Test One - Login test
Open homepage.
Verify that the correct page is loaded.
Login with existing user and click Remember me.
Click Profile page.
Verify that the correct page is loaded.

Test Two - Logout test
Open homepage.
Verify that the correct page is loaded.
Login with existing user and click Remember me.
Click Profile page.
Verify that the correct page is loaded.
Click Logout.
Verify that the Login page is loaded.

Test Three - Create new post
Open homepage.
Verify that the correct page is loaded.
Login with existing user and click Remember me.
Click Profile page.
Verify that the correct page is loaded.
Click New Post.
Upload picture.
Click Create Post.
Verify that the Profile page is loaded.

Test Four - Profile info test
Open homepage.
Verify that the correct page is loaded.
Login with existing user and click Remember me.
Click Profile page.
Verify that the correct page is loaded.
Enter in the field Public Info “Student2024”.
Check if the pop-up confirmation has appeared.

Test Five - Profile picture test
Open homepage.
Verify that the correct page is loaded.
Login with existing user and click Remember me.
Click Profile page.
Verify that the correct page is loaded.
Click Profile picture.
Upload profile picture.
Check if the pop-up confirmation has appeared.
