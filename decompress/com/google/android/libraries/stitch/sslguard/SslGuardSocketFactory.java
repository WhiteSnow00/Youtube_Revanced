// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.stitch.sslguard;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.Provider;
import android.util.Log;
import java.security.Security;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class SslGuardSocketFactory extends SSLSocketFactory
{
    private static final String a = "SslGuardSocketFactory";
    private static qnm b;
    
    public static void a(final qnm b) {
        if (b != null) {
            SslGuardSocketFactory.b = b;
            return;
        }
        throw new AssertionError((Object)"Cannot initialize SslGuardSocketFactory will null");
    }
    
    private static final SSLSocketFactory b() {
        try {
            return SSLContext.getInstance("Default").getSocketFactory();
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    private static final SSLSocketFactory c() {
        final argj c = argj.c;
        final int a = c.a;
        SslGuardSocketFactory.b.a(c);
        final SSLSocketFactory b = b();
        if (b instanceof SslGuardSocketFactory) {
            final Provider[] providers = Security.getProviders();
            final int length = providers.length;
            int i = 0;
            String concat = "[";
            while (i < length) {
                final Provider provider = providers[i];
                final String concat2 = concat.concat(String.valueOf(provider.toString()));
                String s;
                if (provider.stringPropertyNames().contains("SSLContext.Default")) {
                    s = "(true), ";
                }
                else {
                    s = "(false), ";
                }
                concat = concat2.concat(s);
                ++i;
            }
            Log.e(SslGuardSocketFactory.a, concat.concat("]"));
            throw new RuntimeException("Unable to find a default SSL provider.");
        }
        return b;
    }
    
    @Override
    public final Socket createSocket() {
        return c().createSocket();
    }
    
    @Override
    public final Socket createSocket(final String s, final int n) {
        return c().createSocket(s, n);
    }
    
    @Override
    public final Socket createSocket(final String s, final int n, final InetAddress inetAddress, final int n2) {
        return c().createSocket(s, n, inetAddress, n2);
    }
    
    @Override
    public final Socket createSocket(final InetAddress inetAddress, final int n) {
        return c().createSocket(inetAddress, n);
    }
    
    @Override
    public final Socket createSocket(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) {
        return c().createSocket(inetAddress, n, inetAddress2, n2);
    }
    
    @Override
    public final Socket createSocket(final Socket socket, final String s, final int n, final boolean b) {
        return c().createSocket(socket, s, n, b);
    }
    
    @Override
    public final String[] getDefaultCipherSuites() {
        try {
            return c().getDefaultCipherSuites();
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    public final String[] getSupportedCipherSuites() {
        try {
            return c().getSupportedCipherSuites();
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
