import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfd implements Runnable, Comparable, dez, dpm
{
    private int A;
    private final adpq B;
    public final dfb a;
    public dby b;
    public ddk c;
    public dca d;
    public int e;
    public int f;
    public dfi g;
    public ddp h;
    public dfc i;
    public int j;
    public ddk k;
    public volatile dfa l;
    public volatile boolean m;
    public int n;
    public final dfl o;
    public final pa p;
    public final aukl q;
    private final List r;
    private final akr s;
    private Thread t;
    private ddk u;
    private Object v;
    private ddy w;
    private volatile boolean x;
    private boolean y;
    private int z;
    
    public dfd(final dfl o, final akr s) {
        this.a = new dfb();
        this.r = new ArrayList();
        this.B = adpq.c();
        this.p = new pa((byte[])null);
        this.q = new aukl();
        this.o = o;
        this.s = s;
    }
    
    private final int g() {
        return this.d.ordinal();
    }
    
    private final dfa h() {
        final int z = this.z;
        final int n = z - 1;
        if (z == 0) {
            throw null;
        }
        if (n == 1) {
            return (dfa)new dfz(this.a, (dez)this);
        }
        if (n == 2) {
            final dfb a = this.a;
            return (dfa)new dex(a.e(), a, (dez)this);
        }
        if (n == 3) {
            return (dfa)new dgc(this.a, (dez)this);
        }
        if (n == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(ckm.a(z)));
    }
    
    private final void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dfd.w:Lddy;
        //     4: astore          18
        //     6: aload_0        
        //     7: getfield        dfd.v:Ljava/lang/Object;
        //    10: astore          12
        //    12: aload_0        
        //    13: getfield        dfd.A:I
        //    16: istore_3       
        //    17: aload           12
        //    19: ifnonnull       35
        //    22: aload           18
        //    24: invokeinterface ddy.d:()V
        //    29: aconst_null    
        //    30: astore          11
        //    32: goto            992
        //    35: invokestatic    dpc.b:()J
        //    38: pop2           
        //    39: aload_0        
        //    40: getfield        dfd.a:Ldfb;
        //    43: aload           12
        //    45: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    48: invokevirtual   dfb.b:(Ljava/lang/Class;)Ldfw;
        //    51: astore          19
        //    53: aload_0        
        //    54: getfield        dfd.h:Lddp;
        //    57: astore          11
        //    59: iload_3        
        //    60: iconst_4       
        //    61: if_icmpeq       83
        //    64: aload_0        
        //    65: getfield        dfd.a:Ldfb;
        //    68: getfield        dfb.q:Z
        //    71: ifeq            77
        //    74: goto            83
        //    77: iconst_0       
        //    78: istore          9
        //    80: goto            86
        //    83: iconst_1       
        //    84: istore          9
        //    86: aload           11
        //    88: getstatic       dkb.d:Lddo;
        //    91: invokevirtual   ddp.b:(Lddo;)Ljava/lang/Object;
        //    94: checkcast       Ljava/lang/Boolean;
        //    97: astore          13
        //    99: iload           9
        //   101: istore          10
        //   103: aload           13
        //   105: ifnull          135
        //   108: aload           11
        //   110: astore          14
        //   112: aload           13
        //   114: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   117: ifeq            167
        //   120: iload           9
        //   122: ifeq            132
        //   125: aload           11
        //   127: astore          14
        //   129: goto            167
        //   132: iconst_0       
        //   133: istore          10
        //   135: new             Lddp;
        //   138: astore          14
        //   140: aload           14
        //   142: invokespecial   ddp.<init>:()V
        //   145: aload           14
        //   147: aload_0        
        //   148: getfield        dfd.h:Lddp;
        //   151: invokevirtual   ddp.c:(Lddp;)V
        //   154: aload           14
        //   156: getstatic       dkb.d:Lddo;
        //   159: iload           10
        //   161: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   164: invokevirtual   ddp.d:(Lddo;Ljava/lang/Object;)V
        //   167: aload_0        
        //   168: getfield        dfd.b:Ldby;
        //   171: invokevirtual   dby.a:()Ldcg;
        //   174: aload           12
        //   176: invokevirtual   dcg.a:(Ljava/lang/Object;)Ldea;
        //   179: astore          20
        //   181: aload_0        
        //   182: getfield        dfd.e:I
        //   185: istore          8
        //   187: aload_0        
        //   188: getfield        dfd.f:I
        //   191: istore_1       
        //   192: aload           19
        //   194: getfield        dfw.a:Lakr;
        //   197: invokeinterface akr.a:()Ljava/lang/Object;
        //   202: checkcast       Ljava/util/List;
        //   205: astore          11
        //   207: aload           11
        //   209: invokestatic    clm.h:(Ljava/lang/Object;)Ljava/lang/Object;
        //   212: pop            
        //   213: aload           11
        //   215: astore          13
        //   217: aload           19
        //   219: getfield        dfw.b:Ljava/util/List;
        //   222: invokeinterface java/util/List.size:()I
        //   227: istore_2       
        //   228: iconst_0       
        //   229: istore          4
        //   231: aconst_null    
        //   232: astore          12
        //   234: iload           4
        //   236: iload_2        
        //   237: if_icmpge       831
        //   240: aload           11
        //   242: astore          13
        //   244: aload           19
        //   246: getfield        dfw.b:Ljava/util/List;
        //   249: iload           4
        //   251: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   256: checkcast       Ldfe;
        //   259: astore          21
        //   261: aload           11
        //   263: astore          13
        //   265: aload           21
        //   267: getfield        dfe.b:Lakr;
        //   270: invokeinterface akr.a:()Ljava/lang/Object;
        //   275: checkcast       Ljava/util/List;
        //   278: astore          16
        //   280: aload           11
        //   282: astore          13
        //   284: aload           16
        //   286: invokestatic    clm.h:(Ljava/lang/Object;)Ljava/lang/Object;
        //   289: pop            
        //   290: aload           21
        //   292: aload           20
        //   294: iload           8
        //   296: iload_1        
        //   297: aload           14
        //   299: aload           16
        //   301: invokevirtual   dfe.a:(Ldea;IILddp;Ljava/util/List;)Ldfy;
        //   304: astore          15
        //   306: aload           21
        //   308: getfield        dfe.b:Lakr;
        //   311: aload           16
        //   313: invokeinterface akr.b:(Ljava/lang/Object;)Z
        //   318: pop            
        //   319: aload           15
        //   321: invokeinterface dfy.c:()Ljava/lang/Object;
        //   326: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   329: astore          22
        //   331: iload_3        
        //   332: iconst_4       
        //   333: if_icmpeq       373
        //   336: aload_0        
        //   337: getfield        dfd.a:Ldfb;
        //   340: aload           22
        //   342: invokevirtual   dfb.a:(Ljava/lang/Class;)Lddt;
        //   345: astore          16
        //   347: aload           16
        //   349: aload_0        
        //   350: getfield        dfd.b:Ldby;
        //   353: aload           15
        //   355: aload_0        
        //   356: getfield        dfd.e:I
        //   359: aload_0        
        //   360: getfield        dfd.f:I
        //   363: invokeinterface ddt.b:(Landroid/content/Context;Ldfy;II)Ldfy;
        //   368: astore          13
        //   370: goto            380
        //   373: aload           15
        //   375: astore          13
        //   377: aconst_null    
        //   378: astore          16
        //   380: aload           15
        //   382: aload           13
        //   384: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   387: ifne            397
        //   390: aload           15
        //   392: invokeinterface dfy.e:()V
        //   397: aload_0        
        //   398: getfield        dfd.a:Ldfb;
        //   401: getfield        dfb.c:Ldby;
        //   404: invokevirtual   dby.a:()Ldcg;
        //   407: getfield        dcg.g:Lbhv;
        //   410: aload           13
        //   412: invokeinterface dfy.b:()Ljava/lang/Class;
        //   417: invokevirtual   bhv.o:(Ljava/lang/Class;)Ldds;
        //   420: ifnull          485
        //   423: aload_0        
        //   424: getfield        dfd.a:Ldfb;
        //   427: getfield        dfb.c:Ldby;
        //   430: invokevirtual   dby.a:()Ldcg;
        //   433: getfield        dcg.g:Lbhv;
        //   436: aload           13
        //   438: invokeinterface dfy.b:()Ljava/lang/Class;
        //   443: invokevirtual   bhv.o:(Ljava/lang/Class;)Ldds;
        //   446: astore          15
        //   448: aload           15
        //   450: ifnull          465
        //   453: aload           15
        //   455: invokeinterface dds.b:()I
        //   460: istore          5
        //   462: goto            491
        //   465: new             Ldce;
        //   468: astore          15
        //   470: aload           15
        //   472: aload           13
        //   474: invokeinterface dfy.b:()Ljava/lang/Class;
        //   479: invokespecial   dce.<init>:(Ljava/lang/Class;)V
        //   482: aload           15
        //   484: athrow         
        //   485: iconst_3       
        //   486: istore          5
        //   488: aconst_null    
        //   489: astore          15
        //   491: aload_0        
        //   492: getfield        dfd.a:Ldfb;
        //   495: astore          23
        //   497: aload_0        
        //   498: getfield        dfd.k:Lddk;
        //   501: astore          17
        //   503: aload           23
        //   505: invokevirtual   dfb.f:()Ljava/util/List;
        //   508: astore          23
        //   510: aload           23
        //   512: invokeinterface java/util/List.size:()I
        //   517: istore          6
        //   519: iconst_0       
        //   520: istore          7
        //   522: iload           7
        //   524: iload           6
        //   526: if_icmpge       564
        //   529: aload           23
        //   531: iload           7
        //   533: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   538: checkcast       Laln;
        //   541: getfield        aln.a:Ljava/lang/Object;
        //   544: aload           17
        //   546: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   549: ifeq            558
        //   552: iconst_1       
        //   553: istore          6
        //   555: goto            567
        //   558: iinc            7, 1
        //   561: goto            522
        //   564: iconst_0       
        //   565: istore          6
        //   567: aload_0        
        //   568: getfield        dfd.g:Ldfi;
        //   571: iload           6
        //   573: iconst_1       
        //   574: ixor           
        //   575: iload_3        
        //   576: iload           5
        //   578: invokevirtual   dfi.d:(ZII)Z
        //   581: ifeq            741
        //   584: aload           15
        //   586: ifnull          718
        //   589: iload           5
        //   591: iconst_1       
        //   592: isub           
        //   593: ifeq            664
        //   596: new             Ldga;
        //   599: astore          17
        //   601: aload_0        
        //   602: getfield        dfd.a:Ldfb;
        //   605: invokevirtual   dfb.c:()Ldge;
        //   608: astore          24
        //   610: aload_0        
        //   611: getfield        dfd.k:Lddk;
        //   614: astore          25
        //   616: aload_0        
        //   617: getfield        dfd.c:Lddk;
        //   620: astore          23
        //   622: aload_0        
        //   623: getfield        dfd.e:I
        //   626: istore          5
        //   628: aload_0        
        //   629: getfield        dfd.f:I
        //   632: istore          6
        //   634: aload           17
        //   636: aload           24
        //   638: aload           25
        //   640: aload           23
        //   642: iload           5
        //   644: iload           6
        //   646: aload           16
        //   648: aload           22
        //   650: aload_0        
        //   651: getfield        dfd.h:Lddp;
        //   654: invokespecial   dga.<init>:(Ldge;Lddk;Lddk;IILddt;Ljava/lang/Class;Lddp;)V
        //   657: aload           17
        //   659: astore          16
        //   661: goto            681
        //   664: new             Ldey;
        //   667: dup            
        //   668: aload_0        
        //   669: getfield        dfd.k:Lddk;
        //   672: aload_0        
        //   673: getfield        dfd.c:Lddk;
        //   676: invokespecial   dey.<init>:(Lddk;Lddk;)V
        //   679: astore          16
        //   681: aload           13
        //   683: invokestatic    dfx.d:(Ldfy;)Ldfx;
        //   686: astore          13
        //   688: aload_0        
        //   689: getfield        dfd.p:Lpa;
        //   692: astore          17
        //   694: aload           17
        //   696: aload           16
        //   698: putfield        pa.b:Ljava/lang/Object;
        //   701: aload           17
        //   703: aload           15
        //   705: putfield        pa.a:Ljava/lang/Object;
        //   708: aload           17
        //   710: aload           13
        //   712: putfield        pa.c:Ljava/lang/Object;
        //   715: goto            741
        //   718: new             Ldce;
        //   721: astore          15
        //   723: aload           15
        //   725: aload           13
        //   727: invokeinterface dfy.c:()Ljava/lang/Object;
        //   732: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   735: invokespecial   dce.<init>:(Ljava/lang/Class;)V
        //   738: aload           15
        //   740: athrow         
        //   741: aload           21
        //   743: getfield        dfe.a:Ldlu;
        //   746: aload           13
        //   748: aload           14
        //   750: invokeinterface dlu.a:(Ldfy;Lddp;)Ldfy;
        //   755: astore          13
        //   757: aload           13
        //   759: astore          12
        //   761: goto            817
        //   764: astore          13
        //   766: goto            802
        //   769: astore          13
        //   771: aload           21
        //   773: getfield        dfe.b:Lakr;
        //   776: aload           16
        //   778: invokeinterface akr.b:(Ljava/lang/Object;)Z
        //   783: pop            
        //   784: aload           13
        //   786: athrow         
        //   787: astore          13
        //   789: aload           11
        //   791: astore          12
        //   793: aload           13
        //   795: astore          11
        //   797: goto            921
        //   800: astore          13
        //   802: goto            807
        //   805: astore          13
        //   807: aload           11
        //   809: aload           13
        //   811: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   816: pop            
        //   817: aload           12
        //   819: ifnull          825
        //   822: goto            831
        //   825: iinc            4, 1
        //   828: goto            234
        //   831: aload           12
        //   833: ifnull          870
        //   836: aload           19
        //   838: getfield        dfw.a:Lakr;
        //   841: aload           11
        //   843: invokeinterface akr.b:(Ljava/lang/Object;)Z
        //   848: pop            
        //   849: aload           20
        //   851: invokeinterface dea.b:()V
        //   856: aload           18
        //   858: invokeinterface ddy.d:()V
        //   863: aload           12
        //   865: astore          11
        //   867: goto            32
        //   870: new             Ldfu;
        //   873: astore          12
        //   875: aload           19
        //   877: getfield        dfw.c:Ljava/lang/String;
        //   880: astore          13
        //   882: new             Ljava/util/ArrayList;
        //   885: astore          14
        //   887: aload           14
        //   889: aload           11
        //   891: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   894: aload           12
        //   896: aload           13
        //   898: aload           14
        //   900: invokespecial   dfu.<init>:(Ljava/lang/String;Ljava/util/List;)V
        //   903: aload           12
        //   905: athrow         
        //   906: aload           11
        //   908: astore          12
        //   910: astore          11
        //   912: goto            921
        //   915: astore          11
        //   917: aload           13
        //   919: astore          12
        //   921: aload           19
        //   923: getfield        dfw.a:Lakr;
        //   926: aload           12
        //   928: invokeinterface akr.b:(Ljava/lang/Object;)Z
        //   933: pop            
        //   934: aload           11
        //   936: athrow         
        //   937: astore          11
        //   939: aload           20
        //   941: invokeinterface dea.b:()V
        //   946: aload           11
        //   948: athrow         
        //   949: astore          11
        //   951: aload           18
        //   953: invokeinterface ddy.d:()V
        //   958: aload           11
        //   960: athrow         
        //   961: astore          11
        //   963: aload           11
        //   965: aload_0        
        //   966: getfield        dfd.u:Lddk;
        //   969: aload_0        
        //   970: getfield        dfd.A:I
        //   973: aconst_null    
        //   974: invokevirtual   dfu.b:(Lddk;ILjava/lang/Class;)V
        //   977: aload_0        
        //   978: getfield        dfd.r:Ljava/util/List;
        //   981: aload           11
        //   983: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   988: pop            
        //   989: aconst_null    
        //   990: astore          11
        //   992: aconst_null    
        //   993: astore          12
        //   995: aload           11
        //   997: ifnull          1598
        //  1000: aload_0        
        //  1001: getfield        dfd.A:I
        //  1004: istore_1       
        //  1005: aload           11
        //  1007: instanceof      Ldfv;
        //  1010: ifeq            1023
        //  1013: aload           11
        //  1015: checkcast       Ldfv;
        //  1018: invokeinterface dfv.d:()V
        //  1023: aload           11
        //  1025: astore          13
        //  1027: aload_0        
        //  1028: getfield        dfd.p:Lpa;
        //  1031: invokevirtual   pa.b:()Z
        //  1034: ifeq            1048
        //  1037: aload           11
        //  1039: invokestatic    dfx.d:(Ldfy;)Ldfx;
        //  1042: astore          13
        //  1044: aload           13
        //  1046: astore          12
        //  1048: aload_0        
        //  1049: invokespecial   dfd.l:()V
        //  1052: aload_0        
        //  1053: getfield        dfd.i:Ldfc;
        //  1056: astore          11
        //  1058: aload           11
        //  1060: monitorenter   
        //  1061: aload           11
        //  1063: checkcast       Ldfq;
        //  1066: aload           13
        //  1068: putfield        dfq.d:Ldfy;
        //  1071: aload           11
        //  1073: checkcast       Ldfq;
        //  1076: iload_1        
        //  1077: putfield        dfq.j:I
        //  1080: aload           11
        //  1082: monitorexit    
        //  1083: aload           11
        //  1085: monitorenter   
        //  1086: aload           11
        //  1088: checkcast       Ldfq;
        //  1091: getfield        dfq.k:Ladpq;
        //  1094: invokevirtual   adpq.b:()V
        //  1097: aload           11
        //  1099: checkcast       Ldfq;
        //  1102: getfield        dfq.i:Z
        //  1105: ifeq            1135
        //  1108: aload           11
        //  1110: checkcast       Ldfq;
        //  1113: getfield        dfq.d:Ldfy;
        //  1116: invokeinterface dfy.e:()V
        //  1121: aload           11
        //  1123: checkcast       Ldfq;
        //  1126: invokevirtual   dfq.e:()V
        //  1129: aload           11
        //  1131: monitorexit    
        //  1132: goto            1397
        //  1135: aload           11
        //  1137: checkcast       Ldfq;
        //  1140: getfield        dfq.a:Ldfp;
        //  1143: invokevirtual   dfp.e:()Z
        //  1146: ifne            1561
        //  1149: aload           11
        //  1151: checkcast       Ldfq;
        //  1154: getfield        dfq.e:Z
        //  1157: ifne            1545
        //  1160: aload           11
        //  1162: checkcast       Ldfq;
        //  1165: getfield        dfq.d:Ldfy;
        //  1168: astore          15
        //  1170: aload           11
        //  1172: checkcast       Ldfq;
        //  1175: getfield        dfq.c:Z
        //  1178: istore          9
        //  1180: aload           11
        //  1182: checkcast       Ldfq;
        //  1185: getfield        dfq.b:Lddk;
        //  1188: astore          16
        //  1190: aload           11
        //  1192: checkcast       Ldfq;
        //  1195: getfield        dfq.l:Lqcy;
        //  1198: astore          14
        //  1200: new             Ldfs;
        //  1203: astore          13
        //  1205: aload           13
        //  1207: aload           15
        //  1209: iload           9
        //  1211: iconst_1       
        //  1212: aload           16
        //  1214: aload           14
        //  1216: aconst_null    
        //  1217: aconst_null    
        //  1218: aconst_null    
        //  1219: aconst_null    
        //  1220: aconst_null    
        //  1221: invokespecial   dfs.<init>:(Ldfy;ZZLddk;Lqcy;[B[B[B[B[B)V
        //  1224: aload           11
        //  1226: checkcast       Ldfq;
        //  1229: aload           13
        //  1231: putfield        dfq.h:Ldfs;
        //  1234: aload           11
        //  1236: checkcast       Ldfq;
        //  1239: iconst_1       
        //  1240: putfield        dfq.e:Z
        //  1243: aload           11
        //  1245: checkcast       Ldfq;
        //  1248: getfield        dfq.a:Ldfp;
        //  1251: invokevirtual   dfp.c:()Ldfp;
        //  1254: astore          14
        //  1256: aload           14
        //  1258: invokevirtual   dfp.a:()I
        //  1261: istore_1       
        //  1262: aload           11
        //  1264: checkcast       Ldfq;
        //  1267: iload_1        
        //  1268: iconst_1       
        //  1269: iadd           
        //  1270: invokevirtual   dfq.d:(I)V
        //  1273: aload           11
        //  1275: checkcast       Ldfq;
        //  1278: getfield        dfq.b:Lddk;
        //  1281: astore          13
        //  1283: aload           11
        //  1285: checkcast       Ldfq;
        //  1288: getfield        dfq.h:Ldfs;
        //  1291: astore          15
        //  1293: aload           11
        //  1295: monitorexit    
        //  1296: aload           11
        //  1298: checkcast       Ldfq;
        //  1301: getfield        dfq.m:Lqcy;
        //  1304: aload           11
        //  1306: checkcast       Ldfq;
        //  1309: aload           13
        //  1311: aload           15
        //  1313: invokevirtual   qcy.aa:(Ldfq;Lddk;Ldfs;)V
        //  1316: aload           14
        //  1318: invokevirtual   dfp.iterator:()Ljava/util/Iterator;
        //  1321: astore          14
        //  1323: aload           14
        //  1325: invokeinterface java/util/Iterator.hasNext:()Z
        //  1330: ifeq            1389
        //  1333: aload           14
        //  1335: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1340: checkcast       Ldfo;
        //  1343: astore          16
        //  1345: aload           16
        //  1347: getfield        dfo.b:Ljava/util/concurrent/Executor;
        //  1350: astore          15
        //  1352: new             Ldfn;
        //  1355: astore          13
        //  1357: aload           16
        //  1359: getfield        dfo.a:Ldnr;
        //  1362: astore          16
        //  1364: aload           13
        //  1366: aload           11
        //  1368: checkcast       Ldfq;
        //  1371: aload           16
        //  1373: iconst_0       
        //  1374: invokespecial   dfn.<init>:(Ldfq;Ldnr;I)V
        //  1377: aload           15
        //  1379: aload           13
        //  1381: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //  1386: goto            1323
        //  1389: aload           11
        //  1391: checkcast       Ldfq;
        //  1394: invokevirtual   dfq.c:()V
        //  1397: aload_0        
        //  1398: iconst_5       
        //  1399: putfield        dfd.z:I
        //  1402: aload_0        
        //  1403: getfield        dfd.p:Lpa;
        //  1406: astore          11
        //  1408: aload           11
        //  1410: invokevirtual   pa.b:()Z
        //  1413: ifeq            1505
        //  1416: aload_0        
        //  1417: getfield        dfd.o:Ldfl;
        //  1420: astore          14
        //  1422: aload_0        
        //  1423: getfield        dfd.h:Lddp;
        //  1426: astore          13
        //  1428: aload           14
        //  1430: invokevirtual   dfl.a:()Ldgw;
        //  1433: astore          16
        //  1435: aload           11
        //  1437: getfield        pa.b:Ljava/lang/Object;
        //  1440: astore          15
        //  1442: new             Laln;
        //  1445: astore          14
        //  1447: aload           14
        //  1449: aload           11
        //  1451: getfield        pa.a:Ljava/lang/Object;
        //  1454: aload           11
        //  1456: getfield        pa.c:Ljava/lang/Object;
        //  1459: aload           13
        //  1461: invokespecial   aln.<init>:(Lddc;Ljava/lang/Object;Lddp;)V
        //  1464: aload           16
        //  1466: aload           15
        //  1468: aload           14
        //  1470: invokeinterface dgw.b:(Lddk;Laln;)V
        //  1475: aload           11
        //  1477: getfield        pa.c:Ljava/lang/Object;
        //  1480: checkcast       Ldfx;
        //  1483: invokevirtual   dfx.g:()V
        //  1486: goto            1505
        //  1489: astore          13
        //  1491: aload           11
        //  1493: getfield        pa.c:Ljava/lang/Object;
        //  1496: checkcast       Ldfx;
        //  1499: invokevirtual   dfx.g:()V
        //  1502: aload           13
        //  1504: athrow         
        //  1505: aload           12
        //  1507: ifnull          1515
        //  1510: aload           12
        //  1512: invokevirtual   dfx.g:()V
        //  1515: aload_0        
        //  1516: getfield        dfd.q:Laukl;
        //  1519: invokevirtual   aukl.g:()Z
        //  1522: ifeq            1529
        //  1525: aload_0        
        //  1526: invokevirtual   dfd.a:()V
        //  1529: return         
        //  1530: astore          11
        //  1532: aload           12
        //  1534: ifnull          1542
        //  1537: aload           12
        //  1539: invokevirtual   dfx.g:()V
        //  1542: aload           11
        //  1544: athrow         
        //  1545: new             Ljava/lang/IllegalStateException;
        //  1548: astore          12
        //  1550: aload           12
        //  1552: ldc_w           "Already have resource"
        //  1555: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1558: aload           12
        //  1560: athrow         
        //  1561: new             Ljava/lang/IllegalStateException;
        //  1564: astore          12
        //  1566: aload           12
        //  1568: ldc_w           "Received a resource without any callbacks to notify"
        //  1571: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1574: aload           12
        //  1576: athrow         
        //  1577: astore          12
        //  1579: aload           11
        //  1581: monitorexit    
        //  1582: aload           12
        //  1584: athrow         
        //  1585: astore          12
        //  1587: aload           11
        //  1589: monitorexit    
        //  1590: aload           12
        //  1592: athrow         
        //  1593: astore          11
        //  1595: aload           11
        //  1597: athrow         
        //  1598: aload_0        
        //  1599: invokespecial   dfd.k:()V
        //  1602: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  0      17     961    992    Ldfu;
        //  22     29     961    992    Ldfu;
        //  35     59     949    961    Any
        //  64     74     949    961    Any
        //  86     99     949    961    Any
        //  112    120    949    961    Any
        //  135    167    949    961    Any
        //  167    181    949    961    Any
        //  181    213    937    949    Any
        //  217    228    915    921    Any
        //  244    261    915    921    Any
        //  265    280    805    807    Ldfu;
        //  265    280    915    921    Any
        //  284    290    805    807    Ldfu;
        //  284    290    915    921    Any
        //  290    306    769    787    Any
        //  306    331    764    769    Ldfu;
        //  306    331    787    800    Any
        //  336    370    764    769    Ldfu;
        //  336    370    787    800    Any
        //  380    397    764    769    Ldfu;
        //  380    397    787    800    Any
        //  397    448    764    769    Ldfu;
        //  397    448    787    800    Any
        //  453    462    764    769    Ldfu;
        //  453    462    787    800    Any
        //  465    485    764    769    Ldfu;
        //  465    485    787    800    Any
        //  491    519    764    769    Ldfu;
        //  491    519    787    800    Any
        //  529    552    764    769    Ldfu;
        //  529    552    787    800    Any
        //  567    584    764    769    Ldfu;
        //  567    584    787    800    Any
        //  596    634    764    769    Ldfu;
        //  596    634    787    800    Any
        //  634    657    800    802    Ldfu;
        //  634    657    787    800    Any
        //  664    681    800    802    Ldfu;
        //  664    681    787    800    Any
        //  681    715    800    802    Ldfu;
        //  681    715    787    800    Any
        //  718    741    800    802    Ldfu;
        //  718    741    787    800    Any
        //  741    757    800    802    Ldfu;
        //  741    757    787    800    Any
        //  771    787    800    802    Ldfu;
        //  771    787    787    800    Any
        //  807    817    906    915    Any
        //  836    849    937    949    Any
        //  849    856    949    961    Any
        //  856    863    961    992    Ldfu;
        //  870    906    906    915    Any
        //  921    937    937    949    Any
        //  939    949    949    961    Any
        //  951    961    961    992    Ldfu;
        //  1005   1023   1593   1598   Any
        //  1027   1044   1593   1598   Any
        //  1048   1061   1593   1598   Any
        //  1061   1083   1585   1593   Any
        //  1083   1086   1593   1598   Any
        //  1086   1132   1577   1585   Any
        //  1135   1296   1577   1585   Any
        //  1296   1323   1593   1598   Any
        //  1323   1386   1593   1598   Any
        //  1389   1397   1593   1598   Any
        //  1397   1402   1593   1598   Any
        //  1402   1428   1530   1545   Any
        //  1428   1475   1489   1505   Any
        //  1475   1486   1530   1545   Any
        //  1491   1505   1530   1545   Any
        //  1510   1515   1593   1598   Any
        //  1515   1529   1593   1598   Any
        //  1537   1542   1593   1598   Any
        //  1542   1545   1593   1598   Any
        //  1545   1561   1577   1585   Any
        //  1561   1577   1577   1585   Any
        //  1579   1582   1577   1585   Any
        //  1582   1585   1593   1598   Any
        //  1587   1590   1585   1593   Any
        //  1590   1593   1593   1598   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 692, Size: 692
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
        final dfu f = new dfu("Failed to load resource", (List)new ArrayList(this.r));
        Object i = this.i;
        monitorenter(i);
        try {
            ((dfq)i).f = f;
            monitorexit(i);
            synchronized (i) {
                ((dfq)i).k.b();
                if (((dfq)i).i) {
                    ((dfq)i).e();
                    monitorexit(i);
                }
                else {
                    if (((dfq)i).a.e()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (((dfq)i).g) {
                        throw new IllegalStateException("Already failed once");
                    }
                    ((dfq)i).g = true;
                    final ddk b = ((dfq)i).b;
                    final dfp c = ((dfq)i).a.c();
                    ((dfq)i).d(c.a() + 1);
                    monitorexit(i);
                    i = i;
                    ((dfq)i).m.aa((dfq)i, b, (dfs)null);
                    for (final dfo dfo : c) {
                        dfo.b.execute((Runnable)new dfn((dfq)i, dfo.a, 1));
                    }
                    ((dfq)i).c();
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
        dpc.b();
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
        final dfb a = this.a;
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
    
    public final void b(final ddk ddk, final Exception ex, final ddy ddy, final int n) {
        ddy.d();
        final dfu dfu = new dfu("Fetching data failed", (List)Collections.singletonList(ex));
        dfu.b(ddk, n, ddy.a());
        this.r.add(dfu);
        if (Thread.currentThread() != this.t) {
            this.e(2);
            return;
        }
        this.k();
    }
    
    public final int c(final int n) {
        if (n == 0) {
            throw null;
        }
        final int n2 = n - 1;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return 4;
                }
                if (n2 != 3 && n2 != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: ".concat(ckm.a(n)));
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
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final dfd dfd = (dfd)o;
        int n;
        if ((n = this.g() - dfd.g()) == 0) {
            n = this.j - dfd.j;
        }
        return n;
    }
    
    public final void d(final ddk k, final Object v, final ddy w, final int a, final ddk u) {
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
        ((dfq)this.i).a().execute((Runnable)this);
    }
    
    public final adpq f() {
        return this.B;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dfd.w:Lddy;
        //     4: astore          4
        //     6: aload_0        
        //     7: getfield        dfd.m:Z
        //    10: ifeq            30
        //    13: aload_0        
        //    14: invokespecial   dfd.j:()V
        //    17: aload           4
        //    19: ifnull          29
        //    22: aload           4
        //    24: invokeinterface ddy.d:()V
        //    29: return         
        //    30: aload_0        
        //    31: getfield        dfd.n:I
        //    34: istore_2       
        //    35: iload_2        
        //    36: iconst_1       
        //    37: isub           
        //    38: istore_1       
        //    39: iload_2        
        //    40: ifeq            153
        //    43: iload_1        
        //    44: ifeq            119
        //    47: iload_1        
        //    48: iconst_1       
        //    49: if_icmpeq       112
        //    52: iload_1        
        //    53: iconst_2       
        //    54: if_icmpeq       105
        //    57: new             Ljava/lang/IllegalStateException;
        //    60: astore          5
        //    62: iload_2        
        //    63: iconst_1       
        //    64: if_icmpeq       86
        //    67: iload_2        
        //    68: iconst_2       
        //    69: if_icmpeq       79
        //    72: ldc_w           "DECODE_DATA"
        //    75: astore_3       
        //    76: goto            90
        //    79: ldc_w           "SWITCH_TO_SOURCE_SERVICE"
        //    82: astore_3       
        //    83: goto            90
        //    86: ldc_w           "INITIALIZE"
        //    89: astore_3       
        //    90: aload           5
        //    92: ldc_w           "Unrecognized run reason: "
        //    95: aload_3        
        //    96: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    99: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   102: aload           5
        //   104: athrow         
        //   105: aload_0        
        //   106: invokespecial   dfd.i:()V
        //   109: goto            140
        //   112: aload_0        
        //   113: invokespecial   dfd.k:()V
        //   116: goto            140
        //   119: aload_0        
        //   120: aload_0        
        //   121: iconst_1       
        //   122: invokevirtual   dfd.c:(I)I
        //   125: putfield        dfd.z:I
        //   128: aload_0        
        //   129: aload_0        
        //   130: invokespecial   dfd.h:()Ldfa;
        //   133: putfield        dfd.l:Ldfa;
        //   136: aload_0        
        //   137: invokespecial   dfd.k:()V
        //   140: aload           4
        //   142: ifnull          152
        //   145: aload           4
        //   147: invokeinterface ddy.d:()V
        //   152: return         
        //   153: aconst_null    
        //   154: athrow         
        //   155: astore_3       
        //   156: aload_0        
        //   157: getfield        dfd.z:I
        //   160: iconst_5       
        //   161: if_icmpeq       179
        //   164: aload_0        
        //   165: getfield        dfd.r:Ljava/util/List;
        //   168: aload_3        
        //   169: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   174: pop            
        //   175: aload_0        
        //   176: invokespecial   dfd.j:()V
        //   179: aload_0        
        //   180: getfield        dfd.m:Z
        //   183: ifne            188
        //   186: aload_3        
        //   187: athrow         
        //   188: aload_3        
        //   189: athrow         
        //   190: astore_3       
        //   191: aload_3        
        //   192: athrow         
        //   193: astore_3       
        //   194: aload           4
        //   196: ifnull          206
        //   199: aload           4
        //   201: invokeinterface ddy.d:()V
        //   206: aload_3        
        //   207: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  6      17     190    193    Ldew;
        //  6      17     155    190    Any
        //  30     35     190    193    Ldew;
        //  30     35     155    190    Any
        //  57     62     190    193    Ldew;
        //  57     62     155    190    Any
        //  90     105    190    193    Ldew;
        //  90     105    155    190    Any
        //  105    109    190    193    Ldew;
        //  105    109    155    190    Any
        //  112    116    190    193    Ldew;
        //  112    116    155    190    Any
        //  119    140    190    193    Ldew;
        //  119    140    155    190    Any
        //  153    155    190    193    Ldew;
        //  153    155    155    190    Any
        //  156    179    193    208    Any
        //  179    188    193    208    Any
        //  188    190    193    208    Any
        //  191    193    193    208    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0179:
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
