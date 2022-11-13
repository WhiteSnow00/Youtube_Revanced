// 
// Decompiled by Procyon v0.6.0
// 

public final class brv implements brl
{
    public final void a() {
    }
    
    public final void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          16
        //     5: aload           16
        //     7: monitorenter   
        //     8: getstatic       brw.b:Ljava/lang/Object;
        //    11: astore          17
        //    13: aload           17
        //    15: monitorenter   
        //    16: getstatic       brw.c:Z
        //    19: ifeq            29
        //    22: aload           17
        //    24: monitorexit    
        //    25: aload           16
        //    27: monitorexit    
        //    28: return         
        //    29: aload           17
        //    31: monitorexit    
        //    32: getstatic       brw.b:Ljava/lang/Object;
        //    35: astore          17
        //    37: aload           17
        //    39: monitorenter   
        //    40: aload           17
        //    42: monitorexit    
        //    43: ldc             "time.android.com"
        //    45: invokestatic    java/net/InetAddress.getByName:(Ljava/lang/String;)Ljava/net/InetAddress;
        //    48: astore          19
        //    50: new             Ljava/net/DatagramSocket;
        //    53: astore          17
        //    55: aload           17
        //    57: invokespecial   java/net/DatagramSocket.<init>:()V
        //    60: aload           17
        //    62: sipush          10000
        //    65: invokevirtual   java/net/DatagramSocket.setSoTimeout:(I)V
        //    68: bipush          48
        //    70: newarray        B
        //    72: astore          15
        //    74: new             Ljava/net/DatagramPacket;
        //    77: astore          18
        //    79: aload           18
        //    81: aload           15
        //    83: bipush          48
        //    85: aload           19
        //    87: bipush          123
        //    89: invokespecial   java/net/DatagramPacket.<init>:([BILjava/net/InetAddress;I)V
        //    92: aload           15
        //    94: iconst_0       
        //    95: bipush          27
        //    97: bastore        
        //    98: invokestatic    java/lang/System.currentTimeMillis:()J
        //   101: lstore          9
        //   103: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   106: lstore          7
        //   108: lload           9
        //   110: lconst_0       
        //   111: lcmp           
        //   112: ifne            133
        //   115: aload           15
        //   117: bipush          40
        //   119: bipush          48
        //   121: iconst_0       
        //   122: invokestatic    java/util/Arrays.fill:([BIIB)V
        //   125: goto            275
        //   128: astore          15
        //   130: goto            584
        //   133: lload           9
        //   135: ldc2_w          1000
        //   138: ldiv           
        //   139: lstore          11
        //   141: lload           11
        //   143: invokestatic    java/lang/Long.signum:(J)I
        //   146: pop            
        //   147: lload           11
        //   149: ldc2_w          2208988800
        //   152: ladd           
        //   153: lstore          5
        //   155: lload           5
        //   157: bipush          24
        //   159: lshr           
        //   160: l2i            
        //   161: i2b            
        //   162: istore_1       
        //   163: aload           15
        //   165: bipush          40
        //   167: iload_1        
        //   168: bastore        
        //   169: lload           5
        //   171: bipush          16
        //   173: lshr           
        //   174: l2i            
        //   175: i2b            
        //   176: istore_1       
        //   177: aload           15
        //   179: bipush          41
        //   181: iload_1        
        //   182: bastore        
        //   183: lload           5
        //   185: bipush          8
        //   187: lshr           
        //   188: l2i            
        //   189: i2b            
        //   190: istore_1       
        //   191: aload           15
        //   193: bipush          42
        //   195: iload_1        
        //   196: bastore        
        //   197: aload           15
        //   199: bipush          43
        //   201: lload           5
        //   203: l2i            
        //   204: i2b            
        //   205: bastore        
        //   206: lload           9
        //   208: lload           11
        //   210: ldc2_w          1000
        //   213: lmul           
        //   214: lsub           
        //   215: ldc2_w          4294967296
        //   218: lmul           
        //   219: ldc2_w          1000
        //   222: ldiv           
        //   223: lstore          5
        //   225: aload           15
        //   227: bipush          44
        //   229: lload           5
        //   231: bipush          24
        //   233: lshr           
        //   234: l2i            
        //   235: i2b            
        //   236: bastore        
        //   237: aload           15
        //   239: bipush          45
        //   241: lload           5
        //   243: bipush          16
        //   245: lshr           
        //   246: l2i            
        //   247: i2b            
        //   248: bastore        
        //   249: aload           15
        //   251: bipush          46
        //   253: lload           5
        //   255: bipush          8
        //   257: lshr           
        //   258: l2i            
        //   259: i2b            
        //   260: bastore        
        //   261: aload           15
        //   263: bipush          47
        //   265: invokestatic    java/lang/Math.random:()D
        //   268: ldc2_w          255.0
        //   271: dmul           
        //   272: d2i            
        //   273: i2b            
        //   274: bastore        
        //   275: aload           17
        //   277: aload           18
        //   279: invokevirtual   java/net/DatagramSocket.send:(Ljava/net/DatagramPacket;)V
        //   282: new             Ljava/net/DatagramPacket;
        //   285: astore          18
        //   287: aload           18
        //   289: aload           15
        //   291: bipush          48
        //   293: invokespecial   java/net/DatagramPacket.<init>:([BI)V
        //   296: aload           17
        //   298: aload           18
        //   300: invokevirtual   java/net/DatagramSocket.receive:(Ljava/net/DatagramPacket;)V
        //   303: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   306: lstore          5
        //   308: lload           9
        //   310: lload           5
        //   312: lload           7
        //   314: lsub           
        //   315: ladd           
        //   316: lstore          7
        //   318: aload           15
        //   320: iconst_0       
        //   321: baload         
        //   322: istore_2       
        //   323: iload_2        
        //   324: bipush          7
        //   326: iand           
        //   327: istore_3       
        //   328: aload           15
        //   330: iconst_1       
        //   331: baload         
        //   332: sipush          255
        //   335: iand           
        //   336: istore          4
        //   338: aload           15
        //   340: bipush          24
        //   342: invokestatic    brw.a:([BI)J
        //   345: lstore          13
        //   347: aload           15
        //   349: bipush          32
        //   351: invokestatic    brw.a:([BI)J
        //   354: lstore          11
        //   356: aload           15
        //   358: bipush          40
        //   360: invokestatic    brw.a:([BI)J
        //   363: lstore          9
        //   365: iload_2        
        //   366: bipush          6
        //   368: ishr           
        //   369: iconst_3       
        //   370: iand           
        //   371: iconst_3       
        //   372: if_icmpeq       557
        //   375: iload_3        
        //   376: iconst_4       
        //   377: if_icmpeq       425
        //   380: iload_3        
        //   381: iconst_5       
        //   382: if_icmpne       388
        //   385: goto            425
        //   388: new             Ljava/io/IOException;
        //   391: astore          15
        //   393: new             Ljava/lang/StringBuilder;
        //   396: astore          18
        //   398: aload           18
        //   400: ldc             "SNTP: Untrusted mode: "
        //   402: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   405: aload           18
        //   407: iload_3        
        //   408: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   411: pop            
        //   412: aload           15
        //   414: aload           18
        //   416: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   419: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   422: aload           15
        //   424: athrow         
        //   425: iload           4
        //   427: ifeq            519
        //   430: iload           4
        //   432: bipush          15
        //   434: if_icmpgt       519
        //   437: lload           9
        //   439: lconst_0       
        //   440: lcmp           
        //   441: ifeq            504
        //   444: lload           11
        //   446: lload           13
        //   448: lsub           
        //   449: lload           9
        //   451: lload           7
        //   453: lsub           
        //   454: ladd           
        //   455: ldc2_w          2
        //   458: ldiv           
        //   459: lstore          9
        //   461: aload           17
        //   463: invokevirtual   java/net/DatagramSocket.close:()V
        //   466: getstatic       brw.b:Ljava/lang/Object;
        //   469: astore          17
        //   471: aload           17
        //   473: monitorenter   
        //   474: lload           7
        //   476: lload           9
        //   478: ladd           
        //   479: lload           5
        //   481: lsub           
        //   482: putstatic       brw.d:J
        //   485: iconst_1       
        //   486: putstatic       brw.c:Z
        //   489: aload           17
        //   491: monitorexit    
        //   492: aload           16
        //   494: monitorexit    
        //   495: return         
        //   496: astore          15
        //   498: aload           17
        //   500: monitorexit    
        //   501: aload           15
        //   503: athrow         
        //   504: new             Ljava/io/IOException;
        //   507: astore          15
        //   509: aload           15
        //   511: ldc             "SNTP: Zero transmitTime"
        //   513: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   516: aload           15
        //   518: athrow         
        //   519: new             Ljava/io/IOException;
        //   522: astore          15
        //   524: new             Ljava/lang/StringBuilder;
        //   527: astore          18
        //   529: aload           18
        //   531: ldc             "SNTP: Untrusted stratum: "
        //   533: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   536: aload           18
        //   538: iload           4
        //   540: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   543: pop            
        //   544: aload           15
        //   546: aload           18
        //   548: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   551: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   554: aload           15
        //   556: athrow         
        //   557: new             Ljava/io/IOException;
        //   560: astore          15
        //   562: aload           15
        //   564: ldc             "SNTP: Unsynchronized server"
        //   566: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   569: aload           15
        //   571: athrow         
        //   572: astore          15
        //   574: goto            584
        //   577: astore          15
        //   579: goto            584
        //   582: astore          15
        //   584: aload           17
        //   586: invokevirtual   java/net/DatagramSocket.close:()V
        //   589: goto            625
        //   592: astore          17
        //   594: ldc             Ljava/lang/Throwable;.class
        //   596: ldc             "addSuppressed"
        //   598: iconst_1       
        //   599: anewarray       Ljava/lang/Class;
        //   602: dup            
        //   603: iconst_0       
        //   604: ldc             Ljava/lang/Throwable;.class
        //   606: aastore        
        //   607: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   610: aload           15
        //   612: iconst_1       
        //   613: anewarray       Ljava/lang/Object;
        //   616: dup            
        //   617: iconst_0       
        //   618: aload           17
        //   620: aastore        
        //   621: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   624: pop            
        //   625: aload           15
        //   627: athrow         
        //   628: astore          15
        //   630: aload           17
        //   632: monitorexit    
        //   633: aload           15
        //   635: athrow         
        //   636: astore          15
        //   638: aload           17
        //   640: monitorexit    
        //   641: aload           15
        //   643: athrow         
        //   644: astore          15
        //   646: aload           16
        //   648: monitorexit    
        //   649: aload           15
        //   651: athrow         
        //   652: astore          17
        //   654: goto            625
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      16     644    652    Any
        //  16     25     636    644    Any
        //  25     28     644    652    Any
        //  29     32     636    644    Any
        //  32     40     644    652    Any
        //  40     43     628    636    Any
        //  43     60     644    652    Any
        //  60     92     582    584    Any
        //  98     108    582    584    Any
        //  115    125    128    133    Any
        //  133    141    582    584    Any
        //  206    225    577    582    Any
        //  261    275    577    582    Any
        //  275    308    572    577    Any
        //  338    365    572    577    Any
        //  388    425    572    577    Any
        //  444    461    572    577    Any
        //  461    474    644    652    Any
        //  474    492    496    504    Any
        //  492    495    644    652    Any
        //  498    501    496    504    Any
        //  501    504    644    652    Any
        //  504    519    572    577    Any
        //  519    557    572    577    Any
        //  557    572    572    577    Any
        //  584    589    592    625    Any
        //  594    625    652    657    Ljava/lang/Exception;
        //  594    625    644    652    Any
        //  625    628    644    652    Any
        //  630    633    628    636    Any
        //  633    636    644    652    Any
        //  638    641    636    644    Any
        //  641    644    644    652    Any
        //  646    649    644    652    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0625:
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
