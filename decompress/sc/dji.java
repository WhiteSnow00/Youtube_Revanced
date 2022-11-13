import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dji implements dds
{
    public static final ddo a;
    public static final ddo b;
    private final dge c;
    
    static {
        a = ddo.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
        b = ddo.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    }
    
    @Deprecated
    public dji() {
        this.c = null;
    }
    
    public dji(final dge c) {
        this.c = c;
    }
    
    public final /* bridge */ boolean a(final Object p0, final File p1, final ddp p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ldfy;
        //     4: invokeinterface dfy.c:()Ljava/lang/Object;
        //     9: checkcast       Landroid/graphics/Bitmap;
        //    12: astore          12
        //    14: aload_3        
        //    15: getstatic       dji.b:Lddo;
        //    18: invokevirtual   ddp.b:(Lddo;)Ljava/lang/Object;
        //    21: checkcast       Landroid/graphics/Bitmap$CompressFormat;
        //    24: astore_1       
        //    25: aload_1        
        //    26: astore          8
        //    28: aload_1        
        //    29: ifnonnull       53
        //    32: aload           12
        //    34: invokevirtual   android/graphics/Bitmap.hasAlpha:()Z
        //    37: ifeq            48
        //    40: getstatic       android/graphics/Bitmap$CompressFormat.PNG:Landroid/graphics/Bitmap$CompressFormat;
        //    43: astore          8
        //    45: goto            53
        //    48: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //    51: astore          8
        //    53: aload           12
        //    55: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    58: pop            
        //    59: aload           12
        //    61: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //    64: pop            
        //    65: invokestatic    dpc.b:()J
        //    68: pop2           
        //    69: aload_3        
        //    70: getstatic       dji.a:Lddo;
        //    73: invokevirtual   ddp.b:(Lddo;)Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/Integer;
        //    79: invokevirtual   java/lang/Integer.intValue:()I
        //    82: istore          4
        //    84: aconst_null    
        //    85: astore          10
        //    87: aconst_null    
        //    88: astore          11
        //    90: aload           11
        //    92: astore_3       
        //    93: aload           10
        //    95: astore          9
        //    97: new             Ljava/io/FileOutputStream;
        //   100: astore_1       
        //   101: aload           11
        //   103: astore_3       
        //   104: aload           10
        //   106: astore          9
        //   108: aload_1        
        //   109: aload_2        
        //   110: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   113: aload_0        
        //   114: getfield        dji.c:Ldge;
        //   117: astore_3       
        //   118: aload_3        
        //   119: ifnull          137
        //   122: new             Lddw;
        //   125: astore_2       
        //   126: aload_2        
        //   127: aload_1        
        //   128: aload_3        
        //   129: invokespecial   ddw.<init>:(Ljava/io/OutputStream;Ldge;)V
        //   132: aload_2        
        //   133: astore_1       
        //   134: goto            137
        //   137: aload_1        
        //   138: astore_3       
        //   139: aload_1        
        //   140: astore          9
        //   142: aload           12
        //   144: aload           8
        //   146: iload           4
        //   148: aload_1        
        //   149: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   152: pop            
        //   153: aload_1        
        //   154: astore_3       
        //   155: aload_1        
        //   156: astore          9
        //   158: aload_1        
        //   159: invokevirtual   java/io/OutputStream.close:()V
        //   162: iconst_1       
        //   163: istore          5
        //   165: iconst_1       
        //   166: istore          6
        //   168: aload_1        
        //   169: invokevirtual   java/io/OutputStream.close:()V
        //   172: iload           6
        //   174: istore          5
        //   176: goto            238
        //   179: astore_2       
        //   180: goto            200
        //   183: astore_1       
        //   184: goto            210
        //   187: astore_2       
        //   188: aload_1        
        //   189: astore_3       
        //   190: goto            200
        //   193: astore_2       
        //   194: aload_1        
        //   195: astore          9
        //   197: goto            210
        //   200: aload_3        
        //   201: ifnull          208
        //   204: aload_3        
        //   205: invokevirtual   java/io/OutputStream.close:()V
        //   208: aload_2        
        //   209: athrow         
        //   210: iconst_0       
        //   211: istore          7
        //   213: iconst_0       
        //   214: istore          6
        //   216: iload           6
        //   218: istore          5
        //   220: aload           9
        //   222: ifnull          238
        //   225: iload           7
        //   227: istore          5
        //   229: aload           9
        //   231: invokevirtual   java/io/OutputStream.close:()V
        //   234: iload           6
        //   236: istore          5
        //   238: iload           5
        //   240: ireturn        
        //   241: astore_1       
        //   242: aload_1        
        //   243: athrow         
        //   244: astore_1       
        //   245: goto            238
        //   248: astore_1       
        //   249: goto            208
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  65     84     241    244    Any
        //  97     101    183    187    Ljava/io/IOException;
        //  97     101    179    183    Any
        //  108    113    183    187    Ljava/io/IOException;
        //  108    113    179    183    Any
        //  113    118    193    200    Ljava/io/IOException;
        //  113    118    187    193    Any
        //  122    132    193    200    Ljava/io/IOException;
        //  122    132    187    193    Any
        //  142    153    183    187    Ljava/io/IOException;
        //  142    153    179    183    Any
        //  158    162    183    187    Ljava/io/IOException;
        //  158    162    179    183    Any
        //  168    172    244    248    Ljava/io/IOException;
        //  168    172    241    244    Any
        //  204    208    248    252    Ljava/io/IOException;
        //  204    208    241    244    Any
        //  208    210    241    244    Any
        //  229    234    244    248    Ljava/io/IOException;
        //  229    234    241    244    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 133, Size: 133
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
    
    public final int b() {
        return 2;
    }
}
