import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlt implements acya
{
    private static final long a;
    private final SharedPreferences b;
    private final Context c;
    private boolean d;
    private aezp e;
    private aezp f;
    private final vaf g;
    private final arwh h;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(60L);
        TimeUnit.MINUTES.toSeconds(300L);
    }
    
    public jlt(final Context c, final SharedPreferences b, final vaf g, final arwh h, final byte[] array, final byte[] array2) {
        this.c = c;
        b.getClass();
        this.b = b;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        final aeyo a = aeyo.a;
        this.e = (aezp)a;
        this.f = (aezp)a;
    }
    
    private final aezp o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        jlt.d:Z
        //     4: ifne            340
        //     7: aload_0        
        //     8: getfield        jlt.e:Laezp;
        //    11: invokevirtual   aezp.h:()Z
        //    14: ifne            340
        //    17: aload_0        
        //    18: getfield        jlt.c:Landroid/content/Context;
        //    21: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    24: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    27: astore_3       
        //    28: getstatic       java/io/File.separator:Ljava/lang/String;
        //    31: astore          4
        //    33: new             Ljava/lang/StringBuilder;
        //    36: astore          5
        //    38: aload           5
        //    40: invokespecial   java/lang/StringBuilder.<init>:()V
        //    43: aload           5
        //    45: aload_3        
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: pop            
        //    50: aload           5
        //    52: aload           4
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: pop            
        //    58: aload           5
        //    60: ldc             "ondevicesuggest"
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: pop            
        //    66: aload           5
        //    68: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    71: astore_3       
        //    72: new             Ljava/io/File;
        //    75: astore          4
        //    77: aload           4
        //    79: aload_3        
        //    80: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    83: aload           4
        //    85: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    88: ifnonnull       98
        //    91: getstatic       aeyo.a:Laeyo;
        //    94: astore_3       
        //    95: goto            297
        //    98: aload           4
        //   100: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   103: astore          9
        //   105: aload           9
        //   107: arraylength    
        //   108: istore_2       
        //   109: aconst_null    
        //   110: astore          4
        //   112: aconst_null    
        //   113: astore_3       
        //   114: iconst_0       
        //   115: istore_1       
        //   116: iload_1        
        //   117: iload_2        
        //   118: if_icmpge       268
        //   121: aload           9
        //   123: iload_1        
        //   124: aaload         
        //   125: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   128: astore          7
        //   130: aload           7
        //   132: invokestatic    aqsz.c:(Ljava/lang/String;)Ljava/lang/String;
        //   135: pop            
        //   136: aload           7
        //   138: aload           7
        //   140: bipush          47
        //   142: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   145: iconst_1       
        //   146: iadd           
        //   147: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   150: ldc             "_"
        //   152: iconst_m1      
        //   153: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   156: astore          5
        //   158: aload           5
        //   160: arraylength    
        //   161: bipush          6
        //   163: if_icmpne       242
        //   166: aload           5
        //   168: iconst_2       
        //   169: aaload         
        //   170: invokevirtual   java/lang/String.length:()I
        //   173: bipush          10
        //   175: if_icmpne       242
        //   178: aload           5
        //   180: iconst_2       
        //   181: aaload         
        //   182: iconst_4       
        //   183: invokevirtual   java/lang/String.charAt:(I)C
        //   186: bipush          45
        //   188: if_icmpne       242
        //   191: aload           5
        //   193: iconst_2       
        //   194: aaload         
        //   195: bipush          7
        //   197: invokevirtual   java/lang/String.charAt:(I)C
        //   200: bipush          45
        //   202: if_icmpne       242
        //   205: aload           5
        //   207: iconst_2       
        //   208: aaload         
        //   209: astore          8
        //   211: aload_3        
        //   212: ifnull          231
        //   215: aload           4
        //   217: astore          5
        //   219: aload_3        
        //   220: astore          6
        //   222: aload           8
        //   224: aload_3        
        //   225: invokevirtual   java/lang/String.compareTo:(Ljava/lang/String;)I
        //   228: ifle            255
        //   231: aload           7
        //   233: astore          5
        //   235: aload           8
        //   237: astore          6
        //   239: goto            255
        //   242: new             Laqwi;
        //   245: astore          5
        //   247: aload           5
        //   249: invokespecial   aqwi.<init>:()V
        //   252: aload           5
        //   254: athrow         
        //   255: iinc            1, 1
        //   258: aload           5
        //   260: astore          4
        //   262: aload           6
        //   264: astore_3       
        //   265: goto            116
        //   268: aload           4
        //   270: ifnull          293
        //   273: aload           4
        //   275: invokestatic    aezp.k:(Ljava/lang/Object;)Laezp;
        //   278: astore_3       
        //   279: goto            297
        //   282: astore_3       
        //   283: goto            287
        //   286: astore_3       
        //   287: ldc             "MainAppFileBasedOnDeviceSuggestConfig: Failed to delete the old index files."
        //   289: aload_3        
        //   290: invokestatic    ttr.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   293: getstatic       aeyo.a:Laeyo;
        //   296: astore_3       
        //   297: aload_0        
        //   298: aload_3        
        //   299: putfield        jlt.e:Laezp;
        //   302: aload_3        
        //   303: invokevirtual   aezp.h:()Z
        //   306: ifeq            340
        //   309: aload_0        
        //   310: aload_0        
        //   311: getfield        jlt.e:Laezp;
        //   314: invokevirtual   aezp.c:()Ljava/lang/Object;
        //   317: checkcast       Ljava/lang/String;
        //   320: invokestatic    aqsz.c:(Ljava/lang/String;)Ljava/lang/String;
        //   323: invokestatic    aezp.k:(Ljava/lang/Object;)Laezp;
        //   326: putfield        jlt.f:Laezp;
        //   329: goto            340
        //   332: astore_3       
        //   333: aload_0        
        //   334: getstatic       aeyo.a:Laeyo;
        //   337: putfield        jlt.e:Laezp;
        //   340: aload_0        
        //   341: iconst_1       
        //   342: putfield        jlt.d:Z
        //   345: aload_0        
        //   346: getfield        jlt.e:Laezp;
        //   349: areturn        
        //   350: astore          5
        //   352: aload           4
        //   354: astore          5
        //   356: aload_3        
        //   357: astore          6
        //   359: goto            255
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  17     72     332    340    Laqwi;
        //  72     95     286    287    Ljava/lang/SecurityException;
        //  72     95     282    286    Ljava/lang/NullPointerException;
        //  72     95     332    340    Laqwi;
        //  98     109    286    287    Ljava/lang/SecurityException;
        //  98     109    282    286    Ljava/lang/NullPointerException;
        //  98     109    332    340    Laqwi;
        //  121    130    286    287    Ljava/lang/SecurityException;
        //  121    130    282    286    Ljava/lang/NullPointerException;
        //  121    130    332    340    Laqwi;
        //  130    205    350    362    Laqwi;
        //  130    205    286    287    Ljava/lang/SecurityException;
        //  130    205    282    286    Ljava/lang/NullPointerException;
        //  222    231    350    362    Laqwi;
        //  222    231    286    287    Ljava/lang/SecurityException;
        //  222    231    282    286    Ljava/lang/NullPointerException;
        //  242    255    350    362    Laqwi;
        //  242    255    286    287    Ljava/lang/SecurityException;
        //  242    255    282    286    Ljava/lang/NullPointerException;
        //  273    279    286    287    Ljava/lang/SecurityException;
        //  273    279    282    286    Ljava/lang/NullPointerException;
        //  273    279    332    340    Laqwi;
        //  287    293    332    340    Laqwi;
        //  293    297    332    340    Laqwi;
        //  297    329    332    340    Laqwi;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0231:
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
    
    public final int a() {
        final aipx b = this.g.b();
        int j;
        if ((b.b & 0x10) != 0x0) {
            alxp alxp;
            if ((alxp = b.e) == null) {
                alxp = alxp.a;
            }
            j = alxp.J;
        }
        else {
            j = -1;
        }
        if (j > 0) {
            return j;
        }
        return 10;
    }
    
    public final int b() {
        final aipx b = this.g.b();
        int k;
        if ((b.b & 0x10) != 0x0) {
            alxp alxp;
            if ((alxp = b.e) == null) {
                alxp = alxp.a;
            }
            k = alxp.K;
        }
        else {
            k = -1;
        }
        if (k > 0) {
            return k;
        }
        return 2;
    }
    
    public final int c() {
        final aipx b = this.g.b();
        int i;
        if ((b.b & 0x10) != 0x0) {
            alxp alxp;
            if ((alxp = b.e) == null) {
                alxp = alxp.a;
            }
            i = alxp.I;
        }
        else {
            i = -1;
        }
        if (i > 0) {
            return i;
        }
        return 300;
    }
    
    public final long d() {
        long long1;
        try {
            long1 = Long.parseLong(this.b.getString("on_device_suggest_download_earliest_secs", "-1"));
        }
        catch (final NumberFormatException ex) {
            long1 = -1L;
        }
        if (long1 == -1L) {
            return jlt.a;
        }
        return long1;
    }
    
    public final aezp e() {
        return this.o();
    }
    
    public final aezp f() {
        anxo anxo;
        if ((anxo = this.h.f().n) == null) {
            anxo = anxo.a;
        }
        return aezp.k((Object)anxo.d);
    }
    
    public final aezp g() {
        return this.o();
    }
    
    public final aezp h() {
        this.o();
        return this.f;
    }
    
    public final void i(final String s) {
        this.e = aezp.k((Object)s);
    }
    
    public final void j(final String s) {
        this.f = aezp.k((Object)s);
    }
    
    public final boolean k() {
        anxo anxo;
        if ((anxo = this.h.f().n) == null) {
            anxo = anxo.a;
        }
        return anxo.c;
    }
    
    public final boolean l() {
        anxo anxo;
        if ((anxo = this.h.f().n) == null) {
            anxo = anxo.a;
        }
        return anxo.e;
    }
    
    public final void m() {
    }
    
    public final void n() {
        try {
            Long.parseLong(this.b.getString("on_device_suggest_download_latest_secs", "-1"));
        }
        catch (final NumberFormatException ex) {}
    }
}
