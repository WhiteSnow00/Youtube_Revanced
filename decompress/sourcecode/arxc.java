import java.util.concurrent.ConcurrentLinkedQueue;
import android.os.Parcel;
import java.util.Queue;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class arxc
{
    private boolean a;
    private InputStream b;
    public final arwg c;
    public final int d;
    public final asfc e;
    private Queue f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    
    public arxc(final arwg c, final int d, final asfc e) {
        this.k = 1;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final void c(final int k) {
        final int i = this.k;
        final int n = k - 1;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    if (i == 3) {
                        b3 = true;
                    }
                    agot.D(b3);
                }
            }
            else {
                boolean b4 = b;
                if (i == 2) {
                    b4 = true;
                }
                agot.D(b4);
            }
        }
        else {
            boolean b5 = b2;
            if (i == 1) {
                b5 = true;
            }
            agot.D(b5);
        }
        this.k = k;
    }
    
    protected abstract int a(final Parcel p0);
    
    protected abstract int b(final Parcel p0);
    
    final void d(final InputStream b) {
        this.e();
        final Queue f = this.f;
        if (f != null) {
            f.add(b);
            return;
        }
        if (this.b == null) {
            this.b = b;
            return;
        }
        (this.f = new ConcurrentLinkedQueue()).add(b);
    }
    
    protected final void e() {
        this.a = true;
    }
    
    protected final void f() {
        this.g = true;
    }
    
    final void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        arxc.k:I
        //     4: istore_1       
        //     5: iload_1        
        //     6: iconst_1       
        //     7: isub           
        //     8: istore_2       
        //     9: aconst_null    
        //    10: astore_3       
        //    11: iload_1        
        //    12: ifeq            610
        //    15: iload_2        
        //    16: ifeq            59
        //    19: iload_2        
        //    20: iconst_1       
        //    21: if_icmpeq       42
        //    24: iload_2        
        //    25: iconst_2       
        //    26: if_icmpeq       32
        //    29: goto            609
        //    32: aload_0        
        //    33: getfield        arxc.g:Z
        //    36: ifne            66
        //    39: goto            609
        //    42: aload_0        
        //    43: invokevirtual   arxc.i:()Z
        //    46: ifne            66
        //    49: aload_0        
        //    50: getfield        arxc.g:Z
        //    53: ifne            66
        //    56: goto            609
        //    59: aload_0        
        //    60: getfield        arxc.a:Z
        //    63: ifeq            609
        //    66: aload_0        
        //    67: invokevirtual   arxc.h:()Z
        //    70: ifeq            609
        //    73: invokestatic    arxd.c:()Larxd;
        //    76: astore          4
        //    78: aload           4
        //    80: invokevirtual   arxd.a:()Landroid/os/Parcel;
        //    83: iconst_0       
        //    84: invokevirtual   android/os/Parcel.writeInt:(I)V
        //    87: aload           4
        //    89: invokevirtual   arxd.a:()Landroid/os/Parcel;
        //    92: astore          5
        //    94: aload_0        
        //    95: getfield        arxc.h:I
        //    98: istore_2       
        //    99: aload_0        
        //   100: iload_2        
        //   101: iconst_1       
        //   102: iadd           
        //   103: putfield        arxc.h:I
        //   106: aload           5
        //   108: iload_2        
        //   109: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   112: aload_0        
        //   113: getfield        arxc.k:I
        //   116: istore_2       
        //   117: iload_2        
        //   118: iconst_1       
        //   119: isub           
        //   120: istore_1       
        //   121: iload_2        
        //   122: ifeq            541
        //   125: iload_1        
        //   126: ifeq            159
        //   129: iload_1        
        //   130: iconst_1       
        //   131: if_icmpeq       154
        //   134: iload_1        
        //   135: iconst_2       
        //   136: if_icmpne       144
        //   139: iconst_0       
        //   140: istore_2       
        //   141: goto            467
        //   144: new             Ljava/lang/AssertionError;
        //   147: astore_3       
        //   148: aload_3        
        //   149: invokespecial   java/lang/AssertionError.<init>:()V
        //   152: aload_3        
        //   153: athrow         
        //   154: iconst_0       
        //   155: istore_2       
        //   156: goto            197
        //   159: aload_0        
        //   160: aload           4
        //   162: invokevirtual   arxd.a:()Landroid/os/Parcel;
        //   165: invokevirtual   arxc.a:(Landroid/os/Parcel;)I
        //   168: iconst_1       
        //   169: ior            
        //   170: istore_1       
        //   171: aload_0        
        //   172: iconst_2       
        //   173: invokespecial   arxc.c:(I)V
        //   176: iload_1        
        //   177: istore_2       
        //   178: aload_0        
        //   179: invokevirtual   arxc.i:()Z
        //   182: ifne            197
        //   185: iload_1        
        //   186: istore_2       
        //   187: aload_0        
        //   188: getfield        arxc.g:Z
        //   191: ifne            197
        //   194: goto            486
        //   197: aload_0        
        //   198: getfield        arxc.i:I
        //   201: ifne            212
        //   204: aload_0        
        //   205: getfield        arxc.b:Ljava/io/InputStream;
        //   208: astore_3       
        //   209: goto            234
        //   212: aload_0        
        //   213: getfield        arxc.f:Ljava/util/Queue;
        //   216: astore          5
        //   218: aload           5
        //   220: ifnull          234
        //   223: aload           5
        //   225: invokeinterface java/util/Queue.peek:()Ljava/lang/Object;
        //   230: checkcast       Ljava/io/InputStream;
        //   233: astore_3       
        //   234: aload_3        
        //   235: ifnull          437
        //   238: aload           4
        //   240: invokevirtual   arxd.a:()Landroid/os/Parcel;
        //   243: astore          6
        //   245: aload_3        
        //   246: instanceof      Larxe;
        //   249: ifeq            274
        //   252: aload_0        
        //   253: aload_3        
        //   254: checkcast       Larxe;
        //   257: aload           6
        //   259: invokevirtual   arxe.a:(Landroid/os/Parcel;)I
        //   262: putfield        arxc.j:I
        //   265: bipush          64
        //   267: istore_1       
        //   268: iconst_0       
        //   269: istore          7
        //   271: goto            356
        //   274: invokestatic    arwk.b:()[B
        //   277: astore          5
        //   279: aload_3        
        //   280: aload           5
        //   282: invokevirtual   java/io/InputStream.read:([B)I
        //   285: istore          7
        //   287: iload           7
        //   289: ifgt            306
        //   292: aload           6
        //   294: iconst_0       
        //   295: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   298: iconst_0       
        //   299: istore_1       
        //   300: iconst_0       
        //   301: istore          7
        //   303: goto            351
        //   306: aload           6
        //   308: iload           7
        //   310: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   313: aload           6
        //   315: aload           5
        //   317: iconst_0       
        //   318: iload           7
        //   320: invokevirtual   android/os/Parcel.writeByteArray:([BII)V
        //   323: aload_0        
        //   324: aload_0        
        //   325: getfield        arxc.j:I
        //   328: iload           7
        //   330: iadd           
        //   331: putfield        arxc.j:I
        //   334: aload           5
        //   336: arraylength    
        //   337: istore_1       
        //   338: iload           7
        //   340: iload_1        
        //   341: if_icmpne       298
        //   344: sipush          128
        //   347: istore_1       
        //   348: iconst_1       
        //   349: istore          7
        //   351: aload           5
        //   353: invokestatic    arwk.a:([B)V
        //   356: iload           7
        //   358: ifne            420
        //   361: aload_3        
        //   362: invokevirtual   java/io/InputStream.close:()V
        //   365: aload_0        
        //   366: getfield        arxc.i:I
        //   369: istore          7
        //   371: aload_0        
        //   372: iload           7
        //   374: iconst_1       
        //   375: iadd           
        //   376: putfield        arxc.i:I
        //   379: iload           7
        //   381: ifle            401
        //   384: aload_0        
        //   385: getfield        arxc.f:Ljava/util/Queue;
        //   388: astore_3       
        //   389: aload_3        
        //   390: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   393: pop            
        //   394: aload_3        
        //   395: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //   400: pop            
        //   401: aload_0        
        //   402: getfield        arxc.e:Lasfc;
        //   405: invokevirtual   asfc.i:()V
        //   408: aload_0        
        //   409: getfield        arxc.e:Lasfc;
        //   412: invokevirtual   asfc.j:()V
        //   415: aload_0        
        //   416: iconst_0       
        //   417: putfield        arxc.j:I
        //   420: iload_2        
        //   421: iconst_2       
        //   422: ior            
        //   423: iload_1        
        //   424: ior            
        //   425: istore_2       
        //   426: goto            444
        //   429: astore_3       
        //   430: aload           5
        //   432: invokestatic    arwk.a:([B)V
        //   435: aload_3        
        //   436: athrow         
        //   437: aload_0        
        //   438: getfield        arxc.g:Z
        //   441: invokestatic    agot.D:(Z)V
        //   444: iload_2        
        //   445: istore_1       
        //   446: aload_0        
        //   447: getfield        arxc.g:Z
        //   450: ifeq            486
        //   453: iload_2        
        //   454: istore_1       
        //   455: aload_0        
        //   456: invokevirtual   arxc.i:()Z
        //   459: ifne            486
        //   462: aload_0        
        //   463: iconst_3       
        //   464: invokespecial   arxc.c:(I)V
        //   467: aload_0        
        //   468: aload           4
        //   470: invokevirtual   arxd.a:()Landroid/os/Parcel;
        //   473: invokevirtual   arxc.b:(Landroid/os/Parcel;)I
        //   476: iload_2        
        //   477: iconst_4       
        //   478: ior            
        //   479: ior            
        //   480: istore_1       
        //   481: aload_0        
        //   482: iconst_4       
        //   483: invokespecial   arxc.c:(I)V
        //   486: aload           4
        //   488: invokevirtual   arxd.a:()Landroid/os/Parcel;
        //   491: iload_1        
        //   492: invokestatic    arxi.k:(Landroid/os/Parcel;I)V
        //   495: aload           4
        //   497: invokevirtual   arxd.a:()Landroid/os/Parcel;
        //   500: invokevirtual   android/os/Parcel.dataSize:()I
        //   503: istore_2       
        //   504: aload_0        
        //   505: getfield        arxc.c:Larwg;
        //   508: aload_0        
        //   509: getfield        arxc.d:I
        //   512: aload           4
        //   514: invokevirtual   arwg.p:(ILarxd;)V
        //   517: aload_0        
        //   518: getfield        arxc.e:Lasfc;
        //   521: iload_2        
        //   522: i2l            
        //   523: invokevirtual   asfc.c:(J)V
        //   526: aload_0        
        //   527: getfield        arxc.e:Lasfc;
        //   530: invokevirtual   asfc.k:()V
        //   533: aload           4
        //   535: invokevirtual   arxd.close:()V
        //   538: goto            0
        //   541: aconst_null    
        //   542: athrow         
        //   543: astore_3       
        //   544: aload           4
        //   546: invokevirtual   arxd.close:()V
        //   549: goto            584
        //   552: astore          4
        //   554: ldc             Ljava/lang/Throwable;.class
        //   556: ldc             "addSuppressed"
        //   558: iconst_1       
        //   559: anewarray       Ljava/lang/Class;
        //   562: dup            
        //   563: iconst_0       
        //   564: ldc             Ljava/lang/Throwable;.class
        //   566: aastore        
        //   567: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   570: aload_3        
        //   571: iconst_1       
        //   572: anewarray       Ljava/lang/Object;
        //   575: dup            
        //   576: iconst_0       
        //   577: aload           4
        //   579: aastore        
        //   580: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   583: pop            
        //   584: aload_3        
        //   585: athrow         
        //   586: astore_3       
        //   587: goto            602
        //   590: astore_3       
        //   591: getstatic       io/grpc/Status.k:Lio/grpc/Status;
        //   594: aload_3        
        //   595: invokevirtual   io/grpc/Status.c:(Ljava/lang/Throwable;)Lio/grpc/Status;
        //   598: invokevirtual   io/grpc/Status.asException:()Lio/grpc/StatusException;
        //   601: athrow         
        //   602: aload_0        
        //   603: iconst_5       
        //   604: invokespecial   arxc.c:(I)V
        //   607: aload_3        
        //   608: athrow         
        //   609: return         
        //   610: goto            615
        //   613: aconst_null    
        //   614: athrow         
        //   615: goto            613
        //   618: astore          4
        //   620: goto            584
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                     
        //  -----  -----  -----  -----  -------------------------
        //  73     78     590    602    Ljava/io/IOException;
        //  73     78     586    590    Lio/grpc/StatusException;
        //  78     117    543    586    Any
        //  144    154    543    586    Any
        //  159    176    543    586    Any
        //  178    185    543    586    Any
        //  187    194    543    586    Any
        //  197    209    543    586    Any
        //  212    218    543    586    Any
        //  223    234    543    586    Any
        //  238    265    543    586    Any
        //  274    279    543    586    Any
        //  279    287    429    437    Any
        //  292    298    429    437    Any
        //  306    338    429    437    Any
        //  351    356    543    586    Any
        //  361    379    543    586    Any
        //  384    401    543    586    Any
        //  401    420    543    586    Any
        //  430    437    543    586    Any
        //  437    444    543    586    Any
        //  446    453    543    586    Any
        //  455    467    543    586    Any
        //  467    486    543    586    Any
        //  486    533    543    586    Any
        //  533    538    590    602    Ljava/io/IOException;
        //  533    538    586    590    Lio/grpc/StatusException;
        //  541    543    543    586    Any
        //  544    549    552    584    Any
        //  554    584    618    623    Ljava/lang/Exception;
        //  584    586    590    602    Ljava/io/IOException;
        //  584    586    586    590    Lio/grpc/StatusException;
        //  591    602    586    590    Lio/grpc/StatusException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0584:
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
    
    final boolean h() {
        return this.c.s();
    }
    
    protected final boolean i() {
        final Queue f = this.f;
        if (f != null) {
            return !f.isEmpty();
        }
        return this.b != null && this.i == 0;
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final String simpleName = this.getClass().getSimpleName();
            final int k = this.k;
            String s;
            if (k != 1) {
                if (k != 2) {
                    if (k != 3) {
                        if (k != 4) {
                            if (k != 5) {
                                s = "null";
                            }
                            else {
                                s = "CLOSED";
                            }
                        }
                        else {
                            s = "SUFFIX_SENT";
                        }
                    }
                    else {
                        s = "ALL_MESSAGES_SENT";
                    }
                }
                else {
                    s = "PREFIX_SENT";
                }
            }
            else {
                s = "INITIAL";
            }
            final int i = this.i;
            final StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("[S=");
            sb.append(s);
            sb.append("/NDM=");
            sb.append(i);
            sb.append("]");
            return sb.toString();
        }
    }
}
