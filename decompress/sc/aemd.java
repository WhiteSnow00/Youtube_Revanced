// 
// Decompiled by Procyon v0.6.0
// 

public final class aemd implements Runnable
{
    Runnable a;
    final Object b;
    private final int c;
    
    public aemd(final aeme b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public aemd(final afwd b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public aemd(final dwp b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        aemd.c:I
        //     4: istore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: iconst_0       
        //     8: istore_3       
        //     9: iload_1        
        //    10: ifeq            684
        //    13: iload_1        
        //    14: iconst_1       
        //    15: if_icmpeq       360
        //    18: iconst_0       
        //    19: istore_1       
        //    20: iload_1        
        //    21: istore_2       
        //    22: aload_0        
        //    23: getfield        aemd.b:Ljava/lang/Object;
        //    26: checkcast       Lafwd;
        //    29: getfield        afwd.b:Ljava/util/Deque;
        //    32: astore          7
        //    34: iload_1        
        //    35: istore_2       
        //    36: aload           7
        //    38: monitorenter   
        //    39: iload_3        
        //    40: ifne            106
        //    43: aload_0        
        //    44: getfield        aemd.b:Ljava/lang/Object;
        //    47: astore          8
        //    49: aload           8
        //    51: checkcast       Lafwd;
        //    54: getfield        afwd.d:I
        //    57: iconst_4       
        //    58: if_icmpne       75
        //    61: aload           7
        //    63: monitorexit    
        //    64: iload_1        
        //    65: ifeq            161
        //    68: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    71: invokevirtual   java/lang/Thread.interrupt:()V
        //    74: return         
        //    75: aload           8
        //    77: checkcast       Lafwd;
        //    80: getfield        afwd.c:J
        //    83: lstore          4
        //    85: aload           8
        //    87: checkcast       Lafwd;
        //    90: lload           4
        //    92: lconst_1       
        //    93: ladd           
        //    94: putfield        afwd.c:J
        //    97: aload           8
        //    99: checkcast       Lafwd;
        //   102: iconst_4       
        //   103: putfield        afwd.d:I
        //   106: aload_0        
        //   107: getfield        aemd.b:Ljava/lang/Object;
        //   110: checkcast       Lafwd;
        //   113: getfield        afwd.b:Ljava/util/Deque;
        //   116: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   121: checkcast       Ljava/lang/Runnable;
        //   124: astore          8
        //   126: aload_0        
        //   127: aload           8
        //   129: putfield        aemd.a:Ljava/lang/Runnable;
        //   132: aload           8
        //   134: ifnonnull       162
        //   137: aload_0        
        //   138: getfield        aemd.b:Ljava/lang/Object;
        //   141: checkcast       Lafwd;
        //   144: iconst_1       
        //   145: putfield        afwd.d:I
        //   148: aload           7
        //   150: monitorexit    
        //   151: iload_1        
        //   152: ifeq            161
        //   155: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   158: invokevirtual   java/lang/Thread.interrupt:()V
        //   161: return         
        //   162: aload           7
        //   164: monitorexit    
        //   165: iload_1        
        //   166: istore_2       
        //   167: invokestatic    java/lang/Thread.interrupted:()Z
        //   170: istore          6
        //   172: iload_1        
        //   173: iload           6
        //   175: ior            
        //   176: istore_1       
        //   177: aload_0        
        //   178: getfield        aemd.a:Ljava/lang/Runnable;
        //   181: invokeinterface java/lang/Runnable.run:()V
        //   186: iload_1        
        //   187: istore_2       
        //   188: aload_0        
        //   189: aconst_null    
        //   190: putfield        aemd.a:Ljava/lang/Runnable;
        //   193: iconst_1       
        //   194: istore_3       
        //   195: goto            20
        //   198: astore          7
        //   200: goto            305
        //   203: astore          7
        //   205: goto            283
        //   208: astore          11
        //   210: getstatic       afwd.a:Ljava/util/logging/Logger;
        //   213: astore          9
        //   215: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   218: astore          10
        //   220: aload_0        
        //   221: getfield        aemd.a:Ljava/lang/Runnable;
        //   224: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   227: astore          7
        //   229: new             Ljava/lang/StringBuilder;
        //   232: astore          8
        //   234: aload           8
        //   236: invokespecial   java/lang/StringBuilder.<init>:()V
        //   239: aload           8
        //   241: ldc             "Exception while executing runnable "
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: pop            
        //   247: aload           8
        //   249: aload           7
        //   251: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   254: pop            
        //   255: aload           9
        //   257: aload           10
        //   259: ldc             "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
        //   261: ldc             "workOnQueue"
        //   263: aload           8
        //   265: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   268: aload           11
        //   270: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   273: iload_1        
        //   274: istore_2       
        //   275: aload_0        
        //   276: aconst_null    
        //   277: putfield        aemd.a:Ljava/lang/Runnable;
        //   280: goto            193
        //   283: iload_1        
        //   284: istore_2       
        //   285: aload_0        
        //   286: aconst_null    
        //   287: putfield        aemd.a:Ljava/lang/Runnable;
        //   290: iload_1        
        //   291: istore_2       
        //   292: aload           7
        //   294: athrow         
        //   295: astore          8
        //   297: aload           7
        //   299: monitorexit    
        //   300: iload_1        
        //   301: istore_2       
        //   302: aload           8
        //   304: athrow         
        //   305: iload_2        
        //   306: ifeq            315
        //   309: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   312: invokevirtual   java/lang/Thread.interrupt:()V
        //   315: aload           7
        //   317: athrow         
        //   318: astore          8
        //   320: aload_0        
        //   321: getfield        aemd.b:Ljava/lang/Object;
        //   324: checkcast       Lafwd;
        //   327: getfield        afwd.b:Ljava/util/Deque;
        //   330: astore          7
        //   332: aload           7
        //   334: monitorenter   
        //   335: aload_0        
        //   336: getfield        aemd.b:Ljava/lang/Object;
        //   339: checkcast       Lafwd;
        //   342: iconst_1       
        //   343: putfield        afwd.d:I
        //   346: aload           7
        //   348: monitorexit    
        //   349: aload           8
        //   351: athrow         
        //   352: astore          8
        //   354: aload           7
        //   356: monitorexit    
        //   357: aload           8
        //   359: athrow         
        //   360: iconst_0       
        //   361: istore_1       
        //   362: iload_1        
        //   363: istore_3       
        //   364: aload_0        
        //   365: getfield        aemd.b:Ljava/lang/Object;
        //   368: checkcast       Ldwp;
        //   371: getfield        dwp.a:Ljava/util/Deque;
        //   374: astore          7
        //   376: iload_1        
        //   377: istore_3       
        //   378: aload           7
        //   380: monitorenter   
        //   381: iload_2        
        //   382: ifne            448
        //   385: aload_0        
        //   386: getfield        aemd.b:Ljava/lang/Object;
        //   389: astore          8
        //   391: aload           8
        //   393: checkcast       Ldwp;
        //   396: getfield        dwp.c:I
        //   399: iconst_4       
        //   400: if_icmpne       417
        //   403: aload           7
        //   405: monitorexit    
        //   406: iload_1        
        //   407: ifeq            503
        //   410: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   413: invokevirtual   java/lang/Thread.interrupt:()V
        //   416: return         
        //   417: aload           8
        //   419: checkcast       Ldwp;
        //   422: getfield        dwp.b:J
        //   425: lstore          4
        //   427: aload           8
        //   429: checkcast       Ldwp;
        //   432: lload           4
        //   434: lconst_1       
        //   435: ladd           
        //   436: putfield        dwp.b:J
        //   439: aload           8
        //   441: checkcast       Ldwp;
        //   444: iconst_4       
        //   445: putfield        dwp.c:I
        //   448: aload_0        
        //   449: getfield        aemd.b:Ljava/lang/Object;
        //   452: checkcast       Ldwp;
        //   455: getfield        dwp.a:Ljava/util/Deque;
        //   458: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   463: checkcast       Ljava/lang/Runnable;
        //   466: astore          8
        //   468: aload_0        
        //   469: aload           8
        //   471: putfield        aemd.a:Ljava/lang/Runnable;
        //   474: aload           8
        //   476: ifnonnull       504
        //   479: aload_0        
        //   480: getfield        aemd.b:Ljava/lang/Object;
        //   483: checkcast       Ldwp;
        //   486: iconst_1       
        //   487: putfield        dwp.c:I
        //   490: aload           7
        //   492: monitorexit    
        //   493: iload_1        
        //   494: ifeq            503
        //   497: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   500: invokevirtual   java/lang/Thread.interrupt:()V
        //   503: return         
        //   504: aload           7
        //   506: monitorexit    
        //   507: iload_1        
        //   508: istore_3       
        //   509: invokestatic    java/lang/Thread.interrupted:()Z
        //   512: istore          6
        //   514: iload_1        
        //   515: iload           6
        //   517: ior            
        //   518: istore_1       
        //   519: aload_0        
        //   520: getfield        aemd.a:Ljava/lang/Runnable;
        //   523: invokeinterface java/lang/Runnable.run:()V
        //   528: iload_1        
        //   529: istore_3       
        //   530: aload_0        
        //   531: aconst_null    
        //   532: putfield        aemd.a:Ljava/lang/Runnable;
        //   535: iconst_1       
        //   536: istore_2       
        //   537: goto            362
        //   540: astore          7
        //   542: goto            629
        //   545: astore          7
        //   547: goto            607
        //   550: astore          9
        //   552: new             Ljava/lang/RuntimeException;
        //   555: astore          7
        //   557: aload_0        
        //   558: getfield        aemd.a:Ljava/lang/Runnable;
        //   561: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   564: astore          10
        //   566: new             Ljava/lang/StringBuilder;
        //   569: astore          8
        //   571: aload           8
        //   573: invokespecial   java/lang/StringBuilder.<init>:()V
        //   576: aload           8
        //   578: ldc             "Exception while executing runnable "
        //   580: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   583: pop            
        //   584: aload           8
        //   586: aload           10
        //   588: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   591: pop            
        //   592: aload           7
        //   594: aload           8
        //   596: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   599: aload           9
        //   601: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   604: aload           7
        //   606: athrow         
        //   607: iload_1        
        //   608: istore_3       
        //   609: aload_0        
        //   610: aconst_null    
        //   611: putfield        aemd.a:Ljava/lang/Runnable;
        //   614: iload_1        
        //   615: istore_3       
        //   616: aload           7
        //   618: athrow         
        //   619: astore          8
        //   621: aload           7
        //   623: monitorexit    
        //   624: iload_1        
        //   625: istore_3       
        //   626: aload           8
        //   628: athrow         
        //   629: iload_3        
        //   630: ifeq            639
        //   633: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   636: invokevirtual   java/lang/Thread.interrupt:()V
        //   639: aload           7
        //   641: athrow         
        //   642: astore          8
        //   644: aload_0        
        //   645: getfield        aemd.b:Ljava/lang/Object;
        //   648: checkcast       Ldwp;
        //   651: getfield        dwp.a:Ljava/util/Deque;
        //   654: astore          7
        //   656: aload           7
        //   658: monitorenter   
        //   659: aload_0        
        //   660: getfield        aemd.b:Ljava/lang/Object;
        //   663: checkcast       Ldwp;
        //   666: iconst_1       
        //   667: putfield        dwp.c:I
        //   670: aload           7
        //   672: monitorexit    
        //   673: aload           8
        //   675: athrow         
        //   676: astore          8
        //   678: aload           7
        //   680: monitorexit    
        //   681: aload           8
        //   683: athrow         
        //   684: invokestatic    qdt.h:()V
        //   687: iconst_0       
        //   688: istore_3       
        //   689: iconst_0       
        //   690: istore_1       
        //   691: iload_1        
        //   692: istore_2       
        //   693: aload_0        
        //   694: getfield        aemd.b:Ljava/lang/Object;
        //   697: checkcast       Laeme;
        //   700: getfield        aeme.a:Ljava/util/Deque;
        //   703: astore          7
        //   705: iload_1        
        //   706: istore_2       
        //   707: aload           7
        //   709: monitorenter   
        //   710: iload_3        
        //   711: ifne            753
        //   714: aload_0        
        //   715: getfield        aemd.b:Ljava/lang/Object;
        //   718: checkcast       Laeme;
        //   721: getfield        aeme.c:I
        //   724: iconst_2       
        //   725: if_icmpne       734
        //   728: iconst_1       
        //   729: istore          6
        //   731: goto            737
        //   734: iconst_0       
        //   735: istore          6
        //   737: iload           6
        //   739: invokestatic    adkp.Q:(Z)V
        //   742: aload_0        
        //   743: getfield        aemd.b:Ljava/lang/Object;
        //   746: checkcast       Laeme;
        //   749: iconst_3       
        //   750: putfield        aeme.c:I
        //   753: aload_0        
        //   754: getfield        aemd.b:Ljava/lang/Object;
        //   757: checkcast       Laeme;
        //   760: getfield        aeme.a:Ljava/util/Deque;
        //   763: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   768: checkcast       Ljava/lang/Runnable;
        //   771: astore          8
        //   773: aload_0        
        //   774: aload           8
        //   776: putfield        aemd.a:Ljava/lang/Runnable;
        //   779: aload           8
        //   781: ifnonnull       809
        //   784: aload_0        
        //   785: getfield        aemd.b:Ljava/lang/Object;
        //   788: checkcast       Laeme;
        //   791: iconst_1       
        //   792: putfield        aeme.c:I
        //   795: aload           7
        //   797: monitorexit    
        //   798: iload_1        
        //   799: ifeq            808
        //   802: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   805: invokevirtual   java/lang/Thread.interrupt:()V
        //   808: return         
        //   809: aload           7
        //   811: monitorexit    
        //   812: iload_1        
        //   813: istore_2       
        //   814: invokestatic    java/lang/Thread.interrupted:()Z
        //   817: istore          6
        //   819: iload_1        
        //   820: iload           6
        //   822: ior            
        //   823: istore_1       
        //   824: aload_0        
        //   825: getfield        aemd.a:Ljava/lang/Runnable;
        //   828: invokeinterface java/lang/Runnable.run:()V
        //   833: iload_1        
        //   834: istore_2       
        //   835: aload_0        
        //   836: aconst_null    
        //   837: putfield        aemd.a:Ljava/lang/Runnable;
        //   840: iconst_1       
        //   841: istore_3       
        //   842: goto            691
        //   845: astore          7
        //   847: goto            874
        //   850: astore          7
        //   852: iload_1        
        //   853: istore_2       
        //   854: aload_0        
        //   855: aconst_null    
        //   856: putfield        aemd.a:Ljava/lang/Runnable;
        //   859: iload_1        
        //   860: istore_2       
        //   861: aload           7
        //   863: athrow         
        //   864: astore          8
        //   866: aload           7
        //   868: monitorexit    
        //   869: iload_1        
        //   870: istore_2       
        //   871: aload           8
        //   873: athrow         
        //   874: iload_2        
        //   875: ifeq            884
        //   878: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   881: invokevirtual   java/lang/Thread.interrupt:()V
        //   884: aload           7
        //   886: athrow         
        //   887: astore          8
        //   889: aload_0        
        //   890: getfield        aemd.b:Ljava/lang/Object;
        //   893: checkcast       Laeme;
        //   896: getfield        aeme.a:Ljava/util/Deque;
        //   899: astore          7
        //   901: aload           7
        //   903: monitorenter   
        //   904: aload_0        
        //   905: getfield        aemd.b:Ljava/lang/Object;
        //   908: checkcast       Laeme;
        //   911: iconst_1       
        //   912: putfield        aeme.c:I
        //   915: aload           7
        //   917: monitorexit    
        //   918: aload           8
        //   920: athrow         
        //   921: astore          8
        //   923: aload           7
        //   925: monitorexit    
        //   926: goto            932
        //   929: aload           8
        //   931: athrow         
        //   932: goto            929
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  22     34     198    318    Any
        //  36     39     198    318    Any
        //  43     64     295    305    Any
        //  68     74     318    360    Ljava/lang/Error;
        //  75     106    295    305    Any
        //  106    132    295    305    Any
        //  137    151    295    305    Any
        //  155    161    318    360    Ljava/lang/Error;
        //  162    165    295    305    Any
        //  167    172    198    318    Any
        //  177    186    208    283    Ljava/lang/RuntimeException;
        //  177    186    203    295    Any
        //  188    193    198    318    Any
        //  210    273    203    295    Any
        //  275    280    198    318    Any
        //  285    290    198    318    Any
        //  292    295    198    318    Any
        //  297    300    295    305    Any
        //  302    305    198    318    Any
        //  309    315    318    360    Ljava/lang/Error;
        //  315    318    318    360    Ljava/lang/Error;
        //  335    349    352    360    Any
        //  354    357    352    360    Any
        //  364    376    540    642    Any
        //  378    381    540    642    Any
        //  385    406    619    629    Any
        //  410    416    642    684    Ljava/lang/Error;
        //  417    448    619    629    Any
        //  448    474    619    629    Any
        //  479    493    619    629    Any
        //  497    503    642    684    Ljava/lang/Error;
        //  504    507    619    629    Any
        //  509    514    540    642    Any
        //  519    528    550    607    Ljava/lang/RuntimeException;
        //  519    528    545    619    Any
        //  530    535    540    642    Any
        //  552    607    545    619    Any
        //  609    614    540    642    Any
        //  616    619    540    642    Any
        //  621    624    619    629    Any
        //  626    629    540    642    Any
        //  633    639    642    684    Ljava/lang/Error;
        //  639    642    642    684    Ljava/lang/Error;
        //  659    673    676    684    Any
        //  678    681    676    684    Any
        //  684    687    887    935    Any
        //  693    705    845    887    Any
        //  707    710    845    887    Any
        //  714    728    864    874    Any
        //  737    753    864    874    Any
        //  753    779    864    874    Any
        //  784    798    864    874    Any
        //  802    808    887    935    Any
        //  809    812    864    874    Any
        //  814    819    845    887    Any
        //  824    833    850    864    Any
        //  835    840    845    887    Any
        //  854    859    845    887    Any
        //  861    864    845    887    Any
        //  866    869    864    874    Any
        //  871    874    845    887    Any
        //  878    884    887    935    Any
        //  884    887    887    935    Any
        //  904    918    921    935    Any
        //  923    926    921    935    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 477, Size: 477
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
    
    @Override
    public final String toString() {
        final int c = this.c;
        String s = "null";
        if (c == 0) {
            final Runnable a = this.a;
            String s2;
            if (a != null) {
                final String string = a.toString();
                final StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                sb.append(string);
                sb.append("}");
                s2 = sb.toString();
            }
            else {
                final int c2 = ((aeme)this.b).c;
                if (c2 != 1) {
                    if (c2 != 2) {
                        if (c2 == 3) {
                            s = "RUNNING";
                        }
                    }
                    else {
                        s = "QUEUED";
                    }
                }
                else {
                    s = "IDLE";
                }
                final StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                sb2.append(s);
                sb2.append("}");
                s2 = sb2.toString();
            }
            return s2;
        }
        if (c != 1) {
            final Runnable a2 = this.a;
            String s3;
            if (a2 != null) {
                final String string2 = a2.toString();
                final StringBuilder sb3 = new StringBuilder("SequentialExecutorWorker{running=");
                sb3.append(string2);
                sb3.append("}");
                s3 = sb3.toString();
            }
            else {
                final int d = ((afwd)this.b).d;
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d == 4) {
                                s = "RUNNING";
                            }
                        }
                        else {
                            s = "QUEUED";
                        }
                    }
                    else {
                        s = "QUEUING";
                    }
                }
                else {
                    s = "IDLE";
                }
                final StringBuilder sb4 = new StringBuilder("SequentialExecutorWorker{state=");
                sb4.append(s);
                sb4.append("}");
                s3 = sb4.toString();
            }
            return s3;
        }
        final Runnable a3 = this.a;
        String s4;
        if (a3 != null) {
            final String string3 = a3.toString();
            final StringBuilder sb5 = new StringBuilder("SequentialLithoHandler{running=");
            sb5.append(string3);
            sb5.append("}");
            s4 = sb5.toString();
        }
        else {
            final int c3 = ((dwp)this.b).c;
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 == 4) {
                            s = "RUNNING";
                        }
                    }
                    else {
                        s = "QUEUED";
                    }
                }
                else {
                    s = "QUEUING";
                }
            }
            else {
                s = "IDLE";
            }
            final StringBuilder sb6 = new StringBuilder("SequentialLithoHandler{state=");
            sb6.append(s);
            sb6.append("}");
            s4 = sb6.toString();
        }
        return s4;
    }
}
