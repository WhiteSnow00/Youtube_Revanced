// 
// Decompiled by Procyon v0.6.0
// 

public final class bry implements bro
{
    @Override
    public final void a() {
    }
    
    @Override
    public final void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          16
        //     5: aload           16
        //     7: monitorenter   
        //     8: getstatic       brz.b:Ljava/lang/Object;
        //    11: astore          17
        //    13: aload           17
        //    15: monitorenter   
        //    16: getstatic       brz.c:Z
        //    19: ifeq            29
        //    22: aload           17
        //    24: monitorexit    
        //    25: aload           16
        //    27: monitorexit    
        //    28: return         
        //    29: aload           17
        //    31: monitorexit    
        //    32: getstatic       brz.b:Ljava/lang/Object;
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
        //   130: goto            583
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
        //   322: istore          4
        //   324: iload           4
        //   326: bipush          7
        //   328: iand           
        //   329: istore_2       
        //   330: aload           15
        //   332: iconst_1       
        //   333: baload         
        //   334: sipush          255
        //   337: iand           
        //   338: istore_3       
        //   339: aload           15
        //   341: bipush          24
        //   343: invokestatic    brz.a:([BI)J
        //   346: lstore          9
        //   348: aload           15
        //   350: bipush          32
        //   352: invokestatic    brz.a:([BI)J
        //   355: lstore          13
        //   357: aload           15
        //   359: bipush          40
        //   361: invokestatic    brz.a:([BI)J
        //   364: lstore          11
        //   366: iload           4
        //   368: bipush          6
        //   370: ishr           
        //   371: iconst_3       
        //   372: iand           
        //   373: iconst_3       
        //   374: if_icmpeq       556
        //   377: iload_2        
        //   378: iconst_4       
        //   379: if_icmpeq       427
        //   382: iload_2        
        //   383: iconst_5       
        //   384: if_icmpne       390
        //   387: goto            427
        //   390: new             Ljava/io/IOException;
        //   393: astore          15
        //   395: new             Ljava/lang/StringBuilder;
        //   398: astore          18
        //   400: aload           18
        //   402: ldc             "SNTP: Untrusted mode: "
        //   404: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   407: aload           18
        //   409: iload_2        
        //   410: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   413: pop            
        //   414: aload           15
        //   416: aload           18
        //   418: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   421: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   424: aload           15
        //   426: athrow         
        //   427: iload_3        
        //   428: ifeq            519
        //   431: iload_3        
        //   432: bipush          15
        //   434: if_icmpgt       519
        //   437: lload           11
        //   439: lconst_0       
        //   440: lcmp           
        //   441: ifeq            504
        //   444: lload           13
        //   446: lload           9
        //   448: lsub           
        //   449: lload           11
        //   451: lload           7
        //   453: lsub           
        //   454: ladd           
        //   455: ldc2_w          2
        //   458: ldiv           
        //   459: lstore          9
        //   461: aload           17
        //   463: invokevirtual   java/net/DatagramSocket.close:()V
        //   466: getstatic       brz.b:Ljava/lang/Object;
        //   469: astore          15
        //   471: aload           15
        //   473: monitorenter   
        //   474: lload           7
        //   476: lload           9
        //   478: ladd           
        //   479: lload           5
        //   481: lsub           
        //   482: putstatic       brz.d:J
        //   485: iconst_1       
        //   486: putstatic       brz.c:Z
        //   489: aload           15
        //   491: monitorexit    
        //   492: aload           16
        //   494: monitorexit    
        //   495: return         
        //   496: astore          17
        //   498: aload           15
        //   500: monitorexit    
        //   501: aload           17
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
        //   538: iload_3        
        //   539: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   542: pop            
        //   543: aload           15
        //   545: aload           18
        //   547: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   550: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   553: aload           15
        //   555: athrow         
        //   556: new             Ljava/io/IOException;
        //   559: astore          15
        //   561: aload           15
        //   563: ldc             "SNTP: Unsynchronized server"
        //   565: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   568: aload           15
        //   570: athrow         
        //   571: astore          15
        //   573: goto            583
        //   576: astore          15
        //   578: goto            583
        //   581: astore          15
        //   583: aload           17
        //   585: invokevirtual   java/net/DatagramSocket.close:()V
        //   588: goto            624
        //   591: astore          17
        //   593: ldc             Ljava/lang/Throwable;.class
        //   595: ldc             "addSuppressed"
        //   597: iconst_1       
        //   598: anewarray       Ljava/lang/Class;
        //   601: dup            
        //   602: iconst_0       
        //   603: ldc             Ljava/lang/Throwable;.class
        //   605: aastore        
        //   606: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   609: aload           15
        //   611: iconst_1       
        //   612: anewarray       Ljava/lang/Object;
        //   615: dup            
        //   616: iconst_0       
        //   617: aload           17
        //   619: aastore        
        //   620: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   623: pop            
        //   624: aload           15
        //   626: athrow         
        //   627: astore          15
        //   629: aload           17
        //   631: monitorexit    
        //   632: aload           15
        //   634: athrow         
        //   635: astore          15
        //   637: aload           17
        //   639: monitorexit    
        //   640: aload           15
        //   642: athrow         
        //   643: astore          15
        //   645: aload           16
        //   647: monitorexit    
        //   648: aload           15
        //   650: athrow         
        //   651: astore          17
        //   653: goto            624
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      16     643    651    Any
        //  16     25     635    643    Any
        //  25     28     643    651    Any
        //  29     32     635    643    Any
        //  32     40     643    651    Any
        //  40     43     627    635    Any
        //  43     60     643    651    Any
        //  60     92     581    583    Any
        //  98     108    581    583    Any
        //  115    125    128    133    Any
        //  133    141    581    583    Any
        //  206    225    576    581    Any
        //  261    275    576    581    Any
        //  275    308    571    576    Any
        //  339    366    571    576    Any
        //  390    427    571    576    Any
        //  444    461    571    576    Any
        //  461    474    643    651    Any
        //  474    492    496    504    Any
        //  492    495    643    651    Any
        //  498    501    496    504    Any
        //  501    504    643    651    Any
        //  504    519    571    576    Any
        //  519    556    571    576    Any
        //  556    571    571    576    Any
        //  583    588    591    624    Any
        //  593    624    651    656    Ljava/lang/Exception;
        //  593    624    643    651    Any
        //  624    627    643    651    Any
        //  629    632    627    635    Any
        //  632    635    643    651    Any
        //  637    640    635    643    Any
        //  640    643    643    651    Any
        //  645    648    643    651    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0624:
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
