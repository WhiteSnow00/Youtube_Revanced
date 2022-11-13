import java.util.regex.Matcher;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byf extends bxh
{
    private static final Pattern a;
    private final boolean b;
    private final byg c;
    private Map d;
    private float e;
    private float f;
    
    static {
        a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    }
    
    public byf() {
        this(null);
    }
    
    public byf(final List list) {
        super("SsaDecoder");
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.b = true;
            final String n = bax.N((byte[])list.get(0));
            dk.f(n.startsWith("Format:"));
            final byg a = byg.a(n);
            dk.d((Object)a);
            this.c = a;
            this.r(new bas((byte[])list.get(1)));
            return;
        }
        this.b = false;
        this.c = null;
    }
    
    private static float o(final int n) {
        if (n == 0) {
            return 0.05f;
        }
        if (n == 1) {
            return 0.5f;
        }
        if (n != 2) {
            return -3.4028235E38f;
        }
        return 0.95f;
    }
    
    private static int p(final long n, final List list, final List list2) {
        int size = list.size();
        while (true) {
            int n2;
            do {
                n2 = size - 1;
                if (n2 < 0) {
                    final int n3 = 0;
                    list.add(n3, n);
                    ArrayList list3;
                    if (n3 == 0) {
                        list3 = new ArrayList();
                    }
                    else {
                        list3 = new ArrayList(list2.get(n3 - 1));
                    }
                    list2.add(n3, list3);
                    return n3;
                }
                if ((long)list.get(n2) == n) {
                    return n2;
                }
                size = n2;
            } while ((long)list.get(n2) >= n);
            final int n3 = n2 + 1;
            continue;
        }
    }
    
    private static long q(String group) {
        final Matcher matcher = byf.a.matcher(group.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        group = matcher.group(1);
        final int a = bax.a;
        return Long.parseLong(group) * 3600000000L + Long.parseLong(matcher.group(2)) * 60000000L + Long.parseLong(matcher.group(3)) * 1000000L + Long.parseLong(matcher.group(4)) * 10000L;
    }
    
    private final void r(final bas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   bas.t:()Ljava/lang/String;
        //     4: astore          24
        //     6: aload           24
        //     8: ifnull          1455
        //    11: ldc             "[Script Info]"
        //    13: aload           24
        //    15: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    18: istore          20
        //    20: bipush          91
        //    22: istore          18
        //    24: iconst_2       
        //    25: istore          4
        //    27: iconst_0       
        //    28: istore_3       
        //    29: iload           20
        //    31: ifeq            202
        //    34: aload_1        
        //    35: invokevirtual   bas.t:()Ljava/lang/String;
        //    38: astore          24
        //    40: aload           24
        //    42: ifnull          0
        //    45: aload_1        
        //    46: invokevirtual   bas.a:()I
        //    49: ifeq            61
        //    52: aload_1        
        //    53: invokevirtual   bas.c:()I
        //    56: bipush          91
        //    58: if_icmpeq       0
        //    61: aload           24
        //    63: ldc             ":"
        //    65: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    68: astore          25
        //    70: aload           25
        //    72: arraylength    
        //    73: iconst_2       
        //    74: if_icmpne       34
        //    77: aload           25
        //    79: iconst_0       
        //    80: aaload         
        //    81: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    84: invokestatic    aevy.b:(Ljava/lang/String;)Ljava/lang/String;
        //    87: astore          24
        //    89: aload           24
        //    91: invokevirtual   java/lang/String.hashCode:()I
        //    94: tableswitch {
        //          -535668200: 134
        //          -535668199: 119
        //          default: 116
        //        }
        //   116: goto            149
        //   119: aload           24
        //   121: ldc             "playresy"
        //   123: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   126: ifeq            149
        //   129: iconst_1       
        //   130: istore_3       
        //   131: goto            151
        //   134: aload           24
        //   136: ldc             "playresx"
        //   138: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   141: ifeq            149
        //   144: iconst_0       
        //   145: istore_3       
        //   146: goto            151
        //   149: iconst_m1      
        //   150: istore_3       
        //   151: iload_3        
        //   152: ifeq            185
        //   155: iload_3        
        //   156: iconst_1       
        //   157: if_icmpeq       163
        //   160: goto            34
        //   163: aload_0        
        //   164: aload           25
        //   166: iconst_1       
        //   167: aaload         
        //   168: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   171: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   174: putfield        byf.f:F
        //   177: goto            34
        //   180: astore          24
        //   182: goto            34
        //   185: aload_0        
        //   186: aload           25
        //   188: iconst_1       
        //   189: aaload         
        //   190: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   193: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   196: putfield        byf.e:F
        //   199: goto            34
        //   202: ldc             "[V4+ Styles]"
        //   204: aload           24
        //   206: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   209: ifeq            1427
        //   212: new             Ljava/util/LinkedHashMap;
        //   215: dup            
        //   216: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   219: astore          27
        //   221: aconst_null    
        //   222: astore          24
        //   224: iload_3        
        //   225: istore          7
        //   227: iload           4
        //   229: istore          5
        //   231: iload           18
        //   233: istore          6
        //   235: aload_1        
        //   236: invokevirtual   bas.t:()Ljava/lang/String;
        //   239: astore          28
        //   241: aload           28
        //   243: ifnull          1418
        //   246: aload_1        
        //   247: invokevirtual   bas.a:()I
        //   250: ifeq            262
        //   253: aload_1        
        //   254: invokevirtual   bas.c:()I
        //   257: iload           6
        //   259: if_icmpeq       1418
        //   262: aload           28
        //   264: ldc             "Format:"
        //   266: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   269: ifeq            781
        //   272: aload           28
        //   274: bipush          7
        //   276: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   279: ldc             ","
        //   281: invokestatic    android/text/TextUtils.split:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   284: astore          25
        //   286: iconst_0       
        //   287: istore_3       
        //   288: iconst_m1      
        //   289: istore          17
        //   291: iconst_m1      
        //   292: istore          16
        //   294: iconst_m1      
        //   295: istore          15
        //   297: iconst_m1      
        //   298: istore          14
        //   300: iconst_m1      
        //   301: istore          13
        //   303: iconst_m1      
        //   304: istore          12
        //   306: iconst_m1      
        //   307: istore          11
        //   309: iconst_m1      
        //   310: istore          10
        //   312: iconst_m1      
        //   313: istore          9
        //   315: iconst_m1      
        //   316: istore          8
        //   318: aload           25
        //   320: arraylength    
        //   321: istore          19
        //   323: iload_3        
        //   324: iload           19
        //   326: if_icmpge       730
        //   329: aload           25
        //   331: iload_3        
        //   332: aaload         
        //   333: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   336: invokestatic    aevy.b:(Ljava/lang/String;)Ljava/lang/String;
        //   339: astore          24
        //   341: aload           24
        //   343: invokevirtual   java/lang/String.hashCode:()I
        //   346: lookupswitch {
        //          -1178781136: 586
        //          -1026963764: 569
        //          -192095652: 552
        //          -70925746: 536
        //          3029637: 520
        //          3373707: 504
        //          366554320: 488
        //          767321349: 471
        //          1767875043: 455
        //          1988365454: 439
        //          default: 436
        //        }
        //   436: goto            603
        //   439: aload           24
        //   441: ldc             "outlinecolour"
        //   443: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   446: ifeq            603
        //   449: iconst_3       
        //   450: istore          4
        //   452: goto            606
        //   455: aload           24
        //   457: ldc             "alignment"
        //   459: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   462: ifeq            603
        //   465: iconst_1       
        //   466: istore          4
        //   468: goto            606
        //   471: aload           24
        //   473: ldc             "borderstyle"
        //   475: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   478: ifeq            603
        //   481: bipush          9
        //   483: istore          4
        //   485: goto            606
        //   488: aload           24
        //   490: ldc             "fontsize"
        //   492: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   495: ifeq            603
        //   498: iconst_4       
        //   499: istore          4
        //   501: goto            606
        //   504: aload           24
        //   506: ldc             "name"
        //   508: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   511: ifeq            603
        //   514: iconst_0       
        //   515: istore          4
        //   517: goto            606
        //   520: aload           24
        //   522: ldc             "bold"
        //   524: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   527: ifeq            603
        //   530: iconst_5       
        //   531: istore          4
        //   533: goto            606
        //   536: aload           24
        //   538: ldc             "primarycolour"
        //   540: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   543: ifeq            603
        //   546: iconst_2       
        //   547: istore          4
        //   549: goto            606
        //   552: aload           24
        //   554: ldc             "strikeout"
        //   556: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   559: ifeq            603
        //   562: bipush          8
        //   564: istore          4
        //   566: goto            606
        //   569: aload           24
        //   571: ldc             "underline"
        //   573: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   576: ifeq            603
        //   579: bipush          7
        //   581: istore          4
        //   583: goto            606
        //   586: aload           24
        //   588: ldc             "italic"
        //   590: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   593: ifeq            603
        //   596: bipush          6
        //   598: istore          4
        //   600: goto            606
        //   603: iconst_m1      
        //   604: istore          4
        //   606: iload           4
        //   608: tableswitch {
        //                0: 721
        //                1: 715
        //                2: 709
        //                3: 703
        //                4: 697
        //                5: 691
        //                6: 685
        //                7: 679
        //                8: 673
        //                9: 667
        //          default: 664
        //        }
        //   664: goto            724
        //   667: iload_3        
        //   668: istore          8
        //   670: goto            724
        //   673: iload_3        
        //   674: istore          9
        //   676: goto            724
        //   679: iload_3        
        //   680: istore          10
        //   682: goto            724
        //   685: iload_3        
        //   686: istore          11
        //   688: goto            724
        //   691: iload_3        
        //   692: istore          12
        //   694: goto            724
        //   697: iload_3        
        //   698: istore          13
        //   700: goto            724
        //   703: iload_3        
        //   704: istore          14
        //   706: goto            724
        //   709: iload_3        
        //   710: istore          15
        //   712: goto            724
        //   715: iload_3        
        //   716: istore          16
        //   718: goto            724
        //   721: iload_3        
        //   722: istore          17
        //   724: iinc            3, 1
        //   727: goto            318
        //   730: iload           6
        //   732: istore          18
        //   734: iload           5
        //   736: istore          4
        //   738: iload           7
        //   740: istore_3       
        //   741: iload           17
        //   743: iconst_m1      
        //   744: if_icmpeq       221
        //   747: new             Lbyh;
        //   750: dup            
        //   751: iload           17
        //   753: iload           16
        //   755: iload           15
        //   757: iload           14
        //   759: iload           13
        //   761: iload           12
        //   763: iload           11
        //   765: iload           10
        //   767: iload           9
        //   769: iload           8
        //   771: iload           19
        //   773: invokespecial   byh.<init>:(IIIIIIIIIII)V
        //   776: astore          24
        //   778: goto            235
        //   781: aload           28
        //   783: ldc             "Style:"
        //   785: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   788: ifeq            1405
        //   791: aload           24
        //   793: ifnonnull       811
        //   796: ldc             "SsaDecoder"
        //   798: ldc             "Skipping 'Style:' line before 'Format:' line: "
        //   800: aload           28
        //   802: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   805: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   808: goto            1405
        //   811: aload           28
        //   813: ldc             "Style:"
        //   815: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   818: invokestatic    dk.f:(Z)V
        //   821: aload           28
        //   823: bipush          6
        //   825: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   828: ldc             ","
        //   830: invokestatic    android/text/TextUtils.split:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   833: astore          30
        //   835: aload           30
        //   837: arraylength    
        //   838: istore_3       
        //   839: aload           24
        //   841: getfield        byh.k:I
        //   844: istore          4
        //   846: iload_3        
        //   847: iload           4
        //   849: if_icmpeq       903
        //   852: iconst_3       
        //   853: anewarray       Ljava/lang/Object;
        //   856: astore          25
        //   858: aload           25
        //   860: iload           7
        //   862: iload           4
        //   864: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   867: aastore        
        //   868: aload           25
        //   870: iconst_1       
        //   871: iload_3        
        //   872: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   875: aastore        
        //   876: aload           25
        //   878: iload           5
        //   880: aload           28
        //   882: aastore        
        //   883: ldc_w           "SsaStyle"
        //   886: ldc_w           "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
        //   889: aload           25
        //   891: invokestatic    bax.M:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   894: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   897: aconst_null    
        //   898: astore          25
        //   900: goto            1385
        //   903: aload           30
        //   905: aload           24
        //   907: getfield        byh.a:I
        //   910: aaload         
        //   911: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   914: astore          29
        //   916: aload           24
        //   918: getfield        byh.b:I
        //   921: istore_3       
        //   922: iload_3        
        //   923: iconst_m1      
        //   924: if_icmpeq       941
        //   927: aload           30
        //   929: iload_3        
        //   930: aaload         
        //   931: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   934: invokestatic    byj.a:(Ljava/lang/String;)I
        //   937: istore_3       
        //   938: goto            943
        //   941: iconst_m1      
        //   942: istore_3       
        //   943: aload           24
        //   945: getfield        byh.c:I
        //   948: istore          4
        //   950: iload           4
        //   952: iconst_m1      
        //   953: if_icmpeq       972
        //   956: aload           30
        //   958: iload           4
        //   960: aaload         
        //   961: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   964: invokestatic    byj.b:(Ljava/lang/String;)Ljava/lang/Integer;
        //   967: astore          25
        //   969: goto            975
        //   972: aconst_null    
        //   973: astore          25
        //   975: aload           24
        //   977: getfield        byh.d:I
        //   980: istore          4
        //   982: iload           4
        //   984: iconst_m1      
        //   985: if_icmpeq       1004
        //   988: aload           30
        //   990: iload           4
        //   992: aaload         
        //   993: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   996: invokestatic    byj.b:(Ljava/lang/String;)Ljava/lang/Integer;
        //   999: astore          26
        //  1001: goto            1007
        //  1004: aconst_null    
        //  1005: astore          26
        //  1007: aload           24
        //  1009: getfield        byh.e:I
        //  1012: istore          4
        //  1014: iload           4
        //  1016: iconst_m1      
        //  1017: if_icmpeq       1090
        //  1020: aload           30
        //  1022: iload           4
        //  1024: aaload         
        //  1025: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1028: astore          31
        //  1030: aload           31
        //  1032: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  1035: fstore_2       
        //  1036: goto            1093
        //  1039: astore          33
        //  1041: new             Ljava/lang/StringBuilder;
        //  1044: astore          32
        //  1046: aload           32
        //  1048: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1051: aload           32
        //  1053: ldc_w           "Failed to parse font size: '"
        //  1056: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1059: pop            
        //  1060: aload           32
        //  1062: aload           31
        //  1064: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1067: pop            
        //  1068: aload           32
        //  1070: ldc_w           "'"
        //  1073: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1076: pop            
        //  1077: ldc_w           "SsaStyle"
        //  1080: aload           32
        //  1082: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1085: aload           33
        //  1087: invokestatic    bap.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1090: ldc             -3.4028235E38
        //  1092: fstore_2       
        //  1093: aload           24
        //  1095: getfield        byh.f:I
        //  1098: istore          4
        //  1100: iload           4
        //  1102: iconst_m1      
        //  1103: if_icmpeq       1126
        //  1106: aload           30
        //  1108: iload           4
        //  1110: aaload         
        //  1111: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1114: invokestatic    byj.c:(Ljava/lang/String;)Z
        //  1117: ifeq            1126
        //  1120: iconst_1       
        //  1121: istore          20
        //  1123: goto            1129
        //  1126: iconst_0       
        //  1127: istore          20
        //  1129: aload           24
        //  1131: getfield        byh.g:I
        //  1134: istore          4
        //  1136: iload           4
        //  1138: iconst_m1      
        //  1139: if_icmpeq       1162
        //  1142: aload           30
        //  1144: iload           4
        //  1146: aaload         
        //  1147: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1150: invokestatic    byj.c:(Ljava/lang/String;)Z
        //  1153: ifeq            1162
        //  1156: iconst_1       
        //  1157: istore          21
        //  1159: goto            1165
        //  1162: iconst_0       
        //  1163: istore          21
        //  1165: aload           24
        //  1167: getfield        byh.h:I
        //  1170: istore          4
        //  1172: iload           4
        //  1174: iconst_m1      
        //  1175: if_icmpeq       1198
        //  1178: aload           30
        //  1180: iload           4
        //  1182: aaload         
        //  1183: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1186: invokestatic    byj.c:(Ljava/lang/String;)Z
        //  1189: ifeq            1198
        //  1192: iconst_1       
        //  1193: istore          22
        //  1195: goto            1201
        //  1198: iconst_0       
        //  1199: istore          22
        //  1201: aload           24
        //  1203: getfield        byh.i:I
        //  1206: istore          4
        //  1208: iload           4
        //  1210: iconst_m1      
        //  1211: if_icmpeq       1234
        //  1214: aload           30
        //  1216: iload           4
        //  1218: aaload         
        //  1219: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1222: invokestatic    byj.c:(Ljava/lang/String;)Z
        //  1225: ifeq            1234
        //  1228: iconst_1       
        //  1229: istore          23
        //  1231: goto            1237
        //  1234: iconst_0       
        //  1235: istore          23
        //  1237: aload           24
        //  1239: getfield        byh.j:I
        //  1242: istore          4
        //  1244: iload           4
        //  1246: iconst_m1      
        //  1247: if_icmpeq       1305
        //  1250: aload           30
        //  1252: iload           4
        //  1254: aaload         
        //  1255: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1258: astore          31
        //  1260: aload           31
        //  1262: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1265: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1268: istore          4
        //  1270: iload           4
        //  1272: iconst_1       
        //  1273: if_icmpeq       1285
        //  1276: iload           4
        //  1278: iconst_3       
        //  1279: if_icmpeq       1285
        //  1282: goto            1288
        //  1285: goto            1308
        //  1288: ldc_w           "SsaStyle"
        //  1291: ldc_w           "Ignoring unknown BorderStyle: "
        //  1294: aload           31
        //  1296: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1299: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1302: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  1305: iconst_m1      
        //  1306: istore          4
        //  1308: new             Lbyj;
        //  1311: dup            
        //  1312: aload           29
        //  1314: iload_3        
        //  1315: aload           25
        //  1317: aload           26
        //  1319: fload_2        
        //  1320: iload           20
        //  1322: iload           21
        //  1324: iload           22
        //  1326: iload           23
        //  1328: iload           4
        //  1330: invokespecial   byj.<init>:(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;FZZZZI)V
        //  1333: astore          25
        //  1335: goto            1385
        //  1338: astore          25
        //  1340: new             Ljava/lang/StringBuilder;
        //  1343: dup            
        //  1344: ldc_w           "Skipping malformed 'Style:' line: '"
        //  1347: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1350: astore          26
        //  1352: aload           26
        //  1354: aload           28
        //  1356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1359: pop            
        //  1360: aload           26
        //  1362: ldc_w           "'"
        //  1365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1368: pop            
        //  1369: ldc_w           "SsaStyle"
        //  1372: aload           26
        //  1374: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1377: aload           25
        //  1379: invokestatic    bap.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1382: goto            897
        //  1385: aload           25
        //  1387: ifnull          1405
        //  1390: aload           27
        //  1392: aload           25
        //  1394: getfield        byj.a:Ljava/lang/String;
        //  1397: aload           25
        //  1399: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1404: pop            
        //  1405: bipush          91
        //  1407: istore          6
        //  1409: iconst_2       
        //  1410: istore          5
        //  1412: iconst_0       
        //  1413: istore          7
        //  1415: goto            235
        //  1418: aload_0        
        //  1419: aload           27
        //  1421: putfield        byf.d:Ljava/util/Map;
        //  1424: goto            0
        //  1427: ldc_w           "[V4 Styles]"
        //  1430: aload           24
        //  1432: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1435: ifeq            1444
        //  1438: invokestatic    bap.f:()V
        //  1441: goto            0
        //  1444: ldc_w           "[Events]"
        //  1447: aload           24
        //  1449: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1452: ifeq            0
        //  1455: return         
        //  1456: astore          30
        //  1458: goto            1288
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  163    177    180    185    Ljava/lang/NumberFormatException;
        //  185    199    180    185    Ljava/lang/NumberFormatException;
        //  903    922    1338   1385   Ljava/lang/RuntimeException;
        //  927    938    1338   1385   Ljava/lang/RuntimeException;
        //  943    950    1338   1385   Ljava/lang/RuntimeException;
        //  956    969    1338   1385   Ljava/lang/RuntimeException;
        //  975    982    1338   1385   Ljava/lang/RuntimeException;
        //  988    1001   1338   1385   Ljava/lang/RuntimeException;
        //  1007   1014   1338   1385   Ljava/lang/RuntimeException;
        //  1020   1030   1338   1385   Ljava/lang/RuntimeException;
        //  1030   1036   1039   1090   Ljava/lang/NumberFormatException;
        //  1030   1036   1338   1385   Ljava/lang/RuntimeException;
        //  1041   1090   1338   1385   Ljava/lang/RuntimeException;
        //  1093   1100   1338   1385   Ljava/lang/RuntimeException;
        //  1106   1120   1338   1385   Ljava/lang/RuntimeException;
        //  1129   1136   1338   1385   Ljava/lang/RuntimeException;
        //  1142   1156   1338   1385   Ljava/lang/RuntimeException;
        //  1165   1172   1338   1385   Ljava/lang/RuntimeException;
        //  1178   1192   1338   1385   Ljava/lang/RuntimeException;
        //  1201   1208   1338   1385   Ljava/lang/RuntimeException;
        //  1214   1228   1338   1385   Ljava/lang/RuntimeException;
        //  1237   1244   1338   1385   Ljava/lang/RuntimeException;
        //  1250   1260   1338   1385   Ljava/lang/RuntimeException;
        //  1260   1270   1456   1461   Ljava/lang/NumberFormatException;
        //  1260   1270   1338   1385   Ljava/lang/RuntimeException;
        //  1288   1305   1338   1385   Ljava/lang/RuntimeException;
        //  1308   1335   1338   1385   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1285:
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
    
    protected final bxi n(final byte[] p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          22
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: invokespecial   java/util/ArrayList.<init>:()V
        //    16: astore          21
        //    18: new             Lbas;
        //    21: dup            
        //    22: aload_1        
        //    23: iload_2        
        //    24: invokespecial   bas.<init>:([BI)V
        //    27: astore          14
        //    29: aload_0        
        //    30: getfield        byf.b:Z
        //    33: ifne            42
        //    36: aload_0        
        //    37: aload           14
        //    39: invokespecial   byf.r:(Lbas;)V
        //    42: aload_0        
        //    43: getfield        byf.b:Z
        //    46: ifeq            57
        //    49: aload_0        
        //    50: getfield        byf.c:Lbyg;
        //    53: astore_1       
        //    54: goto            59
        //    57: aconst_null    
        //    58: astore_1       
        //    59: aload           14
        //    61: invokevirtual   bas.t:()Ljava/lang/String;
        //    64: astore          16
        //    66: aload           16
        //    68: ifnull          1426
        //    71: aload           16
        //    73: ldc             "Format:"
        //    75: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    78: ifeq            90
        //    81: aload           16
        //    83: invokestatic    byg.a:(Ljava/lang/String;)Lbyg;
        //    86: astore_1       
        //    87: goto            59
        //    90: aload           16
        //    92: ldc_w           "Dialogue:"
        //    95: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    98: ifeq            1423
        //   101: aload_1        
        //   102: ifnonnull       121
        //   105: ldc             "SsaDecoder"
        //   107: ldc_w           "Skipping dialogue line before complete format: "
        //   110: aload           16
        //   112: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   115: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   118: goto            1423
        //   121: aload           16
        //   123: ldc_w           "Dialogue:"
        //   126: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   129: invokestatic    dk.f:(Z)V
        //   132: aload           16
        //   134: bipush          9
        //   136: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   139: ldc             ","
        //   141: aload_1        
        //   142: getfield        byg.e:I
        //   145: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   148: astore          15
        //   150: aload           15
        //   152: arraylength    
        //   153: aload_1        
        //   154: getfield        byg.e:I
        //   157: if_icmpeq       176
        //   160: ldc             "SsaDecoder"
        //   162: ldc_w           "Skipping dialogue line with fewer columns than format: "
        //   165: aload           16
        //   167: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   170: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   173: goto            1423
        //   176: aload           15
        //   178: aload_1        
        //   179: getfield        byg.a:I
        //   182: aaload         
        //   183: invokestatic    byf.q:(Ljava/lang/String;)J
        //   186: lstore          12
        //   188: lload           12
        //   190: ldc2_w          -9223372036854775807
        //   193: lcmp           
        //   194: ifne            213
        //   197: ldc             "SsaDecoder"
        //   199: ldc_w           "Skipping invalid timing: "
        //   202: aload           16
        //   204: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   207: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   210: goto            1423
        //   213: aload           15
        //   215: aload_1        
        //   216: getfield        byg.b:I
        //   219: aaload         
        //   220: invokestatic    byf.q:(Ljava/lang/String;)J
        //   223: lstore          10
        //   225: lload           10
        //   227: ldc2_w          -9223372036854775807
        //   230: lcmp           
        //   231: ifne            250
        //   234: ldc             "SsaDecoder"
        //   236: ldc_w           "Skipping invalid timing: "
        //   239: aload           16
        //   241: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   244: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   247: goto            1423
        //   250: aload_0        
        //   251: getfield        byf.d:Ljava/util/Map;
        //   254: astore          16
        //   256: aload           16
        //   258: ifnull          293
        //   261: aload_1        
        //   262: getfield        byg.c:I
        //   265: istore_2       
        //   266: iload_2        
        //   267: iconst_m1      
        //   268: if_icmpeq       293
        //   271: aload           16
        //   273: aload           15
        //   275: iload_2        
        //   276: aaload         
        //   277: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   280: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   285: checkcast       Lbyj;
        //   288: astore          16
        //   290: goto            296
        //   293: aconst_null    
        //   294: astore          16
        //   296: aload           15
        //   298: aload_1        
        //   299: getfield        byg.d:I
        //   302: aaload         
        //   303: astore          23
        //   305: getstatic       byi.a:Ljava/util/regex/Pattern;
        //   308: aload           23
        //   310: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   313: astore          18
        //   315: aconst_null    
        //   316: astore          17
        //   318: iconst_m1      
        //   319: istore_2       
        //   320: aload           18
        //   322: invokevirtual   java/util/regex/Matcher.find:()Z
        //   325: ifeq            555
        //   328: aload           18
        //   330: iconst_1       
        //   331: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   334: astore          24
        //   336: aload           24
        //   338: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   341: pop            
        //   342: getstatic       byi.b:Ljava/util/regex/Pattern;
        //   345: aload           24
        //   347: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   350: astore          19
        //   352: getstatic       byi.c:Ljava/util/regex/Pattern;
        //   355: aload           24
        //   357: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   360: astore          20
        //   362: aload           19
        //   364: invokevirtual   java/util/regex/Matcher.find:()Z
        //   367: istore_3       
        //   368: aload           20
        //   370: invokevirtual   java/util/regex/Matcher.find:()Z
        //   373: istore          9
        //   375: iload_3        
        //   376: ifeq            406
        //   379: iload           9
        //   381: ifeq            387
        //   384: invokestatic    bap.f:()V
        //   387: aload           19
        //   389: iconst_1       
        //   390: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   393: astore          15
        //   395: aload           19
        //   397: iconst_2       
        //   398: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   401: astore          19
        //   403: goto            427
        //   406: iload           9
        //   408: ifeq            476
        //   411: aload           20
        //   413: iconst_1       
        //   414: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   417: astore          15
        //   419: aload           20
        //   421: iconst_2       
        //   422: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   425: astore          19
        //   427: new             Landroid/graphics/PointF;
        //   430: astore          20
        //   432: aload           15
        //   434: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   437: pop            
        //   438: aload           15
        //   440: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   443: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   446: fstore          4
        //   448: aload           19
        //   450: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   453: pop            
        //   454: aload           20
        //   456: fload           4
        //   458: aload           19
        //   460: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   463: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   466: invokespecial   android/graphics/PointF.<init>:(FF)V
        //   469: aload           20
        //   471: astore          15
        //   473: goto            479
        //   476: aconst_null    
        //   477: astore          15
        //   479: aload           15
        //   481: ifnull          493
        //   484: aload           15
        //   486: astore          17
        //   488: goto            493
        //   491: astore          15
        //   493: getstatic       byi.d:Ljava/util/regex/Pattern;
        //   496: aload           24
        //   498: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   501: astore          15
        //   503: aload           15
        //   505: invokevirtual   java/util/regex/Matcher.find:()Z
        //   508: ifeq            535
        //   511: aload           15
        //   513: iconst_1       
        //   514: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   517: astore          15
        //   519: aload           15
        //   521: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   524: pop            
        //   525: aload           15
        //   527: invokestatic    byj.a:(Ljava/lang/String;)I
        //   530: istore          7
        //   532: goto            538
        //   535: iconst_m1      
        //   536: istore          7
        //   538: iload           7
        //   540: iconst_m1      
        //   541: if_icmpeq       552
        //   544: iload           7
        //   546: istore_2       
        //   547: goto            552
        //   550: astore          15
        //   552: goto            320
        //   555: aload           14
        //   557: astore          15
        //   559: aload_1        
        //   560: astore          18
        //   562: getstatic       byi.a:Ljava/util/regex/Pattern;
        //   565: aload           23
        //   567: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   570: ldc_w           ""
        //   573: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //   576: ldc_w           "\\N"
        //   579: ldc_w           "\n"
        //   582: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   585: ldc_w           "\\n"
        //   588: ldc_w           "\n"
        //   591: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   594: ldc_w           "\\h"
        //   597: ldc_w           " "
        //   600: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   603: astore_1       
        //   604: aload_0        
        //   605: getfield        byf.e:F
        //   608: fstore          5
        //   610: aload_0        
        //   611: getfield        byf.f:F
        //   614: fstore          4
        //   616: new             Landroid/text/SpannableString;
        //   619: dup            
        //   620: aload_1        
        //   621: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   624: astore_1       
        //   625: new             Lazx;
        //   628: dup            
        //   629: invokespecial   azx.<init>:()V
        //   632: astore          14
        //   634: aload           14
        //   636: aload_1        
        //   637: putfield        azx.a:Ljava/lang/CharSequence;
        //   640: aload           16
        //   642: ifnull          901
        //   645: aload           16
        //   647: getfield        byj.c:Ljava/lang/Integer;
        //   650: ifnull          682
        //   653: aload_1        
        //   654: new             Landroid/text/style/ForegroundColorSpan;
        //   657: dup            
        //   658: aload           16
        //   660: getfield        byj.c:Ljava/lang/Integer;
        //   663: invokevirtual   java/lang/Integer.intValue:()I
        //   666: invokespecial   android/text/style/ForegroundColorSpan.<init>:(I)V
        //   669: iconst_0       
        //   670: aload_1        
        //   671: invokevirtual   android/text/SpannableString.length:()I
        //   674: bipush          33
        //   676: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   679: goto            682
        //   682: aload           16
        //   684: getfield        byj.j:I
        //   687: iconst_3       
        //   688: if_icmpne       725
        //   691: aload           16
        //   693: getfield        byj.d:Ljava/lang/Integer;
        //   696: ifnull          725
        //   699: aload_1        
        //   700: new             Landroid/text/style/BackgroundColorSpan;
        //   703: dup            
        //   704: aload           16
        //   706: getfield        byj.d:Ljava/lang/Integer;
        //   709: invokevirtual   java/lang/Integer.intValue:()I
        //   712: invokespecial   android/text/style/BackgroundColorSpan.<init>:(I)V
        //   715: iconst_0       
        //   716: aload_1        
        //   717: invokevirtual   android/text/SpannableString.length:()I
        //   720: bipush          33
        //   722: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   725: aload           16
        //   727: getfield        byj.e:F
        //   730: fstore          6
        //   732: fload           6
        //   734: ldc             -3.4028235E38
        //   736: fcmpl          
        //   737: ifeq            759
        //   740: fload           4
        //   742: ldc             -3.4028235E38
        //   744: fcmpl          
        //   745: ifeq            759
        //   748: aload           14
        //   750: fload           6
        //   752: fload           4
        //   754: fdiv           
        //   755: iconst_1       
        //   756: invokevirtual   azx.c:(FI)V
        //   759: aload           16
        //   761: getfield        byj.f:Z
        //   764: ifeq            819
        //   767: aload           16
        //   769: getfield        byj.g:Z
        //   772: ifeq            797
        //   775: aload_1        
        //   776: new             Landroid/text/style/StyleSpan;
        //   779: dup            
        //   780: iconst_3       
        //   781: invokespecial   android/text/style/StyleSpan.<init>:(I)V
        //   784: iconst_0       
        //   785: aload_1        
        //   786: invokevirtual   android/text/SpannableString.length:()I
        //   789: bipush          33
        //   791: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   794: goto            846
        //   797: aload_1        
        //   798: new             Landroid/text/style/StyleSpan;
        //   801: dup            
        //   802: iconst_1       
        //   803: invokespecial   android/text/style/StyleSpan.<init>:(I)V
        //   806: iconst_0       
        //   807: aload_1        
        //   808: invokevirtual   android/text/SpannableString.length:()I
        //   811: bipush          33
        //   813: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   816: goto            846
        //   819: aload           16
        //   821: getfield        byj.g:Z
        //   824: ifeq            846
        //   827: aload_1        
        //   828: new             Landroid/text/style/StyleSpan;
        //   831: dup            
        //   832: iconst_2       
        //   833: invokespecial   android/text/style/StyleSpan.<init>:(I)V
        //   836: iconst_0       
        //   837: aload_1        
        //   838: invokevirtual   android/text/SpannableString.length:()I
        //   841: bipush          33
        //   843: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   846: aload           16
        //   848: getfield        byj.h:Z
        //   851: ifeq            872
        //   854: aload_1        
        //   855: new             Landroid/text/style/UnderlineSpan;
        //   858: dup            
        //   859: invokespecial   android/text/style/UnderlineSpan.<init>:()V
        //   862: iconst_0       
        //   863: aload_1        
        //   864: invokevirtual   android/text/SpannableString.length:()I
        //   867: bipush          33
        //   869: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   872: aload           16
        //   874: getfield        byj.i:Z
        //   877: ifeq            901
        //   880: aload_1        
        //   881: new             Landroid/text/style/StrikethroughSpan;
        //   884: dup            
        //   885: invokespecial   android/text/style/StrikethroughSpan.<init>:()V
        //   888: iconst_0       
        //   889: aload_1        
        //   890: invokevirtual   android/text/SpannableString.length:()I
        //   893: bipush          33
        //   895: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   898: goto            901
        //   901: iconst_m1      
        //   902: istore          7
        //   904: iload_2        
        //   905: iconst_m1      
        //   906: if_icmpeq       915
        //   909: iload_2        
        //   910: istore          7
        //   912: goto            927
        //   915: aload           16
        //   917: ifnull          927
        //   920: aload           16
        //   922: getfield        byj.b:I
        //   925: istore          7
        //   927: iload           7
        //   929: tableswitch {
        //               -2: 1039
        //               -1: 988
        //                0: 1032
        //                1: 1025
        //                2: 1018
        //                3: 1032
        //                4: 1025
        //                5: 1018
        //                6: 1032
        //                7: 1025
        //                8: 1018
        //          default: 988
        //        }
        //   988: new             Ljava/lang/StringBuilder;
        //   991: dup            
        //   992: ldc_w           "Unknown alignment: "
        //   995: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   998: astore_1       
        //   999: aload_1        
        //  1000: iload           7
        //  1002: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1005: pop            
        //  1006: ldc             "SsaDecoder"
        //  1008: aload_1        
        //  1009: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1012: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  1015: goto            1039
        //  1018: getstatic       android/text/Layout$Alignment.ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;
        //  1021: astore_1       
        //  1022: goto            1041
        //  1025: getstatic       android/text/Layout$Alignment.ALIGN_CENTER:Landroid/text/Layout$Alignment;
        //  1028: astore_1       
        //  1029: goto            1041
        //  1032: getstatic       android/text/Layout$Alignment.ALIGN_NORMAL:Landroid/text/Layout$Alignment;
        //  1035: astore_1       
        //  1036: goto            1041
        //  1039: aconst_null    
        //  1040: astore_1       
        //  1041: aload           14
        //  1043: aload_1        
        //  1044: putfield        azx.c:Landroid/text/Layout$Alignment;
        //  1047: ldc_w           -2147483648
        //  1050: istore          8
        //  1052: iload           7
        //  1054: tableswitch {
        //               -2: 1157
        //               -1: 1112
        //                0: 1152
        //                1: 1147
        //                2: 1142
        //                3: 1152
        //                4: 1147
        //                5: 1142
        //                6: 1152
        //                7: 1147
        //                8: 1142
        //          default: 1112
        //        }
        //  1112: new             Ljava/lang/StringBuilder;
        //  1115: dup            
        //  1116: ldc_w           "Unknown alignment: "
        //  1119: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1122: astore_1       
        //  1123: aload_1        
        //  1124: iload           7
        //  1126: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1129: pop            
        //  1130: ldc             "SsaDecoder"
        //  1132: aload_1        
        //  1133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1136: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  1139: goto            1157
        //  1142: iconst_2       
        //  1143: istore_2       
        //  1144: goto            1161
        //  1147: iconst_1       
        //  1148: istore_2       
        //  1149: goto            1161
        //  1152: iconst_0       
        //  1153: istore_2       
        //  1154: goto            1161
        //  1157: ldc_w           -2147483648
        //  1160: istore_2       
        //  1161: aload           14
        //  1163: iload_2        
        //  1164: putfield        azx.g:I
        //  1167: iload           8
        //  1169: istore_2       
        //  1170: iload           7
        //  1172: tableswitch {
        //               -2: 1277
        //               -1: 1232
        //                0: 1275
        //                1: 1275
        //                2: 1275
        //                3: 1270
        //                4: 1270
        //                5: 1270
        //                6: 1265
        //                7: 1265
        //                8: 1265
        //          default: 1232
        //        }
        //  1232: new             Ljava/lang/StringBuilder;
        //  1235: dup            
        //  1236: ldc_w           "Unknown alignment: "
        //  1239: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1242: astore_1       
        //  1243: aload_1        
        //  1244: iload           7
        //  1246: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1249: pop            
        //  1250: ldc             "SsaDecoder"
        //  1252: aload_1        
        //  1253: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1256: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  1259: iload           8
        //  1261: istore_2       
        //  1262: goto            1277
        //  1265: iconst_0       
        //  1266: istore_2       
        //  1267: goto            1277
        //  1270: iconst_1       
        //  1271: istore_2       
        //  1272: goto            1277
        //  1275: iconst_2       
        //  1276: istore_2       
        //  1277: aload           14
        //  1279: iload_2        
        //  1280: putfield        azx.e:I
        //  1283: aload           17
        //  1285: ifnull          1334
        //  1288: fload           4
        //  1290: ldc             -3.4028235E38
        //  1292: fcmpl          
        //  1293: ifeq            1334
        //  1296: fload           5
        //  1298: ldc             -3.4028235E38
        //  1300: fcmpl          
        //  1301: ifeq            1334
        //  1304: aload           14
        //  1306: aload           17
        //  1308: getfield        android/graphics/PointF.x:F
        //  1311: fload           5
        //  1313: fdiv           
        //  1314: putfield        azx.f:F
        //  1317: aload           14
        //  1319: aload           17
        //  1321: getfield        android/graphics/PointF.y:F
        //  1324: fload           4
        //  1326: fdiv           
        //  1327: iconst_0       
        //  1328: invokevirtual   azx.b:(FI)V
        //  1331: goto            1357
        //  1334: aload           14
        //  1336: aload           14
        //  1338: getfield        azx.g:I
        //  1341: invokestatic    byf.o:(I)F
        //  1344: putfield        azx.f:F
        //  1347: aload           14
        //  1349: iload_2        
        //  1350: invokestatic    byf.o:(I)F
        //  1353: iconst_0       
        //  1354: invokevirtual   azx.b:(FI)V
        //  1357: aload           14
        //  1359: invokevirtual   azx.a:()Lazy;
        //  1362: astore          16
        //  1364: lload           12
        //  1366: aload           21
        //  1368: aload           22
        //  1370: invokestatic    byf.p:(JLjava/util/List;Ljava/util/List;)I
        //  1373: istore_2       
        //  1374: lload           10
        //  1376: aload           21
        //  1378: aload           22
        //  1380: invokestatic    byf.p:(JLjava/util/List;Ljava/util/List;)I
        //  1383: istore          7
        //  1385: aload           15
        //  1387: astore          14
        //  1389: aload           18
        //  1391: astore_1       
        //  1392: iload_2        
        //  1393: iload           7
        //  1395: if_icmpge       1423
        //  1398: aload           22
        //  1400: iload_2        
        //  1401: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1406: checkcast       Ljava/util/List;
        //  1409: aload           16
        //  1411: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1416: pop            
        //  1417: iinc            2, 1
        //  1420: goto            1385
        //  1423: goto            59
        //  1426: new             Lbyl;
        //  1429: dup            
        //  1430: aload           22
        //  1432: aload           21
        //  1434: iconst_1       
        //  1435: invokespecial   byl.<init>:(Ljava/util/List;Ljava/util/List;I)V
        //  1438: areturn        
        //  1439: astore          15
        //  1441: goto            493
        //  1444: astore          15
        //  1446: goto            493
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  342    352    491    493    Ljava/lang/RuntimeException;
        //  352    375    1439   1444   Ljava/lang/RuntimeException;
        //  384    387    1439   1444   Ljava/lang/RuntimeException;
        //  387    395    1439   1444   Ljava/lang/RuntimeException;
        //  395    403    1444   1449   Ljava/lang/RuntimeException;
        //  411    427    1444   1449   Ljava/lang/RuntimeException;
        //  427    469    1444   1449   Ljava/lang/RuntimeException;
        //  493    532    550    552    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 587, Size: 587
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
}
