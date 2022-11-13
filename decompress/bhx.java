import android.media.AudioTrack;
import android.media.AudioAttributes;

// 
// Decompiled by Procyon v0.6.0
// 

final class bhx
{
    public final ayg a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final azv[] i;
    
    public bhx(final ayg a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final azv[] i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    private static AudioAttributes d(final axu axu, final boolean b) {
        return (AudioAttributes)axu.a().a;
    }
    
    public final long a(final long n) {
        return n * 1000000L / this.e;
    }
    
    public final AudioTrack b(final boolean p0, final axu p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iconst_0       
        //     6: istore_1       
        //     7: iload           4
        //     9: bipush          29
        //    11: if_icmplt       95
        //    14: aload_0        
        //    15: getfield        bhx.e:I
        //    18: aload_0        
        //    19: getfield        bhx.f:I
        //    22: aload_0        
        //    23: getfield        bhx.g:I
        //    26: invokestatic    bia.B:(III)Landroid/media/AudioFormat;
        //    29: astore          5
        //    31: aload_2        
        //    32: iconst_0       
        //    33: invokestatic    bhx.d:(Laxu;Z)Landroid/media/AudioAttributes;
        //    36: astore          6
        //    38: new             Landroid/media/AudioTrack$Builder;
        //    41: astore_2       
        //    42: aload_2        
        //    43: invokespecial   android/media/AudioTrack$Builder.<init>:()V
        //    46: aload_2        
        //    47: aload           6
        //    49: invokevirtual   android/media/AudioTrack$Builder.setAudioAttributes:(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;
        //    52: aload           5
        //    54: invokevirtual   android/media/AudioTrack$Builder.setAudioFormat:(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;
        //    57: iconst_1       
        //    58: invokevirtual   android/media/AudioTrack$Builder.setTransferMode:(I)Landroid/media/AudioTrack$Builder;
        //    61: aload_0        
        //    62: getfield        bhx.h:I
        //    65: invokevirtual   android/media/AudioTrack$Builder.setBufferSizeInBytes:(I)Landroid/media/AudioTrack$Builder;
        //    68: iload_3        
        //    69: invokevirtual   android/media/AudioTrack$Builder.setSessionId:(I)Landroid/media/AudioTrack$Builder;
        //    72: astore_2       
        //    73: aload_0        
        //    74: getfield        bhx.c:I
        //    77: iconst_1       
        //    78: if_icmpne       83
        //    81: iconst_1       
        //    82: istore_1       
        //    83: aload_2        
        //    84: iload_1        
        //    85: invokevirtual   android/media/AudioTrack$Builder.setOffloadedPlayback:(Z)Landroid/media/AudioTrack$Builder;
        //    88: invokevirtual   android/media/AudioTrack$Builder.build:()Landroid/media/AudioTrack;
        //    91: astore_2       
        //    92: goto            129
        //    95: new             Landroid/media/AudioTrack;
        //    98: dup            
        //    99: aload_2        
        //   100: iconst_0       
        //   101: invokestatic    bhx.d:(Laxu;Z)Landroid/media/AudioAttributes;
        //   104: aload_0        
        //   105: getfield        bhx.e:I
        //   108: aload_0        
        //   109: getfield        bhx.f:I
        //   112: aload_0        
        //   113: getfield        bhx.g:I
        //   116: invokestatic    bia.B:(III)Landroid/media/AudioFormat;
        //   119: aload_0        
        //   120: getfield        bhx.h:I
        //   123: iconst_1       
        //   124: iload_3        
        //   125: invokespecial   android/media/AudioTrack.<init>:(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V
        //   128: astore_2       
        //   129: aload_2        
        //   130: invokevirtual   android/media/AudioTrack.getState:()I
        //   133: istore_3       
        //   134: iload_3        
        //   135: iconst_1       
        //   136: if_icmpne       141
        //   139: aload_2        
        //   140: areturn        
        //   141: aload_2        
        //   142: invokevirtual   android/media/AudioTrack.release:()V
        //   145: new             Lbhg;
        //   148: dup            
        //   149: iload_3        
        //   150: aload_0        
        //   151: getfield        bhx.e:I
        //   154: aload_0        
        //   155: getfield        bhx.f:I
        //   158: aload_0        
        //   159: getfield        bhx.h:I
        //   162: aload_0        
        //   163: getfield        bhx.a:Layg;
        //   166: aload_0        
        //   167: invokevirtual   bhx.c:()Z
        //   170: aconst_null    
        //   171: invokespecial   bhg.<init>:(IIIILayg;ZLjava/lang/Exception;)V
        //   174: athrow         
        //   175: astore_2       
        //   176: goto            180
        //   179: astore_2       
        //   180: new             Lbhg;
        //   183: dup            
        //   184: iconst_0       
        //   185: aload_0        
        //   186: getfield        bhx.e:I
        //   189: aload_0        
        //   190: getfield        bhx.f:I
        //   193: aload_0        
        //   194: getfield        bhx.h:I
        //   197: aload_0        
        //   198: getfield        bhx.a:Layg;
        //   201: aload_0        
        //   202: invokevirtual   bhx.c:()Z
        //   205: aload_2        
        //   206: invokespecial   bhg.<init>:(IIIILayg;ZLjava/lang/Exception;)V
        //   209: athrow         
        //   210: astore_2       
        //   211: goto            145
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      5      179    180    Ljava/lang/UnsupportedOperationException;
        //  0      5      175    179    Ljava/lang/IllegalArgumentException;
        //  14     73     179    180    Ljava/lang/UnsupportedOperationException;
        //  14     73     175    179    Ljava/lang/IllegalArgumentException;
        //  73     81     179    180    Ljava/lang/UnsupportedOperationException;
        //  73     81     175    179    Ljava/lang/IllegalArgumentException;
        //  83     92     179    180    Ljava/lang/UnsupportedOperationException;
        //  83     92     175    179    Ljava/lang/IllegalArgumentException;
        //  95     129    179    180    Ljava/lang/UnsupportedOperationException;
        //  95     129    175    179    Ljava/lang/IllegalArgumentException;
        //  141    145    210    214    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0141:
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
    
    public final boolean c() {
        return this.c == 1;
    }
}
