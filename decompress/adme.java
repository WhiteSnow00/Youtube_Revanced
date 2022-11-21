import android.webkit.MimeTypeMap;
import android.text.TextUtils;
import android.app.Activity;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import java.util.function.Predicate;
import j$.util.Collection$_EL;
import com.google.protobuf.MessageLite;
import java.util.Collection;
import java.util.ArrayList;
import java.io.File;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adme
{
    @Backup
    public static final String UPLOAD_QUALITY = "com.google.android.libraries.youtube.upload.pref.upload_quality";
    
    public static int A(final int n) {
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
    
    public static boolean B(final adoj adoj) {
        if (!adoj.aj) {
            if (!adoj.ai) {
                final afgh a = admf.a;
                adoi adoi;
                if ((adoi = adoi.a(adoj.ad)) == null) {
                    adoi = adoi.a;
                }
                if (a.contains(adoi)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static void C(final apks apks) {
        apks.getClass();
        final int b = apks.b;
        final boolean b2 = true;
        int n;
        if ((b & 0x1) != 0x0) {
            anys anys;
            if ((anys = apks.c) == null) {
                anys = anys.a;
            }
            twd.n(anys.c);
            n = 1;
        }
        else {
            n = 0;
        }
        int n2 = n;
        if ((apks.b & 0x2) != 0x0) {
            n2 = n + 1;
            ajne ajne;
            if ((ajne = apks.d) == null) {
                ajne = ajne.a;
            }
            T(ajne.b.size() == 1);
            ajne ajne2;
            if ((ajne2 = apks.d) == null) {
                ajne2 = ajne.a;
            }
            ajnc ajnc;
            if ((ajnc = ((ajnb)ajne2.b.get(0)).c) == null) {
                ajnc = ajnc.a;
            }
            anys a;
            if (ajnc.b == 2) {
                a = (anys)ajnc.c;
            }
            else {
                a = anys.a;
            }
            twd.n(a.c);
        }
        T(n2 == 1 && b2);
    }
    
    public static final void H(final int n, final Set set) {
        set.add(n);
    }
    
    public static final void I(int i, final int n, final Set set) {
        while (i <= n) {
            set.add(i);
            ++i;
        }
    }
    
    public static afbk J(final afbk afbk, final afbk afbk2) {
        afbk.getClass();
        afbk2.getClass();
        return new afbl(Arrays.asList(afbk, afbk2));
    }
    
    public static void K(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void L(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void M(final boolean b, final String s, final char c) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adzw.O(s, new Object[] { c }));
    }
    
    public static void N(final boolean b, final String s, final int n) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adzw.O(s, new Object[] { n }));
    }
    
    public static void O(final boolean b, final String s, final long n) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adzw.O(s, new Object[] { n }));
    }
    
    public static void P(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adzw.O(s, new Object[] { o }));
    }
    
    public static void Q(final boolean b, final String s, final int n, final int n2) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adzw.O(s, new Object[] { n, n2 }));
    }
    
    public static void R(final boolean b, final String s, final Object o, final Object o2) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(adzw.O(s, new Object[] { o, o2 }));
    }
    
    public static void S(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = adzw.O("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = ao(n2, n3, "end index");
            }
        }
        else {
            s = ao(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void T(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void U(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
    
    public static void V(final boolean b, final String s, final int n) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adzw.O(s, new Object[] { n }));
    }
    
    public static void W(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adzw.O(s, new Object[] { o }));
    }
    
    public static void X(final boolean b, final String s, final int n, final int n2) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adzw.O(s, new Object[] { n, n2 }));
    }
    
    public static void Y(final boolean b, final String s, final Object o, final long n) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adzw.O(s, new Object[] { o, n }));
    }
    
    public static void Z(final boolean b, final String s, final Object o, final Object o2) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adzw.O(s, new Object[] { o, o2 }));
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
    
    public static void aa(final boolean b, final String s, final Object o, final Object o2, final Object o3) {
        if (b) {
            return;
        }
        throw new IllegalStateException(adzw.O(s, new Object[] { o, o2, o3 }));
    }
    
    public static void ab(final int n, final int n2) {
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
            s = adzw.O("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = adzw.O("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void ac(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        throw new IndexOutOfBoundsException(ao(n, n2, "index"));
    }
    
    public static afbg ad(final Class clazz) {
        return new afbg(clazz.getSimpleName());
    }
    
    public static afbg ae(final Object o) {
        return new afbg(o.getClass().getSimpleName());
    }
    
    public static Object af(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        if (o2 != null) {
            return o2;
        }
        throw new NullPointerException("Both parameters are null");
    }
    
    public static Object ag(final Context context, final Class clazz, final AccountId accountId) {
        final Object d = ((aeqo)aegu.N(context.getApplicationContext(), aeqo.class)).zS().d(accountId);
        try {
            return clazz.cast(d);
        }
        catch (final ClassCastException ex) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", ex);
        }
    }
    
    public static boolean ah(final Intent intent, final Context context) {
        return intent.getPackage() != null && intent.getPackage().equals(context.getPackageName());
    }
    
    public static ListenableFuture ai(final ListenableFuture listenableFuture) {
        return agra.X(listenableFuture, (afax)aemh.f, (Executor)afwd.a);
    }
    
    public static void aj(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static ListenableFuture ak(final aeor aeor, final String s, final eg eg) {
        return aeor.a(s, (List)Collections.singletonList(eg));
    }
    
    public static final aheu al(final Set set) {
        return new aheu(set);
    }
    
    public static final void am(final aheu aheu, final Set set) {
        final Iterator<Object> iterator = ((Set<Object>)aheu.a).iterator();
        while (iterator.hasNext()) {
            set.add((int)iterator.next());
        }
    }
    
    private static alkp an(final String c, final String d) {
        final ahcr builder = ((ahcz)alkp.a).createBuilder();
        if (d != null) {
            builder.copyOnWrite();
            final alkp alkp = (alkp)builder.instance;
            alkp.b |= 0x4;
            alkp.d = d;
        }
        if (c != null) {
            builder.copyOnWrite();
            final alkp alkp2 = (alkp)builder.instance;
            alkp2.b |= 0x1;
            alkp2.c = c;
        }
        return (alkp)builder.build();
    }
    
    private static String ao(final int n, final int n2, final String s) {
        if (n < 0) {
            return adzw.O("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return adzw.O("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        final StringBuilder sb = new StringBuilder("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static alji b(final String s, final String s2) {
        final ahcr builder = ((ahcz)alji.a).createBuilder();
        builder.bf(an(s, s2));
        return (alji)builder.build();
    }
    
    public static alji c(final List list, final String s) {
        if (!list.isEmpty()) {
            final ahcr builder = ((ahcz)alji.a).createBuilder();
            for (final adqe adqe : list) {
                builder.bf(an(adqe.c(), (String)adqe.h));
            }
            return (alji)builder.build();
        }
        return b(s, null);
    }
    
    public static final adlp d(final Optional optional, final Optional optional2) {
        return new adlp(optional, optional2);
    }
    
    static File e(final Context context, final adkr adkr, final boolean b) {
        final String value = String.valueOf(adkr.f);
        String s;
        if (!b) {
            s = "";
        }
        else {
            s = "/embedded";
        }
        return new File(context.getCacheDir(), value.concat(s));
    }
    
    static File f(final adkp adkp, final adkr adkr) {
        return g(adkp, adkr, false);
    }
    
    static File g(final adkp adkp, final adkr adkr, final boolean b) {
        final File e = e((Context)adkp.c, adkr, b);
        final long a = adkp.a;
        final String e2 = adkr.e;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("_");
        sb.append(e2);
        return new File(e, sb.toString());
    }
    
    public static List h(final adkp adkp, adkr e) {
        final ArrayList list = new ArrayList();
        e = (adkr)e((Context)adkp.c, e, false);
        File[] listFiles;
        try {
            listFiles = ((File)e).listFiles();
        }
        catch (final SecurityException ex) {
            j(String.format("TerminationJournal !journals '%s'", e), ex);
            listFiles = null;
        }
        if (listFiles != null) {
            Collections.addAll(list, listFiles);
        }
        return list;
    }
    
    public static void i(final File file) {
        ume.X(file, (tuh)zjy.c);
    }
    
    public static void j(String e, final Throwable t) {
        final zng a = zng.a;
        e = afbj.e(e);
        if (t == null) {
            znh.b(a, znf.A, e);
            return;
        }
        znh.c(a, znf.A, e, t);
    }
    
    public static void k(final adkp adkp, final MessageLite messageLite, final adkr adkr) {
        l(adkp, messageLite, adkr, false);
    }
    
    public static void l(final adkp adkp, final MessageLite messageLite, final adkr adkr, final boolean b) {
        n(messageLite, g(adkp, adkr, b));
    }
    
    public static List m(final adkp adkp, final adkr adkr, final boolean b) {
        final List h = h(adkp, adkr);
        Collection$_EL.removeIf((Collection)h, (Predicate)new adkq(f(adkp, adkr), b, Long.toString(adkp.a)));
        return h;
    }
    
    public static void n(final MessageLite p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: invokestatic    ume.Y:(Ljava/io/File;Z)Ljava/io/OutputStream;
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
        //    63: invokestatic    adme.i:(Ljava/io/File;)V
        //    66: ldc_w           "TerminationJournal !write '%s'"
        //    69: iconst_1       
        //    70: anewarray       Ljava/lang/Object;
        //    73: dup            
        //    74: iconst_0       
        //    75: aload_1        
        //    76: aastore        
        //    77: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    80: aload_0        
        //    81: invokestatic    adme.j:(Ljava/lang/String;Ljava/lang/Throwable;)V
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
    
    public static ahwd o(final File p0) {
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
        //    13: getstatic       ahwd.a:Lahwd;
        //    16: aload_1        
        //    17: aload_2        
        //    18: invokestatic    ahcz.parseFrom:(Lahcz;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lahcz;
        //    21: checkcast       Lahwd;
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
        //    90: invokestatic    adme.j:(Ljava/lang/String;Ljava/lang/Throwable;)V
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
    
    public static File p(final Context context) {
        return new File(context.getCacheDir(), adkr.a.e);
    }
    
    public static File q(final adkp adkp) {
        return f(adkp, adkr.a);
    }
    
    public static File r(final adkp adkp, final long n) {
        final adkr a = adkr.a;
        final File e = e((Context)adkp.c, a, false);
        final long a2 = adkp.a;
        final String e2 = a.e;
        final StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append("_");
        sb.append(n);
        sb.append("_");
        sb.append(e2);
        return new File(e, sb.toString());
    }
    
    public static List s(final adkp adkp) {
        final List m = m(adkp, adkr.a, true);
        final File p = p((Context)adkp.c);
        try {
            if (p.exists()) {
                m.add(p);
            }
        }
        catch (final SecurityException ex) {
            j(String.format("AnrJV3 !v1journal '%s'", p), ex);
        }
        return m;
    }
    
    public static void t(final adkp adkp, final ahwd ahwd) {
        k(adkp, (MessageLite)ahwd, adkr.a);
    }
    
    public static String u(final int n) {
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
    
    public static boolean v(final adoj adoj) {
        final int b = adoj.b;
        if ((b & 0x2000) == 0x0) {
            if ((b & 0x1000) == 0x0) {
                return false;
            }
        }
        return true;
    }
    
    public static final afbh w(final adoj adoj) {
        final int b = adoj.b;
        if ((b & 0x2000) != 0x0) {
            final String p = adoj.p;
            if (!new File(p).exists()) {
                return afag.a;
            }
            return afbh.j(BitmapFactory.decodeFile(p));
        }
        else {
            if ((b & 0x1000) != 0x0) {
                final byte[] i = adoj.o.I();
                return afbh.j(BitmapFactory.decodeByteArray(i, 0, i.length, new BitmapFactory$Options()));
            }
            return afag.a;
        }
    }
    
    public static Intent x(final Activity activity, final Intent intent) {
        if (intent == null) {
            tut.l("No data on upload video intent:null");
            return null;
        }
        final Uri data = intent.getData();
        if (data == null) {
            tut.l("No Uri on upload video intent:".concat(intent.toString()));
            return null;
        }
        String s2;
        final String s = s2 = activity.getContentResolver().getType(data);
        if (TextUtils.isEmpty((CharSequence)s)) {
            final String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(data.toString());
            s2 = s;
            if (fileExtensionFromUrl != null) {
                s2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
        }
        if (TextUtils.isEmpty((CharSequence)s2)) {
            tut.l("No mime-type on upload video intent:".concat(intent.toString()));
            return null;
        }
        return new Intent("com.google.android.youtube.intent.action.UPLOAD", data);
    }
    
    public static int y(final int n) {
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
    
    public static int z(final int n) {
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
    
    public final void D() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void E() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void F() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void G() {
        monitorenter(this);
        monitorexit(this);
    }
}
