// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.stitch.sslguard;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.Provider;
import android.util.Log;
import java.security.Security;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

public final class SslGuardServerSocketFactory extends SSLServerSocketFactory
{
    private static final String a;
    private static qnm b;
    
    static {
        a = SslGuardSocketFactory.class.getSimpleName();
    }
    
    public static void a(final qnm b) {
        if (b != null) {
            SslGuardServerSocketFactory.b = b;
            return;
        }
        throw new AssertionError((Object)"Cannot initialize SslGuardSocketFactory will null");
    }
    
    private static final SSLServerSocketFactory b() {
        try {
            return SSLContext.getInstance("Default").getServerSocketFactory();
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    private static final SSLServerSocketFactory c() {
        final argj c = argj.c;
        final int a = c.a;
        SslGuardServerSocketFactory.b.a(c);
        final SSLServerSocketFactory b = b();
        if (b instanceof SslGuardServerSocketFactory) {
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
            Log.e(SslGuardServerSocketFactory.a, concat.concat("]"));
            throw new RuntimeException("Unable to find a default SSL provider.");
        }
        return b;
    }
    
    @Override
    public final ServerSocket createServerSocket(final int n) {
        return c().createServerSocket(n);
    }
    
    @Override
    public final ServerSocket createServerSocket(final int n, final int n2) {
        return c().createServerSocket(n, n2);
    }
    
    @Override
    public final ServerSocket createServerSocket(final int n, final int n2, final InetAddress inetAddress) {
        return c().createServerSocket(n, n2, inetAddress);
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
