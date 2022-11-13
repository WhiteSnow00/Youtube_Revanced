import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argr extends arfz
{
    private static final aric f;
    arge[] d;
    dqs e;
    
    static {
        f = aric.d((Class)argr.class);
    }
    
    public argr(final arge... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: istore          5
        //     4: ldc             ""
        //     6: astore          9
        //     8: iconst_0       
        //     9: istore          4
        //    11: iload           4
        //    13: iload           5
        //    15: if_icmpge       91
        //    18: aload_1        
        //    19: iload           4
        //    21: aaload         
        //    22: invokeinterface arge.c:()Ljava/lang/String;
        //    27: astore          10
        //    29: new             Ljava/lang/StringBuilder;
        //    32: dup            
        //    33: aload           9
        //    35: invokevirtual   java/lang/String.length:()I
        //    38: iconst_3       
        //    39: iadd           
        //    40: aload           10
        //    42: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    45: invokevirtual   java/lang/String.length:()I
        //    48: iadd           
        //    49: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    52: astore          11
        //    54: aload           11
        //    56: aload           9
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: pop            
        //    62: aload           11
        //    64: aload           10
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: pop            
        //    70: aload           11
        //    72: ldc             " + "
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: pop            
        //    78: aload           11
        //    80: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    83: astore          9
        //    85: iinc            4, 1
        //    88: goto            11
        //    91: aload_0        
        //    92: aload           9
        //    94: iconst_0       
        //    95: aload           9
        //    97: invokevirtual   java/lang/String.length:()I
        //   100: iconst_3       
        //   101: isub           
        //   102: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   105: invokespecial   arfz.<init>:(Ljava/lang/String;)V
        //   108: aload_0        
        //   109: aload_1        
        //   110: putfield        argr.d:[Large;
        //   113: aload_1        
        //   114: arraylength    
        //   115: istore          5
        //   117: iconst_0       
        //   118: istore          4
        //   120: iload           4
        //   122: iload           5
        //   124: if_icmpge       1599
        //   127: aload_1        
        //   128: iload           4
        //   130: aaload         
        //   131: astore          9
        //   133: aload_0        
        //   134: getfield        argr.e:Ldqs;
        //   137: astore          10
        //   139: aload           10
        //   141: ifnonnull       188
        //   144: new             Ldqs;
        //   147: dup            
        //   148: invokespecial   dqs.<init>:()V
        //   151: astore          10
        //   153: aload_0        
        //   154: aload           10
        //   156: putfield        argr.e:Ldqs;
        //   159: aload           10
        //   161: aload           9
        //   163: invokeinterface arge.i:()Ldqs;
        //   168: ldc             Ldsa;.class
        //   170: invokevirtual   arfw.j:(Ljava/lang/Class;)Ljava/util/List;
        //   173: iconst_0       
        //   174: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   179: checkcast       Ldpv;
        //   182: invokevirtual   arfw.w:(Ldpv;)V
        //   185: goto            1593
        //   188: aload           9
        //   190: invokeinterface arge.i:()Ldqs;
        //   195: astore          12
        //   197: new             Ljava/io/ByteArrayOutputStream;
        //   200: dup            
        //   201: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   204: astore          9
        //   206: new             Ljava/io/ByteArrayOutputStream;
        //   209: dup            
        //   210: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   213: astore          11
        //   215: aload           10
        //   217: aload           9
        //   219: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   222: invokevirtual   arft.e:(Ljava/nio/channels/WritableByteChannel;)V
        //   225: aload           12
        //   227: aload           11
        //   229: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   232: invokevirtual   arft.e:(Ljava/nio/channels/WritableByteChannel;)V
        //   235: aload           9
        //   237: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   240: astore          13
        //   242: aload           10
        //   244: astore          9
        //   246: aload           11
        //   248: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   251: aload           13
        //   253: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   256: ifne            1587
        //   259: aload           10
        //   261: ldc             Ldsa;.class
        //   263: invokevirtual   arfw.j:(Ljava/lang/Class;)Ljava/util/List;
        //   266: iconst_0       
        //   267: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   272: checkcast       Ldsa;
        //   275: astore          11
        //   277: aload           12
        //   279: ldc             Ldsa;.class
        //   281: invokevirtual   arfw.j:(Ljava/lang/Class;)Ljava/util/List;
        //   284: iconst_0       
        //   285: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   290: checkcast       Ldsa;
        //   293: astore          9
        //   295: aload           11
        //   297: invokeinterface dsa.d:()Ljava/lang/String;
        //   302: aload           9
        //   304: invokeinterface dsa.d:()Ljava/lang/String;
        //   309: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   312: ifne            321
        //   315: aconst_null    
        //   316: astore          9
        //   318: goto            1419
        //   321: aload           11
        //   323: instanceof      Ldsf;
        //   326: ifeq            836
        //   329: aload           9
        //   331: instanceof      Ldsf;
        //   334: ifeq            836
        //   337: aload           11
        //   339: checkcast       Ldsf;
        //   342: astore          13
        //   344: aload           9
        //   346: checkcast       Ldsf;
        //   349: astore          14
        //   351: new             Ldsf;
        //   354: dup            
        //   355: invokespecial   dsf.<init>:()V
        //   358: astore          11
        //   360: aload           13
        //   362: getfield        dsf.d:D
        //   365: dstore_2       
        //   366: dload_2        
        //   367: aload           14
        //   369: getfield        dsf.d:D
        //   372: dcmpl          
        //   373: ifne            825
        //   376: aload           11
        //   378: dload_2        
        //   379: putfield        dsf.d:D
        //   382: aload           11
        //   384: aload           13
        //   386: getfield        dsf.g:Ljava/lang/String;
        //   389: putfield        dsf.g:Ljava/lang/String;
        //   392: aload           13
        //   394: getfield        dsf.h:I
        //   397: istore          6
        //   399: iload           6
        //   401: aload           14
        //   403: getfield        dsf.h:I
        //   406: if_icmpne       814
        //   409: aload           11
        //   411: iload           6
        //   413: putfield        dsf.h:I
        //   416: aload           13
        //   418: getfield        dsf.f:I
        //   421: istore          6
        //   423: iload           6
        //   425: aload           14
        //   427: getfield        dsf.f:I
        //   430: if_icmpne       803
        //   433: aload           11
        //   435: iload           6
        //   437: putfield        dsf.f:I
        //   440: aload           13
        //   442: getfield        dsf.c:I
        //   445: istore          6
        //   447: iload           6
        //   449: aload           14
        //   451: getfield        dsf.c:I
        //   454: if_icmpne       792
        //   457: aload           11
        //   459: iload           6
        //   461: putfield        dsf.c:I
        //   464: aload           13
        //   466: getfield        dsf.b:I
        //   469: istore          6
        //   471: iload           6
        //   473: aload           14
        //   475: getfield        dsf.b:I
        //   478: if_icmpne       781
        //   481: aload           11
        //   483: iload           6
        //   485: putfield        dsf.b:I
        //   488: aload           13
        //   490: getfield        dsf.e:D
        //   493: dstore_2       
        //   494: dload_2        
        //   495: aload           14
        //   497: getfield        dsf.e:D
        //   500: dcmpl          
        //   501: ifne            770
        //   504: aload           11
        //   506: dload_2        
        //   507: putfield        dsf.e:D
        //   510: aload           13
        //   512: getfield        dsf.d:D
        //   515: dstore_2       
        //   516: dload_2        
        //   517: aload           14
        //   519: getfield        dsf.d:D
        //   522: dcmpl          
        //   523: ifne            759
        //   526: aload           11
        //   528: dload_2        
        //   529: putfield        dsf.d:D
        //   532: aload           11
        //   534: astore          9
        //   536: aload           13
        //   538: invokevirtual   arfw.i:()Ljava/util/List;
        //   541: invokeinterface java/util/List.size:()I
        //   546: aload           14
        //   548: invokevirtual   arfw.i:()Ljava/util/List;
        //   551: invokeinterface java/util/List.size:()I
        //   556: if_icmpne       1419
        //   559: aload           13
        //   561: invokevirtual   arfw.i:()Ljava/util/List;
        //   564: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   569: astore          13
        //   571: aload           14
        //   573: invokevirtual   arfw.i:()Ljava/util/List;
        //   576: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   581: astore          14
        //   583: aload           11
        //   585: astore          9
        //   587: aload           13
        //   589: invokeinterface java/util/Iterator.hasNext:()Z
        //   594: ifeq            1419
        //   597: aload           13
        //   599: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   604: checkcast       Ldpv;
        //   607: astore          9
        //   609: aload           14
        //   611: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   616: checkcast       Ldpv;
        //   619: astore          15
        //   621: new             Ljava/io/ByteArrayOutputStream;
        //   624: dup            
        //   625: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   628: astore          16
        //   630: new             Ljava/io/ByteArrayOutputStream;
        //   633: dup            
        //   634: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   637: astore          17
        //   639: aload           9
        //   641: aload           16
        //   643: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   646: invokeinterface dpv.e:(Ljava/nio/channels/WritableByteChannel;)V
        //   651: aload           15
        //   653: aload           17
        //   655: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   658: invokeinterface dpv.e:(Ljava/nio/channels/WritableByteChannel;)V
        //   663: aload           16
        //   665: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   668: aload           17
        //   670: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   673: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   676: ifeq            689
        //   679: aload           11
        //   681: aload           9
        //   683: invokevirtual   arfw.w:(Ldpv;)V
        //   686: goto            583
        //   689: aload           9
        //   691: instanceof      Largw;
        //   694: ifeq            583
        //   697: aload           15
        //   699: instanceof      Largw;
        //   702: ifeq            583
        //   705: aload           9
        //   707: checkcast       Largw;
        //   710: astore          16
        //   712: aload           16
        //   714: aload           16
        //   716: getfield        argw.a:Largz;
        //   719: aload           15
        //   721: checkcast       Largw;
        //   724: getfield        argw.a:Largz;
        //   727: invokestatic    argr.n:(Largz;Largz;)Larhe;
        //   730: putfield        argw.a:Largz;
        //   733: aload           11
        //   735: aload           9
        //   737: invokevirtual   arfw.w:(Ldpv;)V
        //   740: goto            583
        //   743: astore          9
        //   745: getstatic       argr.f:Laric;
        //   748: aload           9
        //   750: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   753: invokevirtual   aric.c:(Ljava/lang/String;)V
        //   756: goto            315
        //   759: getstatic       argr.f:Laric;
        //   762: ldc             "horizontal resolution differs"
        //   764: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   767: goto            315
        //   770: getstatic       argr.f:Laric;
        //   773: ldc             "vert resolution differs"
        //   775: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   778: goto            315
        //   781: getstatic       argr.f:Laric;
        //   784: ldc             "width differs"
        //   786: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   789: goto            315
        //   792: getstatic       argr.f:Laric;
        //   795: ldc             "height differs"
        //   797: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   800: goto            315
        //   803: getstatic       argr.f:Laric;
        //   806: ldc             "frame count differs"
        //   808: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   811: goto            315
        //   814: getstatic       argr.f:Laric;
        //   817: ldc             "Depth differs"
        //   819: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   822: goto            315
        //   825: getstatic       argr.f:Laric;
        //   828: ldc             "Horizontal Resolution differs"
        //   830: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   833: goto            315
        //   836: aload           11
        //   838: instanceof      Ldry;
        //   841: ifeq            315
        //   844: aload           9
        //   846: instanceof      Ldry;
        //   849: ifeq            315
        //   852: aload           11
        //   854: checkcast       Ldry;
        //   857: astore          13
        //   859: aload           9
        //   861: checkcast       Ldry;
        //   864: astore          14
        //   866: new             Ldry;
        //   869: dup            
        //   870: aload           14
        //   872: getfield        arft.n:Ljava/lang/String;
        //   875: invokespecial   dry.<init>:(Ljava/lang/String;)V
        //   878: astore          11
        //   880: aload           13
        //   882: getfield        dry.j:J
        //   885: aload           14
        //   887: getfield        dry.j:J
        //   890: lcmp           
        //   891: ifne            315
        //   894: getstatic       argr.f:Laric;
        //   897: astore          9
        //   899: aload           9
        //   901: ldc             "BytesPerFrame differ"
        //   903: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   906: aload           11
        //   908: aload           13
        //   910: getfield        dry.j:J
        //   913: putfield        dry.j:J
        //   916: aload           13
        //   918: getfield        dry.i:J
        //   921: lstore          7
        //   923: lload           7
        //   925: aload           14
        //   927: getfield        dry.i:J
        //   930: lcmp           
        //   931: ifne            315
        //   934: aload           11
        //   936: lload           7
        //   938: putfield        dry.i:J
        //   941: aload           13
        //   943: getfield        dry.k:J
        //   946: aload           14
        //   948: getfield        dry.k:J
        //   951: lcmp           
        //   952: ifne            315
        //   955: aload           9
        //   957: ldc             "BytesPerSample differ"
        //   959: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   962: aload           11
        //   964: aload           13
        //   966: getfield        dry.k:J
        //   969: putfield        dry.k:J
        //   972: aload           13
        //   974: getfield        dry.b:I
        //   977: aload           14
        //   979: getfield        dry.b:I
        //   982: if_icmpne       315
        //   985: aload           9
        //   987: ldc             "ChannelCount differ"
        //   989: invokevirtual   aric.b:(Ljava/lang/String;)V
        //   992: aload           11
        //   994: aload           13
        //   996: getfield        dry.b:I
        //   999: putfield        dry.b:I
        //  1002: aload           13
        //  1004: getfield        dry.g:I
        //  1007: istore          6
        //  1009: iload           6
        //  1011: aload           14
        //  1013: getfield        dry.g:I
        //  1016: if_icmpne       315
        //  1019: aload           11
        //  1021: iload           6
        //  1023: putfield        dry.g:I
        //  1026: aload           13
        //  1028: getfield        dry.f:I
        //  1031: istore          6
        //  1033: iload           6
        //  1035: aload           14
        //  1037: getfield        dry.f:I
        //  1040: if_icmpne       315
        //  1043: aload           11
        //  1045: iload           6
        //  1047: putfield        dry.f:I
        //  1050: aload           13
        //  1052: getfield        dry.d:J
        //  1055: lstore          7
        //  1057: lload           7
        //  1059: aload           14
        //  1061: getfield        dry.d:J
        //  1064: lcmp           
        //  1065: ifne            315
        //  1068: aload           11
        //  1070: lload           7
        //  1072: putfield        dry.d:J
        //  1075: aload           13
        //  1077: getfield        dry.c:I
        //  1080: istore          6
        //  1082: iload           6
        //  1084: aload           14
        //  1086: getfield        dry.c:I
        //  1089: if_icmpne       315
        //  1092: aload           11
        //  1094: iload           6
        //  1096: putfield        dry.c:I
        //  1099: aload           13
        //  1101: getfield        dry.h:J
        //  1104: lstore          7
        //  1106: lload           7
        //  1108: aload           14
        //  1110: getfield        dry.h:J
        //  1113: lcmp           
        //  1114: ifne            315
        //  1117: aload           11
        //  1119: lload           7
        //  1121: putfield        dry.h:J
        //  1124: aload           13
        //  1126: getfield        dry.e:I
        //  1129: istore          6
        //  1131: iload           6
        //  1133: aload           14
        //  1135: getfield        dry.e:I
        //  1138: if_icmpne       315
        //  1141: aload           11
        //  1143: iload           6
        //  1145: putfield        dry.e:I
        //  1148: aload           13
        //  1150: getfield        dry.l:[B
        //  1153: aload           14
        //  1155: getfield        dry.l:[B
        //  1158: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1161: ifeq            315
        //  1164: aload           11
        //  1166: aload           13
        //  1168: getfield        dry.l:[B
        //  1171: putfield        dry.l:[B
        //  1174: aload           11
        //  1176: astore          9
        //  1178: aload           13
        //  1180: invokevirtual   arfw.i:()Ljava/util/List;
        //  1183: invokeinterface java/util/List.size:()I
        //  1188: aload           14
        //  1190: invokevirtual   arfw.i:()Ljava/util/List;
        //  1193: invokeinterface java/util/List.size:()I
        //  1198: if_icmpne       1419
        //  1201: aload           13
        //  1203: invokevirtual   arfw.i:()Ljava/util/List;
        //  1206: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1211: astore          13
        //  1213: aload           14
        //  1215: invokevirtual   arfw.i:()Ljava/util/List;
        //  1218: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1223: astore          14
        //  1225: aload           11
        //  1227: astore          9
        //  1229: aload           13
        //  1231: invokeinterface java/util/Iterator.hasNext:()Z
        //  1236: ifeq            1419
        //  1239: aload           13
        //  1241: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1246: checkcast       Ldpv;
        //  1249: astore          9
        //  1251: aload           14
        //  1253: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1258: checkcast       Ldpv;
        //  1261: astore          15
        //  1263: new             Ljava/io/ByteArrayOutputStream;
        //  1266: dup            
        //  1267: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //  1270: astore          17
        //  1272: new             Ljava/io/ByteArrayOutputStream;
        //  1275: dup            
        //  1276: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //  1279: astore          16
        //  1281: aload           9
        //  1283: aload           17
        //  1285: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //  1288: invokeinterface dpv.e:(Ljava/nio/channels/WritableByteChannel;)V
        //  1293: aload           15
        //  1295: aload           16
        //  1297: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //  1300: invokeinterface dpv.e:(Ljava/nio/channels/WritableByteChannel;)V
        //  1305: aload           17
        //  1307: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //  1310: aload           16
        //  1312: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //  1315: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1318: ifeq            1331
        //  1321: aload           11
        //  1323: aload           9
        //  1325: invokevirtual   arfw.w:(Ldpv;)V
        //  1328: goto            1225
        //  1331: ldc             "esds"
        //  1333: aload           9
        //  1335: invokeinterface dpv.d:()Ljava/lang/String;
        //  1340: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1343: ifeq            1225
        //  1346: ldc             "esds"
        //  1348: aload           15
        //  1350: invokeinterface dpv.d:()Ljava/lang/String;
        //  1355: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1358: ifeq            1225
        //  1361: aload           9
        //  1363: checkcast       Largx;
        //  1366: astore          16
        //  1368: aload           15
        //  1370: checkcast       Largx;
        //  1373: astore          15
        //  1375: aload           16
        //  1377: aload           16
        //  1379: invokevirtual   argx.k:()Larhe;
        //  1382: aload           15
        //  1384: invokevirtual   argx.k:()Larhe;
        //  1387: invokestatic    argr.n:(Largz;Largz;)Larhe;
        //  1390: putfield        argw.a:Largz;
        //  1393: aload           11
        //  1395: aload           9
        //  1397: invokevirtual   arfw.w:(Ldpv;)V
        //  1400: goto            1225
        //  1403: astore          9
        //  1405: getstatic       argr.f:Laric;
        //  1408: aload           9
        //  1410: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1413: invokevirtual   aric.c:(Ljava/lang/String;)V
        //  1416: goto            315
        //  1419: aload           9
        //  1421: ifnull          1462
        //  1424: aload           10
        //  1426: new             Ljava/util/ArrayList;
        //  1429: dup            
        //  1430: aload           9
        //  1432: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  1435: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  1438: putfield        arfw.w:Ljava/util/List;
        //  1441: aload           10
        //  1443: getstatic       arfw.p:Ldpv;
        //  1446: putfield        arfw.s:Ldpv;
        //  1449: aload           10
        //  1451: aconst_null    
        //  1452: putfield        arfw.r:Larfx;
        //  1455: aload           10
        //  1457: astore          9
        //  1459: goto            1587
        //  1462: aload           10
        //  1464: ldc             Ldsa;.class
        //  1466: invokevirtual   arfw.j:(Ljava/lang/Class;)Ljava/util/List;
        //  1469: iconst_0       
        //  1470: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1475: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1478: astore_1       
        //  1479: aload           12
        //  1481: ldc             Ldsa;.class
        //  1483: invokevirtual   arfw.j:(Ljava/lang/Class;)Ljava/util/List;
        //  1486: iconst_0       
        //  1487: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1492: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1495: astore          9
        //  1497: new             Ljava/lang/StringBuilder;
        //  1500: dup            
        //  1501: aload_1        
        //  1502: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1505: invokevirtual   java/lang/String.length:()I
        //  1508: bipush          18
        //  1510: iadd           
        //  1511: aload           9
        //  1513: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1516: invokevirtual   java/lang/String.length:()I
        //  1519: iadd           
        //  1520: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1523: astore          10
        //  1525: aload           10
        //  1527: ldc_w           "Cannot merge "
        //  1530: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1533: pop            
        //  1534: aload           10
        //  1536: aload_1        
        //  1537: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1540: pop            
        //  1541: aload           10
        //  1543: ldc_w           " and "
        //  1546: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1549: pop            
        //  1550: aload           10
        //  1552: aload           9
        //  1554: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1557: pop            
        //  1558: new             Ljava/io/IOException;
        //  1561: dup            
        //  1562: aload           10
        //  1564: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1567: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1570: athrow         
        //  1571: astore          9
        //  1573: getstatic       argr.f:Laric;
        //  1576: aload           9
        //  1578: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1581: invokevirtual   aric.b:(Ljava/lang/String;)V
        //  1584: aconst_null    
        //  1585: astore          9
        //  1587: aload_0        
        //  1588: aload           9
        //  1590: putfield        argr.e:Ldqs;
        //  1593: iinc            4, 1
        //  1596: goto            120
        //  1599: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  215    235    1571   1587   Ljava/io/IOException;
        //  639    663    743    759    Ljava/io/IOException;
        //  1281   1305   1403   1419   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    private static final arhe n(final argz argz, final argz argz2) {
        if (argz instanceof arhe && argz2 instanceof arhe) {
            final arhe arhe = (arhe)argz;
            final arhe arhe2 = (arhe)argz2;
            if (arhe.c == arhe2.c) {
                final int f = arhe.f;
                final int f2 = arhe2.f;
                if (arhe.h == arhe2.h && arhe.a == arhe2.a && arhe.i == arhe2.i && arhe.d == arhe2.d && arhe.b == arhe2.b) {
                    final int e = arhe.e;
                    final int e2 = arhe2.e;
                    final String g = arhe.g;
                    if (g != null) {
                        g.equals(arhe2.g);
                    }
                    else {
                        final String g2 = arhe2.g;
                    }
                    final arhb j = arhe.j;
                    Label_0398: {
                        if (j != null) {
                            if (j.equals(arhe2.j)) {
                                break Label_0398;
                            }
                        }
                        else if (arhe2.j == null) {
                            break Label_0398;
                        }
                        final arhb i = arhe.j;
                        final arhb k = arhe2.j;
                        final argy h = i.h;
                        if (h != null) {
                            final argy h2 = k.h;
                            if (h2 != null) {
                                if (!h.equals(h2)) {
                                    return null;
                                }
                            }
                        }
                        final long f3 = i.f;
                        final long f4 = k.f;
                        if (f3 != f4) {
                            i.f = (f3 + f4) / 2L;
                        }
                        final int d = i.d;
                        final int d2 = k.d;
                        final arhc g3 = i.g;
                        Label_0307: {
                            if (g3 != null) {
                                if (g3.equals(k.g)) {
                                    break Label_0307;
                                }
                            }
                            else if (k.g == null) {
                                break Label_0307;
                            }
                            return null;
                        }
                        final long e3 = i.e;
                        final long e4 = k.e;
                        if (e3 != e4) {
                            i.e = Math.max(e3, e4);
                        }
                        if (!i.i.equals(k.i) || i.a != k.a || i.b != k.b || i.c != k.c) {
                            return null;
                        }
                    }
                    if (arhe.l.equals(arhe2.l)) {
                        final arhk l = arhe.k;
                        if (l != null) {
                            if (l.equals(arhe2.k)) {
                                return arhe;
                            }
                        }
                        else if (arhe2.k == null) {
                            return arhe;
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        argr.f.b("I can only merge ESDescriptors");
        return null;
    }
    
    @Override
    public final drb b() {
        return this.d[0].b();
    }
    
    public final void close() {
        final arge[] d = this.d;
        for (int length = d.length, i = 0; i < length; ++i) {
            d[i].close();
        }
    }
    
    @Override
    public final List d() {
        if (this.d[0].d() != null && !this.d[0].d().isEmpty()) {
            final LinkedList list = new LinkedList();
            final arge[] d = this.d;
            for (int length = d.length, i = 0; i < length; ++i) {
                final List d2 = d[i].d();
                final Iterator iterator = d2.iterator();
                long n = 0L;
                while (iterator.hasNext()) {
                    n += ((dpy)iterator.next()).a;
                }
                final int[] array = new int[(int)n];
                final Iterator iterator2 = d2.iterator();
                int n2 = 0;
                while (iterator2.hasNext()) {
                    final dpy dpy = (dpy)iterator2.next();
                    int n3 = 0;
                    int n4 = n2;
                    while (true) {
                        n2 = n4;
                        if (n3 >= dpy.a) {
                            break;
                        }
                        array[n4] = dpy.b;
                        ++n3;
                        ++n4;
                    }
                }
                list.add(array);
            }
            final LinkedList<dpy> list2 = new LinkedList<dpy>();
            for (final int[] array2 : list) {
                for (final int n5 : array2) {
                    if (!list2.isEmpty() && list2.getLast().b == n5) {
                        final dpy dpy2 = list2.getLast();
                        ++dpy2.a;
                    }
                    else {
                        list2.add(new dpy(1, n5));
                    }
                }
            }
            return list2;
        }
        return null;
    }
    
    @Override
    public final List f() {
        final arge[] d = this.d;
        int i = 0;
        if (d[0].f() != null && !this.d[0].f().isEmpty()) {
            final LinkedList list = new LinkedList();
            for (arge[] d2 = this.d; i < d2.length; ++i) {
                list.addAll(d2[i].f());
            }
            return list;
        }
        return null;
    }
    
    @Override
    public final long[] h() {
        if (this.d[0].h() != null && this.d[0].h().length > 0) {
            final arge[] d = this.d;
            final int length = d.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                n += d[i].h().length;
                ++i;
            }
            final long[] array = new long[n];
            final arge[] d2 = this.d;
            final int length2 = d2.length;
            long n2 = 0L;
            int j = 0;
            int n3 = 0;
            while (j < length2) {
                final arge arge = d2[j];
                final long[] h = arge.h();
                for (int length3 = h.length, k = 0; k < length3; ++k, ++n3) {
                    array[n3] = h[k] + n2;
                }
                n2 += arge.l().size();
                ++j;
            }
            return array;
        }
        return null;
    }
    
    public final dqs i() {
        return this.e;
    }
    
    public final argf j() {
        return this.d[0].j();
    }
    
    public final String k() {
        return this.d[0].k();
    }
    
    public final List l() {
        final ArrayList list = new ArrayList();
        final arge[] d = this.d;
        for (int length = d.length, i = 0; i < length; ++i) {
            list.addAll(d[i].l());
        }
        return list;
    }
    
    public final long[] m() {
        monitorenter(this);
        try {
            final arge[] d = this.d;
            final int length = d.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                n += d[i].m().length;
                ++i;
            }
            final long[] array = new long[n];
            final arge[] d2 = this.d;
            final int length2 = d2.length;
            int j = 0;
            int n2 = 0;
            while (j < length2) {
                final long[] m = d2[j].m();
                for (int length3 = m.length, k = 0; k < length3; ++k, ++n2) {
                    array[n2] = m[k];
                }
                ++j;
            }
            monitorexit(this);
            return array;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
