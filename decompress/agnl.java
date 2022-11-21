import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import android.os.RemoteException;
import android.content.ComponentName;
import android.os.IInterface;
import android.os.Parcel;
import android.media.AudioTrack;
import com.google.common.util.concurrent.ListenableFuture;
import android.net.Uri$Builder;
import android.net.Uri;
import java.lang.annotation.Annotation;
import java.util.Collections;
import org.json.JSONException;
import java.io.IOException;
import java.io.FileOutputStream;
import org.json.JSONObject;
import java.io.File;
import j$.util.Map$_EL;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.HashMap;
import android.content.Context;
import android.app.Service;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnl
{
    public Object a;
    public final Object b;
    
    public agnl() {
        this.b = new CopyOnWriteArraySet();
    }
    
    public agnl(final abpl b) {
        this.b = b;
    }
    
    public agnl(final acoe b, final byte[] array) {
        this.b = b;
        this.a = null;
    }
    
    public agnl(final adkp b) {
        this.b = b;
    }
    
    public agnl(final agjs b) {
        this.b = b;
    }
    
    public agnl(final Service b) {
        this.b = b;
    }
    
    public agnl(final Context b) {
        this.b = b;
    }
    
    public agnl(final String b) {
        this.a = null;
        this.b = b;
    }
    
    public agnl(final String s, final String s2) {
        final HashMap b = new HashMap();
        this.b = b;
        if (s != null) {
            q(b, s);
        }
        if (s2 != null && !s2.equals(s)) {
            q(b, s2);
        }
    }
    
    public agnl(final Executor executor) {
        this.b = afxr.f(executor);
    }
    
    public agnl(final mba b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
    }
    
    public static aevl e(final aevk aevk, final aevl aevl, final aevl aevl2) {
        return new aeus(aevl2, aevl, aevk);
    }
    
    public static void q(final Map map, final String s) {
        map.put(s, (int)Map$_EL.getOrDefault(map, (Object)s, (Object)0) + 1);
    }
    
    private final File v() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    final File filesDir = ((agjs)this.b).a().getFilesDir();
                    final String h = ((agjs)this.b).h();
                    final StringBuilder sb = new StringBuilder("PersistedInstallation.");
                    sb.append(h);
                    sb.append(".json");
                    this.a = new File(filesDir, sb.toString());
                }
            }
        }
        return (File)this.a;
    }
    
    private final Context w() {
        monitorenter(this);
        try {
            if (this.a == null) {
                Object a = aha.a((Context)this.b);
                if (a == null) {
                    a = this.b;
                }
                this.a = a;
            }
            final Context context = (Context)this.a;
            monitorexit(this);
            return context;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final File x(final int n, final int n2) {
        Object o = this.b;
        if (n2 == 1) {
            o = this.w();
        }
        if (n - 1 != 0) {
            return ((Context)o).getCacheDir();
        }
        return ((Context)o).getFilesDir();
    }
    
    public final agnn a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //     7: astore          8
        //     9: sipush          16384
        //    12: newarray        B
        //    14: astore          6
        //    16: new             Ljava/io/FileInputStream;
        //    19: astore          7
        //    21: aload           7
        //    23: aload_0        
        //    24: invokespecial   agnl.v:()Ljava/io/File;
        //    27: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    30: aload           7
        //    32: aload           6
        //    34: iconst_0       
        //    35: sipush          16384
        //    38: invokevirtual   java/io/FileInputStream.read:([BII)I
        //    41: istore_1       
        //    42: iload_1        
        //    43: ifge            69
        //    46: new             Lorg/json/JSONObject;
        //    49: astore          6
        //    51: aload           6
        //    53: aload           8
        //    55: invokevirtual   java/io/ByteArrayOutputStream.toString:()Ljava/lang/String;
        //    58: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    61: aload           7
        //    63: invokevirtual   java/io/FileInputStream.close:()V
        //    66: goto            138
        //    69: aload           8
        //    71: aload           6
        //    73: iconst_0       
        //    74: iload_1        
        //    75: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //    78: goto            30
        //    81: astore          6
        //    83: aload           7
        //    85: invokevirtual   java/io/FileInputStream.close:()V
        //    88: goto            124
        //    91: astore          7
        //    93: ldc             Ljava/lang/Throwable;.class
        //    95: ldc             "addSuppressed"
        //    97: iconst_1       
        //    98: anewarray       Ljava/lang/Class;
        //   101: dup            
        //   102: iconst_0       
        //   103: ldc             Ljava/lang/Throwable;.class
        //   105: aastore        
        //   106: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   109: aload           6
        //   111: iconst_1       
        //   112: anewarray       Ljava/lang/Object;
        //   115: dup            
        //   116: iconst_0       
        //   117: aload           7
        //   119: aastore        
        //   120: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   123: pop            
        //   124: aload           6
        //   126: athrow         
        //   127: astore          6
        //   129: new             Lorg/json/JSONObject;
        //   132: dup            
        //   133: invokespecial   org/json/JSONObject.<init>:()V
        //   136: astore          6
        //   138: aload           6
        //   140: ldc             "Fid"
        //   142: aconst_null    
        //   143: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   146: astore          9
        //   148: aload           6
        //   150: ldc             "Status"
        //   152: iconst_0       
        //   153: invokevirtual   org/json/JSONObject.optInt:(Ljava/lang/String;I)I
        //   156: istore_1       
        //   157: aload           6
        //   159: ldc             "AuthToken"
        //   161: aconst_null    
        //   162: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   165: astore          7
        //   167: aload           6
        //   169: ldc             "RefreshToken"
        //   171: aconst_null    
        //   172: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   175: astore          8
        //   177: aload           6
        //   179: ldc             "TokenCreationEpochInSecs"
        //   181: lconst_0       
        //   182: invokevirtual   org/json/JSONObject.optLong:(Ljava/lang/String;J)J
        //   185: lstore          4
        //   187: aload           6
        //   189: ldc             "ExpiresInSecs"
        //   191: lconst_0       
        //   192: invokevirtual   org/json/JSONObject.optLong:(Ljava/lang/String;J)J
        //   195: lstore_2       
        //   196: aload           6
        //   198: ldc             "FisError"
        //   200: aconst_null    
        //   201: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   204: astore          10
        //   206: invokestatic    agnn.a:()Lagnm;
        //   209: astore          6
        //   211: aload           6
        //   213: aload           9
        //   215: putfield        agnm.a:Ljava/lang/String;
        //   218: aload           6
        //   220: iconst_5       
        //   221: newarray        I
        //   223: dup            
        //   224: iconst_0       
        //   225: iconst_1       
        //   226: iastore        
        //   227: dup            
        //   228: iconst_1       
        //   229: iconst_2       
        //   230: iastore        
        //   231: dup            
        //   232: iconst_2       
        //   233: iconst_3       
        //   234: iastore        
        //   235: dup            
        //   236: iconst_3       
        //   237: iconst_4       
        //   238: iastore        
        //   239: dup            
        //   240: iconst_4       
        //   241: iconst_5       
        //   242: iastore        
        //   243: iload_1        
        //   244: iaload         
        //   245: invokevirtual   agnm.c:(I)V
        //   248: aload           6
        //   250: aload           7
        //   252: putfield        agnm.b:Ljava/lang/String;
        //   255: aload           6
        //   257: aload           8
        //   259: putfield        agnm.c:Ljava/lang/String;
        //   262: aload           6
        //   264: lload           4
        //   266: invokevirtual   agnm.d:(J)V
        //   269: aload           6
        //   271: lload_2        
        //   272: invokevirtual   agnm.b:(J)V
        //   275: aload           6
        //   277: aload           10
        //   279: putfield        agnm.d:Ljava/lang/String;
        //   282: aload           6
        //   284: invokevirtual   agnm.a:()Lagnn;
        //   287: areturn        
        //   288: astore          7
        //   290: goto            124
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  16     30     127    138    Ljava/io/IOException;
        //  16     30     127    138    Lorg/json/JSONException;
        //  30     42     81     127    Any
        //  46     61     81     127    Any
        //  61     66     127    138    Ljava/io/IOException;
        //  61     66     127    138    Lorg/json/JSONException;
        //  69     78     81     127    Any
        //  83     88     91     124    Any
        //  93     124    288    293    Ljava/lang/Exception;
        //  124    127    127    138    Ljava/io/IOException;
        //  124    127    127    138    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
    
    public final void b(final agnn agnn) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("Fid", (Object)agnn.a);
            final int g = agnn.g;
            if (g == 0) {
                throw null;
            }
            jsonObject.put("Status", g - 1);
            jsonObject.put("AuthToken", (Object)agnn.b);
            jsonObject.put("RefreshToken", (Object)agnn.c);
            jsonObject.put("TokenCreationEpochInSecs", agnn.e);
            jsonObject.put("ExpiresInSecs", agnn.d);
            jsonObject.put("FisError", (Object)agnn.f);
            final File tempFile = File.createTempFile("PersistedInstallation", "tmp", ((agjs)this.b).a().getFilesDir());
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            fileOutputStream.write(jsonObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (tempFile.renameTo(this.v())) {
                return;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        catch (final JSONException | IOException ex) {}
    }
    
    public final aglr c() {
        final Object b = this.b;
        final Object a = this.a;
        Map<Object, Object> map;
        if (a == null) {
            map = Collections.emptyMap();
        }
        else {
            map = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>((Map<?, ?>)a));
        }
        return new aglr((String)b, (Map)map);
    }
    
    public final void d(final Annotation annotation) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        ((Map<Class<aglz>, Annotation>)this.a).put(aglz.class, annotation);
    }
    
    public final String f(final String s) {
        final String simpleName = this.b.getClass().getSimpleName();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" ");
        sb.append(simpleName);
        return sb.toString();
    }
    
    public final afhk g() {
        return afhk.v(this.x(1, 2), this.x(1, 1), this.x(2, 2), this.x(2, 1));
    }
    
    public final File h(final aese aese) {
        return this.x(aese.a, aese.b);
    }
    
    public final Uri i(final aese aese, String s) {
        final int a = aese.a;
        String s2;
        if (aese.b == 1) {
            s2 = "directboot-";
        }
        else {
            s2 = "";
        }
        String s3;
        if (a - 1 != 0) {
            s3 = s2.concat("cache");
        }
        else {
            s3 = s2.concat("files");
        }
        final String s4 = s = afbj.e(s);
        if (s4.startsWith("/")) {
            s = s4.substring(1);
        }
        final Uri$Builder authority = new Uri$Builder().scheme("android").authority(((Context)this.b).getPackageName());
        final StringBuilder sb = new StringBuilder("/");
        sb.append(s3);
        sb.append("/");
        sb.append(s);
        return authority.path(sb.toString()).build();
    }
    
    public final void j() {
        this.a = null;
        adme.i(adme.q((adkp)this.b));
    }
    
    public final void k(final ajlo j, final int n) {
        if (j == null) {
            return;
        }
        final Object b = this.b;
        final wzh wzh = new wzh(n - 1, 18);
        final ahcr builder = ((ahcz)ajve.a).createBuilder();
        builder.copyOnWrite();
        final ajve ajve = (ajve)builder.instance;
        ajve.j = j;
        ajve.b |= 0x800;
        wzh.a = (ajve)builder.build();
        ((acoe)b).d(wzh, ajvy.r);
    }
    
    public final ListenableFuture l(final ahbt ahbt) {
        if (this.a == null) {
            try {
                this.a = new AudioTrack(3, 16000, 4, 2, 2048, 1);
            }
            catch (final IllegalArgumentException ex) {
                this.a = null;
            }
            if (this.n()) {
                ((AudioTrack)this.a).play();
            }
        }
        return afxr.q((afvp)new qfx(this, ahbt, 20, (byte[])null, (byte[])null), (Executor)this.b);
    }
    
    public final ListenableFuture m() {
        return afxr.q((afvp)new qrs(this, 10, (byte[])null, (byte[])null), (Executor)this.b);
    }
    
    public final boolean n() {
        final Object a = this.a;
        return a != null && ((AudioTrack)a).getState() == 1;
    }
    
    public final ocl o() {
        final Object b = this.b;
        final ocm ocm = new ocm();
        final mba mba = (mba)b;
        final Object a = mba.a;
        final ao ao = new ao((li)ocm, (byte[])null);
        final ajc ajc2;
        Label_0177: {
            Label_0175: {
                try {
                    final Object a2 = ((kh)a).a;
                    Object o = Parcel.obtain();
                    Object obtain = Parcel.obtain();
                    try {
                        ((Parcel)o).writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                        ((Parcel)o).writeStrongInterface((IInterface)ao);
                        ((aq)a2).a.transact(3, (Parcel)o, (Parcel)obtain, 0);
                        ((Parcel)obtain).readException();
                        final int int1 = ((Parcel)obtain).readInt();
                        ((Parcel)obtain).recycle();
                        ((Parcel)o).recycle();
                        if (int1 == 0) {
                            break Label_0175;
                        }
                        obtain = a;
                        o = ((kh)obtain).a;
                        obtain = ((kh)obtain).b;
                        final ajc ajc = new ajc((aq)o, (ap)ao, (ComponentName)obtain);
                        break Label_0177;
                    }
                    finally {
                        ((Parcel)obtain).recycle();
                        ((Parcel)o).recycle();
                    }
                }
                catch (final RemoteException ex) {}
            }
            ajc2 = null;
        }
        if (ajc2 == null) {
            return null;
        }
        return new ocl(mba, ajc2, ocm, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ocl p() {
        if (this.a == null) {
            this.a = this.o();
        }
        return (ocl)this.a;
    }
    
    public final boolean r(final fqs fqs) {
        return aexq.c(this.a, fqs);
    }
    
    public final void s() {
        synchronized (this) {
            final Object a = this.a;
            if (a != null) {
                ((abwn)a).J();
            }
            this.a = null;
        }
    }
    
    public final void t(final DirectorSavedState directorSavedState, final abla abla) {
        synchronized (this) {
            final Object a = this.a;
            if (a != null) {
                ((abwn)a).J();
            }
            this.a = ((abpl)this.b).a().b(directorSavedState, abla);
        }
    }
    
    public final void u(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla) {
        synchronized (this) {
            final Object a = this.a;
            if (a != null) {
                ((abwn)a).J();
            }
            this.a = ((abpl)this.b).a().a(playbackStartDescriptor, abla);
        }
    }
}
