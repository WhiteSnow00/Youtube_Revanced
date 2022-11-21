import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import android.content.Context;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpo extends adqs
{
    public static final int d = 0;
    private static final int f;
    private static final Duration g;
    private static final Duration h;
    final int a;
    final Duration b;
    final Duration c;
    private final Context i;
    private final oco k;
    private final adnm l;
    private final adms m;
    private final adnd n;
    private final arzb o;
    private final adgg p;
    
    static {
        f = (int)tqf.W(10L);
        g = Duration.ofSeconds(2L);
        h = Duration.ofSeconds(1L);
    }
    
    public adpo(final Context i, final oco k, final arzb o, final adnm l, final adgg p16, final adgg adgg, final adms m, final adnd n, final aheu aheu, final aheu aheu2, final adgg adgg2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(apki.c, k, o, adgg, n, aheu, aheu2, adgg2, null, null, null, null, null);
        this.a = adpo.f;
        this.b = adpo.g;
        this.c = adpo.h;
        this.i = i;
        this.k = k;
        this.o = o;
        this.l = l;
        this.p = p16;
        this.m = m;
        this.n = n;
    }
    
    private static void s(final File file, final long n) {
        if (file.getFreeSpace() >= n) {
            return;
        }
        throw admc.a(apkh.z);
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.l;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.E) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String p0, final admj p1, final adoj p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        adpo.k:Loco;
        //     4: invokeinterface oco.c:()J
        //     9: lstore          17
        //    11: aload_3        
        //    12: getfield        adoj.I:J
        //    15: lstore          19
        //    17: aload_0        
        //    18: getfield        adpo.p:Ladgg;
        //    21: aload_3        
        //    22: aconst_null    
        //    23: invokevirtual   adgg.y:(Ladoj;Ladou;)Laqzg;
        //    26: astore          31
        //    28: aload_3        
        //    29: invokestatic    adgg.p:(Ladoj;)Ljava/io/File;
        //    32: astore          33
        //    34: new             Ljava/io/File;
        //    37: dup            
        //    38: aload           33
        //    40: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    43: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    46: ldc             "/copy"
        //    48: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    51: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    54: astore          34
        //    56: aload_3        
        //    57: getfield        adoj.J:Z
        //    60: ifeq            86
        //    63: aload           34
        //    65: invokevirtual   java/io/File.delete:()Z
        //    68: pop            
        //    69: aload_2        
        //    70: aload_3        
        //    71: getfield        adoj.k:Ljava/lang/String;
        //    74: new             Ladml;
        //    77: dup            
        //    78: iconst_2       
        //    79: invokespecial   adml.<init>:(I)V
        //    82: invokevirtual   admj.a:(Ljava/lang/String;Ladmm;)Ladne;
        //    85: pop            
        //    86: aload_3        
        //    87: getfield        adoj.G:J
        //    90: lstore          5
        //    92: aload           31
        //    94: invokeinterface aqzg.a:()J
        //    99: lstore          7
        //   101: aload           34
        //   103: invokevirtual   java/io/File.length:()J
        //   106: lstore          9
        //   108: lload           5
        //   110: lstore          13
        //   112: lload           9
        //   114: lload           5
        //   116: lcmp           
        //   117: ifge            148
        //   120: aload           34
        //   122: invokevirtual   java/io/File.delete:()Z
        //   125: pop            
        //   126: aload_2        
        //   127: aload_3        
        //   128: getfield        adoj.k:Ljava/lang/String;
        //   131: new             Ladpm;
        //   134: dup            
        //   135: lconst_0       
        //   136: lload           7
        //   138: invokespecial   adpm.<init>:(JJ)V
        //   141: invokevirtual   admj.a:(Ljava/lang/String;Ladmm;)Ladne;
        //   144: pop            
        //   145: lconst_0       
        //   146: lstore          13
        //   148: new             Ljava/io/RandomAccessFile;
        //   151: dup            
        //   152: aload           34
        //   154: ldc             "rw"
        //   156: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   159: astore          29
        //   161: lload           7
        //   163: ldc2_w          -1
        //   166: lcmp           
        //   167: ifne            173
        //   170: goto            338
        //   173: aload_0        
        //   174: getfield        adpo.o:Larzb;
        //   177: invokevirtual   arzb.f:()Lakeo;
        //   180: getfield        akeo.h:Lapkz;
        //   183: astore          32
        //   185: aload           32
        //   187: astore          30
        //   189: aload           32
        //   191: ifnonnull       209
        //   194: getstatic       apkz.a:Lapkz;
        //   197: astore          30
        //   199: goto            209
        //   202: astore_1       
        //   203: aload           29
        //   205: astore_2       
        //   206: goto            1092
        //   209: lload           7
        //   211: aload           30
        //   213: getfield        apkz.j:J
        //   216: lcmp           
        //   217: ifgt            1078
        //   220: aload           34
        //   222: invokevirtual   java/io/File.length:()J
        //   225: lstore          5
        //   227: lload           7
        //   229: lload           5
        //   231: lsub           
        //   232: lstore          5
        //   234: lload           5
        //   236: lconst_0       
        //   237: lcmp           
        //   238: ifle            338
        //   241: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   244: bipush          27
        //   246: if_icmplt       331
        //   249: aload_0        
        //   250: getfield        adpo.i:Landroid/content/Context;
        //   253: ldc             Landroid/os/storage/StorageManager;.class
        //   255: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/Class;)Ljava/lang/Object;
        //   258: checkcast       Landroid/os/storage/StorageManager;
        //   261: astore          30
        //   263: aload           30
        //   265: aload           34
        //   267: invokevirtual   android/os/storage/StorageManager.getUuidForPath:(Ljava/io/File;)Ljava/util/UUID;
        //   270: astore          32
        //   272: aload           29
        //   274: invokevirtual   java/io/RandomAccessFile.getFD:()Ljava/io/FileDescriptor;
        //   277: astore          34
        //   279: aload           30
        //   281: aload           34
        //   283: invokevirtual   android/os/storage/StorageManager.isAllocationSupported:(Ljava/io/FileDescriptor;)Z
        //   286: ifeq            321
        //   289: aload           30
        //   291: aload           32
        //   293: invokevirtual   android/os/storage/StorageManager.getAllocatableBytes:(Ljava/util/UUID;)J
        //   296: lload           5
        //   298: lcmp           
        //   299: ifle            314
        //   302: aload           30
        //   304: aload           34
        //   306: lload           5
        //   308: invokevirtual   android/os/storage/StorageManager.allocateBytes:(Ljava/io/FileDescriptor;J)V
        //   311: goto            338
        //   314: getstatic       apkh.z:Lapkh;
        //   317: invokestatic    admc.a:(Lapkh;)Ladmc;
        //   320: athrow         
        //   321: aload           33
        //   323: lload           5
        //   325: invokestatic    adpo.s:(Ljava/io/File;J)V
        //   328: goto            338
        //   331: aload           33
        //   333: lload           5
        //   335: invokestatic    adpo.s:(Ljava/io/File;J)V
        //   338: aload           31
        //   340: lload           13
        //   342: invokeinterface aqzg.f:(J)J
        //   347: pop2           
        //   348: aload           29
        //   350: lload           13
        //   352: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   355: sipush          4096
        //   358: newarray        B
        //   360: astore          32
        //   362: lload           17
        //   364: lstore          15
        //   366: lload           13
        //   368: lstore          11
        //   370: lload           11
        //   372: lstore          9
        //   374: lconst_0       
        //   375: lstore          23
        //   377: lconst_0       
        //   378: lstore          5
        //   380: lload           11
        //   382: lstore          25
        //   384: aload           31
        //   386: astore          30
        //   388: aload           32
        //   390: astore          31
        //   392: aload           30
        //   394: invokeinterface aqzg.i:()Z
        //   399: ifeq            837
        //   402: aload           30
        //   404: aload           31
        //   406: iconst_0       
        //   407: sipush          4096
        //   410: invokeinterface aqzg.b:([BII)I
        //   415: istore          4
        //   417: iload           4
        //   419: ifgt            425
        //   422: goto            837
        //   425: aload           29
        //   427: aload           31
        //   429: iconst_0       
        //   430: iload           4
        //   432: invokevirtual   java/io/RandomAccessFile.write:([BII)V
        //   435: lload           9
        //   437: iload           4
        //   439: i2l            
        //   440: ladd           
        //   441: lstore          11
        //   443: aload_0        
        //   444: getfield        adpo.o:Larzb;
        //   447: invokevirtual   arzb.f:()Lakeo;
        //   450: getfield        akeo.h:Lapkz;
        //   453: astore          33
        //   455: aload           33
        //   457: astore          32
        //   459: aload           33
        //   461: ifnonnull       469
        //   464: getstatic       apkz.a:Lapkz;
        //   467: astore          32
        //   469: lload           11
        //   471: aload           32
        //   473: getfield        apkz.j:J
        //   476: lcmp           
        //   477: ifgt            803
        //   480: aload_0        
        //   481: getfield        adpo.k:Loco;
        //   484: invokeinterface oco.c:()J
        //   489: lstore          21
        //   491: lload           5
        //   493: lstore          9
        //   495: lload           5
        //   497: lconst_0       
        //   498: lcmp           
        //   499: ifne            509
        //   502: lload           21
        //   504: lload           17
        //   506: lsub           
        //   507: lstore          9
        //   509: aload_0        
        //   510: getfield        adpo.a:I
        //   513: istore          4
        //   515: lload           11
        //   517: lload           25
        //   519: lsub           
        //   520: iload           4
        //   522: i2l            
        //   523: lcmp           
        //   524: iflt            631
        //   527: aload_3        
        //   528: getfield        adoj.k:Ljava/lang/String;
        //   531: astore          32
        //   533: new             Ladpm;
        //   536: astore          33
        //   538: aload           33
        //   540: lload           11
        //   542: lload           7
        //   544: invokespecial   adpm.<init>:(JJ)V
        //   547: aload_2        
        //   548: aload           32
        //   550: aload           33
        //   552: invokevirtual   admj.a:(Ljava/lang/String;Ladmm;)Ladne;
        //   555: pop            
        //   556: lload           21
        //   558: lload           23
        //   560: lsub           
        //   561: aload_0        
        //   562: getfield        adpo.c:Lj$/time/Duration;
        //   565: invokevirtual   j$/time/Duration.toMillis:()J
        //   568: lcmp           
        //   569: iflt            620
        //   572: aload_0        
        //   573: getfield        adpo.m:Ladms;
        //   576: astore          32
        //   578: lload           7
        //   580: ldc2_w          -1
        //   583: lcmp           
        //   584: ifne            595
        //   587: ldc2_w          -1
        //   590: lstore          5
        //   592: goto            599
        //   595: lload           7
        //   597: lstore          5
        //   599: aload           32
        //   601: aload_1        
        //   602: lload           11
        //   604: lload           5
        //   606: invokevirtual   adms.b:(Ljava/lang/String;JJ)V
        //   609: lload           11
        //   611: lstore          5
        //   613: lload           21
        //   615: lstore          23
        //   617: goto            635
        //   620: lload           11
        //   622: lstore          5
        //   624: goto            635
        //   627: astore_2       
        //   628: goto            796
        //   631: lload           25
        //   633: lstore          5
        //   635: lload           21
        //   637: lload           15
        //   639: lsub           
        //   640: lstore          27
        //   642: aload_0        
        //   643: getfield        adpo.b:Lj$/time/Duration;
        //   646: invokevirtual   j$/time/Duration.toMillis:()J
        //   649: lstore          25
        //   651: lload           27
        //   653: lload           25
        //   655: lcmp           
        //   656: iflt            712
        //   659: lload           19
        //   661: lload           27
        //   663: ladd           
        //   664: lstore          19
        //   666: lload           9
        //   668: lstore          15
        //   670: aload_3        
        //   671: getfield        adoj.k:Ljava/lang/String;
        //   674: astore          33
        //   676: lload           9
        //   678: lstore          15
        //   680: new             Ladpn;
        //   683: astore          32
        //   685: lload           9
        //   687: lstore          15
        //   689: aload           32
        //   691: lload           19
        //   693: invokespecial   adpn.<init>:(J)V
        //   696: lload           9
        //   698: lstore          15
        //   700: aload_2        
        //   701: aload           33
        //   703: aload           32
        //   705: invokevirtual   admj.a:(Ljava/lang/String;Ladmm;)Ladne;
        //   708: pop            
        //   709: goto            716
        //   712: lload           15
        //   714: lstore          21
        //   716: lload           9
        //   718: lstore          15
        //   720: aload_0        
        //   721: getfield        adpo.o:Larzb;
        //   724: invokevirtual   arzb.f:()Lakeo;
        //   727: getfield        akeo.h:Lapkz;
        //   730: astore          33
        //   732: aload           33
        //   734: astore          32
        //   736: aload           33
        //   738: ifnonnull       750
        //   741: lload           9
        //   743: lstore          15
        //   745: getstatic       apkz.a:Lapkz;
        //   748: astore          32
        //   750: lload           9
        //   752: lstore          15
        //   754: lload           19
        //   756: aload           32
        //   758: getfield        apkz.k:J
        //   761: lcmp           
        //   762: ifgt            784
        //   765: lload           5
        //   767: lstore          25
        //   769: lload           21
        //   771: lstore          15
        //   773: lload           9
        //   775: lstore          5
        //   777: lload           11
        //   779: lstore          9
        //   781: goto            392
        //   784: lload           9
        //   786: lstore          15
        //   788: getstatic       apkh.B:Lapkh;
        //   791: invokestatic    admc.a:(Lapkh;)Ladmc;
        //   794: athrow         
        //   795: astore_2       
        //   796: lload           9
        //   798: lstore          5
        //   800: goto            827
        //   803: lload           5
        //   805: lstore          15
        //   807: getstatic       apkh.D:Lapkh;
        //   810: invokestatic    admc.a:(Lapkh;)Ladmc;
        //   813: athrow         
        //   814: astore_2       
        //   815: lload           15
        //   817: lstore          5
        //   819: goto            827
        //   822: astore_2       
        //   823: goto            827
        //   826: astore_2       
        //   827: lload           11
        //   829: lstore          9
        //   831: aload_2        
        //   832: astore          30
        //   834: goto            1000
        //   837: aload           29
        //   839: astore          30
        //   841: lload           7
        //   843: ldc2_w          -1
        //   846: lcmp           
        //   847: ifne            857
        //   850: lload           9
        //   852: lstore          7
        //   854: goto            865
        //   857: lload           7
        //   859: lload           9
        //   861: lcmp           
        //   862: ifne            987
        //   865: lload           7
        //   867: lstore          11
        //   869: aload_0        
        //   870: getfield        adpo.m:Ladms;
        //   873: aload_1        
        //   874: lload           9
        //   876: lload           9
        //   878: invokevirtual   adms.b:(Ljava/lang/String;JJ)V
        //   881: lload           7
        //   883: lstore          11
        //   885: aload_0        
        //   886: aload_0        
        //   887: getfield        adpo.e:Ladgg;
        //   890: invokevirtual   adgg.n:()Ladog;
        //   893: iconst_1       
        //   894: getstatic       adpl.a:Ladpl;
        //   897: invokevirtual   adrh.u:(Ladog;ZLasmi;)Ladmm;
        //   900: invokestatic    afxr.l:(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   903: astore          31
        //   905: aload           30
        //   907: astore_2       
        //   908: aload_0        
        //   909: getfield        adpo.n:Ladnd;
        //   912: astore          29
        //   914: aload           30
        //   916: astore_2       
        //   917: aload_3        
        //   918: getfield        adoj.e:Ljava/lang/String;
        //   921: astore_3       
        //   922: lload           7
        //   924: ldc2_w          -1
        //   927: lcmp           
        //   928: ifne            937
        //   931: lconst_0       
        //   932: lstore          7
        //   934: goto            937
        //   937: aload           30
        //   939: astore_2       
        //   940: aload           29
        //   942: aload_1        
        //   943: aload_3        
        //   944: lload           7
        //   946: lload           9
        //   948: lload           13
        //   950: lsub           
        //   951: lload           13
        //   953: aload_0        
        //   954: getfield        adpo.k:Loco;
        //   957: invokeinterface oco.c:()J
        //   962: lload           17
        //   964: lsub           
        //   965: lload           5
        //   967: invokevirtual   adnd.c:(Ljava/lang/String;Ljava/lang/String;JJJJJ)V
        //   970: aload           30
        //   972: invokevirtual   java/io/RandomAccessFile.close:()V
        //   975: aload           31
        //   977: areturn        
        //   978: astore          30
        //   980: lload           11
        //   982: lstore          7
        //   984: goto            1000
        //   987: lload           7
        //   989: lstore          11
        //   991: getstatic       apkh.A:Lapkh;
        //   994: invokestatic    admc.a:(Lapkh;)Ladmc;
        //   997: athrow         
        //   998: astore          30
        //  1000: aload           29
        //  1002: astore_2       
        //  1003: aload_0        
        //  1004: getfield        adpo.n:Ladnd;
        //  1007: astore          31
        //  1009: aload           29
        //  1011: astore_2       
        //  1012: aload_3        
        //  1013: getfield        adoj.e:Ljava/lang/String;
        //  1016: astore_3       
        //  1017: lload           7
        //  1019: ldc2_w          -1
        //  1022: lcmp           
        //  1023: ifne            1032
        //  1026: lconst_0       
        //  1027: lstore          7
        //  1029: goto            1032
        //  1032: aload           29
        //  1034: astore_2       
        //  1035: aload           31
        //  1037: aload_1        
        //  1038: aload_3        
        //  1039: lload           7
        //  1041: lload           9
        //  1043: lload           13
        //  1045: lsub           
        //  1046: lload           13
        //  1048: aload_0        
        //  1049: getfield        adpo.k:Loco;
        //  1052: invokeinterface oco.c:()J
        //  1057: lload           17
        //  1059: lsub           
        //  1060: lload           5
        //  1062: invokevirtual   adnd.c:(Ljava/lang/String;Ljava/lang/String;JJJJJ)V
        //  1065: aload           29
        //  1067: astore_2       
        //  1068: aload           30
        //  1070: athrow         
        //  1071: astore_1       
        //  1072: aload           29
        //  1074: astore_2       
        //  1075: goto            1092
        //  1078: aload           29
        //  1080: astore_2       
        //  1081: getstatic       apkh.C:Lapkh;
        //  1084: invokestatic    admc.a:(Lapkh;)Ladmc;
        //  1087: athrow         
        //  1088: astore_1       
        //  1089: goto            1075
        //  1092: aload_2        
        //  1093: invokevirtual   java/io/RandomAccessFile.close:()V
        //  1096: goto            1132
        //  1099: astore_2       
        //  1100: ldc_w           Ljava/lang/Throwable;.class
        //  1103: ldc_w           "addSuppressed"
        //  1106: iconst_1       
        //  1107: anewarray       Ljava/lang/Class;
        //  1110: dup            
        //  1111: iconst_0       
        //  1112: ldc_w           Ljava/lang/Throwable;.class
        //  1115: aastore        
        //  1116: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //  1119: aload_1        
        //  1120: iconst_1       
        //  1121: anewarray       Ljava/lang/Object;
        //  1124: dup            
        //  1125: iconst_0       
        //  1126: aload_2        
        //  1127: aastore        
        //  1128: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //  1131: pop            
        //  1132: goto            1137
        //  1135: aload_1        
        //  1136: athrow         
        //  1137: goto            1135
        //  1140: astore_2       
        //  1141: goto            1132
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  173    185    1071   1075   Any
        //  194    199    202    209    Any
        //  209    227    1071   1075   Any
        //  241    311    202    209    Any
        //  314    321    202    209    Any
        //  321    328    202    209    Any
        //  331    338    202    209    Any
        //  338    362    1071   1075   Any
        //  392    417    998    1000   Any
        //  425    435    998    1000   Any
        //  443    455    826    827    Any
        //  464    469    826    827    Any
        //  469    491    822    826    Any
        //  509    515    795    796    Any
        //  527    578    627    631    Any
        //  599    609    627    631    Any
        //  642    651    627    631    Any
        //  670    676    814    822    Any
        //  680    685    814    822    Any
        //  689    696    814    822    Any
        //  700    709    814    822    Any
        //  720    732    814    822    Any
        //  745    750    814    822    Any
        //  754    765    814    822    Any
        //  788    795    814    822    Any
        //  807    814    814    822    Any
        //  869    881    978    987    Any
        //  885    905    978    987    Any
        //  908    914    1088   1092   Any
        //  917    922    1088   1092   Any
        //  940    970    1088   1092   Any
        //  991    998    978    987    Any
        //  1003   1009   1088   1092   Any
        //  1012   1017   1088   1092   Any
        //  1035   1065   1088   1092   Any
        //  1068   1071   1088   1092   Any
        //  1081   1088   1088   1092   Any
        //  1092   1096   1099   1132   Any
        //  1100   1132   1140   1144   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0712:
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
    
    public final asme f() {
        return adlg.n;
    }
    
    public final String g() {
        return "CopyFileTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adoj adoj) {
        final int b = adoj.b;
        return (b & 0x2) != 0x0 && (b & 0x40) != 0x0;
    }
}
