// navbar.js

document.addEventListener("DOMContentLoaded", () => 
	{
  const navRight = document.getElementById("nav-right");

  const isLoggedIn = localStorage.getItem("userLoggedIn") === "true";

  if (isLoggedIn) 
	{
    navRight.innerHTML = `
      <a href="#">My Account</a>
      <a href="#">Categories</a>
      <a href="#">Cart</a>
      <a href="#">Orders</a>
      <a href="#" onclick="logout()">Logout</a>
    `;
	} 
	else 
	{
    navRight.innerHTML = `
      <a href="/frontend/login.html">Login</a>
      <a href="/frontend/signup.html">Signup</a>
    `;
  }
});

function logout() {
  localStorage.removeItem("userLoggedIn");
  window.location.href = "/frontend/index.html";
}
