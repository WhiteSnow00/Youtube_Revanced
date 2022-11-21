import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import android.net.Uri;
import java.io.IOException;
import java.io.Serializable;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabr implements aabs
{
    public final Context a;
    public final String b;
    public final top c;
    public final aafz d;
    public final File e;
    public File f;
    public aabq g;
    private final acig h;
    private final abtp i;
    private final atnb j;
    private final adjq k;
    private final aaks l;
    private File m;
    private File n;
    private File o;
    private final vbo p;
    private final aefs q;
    
    public aabr(final Context a, final String b, final aefs q, final acig h, final abtp i, final top c, final vbo p19, final aafz d, final atnb j, final adjq k, final aaks l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        final File e = new File(B(a, b), "data");
        this.a = a;
        this.b = b;
        this.q = q;
        this.h = h;
        this.i = i;
        this.c = c;
        this.p = p19;
        this.d = d;
        this.j = j;
        this.k = k;
        this.e = e;
        this.l = l;
    }
    
    private final File A(final String s) {
        return new File(this.d(s), "thumbnails");
    }
    
    private static File B(final Context context, final String s) {
        context.getClass();
        twd.n(s);
        final File filesDir = context.getFilesDir();
        final String separator = File.separator;
        final StringBuilder sb = new StringBuilder("offline");
        sb.append(separator);
        sb.append(s);
        return new File(filesDir, sb.toString());
    }
    
    private final File C(final String s) {
        twd.n(s);
        return new File(this.f(s), "thumbnails");
    }
    
    private static File D(final Context context, final String s, final aafz aafz) {
        context.getClass();
        twd.n(s);
        Serializable s2 = null;
        try {
            final File externalFilesDir = context.getExternalFilesDir((String)null);
            if (externalFilesDir == null) {
                return null;
            }
            s2 = File.separator;
            final StringBuilder sb = new StringBuilder("offline");
            sb.append((String)s2);
            sb.append(s);
            s2 = new File(externalFilesDir, sb.toString());
            if (((File)s2).exists()) {
                return (File)s2;
            }
            s2 = File.separator;
            final String x = aafz.x(s);
            final StringBuilder sb2 = new StringBuilder("offline");
            sb2.append((String)s2);
            sb2.append(x);
            final Serializable s3 = new File(externalFilesDir, sb2.toString());
            return (File)s3;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            final Serializable s3 = s2;
            return (File)s3;
        }
    }
    
    private static File E(final top top, final String s, String x, final aafz aafz) {
        top.getClass();
        twd.n(x);
        if (!top.k(s)) {
            return null;
        }
        final File b = top.b(s);
        final String separator = File.separator;
        final StringBuilder sb = new StringBuilder("offline");
        sb.append(separator);
        sb.append(x);
        final File file = new File(b, sb.toString());
        if (file.exists()) {
            return file;
        }
        final File b2 = top.b(s);
        final String separator2 = File.separator;
        x = aafz.x(x);
        final StringBuilder sb2 = new StringBuilder("offline");
        sb2.append(separator2);
        sb2.append(x);
        return new File(b2, sb2.toString());
    }
    
    private final File F(final boolean b, final String s) {
        final File file = null;
        File file2;
        if (b) {
            final File d = D(this.a, this.b, this.d);
            file2 = file;
            if (d != null) {
                file2 = new File(d, "streams");
            }
        }
        else {
            final File e = E(this.c, s, this.b, this.d);
            file2 = file;
            if (e != null) {
                file2 = new File(e, "streams");
            }
        }
        return file2;
    }
    
    private static void G(final File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                H(file);
                file.delete();
            }
            catch (final IOException ex) {
                tut.n("[Offline] Failed to delete directory ".concat(String.valueOf(file.getAbsolutePath())), (Throwable)ex);
            }
        }
    }
    
    @Deprecated
    private static void H(File file) {
        if (!file.isDirectory()) {
            tut.l("[Offline] Failed to delete directory since the directory file is null or it is not a directory ");
            return;
        }
        if (!file.getCanonicalPath().equals(file.getAbsolutePath())) {
            return;
        }
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; ++i) {
                file = listFiles[i];
                file.getClass();
                if (file.isDirectory()) {
                    H(file);
                }
                if (!file.delete()) {
                    throw new IOException("Failed to delete ".concat(file.toString()));
                }
            }
            return;
        }
        throw new IOException("Error listing files for ".concat(file.toString()));
    }
    
    private static final File I(final File file, final Uri uri) {
        uri.getClass();
        return new File(file, v(uri.toString()));
    }
    
    public static void t(final Context context, final top top, final String s, final aafz aafz) {
        G(B(context, s));
        G(D(context, s, aafz));
        for (final Map.Entry<K, Boolean> entry : top.h().entrySet()) {
            if (entry.getValue()) {
                G(E(top, (String)entry.getKey(), s, aafz));
            }
        }
    }
    
    public static final String v(final String s) {
        s.getClass();
        final int lastIndex = s.lastIndexOf(File.separator);
        if (s.startsWith("file") && lastIndex >= 0 && lastIndex < s.length() - 1) {
            return s.substring(lastIndex + 1);
        }
        final int lastIndex2 = s.lastIndexOf(46);
        String substring;
        if (lastIndex2 > 0 && lastIndex2 > lastIndex && lastIndex2 != s.length() - 1) {
            substring = s.substring(lastIndex2);
        }
        else {
            substring = "";
        }
        final int hashCode = s.hashCode();
        final StringBuilder sb = new StringBuilder();
        sb.append(hashCode);
        sb.append(substring);
        return sb.toString();
    }
    
    public static final void w(final File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                try {
                    H(file);
                    file.delete();
                }
                catch (final IOException ex) {
                    tut.n("[Offline] Failed to delete directory ".concat(file.toString()), (Throwable)ex);
                }
            }
        }
    }
    
    public static final boolean x(final String s) {
        final File file = new File(s);
        return !file.exists() || !file.isFile() || file.delete();
    }
    
    public static final aowb y(final amxb amxb) {
        if ((amxb.b & 0x2) != 0x0) {
            aowb aowb;
            if ((aowb = amxb.d) == null) {
                aowb = aowb.a;
            }
            return aowb;
        }
        return null;
    }
    
    public final vig a(final String s, final vig vig) {
        final ArrayList list = new ArrayList();
        for (final vif vif : vig.b) {
            final File e = this.e(s, vif.a());
            if (e.exists()) {
                list.add(new vif(Uri.fromFile(e), vif.a, vif.b));
            }
        }
        return new vig((List)list);
    }
    
    public final vig b(final String s, final vig vig) {
        final ArrayList list = new ArrayList();
        for (final vif vif : vig.b) {
            final File g = this.g(s, vif.a());
            if (g.exists()) {
                list.add(new vif(Uri.fromFile(g), vif.a, vif.b));
            }
        }
        final vig vig2 = new vig((List)list);
        if (((List)vig2.b).isEmpty()) {
            return vig;
        }
        return vig2;
    }
    
    public final vig c(final String s, final vig vig) {
        final ArrayList list = new ArrayList();
        for (final vif vif : vig.b) {
            final File k = this.k(s, vif.a());
            if (k.exists()) {
                list.add(new vif(Uri.fromFile(k), vif.a, vif.b));
            }
        }
        final vig vig2 = new vig((List)list);
        if (((List)vig2.b).isEmpty()) {
            return vig;
        }
        return vig2;
    }
    
    public final File d(final String s) {
        if (this.m == null) {
            this.m = new File(this.e, "channels");
        }
        return new File(this.m, s);
    }
    
    public final File e(final String s, final Uri uri) {
        return I(this.A(s), uri);
    }
    
    public final File f(final String s) {
        if (this.o == null) {
            this.o = new File(this.e, "playlists");
        }
        return new File(this.o, s);
    }
    
    public final File g(final String s, final Uri uri) {
        return I(this.C(s), uri);
    }
    
    public final File h(final String s, final Uri uri) {
        return I(this.l(s), uri);
    }
    
    public final File i(final String s) {
        twd.n(s);
        if (this.n == null) {
            this.n = new File(this.e, "videos");
        }
        return new File(this.n, s);
    }
    
    public final File j(final String s) {
        return new File(this.i(s), "thumbnails");
    }
    
    public final File k(final String s, final Uri uri) {
        return I(this.j(s), uri);
    }
    
    public final File l(final String s) {
        return new File(this.i(s), "tmpthumbnails");
    }
    
    public final File m(final boolean b, final String s) {
        Label_0017: {
            if (!b) {
                break Label_0017;
            }
            try {
                File file = this.a.getExternalFilesDir((String)null);
                while (true) {
                    if (file == null) {
                        this.q(b, "MIGRATION_ERROR_OUT");
                        return null;
                    }
                    final String separator = File.separator;
                    final String b2 = this.b;
                    final StringBuilder sb = new StringBuilder("offline");
                    sb.append(separator);
                    sb.append(b2);
                    final File file2 = new File(file, sb.toString());
                    String s2 = this.d.x(this.b);
                    final boolean b3 = s2.equals(this.b) ^ true;
                    if (file2.exists()) {
                        this.q(b, "MIGRATION_INITIALIZED");
                        if (!b3) {
                            s2 = this.q.cw();
                            if (!this.d.O(this.b, s2)) {
                                this.q(b, "MIGRATION_IDENTITY_NONCE_MAPPING_FAILED");
                                return this.F(b, s);
                            }
                        }
                        final String separator2 = File.separator;
                        final StringBuilder sb2 = new StringBuilder("offline");
                        sb2.append(separator2);
                        sb2.append(s2);
                        final File file3 = new File(file, sb2.toString());
                        try {
                            if (file2.renameTo(file3)) {
                                this.q(b, "MIGRATION_RENAME_SUCCESS");
                            }
                            else {
                                this.q(b, "MIGRATION_RENAME_FAILED");
                            }
                        }
                        catch (final SecurityException ex) {
                            this.q(b, "MIGRATION_RENAME_SECURITY_EXCEPTION");
                        }
                        catch (final NullPointerException ex2) {
                            this.q(b, "MIGRATION_RENAME_NULL_POINTER_EXCEPTION");
                        }
                        return this.F(b, s);
                    }
                    if (!b3 && !this.d.O(this.b, this.q.cw())) {
                        this.q(b, "MIGRATION_ERROR_OUT");
                        return null;
                    }
                    return this.F(b, s);
                    file = this.c.b(s);
                    continue;
                }
            }
            catch (final ArrayIndexOutOfBoundsException | NullPointerException ex3) {
                return null;
            }
        }
    }
    
    public final String n(String e, final SubtitleTrack subtitleTrack) {
        twd.n(e);
        subtitleTrack.getClass();
        tcl.k();
        final tdh b = tdh.b();
        this.i.b(new aefs(subtitleTrack), (tdg)b);
        final File file = new File(this.i(e), "subtitles");
        e = subtitleTrack.e();
        final int hashCode = subtitleTrack.hashCode();
        final StringBuilder sb = new StringBuilder();
        sb.append(e);
        sb.append("_");
        sb.append(hashCode);
        final File file2 = new File(file, sb.toString());
        afqz.b(file2);
        afqz.c((byte[])((afwo)b).get(), file2);
        return file2.getAbsolutePath();
    }
    
    public final void o(final String s) {
        w(this.C(s));
    }
    
    public final void p(final Uri p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //     4: astore          6
        //     6: aload_0        
        //     7: getfield        aabr.l:Laaks;
        //    10: astore          5
        //    12: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    15: dup            
        //    16: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:()V
        //    19: astore          7
        //    21: aload           5
        //    23: getfield        aaks.c:Lvbs;
        //    26: ldc2_w          45365105
        //    29: invokevirtual   vbs.l:(J)Laskp;
        //    32: iconst_0       
        //    33: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    36: invokevirtual   askp.aC:(Ljava/lang/Object;)Lasla;
        //    39: new             Laaid;
        //    42: dup            
        //    43: aload           7
        //    45: iconst_4       
        //    46: invokespecial   aaid.<init>:(Ljava/util/concurrent/atomic/AtomicBoolean;I)V
        //    49: invokevirtual   asla.aa:(Lasmi;)Lasln;
        //    52: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //    55: invokestatic    asmr.b:(Ljava/util/concurrent/atomic/AtomicReference;)Z
        //    58: pop            
        //    59: aload_1        
        //    60: astore          5
        //    62: aload           7
        //    64: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    67: ifeq            107
        //    70: aload_1        
        //    71: astore          5
        //    73: aload           6
        //    75: ifnull          107
        //    78: aload_1        
        //    79: astore          5
        //    81: ldc_w           "http"
        //    84: aload           6
        //    86: invokestatic    aewr.d:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    89: ifeq            107
        //    92: aload_1        
        //    93: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //    96: ldc_w           "https"
        //    99: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   102: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   105: astore          5
        //   107: ldc_w           "file"
        //   110: aload           6
        //   112: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   115: ifeq            119
        //   118: return         
        //   119: aload_2        
        //   120: invokestatic    afqz.b:(Ljava/io/File;)V
        //   123: invokestatic    tdh.b:()Ltdh;
        //   126: astore_1       
        //   127: aload_0        
        //   128: getfield        aabr.j:Latnb;
        //   131: invokeinterface atnb.a:()Ljava/lang/Object;
        //   136: checkcast       Lzqb;
        //   139: aload           5
        //   141: aload_1        
        //   142: invokeinterface zqb.c:(Ljava/lang/Object;Ltdg;)V
        //   147: aload_1        
        //   148: invokevirtual   afwo.get:()Ljava/lang/Object;
        //   151: checkcast       Ljava/lang/Long;
        //   154: invokevirtual   java/lang/Long.longValue:()J
        //   157: lstore_3       
        //   158: aload_2        
        //   159: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   162: astore_1       
        //   163: aload_1        
        //   164: ifnull          286
        //   167: aload_0        
        //   168: getfield        aabr.p:Lvbo;
        //   171: invokevirtual   vbo.b:()Lairq;
        //   174: aload_1        
        //   175: invokestatic    tqf.ag:(Lairq;Ljava/io/File;)J
        //   178: lload_3        
        //   179: lcmp           
        //   180: iflt            286
        //   183: invokestatic    tdh.b:()Ltdh;
        //   186: astore_1       
        //   187: aload_0        
        //   188: getfield        aabr.h:Lacig;
        //   191: aload           5
        //   193: aload_1        
        //   194: invokeinterface acig.l:(Landroid/net/Uri;Ltdg;)V
        //   199: aload_1        
        //   200: ldc2_w          30
        //   203: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   206: invokevirtual   afwo.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   209: checkcast       [B
        //   212: astore_1       
        //   213: new             Ljava/io/FileOutputStream;
        //   216: dup            
        //   217: aload_2        
        //   218: iconst_0       
        //   219: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //   222: astore_2       
        //   223: aload_2        
        //   224: aload_1        
        //   225: invokevirtual   java/io/OutputStream.write:([B)V
        //   228: aload_2        
        //   229: invokevirtual   java/io/OutputStream.close:()V
        //   232: return         
        //   233: astore_1       
        //   234: aload_2        
        //   235: invokevirtual   java/io/OutputStream.close:()V
        //   238: goto            274
        //   241: astore_2       
        //   242: ldc_w           Ljava/lang/Throwable;.class
        //   245: ldc_w           "addSuppressed"
        //   248: iconst_1       
        //   249: anewarray       Ljava/lang/Class;
        //   252: dup            
        //   253: iconst_0       
        //   254: ldc_w           Ljava/lang/Throwable;.class
        //   257: aastore        
        //   258: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   261: aload_1        
        //   262: iconst_1       
        //   263: anewarray       Ljava/lang/Object;
        //   266: dup            
        //   267: iconst_0       
        //   268: aload_2        
        //   269: aastore        
        //   270: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   273: pop            
        //   274: aload_1        
        //   275: athrow         
        //   276: astore_1       
        //   277: new             Lyhq;
        //   280: dup            
        //   281: aload_1        
        //   282: invokespecial   yhq.<init>:(Ljava/lang/Throwable;)V
        //   285: athrow         
        //   286: new             Laahd;
        //   289: dup            
        //   290: aload_2        
        //   291: invokevirtual   java/io/File.length:()J
        //   294: invokespecial   aahd.<init>:(J)V
        //   297: athrow         
        //   298: astore_2       
        //   299: goto            274
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  199    213    276    286    Ljava/util/concurrent/TimeoutException;
        //  223    228    233    276    Any
        //  234    238    241    274    Any
        //  242    274    298    302    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0274:
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
    
    protected final void q(final boolean b, final String s) {
        final adjq k = this.k;
        if (k != null) {
            String s2;
            if (!b) {
                s2 = "MIGRATION_LOCATION_SDCARD";
            }
            else {
                s2 = "MIGRATION_LOCATION_PRIMARY";
            }
            ((qss)k.i.a()).b(new Object[] { s2, s });
        }
    }
    
    public final void r(final aaco aaco) {
        tcl.k();
        final amxb k = aaco.k;
        if (k == null) {
            return;
        }
        final aowb y = y(k);
        if (y == null) {
            return;
        }
        for (final vif vif : new vig(aamn.q(y, afgh.r(480))).b) {
            this.p(vif.a(), this.g(aaco.a, vif.a()));
        }
    }
    
    public final void s(final String s, final aowb aowb) {
        tcl.k();
        for (final vif vif : new vig(aamn.q(aowb, afgh.s(240, 480))).b) {
            this.p(vif.a(), this.k(s, vif.a()));
        }
    }
    
    public final boolean u() {
        return this.d.R() && this.c.k(this.d.y(this.c));
    }
    
    public final void z(final agr agr) {
        tcl.k();
        final Object e = agr.e;
        amvm amvm;
        if ((amvm = ((amvn)agr.d).c) == null) {
            amvm = amvm.a;
        }
        aowb aowb;
        if ((aowb = amvm.d) == null) {
            aowb = aowb.a;
        }
        if (((List)this.a((String)e, new vig(aowb)).b).isEmpty()) {
            final String s = (String)agr.e;
            twd.n(s);
            w(this.A(s));
            tcl.k();
            amvm amvm2;
            if ((amvm2 = ((amvn)agr.d).c) == null) {
                amvm2 = amvm.a;
            }
            aowb aowb2;
            if ((aowb2 = amvm2.d) == null) {
                aowb2 = aowb.a;
            }
            for (final vif vif : new vig(aamn.q(aowb2, afgh.r(240))).b) {
                this.p(vif.a(), this.e((String)agr.e, vif.a()));
            }
        }
    }
}
