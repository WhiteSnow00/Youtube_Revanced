import java.util.List;
import java.util.ArrayList;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import java.util.Arrays;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvk extends bvf
{
    public static final bvj a;
    private final bvj b;
    
    static {
        a = bvj.a;
    }
    
    public bvk() {
        this(null);
    }
    
    public bvk(final bvj b) {
        this.b = b;
    }
    
    private static int d(final int n) {
        if (n != 0 && n != 3) {
            return 2;
        }
        return 1;
    }
    
    private static int e(final byte[] array, final int n, int f) {
        final int f2 = f(array, n);
        if (f == 0 || f == 3) {
            return f2;
        }
        f = f2;
        while (true) {
            final int length = array.length;
            if (f >= length - 1) {
                return length;
            }
            if ((f - n) % 2 == 0 && array[f + 1] == 0) {
                return f;
            }
            f = f(array, f + 1);
        }
    }
    
    private static int f(final byte[] array, int n) {
        while (true) {
            final int length = array.length;
            if (n >= length) {
                return length;
            }
            if (array[n] == 0) {
                return n;
            }
            ++n;
        }
    }
    
    private static int g(final bar bar, int n) {
        final byte[] a = bar.a;
        int b;
        final int n2 = b = bar.b;
        while (true) {
            final int n3 = b + 1;
            if (n3 >= n2 + n) {
                break;
            }
            int n4 = n;
            if ((a[b] & 0xFF) == 0xFF) {
                n4 = n;
                if (a[n3] == 0) {
                    System.arraycopy(a, b + 2, a, n3, n - (b - n2) - 2);
                    n4 = n - 1;
                }
            }
            b = n3;
            n = n4;
        }
        return n;
    }
    
    private static String h(final byte[] array, final int n, final int n2, final String s) {
        if (n2 > n && n2 <= array.length) {
            return new String(array, n, n2 - n, s);
        }
        return "";
    }
    
    private static String i(final int n) {
        if (n == 1) {
            return "UTF-16";
        }
        if (n == 2) {
            return "UTF-16BE";
        }
        if (n != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }
    
    private static String j(final int n, final int n2, final int n3, final int n4, final int n5) {
        String s;
        if (n == 2) {
            s = String.format(Locale.US, "%c%c%c", n2, n3, n4);
        }
        else {
            s = String.format(Locale.US, "%c%c%c%c", n2, n3, n4, n5);
        }
        return s;
    }
    
    private static boolean k(final bar bar, final int n, final int n2, final boolean b) {
        final int b2 = bar.b;
        try {
            while (true) {
                final int a = bar.a();
                final int n3 = 1;
                final int n4 = 1;
                if (a < n2) {
                    bar.G(b2);
                    return true;
                }
                int n5;
                long q;
                int m;
                if (n >= 3) {
                    n5 = bar.d();
                    q = bar.q();
                    m = bar.m();
                }
                else {
                    n5 = bar.k();
                    q = bar.k();
                    m = 0;
                }
                if (n5 == 0 && q == 0L && m == 0) {
                    bar.G(b2);
                    return true;
                }
                long n6 = q;
                if (n == 4) {
                    n6 = q;
                    if (!b) {
                        if ((0x808080L & q) != 0x0L) {
                            bar.G(b2);
                            return false;
                        }
                        n6 = (q >> 24 << 21 | ((0xFFL & q >> 16) << 14 | ((q & 0xFFL) | (q >> 8 & 0xFFL) << 7)));
                    }
                }
                int n7 = 0;
                int n8 = 0;
                Label_0261: {
                    if (n == 4) {
                        if ((m & 0x40) != 0x0) {
                            n7 = n4;
                        }
                        else {
                            n7 = 0;
                        }
                        n8 = (m & 0x1);
                    }
                    else {
                        int n9;
                        if (n == 3) {
                            if ((m & 0x20) != 0x0) {
                                n7 = 1;
                            }
                            else {
                                n7 = 0;
                            }
                            n9 = n7;
                            if ((m & 0x80) != 0x0) {
                                n8 = n3;
                                break Label_0261;
                            }
                        }
                        else {
                            n9 = 0;
                        }
                        n8 = 0;
                        n7 = n9;
                    }
                }
                int n10 = n7;
                if (n8 != 0) {
                    n10 = n7 + 4;
                }
                if (n6 < n10) {
                    bar.G(b2);
                    return false;
                }
                if (bar.a() < n6) {
                    bar.G(b2);
                    return false;
                }
                bar.H((int)n6);
            }
        }
        finally {
            bar.G(b2);
            while (true) {}
        }
    }
    
    private static byte[] l(final byte[] array, final int n, final int n2) {
        if (n2 <= n) {
            return baw.e;
        }
        return Arrays.copyOfRange(array, n, n2);
    }
    
    private static Id3Frame m(final int p0, final bar p1, final boolean p2, final int p3, final bvj p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   bar.i:()I
        //     4: istore          5
        //     6: aload_1        
        //     7: invokevirtual   bar.i:()I
        //    10: istore          6
        //    12: iload           6
        //    14: istore          7
        //    16: aload_1        
        //    17: invokevirtual   bar.i:()I
        //    20: istore          8
        //    22: iload           8
        //    24: istore          9
        //    26: iload_0        
        //    27: iconst_3       
        //    28: if_icmplt       40
        //    31: aload_1        
        //    32: invokevirtual   bar.i:()I
        //    35: istore          10
        //    37: goto            43
        //    40: iconst_0       
        //    41: istore          10
        //    43: iload_0        
        //    44: iconst_4       
        //    45: if_icmpne       108
        //    48: aload_1        
        //    49: invokevirtual   bar.l:()I
        //    52: istore          11
        //    54: iload           11
        //    56: istore          12
        //    58: iload_2        
        //    59: ifne            128
        //    62: iload           11
        //    64: bipush          24
        //    66: ishr           
        //    67: bipush          21
        //    69: ishl           
        //    70: iload           11
        //    72: sipush          255
        //    75: iand           
        //    76: iload           11
        //    78: bipush          8
        //    80: ishr           
        //    81: sipush          255
        //    84: iand           
        //    85: bipush          7
        //    87: ishl           
        //    88: ior            
        //    89: iload           11
        //    91: bipush          16
        //    93: ishr           
        //    94: sipush          255
        //    97: iand           
        //    98: bipush          14
        //   100: ishl           
        //   101: ior            
        //   102: ior            
        //   103: istore          12
        //   105: goto            128
        //   108: iload_0        
        //   109: iconst_3       
        //   110: if_icmpne       122
        //   113: aload_1        
        //   114: invokevirtual   bar.l:()I
        //   117: istore          12
        //   119: goto            128
        //   122: aload_1        
        //   123: invokevirtual   bar.k:()I
        //   126: istore          12
        //   128: iload_0        
        //   129: iconst_3       
        //   130: if_icmplt       142
        //   133: aload_1        
        //   134: invokevirtual   bar.m:()I
        //   137: istore          13
        //   139: goto            145
        //   142: iconst_0       
        //   143: istore          13
        //   145: aconst_null    
        //   146: astore          14
        //   148: iload           5
        //   150: ifne            191
        //   153: iload           7
        //   155: ifne            191
        //   158: iload           9
        //   160: ifne            191
        //   163: iload           10
        //   165: ifne            191
        //   168: iload           12
        //   170: ifne            191
        //   173: iload           13
        //   175: ifeq            181
        //   178: goto            191
        //   181: aload_1        
        //   182: aload_1        
        //   183: getfield        bar.c:I
        //   186: invokevirtual   bar.G:(I)V
        //   189: aconst_null    
        //   190: areturn        
        //   191: aload_1        
        //   192: getfield        bar.b:I
        //   195: iload           12
        //   197: iadd           
        //   198: istore          11
        //   200: iload           11
        //   202: aload_1        
        //   203: getfield        bar.c:I
        //   206: if_icmple       226
        //   209: ldc             "Id3Decoder"
        //   211: ldc             "Frame size exceeds remaining tag data"
        //   213: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   216: aload_1        
        //   217: aload_1        
        //   218: getfield        bar.c:I
        //   221: invokevirtual   bar.G:(I)V
        //   224: aconst_null    
        //   225: areturn        
        //   226: aload           4
        //   228: ifnonnull       2870
        //   231: iload_0        
        //   232: iconst_3       
        //   233: if_icmpne       306
        //   236: iload           13
        //   238: sipush          128
        //   241: iand           
        //   242: ifeq            251
        //   245: iconst_1       
        //   246: istore          15
        //   248: goto            254
        //   251: iconst_0       
        //   252: istore          15
        //   254: iload           13
        //   256: bipush          64
        //   258: iand           
        //   259: ifeq            268
        //   262: iconst_1       
        //   263: istore          16
        //   265: goto            271
        //   268: iconst_0       
        //   269: istore          16
        //   271: iload           13
        //   273: bipush          32
        //   275: iand           
        //   276: ifeq            285
        //   279: iconst_1       
        //   280: istore          13
        //   282: goto            288
        //   285: iconst_0       
        //   286: istore          13
        //   288: iconst_0       
        //   289: istore          17
        //   291: iload           15
        //   293: istore          18
        //   295: iload           16
        //   297: istore          19
        //   299: iload           17
        //   301: istore          16
        //   303: goto            417
        //   306: iload_0        
        //   307: iconst_4       
        //   308: if_icmpne       402
        //   311: iload           13
        //   313: bipush          64
        //   315: iand           
        //   316: ifeq            325
        //   319: iconst_1       
        //   320: istore          15
        //   322: goto            328
        //   325: iconst_0       
        //   326: istore          15
        //   328: iload           13
        //   330: bipush          8
        //   332: iand           
        //   333: ifeq            342
        //   336: iconst_1       
        //   337: istore          16
        //   339: goto            345
        //   342: iconst_0       
        //   343: istore          16
        //   345: iload           13
        //   347: iconst_4       
        //   348: iand           
        //   349: ifeq            358
        //   352: iconst_1       
        //   353: istore          19
        //   355: goto            361
        //   358: iconst_0       
        //   359: istore          19
        //   361: iload           13
        //   363: iconst_2       
        //   364: iand           
        //   365: ifeq            374
        //   368: iconst_1       
        //   369: istore          17
        //   371: goto            377
        //   374: iconst_0       
        //   375: istore          17
        //   377: iload           15
        //   379: istore          18
        //   381: iload           13
        //   383: iconst_1       
        //   384: iand           
        //   385: istore          15
        //   387: iload           18
        //   389: istore          13
        //   391: iload           16
        //   393: istore          18
        //   395: iload           17
        //   397: istore          16
        //   399: goto            417
        //   402: iconst_0       
        //   403: istore          15
        //   405: iconst_0       
        //   406: istore          13
        //   408: iconst_0       
        //   409: istore          18
        //   411: iconst_0       
        //   412: istore          19
        //   414: iconst_0       
        //   415: istore          16
        //   417: iload           18
        //   419: ifne            2854
        //   422: iload           19
        //   424: ifeq            430
        //   427: goto            2854
        //   430: iload           12
        //   432: istore          19
        //   434: iload           13
        //   436: ifeq            450
        //   439: iload           12
        //   441: iconst_1       
        //   442: isub           
        //   443: istore          19
        //   445: aload_1        
        //   446: iconst_1       
        //   447: invokevirtual   bar.H:(I)V
        //   450: iload           19
        //   452: istore          12
        //   454: iload           15
        //   456: ifeq            470
        //   459: iload           19
        //   461: iconst_4       
        //   462: isub           
        //   463: istore          12
        //   465: aload_1        
        //   466: iconst_4       
        //   467: invokevirtual   bar.H:(I)V
        //   470: iload           12
        //   472: istore          13
        //   474: iload           16
        //   476: ifeq            487
        //   479: aload_1        
        //   480: iload           12
        //   482: invokestatic    bvk.g:(Lbar;I)I
        //   485: istore          13
        //   487: iload           5
        //   489: bipush          84
        //   491: if_icmpne       664
        //   494: iload           7
        //   496: bipush          88
        //   498: if_icmpne       664
        //   501: iload           9
        //   503: bipush          88
        //   505: if_icmpne       664
        //   508: iload_0        
        //   509: iconst_2       
        //   510: if_icmpeq       520
        //   513: iload           10
        //   515: bipush          88
        //   517: if_icmpne       664
        //   520: iload           13
        //   522: ifgt            532
        //   525: aload           14
        //   527: astore          4
        //   529: goto            697
        //   532: iload           11
        //   534: istore_3       
        //   535: aload_1        
        //   536: invokevirtual   bar.i:()I
        //   539: istore          12
        //   541: iload           11
        //   543: istore_3       
        //   544: iload           12
        //   546: invokestatic    bvk.i:(I)Ljava/lang/String;
        //   549: astore          4
        //   551: iload           13
        //   553: iconst_1       
        //   554: isub           
        //   555: istore          15
        //   557: iload           11
        //   559: istore_3       
        //   560: iload           15
        //   562: newarray        B
        //   564: astore          14
        //   566: iload           11
        //   568: istore_3       
        //   569: aload_1        
        //   570: aload           14
        //   572: iconst_0       
        //   573: iload           15
        //   575: invokevirtual   bar.B:([BII)V
        //   578: iload           11
        //   580: istore_3       
        //   581: aload           14
        //   583: iconst_0       
        //   584: iload           12
        //   586: invokestatic    bvk.e:([BII)I
        //   589: istore          15
        //   591: iload           11
        //   593: istore_3       
        //   594: new             Ljava/lang/String;
        //   597: astore          20
        //   599: iload           11
        //   601: istore_3       
        //   602: aload           20
        //   604: aload           14
        //   606: iconst_0       
        //   607: iload           15
        //   609: aload           4
        //   611: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //   614: iload           11
        //   616: istore_3       
        //   617: iload           15
        //   619: iload           12
        //   621: invokestatic    bvk.d:(I)I
        //   624: iadd           
        //   625: istore          15
        //   627: iload           11
        //   629: istore_3       
        //   630: new             Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
        //   633: dup            
        //   634: ldc             "TXXX"
        //   636: aload           20
        //   638: aload           14
        //   640: iload           15
        //   642: aload           14
        //   644: iload           15
        //   646: iload           12
        //   648: invokestatic    bvk.e:([BII)I
        //   651: aload           4
        //   653: invokestatic    bvk.h:([BIILjava/lang/String;)Ljava/lang/String;
        //   656: invokespecial   androidx/media3/extractor/metadata/id3/TextInformationFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   659: astore          4
        //   661: goto            814
        //   664: iload           5
        //   666: bipush          84
        //   668: if_icmpne       831
        //   671: iload           11
        //   673: istore_3       
        //   674: iload_0        
        //   675: bipush          84
        //   677: iload           7
        //   679: iload           9
        //   681: iload           10
        //   683: invokestatic    bvk.j:(IIIII)Ljava/lang/String;
        //   686: astore          4
        //   688: iload           13
        //   690: ifgt            715
        //   693: aload           14
        //   695: astore          4
        //   697: iload           7
        //   699: istore_3       
        //   700: iload           9
        //   702: istore          7
        //   704: iload           10
        //   706: istore          9
        //   708: iload           7
        //   710: istore          10
        //   712: goto            2712
        //   715: iload           11
        //   717: istore_3       
        //   718: aload_1        
        //   719: invokevirtual   bar.i:()I
        //   722: istore          15
        //   724: iload           11
        //   726: istore_3       
        //   727: iload           15
        //   729: invokestatic    bvk.i:(I)Ljava/lang/String;
        //   732: astore          14
        //   734: iload           13
        //   736: iconst_1       
        //   737: isub           
        //   738: istore          12
        //   740: iload           11
        //   742: istore_3       
        //   743: iload           12
        //   745: newarray        B
        //   747: astore          20
        //   749: iload           11
        //   751: istore_3       
        //   752: aload_1        
        //   753: aload           20
        //   755: iconst_0       
        //   756: iload           12
        //   758: invokevirtual   bar.B:([BII)V
        //   761: iload           11
        //   763: istore_3       
        //   764: aload           20
        //   766: iconst_0       
        //   767: iload           15
        //   769: invokestatic    bvk.e:([BII)I
        //   772: istore          12
        //   774: iload           11
        //   776: istore_3       
        //   777: new             Ljava/lang/String;
        //   780: astore          21
        //   782: iload           11
        //   784: istore_3       
        //   785: aload           21
        //   787: aload           20
        //   789: iconst_0       
        //   790: iload           12
        //   792: aload           14
        //   794: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //   797: iload           11
        //   799: istore_3       
        //   800: new             Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
        //   803: dup            
        //   804: aload           4
        //   806: aconst_null    
        //   807: aload           21
        //   809: invokespecial   androidx/media3/extractor/metadata/id3/TextInformationFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   812: astore          4
        //   814: goto            697
        //   817: astore          4
        //   819: goto            2846
        //   822: astore          4
        //   824: ldc             "Id3Decoder"
        //   826: astore          4
        //   828: goto            2827
        //   831: iload           5
        //   833: bipush          87
        //   835: if_icmpne       1013
        //   838: iload           7
        //   840: bipush          88
        //   842: if_icmpne       1006
        //   845: iload           9
        //   847: bipush          88
        //   849: if_icmpne       1006
        //   852: iload_0        
        //   853: iconst_2       
        //   854: if_icmpeq       864
        //   857: iload           10
        //   859: bipush          88
        //   861: if_icmpne       1006
        //   864: iload           13
        //   866: ifgt            876
        //   869: aload           14
        //   871: astore          4
        //   873: goto            697
        //   876: iload           11
        //   878: istore_3       
        //   879: aload_1        
        //   880: invokevirtual   bar.i:()I
        //   883: istore          12
        //   885: iload           11
        //   887: istore_3       
        //   888: iload           12
        //   890: invokestatic    bvk.i:(I)Ljava/lang/String;
        //   893: astore          20
        //   895: iload           13
        //   897: iconst_1       
        //   898: isub           
        //   899: istore          15
        //   901: iload           11
        //   903: istore_3       
        //   904: iload           15
        //   906: newarray        B
        //   908: astore          4
        //   910: iload           11
        //   912: istore_3       
        //   913: aload_1        
        //   914: aload           4
        //   916: iconst_0       
        //   917: iload           15
        //   919: invokevirtual   bar.B:([BII)V
        //   922: iload           11
        //   924: istore_3       
        //   925: aload           4
        //   927: iconst_0       
        //   928: iload           12
        //   930: invokestatic    bvk.e:([BII)I
        //   933: istore          15
        //   935: iload           11
        //   937: istore_3       
        //   938: new             Ljava/lang/String;
        //   941: astore          14
        //   943: iload           11
        //   945: istore_3       
        //   946: aload           14
        //   948: aload           4
        //   950: iconst_0       
        //   951: iload           15
        //   953: aload           20
        //   955: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //   958: iload           11
        //   960: istore_3       
        //   961: iload           15
        //   963: iload           12
        //   965: invokestatic    bvk.d:(I)I
        //   968: iadd           
        //   969: istore          12
        //   971: iload           11
        //   973: istore_3       
        //   974: new             Landroidx/media3/extractor/metadata/id3/UrlLinkFrame;
        //   977: dup            
        //   978: ldc             "WXXX"
        //   980: aload           14
        //   982: aload           4
        //   984: iload           12
        //   986: aload           4
        //   988: iload           12
        //   990: invokestatic    bvk.f:([BI)I
        //   993: ldc             "ISO-8859-1"
        //   995: invokestatic    bvk.h:([BIILjava/lang/String;)Ljava/lang/String;
        //   998: invokespecial   androidx/media3/extractor/metadata/id3/UrlLinkFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1001: astore          4
        //  1003: goto            814
        //  1006: bipush          87
        //  1008: istore          15
        //  1010: goto            1017
        //  1013: iload           5
        //  1015: istore          15
        //  1017: iload           15
        //  1019: bipush          87
        //  1021: if_icmpne       1116
        //  1024: iload           11
        //  1026: istore_3       
        //  1027: iload_0        
        //  1028: bipush          87
        //  1030: iload           7
        //  1032: iload           9
        //  1034: iload           10
        //  1036: invokestatic    bvk.j:(IIIII)Ljava/lang/String;
        //  1039: astore          4
        //  1041: iload           11
        //  1043: istore_3       
        //  1044: iload           13
        //  1046: newarray        B
        //  1048: astore          14
        //  1050: iload           11
        //  1052: istore_3       
        //  1053: aload_1        
        //  1054: aload           14
        //  1056: iconst_0       
        //  1057: iload           13
        //  1059: invokevirtual   bar.B:([BII)V
        //  1062: iload           11
        //  1064: istore_3       
        //  1065: aload           14
        //  1067: iconst_0       
        //  1068: invokestatic    bvk.f:([BI)I
        //  1071: istore          12
        //  1073: iload           11
        //  1075: istore_3       
        //  1076: new             Ljava/lang/String;
        //  1079: astore          20
        //  1081: iload           11
        //  1083: istore_3       
        //  1084: aload           20
        //  1086: aload           14
        //  1088: iconst_0       
        //  1089: iload           12
        //  1091: ldc             "ISO-8859-1"
        //  1093: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1096: iload           11
        //  1098: istore_3       
        //  1099: new             Landroidx/media3/extractor/metadata/id3/UrlLinkFrame;
        //  1102: dup            
        //  1103: aload           4
        //  1105: aconst_null    
        //  1106: aload           20
        //  1108: invokespecial   androidx/media3/extractor/metadata/id3/UrlLinkFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1111: astore          4
        //  1113: goto            814
        //  1116: iload           15
        //  1118: istore          12
        //  1120: iload           15
        //  1122: bipush          80
        //  1124: if_icmpne       1235
        //  1127: iload           7
        //  1129: bipush          82
        //  1131: if_icmpne       1231
        //  1134: iload           9
        //  1136: bipush          73
        //  1138: if_icmpne       1231
        //  1141: iload           10
        //  1143: bipush          86
        //  1145: if_icmpne       1231
        //  1148: iload           11
        //  1150: istore_3       
        //  1151: iload           13
        //  1153: newarray        B
        //  1155: astore          14
        //  1157: iload           11
        //  1159: istore_3       
        //  1160: aload_1        
        //  1161: aload           14
        //  1163: iconst_0       
        //  1164: iload           13
        //  1166: invokevirtual   bar.B:([BII)V
        //  1169: iload           11
        //  1171: istore_3       
        //  1172: aload           14
        //  1174: iconst_0       
        //  1175: invokestatic    bvk.f:([BI)I
        //  1178: istore          12
        //  1180: iload           11
        //  1182: istore_3       
        //  1183: new             Ljava/lang/String;
        //  1186: astore          4
        //  1188: iload           11
        //  1190: istore_3       
        //  1191: aload           4
        //  1193: aload           14
        //  1195: iconst_0       
        //  1196: iload           12
        //  1198: ldc             "ISO-8859-1"
        //  1200: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1203: iload           11
        //  1205: istore_3       
        //  1206: new             Landroidx/media3/extractor/metadata/id3/PrivFrame;
        //  1209: dup            
        //  1210: aload           4
        //  1212: aload           14
        //  1214: iload           12
        //  1216: iconst_1       
        //  1217: iadd           
        //  1218: iload           13
        //  1220: invokestatic    bvk.l:([BII)[B
        //  1223: invokespecial   androidx/media3/extractor/metadata/id3/PrivFrame.<init>:(Ljava/lang/String;[B)V
        //  1226: astore          4
        //  1228: goto            814
        //  1231: bipush          80
        //  1233: istore          12
        //  1235: iload           12
        //  1237: bipush          71
        //  1239: if_icmpne       1439
        //  1242: iload           7
        //  1244: bipush          69
        //  1246: if_icmpne       1432
        //  1249: iload           9
        //  1251: bipush          79
        //  1253: if_icmpne       1432
        //  1256: iload           10
        //  1258: bipush          66
        //  1260: if_icmpeq       1268
        //  1263: iload_0        
        //  1264: iconst_2       
        //  1265: if_icmpne       1432
        //  1268: iload           11
        //  1270: istore_3       
        //  1271: aload_1        
        //  1272: invokevirtual   bar.i:()I
        //  1275: istore          7
        //  1277: iload           11
        //  1279: istore_3       
        //  1280: iload           7
        //  1282: invokestatic    bvk.i:(I)Ljava/lang/String;
        //  1285: astore          20
        //  1287: iload           13
        //  1289: iconst_1       
        //  1290: isub           
        //  1291: istore          9
        //  1293: iload           11
        //  1295: istore_3       
        //  1296: iload           9
        //  1298: newarray        B
        //  1300: astore          21
        //  1302: iload           11
        //  1304: istore_3       
        //  1305: aload_1        
        //  1306: aload           21
        //  1308: iconst_0       
        //  1309: iload           9
        //  1311: invokevirtual   bar.B:([BII)V
        //  1314: iload           11
        //  1316: istore_3       
        //  1317: aload           21
        //  1319: iconst_0       
        //  1320: invokestatic    bvk.f:([BI)I
        //  1323: istore          12
        //  1325: iload           11
        //  1327: istore_3       
        //  1328: new             Ljava/lang/String;
        //  1331: astore          14
        //  1333: aload           14
        //  1335: aload           21
        //  1337: iconst_0       
        //  1338: iload           12
        //  1340: ldc             "ISO-8859-1"
        //  1342: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1345: iload           12
        //  1347: iconst_1       
        //  1348: iadd           
        //  1349: istore_3       
        //  1350: aload           21
        //  1352: iload_3        
        //  1353: iload           7
        //  1355: invokestatic    bvk.e:([BII)I
        //  1358: istore          12
        //  1360: aload           21
        //  1362: iload_3        
        //  1363: iload           12
        //  1365: aload           20
        //  1367: invokestatic    bvk.h:([BIILjava/lang/String;)Ljava/lang/String;
        //  1370: astore          4
        //  1372: iload           12
        //  1374: iload           7
        //  1376: invokestatic    bvk.d:(I)I
        //  1379: iadd           
        //  1380: istore          12
        //  1382: aload           21
        //  1384: iload           12
        //  1386: iload           7
        //  1388: invokestatic    bvk.e:([BII)I
        //  1391: istore_3       
        //  1392: new             Landroidx/media3/extractor/metadata/id3/GeobFrame;
        //  1395: dup            
        //  1396: aload           14
        //  1398: aload           4
        //  1400: aload           21
        //  1402: iload           12
        //  1404: iload_3        
        //  1405: aload           20
        //  1407: invokestatic    bvk.h:([BIILjava/lang/String;)Ljava/lang/String;
        //  1410: aload           21
        //  1412: iload_3        
        //  1413: iload           7
        //  1415: invokestatic    bvk.d:(I)I
        //  1418: iadd           
        //  1419: iload           9
        //  1421: invokestatic    bvk.l:([BII)[B
        //  1424: invokespecial   androidx/media3/extractor/metadata/id3/GeobFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
        //  1427: astore          4
        //  1429: goto            1924
        //  1432: bipush          71
        //  1434: istore          12
        //  1436: goto            1439
        //  1439: iload_0        
        //  1440: iconst_2       
        //  1441: if_icmpne       1468
        //  1444: iload           12
        //  1446: bipush          80
        //  1448: if_icmpne       1740
        //  1451: iload           7
        //  1453: bipush          73
        //  1455: if_icmpne       1740
        //  1458: iload           9
        //  1460: bipush          67
        //  1462: if_icmpne       1740
        //  1465: goto            1496
        //  1468: iload           12
        //  1470: bipush          65
        //  1472: if_icmpne       1740
        //  1475: iload           7
        //  1477: bipush          80
        //  1479: if_icmpne       1740
        //  1482: iload           9
        //  1484: bipush          73
        //  1486: if_icmpne       1740
        //  1489: iload           10
        //  1491: bipush          67
        //  1493: if_icmpne       1740
        //  1496: aload_1        
        //  1497: invokevirtual   bar.i:()I
        //  1500: istore          12
        //  1502: iload           12
        //  1504: invokestatic    bvk.i:(I)Ljava/lang/String;
        //  1507: astore          21
        //  1509: iload           13
        //  1511: iconst_1       
        //  1512: isub           
        //  1513: istore          7
        //  1515: iload           7
        //  1517: newarray        B
        //  1519: astore          20
        //  1521: aload_1        
        //  1522: aload           20
        //  1524: iconst_0       
        //  1525: iload           7
        //  1527: invokevirtual   bar.B:([BII)V
        //  1530: iload_0        
        //  1531: iconst_2       
        //  1532: if_icmpne       1589
        //  1535: new             Ljava/lang/String;
        //  1538: astore          4
        //  1540: aload           4
        //  1542: aload           20
        //  1544: iconst_0       
        //  1545: iconst_3       
        //  1546: ldc             "ISO-8859-1"
        //  1548: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1551: ldc             "image/"
        //  1553: aload           4
        //  1555: invokestatic    aeda.w:(Ljava/lang/String;)Ljava/lang/String;
        //  1558: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1561: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1564: astore          14
        //  1566: aload           14
        //  1568: astore          4
        //  1570: ldc             "image/jpg"
        //  1572: aload           14
        //  1574: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1577: ifeq            1584
        //  1580: ldc             "image/jpeg"
        //  1582: astore          4
        //  1584: iconst_2       
        //  1585: istore_3       
        //  1586: goto            1654
        //  1589: aload           20
        //  1591: iconst_0       
        //  1592: invokestatic    bvk.f:([BI)I
        //  1595: istore          9
        //  1597: new             Ljava/lang/String;
        //  1600: astore          4
        //  1602: aload           4
        //  1604: aload           20
        //  1606: iconst_0       
        //  1607: iload           9
        //  1609: ldc             "ISO-8859-1"
        //  1611: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1614: aload           4
        //  1616: invokestatic    aeda.w:(Ljava/lang/String;)Ljava/lang/String;
        //  1619: astore          14
        //  1621: aload           14
        //  1623: astore          4
        //  1625: iload           9
        //  1627: istore_3       
        //  1628: aload           14
        //  1630: bipush          47
        //  1632: invokevirtual   java/lang/String.indexOf:(I)I
        //  1635: iconst_m1      
        //  1636: if_icmpne       1654
        //  1639: ldc             "image/"
        //  1641: aload           14
        //  1643: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1646: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1649: astore          4
        //  1651: iload           9
        //  1653: istore_3       
        //  1654: aload           20
        //  1656: iload_3        
        //  1657: iconst_1       
        //  1658: iadd           
        //  1659: baload         
        //  1660: istore          9
        //  1662: iinc            3, 2
        //  1665: aload           20
        //  1667: iload_3        
        //  1668: iload           12
        //  1670: invokestatic    bvk.e:([BII)I
        //  1673: istore          15
        //  1675: new             Ljava/lang/String;
        //  1678: astore          14
        //  1680: aload           14
        //  1682: aload           20
        //  1684: iload_3        
        //  1685: iload           15
        //  1687: iload_3        
        //  1688: isub           
        //  1689: aload           21
        //  1691: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1694: new             Landroidx/media3/extractor/metadata/id3/ApicFrame;
        //  1697: dup            
        //  1698: aload           4
        //  1700: aload           14
        //  1702: iload           9
        //  1704: sipush          255
        //  1707: iand           
        //  1708: aload           20
        //  1710: iload           15
        //  1712: iload           12
        //  1714: invokestatic    bvk.d:(I)I
        //  1717: iadd           
        //  1718: iload           7
        //  1720: invokestatic    bvk.l:([BII)[B
        //  1723: invokespecial   androidx/media3/extractor/metadata/id3/ApicFrame.<init>:(Ljava/lang/String;Ljava/lang/String;I[B)V
        //  1726: astore          4
        //  1728: goto            1924
        //  1731: astore          4
        //  1733: ldc             "Id3Decoder"
        //  1735: astore          4
        //  1737: goto            2809
        //  1740: iload           12
        //  1742: bipush          67
        //  1744: if_icmpne       1938
        //  1747: iload           7
        //  1749: bipush          79
        //  1751: if_icmpne       1938
        //  1754: iload           9
        //  1756: bipush          77
        //  1758: if_icmpne       1938
        //  1761: iload           10
        //  1763: bipush          77
        //  1765: if_icmpeq       1773
        //  1768: iload_0        
        //  1769: iconst_2       
        //  1770: if_icmpne       1938
        //  1773: iload           13
        //  1775: iconst_4       
        //  1776: if_icmpge       1800
        //  1779: iload           7
        //  1781: istore_3       
        //  1782: iload           10
        //  1784: istore          7
        //  1786: aconst_null    
        //  1787: astore          4
        //  1789: iload           9
        //  1791: istore          10
        //  1793: iload           7
        //  1795: istore          9
        //  1797: goto            2712
        //  1800: aload_1        
        //  1801: invokevirtual   bar.i:()I
        //  1804: istore_3       
        //  1805: iload_3        
        //  1806: invokestatic    bvk.i:(I)Ljava/lang/String;
        //  1809: astore          4
        //  1811: iconst_3       
        //  1812: newarray        B
        //  1814: astore          20
        //  1816: aload_1        
        //  1817: aload           20
        //  1819: iconst_0       
        //  1820: iconst_3       
        //  1821: invokevirtual   bar.B:([BII)V
        //  1824: new             Ljava/lang/String;
        //  1827: astore          14
        //  1829: aload           14
        //  1831: aload           20
        //  1833: iconst_0       
        //  1834: iconst_3       
        //  1835: invokespecial   java/lang/String.<init>:([BII)V
        //  1838: iload           13
        //  1840: iconst_4       
        //  1841: isub           
        //  1842: istore          9
        //  1844: iload           9
        //  1846: newarray        B
        //  1848: astore          20
        //  1850: aload_1        
        //  1851: aload           20
        //  1853: iconst_0       
        //  1854: iload           9
        //  1856: invokevirtual   bar.B:([BII)V
        //  1859: aload           20
        //  1861: iconst_0       
        //  1862: iload_3        
        //  1863: invokestatic    bvk.e:([BII)I
        //  1866: istore          9
        //  1868: new             Ljava/lang/String;
        //  1871: astore          21
        //  1873: aload           21
        //  1875: aload           20
        //  1877: iconst_0       
        //  1878: iload           9
        //  1880: aload           4
        //  1882: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1885: iload           9
        //  1887: iload_3        
        //  1888: invokestatic    bvk.d:(I)I
        //  1891: iadd           
        //  1892: istore          9
        //  1894: new             Landroidx/media3/extractor/metadata/id3/CommentFrame;
        //  1897: dup            
        //  1898: aload           14
        //  1900: aload           21
        //  1902: aload           20
        //  1904: iload           9
        //  1906: aload           20
        //  1908: iload           9
        //  1910: iload_3        
        //  1911: invokestatic    bvk.e:([BII)I
        //  1914: aload           4
        //  1916: invokestatic    bvk.h:([BIILjava/lang/String;)Ljava/lang/String;
        //  1919: invokespecial   androidx/media3/extractor/metadata/id3/CommentFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1922: astore          4
        //  1924: iload           6
        //  1926: istore_3       
        //  1927: iload           10
        //  1929: istore          9
        //  1931: iload           8
        //  1933: istore          10
        //  1935: goto            2712
        //  1938: iload           12
        //  1940: bipush          67
        //  1942: if_icmpne       2156
        //  1945: iload           7
        //  1947: bipush          72
        //  1949: if_icmpne       2156
        //  1952: iload           9
        //  1954: bipush          65
        //  1956: if_icmpne       2156
        //  1959: iload           10
        //  1961: bipush          80
        //  1963: if_icmpne       2156
        //  1966: aload_1        
        //  1967: getfield        bar.b:I
        //  1970: istore          9
        //  1972: aload_1        
        //  1973: getfield        bar.a:[B
        //  1976: iload           9
        //  1978: invokestatic    bvk.f:([BI)I
        //  1981: istore          7
        //  1983: new             Ljava/lang/String;
        //  1986: astore          20
        //  1988: aload           20
        //  1990: aload_1        
        //  1991: getfield        bar.a:[B
        //  1994: iload           9
        //  1996: iload           7
        //  1998: iload           9
        //  2000: isub           
        //  2001: ldc             "ISO-8859-1"
        //  2003: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  2006: aload_1        
        //  2007: iload           7
        //  2009: iconst_1       
        //  2010: iadd           
        //  2011: invokevirtual   bar.G:(I)V
        //  2014: aload_1        
        //  2015: invokevirtual   bar.d:()I
        //  2018: istore          12
        //  2020: aload_1        
        //  2021: invokevirtual   bar.d:()I
        //  2024: istore          7
        //  2026: aload_1        
        //  2027: invokevirtual   bar.q:()J
        //  2030: lstore          22
        //  2032: lload           22
        //  2034: lstore          24
        //  2036: lload           22
        //  2038: ldc2_w          4294967295
        //  2041: lcmp           
        //  2042: ifne            2050
        //  2045: ldc2_w          -1
        //  2048: lstore          24
        //  2050: aload_1        
        //  2051: invokevirtual   bar.q:()J
        //  2054: lstore          26
        //  2056: lload           26
        //  2058: lstore          22
        //  2060: lload           26
        //  2062: ldc2_w          4294967295
        //  2065: lcmp           
        //  2066: ifne            2074
        //  2069: ldc2_w          -1
        //  2072: lstore          22
        //  2074: new             Ljava/util/ArrayList;
        //  2077: astore          4
        //  2079: aload           4
        //  2081: invokespecial   java/util/ArrayList.<init>:()V
        //  2084: aload_1        
        //  2085: getfield        bar.b:I
        //  2088: iload           9
        //  2090: iload           13
        //  2092: iadd           
        //  2093: if_icmpge       2122
        //  2096: iload_0        
        //  2097: aload_1        
        //  2098: iload_2        
        //  2099: iload_3        
        //  2100: aconst_null    
        //  2101: invokestatic    bvk.m:(ILbar;ZILbvj;)Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2104: astore          14
        //  2106: aload           14
        //  2108: ifnull          2084
        //  2111: aload           4
        //  2113: aload           14
        //  2115: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2118: pop            
        //  2119: goto            2084
        //  2122: new             Landroidx/media3/extractor/metadata/id3/ChapterFrame;
        //  2125: dup            
        //  2126: aload           20
        //  2128: iload           12
        //  2130: iload           7
        //  2132: lload           24
        //  2134: lload           22
        //  2136: aload           4
        //  2138: iconst_0       
        //  2139: anewarray       Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2142: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  2145: checkcast       [Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2148: invokespecial   androidx/media3/extractor/metadata/id3/ChapterFrame.<init>:(Ljava/lang/String;IIJJ[Landroidx/media3/extractor/metadata/id3/Id3Frame;)V
        //  2151: astore          4
        //  2153: goto            1924
        //  2156: iload           12
        //  2158: bipush          67
        //  2160: if_icmpne       2451
        //  2163: iload           7
        //  2165: bipush          84
        //  2167: if_icmpne       2451
        //  2170: iload           9
        //  2172: bipush          79
        //  2174: if_icmpne       2451
        //  2177: iload           10
        //  2179: bipush          67
        //  2181: if_icmpne       2451
        //  2184: aload_1        
        //  2185: getfield        bar.b:I
        //  2188: istore          6
        //  2190: aload_1        
        //  2191: getfield        bar.a:[B
        //  2194: iload           6
        //  2196: invokestatic    bvk.f:([BI)I
        //  2199: istore          12
        //  2201: new             Ljava/lang/String;
        //  2204: astore          4
        //  2206: aload           4
        //  2208: aload_1        
        //  2209: getfield        bar.a:[B
        //  2212: iload           6
        //  2214: iload           12
        //  2216: iload           6
        //  2218: isub           
        //  2219: ldc             "ISO-8859-1"
        //  2221: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  2224: aload_1        
        //  2225: iload           12
        //  2227: iconst_1       
        //  2228: iadd           
        //  2229: invokevirtual   bar.G:(I)V
        //  2232: aload_1        
        //  2233: invokevirtual   bar.i:()I
        //  2236: istore          8
        //  2238: iload           8
        //  2240: iconst_2       
        //  2241: iand           
        //  2242: ifeq            2251
        //  2245: iconst_1       
        //  2246: istore          28
        //  2248: goto            2254
        //  2251: iconst_0       
        //  2252: istore          28
        //  2254: aload_1        
        //  2255: invokevirtual   bar.i:()I
        //  2258: istore          15
        //  2260: iload           15
        //  2262: anewarray       Ljava/lang/String;
        //  2265: astore          14
        //  2267: iconst_0       
        //  2268: istore          12
        //  2270: iload           12
        //  2272: iload           15
        //  2274: if_icmpge       2338
        //  2277: aload_1        
        //  2278: getfield        bar.b:I
        //  2281: istore          16
        //  2283: aload_1        
        //  2284: getfield        bar.a:[B
        //  2287: iload           16
        //  2289: invokestatic    bvk.f:([BI)I
        //  2292: istore          19
        //  2294: new             Ljava/lang/String;
        //  2297: astore          20
        //  2299: aload           20
        //  2301: aload_1        
        //  2302: getfield        bar.a:[B
        //  2305: iload           16
        //  2307: iload           19
        //  2309: iload           16
        //  2311: isub           
        //  2312: ldc             "ISO-8859-1"
        //  2314: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  2317: aload           14
        //  2319: iload           12
        //  2321: aload           20
        //  2323: aastore        
        //  2324: aload_1        
        //  2325: iload           19
        //  2327: iconst_1       
        //  2328: iadd           
        //  2329: invokevirtual   bar.G:(I)V
        //  2332: iinc            12, 1
        //  2335: goto            2270
        //  2338: new             Ljava/util/ArrayList;
        //  2341: astore          21
        //  2343: aload           21
        //  2345: invokespecial   java/util/ArrayList.<init>:()V
        //  2348: aload_1        
        //  2349: getfield        bar.b:I
        //  2352: iload           6
        //  2354: iload           13
        //  2356: iadd           
        //  2357: if_icmpge       2386
        //  2360: iload_0        
        //  2361: aload_1        
        //  2362: iload_2        
        //  2363: iload_3        
        //  2364: aconst_null    
        //  2365: invokestatic    bvk.m:(ILbar;ZILbvj;)Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2368: astore          20
        //  2370: aload           20
        //  2372: ifnull          2348
        //  2375: aload           21
        //  2377: aload           20
        //  2379: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2382: pop            
        //  2383: goto            2348
        //  2386: aload           21
        //  2388: iconst_0       
        //  2389: anewarray       Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2392: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  2395: checkcast       [Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2398: astore          20
        //  2400: iconst_1       
        //  2401: iload           8
        //  2403: iconst_1       
        //  2404: iand           
        //  2405: if_icmpeq       2413
        //  2408: iconst_0       
        //  2409: istore_2       
        //  2410: goto            2415
        //  2413: iconst_1       
        //  2414: istore_2       
        //  2415: new             Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;
        //  2418: dup            
        //  2419: aload           4
        //  2421: iload           28
        //  2423: iload_2        
        //  2424: aload           14
        //  2426: aload           20
        //  2428: invokespecial   androidx/media3/extractor/metadata/id3/ChapterTocFrame.<init>:(Ljava/lang/String;ZZ[Ljava/lang/String;[Landroidx/media3/extractor/metadata/id3/Id3Frame;)V
        //  2431: astore          4
        //  2433: iload           10
        //  2435: istore          12
        //  2437: iload           9
        //  2439: istore          10
        //  2441: iload           7
        //  2443: istore_3       
        //  2444: iload           12
        //  2446: istore          9
        //  2448: goto            2712
        //  2451: iload           12
        //  2453: bipush          77
        //  2455: if_icmpne       2660
        //  2458: iload           7
        //  2460: istore_3       
        //  2461: iload_3        
        //  2462: bipush          76
        //  2464: if_icmpne       2657
        //  2467: iload           9
        //  2469: istore          7
        //  2471: iload           10
        //  2473: istore          9
        //  2475: iload           7
        //  2477: bipush          76
        //  2479: if_icmpne       2660
        //  2482: iload           9
        //  2484: bipush          84
        //  2486: if_icmpne       2660
        //  2489: aload_1        
        //  2490: invokevirtual   bar.m:()I
        //  2493: istore          12
        //  2495: aload_1        
        //  2496: invokevirtual   bar.k:()I
        //  2499: istore          6
        //  2501: aload_1        
        //  2502: invokevirtual   bar.k:()I
        //  2505: istore          19
        //  2507: aload_1        
        //  2508: invokevirtual   bar.i:()I
        //  2511: istore          15
        //  2513: aload_1        
        //  2514: invokevirtual   bar.i:()I
        //  2517: istore          16
        //  2519: new             Lathu;
        //  2522: astore          14
        //  2524: aload           14
        //  2526: aconst_null    
        //  2527: invokespecial   athu.<init>:([B)V
        //  2530: aload           14
        //  2532: aload_1        
        //  2533: getfield        bar.a:[B
        //  2536: aload_1        
        //  2537: getfield        bar.c:I
        //  2540: invokevirtual   athu.l:([BI)V
        //  2543: aload           14
        //  2545: aload_1        
        //  2546: getfield        bar.b:I
        //  2549: bipush          8
        //  2551: imul           
        //  2552: invokevirtual   athu.m:(I)V
        //  2555: iload           13
        //  2557: bipush          10
        //  2559: isub           
        //  2560: bipush          8
        //  2562: imul           
        //  2563: iload           15
        //  2565: iload           16
        //  2567: iadd           
        //  2568: idiv           
        //  2569: istore          8
        //  2571: iload           8
        //  2573: newarray        I
        //  2575: astore          4
        //  2577: iload           8
        //  2579: newarray        I
        //  2581: astore          20
        //  2583: iconst_0       
        //  2584: istore          10
        //  2586: iload           10
        //  2588: iload           8
        //  2590: if_icmpge       2631
        //  2593: aload           14
        //  2595: iload           15
        //  2597: invokevirtual   athu.g:(I)I
        //  2600: istore          18
        //  2602: aload           14
        //  2604: iload           16
        //  2606: invokevirtual   athu.g:(I)I
        //  2609: istore          17
        //  2611: aload           4
        //  2613: iload           10
        //  2615: iload           18
        //  2617: iastore        
        //  2618: aload           20
        //  2620: iload           10
        //  2622: iload           17
        //  2624: iastore        
        //  2625: iinc            10, 1
        //  2628: goto            2586
        //  2631: new             Landroidx/media3/extractor/metadata/id3/MlltFrame;
        //  2634: dup            
        //  2635: iload           12
        //  2637: iload           6
        //  2639: iload           19
        //  2641: aload           4
        //  2643: aload           20
        //  2645: invokespecial   androidx/media3/extractor/metadata/id3/MlltFrame.<init>:(III[I[I)V
        //  2648: astore          4
        //  2650: iload           7
        //  2652: istore          10
        //  2654: goto            2712
        //  2657: goto            2660
        //  2660: iload           6
        //  2662: istore_3       
        //  2663: iload_0        
        //  2664: iload           12
        //  2666: iload_3        
        //  2667: iload           8
        //  2669: iload           10
        //  2671: invokestatic    bvk.j:(IIIII)Ljava/lang/String;
        //  2674: astore          14
        //  2676: iload           13
        //  2678: newarray        B
        //  2680: astore          4
        //  2682: aload_1        
        //  2683: aload           4
        //  2685: iconst_0       
        //  2686: iload           13
        //  2688: invokevirtual   bar.B:([BII)V
        //  2691: new             Landroidx/media3/extractor/metadata/id3/BinaryFrame;
        //  2694: dup            
        //  2695: aload           14
        //  2697: aload           4
        //  2699: invokespecial   androidx/media3/extractor/metadata/id3/BinaryFrame.<init>:(Ljava/lang/String;[B)V
        //  2702: astore          4
        //  2704: iload           10
        //  2706: istore          9
        //  2708: iload           8
        //  2710: istore          10
        //  2712: aload           4
        //  2714: ifnonnull       2812
        //  2717: iload_0        
        //  2718: iload           5
        //  2720: iload_3        
        //  2721: iload           10
        //  2723: iload           9
        //  2725: invokestatic    bvk.j:(IIIII)Ljava/lang/String;
        //  2728: astore          20
        //  2730: new             Ljava/lang/StringBuilder;
        //  2733: astore          14
        //  2735: aload           14
        //  2737: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2740: aload           14
        //  2742: ldc_w           "Failed to decode frame: id="
        //  2745: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2748: pop            
        //  2749: aload           14
        //  2751: aload           20
        //  2753: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2756: pop            
        //  2757: aload           14
        //  2759: ldc_w           ", frameSize="
        //  2762: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2765: pop            
        //  2766: aload           14
        //  2768: iload           13
        //  2770: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2773: pop            
        //  2774: aload           14
        //  2776: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2779: astore          20
        //  2781: ldc             "Id3Decoder"
        //  2783: astore          14
        //  2785: aload           14
        //  2787: aload           20
        //  2789: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2792: goto            2812
        //  2795: astore          4
        //  2797: iload           11
        //  2799: istore_3       
        //  2800: goto            2846
        //  2803: astore          4
        //  2805: ldc             "Id3Decoder"
        //  2807: astore          4
        //  2809: goto            2827
        //  2812: aload_1        
        //  2813: iload           11
        //  2815: invokevirtual   bar.G:(I)V
        //  2818: aload           4
        //  2820: areturn        
        //  2821: astore          4
        //  2823: ldc             "Id3Decoder"
        //  2825: astore          4
        //  2827: iload           11
        //  2829: istore_3       
        //  2830: aload           4
        //  2832: ldc_w           "Unsupported character encoding"
        //  2835: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2838: aload_1        
        //  2839: iload           11
        //  2841: invokevirtual   bar.G:(I)V
        //  2844: aconst_null    
        //  2845: areturn        
        //  2846: aload_1        
        //  2847: iload_3        
        //  2848: invokevirtual   bar.G:(I)V
        //  2851: aload           4
        //  2853: athrow         
        //  2854: ldc             "Id3Decoder"
        //  2856: ldc_w           "Skipping unsupported compressed or encrypted frame"
        //  2859: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2862: aload_1        
        //  2863: iload           11
        //  2865: invokevirtual   bar.G:(I)V
        //  2868: aconst_null    
        //  2869: areturn        
        //  2870: aload_1        
        //  2871: iload           11
        //  2873: invokevirtual   bar.G:(I)V
        //  2876: aconst_null    
        //  2877: areturn        
        //  2878: astore          4
        //  2880: aload           14
        //  2882: astore          4
        //  2884: goto            2809
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  535    541    822    831    Ljava/io/UnsupportedEncodingException;
        //  535    541    817    822    Any
        //  544    551    822    831    Ljava/io/UnsupportedEncodingException;
        //  544    551    817    822    Any
        //  560    566    822    831    Ljava/io/UnsupportedEncodingException;
        //  560    566    817    822    Any
        //  569    578    822    831    Ljava/io/UnsupportedEncodingException;
        //  569    578    817    822    Any
        //  581    591    822    831    Ljava/io/UnsupportedEncodingException;
        //  581    591    817    822    Any
        //  594    599    822    831    Ljava/io/UnsupportedEncodingException;
        //  594    599    817    822    Any
        //  602    614    822    831    Ljava/io/UnsupportedEncodingException;
        //  602    614    817    822    Any
        //  617    627    822    831    Ljava/io/UnsupportedEncodingException;
        //  617    627    817    822    Any
        //  630    661    822    831    Ljava/io/UnsupportedEncodingException;
        //  630    661    817    822    Any
        //  674    688    822    831    Ljava/io/UnsupportedEncodingException;
        //  674    688    817    822    Any
        //  718    724    822    831    Ljava/io/UnsupportedEncodingException;
        //  718    724    817    822    Any
        //  727    734    822    831    Ljava/io/UnsupportedEncodingException;
        //  727    734    817    822    Any
        //  743    749    822    831    Ljava/io/UnsupportedEncodingException;
        //  743    749    817    822    Any
        //  752    761    822    831    Ljava/io/UnsupportedEncodingException;
        //  752    761    817    822    Any
        //  764    774    822    831    Ljava/io/UnsupportedEncodingException;
        //  764    774    817    822    Any
        //  777    782    822    831    Ljava/io/UnsupportedEncodingException;
        //  777    782    817    822    Any
        //  785    797    822    831    Ljava/io/UnsupportedEncodingException;
        //  785    797    817    822    Any
        //  800    814    822    831    Ljava/io/UnsupportedEncodingException;
        //  800    814    817    822    Any
        //  879    885    822    831    Ljava/io/UnsupportedEncodingException;
        //  879    885    817    822    Any
        //  888    895    822    831    Ljava/io/UnsupportedEncodingException;
        //  888    895    817    822    Any
        //  904    910    822    831    Ljava/io/UnsupportedEncodingException;
        //  904    910    817    822    Any
        //  913    922    822    831    Ljava/io/UnsupportedEncodingException;
        //  913    922    817    822    Any
        //  925    935    822    831    Ljava/io/UnsupportedEncodingException;
        //  925    935    817    822    Any
        //  938    943    822    831    Ljava/io/UnsupportedEncodingException;
        //  938    943    817    822    Any
        //  946    958    822    831    Ljava/io/UnsupportedEncodingException;
        //  946    958    817    822    Any
        //  961    971    822    831    Ljava/io/UnsupportedEncodingException;
        //  961    971    817    822    Any
        //  974    1003   822    831    Ljava/io/UnsupportedEncodingException;
        //  974    1003   817    822    Any
        //  1027   1041   822    831    Ljava/io/UnsupportedEncodingException;
        //  1027   1041   817    822    Any
        //  1044   1050   822    831    Ljava/io/UnsupportedEncodingException;
        //  1044   1050   817    822    Any
        //  1053   1062   822    831    Ljava/io/UnsupportedEncodingException;
        //  1053   1062   817    822    Any
        //  1065   1073   822    831    Ljava/io/UnsupportedEncodingException;
        //  1065   1073   817    822    Any
        //  1076   1081   822    831    Ljava/io/UnsupportedEncodingException;
        //  1076   1081   817    822    Any
        //  1084   1096   822    831    Ljava/io/UnsupportedEncodingException;
        //  1084   1096   817    822    Any
        //  1099   1113   822    831    Ljava/io/UnsupportedEncodingException;
        //  1099   1113   817    822    Any
        //  1151   1157   822    831    Ljava/io/UnsupportedEncodingException;
        //  1151   1157   817    822    Any
        //  1160   1169   822    831    Ljava/io/UnsupportedEncodingException;
        //  1160   1169   817    822    Any
        //  1172   1180   822    831    Ljava/io/UnsupportedEncodingException;
        //  1172   1180   817    822    Any
        //  1183   1188   822    831    Ljava/io/UnsupportedEncodingException;
        //  1183   1188   817    822    Any
        //  1191   1203   822    831    Ljava/io/UnsupportedEncodingException;
        //  1191   1203   817    822    Any
        //  1206   1228   822    831    Ljava/io/UnsupportedEncodingException;
        //  1206   1228   817    822    Any
        //  1271   1277   822    831    Ljava/io/UnsupportedEncodingException;
        //  1271   1277   817    822    Any
        //  1280   1287   822    831    Ljava/io/UnsupportedEncodingException;
        //  1280   1287   817    822    Any
        //  1296   1302   822    831    Ljava/io/UnsupportedEncodingException;
        //  1296   1302   817    822    Any
        //  1305   1314   822    831    Ljava/io/UnsupportedEncodingException;
        //  1305   1314   817    822    Any
        //  1317   1325   822    831    Ljava/io/UnsupportedEncodingException;
        //  1317   1325   817    822    Any
        //  1328   1333   822    831    Ljava/io/UnsupportedEncodingException;
        //  1328   1333   817    822    Any
        //  1333   1345   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1333   1345   2795   2803   Any
        //  1350   1429   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1350   1429   2795   2803   Any
        //  1496   1509   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1496   1509   2795   2803   Any
        //  1515   1530   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1515   1530   2795   2803   Any
        //  1535   1566   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1535   1566   2795   2803   Any
        //  1570   1580   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1570   1580   2795   2803   Any
        //  1589   1621   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1589   1621   2795   2803   Any
        //  1628   1651   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1628   1651   2795   2803   Any
        //  1665   1675   1731   1740   Ljava/io/UnsupportedEncodingException;
        //  1665   1675   2795   2803   Any
        //  1675   1728   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  1675   1728   2795   2803   Any
        //  1800   1838   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  1800   1838   2795   2803   Any
        //  1844   1924   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  1844   1924   2795   2803   Any
        //  1966   2032   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  1966   2032   2795   2803   Any
        //  2050   2056   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2050   2056   2795   2803   Any
        //  2074   2084   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2074   2084   2795   2803   Any
        //  2084   2106   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2084   2106   2795   2803   Any
        //  2111   2119   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2111   2119   2795   2803   Any
        //  2122   2153   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2122   2153   2795   2803   Any
        //  2184   2238   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2184   2238   2795   2803   Any
        //  2254   2267   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2254   2267   2795   2803   Any
        //  2277   2317   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2277   2317   2795   2803   Any
        //  2324   2332   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2324   2332   2795   2803   Any
        //  2338   2348   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2338   2348   2795   2803   Any
        //  2348   2370   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2348   2370   2795   2803   Any
        //  2375   2383   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2375   2383   2795   2803   Any
        //  2386   2400   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2386   2400   2795   2803   Any
        //  2415   2433   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2415   2433   2795   2803   Any
        //  2489   2583   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2489   2583   2795   2803   Any
        //  2593   2611   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2593   2611   2795   2803   Any
        //  2631   2650   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2631   2650   2795   2803   Any
        //  2663   2704   2821   2827   Ljava/io/UnsupportedEncodingException;
        //  2663   2704   2795   2803   Any
        //  2717   2781   2803   2809   Ljava/io/UnsupportedEncodingException;
        //  2717   2781   2795   2803   Any
        //  2785   2792   2878   2887   Ljava/io/UnsupportedEncodingException;
        //  2785   2792   2795   2803   Any
        //  2830   2838   817    822    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1450, Size: 1450
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
    
    protected final Metadata b(final bve bve, final ByteBuffer byteBuffer) {
        return this.c(byteBuffer.array(), byteBuffer.limit());
    }
    
    public final Metadata c(final byte[] array, int n) {
        final ArrayList list = new ArrayList();
        final bar bar = new bar(array, n);
        n = bar.a();
        final boolean b = false;
        final int n2 = 10;
        owl owl = null;
        Label_0317: {
            Label_0046: {
                if (n < 10) {
                    bao.c("Id3Decoder", "Data too short to be an ID3 tag");
                }
                else {
                    n = bar.k();
                    if (n == 4801587) {
                        final int i = bar.i();
                        bar.H(1);
                        final int j = bar.i();
                        final int h = bar.h();
                        if (i == 2) {
                            n = h;
                            if ((j & 0x40) != 0x0) {
                                bao.c("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                break Label_0046;
                            }
                        }
                        else if (i == 3) {
                            n = h;
                            if ((j & 0x40) != 0x0) {
                                n = bar.d();
                                bar.H(n);
                                n = h - (n + 4);
                            }
                        }
                        else {
                            if (i != 4) {
                                final StringBuilder sb = new StringBuilder("Skipped ID3 tag with unsupported majorVersion=");
                                sb.append(i);
                                bao.c("Id3Decoder", sb.toString());
                                break Label_0046;
                            }
                            int n3 = h;
                            if ((j & 0x40) != 0x0) {
                                n = bar.h();
                                bar.H(n - 4);
                                n3 = h - n;
                            }
                            n = n3;
                            if ((j & 0x10) != 0x0) {
                                n = n3 - 10;
                            }
                        }
                        owl = new owl(i, i < 4 && (j & 0x80) != 0x0, n);
                        break Label_0317;
                    }
                    bao.c("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", n))));
                }
            }
            owl = null;
        }
        if (owl == null) {
            return null;
        }
        final int b2 = bar.b;
        n = n2;
        if (owl.a == 2) {
            n = 6;
        }
        int n4 = owl.b;
        if (owl.c) {
            n4 = g(bar, n4);
        }
        bar.F(b2 + n4);
        boolean b3 = b;
        if (!k(bar, owl.a, n, false)) {
            if (owl.a != 4 || !k(bar, 4, n, true)) {
                n = owl.a;
                final StringBuilder sb2 = new StringBuilder("Failed to validate ID3 tag with majorVersion=");
                sb2.append(n);
                bao.c("Id3Decoder", sb2.toString());
                return null;
            }
            b3 = true;
        }
        while (bar.a() >= n) {
            final Id3Frame m = m(owl.a, bar, b3, n, this.b);
            if (m != null) {
                list.add(m);
            }
        }
        return new Metadata((List)list);
    }
}
