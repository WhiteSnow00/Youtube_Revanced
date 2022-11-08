import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dot
{
    private static final AtomicReference a;
    
    static {
        a = new AtomicReference();
    }
    
    public static InputStream a(final ByteBuffer byteBuffer) {
        return new dos(byteBuffer);
    }
    
    public static ByteBuffer b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aconst_null    
        //     3: astore_2       
        //     4: aload_0        
        //     5: invokevirtual   java/io/File.length:()J
        //     8: lstore_3       
        //     9: lload_3        
        //    10: ldc2_w          2147483647
        //    13: lcmp           
        //    14: ifgt            94
        //    17: lload_3        
        //    18: lconst_0       
        //    19: lcmp           
        //    20: ifeq            82
        //    23: new             Ljava/io/RandomAccessFile;
        //    26: astore          5
        //    28: aload           5
        //    30: aload_0        
        //    31: ldc             "r"
        //    33: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    36: aload_2        
        //    37: astore_0       
        //    38: aload           5
        //    40: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    43: astore_1       
        //    44: aload_1        
        //    45: astore_0       
        //    46: aload_1        
        //    47: getstatic       java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
        //    50: lconst_0       
        //    51: lload_3        
        //    52: invokevirtual   java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
        //    55: invokevirtual   java/nio/MappedByteBuffer.load:()Ljava/nio/MappedByteBuffer;
        //    58: astore_2       
        //    59: aload_1        
        //    60: ifnull          67
        //    63: aload_1        
        //    64: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    67: aload           5
        //    69: invokevirtual   java/io/RandomAccessFile.close:()V
        //    72: aload_2        
        //    73: areturn        
        //    74: astore_2       
        //    75: aload_0        
        //    76: astore_1       
        //    77: aload_2        
        //    78: astore_0       
        //    79: goto            110
        //    82: new             Ljava/io/IOException;
        //    85: astore_0       
        //    86: aload_0        
        //    87: ldc             "File unsuitable for memory mapping"
        //    89: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    92: aload_0        
        //    93: athrow         
        //    94: new             Ljava/io/IOException;
        //    97: astore_0       
        //    98: aload_0        
        //    99: ldc             "File too large to map into memory"
        //   101: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   104: aload_0        
        //   105: athrow         
        //   106: astore_0       
        //   107: aconst_null    
        //   108: astore          5
        //   110: aload_1        
        //   111: ifnull          122
        //   114: aload_1        
        //   115: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   118: goto            122
        //   121: astore_1       
        //   122: aload           5
        //   124: ifnull          132
        //   127: aload           5
        //   129: invokevirtual   java/io/RandomAccessFile.close:()V
        //   132: aload_0        
        //   133: athrow         
        //   134: astore_0       
        //   135: goto            67
        //   138: astore_0       
        //   139: goto            72
        //   142: astore          5
        //   144: goto            132
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      9      106    110    Any
        //  23     36     106    110    Any
        //  38     44     74     82     Any
        //  46     59     74     82     Any
        //  63     67     134    138    Ljava/io/IOException;
        //  67     72     138    142    Ljava/io/IOException;
        //  82     94     106    110    Any
        //  94     106    106    110    Any
        //  114    118    121    122    Ljava/io/IOException;
        //  127    132    142    147    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
    
    public static ByteBuffer c(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] array;
        if ((array = dot.a.getAndSet(null)) == null) {
            array = new byte[16384];
        }
        while (true) {
            final int read = inputStream.read(array);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        dot.a.set(array);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
    }
    
    public static ByteBuffer d(final ByteBuffer byteBuffer) {
        return (ByteBuffer)byteBuffer.position(0);
    }
    
    public static void e(final ByteBuffer p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    dot.d:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        //     4: pop            
        //     5: aconst_null    
        //     6: astore_2       
        //     7: aconst_null    
        //     8: astore_3       
        //     9: new             Ljava/io/RandomAccessFile;
        //    12: astore          4
        //    14: aload           4
        //    16: aload_1        
        //    17: ldc             "rw"
        //    19: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    22: aload_3        
        //    23: astore_1       
        //    24: aload           4
        //    26: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    29: astore_2       
        //    30: aload_2        
        //    31: astore_1       
        //    32: aload_2        
        //    33: aload_0        
        //    34: invokevirtual   java/nio/channels/FileChannel.write:(Ljava/nio/ByteBuffer;)I
        //    37: pop            
        //    38: aload_2        
        //    39: astore_1       
        //    40: aload_2        
        //    41: iconst_0       
        //    42: invokevirtual   java/nio/channels/FileChannel.force:(Z)V
        //    45: aload_2        
        //    46: astore_1       
        //    47: aload_2        
        //    48: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    51: aload_2        
        //    52: astore_1       
        //    53: aload           4
        //    55: invokevirtual   java/io/RandomAccessFile.close:()V
        //    58: aload_2        
        //    59: ifnull          66
        //    62: aload_2        
        //    63: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    66: aload           4
        //    68: invokevirtual   java/io/RandomAccessFile.close:()V
        //    71: return         
        //    72: astore_0       
        //    73: aload_1        
        //    74: astore_2       
        //    75: aload           4
        //    77: astore_1       
        //    78: goto            84
        //    81: astore_0       
        //    82: aconst_null    
        //    83: astore_1       
        //    84: aload_2        
        //    85: ifnull          96
        //    88: aload_2        
        //    89: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    92: goto            96
        //    95: astore_2       
        //    96: aload_1        
        //    97: ifnull          104
        //   100: aload_1        
        //   101: invokevirtual   java/io/RandomAccessFile.close:()V
        //   104: aload_0        
        //   105: athrow         
        //   106: astore_0       
        //   107: goto            66
        //   110: astore_0       
        //   111: goto            71
        //   114: astore_1       
        //   115: goto            104
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      22     81     84     Any
        //  24     30     72     81     Any
        //  32     38     72     81     Any
        //  40     45     72     81     Any
        //  47     51     72     81     Any
        //  53     58     72     81     Any
        //  62     66     106    110    Ljava/io/IOException;
        //  66     71     110    114    Ljava/io/IOException;
        //  88     92     95     96     Ljava/io/IOException;
        //  100    104    114    118    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 71, Size: 71
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
    
    public static byte[] f(final ByteBuffer byteBuffer) {
        final boolean readOnly = byteBuffer.isReadOnly();
        ijj ijj2;
        final ijj ijj = ijj2 = null;
        if (!readOnly) {
            ijj2 = ijj;
            if (byteBuffer.hasArray()) {
                ijj2 = new ijj(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
            }
        }
        byte[] array;
        if (ijj2 != null && ijj2.b == 0 && ijj2.a == ((byte[])ijj2.c).length) {
            array = byteBuffer.array();
        }
        else {
            final ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            array = new byte[readOnlyBuffer.limit()];
            d(readOnlyBuffer);
            readOnlyBuffer.get(array);
        }
        return array;
    }
}
