import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdu extends AtomicInteger implements asir
{
    private static final long serialVersionUID = 2983708048395377667L;
    final ashy a;
    final asjr b;
    final atdv[] c;
    final Object[] d;
    volatile boolean e;
    
    public atdu(final ashy a, final asjr b) {
        this.a = a;
        this.b = b;
        this.c = new atdv[2];
        this.d = new Object[2];
    }
    
    final void a() {
        this.c();
        this.b();
    }
    
    final void b() {
        final atdv[] c = this.c;
        final int length = c.length;
        for (int i = 0; i < 2; ++i) {
            asjv.b(c[i].e);
        }
    }
    
    final void c() {
        final atdv[] c = this.c;
        final int length = c.length;
        for (int i = 0; i < 2; ++i) {
            c[i].b.c();
        }
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   atdu.getAndIncrement:()I
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0        
        //     9: getfield        atdu.c:[Latdv;
        //    12: astore          9
        //    14: aload_0        
        //    15: getfield        atdu.a:Lashy;
        //    18: astore          7
        //    20: aload_0        
        //    21: getfield        atdu.d:[Ljava/lang/Object;
        //    24: astore          8
        //    26: iconst_1       
        //    27: istore_1       
        //    28: aload           9
        //    30: arraylength    
        //    31: istore_2       
        //    32: iconst_0       
        //    33: istore          5
        //    35: iconst_0       
        //    36: istore_3       
        //    37: iconst_0       
        //    38: istore_2       
        //    39: iload           5
        //    41: iconst_2       
        //    42: if_icmpge       231
        //    45: aload           9
        //    47: iload           5
        //    49: aaload         
        //    50: astore          11
        //    52: aload           8
        //    54: iload_2        
        //    55: aaload         
        //    56: ifnonnull       174
        //    59: aload           11
        //    61: getfield        atdv.c:Z
        //    64: istore          6
        //    66: aload           11
        //    68: getfield        atdv.b:Latgh;
        //    71: invokevirtual   atgh.tw:()Ljava/lang/Object;
        //    74: astore          10
        //    76: aload_0        
        //    77: getfield        atdu.e:Z
        //    80: ifeq            88
        //    83: aload_0        
        //    84: invokevirtual   atdu.a:()V
        //    87: return         
        //    88: iload           6
        //    90: ifeq            149
        //    93: aload           11
        //    95: getfield        atdv.d:Ljava/lang/Throwable;
        //    98: astore          11
        //   100: aload           11
        //   102: ifnull          124
        //   105: aload_0        
        //   106: iconst_1       
        //   107: putfield        atdu.e:Z
        //   110: aload_0        
        //   111: invokevirtual   atdu.a:()V
        //   114: aload           7
        //   116: aload           11
        //   118: invokeinterface ashy.b:(Ljava/lang/Throwable;)V
        //   123: return         
        //   124: aload           10
        //   126: ifnull          132
        //   129: goto            149
        //   132: aload_0        
        //   133: iconst_1       
        //   134: putfield        atdu.e:Z
        //   137: aload_0        
        //   138: invokevirtual   atdu.a:()V
        //   141: aload           7
        //   143: invokeinterface ashy.tx:()V
        //   148: return         
        //   149: aload           10
        //   151: ifnull          166
        //   154: aload           8
        //   156: iload_2        
        //   157: aload           10
        //   159: aastore        
        //   160: iload_3        
        //   161: istore          4
        //   163: goto            219
        //   166: iload_3        
        //   167: iconst_1       
        //   168: iadd           
        //   169: istore          4
        //   171: goto            219
        //   174: iload_3        
        //   175: istore          4
        //   177: aload           11
        //   179: getfield        atdv.c:Z
        //   182: ifeq            219
        //   185: aload           11
        //   187: getfield        atdv.d:Ljava/lang/Throwable;
        //   190: astore          10
        //   192: iload_3        
        //   193: istore          4
        //   195: aload           10
        //   197: ifnull          219
        //   200: aload_0        
        //   201: iconst_1       
        //   202: putfield        atdu.e:Z
        //   205: aload_0        
        //   206: invokevirtual   atdu.a:()V
        //   209: aload           7
        //   211: aload           10
        //   213: invokeinterface ashy.b:(Ljava/lang/Throwable;)V
        //   218: return         
        //   219: iinc            2, 1
        //   222: iinc            5, 1
        //   225: iload           4
        //   227: istore_3       
        //   228: goto            39
        //   231: iload_3        
        //   232: ifeq            249
        //   235: aload_0        
        //   236: iload_1        
        //   237: ineg           
        //   238: invokevirtual   atdu.addAndGet:(I)I
        //   241: istore_2       
        //   242: iload_2        
        //   243: istore_1       
        //   244: iload_2        
        //   245: ifne            28
        //   248: return         
        //   249: aload_0        
        //   250: getfield        atdu.b:Lasjr;
        //   253: aload           8
        //   255: invokevirtual   [java/lang/Object.clone:()Ljava/lang/Object;
        //   258: invokeinterface asjr.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   263: astore          10
        //   265: aload           10
        //   267: ldc             "The zipper returned a null value"
        //   269: invokestatic    askk.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   272: aload           7
        //   274: aload           10
        //   276: invokeinterface ashy.tu:(Ljava/lang/Object;)V
        //   281: aload           8
        //   283: aconst_null    
        //   284: invokestatic    java/util/Arrays.fill:([Ljava/lang/Object;Ljava/lang/Object;)V
        //   287: goto            28
        //   290: astore          8
        //   292: aload           8
        //   294: invokestatic    asgz.c:(Ljava/lang/Throwable;)V
        //   297: aload_0        
        //   298: invokevirtual   atdu.a:()V
        //   301: aload           7
        //   303: aload           8
        //   305: invokeinterface ashy.b:(Ljava/lang/Throwable;)V
        //   310: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  249    272    290    311    Any
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
    
    @Override
    public final void dispose() {
        if (!this.e) {
            this.e = true;
            this.b();
            if (this.getAndIncrement() == 0) {
                this.c();
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.e;
    }
}
