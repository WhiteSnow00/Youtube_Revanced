import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class bon implements bro, bnp
{
    public final long a;
    public final bco b;
    public long c;
    public bbr d;
    public bug e;
    public boolean f;
    final bor g;
    private final Uri h;
    private final bom i;
    private final btp j;
    private volatile boolean k;
    private boolean l;
    private final gpo m;
    private final pbg n;
    
    public bon(final bor g, final Uri h, final bbn bbn, final bom i, final btp j, final gpo m, final byte[] array) {
        this.g = g;
        this.h = h;
        this.b = new bco(bbn);
        this.i = i;
        this.j = j;
        this.m = m;
        this.n = new pbg((byte[])null, (byte[])null, (byte[])null);
        this.l = true;
        this.a = bnr.a();
        this.d = this.d(0L);
    }
    
    private final bbr d(final long f) {
        final bbq bbq = new bbq();
        bbq.a = this.h;
        bbq.f = f;
        bbq.h = null;
        bbq.i = 6;
        bbq.e = bor.a;
        return bbq.a();
    }
    
    @Override
    public final void a() {
        this.k = true;
    }
    
    @Override
    public final void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        bon.k:Z
        //     4: ifne            1092
        //     7: aload_0        
        //     8: getfield        bon.n:Lpbg;
        //    11: getfield        pbg.a:J
        //    14: lstore          7
        //    16: aload_0        
        //    17: lload           7
        //    19: invokespecial   bon.d:(J)Lbbr;
        //    22: astore          11
        //    24: aload_0        
        //    25: aload           11
        //    27: putfield        bon.d:Lbbr;
        //    30: aload_0        
        //    31: getfield        bon.b:Lbco;
        //    34: aload           11
        //    36: invokevirtual   bco.b:(Lbbr;)J
        //    39: lstore          9
        //    41: lload           9
        //    43: lstore          5
        //    45: lload           9
        //    47: ldc2_w          -1
        //    50: lcmp           
        //    51: ifeq            96
        //    54: lload           9
        //    56: lload           7
        //    58: ladd           
        //    59: lstore          5
        //    61: aload_0        
        //    62: getfield        bon.g:Lbor;
        //    65: astore          13
        //    67: aload           13
        //    69: getfield        bor.h:Landroid/os/Handler;
        //    72: astore          12
        //    74: new             Lasa;
        //    77: astore          11
        //    79: aload           11
        //    81: aload           13
        //    83: bipush          15
        //    85: invokespecial   asa.<init>:(Lbor;I)V
        //    88: aload           12
        //    90: aload           11
        //    92: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    95: pop            
        //    96: aload_0        
        //    97: getfield        bon.g:Lbor;
        //   100: astore          15
        //   102: aload_0        
        //   103: getfield        bon.b:Lbco;
        //   106: invokevirtual   bco.d:()Ljava/util/Map;
        //   109: astore          16
        //   111: aload           16
        //   113: ldc             "icy-br"
        //   115: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   120: checkcast       Ljava/util/List;
        //   123: astore          11
        //   125: aload           11
        //   127: ifnull          231
        //   130: aload           11
        //   132: iconst_0       
        //   133: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   138: checkcast       Ljava/lang/String;
        //   141: astore          11
        //   143: aload           11
        //   145: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   148: istore_1       
        //   149: iload_1        
        //   150: sipush          1000
        //   153: imul           
        //   154: istore_1       
        //   155: iload_1        
        //   156: ifle            166
        //   159: iload_1        
        //   160: istore_2       
        //   161: iconst_1       
        //   162: istore_1       
        //   163: goto            235
        //   166: new             Ljava/lang/StringBuilder;
        //   169: astore          12
        //   171: aload           12
        //   173: invokespecial   java/lang/StringBuilder.<init>:()V
        //   176: aload           12
        //   178: ldc             "Invalid bitrate: "
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: pop            
        //   184: aload           12
        //   186: aload           11
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: pop            
        //   192: ldc             "IcyHeaders"
        //   194: aload           12
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: invokestatic    baq.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   202: goto            231
        //   205: astore          12
        //   207: iconst_m1      
        //   208: istore_1       
        //   209: ldc             "IcyHeaders"
        //   211: ldc             "Invalid bitrate header: "
        //   213: aload           11
        //   215: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   218: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   221: invokestatic    baq.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   224: iload_1        
        //   225: istore_2       
        //   226: iconst_0       
        //   227: istore_1       
        //   228: goto            235
        //   231: iconst_0       
        //   232: istore_1       
        //   233: iconst_m1      
        //   234: istore_2       
        //   235: aload           16
        //   237: ldc             "icy-genre"
        //   239: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   244: checkcast       Ljava/util/List;
        //   247: astore          11
        //   249: aconst_null    
        //   250: astore          14
        //   252: aload           11
        //   254: ifnull          275
        //   257: aload           11
        //   259: iconst_0       
        //   260: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   265: checkcast       Ljava/lang/String;
        //   268: astore          11
        //   270: iconst_1       
        //   271: istore_1       
        //   272: goto            278
        //   275: aconst_null    
        //   276: astore          11
        //   278: aload           16
        //   280: ldc             "icy-name"
        //   282: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   287: checkcast       Ljava/util/List;
        //   290: astore          12
        //   292: aload           12
        //   294: ifnull          315
        //   297: aload           12
        //   299: iconst_0       
        //   300: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   305: checkcast       Ljava/lang/String;
        //   308: astore          12
        //   310: iconst_1       
        //   311: istore_1       
        //   312: goto            318
        //   315: aconst_null    
        //   316: astore          12
        //   318: aload           16
        //   320: ldc             "icy-url"
        //   322: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   327: checkcast       Ljava/util/List;
        //   330: astore          13
        //   332: aload           13
        //   334: ifnull          355
        //   337: aload           13
        //   339: iconst_0       
        //   340: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   345: checkcast       Ljava/lang/String;
        //   348: astore          13
        //   350: iconst_1       
        //   351: istore_1       
        //   352: goto            358
        //   355: aconst_null    
        //   356: astore          13
        //   358: aload           16
        //   360: ldc             "icy-pub"
        //   362: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   367: checkcast       Ljava/util/List;
        //   370: astore          17
        //   372: aload           17
        //   374: ifnull          400
        //   377: aload           17
        //   379: iconst_0       
        //   380: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   385: checkcast       Ljava/lang/String;
        //   388: ldc             "1"
        //   390: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   393: istore          4
        //   395: iconst_1       
        //   396: istore_1       
        //   397: goto            403
        //   400: iconst_0       
        //   401: istore          4
        //   403: aload           16
        //   405: ldc             "icy-metaint"
        //   407: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   412: checkcast       Ljava/util/List;
        //   415: astore          16
        //   417: aload           16
        //   419: ifnull          511
        //   422: aload           16
        //   424: iconst_0       
        //   425: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   430: checkcast       Ljava/lang/String;
        //   433: astore          16
        //   435: aload           16
        //   437: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   440: istore_3       
        //   441: iload_3        
        //   442: ifle            450
        //   445: iconst_1       
        //   446: istore_1       
        //   447: goto            513
        //   450: new             Ljava/lang/StringBuilder;
        //   453: astore          17
        //   455: aload           17
        //   457: invokespecial   java/lang/StringBuilder.<init>:()V
        //   460: aload           17
        //   462: ldc             "Invalid metadata interval: "
        //   464: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   467: pop            
        //   468: aload           17
        //   470: aload           16
        //   472: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   475: pop            
        //   476: ldc             "IcyHeaders"
        //   478: aload           17
        //   480: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   483: invokestatic    baq.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   486: goto            511
        //   489: astore          17
        //   491: iconst_m1      
        //   492: istore_3       
        //   493: ldc             "IcyHeaders"
        //   495: ldc             "Invalid metadata interval: "
        //   497: aload           16
        //   499: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   502: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   505: invokestatic    baq.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   508: goto            513
        //   511: iconst_m1      
        //   512: istore_3       
        //   513: iload_1        
        //   514: ifeq            537
        //   517: new             Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   520: astore          14
        //   522: aload           14
        //   524: iload_2        
        //   525: aload           11
        //   527: aload           12
        //   529: aload           13
        //   531: iload           4
        //   533: iload_3        
        //   534: invokespecial   androidx/media3/extractor/metadata/icy/IcyHeaders.<init>:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
        //   537: aload           15
        //   539: aload           14
        //   541: putfield        bor.j:Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   544: aload_0        
        //   545: getfield        bon.b:Lbco;
        //   548: astore          12
        //   550: aload_0        
        //   551: getfield        bon.g:Lbor;
        //   554: getfield        bor.j:Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   557: astore          11
        //   559: aload           11
        //   561: ifnull          635
        //   564: aload           11
        //   566: getfield        androidx/media3/extractor/metadata/icy/IcyHeaders.f:I
        //   569: istore_1       
        //   570: iload_1        
        //   571: iconst_m1      
        //   572: if_icmpeq       635
        //   575: new             Lbnq;
        //   578: astore          11
        //   580: aload           11
        //   582: aload           12
        //   584: iload_1        
        //   585: aload_0        
        //   586: invokespecial   bnq.<init>:(Lbbn;ILbnp;)V
        //   589: aload_0        
        //   590: getfield        bon.g:Lbor;
        //   593: astore          13
        //   595: new             Lboq;
        //   598: astore          12
        //   600: aload           12
        //   602: iconst_0       
        //   603: iconst_1       
        //   604: invokespecial   boq.<init>:(IZ)V
        //   607: aload           13
        //   609: aload           12
        //   611: invokevirtual   bor.p:(Lboq;)Lbug;
        //   614: astore          12
        //   616: aload_0        
        //   617: aload           12
        //   619: putfield        bon.e:Lbug;
        //   622: aload           12
        //   624: getstatic       bor.b:Layh;
        //   627: invokeinterface bug.b:(Layh;)V
        //   632: goto            639
        //   635: aload           12
        //   637: astore          11
        //   639: aload_0        
        //   640: getfield        bon.i:Lbom;
        //   643: aload           11
        //   645: aload_0        
        //   646: getfield        bon.h:Landroid/net/Uri;
        //   649: aload_0        
        //   650: getfield        bon.b:Lbco;
        //   653: invokevirtual   bco.d:()Ljava/util/Map;
        //   656: lload           7
        //   658: lload           5
        //   660: aload_0        
        //   661: getfield        bon.j:Lbtp;
        //   664: invokeinterface bom.b:(Layc;Landroid/net/Uri;Ljava/util/Map;JJLbtp;)V
        //   669: aload_0        
        //   670: getfield        bon.g:Lbor;
        //   673: getfield        bor.j:Landroidx/media3/extractor/metadata/icy/IcyHeaders;
        //   676: ifnull          708
        //   679: aload_0        
        //   680: getfield        bon.i:Lbom;
        //   683: checkcast       Lbmx;
        //   686: getfield        bmx.a:Lbtm;
        //   689: astore          11
        //   691: aload           11
        //   693: instanceof      Lbvy;
        //   696: ifeq            708
        //   699: aload           11
        //   701: checkcast       Lbvy;
        //   704: iconst_1       
        //   705: putfield        bvy.a:Z
        //   708: aload_0        
        //   709: getfield        bon.l:Z
        //   712: ifeq            767
        //   715: aload_0        
        //   716: getfield        bon.i:Lbom;
        //   719: astore          11
        //   721: aload_0        
        //   722: getfield        bon.c:J
        //   725: lstore          5
        //   727: aload           11
        //   729: checkcast       Lbmx;
        //   732: getfield        bmx.a:Lbtm;
        //   735: astore          11
        //   737: aload           11
        //   739: invokestatic    bad.b:(Ljava/lang/Object;)Ljava/lang/Object;
        //   742: pop            
        //   743: aload           11
        //   745: lload           7
        //   747: lload           5
        //   749: invokeinterface btm.f:(JJ)V
        //   754: aload_0        
        //   755: iconst_0       
        //   756: putfield        bon.l:Z
        //   759: goto            767
        //   762: astore          11
        //   764: goto            1041
        //   767: lload           7
        //   769: lstore          5
        //   771: iconst_0       
        //   772: istore_1       
        //   773: iload_1        
        //   774: istore_2       
        //   775: iload_1        
        //   776: ifne            979
        //   779: iload_1        
        //   780: istore_2       
        //   781: aload_0        
        //   782: getfield        bon.k:Z
        //   785: istore          4
        //   787: iload           4
        //   789: ifne            967
        //   792: iload_1        
        //   793: istore_2       
        //   794: aload_0        
        //   795: getfield        bon.m:Lgpo;
        //   798: invokevirtual   gpo.a:()V
        //   801: iload_1        
        //   802: istore_2       
        //   803: aload_0        
        //   804: getfield        bon.i:Lbom;
        //   807: astore          13
        //   809: iload_1        
        //   810: istore_2       
        //   811: aload_0        
        //   812: getfield        bon.n:Lpbg;
        //   815: astore          11
        //   817: iload_1        
        //   818: istore_2       
        //   819: aload           13
        //   821: checkcast       Lbmx;
        //   824: getfield        bmx.a:Lbtm;
        //   827: astore          12
        //   829: iload_1        
        //   830: istore_2       
        //   831: aload           12
        //   833: invokestatic    bad.b:(Ljava/lang/Object;)Ljava/lang/Object;
        //   836: pop            
        //   837: iload_1        
        //   838: istore_2       
        //   839: aload           13
        //   841: checkcast       Lbmx;
        //   844: getfield        bmx.b:Lbtn;
        //   847: astore          13
        //   849: iload_1        
        //   850: istore_2       
        //   851: aload           13
        //   853: invokestatic    bad.b:(Ljava/lang/Object;)Ljava/lang/Object;
        //   856: pop            
        //   857: iload_1        
        //   858: istore_2       
        //   859: aload           12
        //   861: aload           13
        //   863: aload           11
        //   865: invokeinterface btm.h:(Lbtn;Lpbg;)I
        //   870: istore_3       
        //   871: iload_3        
        //   872: istore_2       
        //   873: aload_0        
        //   874: getfield        bon.i:Lbom;
        //   877: invokeinterface bom.a:()J
        //   882: lstore          7
        //   884: iload_3        
        //   885: istore_1       
        //   886: iload_3        
        //   887: istore_2       
        //   888: lload           7
        //   890: aload_0        
        //   891: getfield        bon.g:Lbor;
        //   894: getfield        bor.d:J
        //   897: lload           5
        //   899: ladd           
        //   900: lcmp           
        //   901: ifle            773
        //   904: iload_3        
        //   905: istore_2       
        //   906: aload_0        
        //   907: getfield        bon.m:Lgpo;
        //   910: invokevirtual   gpo.f:()V
        //   913: iload_3        
        //   914: istore_2       
        //   915: aload_0        
        //   916: getfield        bon.g:Lbor;
        //   919: astore          11
        //   921: iload_3        
        //   922: istore_2       
        //   923: aload           11
        //   925: getfield        bor.h:Landroid/os/Handler;
        //   928: aload           11
        //   930: getfield        bor.g:Ljava/lang/Runnable;
        //   933: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   936: pop            
        //   937: lload           7
        //   939: lstore          5
        //   941: iload_3        
        //   942: istore_1       
        //   943: goto            773
        //   946: astore          11
        //   948: iload_1        
        //   949: istore_2       
        //   950: new             Ljava/io/InterruptedIOException;
        //   953: astore          11
        //   955: iload_1        
        //   956: istore_2       
        //   957: aload           11
        //   959: invokespecial   java/io/InterruptedIOException.<init>:()V
        //   962: iload_1        
        //   963: istore_2       
        //   964: aload           11
        //   966: athrow         
        //   967: iconst_0       
        //   968: istore_2       
        //   969: goto            979
        //   972: astore          11
        //   974: iload_2        
        //   975: istore_1       
        //   976: goto            1043
        //   979: iload_2        
        //   980: iconst_1       
        //   981: if_icmpne       989
        //   984: iconst_0       
        //   985: istore_1       
        //   986: goto            1025
        //   989: aload_0        
        //   990: getfield        bon.i:Lbom;
        //   993: astore          11
        //   995: aload           11
        //   997: invokeinterface bom.a:()J
        //  1002: ldc2_w          -1
        //  1005: lcmp           
        //  1006: ifeq            1023
        //  1009: aload_0        
        //  1010: getfield        bon.n:Lpbg;
        //  1013: aload           11
        //  1015: invokeinterface bom.a:()J
        //  1020: putfield        pbg.a:J
        //  1023: iload_2        
        //  1024: istore_1       
        //  1025: aload_0        
        //  1026: getfield        bon.b:Lbco;
        //  1029: invokestatic    bbz.b:(Lbbn;)V
        //  1032: iload_1        
        //  1033: ifeq            0
        //  1036: goto            1092
        //  1039: astore          11
        //  1041: iconst_0       
        //  1042: istore_1       
        //  1043: iload_1        
        //  1044: iconst_1       
        //  1045: if_icmpeq       1082
        //  1048: aload_0        
        //  1049: getfield        bon.i:Lbom;
        //  1052: astore          12
        //  1054: aload           12
        //  1056: invokeinterface bom.a:()J
        //  1061: ldc2_w          -1
        //  1064: lcmp           
        //  1065: ifeq            1082
        //  1068: aload_0        
        //  1069: getfield        bon.n:Lpbg;
        //  1072: aload           12
        //  1074: invokeinterface bom.a:()J
        //  1079: putfield        pbg.a:J
        //  1082: aload_0        
        //  1083: getfield        bon.b:Lbco;
        //  1086: invokestatic    bbz.b:(Lbbn;)V
        //  1089: aload           11
        //  1091: athrow         
        //  1092: return         
        //  1093: astore          12
        //  1095: goto            209
        //  1098: astore          17
        //  1100: goto            493
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      41     1039   1041   Any
        //  61     96     1039   1041   Any
        //  96     125    1039   1041   Any
        //  130    143    1039   1041   Any
        //  143    149    205    209    Ljava/lang/NumberFormatException;
        //  143    149    1039   1041   Any
        //  166    202    1093   1098   Ljava/lang/NumberFormatException;
        //  166    202    1039   1041   Any
        //  209    224    1039   1041   Any
        //  235    249    1039   1041   Any
        //  257    270    1039   1041   Any
        //  278    292    1039   1041   Any
        //  297    310    1039   1041   Any
        //  318    332    1039   1041   Any
        //  337    350    1039   1041   Any
        //  358    372    1039   1041   Any
        //  377    395    1039   1041   Any
        //  403    417    1039   1041   Any
        //  422    435    1039   1041   Any
        //  435    441    489    493    Ljava/lang/NumberFormatException;
        //  435    441    1039   1041   Any
        //  450    486    1098   1103   Ljava/lang/NumberFormatException;
        //  450    486    1039   1041   Any
        //  493    508    1039   1041   Any
        //  517    537    1039   1041   Any
        //  537    559    1039   1041   Any
        //  564    570    1039   1041   Any
        //  575    632    1039   1041   Any
        //  639    708    1039   1041   Any
        //  708    754    1039   1041   Any
        //  754    759    762    767    Any
        //  781    787    972    979    Any
        //  794    801    946    967    Ljava/lang/InterruptedException;
        //  794    801    972    979    Any
        //  803    809    972    979    Any
        //  811    817    972    979    Any
        //  819    829    972    979    Any
        //  831    837    972    979    Any
        //  839    849    972    979    Any
        //  851    857    972    979    Any
        //  859    871    972    979    Any
        //  873    884    972    979    Any
        //  888    904    972    979    Any
        //  906    913    972    979    Any
        //  915    921    972    979    Any
        //  923    937    972    979    Any
        //  950    955    972    979    Any
        //  957    962    972    979    Any
        //  964    967    972    979    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 524, Size: 524
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
