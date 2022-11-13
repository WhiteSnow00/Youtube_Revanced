import java.util.function.Predicate;
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import j$.util.Optional;
import java.util.Iterator;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;
import android.net.Uri;
import j$.util.concurrent.ThreadLocalRandom;
import com.google.protobuf.MessageLite;
import java.util.List;
import android.content.Context;
import java.io.File;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkp
{
    @Backup
    public static final String UPLOAD_QUALITY = "com.google.android.libraries.youtube.upload.pref.upload_quality";
    
    public static File A(final adiz adiz, final long n) {
        final adjb a = adjb.a;
        final File n2 = n((Context)adiz.c, a, false);
        final long a2 = adiz.a;
        final String e = a.e;
        final StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append("_");
        sb.append(n);
        sb.append("_");
        sb.append(e);
        return new File(n2, sb.toString());
    }
    
    public static List B(adiz y) {
        final List v = v(y, adjb.a, true);
        y = (adiz)y((Context)y.c);
        try {
            if (((File)y).exists()) {
                v.add(y);
            }
        }
        catch (final SecurityException ex) {
            s(String.format("AnrJV3 !v1journal '%s'", y), ex);
        }
        return v;
    }
    
    public static void C(final adiz adiz, final ahuk ahuk) {
        t(adiz, (MessageLite)ahuk, adjb.a);
    }
    
    public static String D(final int n) {
        if (n == 1) {
            return "NO_ANR";
        }
        if (n == 2) {
            return "EARLY_ANR";
        }
        if (n != 3) {
            return "null";
        }
        return "STFC_ANR";
    }
    
    public static final int E(final int n) {
        return ThreadLocalRandom.current().nextInt(n);
    }
    
    public static qdi F(final adjh adjh) {
        final aora b = adjh.b();
        aoqs aoqs;
        if ((aoqs = b.j) == null) {
            aoqs = aoqs.a;
        }
        if (aoqs.b == 0) {
            aoqz aoqz;
            if ((aoqz = b.e) == null) {
                aoqz = aoqz.a;
            }
            if (aoqz.c) {
                final qdh c = qdi.c();
                c.c(true);
                aoqz aoqz2;
                if ((aoqz2 = b.e) == null) {
                    aoqz2 = aoqz.a;
                }
                c.b(aoqz2.d);
                return c.a();
            }
        }
        final qdh c2 = qdi.c();
        c2.c(false);
        return c2.a();
    }
    
    public static qfa G(final int n, final qfg c) {
        final qez c2 = qfa.c();
        c2.c(true);
        if (c != null) {
            c2.c = c;
        }
        if (n > 0) {
            c2.b(n);
        }
        return c2.a();
    }
    
    public static void H(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void I(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void J(final boolean b, final String s, final char c) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adyf.C(s, new Object[] { c }));
    }
    
    public static void K(final boolean b, final String s, final int n) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adyf.C(s, new Object[] { n }));
    }
    
    public static void L(final boolean b, final String s, final long n) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adyf.C(s, new Object[] { n }));
    }
    
    public static void M(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adyf.C(s, new Object[] { o }));
    }
    
    public static void N(final boolean b, final String s, final int n, final int n2) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adyf.C(s, new Object[] { n, n2 }));
    }
    
    public static void O(final boolean b, final String s, final Object o, final Object o2) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adyf.C(s, new Object[] { o, o2 }));
    }
    
    public static void P(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = adyf.C("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = al(n2, n3, "end index");
            }
        }
        else {
            s = al(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void Q(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void R(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
    
    public static void S(final boolean b, final String s, final int n) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adyf.C(s, new Object[] { n }));
    }
    
    public static void T(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adyf.C(s, new Object[] { o }));
    }
    
    public static void U(final boolean b, final String s, final int n, final int n2) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adyf.C(s, new Object[] { n, n2 }));
    }
    
    public static void V(final boolean b, final String s, final Object o, final long n) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adyf.C(s, new Object[] { o, n }));
    }
    
    public static void W(final boolean b, final String s, final Object o, final Object o2) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adyf.C(s, new Object[] { o, o2 }));
    }
    
    public static void X(final boolean b, final String s, final Object o, final Object o2, final Object o3) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adyf.C(s, new Object[] { o, o2, o3 }));
    }
    
    public static void Y(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                final StringBuilder sb = new StringBuilder("negative size: ");
                sb.append(n2);
                throw new IllegalArgumentException(sb.toString());
            }
            s = adyf.C("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = adyf.C("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void Z(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        throw new IndexOutOfBoundsException(al(n, n2, "index"));
    }
    
    public static float a(final Uri uri) {
        final String queryParameter = uri.getQueryParameter("audioSwapVolume");
        if (queryParameter == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(queryParameter);
        }
        catch (final NumberFormatException ex) {
            return 0.0f;
        }
    }
    
    public static aezo aa(final Class clazz) {
        return new aezo(clazz.getSimpleName());
    }
    
    public static aezo ab(final Object o) {
        return new aezo(o.getClass().getSimpleName());
    }
    
    public static Object ac(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        if (o2 != null) {
            return o2;
        }
        throw new NullPointerException("Both parameters are null");
    }
    
    public static aezf ad() {
        return (aezf)new aezg();
    }
    
    public static boolean ae(final Object o, final Object o2) {
        boolean b = true;
        if (o != o2) {
            if (o != null) {
                if (!o.equals(o2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static void af(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static boolean ag(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static ListenableFuture ah(final ListenableFuture listenableFuture, final Callable callable, final Executor executor) {
        final afvq a = afvq.a(callable);
        listenableFuture.addListener((Runnable)a, executor);
        am(listenableFuture, (ListenableFuture)a);
        return (ListenableFuture)a;
    }
    
    public static ListenableFuture ai(final ListenableFuture listenableFuture, final afty afty, final Executor executor) {
        final ListenableFuture r = afwm.r((afty)new aeuj(afty, listenableFuture, 1), (Executor)new afvu(listenableFuture, executor, 1));
        am(listenableFuture, r);
        return r;
    }
    
    public static aemf aj(final Looper looper) {
        return new aemf(looper);
    }
    
    private static alip ak(final String c, final String d) {
        final ahaz builder = ((ahbh)alip.a).createBuilder();
        if (d != null) {
            builder.copyOnWrite();
            final alip alip = (alip)builder.instance;
            alip.b |= 0x4;
            alip.d = d;
        }
        if (c != null) {
            builder.copyOnWrite();
            final alip alip2 = (alip)builder.instance;
            alip2.b |= 0x1;
            alip2.c = c;
        }
        return (alip)builder.build();
    }
    
    private static String al(final int n, final int n2, final String s) {
        if (n < 0) {
            return adyf.C("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return adyf.C("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        final StringBuilder sb = new StringBuilder("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static void am(final ListenableFuture listenableFuture, final ListenableFuture listenableFuture2) {
        listenableFuture2.addListener((Runnable)new adqz(listenableFuture2, listenableFuture, 13), (Executor)afum.a);
    }
    
    public static alhi b(final String s, final String s2) {
        final ahaz builder = ((ahbh)alhi.a).createBuilder();
        builder.bf(ak(s, s2));
        return (alhi)builder.build();
    }
    
    public static alhi c(final List list, final String s) {
        if (!list.isEmpty()) {
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            for (final adop adop : list) {
                builder.bf(ak(adop.c(), (String)adop.h));
            }
            return (alhi)builder.build();
        }
        return b(s, null);
    }
    
    public static void d(final apig apig) {
        apig.getClass();
        final int b = apig.b;
        final boolean b2 = true;
        int n;
        if ((b & 0x1) != 0x0) {
            anwm anwm;
            if ((anwm = apig.c) == null) {
                anwm = anwm.a;
            }
            tvb.n(anwm.c);
            n = 1;
        }
        else {
            n = 0;
        }
        int n2 = n;
        if ((apig.b & 0x2) != 0x0) {
            n2 = n + 1;
            ajlf ajlf;
            if ((ajlf = apig.d) == null) {
                ajlf = ajlf.a;
            }
            Q(ajlf.b.size() == 1);
            ajlf ajlf2;
            if ((ajlf2 = apig.d) == null) {
                ajlf2 = ajlf.a;
            }
            ajld ajld;
            if ((ajld = ((ajlc)ajlf2.b.get(0)).c) == null) {
                ajld = ajld.a;
            }
            anwm a;
            if (ajld.b == 2) {
                a = (anwm)ajld.c;
            }
            else {
                a = anwm.a;
            }
            tvb.n(a.c);
        }
        Q(n2 == 1 && b2);
    }
    
    public static int i(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int j(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int k(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static boolean l(final admv admv) {
        if (!admv.aj) {
            if (!admv.ai) {
                final afeq a = adkq.a;
                admu admu;
                if ((admu = admu.a(admv.ad)) == null) {
                    admu = admu.a;
                }
                if (a.contains((Object)admu)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static final adka m(final Optional optional, final Optional optional2) {
        return new adka(optional, optional2);
    }
    
    static File n(final Context context, final adjb adjb, final boolean b) {
        final String value = String.valueOf(adjb.f);
        String s;
        if (!b) {
            s = "";
        }
        else {
            s = "/embedded";
        }
        return new File(context.getCacheDir(), value.concat(s));
    }
    
    static File o(final adiz adiz, final adjb adjb) {
        return p(adiz, adjb, false);
    }
    
    static File p(final adiz adiz, final adjb adjb, final boolean b) {
        final File n = n((Context)adiz.c, adjb, b);
        final long a = adiz.a;
        final String e = adjb.e;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("_");
        sb.append(e);
        return new File(n, sb.toString());
    }
    
    public static List q(final adiz adiz, adjb n) {
        final ArrayList list = new ArrayList();
        n = (adjb)n((Context)adiz.c, n, false);
        File[] listFiles;
        try {
            listFiles = ((File)n).listFiles();
        }
        catch (final SecurityException ex) {
            s(String.format("TerminationJournal !journals '%s'", n), ex);
            listFiles = null;
        }
        if (listFiles != null) {
            Collections.addAll(list, listFiles);
        }
        return list;
    }
    
    public static void r(final File file) {
        vdh.bj(file, (ttf)zia.c);
    }
    
    public static void s(String e, final Throwable t) {
        final zll a = zll.a;
        e = aezr.e(e);
        if (t == null) {
            zlm.b(a, zlk.A, e);
            return;
        }
        zlm.c(a, zlk.A, e, t);
    }
    
    public static void t(final adiz adiz, final MessageLite messageLite, final adjb adjb) {
        u(adiz, messageLite, adjb, false);
    }
    
    public static void u(final adiz adiz, final MessageLite messageLite, final adjb adjb, final boolean b) {
        w(messageLite, p(adiz, adjb, b));
    }
    
    public static List v(final adiz adiz, final adjb adjb, final boolean b) {
        final List q = q(adiz, adjb);
        Collection$_EL.removeIf((Collection)q, (Predicate)new adja(o(adiz, adjb), b, Long.toString(adiz.a)));
        return q;
    }
    
    public static void w(final MessageLite p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: invokestatic    vdh.bk:(Ljava/io/File;Z)Ljava/io/OutputStream;
        //     5: astore_2       
        //     6: aload_0        
        //     7: aload_2        
        //     8: invokeinterface com/google/protobuf/MessageLite.writeTo:(Ljava/io/OutputStream;)V
        //    13: aload_2        
        //    14: invokevirtual   java/io/OutputStream.close:()V
        //    17: return         
        //    18: astore_0       
        //    19: aload_2        
        //    20: invokevirtual   java/io/OutputStream.close:()V
        //    23: goto            59
        //    26: astore_2       
        //    27: ldc_w           Ljava/lang/Throwable;.class
        //    30: ldc_w           "addSuppressed"
        //    33: iconst_1       
        //    34: anewarray       Ljava/lang/Class;
        //    37: dup            
        //    38: iconst_0       
        //    39: ldc_w           Ljava/lang/Throwable;.class
        //    42: aastore        
        //    43: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    46: aload_0        
        //    47: iconst_1       
        //    48: anewarray       Ljava/lang/Object;
        //    51: dup            
        //    52: iconst_0       
        //    53: aload_2        
        //    54: aastore        
        //    55: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    58: pop            
        //    59: aload_0        
        //    60: athrow         
        //    61: astore_0       
        //    62: aload_1        
        //    63: invokestatic    adkp.r:(Ljava/io/File;)V
        //    66: ldc_w           "TerminationJournal !write '%s'"
        //    69: iconst_1       
        //    70: anewarray       Ljava/lang/Object;
        //    73: dup            
        //    74: iconst_0       
        //    75: aload_1        
        //    76: aastore        
        //    77: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    80: aload_0        
        //    81: invokestatic    adkp.s:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    84: return         
        //    85: astore_2       
        //    86: goto            59
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      6      61     85     Ljava/lang/Exception;
        //  6      13     18     61     Any
        //  13     17     61     85     Ljava/lang/Exception;
        //  19     23     26     59     Any
        //  27     59     85     89     Ljava/lang/Exception;
        //  59     61     61     85     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    public static ahuk x(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: aload_1        
        //     5: aload_0        
        //     6: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     9: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //    12: astore_2       
        //    13: getstatic       ahuk.a:Lahuk;
        //    16: aload_1        
        //    17: aload_2        
        //    18: invokestatic    ahbh.parseFrom:(Lahbh;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //    21: checkcast       Lahuk;
        //    24: astore_2       
        //    25: aload_1        
        //    26: invokevirtual   java/io/InputStream.close:()V
        //    29: aload_2        
        //    30: areturn        
        //    31: astore_2       
        //    32: aload_1        
        //    33: invokevirtual   java/io/InputStream.close:()V
        //    36: goto            72
        //    39: astore_1       
        //    40: ldc_w           Ljava/lang/Throwable;.class
        //    43: ldc_w           "addSuppressed"
        //    46: iconst_1       
        //    47: anewarray       Ljava/lang/Class;
        //    50: dup            
        //    51: iconst_0       
        //    52: ldc_w           Ljava/lang/Throwable;.class
        //    55: aastore        
        //    56: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    59: aload_2        
        //    60: iconst_1       
        //    61: anewarray       Ljava/lang/Object;
        //    64: dup            
        //    65: iconst_0       
        //    66: aload_1        
        //    67: aastore        
        //    68: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    71: pop            
        //    72: aload_2        
        //    73: athrow         
        //    74: astore_1       
        //    75: ldc_w           "AnrJV3 !read '%s'"
        //    78: iconst_1       
        //    79: anewarray       Ljava/lang/Object;
        //    82: dup            
        //    83: iconst_0       
        //    84: aload_0        
        //    85: aastore        
        //    86: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    89: aload_1        
        //    90: invokestatic    adkp.s:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    93: aconst_null    
        //    94: areturn        
        //    95: astore_1       
        //    96: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      9      74     95     Ljava/lang/Exception;
        //  9      25     31     74     Any
        //  25     29     74     95     Ljava/lang/Exception;
        //  32     36     39     72     Any
        //  40     72     95     99     Ljava/lang/Exception;
        //  72     74     74     95     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
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
    
    public static File y(final Context context) {
        return new File(context.getCacheDir(), adjb.a.e);
    }
    
    public static File z(final adiz adiz) {
        return o(adiz, adjb.a);
    }
    
    public final void e() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void f() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void g() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void h() {
        monitorenter(this);
        monitorexit(this);
    }
}
