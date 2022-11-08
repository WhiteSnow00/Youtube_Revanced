// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.util.Arrays;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.ArrayList;
import java.util.Iterator;
import J.N;
import android.util.Pair;
import java.security.MessageDigest;
import javax.security.auth.x500.X500Principal;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import android.util.Log;
import java.util.List;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.util.Set;
import java.security.KeyStore;
import java.io.File;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateFactory;

public class X509Util
{
    private static final char[] HEX_DIGITS;
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerExtensions sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static final Object sLock;
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerExtensions sTestTrustManager;
    private static auca sTrustStorageListener;
    
    static {
        sLock = new Object();
        HEX_DIGITS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    public static void addTestRootCertificate(final byte[] array) {
        ensureInitialized();
        final X509Certificate certificateFromBytes = createCertificateFromBytes(array);
        synchronized (X509Util.sLock) {
            final KeyStore sTestKeyStore = X509Util.sTestKeyStore;
            final String string = Integer.toString(sTestKeyStore.size());
            final StringBuilder sb = new StringBuilder("root_cert_");
            sb.append(string);
            sTestKeyStore.setCertificateEntry(sb.toString(), certificateFromBytes);
            reloadTestTrustManager();
        }
    }
    
    private static List checkServerTrustedIgnoringRuntimeException(final X509TrustManagerExtensions x509TrustManagerExtensions, final X509Certificate[] array, final String s, final String s2) {
        try {
            return x509TrustManagerExtensions.checkServerTrusted(array, s, s2);
        }
        catch (final RuntimeException ex) {
            Log.e("cr_X509Util", "checkServerTrusted() unexpectedly threw: %s", (Throwable)ex);
            throw new CertificateException(ex);
        }
    }
    
    public static void clearTestRootCertificates() {
        ensureInitialized();
        final Object sLock = X509Util.sLock;
        monitorenter(sLock);
        while (true) {
            try {
                try {
                    X509Util.sTestKeyStore.load(null);
                    reloadTestTrustManager();
                }
                finally {
                    monitorexit(sLock);
                    monitorexit(sLock);
                }
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static X509Certificate createCertificateFromBytes(final byte[] array) {
        ensureInitialized();
        return (X509Certificate)X509Util.sCertificateFactory.generateCertificate(new ByteArrayInputStream(array));
    }
    
    private static X509TrustManagerExtensions createTrustManager(final KeyStore p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    javax/net/ssl/TrustManagerFactory.getInstance:(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
        //     6: astore_1       
        //     7: aload_1        
        //     8: aload_0        
        //     9: invokevirtual   javax/net/ssl/TrustManagerFactory.init:(Ljava/security/KeyStore;)V
        //    12: aload_1        
        //    13: invokevirtual   javax/net/ssl/TrustManagerFactory.getTrustManagers:()[Ljavax/net/ssl/TrustManager;
        //    16: astore_0       
        //    17: aload_0        
        //    18: arraylength    
        //    19: istore_2       
        //    20: iconst_0       
        //    21: istore_3       
        //    22: iload_3        
        //    23: iload_2        
        //    24: if_icmpge       117
        //    27: aload_0        
        //    28: iload_3        
        //    29: aaload         
        //    30: astore          4
        //    32: aload           4
        //    34: instanceof      Ljavax/net/ssl/X509TrustManager;
        //    37: ifeq            111
        //    40: new             Landroid/net/http/X509TrustManagerExtensions;
        //    43: dup            
        //    44: aload           4
        //    46: checkcast       Ljavax/net/ssl/X509TrustManager;
        //    49: invokespecial   android/net/http/X509TrustManagerExtensions.<init>:(Ljavax/net/ssl/X509TrustManager;)V
        //    52: astore_1       
        //    53: aload_1        
        //    54: areturn        
        //    55: astore_1       
        //    56: aload           4
        //    58: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    61: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    64: astore          4
        //    66: new             Ljava/lang/StringBuilder;
        //    69: dup            
        //    70: ldc             "Error creating trust manager ("
        //    72: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    75: astore          5
        //    77: aload           5
        //    79: aload           4
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: aload           5
        //    87: ldc             "): "
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: aload           5
        //    95: aload_1        
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    99: pop            
        //   100: ldc             "cr_X509Util"
        //   102: aload           5
        //   104: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   107: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   110: pop            
        //   111: iinc            3, 1
        //   114: goto            22
        //   117: ldc             "cr_X509Util"
        //   119: ldc             "Could not find suitable trust manager"
        //   121: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   124: pop            
        //   125: aconst_null    
        //   126: areturn        
        //   127: astore_0       
        //   128: ldc             "cr_X509Util"
        //   130: ldc             "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s"
        //   132: aload_0        
        //   133: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   136: pop            
        //   137: new             Ljava/security/KeyStoreException;
        //   140: dup            
        //   141: aload_0        
        //   142: invokespecial   java/security/KeyStoreException.<init>:(Ljava/lang/Throwable;)V
        //   145: astore_0       
        //   146: goto            151
        //   149: aload_0        
        //   150: athrow         
        //   151: goto            149
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     17     127    154    Ljava/lang/RuntimeException;
        //  40     53     55     111    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static void ensureInitialized() {
        synchronized (X509Util.sLock) {
            ensureInitializedLocked();
        }
    }
    
    private static void ensureInitializedLocked() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifnonnull       14
        //     6: ldc             "X.509"
        //     8: invokestatic    java/security/cert/CertificateFactory.getInstance:(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
        //    11: putstatic       org/chromium/net/X509Util.sCertificateFactory:Ljava/security/cert/CertificateFactory;
        //    14: getstatic       org/chromium/net/X509Util.sDefaultTrustManager:Landroid/net/http/X509TrustManagerExtensions;
        //    17: ifnonnull       27
        //    20: aconst_null    
        //    21: invokestatic    org/chromium/net/X509Util.createTrustManager:(Ljava/security/KeyStore;)Landroid/net/http/X509TrustManagerExtensions;
        //    24: putstatic       org/chromium/net/X509Util.sDefaultTrustManager:Landroid/net/http/X509TrustManagerExtensions;
        //    27: getstatic       org/chromium/net/X509Util.sLoadedSystemKeyStore:Z
        //    30: ifne            95
        //    33: ldc             "AndroidCAStore"
        //    35: invokestatic    java/security/KeyStore.getInstance:(Ljava/lang/String;)Ljava/security/KeyStore;
        //    38: astore_0       
        //    39: aload_0        
        //    40: putstatic       org/chromium/net/X509Util.sSystemKeyStore:Ljava/security/KeyStore;
        //    43: aload_0        
        //    44: aconst_null    
        //    45: invokevirtual   java/security/KeyStore.load:(Ljava/security/KeyStore$LoadStoreParameter;)V
        //    48: new             Ljava/io/File;
        //    51: astore_1       
        //    52: ldc             "ANDROID_ROOT"
        //    54: invokestatic    java/lang/System.getenv:(Ljava/lang/String;)Ljava/lang/String;
        //    57: astore_2       
        //    58: new             Ljava/lang/StringBuilder;
        //    61: astore_0       
        //    62: aload_0        
        //    63: invokespecial   java/lang/StringBuilder.<init>:()V
        //    66: aload_0        
        //    67: aload_2        
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: pop            
        //    72: aload_0        
        //    73: ldc             "/etc/security/cacerts"
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: pop            
        //    79: aload_1        
        //    80: aload_0        
        //    81: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    84: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    87: aload_1        
        //    88: putstatic       org/chromium/net/X509Util.sSystemCertificateDirectory:Ljava/io/File;
        //    91: iconst_1       
        //    92: putstatic       org/chromium/net/X509Util.sLoadedSystemKeyStore:Z
        //    95: getstatic       org/chromium/net/X509Util.sSystemTrustAnchorCache:Ljava/util/Set;
        //    98: ifnonnull       111
        //   101: new             Ljava/util/HashSet;
        //   104: dup            
        //   105: invokespecial   java/util/HashSet.<init>:()V
        //   108: putstatic       org/chromium/net/X509Util.sSystemTrustAnchorCache:Ljava/util/Set;
        //   111: getstatic       org/chromium/net/X509Util.sTestKeyStore:Ljava/security/KeyStore;
        //   114: ifnonnull       137
        //   117: invokestatic    java/security/KeyStore.getDefaultType:()Ljava/lang/String;
        //   120: invokestatic    java/security/KeyStore.getInstance:(Ljava/lang/String;)Ljava/security/KeyStore;
        //   123: astore_0       
        //   124: aload_0        
        //   125: putstatic       org/chromium/net/X509Util.sTestKeyStore:Ljava/security/KeyStore;
        //   128: aload_0        
        //   129: aconst_null    
        //   130: invokevirtual   java/security/KeyStore.load:(Ljava/security/KeyStore$LoadStoreParameter;)V
        //   133: goto            137
        //   136: astore_0       
        //   137: getstatic       org/chromium/net/X509Util.sTestTrustManager:Landroid/net/http/X509TrustManagerExtensions;
        //   140: ifnonnull       152
        //   143: getstatic       org/chromium/net/X509Util.sTestKeyStore:Ljava/security/KeyStore;
        //   146: invokestatic    org/chromium/net/X509Util.createTrustManager:(Ljava/security/KeyStore;)Landroid/net/http/X509TrustManagerExtensions;
        //   149: putstatic       org/chromium/net/X509Util.sTestTrustManager:Landroid/net/http/X509TrustManagerExtensions;
        //   152: getstatic       org/chromium/net/X509Util.sTrustStorageListener:Lauca;
        //   155: ifnonnull       208
        //   158: new             Lauca;
        //   161: dup            
        //   162: invokespecial   auca.<init>:()V
        //   165: putstatic       org/chromium/net/X509Util.sTrustStorageListener:Lauca;
        //   168: new             Landroid/content/IntentFilter;
        //   171: dup            
        //   172: invokespecial   android/content/IntentFilter.<init>:()V
        //   175: astore_0       
        //   176: aload_0        
        //   177: ldc_w           "android.security.action.KEYCHAIN_CHANGED"
        //   180: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   183: aload_0        
        //   184: ldc_w           "android.security.action.KEY_ACCESS_CHANGED"
        //   187: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   190: aload_0        
        //   191: ldc_w           "android.security.action.TRUST_STORE_CHANGED"
        //   194: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //   197: getstatic       auaf.a:Landroid/content/Context;
        //   200: getstatic       org/chromium/net/X509Util.sTrustStorageListener:Lauca;
        //   203: aload_0        
        //   204: invokestatic    auaf.a:(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //   207: pop            
        //   208: return         
        //   209: astore_0       
        //   210: goto            91
        //   213: astore_0       
        //   214: goto            48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  33     43     209    213    Ljava/security/KeyStoreException;
        //  43     48     213    217    Ljava/io/IOException;
        //  43     48     209    213    Ljava/security/KeyStoreException;
        //  48     91     209    213    Ljava/security/KeyStoreException;
        //  128    133    136    137    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static String hashPrincipal(final X500Principal x500Principal) {
        final byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        final char[] array = new char[8];
        for (int i = 0; i < 4; ++i) {
            final int n = i + i;
            final char[] hex_DIGITS = X509Util.HEX_DIGITS;
            final byte b = digest[3 - i];
            array[n] = hex_DIGITS[b >> 4 & 0xF];
            array[n + 1] = hex_DIGITS[b & 0xF];
        }
        return new String(array);
    }
    
    private static boolean isKnownRoot(final X509Certificate x509Certificate) {
        if (X509Util.sSystemKeyStore == null) {
            return false;
        }
        final Pair pair = new Pair((Object)x509Certificate.getSubjectX500Principal(), (Object)x509Certificate.getPublicKey());
        if (X509Util.sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        final String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int n = 0;
        while (true) {
            final StringBuilder sb = new StringBuilder();
            sb.append(hashPrincipal);
            sb.append(".");
            sb.append(n);
            final String string = sb.toString();
            if (!new File(X509Util.sSystemCertificateDirectory, string).exists()) {
                return false;
            }
            final Certificate certificate = X509Util.sSystemKeyStore.getCertificate("system:".concat(string));
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    final String name = ((X509Certificate)certificate).getClass().getName();
                    final StringBuilder sb2 = new StringBuilder("Anchor ");
                    sb2.append(string);
                    sb2.append(" not an X509Certificate: ");
                    sb2.append(name);
                    Log.e("cr_X509Util", sb2.toString());
                }
                else {
                    final X509Certificate x509Certificate2 = (X509Certificate)certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        X509Util.sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            ++n;
        }
    }
    
    private static void reloadDefaultTrustManager() {
        synchronized (X509Util.sLock) {
            X509Util.sDefaultTrustManager = null;
            X509Util.sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
            N.MGVAvp19();
        }
    }
    
    private static void reloadTestTrustManager() {
        X509Util.sTestTrustManager = createTrustManager(X509Util.sTestKeyStore);
    }
    
    static boolean verifyKeyUsage(final X509Certificate x509Certificate) {
        try {
            final List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (final String s : extendedKeyUsage) {
                if (s.equals("1.3.6.1.5.5.7.3.1") || s.equals("2.5.29.37.0") || s.equals("2.16.840.1.113730.4.1") || s.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    public static AndroidCertVerifyResult verifyServerCertificates(final byte[][] array, final String s, final String s2) {
        if (array != null && array.length != 0 && array[0] != null) {
            try {
                ensureInitialized();
                final ArrayList list = new ArrayList();
                try {
                    list.add(createCertificateFromBytes(array[0]));
                    StringBuilder sb = null;
                    for (int i = 1; i < array.length; ++i) {
                        try {
                            list.add(createCertificateFromBytes(array[i]));
                        }
                        catch (final CertificateException ex) {
                            sb = new StringBuilder("intermediate ");
                            sb.append(i);
                            sb.append(" failed parsing");
                            Log.w("cr_X509Util", sb.toString());
                        }
                    }
                    final X509Certificate[] array2 = (X509Certificate[])list.toArray(new X509Certificate[list.size()]);
                    try {
                        array2[0].checkValidity();
                        if (!verifyKeyUsage(array2[0])) {
                            return new AndroidCertVerifyResult(-6);
                        }
                        synchronized (X509Util.sLock) {
                            final X509TrustManagerExtensions sDefaultTrustManager = X509Util.sDefaultTrustManager;
                            if (sDefaultTrustManager == null) {
                                return new AndroidCertVerifyResult(-1);
                            }
                            try {
                                final List list2 = checkServerTrustedIgnoringRuntimeException(sDefaultTrustManager, array2, s, s2);
                            }
                            catch (final CertificateException sb) {
                                try {
                                    final List list2 = checkServerTrustedIgnoringRuntimeException(X509Util.sTestTrustManager, array2, s, s2);
                                    return new AndroidCertVerifyResult(0, list2.size() > 0 && isKnownRoot((X509Certificate)list2.get(list2.size() - 1)), list2);
                                }
                                catch (final CertificateException ex2) {
                                    ((Throwable)sb).getMessage();
                                    return new AndroidCertVerifyResult(-2);
                                }
                            }
                        }
                    }
                    catch (final CertificateException ex3) {
                        return new AndroidCertVerifyResult(-1);
                    }
                    catch (final CertificateNotYetValidException ex4) {
                        return new AndroidCertVerifyResult(-4);
                    }
                    catch (final CertificateExpiredException ex5) {
                        return new AndroidCertVerifyResult(-3);
                    }
                }
                catch (final CertificateException ex6) {
                    return new AndroidCertVerifyResult(-5);
                }
            }
            catch (final CertificateException ex7) {
                return new AndroidCertVerifyResult(-1);
            }
        }
        throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=".concat(String.valueOf(Arrays.deepToString(array))));
    }
}
