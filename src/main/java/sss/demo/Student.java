package sss.demo;

public class Student {

    String studentId;
    String studentName;
    String Address;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

//    @Override
//    @Override
//    public String toString() {
//        String studentAddress;
//        return "Student{" +
//                "studentid='" + studentId + '\'' +
//                ", studentname='" + studentName + '\'' +
//                ", studentAddress='" + studentAddress + '\'' + '}';
//
//
//    }
}