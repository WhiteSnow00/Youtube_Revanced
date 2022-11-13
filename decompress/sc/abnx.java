import java.net.Socket;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnx implements Runnable
{
    final abny a;
    private final Socket b;
    
    public abnx(final abny a, final Socket b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   org/apache/http/impl/DefaultHttpServerConnection.<init>:()V
        //     7: astore_1       
        //     8: aload_1        
        //     9: aload_0        
        //    10: getfield        abnx.b:Ljava/net/Socket;
        //    13: aload_0        
        //    14: getfield        abnx.a:Labny;
        //    17: getfield        abny.a:Lorg/apache/http/params/HttpParams;
        //    20: invokevirtual   org/apache/http/impl/DefaultHttpServerConnection.bind:(Ljava/net/Socket;Lorg/apache/http/params/HttpParams;)V
        //    23: new             Lorg/apache/http/protocol/BasicHttpContext;
        //    26: astore_2       
        //    27: aload_2        
        //    28: invokespecial   org/apache/http/protocol/BasicHttpContext.<init>:()V
        //    31: invokestatic    java/lang/Thread.interrupted:()Z
        //    34: ifne            59
        //    37: aload_1        
        //    38: invokevirtual   org/apache/http/impl/DefaultHttpServerConnection.isOpen:()Z
        //    41: ifeq            59
        //    44: aload_0        
        //    45: getfield        abnx.a:Labny;
        //    48: getfield        abny.b:Lorg/apache/http/protocol/HttpService;
        //    51: aload_1        
        //    52: aload_2        
        //    53: invokevirtual   org/apache/http/protocol/HttpService.handleRequest:(Lorg/apache/http/HttpServerConnection;Lorg/apache/http/protocol/HttpContext;)V
        //    56: goto            31
        //    59: aload_1        
        //    60: invokevirtual   org/apache/http/impl/DefaultHttpServerConnection.shutdown:()V
        //    63: return         
        //    64: astore_2       
        //    65: goto            126
        //    68: astore_2       
        //    69: ldc             "HTTP protocol violation"
        //    71: aload_2        
        //    72: invokestatic    ttr.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    75: aload_1        
        //    76: invokevirtual   org/apache/http/impl/DefaultHttpServerConnection.shutdown:()V
        //    79: return         
        //    80: astore_3       
        //    81: aload_3        
        //    82: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //    85: astore_2       
        //    86: aload_2        
        //    87: ifnull          115
        //    90: aload_3        
        //    91: instanceof      Ljava/net/SocketException;
        //    94: ifeq            115
        //    97: aload_2        
        //    98: ldc             "Connection reset by peer"
        //   100: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   103: ifne            121
        //   106: aload_2        
        //   107: ldc             "Socket closed"
        //   109: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   112: ifne            121
        //   115: ldc             "IOException when handling a request"
        //   117: aload_3        
        //   118: invokestatic    ttr.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   121: aload_1        
        //   122: invokevirtual   org/apache/http/impl/DefaultHttpServerConnection.shutdown:()V
        //   125: return         
        //   126: aload_1        
        //   127: invokevirtual   org/apache/http/impl/DefaultHttpServerConnection.shutdown:()V
        //   130: aload_2        
        //   131: athrow         
        //   132: astore_2       
        //   133: aload_1        
        //   134: invokevirtual   org/apache/http/impl/DefaultHttpServerConnection.shutdown:()V
        //   137: return         
        //   138: astore_1       
        //   139: goto            63
        //   142: astore_1       
        //   143: goto            79
        //   146: astore_1       
        //   147: goto            125
        //   150: astore_1       
        //   151: goto            130
        //   154: astore_1       
        //   155: goto            137
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      31     132    138    Lorg/apache/http/ConnectionClosedException;
        //  8      31     80     126    Ljava/io/IOException;
        //  8      31     68     80     Lorg/apache/http/HttpException;
        //  8      31     64     132    Any
        //  31     56     132    138    Lorg/apache/http/ConnectionClosedException;
        //  31     56     80     126    Ljava/io/IOException;
        //  31     56     68     80     Lorg/apache/http/HttpException;
        //  31     56     64     132    Any
        //  59     63     138    142    Ljava/io/IOException;
        //  69     75     64     132    Any
        //  75     79     142    146    Ljava/io/IOException;
        //  81     86     64     132    Any
        //  90     115    64     132    Any
        //  115    121    64     132    Any
        //  121    125    146    150    Ljava/io/IOException;
        //  126    130    150    154    Ljava/io/IOException;
        //  133    137    154    158    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.util.ConcurrentModificationException
        //     at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        //     at java.util.ArrayList$Itr.next(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2913)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
