import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfc implements Runnable, Comparable, dey, dpl
{
    private int A;
    private final adnp B;
    public final dfa a;
    public dbx b;
    public ddj c;
    public dbz d;
    public int e;
    public int f;
    public dfh g;
    public ddo h;
    public dfb i;
    public int j;
    public ddj k;
    public volatile dez l;
    public volatile boolean m;
    public int n;
    public final dfk o;
    public final pa p;
    public final aujv q;
    private final List r;
    private final akq s;
    private Thread t;
    private ddj u;
    private Object v;
    private ddx w;
    private volatile boolean x;
    private boolean y;
    private int z;
    
    public dfc(final dfk o, final akq s) {
        this.a = new dfa();
        this.r = new ArrayList();
        this.B = adnp.c();
        this.p = new pa((byte[])null);
        this.q = new aujv();
        this.o = o;
        this.s = s;
    }
    
    private final int g() {
        return this.d.ordinal();
    }
    
    private final dez h() {
        final int z = this.z;
        final int n = z - 1;
        if (z == 0) {
            throw null;
        }
        if (n == 1) {
            return (dez)new dfy(this.a, (dey)this);
        }
        if (n == 2) {
            final dfa a = this.a;
            return (dez)new dew(a.e(), a, (dey)this);
        }
        if (n == 3) {
            return (dez)new dgb(this.a, (dey)this);
        }
        if (n == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(ckl.a(z)));
    }
    
    private final void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dfc.w:Lddx;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        dfc.v:Ljava/lang/Object;
        //     9: astore_2       
        //    10: aload_0        
        //    11: getfield        dfc.A:I
        //    14: istore_3       
        //    15: aload_2        
        //    16: ifnonnull       31
        //    19: aload_1        
        //    20: invokeinterface ddx.d:()V
        //    25: aconst_null    
        //    26: astore          4
        //    28: goto            980
        //    31: invokestatic    dpb.b:()J
        //    34: pop2           
        //    35: aload_0        
        //    36: getfield        dfc.a:Ldfa;
        //    39: aload_2        
        //    40: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    43: invokevirtual   dfa.b:(Ljava/lang/Class;)Ldfv;
        //    46: astore          5
        //    48: aload_0        
        //    49: getfield        dfc.h:Lddo;
        //    52: astore          4
        //    54: iload_3        
        //    55: iconst_4       
        //    56: if_icmpeq       78
        //    59: aload_0        
        //    60: getfield        dfc.a:Ldfa;
        //    63: getfield        dfa.q:Z
        //    66: ifeq            72
        //    69: goto            78
        //    72: iconst_0       
        //    73: istore          6
        //    75: goto            81
        //    78: iconst_1       
        //    79: istore          6
        //    81: aload           4
        //    83: getstatic       dka.d:Lddn;
        //    86: invokevirtual   ddo.b:(Lddn;)Ljava/lang/Object;
        //    89: checkcast       Ljava/lang/Boolean;
        //    92: astore          7
        //    94: iload           6
        //    96: istore          8
        //    98: aload           7
        //   100: ifnull          130
        //   103: aload           4
        //   105: astore          9
        //   107: aload           7
        //   109: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   112: ifeq            162
        //   115: iload           6
        //   117: ifeq            127
        //   120: aload           4
        //   122: astore          9
        //   124: goto            162
        //   127: iconst_0       
        //   128: istore          8
        //   130: new             Lddo;
        //   133: astore          9
        //   135: aload           9
        //   137: invokespecial   ddo.<init>:()V
        //   140: aload           9
        //   142: aload_0        
        //   143: getfield        dfc.h:Lddo;
        //   146: invokevirtual   ddo.c:(Lddo;)V
        //   149: aload           9
        //   151: getstatic       dka.d:Lddn;
        //   154: iload           8
        //   156: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   159: invokevirtual   ddo.d:(Lddn;Ljava/lang/Object;)V
        //   162: aload_0        
        //   163: getfield        dfc.b:Ldbx;
        //   166: invokevirtual   dbx.a:()Ldcf;
        //   169: aload_2        
        //   170: invokevirtual   dcf.a:(Ljava/lang/Object;)Lddz;
        //   173: astore          10
        //   175: aload_0        
        //   176: getfield        dfc.e:I
        //   179: istore          11
        //   181: aload_0        
        //   182: getfield        dfc.f:I
        //   185: istore          12
        //   187: aload           5
        //   189: getfield        dfv.a:Lakq;
        //   192: invokeinterface akq.a:()Ljava/lang/Object;
        //   197: checkcast       Ljava/util/List;
        //   200: astore          4
        //   202: aload           4
        //   204: invokestatic    cll.h:(Ljava/lang/Object;)Ljava/lang/Object;
        //   207: pop            
        //   208: aload           4
        //   210: astore          7
        //   212: aload           5
        //   214: getfield        dfv.b:Ljava/util/List;
        //   217: invokeinterface java/util/List.size:()I
        //   222: istore          13
        //   224: iconst_0       
        //   225: istore          14
        //   227: aconst_null    
        //   228: astore_2       
        //   229: iload           14
        //   231: iload           13
        //   233: if_icmpge       825
        //   236: aload           4
        //   238: astore          7
        //   240: aload           5
        //   242: getfield        dfv.b:Ljava/util/List;
        //   245: iload           14
        //   247: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   252: checkcast       Ldfd;
        //   255: astore          15
        //   257: aload           4
        //   259: astore          7
        //   261: aload           15
        //   263: getfield        dfd.b:Lakq;
        //   266: invokeinterface akq.a:()Ljava/lang/Object;
        //   271: checkcast       Ljava/util/List;
        //   274: astore          16
        //   276: aload           4
        //   278: astore          7
        //   280: aload           16
        //   282: invokestatic    cll.h:(Ljava/lang/Object;)Ljava/lang/Object;
        //   285: pop            
        //   286: aload           15
        //   288: aload           10
        //   290: iload           11
        //   292: iload           12
        //   294: aload           9
        //   296: aload           16
        //   298: invokevirtual   dfd.a:(Lddz;IILddo;Ljava/util/List;)Ldfx;
        //   301: astore          17
        //   303: aload           15
        //   305: getfield        dfd.b:Lakq;
        //   308: aload           16
        //   310: invokeinterface akq.b:(Ljava/lang/Object;)Z
        //   315: pop            
        //   316: aload           17
        //   318: invokeinterface dfx.c:()Ljava/lang/Object;
        //   323: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   326: astore          18
        //   328: iload_3        
        //   329: iconst_4       
        //   330: if_icmpeq       370
        //   333: aload_0        
        //   334: getfield        dfc.a:Ldfa;
        //   337: aload           18
        //   339: invokevirtual   dfa.a:(Ljava/lang/Class;)Ldds;
        //   342: astore          16
        //   344: aload           16
        //   346: aload_0        
        //   347: getfield        dfc.b:Ldbx;
        //   350: aload           17
        //   352: aload_0        
        //   353: getfield        dfc.e:I
        //   356: aload_0        
        //   357: getfield        dfc.f:I
        //   360: invokeinterface dds.b:(Landroid/content/Context;Ldfx;II)Ldfx;
        //   365: astore          7
        //   367: goto            377
        //   370: aload           17
        //   372: astore          7
        //   374: aconst_null    
        //   375: astore          16
        //   377: aload           17
        //   379: aload           7
        //   381: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   384: ifne            394
        //   387: aload           17
        //   389: invokeinterface dfx.e:()V
        //   394: aload_0        
        //   395: getfield        dfc.a:Ldfa;
        //   398: getfield        dfa.c:Ldbx;
        //   401: invokevirtual   dbx.a:()Ldcf;
        //   404: getfield        dcf.g:Lbhu;
        //   407: aload           7
        //   409: invokeinterface dfx.b:()Ljava/lang/Class;
        //   414: invokevirtual   bhu.o:(Ljava/lang/Class;)Lddr;
        //   417: ifnull          482
        //   420: aload_0        
        //   421: getfield        dfc.a:Ldfa;
        //   424: getfield        dfa.c:Ldbx;
        //   427: invokevirtual   dbx.a:()Ldcf;
        //   430: getfield        dcf.g:Lbhu;
        //   433: aload           7
        //   435: invokeinterface dfx.b:()Ljava/lang/Class;
        //   440: invokevirtual   bhu.o:(Ljava/lang/Class;)Lddr;
        //   443: astore          17
        //   445: aload           17
        //   447: ifnull          462
        //   450: aload           17
        //   452: invokeinterface ddr.b:()I
        //   457: istore          19
        //   459: goto            488
        //   462: new             Ldcd;
        //   465: astore          16
        //   467: aload           16
        //   469: aload           7
        //   471: invokeinterface dfx.b:()Ljava/lang/Class;
        //   476: invokespecial   dcd.<init>:(Ljava/lang/Class;)V
        //   479: aload           16
        //   481: athrow         
        //   482: iconst_3       
        //   483: istore          19
        //   485: aconst_null    
        //   486: astore          17
        //   488: aload_0        
        //   489: getfield        dfc.a:Ldfa;
        //   492: astore          20
        //   494: aload_0        
        //   495: getfield        dfc.k:Lddj;
        //   498: astore          21
        //   500: aload           20
        //   502: invokevirtual   dfa.f:()Ljava/util/List;
        //   505: astore          20
        //   507: aload           20
        //   509: invokeinterface java/util/List.size:()I
        //   514: istore          22
        //   516: iconst_0       
        //   517: istore          23
        //   519: iload           23
        //   521: iload           22
        //   523: if_icmpge       561
        //   526: aload           20
        //   528: iload           23
        //   530: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   535: checkcast       Lalm;
        //   538: getfield        alm.a:Ljava/lang/Object;
        //   541: aload           21
        //   543: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   546: ifeq            555
        //   549: iconst_1       
        //   550: istore          22
        //   552: goto            564
        //   555: iinc            23, 1
        //   558: goto            519
        //   561: iconst_0       
        //   562: istore          22
        //   564: aload_0        
        //   565: getfield        dfc.g:Ldfh;
        //   568: iload           22
        //   570: iconst_1       
        //   571: ixor           
        //   572: iload_3        
        //   573: iload           19
        //   575: invokevirtual   dfh.d:(ZII)Z
        //   578: ifeq            738
        //   581: aload           17
        //   583: ifnull          715
        //   586: iload           19
        //   588: iconst_1       
        //   589: isub           
        //   590: ifeq            661
        //   593: new             Ldfz;
        //   596: astore          21
        //   598: aload_0        
        //   599: getfield        dfc.a:Ldfa;
        //   602: invokevirtual   dfa.c:()Ldgd;
        //   605: astore          20
        //   607: aload_0        
        //   608: getfield        dfc.k:Lddj;
        //   611: astore          24
        //   613: aload_0        
        //   614: getfield        dfc.c:Lddj;
        //   617: astore          25
        //   619: aload_0        
        //   620: getfield        dfc.e:I
        //   623: istore          22
        //   625: aload_0        
        //   626: getfield        dfc.f:I
        //   629: istore          19
        //   631: aload           21
        //   633: aload           20
        //   635: aload           24
        //   637: aload           25
        //   639: iload           22
        //   641: iload           19
        //   643: aload           16
        //   645: aload           18
        //   647: aload_0        
        //   648: getfield        dfc.h:Lddo;
        //   651: invokespecial   dfz.<init>:(Ldgd;Lddj;Lddj;IILdds;Ljava/lang/Class;Lddo;)V
        //   654: aload           21
        //   656: astore          16
        //   658: goto            678
        //   661: new             Ldex;
        //   664: dup            
        //   665: aload_0        
        //   666: getfield        dfc.k:Lddj;
        //   669: aload_0        
        //   670: getfield        dfc.c:Lddj;
        //   673: invokespecial   dex.<init>:(Lddj;Lddj;)V
        //   676: astore          16
        //   678: aload           7
        //   680: invokestatic    dfw.d:(Ldfx;)Ldfw;
        //   683: astore          7
        //   685: aload_0        
        //   686: getfield        dfc.p:Lpa;
        //   689: astore          21
        //   691: aload           21
        //   693: aload           16
        //   695: putfield        pa.b:Ljava/lang/Object;
        //   698: aload           21
        //   700: aload           17
        //   702: putfield        pa.a:Ljava/lang/Object;
        //   705: aload           21
        //   707: aload           7
        //   709: putfield        pa.c:Ljava/lang/Object;
        //   712: goto            738
        //   715: new             Ldcd;
        //   718: astore          16
        //   720: aload           16
        //   722: aload           7
        //   724: invokeinterface dfx.c:()Ljava/lang/Object;
        //   729: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   732: invokespecial   dcd.<init>:(Ljava/lang/Class;)V
        //   735: aload           16
        //   737: athrow         
        //   738: aload           15
        //   740: getfield        dfd.a:Ldlt;
        //   743: aload           7
        //   745: aload           9
        //   747: invokeinterface dlt.a:(Ldfx;Lddo;)Ldfx;
        //   752: astore          7
        //   754: aload           7
        //   756: astore_2       
        //   757: goto            812
        //   760: astore          7
        //   762: goto            797
        //   765: astore          7
        //   767: aload           15
        //   769: getfield        dfd.b:Lakq;
        //   772: aload           16
        //   774: invokeinterface akq.b:(Ljava/lang/Object;)Z
        //   779: pop            
        //   780: aload           7
        //   782: athrow         
        //   783: astore          7
        //   785: aload           4
        //   787: astore_2       
        //   788: aload           7
        //   790: astore          4
        //   792: goto            911
        //   795: astore          7
        //   797: goto            802
        //   800: astore          7
        //   802: aload           4
        //   804: aload           7
        //   806: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   811: pop            
        //   812: aload_2        
        //   813: ifnull          819
        //   816: goto            825
        //   819: iinc            14, 1
        //   822: goto            229
        //   825: aload           4
        //   827: astore          7
        //   829: aload_2        
        //   830: ifnull          865
        //   833: aload           5
        //   835: getfield        dfv.a:Lakq;
        //   838: aload           7
        //   840: invokeinterface akq.b:(Ljava/lang/Object;)Z
        //   845: pop            
        //   846: aload           10
        //   848: invokeinterface ddz.b:()V
        //   853: aload_1        
        //   854: invokeinterface ddx.d:()V
        //   859: aload_2        
        //   860: astore          4
        //   862: goto            28
        //   865: new             Ldft;
        //   868: astore_2       
        //   869: aload           5
        //   871: getfield        dfv.c:Ljava/lang/String;
        //   874: astore          9
        //   876: new             Ljava/util/ArrayList;
        //   879: astore          16
        //   881: aload           16
        //   883: aload           7
        //   885: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   888: aload_2        
        //   889: aload           9
        //   891: aload           16
        //   893: invokespecial   dft.<init>:(Ljava/lang/String;Ljava/util/List;)V
        //   896: aload_2        
        //   897: athrow         
        //   898: aload           4
        //   900: astore_2       
        //   901: astore          4
        //   903: goto            911
        //   906: astore          4
        //   908: aload           7
        //   910: astore_2       
        //   911: aload           5
        //   913: getfield        dfv.a:Lakq;
        //   916: aload_2        
        //   917: invokeinterface akq.b:(Ljava/lang/Object;)Z
        //   922: pop            
        //   923: aload           4
        //   925: athrow         
        //   926: astore          4
        //   928: aload           10
        //   930: invokeinterface ddz.b:()V
        //   935: aload           4
        //   937: athrow         
        //   938: astore          4
        //   940: aload_1        
        //   941: invokeinterface ddx.d:()V
        //   946: aload           4
        //   948: athrow         
        //   949: astore          4
        //   951: aload           4
        //   953: aload_0        
        //   954: getfield        dfc.u:Lddj;
        //   957: aload_0        
        //   958: getfield        dfc.A:I
        //   961: aconst_null    
        //   962: invokevirtual   dft.b:(Lddj;ILjava/lang/Class;)V
        //   965: aload_0        
        //   966: getfield        dfc.r:Ljava/util/List;
        //   969: aload           4
        //   971: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   976: pop            
        //   977: aconst_null    
        //   978: astore          4
        //   980: aconst_null    
        //   981: astore_2       
        //   982: aload           4
        //   984: ifnull          1574
        //   987: aload_0        
        //   988: getfield        dfc.A:I
        //   991: istore          12
        //   993: aload           4
        //   995: instanceof      Ldfu;
        //   998: ifeq            1011
        //  1001: aload           4
        //  1003: checkcast       Ldfu;
        //  1006: invokeinterface dfu.d:()V
        //  1011: aload           4
        //  1013: astore          7
        //  1015: aload_0        
        //  1016: getfield        dfc.p:Lpa;
        //  1019: invokevirtual   pa.b:()Z
        //  1022: ifeq            1035
        //  1025: aload           4
        //  1027: invokestatic    dfw.d:(Ldfx;)Ldfw;
        //  1030: astore          7
        //  1032: aload           7
        //  1034: astore_2       
        //  1035: aload_0        
        //  1036: invokespecial   dfc.l:()V
        //  1039: aload_0        
        //  1040: getfield        dfc.i:Ldfb;
        //  1043: astore          4
        //  1045: aload           4
        //  1047: monitorenter   
        //  1048: aload           4
        //  1050: checkcast       Ldfp;
        //  1053: aload           7
        //  1055: putfield        dfp.d:Ldfx;
        //  1058: aload           4
        //  1060: checkcast       Ldfp;
        //  1063: iload           12
        //  1065: putfield        dfp.j:I
        //  1068: aload           4
        //  1070: monitorexit    
        //  1071: aload           4
        //  1073: monitorenter   
        //  1074: aload           4
        //  1076: checkcast       Ldfp;
        //  1079: getfield        dfp.k:Ladnp;
        //  1082: invokevirtual   adnp.b:()V
        //  1085: aload           4
        //  1087: checkcast       Ldfp;
        //  1090: getfield        dfp.i:Z
        //  1093: ifeq            1123
        //  1096: aload           4
        //  1098: checkcast       Ldfp;
        //  1101: getfield        dfp.d:Ldfx;
        //  1104: invokeinterface dfx.e:()V
        //  1109: aload           4
        //  1111: checkcast       Ldfp;
        //  1114: invokevirtual   dfp.e:()V
        //  1117: aload           4
        //  1119: monitorexit    
        //  1120: goto            1387
        //  1123: aload           4
        //  1125: checkcast       Ldfp;
        //  1128: getfield        dfp.a:Ldfo;
        //  1131: invokevirtual   dfo.e:()Z
        //  1134: ifne            1544
        //  1137: aload           4
        //  1139: checkcast       Ldfp;
        //  1142: getfield        dfp.e:Z
        //  1145: ifne            1531
        //  1148: aload           4
        //  1150: checkcast       Ldfp;
        //  1153: getfield        dfp.d:Ldfx;
        //  1156: astore          17
        //  1158: aload           4
        //  1160: checkcast       Ldfp;
        //  1163: getfield        dfp.c:Z
        //  1166: istore          6
        //  1168: aload           4
        //  1170: checkcast       Ldfp;
        //  1173: getfield        dfp.b:Lddj;
        //  1176: astore          9
        //  1178: aload           4
        //  1180: checkcast       Ldfp;
        //  1183: getfield        dfp.l:Lqbo;
        //  1186: astore          16
        //  1188: new             Ldfr;
        //  1191: astore          7
        //  1193: aload           7
        //  1195: aload           17
        //  1197: iload           6
        //  1199: iconst_1       
        //  1200: aload           9
        //  1202: aload           16
        //  1204: aconst_null    
        //  1205: aconst_null    
        //  1206: aconst_null    
        //  1207: aconst_null    
        //  1208: aconst_null    
        //  1209: invokespecial   dfr.<init>:(Ldfx;ZZLddj;Lqbo;[B[B[B[B[B)V
        //  1212: aload           4
        //  1214: checkcast       Ldfp;
        //  1217: aload           7
        //  1219: putfield        dfp.h:Ldfr;
        //  1222: aload           4
        //  1224: checkcast       Ldfp;
        //  1227: iconst_1       
        //  1228: putfield        dfp.e:Z
        //  1231: aload           4
        //  1233: checkcast       Ldfp;
        //  1236: getfield        dfp.a:Ldfo;
        //  1239: invokevirtual   dfo.c:()Ldfo;
        //  1242: astore          9
        //  1244: aload           9
        //  1246: invokevirtual   dfo.a:()I
        //  1249: istore          12
        //  1251: aload           4
        //  1253: checkcast       Ldfp;
        //  1256: iload           12
        //  1258: iconst_1       
        //  1259: iadd           
        //  1260: invokevirtual   dfp.d:(I)V
        //  1263: aload           4
        //  1265: checkcast       Ldfp;
        //  1268: getfield        dfp.b:Lddj;
        //  1271: astore          16
        //  1273: aload           4
        //  1275: checkcast       Ldfp;
        //  1278: getfield        dfp.h:Ldfr;
        //  1281: astore          7
        //  1283: aload           4
        //  1285: monitorexit    
        //  1286: aload           4
        //  1288: checkcast       Ldfp;
        //  1291: getfield        dfp.m:Lqbo;
        //  1294: aload           4
        //  1296: checkcast       Ldfp;
        //  1299: aload           16
        //  1301: aload           7
        //  1303: invokevirtual   qbo.aa:(Ldfp;Lddj;Ldfr;)V
        //  1306: aload           9
        //  1308: invokevirtual   dfo.iterator:()Ljava/util/Iterator;
        //  1311: astore          7
        //  1313: aload           7
        //  1315: invokeinterface java/util/Iterator.hasNext:()Z
        //  1320: ifeq            1379
        //  1323: aload           7
        //  1325: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1330: checkcast       Ldfn;
        //  1333: astore          17
        //  1335: aload           17
        //  1337: getfield        dfn.b:Ljava/util/concurrent/Executor;
        //  1340: astore          9
        //  1342: new             Ldfm;
        //  1345: astore          16
        //  1347: aload           17
        //  1349: getfield        dfn.a:Ldnq;
        //  1352: astore          17
        //  1354: aload           16
        //  1356: aload           4
        //  1358: checkcast       Ldfp;
        //  1361: aload           17
        //  1363: iconst_0       
        //  1364: invokespecial   dfm.<init>:(Ldfp;Ldnq;I)V
        //  1367: aload           9
        //  1369: aload           16
        //  1371: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //  1376: goto            1313
        //  1379: aload           4
        //  1381: checkcast       Ldfp;
        //  1384: invokevirtual   dfp.c:()V
        //  1387: aload_0        
        //  1388: iconst_5       
        //  1389: putfield        dfc.z:I
        //  1392: aload_0        
        //  1393: getfield        dfc.p:Lpa;
        //  1396: astore          4
        //  1398: aload           4
        //  1400: invokevirtual   pa.b:()Z
        //  1403: ifeq            1495
        //  1406: aload_0        
        //  1407: getfield        dfc.o:Ldfk;
        //  1410: astore          9
        //  1412: aload_0        
        //  1413: getfield        dfc.h:Lddo;
        //  1416: astore          7
        //  1418: aload           9
        //  1420: invokevirtual   dfk.a:()Ldgv;
        //  1423: astore          16
        //  1425: aload           4
        //  1427: getfield        pa.b:Ljava/lang/Object;
        //  1430: astore          17
        //  1432: new             Lalm;
        //  1435: astore          9
        //  1437: aload           9
        //  1439: aload           4
        //  1441: getfield        pa.a:Ljava/lang/Object;
        //  1444: aload           4
        //  1446: getfield        pa.c:Ljava/lang/Object;
        //  1449: aload           7
        //  1451: invokespecial   alm.<init>:(Lddb;Ljava/lang/Object;Lddo;)V
        //  1454: aload           16
        //  1456: aload           17
        //  1458: aload           9
        //  1460: invokeinterface dgv.b:(Lddj;Lalm;)V
        //  1465: aload           4
        //  1467: getfield        pa.c:Ljava/lang/Object;
        //  1470: checkcast       Ldfw;
        //  1473: invokevirtual   dfw.g:()V
        //  1476: goto            1495
        //  1479: astore          7
        //  1481: aload           4
        //  1483: getfield        pa.c:Ljava/lang/Object;
        //  1486: checkcast       Ldfw;
        //  1489: invokevirtual   dfw.g:()V
        //  1492: aload           7
        //  1494: athrow         
        //  1495: aload_2        
        //  1496: ifnull          1503
        //  1499: aload_2        
        //  1500: invokevirtual   dfw.g:()V
        //  1503: aload_0        
        //  1504: getfield        dfc.q:Laujv;
        //  1507: invokevirtual   aujv.g:()Z
        //  1510: ifeq            1517
        //  1513: aload_0        
        //  1514: invokevirtual   dfc.a:()V
        //  1517: return         
        //  1518: astore          4
        //  1520: aload_2        
        //  1521: ifnull          1528
        //  1524: aload_2        
        //  1525: invokevirtual   dfw.g:()V
        //  1528: aload           4
        //  1530: athrow         
        //  1531: new             Ljava/lang/IllegalStateException;
        //  1534: astore_2       
        //  1535: aload_2        
        //  1536: ldc_w           "Already have resource"
        //  1539: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1542: aload_2        
        //  1543: athrow         
        //  1544: new             Ljava/lang/IllegalStateException;
        //  1547: astore_2       
        //  1548: aload_2        
        //  1549: ldc_w           "Received a resource without any callbacks to notify"
        //  1552: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1555: aload_2        
        //  1556: athrow         
        //  1557: astore_2       
        //  1558: aload           4
        //  1560: monitorexit    
        //  1561: aload_2        
        //  1562: athrow         
        //  1563: astore_2       
        //  1564: aload           4
        //  1566: monitorexit    
        //  1567: aload_2        
        //  1568: athrow         
        //  1569: astore          4
        //  1571: aload           4
        //  1573: athrow         
        //  1574: aload_0        
        //  1575: invokespecial   dfc.k:()V
        //  1578: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  0      15     949    980    Ldft;
        //  19     25     949    980    Ldft;
        //  31     54     938    949    Any
        //  59     69     938    949    Any
        //  81     94     938    949    Any
        //  107    115    938    949    Any
        //  130    162    938    949    Any
        //  162    175    938    949    Any
        //  175    208    926    938    Any
        //  212    224    906    911    Any
        //  240    257    906    911    Any
        //  261    276    800    802    Ldft;
        //  261    276    906    911    Any
        //  280    286    800    802    Ldft;
        //  280    286    906    911    Any
        //  286    303    765    783    Any
        //  303    328    760    765    Ldft;
        //  303    328    783    795    Any
        //  333    367    760    765    Ldft;
        //  333    367    783    795    Any
        //  377    394    760    765    Ldft;
        //  377    394    783    795    Any
        //  394    445    760    765    Ldft;
        //  394    445    783    795    Any
        //  450    459    760    765    Ldft;
        //  450    459    783    795    Any
        //  462    482    760    765    Ldft;
        //  462    482    783    795    Any
        //  488    516    760    765    Ldft;
        //  488    516    783    795    Any
        //  526    549    760    765    Ldft;
        //  526    549    783    795    Any
        //  564    581    760    765    Ldft;
        //  564    581    783    795    Any
        //  593    631    760    765    Ldft;
        //  593    631    783    795    Any
        //  631    654    795    797    Ldft;
        //  631    654    783    795    Any
        //  661    678    795    797    Ldft;
        //  661    678    783    795    Any
        //  678    712    795    797    Ldft;
        //  678    712    783    795    Any
        //  715    738    795    797    Ldft;
        //  715    738    783    795    Any
        //  738    754    795    797    Ldft;
        //  738    754    783    795    Any
        //  767    783    795    797    Ldft;
        //  767    783    783    795    Any
        //  802    812    898    906    Any
        //  833    846    926    938    Any
        //  846    853    938    949    Any
        //  853    859    949    980    Ldft;
        //  865    898    898    906    Any
        //  911    926    926    938    Any
        //  928    938    938    949    Any
        //  940    949    949    980    Ldft;
        //  993    1011   1569   1574   Any
        //  1015   1032   1569   1574   Any
        //  1035   1048   1569   1574   Any
        //  1048   1071   1563   1569   Any
        //  1071   1074   1569   1574   Any
        //  1074   1120   1557   1563   Any
        //  1123   1286   1557   1563   Any
        //  1286   1313   1569   1574   Any
        //  1313   1376   1569   1574   Any
        //  1379   1387   1569   1574   Any
        //  1387   1392   1569   1574   Any
        //  1392   1418   1518   1531   Any
        //  1418   1465   1479   1495   Any
        //  1465   1476   1518   1531   Any
        //  1481   1495   1518   1531   Any
        //  1499   1503   1569   1574   Any
        //  1503   1517   1569   1574   Any
        //  1524   1528   1569   1574   Any
        //  1528   1531   1569   1574   Any
        //  1531   1544   1557   1563   Any
        //  1544   1557   1557   1563   Any
        //  1558   1561   1557   1563   Any
        //  1561   1563   1569   1574   Any
        //  1564   1567   1563   1569   Any
        //  1567   1569   1569   1574   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 694, Size: 694
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
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
    
    private final void j() {
        this.l();
        final dft f = new dft("Failed to load resource", (List)new ArrayList(this.r));
        Object i = this.i;
        monitorenter(i);
        try {
            ((dfp)i).f = f;
            monitorexit(i);
            synchronized (i) {
                ((dfp)i).k.b();
                if (((dfp)i).i) {
                    ((dfp)i).e();
                    monitorexit(i);
                }
                else {
                    if (((dfp)i).a.e()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (((dfp)i).g) {
                        throw new IllegalStateException("Already failed once");
                    }
                    ((dfp)i).g = true;
                    final ddj b = ((dfp)i).b;
                    final dfo c = ((dfp)i).a.c();
                    ((dfp)i).d(c.a() + 1);
                    monitorexit(i);
                    i = i;
                    ((dfp)i).m.aa((dfp)i, b, (dfr)null);
                    for (final dfn dfn : c) {
                        dfn.b.execute((Runnable)new dfm((dfp)i, dfn.a, 1));
                    }
                    ((dfp)i).c();
                }
                if (this.q.h()) {
                    this.a();
                }
            }
        }
        finally {
            monitorexit(i);
            while (true) {}
        }
    }
    
    private final void k() {
        this.t = Thread.currentThread();
        dpb.b();
        boolean c = false;
        do {
            boolean b = c;
            if (!this.m) {
                b = c;
                if (this.l != null) {
                    c = this.l.c();
                    if (!(b = c)) {
                        this.z = this.c(this.z);
                        this.l = this.h();
                        continue;
                    }
                }
            }
            if ((this.z == 6 || this.m) && !b) {
                this.j();
            }
            return;
        } while (this.z != 4);
        this.e(2);
    }
    
    private final void l() {
        this.B.b();
        if (this.x) {
            Throwable t;
            if (this.r.isEmpty()) {
                t = null;
            }
            else {
                final List r = this.r;
                t = (Throwable)r.get(r.size() - 1);
            }
            throw new IllegalStateException("Already notified", t);
        }
        this.x = true;
    }
    
    public final void a() {
        this.q.f();
        final pa p = this.p;
        p.b = null;
        p.a = null;
        p.c = null;
        final dfa a = this.a;
        a.c = null;
        a.d = null;
        a.m = null;
        a.g = null;
        a.j = null;
        a.h = null;
        a.n = null;
        a.i = null;
        a.o = null;
        a.a.clear();
        a.k = false;
        a.b.clear();
        a.l = false;
        this.x = false;
        this.b = null;
        this.c = null;
        this.h = null;
        this.d = null;
        this.i = null;
        this.z = 0;
        this.l = null;
        this.t = null;
        this.k = null;
        this.v = null;
        this.A = 0;
        this.w = null;
        this.m = false;
        this.r.clear();
        this.s.b((Object)this);
    }
    
    public final void b(final ddj ddj, final Exception ex, final ddx ddx, final int n) {
        ddx.d();
        final dft dft = new dft("Fetching data failed", (List)Collections.singletonList(ex));
        dft.b(ddj, n, ddx.a());
        this.r.add(dft);
        if (Thread.currentThread() != this.t) {
            this.e(2);
            return;
        }
        this.k();
    }
    
    public final int c(final int n) {
        final int n2 = n - 1;
        if (n == 0) {
            throw null;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return 4;
                }
                if (n2 != 3 && n2 != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: ".concat(ckl.a(n)));
                }
                return 6;
            }
            else {
                if (this.g.a()) {
                    return 3;
                }
                return this.c(3);
            }
        }
        else {
            if (this.g.b()) {
                return 2;
            }
            return this.c(2);
        }
    }
    
    public final void d(final ddj k, final Object v, final ddx w, final int a, final ddj u) {
        this.k = k;
        this.v = v;
        this.w = w;
        this.A = a;
        this.u = u;
        final List e = this.a.e();
        boolean y = false;
        if (k != e.get(0)) {
            y = true;
        }
        this.y = y;
        if (Thread.currentThread() == this.t) {
            try {
                this.i();
                return;
            }
            finally {}
        }
        this.e(3);
    }
    
    public final void e(final int n) {
        this.n = n;
        ((dfp)this.i).a().execute((Runnable)this);
    }
    
    public final adnp f() {
        return this.B;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dfc.w:Lddx;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        dfc.m:Z
        //     9: ifeq            27
        //    12: aload_0        
        //    13: invokespecial   dfc.j:()V
        //    16: aload_1        
        //    17: ifnull          26
        //    20: aload_1        
        //    21: invokeinterface ddx.d:()V
        //    26: return         
        //    27: aload_0        
        //    28: getfield        dfc.n:I
        //    31: istore_2       
        //    32: iload_2        
        //    33: iconst_1       
        //    34: isub           
        //    35: istore_3       
        //    36: iload_2        
        //    37: ifeq            152
        //    40: iload_3        
        //    41: ifeq            120
        //    44: iload_3        
        //    45: iconst_1       
        //    46: if_icmpeq       113
        //    49: iload_3        
        //    50: iconst_2       
        //    51: if_icmpeq       106
        //    54: new             Ljava/lang/IllegalStateException;
        //    57: astore          4
        //    59: iload_2        
        //    60: iconst_1       
        //    61: if_icmpeq       85
        //    64: iload_2        
        //    65: iconst_2       
        //    66: if_icmpeq       77
        //    69: ldc_w           "DECODE_DATA"
        //    72: astore          5
        //    74: goto            90
        //    77: ldc_w           "SWITCH_TO_SOURCE_SERVICE"
        //    80: astore          5
        //    82: goto            90
        //    85: ldc_w           "INITIALIZE"
        //    88: astore          5
        //    90: aload           4
        //    92: ldc_w           "Unrecognized run reason: "
        //    95: aload           5
        //    97: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   100: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   103: aload           4
        //   105: athrow         
        //   106: aload_0        
        //   107: invokespecial   dfc.i:()V
        //   110: goto            141
        //   113: aload_0        
        //   114: invokespecial   dfc.k:()V
        //   117: goto            141
        //   120: aload_0        
        //   121: aload_0        
        //   122: iconst_1       
        //   123: invokevirtual   dfc.c:(I)I
        //   126: putfield        dfc.z:I
        //   129: aload_0        
        //   130: aload_0        
        //   131: invokespecial   dfc.h:()Ldez;
        //   134: putfield        dfc.l:Ldez;
        //   137: aload_0        
        //   138: invokespecial   dfc.k:()V
        //   141: aload_1        
        //   142: ifnull          151
        //   145: aload_1        
        //   146: invokeinterface ddx.d:()V
        //   151: return         
        //   152: aconst_null    
        //   153: athrow         
        //   154: astore          5
        //   156: aload_0        
        //   157: getfield        dfc.z:I
        //   160: iconst_5       
        //   161: if_icmpeq       180
        //   164: aload_0        
        //   165: getfield        dfc.r:Ljava/util/List;
        //   168: aload           5
        //   170: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   175: pop            
        //   176: aload_0        
        //   177: invokespecial   dfc.j:()V
        //   180: aload_0        
        //   181: getfield        dfc.m:Z
        //   184: ifne            190
        //   187: aload           5
        //   189: athrow         
        //   190: aload           5
        //   192: athrow         
        //   193: astore          5
        //   195: aload           5
        //   197: athrow         
        //   198: astore          5
        //   200: aload_1        
        //   201: ifnull          210
        //   204: aload_1        
        //   205: invokeinterface ddx.d:()V
        //   210: aload           5
        //   212: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  5      16     193    198    Ldev;
        //  5      16     154    193    Any
        //  27     32     193    198    Ldev;
        //  27     32     154    193    Any
        //  54     59     193    198    Ldev;
        //  54     59     154    193    Any
        //  90     106    193    198    Ldev;
        //  90     106    154    193    Any
        //  106    110    193    198    Ldev;
        //  106    110    154    193    Any
        //  113    117    193    198    Ldev;
        //  113    117    154    193    Any
        //  120    141    193    198    Ldev;
        //  120    141    154    193    Any
        //  152    154    193    198    Ldev;
        //  152    154    154    193    Any
        //  156    180    198    213    Any
        //  180    190    198    213    Any
        //  190    193    198    213    Any
        //  195    198    198    213    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0180:
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
