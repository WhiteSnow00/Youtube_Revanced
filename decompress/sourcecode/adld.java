import java.io.File;
import android.content.ContentResolver;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class adld extends adla
{
    public adld(final Uri uri, final ContentResolver contentResolver, final adcr adcr, final byte[] array) {
        super(uri, contentResolver, adcr, (byte[])null);
    }
    
    public final adle g(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        adld.d:Landroid/content/ContentResolver;
        //     4: aload_0        
        //     5: getfield        adld.c:Landroid/net/Uri;
        //     8: ldc             "r"
        //    10: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //    13: astore_1       
        //    14: aload_1        
        //    15: ifnull          129
        //    18: aload_0        
        //    19: getfield        adld.d:Landroid/content/ContentResolver;
        //    22: aload_0        
        //    23: getfield        adld.c:Landroid/net/Uri;
        //    26: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    29: astore_2       
        //    30: aload_2        
        //    31: ifnull          78
        //    34: aload_1        
        //    35: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //    38: lstore_3       
        //    39: lload_3        
        //    40: ldc2_w          -1
        //    43: lcmp           
        //    44: ifeq            63
        //    47: new             Ladle;
        //    50: dup            
        //    51: aload_2        
        //    52: lload_3        
        //    53: invokespecial   adle.<init>:(Ljava/io/InputStream;J)V
        //    56: astore_2       
        //    57: aload_1        
        //    58: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    61: aload_2        
        //    62: areturn        
        //    63: new             Ladle;
        //    66: dup            
        //    67: aload_2        
        //    68: invokespecial   adle.<init>:(Ljava/io/InputStream;)V
        //    71: astore_2       
        //    72: aload_1        
        //    73: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    76: aload_2        
        //    77: areturn        
        //    78: new             Ljava/io/FileNotFoundException;
        //    81: astore_2       
        //    82: aload_0        
        //    83: getfield        adld.c:Landroid/net/Uri;
        //    86: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    89: astore          5
        //    91: new             Ljava/lang/StringBuilder;
        //    94: astore          6
        //    96: aload           6
        //    98: ldc             "Input stream failed, cannot open input stream "
        //   100: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   103: aload           6
        //   105: aload           5
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload_2        
        //   112: aload           6
        //   114: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   117: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   120: aload_2        
        //   121: athrow         
        //   122: astore_2       
        //   123: aload_1        
        //   124: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   127: aload_2        
        //   128: athrow         
        //   129: new             Ljava/io/FileNotFoundException;
        //   132: dup            
        //   133: ldc             "Input stream failed, cannot open asset file descriptor "
        //   135: aload_0        
        //   136: getfield        adld.c:Landroid/net/Uri;
        //   139: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   142: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   145: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   148: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   151: athrow         
        //   152: astore_1       
        //   153: goto            61
        //   156: astore_1       
        //   157: goto            76
        //   160: astore_1       
        //   161: goto            127
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     30     122    129    Any
        //  34     39     122    129    Any
        //  47     57     122    129    Any
        //  57     61     152    156    Ljava/io/IOException;
        //  63     72     122    129    Any
        //  72     76     156    160    Ljava/io/IOException;
        //  78     122    122    129    Any
        //  123    127    160    164    Ljava/io/IOException;
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
    
    public final boolean m() {
        return false;
    }
}
