import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmx implements bom
{
    public btm a;
    public btn b;
    private final btq c;
    
    public bmx(final btq c) {
        this.c = c;
    }
    
    @Override
    public final long a() {
        final btn b = this.b;
        if (b != null) {
            return ((btg)b).c;
        }
        return -1L;
    }
    
    @Override
    public final void b(final ayc p0, final Uri p1, final Map p2, final long p3, final long p4, final btp p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: lload           4
        //     7: lload           6
        //     9: invokespecial   btg.<init>:(Layc;JJ)V
        //    12: astore_1       
        //    13: aload_0        
        //    14: aload_1        
        //    15: putfield        bmx.b:Lbtn;
        //    18: aload_0        
        //    19: getfield        bmx.a:Lbtm;
        //    22: ifnull          26
        //    25: return         
        //    26: aload_0        
        //    27: getfield        bmx.c:Lbtq;
        //    30: aload_2        
        //    31: aload_3        
        //    32: invokeinterface btq.a:(Landroid/net/Uri;Ljava/util/Map;)[Lbtm;
        //    37: astore_2       
        //    38: aload_2        
        //    39: arraylength    
        //    40: istore          10
        //    42: iconst_0       
        //    43: istore          12
        //    45: iconst_0       
        //    46: istore          13
        //    48: iload           10
        //    50: iconst_1       
        //    51: if_icmpne       64
        //    54: aload_0        
        //    55: aload_2        
        //    56: iconst_0       
        //    57: aaload         
        //    58: putfield        bmx.a:Lbtm;
        //    61: goto            241
        //    64: iconst_0       
        //    65: istore          9
        //    67: iload           9
        //    69: iload           10
        //    71: if_icmpge       234
        //    74: aload_2        
        //    75: iload           9
        //    77: aaload         
        //    78: astore_3       
        //    79: aload_3        
        //    80: aload_1        
        //    81: invokeinterface btm.g:(Lbtn;)Z
        //    86: ifeq            129
        //    89: aload_0        
        //    90: aload_3        
        //    91: putfield        bmx.a:Lbtm;
        //    94: aload_3        
        //    95: ifnonnull       112
        //    98: iload           13
        //   100: istore          11
        //   102: aload_1        
        //   103: getfield        btg.c:J
        //   106: lload           4
        //   108: lcmp           
        //   109: ifne            115
        //   112: iconst_1       
        //   113: istore          11
        //   115: iload           11
        //   117: invokestatic    bad.f:(Z)V
        //   120: aload_1        
        //   121: invokeinterface btn.l:()V
        //   126: goto            234
        //   129: aload_0        
        //   130: getfield        bmx.a:Lbtm;
        //   133: ifnonnull       214
        //   136: aload_1        
        //   137: getfield        btg.c:J
        //   140: lload           4
        //   142: lcmp           
        //   143: ifne            208
        //   146: goto            214
        //   149: astore_2       
        //   150: aload_0        
        //   151: getfield        bmx.a:Lbtm;
        //   154: ifnonnull       171
        //   157: iload           12
        //   159: istore          11
        //   161: aload_1        
        //   162: getfield        btg.c:J
        //   165: lload           4
        //   167: lcmp           
        //   168: ifne            174
        //   171: iconst_1       
        //   172: istore          11
        //   174: iload           11
        //   176: invokestatic    bad.f:(Z)V
        //   179: aload_1        
        //   180: invokeinterface btn.l:()V
        //   185: aload_2        
        //   186: athrow         
        //   187: astore_3       
        //   188: aload_0        
        //   189: getfield        bmx.a:Lbtm;
        //   192: ifnonnull       214
        //   195: aload_1        
        //   196: getfield        btg.c:J
        //   199: lload           4
        //   201: lcmp           
        //   202: ifne            208
        //   205: goto            214
        //   208: iconst_0       
        //   209: istore          11
        //   211: goto            217
        //   214: iconst_1       
        //   215: istore          11
        //   217: iload           11
        //   219: invokestatic    bad.f:(Z)V
        //   222: aload_1        
        //   223: invokeinterface btn.l:()V
        //   228: iinc            9, 1
        //   231: goto            67
        //   234: aload_0        
        //   235: getfield        bmx.a:Lbtm;
        //   238: ifnull          253
        //   241: aload_0        
        //   242: getfield        bmx.a:Lbtm;
        //   245: aload           8
        //   247: invokeinterface btm.d:(Lbtp;)V
        //   252: return         
        //   253: aload_2        
        //   254: invokestatic    baz.P:([Ljava/lang/Object;)Ljava/lang/String;
        //   257: astore_1       
        //   258: new             Ljava/lang/StringBuilder;
        //   261: dup            
        //   262: ldc             "None of the available extractors ("
        //   264: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   267: astore_2       
        //   268: aload_2        
        //   269: aload_1        
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: pop            
        //   274: aload_2        
        //   275: ldc             ") could read the stream."
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: pop            
        //   281: new             Lbpi;
        //   284: dup            
        //   285: aload_2        
        //   286: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   289: invokespecial   bpi.<init>:(Ljava/lang/String;)V
        //   292: astore_1       
        //   293: goto            298
        //   296: aload_1        
        //   297: athrow         
        //   298: goto            296
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                  
        //  -----  -----  -----  -----  ----------------------
        //  79     94     187    208    Ljava/io/EOFException;
        //  79     94     149    187    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
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
