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

public final class bvl extends bvg
{
    public static final bvk a;
    private final bvk b;
    
    static {
        a = bvk.a;
    }
    
    public bvl() {
        this(null);
    }
    
    public bvl(final bvk b) {
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
    
    private static int g(final bas bas, int n) {
        final byte[] a = bas.a;
        int b;
        final int n2 = b = bas.b;
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
    
    private static boolean k(final bas bas, final int n, final int n2, final boolean b) {
        final int b2 = bas.b;
        try {
            while (true) {
                final int a = bas.a();
                final int n3 = 1;
                final int n4 = 1;
                if (a < n2) {
                    bas.G(b2);
                    return true;
                }
                int n5;
                long q;
                int m;
                if (n >= 3) {
                    n5 = bas.d();
                    q = bas.q();
                    m = bas.m();
                }
                else {
                    n5 = bas.k();
                    q = bas.k();
                    m = 0;
                }
                if (n5 == 0 && q == 0L && m == 0) {
                    bas.G(b2);
                    return true;
                }
                long n6 = q;
                if (n == 4) {
                    n6 = q;
                    if (!b) {
                        if ((0x808080L & q) != 0x0L) {
                            bas.G(b2);
                            return false;
                        }
                        n6 = (q >> 24 << 21 | ((q >> 16 & 0xFFL) << 14 | ((q & 0xFFL) | (q >> 8 & 0xFFL) << 7)));
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
                    bas.G(b2);
                    return false;
                }
                if (bas.a() < n6) {
                    bas.G(b2);
                    return false;
                }
                bas.H((int)n6);
            }
        }
        finally {
            bas.G(b2);
            while (true) {}
        }
    }
    
    private static byte[] l(final byte[] array, final int n, final int n2) {
        if (n2 <= n) {
            return bax.e;
        }
        return Arrays.copyOfRange(array, n, n2);
    }
    
    private static Id3Frame m(final int p0, final bas p1, final boolean p2, final int p3, final bvk p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   bas.i:()I
        //     4: istore          18
        //     6: aload_1        
        //     7: invokevirtual   bas.i:()I
        //    10: istore          11
        //    12: iload           11
        //    14: istore          8
        //    16: aload_1        
        //    17: invokevirtual   bas.i:()I
        //    20: istore          12
        //    22: iload           12
        //    24: istore          6
        //    26: iload_0        
        //    27: iconst_3       
        //    28: if_icmplt       40
        //    31: aload_1        
        //    32: invokevirtual   bas.i:()I
        //    35: istore          5
        //    37: goto            43
        //    40: iconst_0       
        //    41: istore          5
        //    43: iload_0        
        //    44: iconst_4       
        //    45: if_icmpne       108
        //    48: aload_1        
        //    49: invokevirtual   bas.l:()I
        //    52: istore          7
        //    54: iload           7
        //    56: istore          9
        //    58: iload_2        
        //    59: ifne            128
        //    62: iload           7
        //    64: bipush          24
        //    66: ishr           
        //    67: bipush          21
        //    69: ishl           
        //    70: iload           7
        //    72: sipush          255
        //    75: iand           
        //    76: iload           7
        //    78: bipush          8
        //    80: ishr           
        //    81: sipush          255
        //    84: iand           
        //    85: bipush          7
        //    87: ishl           
        //    88: ior            
        //    89: iload           7
        //    91: bipush          16
        //    93: ishr           
        //    94: sipush          255
        //    97: iand           
        //    98: bipush          14
        //   100: ishl           
        //   101: ior            
        //   102: ior            
        //   103: istore          9
        //   105: goto            128
        //   108: iload_0        
        //   109: iconst_3       
        //   110: if_icmpne       122
        //   113: aload_1        
        //   114: invokevirtual   bas.l:()I
        //   117: istore          9
        //   119: goto            128
        //   122: aload_1        
        //   123: invokevirtual   bas.k:()I
        //   126: istore          9
        //   128: iload_0        
        //   129: iconst_3       
        //   130: if_icmplt       142
        //   133: aload_1        
        //   134: invokevirtual   bas.m:()I
        //   137: istore          14
        //   139: goto            145
        //   142: iconst_0       
        //   143: istore          14
        //   145: aconst_null    
        //   146: astore          26
        //   148: iload           18
        //   150: ifne            191
        //   153: iload           8
        //   155: ifne            191
        //   158: iload           6
        //   160: ifne            191
        //   163: iload           5
        //   165: ifne            191
        //   168: iload           9
        //   170: ifne            191
        //   173: iload           14
        //   175: ifeq            181
        //   178: goto            191
        //   181: aload_1        
        //   182: aload_1        
        //   183: getfield        bas.c:I
        //   186: invokevirtual   bas.G:(I)V
        //   189: aconst_null    
        //   190: areturn        
        //   191: aload_1        
        //   192: getfield        bas.b:I
        //   195: iload           9
        //   197: iadd           
        //   198: istore          7
        //   200: iload           7
        //   202: aload_1        
        //   203: getfield        bas.c:I
        //   206: if_icmple       226
        //   209: ldc             "Id3Decoder"
        //   211: ldc             "Frame size exceeds remaining tag data"
        //   213: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   216: aload_1        
        //   217: aload_1        
        //   218: getfield        bas.c:I
        //   221: invokevirtual   bas.G:(I)V
        //   224: aconst_null    
        //   225: areturn        
        //   226: aload           4
        //   228: ifnonnull       2852
        //   231: iload_0        
        //   232: iconst_3       
        //   233: if_icmpne       306
        //   236: iload           14
        //   238: sipush          128
        //   241: iand           
        //   242: ifeq            251
        //   245: iconst_1       
        //   246: istore          10
        //   248: goto            254
        //   251: iconst_0       
        //   252: istore          10
        //   254: iload           14
        //   256: bipush          64
        //   258: iand           
        //   259: ifeq            268
        //   262: iconst_1       
        //   263: istore          13
        //   265: goto            271
        //   268: iconst_0       
        //   269: istore          13
        //   271: iload           14
        //   273: bipush          32
        //   275: iand           
        //   276: ifeq            285
        //   279: iconst_1       
        //   280: istore          14
        //   282: goto            288
        //   285: iconst_0       
        //   286: istore          14
        //   288: iconst_0       
        //   289: istore          16
        //   291: iload           10
        //   293: istore          17
        //   295: iload           13
        //   297: istore          15
        //   299: iload           16
        //   301: istore          13
        //   303: goto            417
        //   306: iload_0        
        //   307: iconst_4       
        //   308: if_icmpne       402
        //   311: iload           14
        //   313: bipush          64
        //   315: iand           
        //   316: ifeq            325
        //   319: iconst_1       
        //   320: istore          10
        //   322: goto            328
        //   325: iconst_0       
        //   326: istore          10
        //   328: iload           14
        //   330: bipush          8
        //   332: iand           
        //   333: ifeq            342
        //   336: iconst_1       
        //   337: istore          13
        //   339: goto            345
        //   342: iconst_0       
        //   343: istore          13
        //   345: iload           14
        //   347: iconst_4       
        //   348: iand           
        //   349: ifeq            358
        //   352: iconst_1       
        //   353: istore          15
        //   355: goto            361
        //   358: iconst_0       
        //   359: istore          15
        //   361: iload           14
        //   363: iconst_2       
        //   364: iand           
        //   365: ifeq            374
        //   368: iconst_1       
        //   369: istore          16
        //   371: goto            377
        //   374: iconst_0       
        //   375: istore          16
        //   377: iload           10
        //   379: istore          17
        //   381: iload           14
        //   383: iconst_1       
        //   384: iand           
        //   385: istore          10
        //   387: iload           17
        //   389: istore          14
        //   391: iload           13
        //   393: istore          17
        //   395: iload           16
        //   397: istore          13
        //   399: goto            417
        //   402: iconst_0       
        //   403: istore          10
        //   405: iconst_0       
        //   406: istore          14
        //   408: iconst_0       
        //   409: istore          17
        //   411: iconst_0       
        //   412: istore          15
        //   414: iconst_0       
        //   415: istore          13
        //   417: iload           17
        //   419: ifne            2836
        //   422: iload           15
        //   424: ifeq            430
        //   427: goto            2836
        //   430: iload           9
        //   432: istore          15
        //   434: iload           14
        //   436: ifeq            450
        //   439: aload_1        
        //   440: iconst_1       
        //   441: invokevirtual   bas.H:(I)V
        //   444: iload           9
        //   446: iconst_1       
        //   447: isub           
        //   448: istore          15
        //   450: iload           15
        //   452: istore          9
        //   454: iload           10
        //   456: ifeq            470
        //   459: aload_1        
        //   460: iconst_4       
        //   461: invokevirtual   bas.H:(I)V
        //   464: iload           15
        //   466: iconst_4       
        //   467: isub           
        //   468: istore          9
        //   470: iload           9
        //   472: istore          14
        //   474: iload           13
        //   476: ifeq            487
        //   479: aload_1        
        //   480: iload           9
        //   482: invokestatic    bvl.g:(Lbas;I)I
        //   485: istore          14
        //   487: iload           18
        //   489: bipush          84
        //   491: if_icmpne       664
        //   494: iload           8
        //   496: bipush          88
        //   498: if_icmpne       664
        //   501: iload           6
        //   503: bipush          88
        //   505: if_icmpne       664
        //   508: iload_0        
        //   509: iconst_2       
        //   510: if_icmpeq       520
        //   513: iload           5
        //   515: bipush          88
        //   517: if_icmpne       664
        //   520: iload           14
        //   522: ifgt            532
        //   525: aload           26
        //   527: astore          4
        //   529: goto            697
        //   532: iload           7
        //   534: istore_3       
        //   535: aload_1        
        //   536: invokevirtual   bas.i:()I
        //   539: istore          9
        //   541: iload           7
        //   543: istore_3       
        //   544: iload           9
        //   546: invokestatic    bvl.i:(I)Ljava/lang/String;
        //   549: astore          4
        //   551: iload           14
        //   553: iconst_1       
        //   554: isub           
        //   555: istore          10
        //   557: iload           7
        //   559: istore_3       
        //   560: iload           10
        //   562: newarray        B
        //   564: astore          27
        //   566: iload           7
        //   568: istore_3       
        //   569: aload_1        
        //   570: aload           27
        //   572: iconst_0       
        //   573: iload           10
        //   575: invokevirtual   bas.B:([BII)V
        //   578: iload           7
        //   580: istore_3       
        //   581: aload           27
        //   583: iconst_0       
        //   584: iload           9
        //   586: invokestatic    bvl.e:([BII)I
        //   589: istore          10
        //   591: iload           7
        //   593: istore_3       
        //   594: new             Ljava/lang/String;
        //   597: astore          26
        //   599: iload           7
        //   601: istore_3       
        //   602: aload           26
        //   604: aload           27
        //   606: iconst_0       
        //   607: iload           10
        //   609: aload           4
        //   611: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //   614: iload           7
        //   616: istore_3       
        //   617: iload           10
        //   619: iload           9
        //   621: invokestatic    bvl.d:(I)I
        //   624: iadd           
        //   625: istore          10
        //   627: iload           7
        //   629: istore_3       
        //   630: new             Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
        //   633: dup            
        //   634: ldc             "TXXX"
        //   636: aload           26
        //   638: aload           27
        //   640: iload           10
        //   642: aload           27
        //   644: iload           10
        //   646: iload           9
        //   648: invokestatic    bvl.e:([BII)I
        //   651: aload           4
        //   653: invokestatic    bvl.h:([BIILjava/lang/String;)Ljava/lang/String;
        //   656: invokespecial   androidx/media3/extractor/metadata/id3/TextInformationFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   659: astore          4
        //   661: goto            1109
        //   664: iload           18
        //   666: bipush          84
        //   668: if_icmpne       827
        //   671: iload           7
        //   673: istore_3       
        //   674: iload_0        
        //   675: bipush          84
        //   677: iload           8
        //   679: iload           6
        //   681: iload           5
        //   683: invokestatic    bvl.j:(IIIII)Ljava/lang/String;
        //   686: astore          4
        //   688: iload           14
        //   690: ifgt            715
        //   693: aload           26
        //   695: astore          4
        //   697: iload           8
        //   699: istore_3       
        //   700: iload           6
        //   702: istore          8
        //   704: iload           5
        //   706: istore          6
        //   708: iload           8
        //   710: istore          5
        //   712: goto            2706
        //   715: iload           7
        //   717: istore_3       
        //   718: aload_1        
        //   719: invokevirtual   bas.i:()I
        //   722: istore          9
        //   724: iload           7
        //   726: istore_3       
        //   727: iload           9
        //   729: invokestatic    bvl.i:(I)Ljava/lang/String;
        //   732: astore          26
        //   734: iload           14
        //   736: iconst_1       
        //   737: isub           
        //   738: istore          10
        //   740: iload           7
        //   742: istore_3       
        //   743: iload           10
        //   745: newarray        B
        //   747: astore          28
        //   749: iload           7
        //   751: istore_3       
        //   752: aload_1        
        //   753: aload           28
        //   755: iconst_0       
        //   756: iload           10
        //   758: invokevirtual   bas.B:([BII)V
        //   761: iload           7
        //   763: istore_3       
        //   764: aload           28
        //   766: iconst_0       
        //   767: iload           9
        //   769: invokestatic    bvl.e:([BII)I
        //   772: istore          9
        //   774: iload           7
        //   776: istore_3       
        //   777: new             Ljava/lang/String;
        //   780: astore          27
        //   782: iload           7
        //   784: istore_3       
        //   785: aload           27
        //   787: aload           28
        //   789: iconst_0       
        //   790: iload           9
        //   792: aload           26
        //   794: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //   797: iload           7
        //   799: istore_3       
        //   800: new             Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
        //   803: dup            
        //   804: aload           4
        //   806: aconst_null    
        //   807: aload           27
        //   809: invokespecial   androidx/media3/extractor/metadata/id3/TextInformationFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   812: astore          4
        //   814: goto            1109
        //   817: astore          4
        //   819: goto            2828
        //   822: astore          4
        //   824: goto            2809
        //   827: iload           18
        //   829: bipush          87
        //   831: if_icmpne       1009
        //   834: iload           8
        //   836: bipush          88
        //   838: if_icmpne       1002
        //   841: iload           6
        //   843: bipush          88
        //   845: if_icmpne       1002
        //   848: iload_0        
        //   849: iconst_2       
        //   850: if_icmpeq       860
        //   853: iload           5
        //   855: bipush          88
        //   857: if_icmpne       1002
        //   860: iload           14
        //   862: ifgt            872
        //   865: aload           26
        //   867: astore          4
        //   869: goto            697
        //   872: iload           7
        //   874: istore_3       
        //   875: aload_1        
        //   876: invokevirtual   bas.i:()I
        //   879: istore          9
        //   881: iload           7
        //   883: istore_3       
        //   884: iload           9
        //   886: invokestatic    bvl.i:(I)Ljava/lang/String;
        //   889: astore          26
        //   891: iload           14
        //   893: iconst_1       
        //   894: isub           
        //   895: istore          10
        //   897: iload           7
        //   899: istore_3       
        //   900: iload           10
        //   902: newarray        B
        //   904: astore          27
        //   906: iload           7
        //   908: istore_3       
        //   909: aload_1        
        //   910: aload           27
        //   912: iconst_0       
        //   913: iload           10
        //   915: invokevirtual   bas.B:([BII)V
        //   918: iload           7
        //   920: istore_3       
        //   921: aload           27
        //   923: iconst_0       
        //   924: iload           9
        //   926: invokestatic    bvl.e:([BII)I
        //   929: istore          10
        //   931: iload           7
        //   933: istore_3       
        //   934: new             Ljava/lang/String;
        //   937: astore          4
        //   939: iload           7
        //   941: istore_3       
        //   942: aload           4
        //   944: aload           27
        //   946: iconst_0       
        //   947: iload           10
        //   949: aload           26
        //   951: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //   954: iload           7
        //   956: istore_3       
        //   957: iload           10
        //   959: iload           9
        //   961: invokestatic    bvl.d:(I)I
        //   964: iadd           
        //   965: istore          9
        //   967: iload           7
        //   969: istore_3       
        //   970: new             Landroidx/media3/extractor/metadata/id3/UrlLinkFrame;
        //   973: dup            
        //   974: ldc             "WXXX"
        //   976: aload           4
        //   978: aload           27
        //   980: iload           9
        //   982: aload           27
        //   984: iload           9
        //   986: invokestatic    bvl.f:([BI)I
        //   989: ldc             "ISO-8859-1"
        //   991: invokestatic    bvl.h:([BIILjava/lang/String;)Ljava/lang/String;
        //   994: invokespecial   androidx/media3/extractor/metadata/id3/UrlLinkFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   997: astore          4
        //   999: goto            1109
        //  1002: bipush          87
        //  1004: istore          10
        //  1006: goto            1013
        //  1009: iload           18
        //  1011: istore          10
        //  1013: iload           10
        //  1015: bipush          87
        //  1017: if_icmpne       1112
        //  1020: iload           7
        //  1022: istore_3       
        //  1023: iload_0        
        //  1024: bipush          87
        //  1026: iload           8
        //  1028: iload           6
        //  1030: iload           5
        //  1032: invokestatic    bvl.j:(IIIII)Ljava/lang/String;
        //  1035: astore          26
        //  1037: iload           7
        //  1039: istore_3       
        //  1040: iload           14
        //  1042: newarray        B
        //  1044: astore          27
        //  1046: iload           7
        //  1048: istore_3       
        //  1049: aload_1        
        //  1050: aload           27
        //  1052: iconst_0       
        //  1053: iload           14
        //  1055: invokevirtual   bas.B:([BII)V
        //  1058: iload           7
        //  1060: istore_3       
        //  1061: aload           27
        //  1063: iconst_0       
        //  1064: invokestatic    bvl.f:([BI)I
        //  1067: istore          9
        //  1069: iload           7
        //  1071: istore_3       
        //  1072: new             Ljava/lang/String;
        //  1075: astore          4
        //  1077: iload           7
        //  1079: istore_3       
        //  1080: aload           4
        //  1082: aload           27
        //  1084: iconst_0       
        //  1085: iload           9
        //  1087: ldc             "ISO-8859-1"
        //  1089: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1092: iload           7
        //  1094: istore_3       
        //  1095: new             Landroidx/media3/extractor/metadata/id3/UrlLinkFrame;
        //  1098: dup            
        //  1099: aload           26
        //  1101: aconst_null    
        //  1102: aload           4
        //  1104: invokespecial   androidx/media3/extractor/metadata/id3/UrlLinkFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1107: astore          4
        //  1109: goto            697
        //  1112: iload           10
        //  1114: istore          9
        //  1116: iload           10
        //  1118: bipush          80
        //  1120: if_icmpne       1231
        //  1123: iload           8
        //  1125: bipush          82
        //  1127: if_icmpne       1227
        //  1130: iload           6
        //  1132: bipush          73
        //  1134: if_icmpne       1227
        //  1137: iload           5
        //  1139: bipush          86
        //  1141: if_icmpne       1227
        //  1144: iload           7
        //  1146: istore_3       
        //  1147: iload           14
        //  1149: newarray        B
        //  1151: astore          26
        //  1153: iload           7
        //  1155: istore_3       
        //  1156: aload_1        
        //  1157: aload           26
        //  1159: iconst_0       
        //  1160: iload           14
        //  1162: invokevirtual   bas.B:([BII)V
        //  1165: iload           7
        //  1167: istore_3       
        //  1168: aload           26
        //  1170: iconst_0       
        //  1171: invokestatic    bvl.f:([BI)I
        //  1174: istore          9
        //  1176: iload           7
        //  1178: istore_3       
        //  1179: new             Ljava/lang/String;
        //  1182: astore          4
        //  1184: iload           7
        //  1186: istore_3       
        //  1187: aload           4
        //  1189: aload           26
        //  1191: iconst_0       
        //  1192: iload           9
        //  1194: ldc             "ISO-8859-1"
        //  1196: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1199: iload           7
        //  1201: istore_3       
        //  1202: new             Landroidx/media3/extractor/metadata/id3/PrivFrame;
        //  1205: dup            
        //  1206: aload           4
        //  1208: aload           26
        //  1210: iload           9
        //  1212: iconst_1       
        //  1213: iadd           
        //  1214: iload           14
        //  1216: invokestatic    bvl.l:([BII)[B
        //  1219: invokespecial   androidx/media3/extractor/metadata/id3/PrivFrame.<init>:(Ljava/lang/String;[B)V
        //  1222: astore          4
        //  1224: goto            1109
        //  1227: bipush          80
        //  1229: istore          9
        //  1231: iload           9
        //  1233: bipush          71
        //  1235: if_icmpne       1435
        //  1238: iload           8
        //  1240: bipush          69
        //  1242: if_icmpne       1428
        //  1245: iload           6
        //  1247: bipush          79
        //  1249: if_icmpne       1428
        //  1252: iload           5
        //  1254: bipush          66
        //  1256: if_icmpeq       1264
        //  1259: iload_0        
        //  1260: iconst_2       
        //  1261: if_icmpne       1428
        //  1264: iload           7
        //  1266: istore_3       
        //  1267: aload_1        
        //  1268: invokevirtual   bas.i:()I
        //  1271: istore          8
        //  1273: iload           7
        //  1275: istore_3       
        //  1276: iload           8
        //  1278: invokestatic    bvl.i:(I)Ljava/lang/String;
        //  1281: astore          27
        //  1283: iload           14
        //  1285: iconst_1       
        //  1286: isub           
        //  1287: istore          6
        //  1289: iload           7
        //  1291: istore_3       
        //  1292: iload           6
        //  1294: newarray        B
        //  1296: astore          26
        //  1298: iload           7
        //  1300: istore_3       
        //  1301: aload_1        
        //  1302: aload           26
        //  1304: iconst_0       
        //  1305: iload           6
        //  1307: invokevirtual   bas.B:([BII)V
        //  1310: iload           7
        //  1312: istore_3       
        //  1313: aload           26
        //  1315: iconst_0       
        //  1316: invokestatic    bvl.f:([BI)I
        //  1319: istore          9
        //  1321: iload           7
        //  1323: istore_3       
        //  1324: new             Ljava/lang/String;
        //  1327: astore          28
        //  1329: aload           28
        //  1331: aload           26
        //  1333: iconst_0       
        //  1334: iload           9
        //  1336: ldc             "ISO-8859-1"
        //  1338: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1341: iload           9
        //  1343: iconst_1       
        //  1344: iadd           
        //  1345: istore_3       
        //  1346: aload           26
        //  1348: iload_3        
        //  1349: iload           8
        //  1351: invokestatic    bvl.e:([BII)I
        //  1354: istore          9
        //  1356: aload           26
        //  1358: iload_3        
        //  1359: iload           9
        //  1361: aload           27
        //  1363: invokestatic    bvl.h:([BIILjava/lang/String;)Ljava/lang/String;
        //  1366: astore          4
        //  1368: iload           9
        //  1370: iload           8
        //  1372: invokestatic    bvl.d:(I)I
        //  1375: iadd           
        //  1376: istore_3       
        //  1377: aload           26
        //  1379: iload_3        
        //  1380: iload           8
        //  1382: invokestatic    bvl.e:([BII)I
        //  1385: istore          9
        //  1387: new             Landroidx/media3/extractor/metadata/id3/GeobFrame;
        //  1390: dup            
        //  1391: aload           28
        //  1393: aload           4
        //  1395: aload           26
        //  1397: iload_3        
        //  1398: iload           9
        //  1400: aload           27
        //  1402: invokestatic    bvl.h:([BIILjava/lang/String;)Ljava/lang/String;
        //  1405: aload           26
        //  1407: iload           9
        //  1409: iload           8
        //  1411: invokestatic    bvl.d:(I)I
        //  1414: iadd           
        //  1415: iload           6
        //  1417: invokestatic    bvl.l:([BII)[B
        //  1420: invokespecial   androidx/media3/extractor/metadata/id3/GeobFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
        //  1423: astore          4
        //  1425: goto            1918
        //  1428: bipush          71
        //  1430: istore          9
        //  1432: goto            1435
        //  1435: iload_0        
        //  1436: iconst_2       
        //  1437: if_icmpne       1464
        //  1440: iload           9
        //  1442: bipush          80
        //  1444: if_icmpne       1734
        //  1447: iload           8
        //  1449: bipush          73
        //  1451: if_icmpne       1734
        //  1454: iload           6
        //  1456: bipush          67
        //  1458: if_icmpne       1734
        //  1461: goto            1492
        //  1464: iload           9
        //  1466: bipush          65
        //  1468: if_icmpne       1734
        //  1471: iload           8
        //  1473: bipush          80
        //  1475: if_icmpne       1734
        //  1478: iload           6
        //  1480: bipush          73
        //  1482: if_icmpne       1734
        //  1485: iload           5
        //  1487: bipush          67
        //  1489: if_icmpne       1734
        //  1492: aload_1        
        //  1493: invokevirtual   bas.i:()I
        //  1496: istore          9
        //  1498: iload           9
        //  1500: invokestatic    bvl.i:(I)Ljava/lang/String;
        //  1503: astore          28
        //  1505: iload           14
        //  1507: iconst_1       
        //  1508: isub           
        //  1509: istore          8
        //  1511: iload           8
        //  1513: newarray        B
        //  1515: astore          27
        //  1517: aload_1        
        //  1518: aload           27
        //  1520: iconst_0       
        //  1521: iload           8
        //  1523: invokevirtual   bas.B:([BII)V
        //  1526: iload_0        
        //  1527: iconst_2       
        //  1528: if_icmpne       1585
        //  1531: new             Ljava/lang/String;
        //  1534: astore          4
        //  1536: aload           4
        //  1538: aload           27
        //  1540: iconst_0       
        //  1541: iconst_3       
        //  1542: ldc             "ISO-8859-1"
        //  1544: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1547: ldc             "image/"
        //  1549: aload           4
        //  1551: invokestatic    aevy.b:(Ljava/lang/String;)Ljava/lang/String;
        //  1554: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1557: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1560: astore          26
        //  1562: aload           26
        //  1564: astore          4
        //  1566: ldc             "image/jpg"
        //  1568: aload           26
        //  1570: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1573: ifeq            1580
        //  1576: ldc             "image/jpeg"
        //  1578: astore          4
        //  1580: iconst_2       
        //  1581: istore_3       
        //  1582: goto            1650
        //  1585: aload           27
        //  1587: iconst_0       
        //  1588: invokestatic    bvl.f:([BI)I
        //  1591: istore          6
        //  1593: new             Ljava/lang/String;
        //  1596: astore          4
        //  1598: aload           4
        //  1600: aload           27
        //  1602: iconst_0       
        //  1603: iload           6
        //  1605: ldc             "ISO-8859-1"
        //  1607: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1610: aload           4
        //  1612: invokestatic    aevy.b:(Ljava/lang/String;)Ljava/lang/String;
        //  1615: astore          26
        //  1617: aload           26
        //  1619: astore          4
        //  1621: iload           6
        //  1623: istore_3       
        //  1624: aload           26
        //  1626: bipush          47
        //  1628: invokevirtual   java/lang/String.indexOf:(I)I
        //  1631: iconst_m1      
        //  1632: if_icmpne       1650
        //  1635: ldc             "image/"
        //  1637: aload           26
        //  1639: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1642: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1645: astore          4
        //  1647: iload           6
        //  1649: istore_3       
        //  1650: aload           27
        //  1652: iload_3        
        //  1653: iconst_1       
        //  1654: iadd           
        //  1655: baload         
        //  1656: istore          6
        //  1658: iload_3        
        //  1659: iconst_2       
        //  1660: iadd           
        //  1661: istore          10
        //  1663: aload           27
        //  1665: iload           10
        //  1667: iload           9
        //  1669: invokestatic    bvl.e:([BII)I
        //  1672: istore_3       
        //  1673: new             Ljava/lang/String;
        //  1676: astore          26
        //  1678: aload           26
        //  1680: aload           27
        //  1682: iload           10
        //  1684: iload_3        
        //  1685: iload           10
        //  1687: isub           
        //  1688: aload           28
        //  1690: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1693: new             Landroidx/media3/extractor/metadata/id3/ApicFrame;
        //  1696: dup            
        //  1697: aload           4
        //  1699: aload           26
        //  1701: iload           6
        //  1703: sipush          255
        //  1706: iand           
        //  1707: aload           27
        //  1709: iload_3        
        //  1710: iload           9
        //  1712: invokestatic    bvl.d:(I)I
        //  1715: iadd           
        //  1716: iload           8
        //  1718: invokestatic    bvl.l:([BII)[B
        //  1721: invokespecial   androidx/media3/extractor/metadata/id3/ApicFrame.<init>:(Ljava/lang/String;Ljava/lang/String;I[B)V
        //  1724: astore          4
        //  1726: goto            1918
        //  1729: astore          4
        //  1731: goto            2795
        //  1734: iload           9
        //  1736: bipush          67
        //  1738: if_icmpne       1932
        //  1741: iload           8
        //  1743: bipush          79
        //  1745: if_icmpne       1932
        //  1748: iload           6
        //  1750: bipush          77
        //  1752: if_icmpne       1932
        //  1755: iload           5
        //  1757: bipush          77
        //  1759: if_icmpeq       1767
        //  1762: iload_0        
        //  1763: iconst_2       
        //  1764: if_icmpne       1932
        //  1767: iload           14
        //  1769: iconst_4       
        //  1770: if_icmpge       1794
        //  1773: iload           8
        //  1775: istore_3       
        //  1776: iload           5
        //  1778: istore          8
        //  1780: aconst_null    
        //  1781: astore          4
        //  1783: iload           6
        //  1785: istore          5
        //  1787: iload           8
        //  1789: istore          6
        //  1791: goto            2706
        //  1794: aload_1        
        //  1795: invokevirtual   bas.i:()I
        //  1798: istore_3       
        //  1799: iload_3        
        //  1800: invokestatic    bvl.i:(I)Ljava/lang/String;
        //  1803: astore          26
        //  1805: iconst_3       
        //  1806: newarray        B
        //  1808: astore          27
        //  1810: aload_1        
        //  1811: aload           27
        //  1813: iconst_0       
        //  1814: iconst_3       
        //  1815: invokevirtual   bas.B:([BII)V
        //  1818: new             Ljava/lang/String;
        //  1821: astore          4
        //  1823: aload           4
        //  1825: aload           27
        //  1827: iconst_0       
        //  1828: iconst_3       
        //  1829: invokespecial   java/lang/String.<init>:([BII)V
        //  1832: iload           14
        //  1834: iconst_4       
        //  1835: isub           
        //  1836: istore          6
        //  1838: iload           6
        //  1840: newarray        B
        //  1842: astore          27
        //  1844: aload_1        
        //  1845: aload           27
        //  1847: iconst_0       
        //  1848: iload           6
        //  1850: invokevirtual   bas.B:([BII)V
        //  1853: aload           27
        //  1855: iconst_0       
        //  1856: iload_3        
        //  1857: invokestatic    bvl.e:([BII)I
        //  1860: istore          6
        //  1862: new             Ljava/lang/String;
        //  1865: astore          28
        //  1867: aload           28
        //  1869: aload           27
        //  1871: iconst_0       
        //  1872: iload           6
        //  1874: aload           26
        //  1876: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  1879: iload           6
        //  1881: iload_3        
        //  1882: invokestatic    bvl.d:(I)I
        //  1885: iadd           
        //  1886: istore          6
        //  1888: new             Landroidx/media3/extractor/metadata/id3/CommentFrame;
        //  1891: dup            
        //  1892: aload           4
        //  1894: aload           28
        //  1896: aload           27
        //  1898: iload           6
        //  1900: aload           27
        //  1902: iload           6
        //  1904: iload_3        
        //  1905: invokestatic    bvl.e:([BII)I
        //  1908: aload           26
        //  1910: invokestatic    bvl.h:([BIILjava/lang/String;)Ljava/lang/String;
        //  1913: invokespecial   androidx/media3/extractor/metadata/id3/CommentFrame.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1916: astore          4
        //  1918: iload           11
        //  1920: istore_3       
        //  1921: iload           5
        //  1923: istore          6
        //  1925: iload           12
        //  1927: istore          5
        //  1929: goto            2706
        //  1932: iload           9
        //  1934: bipush          67
        //  1936: if_icmpne       2150
        //  1939: iload           8
        //  1941: bipush          72
        //  1943: if_icmpne       2150
        //  1946: iload           6
        //  1948: bipush          65
        //  1950: if_icmpne       2150
        //  1953: iload           5
        //  1955: bipush          80
        //  1957: if_icmpne       2150
        //  1960: aload_1        
        //  1961: getfield        bas.b:I
        //  1964: istore          6
        //  1966: aload_1        
        //  1967: getfield        bas.a:[B
        //  1970: iload           6
        //  1972: invokestatic    bvl.f:([BI)I
        //  1975: istore          8
        //  1977: new             Ljava/lang/String;
        //  1980: astore          4
        //  1982: aload           4
        //  1984: aload_1        
        //  1985: getfield        bas.a:[B
        //  1988: iload           6
        //  1990: iload           8
        //  1992: iload           6
        //  1994: isub           
        //  1995: ldc             "ISO-8859-1"
        //  1997: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  2000: aload_1        
        //  2001: iload           8
        //  2003: iconst_1       
        //  2004: iadd           
        //  2005: invokevirtual   bas.G:(I)V
        //  2008: aload_1        
        //  2009: invokevirtual   bas.d:()I
        //  2012: istore          8
        //  2014: aload_1        
        //  2015: invokevirtual   bas.d:()I
        //  2018: istore          9
        //  2020: aload_1        
        //  2021: invokevirtual   bas.q:()J
        //  2024: lstore          22
        //  2026: lload           22
        //  2028: lstore          20
        //  2030: lload           22
        //  2032: ldc2_w          4294967295
        //  2035: lcmp           
        //  2036: ifne            2044
        //  2039: ldc2_w          -1
        //  2042: lstore          20
        //  2044: aload_1        
        //  2045: invokevirtual   bas.q:()J
        //  2048: lstore          24
        //  2050: lload           24
        //  2052: lstore          22
        //  2054: lload           24
        //  2056: ldc2_w          4294967295
        //  2059: lcmp           
        //  2060: ifne            2068
        //  2063: ldc2_w          -1
        //  2066: lstore          22
        //  2068: new             Ljava/util/ArrayList;
        //  2071: astore          26
        //  2073: aload           26
        //  2075: invokespecial   java/util/ArrayList.<init>:()V
        //  2078: aload_1        
        //  2079: getfield        bas.b:I
        //  2082: iload           6
        //  2084: iload           14
        //  2086: iadd           
        //  2087: if_icmpge       2116
        //  2090: iload_0        
        //  2091: aload_1        
        //  2092: iload_2        
        //  2093: iload_3        
        //  2094: aconst_null    
        //  2095: invokestatic    bvl.m:(ILbas;ZILbvk;)Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2098: astore          27
        //  2100: aload           27
        //  2102: ifnull          2078
        //  2105: aload           26
        //  2107: aload           27
        //  2109: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2112: pop            
        //  2113: goto            2078
        //  2116: new             Landroidx/media3/extractor/metadata/id3/ChapterFrame;
        //  2119: dup            
        //  2120: aload           4
        //  2122: iload           8
        //  2124: iload           9
        //  2126: lload           20
        //  2128: lload           22
        //  2130: aload           26
        //  2132: iconst_0       
        //  2133: anewarray       Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2136: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  2139: checkcast       [Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2142: invokespecial   androidx/media3/extractor/metadata/id3/ChapterFrame.<init>:(Ljava/lang/String;IIJJ[Landroidx/media3/extractor/metadata/id3/Id3Frame;)V
        //  2145: astore          4
        //  2147: goto            1918
        //  2150: iload           9
        //  2152: bipush          67
        //  2154: if_icmpne       2445
        //  2157: iload           8
        //  2159: bipush          84
        //  2161: if_icmpne       2445
        //  2164: iload           6
        //  2166: bipush          79
        //  2168: if_icmpne       2445
        //  2171: iload           5
        //  2173: bipush          67
        //  2175: if_icmpne       2445
        //  2178: aload_1        
        //  2179: getfield        bas.b:I
        //  2182: istore          11
        //  2184: aload_1        
        //  2185: getfield        bas.a:[B
        //  2188: iload           11
        //  2190: invokestatic    bvl.f:([BI)I
        //  2193: istore          9
        //  2195: new             Ljava/lang/String;
        //  2198: astore          26
        //  2200: aload           26
        //  2202: aload_1        
        //  2203: getfield        bas.a:[B
        //  2206: iload           11
        //  2208: iload           9
        //  2210: iload           11
        //  2212: isub           
        //  2213: ldc             "ISO-8859-1"
        //  2215: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  2218: aload_1        
        //  2219: iload           9
        //  2221: iconst_1       
        //  2222: iadd           
        //  2223: invokevirtual   bas.G:(I)V
        //  2226: aload_1        
        //  2227: invokevirtual   bas.i:()I
        //  2230: istore          12
        //  2232: iload           12
        //  2234: iconst_2       
        //  2235: iand           
        //  2236: ifeq            2245
        //  2239: iconst_1       
        //  2240: istore          19
        //  2242: goto            2248
        //  2245: iconst_0       
        //  2246: istore          19
        //  2248: aload_1        
        //  2249: invokevirtual   bas.i:()I
        //  2252: istore          10
        //  2254: iload           10
        //  2256: anewarray       Ljava/lang/String;
        //  2259: astore          4
        //  2261: iconst_0       
        //  2262: istore          9
        //  2264: iload           9
        //  2266: iload           10
        //  2268: if_icmpge       2332
        //  2271: aload_1        
        //  2272: getfield        bas.b:I
        //  2275: istore          13
        //  2277: aload_1        
        //  2278: getfield        bas.a:[B
        //  2281: iload           13
        //  2283: invokestatic    bvl.f:([BI)I
        //  2286: istore          15
        //  2288: new             Ljava/lang/String;
        //  2291: astore          27
        //  2293: aload           27
        //  2295: aload_1        
        //  2296: getfield        bas.a:[B
        //  2299: iload           13
        //  2301: iload           15
        //  2303: iload           13
        //  2305: isub           
        //  2306: ldc             "ISO-8859-1"
        //  2308: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //  2311: aload           4
        //  2313: iload           9
        //  2315: aload           27
        //  2317: aastore        
        //  2318: aload_1        
        //  2319: iload           15
        //  2321: iconst_1       
        //  2322: iadd           
        //  2323: invokevirtual   bas.G:(I)V
        //  2326: iinc            9, 1
        //  2329: goto            2264
        //  2332: new             Ljava/util/ArrayList;
        //  2335: astore          28
        //  2337: aload           28
        //  2339: invokespecial   java/util/ArrayList.<init>:()V
        //  2342: aload_1        
        //  2343: getfield        bas.b:I
        //  2346: iload           11
        //  2348: iload           14
        //  2350: iadd           
        //  2351: if_icmpge       2380
        //  2354: iload_0        
        //  2355: aload_1        
        //  2356: iload_2        
        //  2357: iload_3        
        //  2358: aconst_null    
        //  2359: invokestatic    bvl.m:(ILbas;ZILbvk;)Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2362: astore          27
        //  2364: aload           27
        //  2366: ifnull          2342
        //  2369: aload           28
        //  2371: aload           27
        //  2373: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2376: pop            
        //  2377: goto            2342
        //  2380: aload           28
        //  2382: iconst_0       
        //  2383: anewarray       Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2386: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  2389: checkcast       [Landroidx/media3/extractor/metadata/id3/Id3Frame;
        //  2392: astore          27
        //  2394: iconst_1       
        //  2395: iload           12
        //  2397: iconst_1       
        //  2398: iand           
        //  2399: if_icmpeq       2407
        //  2402: iconst_0       
        //  2403: istore_2       
        //  2404: goto            2409
        //  2407: iconst_1       
        //  2408: istore_2       
        //  2409: new             Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;
        //  2412: dup            
        //  2413: aload           26
        //  2415: iload           19
        //  2417: iload_2        
        //  2418: aload           4
        //  2420: aload           27
        //  2422: invokespecial   androidx/media3/extractor/metadata/id3/ChapterTocFrame.<init>:(Ljava/lang/String;ZZ[Ljava/lang/String;[Landroidx/media3/extractor/metadata/id3/Id3Frame;)V
        //  2425: astore          4
        //  2427: iload           5
        //  2429: istore          9
        //  2431: iload           6
        //  2433: istore          5
        //  2435: iload           8
        //  2437: istore_3       
        //  2438: iload           9
        //  2440: istore          6
        //  2442: goto            2706
        //  2445: iload           9
        //  2447: bipush          77
        //  2449: if_icmpne       2654
        //  2452: iload           8
        //  2454: istore_3       
        //  2455: iload_3        
        //  2456: bipush          76
        //  2458: if_icmpne       2651
        //  2461: iload           6
        //  2463: istore          8
        //  2465: iload           5
        //  2467: istore          6
        //  2469: iload           8
        //  2471: bipush          76
        //  2473: if_icmpne       2654
        //  2476: iload           6
        //  2478: bipush          84
        //  2480: if_icmpne       2654
        //  2483: aload_1        
        //  2484: invokevirtual   bas.m:()I
        //  2487: istore          10
        //  2489: aload_1        
        //  2490: invokevirtual   bas.k:()I
        //  2493: istore          15
        //  2495: aload_1        
        //  2496: invokevirtual   bas.k:()I
        //  2499: istore          13
        //  2501: aload_1        
        //  2502: invokevirtual   bas.i:()I
        //  2505: istore          11
        //  2507: aload_1        
        //  2508: invokevirtual   bas.i:()I
        //  2511: istore          9
        //  2513: new             Latim;
        //  2516: astore          4
        //  2518: aload           4
        //  2520: aconst_null    
        //  2521: invokespecial   atim.<init>:([B)V
        //  2524: aload           4
        //  2526: aload_1        
        //  2527: getfield        bas.a:[B
        //  2530: aload_1        
        //  2531: getfield        bas.c:I
        //  2534: invokevirtual   atim.l:([BI)V
        //  2537: aload           4
        //  2539: aload_1        
        //  2540: getfield        bas.b:I
        //  2543: bipush          8
        //  2545: imul           
        //  2546: invokevirtual   atim.m:(I)V
        //  2549: iload           14
        //  2551: bipush          10
        //  2553: isub           
        //  2554: bipush          8
        //  2556: imul           
        //  2557: iload           11
        //  2559: iload           9
        //  2561: iadd           
        //  2562: idiv           
        //  2563: istore          12
        //  2565: iload           12
        //  2567: newarray        I
        //  2569: astore          26
        //  2571: iload           12
        //  2573: newarray        I
        //  2575: astore          27
        //  2577: iconst_0       
        //  2578: istore          5
        //  2580: iload           5
        //  2582: iload           12
        //  2584: if_icmpge       2625
        //  2587: aload           4
        //  2589: iload           11
        //  2591: invokevirtual   atim.g:(I)I
        //  2594: istore          16
        //  2596: aload           4
        //  2598: iload           9
        //  2600: invokevirtual   atim.g:(I)I
        //  2603: istore          17
        //  2605: aload           26
        //  2607: iload           5
        //  2609: iload           16
        //  2611: iastore        
        //  2612: aload           27
        //  2614: iload           5
        //  2616: iload           17
        //  2618: iastore        
        //  2619: iinc            5, 1
        //  2622: goto            2580
        //  2625: new             Landroidx/media3/extractor/metadata/id3/MlltFrame;
        //  2628: dup            
        //  2629: iload           10
        //  2631: iload           15
        //  2633: iload           13
        //  2635: aload           26
        //  2637: aload           27
        //  2639: invokespecial   androidx/media3/extractor/metadata/id3/MlltFrame.<init>:(III[I[I)V
        //  2642: astore          4
        //  2644: iload           8
        //  2646: istore          5
        //  2648: goto            2706
        //  2651: goto            2654
        //  2654: iload           5
        //  2656: istore          6
        //  2658: iload           12
        //  2660: istore          5
        //  2662: iload           11
        //  2664: istore_3       
        //  2665: iload_0        
        //  2666: iload           9
        //  2668: iload_3        
        //  2669: iload           5
        //  2671: iload           6
        //  2673: invokestatic    bvl.j:(IIIII)Ljava/lang/String;
        //  2676: astore          4
        //  2678: iload           14
        //  2680: newarray        B
        //  2682: astore          26
        //  2684: aload_1        
        //  2685: aload           26
        //  2687: iconst_0       
        //  2688: iload           14
        //  2690: invokevirtual   bas.B:([BII)V
        //  2693: new             Landroidx/media3/extractor/metadata/id3/BinaryFrame;
        //  2696: dup            
        //  2697: aload           4
        //  2699: aload           26
        //  2701: invokespecial   androidx/media3/extractor/metadata/id3/BinaryFrame.<init>:(Ljava/lang/String;[B)V
        //  2704: astore          4
        //  2706: aload           4
        //  2708: ifnonnull       2798
        //  2711: iload_0        
        //  2712: iload           18
        //  2714: iload_3        
        //  2715: iload           5
        //  2717: iload           6
        //  2719: invokestatic    bvl.j:(IIIII)Ljava/lang/String;
        //  2722: astore          26
        //  2724: new             Ljava/lang/StringBuilder;
        //  2727: astore          27
        //  2729: aload           27
        //  2731: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2734: aload           27
        //  2736: ldc_w           "Failed to decode frame: id="
        //  2739: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2742: pop            
        //  2743: aload           27
        //  2745: aload           26
        //  2747: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2750: pop            
        //  2751: aload           27
        //  2753: ldc_w           ", frameSize="
        //  2756: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2759: pop            
        //  2760: aload           27
        //  2762: iload           14
        //  2764: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2767: pop            
        //  2768: aload           27
        //  2770: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2773: astore          26
        //  2775: ldc             "Id3Decoder"
        //  2777: aload           26
        //  2779: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2782: goto            2798
        //  2785: astore          4
        //  2787: iload           7
        //  2789: istore_3       
        //  2790: goto            2828
        //  2793: astore          4
        //  2795: goto            2809
        //  2798: aload_1        
        //  2799: iload           7
        //  2801: invokevirtual   bas.G:(I)V
        //  2804: aload           4
        //  2806: areturn        
        //  2807: astore          4
        //  2809: iload           7
        //  2811: istore_3       
        //  2812: ldc             "Id3Decoder"
        //  2814: ldc_w           "Unsupported character encoding"
        //  2817: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2820: aload_1        
        //  2821: iload           7
        //  2823: invokevirtual   bas.G:(I)V
        //  2826: aconst_null    
        //  2827: areturn        
        //  2828: aload_1        
        //  2829: iload_3        
        //  2830: invokevirtual   bas.G:(I)V
        //  2833: aload           4
        //  2835: athrow         
        //  2836: ldc             "Id3Decoder"
        //  2838: ldc_w           "Skipping unsupported compressed or encrypted frame"
        //  2841: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2844: aload_1        
        //  2845: iload           7
        //  2847: invokevirtual   bas.G:(I)V
        //  2850: aconst_null    
        //  2851: areturn        
        //  2852: aload_1        
        //  2853: iload           7
        //  2855: invokevirtual   bas.G:(I)V
        //  2858: aconst_null    
        //  2859: areturn        
        //  2860: astore          4
        //  2862: goto            2795
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  535    541    822    827    Ljava/io/UnsupportedEncodingException;
        //  535    541    817    822    Any
        //  544    551    822    827    Ljava/io/UnsupportedEncodingException;
        //  544    551    817    822    Any
        //  560    566    822    827    Ljava/io/UnsupportedEncodingException;
        //  560    566    817    822    Any
        //  569    578    822    827    Ljava/io/UnsupportedEncodingException;
        //  569    578    817    822    Any
        //  581    591    822    827    Ljava/io/UnsupportedEncodingException;
        //  581    591    817    822    Any
        //  594    599    822    827    Ljava/io/UnsupportedEncodingException;
        //  594    599    817    822    Any
        //  602    614    822    827    Ljava/io/UnsupportedEncodingException;
        //  602    614    817    822    Any
        //  617    627    822    827    Ljava/io/UnsupportedEncodingException;
        //  617    627    817    822    Any
        //  630    661    822    827    Ljava/io/UnsupportedEncodingException;
        //  630    661    817    822    Any
        //  674    688    822    827    Ljava/io/UnsupportedEncodingException;
        //  674    688    817    822    Any
        //  718    724    822    827    Ljava/io/UnsupportedEncodingException;
        //  718    724    817    822    Any
        //  727    734    822    827    Ljava/io/UnsupportedEncodingException;
        //  727    734    817    822    Any
        //  743    749    822    827    Ljava/io/UnsupportedEncodingException;
        //  743    749    817    822    Any
        //  752    761    822    827    Ljava/io/UnsupportedEncodingException;
        //  752    761    817    822    Any
        //  764    774    822    827    Ljava/io/UnsupportedEncodingException;
        //  764    774    817    822    Any
        //  777    782    822    827    Ljava/io/UnsupportedEncodingException;
        //  777    782    817    822    Any
        //  785    797    822    827    Ljava/io/UnsupportedEncodingException;
        //  785    797    817    822    Any
        //  800    814    822    827    Ljava/io/UnsupportedEncodingException;
        //  800    814    817    822    Any
        //  875    881    822    827    Ljava/io/UnsupportedEncodingException;
        //  875    881    817    822    Any
        //  884    891    822    827    Ljava/io/UnsupportedEncodingException;
        //  884    891    817    822    Any
        //  900    906    822    827    Ljava/io/UnsupportedEncodingException;
        //  900    906    817    822    Any
        //  909    918    822    827    Ljava/io/UnsupportedEncodingException;
        //  909    918    817    822    Any
        //  921    931    822    827    Ljava/io/UnsupportedEncodingException;
        //  921    931    817    822    Any
        //  934    939    822    827    Ljava/io/UnsupportedEncodingException;
        //  934    939    817    822    Any
        //  942    954    822    827    Ljava/io/UnsupportedEncodingException;
        //  942    954    817    822    Any
        //  957    967    822    827    Ljava/io/UnsupportedEncodingException;
        //  957    967    817    822    Any
        //  970    999    822    827    Ljava/io/UnsupportedEncodingException;
        //  970    999    817    822    Any
        //  1023   1037   822    827    Ljava/io/UnsupportedEncodingException;
        //  1023   1037   817    822    Any
        //  1040   1046   822    827    Ljava/io/UnsupportedEncodingException;
        //  1040   1046   817    822    Any
        //  1049   1058   822    827    Ljava/io/UnsupportedEncodingException;
        //  1049   1058   817    822    Any
        //  1061   1069   822    827    Ljava/io/UnsupportedEncodingException;
        //  1061   1069   817    822    Any
        //  1072   1077   822    827    Ljava/io/UnsupportedEncodingException;
        //  1072   1077   817    822    Any
        //  1080   1092   822    827    Ljava/io/UnsupportedEncodingException;
        //  1080   1092   817    822    Any
        //  1095   1109   822    827    Ljava/io/UnsupportedEncodingException;
        //  1095   1109   817    822    Any
        //  1147   1153   822    827    Ljava/io/UnsupportedEncodingException;
        //  1147   1153   817    822    Any
        //  1156   1165   822    827    Ljava/io/UnsupportedEncodingException;
        //  1156   1165   817    822    Any
        //  1168   1176   822    827    Ljava/io/UnsupportedEncodingException;
        //  1168   1176   817    822    Any
        //  1179   1184   822    827    Ljava/io/UnsupportedEncodingException;
        //  1179   1184   817    822    Any
        //  1187   1199   822    827    Ljava/io/UnsupportedEncodingException;
        //  1187   1199   817    822    Any
        //  1202   1224   822    827    Ljava/io/UnsupportedEncodingException;
        //  1202   1224   817    822    Any
        //  1267   1273   822    827    Ljava/io/UnsupportedEncodingException;
        //  1267   1273   817    822    Any
        //  1276   1283   822    827    Ljava/io/UnsupportedEncodingException;
        //  1276   1283   817    822    Any
        //  1292   1298   822    827    Ljava/io/UnsupportedEncodingException;
        //  1292   1298   817    822    Any
        //  1301   1310   822    827    Ljava/io/UnsupportedEncodingException;
        //  1301   1310   817    822    Any
        //  1313   1321   822    827    Ljava/io/UnsupportedEncodingException;
        //  1313   1321   817    822    Any
        //  1324   1329   822    827    Ljava/io/UnsupportedEncodingException;
        //  1324   1329   817    822    Any
        //  1329   1341   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1329   1341   2785   2793   Any
        //  1346   1425   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1346   1425   2785   2793   Any
        //  1492   1505   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1492   1505   2785   2793   Any
        //  1511   1526   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1511   1526   2785   2793   Any
        //  1531   1562   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1531   1562   2785   2793   Any
        //  1566   1576   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1566   1576   2785   2793   Any
        //  1585   1617   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1585   1617   2785   2793   Any
        //  1624   1647   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1624   1647   2785   2793   Any
        //  1663   1673   1729   1734   Ljava/io/UnsupportedEncodingException;
        //  1663   1673   2785   2793   Any
        //  1673   1726   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  1673   1726   2785   2793   Any
        //  1794   1832   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  1794   1832   2785   2793   Any
        //  1838   1918   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  1838   1918   2785   2793   Any
        //  1960   2026   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  1960   2026   2785   2793   Any
        //  2044   2050   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2044   2050   2785   2793   Any
        //  2068   2078   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2068   2078   2785   2793   Any
        //  2078   2100   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2078   2100   2785   2793   Any
        //  2105   2113   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2105   2113   2785   2793   Any
        //  2116   2147   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2116   2147   2785   2793   Any
        //  2178   2232   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2178   2232   2785   2793   Any
        //  2248   2261   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2248   2261   2785   2793   Any
        //  2271   2311   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2271   2311   2785   2793   Any
        //  2318   2326   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2318   2326   2785   2793   Any
        //  2332   2342   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2332   2342   2785   2793   Any
        //  2342   2364   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2342   2364   2785   2793   Any
        //  2369   2377   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2369   2377   2785   2793   Any
        //  2380   2394   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2380   2394   2785   2793   Any
        //  2409   2427   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2409   2427   2785   2793   Any
        //  2483   2577   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2483   2577   2785   2793   Any
        //  2587   2605   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2587   2605   2785   2793   Any
        //  2625   2644   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2625   2644   2785   2793   Any
        //  2665   2706   2807   2809   Ljava/io/UnsupportedEncodingException;
        //  2665   2706   2785   2793   Any
        //  2711   2775   2793   2795   Ljava/io/UnsupportedEncodingException;
        //  2711   2775   2785   2793   Any
        //  2775   2782   2860   2865   Ljava/io/UnsupportedEncodingException;
        //  2775   2782   2785   2793   Any
        //  2812   2820   817    822    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1441, Size: 1441
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
    
    @Override
    protected final Metadata b(final bvf bvf, final ByteBuffer byteBuffer) {
        return this.c(byteBuffer.array(), byteBuffer.limit());
    }
    
    public final Metadata c(final byte[] array, int n) {
        final ArrayList list = new ArrayList();
        final bas bas = new bas(array, n);
        n = bas.a();
        final boolean b = false;
        final int n2 = 10;
        oxu oxu = null;
        Label_0314: {
            Label_0047: {
                if (n < 10) {
                    bap.c("Id3Decoder", "Data too short to be an ID3 tag");
                }
                else {
                    n = bas.k();
                    if (n == 4801587) {
                        final int i = bas.i();
                        bas.H(1);
                        final int j = bas.i();
                        final int h = bas.h();
                        if (i == 2) {
                            n = h;
                            if ((j & 0x40) != 0x0) {
                                bap.c("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                break Label_0047;
                            }
                        }
                        else if (i == 3) {
                            n = h;
                            if ((j & 0x40) != 0x0) {
                                n = bas.d();
                                bas.H(n);
                                n = h - (n + 4);
                            }
                        }
                        else {
                            if (i != 4) {
                                final StringBuilder sb = new StringBuilder("Skipped ID3 tag with unsupported majorVersion=");
                                sb.append(i);
                                bap.c("Id3Decoder", sb.toString());
                                break Label_0047;
                            }
                            int n3 = h;
                            if ((j & 0x40) != 0x0) {
                                n = bas.h();
                                bas.H(n - 4);
                                n3 = h - n;
                            }
                            n = n3;
                            if ((j & 0x10) != 0x0) {
                                n = n3 - 10;
                            }
                        }
                        oxu = new oxu(i, i < 4 && (j & 0x80) != 0x0, n);
                        break Label_0314;
                    }
                    bap.c("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", n))));
                }
            }
            oxu = null;
        }
        if (oxu == null) {
            return null;
        }
        final int b2 = bas.b;
        n = n2;
        if (oxu.a == 2) {
            n = 6;
        }
        int n4 = oxu.b;
        if (oxu.c) {
            n4 = g(bas, n4);
        }
        bas.F(b2 + n4);
        boolean b3 = b;
        if (!k(bas, oxu.a, n, false)) {
            if (oxu.a != 4 || !k(bas, 4, n, true)) {
                n = oxu.a;
                final StringBuilder sb2 = new StringBuilder("Failed to validate ID3 tag with majorVersion=");
                sb2.append(n);
                bap.c("Id3Decoder", sb2.toString());
                return null;
            }
            b3 = true;
        }
        while (bas.a() >= n) {
            final Id3Frame m = m(oxu.a, bas, b3, n, this.b);
            if (m != null) {
                list.add(m);
            }
        }
        return new Metadata((List)list);
    }
}
