import java.security.GeneralSecurityException;
import dalvik.system.DexClassLoader;
import java.io.File;
import android.content.Context;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxs
{
    private static final HashMap c;
    public mxp a;
    public final Object b;
    private final Context d;
    private final mxe e;
    private final mvb f;
    private final qbo g;
    
    static {
        c = new HashMap();
    }
    
    public mxs(final Context d, final qbo g, final mxe e, final mvb f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = new Object();
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    private static long c(final long n) {
        return System.currentTimeMillis() - n;
    }
    
    private final Class d(adbl loadClass) {
        synchronized (this) {
            final String c = ((enx)((adbl)loadClass).d).c;
            final HashMap c2 = mxs.c;
            final Class clazz = c2.get(c);
            if (clazz != null) {
                return clazz;
            }
            try {
                if (this.f.a((File)((adbl)loadClass).b)) {
                    try {
                        final Object a = ((adbl)loadClass).a;
                        if (!((File)a).exists()) {
                            ((File)a).mkdirs();
                        }
                        loadClass = (IllegalArgumentException)new DexClassLoader(((File)((adbl)loadClass).b).getAbsolutePath(), ((File)a).getAbsolutePath(), (String)null, this.d.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                        c2.put(c, loadClass);
                        return (Class)loadClass;
                    }
                    catch (final IllegalArgumentException loadClass) {}
                    catch (final SecurityException loadClass) {}
                    catch (final ClassNotFoundException ex) {}
                    throw new mxr(2008, loadClass);
                }
                throw new mxr(2026, "VM did not pass signature verification");
            }
            catch (final GeneralSecurityException ex2) {
                throw new mxr(2026, ex2);
            }
        }
    }
    
    public final mxg a() {
        synchronized (this.b) {
            return (mxg)this.a;
        }
    }
    
    public final boolean b(final adbl p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: lstore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   mxs.d:(Ladbl;)Ljava/lang/Class;
        //     9: astore          4
        //    11: aload           4
        //    13: bipush          6
        //    15: anewarray       Ljava/lang/Class;
        //    18: dup            
        //    19: iconst_0       
        //    20: ldc             Landroid/content/Context;.class
        //    22: aastore        
        //    23: dup            
        //    24: iconst_1       
        //    25: ldc             Ljava/lang/String;.class
        //    27: aastore        
        //    28: dup            
        //    29: iconst_2       
        //    30: ldc             [B.class
        //    32: aastore        
        //    33: dup            
        //    34: iconst_3       
        //    35: ldc             Ljava/lang/Object;.class
        //    37: aastore        
        //    38: dup            
        //    39: iconst_4       
        //    40: ldc             Landroid/os/Bundle;.class
        //    42: aastore        
        //    43: dup            
        //    44: iconst_5       
        //    45: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    48: aastore        
        //    49: invokevirtual   java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    52: astore          5
        //    54: aload_0        
        //    55: getfield        mxs.d:Landroid/content/Context;
        //    58: astore          6
        //    60: aload_1        
        //    61: getfield        adbl.e:Ljava/lang/Object;
        //    64: astore          4
        //    66: aconst_null    
        //    67: astore          7
        //    69: aload           4
        //    71: ifnonnull       152
        //    74: aload_1        
        //    75: getfield        adbl.c:Ljava/lang/Object;
        //    78: astore          8
        //    80: new             Ljava/io/FileInputStream;
        //    83: astore          4
        //    85: aload           4
        //    87: aload           8
        //    89: checkcast       Ljava/io/File;
        //    92: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    95: aload           4
        //    97: invokestatic    agyc.B:(Ljava/io/InputStream;)Lagyc;
        //   100: invokevirtual   agyc.I:()[B
        //   103: astore          7
        //   105: aload           4
        //   107: invokestatic    mui.a:(Ljava/io/Closeable;)V
        //   110: aload           7
        //   112: astore          4
        //   114: goto            146
        //   117: astore_1       
        //   118: goto            126
        //   121: astore_1       
        //   122: aload           7
        //   124: astore          4
        //   126: aload           4
        //   128: invokestatic    mui.a:(Ljava/io/Closeable;)V
        //   131: aload_1        
        //   132: athrow         
        //   133: astore          4
        //   135: aconst_null    
        //   136: astore          4
        //   138: aload           4
        //   140: invokestatic    mui.a:(Ljava/io/Closeable;)V
        //   143: aconst_null    
        //   144: astore          4
        //   146: aload_1        
        //   147: aload           4
        //   149: putfield        adbl.e:Ljava/lang/Object;
        //   152: aload_1        
        //   153: getfield        adbl.e:Ljava/lang/Object;
        //   156: astore          4
        //   158: aload           4
        //   160: ifnonnull       169
        //   163: aconst_null    
        //   164: astore          4
        //   166: goto            189
        //   169: aload           4
        //   171: checkcast       [B
        //   174: arraylength    
        //   175: istore          9
        //   177: aload           4
        //   179: checkcast       [B
        //   182: iload           9
        //   184: invokestatic    java/util/Arrays.copyOf:([BI)[B
        //   187: astore          4
        //   189: new             Landroid/os/Bundle;
        //   192: astore          7
        //   194: aload           7
        //   196: invokespecial   android/os/Bundle.<init>:()V
        //   199: aload           5
        //   201: bipush          6
        //   203: anewarray       Ljava/lang/Object;
        //   206: dup            
        //   207: iconst_0       
        //   208: aload           6
        //   210: aastore        
        //   211: dup            
        //   212: iconst_1       
        //   213: ldc             "msa-r"
        //   215: aastore        
        //   216: dup            
        //   217: iconst_2       
        //   218: aload           4
        //   220: aastore        
        //   221: dup            
        //   222: iconst_3       
        //   223: aconst_null    
        //   224: aastore        
        //   225: dup            
        //   226: iconst_4       
        //   227: aload           7
        //   229: aastore        
        //   230: dup            
        //   231: iconst_5       
        //   232: iconst_2       
        //   233: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   236: aastore        
        //   237: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   240: astore          7
        //   242: new             Lmxp;
        //   245: astore          4
        //   247: aload           4
        //   249: aload           7
        //   251: aload_1        
        //   252: aload_0        
        //   253: getfield        mxs.g:Lqbo;
        //   256: aload_0        
        //   257: getfield        mxs.e:Lmxe;
        //   260: aconst_null    
        //   261: aconst_null    
        //   262: aconst_null    
        //   263: aconst_null    
        //   264: aconst_null    
        //   265: invokespecial   mxp.<init>:(Ljava/lang/Object;Ladbl;Lqbo;Lmxe;[B[B[B[B[B)V
        //   268: aload           4
        //   270: invokevirtual   mxp.g:()Z
        //   273: ifeq            402
        //   276: aload           4
        //   278: invokevirtual   mxp.e:()I
        //   281: istore          9
        //   283: iload           9
        //   285: ifne            364
        //   288: aload_0        
        //   289: getfield        mxs.b:Ljava/lang/Object;
        //   292: astore_1       
        //   293: aload_1        
        //   294: monitorenter   
        //   295: aload_0        
        //   296: getfield        mxs.a:Lmxp;
        //   299: astore          7
        //   301: aload           7
        //   303: ifnull          333
        //   306: aload           7
        //   308: invokevirtual   mxp.f:()V
        //   311: goto            333
        //   314: astore          7
        //   316: aload_0        
        //   317: getfield        mxs.e:Lmxe;
        //   320: aload           7
        //   322: getfield        mxr.a:I
        //   325: ldc2_w          -1
        //   328: aload           7
        //   330: invokevirtual   mxe.c:(IJLjava/lang/Exception;)V
        //   333: aload_0        
        //   334: aload           4
        //   336: putfield        mxs.a:Lmxp;
        //   339: aload_1        
        //   340: monitorexit    
        //   341: aload_0        
        //   342: getfield        mxs.e:Lmxe;
        //   345: sipush          3000
        //   348: lload_2        
        //   349: invokestatic    mxs.c:(J)J
        //   352: invokevirtual   mxe.d:(IJ)V
        //   355: iconst_1       
        //   356: ireturn        
        //   357: astore          4
        //   359: aload_1        
        //   360: monitorexit    
        //   361: aload           4
        //   363: athrow         
        //   364: new             Lmxr;
        //   367: astore_1       
        //   368: new             Ljava/lang/StringBuilder;
        //   371: astore          4
        //   373: aload           4
        //   375: ldc             "ci: "
        //   377: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   380: aload           4
        //   382: iload           9
        //   384: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   387: pop            
        //   388: aload_1        
        //   389: sipush          4001
        //   392: aload           4
        //   394: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   397: invokespecial   mxr.<init>:(ILjava/lang/String;)V
        //   400: aload_1        
        //   401: athrow         
        //   402: new             Lmxr;
        //   405: astore_1       
        //   406: aload_1        
        //   407: sipush          4000
        //   410: ldc             "init failed"
        //   412: invokespecial   mxr.<init>:(ILjava/lang/String;)V
        //   415: aload_1        
        //   416: athrow         
        //   417: astore          4
        //   419: new             Lmxr;
        //   422: astore_1       
        //   423: aload_1        
        //   424: sipush          2004
        //   427: aload           4
        //   429: invokespecial   mxr.<init>:(ILjava/lang/Throwable;)V
        //   432: aload_1        
        //   433: athrow         
        //   434: astore_1       
        //   435: aload_0        
        //   436: getfield        mxs.e:Lmxe;
        //   439: sipush          4010
        //   442: lload_2        
        //   443: invokestatic    mxs.c:(J)J
        //   446: aload_1        
        //   447: invokevirtual   mxe.c:(IJLjava/lang/Exception;)V
        //   450: goto            470
        //   453: astore_1       
        //   454: aload_0        
        //   455: getfield        mxs.e:Lmxe;
        //   458: aload_1        
        //   459: getfield        mxr.a:I
        //   462: lload_2        
        //   463: invokestatic    mxs.c:(J)J
        //   466: aload_1        
        //   467: invokevirtual   mxe.c:(IJLjava/lang/Exception;)V
        //   470: iconst_0       
        //   471: ireturn        
        //   472: astore          7
        //   474: goto            138
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      11     453    470    Lmxr;
        //  4      11     434    453    Ljava/lang/Exception;
        //  11     66     417    434    Ljava/lang/Exception;
        //  74     80     417    434    Ljava/lang/Exception;
        //  80     95     133    138    Ljava/io/IOException;
        //  80     95     121    126    Any
        //  95     105    472    477    Ljava/io/IOException;
        //  95     105    117    121    Any
        //  105    110    417    434    Ljava/lang/Exception;
        //  126    133    417    434    Ljava/lang/Exception;
        //  138    143    417    434    Ljava/lang/Exception;
        //  146    152    417    434    Ljava/lang/Exception;
        //  152    158    417    434    Ljava/lang/Exception;
        //  169    189    417    434    Ljava/lang/Exception;
        //  189    242    417    434    Ljava/lang/Exception;
        //  242    283    453    470    Lmxr;
        //  242    283    434    453    Ljava/lang/Exception;
        //  288    295    453    470    Lmxr;
        //  288    295    434    453    Ljava/lang/Exception;
        //  295    301    357    364    Any
        //  306    311    314    333    Lmxr;
        //  306    311    357    364    Any
        //  316    333    357    364    Any
        //  333    341    357    364    Any
        //  341    355    453    470    Lmxr;
        //  341    355    434    453    Ljava/lang/Exception;
        //  359    361    357    364    Any
        //  361    364    453    470    Lmxr;
        //  361    364    434    453    Ljava/lang/Exception;
        //  364    402    453    470    Lmxr;
        //  364    402    434    453    Ljava/lang/Exception;
        //  402    417    453    470    Lmxr;
        //  402    417    434    453    Ljava/lang/Exception;
        //  419    434    453    470    Lmxr;
        //  419    434    434    453    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 252, Size: 252
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
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
}
