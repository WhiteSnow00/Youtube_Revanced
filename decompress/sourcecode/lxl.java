import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class lxl extends Handler
{
    final /* synthetic */ lxn a;
    
    public lxl(final lxn a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    final Message a(final int n, final Object o, final boolean b) {
        return this.obtainMessage(n, (int)(b ? 1 : 0), 0, o);
    }
    
    public final void handleMessage(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/os/Message.what:I
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifeq            576
        //     9: iload_2        
        //    10: iconst_1       
        //    11: if_icmpne       563
        //    14: aload_0        
        //    15: getfield        lxl.a:Llxn;
        //    18: getfield        lxn.g:Lbli;
        //    21: astore_3       
        //    22: aload_1        
        //    23: getfield        android/os/Message.obj:Ljava/lang/Object;
        //    26: checkcast       Leaa;
        //    29: astore          4
        //    31: aload_3        
        //    32: checkcast       Lynh;
        //    35: getfield        ynh.b:Ljava/util/concurrent/atomic/AtomicInteger;
        //    38: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //    41: istore_2       
        //    42: aload_3        
        //    43: checkcast       Lynh;
        //    46: getfield        ynh.q:Labjm;
        //    49: astore          5
        //    51: aload           4
        //    53: getfield        eaa.b:Ljava/lang/Object;
        //    56: astore          6
        //    58: aload_3        
        //    59: checkcast       Lynh;
        //    62: getfield        ynh.g:Ljava/lang/String;
        //    65: astore          7
        //    67: aload           7
        //    69: invokestatic    zbm.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //    72: pop            
        //    73: aload_3        
        //    74: checkcast       Lynh;
        //    77: getfield        ynh.c:Ljava/lang/String;
        //    80: invokestatic    aexs.e:(Ljava/lang/String;)Ljava/lang/String;
        //    83: astore          8
        //    85: aload_3        
        //    86: checkcast       Lynh;
        //    89: getfield        ynh.e:Ljava/lang/String;
        //    92: astore          9
        //    94: aload           9
        //    96: invokestatic    zbm.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //    99: pop            
        //   100: aload_3        
        //   101: checkcast       Lynh;
        //   104: getfield        ynh.f:Ljava/lang/String;
        //   107: astore          10
        //   109: aload           10
        //   111: invokestatic    zbm.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   114: pop            
        //   115: aload_3        
        //   116: checkcast       Lynh;
        //   119: getfield        ynh.l:Ljava/lang/Integer;
        //   122: astore          11
        //   124: aload_3        
        //   125: checkcast       Lynh;
        //   128: getfield        ynh.p:I
        //   131: istore          12
        //   133: aload_3        
        //   134: checkcast       Lynh;
        //   137: getfield        ynh.m:Ljava/lang/Long;
        //   140: astore          13
        //   142: aload           10
        //   144: invokevirtual   java/lang/String.isEmpty:()Z
        //   147: iconst_1       
        //   148: ixor           
        //   149: invokestatic    zbm.d:(Z)V
        //   152: invokestatic    szc.e:()V
        //   155: aload           9
        //   157: astore          14
        //   159: aload           9
        //   161: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   164: ifeq            180
        //   167: aload           5
        //   169: getfield        abjm.f:Ljava/lang/Object;
        //   172: checkcast       Lavt;
        //   175: invokevirtual   avt.Z:()Ljava/lang/String;
        //   178: astore          14
        //   180: new             Lync;
        //   183: astore          9
        //   185: aload           5
        //   187: getfield        abjm.g:Ljava/lang/Object;
        //   190: astore          15
        //   192: new             Lynd;
        //   195: astore          16
        //   197: aload           5
        //   199: getfield        abjm.c:Ladcr;
        //   202: astore          17
        //   204: aload           5
        //   206: getfield        abjm.e:Ljava/lang/Object;
        //   209: astore          18
        //   211: aload           5
        //   213: getfield        abjm.h:Ljava/lang/Object;
        //   216: checkcast       Lyzk;
        //   219: invokevirtual   yzk.au:()Z
        //   222: istore          19
        //   224: aload           16
        //   226: aload           17
        //   228: aload           18
        //   230: aload           6
        //   232: checkcast       [B
        //   235: aload           7
        //   237: aload           8
        //   239: aload           14
        //   241: aload           10
        //   243: iload           19
        //   245: aload           11
        //   247: iload           12
        //   249: aload           13
        //   251: aconst_null    
        //   252: aconst_null    
        //   253: aconst_null    
        //   254: aconst_null    
        //   255: aconst_null    
        //   256: aconst_null    
        //   257: invokespecial   ynd.<init>:(Ladcr;Lzki;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ILjava/lang/Long;[B[B[B[B[B[B)V
        //   260: aload           9
        //   262: aload           15
        //   264: checkcast       Lvkh;
        //   267: aload           16
        //   269: invokevirtual   vkh.d:(Lvjn;)Lcom/google/protobuf/MessageLite;
        //   272: checkcast       Lakld;
        //   275: invokespecial   ync.<init>:(Lakld;)V
        //   278: aload           9
        //   280: invokevirtual   ync.c:()Z
        //   283: istore          19
        //   285: iload           19
        //   287: ifeq            467
        //   290: aload           9
        //   292: getfield        ync.b:Lafcr;
        //   295: astore          14
        //   297: aload_3        
        //   298: checkcast       Lynh;
        //   301: aload           14
        //   303: putfield        ynh.h:Lafcr;
        //   306: aload           9
        //   308: getfield        ync.a:Lakld;
        //   311: getfield        akld.h:Z
        //   314: istore          19
        //   316: aload_3        
        //   317: checkcast       Lynh;
        //   320: iload           19
        //   322: putfield        ynh.i:Z
        //   325: iload_2        
        //   326: aload_3        
        //   327: checkcast       Lynh;
        //   330: getfield        ynh.b:Ljava/util/concurrent/atomic/AtomicInteger;
        //   333: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   336: if_icmpne       451
        //   339: aload_3        
        //   340: checkcast       Lynh;
        //   343: getfield        ynh.h:Lafcr;
        //   346: astore          14
        //   348: aload_3        
        //   349: checkcast       Lynh;
        //   352: getfield        ynh.k:Z
        //   355: ifne            376
        //   358: aload           14
        //   360: invokestatic    ymt.g:(Ljava/util/List;)Z
        //   363: ifeq            451
        //   366: aload_3        
        //   367: checkcast       Lynh;
        //   370: getfield        ynh.j:Z
        //   373: ifne            451
        //   376: aload_3        
        //   377: checkcast       Lynh;
        //   380: getfield        ynh.n:Lafts;
        //   383: astore          7
        //   385: aload           7
        //   387: ifnonnull       393
        //   390: goto            451
        //   393: new             Lwqx;
        //   396: astore          5
        //   398: aload           5
        //   400: aload_3        
        //   401: checkcast       Lynh;
        //   404: iload_2        
        //   405: aload           14
        //   407: iconst_3       
        //   408: invokespecial   wqx.<init>:(Lynh;ILafcr;I)V
        //   411: aload           7
        //   413: aload           5
        //   415: lconst_0       
        //   416: aload_3        
        //   417: checkcast       Lynh;
        //   420: getfield        ynh.d:Lynx;
        //   423: aload_3        
        //   424: checkcast       Lynh;
        //   427: getfield        ynh.o:Lwvu;
        //   430: ldc             "Failed to fetch License Response."
        //   432: invokestatic    xyl.e:(Lafts;Ljava/lang/Runnable;JLynx;Lwvu;Ljava/lang/String;)V
        //   435: aload           14
        //   437: invokestatic    ymt.g:(Ljava/util/List;)Z
        //   440: ifeq            451
        //   443: aload_3        
        //   444: checkcast       Lynh;
        //   447: iconst_1       
        //   448: putfield        ynh.j:Z
        //   451: aload           9
        //   453: getfield        ync.a:Lakld;
        //   456: getfield        akld.f:Lagyc;
        //   459: invokevirtual   agyc.I:()[B
        //   462: astore          14
        //   464: goto            948
        //   467: new             Lynf;
        //   470: astore          14
        //   472: aload           14
        //   474: aload           9
        //   476: invokespecial   ynf.<init>:(Lyng;)V
        //   479: aload           14
        //   481: athrow         
        //   482: astore          9
        //   484: new             Lynf;
        //   487: astore          14
        //   489: aload           14
        //   491: aload           9
        //   493: iconst_0       
        //   494: invokespecial   ynf.<init>:(Ljava/lang/Throwable;Z)V
        //   497: aload           14
        //   499: athrow         
        //   500: astore          14
        //   502: new             Lbbn;
        //   505: astore          9
        //   507: aload           9
        //   509: invokespecial   bbn.<init>:()V
        //   512: aload           9
        //   514: aload           4
        //   516: getfield        eaa.a:Ljava/lang/Object;
        //   519: checkcast       Ljava/lang/String;
        //   522: invokevirtual   bbn.b:(Ljava/lang/String;)V
        //   525: aload           9
        //   527: aload           4
        //   529: getfield        eaa.b:Ljava/lang/Object;
        //   532: checkcast       [B
        //   535: putfield        bbn.d:[B
        //   538: aload           9
        //   540: invokevirtual   bbn.a:()Lbbo;
        //   543: astore          9
        //   545: new             Lblj;
        //   548: astore          4
        //   550: aload           4
        //   552: aload           9
        //   554: lconst_0       
        //   555: aload           14
        //   557: invokespecial   blj.<init>:(Lbbo;JLjava/lang/Throwable;)V
        //   560: aload           4
        //   562: athrow         
        //   563: new             Ljava/lang/RuntimeException;
        //   566: astore          14
        //   568: aload           14
        //   570: invokespecial   java/lang/RuntimeException.<init>:()V
        //   573: aload           14
        //   575: athrow         
        //   576: aload_0        
        //   577: getfield        lxl.a:Llxn;
        //   580: getfield        lxn.g:Lbli;
        //   583: astore_3       
        //   584: aload_1        
        //   585: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   588: checkcast       Leaa;
        //   591: astore          9
        //   593: aload           9
        //   595: getfield        eaa.a:Ljava/lang/Object;
        //   598: checkcast       Ljava/lang/String;
        //   601: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   604: astore          5
        //   606: aload_3        
        //   607: checkcast       Lynh;
        //   610: getfield        ynh.q:Labjm;
        //   613: astore          14
        //   615: aload           9
        //   617: getfield        eaa.b:Ljava/lang/Object;
        //   620: astore          4
        //   622: aload_3        
        //   623: checkcast       Lynh;
        //   626: getfield        ynh.c:Ljava/lang/String;
        //   629: astore_3       
        //   630: invokestatic    szc.e:()V
        //   633: aload           5
        //   635: invokestatic    tte.b:(Landroid/net/Uri;)Ltte;
        //   638: astore          7
        //   640: new             Ljava/lang/String;
        //   643: astore          5
        //   645: aload           5
        //   647: aload           4
        //   649: checkcast       [B
        //   652: invokespecial   java/lang/String.<init>:([B)V
        //   655: aload           7
        //   657: ldc_w           "signedRequest"
        //   660: aload           5
        //   662: invokevirtual   tte.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   665: aload           7
        //   667: ldc_w           "cpn"
        //   670: aload_3        
        //   671: invokevirtual   tte.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   674: aload           14
        //   676: getfield        abjm.d:Ljava/lang/Object;
        //   679: checkcast       Lzgv;
        //   682: aload           7
        //   684: invokevirtual   zgv.d:(Ltte;)V
        //   687: aload           7
        //   689: invokevirtual   tte.a:()Landroid/net/Uri;
        //   692: astore          4
        //   694: invokestatic    zni.d:()Lzni;
        //   697: astore_3       
        //   698: aload           14
        //   700: getfield        abjm.b:Ltgw;
        //   703: astore          5
        //   705: new             Lyne;
        //   708: astore          14
        //   710: aload           14
        //   712: aload           4
        //   714: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   717: aload_3        
        //   718: invokespecial   yne.<init>:(Ljava/lang/String;Lznj;)V
        //   721: aload           5
        //   723: aload           14
        //   725: invokeinterface tgw.a:(Ltjr;)Ltjr;
        //   730: pop            
        //   731: aload_3        
        //   732: invokevirtual   afrl.get:()Ljava/lang/Object;
        //   735: checkcast       [B
        //   738: astore          14
        //   740: goto            948
        //   743: astore          14
        //   745: new             Lynf;
        //   748: astore          4
        //   750: aload           4
        //   752: aload           14
        //   754: invokevirtual   java/util/concurrent/ExecutionException.getCause:()Ljava/lang/Throwable;
        //   757: iconst_1       
        //   758: invokespecial   ynf.<init>:(Ljava/lang/Throwable;Z)V
        //   761: aload           4
        //   763: athrow         
        //   764: astore          14
        //   766: new             Lynf;
        //   769: astore          4
        //   771: aload           4
        //   773: aload           14
        //   775: iconst_1       
        //   776: invokespecial   ynf.<init>:(Ljava/lang/Throwable;Z)V
        //   779: aload           4
        //   781: athrow         
        //   782: astore          14
        //   784: new             Lbbn;
        //   787: astore          4
        //   789: aload           4
        //   791: invokespecial   bbn.<init>:()V
        //   794: aload           4
        //   796: aload           9
        //   798: getfield        eaa.a:Ljava/lang/Object;
        //   801: checkcast       Ljava/lang/String;
        //   804: invokevirtual   bbn.b:(Ljava/lang/String;)V
        //   807: aload           4
        //   809: aload           9
        //   811: getfield        eaa.b:Ljava/lang/Object;
        //   814: checkcast       [B
        //   817: putfield        bbn.d:[B
        //   820: aload           4
        //   822: invokevirtual   bbn.a:()Lbbo;
        //   825: astore          9
        //   827: new             Lblj;
        //   830: astore          4
        //   832: aload           4
        //   834: aload           9
        //   836: lconst_0       
        //   837: aload           14
        //   839: invokespecial   blj.<init>:(Lbbo;JLjava/lang/Throwable;)V
        //   842: aload           4
        //   844: athrow         
        //   845: astore          9
        //   847: aload           9
        //   849: astore          14
        //   851: aload_1        
        //   852: getfield        android/os/Message.arg1:I
        //   855: iconst_1       
        //   856: if_icmpne       948
        //   859: aload_1        
        //   860: getfield        android/os/Message.arg2:I
        //   863: iconst_1       
        //   864: iadd           
        //   865: istore_2       
        //   866: aload_0        
        //   867: getfield        lxl.a:Llxn;
        //   870: getfield        lxn.m:I
        //   873: iflt            902
        //   876: aload_1        
        //   877: getfield        android/os/Message.what:I
        //   880: iconst_1       
        //   881: if_icmpne       902
        //   884: iload_2        
        //   885: aload_0        
        //   886: getfield        lxl.a:Llxn;
        //   889: getfield        lxn.m:I
        //   892: if_icmple       902
        //   895: aload           9
        //   897: astore          14
        //   899: goto            948
        //   902: aload           9
        //   904: astore          14
        //   906: iload_2        
        //   907: aload_0        
        //   908: getfield        lxl.a:Llxn;
        //   911: getfield        lxn.e:I
        //   914: if_icmpgt       948
        //   917: aload_1        
        //   918: invokestatic    android/os/Message.obtain:(Landroid/os/Message;)Landroid/os/Message;
        //   921: astore_1       
        //   922: aload_1        
        //   923: iload_2        
        //   924: putfield        android/os/Message.arg2:I
        //   927: aload_0        
        //   928: aload_1        
        //   929: iload_2        
        //   930: iconst_1       
        //   931: isub           
        //   932: sipush          1000
        //   935: imul           
        //   936: sipush          5000
        //   939: invokestatic    java/lang/Math.min:(II)I
        //   942: i2l            
        //   943: invokevirtual   lxl.sendMessageDelayed:(Landroid/os/Message;J)Z
        //   946: pop            
        //   947: return         
        //   948: aload_0        
        //   949: getfield        lxl.a:Llxn;
        //   952: getfield        lxn.i:Llxm;
        //   955: aload_1        
        //   956: getfield        android/os/Message.what:I
        //   959: aload_1        
        //   960: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   963: aload           14
        //   965: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   968: invokevirtual   lxm.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
        //   971: invokevirtual   android/os/Message.sendToTarget:()V
        //   974: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      5      845    948    Ljava/lang/Exception;
        //  14     31     845    948    Ljava/lang/Exception;
        //  31     155    500    563    Lynf;
        //  31     155    845    948    Ljava/lang/Exception;
        //  159    180    500    563    Lynf;
        //  159    180    845    948    Ljava/lang/Exception;
        //  180    285    482    500    Lvkn;
        //  180    285    500    563    Lynf;
        //  180    285    845    948    Ljava/lang/Exception;
        //  290    376    500    563    Lynf;
        //  290    376    845    948    Ljava/lang/Exception;
        //  376    385    500    563    Lynf;
        //  376    385    845    948    Ljava/lang/Exception;
        //  393    451    500    563    Lynf;
        //  393    451    845    948    Ljava/lang/Exception;
        //  451    464    500    563    Lynf;
        //  451    464    845    948    Ljava/lang/Exception;
        //  467    482    482    500    Lvkn;
        //  467    482    500    563    Lynf;
        //  467    482    845    948    Ljava/lang/Exception;
        //  484    500    500    563    Lynf;
        //  484    500    845    948    Ljava/lang/Exception;
        //  502    563    845    948    Ljava/lang/Exception;
        //  563    576    845    948    Ljava/lang/Exception;
        //  576    593    845    948    Ljava/lang/Exception;
        //  593    731    782    845    Lynf;
        //  593    731    845    948    Ljava/lang/Exception;
        //  731    740    764    782    Ljava/lang/InterruptedException;
        //  731    740    743    764    Ljava/util/concurrent/ExecutionException;
        //  731    740    782    845    Lynf;
        //  731    740    845    948    Ljava/lang/Exception;
        //  745    764    782    845    Lynf;
        //  745    764    845    948    Ljava/lang/Exception;
        //  766    782    782    845    Lynf;
        //  766    782    845    948    Ljava/lang/Exception;
        //  784    845    845    948    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 440, Size: 440
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
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
}
