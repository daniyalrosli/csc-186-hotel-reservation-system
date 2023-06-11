package Hotel;

public class Hotel {







        private String name;
        private String address;
        private String city;
        private String country;
        private double phoneNum;
        private String destination;
        private int d;
        private int pc;
        private String rType;


        public Hotel(){



        }


        public Hotel(String name, String address, String city, String country, double phoneNum, String destination,
                     int d, int pc, String rType){


            name=name;
            address=address;
            city=city;
            country=country;
            phoneNum=phoneNum;
            destination=destination;
            d=d;
            pc=pc;
            rType=rType;



        }


        public void setName(String name){this.name=name;}
        public void setAddress(String address){this.address=address;}
        public void setCity(String city) {this.city=city;}
        public void setCountry(String country){this.country=country;}
        public void setPhoneNum(double phoneNum) {this.phoneNum = phoneNum;}
        public void setDestination(String destination) {this.destination = destination;}
        public void setPc(int pc) { this.pc = pc;}
        public void setTp(int d){this.d =d;}
        public void setrType(String rType){this.rType=rType;}


        public String getName(){
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public double getPhoneNum() {
            return phoneNum;
        }

        public String getDestination(){
            return destination;
        }

        public int getPc() {
            return pc;
        }

        public double getD() {
            return d;

        }

        public void getrType() {}

        public String RoomType(String Single, String Queen,String Double){
                String typeofroom = "";

                if (rType.equals("A"))
                    typeofroom = Single;
                else if (rType.equals("B"))
                    typeofroom = Double;
                else if (rType.equals("C"))
                    typeofroom = Queen;

                return typeofroom;



        }



    }
