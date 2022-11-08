import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwz implements acvs, acvx
{
    public adfy a;
    public wyo b;
    private acwi c;
    private final String d;
    private final String e;
    
    public acwz(final File file, final String e) {
        final String absolutePath = file.getAbsolutePath();
        tsx.n(absolutePath);
        this.d = absolutePath;
        this.e = e;
    }
    
    private final acwi f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: new             Ljava/io/File;
        //     5: astore_1       
        //     6: aload_1        
        //     7: aload_0        
        //     8: getfield        acwz.d:Ljava/lang/String;
        //    11: aload_0        
        //    12: getfield        acwz.e:Ljava/lang/String;
        //    15: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    18: aload_1        
        //    19: invokevirtual   java/io/File.exists:()Z
        //    22: istore_2       
        //    23: aconst_null    
        //    24: astore_3       
        //    25: iload_2        
        //    26: ifeq            806
        //    29: iconst_1       
        //    30: istore          4
        //    32: iconst_0       
        //    33: istore          5
        //    35: aload_1        
        //    36: invokevirtual   java/io/File.length:()J
        //    39: lstore          6
        //    41: lload           6
        //    43: lconst_0       
        //    44: lcmp           
        //    45: ifne            52
        //    48: aload_0        
        //    49: monitorexit    
        //    50: aconst_null    
        //    51: areturn        
        //    52: new             Ljava/io/BufferedInputStream;
        //    55: astore          8
        //    57: new             Ljava/io/FileInputStream;
        //    60: astore          9
        //    62: aload           9
        //    64: aload_1        
        //    65: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    68: aload           8
        //    70: aload           9
        //    72: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    75: new             Ljava/io/ObjectInputStream;
        //    78: astore_3       
        //    79: aload_3        
        //    80: aload           8
        //    82: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    85: aload_3        
        //    86: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    89: istore          5
        //    91: aload_3        
        //    92: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    95: istore          10
        //    97: lload           6
        //    99: ldc2_w          8
        //   102: lsub           
        //   103: lstore          6
        //   105: iload           10
        //   107: i2l            
        //   108: lstore          11
        //   110: lload           11
        //   112: lload           6
        //   114: lcmp           
        //   115: ifle            156
        //   118: aload_3        
        //   119: invokevirtual   java/io/ObjectInputStream.close:()V
        //   122: goto            142
        //   125: astore          9
        //   127: goto            310
        //   130: astore_3       
        //   131: aconst_null    
        //   132: astore          9
        //   134: aconst_null    
        //   135: astore_3       
        //   136: iconst_1       
        //   137: istore          13
        //   139: goto            694
        //   142: aload           8
        //   144: invokevirtual   java/io/BufferedInputStream.close:()V
        //   147: aload_1        
        //   148: invokevirtual   java/io/File.delete:()Z
        //   151: pop            
        //   152: aload_0        
        //   153: monitorexit    
        //   154: aconst_null    
        //   155: areturn        
        //   156: iload           10
        //   158: newarray        B
        //   160: astore          9
        //   162: aload_3        
        //   163: astore          14
        //   165: iload           5
        //   167: istore          13
        //   169: aload           9
        //   171: astore          15
        //   173: aload_3        
        //   174: aload           9
        //   176: iconst_0       
        //   177: iload           10
        //   179: invokevirtual   java/io/ObjectInputStream.readFully:([BII)V
        //   182: aload_3        
        //   183: astore          14
        //   185: iload           5
        //   187: istore          13
        //   189: aload           9
        //   191: astore          15
        //   193: aload_3        
        //   194: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   197: istore          10
        //   199: iload           10
        //   201: i2l            
        //   202: lload           6
        //   204: lload           11
        //   206: lsub           
        //   207: ldc2_w          4
        //   210: lsub           
        //   211: lcmp           
        //   212: ifgt            303
        //   215: aload_3        
        //   216: astore          14
        //   218: iload           5
        //   220: istore          13
        //   222: aload           9
        //   224: astore          15
        //   226: iload           10
        //   228: newarray        B
        //   230: astore          16
        //   232: aload_3        
        //   233: astore          14
        //   235: iload           5
        //   237: istore          13
        //   239: aload           9
        //   241: astore          15
        //   243: aload_3        
        //   244: aload           16
        //   246: iconst_0       
        //   247: iload           10
        //   249: invokevirtual   java/io/ObjectInputStream.readFully:([BII)V
        //   252: aload_3        
        //   253: astore          14
        //   255: iload           5
        //   257: istore          13
        //   259: aload           9
        //   261: astore          15
        //   263: new             Ljava/lang/String;
        //   266: astore          17
        //   268: aload_3        
        //   269: astore          14
        //   271: iload           5
        //   273: istore          13
        //   275: aload           9
        //   277: astore          15
        //   279: aload           17
        //   281: aload           16
        //   283: invokespecial   java/lang/String.<init>:([B)V
        //   286: aload_3        
        //   287: invokevirtual   java/io/ObjectInputStream.close:()V
        //   290: aload           17
        //   292: astore_3       
        //   293: goto            614
        //   296: astore_3       
        //   297: aload           17
        //   299: astore_3       
        //   300: goto            507
        //   303: aload_3        
        //   304: invokevirtual   java/io/ObjectInputStream.close:()V
        //   307: goto            324
        //   310: aload           8
        //   312: astore_3       
        //   313: iload           4
        //   315: istore          5
        //   317: goto            660
        //   320: astore_3       
        //   321: goto            134
        //   324: aload           8
        //   326: invokevirtual   java/io/BufferedInputStream.close:()V
        //   329: aload_1        
        //   330: invokevirtual   java/io/File.delete:()Z
        //   333: pop            
        //   334: aload_0        
        //   335: monitorexit    
        //   336: aconst_null    
        //   337: areturn        
        //   338: astore          9
        //   340: iload           13
        //   342: istore          5
        //   344: aload           15
        //   346: astore_3       
        //   347: goto            622
        //   350: astore          15
        //   352: goto            448
        //   355: astore          16
        //   357: aload_3        
        //   358: astore          17
        //   360: aload           9
        //   362: astore_3       
        //   363: goto            533
        //   366: astore          9
        //   368: aconst_null    
        //   369: astore          15
        //   371: aload_3        
        //   372: astore          14
        //   374: aload           15
        //   376: astore_3       
        //   377: goto            622
        //   380: astore          9
        //   382: aconst_null    
        //   383: astore          9
        //   385: goto            448
        //   388: astore          16
        //   390: aconst_null    
        //   391: astore          9
        //   393: aload_3        
        //   394: astore          17
        //   396: aload           9
        //   398: astore_3       
        //   399: goto            533
        //   402: astore          9
        //   404: goto            424
        //   407: astore          9
        //   409: goto            442
        //   412: astore          16
        //   414: aload_3        
        //   415: astore          17
        //   417: goto            528
        //   420: astore          9
        //   422: aconst_null    
        //   423: astore_3       
        //   424: aconst_null    
        //   425: astore          15
        //   427: iconst_0       
        //   428: istore          5
        //   430: aload_3        
        //   431: astore          14
        //   433: aload           15
        //   435: astore_3       
        //   436: goto            622
        //   439: astore_3       
        //   440: aconst_null    
        //   441: astore_3       
        //   442: aconst_null    
        //   443: astore          9
        //   445: iconst_0       
        //   446: istore          5
        //   448: iload           5
        //   450: istore          13
        //   452: aload           9
        //   454: astore          15
        //   456: aload_3        
        //   457: ifnull          510
        //   460: iload           5
        //   462: istore          13
        //   464: aload           9
        //   466: astore          15
        //   468: iload           5
        //   470: istore          4
        //   472: aload           9
        //   474: astore          14
        //   476: aload_3        
        //   477: invokevirtual   java/io/ObjectInputStream.close:()V
        //   480: iload           5
        //   482: istore          13
        //   484: aload           9
        //   486: astore          15
        //   488: goto            510
        //   491: astore          9
        //   493: goto            649
        //   496: astore_3       
        //   497: aconst_null    
        //   498: astore_3       
        //   499: aload           15
        //   501: astore          9
        //   503: iload           13
        //   505: istore          5
        //   507: goto            691
        //   510: aconst_null    
        //   511: astore_3       
        //   512: iload           13
        //   514: istore          5
        //   516: aload           15
        //   518: astore          9
        //   520: goto            614
        //   523: astore          16
        //   525: aconst_null    
        //   526: astore          17
        //   528: aconst_null    
        //   529: astore_3       
        //   530: iconst_0       
        //   531: istore          5
        //   533: aload           17
        //   535: astore          14
        //   537: iload           5
        //   539: istore          13
        //   541: aload_3        
        //   542: astore          15
        //   544: aload_0        
        //   545: getfield        acwz.a:Ladfy;
        //   548: ldc             "StreamCorruptedException"
        //   550: ldc             "ZeroPrefixCache"
        //   552: invokestatic    adbp.l:(Ladfy;Ljava/lang/String;Ljava/lang/String;)V
        //   555: aload           17
        //   557: astore          14
        //   559: iload           5
        //   561: istore          13
        //   563: aload_3        
        //   564: astore          15
        //   566: ldc             "Stream corruption error in opening zero-prefix cache file."
        //   568: aload           16
        //   570: invokestatic    trn.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   573: iload           5
        //   575: istore          13
        //   577: aload_3        
        //   578: astore          15
        //   580: aload           17
        //   582: ifnull          510
        //   585: iload           5
        //   587: istore          13
        //   589: aload_3        
        //   590: astore          15
        //   592: iload           5
        //   594: istore          4
        //   596: aload_3        
        //   597: astore          14
        //   599: aload           17
        //   601: invokevirtual   java/io/ObjectInputStream.close:()V
        //   604: iload           5
        //   606: istore          13
        //   608: aload_3        
        //   609: astore          15
        //   611: goto            510
        //   614: aload           8
        //   616: invokevirtual   java/io/BufferedInputStream.close:()V
        //   619: goto            714
        //   622: aload           14
        //   624: ifnull          639
        //   627: iload           5
        //   629: istore          13
        //   631: aload_3        
        //   632: astore          15
        //   634: aload           14
        //   636: invokevirtual   java/io/ObjectInputStream.close:()V
        //   639: iload           5
        //   641: istore          13
        //   643: aload_3        
        //   644: astore          15
        //   646: aload           9
        //   648: athrow         
        //   649: aload           8
        //   651: astore_3       
        //   652: goto            657
        //   655: astore          9
        //   657: iconst_0       
        //   658: istore          5
        //   660: aload_3        
        //   661: ifnull          668
        //   664: aload_3        
        //   665: invokevirtual   java/io/BufferedInputStream.close:()V
        //   668: iload           5
        //   670: ifeq            678
        //   673: aload_1        
        //   674: invokevirtual   java/io/File.delete:()Z
        //   677: pop            
        //   678: aload           9
        //   680: athrow         
        //   681: astore_3       
        //   682: aconst_null    
        //   683: astore_3       
        //   684: aload_3        
        //   685: astore          8
        //   687: aload           8
        //   689: astore          9
        //   691: iconst_0       
        //   692: istore          13
        //   694: aload           8
        //   696: ifnull          704
        //   699: aload           8
        //   701: invokevirtual   java/io/BufferedInputStream.close:()V
        //   704: iload           13
        //   706: ifeq            714
        //   709: aload_1        
        //   710: invokevirtual   java/io/File.delete:()Z
        //   713: pop            
        //   714: aload_0        
        //   715: invokestatic    adbp.i:(Lacvx;)Lwyn;
        //   718: astore          8
        //   720: iload           5
        //   722: iconst_1       
        //   723: if_icmpeq       776
        //   726: iload           5
        //   728: iconst_2       
        //   729: if_icmpeq       746
        //   732: ldc             "0-prefix cache: Invalid content type"
        //   734: invokestatic    adbp.j:(Ljava/lang/String;)V
        //   737: ldc             "0-prefix cache: Invalid content type"
        //   739: invokestatic    trn.b:(Ljava/lang/String;)V
        //   742: aload_0        
        //   743: monitorexit    
        //   744: aconst_null    
        //   745: areturn        
        //   746: new             Lacwh;
        //   749: astore          15
        //   751: aload           15
        //   753: aload           9
        //   755: aload_3        
        //   756: invokespecial   acwh.<init>:([BLjava/lang/String;)V
        //   759: aload           15
        //   761: aload           8
        //   763: putfield        acwh.a:Lwyn;
        //   766: aload           15
        //   768: invokestatic    adbp.m:(Lacvw;)V
        //   771: aload_0        
        //   772: monitorexit    
        //   773: aload           15
        //   775: areturn        
        //   776: new             Lacvv;
        //   779: astore          15
        //   781: aload           15
        //   783: aload           9
        //   785: aload_3        
        //   786: invokespecial   acvv.<init>:([BLjava/lang/String;)V
        //   789: aload           15
        //   791: aload           8
        //   793: putfield        acvv.a:Lwyn;
        //   796: aload           15
        //   798: invokestatic    adbp.m:(Lacvw;)V
        //   801: aload_0        
        //   802: monitorexit    
        //   803: aload           15
        //   805: areturn        
        //   806: aload_0        
        //   807: monitorexit    
        //   808: aconst_null    
        //   809: areturn        
        //   810: astore_3       
        //   811: aload_0        
        //   812: monitorexit    
        //   813: goto            818
        //   816: aload_3        
        //   817: athrow         
        //   818: goto            816
        //   821: astore_3       
        //   822: goto            142
        //   825: astore_3       
        //   826: goto            152
        //   829: astore_3       
        //   830: aload           17
        //   832: astore_3       
        //   833: goto            614
        //   836: astore_3       
        //   837: goto            324
        //   840: astore_3       
        //   841: goto            334
        //   844: astore_3       
        //   845: iload           4
        //   847: istore          13
        //   849: aload           14
        //   851: astore          15
        //   853: goto            510
        //   856: astore          8
        //   858: goto            714
        //   861: astore          15
        //   863: goto            639
        //   866: astore_3       
        //   867: goto            678
        //   870: astore          8
        //   872: goto            714
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  2      23     810    821    Any
        //  35     41     681    691    Ljava/io/FileNotFoundException;
        //  35     41     655    657    Any
        //  52     75     681    691    Ljava/io/FileNotFoundException;
        //  52     75     655    657    Any
        //  75     85     523    528    Ljava/io/StreamCorruptedException;
        //  75     85     439    442    Ljava/io/IOException;
        //  75     85     420    424    Any
        //  85     91     412    420    Ljava/io/StreamCorruptedException;
        //  85     91     407    412    Ljava/io/IOException;
        //  85     91     402    407    Any
        //  91     97     388    402    Ljava/io/StreamCorruptedException;
        //  91     97     380    388    Ljava/io/IOException;
        //  91     97     366    380    Any
        //  118    122    821    825    Ljava/io/IOException;
        //  118    122    130    134    Ljava/io/FileNotFoundException;
        //  118    122    125    130    Any
        //  142    152    825    829    Ljava/io/IOException;
        //  142    152    810    821    Any
        //  156    162    388    402    Ljava/io/StreamCorruptedException;
        //  156    162    380    388    Ljava/io/IOException;
        //  156    162    366    380    Any
        //  173    182    355    366    Ljava/io/StreamCorruptedException;
        //  173    182    350    355    Ljava/io/IOException;
        //  173    182    338    350    Any
        //  193    199    355    366    Ljava/io/StreamCorruptedException;
        //  193    199    350    355    Ljava/io/IOException;
        //  193    199    338    350    Any
        //  226    232    355    366    Ljava/io/StreamCorruptedException;
        //  226    232    350    355    Ljava/io/IOException;
        //  226    232    338    350    Any
        //  243    252    355    366    Ljava/io/StreamCorruptedException;
        //  243    252    350    355    Ljava/io/IOException;
        //  243    252    338    350    Any
        //  263    268    355    366    Ljava/io/StreamCorruptedException;
        //  263    268    350    355    Ljava/io/IOException;
        //  263    268    338    350    Any
        //  279    286    355    366    Ljava/io/StreamCorruptedException;
        //  279    286    350    355    Ljava/io/IOException;
        //  279    286    338    350    Any
        //  286    290    829    836    Ljava/io/IOException;
        //  286    290    296    303    Ljava/io/FileNotFoundException;
        //  286    290    491    496    Any
        //  303    307    836    840    Ljava/io/IOException;
        //  303    307    320    324    Ljava/io/FileNotFoundException;
        //  303    307    125    130    Any
        //  324    334    840    844    Ljava/io/IOException;
        //  324    334    810    821    Any
        //  476    480    844    856    Ljava/io/IOException;
        //  476    480    496    507    Ljava/io/FileNotFoundException;
        //  476    480    491    496    Any
        //  544    555    338    350    Any
        //  566    573    338    350    Any
        //  599    604    844    856    Ljava/io/IOException;
        //  599    604    496    507    Ljava/io/FileNotFoundException;
        //  599    604    491    496    Any
        //  614    619    856    861    Ljava/io/IOException;
        //  614    619    810    821    Any
        //  634    639    861    866    Ljava/io/IOException;
        //  634    639    496    507    Ljava/io/FileNotFoundException;
        //  634    639    491    496    Any
        //  646    649    496    507    Ljava/io/FileNotFoundException;
        //  646    649    491    496    Any
        //  664    668    866    870    Ljava/io/IOException;
        //  664    668    810    821    Any
        //  673    678    866    870    Ljava/io/IOException;
        //  673    678    810    821    Any
        //  678    681    810    821    Any
        //  699    704    870    875    Ljava/io/IOException;
        //  699    704    810    821    Any
        //  709    714    870    875    Ljava/io/IOException;
        //  709    714    810    821    Any
        //  714    720    810    821    Any
        //  732    742    810    821    Any
        //  746    771    810    821    Any
        //  776    801    810    821    Any
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
    
    private final void h(final acwi p0) {
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
        //     8: getfield        acwz.d:Ljava/lang/String;
        //    11: ldc             "zeroprefix.cache"
        //    13: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    16: aload_2        
        //    17: invokevirtual   java/io/File.exists:()Z
        //    20: ifeq            28
        //    23: aload_2        
        //    24: invokevirtual   java/io/File.delete:()Z
        //    27: pop            
        //    28: new             Ljava/io/File;
        //    31: astore_3       
        //    32: aload_3        
        //    33: aload_0        
        //    34: getfield        acwz.d:Ljava/lang/String;
        //    37: aload_0        
        //    38: getfield        acwz.e:Ljava/lang/String;
        //    41: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    44: aconst_null    
        //    45: astore          4
        //    47: aconst_null    
        //    48: astore          5
        //    50: aconst_null    
        //    51: astore          6
        //    53: aconst_null    
        //    54: astore          7
        //    56: aload           5
        //    58: astore_2       
        //    59: new             Ljava/io/BufferedOutputStream;
        //    62: astore          8
        //    64: aload           5
        //    66: astore_2       
        //    67: new             Ljava/io/FileOutputStream;
        //    70: astore          9
        //    72: aload           5
        //    74: astore_2       
        //    75: aload           9
        //    77: aload_3        
        //    78: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    81: aload           5
        //    83: astore_2       
        //    84: aload           8
        //    86: aload           9
        //    88: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    91: aload           7
        //    93: astore_2       
        //    94: new             Ljava/io/ObjectOutputStream;
        //    97: astore          6
        //    99: aload           7
        //   101: astore_2       
        //   102: aload           6
        //   104: aload           8
        //   106: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   109: aload           6
        //   111: aload_1        
        //   112: invokeinterface acwi.d:()I
        //   117: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   120: aload           6
        //   122: aload_1        
        //   123: invokeinterface acwi.g:()[B
        //   128: arraylength    
        //   129: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   132: aload           6
        //   134: aload_1        
        //   135: invokeinterface acwi.g:()[B
        //   140: invokevirtual   java/io/ObjectOutputStream.write:([B)V
        //   143: aload_1        
        //   144: invokeinterface acwi.f:()Ljava/lang/String;
        //   149: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   152: ifne            183
        //   155: aload           6
        //   157: aload_1        
        //   158: invokeinterface acwi.f:()Ljava/lang/String;
        //   163: invokevirtual   java/lang/String.length:()I
        //   166: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   169: aload           6
        //   171: aload_1        
        //   172: invokeinterface acwi.f:()Ljava/lang/String;
        //   177: invokevirtual   java/lang/String.getBytes:()[B
        //   180: invokevirtual   java/io/ObjectOutputStream.write:([B)V
        //   183: aload           6
        //   185: invokevirtual   java/io/ObjectOutputStream.flush:()V
        //   188: aload           6
        //   190: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   193: goto            239
        //   196: astore_1       
        //   197: aload           6
        //   199: astore_2       
        //   200: goto            251
        //   203: astore_2       
        //   204: aload           6
        //   206: astore_1       
        //   207: aload_2        
        //   208: astore          6
        //   210: goto            222
        //   213: astore_1       
        //   214: goto            251
        //   217: astore          6
        //   219: aload           4
        //   221: astore_1       
        //   222: aload_1        
        //   223: astore_2       
        //   224: ldc             "Exception when writing to zeroprefixrawsuggestResponseCache"
        //   226: aload           6
        //   228: invokestatic    adbp.k:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   231: aload_1        
        //   232: ifnull          239
        //   235: aload_1        
        //   236: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   239: aload           8
        //   241: invokevirtual   java/io/BufferedOutputStream.close:()V
        //   244: aload_0        
        //   245: monitorexit    
        //   246: return         
        //   247: astore_1       
        //   248: aload_0        
        //   249: monitorexit    
        //   250: return         
        //   251: aload_2        
        //   252: ifnull          259
        //   255: aload_2        
        //   256: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   259: aload_1        
        //   260: athrow         
        //   261: astore_1       
        //   262: aload           8
        //   264: astore_2       
        //   265: goto            314
        //   268: astore_2       
        //   269: aload           8
        //   271: astore_1       
        //   272: aload_2        
        //   273: astore          8
        //   275: goto            287
        //   278: astore_1       
        //   279: goto            314
        //   282: astore          8
        //   284: aload           6
        //   286: astore_1       
        //   287: aload_1        
        //   288: astore_2       
        //   289: ldc             "Error creating zero-prefix cache file."
        //   291: aload           8
        //   293: invokestatic    trn.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   296: aload_1        
        //   297: ifnull          311
        //   300: aload_1        
        //   301: invokevirtual   java/io/BufferedOutputStream.close:()V
        //   304: aload_0        
        //   305: monitorexit    
        //   306: return         
        //   307: astore_1       
        //   308: aload_0        
        //   309: monitorexit    
        //   310: return         
        //   311: aload_0        
        //   312: monitorexit    
        //   313: return         
        //   314: aload_2        
        //   315: ifnull          322
        //   318: aload_2        
        //   319: invokevirtual   java/io/BufferedOutputStream.close:()V
        //   322: aload_1        
        //   323: athrow         
        //   324: astore_1       
        //   325: aload_0        
        //   326: monitorexit    
        //   327: aload_1        
        //   328: athrow         
        //   329: astore_1       
        //   330: goto            239
        //   333: astore_2       
        //   334: goto            259
        //   337: astore_2       
        //   338: goto            322
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  2      28     324    329    Any
        //  28     44     324    329    Any
        //  59     64     282    287    Ljava/io/FileNotFoundException;
        //  59     64     278    282    Any
        //  67     72     282    287    Ljava/io/FileNotFoundException;
        //  67     72     278    282    Any
        //  75     81     282    287    Ljava/io/FileNotFoundException;
        //  75     81     278    282    Any
        //  84     91     282    287    Ljava/io/FileNotFoundException;
        //  84     91     278    282    Any
        //  94     99     217    222    Ljava/io/IOException;
        //  94     99     213    217    Any
        //  102    109    217    222    Ljava/io/IOException;
        //  102    109    213    217    Any
        //  109    183    203    213    Ljava/io/IOException;
        //  109    183    196    203    Any
        //  183    188    203    213    Ljava/io/IOException;
        //  183    188    196    203    Any
        //  188    193    329    333    Ljava/io/IOException;
        //  188    193    268    278    Ljava/io/FileNotFoundException;
        //  188    193    261    268    Any
        //  224    231    213    217    Any
        //  235    239    329    333    Ljava/io/IOException;
        //  235    239    268    278    Ljava/io/FileNotFoundException;
        //  235    239    261    268    Any
        //  239    244    247    251    Ljava/io/IOException;
        //  239    244    324    329    Any
        //  255    259    333    337    Ljava/io/IOException;
        //  255    259    268    278    Ljava/io/FileNotFoundException;
        //  255    259    261    268    Any
        //  259    261    268    278    Ljava/io/FileNotFoundException;
        //  259    261    261    268    Any
        //  289    296    278    282    Any
        //  300    304    307    311    Ljava/io/IOException;
        //  300    304    324    329    Any
        //  318    322    337    341    Ljava/io/IOException;
        //  318    322    324    329    Any
        //  322    324    324    329    Any
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
    
    public final void a(final adfy adfy) {
        throw null;
    }
    
    public final wyo b() {
        return this.b;
    }
    
    public final acwi c() {
        synchronized (this) {
            szc.e();
            if (this.c == null) {
                this.c = this.f();
            }
            return this.c;
        }
    }
    
    public final void d() {
        synchronized (this) {
            szc.e();
            this.c = null;
            this.g();
        }
    }
    
    public final void e(final acwi c) {
        synchronized (this) {
            szc.e();
            this.h(this.c = c);
        }
    }
}
