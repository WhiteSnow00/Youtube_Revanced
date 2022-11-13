import android.os.Bundle;
import j$.util.OptionalInt;
import j$.time.Duration;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyy implements tcp
{
    private final Context a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final top e;
    private final atke f;
    private final hyx g;
    private final tnu h;
    private final wxx i;
    private final oby j;
    private final vai k;
    private final msr l;
    
    public hyy(final Context a, final atke b, final atke c, final atke d, final top e, final atke f, final hyx g, final msr l, final tnu h, final wxx i, final oby j, final vai k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.l = l;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    private final void b(final Exception ex, final String s) {
        if (ex instanceof InterruptedException) {
            Thread.currentThread().interrupt();
            final zll b = zll.b;
            final zlk e = zlk.e;
            final String br = vdh.br(this.a);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" (interrupted) in ");
            sb.append(br);
            final String string = sb.toString();
            Throwable cause = ex;
            if (ex.getCause() != null) {
                cause = ex.getCause();
            }
            zlm.c(b, e, string, cause);
            return;
        }
        final zll b2 = zll.b;
        final zlk e2 = zlk.e;
        final String br2 = vdh.br(this.a);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(" in ");
        sb2.append(br2);
        zlm.b(b2, e2, sb2.toString());
    }
    
    private final void c(long minutes) {
        minutes = Duration.ofMillis(this.j.c() + minutes).toMinutes();
        final aels q = this.h.q(1);
        q.c(tnu.Y, minutes);
        q.b();
    }
    
    private final void d(final ahaz ahaz) {
        final dax dax = (dax)this.d.a();
        if (dax instanceof tmj) {
            final tmj tmj = (tmj)dax;
            final OptionalInt j = tmj.j();
            if (j.isPresent()) {
                final int asInt = j.getAsInt();
                ahaz.copyOnWrite();
                final akbw akbw = (akbw)ahaz.instance;
                final akbw a = akbw.a;
                akbw.b |= 0x200;
                akbw.j = asInt;
            }
            final OptionalInt i = tmj.i();
            if (i.isPresent()) {
                final int asInt2 = i.getAsInt();
                ahaz.copyOnWrite();
                final akbw akbw2 = (akbw)ahaz.instance;
                final akbw a2 = akbw.a;
                akbw2.b |= 0x100;
                akbw2.i = asInt2;
            }
        }
    }
    
    public final int a(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        hyy.j:Loby;
        //     4: invokeinterface oby.d:()J
        //     9: lstore          4
        //    11: getstatic       akbw.a:Lakbw;
        //    14: invokevirtual   ahbh.createBuilder:()Lahaz;
        //    17: astore          10
        //    19: aload_1        
        //    20: ldc             "task_id_key"
        //    22: invokevirtual   android/os/Bundle.getLong:(Ljava/lang/String;)J
        //    25: lstore          8
        //    27: aload_1        
        //    28: ldc             "scheduled_time_seconds_key"
        //    30: invokevirtual   android/os/Bundle.getLong:(Ljava/lang/String;)J
        //    33: lstore          6
        //    35: aload           10
        //    37: invokevirtual   ahaz.copyOnWrite:()V
        //    40: aload           10
        //    42: getfield        ahaz.instance:Lahbh;
        //    45: checkcast       Lakbw;
        //    48: astore          11
        //    50: aload           11
        //    52: aload           11
        //    54: getfield        akbw.b:I
        //    57: iconst_1       
        //    58: ior            
        //    59: putfield        akbw.b:I
        //    62: aload           11
        //    64: lload           8
        //    66: putfield        akbw.c:J
        //    69: aload           10
        //    71: invokevirtual   ahaz.copyOnWrite:()V
        //    74: aload           10
        //    76: getfield        ahaz.instance:Lahbh;
        //    79: checkcast       Lakbw;
        //    82: astore          11
        //    84: aload           11
        //    86: aload           11
        //    88: getfield        akbw.b:I
        //    91: bipush          32
        //    93: ior            
        //    94: putfield        akbw.b:I
        //    97: aload           11
        //    99: lload           6
        //   101: putfield        akbw.f:J
        //   104: aload_0        
        //   105: getfield        hyy.j:Loby;
        //   108: invokeinterface oby.c:()J
        //   113: pop2           
        //   114: aload_1        
        //   115: ldc             "max_run_attempts_key"
        //   117: invokevirtual   android/os/Bundle.getLong:(Ljava/lang/String;)J
        //   120: lstore          6
        //   122: lload           6
        //   124: lconst_0       
        //   125: lcmp           
        //   126: ifgt            132
        //   129: goto            212
        //   132: aload_0        
        //   133: getfield        hyy.f:Latke;
        //   136: invokeinterface atke.a:()Ljava/lang/Object;
        //   141: checkcast       Lcnb;
        //   144: invokevirtual   cnb.f:()Lcom/google/common/util/concurrent/ListenableFuture;
        //   147: ldc2_w          5
        //   150: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   153: invokestatic    afeq.q:()Lafeq;
        //   156: invokestatic    teu.g:(Ljava/util/concurrent/Future;JLjava/util/concurrent/TimeUnit;Ljava/lang/Object;)Ljava/lang/Object;
        //   159: checkcast       Ljava/util/List;
        //   162: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   167: astore          11
        //   169: aload           11
        //   171: invokeinterface java/util/Iterator.hasNext:()Z
        //   176: ifeq            196
        //   179: aload           11
        //   181: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   186: checkcast       Lcna;
        //   189: getfield        cna.a:I
        //   192: istore_2       
        //   193: goto            198
        //   196: iconst_m1      
        //   197: istore_2       
        //   198: iload_2        
        //   199: i2l            
        //   200: lload           6
        //   202: lcmp           
        //   203: ifle            212
        //   206: bipush          10
        //   208: istore_2       
        //   209: goto            850
        //   212: aload_0        
        //   213: getfield        hyy.h:Ltnu;
        //   216: iconst_1       
        //   217: invokeinterface tnu.q:(I)Laels;
        //   222: astore          11
        //   224: aload           11
        //   226: getstatic       tnu.Y:I
        //   229: lconst_0       
        //   230: invokevirtual   aels.c:(IJ)V
        //   233: aload           11
        //   235: invokevirtual   aels.b:()V
        //   238: aload_0        
        //   239: getfield        hyy.c:Latke;
        //   242: invokeinterface atke.a:()Ljava/lang/Object;
        //   247: checkcast       Ladhu;
        //   250: astore          11
        //   252: aload           11
        //   254: ldc_w           "PREFETCHED_HOME_RESPONSE_KEY"
        //   257: invokevirtual   adhu.n:(Ljava/lang/String;)Lvwa;
        //   260: astore          12
        //   262: aload           12
        //   264: invokevirtual   vwa.q:()Z
        //   267: ifeq            324
        //   270: aload           12
        //   272: getfield        vwa.b:Ljava/lang/Object;
        //   275: checkcast       Lakhz;
        //   278: getfield        akhz.j:Lahab;
        //   281: astore          13
        //   283: aload           10
        //   285: invokevirtual   ahaz.copyOnWrite:()V
        //   288: aload           10
        //   290: getfield        ahaz.instance:Lahbh;
        //   293: checkcast       Lakbw;
        //   296: astore          12
        //   298: aload           13
        //   300: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   303: pop            
        //   304: aload           12
        //   306: aload           12
        //   308: getfield        akbw.b:I
        //   311: bipush          16
        //   313: ior            
        //   314: putfield        akbw.b:I
        //   317: aload           12
        //   319: aload           13
        //   321: putfield        akbw.e:Lahab;
        //   324: aload           11
        //   326: ldc_w           "PREFETCHED_HOME_RESPONSE_KEY"
        //   329: invokevirtual   adhu.e:(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   332: invokestatic    oev.a:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   335: pop            
        //   336: goto            367
        //   339: astore          12
        //   341: aload           12
        //   343: instanceof      Ljava/lang/InterruptedException;
        //   346: ifeq            355
        //   349: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   352: invokevirtual   java/lang/Thread.interrupt:()V
        //   355: getstatic       zll.b:Lzll;
        //   358: getstatic       zlk.e:Lzlk;
        //   361: ldc_w           "Prefetched browse response but failed to cache"
        //   364: invokestatic    zlm.b:(Lzll;Lzlk;Ljava/lang/String;)V
        //   367: aload_1        
        //   368: ldc_w           "test_execution_key"
        //   371: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   374: ifne            524
        //   377: aload_0        
        //   378: getfield        hyy.k:Lvai;
        //   381: invokevirtual   vai.bA:()Z
        //   384: ifne            392
        //   387: iconst_3       
        //   388: istore_2       
        //   389: goto            850
        //   392: aload_1        
        //   393: ldc_w           "task_schedules_next_task_key"
        //   396: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   399: ifeq            462
        //   402: aload_0        
        //   403: getfield        hyy.g:Lhyx;
        //   406: iconst_3       
        //   407: aload_1        
        //   408: ldc_w           "base_local_time_seconds_key"
        //   411: ldc2_w          -1
        //   414: invokevirtual   android/os/Bundle.getLong:(Ljava/lang/String;J)J
        //   417: aload_1        
        //   418: ldc_w           "max_jitter_time_seconds_key"
        //   421: lconst_0       
        //   422: invokevirtual   android/os/Bundle.getLong:(Ljava/lang/String;J)J
        //   425: aload_1        
        //   426: ldc_w           "task_schedules_next_task_key"
        //   429: iconst_0       
        //   430: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   433: aload_1        
        //   434: ldc             "max_run_attempts_key"
        //   436: lconst_0       
        //   437: invokevirtual   android/os/Bundle.getLong:(Ljava/lang/String;J)J
        //   440: aload_1        
        //   441: ldc_w           "requires_unmetered_network_key"
        //   444: iconst_0       
        //   445: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   448: aload_1        
        //   449: ldc_w           "requires_charging_key"
        //   452: iconst_0       
        //   453: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   456: invokevirtual   hyx.a:(IJJZJZZ)V
        //   459: goto            462
        //   462: aload_0        
        //   463: getfield        hyy.k:Lvai;
        //   466: ldc2_w          45363089
        //   469: invokevirtual   vai.f:(J)Z
        //   472: ifeq            480
        //   475: iconst_4       
        //   476: istore_2       
        //   477: goto            850
        //   480: aload_0        
        //   481: getfield        hyy.l:Lmsr;
        //   484: invokevirtual   msr.T:()I
        //   487: iconst_2       
        //   488: if_icmpne       496
        //   491: iconst_5       
        //   492: istore_2       
        //   493: goto            850
        //   496: aload_0        
        //   497: getfield        hyy.l:Lmsr;
        //   500: getfield        msr.a:Ljava/lang/Object;
        //   503: checkcast       Lthg;
        //   506: getfield        thg.b:Lthf;
        //   509: getfield        thf.b:Ljava/util/concurrent/atomic/AtomicInteger;
        //   512: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   515: ifle            524
        //   518: bipush          6
        //   520: istore_2       
        //   521: goto            850
        //   524: aload_0        
        //   525: getfield        hyy.k:Lvai;
        //   528: ldc2_w          45375802
        //   531: invokevirtual   vai.h:(J)J
        //   534: lstore          6
        //   536: lload           6
        //   538: lconst_0       
        //   539: lcmp           
        //   540: ifle            566
        //   543: aload_0        
        //   544: aload           10
        //   546: invokespecial   hyy.d:(Lahaz;)V
        //   549: aload_0        
        //   550: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   553: lload           6
        //   555: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   558: invokespecial   hyy.c:(J)V
        //   561: iconst_2       
        //   562: istore_2       
        //   563: goto            850
        //   566: aload_0        
        //   567: getfield        hyy.b:Latke;
        //   570: invokeinterface atke.a:()Ljava/lang/Object;
        //   575: checkcast       Lvnu;
        //   578: astore          12
        //   580: aload_0        
        //   581: getfield        hyy.b:Latke;
        //   584: invokeinterface atke.a:()Ljava/lang/Object;
        //   589: checkcast       Lvnu;
        //   592: invokevirtual   vnu.f:()Lvns;
        //   595: astore_1       
        //   596: aload_1        
        //   597: ldc_w           "FEwhat_to_watch"
        //   600: invokevirtual   vns.w:(Ljava/lang/String;)V
        //   603: aload_1        
        //   604: bipush          9
        //   606: putfield        vns.F:I
        //   609: aload_1        
        //   610: iconst_1       
        //   611: putfield        vkk.m:Z
        //   614: aload_1        
        //   615: ldc_w           ""
        //   618: invokevirtual   vns.y:(Ljava/lang/String;)V
        //   621: aload_1        
        //   622: iconst_2       
        //   623: invokevirtual   vkk.s:(I)V
        //   626: aload_1        
        //   627: invokevirtual   vkk.i:()V
        //   630: aload           12
        //   632: aload_1        
        //   633: getstatic       afum.a:Lafum;
        //   636: invokevirtual   vnu.h:(Lvns;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   639: invokestatic    oev.a:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   642: checkcast       Lcom/google/android/libraries/youtube/innertube/model/BrowseResponseModel;
        //   645: astore_1       
        //   646: aload_1        
        //   647: getfield        com/google/android/libraries/youtube/innertube/model/BrowseResponseModel.a:Lakhz;
        //   650: getfield        akhz.j:Lahab;
        //   653: astore          13
        //   655: aload           10
        //   657: invokevirtual   ahaz.copyOnWrite:()V
        //   660: aload           10
        //   662: getfield        ahaz.instance:Lahbh;
        //   665: checkcast       Lakbw;
        //   668: astore          12
        //   670: aload           13
        //   672: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   675: pop            
        //   676: aload           12
        //   678: aload           12
        //   680: getfield        akbw.b:I
        //   683: bipush          64
        //   685: ior            
        //   686: putfield        akbw.b:I
        //   689: aload           12
        //   691: aload           13
        //   693: putfield        akbw.g:Lahab;
        //   696: aload_1        
        //   697: getfield        com/google/android/libraries/youtube/innertube/model/BrowseResponseModel.a:Lakhz;
        //   700: invokevirtual   ahbh.getSerializedSize:()I
        //   703: istore_2       
        //   704: aload           10
        //   706: invokevirtual   ahaz.copyOnWrite:()V
        //   709: aload           10
        //   711: getfield        ahaz.instance:Lahbh;
        //   714: checkcast       Lakbw;
        //   717: astore          12
        //   719: aload           12
        //   721: aload           12
        //   723: getfield        akbw.b:I
        //   726: sipush          128
        //   729: ior            
        //   730: putfield        akbw.b:I
        //   733: aload           12
        //   735: iload_2        
        //   736: putfield        akbw.h:I
        //   739: aload_0        
        //   740: aload           10
        //   742: invokespecial   hyy.d:(Lahaz;)V
        //   745: aload           11
        //   747: ldc_w           "PREFETCHED_HOME_RESPONSE_KEY"
        //   750: aload_1        
        //   751: getfield        com/google/android/libraries/youtube/innertube/model/BrowseResponseModel.a:Lakhz;
        //   754: invokevirtual   adhu.d:(Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   757: invokestatic    oev.a:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   760: pop            
        //   761: aload_0        
        //   762: getfield        hyy.k:Lvai;
        //   765: ldc2_w          45371082
        //   768: invokevirtual   vai.f:(J)Z
        //   771: ifeq            780
        //   774: bipush          9
        //   776: istore_2       
        //   777: goto            850
        //   780: aload_0        
        //   781: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   784: aload_1        
        //   785: getfield        com/google/android/libraries/youtube/innertube/model/BrowseResponseModel.a:Lakhz;
        //   788: getfield        akhz.t:I
        //   791: i2l            
        //   792: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   795: invokespecial   hyy.c:(J)V
        //   798: goto            561
        //   801: astore_1       
        //   802: aload_0        
        //   803: aload_1        
        //   804: ldc_w           "Prefetched browse response but failed to cache"
        //   807: invokespecial   hyy.b:(Ljava/lang/Exception;Ljava/lang/String;)V
        //   810: bipush          8
        //   812: istore_2       
        //   813: goto            850
        //   816: astore_1       
        //   817: goto            821
        //   820: astore_1       
        //   821: aload_0        
        //   822: aload_1        
        //   823: ldc_w           "Failed to prefetch browse response"
        //   826: invokespecial   hyy.b:(Ljava/lang/Exception;Ljava/lang/String;)V
        //   829: bipush          7
        //   831: istore_2       
        //   832: goto            850
        //   835: astore_1       
        //   836: goto            840
        //   839: astore_1       
        //   840: aload_0        
        //   841: aload_1        
        //   842: ldc_w           "Failed to prefetch browse response"
        //   845: invokespecial   hyy.b:(Ljava/lang/Exception;Ljava/lang/String;)V
        //   848: iconst_1       
        //   849: istore_2       
        //   850: aload_0        
        //   851: getfield        hyy.e:Ltop;
        //   854: invokevirtual   top.a:()Lj$/time/Duration;
        //   857: invokevirtual   j$/time/Duration.toMillis:()J
        //   860: lstore          6
        //   862: lload           6
        //   864: lconst_0       
        //   865: lcmp           
        //   866: ifle            907
        //   869: aload           10
        //   871: invokevirtual   ahaz.copyOnWrite:()V
        //   874: aload           10
        //   876: getfield        ahaz.instance:Lahbh;
        //   879: checkcast       Lakbw;
        //   882: astore_1       
        //   883: aload_1        
        //   884: aload_1        
        //   885: getfield        akbw.b:I
        //   888: sipush          1024
        //   891: ior            
        //   892: putfield        akbw.b:I
        //   895: aload_1        
        //   896: lload           4
        //   898: lload           6
        //   900: lsub           
        //   901: invokestatic    afwm.G:(J)I
        //   904: putfield        akbw.k:I
        //   907: aload_0        
        //   908: getfield        hyy.j:Loby;
        //   911: invokeinterface oby.d:()J
        //   916: lstore          6
        //   918: aload           10
        //   920: invokevirtual   ahaz.copyOnWrite:()V
        //   923: aload           10
        //   925: getfield        ahaz.instance:Lahbh;
        //   928: checkcast       Lakbw;
        //   931: astore_1       
        //   932: aload_1        
        //   933: aload_1        
        //   934: getfield        akbw.b:I
        //   937: sipush          2048
        //   940: ior            
        //   941: putfield        akbw.b:I
        //   944: aload_1        
        //   945: lload           6
        //   947: lload           4
        //   949: lsub           
        //   950: invokestatic    afwm.G:(J)I
        //   953: putfield        akbw.l:I
        //   956: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   959: invokevirtual   java/lang/Thread.isInterrupted:()Z
        //   962: istore_3       
        //   963: aload           10
        //   965: invokevirtual   ahaz.copyOnWrite:()V
        //   968: aload           10
        //   970: getfield        ahaz.instance:Lahbh;
        //   973: checkcast       Lakbw;
        //   976: astore_1       
        //   977: aload_1        
        //   978: aload_1        
        //   979: getfield        akbw.b:I
        //   982: sipush          4096
        //   985: ior            
        //   986: putfield        akbw.b:I
        //   989: aload_1        
        //   990: iload_3        
        //   991: putfield        akbw.m:Z
        //   994: aload           10
        //   996: invokevirtual   ahaz.copyOnWrite:()V
        //   999: aload           10
        //  1001: getfield        ahaz.instance:Lahbh;
        //  1004: checkcast       Lakbw;
        //  1007: astore_1       
        //  1008: iinc            2, -1
        //  1011: aload_1        
        //  1012: iload_2        
        //  1013: putfield        akbw.d:I
        //  1016: aload_1        
        //  1017: aload_1        
        //  1018: getfield        akbw.b:I
        //  1021: iconst_2       
        //  1022: ior            
        //  1023: putfield        akbw.b:I
        //  1026: invokestatic    aknt.d:()Laknr;
        //  1029: astore_1       
        //  1030: aload_1        
        //  1031: invokevirtual   ahaz.copyOnWrite:()V
        //  1034: aload_1        
        //  1035: getfield        aknr.instance:Lahbh;
        //  1038: checkcast       Laknt;
        //  1041: aload           10
        //  1043: invokevirtual   ahaz.build:()Lahbh;
        //  1046: checkcast       Lakbw;
        //  1049: invokestatic    aknt.W:(Laknt;Lakbw;)V
        //  1052: aload_1        
        //  1053: invokevirtual   ahaz.build:()Lahbh;
        //  1056: checkcast       Laknt;
        //  1059: astore_1       
        //  1060: aload_0        
        //  1061: getfield        hyy.i:Lwxx;
        //  1064: aload_1        
        //  1065: invokeinterface wxx.d:(Laknt;)Z
        //  1070: pop            
        //  1071: iload_2        
        //  1072: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1075: pop            
        //  1076: iconst_0       
        //  1077: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  114    122    839    840    Ljava/lang/Exception;
        //  132    193    839    840    Ljava/lang/Exception;
        //  212    252    839    840    Ljava/lang/Exception;
        //  252    324    339    367    Ljava/lang/Exception;
        //  324    336    339    367    Ljava/lang/Exception;
        //  341    355    839    840    Ljava/lang/Exception;
        //  355    367    839    840    Ljava/lang/Exception;
        //  367    387    839    840    Ljava/lang/Exception;
        //  392    459    839    840    Ljava/lang/Exception;
        //  462    475    839    840    Ljava/lang/Exception;
        //  480    491    839    840    Ljava/lang/Exception;
        //  496    518    839    840    Ljava/lang/Exception;
        //  524    536    839    840    Ljava/lang/Exception;
        //  543    561    839    840    Ljava/lang/Exception;
        //  566    609    820    821    Ljava/lang/Exception;
        //  609    739    816    820    Ljava/lang/Exception;
        //  739    761    801    816    Ljava/lang/Exception;
        //  761    774    835    839    Ljava/lang/Exception;
        //  780    798    835    839    Ljava/lang/Exception;
        //  802    810    835    839    Ljava/lang/Exception;
        //  821    829    835    839    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0780:
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
