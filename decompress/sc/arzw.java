// 
// Decompiled by Procyon v0.6.0
// 

final class arzw extends asap
{
    final asft a;
    final arzz b;
    
    public arzw(final arzz b, final asft a) {
        this.b = b;
        this.a = a;
        super(b.b.d);
    }
    
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        arzw.b:Larzz;
        //     8: getfield        arzz.a:Lio/grpc/Status;
        //    11: astore          5
        //    13: aload           5
        //    15: ifnonnull       511
        //    18: aload_0        
        //    19: getfield        arzw.a:Lasft;
        //    22: invokeinterface asft.f:()Ljava/io/InputStream;
        //    27: astore          7
        //    29: aload           7
        //    31: ifnull          480
        //    34: aload_0        
        //    35: getfield        arzw.b:Larzz;
        //    38: astore          5
        //    40: aload           5
        //    42: getfield        arzz.c:Larbu;
        //    45: astore          8
        //    47: aload           5
        //    49: getfield        arzz.b:Lasab;
        //    52: getfield        asab.a:Larwo;
        //    55: getfield        arwo.d:Larwm;
        //    58: astore          9
        //    60: aload           7
        //    62: instanceof      Lasga;
        //    65: ifeq            129
        //    68: aload           7
        //    70: checkcast       Lasga;
        //    73: astore          5
        //    75: aload           5
        //    77: getfield        asga.b:Lahdd;
        //    80: astore          6
        //    82: aload           9
        //    84: checkcast       Lasgb;
        //    87: getfield        asgb.b:Lahdd;
        //    90: astore          10
        //    92: aload           6
        //    94: aload           10
        //    96: if_acmpne       129
        //    99: aload           5
        //   101: getfield        asga.a:Lcom/google/protobuf/MessageLite;
        //   104: astore          5
        //   106: aload           5
        //   108: ifnull          114
        //   111: goto            414
        //   114: new             Ljava/lang/IllegalStateException;
        //   117: astore          5
        //   119: aload           5
        //   121: ldc             "message not available"
        //   123: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   126: aload           5
        //   128: athrow         
        //   129: aload           7
        //   131: instanceof      Larvk;
        //   134: istore          4
        //   136: aconst_null    
        //   137: astore          6
        //   139: aload           6
        //   141: astore          5
        //   143: iload           4
        //   145: ifeq            365
        //   148: aload           7
        //   150: invokevirtual   java/io/InputStream.available:()I
        //   153: istore_2       
        //   154: iload_2        
        //   155: ifle            344
        //   158: iload_2        
        //   159: ldc             4194304
        //   161: if_icmpgt       344
        //   164: getstatic       asgb.a:Ljava/lang/ThreadLocal;
        //   167: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   170: checkcast       Ljava/lang/ref/Reference;
        //   173: astore          5
        //   175: aload           5
        //   177: ifnull          206
        //   180: aload           5
        //   182: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //   185: checkcast       [B
        //   188: astore          6
        //   190: aload           6
        //   192: ifnull          206
        //   195: aload           6
        //   197: astore          5
        //   199: aload           6
        //   201: arraylength    
        //   202: iload_2        
        //   203: if_icmpge       235
        //   206: iload_2        
        //   207: newarray        B
        //   209: astore          5
        //   211: getstatic       asgb.a:Ljava/lang/ThreadLocal;
        //   214: astore          6
        //   216: new             Ljava/lang/ref/WeakReference;
        //   219: astore          10
        //   221: aload           10
        //   223: aload           5
        //   225: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //   228: aload           6
        //   230: aload           10
        //   232: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //   235: iload_2        
        //   236: istore_1       
        //   237: iload_1        
        //   238: ifle            268
        //   241: aload           7
        //   243: aload           5
        //   245: iload_2        
        //   246: iload_1        
        //   247: isub           
        //   248: iload_1        
        //   249: invokevirtual   java/io/InputStream.read:([BII)I
        //   252: istore_3       
        //   253: iload_3        
        //   254: iconst_m1      
        //   255: if_icmpne       261
        //   258: goto            268
        //   261: iload_1        
        //   262: iload_3        
        //   263: isub           
        //   264: istore_1       
        //   265: goto            237
        //   268: iload_1        
        //   269: ifne            284
        //   272: aload           5
        //   274: iconst_0       
        //   275: iload_2        
        //   276: invokestatic    ahag.R:([BII)Lahag;
        //   279: astore          5
        //   281: goto            365
        //   284: new             Ljava/lang/RuntimeException;
        //   287: astore          6
        //   289: new             Ljava/lang/StringBuilder;
        //   292: astore          5
        //   294: aload           5
        //   296: invokespecial   java/lang/StringBuilder.<init>:()V
        //   299: aload           5
        //   301: ldc             "size inaccurate: "
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: pop            
        //   307: aload           5
        //   309: iload_2        
        //   310: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   313: pop            
        //   314: aload           5
        //   316: ldc             " != "
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: pop            
        //   322: aload           5
        //   324: iload_2        
        //   325: iload_1        
        //   326: isub           
        //   327: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   330: pop            
        //   331: aload           6
        //   333: aload           5
        //   335: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   338: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   341: aload           6
        //   343: athrow         
        //   344: aload           6
        //   346: astore          5
        //   348: iload_2        
        //   349: ifne            365
        //   352: aload           9
        //   354: checkcast       Lasgb;
        //   357: getfield        asgb.c:Lcom/google/protobuf/MessageLite;
        //   360: astore          5
        //   362: goto            414
        //   365: aload           5
        //   367: astore          6
        //   369: aload           5
        //   371: ifnonnull       381
        //   374: aload           7
        //   376: invokestatic    ahag.M:(Ljava/io/InputStream;)Lahag;
        //   379: astore          6
        //   381: aload           6
        //   383: ldc             2147483647
        //   385: putfield        ahag.c:I
        //   388: aload           9
        //   390: checkcast       Lasgb;
        //   393: getfield        asgb.b:Lahdd;
        //   396: aload           6
        //   398: getstatic       asgc.a:Lcom/google/protobuf/ExtensionRegistryLite;
        //   401: invokeinterface ahdd.j:(Lahag;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //   406: astore          5
        //   408: aload           6
        //   410: iconst_0       
        //   411: invokevirtual   ahag.B:(I)V
        //   414: aload           8
        //   416: aload           5
        //   418: invokevirtual   arbu.c:(Ljava/lang/Object;)V
        //   421: aload           7
        //   423: invokevirtual   java/io/InputStream.close:()V
        //   426: goto            18
        //   429: astore          5
        //   431: aload           5
        //   433: athrow         
        //   434: astore          5
        //   436: getstatic       io/grpc/Status.k:Lio/grpc/Status;
        //   439: ldc             "Invalid protobuf byte sequence"
        //   441: invokevirtual   io/grpc/Status.withDescription:(Ljava/lang/String;)Lio/grpc/Status;
        //   444: aload           5
        //   446: invokevirtual   io/grpc/Status.c:(Ljava/lang/Throwable;)Lio/grpc/Status;
        //   449: invokevirtual   io/grpc/Status.d:()Larxh;
        //   452: athrow         
        //   453: astore          5
        //   455: new             Ljava/lang/RuntimeException;
        //   458: astore          6
        //   460: aload           6
        //   462: aload           5
        //   464: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   467: aload           6
        //   469: athrow         
        //   470: astore          5
        //   472: aload           7
        //   474: invokestatic    asby.g:(Ljava/io/Closeable;)V
        //   477: aload           5
        //   479: athrow         
        //   480: return         
        //   481: astore          5
        //   483: aload_0        
        //   484: getfield        arzw.a:Lasft;
        //   487: invokestatic    asby.f:(Lasft;)V
        //   490: aload_0        
        //   491: getfield        arzw.b:Larzz;
        //   494: getstatic       io/grpc/Status.b:Lio/grpc/Status;
        //   497: aload           5
        //   499: invokevirtual   io/grpc/Status.c:(Ljava/lang/Throwable;)Lio/grpc/Status;
        //   502: ldc             "Failed to read message."
        //   504: invokevirtual   io/grpc/Status.withDescription:(Ljava/lang/String;)Lio/grpc/Status;
        //   507: invokevirtual   arzz.b:(Lio/grpc/Status;)V
        //   510: return         
        //   511: aload_0        
        //   512: getfield        arzw.a:Lasft;
        //   515: invokestatic    asby.f:(Lasft;)V
        //   518: return         
        //   519: astore          5
        //   521: goto            527
        //   524: aload           5
        //   526: athrow         
        //   527: goto            524
        //   530: astore          5
        //   532: goto            129
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      13     519    530    Any
        //  18     29     481    511    Any
        //  34     92     470    480    Any
        //  99     106    530    535    Ljava/lang/IllegalStateException;
        //  99     106    470    480    Any
        //  114    129    530    535    Ljava/lang/IllegalStateException;
        //  114    129    470    480    Any
        //  129    136    453    470    Ljava/io/IOException;
        //  129    136    470    480    Any
        //  148    154    453    470    Ljava/io/IOException;
        //  148    154    470    480    Any
        //  164    175    453    470    Ljava/io/IOException;
        //  164    175    470    480    Any
        //  180    190    453    470    Ljava/io/IOException;
        //  180    190    470    480    Any
        //  199    206    453    470    Ljava/io/IOException;
        //  199    206    470    480    Any
        //  206    235    453    470    Ljava/io/IOException;
        //  206    235    470    480    Any
        //  241    253    453    470    Ljava/io/IOException;
        //  241    253    470    480    Any
        //  272    281    453    470    Ljava/io/IOException;
        //  272    281    470    480    Any
        //  284    344    453    470    Ljava/io/IOException;
        //  284    344    470    480    Any
        //  352    362    453    470    Ljava/io/IOException;
        //  352    362    470    480    Any
        //  374    381    470    480    Any
        //  381    388    470    480    Any
        //  388    408    434    453    Lahca;
        //  388    408    470    480    Any
        //  408    414    429    434    Lahca;
        //  408    414    470    480    Any
        //  414    421    470    480    Any
        //  421    426    481    511    Any
        //  431    434    434    453    Lahca;
        //  431    434    470    480    Any
        //  436    453    470    480    Any
        //  455    470    470    480    Any
        //  472    480    481    511    Any
        //  483    510    519    530    Any
        //  511    518    519    530    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
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
}
