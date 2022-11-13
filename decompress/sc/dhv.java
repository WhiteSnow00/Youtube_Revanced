import java.io.InputStream;
import android.content.Context;
import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhv implements ddy
{
    private Object a;
    private final int b;
    private final Object c;
    private final Object d;
    
    public dhv(final Uri d, final des c, final int b) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public dhv(final File c, final dhw d, final int b) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static dhv b(final Context context, final Uri uri, final der der) {
        return new dhv(uri, new des(dbp.b(context).b.a().b(), der, dbp.b(context).c, context.getContentResolver()), 1);
    }
    
    @Override
    public final Class a() {
        if (this.b != 0) {
            return InputStream.class;
        }
        return ((dhw)this.d).a();
    }
    
    @Override
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dhv.b:I
        //     4: ifeq            24
        //     7: aload_0        
        //     8: getfield        dhv.a:Ljava/lang/Object;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnull          23
        //    16: aload_1        
        //    17: checkcast       Ljava/io/InputStream;
        //    20: invokevirtual   java/io/InputStream.close:()V
        //    23: return         
        //    24: aload_0        
        //    25: getfield        dhv.a:Ljava/lang/Object;
        //    28: astore_1       
        //    29: aload_1        
        //    30: ifnull          43
        //    33: aload_0        
        //    34: getfield        dhv.d:Ljava/lang/Object;
        //    37: aload_1        
        //    38: invokeinterface dhw.c:(Ljava/lang/Object;)V
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
    
    @Override
    public final void f(final dca p0, final ddx p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dhv.b:I
        //     4: ifeq            487
        //     7: aload_0        
        //     8: getfield        dhv.c:Ljava/lang/Object;
        //    11: astore          10
        //    13: aload_0        
        //    14: getfield        dhv.d:Ljava/lang/Object;
        //    17: astore          9
        //    19: aconst_null    
        //    20: astore          8
        //    22: aconst_null    
        //    23: astore          7
        //    25: aconst_null    
        //    26: astore          6
        //    28: aload           10
        //    30: checkcast       Ldes;
        //    33: getfield        des.a:Ljava/lang/Object;
        //    36: aload           9
        //    38: checkcast       Landroid/net/Uri;
        //    41: invokeinterface der.a:(Landroid/net/Uri;)Landroid/database/Cursor;
        //    46: astore_1       
        //    47: aload_1        
        //    48: ifnull          91
        //    51: aload_1        
        //    52: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    57: ifeq            91
        //    60: aload_1        
        //    61: iconst_0       
        //    62: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    67: astore          5
        //    69: aload_1        
        //    70: invokeinterface android/database/Cursor.close:()V
        //    75: aload           5
        //    77: astore_1       
        //    78: goto            134
        //    81: astore          5
        //    83: goto            109
        //    86: astore          5
        //    88: goto            125
        //    91: aload_1        
        //    92: ifnull          132
        //    95: aload_1        
        //    96: invokeinterface android/database/Cursor.close:()V
        //   101: goto            132
        //   104: astore          5
        //   106: aload           6
        //   108: astore_1       
        //   109: aload_1        
        //   110: ifnull          119
        //   113: aload_1        
        //   114: invokeinterface android/database/Cursor.close:()V
        //   119: aload           5
        //   121: athrow         
        //   122: astore_1       
        //   123: aconst_null    
        //   124: astore_1       
        //   125: aload_1        
        //   126: ifnull          132
        //   129: goto            95
        //   132: aconst_null    
        //   133: astore_1       
        //   134: aload_1        
        //   135: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   138: ifeq            146
        //   141: aconst_null    
        //   142: astore_1       
        //   143: goto            278
        //   146: new             Ljava/io/File;
        //   149: astore          5
        //   151: aload           5
        //   153: aload_1        
        //   154: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   157: aload           5
        //   159: invokevirtual   java/io/File.exists:()Z
        //   162: ifeq            141
        //   165: aload           5
        //   167: invokevirtual   java/io/File.length:()J
        //   170: lconst_0       
        //   171: lcmp           
        //   172: ifle            141
        //   175: aload           5
        //   177: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   180: astore          5
        //   182: aload           10
        //   184: checkcast       Ldes;
        //   187: getfield        des.c:Ljava/lang/Object;
        //   190: checkcast       Landroid/content/ContentResolver;
        //   193: aload           5
        //   195: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   198: astore_1       
        //   199: goto            278
        //   202: astore_1       
        //   203: new             Ljava/io/FileNotFoundException;
        //   206: astore          6
        //   208: aload           9
        //   210: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   213: astore          7
        //   215: aload           5
        //   217: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   220: astore          8
        //   222: new             Ljava/lang/StringBuilder;
        //   225: astore          5
        //   227: aload           5
        //   229: ldc             "NPE opening uri: "
        //   231: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   234: aload           5
        //   236: aload           7
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: pop            
        //   242: aload           5
        //   244: ldc             " -> "
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: pop            
        //   250: aload           5
        //   252: aload           8
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload           6
        //   260: aload           5
        //   262: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   265: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   268: aload           6
        //   270: aload_1        
        //   271: invokevirtual   java/io/FileNotFoundException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   274: checkcast       Ljava/io/FileNotFoundException;
        //   277: athrow         
        //   278: aload_1        
        //   279: ifnull          441
        //   282: aload_0        
        //   283: getfield        dhv.c:Ljava/lang/Object;
        //   286: astore          9
        //   288: aload_0        
        //   289: getfield        dhv.d:Ljava/lang/Object;
        //   292: astore          11
        //   294: aload           8
        //   296: astore          6
        //   298: aload           7
        //   300: astore          5
        //   302: aload           9
        //   304: checkcast       Ldes;
        //   307: getfield        des.c:Ljava/lang/Object;
        //   310: astore          10
        //   312: aload           8
        //   314: astore          6
        //   316: aload           7
        //   318: astore          5
        //   320: aload           11
        //   322: checkcast       Landroid/net/Uri;
        //   325: astore          11
        //   327: aload           8
        //   329: astore          6
        //   331: aload           7
        //   333: astore          5
        //   335: aload           10
        //   337: checkcast       Landroid/content/ContentResolver;
        //   340: aload           11
        //   342: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   345: astore          7
        //   347: aload           7
        //   349: astore          6
        //   351: aload           7
        //   353: astore          5
        //   355: aload           9
        //   357: checkcast       Ldes;
        //   360: getfield        des.d:Ljava/lang/Object;
        //   363: aload           7
        //   365: aload           9
        //   367: checkcast       Ldes;
        //   370: getfield        des.b:Ljava/lang/Object;
        //   373: invokestatic    cka.h:(Ljava/util/List;Ljava/io/InputStream;Ldge;)I
        //   376: istore          4
        //   378: iload           4
        //   380: istore_3       
        //   381: aload           7
        //   383: ifnull          443
        //   386: aload           7
        //   388: invokevirtual   java/io/InputStream.close:()V
        //   391: iload           4
        //   393: istore_3       
        //   394: goto            443
        //   397: astore          5
        //   399: iload           4
        //   401: istore_3       
        //   402: goto            443
        //   405: astore_1       
        //   406: goto            414
        //   409: astore          6
        //   411: goto            426
        //   414: aload           6
        //   416: ifnull          424
        //   419: aload           6
        //   421: invokevirtual   java/io/InputStream.close:()V
        //   424: aload_1        
        //   425: athrow         
        //   426: aload           5
        //   428: ifnull          441
        //   431: aload           5
        //   433: invokevirtual   java/io/InputStream.close:()V
        //   436: goto            441
        //   439: astore          5
        //   441: iconst_m1      
        //   442: istore_3       
        //   443: aload_1        
        //   444: astore          5
        //   446: iload_3        
        //   447: iconst_m1      
        //   448: if_icmpeq       463
        //   451: new             Ldee;
        //   454: astore          5
        //   456: aload           5
        //   458: aload_1        
        //   459: iload_3        
        //   460: invokespecial   dee.<init>:(Ljava/io/InputStream;I)V
        //   463: aload_0        
        //   464: aload           5
        //   466: putfield        dhv.a:Ljava/lang/Object;
        //   469: aload_2        
        //   470: aload           5
        //   472: invokeinterface ddx.b:(Ljava/lang/Object;)V
        //   477: return         
        //   478: astore_1       
        //   479: aload_2        
        //   480: aload_1        
        //   481: invokeinterface ddx.e:(Ljava/lang/Exception;)V
        //   486: return         
        //   487: aload_0        
        //   488: getfield        dhv.d:Ljava/lang/Object;
        //   491: aload_0        
        //   492: getfield        dhv.c:Ljava/lang/Object;
        //   495: checkcast       Ljava/io/File;
        //   498: invokeinterface dhw.b:(Ljava/io/File;)Ljava/lang/Object;
        //   503: astore_1       
        //   504: aload_0        
        //   505: aload_1        
        //   506: putfield        dhv.a:Ljava/lang/Object;
        //   509: aload_2        
        //   510: aload_1        
        //   511: invokeinterface ddx.b:(Ljava/lang/Object;)V
        //   516: return         
        //   517: astore_1       
        //   518: aload_2        
        //   519: aload_1        
        //   520: invokeinterface ddx.e:(Ljava/lang/Exception;)V
        //   525: return         
        //   526: astore          5
        //   528: goto            424
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      19     478    487    Ljava/io/FileNotFoundException;
        //  28     47     122    125    Ljava/lang/SecurityException;
        //  28     47     104    109    Any
        //  51     69     86     91     Ljava/lang/SecurityException;
        //  51     69     81     86     Any
        //  69     75     478    487    Ljava/io/FileNotFoundException;
        //  95     101    478    487    Ljava/io/FileNotFoundException;
        //  113    119    478    487    Ljava/io/FileNotFoundException;
        //  119    122    478    487    Ljava/io/FileNotFoundException;
        //  134    141    478    487    Ljava/io/FileNotFoundException;
        //  146    182    478    487    Ljava/io/FileNotFoundException;
        //  182    199    202    278    Ljava/lang/NullPointerException;
        //  182    199    478    487    Ljava/io/FileNotFoundException;
        //  203    278    478    487    Ljava/io/FileNotFoundException;
        //  282    294    478    487    Ljava/io/FileNotFoundException;
        //  302    312    409    441    Ljava/io/IOException;
        //  302    312    409    441    Ljava/lang/NullPointerException;
        //  302    312    405    426    Any
        //  320    327    409    441    Ljava/io/IOException;
        //  320    327    409    441    Ljava/lang/NullPointerException;
        //  320    327    405    426    Any
        //  335    347    409    441    Ljava/io/IOException;
        //  335    347    409    441    Ljava/lang/NullPointerException;
        //  335    347    405    426    Any
        //  355    378    409    441    Ljava/io/IOException;
        //  355    378    409    441    Ljava/lang/NullPointerException;
        //  355    378    405    426    Any
        //  386    391    397    405    Ljava/io/IOException;
        //  419    424    526    531    Ljava/io/IOException;
        //  424    426    478    487    Ljava/io/FileNotFoundException;
        //  431    436    439    441    Ljava/io/IOException;
        //  451    463    478    487    Ljava/io/FileNotFoundException;
        //  463    477    478    487    Ljava/io/FileNotFoundException;
        //  487    516    517    526    Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0424:
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
    
    @Override
    public final int g() {
        return 1;
    }
    
    @Override
    public final void lq() {
    }
}
