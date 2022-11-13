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
        //     4: istore_3       
        //     5: iconst_0       
        //     6: istore_1       
        //     7: iconst_0       
        //     8: istore_2       
        //     9: iload_3        
        //    10: ifeq            688
        //    13: iload_3        
        //    14: iconst_1       
        //    15: if_icmpeq       360
        //    18: iconst_0       
        //    19: istore_1       
        //    20: iload_1        
        //    21: istore_3       
        //    22: aload_0        
        //    23: getfield        aemd.b:Ljava/lang/Object;
        //    26: checkcast       Lafwd;
        //    29: getfield        afwd.b:Ljava/util/Deque;
        //    32: astore          7
        //    34: iload_1        
        //    35: istore_3       
        //    36: aload           7
        //    38: monitorenter   
        //    39: iload_2        
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
        //   166: istore_3       
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
        //   187: istore_3       
        //   188: aload_0        
        //   189: aconst_null    
        //   190: putfield        aemd.a:Ljava/lang/Runnable;
        //   193: iconst_1       
        //   194: istore_2       
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
        //   274: istore_3       
        //   275: aload_0        
        //   276: aconst_null    
        //   277: putfield        aemd.a:Ljava/lang/Runnable;
        //   280: goto            193
        //   283: iload_1        
        //   284: istore_3       
        //   285: aload_0        
        //   286: aconst_null    
        //   287: putfield        aemd.a:Ljava/lang/Runnable;
        //   290: iload_1        
        //   291: istore_3       
        //   292: aload           7
        //   294: athrow         
        //   295: astore          8
        //   297: aload           7
        //   299: monitorexit    
        //   300: iload_1        
        //   301: istore_3       
        //   302: aload           8
        //   304: athrow         
        //   305: iload_3        
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
        //   361: istore_3       
        //   362: iload_1        
        //   363: istore_2       
        //   364: iload_3        
        //   365: istore_1       
        //   366: iload_1        
        //   367: istore_3       
        //   368: aload_0        
        //   369: getfield        aemd.b:Ljava/lang/Object;
        //   372: checkcast       Ldwp;
        //   375: getfield        dwp.a:Ljava/util/Deque;
        //   378: astore          7
        //   380: iload_1        
        //   381: istore_3       
        //   382: aload           7
        //   384: monitorenter   
        //   385: iload_2        
        //   386: ifne            452
        //   389: aload_0        
        //   390: getfield        aemd.b:Ljava/lang/Object;
        //   393: astore          8
        //   395: aload           8
        //   397: checkcast       Ldwp;
        //   400: getfield        dwp.c:I
        //   403: iconst_4       
        //   404: if_icmpne       421
        //   407: aload           7
        //   409: monitorexit    
        //   410: iload_1        
        //   411: ifeq            507
        //   414: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   417: invokevirtual   java/lang/Thread.interrupt:()V
        //   420: return         
        //   421: aload           8
        //   423: checkcast       Ldwp;
        //   426: getfield        dwp.b:J
        //   429: lstore          4
        //   431: aload           8
        //   433: checkcast       Ldwp;
        //   436: lload           4
        //   438: lconst_1       
        //   439: ladd           
        //   440: putfield        dwp.b:J
        //   443: aload           8
        //   445: checkcast       Ldwp;
        //   448: iconst_4       
        //   449: putfield        dwp.c:I
        //   452: aload_0        
        //   453: getfield        aemd.b:Ljava/lang/Object;
        //   456: checkcast       Ldwp;
        //   459: getfield        dwp.a:Ljava/util/Deque;
        //   462: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   467: checkcast       Ljava/lang/Runnable;
        //   470: astore          8
        //   472: aload_0        
        //   473: aload           8
        //   475: putfield        aemd.a:Ljava/lang/Runnable;
        //   478: aload           8
        //   480: ifnonnull       508
        //   483: aload_0        
        //   484: getfield        aemd.b:Ljava/lang/Object;
        //   487: checkcast       Ldwp;
        //   490: iconst_1       
        //   491: putfield        dwp.c:I
        //   494: aload           7
        //   496: monitorexit    
        //   497: iload_1        
        //   498: ifeq            507
        //   501: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   504: invokevirtual   java/lang/Thread.interrupt:()V
        //   507: return         
        //   508: aload           7
        //   510: monitorexit    
        //   511: iload_1        
        //   512: istore_3       
        //   513: invokestatic    java/lang/Thread.interrupted:()Z
        //   516: istore          6
        //   518: iload_1        
        //   519: iload           6
        //   521: ior            
        //   522: istore_1       
        //   523: aload_0        
        //   524: getfield        aemd.a:Ljava/lang/Runnable;
        //   527: invokeinterface java/lang/Runnable.run:()V
        //   532: iload_1        
        //   533: istore_3       
        //   534: aload_0        
        //   535: aconst_null    
        //   536: putfield        aemd.a:Ljava/lang/Runnable;
        //   539: iconst_1       
        //   540: istore_2       
        //   541: goto            366
        //   544: astore          7
        //   546: goto            633
        //   549: astore          7
        //   551: goto            611
        //   554: astore          7
        //   556: new             Ljava/lang/RuntimeException;
        //   559: astore          8
        //   561: aload_0        
        //   562: getfield        aemd.a:Ljava/lang/Runnable;
        //   565: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   568: astore          9
        //   570: new             Ljava/lang/StringBuilder;
        //   573: astore          10
        //   575: aload           10
        //   577: invokespecial   java/lang/StringBuilder.<init>:()V
        //   580: aload           10
        //   582: ldc             "Exception while executing runnable "
        //   584: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   587: pop            
        //   588: aload           10
        //   590: aload           9
        //   592: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   595: pop            
        //   596: aload           8
        //   598: aload           10
        //   600: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   603: aload           7
        //   605: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   608: aload           8
        //   610: athrow         
        //   611: iload_1        
        //   612: istore_3       
        //   613: aload_0        
        //   614: aconst_null    
        //   615: putfield        aemd.a:Ljava/lang/Runnable;
        //   618: iload_1        
        //   619: istore_3       
        //   620: aload           7
        //   622: athrow         
        //   623: astore          8
        //   625: aload           7
        //   627: monitorexit    
        //   628: iload_1        
        //   629: istore_3       
        //   630: aload           8
        //   632: athrow         
        //   633: iload_3        
        //   634: ifeq            643
        //   637: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   640: invokevirtual   java/lang/Thread.interrupt:()V
        //   643: aload           7
        //   645: athrow         
        //   646: astore          8
        //   648: aload_0        
        //   649: getfield        aemd.b:Ljava/lang/Object;
        //   652: checkcast       Ldwp;
        //   655: getfield        dwp.a:Ljava/util/Deque;
        //   658: astore          7
        //   660: aload           7
        //   662: monitorenter   
        //   663: aload_0        
        //   664: getfield        aemd.b:Ljava/lang/Object;
        //   667: checkcast       Ldwp;
        //   670: iconst_1       
        //   671: putfield        dwp.c:I
        //   674: aload           7
        //   676: monitorexit    
        //   677: aload           8
        //   679: athrow         
        //   680: astore          8
        //   682: aload           7
        //   684: monitorexit    
        //   685: aload           8
        //   687: athrow         
        //   688: invokestatic    qdt.h:()V
        //   691: iconst_0       
        //   692: istore_3       
        //   693: iconst_0       
        //   694: istore_1       
        //   695: iload_1        
        //   696: istore_2       
        //   697: aload_0        
        //   698: getfield        aemd.b:Ljava/lang/Object;
        //   701: checkcast       Laeme;
        //   704: getfield        aeme.a:Ljava/util/Deque;
        //   707: astore          7
        //   709: iload_1        
        //   710: istore_2       
        //   711: aload           7
        //   713: monitorenter   
        //   714: iload_3        
        //   715: ifne            757
        //   718: aload_0        
        //   719: getfield        aemd.b:Ljava/lang/Object;
        //   722: checkcast       Laeme;
        //   725: getfield        aeme.c:I
        //   728: iconst_2       
        //   729: if_icmpne       738
        //   732: iconst_1       
        //   733: istore          6
        //   735: goto            741
        //   738: iconst_0       
        //   739: istore          6
        //   741: iload           6
        //   743: invokestatic    adkp.Q:(Z)V
        //   746: aload_0        
        //   747: getfield        aemd.b:Ljava/lang/Object;
        //   750: checkcast       Laeme;
        //   753: iconst_3       
        //   754: putfield        aeme.c:I
        //   757: aload_0        
        //   758: getfield        aemd.b:Ljava/lang/Object;
        //   761: checkcast       Laeme;
        //   764: getfield        aeme.a:Ljava/util/Deque;
        //   767: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   772: checkcast       Ljava/lang/Runnable;
        //   775: astore          8
        //   777: aload_0        
        //   778: aload           8
        //   780: putfield        aemd.a:Ljava/lang/Runnable;
        //   783: aload           8
        //   785: ifnonnull       813
        //   788: aload_0        
        //   789: getfield        aemd.b:Ljava/lang/Object;
        //   792: checkcast       Laeme;
        //   795: iconst_1       
        //   796: putfield        aeme.c:I
        //   799: aload           7
        //   801: monitorexit    
        //   802: iload_1        
        //   803: ifeq            812
        //   806: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   809: invokevirtual   java/lang/Thread.interrupt:()V
        //   812: return         
        //   813: aload           7
        //   815: monitorexit    
        //   816: iload_1        
        //   817: istore_2       
        //   818: invokestatic    java/lang/Thread.interrupted:()Z
        //   821: istore          6
        //   823: iload_1        
        //   824: iload           6
        //   826: ior            
        //   827: istore_1       
        //   828: aload_0        
        //   829: getfield        aemd.a:Ljava/lang/Runnable;
        //   832: invokeinterface java/lang/Runnable.run:()V
        //   837: iload_1        
        //   838: istore_2       
        //   839: aload_0        
        //   840: aconst_null    
        //   841: putfield        aemd.a:Ljava/lang/Runnable;
        //   844: iconst_1       
        //   845: istore_3       
        //   846: goto            695
        //   849: astore          7
        //   851: goto            878
        //   854: astore          7
        //   856: iload_1        
        //   857: istore_2       
        //   858: aload_0        
        //   859: aconst_null    
        //   860: putfield        aemd.a:Ljava/lang/Runnable;
        //   863: iload_1        
        //   864: istore_2       
        //   865: aload           7
        //   867: athrow         
        //   868: astore          8
        //   870: aload           7
        //   872: monitorexit    
        //   873: iload_1        
        //   874: istore_2       
        //   875: aload           8
        //   877: athrow         
        //   878: iload_2        
        //   879: ifeq            888
        //   882: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   885: invokevirtual   java/lang/Thread.interrupt:()V
        //   888: aload           7
        //   890: athrow         
        //   891: astore          8
        //   893: aload_0        
        //   894: getfield        aemd.b:Ljava/lang/Object;
        //   897: checkcast       Laeme;
        //   900: getfield        aeme.a:Ljava/util/Deque;
        //   903: astore          7
        //   905: aload           7
        //   907: monitorenter   
        //   908: aload_0        
        //   909: getfield        aemd.b:Ljava/lang/Object;
        //   912: checkcast       Laeme;
        //   915: iconst_1       
        //   916: putfield        aeme.c:I
        //   919: aload           7
        //   921: monitorexit    
        //   922: aload           8
        //   924: athrow         
        //   925: astore          8
        //   927: aload           7
        //   929: monitorexit    
        //   930: goto            936
        //   933: aload           8
        //   935: athrow         
        //   936: goto            933
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
        //  368    380    544    646    Any
        //  382    385    544    646    Any
        //  389    410    623    633    Any
        //  414    420    646    688    Ljava/lang/Error;
        //  421    452    623    633    Any
        //  452    478    623    633    Any
        //  483    497    623    633    Any
        //  501    507    646    688    Ljava/lang/Error;
        //  508    511    623    633    Any
        //  513    518    544    646    Any
        //  523    532    554    611    Ljava/lang/RuntimeException;
        //  523    532    549    623    Any
        //  534    539    544    646    Any
        //  556    611    549    623    Any
        //  613    618    544    646    Any
        //  620    623    544    646    Any
        //  625    628    623    633    Any
        //  630    633    544    646    Any
        //  637    643    646    688    Ljava/lang/Error;
        //  643    646    646    688    Ljava/lang/Error;
        //  663    677    680    688    Any
        //  682    685    680    688    Any
        //  688    691    891    939    Any
        //  697    709    849    891    Any
        //  711    714    849    891    Any
        //  718    732    868    878    Any
        //  741    757    868    878    Any
        //  757    783    868    878    Any
        //  788    802    868    878    Any
        //  806    812    891    939    Any
        //  813    816    868    878    Any
        //  818    823    849    891    Any
        //  828    837    854    868    Any
        //  839    844    849    891    Any
        //  858    863    849    891    Any
        //  865    868    849    891    Any
        //  870    873    868    878    Any
        //  875    878    849    891    Any
        //  882    888    891    939    Any
        //  888    891    891    939    Any
        //  908    922    925    939    Any
        //  927    930    925    939    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 481, Size: 481
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
