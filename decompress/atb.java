import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// 
// Decompiled by Procyon v0.6.0
// 

final class atb
{
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;
    
    public atb(final int a, final int b, final long c, final byte[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public atb(final int n, final int n2, final byte[] array) {
        this(n, n2, -1L, array);
    }
    
    public static atb b(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('\0');
        final byte[] bytes = sb.toString().getBytes(atd.g);
        return new atb(2, bytes.length, bytes);
    }
    
    public static atb c(final long n, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[atd.e[4]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            wrap.putInt((int)(new long[] { n })[i]);
            ++i;
        }
        return new atb(4, 1, wrap.array());
    }
    
    public static atb d(final atc atc, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[atd.e[5]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            final atc atc2 = (new atc[] { atc })[i];
            wrap.putInt((int)atc2.a);
            wrap.putInt((int)atc2.b);
            ++i;
        }
        return new atb(5, 1, wrap.array());
    }
    
    public static atb e(final int n, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[atd.e[3]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            wrap.putShort((short)(new int[] { n })[i]);
            ++i;
        }
        return new atb(3, 1, wrap.array());
    }
    
    public final int a(final ByteOrder byteOrder) {
        final Object f = this.f(byteOrder);
        if (f == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (f instanceof String) {
            return Integer.parseInt((String)f);
        }
        if (f instanceof long[]) {
            final long[] array = (long[])f;
            if (array.length == 1) {
                return (int)array[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        else {
            if (!(f instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            final int[] array2 = (int[])f;
            if (array2.length == 1) {
                return array2[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
    }
    
    final Object f(final ByteOrder p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          12
        //     3: new             Lata;
        //     6: astore          13
        //     8: aload           13
        //    10: aload_0        
        //    11: getfield        atb.d:[B
        //    14: invokespecial   ata.<init>:([B)V
        //    17: aload           13
        //    19: astore          12
        //    21: aload           13
        //    23: aload_1        
        //    24: putfield        ata.c:Ljava/nio/ByteOrder;
        //    27: aload           13
        //    29: astore          12
        //    31: aload_0        
        //    32: getfield        atb.a:I
        //    35: istore          11
        //    37: iconst_0       
        //    38: istore          7
        //    40: iconst_0       
        //    41: istore          4
        //    43: iconst_0       
        //    44: istore          10
        //    46: iconst_0       
        //    47: istore          9
        //    49: iconst_0       
        //    50: istore          6
        //    52: iconst_0       
        //    53: istore          5
        //    55: iconst_0       
        //    56: istore_2       
        //    57: iconst_0       
        //    58: istore_3       
        //    59: iconst_0       
        //    60: istore          8
        //    62: iload           11
        //    64: tableswitch {
        //                2: 886
        //                3: 690
        //                4: 627
        //                5: 561
        //                6: 482
        //                7: 886
        //                8: 690
        //                9: 416
        //               10: 350
        //               11: 269
        //               12: 202
        //               13: 136
        //          default: 128
        //        }
        //   128: aload           13
        //   130: invokevirtual   ata.close:()V
        //   133: goto            1011
        //   136: aload           13
        //   138: astore          12
        //   140: aload_0        
        //   141: getfield        atb.b:I
        //   144: newarray        D
        //   146: astore_1       
        //   147: iload           8
        //   149: istore_2       
        //   150: aload           13
        //   152: astore          12
        //   154: iload_2        
        //   155: aload_0        
        //   156: getfield        atb.b:I
        //   159: if_icmpge       180
        //   162: aload           13
        //   164: astore          12
        //   166: aload_1        
        //   167: iload_2        
        //   168: aload           13
        //   170: invokevirtual   ata.readDouble:()D
        //   173: dastore        
        //   174: iinc            2, 1
        //   177: goto            150
        //   180: aload           13
        //   182: invokevirtual   ata.close:()V
        //   185: goto            200
        //   188: astore          12
        //   190: ldc             "ExifInterface"
        //   192: ldc             "IOException occurred while closing InputStream"
        //   194: aload           12
        //   196: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   199: pop            
        //   200: aload_1        
        //   201: areturn        
        //   202: aload           13
        //   204: astore          12
        //   206: aload_0        
        //   207: getfield        atb.b:I
        //   210: newarray        D
        //   212: astore_1       
        //   213: iload           7
        //   215: istore_2       
        //   216: aload           13
        //   218: astore          12
        //   220: iload_2        
        //   221: aload_0        
        //   222: getfield        atb.b:I
        //   225: if_icmpge       247
        //   228: aload           13
        //   230: astore          12
        //   232: aload_1        
        //   233: iload_2        
        //   234: aload           13
        //   236: invokevirtual   ata.readFloat:()F
        //   239: f2d            
        //   240: dastore        
        //   241: iinc            2, 1
        //   244: goto            216
        //   247: aload           13
        //   249: invokevirtual   ata.close:()V
        //   252: goto            267
        //   255: astore          12
        //   257: ldc             "ExifInterface"
        //   259: ldc             "IOException occurred while closing InputStream"
        //   261: aload           12
        //   263: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   266: pop            
        //   267: aload_1        
        //   268: areturn        
        //   269: aload           13
        //   271: astore          12
        //   273: aload_0        
        //   274: getfield        atb.b:I
        //   277: anewarray       Latc;
        //   280: astore_1       
        //   281: iload           4
        //   283: istore_2       
        //   284: aload           13
        //   286: astore          12
        //   288: iload_2        
        //   289: aload_0        
        //   290: getfield        atb.b:I
        //   293: if_icmpge       328
        //   296: aload           13
        //   298: astore          12
        //   300: aload_1        
        //   301: iload_2        
        //   302: new             Latc;
        //   305: dup            
        //   306: aload           13
        //   308: invokevirtual   ata.readInt:()I
        //   311: i2l            
        //   312: aload           13
        //   314: invokevirtual   ata.readInt:()I
        //   317: i2l            
        //   318: invokespecial   atc.<init>:(JJ)V
        //   321: aastore        
        //   322: iinc            2, 1
        //   325: goto            284
        //   328: aload           13
        //   330: invokevirtual   ata.close:()V
        //   333: goto            348
        //   336: astore          12
        //   338: ldc             "ExifInterface"
        //   340: ldc             "IOException occurred while closing InputStream"
        //   342: aload           12
        //   344: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   347: pop            
        //   348: aload_1        
        //   349: areturn        
        //   350: aload           13
        //   352: astore          12
        //   354: aload_0        
        //   355: getfield        atb.b:I
        //   358: newarray        I
        //   360: astore_1       
        //   361: iload           10
        //   363: istore_2       
        //   364: aload           13
        //   366: astore          12
        //   368: iload_2        
        //   369: aload_0        
        //   370: getfield        atb.b:I
        //   373: if_icmpge       394
        //   376: aload           13
        //   378: astore          12
        //   380: aload_1        
        //   381: iload_2        
        //   382: aload           13
        //   384: invokevirtual   ata.readInt:()I
        //   387: iastore        
        //   388: iinc            2, 1
        //   391: goto            364
        //   394: aload           13
        //   396: invokevirtual   ata.close:()V
        //   399: goto            414
        //   402: astore          12
        //   404: ldc             "ExifInterface"
        //   406: ldc             "IOException occurred while closing InputStream"
        //   408: aload           12
        //   410: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   413: pop            
        //   414: aload_1        
        //   415: areturn        
        //   416: aload           13
        //   418: astore          12
        //   420: aload_0        
        //   421: getfield        atb.b:I
        //   424: newarray        I
        //   426: astore_1       
        //   427: iload           9
        //   429: istore_2       
        //   430: aload           13
        //   432: astore          12
        //   434: iload_2        
        //   435: aload_0        
        //   436: getfield        atb.b:I
        //   439: if_icmpge       460
        //   442: aload           13
        //   444: astore          12
        //   446: aload_1        
        //   447: iload_2        
        //   448: aload           13
        //   450: invokevirtual   ata.readShort:()S
        //   453: iastore        
        //   454: iinc            2, 1
        //   457: goto            430
        //   460: aload           13
        //   462: invokevirtual   ata.close:()V
        //   465: goto            480
        //   468: astore          12
        //   470: ldc             "ExifInterface"
        //   472: ldc             "IOException occurred while closing InputStream"
        //   474: aload           12
        //   476: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   479: pop            
        //   480: aload_1        
        //   481: areturn        
        //   482: aload           13
        //   484: astore          12
        //   486: aload_0        
        //   487: getfield        atb.b:I
        //   490: anewarray       Latc;
        //   493: astore_1       
        //   494: iload           6
        //   496: istore_2       
        //   497: aload           13
        //   499: astore          12
        //   501: iload_2        
        //   502: aload_0        
        //   503: getfield        atb.b:I
        //   506: if_icmpge       539
        //   509: aload           13
        //   511: astore          12
        //   513: aload_1        
        //   514: iload_2        
        //   515: new             Latc;
        //   518: dup            
        //   519: aload           13
        //   521: invokevirtual   ata.a:()J
        //   524: aload           13
        //   526: invokevirtual   ata.a:()J
        //   529: invokespecial   atc.<init>:(JJ)V
        //   532: aastore        
        //   533: iinc            2, 1
        //   536: goto            497
        //   539: aload           13
        //   541: invokevirtual   ata.close:()V
        //   544: goto            559
        //   547: astore          12
        //   549: ldc             "ExifInterface"
        //   551: ldc             "IOException occurred while closing InputStream"
        //   553: aload           12
        //   555: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   558: pop            
        //   559: aload_1        
        //   560: areturn        
        //   561: aload           13
        //   563: astore          12
        //   565: aload_0        
        //   566: getfield        atb.b:I
        //   569: newarray        J
        //   571: astore_1       
        //   572: iload           5
        //   574: istore_2       
        //   575: aload           13
        //   577: astore          12
        //   579: iload_2        
        //   580: aload_0        
        //   581: getfield        atb.b:I
        //   584: if_icmpge       605
        //   587: aload           13
        //   589: astore          12
        //   591: aload_1        
        //   592: iload_2        
        //   593: aload           13
        //   595: invokevirtual   ata.a:()J
        //   598: lastore        
        //   599: iinc            2, 1
        //   602: goto            575
        //   605: aload           13
        //   607: invokevirtual   ata.close:()V
        //   610: goto            625
        //   613: astore          12
        //   615: ldc             "ExifInterface"
        //   617: ldc             "IOException occurred while closing InputStream"
        //   619: aload           12
        //   621: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   624: pop            
        //   625: aload_1        
        //   626: areturn        
        //   627: aload           13
        //   629: astore          12
        //   631: aload_0        
        //   632: getfield        atb.b:I
        //   635: newarray        I
        //   637: astore_1       
        //   638: aload           13
        //   640: astore          12
        //   642: iload_2        
        //   643: aload_0        
        //   644: getfield        atb.b:I
        //   647: if_icmpge       668
        //   650: aload           13
        //   652: astore          12
        //   654: aload_1        
        //   655: iload_2        
        //   656: aload           13
        //   658: invokevirtual   ata.readUnsignedShort:()I
        //   661: iastore        
        //   662: iinc            2, 1
        //   665: goto            638
        //   668: aload           13
        //   670: invokevirtual   ata.close:()V
        //   673: goto            688
        //   676: astore          12
        //   678: ldc             "ExifInterface"
        //   680: ldc             "IOException occurred while closing InputStream"
        //   682: aload           12
        //   684: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   687: pop            
        //   688: aload_1        
        //   689: areturn        
        //   690: aload           13
        //   692: astore          12
        //   694: aload_0        
        //   695: getfield        atb.b:I
        //   698: istore          4
        //   700: aload           13
        //   702: astore          12
        //   704: getstatic       atd.f:[B
        //   707: arraylength    
        //   708: istore_2       
        //   709: iload_3        
        //   710: istore_2       
        //   711: iload           4
        //   713: bipush          8
        //   715: if_icmplt       772
        //   718: iconst_0       
        //   719: istore_2       
        //   720: aload           13
        //   722: astore          12
        //   724: getstatic       atd.f:[B
        //   727: astore_1       
        //   728: aload           13
        //   730: astore          12
        //   732: aload_1        
        //   733: arraylength    
        //   734: istore          4
        //   736: iload_2        
        //   737: bipush          8
        //   739: if_icmpge       769
        //   742: aload           13
        //   744: astore          12
        //   746: aload_0        
        //   747: getfield        atb.d:[B
        //   750: iload_2        
        //   751: baload         
        //   752: aload_1        
        //   753: iload_2        
        //   754: baload         
        //   755: if_icmpeq       763
        //   758: iload_3        
        //   759: istore_2       
        //   760: goto            772
        //   763: iinc            2, 1
        //   766: goto            720
        //   769: bipush          8
        //   771: istore_2       
        //   772: aload           13
        //   774: astore          12
        //   776: new             Ljava/lang/StringBuilder;
        //   779: astore_1       
        //   780: aload           13
        //   782: astore          12
        //   784: aload_1        
        //   785: invokespecial   java/lang/StringBuilder.<init>:()V
        //   788: aload           13
        //   790: astore          12
        //   792: iload_2        
        //   793: aload_0        
        //   794: getfield        atb.b:I
        //   797: if_icmpge       855
        //   800: aload           13
        //   802: astore          12
        //   804: aload_0        
        //   805: getfield        atb.d:[B
        //   808: iload_2        
        //   809: baload         
        //   810: istore_3       
        //   811: iload_3        
        //   812: ifne            818
        //   815: goto            855
        //   818: iload_3        
        //   819: bipush          32
        //   821: if_icmplt       838
        //   824: aload           13
        //   826: astore          12
        //   828: aload_1        
        //   829: iload_3        
        //   830: i2c            
        //   831: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   834: pop            
        //   835: goto            849
        //   838: aload           13
        //   840: astore          12
        //   842: aload_1        
        //   843: bipush          63
        //   845: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   848: pop            
        //   849: iinc            2, 1
        //   852: goto            788
        //   855: aload           13
        //   857: astore          12
        //   859: aload_1        
        //   860: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   863: astore_1       
        //   864: aload           13
        //   866: invokevirtual   ata.close:()V
        //   869: goto            884
        //   872: astore          12
        //   874: ldc             "ExifInterface"
        //   876: ldc             "IOException occurred while closing InputStream"
        //   878: aload           12
        //   880: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   883: pop            
        //   884: aload_1        
        //   885: areturn        
        //   886: aload           13
        //   888: astore          12
        //   890: aload_0        
        //   891: getfield        atb.d:[B
        //   894: astore_1       
        //   895: aload           13
        //   897: astore          12
        //   899: aload_1        
        //   900: arraylength    
        //   901: iconst_1       
        //   902: if_icmpne       963
        //   905: aload_1        
        //   906: iconst_0       
        //   907: baload         
        //   908: istore_2       
        //   909: iload_2        
        //   910: iflt            963
        //   913: iload_2        
        //   914: iconst_1       
        //   915: if_icmpgt       963
        //   918: aload           13
        //   920: astore          12
        //   922: new             Ljava/lang/String;
        //   925: dup            
        //   926: iconst_1       
        //   927: newarray        C
        //   929: dup            
        //   930: iconst_0       
        //   931: iload_2        
        //   932: bipush          48
        //   934: iadd           
        //   935: i2c            
        //   936: castore        
        //   937: invokespecial   java/lang/String.<init>:([C)V
        //   940: astore_1       
        //   941: aload           13
        //   943: invokevirtual   ata.close:()V
        //   946: goto            961
        //   949: astore          12
        //   951: ldc             "ExifInterface"
        //   953: ldc             "IOException occurred while closing InputStream"
        //   955: aload           12
        //   957: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   960: pop            
        //   961: aload_1        
        //   962: areturn        
        //   963: aload           13
        //   965: astore          12
        //   967: new             Ljava/lang/String;
        //   970: dup            
        //   971: aload_1        
        //   972: getstatic       atd.g:Ljava/nio/charset/Charset;
        //   975: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
        //   978: astore_1       
        //   979: aload           13
        //   981: invokevirtual   ata.close:()V
        //   984: goto            999
        //   987: astore          12
        //   989: ldc             "ExifInterface"
        //   991: ldc             "IOException occurred while closing InputStream"
        //   993: aload           12
        //   995: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   998: pop            
        //   999: aload_1        
        //  1000: areturn        
        //  1001: astore_1       
        //  1002: ldc             "ExifInterface"
        //  1004: ldc             "IOException occurred while closing InputStream"
        //  1006: aload_1        
        //  1007: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1010: pop            
        //  1011: aconst_null    
        //  1012: areturn        
        //  1013: astore          12
        //  1015: aload           13
        //  1017: astore_1       
        //  1018: aload           12
        //  1020: astore          13
        //  1022: goto            1033
        //  1025: astore_1       
        //  1026: goto            1070
        //  1029: astore          13
        //  1031: aconst_null    
        //  1032: astore_1       
        //  1033: aload_1        
        //  1034: astore          12
        //  1036: ldc             "ExifInterface"
        //  1038: ldc             "IOException occurred during reading a value"
        //  1040: aload           13
        //  1042: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1045: pop            
        //  1046: aload_1        
        //  1047: ifnull          1067
        //  1050: aload_1        
        //  1051: invokevirtual   ata.close:()V
        //  1054: goto            1067
        //  1057: astore_1       
        //  1058: ldc             "ExifInterface"
        //  1060: ldc             "IOException occurred while closing InputStream"
        //  1062: aload_1        
        //  1063: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1066: pop            
        //  1067: aconst_null    
        //  1068: areturn        
        //  1069: astore_1       
        //  1070: aload           12
        //  1072: ifnull          1095
        //  1075: aload           12
        //  1077: invokevirtual   ata.close:()V
        //  1080: goto            1095
        //  1083: astore          12
        //  1085: ldc             "ExifInterface"
        //  1087: ldc             "IOException occurred while closing InputStream"
        //  1089: aload           12
        //  1091: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1094: pop            
        //  1095: goto            1100
        //  1098: aload_1        
        //  1099: athrow         
        //  1100: goto            1098
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      17     1029   1033   Ljava/io/IOException;
        //  3      17     1025   1029   Any
        //  21     27     1013   1025   Ljava/io/IOException;
        //  21     27     1069   1070   Any
        //  31     37     1013   1025   Ljava/io/IOException;
        //  31     37     1069   1070   Any
        //  128    133    1001   1011   Ljava/io/IOException;
        //  140    147    1013   1025   Ljava/io/IOException;
        //  140    147    1069   1070   Any
        //  154    162    1013   1025   Ljava/io/IOException;
        //  154    162    1069   1070   Any
        //  166    174    1013   1025   Ljava/io/IOException;
        //  166    174    1069   1070   Any
        //  180    185    188    200    Ljava/io/IOException;
        //  206    213    1013   1025   Ljava/io/IOException;
        //  206    213    1069   1070   Any
        //  220    228    1013   1025   Ljava/io/IOException;
        //  220    228    1069   1070   Any
        //  232    241    1013   1025   Ljava/io/IOException;
        //  232    241    1069   1070   Any
        //  247    252    255    267    Ljava/io/IOException;
        //  273    281    1013   1025   Ljava/io/IOException;
        //  273    281    1069   1070   Any
        //  288    296    1013   1025   Ljava/io/IOException;
        //  288    296    1069   1070   Any
        //  300    322    1013   1025   Ljava/io/IOException;
        //  300    322    1069   1070   Any
        //  328    333    336    348    Ljava/io/IOException;
        //  354    361    1013   1025   Ljava/io/IOException;
        //  354    361    1069   1070   Any
        //  368    376    1013   1025   Ljava/io/IOException;
        //  368    376    1069   1070   Any
        //  380    388    1013   1025   Ljava/io/IOException;
        //  380    388    1069   1070   Any
        //  394    399    402    414    Ljava/io/IOException;
        //  420    427    1013   1025   Ljava/io/IOException;
        //  420    427    1069   1070   Any
        //  434    442    1013   1025   Ljava/io/IOException;
        //  434    442    1069   1070   Any
        //  446    454    1013   1025   Ljava/io/IOException;
        //  446    454    1069   1070   Any
        //  460    465    468    480    Ljava/io/IOException;
        //  486    494    1013   1025   Ljava/io/IOException;
        //  486    494    1069   1070   Any
        //  501    509    1013   1025   Ljava/io/IOException;
        //  501    509    1069   1070   Any
        //  513    533    1013   1025   Ljava/io/IOException;
        //  513    533    1069   1070   Any
        //  539    544    547    559    Ljava/io/IOException;
        //  565    572    1013   1025   Ljava/io/IOException;
        //  565    572    1069   1070   Any
        //  579    587    1013   1025   Ljava/io/IOException;
        //  579    587    1069   1070   Any
        //  591    599    1013   1025   Ljava/io/IOException;
        //  591    599    1069   1070   Any
        //  605    610    613    625    Ljava/io/IOException;
        //  631    638    1013   1025   Ljava/io/IOException;
        //  631    638    1069   1070   Any
        //  642    650    1013   1025   Ljava/io/IOException;
        //  642    650    1069   1070   Any
        //  654    662    1013   1025   Ljava/io/IOException;
        //  654    662    1069   1070   Any
        //  668    673    676    688    Ljava/io/IOException;
        //  694    700    1013   1025   Ljava/io/IOException;
        //  694    700    1069   1070   Any
        //  704    709    1013   1025   Ljava/io/IOException;
        //  704    709    1069   1070   Any
        //  724    728    1013   1025   Ljava/io/IOException;
        //  724    728    1069   1070   Any
        //  732    736    1013   1025   Ljava/io/IOException;
        //  732    736    1069   1070   Any
        //  746    758    1013   1025   Ljava/io/IOException;
        //  746    758    1069   1070   Any
        //  776    780    1013   1025   Ljava/io/IOException;
        //  776    780    1069   1070   Any
        //  784    788    1013   1025   Ljava/io/IOException;
        //  784    788    1069   1070   Any
        //  792    800    1013   1025   Ljava/io/IOException;
        //  792    800    1069   1070   Any
        //  804    811    1013   1025   Ljava/io/IOException;
        //  804    811    1069   1070   Any
        //  828    835    1013   1025   Ljava/io/IOException;
        //  828    835    1069   1070   Any
        //  842    849    1013   1025   Ljava/io/IOException;
        //  842    849    1069   1070   Any
        //  859    864    1013   1025   Ljava/io/IOException;
        //  859    864    1069   1070   Any
        //  864    869    872    884    Ljava/io/IOException;
        //  890    895    1013   1025   Ljava/io/IOException;
        //  890    895    1069   1070   Any
        //  899    905    1013   1025   Ljava/io/IOException;
        //  899    905    1069   1070   Any
        //  922    941    1013   1025   Ljava/io/IOException;
        //  922    941    1069   1070   Any
        //  941    946    949    961    Ljava/io/IOException;
        //  967    979    1013   1025   Ljava/io/IOException;
        //  967    979    1069   1070   Any
        //  979    984    987    999    Ljava/io/IOException;
        //  1036   1046   1069   1070   Any
        //  1050   1054   1057   1067   Ljava/io/IOException;
        //  1075   1080   1083   1095   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0128:
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
    
    public final String g(final ByteOrder byteOrder) {
        final Object f = this.f(byteOrder);
        if (f == null) {
            return null;
        }
        if (f instanceof String) {
            return (String)f;
        }
        final StringBuilder sb = new StringBuilder();
        final boolean b = f instanceof long[];
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        final int n4 = 0;
        if (b) {
            final long[] array = (long[])f;
            int n5 = n4;
            while (true) {
                final int length = array.length;
                if (n5 >= length) {
                    break;
                }
                sb.append(array[n5]);
                final int n6 = n5 + 1;
                if ((n5 = n6) == length) {
                    continue;
                }
                sb.append(",");
                n5 = n6;
            }
            return sb.toString();
        }
        if (f instanceof int[]) {
            final int[] array2 = (int[])f;
            int n7 = n;
            while (true) {
                final int length2 = array2.length;
                if (n7 >= length2) {
                    break;
                }
                sb.append(array2[n7]);
                final int n8 = n7 + 1;
                if ((n7 = n8) == length2) {
                    continue;
                }
                sb.append(",");
                n7 = n8;
            }
            return sb.toString();
        }
        if (f instanceof double[]) {
            final double[] array3 = (double[])f;
            int n9 = n2;
            while (true) {
                final int length3 = array3.length;
                if (n9 >= length3) {
                    break;
                }
                sb.append(array3[n9]);
                final int n10 = n9 + 1;
                if ((n9 = n10) == length3) {
                    continue;
                }
                sb.append(",");
                n9 = n10;
            }
            return sb.toString();
        }
        if (f instanceof atc[]) {
            final atc[] array4 = (atc[])f;
            while (true) {
                final int length4 = array4.length;
                if (n3 >= length4) {
                    break;
                }
                sb.append(array4[n3].a);
                sb.append('/');
                sb.append(array4[n3].b);
                final int n11 = n3 + 1;
                if ((n3 = n11) == length4) {
                    continue;
                }
                sb.append(",");
                n3 = n11;
            }
            return sb.toString();
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(atd.d[this.a]);
        sb.append(", data length:");
        sb.append(this.d.length);
        sb.append(")");
        return sb.toString();
    }
}
