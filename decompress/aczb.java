import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczb implements acxu, acxz
{
    public adia a;
    public xao b;
    private acyk c;
    private final String d;
    private final String e;
    
    public aczb(final File file, final String e) {
        final String absolutePath = file.getAbsolutePath();
        tvb.n(absolutePath);
        this.d = absolutePath;
        this.e = e;
    }
    
    private final acyk f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: new             Ljava/io/File;
        //     5: astore          17
        //     7: aload           17
        //     9: aload_0        
        //    10: getfield        aczb.d:Ljava/lang/String;
        //    13: aload_0        
        //    14: getfield        aczb.e:Ljava/lang/String;
        //    17: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    20: aload           17
        //    22: invokevirtual   java/io/File.exists:()Z
        //    25: istore          5
        //    27: aconst_null    
        //    28: astore          10
        //    30: iload           5
        //    32: ifeq            818
        //    35: iconst_1       
        //    36: istore_3       
        //    37: iconst_0       
        //    38: istore_1       
        //    39: aload           17
        //    41: invokevirtual   java/io/File.length:()J
        //    44: lstore          6
        //    46: lload           6
        //    48: lconst_0       
        //    49: lcmp           
        //    50: ifne            57
        //    53: aload_0        
        //    54: monitorexit    
        //    55: aconst_null    
        //    56: areturn        
        //    57: new             Ljava/io/BufferedInputStream;
        //    60: astore          12
        //    62: new             Ljava/io/FileInputStream;
        //    65: astore          11
        //    67: aload           11
        //    69: aload           17
        //    71: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    74: aload           12
        //    76: aload           11
        //    78: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    81: new             Ljava/io/ObjectInputStream;
        //    84: astore          10
        //    86: aload           10
        //    88: aload           12
        //    90: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    93: aload           10
        //    95: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    98: istore_1       
        //    99: aload           10
        //   101: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   104: istore          4
        //   106: lload           6
        //   108: ldc2_w          8
        //   111: lsub           
        //   112: lstore          6
        //   114: iload           4
        //   116: i2l            
        //   117: lstore          8
        //   119: lload           8
        //   121: lload           6
        //   123: lcmp           
        //   124: ifle            168
        //   127: aload           10
        //   129: invokevirtual   java/io/ObjectInputStream.close:()V
        //   132: goto            153
        //   135: astore          11
        //   137: goto            324
        //   140: astore          10
        //   142: aconst_null    
        //   143: astore          11
        //   145: aconst_null    
        //   146: astore          10
        //   148: iconst_1       
        //   149: istore_2       
        //   150: goto            706
        //   153: aload           12
        //   155: invokevirtual   java/io/BufferedInputStream.close:()V
        //   158: aload           17
        //   160: invokevirtual   java/io/File.delete:()Z
        //   163: pop            
        //   164: aload_0        
        //   165: monitorexit    
        //   166: aconst_null    
        //   167: areturn        
        //   168: iload           4
        //   170: newarray        B
        //   172: astore          11
        //   174: aload           10
        //   176: astore          14
        //   178: iload_1        
        //   179: istore_2       
        //   180: aload           11
        //   182: astore          13
        //   184: aload           10
        //   186: aload           11
        //   188: iconst_0       
        //   189: iload           4
        //   191: invokevirtual   java/io/ObjectInputStream.readFully:([BII)V
        //   194: aload           10
        //   196: astore          14
        //   198: iload_1        
        //   199: istore_2       
        //   200: aload           11
        //   202: astore          13
        //   204: aload           10
        //   206: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   209: istore          4
        //   211: iload           4
        //   213: i2l            
        //   214: lload           6
        //   216: lload           8
        //   218: lsub           
        //   219: ldc2_w          4
        //   222: lsub           
        //   223: lcmp           
        //   224: ifgt            316
        //   227: aload           10
        //   229: astore          14
        //   231: iload_1        
        //   232: istore_2       
        //   233: aload           11
        //   235: astore          13
        //   237: iload           4
        //   239: newarray        B
        //   241: astore          16
        //   243: aload           10
        //   245: astore          14
        //   247: iload_1        
        //   248: istore_2       
        //   249: aload           11
        //   251: astore          13
        //   253: aload           10
        //   255: aload           16
        //   257: iconst_0       
        //   258: iload           4
        //   260: invokevirtual   java/io/ObjectInputStream.readFully:([BII)V
        //   263: aload           10
        //   265: astore          14
        //   267: iload_1        
        //   268: istore_2       
        //   269: aload           11
        //   271: astore          13
        //   273: new             Ljava/lang/String;
        //   276: astore          15
        //   278: aload           10
        //   280: astore          14
        //   282: iload_1        
        //   283: istore_2       
        //   284: aload           11
        //   286: astore          13
        //   288: aload           15
        //   290: aload           16
        //   292: invokespecial   java/lang/String.<init>:([B)V
        //   295: aload           10
        //   297: invokevirtual   java/io/ObjectInputStream.close:()V
        //   300: aload           15
        //   302: astore          10
        //   304: goto            625
        //   307: astore          10
        //   309: aload           15
        //   311: astore          10
        //   313: goto            525
        //   316: aload           10
        //   318: invokevirtual   java/io/ObjectInputStream.close:()V
        //   321: goto            338
        //   324: aload           12
        //   326: astore          10
        //   328: iload_3        
        //   329: istore_1       
        //   330: goto            669
        //   333: astore          10
        //   335: goto            145
        //   338: aload           12
        //   340: invokevirtual   java/io/BufferedInputStream.close:()V
        //   343: aload           17
        //   345: invokevirtual   java/io/File.delete:()Z
        //   348: pop            
        //   349: aload_0        
        //   350: monitorexit    
        //   351: aconst_null    
        //   352: areturn        
        //   353: astore          11
        //   355: iload_2        
        //   356: istore_1       
        //   357: aload           13
        //   359: astore          10
        //   361: goto            633
        //   364: astore          13
        //   366: goto            472
        //   369: astore          16
        //   371: aload           10
        //   373: astore          15
        //   375: aload           11
        //   377: astore          10
        //   379: goto            550
        //   382: astore          11
        //   384: aconst_null    
        //   385: astore          13
        //   387: aload           10
        //   389: astore          14
        //   391: aload           13
        //   393: astore          10
        //   395: goto            633
        //   398: astore          11
        //   400: aconst_null    
        //   401: astore          11
        //   403: goto            472
        //   406: astore          16
        //   408: aconst_null    
        //   409: astore          11
        //   411: aload           10
        //   413: astore          15
        //   415: aload           11
        //   417: astore          10
        //   419: goto            550
        //   422: astore          11
        //   424: goto            446
        //   427: astore          11
        //   429: goto            467
        //   432: astore          16
        //   434: aload           10
        //   436: astore          15
        //   438: goto            545
        //   441: astore          11
        //   443: aconst_null    
        //   444: astore          10
        //   446: aconst_null    
        //   447: astore          13
        //   449: iconst_0       
        //   450: istore_1       
        //   451: aload           10
        //   453: astore          14
        //   455: aload           13
        //   457: astore          10
        //   459: goto            633
        //   462: astore          10
        //   464: aconst_null    
        //   465: astore          10
        //   467: aconst_null    
        //   468: astore          11
        //   470: iconst_0       
        //   471: istore_1       
        //   472: iload_1        
        //   473: istore_2       
        //   474: aload           11
        //   476: astore          13
        //   478: aload           10
        //   480: ifnull          528
        //   483: iload_1        
        //   484: istore_2       
        //   485: aload           11
        //   487: astore          13
        //   489: iload_1        
        //   490: istore_3       
        //   491: aload           11
        //   493: astore          14
        //   495: aload           10
        //   497: invokevirtual   java/io/ObjectInputStream.close:()V
        //   500: iload_1        
        //   501: istore_2       
        //   502: aload           11
        //   504: astore          13
        //   506: goto            528
        //   509: astore          11
        //   511: goto            658
        //   514: astore          10
        //   516: aconst_null    
        //   517: astore          10
        //   519: aload           13
        //   521: astore          11
        //   523: iload_2        
        //   524: istore_1       
        //   525: goto            704
        //   528: aconst_null    
        //   529: astore          10
        //   531: iload_2        
        //   532: istore_1       
        //   533: aload           13
        //   535: astore          11
        //   537: goto            625
        //   540: astore          16
        //   542: aconst_null    
        //   543: astore          15
        //   545: aconst_null    
        //   546: astore          10
        //   548: iconst_0       
        //   549: istore_1       
        //   550: aload           15
        //   552: astore          14
        //   554: iload_1        
        //   555: istore_2       
        //   556: aload           10
        //   558: astore          13
        //   560: aload_0        
        //   561: getfield        aczb.a:Ladia;
        //   564: ldc             "StreamCorruptedException"
        //   566: ldc             "ZeroPrefixCache"
        //   568: invokestatic    acvg.o:(Ladia;Ljava/lang/String;Ljava/lang/String;)V
        //   571: aload           15
        //   573: astore          14
        //   575: iload_1        
        //   576: istore_2       
        //   577: aload           10
        //   579: astore          13
        //   581: ldc             "Stream corruption error in opening zero-prefix cache file."
        //   583: aload           16
        //   585: invokestatic    ttr.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   588: iload_1        
        //   589: istore_2       
        //   590: aload           10
        //   592: astore          13
        //   594: aload           15
        //   596: ifnull          528
        //   599: iload_1        
        //   600: istore_2       
        //   601: aload           10
        //   603: astore          13
        //   605: iload_1        
        //   606: istore_3       
        //   607: aload           10
        //   609: astore          14
        //   611: aload           15
        //   613: invokevirtual   java/io/ObjectInputStream.close:()V
        //   616: iload_1        
        //   617: istore_2       
        //   618: aload           10
        //   620: astore          13
        //   622: goto            528
        //   625: aload           12
        //   627: invokevirtual   java/io/BufferedInputStream.close:()V
        //   630: goto            726
        //   633: aload           14
        //   635: ifnull          649
        //   638: iload_1        
        //   639: istore_2       
        //   640: aload           10
        //   642: astore          13
        //   644: aload           14
        //   646: invokevirtual   java/io/ObjectInputStream.close:()V
        //   649: iload_1        
        //   650: istore_2       
        //   651: aload           10
        //   653: astore          13
        //   655: aload           11
        //   657: athrow         
        //   658: aload           12
        //   660: astore          10
        //   662: goto            667
        //   665: astore          11
        //   667: iconst_0       
        //   668: istore_1       
        //   669: aload           10
        //   671: ifnull          679
        //   674: aload           10
        //   676: invokevirtual   java/io/BufferedInputStream.close:()V
        //   679: iload_1        
        //   680: ifeq            689
        //   683: aload           17
        //   685: invokevirtual   java/io/File.delete:()Z
        //   688: pop            
        //   689: aload           11
        //   691: athrow         
        //   692: astore          10
        //   694: aconst_null    
        //   695: astore          10
        //   697: aconst_null    
        //   698: astore          12
        //   700: aload           12
        //   702: astore          11
        //   704: iconst_0       
        //   705: istore_2       
        //   706: aload           12
        //   708: ifnull          716
        //   711: aload           12
        //   713: invokevirtual   java/io/BufferedInputStream.close:()V
        //   716: iload_2        
        //   717: ifeq            726
        //   720: aload           17
        //   722: invokevirtual   java/io/File.delete:()Z
        //   725: pop            
        //   726: aload_0        
        //   727: invokestatic    acvg.l:(Lacxz;)Lxan;
        //   730: astore          12
        //   732: iload_1        
        //   733: iconst_1       
        //   734: if_icmpeq       787
        //   737: iload_1        
        //   738: iconst_2       
        //   739: if_icmpeq       756
        //   742: ldc             "0-prefix cache: Invalid content type"
        //   744: invokestatic    acvg.m:(Ljava/lang/String;)V
        //   747: ldc             "0-prefix cache: Invalid content type"
        //   749: invokestatic    ttr.b:(Ljava/lang/String;)V
        //   752: aload_0        
        //   753: monitorexit    
        //   754: aconst_null    
        //   755: areturn        
        //   756: new             Lacyj;
        //   759: astore          13
        //   761: aload           13
        //   763: aload           11
        //   765: aload           10
        //   767: invokespecial   acyj.<init>:([BLjava/lang/String;)V
        //   770: aload           13
        //   772: aload           12
        //   774: putfield        acyj.a:Lxan;
        //   777: aload           13
        //   779: invokestatic    acvg.p:(Lacxy;)V
        //   782: aload_0        
        //   783: monitorexit    
        //   784: aload           13
        //   786: areturn        
        //   787: new             Lacxx;
        //   790: astore          13
        //   792: aload           13
        //   794: aload           11
        //   796: aload           10
        //   798: invokespecial   acxx.<init>:([BLjava/lang/String;)V
        //   801: aload           13
        //   803: aload           12
        //   805: putfield        acxx.a:Lxan;
        //   808: aload           13
        //   810: invokestatic    acvg.p:(Lacxy;)V
        //   813: aload_0        
        //   814: monitorexit    
        //   815: aload           13
        //   817: areturn        
        //   818: aload_0        
        //   819: monitorexit    
        //   820: aconst_null    
        //   821: areturn        
        //   822: astore          10
        //   824: aload_0        
        //   825: monitorexit    
        //   826: goto            832
        //   829: aload           10
        //   831: athrow         
        //   832: goto            829
        //   835: astore          10
        //   837: goto            153
        //   840: astore          10
        //   842: goto            164
        //   845: astore          10
        //   847: aload           15
        //   849: astore          10
        //   851: goto            625
        //   854: astore          10
        //   856: goto            338
        //   859: astore          10
        //   861: goto            349
        //   864: astore          10
        //   866: iload_3        
        //   867: istore_2       
        //   868: aload           14
        //   870: astore          13
        //   872: goto            528
        //   875: astore          12
        //   877: goto            726
        //   880: astore          13
        //   882: goto            649
        //   885: astore          10
        //   887: goto            689
        //   890: astore          12
        //   892: goto            726
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  2      27     822    835    Any
        //  39     46     692    704    Ljava/io/FileNotFoundException;
        //  39     46     665    667    Any
        //  57     81     692    704    Ljava/io/FileNotFoundException;
        //  57     81     665    667    Any
        //  81     93     540    545    Ljava/io/StreamCorruptedException;
        //  81     93     462    467    Ljava/io/IOException;
        //  81     93     441    446    Any
        //  93     99     432    441    Ljava/io/StreamCorruptedException;
        //  93     99     427    432    Ljava/io/IOException;
        //  93     99     422    427    Any
        //  99     106    406    422    Ljava/io/StreamCorruptedException;
        //  99     106    398    406    Ljava/io/IOException;
        //  99     106    382    398    Any
        //  127    132    835    840    Ljava/io/IOException;
        //  127    132    140    145    Ljava/io/FileNotFoundException;
        //  127    132    135    140    Any
        //  153    164    840    845    Ljava/io/IOException;
        //  153    164    822    835    Any
        //  168    174    406    422    Ljava/io/StreamCorruptedException;
        //  168    174    398    406    Ljava/io/IOException;
        //  168    174    382    398    Any
        //  184    194    369    382    Ljava/io/StreamCorruptedException;
        //  184    194    364    369    Ljava/io/IOException;
        //  184    194    353    364    Any
        //  204    211    369    382    Ljava/io/StreamCorruptedException;
        //  204    211    364    369    Ljava/io/IOException;
        //  204    211    353    364    Any
        //  237    243    369    382    Ljava/io/StreamCorruptedException;
        //  237    243    364    369    Ljava/io/IOException;
        //  237    243    353    364    Any
        //  253    263    369    382    Ljava/io/StreamCorruptedException;
        //  253    263    364    369    Ljava/io/IOException;
        //  253    263    353    364    Any
        //  273    278    369    382    Ljava/io/StreamCorruptedException;
        //  273    278    364    369    Ljava/io/IOException;
        //  273    278    353    364    Any
        //  288    295    369    382    Ljava/io/StreamCorruptedException;
        //  288    295    364    369    Ljava/io/IOException;
        //  288    295    353    364    Any
        //  295    300    845    854    Ljava/io/IOException;
        //  295    300    307    316    Ljava/io/FileNotFoundException;
        //  295    300    509    514    Any
        //  316    321    854    859    Ljava/io/IOException;
        //  316    321    333    338    Ljava/io/FileNotFoundException;
        //  316    321    135    140    Any
        //  338    349    859    864    Ljava/io/IOException;
        //  338    349    822    835    Any
        //  495    500    864    875    Ljava/io/IOException;
        //  495    500    514    525    Ljava/io/FileNotFoundException;
        //  495    500    509    514    Any
        //  560    571    353    364    Any
        //  581    588    353    364    Any
        //  611    616    864    875    Ljava/io/IOException;
        //  611    616    514    525    Ljava/io/FileNotFoundException;
        //  611    616    509    514    Any
        //  625    630    875    880    Ljava/io/IOException;
        //  625    630    822    835    Any
        //  644    649    880    885    Ljava/io/IOException;
        //  644    649    514    525    Ljava/io/FileNotFoundException;
        //  644    649    509    514    Any
        //  655    658    514    525    Ljava/io/FileNotFoundException;
        //  655    658    509    514    Any
        //  674    679    885    890    Ljava/io/IOException;
        //  674    679    822    835    Any
        //  683    689    885    890    Ljava/io/IOException;
        //  683    689    822    835    Any
        //  689    692    822    835    Any
        //  711    716    890    895    Ljava/io/IOException;
        //  711    716    822    835    Any
        //  720    726    890    895    Ljava/io/IOException;
        //  720    726    822    835    Any
        //  726    732    822    835    Any
        //  742    752    822    835    Any
        //  756    782    822    835    Any
        //  787    813    822    835    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException
        //     at java.util.Collections$1.remove(Unknown Source)
        //     at java.util.AbstractCollection.removeAll(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3018)
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
    
    private final void g() {
        synchronized (this) {
            final File file = new File(this.d, this.e);
            if (file.exists()) {
                file.delete();
            }
            final File file2 = new File(this.d, "zeroprefix.cache");
            if (file2.exists()) {
                file2.delete();
            }
        }
    }
    
    private final void h(final acyk p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: new             Ljava/io/File;
        //     5: astore_2       
        //     6: aload_2        
        //     7: aload_0        
        //     8: getfield        aczb.d:Ljava/lang/String;
        //    11: ldc             "zeroprefix.cache"
        //    13: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    16: aload_2        
        //    17: invokevirtual   java/io/File.exists:()Z
        //    20: ifeq            28
        //    23: aload_2        
        //    24: invokevirtual   java/io/File.delete:()Z
        //    27: pop            
        //    28: new             Ljava/io/File;
        //    31: astore          8
        //    33: aload           8
        //    35: aload_0        
        //    36: getfield        aczb.d:Ljava/lang/String;
        //    39: aload_0        
        //    40: getfield        aczb.e:Ljava/lang/String;
        //    43: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    46: aconst_null    
        //    47: astore          5
        //    49: aconst_null    
        //    50: astore          7
        //    52: aconst_null    
        //    53: astore          4
        //    55: aconst_null    
        //    56: astore          6
        //    58: aload           7
        //    60: astore_2       
        //    61: new             Ljava/io/BufferedOutputStream;
        //    64: astore_3       
        //    65: aload           7
        //    67: astore_2       
        //    68: new             Ljava/io/FileOutputStream;
        //    71: astore          9
        //    73: aload           7
        //    75: astore_2       
        //    76: aload           9
        //    78: aload           8
        //    80: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    83: aload           7
        //    85: astore_2       
        //    86: aload_3        
        //    87: aload           9
        //    89: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    92: aload           6
        //    94: astore_2       
        //    95: new             Ljava/io/ObjectOutputStream;
        //    98: astore          4
        //   100: aload           6
        //   102: astore_2       
        //   103: aload           4
        //   105: aload_3        
        //   106: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   109: aload           4
        //   111: aload_1        
        //   112: invokeinterface acyk.d:()I
        //   117: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   120: aload           4
        //   122: aload_1        
        //   123: invokeinterface acyk.g:()[B
        //   128: arraylength    
        //   129: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   132: aload           4
        //   134: aload_1        
        //   135: invokeinterface acyk.g:()[B
        //   140: invokevirtual   java/io/ObjectOutputStream.write:([B)V
        //   143: aload_1        
        //   144: invokeinterface acyk.f:()Ljava/lang/String;
        //   149: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   152: ifne            183
        //   155: aload           4
        //   157: aload_1        
        //   158: invokeinterface acyk.f:()Ljava/lang/String;
        //   163: invokevirtual   java/lang/String.length:()I
        //   166: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   169: aload           4
        //   171: aload_1        
        //   172: invokeinterface acyk.f:()Ljava/lang/String;
        //   177: invokevirtual   java/lang/String.getBytes:()[B
        //   180: invokevirtual   java/io/ObjectOutputStream.write:([B)V
        //   183: aload           4
        //   185: invokevirtual   java/io/ObjectOutputStream.flush:()V
        //   188: aload           4
        //   190: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   193: goto            239
        //   196: astore_1       
        //   197: aload           4
        //   199: astore_2       
        //   200: goto            250
        //   203: astore_2       
        //   204: aload           4
        //   206: astore_1       
        //   207: aload_2        
        //   208: astore          4
        //   210: goto            222
        //   213: astore_1       
        //   214: goto            250
        //   217: astore          4
        //   219: aload           5
        //   221: astore_1       
        //   222: aload_1        
        //   223: astore_2       
        //   224: ldc             "Exception when writing to zeroprefixrawsuggestResponseCache"
        //   226: aload           4
        //   228: invokestatic    acvg.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   231: aload_1        
        //   232: ifnull          239
        //   235: aload_1        
        //   236: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   239: aload_3        
        //   240: invokevirtual   java/io/BufferedOutputStream.close:()V
        //   243: aload_0        
        //   244: monitorexit    
        //   245: return         
        //   246: astore_1       
        //   247: aload_0        
        //   248: monitorexit    
        //   249: return         
        //   250: aload_2        
        //   251: ifnull          258
        //   254: aload_2        
        //   255: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   258: aload_1        
        //   259: athrow         
        //   260: astore_1       
        //   261: aload_3        
        //   262: astore_2       
        //   263: goto            308
        //   266: astore_2       
        //   267: aload_3        
        //   268: astore_1       
        //   269: aload_2        
        //   270: astore_3       
        //   271: goto            282
        //   274: astore_1       
        //   275: goto            308
        //   278: astore_3       
        //   279: aload           4
        //   281: astore_1       
        //   282: aload_1        
        //   283: astore_2       
        //   284: ldc             "Error creating zero-prefix cache file."
        //   286: aload_3        
        //   287: invokestatic    ttr.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   290: aload_1        
        //   291: ifnull          305
        //   294: aload_1        
        //   295: invokevirtual   java/io/BufferedOutputStream.close:()V
        //   298: aload_0        
        //   299: monitorexit    
        //   300: return         
        //   301: astore_1       
        //   302: aload_0        
        //   303: monitorexit    
        //   304: return         
        //   305: aload_0        
        //   306: monitorexit    
        //   307: return         
        //   308: aload_2        
        //   309: ifnull          316
        //   312: aload_2        
        //   313: invokevirtual   java/io/BufferedOutputStream.close:()V
        //   316: aload_1        
        //   317: athrow         
        //   318: astore_1       
        //   319: aload_0        
        //   320: monitorexit    
        //   321: aload_1        
        //   322: athrow         
        //   323: astore_1       
        //   324: goto            239
        //   327: astore_2       
        //   328: goto            258
        //   331: astore_2       
        //   332: goto            316
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  2      28     318    323    Any
        //  28     46     318    323    Any
        //  61     65     278    282    Ljava/io/FileNotFoundException;
        //  61     65     274    278    Any
        //  68     73     278    282    Ljava/io/FileNotFoundException;
        //  68     73     274    278    Any
        //  76     83     278    282    Ljava/io/FileNotFoundException;
        //  76     83     274    278    Any
        //  86     92     278    282    Ljava/io/FileNotFoundException;
        //  86     92     274    278    Any
        //  95     100    217    222    Ljava/io/IOException;
        //  95     100    213    217    Any
        //  103    109    217    222    Ljava/io/IOException;
        //  103    109    213    217    Any
        //  109    183    203    213    Ljava/io/IOException;
        //  109    183    196    203    Any
        //  183    188    203    213    Ljava/io/IOException;
        //  183    188    196    203    Any
        //  188    193    323    327    Ljava/io/IOException;
        //  188    193    266    274    Ljava/io/FileNotFoundException;
        //  188    193    260    266    Any
        //  224    231    213    217    Any
        //  235    239    323    327    Ljava/io/IOException;
        //  235    239    266    274    Ljava/io/FileNotFoundException;
        //  235    239    260    266    Any
        //  239    243    246    250    Ljava/io/IOException;
        //  239    243    318    323    Any
        //  254    258    327    331    Ljava/io/IOException;
        //  254    258    266    274    Ljava/io/FileNotFoundException;
        //  254    258    260    266    Any
        //  258    260    266    274    Ljava/io/FileNotFoundException;
        //  258    260    260    266    Any
        //  284    290    274    278    Any
        //  294    298    301    305    Ljava/io/IOException;
        //  294    298    318    323    Any
        //  312    316    331    335    Ljava/io/IOException;
        //  312    316    318    323    Any
        //  316    318    318    323    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 180, Size: 180
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
    
    public final void a(final adia adia) {
        throw null;
    }
    
    public final xao b() {
        return this.b;
    }
    
    public final acyk c() {
        synchronized (this) {
            tbi.e();
            if (this.c == null) {
                this.c = this.f();
            }
            return this.c;
        }
    }
    
    public final void d() {
        synchronized (this) {
            tbi.e();
            this.c = null;
            this.g();
        }
    }
    
    public final void e(final acyk c) {
        synchronized (this) {
            tbi.e();
            this.h(this.c = c);
        }
    }
}
