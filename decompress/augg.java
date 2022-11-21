import org.webrtc.VideoFrame$I420Buffer;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import org.chromium.net.impl.CronetUrlRequestContext;
import org.chromium.net.impl.CronetUrlRequest;
import java.util.concurrent.CountDownLatch;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augg implements Runnable
{
    final Object a;
    private final int b;
    
    public augg(final ashw a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final augw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final augx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final auns a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final auns a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final auns a, final int b, final char[] array) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final auot a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final ByteBuffer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final CountDownLatch a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final CronetUrlRequest a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final CronetUrlRequestContext a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final VersionSafeCallbacks$UrlRequestStatusListener a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public augg(final VideoFrame$I420Buffer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        augg.b:I
        //     4: tableswitch {
        //                0: 2428
        //                1: 2416
        //                2: 2290
        //                3: 2220
        //                4: 2138
        //                5: 2089
        //                6: 2016
        //                7: 1970
        //                8: 1934
        //                9: 1903
        //               10: 1855
        //               11: 1605
        //               12: 683
        //               13: 250
        //               14: 212
        //               15: 202
        //               16: 191
        //               17: 180
        //               18: 151
        //               19: 129
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: getfield        augg.a:Ljava/lang/Object;
        //   104: checkcast       Lauot;
        //   107: astore          16
        //   109: aload           16
        //   111: iconst_0       
        //   112: putfield        auot.e:Z
        //   115: aload           16
        //   117: getfield        auot.f:Z
        //   120: ifeq            2547
        //   123: aload           16
        //   125: invokevirtual   auot.a:()V
        //   128: return         
        //   129: aload_0        
        //   130: getfield        augg.a:Ljava/lang/Object;
        //   133: checkcast       Lauot;
        //   136: astore          16
        //   138: aload           16
        //   140: aconst_null    
        //   141: putfield        auot.c:Lorg/webrtc/VideoSink;
        //   144: aload           16
        //   146: aconst_null    
        //   147: putfield        auot.j:Lorg/webrtc/VideoSink;
        //   150: return         
        //   151: aload_0        
        //   152: getfield        augg.a:Ljava/lang/Object;
        //   155: checkcast       Lauot;
        //   158: astore          16
        //   160: aload           16
        //   162: iconst_1       
        //   163: putfield        auot.f:Z
        //   166: aload           16
        //   168: getfield        auot.e:Z
        //   171: ifne            179
        //   174: aload           16
        //   176: invokevirtual   auot.a:()V
        //   179: return         
        //   180: aload_0        
        //   181: getfield        augg.a:Ljava/lang/Object;
        //   184: checkcast       Ljava/util/concurrent/CountDownLatch;
        //   187: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   190: return         
        //   191: aload_0        
        //   192: getfield        augg.a:Ljava/lang/Object;
        //   195: checkcast       Ljava/nio/ByteBuffer;
        //   198: invokestatic    org/webrtc/JniCommon.nativeFreeByteBuffer:(Ljava/nio/ByteBuffer;)V
        //   201: return         
        //   202: aload_0        
        //   203: getfield        augg.a:Ljava/lang/Object;
        //   206: invokeinterface org/webrtc/VideoFrame$Buffer.release:()V
        //   211: return         
        //   212: aload_0        
        //   213: getfield        augg.a:Ljava/lang/Object;
        //   216: checkcast       Launs;
        //   219: getfield        auns.b:Ljava/lang/Object;
        //   222: astore          17
        //   224: aload           17
        //   226: monitorenter   
        //   227: aload_0        
        //   228: getfield        augg.a:Ljava/lang/Object;
        //   231: checkcast       Launs;
        //   234: aconst_null    
        //   235: putfield        auns.c:Landroid/os/Handler;
        //   238: aload           17
        //   240: monitorexit    
        //   241: return         
        //   242: astore          16
        //   244: aload           17
        //   246: monitorexit    
        //   247: aload           16
        //   249: athrow         
        //   250: aload_0        
        //   251: getfield        augg.a:Ljava/lang/Object;
        //   254: astore          17
        //   256: new             Ljava/text/DecimalFormat;
        //   259: dup            
        //   260: ldc             "#.0"
        //   262: invokespecial   java/text/DecimalFormat.<init>:(Ljava/lang/String;)V
        //   265: astore          18
        //   267: invokestatic    java/lang/System.nanoTime:()J
        //   270: lstore          8
        //   272: aload           17
        //   274: checkcast       Launs;
        //   277: getfield        auns.o:Ljava/lang/Object;
        //   280: astore          16
        //   282: aload           16
        //   284: monitorenter   
        //   285: lload           8
        //   287: aload           17
        //   289: checkcast       Launs;
        //   292: getfield        auns.s:J
        //   295: lsub           
        //   296: lstore          10
        //   298: lload           10
        //   300: lconst_0       
        //   301: lcmp           
        //   302: ifle            576
        //   305: aload           17
        //   307: checkcast       Launs;
        //   310: getfield        auns.r:I
        //   313: i2l            
        //   314: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   317: lconst_1       
        //   318: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //   321: lmul           
        //   322: l2f            
        //   323: lload           10
        //   325: l2f            
        //   326: fdiv           
        //   327: fstore_1       
        //   328: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //   331: lload           10
        //   333: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   336: lstore          10
        //   338: aload           17
        //   340: checkcast       Launs;
        //   343: getfield        auns.p:I
        //   346: istore          5
        //   348: aload           17
        //   350: checkcast       Launs;
        //   353: getfield        auns.q:I
        //   356: istore          4
        //   358: aload           17
        //   360: checkcast       Launs;
        //   363: getfield        auns.r:I
        //   366: istore          6
        //   368: aload           18
        //   370: fload_1        
        //   371: f2d            
        //   372: invokevirtual   java/text/DecimalFormat.format:(D)Ljava/lang/String;
        //   375: astore          19
        //   377: aload           17
        //   379: checkcast       Launs;
        //   382: getfield        auns.t:J
        //   385: aload           17
        //   387: checkcast       Launs;
        //   390: getfield        auns.r:I
        //   393: invokestatic    auns.c:(JI)Ljava/lang/String;
        //   396: astore          20
        //   398: aload           17
        //   400: checkcast       Launs;
        //   403: getfield        auns.u:J
        //   406: aload           17
        //   408: checkcast       Launs;
        //   411: getfield        auns.r:I
        //   414: invokestatic    auns.c:(JI)Ljava/lang/String;
        //   417: astore          21
        //   419: new             Ljava/lang/StringBuilder;
        //   422: astore          18
        //   424: aload           18
        //   426: ldc             "Duration: "
        //   428: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   431: aload           18
        //   433: lload           10
        //   435: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   438: pop            
        //   439: aload           18
        //   441: ldc             " ms. Frames received: "
        //   443: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   446: pop            
        //   447: aload           18
        //   449: iload           5
        //   451: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   454: pop            
        //   455: aload           18
        //   457: ldc             ". Dropped: "
        //   459: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   462: pop            
        //   463: aload           18
        //   465: iload           4
        //   467: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   470: pop            
        //   471: aload           18
        //   473: ldc             ". Rendered: "
        //   475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   478: pop            
        //   479: aload           18
        //   481: iload           6
        //   483: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   486: pop            
        //   487: aload           18
        //   489: ldc             ". Render fps: "
        //   491: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   494: pop            
        //   495: aload           18
        //   497: aload           19
        //   499: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   502: pop            
        //   503: aload           18
        //   505: ldc             ". Average render time: "
        //   507: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   510: pop            
        //   511: aload           18
        //   513: aload           20
        //   515: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   518: pop            
        //   519: aload           18
        //   521: ldc             ". Average swapBuffer time: "
        //   523: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   526: pop            
        //   527: aload           18
        //   529: aload           21
        //   531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   534: pop            
        //   535: aload           18
        //   537: ldc             "."
        //   539: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   542: pop            
        //   543: aload           18
        //   545: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   548: astore          18
        //   550: aload           17
        //   552: checkcast       Launs;
        //   555: aload           18
        //   557: invokevirtual   auns.b:(Ljava/lang/String;)V
        //   560: aload           17
        //   562: checkcast       Launs;
        //   565: lload           8
        //   567: invokevirtual   auns.a:(J)V
        //   570: aload           16
        //   572: monitorexit    
        //   573: goto            579
        //   576: aload           16
        //   578: monitorexit    
        //   579: aload_0        
        //   580: getfield        augg.a:Ljava/lang/Object;
        //   583: checkcast       Launs;
        //   586: getfield        auns.b:Ljava/lang/Object;
        //   589: astore          16
        //   591: aload           16
        //   593: monitorenter   
        //   594: aload_0        
        //   595: getfield        augg.a:Ljava/lang/Object;
        //   598: astore          18
        //   600: aload           18
        //   602: checkcast       Launs;
        //   605: getfield        auns.c:Landroid/os/Handler;
        //   608: astore          17
        //   610: aload           17
        //   612: ifnull          663
        //   615: aload           17
        //   617: aload           18
        //   619: checkcast       Launs;
        //   622: getfield        auns.w:Ljava/lang/Runnable;
        //   625: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   628: aload_0        
        //   629: getfield        augg.a:Ljava/lang/Object;
        //   632: astore          17
        //   634: aload           17
        //   636: checkcast       Launs;
        //   639: getfield        auns.c:Landroid/os/Handler;
        //   642: aload           17
        //   644: checkcast       Launs;
        //   647: getfield        auns.w:Ljava/lang/Runnable;
        //   650: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   653: ldc2_w          4
        //   656: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   659: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   662: pop            
        //   663: aload           16
        //   665: monitorexit    
        //   666: return         
        //   667: astore          17
        //   669: aload           16
        //   671: monitorexit    
        //   672: aload           17
        //   674: athrow         
        //   675: astore          17
        //   677: aload           16
        //   679: monitorexit    
        //   680: aload           17
        //   682: athrow         
        //   683: aload_0        
        //   684: getfield        augg.a:Ljava/lang/Object;
        //   687: astore          17
        //   689: aload           17
        //   691: checkcast       Launs;
        //   694: astore          18
        //   696: aload           18
        //   698: getfield        auns.k:Ljava/lang/Object;
        //   701: astore          19
        //   703: aload           19
        //   705: monitorenter   
        //   706: aload           17
        //   708: checkcast       Launs;
        //   711: getfield        auns.l:Lorg/webrtc/VideoFrame;
        //   714: astore          16
        //   716: aload           16
        //   718: ifnonnull       725
        //   721: aload           19
        //   723: monitorexit    
        //   724: return         
        //   725: aload           17
        //   727: checkcast       Launs;
        //   730: aconst_null    
        //   731: putfield        auns.l:Lorg/webrtc/VideoFrame;
        //   734: aload           19
        //   736: monitorexit    
        //   737: aload           18
        //   739: getfield        auns.g:Launn;
        //   742: astore          19
        //   744: aload           19
        //   746: ifnull          1583
        //   749: aload           19
        //   751: invokeinterface aunn.k:()Z
        //   756: ifne            762
        //   759: goto            1583
        //   762: aload           18
        //   764: getfield        auns.f:Ljava/lang/Object;
        //   767: astore          19
        //   769: aload           19
        //   771: monitorenter   
        //   772: aload           19
        //   774: monitorexit    
        //   775: invokestatic    java/lang/System.nanoTime:()J
        //   778: lstore          12
        //   780: aload           16
        //   782: invokevirtual   org/webrtc/VideoFrame.b:()I
        //   785: i2f            
        //   786: fstore_3       
        //   787: aload           16
        //   789: invokevirtual   org/webrtc/VideoFrame.a:()I
        //   792: i2f            
        //   793: fstore_2       
        //   794: aload           18
        //   796: getfield        auns.m:Ljava/lang/Object;
        //   799: astore          19
        //   801: aload           19
        //   803: monitorenter   
        //   804: aload           17
        //   806: checkcast       Launs;
        //   809: getfield        auns.n:F
        //   812: fstore_1       
        //   813: fload_3        
        //   814: fload_2        
        //   815: fdiv           
        //   816: fstore_2       
        //   817: fload_1        
        //   818: fconst_0       
        //   819: fcmpl          
        //   820: ifeq            826
        //   823: goto            828
        //   826: fload_2        
        //   827: fstore_1       
        //   828: aload           19
        //   830: monitorexit    
        //   831: fload_2        
        //   832: fload_1        
        //   833: fcmpl          
        //   834: ifle            846
        //   837: fload_1        
        //   838: fload_2        
        //   839: fdiv           
        //   840: fstore_1       
        //   841: fconst_1       
        //   842: fstore_2       
        //   843: goto            852
        //   846: fload_2        
        //   847: fload_1        
        //   848: fdiv           
        //   849: fstore_2       
        //   850: fconst_1       
        //   851: fstore_1       
        //   852: aload           18
        //   854: getfield        auns.j:Landroid/graphics/Matrix;
        //   857: invokevirtual   android/graphics/Matrix.reset:()V
        //   860: aload           18
        //   862: getfield        auns.j:Landroid/graphics/Matrix;
        //   865: ldc             0.5
        //   867: ldc             0.5
        //   869: invokevirtual   android/graphics/Matrix.preTranslate:(FF)Z
        //   872: pop            
        //   873: aload           18
        //   875: getfield        auns.j:Landroid/graphics/Matrix;
        //   878: fconst_1       
        //   879: fconst_1       
        //   880: invokevirtual   android/graphics/Matrix.preScale:(FF)Z
        //   883: pop            
        //   884: aload           18
        //   886: getfield        auns.j:Landroid/graphics/Matrix;
        //   889: fload_1        
        //   890: fload_2        
        //   891: invokevirtual   android/graphics/Matrix.preScale:(FF)Z
        //   894: pop            
        //   895: aload           18
        //   897: getfield        auns.j:Landroid/graphics/Matrix;
        //   900: ldc             -0.5
        //   902: ldc             -0.5
        //   904: invokevirtual   android/graphics/Matrix.preTranslate:(FF)Z
        //   907: pop            
        //   908: fconst_0       
        //   909: fconst_0       
        //   910: fconst_0       
        //   911: fconst_0       
        //   912: invokestatic    android/opengl/GLES20.glClearColor:(FFFF)V
        //   915: sipush          16384
        //   918: invokestatic    android/opengl/GLES20.glClear:(I)V
        //   921: aload           17
        //   923: checkcast       Launs;
        //   926: getfield        auns.h:Laupe;
        //   929: aload           16
        //   931: aload           17
        //   933: checkcast       Launs;
        //   936: getfield        auns.i:Lauom;
        //   939: aload           17
        //   941: checkcast       Launs;
        //   944: getfield        auns.j:Landroid/graphics/Matrix;
        //   947: aload           17
        //   949: checkcast       Launs;
        //   952: getfield        auns.g:Launn;
        //   955: invokeinterface aunn.b:()I
        //   960: aload           17
        //   962: checkcast       Launs;
        //   965: getfield        auns.g:Launn;
        //   968: invokeinterface aunn.a:()I
        //   973: invokevirtual   aupe.b:(Lorg/webrtc/VideoFrame;Lauom;Landroid/graphics/Matrix;II)V
        //   976: invokestatic    java/lang/System.nanoTime:()J
        //   979: lstore          8
        //   981: aload           17
        //   983: checkcast       Launs;
        //   986: getfield        auns.g:Launn;
        //   989: invokeinterface aunn.i:()V
        //   994: invokestatic    java/lang/System.nanoTime:()J
        //   997: lstore          10
        //   999: aload           17
        //  1001: checkcast       Launs;
        //  1004: getfield        auns.o:Ljava/lang/Object;
        //  1007: astore          19
        //  1009: aload           19
        //  1011: monitorenter   
        //  1012: aload           17
        //  1014: checkcast       Launs;
        //  1017: getfield        auns.r:I
        //  1020: istore          4
        //  1022: aload           17
        //  1024: checkcast       Launs;
        //  1027: iload           4
        //  1029: iconst_1       
        //  1030: iadd           
        //  1031: putfield        auns.r:I
        //  1034: aload           17
        //  1036: checkcast       Launs;
        //  1039: getfield        auns.t:J
        //  1042: lstore          14
        //  1044: aload           17
        //  1046: checkcast       Launs;
        //  1049: lload           14
        //  1051: lload           10
        //  1053: lload           12
        //  1055: lsub           
        //  1056: ladd           
        //  1057: putfield        auns.t:J
        //  1060: aload           17
        //  1062: checkcast       Launs;
        //  1065: getfield        auns.u:J
        //  1068: lstore          12
        //  1070: aload           17
        //  1072: checkcast       Launs;
        //  1075: lload           12
        //  1077: lload           10
        //  1079: lload           8
        //  1081: lsub           
        //  1082: ladd           
        //  1083: putfield        auns.u:J
        //  1086: aload           19
        //  1088: monitorexit    
        //  1089: aload           17
        //  1091: checkcast       Launs;
        //  1094: getfield        auns.d:Ljava/util/ArrayList;
        //  1097: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1100: ifeq            1106
        //  1103: goto            1462
        //  1106: aload           17
        //  1108: checkcast       Launs;
        //  1111: getfield        auns.j:Landroid/graphics/Matrix;
        //  1114: invokevirtual   android/graphics/Matrix.reset:()V
        //  1117: aload           17
        //  1119: checkcast       Launs;
        //  1122: getfield        auns.j:Landroid/graphics/Matrix;
        //  1125: ldc             0.5
        //  1127: ldc             0.5
        //  1129: invokevirtual   android/graphics/Matrix.preTranslate:(FF)Z
        //  1132: pop            
        //  1133: aload           17
        //  1135: checkcast       Launs;
        //  1138: getfield        auns.j:Landroid/graphics/Matrix;
        //  1141: fconst_1       
        //  1142: fconst_1       
        //  1143: invokevirtual   android/graphics/Matrix.preScale:(FF)Z
        //  1146: pop            
        //  1147: aload           17
        //  1149: checkcast       Launs;
        //  1152: getfield        auns.j:Landroid/graphics/Matrix;
        //  1155: fconst_1       
        //  1156: ldc_w           -1.0
        //  1159: invokevirtual   android/graphics/Matrix.preScale:(FF)Z
        //  1162: pop            
        //  1163: aload           17
        //  1165: checkcast       Launs;
        //  1168: getfield        auns.j:Landroid/graphics/Matrix;
        //  1171: ldc             -0.5
        //  1173: ldc             -0.5
        //  1175: invokevirtual   android/graphics/Matrix.preTranslate:(FF)Z
        //  1178: pop            
        //  1179: aload           17
        //  1181: checkcast       Launs;
        //  1184: getfield        auns.d:Ljava/util/ArrayList;
        //  1187: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1190: astore          19
        //  1192: aload           19
        //  1194: invokeinterface java/util/Iterator.hasNext:()Z
        //  1199: ifeq            1462
        //  1202: aload           19
        //  1204: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1209: checkcast       Launq;
        //  1212: astore          18
        //  1214: aload           19
        //  1216: invokeinterface java/util/Iterator.remove:()V
        //  1221: aload           18
        //  1223: getfield        aunq.a:F
        //  1226: fstore_1       
        //  1227: aload           16
        //  1229: invokevirtual   org/webrtc/VideoFrame.b:()I
        //  1232: i2f            
        //  1233: fstore_1       
        //  1234: aload           18
        //  1236: getfield        aunq.a:F
        //  1239: fstore_2       
        //  1240: aload           16
        //  1242: invokevirtual   org/webrtc/VideoFrame.a:()I
        //  1245: i2f            
        //  1246: fstore_2       
        //  1247: fload_1        
        //  1248: fconst_0       
        //  1249: fmul           
        //  1250: f2i            
        //  1251: istore          4
        //  1253: iload           4
        //  1255: ifeq            1453
        //  1258: fload_2        
        //  1259: fconst_0       
        //  1260: fmul           
        //  1261: f2i            
        //  1262: istore          5
        //  1264: iload           5
        //  1266: ifne            1272
        //  1269: goto            1453
        //  1272: aload           17
        //  1274: checkcast       Launs;
        //  1277: getfield        auns.v:Launy;
        //  1280: iload           4
        //  1282: iload           5
        //  1284: invokevirtual   auny.b:(II)V
        //  1287: ldc_w           36160
        //  1290: aload           17
        //  1292: checkcast       Launs;
        //  1295: getfield        auns.v:Launy;
        //  1298: getfield        auny.a:I
        //  1301: invokestatic    android/opengl/GLES20.glBindFramebuffer:(II)V
        //  1304: ldc_w           36160
        //  1307: ldc_w           36064
        //  1310: sipush          3553
        //  1313: aload           17
        //  1315: checkcast       Launs;
        //  1318: getfield        auns.v:Launy;
        //  1321: getfield        auny.b:I
        //  1324: iconst_0       
        //  1325: invokestatic    android/opengl/GLES20.glFramebufferTexture2D:(IIIII)V
        //  1328: fconst_0       
        //  1329: fconst_0       
        //  1330: fconst_0       
        //  1331: fconst_0       
        //  1332: invokestatic    android/opengl/GLES20.glClearColor:(FFFF)V
        //  1335: sipush          16384
        //  1338: invokestatic    android/opengl/GLES20.glClear:(I)V
        //  1341: aload           17
        //  1343: checkcast       Launs;
        //  1346: getfield        auns.h:Laupe;
        //  1349: astore          20
        //  1351: aload           18
        //  1353: getfield        aunq.c:Ljava/lang/Object;
        //  1356: astore          19
        //  1358: aload           20
        //  1360: aload           16
        //  1362: aconst_null    
        //  1363: aload           17
        //  1365: checkcast       Launs;
        //  1368: getfield        auns.j:Landroid/graphics/Matrix;
        //  1371: iload           4
        //  1373: iload           5
        //  1375: invokevirtual   aupe.b:(Lorg/webrtc/VideoFrame;Lauom;Landroid/graphics/Matrix;II)V
        //  1378: iload           4
        //  1380: iload           5
        //  1382: imul           
        //  1383: iconst_4       
        //  1384: imul           
        //  1385: invokestatic    java/nio/ByteBuffer.allocateDirect:(I)Ljava/nio/ByteBuffer;
        //  1388: astore          19
        //  1390: iconst_0       
        //  1391: iconst_0       
        //  1392: iload           4
        //  1394: iload           5
        //  1396: invokestatic    android/opengl/GLES20.glViewport:(IIII)V
        //  1399: iconst_0       
        //  1400: iconst_0       
        //  1401: iload           4
        //  1403: iload           5
        //  1405: sipush          6408
        //  1408: sipush          5121
        //  1411: aload           19
        //  1413: invokestatic    android/opengl/GLES20.glReadPixels:(IIIIIILjava/nio/Buffer;)V
        //  1416: ldc_w           36160
        //  1419: iconst_0       
        //  1420: invokestatic    android/opengl/GLES20.glBindFramebuffer:(II)V
        //  1423: ldc_w           "EglRenderer.notifyCallbacks"
        //  1426: invokestatic    auop.e:(Ljava/lang/String;)V
        //  1429: iload           4
        //  1431: iload           5
        //  1433: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //  1436: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //  1439: aload           19
        //  1441: invokevirtual   android/graphics/Bitmap.copyPixelsFromBuffer:(Ljava/nio/Buffer;)V
        //  1444: aload           18
        //  1446: getfield        aunq.b:Ljava/lang/Object;
        //  1449: astore          18
        //  1451: aconst_null    
        //  1452: athrow         
        //  1453: aload           18
        //  1455: getfield        aunq.b:Ljava/lang/Object;
        //  1458: astore          18
        //  1460: aconst_null    
        //  1461: athrow         
        //  1462: aload           16
        //  1464: invokevirtual   org/webrtc/VideoFrame.release:()V
        //  1467: return         
        //  1468: astore          18
        //  1470: aload           19
        //  1472: monitorexit    
        //  1473: aload           18
        //  1475: athrow         
        //  1476: astore          17
        //  1478: goto            1559
        //  1481: astore          18
        //  1483: ldc_w           "EglRenderer"
        //  1486: aload           17
        //  1488: checkcast       Launs;
        //  1491: getfield        auns.a:Ljava/lang/String;
        //  1494: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1497: ldc_w           "Error while drawing frame"
        //  1500: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1503: aload           18
        //  1505: invokestatic    org/webrtc/Logging.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1508: aload           17
        //  1510: checkcast       Launs;
        //  1513: getfield        auns.e:Launp;
        //  1516: astore          18
        //  1518: aload           17
        //  1520: checkcast       Launs;
        //  1523: getfield        auns.i:Lauom;
        //  1526: invokeinterface auom.c:()V
        //  1531: aload           17
        //  1533: checkcast       Launs;
        //  1536: getfield        auns.h:Laupe;
        //  1539: invokevirtual   aupe.a:()V
        //  1542: aload           17
        //  1544: checkcast       Launs;
        //  1547: getfield        auns.v:Launy;
        //  1550: invokevirtual   auny.a:()V
        //  1553: aload           16
        //  1555: invokevirtual   org/webrtc/VideoFrame.release:()V
        //  1558: return         
        //  1559: aload           16
        //  1561: invokevirtual   org/webrtc/VideoFrame.release:()V
        //  1564: aload           17
        //  1566: athrow         
        //  1567: astore          16
        //  1569: aload           19
        //  1571: monitorexit    
        //  1572: aload           16
        //  1574: athrow         
        //  1575: astore          16
        //  1577: aload           19
        //  1579: monitorexit    
        //  1580: aload           16
        //  1582: athrow         
        //  1583: aload           18
        //  1585: ldc_w           "Dropping frame - No surface"
        //  1588: invokevirtual   auns.b:(Ljava/lang/String;)V
        //  1591: aload           16
        //  1593: invokevirtual   org/webrtc/VideoFrame.release:()V
        //  1596: return         
        //  1597: astore          16
        //  1599: aload           19
        //  1601: monitorexit    
        //  1602: aload           16
        //  1604: athrow         
        //  1605: aload_0        
        //  1606: getfield        augg.a:Ljava/lang/Object;
        //  1609: checkcast       Laugw;
        //  1612: getfield        augw.c:Ljava/util/ArrayDeque;
        //  1615: astore          17
        //  1617: aload           17
        //  1619: monitorenter   
        //  1620: aload_0        
        //  1621: getfield        augg.a:Ljava/lang/Object;
        //  1624: astore          16
        //  1626: aload           16
        //  1628: checkcast       Laugw;
        //  1631: getfield        augw.d:Z
        //  1634: ifeq            1641
        //  1637: aload           17
        //  1639: monitorexit    
        //  1640: return         
        //  1641: aload           16
        //  1643: checkcast       Laugw;
        //  1646: getfield        augw.c:Ljava/util/ArrayDeque;
        //  1649: invokevirtual   java/util/ArrayDeque.pollFirst:()Ljava/lang/Object;
        //  1652: checkcast       Ljava/lang/Runnable;
        //  1655: astore          16
        //  1657: aload_0        
        //  1658: getfield        augg.a:Ljava/lang/Object;
        //  1661: astore          18
        //  1663: aload           16
        //  1665: ifnull          1674
        //  1668: iconst_1       
        //  1669: istore          7
        //  1671: goto            1677
        //  1674: iconst_0       
        //  1675: istore          7
        //  1677: aload           18
        //  1679: checkcast       Laugw;
        //  1682: iload           7
        //  1684: putfield        augw.d:Z
        //  1687: aload           17
        //  1689: monitorexit    
        //  1690: aload           16
        //  1692: ifnull          1846
        //  1695: aload           16
        //  1697: invokeinterface java/lang/Runnable.run:()V
        //  1702: aload_0        
        //  1703: getfield        augg.a:Ljava/lang/Object;
        //  1706: checkcast       Laugw;
        //  1709: getfield        augw.c:Ljava/util/ArrayDeque;
        //  1712: astore          17
        //  1714: aload           17
        //  1716: monitorenter   
        //  1717: aload_0        
        //  1718: getfield        augg.a:Ljava/lang/Object;
        //  1721: checkcast       Laugw;
        //  1724: getfield        augw.c:Ljava/util/ArrayDeque;
        //  1727: invokevirtual   java/util/ArrayDeque.pollFirst:()Ljava/lang/Object;
        //  1730: checkcast       Ljava/lang/Runnable;
        //  1733: astore          16
        //  1735: aload_0        
        //  1736: getfield        augg.a:Ljava/lang/Object;
        //  1739: astore          18
        //  1741: aload           16
        //  1743: ifnull          1752
        //  1746: iconst_1       
        //  1747: istore          7
        //  1749: goto            1755
        //  1752: iconst_0       
        //  1753: istore          7
        //  1755: aload           18
        //  1757: checkcast       Laugw;
        //  1760: iload           7
        //  1762: putfield        augw.d:Z
        //  1765: aload           17
        //  1767: monitorexit    
        //  1768: goto            1690
        //  1771: astore          16
        //  1773: aload           17
        //  1775: monitorexit    
        //  1776: aload           16
        //  1778: athrow         
        //  1779: astore          17
        //  1781: aload_0        
        //  1782: getfield        augg.a:Ljava/lang/Object;
        //  1785: checkcast       Laugw;
        //  1788: getfield        augw.c:Ljava/util/ArrayDeque;
        //  1791: astore          16
        //  1793: aload           16
        //  1795: monitorenter   
        //  1796: aload_0        
        //  1797: getfield        augg.a:Ljava/lang/Object;
        //  1800: astore          18
        //  1802: aload           18
        //  1804: checkcast       Laugw;
        //  1807: iconst_0       
        //  1808: putfield        augw.d:Z
        //  1811: aload           18
        //  1813: checkcast       Laugw;
        //  1816: getfield        augw.a:Ljava/util/concurrent/Executor;
        //  1819: aload           18
        //  1821: checkcast       Laugw;
        //  1824: getfield        augw.b:Ljava/lang/Runnable;
        //  1827: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //  1832: aload           16
        //  1834: monitorexit    
        //  1835: aload           17
        //  1837: athrow         
        //  1838: astore          17
        //  1840: aload           16
        //  1842: monitorexit    
        //  1843: aload           17
        //  1845: athrow         
        //  1846: return         
        //  1847: astore          16
        //  1849: aload           17
        //  1851: monitorexit    
        //  1852: aload           16
        //  1854: athrow         
        //  1855: aload_0        
        //  1856: getfield        augg.a:Ljava/lang/Object;
        //  1859: checkcast       Lashw;
        //  1862: getfield        ashw.b:Ljava/lang/Object;
        //  1865: checkcast       Laugx;
        //  1868: astore          17
        //  1870: aload           17
        //  1872: getfield        augx.b:Laugv;
        //  1875: astore          16
        //  1877: aload           16
        //  1879: new             Laugu;
        //  1882: dup            
        //  1883: aload           16
        //  1885: aload           17
        //  1887: getfield        augx.o:Lauhj;
        //  1890: aload           17
        //  1892: getfield        augx.p:Ljava/lang/String;
        //  1895: iconst_1       
        //  1896: invokespecial   augu.<init>:(Laugv;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;I)V
        //  1899: invokevirtual   augv.a:(Laugy;)V
        //  1902: return         
        //  1903: aload_0        
        //  1904: getfield        augg.a:Ljava/lang/Object;
        //  1907: checkcast       Laugx;
        //  1910: astore          16
        //  1912: aload           16
        //  1914: aload           16
        //  1916: getfield        augx.p:Ljava/lang/String;
        //  1919: putfield        augx.m:Ljava/lang/String;
        //  1922: aload           16
        //  1924: aconst_null    
        //  1925: putfield        augx.p:Ljava/lang/String;
        //  1928: aload           16
        //  1930: invokevirtual   augx.n:()V
        //  1933: return         
        //  1934: aload_0        
        //  1935: getfield        augg.a:Ljava/lang/Object;
        //  1938: checkcast       Laugx;
        //  1941: astore          16
        //  1943: aload           16
        //  1945: getfield        augx.f:Ljava/util/List;
        //  1948: aload           16
        //  1950: getfield        augx.m:Ljava/lang/String;
        //  1953: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1958: pop            
        //  1959: aload_0        
        //  1960: getfield        augg.a:Ljava/lang/Object;
        //  1963: checkcast       Laugx;
        //  1966: invokevirtual   augx.n:()V
        //  1969: return         
        //  1970: aload_0        
        //  1971: getfield        augg.a:Ljava/lang/Object;
        //  1974: checkcast       Laugx;
        //  1977: getfield        augx.n:Ljava/nio/channels/ReadableByteChannel;
        //  1980: astore          16
        //  1982: aload           16
        //  1984: ifnull          2015
        //  1987: aload           16
        //  1989: invokeinterface java/nio/channels/ReadableByteChannel.close:()V
        //  1994: goto            2004
        //  1997: astore          16
        //  1999: aload           16
        //  2001: invokevirtual   java/io/IOException.printStackTrace:()V
        //  2004: aload_0        
        //  2005: getfield        augg.a:Ljava/lang/Object;
        //  2008: checkcast       Laugx;
        //  2011: aconst_null    
        //  2012: putfield        augx.n:Ljava/nio/channels/ReadableByteChannel;
        //  2015: return         
        //  2016: aload_0        
        //  2017: getfield        augg.a:Ljava/lang/Object;
        //  2020: checkcast       Laugx;
        //  2023: getfield        augx.t:Laugs;
        //  2026: astore          16
        //  2028: aload           16
        //  2030: ifnull          2055
        //  2033: aload           16
        //  2035: invokevirtual   augs.d:()V
        //  2038: goto            2055
        //  2041: astore          16
        //  2043: getstatic       augx.a:Ljava/lang/String;
        //  2046: ldc_w           "Exception when closing OutputChannel"
        //  2049: aload           16
        //  2051: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2054: pop            
        //  2055: aload_0        
        //  2056: getfield        augg.a:Ljava/lang/Object;
        //  2059: checkcast       Laugx;
        //  2062: getfield        augx.q:Ljava/net/HttpURLConnection;
        //  2065: astore          16
        //  2067: aload           16
        //  2069: ifnull          2088
        //  2072: aload           16
        //  2074: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //  2077: aload_0        
        //  2078: getfield        augg.a:Ljava/lang/Object;
        //  2081: checkcast       Laugx;
        //  2084: aconst_null    
        //  2085: putfield        augx.q:Ljava/net/HttpURLConnection;
        //  2088: return         
        //  2089: invokestatic    org/chromium/net/impl/CronetLibraryLoader.b:()V
        //  2092: aload_0        
        //  2093: getfield        augg.a:Ljava/lang/Object;
        //  2096: checkcast       Lorg/chromium/net/impl/CronetUrlRequestContext;
        //  2099: getfield        org/chromium/net/impl/CronetUrlRequestContext.c:Ljava/lang/Object;
        //  2102: astore          16
        //  2104: aload           16
        //  2106: monitorenter   
        //  2107: aload_0        
        //  2108: getfield        augg.a:Ljava/lang/Object;
        //  2111: astore          17
        //  2113: aload           17
        //  2115: checkcast       Lorg/chromium/net/impl/CronetUrlRequestContext;
        //  2118: getfield        org/chromium/net/impl/CronetUrlRequestContext.d:J
        //  2121: aload           17
        //  2123: invokestatic    J/N.M6Dz0nZ5:(JLjava/lang/Object;)V
        //  2126: aload           16
        //  2128: monitorexit    
        //  2129: return         
        //  2130: astore          17
        //  2132: aload           16
        //  2134: monitorexit    
        //  2135: aload           17
        //  2137: athrow         
        //  2138: aload_0        
        //  2139: getfield        augg.a:Ljava/lang/Object;
        //  2142: astore          19
        //  2144: aload           19
        //  2146: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2149: getfield        org/chromium/net/impl/CronetUrlRequest.d:Lauhr;
        //  2152: astore          16
        //  2154: aload           19
        //  2156: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2159: getfield        org/chromium/net/impl/CronetUrlRequest.g:Lauhj;
        //  2162: astore          17
        //  2164: aload           19
        //  2166: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2169: getfield        org/chromium/net/impl/CronetUrlRequest.h:Lorg/chromium/net/CronetException;
        //  2172: astore          18
        //  2174: aload           16
        //  2176: aload           19
        //  2178: checkcast       Lorg/chromium/net/UrlRequest;
        //  2181: aload           17
        //  2183: aload           18
        //  2185: invokevirtual   auhr.onFailed:(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V
        //  2188: aload_0        
        //  2189: getfield        augg.a:Ljava/lang/Object;
        //  2192: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2195: invokevirtual   org/chromium/net/impl/CronetUrlRequest.d:()V
        //  2198: return         
        //  2199: astore          16
        //  2201: getstatic       org/chromium/net/impl/CronetUrlRequestContext.b:Ljava/lang/String;
        //  2204: ldc_w           "Exception in onFailed method"
        //  2207: iconst_1       
        //  2208: anewarray       Ljava/lang/Object;
        //  2211: dup            
        //  2212: iconst_0       
        //  2213: aload           16
        //  2215: aastore        
        //  2216: invokestatic    audx.b:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //  2219: return         
        //  2220: aload_0        
        //  2221: getfield        augg.a:Ljava/lang/Object;
        //  2224: astore          18
        //  2226: aload           18
        //  2228: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2231: getfield        org/chromium/net/impl/CronetUrlRequest.d:Lauhr;
        //  2234: astore          17
        //  2236: aload           18
        //  2238: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2241: getfield        org/chromium/net/impl/CronetUrlRequest.g:Lauhj;
        //  2244: astore          16
        //  2246: aload           17
        //  2248: aload           18
        //  2250: checkcast       Lorg/chromium/net/UrlRequest;
        //  2253: aload           16
        //  2255: invokevirtual   org/chromium/net/UrlRequest$Callback.onCanceled:(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V
        //  2258: aload_0        
        //  2259: getfield        augg.a:Ljava/lang/Object;
        //  2262: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2265: invokevirtual   org/chromium/net/impl/CronetUrlRequest.d:()V
        //  2268: return         
        //  2269: astore          16
        //  2271: getstatic       org/chromium/net/impl/CronetUrlRequestContext.b:Ljava/lang/String;
        //  2274: ldc_w           "Exception in onCanceled method"
        //  2277: iconst_1       
        //  2278: anewarray       Ljava/lang/Object;
        //  2281: dup            
        //  2282: iconst_0       
        //  2283: aload           16
        //  2285: aastore        
        //  2286: invokestatic    audx.b:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //  2289: return         
        //  2290: aload_0        
        //  2291: getfield        augg.a:Ljava/lang/Object;
        //  2294: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2297: getfield        org/chromium/net/impl/CronetUrlRequest.c:Ljava/lang/Object;
        //  2300: astore          16
        //  2302: aload           16
        //  2304: monitorenter   
        //  2305: aload_0        
        //  2306: getfield        augg.a:Ljava/lang/Object;
        //  2309: astore          17
        //  2311: aload           17
        //  2313: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2316: invokevirtual   org/chromium/net/impl/CronetUrlRequest.j:()Z
        //  2319: ifeq            2326
        //  2322: aload           16
        //  2324: monitorexit    
        //  2325: return         
        //  2326: aload           17
        //  2328: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2331: iconst_0       
        //  2332: invokevirtual   org/chromium/net/impl/CronetUrlRequest.c:(I)V
        //  2335: aload           16
        //  2337: monitorexit    
        //  2338: aload_0        
        //  2339: getfield        augg.a:Ljava/lang/Object;
        //  2342: astore          16
        //  2344: aload           16
        //  2346: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2349: getfield        org/chromium/net/impl/CronetUrlRequest.d:Lauhr;
        //  2352: astore          18
        //  2354: aload           16
        //  2356: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2359: getfield        org/chromium/net/impl/CronetUrlRequest.g:Lauhj;
        //  2362: astore          17
        //  2364: aload           18
        //  2366: aload           16
        //  2368: checkcast       Lorg/chromium/net/UrlRequest;
        //  2371: aload           17
        //  2373: invokevirtual   auhr.onSucceeded:(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V
        //  2376: aload_0        
        //  2377: getfield        augg.a:Ljava/lang/Object;
        //  2380: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2383: invokevirtual   org/chromium/net/impl/CronetUrlRequest.d:()V
        //  2386: return         
        //  2387: astore          16
        //  2389: getstatic       org/chromium/net/impl/CronetUrlRequestContext.b:Ljava/lang/String;
        //  2392: ldc_w           "Exception in onSucceeded method"
        //  2395: iconst_1       
        //  2396: anewarray       Ljava/lang/Object;
        //  2399: dup            
        //  2400: iconst_0       
        //  2401: aload           16
        //  2403: aastore        
        //  2404: invokestatic    audx.b:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //  2407: return         
        //  2408: astore          17
        //  2410: aload           16
        //  2412: monitorexit    
        //  2413: aload           17
        //  2415: athrow         
        //  2416: aload_0        
        //  2417: getfield        augg.a:Ljava/lang/Object;
        //  2420: checkcast       Lorg/chromium/net/impl/VersionSafeCallbacks$UrlRequestStatusListener;
        //  2423: iconst_m1      
        //  2424: invokevirtual   org/chromium/net/impl/VersionSafeCallbacks$UrlRequestStatusListener.onStatus:(I)V
        //  2427: return         
        //  2428: aload_0        
        //  2429: getfield        augg.a:Ljava/lang/Object;
        //  2432: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2435: invokevirtual   org/chromium/net/impl/CronetUrlRequest.b:()V
        //  2438: aload_0        
        //  2439: getfield        augg.a:Ljava/lang/Object;
        //  2442: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2445: getfield        org/chromium/net/impl/CronetUrlRequest.c:Ljava/lang/Object;
        //  2448: astore          16
        //  2450: aload           16
        //  2452: monitorenter   
        //  2453: aload_0        
        //  2454: getfield        augg.a:Ljava/lang/Object;
        //  2457: astore          17
        //  2459: aload           17
        //  2461: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2464: invokevirtual   org/chromium/net/impl/CronetUrlRequest.j:()Z
        //  2467: ifeq            2474
        //  2470: aload           16
        //  2472: monitorexit    
        //  2473: return         
        //  2474: aload           17
        //  2476: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2479: invokestatic    org/chromium/net/impl/CronetUrlRequest.k:(Lorg/chromium/net/impl/CronetUrlRequest;)V
        //  2482: aload           16
        //  2484: monitorexit    
        //  2485: aload_0        
        //  2486: getfield        augg.a:Ljava/lang/Object;
        //  2489: astore          18
        //  2491: aload           18
        //  2493: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2496: getfield        org/chromium/net/impl/CronetUrlRequest.d:Lauhr;
        //  2499: astore          16
        //  2501: aload           18
        //  2503: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2506: getfield        org/chromium/net/impl/CronetUrlRequest.g:Lauhj;
        //  2509: astore          17
        //  2511: aload           16
        //  2513: aload           18
        //  2515: checkcast       Lorg/chromium/net/UrlRequest;
        //  2518: aload           17
        //  2520: invokevirtual   auhr.onResponseStarted:(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V
        //  2523: return         
        //  2524: astore          16
        //  2526: aload_0        
        //  2527: getfield        augg.a:Ljava/lang/Object;
        //  2530: checkcast       Lorg/chromium/net/impl/CronetUrlRequest;
        //  2533: aload           16
        //  2535: invokevirtual   org/chromium/net/impl/CronetUrlRequest.e:(Ljava/lang/Exception;)V
        //  2538: return         
        //  2539: astore          17
        //  2541: aload           16
        //  2543: monitorexit    
        //  2544: aload           17
        //  2546: athrow         
        //  2547: aload           16
        //  2549: invokevirtual   auot.b:()V
        //  2552: return         
        //  2553: astore          18
        //  2555: goto            1832
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  227    241    242    250    Any
        //  244    247    242    250    Any
        //  285    298    675    683    Any
        //  305    573    675    683    Any
        //  576    579    675    683    Any
        //  594    610    667    675    Any
        //  615    663    667    675    Any
        //  663    666    667    675    Any
        //  669    672    667    675    Any
        //  677    680    675    683    Any
        //  706    716    1597   1605   Any
        //  721    724    1597   1605   Any
        //  725    737    1597   1605   Any
        //  772    775    1575   1583   Any
        //  804    813    1567   1575   Any
        //  828    831    1567   1575   Any
        //  908    1012   1481   1559   Launz;
        //  908    1012   1476   1481   Any
        //  1012   1089   1468   1476   Any
        //  1089   1103   1481   1559   Launz;
        //  1089   1103   1476   1481   Any
        //  1106   1247   1481   1559   Launz;
        //  1106   1247   1476   1481   Any
        //  1272   1453   1481   1559   Launz;
        //  1272   1453   1476   1481   Any
        //  1453   1462   1481   1559   Launz;
        //  1453   1462   1476   1481   Any
        //  1470   1473   1468   1476   Any
        //  1473   1476   1481   1559   Launz;
        //  1473   1476   1476   1481   Any
        //  1483   1553   1476   1481   Any
        //  1569   1572   1567   1575   Any
        //  1577   1580   1575   1583   Any
        //  1599   1602   1597   1605   Any
        //  1620   1640   1847   1855   Any
        //  1641   1663   1847   1855   Any
        //  1677   1690   1847   1855   Any
        //  1695   1702   1779   1846   Any
        //  1717   1741   1771   1779   Any
        //  1755   1768   1771   1779   Any
        //  1773   1776   1771   1779   Any
        //  1796   1811   1838   1846   Any
        //  1811   1832   2553   2558   Ljava/util/concurrent/RejectedExecutionException;
        //  1811   1832   1838   1846   Any
        //  1832   1835   1838   1846   Any
        //  1840   1843   1838   1846   Any
        //  1849   1852   1847   1855   Any
        //  1987   1994   1997   2004   Ljava/io/IOException;
        //  2033   2038   2041   2055   Ljava/io/IOException;
        //  2107   2129   2130   2138   Any
        //  2132   2135   2130   2138   Any
        //  2138   2198   2199   2220   Ljava/lang/Exception;
        //  2220   2268   2269   2290   Ljava/lang/Exception;
        //  2305   2325   2408   2416   Any
        //  2326   2338   2408   2416   Any
        //  2338   2386   2387   2408   Ljava/lang/Exception;
        //  2410   2413   2408   2416   Any
        //  2453   2473   2539   2547   Any
        //  2474   2485   2539   2547   Any
        //  2485   2523   2524   2539   Ljava/lang/Exception;
        //  2541   2544   2539   2547   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1832:
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
