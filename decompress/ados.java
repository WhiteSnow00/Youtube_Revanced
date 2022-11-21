import java.io.File;
import android.content.ContentResolver;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class ados extends adop
{
    public ados(final Uri uri, final ContentResolver contentResolver, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3) {
        super(uri, contentResolver, adgg, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final adot g(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ados.d:Landroid/content/ContentResolver;
        //     4: aload_0        
        //     5: getfield        ados.c:Landroid/net/Uri;
        //     8: ldc             "r"
        //    10: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //    13: astore_1       
        //    14: aload_1        
        //    15: ifnull          142
        //    18: aload_0        
        //    19: getfield        ados.d:Landroid/content/ContentResolver;
        //    22: aload_0        
        //    23: getfield        ados.c:Landroid/net/Uri;
        //    26: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    29: astore          4
        //    31: aload           4
        //    33: ifnull          86
        //    36: aload_1        
        //    37: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //    40: lstore_2       
        //    41: lload_2        
        //    42: ldc2_w          -1
        //    45: lcmp           
        //    46: ifeq            68
        //    49: new             Ladot;
        //    52: dup            
        //    53: aload           4
        //    55: lload_2        
        //    56: invokespecial   adot.<init>:(Ljava/io/InputStream;J)V
        //    59: astore          4
        //    61: aload_1        
        //    62: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    65: aload           4
        //    67: areturn        
        //    68: new             Ladot;
        //    71: dup            
        //    72: aload           4
        //    74: invokespecial   adot.<init>:(Ljava/io/InputStream;)V
        //    77: astore          4
        //    79: aload_1        
        //    80: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    83: aload           4
        //    85: areturn        
        //    86: new             Ljava/io/FileNotFoundException;
        //    89: astore          4
        //    91: aload_0        
        //    92: getfield        ados.c:Landroid/net/Uri;
        //    95: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    98: astore          5
        //   100: new             Ljava/lang/StringBuilder;
        //   103: astore          6
        //   105: aload           6
        //   107: ldc             "Input stream failed, cannot open input stream "
        //   109: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   112: aload           6
        //   114: aload           5
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: aload           4
        //   122: aload           6
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   130: aload           4
        //   132: athrow         
        //   133: astore          4
        //   135: aload_1        
        //   136: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   139: aload           4
        //   141: athrow         
        //   142: new             Ljava/io/FileNotFoundException;
        //   145: dup            
        //   146: ldc             "Input stream failed, cannot open asset file descriptor "
        //   148: aload_0        
        //   149: getfield        ados.c:Landroid/net/Uri;
        //   152: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   155: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   158: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   161: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   164: athrow         
        //   165: astore_1       
        //   166: goto            65
        //   169: astore_1       
        //   170: goto            83
        //   173: astore_1       
        //   174: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     31     133    142    Any
        //  36     41     133    142    Any
        //  49     61     133    142    Any
        //  61     65     165    169    Ljava/io/IOException;
        //  68     79     133    142    Any
        //  79     83     169    173    Ljava/io/IOException;
        //  86     133    133    142    Any
        //  135    139    173    177    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
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
    
    public final void k() {
    }
    
    public final boolean n() {
        return false;
    }
}
