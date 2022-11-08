import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class boj implements brk, bnl
{
    public final long a;
    public final bcl b;
    public long c;
    public bbo d;
    public buc e;
    public boolean f;
    final /* synthetic */ bon g;
    private final Uri h;
    private final boi i;
    private final btl j;
    private volatile boolean k;
    private boolean l;
    private final gpd m;
    private final ozg n;
    
    public boj(final bon g, final Uri h, final bbk bbk, final boi i, final btl j, final gpd m, final byte[] array) {
        this.g = g;
        this.h = h;
        this.b = new bcl(bbk);
        this.i = i;
        this.j = j;
        this.m = m;
        this.n = new ozg(null, null, null);
        this.l = true;
        this.a = bnn.a();
        this.d = this.d(0L);
    }
    
    private final bbo d(final long f) {
        final bbn bbn = new bbn();
        bbn.a = this.h;
        bbn.f = f;
        bbn.h = null;
        bbn.i = 6;
        bbn.e = bon.a;
        return bbn.a();
    }
    
    public final void a() {
        this.k = true;
    }
    
    public final void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        boj.k:Z
        //     4: ifne            1114
        //     7: aload_0        
        //     8: getfield        boj.n:Lozg;
        //    11: getfield        ozg.a:J
        //    14: lstore_1       
        //    15: aload_0        
        //    16: lload_1        
        //    17: invokespecial   boj.d:(J)Lbbo;
        //    20: astore_3       
        //    21: aload_0        
        //    22: aload_3        
        //    23: putfield        boj.d:Lbbo;
        //    26: aload_0        
        //    27: getfield        boj.b:Lbcl;
        //    30: aload_3        
        //    31: invokevirtual   bcl.b:(Lbbo;)J
        //    34: lstore          4
        //    36: lload           4
        //    38: lstore          6
        //    40: lload           4
        //    42: ldc2_w          -1
        //    45: lcmp           
        //    46: ifeq            87
        //    49: lload           4
        //    51: lload_1        
        //    52: ladd           
        //    53: lstore          6
        //    55: aload_0        
        //    56: getfield        boj.g:Lbon;
        //    59: astore_3       
        //    60: aload_3        
        //    61: getfield        bon.h:Landroid/os/Handler;
        //    64: astore          8
        //    66: new             Laur;
        //    69: astore          9
        //    71: aload           9
        //    73: aload_3        
        //    74: bipush          14
        //    76: invokespecial   aur.<init>:(Lbon;I)V
        //    79: aload           8
        //    81: aload           9
        //    83: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    86: pop            
        //    87: aload_0        
        //    88: getfield        boj.g:Lbon;
        //    91: astore          10
        //    93: aload_0        
        //    94: getfield        boj.b:Lbcl;
        //    97: invokevirtual   bcl.d:()Ljava/util/Map;
        //   100: astore          11
        //   102: aload           11
        //   104: ldc             "icy-br"
        //   106: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   111: checkcast       Ljava/util/List;
        //   114: astore_3       
        //   115: aload_3        
        //   116: ifnull          232
        //   119: aload_3        
        //   120: iconst_0       
        //   121: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   126: checkcast       Ljava/lang/String;
        //   129: astore_3       
        //   130: aload_3        
        //   131: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   134: istore          12
        //   136: iload           12
        //   138: sipush          1000
        //   141: imul           
        //   142: istore          13
        //   144: iload           13
        //   146: ifle            155
        //   149: iconst_1       
        //   150: istore          12
        //   152: goto            196
        //   155: new             Ljava/lang/StringBuilder;
        //   158: astore          9
        //   160: aload           9
        //   162: invokespecial   java/lang/StringBuilder.<init>:()V
        //   165: aload           9
        //   167: ldc             "Invalid bitrate: "
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: pop            
        //   173: aload           9
        //   175: aload_3        
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: pop            
        //   180: ldc             "IcyHeaders"
        //   182: aload           9
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   190: iconst_0       
        //   191: istore          12
        //   193: iconst_m1      
        //   194: istore          13
        //   196: iload           13
        //   198: istore          14
        //   200: goto            238
        //   203: astore          9
        //   205: iconst_m1      
        //   206: istore          12
        //   208: ldc             "IcyHeaders"
        //   210: ldc             "Invalid bitrate header: "
        //   212: aload_3        
        //   213: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   216: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   219: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   222: iload           12
        //   224: istore          14
        //   226: iconst_0       
        //   227: istore          12
        //   229: goto            238
        //   232: iconst_0       
        //   233: istore          12
        //   235: iconst_m1      
        //   236: istore          14
        //   238: aload           11
        //   240: ldc             "icy-genre"
        //   242: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   247: checkcast       Ljava/util/List;
        //   250: astore_3       
        //   251: aconst_null    
        //   252: astore          15
        //   254: aload_3        
        //   255: ifnull          275
        //   258: aload_3        
        //   259: iconst_0       
        //   260: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   265: checkcast       Ljava/lang/String;
        //   268: astore_3       
        //   269: iconst_1       
        //   270: istore          12
        //   272: goto            277
        //   275: aconst_null    
        //   276: astore_3       
        //   277: aload           11
        //   279: ldc             "icy-name"
        //   281: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   286: checkcast       Ljava/util/List;
        //   289: astore          9
        //   291: aload           9
        //   293: ifnull          315
        //   296: aload           9
        //   298: iconst_0       
        //   299: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   304: checkcast       Ljava/lang/String;
        //   307: astore          9
        //   309: iconst_1       
        //   310: istore          12
        //   312: goto            318
        //   315: aconst_null    
        //   316: astore          9
        //   318: aload           11
        //   320: ldc             "icy-url"
        //   322: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   327: checkcast       Ljava/util/List;
        //   330: astore          8
        //   332: aload           8
        //   334: ifnull          356
        //   337: aload           8
        //   339: iconst_0       
        //   340: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   345: checkcast       Ljava/lang/String;
        //   348: astore          8
        //   350: iconst_1       
        //   351: istore          12
        //   353: goto            359
        //   356: aconst_null    
        //   357: astore          8
        //   359: aload           11
        //   361: ldc             "icy-pub"
        //   363: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   368: checkcast       Ljava/util/List;
        //   371: astore          16
        //   373: aload           16
        //   375: ifnull          402
        //   378: aload           16
        //   380: iconst_0       
        //   381: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   386: checkcast       Ljava/lang/String;
        //   389: ldc             "1"
        //   391: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   394: istore          17
        //   396: iconst_1       
        //   397: istore          12
        //   399: goto            405
        //   402: iconst_0       
        //   403: istore          17
        //   405: aload           11
        //   407: ldc             "icy-metaint"
        //   409: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   414: checkcast       Ljava/util/List;
        //   417: astore          11
        //   419: aload           11
        //   421: ifnull          520
        //   424: aload           11
        //   426: iconst_0       
        //   427: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   432: checkcast       Ljava/lang/String;
        //   435: astore          11
        //   437: aload           11
        //   439: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   442: istore          13
        //   444: iload           13
        //   446: ifle            455
        //   449: iconst_1       
        //   450: istore          12
        //   452: goto            494
        //   455: new             Ljava/lang/StringBuilder;
        //   458: astore          16
        //   460: aload           16
        //   462: invokespecial   java/lang/StringBuilder.<init>:()V
        //   465: aload           16
        //   467: ldc             "Invalid metadata interval: "
        //   469: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   472: pop            
        //   473: aload           16
        //   475: aload           11
        //   477: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   480: pop            
        //   481: ldc             "IcyHeaders"
        //   483: aload           16
        //   485: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   488: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   491: iconst_m1      
        //   492: istore          13
        //   494: goto            523
        //   497: astore          16
        //   499: iconst_m1      
        //   500: istore          13
        //   502: ldc             "IcyHeaders"
        //   504: ldc             "Invalid metadata interval: "
        //   506: aload           11
        //   508: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   511: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   514: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   517: goto            494
        //   520: iconst_m1      
        //   521: istore          13
        //   523: iload           12
        //   525: ifeq            549
        //   528: new             Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   531: astore          15
        //   533: aload           15
        //   535: iload           14
        //   537: aload_3        
        //   538: aload           9
        //   540: aload           8
        //   542: iload           17
        //   544: iload           13
        //   546: invokespecial   androidx/media3/extractor/metadata/icy/IcyHeaders.<init>:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
        //   549: aload           10
        //   551: aload           15
        //   553: putfield        bon.j:Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   556: aload_0        
        //   557: getfield        boj.b:Lbcl;
        //   560: astore          9
        //   562: aload_0        
        //   563: getfield        boj.g:Lbon;
        //   566: getfield        bon.j:Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   569: astore_3       
        //   570: aload_3        
        //   571: ifnull          645
        //   574: aload_3        
        //   575: getfield        androidx/media3/extractor/metadata/icy/IcyHeaders.f:I
        //   578: istore          12
        //   580: iload           12
        //   582: iconst_m1      
        //   583: if_icmpeq       645
        //   586: new             Lbnm;
        //   589: astore_3       
        //   590: aload_3        
        //   591: aload           9
        //   593: iload           12
        //   595: aload_0        
        //   596: invokespecial   bnm.<init>:(Lbbk;ILbnl;)V
        //   599: aload_0        
        //   600: getfield        boj.g:Lbon;
        //   603: astore          9
        //   605: new             Lbom;
        //   608: astore          8
        //   610: aload           8
        //   612: iconst_0       
        //   613: iconst_1       
        //   614: invokespecial   bom.<init>:(IZ)V
        //   617: aload           9
        //   619: aload           8
        //   621: invokevirtual   bon.p:(Lbom;)Lbuc;
        //   624: astore          9
        //   626: aload_0        
        //   627: aload           9
        //   629: putfield        boj.e:Lbuc;
        //   632: aload           9
        //   634: getstatic       bon.b:Layf;
        //   637: invokeinterface buc.b:(Layf;)V
        //   642: goto            648
        //   645: aload           9
        //   647: astore_3       
        //   648: aload_0        
        //   649: getfield        boj.i:Lboi;
        //   652: aload_3        
        //   653: aload_0        
        //   654: getfield        boj.h:Landroid/net/Uri;
        //   657: aload_0        
        //   658: getfield        boj.b:Lbcl;
        //   661: invokevirtual   bcl.d:()Ljava/util/Map;
        //   664: lload_1        
        //   665: lload           6
        //   667: aload_0        
        //   668: getfield        boj.j:Lbtl;
        //   671: invokeinterface boi.b:(Laya;Landroid/net/Uri;Ljava/util/Map;JJLbtl;)V
        //   676: aload_0        
        //   677: getfield        boj.g:Lbon;
        //   680: getfield        bon.j:Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   683: ifnull          712
        //   686: aload_0        
        //   687: getfield        boj.i:Lboi;
        //   690: checkcast       Lbmt;
        //   693: getfield        bmt.a:Lbti;
        //   696: astore_3       
        //   697: aload_3        
        //   698: instanceof      Lbvu;
        //   701: ifeq            712
        //   704: aload_3        
        //   705: checkcast       Lbvu;
        //   708: iconst_1       
        //   709: putfield        bvu.a:Z
        //   712: aload_0        
        //   713: getfield        boj.l:Z
        //   716: ifeq            764
        //   719: aload_0        
        //   720: getfield        boj.i:Lboi;
        //   723: astore_3       
        //   724: aload_0        
        //   725: getfield        boj.c:J
        //   728: lstore          6
        //   730: aload_3        
        //   731: checkcast       Lbmt;
        //   734: getfield        bmt.a:Lbti;
        //   737: astore_3       
        //   738: aload_3        
        //   739: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   742: pop            
        //   743: aload_3        
        //   744: lload_1        
        //   745: lload           6
        //   747: invokeinterface bti.f:(JJ)V
        //   752: aload_0        
        //   753: iconst_0       
        //   754: putfield        boj.l:Z
        //   757: goto            764
        //   760: astore_3       
        //   761: goto            1062
        //   764: lload_1        
        //   765: lstore          6
        //   767: iconst_0       
        //   768: istore          12
        //   770: iload           12
        //   772: istore          13
        //   774: iload           12
        //   776: ifne            1003
        //   779: iload           12
        //   781: istore          13
        //   783: aload_0        
        //   784: getfield        boj.k:Z
        //   787: istore          17
        //   789: iload           17
        //   791: ifne            993
        //   794: iload           12
        //   796: istore          13
        //   798: aload_0        
        //   799: getfield        boj.m:Lgpd;
        //   802: invokevirtual   gpd.a:()V
        //   805: iload           12
        //   807: istore          13
        //   809: aload_0        
        //   810: getfield        boj.i:Lboi;
        //   813: astore          8
        //   815: iload           12
        //   817: istore          13
        //   819: aload_0        
        //   820: getfield        boj.n:Lozg;
        //   823: astore          9
        //   825: iload           12
        //   827: istore          13
        //   829: aload           8
        //   831: checkcast       Lbmt;
        //   834: getfield        bmt.a:Lbti;
        //   837: astore_3       
        //   838: iload           12
        //   840: istore          13
        //   842: aload_3        
        //   843: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   846: pop            
        //   847: iload           12
        //   849: istore          13
        //   851: aload           8
        //   853: checkcast       Lbmt;
        //   856: getfield        bmt.b:Lbtj;
        //   859: astore          8
        //   861: iload           12
        //   863: istore          13
        //   865: aload           8
        //   867: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   870: pop            
        //   871: iload           12
        //   873: istore          13
        //   875: aload_3        
        //   876: aload           8
        //   878: aload           9
        //   880: invokeinterface bti.h:(Lbtj;Lozg;)I
        //   885: istore          14
        //   887: iload           14
        //   889: istore          13
        //   891: aload_0        
        //   892: getfield        boj.i:Lboi;
        //   895: invokeinterface boi.a:()J
        //   900: lstore_1       
        //   901: iload           14
        //   903: istore          12
        //   905: iload           14
        //   907: istore          13
        //   909: lload_1        
        //   910: aload_0        
        //   911: getfield        boj.g:Lbon;
        //   914: getfield        bon.d:J
        //   917: lload           6
        //   919: ladd           
        //   920: lcmp           
        //   921: ifle            770
        //   924: iload           14
        //   926: istore          13
        //   928: aload_0        
        //   929: getfield        boj.m:Lgpd;
        //   932: invokevirtual   gpd.f:()V
        //   935: iload           14
        //   937: istore          13
        //   939: aload_0        
        //   940: getfield        boj.g:Lbon;
        //   943: astore_3       
        //   944: iload           14
        //   946: istore          13
        //   948: aload_3        
        //   949: getfield        bon.h:Landroid/os/Handler;
        //   952: aload_3        
        //   953: getfield        bon.g:Ljava/lang/Runnable;
        //   956: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   959: pop            
        //   960: lload_1        
        //   961: lstore          6
        //   963: iload           14
        //   965: istore          12
        //   967: goto            770
        //   970: astore_3       
        //   971: iload           12
        //   973: istore          13
        //   975: new             Ljava/io/InterruptedIOException;
        //   978: astore_3       
        //   979: iload           12
        //   981: istore          13
        //   983: aload_3        
        //   984: invokespecial   java/io/InterruptedIOException.<init>:()V
        //   987: iload           12
        //   989: istore          13
        //   991: aload_3        
        //   992: athrow         
        //   993: iconst_0       
        //   994: istore          13
        //   996: goto            1003
        //   999: astore_3       
        //  1000: goto            1065
        //  1003: iload           13
        //  1005: iconst_1       
        //  1006: if_icmpne       1015
        //  1009: iconst_0       
        //  1010: istore          13
        //  1012: goto            1046
        //  1015: aload_0        
        //  1016: getfield        boj.i:Lboi;
        //  1019: astore_3       
        //  1020: aload_3        
        //  1021: invokeinterface boi.a:()J
        //  1026: ldc2_w          -1
        //  1029: lcmp           
        //  1030: ifeq            1046
        //  1033: aload_0        
        //  1034: getfield        boj.n:Lozg;
        //  1037: aload_3        
        //  1038: invokeinterface boi.a:()J
        //  1043: putfield        ozg.a:J
        //  1046: aload_0        
        //  1047: getfield        boj.b:Lbcl;
        //  1050: invokestatic    ef.d:(Lbbk;)V
        //  1053: iload           13
        //  1055: ifeq            0
        //  1058: goto            1114
        //  1061: astore_3       
        //  1062: iconst_0       
        //  1063: istore          13
        //  1065: iload           13
        //  1067: iconst_1       
        //  1068: if_icmpeq       1105
        //  1071: aload_0        
        //  1072: getfield        boj.i:Lboi;
        //  1075: astore          9
        //  1077: aload           9
        //  1079: invokeinterface boi.a:()J
        //  1084: ldc2_w          -1
        //  1087: lcmp           
        //  1088: ifeq            1105
        //  1091: aload_0        
        //  1092: getfield        boj.n:Lozg;
        //  1095: aload           9
        //  1097: invokeinterface boi.a:()J
        //  1102: putfield        ozg.a:J
        //  1105: aload_0        
        //  1106: getfield        boj.b:Lbcl;
        //  1109: invokestatic    ef.d:(Lbbk;)V
        //  1112: aload_3        
        //  1113: athrow         
        //  1114: return         
        //  1115: astore          9
        //  1117: iload           13
        //  1119: istore          12
        //  1121: goto            208
        //  1124: astore          16
        //  1126: goto            502
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      36     1061   1062   Any
        //  55     87     1061   1062   Any
        //  87     115    1061   1062   Any
        //  119    130    1061   1062   Any
        //  130    136    203    208    Ljava/lang/NumberFormatException;
        //  130    136    1061   1062   Any
        //  155    190    1115   1124   Ljava/lang/NumberFormatException;
        //  155    190    1061   1062   Any
        //  208    222    1061   1062   Any
        //  238    251    1061   1062   Any
        //  258    269    1061   1062   Any
        //  277    291    1061   1062   Any
        //  296    309    1061   1062   Any
        //  318    332    1061   1062   Any
        //  337    350    1061   1062   Any
        //  359    373    1061   1062   Any
        //  378    396    1061   1062   Any
        //  405    419    1061   1062   Any
        //  424    437    1061   1062   Any
        //  437    444    497    502    Ljava/lang/NumberFormatException;
        //  437    444    1061   1062   Any
        //  455    491    1124   1129   Ljava/lang/NumberFormatException;
        //  455    491    1061   1062   Any
        //  502    517    1061   1062   Any
        //  528    549    1061   1062   Any
        //  549    570    1061   1062   Any
        //  574    580    1061   1062   Any
        //  586    642    1061   1062   Any
        //  648    712    1061   1062   Any
        //  712    752    1061   1062   Any
        //  752    757    760    764    Any
        //  783    789    999    1003   Any
        //  798    805    970    993    Ljava/lang/InterruptedException;
        //  798    805    999    1003   Any
        //  809    815    999    1003   Any
        //  819    825    999    1003   Any
        //  829    838    999    1003   Any
        //  842    847    999    1003   Any
        //  851    861    999    1003   Any
        //  865    871    999    1003   Any
        //  875    887    999    1003   Any
        //  891    901    999    1003   Any
        //  909    924    999    1003   Any
        //  928    935    999    1003   Any
        //  939    944    999    1003   Any
        //  948    960    999    1003   Any
        //  975    979    999    1003   Any
        //  983    987    999    1003   Any
        //  991    993    999    1003   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 528, Size: 528
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
    
    public final void c(final long a, final long c) {
        this.n.a = a;
        this.c = c;
        this.l = true;
        this.f = false;
    }
}
