import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dir implements ddc
{
    private final dge a;
    
    public dir(final dge a) {
        this.a = a;
    }
    
    @Override
    public final /* bridge */ boolean a(final Object p0, final File p1, final ddp p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/io/InputStream;
        //     4: astore          8
        //     6: aload_0        
        //     7: getfield        dir.a:Ldge;
        //    10: ldc             65536
        //    12: ldc             [B.class
        //    14: invokeinterface dge.a:(ILjava/lang/Class;)Ljava/lang/Object;
        //    19: checkcast       [B
        //    22: astore          7
        //    24: iconst_0       
        //    25: istore          5
        //    27: aconst_null    
        //    28: astore          6
        //    30: aconst_null    
        //    31: astore_3       
        //    32: new             Ljava/io/FileOutputStream;
        //    35: astore_1       
        //    36: aload_1        
        //    37: aload_2        
        //    38: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    41: aload           8
        //    43: aload           7
        //    45: invokevirtual   java/io/InputStream.read:([B)I
        //    48: istore          4
        //    50: iload           4
        //    52: iconst_m1      
        //    53: if_icmpeq       68
        //    56: aload_1        
        //    57: aload           7
        //    59: iconst_0       
        //    60: iload           4
        //    62: invokevirtual   java/io/OutputStream.write:([BII)V
        //    65: goto            41
        //    68: aload_1        
        //    69: invokevirtual   java/io/OutputStream.close:()V
        //    72: aload_1        
        //    73: invokevirtual   java/io/OutputStream.close:()V
        //    76: aload_0        
        //    77: getfield        dir.a:Ldge;
        //    80: aload           7
        //    82: invokeinterface dge.c:(Ljava/lang/Object;)V
        //    87: iconst_1       
        //    88: istore          5
        //    90: goto            150
        //    93: astore_2       
        //    94: aload_1        
        //    95: astore_3       
        //    96: aload_2        
        //    97: astore_1       
        //    98: goto            106
        //   101: astore_2       
        //   102: goto            131
        //   105: astore_1       
        //   106: aload_3        
        //   107: ifnull          114
        //   110: aload_3        
        //   111: invokevirtual   java/io/OutputStream.close:()V
        //   114: aload_0        
        //   115: getfield        dir.a:Ldge;
        //   118: aload           7
        //   120: invokeinterface dge.c:(Ljava/lang/Object;)V
        //   125: aload_1        
        //   126: athrow         
        //   127: astore_1       
        //   128: aload           6
        //   130: astore_1       
        //   131: aload_1        
        //   132: ifnull          139
        //   135: aload_1        
        //   136: invokevirtual   java/io/OutputStream.close:()V
        //   139: aload_0        
        //   140: getfield        dir.a:Ldge;
        //   143: aload           7
        //   145: invokeinterface dge.c:(Ljava/lang/Object;)V
        //   150: iload           5
        //   152: ireturn        
        //   153: astore_1       
        //   154: goto            76
        //   157: astore_2       
        //   158: goto            114
        //   161: astore_1       
        //   162: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  32     41     127    131    Ljava/io/IOException;
        //  32     41     105    106    Any
        //  41     50     101    105    Ljava/io/IOException;
        //  41     50     93     101    Any
        //  56     65     101    105    Ljava/io/IOException;
        //  56     65     93     101    Any
        //  68     72     101    105    Ljava/io/IOException;
        //  68     72     93     101    Any
        //  72     76     153    157    Ljava/io/IOException;
        //  110    114    157    161    Ljava/io/IOException;
        //  135    139    161    165    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 83, Size: 83
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
