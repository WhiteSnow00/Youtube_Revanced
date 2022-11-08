import java.util.Map;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gom implements vau, fbz
{
    private final ggi a;
    private final ggs b;
    private final SharedPreferences c;
    private final jkl d;
    private final wwv e;
    private final pgf f;
    private final blt g;
    private final alm h;
    private final bx i;
    
    public gom(final ggi a, final ggs b, final SharedPreferences c, final jkl d, final alm h, final blt g, final bx i, final pgf f, final wwv e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.g = g;
        this.i = i;
        this.f = f;
        this.e = e;
    }
    
    public final void mE(final aioe p0, final Map p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aload_3        
        //     3: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //     6: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //     9: checkcast       Lanvb;
        //    12: astore          4
        //    14: aload           4
        //    16: getfield        anvb.c:Ljava/lang/String;
        //    19: invokevirtual   java/lang/String.isEmpty:()Z
        //    22: ifne            1288
        //    25: aload_0        
        //    26: getfield        gom.c:Landroid/content/SharedPreferences;
        //    29: astore          5
        //    31: aload           5
        //    33: ifnull          52
        //    36: aload           5
        //    38: ldc             "force_enable_sticky_browsy_bars"
        //    40: iconst_0       
        //    41: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    46: ifeq            52
        //    49: goto            116
        //    52: aload_3        
        //    53: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //    56: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //    59: checkcast       Lanvb;
        //    62: getfield        anvb.e:Lanve;
        //    65: astore          6
        //    67: aload           6
        //    69: astore          5
        //    71: aload           6
        //    73: ifnonnull       81
        //    76: getstatic       anve.a:Lanve;
        //    79: astore          5
        //    81: aload           5
        //    83: getfield        anve.c:Lanvd;
        //    86: astore          6
        //    88: aload           6
        //    90: astore          5
        //    92: aload           6
        //    94: ifnonnull       102
        //    97: getstatic       anvd.a:Lanvd;
        //   100: astore          5
        //   102: aload           5
        //   104: getfield        anvd.c:Z
        //   107: ifne            116
        //   110: aconst_null    
        //   111: astore          5
        //   113: goto            129
        //   116: aload_2        
        //   117: ldc             "HORIZONTAL_CARD_LIST"
        //   119: ldc             Lakac;.class
        //   121: invokestatic    tmy.O:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //   124: checkcast       Lakac;
        //   127: astore          5
        //   129: aload_0        
        //   130: getfield        gom.d:Ljkl;
        //   133: astore          7
        //   135: aload_3        
        //   136: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   139: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   142: checkcast       Lanvb;
        //   145: getfield        anvb.g:Lanvc;
        //   148: astore          4
        //   150: aload           4
        //   152: astore          6
        //   154: aload           4
        //   156: ifnonnull       164
        //   159: getstatic       anvc.a:Lanvc;
        //   162: astore          6
        //   164: aload           6
        //   166: getfield        anvc.b:I
        //   169: ldc             163011016
        //   171: if_icmpne       187
        //   174: aload           6
        //   176: getfield        anvc.c:Ljava/lang/Object;
        //   179: checkcast       Lanvg;
        //   182: astore          6
        //   184: goto            192
        //   187: getstatic       anvg.a:Lanvg;
        //   190: astore          6
        //   192: aload           6
        //   194: getfield        anvg.b:I
        //   197: istore          8
        //   199: iconst_1       
        //   200: istore          9
        //   202: iload           8
        //   204: iconst_1       
        //   205: iand           
        //   206: ifeq            212
        //   209: goto            222
        //   212: aload_3        
        //   213: astore          6
        //   215: aload_1        
        //   216: invokestatic    jkl.a:(Laioe;)Z
        //   219: ifeq            797
        //   222: aload           7
        //   224: aload_3        
        //   225: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   228: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   231: checkcast       Lanvb;
        //   234: getfield        anvb.c:Ljava/lang/String;
        //   237: putfield        jkl.d:Ljava/lang/String;
        //   240: aload_1        
        //   241: invokevirtual   agzi.toBuilder:()Lagza;
        //   244: checkcast       Lagzc;
        //   247: astore_1       
        //   248: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   251: astore          6
        //   253: aload_3        
        //   254: aload           6
        //   256: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   259: checkcast       Lanvb;
        //   262: invokevirtual   agzi.toBuilder:()Lagza;
        //   265: checkcast       Lagzc;
        //   268: astore_3       
        //   269: aload_3        
        //   270: getstatic       anva.f:Lagzg;
        //   273: iconst_1       
        //   274: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   277: invokevirtual   agzc.e:(Lagyr;Ljava/lang/Object;)V
        //   280: aload_1        
        //   281: aload           6
        //   283: aload_3        
        //   284: invokevirtual   agza.build:()Lagzi;
        //   287: checkcast       Lanvb;
        //   290: invokevirtual   agzc.e:(Lagyr;Ljava/lang/Object;)V
        //   293: aload_1        
        //   294: invokevirtual   agza.build:()Lagzi;
        //   297: checkcast       Laioe;
        //   300: astore_3       
        //   301: aload_3        
        //   302: invokestatic    jkl.a:(Laioe;)Z
        //   305: ifeq            608
        //   308: aload_3        
        //   309: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   312: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   315: checkcast       Lanvb;
        //   318: getfield        anvb.g:Lanvc;
        //   321: astore          6
        //   323: aload           6
        //   325: astore_1       
        //   326: aload           6
        //   328: ifnonnull       335
        //   331: getstatic       anvc.a:Lanvc;
        //   334: astore_1       
        //   335: aload_1        
        //   336: getfield        anvc.b:I
        //   339: ldc             163011016
        //   341: if_icmpne       355
        //   344: aload_1        
        //   345: getfield        anvc.c:Ljava/lang/Object;
        //   348: checkcast       Lanvg;
        //   351: astore_1       
        //   352: goto            359
        //   355: getstatic       anvg.a:Lanvg;
        //   358: astore_1       
        //   359: aload_1        
        //   360: getfield        anvg.d:Lanvf;
        //   363: astore          6
        //   365: aload           6
        //   367: astore_1       
        //   368: aload           6
        //   370: ifnonnull       377
        //   373: getstatic       anvf.a:Lanvf;
        //   376: astore_1       
        //   377: aload_1        
        //   378: getfield        anvf.b:I
        //   381: iconst_2       
        //   382: iand           
        //   383: ifeq            596
        //   386: aload_1        
        //   387: getfield        anvf.d:Lagyc;
        //   390: astore          6
        //   392: aload           6
        //   394: invokevirtual   agyc.H:()Z
        //   397: ifeq            406
        //   400: aload           6
        //   402: astore_1       
        //   403: goto            600
        //   406: aload_1        
        //   407: getfield        anvf.c:I
        //   410: invokestatic    aqql.bI:(I)I
        //   413: istore          8
        //   415: iload           8
        //   417: ifne            426
        //   420: iconst_1       
        //   421: istore          8
        //   423: goto            426
        //   426: iload           8
        //   428: iconst_4       
        //   429: if_icmpne       452
        //   432: new             Ljava/util/zip/GZIPInputStream;
        //   435: astore_1       
        //   436: aload_1        
        //   437: aload           6
        //   439: invokevirtual   agyc.m:()Ljava/io/InputStream;
        //   442: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //   445: goto            481
        //   448: astore_1       
        //   449: goto            540
        //   452: iload           8
        //   454: iconst_3       
        //   455: if_icmpne       474
        //   458: new             Latzr;
        //   461: dup            
        //   462: aload           6
        //   464: invokevirtual   agyc.m:()Ljava/io/InputStream;
        //   467: invokespecial   atzr.<init>:(Ljava/io/InputStream;)V
        //   470: astore_1       
        //   471: goto            481
        //   474: getstatic       agyc.b:Lagyc;
        //   477: invokevirtual   agyc.m:()Ljava/io/InputStream;
        //   480: astore_1       
        //   481: aload_1        
        //   482: invokestatic    agyc.B:(Ljava/io/InputStream;)Lagyc;
        //   485: astore          6
        //   487: aload_1        
        //   488: invokevirtual   java/io/InputStream.close:()V
        //   491: aload           6
        //   493: astore_1       
        //   494: goto            600
        //   497: astore          6
        //   499: aload_1        
        //   500: invokevirtual   java/io/InputStream.close:()V
        //   503: goto            537
        //   506: astore_1       
        //   507: ldc             Ljava/lang/Throwable;.class
        //   509: ldc             "addSuppressed"
        //   511: iconst_1       
        //   512: anewarray       Ljava/lang/Class;
        //   515: dup            
        //   516: iconst_0       
        //   517: ldc             Ljava/lang/Throwable;.class
        //   519: aastore        
        //   520: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   523: aload           6
        //   525: iconst_1       
        //   526: anewarray       Ljava/lang/Object;
        //   529: dup            
        //   530: iconst_0       
        //   531: aload_1        
        //   532: aastore        
        //   533: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   536: pop            
        //   537: aload           6
        //   539: athrow         
        //   540: aload_1        
        //   541: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   544: astore_1       
        //   545: new             Ljava/lang/StringBuilder;
        //   548: dup            
        //   549: ldc             "Failed to decompress "
        //   551: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   554: astore          6
        //   556: aload           6
        //   558: iload           8
        //   560: iconst_1       
        //   561: isub           
        //   562: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   565: pop            
        //   566: aload           6
        //   568: ldc             ": "
        //   570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   573: pop            
        //   574: aload           6
        //   576: aload_1        
        //   577: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   580: pop            
        //   581: aload           6
        //   583: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   586: invokestatic    trn.b:(Ljava/lang/String;)V
        //   589: getstatic       agyc.b:Lagyc;
        //   592: astore_1       
        //   593: goto            600
        //   596: getstatic       agyc.b:Lagyc;
        //   599: astore_1       
        //   600: aload_1        
        //   601: invokevirtual   agyc.I:()[B
        //   604: astore_1       
        //   605: goto            667
        //   608: aload_3        
        //   609: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   612: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   615: checkcast       Lanvb;
        //   618: getfield        anvb.g:Lanvc;
        //   621: astore          6
        //   623: aload           6
        //   625: astore_1       
        //   626: aload           6
        //   628: ifnonnull       635
        //   631: getstatic       anvc.a:Lanvc;
        //   634: astore_1       
        //   635: aload_1        
        //   636: getfield        anvc.b:I
        //   639: ldc             163011016
        //   641: if_icmpne       655
        //   644: aload_1        
        //   645: getfield        anvc.c:Ljava/lang/Object;
        //   648: checkcast       Lanvg;
        //   651: astore_1       
        //   652: goto            659
        //   655: getstatic       anvg.a:Lanvg;
        //   658: astore_1       
        //   659: aload_1        
        //   660: getfield        anvg.c:Lagyc;
        //   663: invokevirtual   agyc.I:()[B
        //   666: astore_1       
        //   667: aload           7
        //   669: aload_1        
        //   670: putfield        jkl.c:[B
        //   673: aload_3        
        //   674: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   677: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   680: checkcast       Lanvb;
        //   683: invokevirtual   agzi.toBuilder:()Lagza;
        //   686: checkcast       Lagzc;
        //   689: astore          6
        //   691: aload           6
        //   693: invokevirtual   agza.copyOnWrite:()V
        //   696: aload           6
        //   698: getfield        agzc.instance:Lagzi;
        //   701: checkcast       Lanvb;
        //   704: astore_1       
        //   705: aload_1        
        //   706: aconst_null    
        //   707: putfield        anvb.g:Lanvc;
        //   710: aload_1        
        //   711: aload_1        
        //   712: getfield        anvb.b:I
        //   715: bipush          -17
        //   717: iand           
        //   718: putfield        anvb.b:I
        //   721: aload           6
        //   723: invokevirtual   agza.build:()Lagzi;
        //   726: checkcast       Lanvb;
        //   729: astore          4
        //   731: aload           4
        //   733: getfield        anvb.b:I
        //   736: sipush          16384
        //   739: iand           
        //   740: ifeq            771
        //   743: aload           4
        //   745: getfield        anvb.j:Lanvh;
        //   748: astore          6
        //   750: aload           6
        //   752: astore_1       
        //   753: aload           6
        //   755: ifnonnull       762
        //   758: getstatic       anvh.a:Lanvh;
        //   761: astore_1       
        //   762: aload           7
        //   764: aload_1        
        //   765: getfield        anvh.c:Z
        //   768: putfield        jkl.e:Z
        //   771: aload_3        
        //   772: invokevirtual   agzi.toBuilder:()Lagza;
        //   775: checkcast       Lagzc;
        //   778: astore_1       
        //   779: aload_1        
        //   780: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   783: aload           4
        //   785: invokevirtual   agzc.e:(Lagyr;Ljava/lang/Object;)V
        //   788: aload_1        
        //   789: invokevirtual   agza.build:()Lagzi;
        //   792: checkcast       Laioe;
        //   795: astore          6
        //   797: aload_0        
        //   798: getfield        gom.i:Lbx;
        //   801: astore          10
        //   803: getstatic       aofi.a:Laofi;
        //   806: astore          7
        //   808: aload_2        
        //   809: ldc_w           "com.google.android.libraries.youtube.innertube.endpoint.tag"
        //   812: ldc_w           [B.class
        //   815: invokestatic    tmy.O:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //   818: checkcast       [B
        //   821: astore          4
        //   823: aload           6
        //   825: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   828: pop            
        //   829: aload           6
        //   831: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   834: invokevirtual   agzd.rs:(Lagyr;)Z
        //   837: invokestatic    agot.u:(Z)V
        //   840: aload           6
        //   842: getstatic       com/google/protos/youtube/api/innertube/SearchEndpointOuterClass.searchEndpoint:Lagzg;
        //   845: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   848: checkcast       Lanvb;
        //   851: astore          11
        //   853: aload           11
        //   855: getfield        anvb.b:I
        //   858: iconst_4       
        //   859: iand           
        //   860: ifeq            912
        //   863: aload           11
        //   865: getfield        anvb.e:Lanve;
        //   868: astore_3       
        //   869: aload_3        
        //   870: astore_1       
        //   871: aload_3        
        //   872: ifnonnull       879
        //   875: getstatic       anve.a:Lanve;
        //   878: astore_1       
        //   879: aload_1        
        //   880: getfield        anve.b:I
        //   883: iconst_1       
        //   884: iand           
        //   885: ifeq            912
        //   888: aload_1        
        //   889: getfield        anve.c:Lanvd;
        //   892: astore_3       
        //   893: aload_3        
        //   894: astore_1       
        //   895: aload_3        
        //   896: ifnonnull       903
        //   899: getstatic       anvd.a:Lanvd;
        //   902: astore_1       
        //   903: aload_1        
        //   904: getfield        anvd.b:Z
        //   907: istore          12
        //   909: goto            915
        //   912: iconst_0       
        //   913: istore          12
        //   915: aload           11
        //   917: getstatic       anva.b:Lagzg;
        //   920: invokevirtual   agzd.rs:(Lagyr;)Z
        //   923: ifeq            949
        //   926: aload           11
        //   928: getstatic       anva.b:Lagzg;
        //   931: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   934: checkcast       Ljava/lang/Boolean;
        //   937: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   940: ifeq            949
        //   943: iconst_1       
        //   944: istore          13
        //   946: goto            952
        //   949: iconst_0       
        //   950: istore          13
        //   952: aload           11
        //   954: getstatic       anva.c:Lagzg;
        //   957: invokevirtual   agzd.rs:(Lagyr;)Z
        //   960: ifeq            986
        //   963: aload           11
        //   965: getstatic       anva.c:Lagzg;
        //   968: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //   971: checkcast       Ljava/lang/Boolean;
        //   974: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   977: ifeq            986
        //   980: iconst_1       
        //   981: istore          14
        //   983: goto            989
        //   986: iconst_0       
        //   987: istore          14
        //   989: aload           11
        //   991: getstatic       anva.d:Lagzg;
        //   994: invokevirtual   agzd.rs:(Lagyr;)Z
        //   997: ifeq            1019
        //  1000: aload           11
        //  1002: getstatic       anva.d:Lagzg;
        //  1005: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //  1008: checkcast       Ljava/lang/Integer;
        //  1011: invokevirtual   java/lang/Integer.intValue:()I
        //  1014: istore          8
        //  1016: goto            1022
        //  1019: iconst_0       
        //  1020: istore          8
        //  1022: aload           11
        //  1024: getstatic       anva.f:Lagzg;
        //  1027: invokevirtual   agzd.rs:(Lagyr;)Z
        //  1030: ifeq            1056
        //  1033: aload           11
        //  1035: getstatic       anva.f:Lagzg;
        //  1038: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //  1041: checkcast       Ljava/lang/Boolean;
        //  1044: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1047: ifeq            1056
        //  1050: iconst_1       
        //  1051: istore          15
        //  1053: goto            1059
        //  1056: iconst_0       
        //  1057: istore          15
        //  1059: aload           11
        //  1061: getfield        anvb.b:I
        //  1064: sipush          16384
        //  1067: iand           
        //  1068: ifeq            1100
        //  1071: aload           11
        //  1073: getfield        anvb.j:Lanvh;
        //  1076: astore_3       
        //  1077: aload_3        
        //  1078: astore_1       
        //  1079: aload_3        
        //  1080: ifnonnull       1087
        //  1083: getstatic       anvh.a:Lanvh;
        //  1086: astore_1       
        //  1087: aload_1        
        //  1088: getfield        anvh.c:Z
        //  1091: ifeq            1100
        //  1094: iconst_1       
        //  1095: istore          16
        //  1097: goto            1103
        //  1100: iconst_0       
        //  1101: istore          16
        //  1103: aload           11
        //  1105: getfield        anvb.b:I
        //  1108: sipush          16384
        //  1111: iand           
        //  1112: ifeq            1141
        //  1115: aload           11
        //  1117: getfield        anvb.j:Lanvh;
        //  1120: astore_3       
        //  1121: aload_3        
        //  1122: astore_1       
        //  1123: aload_3        
        //  1124: ifnonnull       1131
        //  1127: getstatic       anvh.a:Lanvh;
        //  1130: astore_1       
        //  1131: aload_1        
        //  1132: getfield        anvh.d:Z
        //  1135: ifeq            1141
        //  1138: goto            1144
        //  1141: iconst_0       
        //  1142: istore          9
        //  1144: invokestatic    acvr.a:()Lacvq;
        //  1147: astore_1       
        //  1148: aload_1        
        //  1149: iload           16
        //  1151: invokevirtual   acvq.c:(Z)V
        //  1154: aload_1        
        //  1155: iload           9
        //  1157: invokevirtual   acvq.b:(Z)V
        //  1160: aload_1        
        //  1161: invokevirtual   acvq.a:()Lacvr;
        //  1164: astore          17
        //  1166: aload           11
        //  1168: getfield        anvb.b:I
        //  1171: sipush          8192
        //  1174: iand           
        //  1175: ifeq            1187
        //  1178: aload           11
        //  1180: getfield        anvb.i:Ljava/lang/String;
        //  1183: astore_1       
        //  1184: goto            1191
        //  1187: ldc_w           ""
        //  1190: astore_1       
        //  1191: aload           11
        //  1193: getstatic       anva.e:Lagzg;
        //  1196: invokevirtual   agzd.rs:(Lagyr;)Z
        //  1199: ifeq            1221
        //  1202: aload           11
        //  1204: getstatic       anva.e:Lagzg;
        //  1207: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //  1210: checkcast       Ljava/lang/Integer;
        //  1213: invokevirtual   java/lang/Integer.intValue:()I
        //  1216: istore          18
        //  1218: goto            1224
        //  1221: iconst_0       
        //  1222: istore          18
        //  1224: aload           11
        //  1226: getfield        anvb.b:I
        //  1229: ldc_w           32768
        //  1232: iand           
        //  1233: ifeq            1245
        //  1236: aload           11
        //  1238: getfield        anvb.k:Ljava/lang/String;
        //  1241: astore_3       
        //  1242: goto            1249
        //  1245: ldc_w           ""
        //  1248: astore_3       
        //  1249: aload           10
        //  1251: aload           6
        //  1253: aload           7
        //  1255: aload           4
        //  1257: iload           12
        //  1259: aload           5
        //  1261: iload           13
        //  1263: iload           14
        //  1265: iload           8
        //  1267: iload           18
        //  1269: aload_1        
        //  1270: aload           17
        //  1272: iload           15
        //  1274: aload_3        
        //  1275: invokevirtual   bx.U:(Laioe;Laofi;[BZLakac;ZZIILjava/lang/String;Lacvr;ZLjava/lang/String;)Lcom/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor;
        //  1278: astore_1       
        //  1279: aload_1        
        //  1280: aload           6
        //  1282: invokevirtual   com/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor.l:(Laioe;)V
        //  1285: goto            1482
        //  1288: aload_2        
        //  1289: ldc_w           "parent_ve_type"
        //  1292: ldc_w           -2147483648
        //  1295: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1298: invokestatic    tmy.N:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1301: checkcast       Ljava/lang/Integer;
        //  1304: invokevirtual   java/lang/Integer.intValue:()I
        //  1307: istore          8
        //  1309: aload_2        
        //  1310: ldc_w           "parent_csn"
        //  1313: ldc             Ljava/lang/String;.class
        //  1315: invokestatic    tmy.O:(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //  1318: checkcast       Ljava/lang/String;
        //  1321: astore_3       
        //  1322: aload           4
        //  1324: getfield        anvb.j:Lanvh;
        //  1327: astore          6
        //  1329: aload           6
        //  1331: astore          5
        //  1333: aload           6
        //  1335: ifnonnull       1343
        //  1338: getstatic       anvh.a:Lanvh;
        //  1341: astore          5
        //  1343: aload           5
        //  1345: getfield        anvh.c:Z
        //  1348: istore          13
        //  1350: aload           4
        //  1352: getfield        anvb.j:Lanvh;
        //  1355: astore          6
        //  1357: aload           6
        //  1359: astore          5
        //  1361: aload           6
        //  1363: ifnonnull       1371
        //  1366: getstatic       anvh.a:Lanvh;
        //  1369: astore          5
        //  1371: aload           5
        //  1373: getfield        anvh.d:Z
        //  1376: istore          12
        //  1378: invokestatic    acvr.a:()Lacvq;
        //  1381: astore          5
        //  1383: aload           5
        //  1385: iload           13
        //  1387: invokevirtual   acvq.c:(Z)V
        //  1390: aload           5
        //  1392: iload           12
        //  1394: invokevirtual   acvq.b:(Z)V
        //  1397: aload           5
        //  1399: invokevirtual   acvq.a:()Lacvr;
        //  1402: astore          5
        //  1404: aload           4
        //  1406: getfield        anvb.h:Z
        //  1409: ifeq            1456
        //  1412: aload           4
        //  1414: getfield        anvb.d:Ljava/lang/String;
        //  1417: astore_1       
        //  1418: aload_0        
        //  1419: getfield        gom.f:Lpgf;
        //  1422: aload_0        
        //  1423: getfield        gom.b:Lggs;
        //  1426: invokeinterface ggs.f:()Lggh;
        //  1431: aload_0        
        //  1432: getfield        gom.g:Lblt;
        //  1435: aload_1        
        //  1436: aconst_null    
        //  1437: invokevirtual   blt.z:(Ljava/lang/String;Ljava/lang/String;)Lqbo;
        //  1440: aload_1        
        //  1441: aload_0        
        //  1442: getfield        gom.e:Lwwv;
        //  1445: aload           5
        //  1447: invokevirtual   pgf.y:(Lbr;Lqbo;Ljava/lang/String;Lwwv;Lacvr;)Ljlx;
        //  1450: aconst_null    
        //  1451: iconst_0       
        //  1452: invokevirtual   jlx.c:([BZ)V
        //  1455: return         
        //  1456: aload_0        
        //  1457: getfield        gom.h:Lalm;
        //  1460: astore          6
        //  1462: aload_1        
        //  1463: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1466: pop            
        //  1467: aload           6
        //  1469: aload_1        
        //  1470: aload_3        
        //  1471: iload           8
        //  1473: iconst_0       
        //  1474: iconst_m1      
        //  1475: aconst_null    
        //  1476: aload           5
        //  1478: invokevirtual   alm.S:(Laioe;Ljava/lang/String;IZILjava/lang/String;Lacvr;)Lcom/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor;
        //  1481: astore_1       
        //  1482: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //  1485: aload_2        
        //  1486: ldc_w           "replace_previous_search_result_page"
        //  1489: invokestatic    tmy.M:(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
        //  1492: invokestatic    j$/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1495: ifeq            1517
        //  1498: aload_1        
        //  1499: new             Lgol;
        //  1502: dup            
        //  1503: aload_0        
        //  1504: getfield        gom.i:Lbx;
        //  1507: aconst_null    
        //  1508: aconst_null    
        //  1509: aconst_null    
        //  1510: aconst_null    
        //  1511: invokespecial   gol.<init>:(Lbx;[B[B[B[B)V
        //  1514: putfield        com/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor.d:Laext;
        //  1517: aload_0        
        //  1518: getfield        gom.a:Lggi;
        //  1521: aload_1        
        //  1522: invokeinterface ggi.d:(Lcom/google/android/apps/youtube/app/common/ui/navigation/PaneDescriptor;)V
        //  1527: return         
        //  1528: astore_1       
        //  1529: goto            537
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  432    445    448    452    Ljava/io/IOException;
        //  458    471    448    452    Ljava/io/IOException;
        //  474    481    448    452    Ljava/io/IOException;
        //  481    487    497    540    Any
        //  487    491    448    452    Ljava/io/IOException;
        //  499    503    506    537    Any
        //  507    537    1528   1532   Ljava/lang/Exception;
        //  537    540    448    452    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0537:
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
