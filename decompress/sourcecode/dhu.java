import java.io.InputStream;
import android.content.Context;
import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhu implements ddx
{
    private Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;
    
    public dhu(final Uri d, final der c, final int b) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public dhu(final File c, final dhv d, final int b) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static dhu b(final Context context, final Uri uri, final deq deq) {
        return new dhu(uri, new der(dbo.b(context).b.a().b(), deq, dbo.b(context).c, context.getContentResolver()), 1);
    }
    
    public final Class a() {
        if (this.b != 0) {
            return InputStream.class;
        }
        return ((dhv)this.d).a();
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dhu.b:I
        //     4: ifeq            24
        //     7: aload_0        
        //     8: getfield        dhu.a:Ljava/lang/Object;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnull          23
        //    16: aload_1        
        //    17: checkcast       Ljava/io/InputStream;
        //    20: invokevirtual   java/io/InputStream.close:()V
        //    23: return         
        //    24: aload_0        
        //    25: getfield        dhu.a:Ljava/lang/Object;
        //    28: astore_1       
        //    29: aload_1        
        //    30: ifnull          43
        //    33: aload_0        
        //    34: getfield        dhu.d:Ljava/lang/Object;
        //    37: aload_1        
        //    38: invokeinterface dhv.c:(Ljava/lang/Object;)V
        //    43: return         
        //    44: astore_1       
        //    45: goto            23
        //    48: astore_1       
        //    49: goto            43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     23     44     48     Ljava/io/IOException;
        //  33     43     48     52     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public final void f(final dbz p0, final ddw p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dhu.b:I
        //     4: ifeq            488
        //     7: aload_0        
        //     8: getfield        dhu.c:Ljava/lang/Object;
        //    11: astore_3       
        //    12: aload_0        
        //    13: getfield        dhu.d:Ljava/lang/Object;
        //    16: astore          4
        //    18: aconst_null    
        //    19: astore          5
        //    21: aconst_null    
        //    22: astore          6
        //    24: aconst_null    
        //    25: astore          7
        //    27: aload_3        
        //    28: checkcast       Lder;
        //    31: getfield        der.a:Ljava/lang/Object;
        //    34: aload           4
        //    36: checkcast       Landroid/net/Uri;
        //    39: invokeinterface deq.a:(Landroid/net/Uri;)Landroid/database/Cursor;
        //    44: astore_1       
        //    45: aload_1        
        //    46: ifnull          89
        //    49: aload_1        
        //    50: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    55: ifeq            89
        //    58: aload_1        
        //    59: iconst_0       
        //    60: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    65: astore          8
        //    67: aload_1        
        //    68: invokeinterface android/database/Cursor.close:()V
        //    73: aload           8
        //    75: astore_1       
        //    76: goto            132
        //    79: astore          8
        //    81: goto            107
        //    84: astore          8
        //    86: goto            123
        //    89: aload_1        
        //    90: ifnull          130
        //    93: aload_1        
        //    94: invokeinterface android/database/Cursor.close:()V
        //    99: goto            130
        //   102: astore          8
        //   104: aload           7
        //   106: astore_1       
        //   107: aload_1        
        //   108: ifnull          117
        //   111: aload_1        
        //   112: invokeinterface android/database/Cursor.close:()V
        //   117: aload           8
        //   119: athrow         
        //   120: astore_1       
        //   121: aconst_null    
        //   122: astore_1       
        //   123: aload_1        
        //   124: ifnull          130
        //   127: goto            93
        //   130: aconst_null    
        //   131: astore_1       
        //   132: aload_1        
        //   133: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   136: ifeq            144
        //   139: aconst_null    
        //   140: astore_1       
        //   141: goto            275
        //   144: new             Ljava/io/File;
        //   147: astore          8
        //   149: aload           8
        //   151: aload_1        
        //   152: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   155: aload           8
        //   157: invokevirtual   java/io/File.exists:()Z
        //   160: ifeq            139
        //   163: aload           8
        //   165: invokevirtual   java/io/File.length:()J
        //   168: lconst_0       
        //   169: lcmp           
        //   170: ifle            139
        //   173: aload           8
        //   175: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   178: astore          8
        //   180: aload_3        
        //   181: checkcast       Lder;
        //   184: getfield        der.c:Ljava/lang/Object;
        //   187: checkcast       Landroid/content/ContentResolver;
        //   190: aload           8
        //   192: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   195: astore_1       
        //   196: goto            275
        //   199: astore_1       
        //   200: new             Ljava/io/FileNotFoundException;
        //   203: astore          7
        //   205: aload           4
        //   207: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   210: astore          5
        //   212: aload           8
        //   214: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   217: astore          8
        //   219: new             Ljava/lang/StringBuilder;
        //   222: astore          6
        //   224: aload           6
        //   226: ldc             "NPE opening uri: "
        //   228: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   231: aload           6
        //   233: aload           5
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: pop            
        //   239: aload           6
        //   241: ldc             " -> "
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: pop            
        //   247: aload           6
        //   249: aload           8
        //   251: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   254: pop            
        //   255: aload           7
        //   257: aload           6
        //   259: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   262: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   265: aload           7
        //   267: aload_1        
        //   268: invokevirtual   java/io/FileNotFoundException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   271: checkcast       Ljava/io/FileNotFoundException;
        //   274: athrow         
        //   275: aload_1        
        //   276: ifnull          439
        //   279: aload_0        
        //   280: getfield        dhu.c:Ljava/lang/Object;
        //   283: astore          4
        //   285: aload_0        
        //   286: getfield        dhu.d:Ljava/lang/Object;
        //   289: astore          9
        //   291: aload           5
        //   293: astore          7
        //   295: aload           6
        //   297: astore          8
        //   299: aload           4
        //   301: checkcast       Lder;
        //   304: getfield        der.c:Ljava/lang/Object;
        //   307: astore_3       
        //   308: aload           5
        //   310: astore          7
        //   312: aload           6
        //   314: astore          8
        //   316: aload           9
        //   318: checkcast       Landroid/net/Uri;
        //   321: astore          9
        //   323: aload           5
        //   325: astore          7
        //   327: aload           6
        //   329: astore          8
        //   331: aload_3        
        //   332: checkcast       Landroid/content/ContentResolver;
        //   335: aload           9
        //   337: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   340: astore          5
        //   342: aload           5
        //   344: astore          7
        //   346: aload           5
        //   348: astore          8
        //   350: aload           4
        //   352: checkcast       Lder;
        //   355: getfield        der.d:Ljava/lang/Object;
        //   358: aload           5
        //   360: aload           4
        //   362: checkcast       Lder;
        //   365: getfield        der.b:Ljava/lang/Object;
        //   368: invokestatic    cjz.h:(Ljava/util/List;Ljava/io/InputStream;Ldgd;)I
        //   371: istore          10
        //   373: iload           10
        //   375: istore          11
        //   377: aload           5
        //   379: ifnull          442
        //   382: aload           5
        //   384: invokevirtual   java/io/InputStream.close:()V
        //   387: iload           10
        //   389: istore          11
        //   391: goto            442
        //   394: astore          8
        //   396: iload           10
        //   398: istore          11
        //   400: goto            442
        //   403: astore_1       
        //   404: goto            412
        //   407: astore          7
        //   409: goto            424
        //   412: aload           7
        //   414: ifnull          422
        //   417: aload           7
        //   419: invokevirtual   java/io/InputStream.close:()V
        //   422: aload_1        
        //   423: athrow         
        //   424: aload           8
        //   426: ifnull          439
        //   429: aload           8
        //   431: invokevirtual   java/io/InputStream.close:()V
        //   434: goto            439
        //   437: astore          8
        //   439: iconst_m1      
        //   440: istore          11
        //   442: aload_1        
        //   443: astore          8
        //   445: iload           11
        //   447: iconst_m1      
        //   448: if_icmpeq       464
        //   451: new             Lded;
        //   454: astore          8
        //   456: aload           8
        //   458: aload_1        
        //   459: iload           11
        //   461: invokespecial   ded.<init>:(Ljava/io/InputStream;I)V
        //   464: aload_0        
        //   465: aload           8
        //   467: putfield        dhu.a:Ljava/lang/Object;
        //   470: aload_2        
        //   471: aload           8
        //   473: invokeinterface ddw.b:(Ljava/lang/Object;)V
        //   478: return         
        //   479: astore_1       
        //   480: aload_2        
        //   481: aload_1        
        //   482: invokeinterface ddw.e:(Ljava/lang/Exception;)V
        //   487: return         
        //   488: aload_0        
        //   489: getfield        dhu.d:Ljava/lang/Object;
        //   492: aload_0        
        //   493: getfield        dhu.c:Ljava/lang/Object;
        //   496: checkcast       Ljava/io/File;
        //   499: invokeinterface dhv.b:(Ljava/io/File;)Ljava/lang/Object;
        //   504: astore_1       
        //   505: aload_0        
        //   506: aload_1        
        //   507: putfield        dhu.a:Ljava/lang/Object;
        //   510: aload_2        
        //   511: aload_1        
        //   512: invokeinterface ddw.b:(Ljava/lang/Object;)V
        //   517: return         
        //   518: astore_1       
        //   519: aload_2        
        //   520: aload_1        
        //   521: invokeinterface ddw.e:(Ljava/lang/Exception;)V
        //   526: return         
        //   527: astore          8
        //   529: goto            422
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      18     479    488    Ljava/io/FileNotFoundException;
        //  27     45     120    123    Ljava/lang/SecurityException;
        //  27     45     102    107    Any
        //  49     67     84     89     Ljava/lang/SecurityException;
        //  49     67     79     84     Any
        //  67     73     479    488    Ljava/io/FileNotFoundException;
        //  93     99     479    488    Ljava/io/FileNotFoundException;
        //  111    117    479    488    Ljava/io/FileNotFoundException;
        //  117    120    479    488    Ljava/io/FileNotFoundException;
        //  132    139    479    488    Ljava/io/FileNotFoundException;
        //  144    180    479    488    Ljava/io/FileNotFoundException;
        //  180    196    199    275    Ljava/lang/NullPointerException;
        //  180    196    479    488    Ljava/io/FileNotFoundException;
        //  200    275    479    488    Ljava/io/FileNotFoundException;
        //  279    291    479    488    Ljava/io/FileNotFoundException;
        //  299    308    407    439    Ljava/io/IOException;
        //  299    308    407    439    Ljava/lang/NullPointerException;
        //  299    308    403    424    Any
        //  316    323    407    439    Ljava/io/IOException;
        //  316    323    407    439    Ljava/lang/NullPointerException;
        //  316    323    403    424    Any
        //  331    342    407    439    Ljava/io/IOException;
        //  331    342    407    439    Ljava/lang/NullPointerException;
        //  331    342    403    424    Any
        //  350    373    407    439    Ljava/io/IOException;
        //  350    373    407    439    Ljava/lang/NullPointerException;
        //  350    373    403    424    Any
        //  382    387    394    403    Ljava/io/IOException;
        //  417    422    527    532    Ljava/io/IOException;
        //  422    424    479    488    Ljava/io/FileNotFoundException;
        //  429    434    437    439    Ljava/io/IOException;
        //  451    464    479    488    Ljava/io/FileNotFoundException;
        //  464    478    479    488    Ljava/io/FileNotFoundException;
        //  488    517    518    527    Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0422:
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
    
    public final int g() {
        return 1;
    }
    
    public final void lq() {
    }
}
