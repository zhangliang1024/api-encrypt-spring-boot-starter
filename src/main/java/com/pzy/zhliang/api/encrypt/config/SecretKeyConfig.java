package com.pzy.zhliang.api.encrypt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "pzy.encrypt.rsa")
@Configuration
public class SecretKeyConfig{

    private String privateKey;

    private String publicKey;

    private String charset = "UTF-8";

    private boolean open = true;
    /**
     * 是否打印debug日志
     */
    private boolean showLog = false;
    /**
     * 开启调试模式，调试模式下不进行加解密操作，用于像Swagger这种在线API测试场景
     */
    private boolean debug = false;

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isShowLog() {
        return showLog;
    }

    public void setShowLog(boolean showLog) {
        this.showLog = showLog;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
}
