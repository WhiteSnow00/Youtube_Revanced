import java.util.Map;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class got implements vcv, fcd
{
    private final ggr a;
    private final ghb b;
    private final SharedPreferences c;
    private final jln d;
    private final wyw e;
    private final php f;
    private final aln g;
    private final blu h;
    private final bx i;
    
    public got(final ggr a, final ghb b, final SharedPreferences c, final jln d, final aln g, final blu h, final bx i, final php f, final wyw e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        this.i = i;
        this.f = f;
        this.e = e;
    }
    
    public final void mE(final aiqj p0, final Map p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          13
        //     3: aload           13
        //     5: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //     8: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //    11: checkcast       Lanxf;
        //    14: astore          14
        //    16: aload           14
        //    18: getfield        anxf.c:Ljava/lang/String;
        //    21: invokevirtual   java/lang/String.isEmpty:()Z
        //    24: ifne            1305
        //    27: aload_0        
        //    28: getfield        got.c:Landroid/content/SharedPreferences;
        //    31: astore          11
        //    33: aload           11
        //    35: ifnull          54
        //    38: aload           11
        //    40: ldc             "force_enable_sticky_browsy_bars"
        //    42: iconst_0       
        //    43: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    48: ifeq            54
        //    51: goto            119
        //    54: aload           13
        //    56: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //    59: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //    62: checkcast       Lanxf;
        //    65: getfield        anxf.e:Lanxi;
        //    68: astore          12
        //    70: aload           12
        //    72: astore          11
        //    74: aload           12
        //    76: ifnonnull       84
        //    79: getstatic       anxi.a:Lanxi;
        //    82: astore          11
        //    84: aload           11
        //    86: getfield        anxi.c:Lanxh;
        //    89: astore          12
        //    91: aload           12
        //    93: astore          11
        //    95: aload           12
        //    97: ifnonnull       105
        //   100: getstatic       anxh.a:Lanxh;
        //   103: astore          11
        //   105: aload           11
        //   107: getfield        anxh.c:Z
        //   110: ifne            119
        //   113: aconst_null    
        //   114: astore          11
        //   116: goto            132
        //   119: aload_2        
        //   120: ldc             "HORIZONTAL_CARD_LIST"
        //   122: ldc             Lakcf;.class
        //   124: invokestatic    tpe.O:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //   127: checkcast       Lakcf;
        //   130: astore          11
        //   132: aload_0        
        //   133: getfield        got.d:Ljln;
        //   136: astore          15
        //   138: aload           13
        //   140: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   143: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   146: checkcast       Lanxf;
        //   149: getfield        anxf.g:Lanxg;
        //   152: astore          14
        //   154: aload           14
        //   156: astore          12
        //   158: aload           14
        //   160: ifnonnull       168
        //   163: getstatic       anxg.a:Lanxg;
        //   166: astore          12
        //   168: aload           12
        //   170: getfield        anxg.b:I
        //   173: ldc             163011016
        //   175: if_icmpne       191
        //   178: aload           12
        //   180: getfield        anxg.c:Ljava/lang/Object;
        //   183: checkcast       Lanxk;
        //   186: astore          12
        //   188: goto            196
        //   191: getstatic       anxk.a:Lanxk;
        //   194: astore          12
        //   196: aload           12
        //   198: getfield        anxk.b:I
        //   201: istore_3       
        //   202: iconst_1       
        //   203: istore          10
        //   205: iload_3        
        //   206: iconst_1       
        //   207: iand           
        //   208: ifeq            214
        //   211: goto            225
        //   214: aload           13
        //   216: astore          12
        //   218: aload_1        
        //   219: invokestatic    jln.a:(Laiqj;)Z
        //   222: ifeq            802
        //   225: aload           15
        //   227: aload           13
        //   229: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   232: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   235: checkcast       Lanxf;
        //   238: getfield        anxf.c:Ljava/lang/String;
        //   241: putfield        jln.d:Ljava/lang/String;
        //   244: aload_1        
        //   245: invokevirtual   ahbh.toBuilder:()Lahaz;
        //   248: checkcast       Lahbb;
        //   251: astore_1       
        //   252: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   255: astore          12
        //   257: aload           13
        //   259: aload           12
        //   261: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   264: checkcast       Lanxf;
        //   267: invokevirtual   ahbh.toBuilder:()Lahaz;
        //   270: checkcast       Lahbb;
        //   273: astore          13
        //   275: aload           13
        //   277: getstatic       anxe.f:Lahbf;
        //   280: iconst_1       
        //   281: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   284: invokevirtual   ahbb.e:(Lahaq;Ljava/lang/Object;)V
        //   287: aload_1        
        //   288: aload           12
        //   290: aload           13
        //   292: invokevirtual   ahaz.build:()Lahbh;
        //   295: checkcast       Lanxf;
        //   298: invokevirtual   ahbb.e:(Lahaq;Ljava/lang/Object;)V
        //   301: aload_1        
        //   302: invokevirtual   ahaz.build:()Lahbh;
        //   305: checkcast       Laiqj;
        //   308: astore          13
        //   310: aload           13
        //   312: invokestatic    jln.a:(Laiqj;)Z
        //   315: ifeq            610
        //   318: aload           13
        //   320: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   323: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   326: checkcast       Lanxf;
        //   329: getfield        anxf.g:Lanxg;
        //   332: astore          12
        //   334: aload           12
        //   336: astore_1       
        //   337: aload           12
        //   339: ifnonnull       346
        //   342: getstatic       anxg.a:Lanxg;
        //   345: astore_1       
        //   346: aload_1        
        //   347: getfield        anxg.b:I
        //   350: ldc             163011016
        //   352: if_icmpne       366
        //   355: aload_1        
        //   356: getfield        anxg.c:Ljava/lang/Object;
        //   359: checkcast       Lanxk;
        //   362: astore_1       
        //   363: goto            370
        //   366: getstatic       anxk.a:Lanxk;
        //   369: astore_1       
        //   370: aload_1        
        //   371: getfield        anxk.d:Lanxj;
        //   374: astore          12
        //   376: aload           12
        //   378: astore_1       
        //   379: aload           12
        //   381: ifnonnull       388
        //   384: getstatic       anxj.a:Lanxj;
        //   387: astore_1       
        //   388: aload_1        
        //   389: getfield        anxj.b:I
        //   392: iconst_2       
        //   393: iand           
        //   394: ifeq            598
        //   397: aload_1        
        //   398: getfield        anxj.d:Lahab;
        //   401: astore          12
        //   403: aload           12
        //   405: invokevirtual   ahab.H:()Z
        //   408: ifeq            417
        //   411: aload           12
        //   413: astore_1       
        //   414: goto            602
        //   417: aload_1        
        //   418: getfield        anxj.c:I
        //   421: invokestatic    aqsx.bJ:(I)I
        //   424: istore_3       
        //   425: iload_3        
        //   426: ifne            434
        //   429: iconst_1       
        //   430: istore_3       
        //   431: goto            434
        //   434: iload_3        
        //   435: iconst_4       
        //   436: if_icmpne       459
        //   439: new             Ljava/util/zip/GZIPInputStream;
        //   442: astore_1       
        //   443: aload_1        
        //   444: aload           12
        //   446: invokevirtual   ahab.m:()Ljava/io/InputStream;
        //   449: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //   452: goto            487
        //   455: astore_1       
        //   456: goto            546
        //   459: iload_3        
        //   460: iconst_3       
        //   461: if_icmpne       480
        //   464: new             Lauai;
        //   467: dup            
        //   468: aload           12
        //   470: invokevirtual   ahab.m:()Ljava/io/InputStream;
        //   473: invokespecial   auai.<init>:(Ljava/io/InputStream;)V
        //   476: astore_1       
        //   477: goto            487
        //   480: getstatic       ahab.b:Lahab;
        //   483: invokevirtual   ahab.m:()Ljava/io/InputStream;
        //   486: astore_1       
        //   487: aload_1        
        //   488: invokestatic    ahab.B:(Ljava/io/InputStream;)Lahab;
        //   491: astore          12
        //   493: aload_1        
        //   494: invokevirtual   java/io/InputStream.close:()V
        //   497: aload           12
        //   499: astore_1       
        //   500: goto            602
        //   503: astore          12
        //   505: aload_1        
        //   506: invokevirtual   java/io/InputStream.close:()V
        //   509: goto            543
        //   512: astore_1       
        //   513: ldc             Ljava/lang/Throwable;.class
        //   515: ldc             "addSuppressed"
        //   517: iconst_1       
        //   518: anewarray       Ljava/lang/Class;
        //   521: dup            
        //   522: iconst_0       
        //   523: ldc             Ljava/lang/Throwable;.class
        //   525: aastore        
        //   526: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   529: aload           12
        //   531: iconst_1       
        //   532: anewarray       Ljava/lang/Object;
        //   535: dup            
        //   536: iconst_0       
        //   537: aload_1        
        //   538: aastore        
        //   539: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   542: pop            
        //   543: aload           12
        //   545: athrow         
        //   546: aload_1        
        //   547: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   550: astore          12
        //   552: new             Ljava/lang/StringBuilder;
        //   555: dup            
        //   556: ldc             "Failed to decompress "
        //   558: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   561: astore_1       
        //   562: aload_1        
        //   563: iload_3        
        //   564: iconst_1       
        //   565: isub           
        //   566: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   569: pop            
        //   570: aload_1        
        //   571: ldc             ": "
        //   573: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   576: pop            
        //   577: aload_1        
        //   578: aload           12
        //   580: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   583: pop            
        //   584: aload_1        
        //   585: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   588: invokestatic    ttr.b:(Ljava/lang/String;)V
        //   591: getstatic       ahab.b:Lahab;
        //   594: astore_1       
        //   595: goto            602
        //   598: getstatic       ahab.b:Lahab;
        //   601: astore_1       
        //   602: aload_1        
        //   603: invokevirtual   ahab.I:()[B
        //   606: astore_1       
        //   607: goto            670
        //   610: aload           13
        //   612: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   615: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   618: checkcast       Lanxf;
        //   621: getfield        anxf.g:Lanxg;
        //   624: astore          12
        //   626: aload           12
        //   628: astore_1       
        //   629: aload           12
        //   631: ifnonnull       638
        //   634: getstatic       anxg.a:Lanxg;
        //   637: astore_1       
        //   638: aload_1        
        //   639: getfield        anxg.b:I
        //   642: ldc             163011016
        //   644: if_icmpne       658
        //   647: aload_1        
        //   648: getfield        anxg.c:Ljava/lang/Object;
        //   651: checkcast       Lanxk;
        //   654: astore_1       
        //   655: goto            662
        //   658: getstatic       anxk.a:Lanxk;
        //   661: astore_1       
        //   662: aload_1        
        //   663: getfield        anxk.c:Lahab;
        //   666: invokevirtual   ahab.I:()[B
        //   669: astore_1       
        //   670: aload           15
        //   672: aload_1        
        //   673: putfield        jln.c:[B
        //   676: aload           13
        //   678: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   681: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   684: checkcast       Lanxf;
        //   687: invokevirtual   ahbh.toBuilder:()Lahaz;
        //   690: checkcast       Lahbb;
        //   693: astore_1       
        //   694: aload_1        
        //   695: invokevirtual   ahaz.copyOnWrite:()V
        //   698: aload_1        
        //   699: getfield        ahbb.instance:Lahbh;
        //   702: checkcast       Lanxf;
        //   705: astore          12
        //   707: aload           12
        //   709: aconst_null    
        //   710: putfield        anxf.g:Lanxg;
        //   713: aload           12
        //   715: aload           12
        //   717: getfield        anxf.b:I
        //   720: bipush          -17
        //   722: iand           
        //   723: putfield        anxf.b:I
        //   726: aload_1        
        //   727: invokevirtual   ahaz.build:()Lahbh;
        //   730: checkcast       Lanxf;
        //   733: astore          14
        //   735: aload           14
        //   737: getfield        anxf.b:I
        //   740: sipush          16384
        //   743: iand           
        //   744: ifeq            775
        //   747: aload           14
        //   749: getfield        anxf.j:Lanxl;
        //   752: astore          12
        //   754: aload           12
        //   756: astore_1       
        //   757: aload           12
        //   759: ifnonnull       766
        //   762: getstatic       anxl.a:Lanxl;
        //   765: astore_1       
        //   766: aload           15
        //   768: aload_1        
        //   769: getfield        anxl.c:Z
        //   772: putfield        jln.e:Z
        //   775: aload           13
        //   777: invokevirtual   ahbh.toBuilder:()Lahaz;
        //   780: checkcast       Lahbb;
        //   783: astore_1       
        //   784: aload_1        
        //   785: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   788: aload           14
        //   790: invokevirtual   ahbb.e:(Lahaq;Ljava/lang/Object;)V
        //   793: aload_1        
        //   794: invokevirtual   ahaz.build:()Lahbh;
        //   797: checkcast       Laiqj;
        //   800: astore          12
        //   802: aload_0        
        //   803: getfield        got.i:Lbx;
        //   806: astore          14
        //   808: getstatic       aohl.a:Laohl;
        //   811: astore          16
        //   813: aload_2        
        //   814: ldc_w           "com.google.android.libraries.youtube.innertube.endpoint.tag"
        //   817: ldc_w           [B.class
        //   820: invokestatic    tpe.O:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //   823: checkcast       [B
        //   826: astore          15
        //   828: aload           12
        //   830: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   833: pop            
        //   834: aload           12
        //   836: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   839: invokevirtual   ahbc.ry:(Lahaq;)Z
        //   842: invokestatic    adkp.H:(Z)V
        //   845: aload           12
        //   847: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lahbf;
        //   850: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   853: checkcast       Lanxf;
        //   856: astore          17
        //   858: aload           17
        //   860: getfield        anxf.b:I
        //   863: iconst_4       
        //   864: iand           
        //   865: ifeq            923
        //   868: aload           17
        //   870: getfield        anxf.e:Lanxi;
        //   873: astore          13
        //   875: aload           13
        //   877: astore_1       
        //   878: aload           13
        //   880: ifnonnull       887
        //   883: getstatic       anxi.a:Lanxi;
        //   886: astore_1       
        //   887: aload_1        
        //   888: getfield        anxi.b:I
        //   891: iconst_1       
        //   892: iand           
        //   893: ifeq            923
        //   896: aload_1        
        //   897: getfield        anxi.c:Lanxh;
        //   900: astore          13
        //   902: aload           13
        //   904: astore_1       
        //   905: aload           13
        //   907: ifnonnull       914
        //   910: getstatic       anxh.a:Lanxh;
        //   913: astore_1       
        //   914: aload_1        
        //   915: getfield        anxh.b:Z
        //   918: istore          5
        //   920: goto            926
        //   923: iconst_0       
        //   924: istore          5
        //   926: aload           17
        //   928: getstatic       anxe.b:Lahbf;
        //   931: invokevirtual   ahbc.ry:(Lahaq;)Z
        //   934: ifeq            960
        //   937: aload           17
        //   939: getstatic       anxe.b:Lahbf;
        //   942: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   945: checkcast       Ljava/lang/Boolean;
        //   948: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   951: ifeq            960
        //   954: iconst_1       
        //   955: istore          6
        //   957: goto            963
        //   960: iconst_0       
        //   961: istore          6
        //   963: aload           17
        //   965: getstatic       anxe.c:Lahbf;
        //   968: invokevirtual   ahbc.ry:(Lahaq;)Z
        //   971: ifeq            997
        //   974: aload           17
        //   976: getstatic       anxe.c:Lahbf;
        //   979: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //   982: checkcast       Ljava/lang/Boolean;
        //   985: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   988: ifeq            997
        //   991: iconst_1       
        //   992: istore          7
        //   994: goto            1000
        //   997: iconst_0       
        //   998: istore          7
        //  1000: aload           17
        //  1002: getstatic       anxe.d:Lahbf;
        //  1005: invokevirtual   ahbc.ry:(Lahaq;)Z
        //  1008: ifeq            1029
        //  1011: aload           17
        //  1013: getstatic       anxe.d:Lahbf;
        //  1016: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //  1019: checkcast       Ljava/lang/Integer;
        //  1022: invokevirtual   java/lang/Integer.intValue:()I
        //  1025: istore_3       
        //  1026: goto            1031
        //  1029: iconst_0       
        //  1030: istore_3       
        //  1031: aload           17
        //  1033: getstatic       anxe.f:Lahbf;
        //  1036: invokevirtual   ahbc.ry:(Lahaq;)Z
        //  1039: ifeq            1065
        //  1042: aload           17
        //  1044: getstatic       anxe.f:Lahbf;
        //  1047: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //  1050: checkcast       Ljava/lang/Boolean;
        //  1053: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1056: ifeq            1065
        //  1059: iconst_1       
        //  1060: istore          8
        //  1062: goto            1068
        //  1065: iconst_0       
        //  1066: istore          8
        //  1068: aload           17
        //  1070: getfield        anxf.b:I
        //  1073: sipush          16384
        //  1076: iand           
        //  1077: ifeq            1112
        //  1080: aload           17
        //  1082: getfield        anxf.j:Lanxl;
        //  1085: astore          13
        //  1087: aload           13
        //  1089: astore_1       
        //  1090: aload           13
        //  1092: ifnonnull       1099
        //  1095: getstatic       anxl.a:Lanxl;
        //  1098: astore_1       
        //  1099: aload_1        
        //  1100: getfield        anxl.c:Z
        //  1103: ifeq            1112
        //  1106: iconst_1       
        //  1107: istore          9
        //  1109: goto            1115
        //  1112: iconst_0       
        //  1113: istore          9
        //  1115: aload           17
        //  1117: getfield        anxf.b:I
        //  1120: sipush          16384
        //  1123: iand           
        //  1124: ifeq            1156
        //  1127: aload           17
        //  1129: getfield        anxf.j:Lanxl;
        //  1132: astore          13
        //  1134: aload           13
        //  1136: astore_1       
        //  1137: aload           13
        //  1139: ifnonnull       1146
        //  1142: getstatic       anxl.a:Lanxl;
        //  1145: astore_1       
        //  1146: aload_1        
        //  1147: getfield        anxl.d:Z
        //  1150: ifeq            1156
        //  1153: goto            1159
        //  1156: iconst_0       
        //  1157: istore          10
        //  1159: invokestatic    acxt.a:()Lacxs;
        //  1162: astore_1       
        //  1163: aload_1        
        //  1164: iload           9
        //  1166: invokevirtual   acxs.c:(Z)V
        //  1169: aload_1        
        //  1170: iload           10
        //  1172: invokevirtual   acxs.b:(Z)V
        //  1175: aload_1        
        //  1176: invokevirtual   acxs.a:()Lacxt;
        //  1179: astore          18
        //  1181: aload           17
        //  1183: getfield        anxf.b:I
        //  1186: sipush          8192
        //  1189: iand           
        //  1190: ifeq            1202
        //  1193: aload           17
        //  1195: getfield        anxf.i:Ljava/lang/String;
        //  1198: astore_1       
        //  1199: goto            1206
        //  1202: ldc_w           ""
        //  1205: astore_1       
        //  1206: aload           17
        //  1208: getstatic       anxe.e:Lahbf;
        //  1211: invokevirtual   ahbc.ry:(Lahaq;)Z
        //  1214: ifeq            1236
        //  1217: aload           17
        //  1219: getstatic       anxe.e:Lahbf;
        //  1222: invokevirtual   ahbc.rx:(Lahaq;)Ljava/lang/Object;
        //  1225: checkcast       Ljava/lang/Integer;
        //  1228: invokevirtual   java/lang/Integer.intValue:()I
        //  1231: istore          4
        //  1233: goto            1239
        //  1236: iconst_0       
        //  1237: istore          4
        //  1239: aload           17
        //  1241: getfield        anxf.b:I
        //  1244: ldc_w           32768
        //  1247: iand           
        //  1248: ifeq            1261
        //  1251: aload           17
        //  1253: getfield        anxf.k:Ljava/lang/String;
        //  1256: astore          13
        //  1258: goto            1266
        //  1261: ldc_w           ""
        //  1264: astore          13
        //  1266: aload           14
        //  1268: aload           12
        //  1270: aload           16
        //  1272: aload           15
        //  1274: iload           5
        //  1276: aload           11
        //  1278: iload           6
        //  1280: iload           7
        //  1282: iload_3        
        //  1283: iload           4
        //  1285: aload_1        
        //  1286: aload           18
        //  1288: iload           8
        //  1290: aload           13
        //  1292: invokevirtual   bx.U:(Laiqj;Laohl;[BZLakcf;ZZIILjava/lang/String;Lacxt;ZLjava/lang/String;)Lcom/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor;
        //  1295: astore_1       
        //  1296: aload_1        
        //  1297: aload           12
        //  1299: invokevirtual   com/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor.l:(Laiqj;)V
        //  1302: goto            1499
        //  1305: aload_2        
        //  1306: ldc_w           "parent_ve_type"
        //  1309: ldc_w           -2147483648
        //  1312: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1315: invokestatic    tpe.N:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1318: checkcast       Ljava/lang/Integer;
        //  1321: invokevirtual   java/lang/Integer.intValue:()I
        //  1324: istore_3       
        //  1325: aload_2        
        //  1326: ldc_w           "parent_csn"
        //  1329: ldc             Ljava/lang/String;.class
        //  1331: invokestatic    tpe.O:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //  1334: checkcast       Ljava/lang/String;
        //  1337: astore          13
        //  1339: aload           14
        //  1341: getfield        anxf.j:Lanxl;
        //  1344: astore          12
        //  1346: aload           12
        //  1348: astore          11
        //  1350: aload           12
        //  1352: ifnonnull       1360
        //  1355: getstatic       anxl.a:Lanxl;
        //  1358: astore          11
        //  1360: aload           11
        //  1362: getfield        anxl.c:Z
        //  1365: istore          5
        //  1367: aload           14
        //  1369: getfield        anxf.j:Lanxl;
        //  1372: astore          12
        //  1374: aload           12
        //  1376: astore          11
        //  1378: aload           12
        //  1380: ifnonnull       1388
        //  1383: getstatic       anxl.a:Lanxl;
        //  1386: astore          11
        //  1388: aload           11
        //  1390: getfield        anxl.d:Z
        //  1393: istore          6
        //  1395: invokestatic    acxt.a:()Lacxs;
        //  1398: astore          11
        //  1400: aload           11
        //  1402: iload           5
        //  1404: invokevirtual   acxs.c:(Z)V
        //  1407: aload           11
        //  1409: iload           6
        //  1411: invokevirtual   acxs.b:(Z)V
        //  1414: aload           11
        //  1416: invokevirtual   acxs.a:()Lacxt;
        //  1419: astore          11
        //  1421: aload           14
        //  1423: getfield        anxf.h:Z
        //  1426: ifeq            1473
        //  1429: aload           14
        //  1431: getfield        anxf.d:Ljava/lang/String;
        //  1434: astore_1       
        //  1435: aload_0        
        //  1436: getfield        got.f:Lphp;
        //  1439: aload_0        
        //  1440: getfield        got.b:Lghb;
        //  1443: invokeinterface ghb.f:()Lggq;
        //  1448: aload_0        
        //  1449: getfield        got.h:Lblu;
        //  1452: aload_1        
        //  1453: aconst_null    
        //  1454: invokevirtual   blu.z:(Ljava/lang/String;Ljava/lang/String;)Lqcy;
        //  1457: aload_1        
        //  1458: aload_0        
        //  1459: getfield        got.e:Lwyw;
        //  1462: aload           11
        //  1464: invokevirtual   php.y:(Lbr;Lqcy;Ljava/lang/String;Lwyw;Lacxt;)Ljna;
        //  1467: aconst_null    
        //  1468: iconst_0       
        //  1469: invokevirtual   jna.c:([BZ)V
        //  1472: return         
        //  1473: aload_0        
        //  1474: getfield        got.g:Laln;
        //  1477: astore          12
        //  1479: aload_1        
        //  1480: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1483: pop            
        //  1484: aload           12
        //  1486: aload_1        
        //  1487: aload           13
        //  1489: iload_3        
        //  1490: iconst_0       
        //  1491: iconst_m1      
        //  1492: aconst_null    
        //  1493: aload           11
        //  1495: invokevirtual   aln.Q:(Laiqj;Ljava/lang/String;IZILjava/lang/String;Lacxt;)Lcom/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor;
        //  1498: astore_1       
        //  1499: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //  1502: aload_2        
        //  1503: ldc_w           "replace_previous_search_result_page"
        //  1506: invokestatic    tpe.M:(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
        //  1509: invokestatic    j$/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1512: ifeq            1534
        //  1515: aload_1        
        //  1516: new             Lgos;
        //  1519: dup            
        //  1520: aload_0        
        //  1521: getfield        got.i:Lbx;
        //  1524: aconst_null    
        //  1525: aconst_null    
        //  1526: aconst_null    
        //  1527: aconst_null    
        //  1528: invokespecial   gos.<init>:(Lbx;[B[B[B[B)V
        //  1531: putfield        com/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor.d:Laezs;
        //  1534: aload_0        
        //  1535: getfield        got.a:Lggr;
        //  1538: aload_1        
        //  1539: invokeinterface ggr.d:(Lcom/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor;)V
        //  1544: return         
        //  1545: astore_1       
        //  1546: goto            543
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  439    452    455    459    Ljava/io/IOException;
        //  464    477    455    459    Ljava/io/IOException;
        //  480    487    455    459    Ljava/io/IOException;
        //  487    493    503    546    Any
        //  493    497    455    459    Ljava/io/IOException;
        //  505    509    512    543    Any
        //  513    543    1545   1549   Ljava/lang/Exception;
        //  543    546    455    459    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0543:
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
