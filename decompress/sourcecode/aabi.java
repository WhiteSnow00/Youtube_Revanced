import org.apache.http.HttpResponse;
import org.apache.http.Header;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabi extends abls
{
    private final oas a;
    private final yyv b;
    
    public aabi(final oas a, final yyv b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    protected final void a(final Uri p0, final Header p1, final HttpResponse p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    ablq.a:(Landroid/net/Uri;)Lablq;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          263
        //    11: aload_1        
        //    12: ldc             "e"
        //    14: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //    17: ifnonnull       23
        //    20: goto            263
        //    23: aload_1        
        //    24: ldc             "e"
        //    26: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //    29: astore_1       
        //    30: aload_1        
        //    31: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    34: ifeq            43
        //    37: lconst_0       
        //    38: lstore          5
        //    40: goto            49
        //    43: aload_1        
        //    44: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    47: lstore          5
        //    49: lload           5
        //    51: aload_0        
        //    52: getfield        aabi.a:Loas;
        //    55: invokeinterface oas.d:()J
        //    60: lcmp           
        //    61: ifge            79
        //    64: ldc             "Offline URL has expired. Not allowed to access content."
        //    66: invokestatic    trn.l:(Ljava/lang/String;)V
        //    69: aload_3        
        //    70: sipush          403
        //    73: invokeinterface org/apache/http/HttpResponse.setStatusCode:(I)V
        //    78: return         
        //    79: aload_2        
        //    80: aload           4
        //    82: getfield        ablq.d:J
        //    85: invokestatic    ablr.a:(Lorg/apache/http/Header;J)Lablr;
        //    88: astore_2       
        //    89: aload           4
        //    91: getfield        ablq.a:Ljava/lang/String;
        //    94: aload           4
        //    96: getfield        ablq.b:I
        //    99: aload           4
        //   101: getfield        ablq.c:Ljava/lang/String;
        //   104: aload           4
        //   106: getfield        ablq.e:J
        //   109: invokestatic    xyl.z:(Ljava/lang/String;ILjava/lang/String;J)Ljava/lang/String;
        //   112: astore          4
        //   114: aload_0        
        //   115: getfield        aabi.b:Lyyv;
        //   118: invokeinterface yyv.a:()Lbbk;
        //   123: astore_1       
        //   124: getstatic       android/net/Uri.EMPTY:Landroid/net/Uri;
        //   127: astore          7
        //   129: aload_2        
        //   130: getfield        ablr.a:J
        //   133: lstore          5
        //   135: new             Lbbo;
        //   138: dup            
        //   139: aload           7
        //   141: lload           5
        //   143: aload_2        
        //   144: getfield        ablr.b:J
        //   147: lload           5
        //   149: lsub           
        //   150: lconst_1       
        //   151: ladd           
        //   152: aload           4
        //   154: invokespecial   bbo.<init>:(Landroid/net/Uri;JJLjava/lang/String;)V
        //   157: astore          4
        //   159: aload_1        
        //   160: aload           4
        //   162: invokeinterface bbk.b:(Lbbo;)J
        //   167: pop2           
        //   168: aload_1        
        //   169: invokeinterface bbk.f:()V
        //   174: goto            186
        //   177: astore          7
        //   179: ldc             "IOException trying to close offline data source"
        //   181: aload           7
        //   183: invokestatic    trn.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   186: aload_2        
        //   187: aload_3        
        //   188: invokevirtual   ablr.b:(Lorg/apache/http/HttpResponse;)Z
        //   191: ifeq            210
        //   194: aload_3        
        //   195: new             Lablu;
        //   198: dup            
        //   199: aload_1        
        //   200: aload           4
        //   202: invokespecial   ablu.<init>:(Lbbk;Lbbo;)V
        //   205: invokeinterface org/apache/http/HttpResponse.setEntity:(Lorg/apache/http/HttpEntity;)V
        //   210: return         
        //   211: astore_2       
        //   212: goto            245
        //   215: astore_2       
        //   216: ldc             "Offlined video not found on disk."
        //   218: invokestatic    trn.l:(Ljava/lang/String;)V
        //   221: aload_3        
        //   222: sipush          404
        //   225: invokeinterface org/apache/http/HttpResponse.setStatusCode:(I)V
        //   230: aload_1        
        //   231: invokeinterface bbk.f:()V
        //   236: return         
        //   237: astore_1       
        //   238: ldc             "IOException trying to close offline data source"
        //   240: aload_1        
        //   241: invokestatic    trn.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   244: return         
        //   245: aload_1        
        //   246: invokeinterface bbk.f:()V
        //   251: goto            261
        //   254: astore_1       
        //   255: ldc             "IOException trying to close offline data source"
        //   257: aload_1        
        //   258: invokestatic    trn.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   261: aload_2        
        //   262: athrow         
        //   263: aload_3        
        //   264: sipush          404
        //   267: invokeinterface org/apache/http/HttpResponse.setStatusCode:(I)V
        //   272: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  159    168    215    245    Ljava/io/IOException;
        //  159    168    211    263    Any
        //  168    174    177    186    Ljava/io/IOException;
        //  216    230    211    263    Any
        //  230    236    237    245    Ljava/io/IOException;
        //  245    251    254    261    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 124, Size: 124
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
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
