import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// 
// Decompiled by Procyon v0.6.0
// 

final class asy
{
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;
    
    public asy(final int a, final int b, final long c, final byte[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public asy(final int n, final int n2, final byte[] array) {
        this(n, n2, -1L, array);
    }
    
    public static asy b(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('\0');
        final byte[] bytes = sb.toString().getBytes(ata.g);
        return new asy(2, bytes.length, bytes);
    }
    
    public static asy c(final long n, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[ata.e[4]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            wrap.putInt((int)(new long[] { n })[i]);
            ++i;
        }
        return new asy(4, 1, wrap.array());
    }
    
    public static asy d(final asz asz, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[ata.e[5]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            final asz asz2 = (new asz[] { asz })[i];
            wrap.putInt((int)asz2.a);
            wrap.putInt((int)asz2.b);
            ++i;
        }
        return new asy(5, 1, wrap.array());
    }
    
    public static asy e(final int n, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[ata.e[3]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            wrap.putShort((short)(new int[] { n })[i]);
            ++i;
        }
        return new asy(3, 1, wrap.array());
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
        //     1: astore_2       
        //     2: new             Lasx;
        //     5: astore_3       
        //     6: aload_3        
        //     7: aload_0        
        //     8: getfield        asy.d:[B
        //    11: invokespecial   asx.<init>:([B)V
        //    14: aload_3        
        //    15: astore_2       
        //    16: aload_3        
        //    17: aload_1        
        //    18: putfield        asx.c:Ljava/nio/ByteOrder;
        //    21: aload_3        
        //    22: astore_2       
        //    23: aload_0        
        //    24: getfield        asy.a:I
        //    27: istore          4
        //    29: iconst_0       
        //    30: istore          5
        //    32: iconst_0       
        //    33: istore          6
        //    35: iconst_0       
        //    36: istore          7
        //    38: iconst_0       
        //    39: istore          8
        //    41: iconst_0       
        //    42: istore          9
        //    44: iconst_0       
        //    45: istore          10
        //    47: iconst_0       
        //    48: istore          11
        //    50: iconst_0       
        //    51: istore          12
        //    53: iconst_0       
        //    54: istore          13
        //    56: iload           4
        //    58: tableswitch {
        //                2: 807
        //                3: 622
        //                4: 563
        //                5: 504
        //                6: 433
        //                7: 807
        //                8: 622
        //                9: 374
        //               10: 315
        //               11: 242
        //               12: 182
        //               13: 127
        //          default: 120
        //        }
        //   120: aload_3        
        //   121: invokevirtual   asx.close:()V
        //   124: goto            922
        //   127: aload_3        
        //   128: astore_2       
        //   129: aload_0        
        //   130: getfield        asy.b:I
        //   133: newarray        D
        //   135: astore_1       
        //   136: aload_3        
        //   137: astore_2       
        //   138: iload           13
        //   140: aload_0        
        //   141: getfield        asy.b:I
        //   144: if_icmpge       163
        //   147: aload_3        
        //   148: astore_2       
        //   149: aload_1        
        //   150: iload           13
        //   152: aload_3        
        //   153: invokevirtual   asx.readDouble:()D
        //   156: dastore        
        //   157: iinc            13, 1
        //   160: goto            136
        //   163: aload_3        
        //   164: invokevirtual   asx.close:()V
        //   167: goto            180
        //   170: astore_2       
        //   171: ldc             "ExifInterface"
        //   173: ldc             "IOException occurred while closing InputStream"
        //   175: aload_2        
        //   176: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   179: pop            
        //   180: aload_1        
        //   181: areturn        
        //   182: aload_3        
        //   183: astore_2       
        //   184: aload_0        
        //   185: getfield        asy.b:I
        //   188: newarray        D
        //   190: astore_1       
        //   191: iload           5
        //   193: istore          13
        //   195: aload_3        
        //   196: astore_2       
        //   197: iload           13
        //   199: aload_0        
        //   200: getfield        asy.b:I
        //   203: if_icmpge       223
        //   206: aload_3        
        //   207: astore_2       
        //   208: aload_1        
        //   209: iload           13
        //   211: aload_3        
        //   212: invokevirtual   asx.readFloat:()F
        //   215: f2d            
        //   216: dastore        
        //   217: iinc            13, 1
        //   220: goto            195
        //   223: aload_3        
        //   224: invokevirtual   asx.close:()V
        //   227: goto            240
        //   230: astore_2       
        //   231: ldc             "ExifInterface"
        //   233: ldc             "IOException occurred while closing InputStream"
        //   235: aload_2        
        //   236: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   239: pop            
        //   240: aload_1        
        //   241: areturn        
        //   242: aload_3        
        //   243: astore_2       
        //   244: aload_0        
        //   245: getfield        asy.b:I
        //   248: anewarray       Lasz;
        //   251: astore_1       
        //   252: iload           6
        //   254: istore          13
        //   256: aload_3        
        //   257: astore_2       
        //   258: iload           13
        //   260: aload_0        
        //   261: getfield        asy.b:I
        //   264: if_icmpge       296
        //   267: aload_3        
        //   268: astore_2       
        //   269: aload_1        
        //   270: iload           13
        //   272: new             Lasz;
        //   275: dup            
        //   276: aload_3        
        //   277: invokevirtual   asx.readInt:()I
        //   280: i2l            
        //   281: aload_3        
        //   282: invokevirtual   asx.readInt:()I
        //   285: i2l            
        //   286: invokespecial   asz.<init>:(JJ)V
        //   289: aastore        
        //   290: iinc            13, 1
        //   293: goto            256
        //   296: aload_3        
        //   297: invokevirtual   asx.close:()V
        //   300: goto            313
        //   303: astore_2       
        //   304: ldc             "ExifInterface"
        //   306: ldc             "IOException occurred while closing InputStream"
        //   308: aload_2        
        //   309: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   312: pop            
        //   313: aload_1        
        //   314: areturn        
        //   315: aload_3        
        //   316: astore_2       
        //   317: aload_0        
        //   318: getfield        asy.b:I
        //   321: newarray        I
        //   323: astore_1       
        //   324: iload           7
        //   326: istore          13
        //   328: aload_3        
        //   329: astore_2       
        //   330: iload           13
        //   332: aload_0        
        //   333: getfield        asy.b:I
        //   336: if_icmpge       355
        //   339: aload_3        
        //   340: astore_2       
        //   341: aload_1        
        //   342: iload           13
        //   344: aload_3        
        //   345: invokevirtual   asx.readInt:()I
        //   348: iastore        
        //   349: iinc            13, 1
        //   352: goto            328
        //   355: aload_3        
        //   356: invokevirtual   asx.close:()V
        //   359: goto            372
        //   362: astore_2       
        //   363: ldc             "ExifInterface"
        //   365: ldc             "IOException occurred while closing InputStream"
        //   367: aload_2        
        //   368: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   371: pop            
        //   372: aload_1        
        //   373: areturn        
        //   374: aload_3        
        //   375: astore_2       
        //   376: aload_0        
        //   377: getfield        asy.b:I
        //   380: newarray        I
        //   382: astore_1       
        //   383: iload           8
        //   385: istore          13
        //   387: aload_3        
        //   388: astore_2       
        //   389: iload           13
        //   391: aload_0        
        //   392: getfield        asy.b:I
        //   395: if_icmpge       414
        //   398: aload_3        
        //   399: astore_2       
        //   400: aload_1        
        //   401: iload           13
        //   403: aload_3        
        //   404: invokevirtual   asx.readShort:()S
        //   407: iastore        
        //   408: iinc            13, 1
        //   411: goto            387
        //   414: aload_3        
        //   415: invokevirtual   asx.close:()V
        //   418: goto            431
        //   421: astore_2       
        //   422: ldc             "ExifInterface"
        //   424: ldc             "IOException occurred while closing InputStream"
        //   426: aload_2        
        //   427: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   430: pop            
        //   431: aload_1        
        //   432: areturn        
        //   433: aload_3        
        //   434: astore_2       
        //   435: aload_0        
        //   436: getfield        asy.b:I
        //   439: anewarray       Lasz;
        //   442: astore_1       
        //   443: iload           9
        //   445: istore          13
        //   447: aload_3        
        //   448: astore_2       
        //   449: iload           13
        //   451: aload_0        
        //   452: getfield        asy.b:I
        //   455: if_icmpge       485
        //   458: aload_3        
        //   459: astore_2       
        //   460: aload_1        
        //   461: iload           13
        //   463: new             Lasz;
        //   466: dup            
        //   467: aload_3        
        //   468: invokevirtual   asx.a:()J
        //   471: aload_3        
        //   472: invokevirtual   asx.a:()J
        //   475: invokespecial   asz.<init>:(JJ)V
        //   478: aastore        
        //   479: iinc            13, 1
        //   482: goto            447
        //   485: aload_3        
        //   486: invokevirtual   asx.close:()V
        //   489: goto            502
        //   492: astore_2       
        //   493: ldc             "ExifInterface"
        //   495: ldc             "IOException occurred while closing InputStream"
        //   497: aload_2        
        //   498: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   501: pop            
        //   502: aload_1        
        //   503: areturn        
        //   504: aload_3        
        //   505: astore_2       
        //   506: aload_0        
        //   507: getfield        asy.b:I
        //   510: newarray        J
        //   512: astore_1       
        //   513: iload           10
        //   515: istore          13
        //   517: aload_3        
        //   518: astore_2       
        //   519: iload           13
        //   521: aload_0        
        //   522: getfield        asy.b:I
        //   525: if_icmpge       544
        //   528: aload_3        
        //   529: astore_2       
        //   530: aload_1        
        //   531: iload           13
        //   533: aload_3        
        //   534: invokevirtual   asx.a:()J
        //   537: lastore        
        //   538: iinc            13, 1
        //   541: goto            517
        //   544: aload_3        
        //   545: invokevirtual   asx.close:()V
        //   548: goto            561
        //   551: astore_2       
        //   552: ldc             "ExifInterface"
        //   554: ldc             "IOException occurred while closing InputStream"
        //   556: aload_2        
        //   557: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   560: pop            
        //   561: aload_1        
        //   562: areturn        
        //   563: aload_3        
        //   564: astore_2       
        //   565: aload_0        
        //   566: getfield        asy.b:I
        //   569: newarray        I
        //   571: astore_1       
        //   572: iload           11
        //   574: istore          13
        //   576: aload_3        
        //   577: astore_2       
        //   578: iload           13
        //   580: aload_0        
        //   581: getfield        asy.b:I
        //   584: if_icmpge       603
        //   587: aload_3        
        //   588: astore_2       
        //   589: aload_1        
        //   590: iload           13
        //   592: aload_3        
        //   593: invokevirtual   asx.readUnsignedShort:()I
        //   596: iastore        
        //   597: iinc            13, 1
        //   600: goto            576
        //   603: aload_3        
        //   604: invokevirtual   asx.close:()V
        //   607: goto            620
        //   610: astore_2       
        //   611: ldc             "ExifInterface"
        //   613: ldc             "IOException occurred while closing InputStream"
        //   615: aload_2        
        //   616: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   619: pop            
        //   620: aload_1        
        //   621: areturn        
        //   622: aload_3        
        //   623: astore_2       
        //   624: aload_0        
        //   625: getfield        asy.b:I
        //   628: istore          5
        //   630: aload_3        
        //   631: astore_2       
        //   632: getstatic       ata.f:[B
        //   635: arraylength    
        //   636: istore          13
        //   638: iload           12
        //   640: istore          13
        //   642: iload           5
        //   644: bipush          8
        //   646: if_icmplt       704
        //   649: iconst_0       
        //   650: istore          13
        //   652: aload_3        
        //   653: astore_2       
        //   654: getstatic       ata.f:[B
        //   657: astore_1       
        //   658: aload_3        
        //   659: astore_2       
        //   660: aload_1        
        //   661: arraylength    
        //   662: istore          5
        //   664: iload           13
        //   666: bipush          8
        //   668: if_icmpge       700
        //   671: aload_3        
        //   672: astore_2       
        //   673: aload_0        
        //   674: getfield        asy.d:[B
        //   677: iload           13
        //   679: baload         
        //   680: aload_1        
        //   681: iload           13
        //   683: baload         
        //   684: if_icmpeq       694
        //   687: iload           12
        //   689: istore          13
        //   691: goto            704
        //   694: iinc            13, 1
        //   697: goto            652
        //   700: bipush          8
        //   702: istore          13
        //   704: aload_3        
        //   705: astore_2       
        //   706: new             Ljava/lang/StringBuilder;
        //   709: astore_1       
        //   710: aload_3        
        //   711: astore_2       
        //   712: aload_1        
        //   713: invokespecial   java/lang/StringBuilder.<init>:()V
        //   716: aload_3        
        //   717: astore_2       
        //   718: iload           13
        //   720: aload_0        
        //   721: getfield        asy.b:I
        //   724: if_icmpge       781
        //   727: aload_3        
        //   728: astore_2       
        //   729: aload_0        
        //   730: getfield        asy.d:[B
        //   733: iload           13
        //   735: baload         
        //   736: istore          12
        //   738: iload           12
        //   740: ifne            746
        //   743: goto            781
        //   746: iload           12
        //   748: bipush          32
        //   750: if_icmplt       766
        //   753: aload_3        
        //   754: astore_2       
        //   755: aload_1        
        //   756: iload           12
        //   758: i2c            
        //   759: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   762: pop            
        //   763: goto            775
        //   766: aload_3        
        //   767: astore_2       
        //   768: aload_1        
        //   769: bipush          63
        //   771: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   774: pop            
        //   775: iinc            13, 1
        //   778: goto            716
        //   781: aload_3        
        //   782: astore_2       
        //   783: aload_1        
        //   784: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   787: astore_1       
        //   788: aload_3        
        //   789: invokevirtual   asx.close:()V
        //   792: goto            805
        //   795: astore_2       
        //   796: ldc             "ExifInterface"
        //   798: ldc             "IOException occurred while closing InputStream"
        //   800: aload_2        
        //   801: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   804: pop            
        //   805: aload_1        
        //   806: areturn        
        //   807: aload_3        
        //   808: astore_2       
        //   809: aload_0        
        //   810: getfield        asy.d:[B
        //   813: astore_1       
        //   814: aload_3        
        //   815: astore_2       
        //   816: aload_1        
        //   817: arraylength    
        //   818: iconst_1       
        //   819: if_icmpne       879
        //   822: aload_1        
        //   823: iconst_0       
        //   824: baload         
        //   825: istore          13
        //   827: iload           13
        //   829: iflt            879
        //   832: iload           13
        //   834: iconst_1       
        //   835: if_icmpgt       879
        //   838: aload_3        
        //   839: astore_2       
        //   840: new             Ljava/lang/String;
        //   843: dup            
        //   844: iconst_1       
        //   845: newarray        C
        //   847: dup            
        //   848: iconst_0       
        //   849: iload           13
        //   851: bipush          48
        //   853: iadd           
        //   854: i2c            
        //   855: castore        
        //   856: invokespecial   java/lang/String.<init>:([C)V
        //   859: astore_1       
        //   860: aload_3        
        //   861: invokevirtual   asx.close:()V
        //   864: goto            877
        //   867: astore_2       
        //   868: ldc             "ExifInterface"
        //   870: ldc             "IOException occurred while closing InputStream"
        //   872: aload_2        
        //   873: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   876: pop            
        //   877: aload_1        
        //   878: areturn        
        //   879: aload_3        
        //   880: astore_2       
        //   881: new             Ljava/lang/String;
        //   884: dup            
        //   885: aload_1        
        //   886: getstatic       ata.g:Ljava/nio/charset/Charset;
        //   889: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
        //   892: astore_1       
        //   893: aload_3        
        //   894: invokevirtual   asx.close:()V
        //   897: goto            910
        //   900: astore_2       
        //   901: ldc             "ExifInterface"
        //   903: ldc             "IOException occurred while closing InputStream"
        //   905: aload_2        
        //   906: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   909: pop            
        //   910: aload_1        
        //   911: areturn        
        //   912: astore_1       
        //   913: ldc             "ExifInterface"
        //   915: ldc             "IOException occurred while closing InputStream"
        //   917: aload_1        
        //   918: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   921: pop            
        //   922: aconst_null    
        //   923: areturn        
        //   924: astore_2       
        //   925: aload_3        
        //   926: astore_1       
        //   927: aload_2        
        //   928: astore_3       
        //   929: goto            939
        //   932: astore_1       
        //   933: goto            974
        //   936: astore_3       
        //   937: aconst_null    
        //   938: astore_1       
        //   939: aload_1        
        //   940: astore_2       
        //   941: ldc             "ExifInterface"
        //   943: ldc             "IOException occurred during reading a value"
        //   945: aload_3        
        //   946: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   949: pop            
        //   950: aload_1        
        //   951: ifnull          971
        //   954: aload_1        
        //   955: invokevirtual   asx.close:()V
        //   958: goto            971
        //   961: astore_1       
        //   962: ldc             "ExifInterface"
        //   964: ldc             "IOException occurred while closing InputStream"
        //   966: aload_1        
        //   967: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   970: pop            
        //   971: aconst_null    
        //   972: areturn        
        //   973: astore_1       
        //   974: aload_2        
        //   975: ifnull          995
        //   978: aload_2        
        //   979: invokevirtual   asx.close:()V
        //   982: goto            995
        //   985: astore_2       
        //   986: ldc             "ExifInterface"
        //   988: ldc             "IOException occurred while closing InputStream"
        //   990: aload_2        
        //   991: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   994: pop            
        //   995: goto            1000
        //   998: aload_1        
        //   999: athrow         
        //  1000: goto            998
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      14     936    939    Ljava/io/IOException;
        //  2      14     932    936    Any
        //  16     21     924    932    Ljava/io/IOException;
        //  16     21     973    974    Any
        //  23     29     924    932    Ljava/io/IOException;
        //  23     29     973    974    Any
        //  120    124    912    922    Ljava/io/IOException;
        //  129    136    924    932    Ljava/io/IOException;
        //  129    136    973    974    Any
        //  138    147    924    932    Ljava/io/IOException;
        //  138    147    973    974    Any
        //  149    157    924    932    Ljava/io/IOException;
        //  149    157    973    974    Any
        //  163    167    170    180    Ljava/io/IOException;
        //  184    191    924    932    Ljava/io/IOException;
        //  184    191    973    974    Any
        //  197    206    924    932    Ljava/io/IOException;
        //  197    206    973    974    Any
        //  208    217    924    932    Ljava/io/IOException;
        //  208    217    973    974    Any
        //  223    227    230    240    Ljava/io/IOException;
        //  244    252    924    932    Ljava/io/IOException;
        //  244    252    973    974    Any
        //  258    267    924    932    Ljava/io/IOException;
        //  258    267    973    974    Any
        //  269    290    924    932    Ljava/io/IOException;
        //  269    290    973    974    Any
        //  296    300    303    313    Ljava/io/IOException;
        //  317    324    924    932    Ljava/io/IOException;
        //  317    324    973    974    Any
        //  330    339    924    932    Ljava/io/IOException;
        //  330    339    973    974    Any
        //  341    349    924    932    Ljava/io/IOException;
        //  341    349    973    974    Any
        //  355    359    362    372    Ljava/io/IOException;
        //  376    383    924    932    Ljava/io/IOException;
        //  376    383    973    974    Any
        //  389    398    924    932    Ljava/io/IOException;
        //  389    398    973    974    Any
        //  400    408    924    932    Ljava/io/IOException;
        //  400    408    973    974    Any
        //  414    418    421    431    Ljava/io/IOException;
        //  435    443    924    932    Ljava/io/IOException;
        //  435    443    973    974    Any
        //  449    458    924    932    Ljava/io/IOException;
        //  449    458    973    974    Any
        //  460    479    924    932    Ljava/io/IOException;
        //  460    479    973    974    Any
        //  485    489    492    502    Ljava/io/IOException;
        //  506    513    924    932    Ljava/io/IOException;
        //  506    513    973    974    Any
        //  519    528    924    932    Ljava/io/IOException;
        //  519    528    973    974    Any
        //  530    538    924    932    Ljava/io/IOException;
        //  530    538    973    974    Any
        //  544    548    551    561    Ljava/io/IOException;
        //  565    572    924    932    Ljava/io/IOException;
        //  565    572    973    974    Any
        //  578    587    924    932    Ljava/io/IOException;
        //  578    587    973    974    Any
        //  589    597    924    932    Ljava/io/IOException;
        //  589    597    973    974    Any
        //  603    607    610    620    Ljava/io/IOException;
        //  624    630    924    932    Ljava/io/IOException;
        //  624    630    973    974    Any
        //  632    638    924    932    Ljava/io/IOException;
        //  632    638    973    974    Any
        //  654    658    924    932    Ljava/io/IOException;
        //  654    658    973    974    Any
        //  660    664    924    932    Ljava/io/IOException;
        //  660    664    973    974    Any
        //  673    687    924    932    Ljava/io/IOException;
        //  673    687    973    974    Any
        //  706    710    924    932    Ljava/io/IOException;
        //  706    710    973    974    Any
        //  712    716    924    932    Ljava/io/IOException;
        //  712    716    973    974    Any
        //  718    727    924    932    Ljava/io/IOException;
        //  718    727    973    974    Any
        //  729    738    924    932    Ljava/io/IOException;
        //  729    738    973    974    Any
        //  755    763    924    932    Ljava/io/IOException;
        //  755    763    973    974    Any
        //  768    775    924    932    Ljava/io/IOException;
        //  768    775    973    974    Any
        //  783    788    924    932    Ljava/io/IOException;
        //  783    788    973    974    Any
        //  788    792    795    805    Ljava/io/IOException;
        //  809    814    924    932    Ljava/io/IOException;
        //  809    814    973    974    Any
        //  816    822    924    932    Ljava/io/IOException;
        //  816    822    973    974    Any
        //  840    860    924    932    Ljava/io/IOException;
        //  840    860    973    974    Any
        //  860    864    867    877    Ljava/io/IOException;
        //  881    893    924    932    Ljava/io/IOException;
        //  881    893    973    974    Any
        //  893    897    900    910    Ljava/io/IOException;
        //  941    950    973    974    Any
        //  954    958    961    971    Ljava/io/IOException;
        //  978    982    985    995    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0120:
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
        final int n3 = 0;
        int n4 = 0;
        if (b) {
            final long[] array = (long[])f;
            while (true) {
                final int length = array.length;
                if (n4 >= length) {
                    break;
                }
                sb.append(array[n4]);
                final int n5 = n4 + 1;
                if ((n4 = n5) == length) {
                    continue;
                }
                sb.append(",");
                n4 = n5;
            }
            return sb.toString();
        }
        if (f instanceof int[]) {
            final int[] array2 = (int[])f;
            int n6 = n;
            while (true) {
                final int length2 = array2.length;
                if (n6 >= length2) {
                    break;
                }
                sb.append(array2[n6]);
                final int n7 = n6 + 1;
                if ((n6 = n7) == length2) {
                    continue;
                }
                sb.append(",");
                n6 = n7;
            }
            return sb.toString();
        }
        if (f instanceof double[]) {
            final double[] array3 = (double[])f;
            int n8 = n2;
            while (true) {
                final int length3 = array3.length;
                if (n8 >= length3) {
                    break;
                }
                sb.append(array3[n8]);
                final int n9 = n8 + 1;
                if ((n8 = n9) == length3) {
                    continue;
                }
                sb.append(",");
                n8 = n9;
            }
            return sb.toString();
        }
        if (f instanceof asz[]) {
            final asz[] array4 = (asz[])f;
            int n10 = n3;
            while (true) {
                final int length4 = array4.length;
                if (n10 >= length4) {
                    break;
                }
                sb.append(array4[n10].a);
                sb.append('/');
                sb.append(array4[n10].b);
                final int n11 = n10 + 1;
                if ((n10 = n11) == length4) {
                    continue;
                }
                sb.append(",");
                n10 = n11;
            }
            return sb.toString();
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(ata.d[this.a]);
        sb.append(", data length:");
        sb.append(this.d.length);
        sb.append(")");
        return sb.toString();
    }
}
