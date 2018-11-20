package com.mobile_core.module_personal.main;

/**
 * Created by picher on 2018/11/20.
 * Describe：
 */
public class LoginRequester {

    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginRequester(LoginRequester.Builder build) {
        this.account = build.account;
        this.password = build.password;
    }

    public static class Builder {
        private String account;
        private String password;

        public LoginRequester.Builder account(String account) {
            this.account = account;
            return this;
        }

        public LoginRequester.Builder password(String password) {
            this.password = password;
            return this;
        }

        public LoginRequester build() {
            return new LoginRequester(this);
        }
    }
}
