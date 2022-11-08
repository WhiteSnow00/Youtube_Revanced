import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jks implements acvy
{
    private static final long a;
    private final SharedPreferences b;
    private final Context c;
    private boolean d;
    private aexq e;
    private aexq f;
    private final uyf g;
    private final arud h;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(60L);
        TimeUnit.MINUTES.toSeconds(300L);
    }
    
    public jks(final Context c, final SharedPreferences b, final uyf g, final arud h, final byte[] array, final byte[] array2) {
        this.c = c;
        b.getClass();
        this.b = b;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        final aewp a = aewp.a;
        this.e = a;
        this.f = a;
    }
    
    private final aexq o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        jks.d:Z
        //     4: ifne            316
        //     7: aload_0        
        //     8: getfield        jks.e:Laexq;
        //    11: invokevirtual   aexq.h:()Z
        //    14: ifne            316
        //    17: aload_0        
        //    18: getfield        jks.c:Landroid/content/Context;
        //    21: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    24: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    27: astore_1       
        //    28: getstatic       java/io/File.separator:Ljava/lang/String;
        //    31: astore_2       
        //    32: new             Ljava/lang/StringBuilder;
        //    35: astore_3       
        //    36: aload_3        
        //    37: invokespecial   java/lang/StringBuilder.<init>:()V
        //    40: aload_3        
        //    41: aload_1        
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: pop            
        //    46: aload_3        
        //    47: aload_2        
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: aload_3        
        //    53: ldc             "ondevicesuggest"
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: pop            
        //    59: aload_3        
        //    60: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    63: astore_3       
        //    64: new             Ljava/io/File;
        //    67: astore_2       
        //    68: aload_2        
        //    69: aload_3        
        //    70: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    73: aload_2        
        //    74: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    77: ifnonnull       87
        //    80: getstatic       aewp.a:Laewp;
        //    83: astore_2       
        //    84: goto            273
        //    87: aload_2        
        //    88: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    91: astore          4
        //    93: aload           4
        //    95: arraylength    
        //    96: istore          5
        //    98: aconst_null    
        //    99: astore_3       
        //   100: aconst_null    
        //   101: astore_2       
        //   102: iconst_0       
        //   103: istore          6
        //   105: iload           6
        //   107: iload           5
        //   109: if_icmpge       246
        //   112: aload           4
        //   114: iload           6
        //   116: aaload         
        //   117: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   120: astore          7
        //   122: aload           7
        //   124: invokestatic    aqqn.c:(Ljava/lang/String;)Ljava/lang/String;
        //   127: pop            
        //   128: aload           7
        //   130: aload           7
        //   132: bipush          47
        //   134: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   137: iconst_1       
        //   138: iadd           
        //   139: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   142: ldc             "_"
        //   144: iconst_m1      
        //   145: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   148: astore_1       
        //   149: aload_1        
        //   150: arraylength    
        //   151: bipush          6
        //   153: if_icmpne       225
        //   156: aload_1        
        //   157: iconst_2       
        //   158: aaload         
        //   159: invokevirtual   java/lang/String.length:()I
        //   162: bipush          10
        //   164: if_icmpne       225
        //   167: aload_1        
        //   168: iconst_2       
        //   169: aaload         
        //   170: iconst_4       
        //   171: invokevirtual   java/lang/String.charAt:(I)C
        //   174: bipush          45
        //   176: if_icmpne       225
        //   179: aload_1        
        //   180: iconst_2       
        //   181: aaload         
        //   182: bipush          7
        //   184: invokevirtual   java/lang/String.charAt:(I)C
        //   187: bipush          45
        //   189: if_icmpne       225
        //   192: aload_1        
        //   193: iconst_2       
        //   194: aaload         
        //   195: astore          8
        //   197: aload_2        
        //   198: ifnull          215
        //   201: aload_3        
        //   202: astore_1       
        //   203: aload_2        
        //   204: astore          9
        //   206: aload           8
        //   208: aload_2        
        //   209: invokevirtual   java/lang/String.compareTo:(Ljava/lang/String;)I
        //   212: ifle            235
        //   215: aload           7
        //   217: astore_1       
        //   218: aload           8
        //   220: astore          9
        //   222: goto            235
        //   225: new             Laqtv;
        //   228: astore_1       
        //   229: aload_1        
        //   230: invokespecial   aqtv.<init>:()V
        //   233: aload_1        
        //   234: athrow         
        //   235: iinc            6, 1
        //   238: aload_1        
        //   239: astore_3       
        //   240: aload           9
        //   242: astore_2       
        //   243: goto            105
        //   246: aload_3        
        //   247: ifnull          269
        //   250: aload_3        
        //   251: invokestatic    aexq.k:(Ljava/lang/Object;)Laexq;
        //   254: astore_2       
        //   255: goto            273
        //   258: astore_2       
        //   259: goto            263
        //   262: astore_2       
        //   263: ldc             "MainAppFileBasedOnDeviceSuggestConfig: Failed to delete the old index files."
        //   265: aload_2        
        //   266: invokestatic    trn.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   269: getstatic       aewp.a:Laewp;
        //   272: astore_2       
        //   273: aload_0        
        //   274: aload_2        
        //   275: putfield        jks.e:Laexq;
        //   278: aload_2        
        //   279: invokevirtual   aexq.h:()Z
        //   282: ifeq            316
        //   285: aload_0        
        //   286: aload_0        
        //   287: getfield        jks.e:Laexq;
        //   290: invokevirtual   aexq.c:()Ljava/lang/Object;
        //   293: checkcast       Ljava/lang/String;
        //   296: invokestatic    aqqn.c:(Ljava/lang/String;)Ljava/lang/String;
        //   299: invokestatic    aexq.k:(Ljava/lang/Object;)Laexq;
        //   302: putfield        jks.f:Laexq;
        //   305: goto            316
        //   308: astore_2       
        //   309: aload_0        
        //   310: getstatic       aewp.a:Laewp;
        //   313: putfield        jks.e:Laexq;
        //   316: aload_0        
        //   317: iconst_1       
        //   318: putfield        jks.d:Z
        //   321: aload_0        
        //   322: getfield        jks.e:Laexq;
        //   325: areturn        
        //   326: astore_1       
        //   327: aload_3        
        //   328: astore_1       
        //   329: aload_2        
        //   330: astore          9
        //   332: goto            235
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  17     64     308    316    Laqtv;
        //  64     84     262    263    Ljava/lang/SecurityException;
        //  64     84     258    262    Ljava/lang/NullPointerException;
        //  64     84     308    316    Laqtv;
        //  87     98     262    263    Ljava/lang/SecurityException;
        //  87     98     258    262    Ljava/lang/NullPointerException;
        //  87     98     308    316    Laqtv;
        //  112    122    262    263    Ljava/lang/SecurityException;
        //  112    122    258    262    Ljava/lang/NullPointerException;
        //  112    122    308    316    Laqtv;
        //  122    192    326    335    Laqtv;
        //  122    192    262    263    Ljava/lang/SecurityException;
        //  122    192    258    262    Ljava/lang/NullPointerException;
        //  206    215    326    335    Laqtv;
        //  206    215    262    263    Ljava/lang/SecurityException;
        //  206    215    258    262    Ljava/lang/NullPointerException;
        //  225    235    326    335    Laqtv;
        //  225    235    262    263    Ljava/lang/SecurityException;
        //  225    235    258    262    Ljava/lang/NullPointerException;
        //  250    255    262    263    Ljava/lang/SecurityException;
        //  250    255    258    262    Ljava/lang/NullPointerException;
        //  250    255    308    316    Laqtv;
        //  263    269    308    316    Laqtv;
        //  269    273    308    316    Laqtv;
        //  273    305    308    316    Laqtv;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0215:
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
        final ains b = this.g.b();
        int j;
        if ((b.b & 0x10) != 0x0) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            j = alvl.J;
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
        final ains b = this.g.b();
        int k;
        if ((b.b & 0x10) != 0x0) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            k = alvl.K;
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
        final ains b = this.g.b();
        int i;
        if ((b.b & 0x10) != 0x0) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            i = alvl.I;
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
            return jks.a;
        }
        return long1;
    }
    
    public final aexq e() {
        return this.o();
    }
    
    public final aexq f() {
        anvk anvk;
        if ((anvk = this.h.f().n) == null) {
            anvk = anvk.a;
        }
        return aexq.k((Object)anvk.d);
    }
    
    public final aexq g() {
        return this.o();
    }
    
    public final aexq h() {
        this.o();
        return this.f;
    }
    
    public final void i(final String s) {
        this.e = aexq.k((Object)s);
    }
    
    public final void j(final String s) {
        this.f = aexq.k((Object)s);
    }
    
    public final boolean k() {
        anvk anvk;
        if ((anvk = this.h.f().n) == null) {
            anvk = anvk.a;
        }
        return anvk.c;
    }
    
    public final boolean l() {
        anvk anvk;
        if ((anvk = this.h.f().n) == null) {
            anvk = anvk.a;
        }
        return anvk.e;
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
