 let marks = parseFloat(prompt("Enter your marks (0–100):"));


if (isNaN(marks) || marks < 0 || marks > 100) {
  console.log("Please enter a valid number between 0 and 100.");
} else {
  let grade;


  if (marks >= 90) {
    grade = "A";
  } else if (marks >= 80) {
    grade = "B";
  } else if (marks >= 70) {
    grade = "C";
  } else if (marks >= 60) {
    grade = "D";
  } else {
    grade = "F";
  }


  console.log(You scored ${marks} and your grade is: ${grade});
}
