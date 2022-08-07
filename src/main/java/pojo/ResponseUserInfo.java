package pojo;

  public class ResponseUserInfo {
        private String email;
        private String name;

      public String getEmail() {
          return email;
      }

      public String getName() {
          return name;
      }

      public void setEmail(String email) {
          this.email = email;
      }

      public void setName(String name) {
          this.name = name;
      }

      public ResponseUserInfo(String email, String name) {
          this.email = email;
          this.name = name;
      }
  }


