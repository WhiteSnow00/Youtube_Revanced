// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.stitch.sslguard;

import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLContextSpi;

public class SslGuardContextImpl extends SSLContextSpi
{
    public final SSLEngine engineCreateSSLEngine() {
        return null;
    }
    
    public final SSLEngine engineCreateSSLEngine(final String s, final int n) {
        return null;
    }
    
    public final /* bridge */ SSLSessionContext engineGetClientSessionContext() {
        return null;
    }
    
    public final /* bridge */ SSLSessionContext engineGetServerSessionContext() {
        return null;
    }
    
    public final SSLServerSocketFactory engineGetServerSocketFactory() {
        return null;
    }
    
    public final SSLSocketFactory engineGetSocketFactory() {
        return new SslGuardSocketFactory();
    }
    
    public final void engineInit(final KeyManager[] array, final TrustManager[] array2, final SecureRandom secureRandom) {
    }
}
