import java.util.Map;
import com.google.research.xeno.effect.RemoteAssetManager;
import com.google.common.android.concurrent.ParcelableFuture;
import android.os.IBinder;
import android.graphics.SurfaceTexture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afaa implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public afaa(final adgg b, final afmk a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afaa(final aexy a, final auoc b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final aglh a, final agmy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final aglk a, final agmy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agog b, final noj a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afaa(final agps a, final arze b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agps a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agpv a, final arze b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agpv a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agpv a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agpz a, final arze b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agpz a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final agvf b, final SurfaceTexture a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afaa(final arft a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final arft a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final asas b, final IBinder a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afaa(final ParcelableFuture a, final Throwable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afaa(final RemoteAssetManager b, final aqwo a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afaa(final RemoteAssetManager b, final aqyd a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afaa(final Map.Entry b, final agmd a, final int c) {
        this.c = c;
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
        //     1: getfield        afaa.c:I
        //     4: istore_2       
        //     5: iconst_1       
        //     6: istore          6
        //     8: iconst_0       
        //     9: istore_1       
        //    10: iload_2        
        //    11: tableswitch {
        //                0: 2282
        //                1: 2165
        //                2: 2135
        //                3: 2073
        //                4: 2050
        //                5: 2017
        //                6: 1567
        //                7: 1516
        //                8: 1419
        //                9: 1393
        //               10: 1352
        //               11: 1314
        //               12: 1288
        //               13: 1259
        //               14: 492
        //               15: 381
        //               16: 284
        //               17: 245
        //               18: 215
        //               19: 122
        //          default: 104
        //        }
        //   104: aload_0        
        //   105: getfield        afaa.b:Ljava/lang/Object;
        //   108: astore          14
        //   110: aload_0        
        //   111: getfield        afaa.a:Ljava/lang/Object;
        //   114: astore          15
        //   116: aload           14
        //   118: monitorenter   
        //   119: goto            2319
        //   122: aload_0        
        //   123: getfield        afaa.b:Ljava/lang/Object;
        //   126: astore          13
        //   128: aload_0        
        //   129: getfield        afaa.a:Ljava/lang/Object;
        //   132: checkcast       Larft;
        //   135: getfield        arft.f:Landroid/widget/ImageButton;
        //   138: astore          14
        //   140: aload           13
        //   142: ifnull          148
        //   145: goto            151
        //   148: iconst_0       
        //   149: istore          6
        //   151: aload           14
        //   153: iload           6
        //   155: invokestatic    arft.a:(Z)I
        //   158: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //   161: aload_0        
        //   162: getfield        afaa.a:Ljava/lang/Object;
        //   165: checkcast       Larft;
        //   168: getfield        arft.e:Landroid/view/View;
        //   171: astore          13
        //   173: aload           13
        //   175: ifnull          188
        //   178: aload           13
        //   180: iload           6
        //   182: invokestatic    arft.a:(Z)I
        //   185: invokevirtual   android/view/View.setVisibility:(I)V
        //   188: aload_0        
        //   189: getfield        afaa.a:Ljava/lang/Object;
        //   192: checkcast       Larft;
        //   195: getfield        arft.h:Larfp;
        //   198: astore          13
        //   200: aload           13
        //   202: ifnull          214
        //   205: aload           13
        //   207: aload_0        
        //   208: getfield        afaa.b:Ljava/lang/Object;
        //   211: invokevirtual   arfp.b:(Ljava/lang/Runnable;)V
        //   214: return         
        //   215: aload_0        
        //   216: getfield        afaa.a:Ljava/lang/Object;
        //   219: checkcast       Larft;
        //   222: getfield        arft.h:Larfp;
        //   225: astore          13
        //   227: aload           13
        //   229: ifnull          244
        //   232: aload           13
        //   234: aload_0        
        //   235: getfield        afaa.b:Ljava/lang/Object;
        //   238: checkcast       Ljava/lang/String;
        //   241: invokevirtual   arfp.c:(Ljava/lang/String;)V
        //   244: return         
        //   245: aload_0        
        //   246: getfield        afaa.b:Ljava/lang/Object;
        //   249: ifnonnull       266
        //   252: aload_0        
        //   253: getfield        afaa.a:Ljava/lang/Object;
        //   256: checkcast       Larft;
        //   259: getfield        arft.h:Larfp;
        //   262: ifnonnull       266
        //   265: return         
        //   266: aload_0        
        //   267: getfield        afaa.a:Ljava/lang/Object;
        //   270: checkcast       Larft;
        //   273: invokevirtual   arft.b:()Larfp;
        //   276: aload_0        
        //   277: getfield        afaa.b:Ljava/lang/Object;
        //   280: putfield        arfp.c:Ljava/lang/Runnable;
        //   283: return         
        //   284: aload_0        
        //   285: getfield        afaa.b:Ljava/lang/Object;
        //   288: astore          14
        //   290: aload_0        
        //   291: getfield        afaa.a:Ljava/lang/Object;
        //   294: astore          13
        //   296: aload           14
        //   298: checkcast       Lcom/google/research/xeno/effect/RemoteAssetManager;
        //   301: getfield        com/google/research/xeno/effect/RemoteAssetManager.b:J
        //   304: lstore          7
        //   306: lload           7
        //   308: lconst_0       
        //   309: lcmp           
        //   310: ifne            328
        //   313: aload           13
        //   315: checkcast       Laqwo;
        //   318: getfield        aqwo.a:Ljava/lang/Object;
        //   321: aconst_null    
        //   322: ldc             "RemoteAssetManager failed to natively load"
        //   324: invokestatic    com/google/research/xeno/effect/Effect.b:(Laqwp;Lcom/google/research/xeno/effect/Effect;Ljava/lang/String;)V
        //   327: return         
        //   328: aload           13
        //   330: checkcast       Laqwo;
        //   333: astore          15
        //   335: aload           15
        //   337: getfield        aqwo.b:Ljava/lang/Object;
        //   340: checkcast       Lahbc;
        //   343: invokevirtual   ahbc.toByteArray:()[B
        //   346: astore          14
        //   348: aload           15
        //   350: getfield        aqwo.c:Ljava/lang/Object;
        //   353: astore          13
        //   355: new             Laqwn;
        //   358: dup            
        //   359: aload           15
        //   361: invokespecial   aqwn.<init>:(Laqwo;)V
        //   364: astore          15
        //   366: aload           14
        //   368: lload           7
        //   370: aload           13
        //   372: checkcast       Ljava/lang/String;
        //   375: aload           15
        //   377: invokestatic    com/google/research/xeno/effect/Effect.nativeLoadWithRemoteAssetManager:([BJLjava/lang/String;Lcom/google/research/xeno/effect/Effect$NativeLoadCallback;)V
        //   380: return         
        //   381: aload_0        
        //   382: getfield        afaa.b:Ljava/lang/Object;
        //   385: astore          13
        //   387: aload_0        
        //   388: getfield        afaa.a:Ljava/lang/Object;
        //   391: checkcast       Laqyd;
        //   394: astore          15
        //   396: aload           15
        //   398: getfield        aqyd.d:Lafgh;
        //   401: astore          14
        //   403: aload           14
        //   405: checkcast       Lafjx;
        //   408: getfield        afjx.c:I
        //   411: istore_2       
        //   412: iload_1        
        //   413: iload_2        
        //   414: if_icmpge       444
        //   417: new             Ljava/io/File;
        //   420: dup            
        //   421: aload           14
        //   423: iload_1        
        //   424: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   429: checkcast       Ljava/lang/String;
        //   432: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   435: invokestatic    aqvq.c:(Ljava/io/File;)V
        //   438: iinc            1, 1
        //   441: goto            412
        //   444: aload           15
        //   446: getfield        aqyd.a:Ljava/lang/String;
        //   449: astore          14
        //   451: aload           15
        //   453: getfield        aqyd.b:J
        //   456: lstore          7
        //   458: aload           15
        //   460: getfield        aqyd.c:Lcom/google/research/xeno/effect/AssetDownloader;
        //   463: astore          15
        //   465: aload           13
        //   467: checkcast       Lcom/google/research/xeno/effect/RemoteAssetManager;
        //   470: astore          13
        //   472: aload           13
        //   474: aload           14
        //   476: lload           7
        //   478: aload           15
        //   480: aload           13
        //   482: getfield        com/google/research/xeno/effect/RemoteAssetManager.c:Ljava/lang/String;
        //   485: invokestatic    com/google/research/xeno/effect/RemoteAssetManager.nativeCreateRemoteAssetManager:(Ljava/lang/String;JLcom/google/research/xeno/effect/AssetDownloader;Ljava/lang/String;)J
        //   488: putfield        com/google/research/xeno/effect/RemoteAssetManager.b:J
        //   491: return         
        //   492: aload_0        
        //   493: getfield        afaa.b:Ljava/lang/Object;
        //   496: astore          15
        //   498: aload_0        
        //   499: getfield        afaa.a:Ljava/lang/Object;
        //   502: astore          13
        //   504: aload           15
        //   506: checkcast       Lagvf;
        //   509: astore          14
        //   511: aload           13
        //   513: aload           14
        //   515: getfield        agvf.a:Landroid/graphics/SurfaceTexture;
        //   518: if_acmpeq       522
        //   521: return         
        //   522: aload           14
        //   524: iconst_1       
        //   525: putfield        agvf.d:Z
        //   528: aload           15
        //   530: checkcast       Lagvf;
        //   533: getfield        agvf.c:Ljava/util/List;
        //   536: astore          16
        //   538: aload           16
        //   540: monitorenter   
        //   541: aload           15
        //   543: checkcast       Lagvf;
        //   546: getfield        agvf.c:Ljava/util/List;
        //   549: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   554: astore          17
        //   556: iconst_0       
        //   557: istore_1       
        //   558: aload           17
        //   560: invokeinterface java/util/Iterator.hasNext:()Z
        //   565: ifeq            1227
        //   568: aload           17
        //   570: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   575: checkcast       Lagvi;
        //   578: astore          18
        //   580: aload           15
        //   582: monitorenter   
        //   583: aload           15
        //   585: checkcast       Lagvf;
        //   588: getfield        agvf.e:Ljava/util/Queue;
        //   591: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //   596: checkcast       Lagve;
        //   599: astore          13
        //   601: aload           13
        //   603: ifnonnull       651
        //   606: aload           15
        //   608: checkcast       Lagvf;
        //   611: getfield        agvf.h:I
        //   614: istore_2       
        //   615: iload_2        
        //   616: ifle            651
        //   619: aload           15
        //   621: checkcast       Lagvf;
        //   624: getfield        agvf.f:I
        //   627: iload_2        
        //   628: aload           15
        //   630: checkcast       Lagvf;
        //   633: getfield        agvf.g:I
        //   636: invokestatic    java/lang/Math.max:(II)I
        //   639: if_icmplt       651
        //   642: aload           15
        //   644: monitorexit    
        //   645: aconst_null    
        //   646: astore          13
        //   648: goto            755
        //   651: aload           15
        //   653: checkcast       Lagvf;
        //   656: getfield        agvf.f:I
        //   659: istore_2       
        //   660: aload           15
        //   662: checkcast       Lagvf;
        //   665: iload_2        
        //   666: iconst_1       
        //   667: iadd           
        //   668: putfield        agvf.f:I
        //   671: aload           15
        //   673: monitorexit    
        //   674: aload           13
        //   676: ifnonnull       692
        //   679: aload           15
        //   681: checkcast       Lagvf;
        //   684: invokevirtual   agvf.a:()Lagve;
        //   687: astore          13
        //   689: goto            755
        //   692: aload           13
        //   694: getfield        agvk.e:I
        //   697: aload           15
        //   699: checkcast       Lagvf;
        //   702: getfield        agvf.n:I
        //   705: if_icmpne       735
        //   708: aload           13
        //   710: getfield        agvk.f:I
        //   713: aload           15
        //   715: checkcast       Lagvf;
        //   718: getfield        agvf.o:I
        //   721: if_icmpeq       727
        //   724: goto            735
        //   727: aload           13
        //   729: invokestatic    agvf.h:(Lagvk;)V
        //   732: goto            755
        //   735: aload           13
        //   737: invokestatic    agvf.h:(Lagvk;)V
        //   740: aload           13
        //   742: invokestatic    agvf.g:(Lagvk;)V
        //   745: aload           15
        //   747: checkcast       Lagvf;
        //   750: invokevirtual   agvf.a:()Lagve;
        //   753: astore          13
        //   755: aload           13
        //   757: ifnonnull       763
        //   760: goto            1227
        //   763: aload           13
        //   765: getfield        agvk.d:I
        //   768: istore_2       
        //   769: aload           15
        //   771: checkcast       Lagvf;
        //   774: getfield        agvf.n:I
        //   777: istore_3       
        //   778: aload           15
        //   780: checkcast       Lagvf;
        //   783: getfield        agvf.o:I
        //   786: istore_1       
        //   787: aload           15
        //   789: checkcast       Lagvs;
        //   792: iload_2        
        //   793: iload_3        
        //   794: iload_1        
        //   795: invokevirtual   agvs.i:(III)V
        //   798: aload           15
        //   800: checkcast       Lagvf;
        //   803: getfield        agvf.i:Lagvr;
        //   806: astore          14
        //   808: aload           15
        //   810: checkcast       Lagvf;
        //   813: getfield        agvf.a:Landroid/graphics/SurfaceTexture;
        //   816: astore          19
        //   818: sipush          16384
        //   821: invokestatic    android/opengl/GLES20.glClear:(I)V
        //   824: ldc             33984
        //   826: invokestatic    android/opengl/GLES20.glActiveTexture:(I)V
        //   829: ldc             "glActiveTexture"
        //   831: invokestatic    agvt.c:(Ljava/lang/String;)V
        //   834: aload           19
        //   836: invokevirtual   android/graphics/SurfaceTexture.updateTexImage:()V
        //   839: aload           19
        //   841: aload           14
        //   843: getfield        agvr.i:[F
        //   846: invokevirtual   android/graphics/SurfaceTexture.getTransformMatrix:([F)V
        //   849: ldc_w           36197
        //   852: sipush          10241
        //   855: sipush          9729
        //   858: invokestatic    android/opengl/GLES20.glTexParameteri:(III)V
        //   861: ldc_w           36197
        //   864: sipush          10240
        //   867: sipush          9729
        //   870: invokestatic    android/opengl/GLES20.glTexParameteri:(III)V
        //   873: ldc_w           36197
        //   876: sipush          10242
        //   879: ldc_w           33071
        //   882: invokestatic    android/opengl/GLES20.glTexParameteri:(III)V
        //   885: ldc_w           36197
        //   888: sipush          10243
        //   891: ldc_w           33071
        //   894: invokestatic    android/opengl/GLES20.glTexParameteri:(III)V
        //   897: ldc_w           "glTexParameteri"
        //   900: invokestatic    agvt.c:(Ljava/lang/String;)V
        //   903: aload           14
        //   905: getfield        agvr.f:I
        //   908: invokestatic    android/opengl/GLES20.glUseProgram:(I)V
        //   911: ldc_w           "glUseProgram"
        //   914: invokestatic    agvt.c:(Ljava/lang/String;)V
        //   917: aload           14
        //   919: getfield        agvr.g:I
        //   922: iconst_0       
        //   923: invokestatic    android/opengl/GLES20.glUniform1i:(II)V
        //   926: ldc_w           "glUniform1i"
        //   929: invokestatic    agvt.c:(Ljava/lang/String;)V
        //   932: aload           14
        //   934: getfield        agvr.h:I
        //   937: iconst_1       
        //   938: iconst_0       
        //   939: aload           14
        //   941: getfield        agvr.i:[F
        //   944: iconst_0       
        //   945: invokestatic    android/opengl/GLES20.glUniformMatrix4fv:(IIZ[FI)V
        //   948: ldc_w           "glUniformMatrix4fv"
        //   951: invokestatic    agvt.c:(Ljava/lang/String;)V
        //   954: iconst_1       
        //   955: invokestatic    android/opengl/GLES20.glEnableVertexAttribArray:(I)V
        //   958: aload           14
        //   960: getfield        agvr.j:I
        //   963: istore_1       
        //   964: iload_1        
        //   965: iconst_1       
        //   966: if_icmpeq       1003
        //   969: iload_1        
        //   970: iconst_2       
        //   971: if_icmpeq       995
        //   974: iload_1        
        //   975: iconst_3       
        //   976: if_icmpeq       987
        //   979: getstatic       agvr.b:Ljava/nio/FloatBuffer;
        //   982: astore          14
        //   984: goto            1008
        //   987: getstatic       agvr.e:Ljava/nio/FloatBuffer;
        //   990: astore          14
        //   992: goto            1008
        //   995: getstatic       agvr.d:Ljava/nio/FloatBuffer;
        //   998: astore          14
        //  1000: goto            1008
        //  1003: getstatic       agvr.c:Ljava/nio/FloatBuffer;
        //  1006: astore          14
        //  1008: iconst_1       
        //  1009: iconst_2       
        //  1010: sipush          5126
        //  1013: iconst_0       
        //  1014: iconst_0       
        //  1015: aload           14
        //  1017: invokestatic    android/opengl/GLES20.glVertexAttribPointer:(IIIZILjava/nio/Buffer;)V
        //  1020: iconst_2       
        //  1021: invokestatic    android/opengl/GLES20.glEnableVertexAttribArray:(I)V
        //  1024: iconst_2       
        //  1025: iconst_2       
        //  1026: sipush          5126
        //  1029: iconst_0       
        //  1030: iconst_0       
        //  1031: getstatic       agvr.a:Ljava/nio/FloatBuffer;
        //  1034: invokestatic    android/opengl/GLES20.glVertexAttribPointer:(IIIZILjava/nio/Buffer;)V
        //  1037: ldc_w           "program setup"
        //  1040: invokestatic    agvt.c:(Ljava/lang/String;)V
        //  1043: iconst_5       
        //  1044: iconst_0       
        //  1045: iconst_4       
        //  1046: invokestatic    android/opengl/GLES20.glDrawArrays:(III)V
        //  1049: ldc_w           "glDrawArrays"
        //  1052: invokestatic    agvt.c:(Ljava/lang/String;)V
        //  1055: ldc_w           36197
        //  1058: iconst_0       
        //  1059: invokestatic    android/opengl/GLES20.glBindTexture:(II)V
        //  1062: ldc_w           "glBindTexture"
        //  1065: invokestatic    agvt.c:(Ljava/lang/String;)V
        //  1068: invokestatic    android/opengl/GLES20.glFinish:()V
        //  1071: aload           15
        //  1073: checkcast       Lagvf;
        //  1076: getfield        agvf.a:Landroid/graphics/SurfaceTexture;
        //  1079: invokevirtual   android/graphics/SurfaceTexture.getTimestamp:()J
        //  1082: ldc2_w          1000
        //  1085: ldiv           
        //  1086: lstore          11
        //  1088: aload           15
        //  1090: checkcast       Lagvf;
        //  1093: getfield        agvf.j:Z
        //  1096: ifeq            1156
        //  1099: aload           15
        //  1101: checkcast       Lagvf;
        //  1104: getfield        agvf.m:Z
        //  1107: ifeq            1156
        //  1110: aload           15
        //  1112: checkcast       Lagvf;
        //  1115: getfield        agvf.k:J
        //  1118: lstore          7
        //  1120: aload           15
        //  1122: checkcast       Lagvf;
        //  1125: getfield        agvf.l:J
        //  1128: lstore          9
        //  1130: lload           7
        //  1132: lload           11
        //  1134: ladd           
        //  1135: lload           9
        //  1137: lcmp           
        //  1138: ifgt            1156
        //  1141: aload           15
        //  1143: checkcast       Lagvf;
        //  1146: lload           9
        //  1148: lconst_1       
        //  1149: ladd           
        //  1150: lload           11
        //  1152: lsub           
        //  1153: putfield        agvf.k:J
        //  1156: lload           11
        //  1158: aload           15
        //  1160: checkcast       Lagvf;
        //  1163: getfield        agvf.k:J
        //  1166: ladd           
        //  1167: lstore          7
        //  1169: aload           13
        //  1171: lload           7
        //  1173: putfield        agvk.g:J
        //  1176: aload           15
        //  1178: checkcast       Lagvf;
        //  1181: lload           7
        //  1183: putfield        agvf.l:J
        //  1186: aload           15
        //  1188: checkcast       Lagvf;
        //  1191: iconst_1       
        //  1192: putfield        agvf.m:Z
        //  1195: aload           18
        //  1197: ifnull          1214
        //  1200: aload           13
        //  1202: invokevirtual   agvk.b:()V
        //  1205: aload           18
        //  1207: aload           13
        //  1209: invokeinterface agvi.l:(Lcom/google/mediapipe/framework/TextureFrame;)V
        //  1214: iconst_1       
        //  1215: istore_1       
        //  1216: goto            558
        //  1219: astore          13
        //  1221: aload           15
        //  1223: monitorexit    
        //  1224: aload           13
        //  1226: athrow         
        //  1227: iload_1        
        //  1228: ifne            1242
        //  1231: aload           15
        //  1233: checkcast       Lagvf;
        //  1236: getfield        agvf.a:Landroid/graphics/SurfaceTexture;
        //  1239: invokevirtual   android/graphics/SurfaceTexture.updateTexImage:()V
        //  1242: aload           16
        //  1244: monitorexit    
        //  1245: return         
        //  1246: astore          13
        //  1248: aload           16
        //  1250: monitorexit    
        //  1251: aload           13
        //  1253: athrow         
        //  1254: astore          13
        //  1256: aload           13
        //  1258: athrow         
        //  1259: aload_0        
        //  1260: getfield        afaa.a:Ljava/lang/Object;
        //  1263: astore          13
        //  1265: aload_0        
        //  1266: getfield        afaa.b:Ljava/lang/Object;
        //  1269: astore          14
        //  1271: aload           13
        //  1273: checkcast       Lagpz;
        //  1276: getfield        agpz.a:Larxu;
        //  1279: aload           14
        //  1281: checkcast       Larze;
        //  1284: invokevirtual   arxu.b:(Larze;)V
        //  1287: return         
        //  1288: aload_0        
        //  1289: getfield        afaa.a:Ljava/lang/Object;
        //  1292: astore          14
        //  1294: aload_0        
        //  1295: getfield        afaa.b:Ljava/lang/Object;
        //  1298: astore          13
        //  1300: aload           14
        //  1302: checkcast       Lagpz;
        //  1305: getfield        agpz.a:Larxu;
        //  1308: aload           13
        //  1310: invokevirtual   arxu.c:(Ljava/lang/Object;)V
        //  1313: return         
        //  1314: aload_0        
        //  1315: getfield        afaa.a:Ljava/lang/Object;
        //  1318: astore          14
        //  1320: aload_0        
        //  1321: getfield        afaa.b:Ljava/lang/Object;
        //  1324: astore          13
        //  1326: aload           14
        //  1328: checkcast       Lagps;
        //  1331: astore          14
        //  1333: aload           14
        //  1335: getfield        agps.a:Z
        //  1338: ifne            1351
        //  1341: aload           14
        //  1343: getfield        agps.c:Larxu;
        //  1346: aload           13
        //  1348: invokevirtual   arxu.c:(Ljava/lang/Object;)V
        //  1351: return         
        //  1352: aload_0        
        //  1353: getfield        afaa.a:Ljava/lang/Object;
        //  1356: astore          14
        //  1358: aload_0        
        //  1359: getfield        afaa.b:Ljava/lang/Object;
        //  1362: astore          13
        //  1364: aload           14
        //  1366: checkcast       Lagps;
        //  1369: astore          14
        //  1371: aload           14
        //  1373: getfield        agps.a:Z
        //  1376: ifne            1392
        //  1379: aload           14
        //  1381: getfield        agps.c:Larxu;
        //  1384: aload           13
        //  1386: checkcast       Larze;
        //  1389: invokevirtual   arxu.b:(Larze;)V
        //  1392: return         
        //  1393: aload_0        
        //  1394: getfield        afaa.a:Ljava/lang/Object;
        //  1397: astore          13
        //  1399: aload_0        
        //  1400: getfield        afaa.b:Ljava/lang/Object;
        //  1403: checkcast       Larze;
        //  1406: astore          14
        //  1408: aload           13
        //  1410: checkcast       Lagpv;
        //  1413: aload           14
        //  1415: invokevirtual   agpv.h:(Larze;)V
        //  1418: return         
        //  1419: aload_0        
        //  1420: getfield        afaa.a:Ljava/lang/Object;
        //  1423: astore          14
        //  1425: aload_0        
        //  1426: getfield        afaa.b:Ljava/lang/Object;
        //  1429: astore          13
        //  1431: aload           13
        //  1433: invokeinterface java/lang/Runnable.run:()V
        //  1438: return         
        //  1439: astore          13
        //  1441: aload           14
        //  1443: checkcast       Lagpv;
        //  1446: astore          14
        //  1448: aload           14
        //  1450: iconst_1       
        //  1451: putfield        agpv.g:Z
        //  1454: aload           14
        //  1456: getfield        agpv.j:Larxu;
        //  1459: astore          15
        //  1461: aload           15
        //  1463: ifnull          1515
        //  1466: aload           15
        //  1468: aload           13
        //  1470: invokestatic    io/grpc/Status.b:(Ljava/lang/Throwable;)Lio/grpc/Status;
        //  1473: new             Larze;
        //  1476: dup            
        //  1477: invokespecial   arze.<init>:()V
        //  1480: invokevirtual   arxu.a:(Lio/grpc/Status;Larze;)V
        //  1483: aload           14
        //  1485: getfield        agpv.h:Larwu;
        //  1488: astore          15
        //  1490: aload           15
        //  1492: ifnull          1515
        //  1495: aload           14
        //  1497: getfield        agpv.i:Lauoh;
        //  1500: getfield        auoh.d:I
        //  1503: iconst_4       
        //  1504: if_icmpne       1515
        //  1507: aload           15
        //  1509: aconst_null    
        //  1510: aload           13
        //  1512: invokevirtual   arwu.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1515: return         
        //  1516: aload_0        
        //  1517: getfield        afaa.a:Ljava/lang/Object;
        //  1520: astore          14
        //  1522: aload_0        
        //  1523: getfield        afaa.b:Ljava/lang/Object;
        //  1526: astore          13
        //  1528: aload           14
        //  1530: checkcast       Lagpv;
        //  1533: astore          14
        //  1535: new             Lagpt;
        //  1538: dup            
        //  1539: aload           14
        //  1541: aload           13
        //  1543: invokespecial   agpt.<init>:(Lagpv;Ljava/lang/Object;)V
        //  1546: astore          13
        //  1548: aload           14
        //  1550: getfield        agpv.c:Ljava/util/Deque;
        //  1553: aload           13
        //  1555: invokeinterface java/util/Deque.add:(Ljava/lang/Object;)Z
        //  1560: pop            
        //  1561: aload           14
        //  1563: invokevirtual   agpv.e:()V
        //  1566: return         
        //  1567: aload_0        
        //  1568: getfield        afaa.b:Ljava/lang/Object;
        //  1571: astore          15
        //  1573: aload_0        
        //  1574: getfield        afaa.a:Ljava/lang/Object;
        //  1577: astore          14
        //  1579: aload           15
        //  1581: checkcast       Lagog;
        //  1584: getfield        agog.a:Ljava/net/URL;
        //  1587: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //  1590: astore          13
        //  1592: aload           13
        //  1594: invokevirtual   java/net/URLConnection.getContentLength:()I
        //  1597: ldc_w           1048576
        //  1600: if_icmpgt       1988
        //  1603: aload           13
        //  1605: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //  1608: astore          16
        //  1610: new             Lagnu;
        //  1613: astore          13
        //  1615: aload           13
        //  1617: aload           16
        //  1619: invokespecial   agnu.<init>:(Ljava/io/InputStream;)V
        //  1622: new             Ljava/util/ArrayDeque;
        //  1625: astore          18
        //  1627: aload           18
        //  1629: bipush          20
        //  1631: invokespecial   java/util/ArrayDeque.<init>:(I)V
        //  1634: iconst_0       
        //  1635: invokestatic    java/lang/Integer.highestOneBit:(I)I
        //  1638: istore_1       
        //  1639: sipush          8192
        //  1642: sipush          128
        //  1645: iload_1        
        //  1646: iload_1        
        //  1647: iadd           
        //  1648: invokestatic    java/lang/Math.max:(II)I
        //  1651: invokestatic    java/lang/Math.min:(II)I
        //  1654: istore_1       
        //  1655: iconst_0       
        //  1656: istore_2       
        //  1657: iload_2        
        //  1658: ldc_w           2147483639
        //  1661: if_icmpge       1807
        //  1664: iload_1        
        //  1665: ldc_w           2147483639
        //  1668: iload_2        
        //  1669: isub           
        //  1670: invokestatic    java/lang/Math.min:(II)I
        //  1673: istore          4
        //  1675: iload           4
        //  1677: newarray        B
        //  1679: astore          17
        //  1681: aload           18
        //  1683: aload           17
        //  1685: invokeinterface java/util/Queue.add:(Ljava/lang/Object;)Z
        //  1690: pop            
        //  1691: iconst_0       
        //  1692: istore_3       
        //  1693: iload_3        
        //  1694: iload           4
        //  1696: if_icmpge       1743
        //  1699: aload           13
        //  1701: aload           17
        //  1703: iload_3        
        //  1704: iload           4
        //  1706: iload_3        
        //  1707: isub           
        //  1708: invokevirtual   java/io/InputStream.read:([BII)I
        //  1711: istore          5
        //  1713: iload           5
        //  1715: iconst_m1      
        //  1716: if_icmpne       1730
        //  1719: aload           18
        //  1721: iload_2        
        //  1722: invokestatic    agpx.u:(Ljava/util/Queue;I)[B
        //  1725: astore          13
        //  1727: goto            1826
        //  1730: iload_3        
        //  1731: iload           5
        //  1733: iadd           
        //  1734: istore_3       
        //  1735: iload_2        
        //  1736: iload           5
        //  1738: iadd           
        //  1739: istore_2       
        //  1740: goto            1693
        //  1743: iload_1        
        //  1744: i2l            
        //  1745: lstore          7
        //  1747: iload_1        
        //  1748: sipush          4096
        //  1751: if_icmpge       1759
        //  1754: iconst_4       
        //  1755: istore_1       
        //  1756: goto            1761
        //  1759: iconst_2       
        //  1760: istore_1       
        //  1761: lload           7
        //  1763: iload_1        
        //  1764: i2l            
        //  1765: lmul           
        //  1766: lstore          7
        //  1768: lload           7
        //  1770: ldc2_w          2147483647
        //  1773: lcmp           
        //  1774: ifle            1784
        //  1777: ldc_w           2147483647
        //  1780: istore_1       
        //  1781: goto            1657
        //  1784: lload           7
        //  1786: ldc2_w          -2147483648
        //  1789: lcmp           
        //  1790: ifge            1800
        //  1793: ldc_w           -2147483648
        //  1796: istore_1       
        //  1797: goto            1781
        //  1800: lload           7
        //  1802: l2i            
        //  1803: istore_1       
        //  1804: goto            1781
        //  1807: aload           13
        //  1809: invokevirtual   java/io/InputStream.read:()I
        //  1812: iconst_m1      
        //  1813: if_icmpne       1918
        //  1816: aload           18
        //  1818: ldc_w           2147483639
        //  1821: invokestatic    agpx.u:(Ljava/util/Queue;I)[B
        //  1824: astore          13
        //  1826: aload           16
        //  1828: ifnull          1836
        //  1831: aload           16
        //  1833: invokevirtual   java/io/InputStream.close:()V
        //  1836: aload           13
        //  1838: arraylength    
        //  1839: istore_1       
        //  1840: iload_1        
        //  1841: ldc_w           1048576
        //  1844: if_icmpgt       1902
        //  1847: aload           13
        //  1849: iconst_0       
        //  1850: iload_1        
        //  1851: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BII)Landroid/graphics/Bitmap;
        //  1854: astore          13
        //  1856: aload           13
        //  1858: ifnull          1872
        //  1861: aload           14
        //  1863: checkcast       Lnoj;
        //  1866: aload           13
        //  1868: invokevirtual   noj.b:(Ljava/lang/Object;)V
        //  1871: return         
        //  1872: new             Ljava/io/IOException;
        //  1875: astore          13
        //  1877: aload           13
        //  1879: ldc_w           "Failed to decode image: "
        //  1882: aload           15
        //  1884: checkcast       Lagog;
        //  1887: getfield        agog.a:Ljava/net/URL;
        //  1890: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1893: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1896: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1899: aload           13
        //  1901: athrow         
        //  1902: new             Ljava/io/IOException;
        //  1905: astore          13
        //  1907: aload           13
        //  1909: ldc_w           "Image exceeds max size of 1048576"
        //  1912: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1915: aload           13
        //  1917: athrow         
        //  1918: new             Ljava/lang/OutOfMemoryError;
        //  1921: astore          13
        //  1923: aload           13
        //  1925: ldc_w           "input is too large to fit in a byte array"
        //  1928: invokespecial   java/lang/OutOfMemoryError.<init>:(Ljava/lang/String;)V
        //  1931: aload           13
        //  1933: athrow         
        //  1934: astore          13
        //  1936: aload           16
        //  1938: ifnull          1985
        //  1941: aload           16
        //  1943: invokevirtual   java/io/InputStream.close:()V
        //  1946: goto            1985
        //  1949: astore          15
        //  1951: ldc_w           Ljava/lang/Throwable;.class
        //  1954: ldc_w           "addSuppressed"
        //  1957: iconst_1       
        //  1958: anewarray       Ljava/lang/Class;
        //  1961: dup            
        //  1962: iconst_0       
        //  1963: ldc_w           Ljava/lang/Throwable;.class
        //  1966: aastore        
        //  1967: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //  1970: aload           13
        //  1972: iconst_1       
        //  1973: anewarray       Ljava/lang/Object;
        //  1976: dup            
        //  1977: iconst_0       
        //  1978: aload           15
        //  1980: aastore        
        //  1981: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //  1984: pop            
        //  1985: aload           13
        //  1987: athrow         
        //  1988: new             Ljava/io/IOException;
        //  1991: astore          13
        //  1993: aload           13
        //  1995: ldc_w           "Content-Length exceeds max size of 1048576"
        //  1998: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2001: aload           13
        //  2003: athrow         
        //  2004: astore          13
        //  2006: aload           14
        //  2008: checkcast       Lnoj;
        //  2011: aload           13
        //  2013: invokevirtual   noj.a:(Ljava/lang/Exception;)V
        //  2016: return         
        //  2017: aload_0        
        //  2018: getfield        afaa.b:Ljava/lang/Object;
        //  2021: astore          13
        //  2023: aload_0        
        //  2024: getfield        afaa.a:Ljava/lang/Object;
        //  2027: astore          14
        //  2029: aload           13
        //  2031: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //  2036: checkcast       Lagme;
        //  2039: aload           14
        //  2041: checkcast       Lagmd;
        //  2044: invokeinterface agme.a:(Lagmd;)V
        //  2049: return         
        //  2050: aload_0        
        //  2051: getfield        afaa.a:Ljava/lang/Object;
        //  2054: astore          13
        //  2056: aload_0        
        //  2057: getfield        afaa.b:Ljava/lang/Object;
        //  2060: astore          14
        //  2062: aload           13
        //  2064: checkcast       Laglh;
        //  2067: aload           14
        //  2069: invokevirtual   aglh.c:(Lagmy;)V
        //  2072: return         
        //  2073: aload_0        
        //  2074: getfield        afaa.a:Ljava/lang/Object;
        //  2077: astore          13
        //  2079: aload_0        
        //  2080: getfield        afaa.b:Ljava/lang/Object;
        //  2083: astore          14
        //  2085: aload           13
        //  2087: checkcast       Laglk;
        //  2090: getfield        aglk.b:Lagmy;
        //  2093: getstatic       aglk.a:Lagmy;
        //  2096: if_acmpne       2124
        //  2099: aload           13
        //  2101: monitorenter   
        //  2102: aload           13
        //  2104: checkcast       Laglk;
        //  2107: aload           14
        //  2109: putfield        aglk.b:Lagmy;
        //  2112: aload           13
        //  2114: monitorexit    
        //  2115: return         
        //  2116: astore          14
        //  2118: aload           13
        //  2120: monitorexit    
        //  2121: aload           14
        //  2123: athrow         
        //  2124: new             Ljava/lang/IllegalStateException;
        //  2127: dup            
        //  2128: ldc_w           "provide() can be called only once."
        //  2131: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  2134: athrow         
        //  2135: aload_0        
        //  2136: getfield        afaa.b:Ljava/lang/Object;
        //  2139: checkcast       Ladgg;
        //  2142: getfield        adgg.a:Ljava/lang/Object;
        //  2145: astore          13
        //  2147: aload_0        
        //  2148: getfield        afaa.a:Ljava/lang/Object;
        //  2151: astore          14
        //  2153: aload           13
        //  2155: checkcast       Lj$/util/concurrent/ConcurrentHashMap;
        //  2158: aload           14
        //  2160: invokevirtual   j$/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2163: pop            
        //  2164: return         
        //  2165: aload_0        
        //  2166: getfield        afaa.a:Ljava/lang/Object;
        //  2169: astore          13
        //  2171: aload_0        
        //  2172: getfield        afaa.b:Ljava/lang/Object;
        //  2175: astore          14
        //  2177: aload           13
        //  2179: checkcast       Laexy;
        //  2182: invokevirtual   aexy.a:()Ljava/util/Map;
        //  2185: astore          13
        //  2187: aload           14
        //  2189: checkcast       Lauoc;
        //  2192: aload           13
        //  2194: invokevirtual   auoc.a:(Ljava/util/Map;)V
        //  2197: return         
        //  2198: astore          13
        //  2200: aload           13
        //  2202: instanceof      Ljava/io/IOException;
        //  2205: ifeq            2245
        //  2208: aload           14
        //  2210: checkcast       Lauoc;
        //  2213: getfield        auoc.b:Ljava/lang/Object;
        //  2216: astore          14
        //  2218: getstatic       io/grpc/Status.l:Lio/grpc/Status;
        //  2221: ldc_w           "Credentials failed to obtain metadata"
        //  2224: invokevirtual   io/grpc/Status.withDescription:(Ljava/lang/String;)Lio/grpc/Status;
        //  2227: aload           13
        //  2229: invokevirtual   io/grpc/Status.c:(Ljava/lang/Throwable;)Lio/grpc/Status;
        //  2232: astore          13
        //  2234: aload           14
        //  2236: checkcast       Larwp;
        //  2239: aload           13
        //  2241: invokevirtual   arwp.a:(Lio/grpc/Status;)V
        //  2244: return         
        //  2245: aload           14
        //  2247: checkcast       Lauoc;
        //  2250: getfield        auoc.b:Ljava/lang/Object;
        //  2253: astore          14
        //  2255: getstatic       io/grpc/Status.g:Lio/grpc/Status;
        //  2258: ldc_w           "Failed computing credential metadata"
        //  2261: invokevirtual   io/grpc/Status.withDescription:(Ljava/lang/String;)Lio/grpc/Status;
        //  2264: aload           13
        //  2266: invokevirtual   io/grpc/Status.c:(Ljava/lang/Throwable;)Lio/grpc/Status;
        //  2269: astore          13
        //  2271: aload           14
        //  2273: checkcast       Larwp;
        //  2276: aload           13
        //  2278: invokevirtual   arwp.a:(Lio/grpc/Status;)V
        //  2281: return         
        //  2282: aload_0        
        //  2283: getfield        afaa.a:Ljava/lang/Object;
        //  2286: astore          14
        //  2288: aload_0        
        //  2289: getfield        afaa.b:Ljava/lang/Object;
        //  2292: astore          13
        //  2294: aload           14
        //  2296: checkcast       Lcom/google/common/android/concurrent/ParcelableFuture;
        //  2299: getfield        com/google/common/android/concurrent/ParcelableFuture.b:Ljava/lang/Object;
        //  2302: checkcast       Ljava/lang/Void;
        //  2305: astore          14
        //  2307: ldc_w           "SPOTLIGHT: FutureCallbackRegistry.Callback restoring focus failed,Note: java.util.concurrent.CancellationException may be expected"
        //  2310: aload           13
        //  2312: checkcast       Ljava/lang/Throwable;
        //  2315: invokestatic    tut.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2318: return         
        //  2319: aload           14
        //  2321: checkcast       Lasas;
        //  2324: getfield        asas.m:Larwo;
        //  2327: getstatic       asas.g:Larwn;
        //  2330: invokevirtual   arwo.a:(Larwn;)Ljava/lang/Object;
        //  2333: checkcast       Ljava/lang/Integer;
        //  2336: astore          13
        //  2338: aload           14
        //  2340: monitorexit    
        //  2341: aload           13
        //  2343: ifnonnull       2360
        //  2346: getstatic       io/grpc/Status.g:Lio/grpc/Status;
        //  2349: ldc_w           "No remote UID available"
        //  2352: invokevirtual   io/grpc/Status.withDescription:(Ljava/lang/String;)Lio/grpc/Status;
        //  2355: astore          13
        //  2357: goto            2378
        //  2360: aload           14
        //  2362: checkcast       Lasas;
        //  2365: getfield        asas.b:Lasao;
        //  2368: aload           13
        //  2370: invokevirtual   java/lang/Integer.intValue:()I
        //  2373: invokevirtual   asao.a:(I)Lio/grpc/Status;
        //  2376: astore          13
        //  2378: aload           14
        //  2380: monitorenter   
        //  2381: aload           14
        //  2383: checkcast       Lasat;
        //  2386: iconst_2       
        //  2387: invokevirtual   asat.u:(I)Z
        //  2390: ifeq            2513
        //  2393: aload           13
        //  2395: invokevirtual   io/grpc/Status.f:()Z
        //  2398: ifne            2415
        //  2401: aload           14
        //  2403: checkcast       Lasat;
        //  2406: aload           13
        //  2408: iconst_1       
        //  2409: invokevirtual   asat.p:(Lio/grpc/Status;Z)V
        //  2412: goto            2513
        //  2415: aload           15
        //  2417: aload           14
        //  2419: checkcast       Lasas;
        //  2422: getfield        asas.a:Ljava/util/concurrent/Executor;
        //  2425: invokestatic    asbh.b:(Landroid/os/IBinder;Ljava/util/concurrent/Executor;)Lasbh;
        //  2428: astore          13
        //  2430: aload           14
        //  2432: checkcast       Lasat;
        //  2435: aload           13
        //  2437: putfield        asat.o:Lasbh;
        //  2440: aload           13
        //  2442: getfield        asbh.b:Landroid/os/IBinder;
        //  2445: aload           14
        //  2447: iconst_0       
        //  2448: invokeinterface android/os/IBinder.linkToDeath:(Landroid/os/IBinder$DeathRecipient;I)V
        //  2453: aload           14
        //  2455: checkcast       Lasat;
        //  2458: invokevirtual   asat.s:()Z
        //  2461: ifne            2513
        //  2464: aload           14
        //  2466: checkcast       Lasat;
        //  2469: iconst_3       
        //  2470: invokevirtual   asat.t:(I)V
        //  2473: aload           14
        //  2475: checkcast       Lasas;
        //  2478: getfield        asas.e:Lasgl;
        //  2481: invokeinterface asgl.b:()V
        //  2486: goto            2513
        //  2489: astore          13
        //  2491: getstatic       io/grpc/Status.l:Lio/grpc/Status;
        //  2494: ldc_w           "Failed to observe outgoing binder"
        //  2497: invokevirtual   io/grpc/Status.withDescription:(Ljava/lang/String;)Lio/grpc/Status;
        //  2500: astore          13
        //  2502: aload           14
        //  2504: checkcast       Lasat;
        //  2507: aload           13
        //  2509: iconst_1       
        //  2510: invokevirtual   asat.p:(Lio/grpc/Status;Z)V
        //  2513: aload           14
        //  2515: monitorexit    
        //  2516: return         
        //  2517: astore          13
        //  2519: aload           14
        //  2521: monitorexit    
        //  2522: aload           13
        //  2524: athrow         
        //  2525: astore          13
        //  2527: aload           14
        //  2529: monitorexit    
        //  2530: goto            2536
        //  2533: aload           13
        //  2535: athrow         
        //  2536: goto            2533
        //  2539: astore          15
        //  2541: goto            1985
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  528    541    1254   1259   Any
        //  541    556    1246   1254   Any
        //  558    583    1246   1254   Any
        //  583    601    1219   1227   Any
        //  606    615    1219   1227   Any
        //  619    645    1219   1227   Any
        //  651    674    1219   1227   Any
        //  679    689    1246   1254   Any
        //  692    724    1246   1254   Any
        //  727    732    1246   1254   Any
        //  735    755    1246   1254   Any
        //  763    964    1246   1254   Any
        //  979    984    1246   1254   Any
        //  987    992    1246   1254   Any
        //  995    1000   1246   1254   Any
        //  1003   1008   1246   1254   Any
        //  1008   1130   1246   1254   Any
        //  1141   1156   1246   1254   Any
        //  1156   1195   1246   1254   Any
        //  1200   1214   1246   1254   Any
        //  1221   1224   1219   1227   Any
        //  1224   1227   1246   1254   Any
        //  1231   1242   1246   1254   Any
        //  1242   1245   1246   1254   Any
        //  1248   1251   1246   1254   Any
        //  1251   1254   1254   1259   Any
        //  1431   1438   1439   1516   Any
        //  1579   1610   2004   2017   Ljava/lang/Exception;
        //  1610   1655   1934   1988   Any
        //  1664   1691   1934   1988   Any
        //  1699   1713   1934   1988   Any
        //  1719   1727   1934   1988   Any
        //  1807   1826   1934   1988   Any
        //  1831   1836   2004   2017   Ljava/lang/Exception;
        //  1836   1840   2004   2017   Ljava/lang/Exception;
        //  1847   1856   2004   2017   Ljava/lang/Exception;
        //  1861   1871   2004   2017   Ljava/lang/Exception;
        //  1872   1902   2004   2017   Ljava/lang/Exception;
        //  1902   1918   2004   2017   Ljava/lang/Exception;
        //  1918   1934   1934   1988   Any
        //  1941   1946   1949   1985   Any
        //  1951   1985   2539   2544   Ljava/lang/Exception;
        //  1985   1988   2004   2017   Ljava/lang/Exception;
        //  1988   2004   2004   2017   Ljava/lang/Exception;
        //  2102   2115   2116   2124   Any
        //  2118   2121   2116   2124   Any
        //  2177   2187   2198   2282   Any
        //  2319   2341   2525   2539   Any
        //  2381   2412   2517   2525   Any
        //  2415   2440   2517   2525   Any
        //  2440   2453   2489   2513   Landroid/os/RemoteException;
        //  2440   2453   2517   2525   Any
        //  2453   2486   2517   2525   Any
        //  2491   2513   2517   2525   Any
        //  2513   2516   2517   2525   Any
        //  2519   2522   2517   2525   Any
        //  2527   2530   2525   2539   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1985:
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
