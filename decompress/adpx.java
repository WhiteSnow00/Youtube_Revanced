import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpx extends adqs
{
    private final alff a;
    private final adnd b;
    private final adrt c;
    private final aheu d;
    
    public adpx(final oco oco, final arzb arzb, final alff a, final aheu d, final adgg adgg, final adnd b, final aheu aheu, final adgg adgg2, final adrt c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(apki.d, oco, arzb, adgg, b, aheu, d, adgg2, null, null, null, null, null);
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final adnq a(final adoj adoj) {
        if (adoj.w && adoj.y) {
            return (adnq)this.c;
        }
        return null;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.C) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String p0, final admj p1, final adoj p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_1       
        //     3: aload_0        
        //     4: getfield        adpx.a:Lalff;
        //     7: getfield        alff.t:Z
        //    10: ifne            81
        //    13: getstatic       adod.a:Ladod;
        //    16: invokevirtual   ahcz.createBuilder:()Lahcr;
        //    19: astore_2       
        //    20: aload_2        
        //    21: invokevirtual   ahcr.copyOnWrite:()V
        //    24: aload_2        
        //    25: getfield        ahcr.instance:Lahcz;
        //    28: checkcast       Ladod;
        //    31: astore_1       
        //    32: aload_1        
        //    33: iconst_0       
        //    34: putfield        adod.c:I
        //    37: aload_1        
        //    38: aload_1        
        //    39: getfield        adod.b:I
        //    42: iconst_1       
        //    43: ior            
        //    44: putfield        adod.b:I
        //    47: aload_2        
        //    48: invokevirtual   ahcr.build:()Lahcz;
        //    51: checkcast       Ladod;
        //    54: astore_1       
        //    55: aload_0        
        //    56: aload_0        
        //    57: getfield        adpx.e:Ladgg;
        //    60: invokevirtual   adgg.n:()Ladog;
        //    63: iconst_1       
        //    64: new             Lacbf;
        //    67: dup            
        //    68: aload_1        
        //    69: bipush          15
        //    71: invokespecial   acbf.<init>:(Ladod;I)V
        //    74: invokevirtual   adrh.u:(Ladog;ZLasmi;)Ladmm;
        //    77: invokestatic    afxr.l:(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
        //    80: areturn        
        //    81: aload_0        
        //    82: getfield        adpx.d:Laheu;
        //    85: astore_2       
        //    86: aload_3        
        //    87: getfield        adoj.v:I
        //    90: invokestatic    adme.z:(I)I
        //    93: istore          5
        //    95: iload           5
        //    97: istore          4
        //    99: iload           5
        //   101: ifne            107
        //   104: iconst_1       
        //   105: istore          4
        //   107: aload_2        
        //   108: aload_3        
        //   109: iload           4
        //   111: aload_3        
        //   112: getfield        adoj.f:Ljava/lang/String;
        //   115: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   118: aconst_null    
        //   119: invokevirtual   aheu.q:(Ladoj;ILandroid/net/Uri;Ladou;)Ladov;
        //   122: astore_2       
        //   123: aload_2        
        //   124: invokeinterface adov.m:()Z
        //   129: ifne            200
        //   132: getstatic       adod.a:Ladod;
        //   135: invokevirtual   ahcz.createBuilder:()Lahcr;
        //   138: astore_2       
        //   139: aload_2        
        //   140: invokevirtual   ahcr.copyOnWrite:()V
        //   143: aload_2        
        //   144: getfield        ahcr.instance:Lahcz;
        //   147: checkcast       Ladod;
        //   150: astore_1       
        //   151: aload_1        
        //   152: iconst_1       
        //   153: putfield        adod.c:I
        //   156: aload_1        
        //   157: aload_1        
        //   158: getfield        adod.b:I
        //   161: iconst_1       
        //   162: ior            
        //   163: putfield        adod.b:I
        //   166: aload_2        
        //   167: invokevirtual   ahcr.build:()Lahcz;
        //   170: checkcast       Ladod;
        //   173: astore_1       
        //   174: aload_0        
        //   175: aload_0        
        //   176: getfield        adpx.e:Ladgg;
        //   179: invokevirtual   adgg.n:()Ladog;
        //   182: iconst_1       
        //   183: new             Lacbf;
        //   186: dup            
        //   187: aload_1        
        //   188: bipush          16
        //   190: invokespecial   acbf.<init>:(Ladod;I)V
        //   193: invokevirtual   adrh.u:(Ladog;ZLasmi;)Ladmm;
        //   196: invokestatic    afxr.l:(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   199: areturn        
        //   200: aload_2        
        //   201: aload_3        
        //   202: invokestatic    adgg.p:(Ladoj;)Ljava/io/File;
        //   205: invokeinterface adov.g:(Ljava/io/File;)Ladot;
        //   210: astore_2       
        //   211: aload_2        
        //   212: invokevirtual   adot.b:()Z
        //   215: ifeq            2217
        //   218: aload_2        
        //   219: invokevirtual   adot.a:()J
        //   222: lconst_0       
        //   223: lcmp           
        //   224: ifgt            230
        //   227: goto            2217
        //   230: aload_2        
        //   231: invokevirtual   adot.a:()J
        //   234: lstore          9
        //   236: lload           9
        //   238: lconst_0       
        //   239: lcmp           
        //   240: ifle            249
        //   243: iconst_1       
        //   244: istore          8
        //   246: goto            252
        //   249: iconst_0       
        //   250: istore          8
        //   252: iload           8
        //   254: invokestatic    adme.K:(Z)V
        //   257: iconst_1       
        //   258: invokestatic    adme.T:(Z)V
        //   261: lload           9
        //   263: lconst_0       
        //   264: lcmp           
        //   265: ifle            274
        //   268: iconst_1       
        //   269: istore          8
        //   271: goto            277
        //   274: iconst_0       
        //   275: istore          8
        //   277: iload           8
        //   279: invokestatic    adme.T:(Z)V
        //   282: new             Lrcp;
        //   285: dup            
        //   286: aload_2        
        //   287: lload           9
        //   289: invokespecial   rcp.<init>:(Ljava/io/InputStream;J)V
        //   292: astore_2       
        //   293: new             Ljava/util/ArrayList;
        //   296: dup            
        //   297: invokespecial   java/util/ArrayList.<init>:()V
        //   300: astore          20
        //   302: aload_2        
        //   303: invokestatic    rct.a:(Lrcp;)Lrct;
        //   306: astore          18
        //   308: aload           18
        //   310: getfield        rct.b:Ljava/lang/String;
        //   313: ldc             "ftyp"
        //   315: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   318: ifeq            1766
        //   321: new             Lrcs;
        //   324: astore          17
        //   326: aload           17
        //   328: aload           18
        //   330: invokespecial   rcs.<init>:(Lrct;)V
        //   333: aload           17
        //   335: aload_2        
        //   336: invokevirtual   rcq.e:(Lrcp;)V
        //   339: getstatic       rcx.a:[Ljava/lang/String;
        //   342: astore          18
        //   344: iconst_0       
        //   345: istore          4
        //   347: iload           4
        //   349: bipush          7
        //   351: if_icmpge       1760
        //   354: aload           18
        //   356: iload           4
        //   358: aaload         
        //   359: astore          19
        //   361: aload           17
        //   363: getfield        rcs.a:Ljava/lang/String;
        //   366: astore          21
        //   368: aload           21
        //   370: ifnull          401
        //   373: aload           21
        //   375: aload           19
        //   377: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   380: ifeq            401
        //   383: iconst_0       
        //   384: istore          4
        //   386: iconst_0       
        //   387: istore          5
        //   389: aconst_null    
        //   390: astore          17
        //   392: aconst_null    
        //   393: astore          18
        //   395: aconst_null    
        //   396: astore          19
        //   398: goto            457
        //   401: aload           17
        //   403: getfield        rcs.b:Ljava/util/List;
        //   406: astore          21
        //   408: aload           21
        //   410: ifnull          1754
        //   413: aload           21
        //   415: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   420: astore          21
        //   422: aload           21
        //   424: invokeinterface java/util/Iterator.hasNext:()Z
        //   429: ifeq            1754
        //   432: aload           21
        //   434: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   439: checkcast       Ljava/lang/String;
        //   442: aload           19
        //   444: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   447: istore          8
        //   449: iload           8
        //   451: ifeq            1751
        //   454: goto            383
        //   457: aload_2        
        //   458: invokevirtual   rcp.b:()J
        //   461: ldc2_w          8
        //   464: lcmp           
        //   465: iflt            959
        //   468: aload_2        
        //   469: invokestatic    rct.a:(Lrcp;)Lrct;
        //   472: astore          21
        //   474: aload           21
        //   476: getfield        rct.b:Ljava/lang/String;
        //   479: ldc             "moov"
        //   481: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   484: ifeq            779
        //   487: iload           4
        //   489: ifeq            498
        //   492: iconst_5       
        //   493: istore          4
        //   495: goto            962
        //   498: aload           21
        //   500: getfield        rct.a:J
        //   503: ldc2_w          10485760
        //   506: lcmp           
        //   507: ifle            517
        //   510: bipush          10
        //   512: istore          4
        //   514: goto            962
        //   517: iconst_1       
        //   518: aload           21
        //   520: getfield        rct.f:Z
        //   523: if_icmpeq       533
        //   526: bipush          8
        //   528: istore          4
        //   530: goto            537
        //   533: bipush          16
        //   535: istore          4
        //   537: iload           4
        //   539: istore          6
        //   541: aload           21
        //   543: getfield        rct.b:Ljava/lang/String;
        //   546: aload_1        
        //   547: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   550: ifeq            560
        //   553: iload           4
        //   555: bipush          16
        //   557: iadd           
        //   558: istore          6
        //   560: iload           6
        //   562: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //   565: astore          18
        //   567: aload           21
        //   569: getfield        rct.f:Z
        //   572: ifeq            585
        //   575: aload           18
        //   577: iconst_1       
        //   578: invokevirtual   java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
        //   581: pop            
        //   582: goto            597
        //   585: aload           18
        //   587: aload           21
        //   589: getfield        rct.a:J
        //   592: l2i            
        //   593: invokevirtual   java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
        //   596: pop            
        //   597: aload           18
        //   599: aload           21
        //   601: getfield        rct.b:Ljava/lang/String;
        //   604: invokevirtual   java/lang/String.getBytes:()[B
        //   607: invokevirtual   java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
        //   610: pop            
        //   611: aload           21
        //   613: getfield        rct.f:Z
        //   616: ifeq            630
        //   619: aload           18
        //   621: aload           21
        //   623: getfield        rct.a:J
        //   626: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
        //   629: pop            
        //   630: aload           21
        //   632: getfield        rct.b:Ljava/lang/String;
        //   635: aload_1        
        //   636: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   639: ifeq            653
        //   642: aload           18
        //   644: aload           21
        //   646: getfield        rct.c:[B
        //   649: invokevirtual   java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
        //   652: pop            
        //   653: aload           18
        //   655: invokevirtual   java/nio/ByteBuffer.array:()[B
        //   658: astore          22
        //   660: aload_2        
        //   661: aload           21
        //   663: getfield        rct.a:J
        //   666: aload           21
        //   668: getfield        rct.e:J
        //   671: lsub           
        //   672: l2i            
        //   673: invokevirtual   rcp.l:(I)[B
        //   676: astore          19
        //   678: aload           22
        //   680: arraylength    
        //   681: istore          4
        //   683: aload           19
        //   685: arraylength    
        //   686: istore          7
        //   688: iload           4
        //   690: iload           7
        //   692: iadd           
        //   693: istore          6
        //   695: iload           6
        //   697: newarray        B
        //   699: astore          18
        //   701: aload           22
        //   703: iconst_0       
        //   704: aload           18
        //   706: iconst_0       
        //   707: iload           4
        //   709: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   712: aload           19
        //   714: iconst_0       
        //   715: aload           18
        //   717: iload           4
        //   719: iload           7
        //   721: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   724: new             Ljava/io/ByteArrayInputStream;
        //   727: astore          19
        //   729: aload           19
        //   731: aload           18
        //   733: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   736: new             Lrcp;
        //   739: astore          22
        //   741: aload           22
        //   743: aload           19
        //   745: iload           6
        //   747: i2l            
        //   748: invokespecial   rcp.<init>:(Ljava/io/InputStream;J)V
        //   751: aload           22
        //   753: iload           4
        //   755: i2l            
        //   756: invokevirtual   rcp.k:(J)V
        //   759: aload           21
        //   761: invokestatic    qcz.l:(Lrct;)Lrcq;
        //   764: astore          19
        //   766: aload           19
        //   768: aload           22
        //   770: invokevirtual   rcq.e:(Lrcp;)V
        //   773: iconst_1       
        //   774: istore          4
        //   776: goto            457
        //   779: aload           21
        //   781: getfield        rct.b:Ljava/lang/String;
        //   784: ldc_w           "mdat"
        //   787: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   790: ifeq            838
        //   793: iload           5
        //   795: ifeq            805
        //   798: bipush          6
        //   800: istore          4
        //   802: goto            962
        //   805: iload           4
        //   807: ifeq            816
        //   810: iconst_4       
        //   811: istore          4
        //   813: goto            962
        //   816: aload           21
        //   818: invokestatic    qcz.l:(Lrct;)Lrcq;
        //   821: astore          17
        //   823: aload           17
        //   825: aload_2        
        //   826: invokevirtual   rcq.e:(Lrcp;)V
        //   829: iconst_0       
        //   830: istore          4
        //   832: iconst_1       
        //   833: istore          5
        //   835: goto            457
        //   838: aload           21
        //   840: getfield        rct.b:Ljava/lang/String;
        //   843: astore          22
        //   845: getstatic       rcx.b:[Ljava/lang/String;
        //   848: astore          23
        //   850: iconst_0       
        //   851: istore          6
        //   853: iload           6
        //   855: bipush          6
        //   857: if_icmpge       952
        //   860: aload           23
        //   862: iload           6
        //   864: aaload         
        //   865: aload           22
        //   867: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   870: ifeq            946
        //   873: aload           21
        //   875: getfield        rct.b:Ljava/lang/String;
        //   878: astore          22
        //   880: getstatic       rcx.c:[Ljava/lang/String;
        //   883: astore          23
        //   885: iconst_0       
        //   886: istore          6
        //   888: iload           6
        //   890: iconst_5       
        //   891: if_icmpge       920
        //   894: aload           23
        //   896: iload           6
        //   898: aaload         
        //   899: aload           22
        //   901: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   904: ifeq            914
        //   907: bipush          7
        //   909: istore          4
        //   911: goto            962
        //   914: iinc            6, 1
        //   917: goto            888
        //   920: aload           21
        //   922: invokestatic    qcz.l:(Lrct;)Lrcq;
        //   925: astore          21
        //   927: aload           21
        //   929: aload_2        
        //   930: invokevirtual   rcq.e:(Lrcp;)V
        //   933: aload           20
        //   935: aload           21
        //   937: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   942: pop            
        //   943: goto            457
        //   946: iinc            6, 1
        //   949: goto            853
        //   952: bipush          8
        //   954: istore          4
        //   956: goto            962
        //   959: iconst_1       
        //   960: istore          4
        //   962: iload           4
        //   964: iconst_1       
        //   965: if_icmpne       1716
        //   968: lload           9
        //   970: ldc2_w          2147483647
        //   973: lcmp           
        //   974: ifgt            1760
        //   977: aload           19
        //   979: ldc_w           "trak"
        //   982: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //   985: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   990: astore_1       
        //   991: aload_1        
        //   992: invokeinterface java/util/Iterator.hasNext:()Z
        //   997: istore          8
        //   999: ldc_w           "stbl"
        //  1002: astore          22
        //  1004: ldc_w           "minf"
        //  1007: astore          21
        //  1009: ldc_w           "mdia"
        //  1012: astore          20
        //  1014: iload           8
        //  1016: ifeq            1141
        //  1019: aload_1        
        //  1020: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1025: checkcast       Lrcq;
        //  1028: ldc_w           "mdia"
        //  1031: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1034: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1039: astore          21
        //  1041: aload           21
        //  1043: invokeinterface java/util/Iterator.hasNext:()Z
        //  1048: ifeq            991
        //  1051: aload           21
        //  1053: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1058: checkcast       Lrcq;
        //  1061: ldc_w           "minf"
        //  1064: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1067: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1072: astore          20
        //  1074: aload           20
        //  1076: invokeinterface java/util/Iterator.hasNext:()Z
        //  1081: ifeq            1041
        //  1084: aload           20
        //  1086: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1091: checkcast       Lrcq;
        //  1094: ldc_w           "stbl"
        //  1097: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1100: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1105: astore_2       
        //  1106: aload_2        
        //  1107: invokeinterface java/util/Iterator.hasNext:()Z
        //  1112: ifeq            1074
        //  1115: aload_2        
        //  1116: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1121: checkcast       Lrcq;
        //  1124: ldc_w           "co64"
        //  1127: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1130: invokeinterface java/util/List.isEmpty:()Z
        //  1135: ifne            1106
        //  1138: goto            1760
        //  1141: aload           19
        //  1143: invokevirtual   rcq.b:()J
        //  1146: lstore          15
        //  1148: aload           17
        //  1150: invokevirtual   rcq.b:()J
        //  1153: lstore          9
        //  1155: aload           18
        //  1157: aload           18
        //  1159: arraylength    
        //  1160: invokestatic    java/util/Arrays.copyOf:([BI)[B
        //  1163: astore          28
        //  1165: aload           19
        //  1167: ldc_w           "trak"
        //  1170: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1173: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1178: astore          23
        //  1180: aload           23
        //  1182: invokeinterface java/util/Iterator.hasNext:()Z
        //  1187: ifeq            1695
        //  1190: aload           23
        //  1192: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1197: checkcast       Lrcq;
        //  1200: aload           20
        //  1202: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1205: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1210: astore          19
        //  1212: lload           9
        //  1214: lstore          13
        //  1216: aload           20
        //  1218: astore_2       
        //  1219: aload           21
        //  1221: astore          17
        //  1223: aload           22
        //  1225: astore_1       
        //  1226: aload           23
        //  1228: astore          18
        //  1230: aload           18
        //  1232: astore          23
        //  1234: aload_1        
        //  1235: astore          22
        //  1237: aload           17
        //  1239: astore          21
        //  1241: aload_2        
        //  1242: astore          20
        //  1244: lload           13
        //  1246: lstore          9
        //  1248: aload           19
        //  1250: invokeinterface java/util/Iterator.hasNext:()Z
        //  1255: ifeq            1180
        //  1258: aload           19
        //  1260: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1265: checkcast       Lrcq;
        //  1268: aload           17
        //  1270: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1273: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1278: astore          26
        //  1280: lload           13
        //  1282: lstore          11
        //  1284: aload_2        
        //  1285: astore          25
        //  1287: aload           17
        //  1289: astore          27
        //  1291: aload_1        
        //  1292: astore          23
        //  1294: aload           19
        //  1296: astore          24
        //  1298: aload           18
        //  1300: astore          22
        //  1302: aload           22
        //  1304: astore          18
        //  1306: aload           24
        //  1308: astore          19
        //  1310: aload           23
        //  1312: astore_1       
        //  1313: aload           27
        //  1315: astore          17
        //  1317: aload           25
        //  1319: astore_2       
        //  1320: lload           11
        //  1322: lstore          13
        //  1324: aload           26
        //  1326: invokeinterface java/util/Iterator.hasNext:()Z
        //  1331: ifeq            1230
        //  1334: aload           26
        //  1336: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1341: checkcast       Lrcq;
        //  1344: aload           23
        //  1346: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1349: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1354: astore          21
        //  1356: aload           26
        //  1358: astore          20
        //  1360: lload           11
        //  1362: lstore          9
        //  1364: aload           25
        //  1366: astore_1       
        //  1367: aload           27
        //  1369: astore_2       
        //  1370: aload           23
        //  1372: astore          17
        //  1374: aload           24
        //  1376: astore          18
        //  1378: aload           22
        //  1380: astore          19
        //  1382: aload           19
        //  1384: astore          22
        //  1386: aload           18
        //  1388: astore          24
        //  1390: aload           17
        //  1392: astore          23
        //  1394: aload_2        
        //  1395: astore          27
        //  1397: aload_1        
        //  1398: astore          25
        //  1400: lload           9
        //  1402: lstore          11
        //  1404: aload           20
        //  1406: astore          26
        //  1408: aload           21
        //  1410: invokeinterface java/util/Iterator.hasNext:()Z
        //  1415: ifeq            1302
        //  1418: aload           21
        //  1420: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1425: checkcast       Lrcq;
        //  1428: astore          23
        //  1430: aload           23
        //  1432: ldc_w           "stco"
        //  1435: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1438: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1443: astore          22
        //  1445: aload           22
        //  1447: invokeinterface java/util/Iterator.hasNext:()Z
        //  1452: ifeq            1563
        //  1455: aload           22
        //  1457: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1462: checkcast       Lrcq;
        //  1465: checkcast       Lrcv;
        //  1468: astore          24
        //  1470: aload           24
        //  1472: getfield        rcv.b:J
        //  1475: l2i            
        //  1476: istore          6
        //  1478: aload           24
        //  1480: getfield        rcv.a:[J
        //  1483: astore          25
        //  1485: aload           28
        //  1487: arraylength    
        //  1488: i2l            
        //  1489: lstore          11
        //  1491: aload           25
        //  1493: arraylength    
        //  1494: istore          5
        //  1496: iload           5
        //  1498: iconst_4       
        //  1499: imul           
        //  1500: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //  1503: astore          24
        //  1505: iconst_0       
        //  1506: istore          4
        //  1508: iload           4
        //  1510: iload           5
        //  1512: if_icmpge       1540
        //  1515: aload           24
        //  1517: aload           25
        //  1519: iload           4
        //  1521: laload         
        //  1522: lload           11
        //  1524: ladd           
        //  1525: ldc2_w          4294967295
        //  1528: land           
        //  1529: l2i            
        //  1530: invokevirtual   java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
        //  1533: pop            
        //  1534: iinc            4, 1
        //  1537: goto            1508
        //  1540: aload           24
        //  1542: invokevirtual   java/nio/ByteBuffer.array:()[B
        //  1545: astore          24
        //  1547: aload           24
        //  1549: iconst_0       
        //  1550: aload           28
        //  1552: iload           6
        //  1554: aload           24
        //  1556: arraylength    
        //  1557: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  1560: goto            1445
        //  1563: aload           23
        //  1565: ldc_w           "co64"
        //  1568: invokevirtual   rcq.d:(Ljava/lang/String;)Ljava/util/List;
        //  1571: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1576: astore          22
        //  1578: aload           22
        //  1580: invokeinterface java/util/Iterator.hasNext:()Z
        //  1585: ifeq            1692
        //  1588: aload           22
        //  1590: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1595: checkcast       Lrcq;
        //  1598: checkcast       Lrcr;
        //  1601: astore          23
        //  1603: aload           23
        //  1605: getfield        rcr.a:J
        //  1608: l2i            
        //  1609: istore          5
        //  1611: aload           23
        //  1613: getfield        rcr.b:[J
        //  1616: astore          24
        //  1618: aload           28
        //  1620: arraylength    
        //  1621: i2l            
        //  1622: lstore          11
        //  1624: aload           24
        //  1626: arraylength    
        //  1627: istore          6
        //  1629: iload           6
        //  1631: bipush          8
        //  1633: imul           
        //  1634: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //  1637: astore          23
        //  1639: iconst_0       
        //  1640: istore          4
        //  1642: iload           4
        //  1644: iload           6
        //  1646: if_icmpge       1669
        //  1649: aload           23
        //  1651: aload           24
        //  1653: iload           4
        //  1655: laload         
        //  1656: lload           11
        //  1658: ladd           
        //  1659: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
        //  1662: pop            
        //  1663: iinc            4, 1
        //  1666: goto            1642
        //  1669: aload           23
        //  1671: invokevirtual   java/nio/ByteBuffer.array:()[B
        //  1674: astore          23
        //  1676: aload           23
        //  1678: iconst_0       
        //  1679: aload           28
        //  1681: iload           5
        //  1683: aload           23
        //  1685: arraylength    
        //  1686: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  1689: goto            1578
        //  1692: goto            1382
        //  1695: aload           28
        //  1697: astore_1       
        //  1698: lload           15
        //  1700: lstore          13
        //  1702: lload           9
        //  1704: lstore          11
        //  1706: iconst_4       
        //  1707: istore          5
        //  1709: lload           13
        //  1711: lstore          9
        //  1713: goto            1781
        //  1716: iload           4
        //  1718: iconst_4       
        //  1719: if_icmpeq       1739
        //  1722: iload           4
        //  1724: bipush          7
        //  1726: if_icmpeq       1760
        //  1729: iload           4
        //  1731: bipush          8
        //  1733: if_icmpeq       1760
        //  1736: goto            1745
        //  1739: iconst_1       
        //  1740: istore          4
        //  1742: goto            1769
        //  1745: iconst_3       
        //  1746: istore          4
        //  1748: goto            1769
        //  1751: goto            422
        //  1754: iinc            4, 1
        //  1757: goto            347
        //  1760: iconst_2       
        //  1761: istore          4
        //  1763: goto            1769
        //  1766: iconst_0       
        //  1767: istore          4
        //  1769: lconst_0       
        //  1770: lstore          9
        //  1772: aconst_null    
        //  1773: astore_1       
        //  1774: lconst_0       
        //  1775: lstore          11
        //  1777: iload           4
        //  1779: istore          5
        //  1781: iload           5
        //  1783: ifeq            1829
        //  1786: iload           5
        //  1788: iconst_1       
        //  1789: if_icmpeq       1823
        //  1792: iload           5
        //  1794: iconst_2       
        //  1795: if_icmpeq       1817
        //  1798: iload           5
        //  1800: iconst_3       
        //  1801: if_icmpeq       1811
        //  1804: bipush          6
        //  1806: istore          4
        //  1808: goto            1832
        //  1811: iconst_5       
        //  1812: istore          4
        //  1814: goto            1832
        //  1817: iconst_4       
        //  1818: istore          4
        //  1820: goto            1832
        //  1823: iconst_3       
        //  1824: istore          4
        //  1826: goto            1832
        //  1829: iconst_2       
        //  1830: istore          4
        //  1832: iload           5
        //  1834: iconst_4       
        //  1835: if_icmpne       2146
        //  1838: new             Ljava/io/File;
        //  1841: dup            
        //  1842: aload_3        
        //  1843: getfield        adoj.ap:Ljava/lang/String;
        //  1846: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1849: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //  1852: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //  1855: ldc_w           "newMoovBox.dat"
        //  1858: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  1861: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  1864: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //  1867: astore_3       
        //  1868: new             Ljava/io/File;
        //  1871: dup            
        //  1872: aload_3        
        //  1873: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1876: astore_2       
        //  1877: iconst_4       
        //  1878: aload_1        
        //  1879: invokestatic    qcz.o:(I[B)[B
        //  1882: aload_2        
        //  1883: invokestatic    afqz.c:([BLjava/io/File;)V
        //  1886: getstatic       adod.a:Ladod;
        //  1889: invokevirtual   ahcz.createBuilder:()Lahcr;
        //  1892: astore_2       
        //  1893: aload_2        
        //  1894: invokevirtual   ahcr.copyOnWrite:()V
        //  1897: aload_2        
        //  1898: getfield        ahcr.instance:Lahcz;
        //  1901: checkcast       Ladod;
        //  1904: astore          17
        //  1906: aload           17
        //  1908: iload           4
        //  1910: iconst_1       
        //  1911: isub           
        //  1912: putfield        adod.c:I
        //  1915: aload           17
        //  1917: aload           17
        //  1919: getfield        adod.b:I
        //  1922: iconst_1       
        //  1923: ior            
        //  1924: putfield        adod.b:I
        //  1927: aload_2        
        //  1928: invokevirtual   ahcr.copyOnWrite:()V
        //  1931: aload_2        
        //  1932: getfield        ahcr.instance:Lahcz;
        //  1935: checkcast       Ladod;
        //  1938: astore          17
        //  1940: aload_3        
        //  1941: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1944: pop            
        //  1945: aload           17
        //  1947: aload           17
        //  1949: getfield        adod.b:I
        //  1952: iconst_2       
        //  1953: ior            
        //  1954: putfield        adod.b:I
        //  1957: aload           17
        //  1959: aload_3        
        //  1960: putfield        adod.d:Ljava/lang/String;
        //  1963: iconst_4       
        //  1964: lload           11
        //  1966: invokestatic    qcz.m:(IJ)J
        //  1969: lstore          11
        //  1971: aload_2        
        //  1972: invokevirtual   ahcr.copyOnWrite:()V
        //  1975: aload_2        
        //  1976: getfield        ahcr.instance:Lahcz;
        //  1979: checkcast       Ladod;
        //  1982: astore_3       
        //  1983: aload_3        
        //  1984: aload_3        
        //  1985: getfield        adod.b:I
        //  1988: iconst_4       
        //  1989: ior            
        //  1990: putfield        adod.b:I
        //  1993: aload_3        
        //  1994: lload           11
        //  1996: putfield        adod.e:J
        //  1999: iconst_4       
        //  2000: aload_1        
        //  2001: invokestatic    qcz.o:(I[B)[B
        //  2004: arraylength    
        //  2005: i2l            
        //  2006: lstore          11
        //  2008: aload_2        
        //  2009: invokevirtual   ahcr.copyOnWrite:()V
        //  2012: aload_2        
        //  2013: getfield        ahcr.instance:Lahcz;
        //  2016: checkcast       Ladod;
        //  2019: astore_3       
        //  2020: aload_3        
        //  2021: aload_3        
        //  2022: getfield        adod.b:I
        //  2025: bipush          8
        //  2027: ior            
        //  2028: putfield        adod.b:I
        //  2031: aload_3        
        //  2032: lload           11
        //  2034: putfield        adod.f:J
        //  2037: iconst_4       
        //  2038: lload           9
        //  2040: invokestatic    qcz.n:(IJ)J
        //  2043: lstore          9
        //  2045: aload_2        
        //  2046: invokevirtual   ahcr.copyOnWrite:()V
        //  2049: aload_2        
        //  2050: getfield        ahcr.instance:Lahcz;
        //  2053: checkcast       Ladod;
        //  2056: astore_3       
        //  2057: aload_3        
        //  2058: aload_3        
        //  2059: getfield        adod.b:I
        //  2062: bipush          16
        //  2064: ior            
        //  2065: putfield        adod.b:I
        //  2068: aload_3        
        //  2069: lload           9
        //  2071: putfield        adod.g:J
        //  2074: iconst_4       
        //  2075: aload_1        
        //  2076: invokestatic    qcz.o:(I[B)[B
        //  2079: arraylength    
        //  2080: i2l            
        //  2081: lstore          9
        //  2083: aload_2        
        //  2084: invokevirtual   ahcr.copyOnWrite:()V
        //  2087: aload_2        
        //  2088: getfield        ahcr.instance:Lahcz;
        //  2091: checkcast       Ladod;
        //  2094: astore_1       
        //  2095: aload_1        
        //  2096: aload_1        
        //  2097: getfield        adod.b:I
        //  2100: bipush          32
        //  2102: ior            
        //  2103: putfield        adod.b:I
        //  2106: aload_1        
        //  2107: lload           9
        //  2109: putfield        adod.h:J
        //  2112: aload_2        
        //  2113: invokevirtual   ahcr.build:()Lahcz;
        //  2116: checkcast       Ladod;
        //  2119: astore_1       
        //  2120: aload_0        
        //  2121: aload_0        
        //  2122: getfield        adpx.e:Ladgg;
        //  2125: invokevirtual   adgg.n:()Ladog;
        //  2128: iconst_1       
        //  2129: new             Lacbf;
        //  2132: dup            
        //  2133: aload_1        
        //  2134: bipush          19
        //  2136: invokespecial   acbf.<init>:(Ladod;I)V
        //  2139: invokevirtual   adrh.u:(Ladog;ZLasmi;)Ladmm;
        //  2142: invokestatic    afxr.l:(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  2145: areturn        
        //  2146: getstatic       adod.a:Ladod;
        //  2149: invokevirtual   ahcz.createBuilder:()Lahcr;
        //  2152: astore_2       
        //  2153: aload_2        
        //  2154: invokevirtual   ahcr.copyOnWrite:()V
        //  2157: aload_2        
        //  2158: getfield        ahcr.instance:Lahcz;
        //  2161: checkcast       Ladod;
        //  2164: astore_1       
        //  2165: aload_1        
        //  2166: iload           4
        //  2168: iconst_1       
        //  2169: isub           
        //  2170: putfield        adod.c:I
        //  2173: aload_1        
        //  2174: aload_1        
        //  2175: getfield        adod.b:I
        //  2178: iconst_1       
        //  2179: ior            
        //  2180: putfield        adod.b:I
        //  2183: aload_2        
        //  2184: invokevirtual   ahcr.build:()Lahcz;
        //  2187: checkcast       Ladod;
        //  2190: astore_1       
        //  2191: aload_0        
        //  2192: aload_0        
        //  2193: getfield        adpx.e:Ladgg;
        //  2196: invokevirtual   adgg.n:()Ladog;
        //  2199: iconst_1       
        //  2200: new             Lacbf;
        //  2203: dup            
        //  2204: aload_1        
        //  2205: bipush          18
        //  2207: invokespecial   acbf.<init>:(Ladod;I)V
        //  2210: invokevirtual   adrh.u:(Ladog;ZLasmi;)Ladmm;
        //  2213: invokestatic    afxr.l:(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  2216: areturn        
        //  2217: getstatic       adod.a:Ladod;
        //  2220: invokevirtual   ahcz.createBuilder:()Lahcr;
        //  2223: astore_1       
        //  2224: aload_1        
        //  2225: invokevirtual   ahcr.copyOnWrite:()V
        //  2228: aload_1        
        //  2229: getfield        ahcr.instance:Lahcz;
        //  2232: checkcast       Ladod;
        //  2235: astore_2       
        //  2236: aload_2        
        //  2237: iconst_0       
        //  2238: putfield        adod.c:I
        //  2241: aload_2        
        //  2242: aload_2        
        //  2243: getfield        adod.b:I
        //  2246: iconst_1       
        //  2247: ior            
        //  2248: putfield        adod.b:I
        //  2251: aload_1        
        //  2252: invokevirtual   ahcr.build:()Lahcz;
        //  2255: checkcast       Ladod;
        //  2258: astore_1       
        //  2259: aload_0        
        //  2260: aload_0        
        //  2261: getfield        adpx.e:Ladgg;
        //  2264: invokevirtual   adgg.n:()Ladog;
        //  2267: iconst_1       
        //  2268: new             Lacbf;
        //  2271: dup            
        //  2272: aload_1        
        //  2273: bipush          17
        //  2275: invokespecial   acbf.<init>:(Ladod;I)V
        //  2278: invokevirtual   adrh.u:(Ladog;ZLasmi;)Ladmm;
        //  2281: invokestatic    afxr.l:(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  2284: areturn        
        //  2285: astore_1       
        //  2286: goto            1766
        //  2289: astore_1       
        //  2290: goto            1745
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  302    344    2285   2289   Ljava/io/IOException;
        //  361    368    2285   2289   Ljava/io/IOException;
        //  373    383    2285   2289   Ljava/io/IOException;
        //  401    408    2285   2289   Ljava/io/IOException;
        //  413    422    2285   2289   Ljava/io/IOException;
        //  422    449    2285   2289   Ljava/io/IOException;
        //  457    487    2289   2293   Lrda;
        //  498    510    2289   2293   Lrda;
        //  517    526    2289   2293   Lrda;
        //  541    553    2289   2293   Lrda;
        //  560    582    2289   2293   Lrda;
        //  585    597    2289   2293   Lrda;
        //  597    630    2289   2293   Lrda;
        //  630    653    2289   2293   Lrda;
        //  653    688    2289   2293   Lrda;
        //  695    773    2289   2293   Lrda;
        //  779    793    2289   2293   Lrda;
        //  816    829    2289   2293   Lrda;
        //  838    850    2289   2293   Lrda;
        //  860    885    2289   2293   Lrda;
        //  894    907    2289   2293   Lrda;
        //  920    943    2289   2293   Lrda;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0457:
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
    
    public final asme f() {
        return adlg.s;
    }
    
    public final String g() {
        return "FileAnalysisTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adoj adoj) {
        final int b = adoj.b;
        return (b & 0x2) != 0x0 && (b & 0x40) != 0x0;
    }
    
    public final void r(final long e, final adoj adoj) {
        if (adoj != null) {
            final adnd b = this.b;
            final String k = adoj.k;
            final String e2 = adoj.e;
            adod adod;
            if ((adod = adoj.B) == null) {
                adod = adod.a;
            }
            final int a = adme.A(adod.c);
            final int n = 1;
            int n2;
            if ((n2 = a) == 0) {
                n2 = 1;
            }
            adme.K(e >= 0L);
            final ahcr builder = apjr.a.createBuilder();
            final apjq a2 = b.a(k);
            builder.copyOnWrite();
            final apjr apjr = (apjr)builder.instance;
            a2.getClass();
            apjr.c = a2;
            apjr.b |= 0x1;
            builder.copyOnWrite();
            final apjr apjr2 = (apjr)builder.instance;
            apjr2.b |= 0x4;
            apjr2.e = e;
            int n3;
            if (--n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                n3 = n;
                            }
                            else {
                                n3 = 8;
                            }
                        }
                        else {
                            n3 = 6;
                        }
                    }
                    else {
                        n3 = 5;
                    }
                }
                else {
                    n3 = 4;
                }
            }
            else {
                n3 = 3;
            }
            builder.copyOnWrite();
            final apjr apjr3 = (apjr)builder.instance;
            apjr3.d = n3 - 1;
            apjr3.b |= 0x2;
            final apjr apjr4 = (apjr)builder.build();
            final akps d = akpu.d();
            ((ahcr)d).copyOnWrite();
            akpu.an((akpu)d.instance, apjr4);
            b.b(e2, (akpu)((ahcr)d).build());
        }
    }
}
