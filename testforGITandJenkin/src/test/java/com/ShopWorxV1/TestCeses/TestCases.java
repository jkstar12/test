package com.ShopWorxV1.TestCeses;


public class TestCases {
	//test case Id string
		private String testCaseId;
		//test case name string
		
		private String urlOfPosting;
		//test result status string
		private String EmailId;
		//construct a test case object
		public TestCases(String testcaseid, String urlofposting, String emailid)
		{
		  this.setTestCaseId(testcaseid);
		  this.setUrlOfPosting(urlofposting);
		  this.setEmailId(emailid);
		}
		/**
		 * @return the emailId
		 */
		public String getEmailId() {
		  return EmailId;
		}

		/**
		 * @param emailId the emailId to set
		 */
		public void setEmailId(String emailid) {
			EmailId = emailid;
		}

		/**
		 * @return the urlOfPosting
		 */
		public String getUrlOfPosting() {
		  return urlOfPosting;
		}

		/**
		 * @param urlOfPosting the urlOfPosting to set
		 */
		public void setUrlOfPosting(String urlOfPosting) {
		  this.urlOfPosting = urlOfPosting;
		}

		/**
		 * @return the testCaseId
		 */
		public String getTestCaseId() {
		  return testCaseId;
		}

		/**
		 * @param testCaseId the testCaseId to set
		 */
		public void setTestCaseId(String testCaseId) {
		  this.testCaseId = testCaseId;
		}

		/**
		   * @param args
		   */
		  public static void main(String[] args) {
		    // TODO Auto-generated method stub

		  }
		  
		  


}
