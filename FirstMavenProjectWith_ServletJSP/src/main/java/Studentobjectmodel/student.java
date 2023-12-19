package Studentobjectmodel;

public class student {

		private int sid;
		private String sname;
		private String gender;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
		@Override
		public String toString() {
			return "student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + " ]";
		}
		
		
		
}
