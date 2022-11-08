// 
// Decompiled by Procyon v0.6.0
// 

public final class aekc implements Runnable
{
    Runnable a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public aekc(final aekd b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public aekc(final afuc b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public aekc(final dwo b, final int c) {
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
        //     1: getfield        aekc.c:I
        //     4: istore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: iconst_0       
        //     8: istore_3       
        //     9: iload_1        
        //    10: ifeq            688
        //    13: iload_1        
        //    14: iconst_1       
        //    15: if_icmpeq       360
        //    18: iconst_0       
        //    19: istore_2       
        //    20: iload_2        
        //    21: istore_1       
        //    22: aload_0        
        //    23: getfield        aekc.b:Ljava/lang/Object;
        //    26: checkcast       Lafuc;
        //    29: getfield        afuc.b:Ljava/util/Deque;
        //    32: astore          4
        //    34: iload_2        
        //    35: istore_1       
        //    36: aload           4
        //    38: monitorenter   
        //    39: iload_3        
        //    40: ifne            106
        //    43: aload_0        
        //    44: getfield        aekc.b:Ljava/lang/Object;
        //    47: astore          5
        //    49: aload           5
        //    51: checkcast       Lafuc;
        //    54: getfield        afuc.d:I
        //    57: iconst_4       
        //    58: if_icmpne       75
        //    61: aload           4
        //    63: monitorexit    
        //    64: iload_2        
        //    65: ifeq            161
        //    68: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    71: invokevirtual   java/lang/Thread.interrupt:()V
        //    74: return         
        //    75: aload           5
        //    77: checkcast       Lafuc;
        //    80: getfield        afuc.c:J
        //    83: lstore          6
        //    85: aload           5
        //    87: checkcast       Lafuc;
        //    90: lload           6
        //    92: lconst_1       
        //    93: ladd           
        //    94: putfield        afuc.c:J
        //    97: aload           5
        //    99: checkcast       Lafuc;
        //   102: iconst_4       
        //   103: putfield        afuc.d:I
        //   106: aload_0        
        //   107: getfield        aekc.b:Ljava/lang/Object;
        //   110: checkcast       Lafuc;
        //   113: getfield        afuc.b:Ljava/util/Deque;
        //   116: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   121: checkcast       Ljava/lang/Runnable;
        //   124: astore          5
        //   126: aload_0        
        //   127: aload           5
        //   129: putfield        aekc.a:Ljava/lang/Runnable;
        //   132: aload           5
        //   134: ifnonnull       162
        //   137: aload_0        
        //   138: getfield        aekc.b:Ljava/lang/Object;
        //   141: checkcast       Lafuc;
        //   144: iconst_1       
        //   145: putfield        afuc.d:I
        //   148: aload           4
        //   150: monitorexit    
        //   151: iload_2        
        //   152: ifeq            161
        //   155: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   158: invokevirtual   java/lang/Thread.interrupt:()V
        //   161: return         
        //   162: aload           4
        //   164: monitorexit    
        //   165: iload_2        
        //   166: istore_1       
        //   167: invokestatic    java/lang/Thread.interrupted:()Z
        //   170: istore          8
        //   172: iload_2        
        //   173: iload           8
        //   175: ior            
        //   176: istore_2       
        //   177: aload_0        
        //   178: getfield        aekc.a:Ljava/lang/Runnable;
        //   181: invokeinterface java/lang/Runnable.run:()V
        //   186: iload_2        
        //   187: istore_1       
        //   188: aload_0        
        //   189: aconst_null    
        //   190: putfield        aekc.a:Ljava/lang/Runnable;
        //   193: iconst_1       
        //   194: istore_3       
        //   195: goto            20
        //   198: astore          4
        //   200: goto            305
        //   203: astore          4
        //   205: goto            283
        //   208: astore          9
        //   210: getstatic       afuc.a:Ljava/util/logging/Logger;
        //   213: astore          10
        //   215: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   218: astore          5
        //   220: aload_0        
        //   221: getfield        aekc.a:Ljava/lang/Runnable;
        //   224: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   227: astore          4
        //   229: new             Ljava/lang/StringBuilder;
        //   232: astore          11
        //   234: aload           11
        //   236: invokespecial   java/lang/StringBuilder.<init>:()V
        //   239: aload           11
        //   241: ldc             "Exception while executing runnable "
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: pop            
        //   247: aload           11
        //   249: aload           4
        //   251: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   254: pop            
        //   255: aload           10
        //   257: aload           5
        //   259: ldc             "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
        //   261: ldc             "workOnQueue"
        //   263: aload           11
        //   265: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   268: aload           9
        //   270: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   273: iload_2        
        //   274: istore_1       
        //   275: aload_0        
        //   276: aconst_null    
        //   277: putfield        aekc.a:Ljava/lang/Runnable;
        //   280: goto            193
        //   283: iload_2        
        //   284: istore_1       
        //   285: aload_0        
        //   286: aconst_null    
        //   287: putfield        aekc.a:Ljava/lang/Runnable;
        //   290: iload_2        
        //   291: istore_1       
        //   292: aload           4
        //   294: athrow         
        //   295: astore          5
        //   297: aload           4
        //   299: monitorexit    
        //   300: iload_2        
        //   301: istore_1       
        //   302: aload           5
        //   304: athrow         
        //   305: iload_1        
        //   306: ifeq            315
        //   309: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   312: invokevirtual   java/lang/Thread.interrupt:()V
        //   315: aload           4
        //   317: athrow         
        //   318: astore          5
        //   320: aload_0        
        //   321: getfield        aekc.b:Ljava/lang/Object;
        //   324: checkcast       Lafuc;
        //   327: getfield        afuc.b:Ljava/util/Deque;
        //   330: astore          4
        //   332: aload           4
        //   334: monitorenter   
        //   335: aload_0        
        //   336: getfield        aekc.b:Ljava/lang/Object;
        //   339: checkcast       Lafuc;
        //   342: iconst_1       
        //   343: putfield        afuc.d:I
        //   346: aload           4
        //   348: monitorexit    
        //   349: aload           5
        //   351: athrow         
        //   352: astore          5
        //   354: aload           4
        //   356: monitorexit    
        //   357: aload           5
        //   359: athrow         
        //   360: iconst_0       
        //   361: istore_1       
        //   362: iload_2        
        //   363: istore_3       
        //   364: iload_1        
        //   365: istore_2       
        //   366: iload_2        
        //   367: istore_1       
        //   368: aload_0        
        //   369: getfield        aekc.b:Ljava/lang/Object;
        //   372: checkcast       Ldwo;
        //   375: getfield        dwo.a:Ljava/util/Deque;
        //   378: astore          4
        //   380: iload_2        
        //   381: istore_1       
        //   382: aload           4
        //   384: monitorenter   
        //   385: iload_3        
        //   386: ifne            452
        //   389: aload_0        
        //   390: getfield        aekc.b:Ljava/lang/Object;
        //   393: astore          5
        //   395: aload           5
        //   397: checkcast       Ldwo;
        //   400: getfield        dwo.c:I
        //   403: iconst_4       
        //   404: if_icmpne       421
        //   407: aload           4
        //   409: monitorexit    
        //   410: iload_2        
        //   411: ifeq            507
        //   414: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   417: invokevirtual   java/lang/Thread.interrupt:()V
        //   420: return         
        //   421: aload           5
        //   423: checkcast       Ldwo;
        //   426: getfield        dwo.b:J
        //   429: lstore          6
        //   431: aload           5
        //   433: checkcast       Ldwo;
        //   436: lload           6
        //   438: lconst_1       
        //   439: ladd           
        //   440: putfield        dwo.b:J
        //   443: aload           5
        //   445: checkcast       Ldwo;
        //   448: iconst_4       
        //   449: putfield        dwo.c:I
        //   452: aload_0        
        //   453: getfield        aekc.b:Ljava/lang/Object;
        //   456: checkcast       Ldwo;
        //   459: getfield        dwo.a:Ljava/util/Deque;
        //   462: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   467: checkcast       Ljava/lang/Runnable;
        //   470: astore          5
        //   472: aload_0        
        //   473: aload           5
        //   475: putfield        aekc.a:Ljava/lang/Runnable;
        //   478: aload           5
        //   480: ifnonnull       508
        //   483: aload_0        
        //   484: getfield        aekc.b:Ljava/lang/Object;
        //   487: checkcast       Ldwo;
        //   490: iconst_1       
        //   491: putfield        dwo.c:I
        //   494: aload           4
        //   496: monitorexit    
        //   497: iload_2        
        //   498: ifeq            507
        //   501: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   504: invokevirtual   java/lang/Thread.interrupt:()V
        //   507: return         
        //   508: aload           4
        //   510: monitorexit    
        //   511: iload_2        
        //   512: istore_1       
        //   513: invokestatic    java/lang/Thread.interrupted:()Z
        //   516: istore          8
        //   518: iload_2        
        //   519: iload           8
        //   521: ior            
        //   522: istore_2       
        //   523: aload_0        
        //   524: getfield        aekc.a:Ljava/lang/Runnable;
        //   527: invokeinterface java/lang/Runnable.run:()V
        //   532: iload_2        
        //   533: istore_1       
        //   534: aload_0        
        //   535: aconst_null    
        //   536: putfield        aekc.a:Ljava/lang/Runnable;
        //   539: iconst_1       
        //   540: istore_3       
        //   541: goto            366
        //   544: astore          4
        //   546: goto            633
        //   549: astore          4
        //   551: goto            611
        //   554: astore          11
        //   556: new             Ljava/lang/RuntimeException;
        //   559: astore          4
        //   561: aload_0        
        //   562: getfield        aekc.a:Ljava/lang/Runnable;
        //   565: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   568: astore          9
        //   570: new             Ljava/lang/StringBuilder;
        //   573: astore          5
        //   575: aload           5
        //   577: invokespecial   java/lang/StringBuilder.<init>:()V
        //   580: aload           5
        //   582: ldc             "Exception while executing runnable "
        //   584: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   587: pop            
        //   588: aload           5
        //   590: aload           9
        //   592: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   595: pop            
        //   596: aload           4
        //   598: aload           5
        //   600: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   603: aload           11
        //   605: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   608: aload           4
        //   610: athrow         
        //   611: iload_2        
        //   612: istore_1       
        //   613: aload_0        
        //   614: aconst_null    
        //   615: putfield        aekc.a:Ljava/lang/Runnable;
        //   618: iload_2        
        //   619: istore_1       
        //   620: aload           4
        //   622: athrow         
        //   623: astore          5
        //   625: aload           4
        //   627: monitorexit    
        //   628: iload_2        
        //   629: istore_1       
        //   630: aload           5
        //   632: athrow         
        //   633: iload_1        
        //   634: ifeq            643
        //   637: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   640: invokevirtual   java/lang/Thread.interrupt:()V
        //   643: aload           4
        //   645: athrow         
        //   646: astore          5
        //   648: aload_0        
        //   649: getfield        aekc.b:Ljava/lang/Object;
        //   652: checkcast       Ldwo;
        //   655: getfield        dwo.a:Ljava/util/Deque;
        //   658: astore          4
        //   660: aload           4
        //   662: monitorenter   
        //   663: aload_0        
        //   664: getfield        aekc.b:Ljava/lang/Object;
        //   667: checkcast       Ldwo;
        //   670: iconst_1       
        //   671: putfield        dwo.c:I
        //   674: aload           4
        //   676: monitorexit    
        //   677: aload           5
        //   679: athrow         
        //   680: astore          5
        //   682: aload           4
        //   684: monitorexit    
        //   685: aload           5
        //   687: athrow         
        //   688: invokestatic    qcj.s:()V
        //   691: iconst_0       
        //   692: istore_1       
        //   693: iconst_0       
        //   694: istore_2       
        //   695: iload_2        
        //   696: istore_3       
        //   697: aload_0        
        //   698: getfield        aekc.b:Ljava/lang/Object;
        //   701: checkcast       Laekd;
        //   704: getfield        aekd.a:Ljava/util/Deque;
        //   707: astore          4
        //   709: iload_2        
        //   710: istore_3       
        //   711: aload           4
        //   713: monitorenter   
        //   714: iload_1        
        //   715: ifne            757
        //   718: aload_0        
        //   719: getfield        aekc.b:Ljava/lang/Object;
        //   722: checkcast       Laekd;
        //   725: getfield        aekd.c:I
        //   728: iconst_2       
        //   729: if_icmpne       738
        //   732: iconst_1       
        //   733: istore          8
        //   735: goto            741
        //   738: iconst_0       
        //   739: istore          8
        //   741: iload           8
        //   743: invokestatic    agot.D:(Z)V
        //   746: aload_0        
        //   747: getfield        aekc.b:Ljava/lang/Object;
        //   750: checkcast       Laekd;
        //   753: iconst_3       
        //   754: putfield        aekd.c:I
        //   757: aload_0        
        //   758: getfield        aekc.b:Ljava/lang/Object;
        //   761: checkcast       Laekd;
        //   764: getfield        aekd.a:Ljava/util/Deque;
        //   767: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //   772: checkcast       Ljava/lang/Runnable;
        //   775: astore          5
        //   777: aload_0        
        //   778: aload           5
        //   780: putfield        aekc.a:Ljava/lang/Runnable;
        //   783: aload           5
        //   785: ifnonnull       813
        //   788: aload_0        
        //   789: getfield        aekc.b:Ljava/lang/Object;
        //   792: checkcast       Laekd;
        //   795: iconst_1       
        //   796: putfield        aekd.c:I
        //   799: aload           4
        //   801: monitorexit    
        //   802: iload_2        
        //   803: ifeq            812
        //   806: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   809: invokevirtual   java/lang/Thread.interrupt:()V
        //   812: return         
        //   813: aload           4
        //   815: monitorexit    
        //   816: iload_2        
        //   817: istore_3       
        //   818: invokestatic    java/lang/Thread.interrupted:()Z
        //   821: istore          8
        //   823: iload_2        
        //   824: iload           8
        //   826: ior            
        //   827: istore_2       
        //   828: aload_0        
        //   829: getfield        aekc.a:Ljava/lang/Runnable;
        //   832: invokeinterface java/lang/Runnable.run:()V
        //   837: iload_2        
        //   838: istore_3       
        //   839: aload_0        
        //   840: aconst_null    
        //   841: putfield        aekc.a:Ljava/lang/Runnable;
        //   844: iconst_1       
        //   845: istore_1       
        //   846: goto            695
        //   849: astore          4
        //   851: goto            878
        //   854: astore          4
        //   856: iload_2        
        //   857: istore_3       
        //   858: aload_0        
        //   859: aconst_null    
        //   860: putfield        aekc.a:Ljava/lang/Runnable;
        //   863: iload_2        
        //   864: istore_3       
        //   865: aload           4
        //   867: athrow         
        //   868: astore          5
        //   870: aload           4
        //   872: monitorexit    
        //   873: iload_2        
        //   874: istore_3       
        //   875: aload           5
        //   877: athrow         
        //   878: iload_3        
        //   879: ifeq            888
        //   882: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   885: invokevirtual   java/lang/Thread.interrupt:()V
        //   888: aload           4
        //   890: athrow         
        //   891: astore          5
        //   893: aload_0        
        //   894: getfield        aekc.b:Ljava/lang/Object;
        //   897: checkcast       Laekd;
        //   900: getfield        aekd.a:Ljava/util/Deque;
        //   903: astore          4
        //   905: aload           4
        //   907: monitorenter   
        //   908: aload_0        
        //   909: getfield        aekc.b:Ljava/lang/Object;
        //   912: checkcast       Laekd;
        //   915: iconst_1       
        //   916: putfield        aekd.c:I
        //   919: aload           4
        //   921: monitorexit    
        //   922: aload           5
        //   924: athrow         
        //   925: astore          5
        //   927: aload           4
        //   929: monitorexit    
        //   930: goto            936
        //   933: aload           5
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
                final int c2 = ((aekd)this.b).c;
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
                final int d = ((afuc)this.b).d;
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
            final int c3 = ((dwo)this.b).c;
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
