public class Trailer {
     private String ownerName;
     private int teleNumber;
     private String licensePlateNumber;
     private double lengthOfTrailer;
     private int buildingNum;
     private int noOfTrailer = 0;
     private String dateOfStorage;
     private String dateToBeRemoved;

  public Trailer(String name, int num, String license, double length, int building, String dateSt, String dateRe) {
     ownerName = name;
     teleNumber = num;
     licensePlateNumber = license;
     lengthOfTrailer = length;
     buildingNum = building;
     noOfTrailer = 0;
     dateOfStorage = dateSt;
     dateToBeRemoved = dateRe;
  }
  //accessor methods
  public String getOwnerName() {
     return ownerName;
  }
  public int getteleNumber() {
     return teleNumber;
  }
  public String getLicensePlateNumber() {
     return licensePlateNumber;
  }
  public double getLengthOfTrailer() {
     return lengthOfTrailer;
  }
  public int getBuildingNum() {
     return buildingNum;
  }
  public String getDateOfStroage() {
     return dateOfStorage;
  }
  
  public String getDateToBeRemoved() {
     return dateToBeRemoved;
  }
  //mutator method 
  public void setOwnerName(String NewName) {
     ownerName = NewName;
  }
  public void setteleNumber(int NewNum) {
     teleNumber = NewNum;
  }
  public void setLicensePlateNumber(String Newlicense) {
     licensePlateNumber = Newlicense;
  }
  public void setLengthOfTrailer(double Newlength) {
     lengthOfTrailer = Newlength;
  }
  public void setBuildingNum(int Newbuilding) {
     buildingNum = Newbuilding;
  }
  public void setDateOfStroage(String NewDS) {
     dateOfStorage = NewDS;
  }
  public void setDateToBeRemoved(String NewDR) {
     dateToBeRemoved = NewDR;
  }
  public void setNoOfTrailer() {
     noOfTrailer = noOfTrailer + 1;
  }
  //return everything as string
  public String toString() {
     String result;
     result = "Name: " + ownerName + 
              "Telephone Number: " + teleNumber +
              "License Plate Number: " + licensePlateNumber + 
              "Length of trailer: " + lengthOfTrailer + 
              "Building Number: " + buildingNum + 
              "Date of Storage: " + dateOfStorage + 
              "Date to be Removed: " + dateToBeRemoved;
     return result;
  }
}