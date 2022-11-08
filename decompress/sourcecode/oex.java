import java.util.Collections;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import android.content.Context;
import android.util.LruCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oex
{
    private static final int c;
    public final LruCache a;
    public aumn b;
    private final LruCache d;
    private final Context e;
    private final Integer f;
    
    static {
        c = ahbz.Q("DEFAULT");
    }
    
    public oex(final Context e, final int n, final LruCache d, final LruCache a) {
        this.e = e;
        this.f = n;
        this.d = d;
        this.a = a;
    }
    
    private static Map e(final List list, final afcr afcr) {
        final HashMap hashMap = new HashMap();
        for (final Integer n : list) {
            if (n >= afcr.size()) {
                throw new oew(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", n, afcr.size()));
            }
            final aumh aumh = (aumh)afcr.get((int)n);
            int n2;
            if ((aumh.b & 0x2) != 0x0) {
                n2 = aumh.d;
            }
            else {
                n2 = oex.c;
            }
            final agza builder = ((agzi)aumh).toBuilder();
            builder.copyOnWrite();
            final aumh aumh2 = (aumh)builder.instance;
            aumh2.b &= 0xFFFFFFFD;
            aumh2.d = 0;
            hashMap.put(n2, builder.build());
        }
        return hashMap;
    }
    
    public final aumk a(final int n) {
        final LruCache d = this.d;
        final Integer value = n;
        aumk aumk;
        if ((aumk = (aumk)d.get((Object)value)) == null) {
            if (this.b == null) {
                this.b = this.c();
            }
            aumk = Collections.unmodifiableMap((Map<?, ? extends aumk>)this.b.b).get(value);
            if (aumk != null) {
                this.d.put((Object)value, (Object)aumk);
            }
        }
        return aumk;
    }
    
    public final aumk b(final int n) {
        final aumk a = this.a(n);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException();
    }
    
    public final aumn c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        oex.e:Landroid/content/Context;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          1058
        //     9: aload_1        
        //    10: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    13: aload_0        
        //    14: getfield        oex.f:Ljava/lang/Integer;
        //    17: invokevirtual   java/lang/Integer.intValue:()I
        //    20: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //    23: astore_2       
        //    24: aload_2        
        //    25: invokestatic    agyh.M:(Ljava/io/InputStream;)Lagyh;
        //    28: astore_3       
        //    29: getstatic       aumn.a:Laumn;
        //    32: invokevirtual   agzi.createBuilder:()Lagza;
        //    35: astore_1       
        //    36: aload_1        
        //    37: aload_3        
        //    38: getstatic       com/google/protobuf/ExtensionRegistryLite.a:Lcom/google/protobuf/ExtensionRegistryLite;
        //    41: invokevirtual   agza.mergeFrom:(Lagyh;Lcom/google/protobuf/ExtensionRegistryLite;)Lagza;
        //    44: pop            
        //    45: aload_1        
        //    46: invokevirtual   agza.build:()Lagzi;
        //    49: checkcast       Laumn;
        //    52: astore          4
        //    54: aload           4
        //    56: getfield        aumn.d:Lagzy;
        //    59: astore_1       
        //    60: aload           4
        //    62: getfield        aumn.e:Lagzq;
        //    65: astore          5
        //    67: aload_1        
        //    68: invokeinterface java/util/List.size:()I
        //    73: aload           5
        //    75: invokeinterface java/util/List.size:()I
        //    80: if_icmpne       956
        //    83: new             Ljava/util/HashMap;
        //    86: astore_3       
        //    87: aload_3        
        //    88: invokespecial   java/util/HashMap.<init>:()V
        //    91: aload           4
        //    93: getfield        aumn.f:Lagzy;
        //    96: invokestatic    afcr.o:(Ljava/util/Collection;)Lafcr;
        //    99: astore          6
        //   101: aload           5
        //   103: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   108: astore          5
        //   110: aload_1        
        //   111: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   116: astore          7
        //   118: aload           5
        //   120: invokeinterface java/util/Iterator.hasNext:()Z
        //   125: ifeq            825
        //   128: aload           7
        //   130: invokeinterface java/util/Iterator.hasNext:()Z
        //   135: ifeq            825
        //   138: aload           5
        //   140: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   145: checkcast       Ljava/lang/Integer;
        //   148: astore          8
        //   150: aload           7
        //   152: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   157: checkcast       Laumk;
        //   160: astore          9
        //   162: aload           9
        //   164: getfield        aumk.f:Lagzq;
        //   167: aload           6
        //   169: invokestatic    oex.e:(Ljava/util/List;Lafcr;)Ljava/util/Map;
        //   172: astore          10
        //   174: aload           9
        //   176: getfield        aumk.g:Lagzq;
        //   179: astore_1       
        //   180: aload           9
        //   182: getfield        aumk.h:Lagzt;
        //   185: astore          11
        //   187: aload_1        
        //   188: invokeinterface java/util/List.size:()I
        //   193: istore          12
        //   195: aload           11
        //   197: invokeinterface java/util/List.size:()I
        //   202: istore          13
        //   204: iload           12
        //   206: iload           13
        //   208: if_icmpne       780
        //   211: new             Ljava/util/HashMap;
        //   214: astore          14
        //   216: aload           14
        //   218: invokespecial   java/util/HashMap.<init>:()V
        //   221: aload_1        
        //   222: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   227: astore_1       
        //   228: aload           11
        //   230: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   235: astore          15
        //   237: aload           15
        //   239: invokeinterface java/util/Iterator.hasNext:()Z
        //   244: ifeq            323
        //   247: aload_1        
        //   248: invokeinterface java/util/Iterator.hasNext:()Z
        //   253: ifeq            323
        //   256: aload           15
        //   258: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   263: checkcast       Ljava/lang/Long;
        //   266: astore          16
        //   268: aload_1        
        //   269: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   274: checkcast       Ljava/lang/Integer;
        //   277: invokestatic    afcr.r:(Ljava/lang/Object;)Lafcr;
        //   280: aload           6
        //   282: invokestatic    oex.e:(Ljava/util/List;Lafcr;)Ljava/util/Map;
        //   285: astore          17
        //   287: getstatic       aumg.a:Laumg;
        //   290: invokevirtual   agzi.createBuilder:()Lagza;
        //   293: astore          11
        //   295: aload           11
        //   297: aload           17
        //   299: invokevirtual   agza.cF:(Ljava/util/Map;)V
        //   302: aload           14
        //   304: aload           16
        //   306: aload           11
        //   308: invokevirtual   agza.build:()Lagzi;
        //   311: checkcast       Laumg;
        //   314: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   319: pop            
        //   320: goto            237
        //   323: aload           9
        //   325: getfield        aumk.d:Lagzy;
        //   328: astore_1       
        //   329: aload           9
        //   331: getfield        aumk.e:Lagzt;
        //   334: astore          11
        //   336: aload_1        
        //   337: invokeinterface java/util/List.size:()I
        //   342: aload           11
        //   344: invokeinterface java/util/List.size:()I
        //   349: if_icmpne       735
        //   352: aload           11
        //   354: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   359: astore          11
        //   361: aload_1        
        //   362: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   367: astore          16
        //   369: aload           11
        //   371: invokeinterface java/util/Iterator.hasNext:()Z
        //   376: ifeq            525
        //   379: aload           16
        //   381: invokeinterface java/util/Iterator.hasNext:()Z
        //   386: ifeq            525
        //   389: aload           11
        //   391: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   396: checkcast       Ljava/lang/Long;
        //   399: astore          15
        //   401: aload           16
        //   403: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   408: checkcast       Laumg;
        //   411: astore          17
        //   413: aload           17
        //   415: getfield        aumg.e:Lagzq;
        //   418: aload           6
        //   420: invokestatic    oex.e:(Ljava/util/List;Lafcr;)Ljava/util/Map;
        //   423: astore_1       
        //   424: aload           14
        //   426: aload           15
        //   428: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   433: ifeq            470
        //   436: aload           17
        //   438: invokevirtual   agzi.toBuilder:()Lagza;
        //   441: astore_1       
        //   442: aload_1        
        //   443: aload           14
        //   445: aload           15
        //   447: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   452: checkcast       Laumg;
        //   455: invokevirtual   agza.mergeFrom:(Lagzi;)Lagza;
        //   458: pop            
        //   459: aload_1        
        //   460: invokevirtual   agza.build:()Lagzi;
        //   463: checkcast       Laumg;
        //   466: astore_1       
        //   467: goto            511
        //   470: aload           17
        //   472: invokevirtual   agzi.toBuilder:()Lagza;
        //   475: astore          17
        //   477: aload           17
        //   479: aload_1        
        //   480: invokevirtual   agza.cF:(Ljava/util/Map;)V
        //   483: aload           17
        //   485: invokevirtual   agza.copyOnWrite:()V
        //   488: aload           17
        //   490: getfield        agza.instance:Lagzi;
        //   493: checkcast       Laumg;
        //   496: invokestatic    aumg.emptyIntList:()Lagzq;
        //   499: putfield        aumg.e:Lagzq;
        //   502: aload           17
        //   504: invokevirtual   agza.build:()Lagzi;
        //   507: checkcast       Laumg;
        //   510: astore_1       
        //   511: aload           14
        //   513: aload           15
        //   515: aload_1        
        //   516: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   521: pop            
        //   522: goto            369
        //   525: aload           9
        //   527: invokevirtual   agzi.toBuilder:()Lagza;
        //   530: astore_1       
        //   531: aload_1        
        //   532: invokevirtual   agza.copyOnWrite:()V
        //   535: aload_1        
        //   536: getfield        agza.instance:Lagzi;
        //   539: checkcast       Laumk;
        //   542: astore          11
        //   544: aload           11
        //   546: getfield        aumk.b:Lahas;
        //   549: astore          9
        //   551: aload           9
        //   553: getfield        ahas.b:Z
        //   556: ifne            569
        //   559: aload           11
        //   561: aload           9
        //   563: invokevirtual   ahas.a:()Lahas;
        //   566: putfield        aumk.b:Lahas;
        //   569: aload           11
        //   571: getfield        aumk.b:Lahas;
        //   574: aload           10
        //   576: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   581: aload_1        
        //   582: invokevirtual   agza.copyOnWrite:()V
        //   585: aload_1        
        //   586: getfield        agza.instance:Lagzi;
        //   589: checkcast       Laumk;
        //   592: invokestatic    aumk.emptyIntList:()Lagzq;
        //   595: putfield        aumk.f:Lagzq;
        //   598: aload_1        
        //   599: invokevirtual   agza.copyOnWrite:()V
        //   602: aload_1        
        //   603: getfield        agza.instance:Lagzi;
        //   606: checkcast       Laumk;
        //   609: astore          9
        //   611: aload           9
        //   613: getfield        aumk.c:Lahas;
        //   616: astore          10
        //   618: aload           10
        //   620: getfield        ahas.b:Z
        //   623: ifne            636
        //   626: aload           9
        //   628: aload           10
        //   630: invokevirtual   ahas.a:()Lahas;
        //   633: putfield        aumk.c:Lahas;
        //   636: aload           9
        //   638: getfield        aumk.c:Lahas;
        //   641: aload           14
        //   643: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   648: aload_1        
        //   649: invokevirtual   agza.copyOnWrite:()V
        //   652: aload_1        
        //   653: getfield        agza.instance:Lagzi;
        //   656: checkcast       Laumk;
        //   659: invokestatic    aumk.emptyLongList:()Lagzt;
        //   662: putfield        aumk.e:Lagzt;
        //   665: aload_1        
        //   666: invokevirtual   agza.copyOnWrite:()V
        //   669: aload_1        
        //   670: getfield        agza.instance:Lagzi;
        //   673: checkcast       Laumk;
        //   676: invokestatic    aumk.emptyProtobufList:()Lagzy;
        //   679: putfield        aumk.d:Lagzy;
        //   682: aload_1        
        //   683: invokevirtual   agza.copyOnWrite:()V
        //   686: aload_1        
        //   687: getfield        agza.instance:Lagzi;
        //   690: checkcast       Laumk;
        //   693: invokestatic    aumk.emptyIntList:()Lagzq;
        //   696: putfield        aumk.g:Lagzq;
        //   699: aload_1        
        //   700: invokevirtual   agza.copyOnWrite:()V
        //   703: aload_1        
        //   704: getfield        agza.instance:Lagzi;
        //   707: checkcast       Laumk;
        //   710: invokestatic    aumk.emptyLongList:()Lagzt;
        //   713: putfield        aumk.h:Lagzt;
        //   716: aload_3        
        //   717: aload           8
        //   719: aload_1        
        //   720: invokevirtual   agza.build:()Lagzi;
        //   723: checkcast       Laumk;
        //   726: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   731: pop            
        //   732: goto            118
        //   735: new             Loew;
        //   738: astore_3       
        //   739: aload_3        
        //   740: ldc_w           "TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size"
        //   743: iconst_2       
        //   744: anewarray       Ljava/lang/Object;
        //   747: dup            
        //   748: iconst_0       
        //   749: aload           11
        //   751: invokeinterface java/util/List.size:()I
        //   756: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   759: aastore        
        //   760: dup            
        //   761: iconst_1       
        //   762: aload_1        
        //   763: invokeinterface java/util/List.size:()I
        //   768: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   771: aastore        
        //   772: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   775: invokespecial   oew.<init>:(Ljava/lang/String;)V
        //   778: aload_3        
        //   779: athrow         
        //   780: new             Loew;
        //   783: astore_3       
        //   784: aload_3        
        //   785: ldc_w           "TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size"
        //   788: iconst_2       
        //   789: anewarray       Ljava/lang/Object;
        //   792: dup            
        //   793: iconst_0       
        //   794: aload           11
        //   796: invokeinterface java/util/List.size:()I
        //   801: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   804: aastore        
        //   805: dup            
        //   806: iconst_1       
        //   807: aload_1        
        //   808: invokeinterface java/util/List.size:()I
        //   813: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   816: aastore        
        //   817: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   820: invokespecial   oew.<init>:(Ljava/lang/String;)V
        //   823: aload_3        
        //   824: athrow         
        //   825: getstatic       aumn.a:Laumn;
        //   828: invokevirtual   agzi.createBuilder:()Lagza;
        //   831: astore_1       
        //   832: aload_1        
        //   833: invokevirtual   agza.copyOnWrite:()V
        //   836: aload_1        
        //   837: getfield        agza.instance:Lagzi;
        //   840: checkcast       Laumn;
        //   843: astore          6
        //   845: aload           6
        //   847: getfield        aumn.b:Lahas;
        //   850: astore          5
        //   852: aload           5
        //   854: getfield        ahas.b:Z
        //   857: ifne            870
        //   860: aload           6
        //   862: aload           5
        //   864: invokevirtual   ahas.a:()Lahas;
        //   867: putfield        aumn.b:Lahas;
        //   870: aload           6
        //   872: getfield        aumn.b:Lahas;
        //   875: aload_3        
        //   876: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   881: aload           4
        //   883: getfield        aumn.c:Lahas;
        //   886: invokestatic    java/util/Collections.unmodifiableMap:(Ljava/util/Map;)Ljava/util/Map;
        //   889: astore          4
        //   891: aload_1        
        //   892: invokevirtual   agza.copyOnWrite:()V
        //   895: aload_1        
        //   896: getfield        agza.instance:Lagzi;
        //   899: checkcast       Laumn;
        //   902: astore          6
        //   904: aload           6
        //   906: getfield        aumn.c:Lahas;
        //   909: astore_3       
        //   910: aload_3        
        //   911: getfield        ahas.b:Z
        //   914: ifne            926
        //   917: aload           6
        //   919: aload_3        
        //   920: invokevirtual   ahas.a:()Lahas;
        //   923: putfield        aumn.c:Lahas;
        //   926: aload           6
        //   928: getfield        aumn.c:Lahas;
        //   931: aload           4
        //   933: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   938: aload_1        
        //   939: invokevirtual   agza.build:()Lagzi;
        //   942: checkcast       Laumn;
        //   945: astore_1       
        //   946: aload_2        
        //   947: ifnull          954
        //   950: aload_2        
        //   951: invokevirtual   java/io/InputStream.close:()V
        //   954: aload_1        
        //   955: areturn        
        //   956: new             Loew;
        //   959: astore_3       
        //   960: aload_3        
        //   961: ldc_w           "ProtoHashNamesList[%d] and MessagesList[%d] must have same size"
        //   964: iconst_2       
        //   965: anewarray       Ljava/lang/Object;
        //   968: dup            
        //   969: iconst_0       
        //   970: aload           5
        //   972: invokeinterface java/util/List.size:()I
        //   977: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   980: aastore        
        //   981: dup            
        //   982: iconst_1       
        //   983: aload_1        
        //   984: invokeinterface java/util/List.size:()I
        //   989: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   992: aastore        
        //   993: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   996: invokespecial   oew.<init>:(Ljava/lang/String;)V
        //   999: aload_3        
        //  1000: athrow         
        //  1001: astore_1       
        //  1002: aload_2        
        //  1003: ifnull          1046
        //  1006: aload_2        
        //  1007: invokevirtual   java/io/InputStream.close:()V
        //  1010: goto            1046
        //  1013: astore_2       
        //  1014: ldc_w           Ljava/lang/Throwable;.class
        //  1017: ldc_w           "addSuppressed"
        //  1020: iconst_1       
        //  1021: anewarray       Ljava/lang/Class;
        //  1024: dup            
        //  1025: iconst_0       
        //  1026: ldc_w           Ljava/lang/Throwable;.class
        //  1029: aastore        
        //  1030: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //  1033: aload_1        
        //  1034: iconst_1       
        //  1035: anewarray       Ljava/lang/Object;
        //  1038: dup            
        //  1039: iconst_0       
        //  1040: aload_2        
        //  1041: aastore        
        //  1042: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //  1045: pop            
        //  1046: aload_1        
        //  1047: athrow         
        //  1048: astore_1       
        //  1049: new             Ljava/io/IOException;
        //  1052: dup            
        //  1053: aload_1        
        //  1054: invokespecial   java/io/IOException.<init>:(Ljava/lang/Throwable;)V
        //  1057: athrow         
        //  1058: new             Ljava/io/IOException;
        //  1061: dup            
        //  1062: ldc_w           "No context to load resource from"
        //  1065: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1068: astore_1       
        //  1069: goto            1074
        //  1072: aload_1        
        //  1073: athrow         
        //  1074: goto            1072
        //  1077: astore_2       
        //  1078: goto            1046
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  9      24     1048   1058   Landroid/content/res/Resources$NotFoundException;
        //  24     118    1001   1048   Any
        //  118    204    1001   1048   Any
        //  211    237    1001   1048   Any
        //  237    320    1001   1048   Any
        //  323    369    1001   1048   Any
        //  369    467    1001   1048   Any
        //  470    511    1001   1048   Any
        //  511    522    1001   1048   Any
        //  525    569    1001   1048   Any
        //  569    636    1001   1048   Any
        //  636    732    1001   1048   Any
        //  735    780    1001   1048   Any
        //  780    825    1001   1048   Any
        //  825    870    1001   1048   Any
        //  870    926    1001   1048   Any
        //  926    946    1001   1048   Any
        //  950    954    1048   1058   Landroid/content/res/Resources$NotFoundException;
        //  956    1001   1001   1048   Any
        //  1006   1010   1013   1046   Any
        //  1014   1046   1077   1081   Ljava/lang/Exception;
        //  1046   1048   1048   1058   Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1046:
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
    
    public final boolean d(final int n) {
        return this.a(n) != null;
    }
}
