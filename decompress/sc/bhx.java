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
        //    11: if_icmplt       96
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
        //    36: astore_2       
        //    37: new             Landroid/media/AudioTrack$Builder;
        //    40: astore          6
        //    42: aload           6
        //    44: invokespecial   android/media/AudioTrack$Builder.<init>:()V
        //    47: aload           6
        //    49: aload_2        
        //    50: invokevirtual   android/media/AudioTrack$Builder.setAudioAttributes:(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;
        //    53: aload           5
        //    55: invokevirtual   android/media/AudioTrack$Builder.setAudioFormat:(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;
        //    58: iconst_1       
        //    59: invokevirtual   android/media/AudioTrack$Builder.setTransferMode:(I)Landroid/media/AudioTrack$Builder;
        //    62: aload_0        
        //    63: getfield        bhx.h:I
        //    66: invokevirtual   android/media/AudioTrack$Builder.setBufferSizeInBytes:(I)Landroid/media/AudioTrack$Builder;
        //    69: iload_3        
        //    70: invokevirtual   android/media/AudioTrack$Builder.setSessionId:(I)Landroid/media/AudioTrack$Builder;
        //    73: astore_2       
        //    74: aload_0        
        //    75: getfield        bhx.c:I
        //    78: iconst_1       
        //    79: if_icmpne       84
        //    82: iconst_1       
        //    83: istore_1       
        //    84: aload_2        
        //    85: iload_1        
        //    86: invokevirtual   android/media/AudioTrack$Builder.setOffloadedPlayback:(Z)Landroid/media/AudioTrack$Builder;
        //    89: invokevirtual   android/media/AudioTrack$Builder.build:()Landroid/media/AudioTrack;
        //    92: astore_2       
        //    93: goto            130
        //    96: new             Landroid/media/AudioTrack;
        //    99: dup            
        //   100: aload_2        
        //   101: iconst_0       
        //   102: invokestatic    bhx.d:(Laxu;Z)Landroid/media/AudioAttributes;
        //   105: aload_0        
        //   106: getfield        bhx.e:I
        //   109: aload_0        
        //   110: getfield        bhx.f:I
        //   113: aload_0        
        //   114: getfield        bhx.g:I
        //   117: invokestatic    bia.B:(III)Landroid/media/AudioFormat;
        //   120: aload_0        
        //   121: getfield        bhx.h:I
        //   124: iconst_1       
        //   125: iload_3        
        //   126: invokespecial   android/media/AudioTrack.<init>:(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V
        //   129: astore_2       
        //   130: aload_2        
        //   131: invokevirtual   android/media/AudioTrack.getState:()I
        //   134: istore_3       
        //   135: iload_3        
        //   136: iconst_1       
        //   137: if_icmpne       142
        //   140: aload_2        
        //   141: areturn        
        //   142: aload_2        
        //   143: invokevirtual   android/media/AudioTrack.release:()V
        //   146: new             Lbhg;
        //   149: dup            
        //   150: iload_3        
        //   151: aload_0        
        //   152: getfield        bhx.e:I
        //   155: aload_0        
        //   156: getfield        bhx.f:I
        //   159: aload_0        
        //   160: getfield        bhx.h:I
        //   163: aload_0        
        //   164: getfield        bhx.a:Layg;
        //   167: aload_0        
        //   168: invokevirtual   bhx.c:()Z
        //   171: aconst_null    
        //   172: invokespecial   bhg.<init>:(IIIILayg;ZLjava/lang/Exception;)V
        //   175: athrow         
        //   176: astore_2       
        //   177: goto            181
        //   180: astore_2       
        //   181: new             Lbhg;
        //   184: dup            
        //   185: iconst_0       
        //   186: aload_0        
        //   187: getfield        bhx.e:I
        //   190: aload_0        
        //   191: getfield        bhx.f:I
        //   194: aload_0        
        //   195: getfield        bhx.h:I
        //   198: aload_0        
        //   199: getfield        bhx.a:Layg;
        //   202: aload_0        
        //   203: invokevirtual   bhx.c:()Z
        //   206: aload_2        
        //   207: invokespecial   bhg.<init>:(IIIILayg;ZLjava/lang/Exception;)V
        //   210: athrow         
        //   211: astore_2       
        //   212: goto            146
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      5      180    181    Ljava/lang/UnsupportedOperationException;
        //  0      5      176    180    Ljava/lang/IllegalArgumentException;
        //  14     74     180    181    Ljava/lang/UnsupportedOperationException;
        //  14     74     176    180    Ljava/lang/IllegalArgumentException;
        //  74     82     180    181    Ljava/lang/UnsupportedOperationException;
        //  74     82     176    180    Ljava/lang/IllegalArgumentException;
        //  84     93     180    181    Ljava/lang/UnsupportedOperationException;
        //  84     93     176    180    Ljava/lang/IllegalArgumentException;
        //  96     130    180    181    Ljava/lang/UnsupportedOperationException;
        //  96     130    176    180    Ljava/lang/IllegalArgumentException;
        //  142    146    211    215    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0142:
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
