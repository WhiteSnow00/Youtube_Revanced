import java.util.Iterator;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.Map;
import java.util.Queue;
import android.net.wifi.WifiManager$WifiLock;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafx implements aafs, aagd
{
    static final long a;
    private static final long m;
    private static final long n;
    private static final long o;
    private final zmf A;
    private final atiw B;
    private final aaft C;
    private final aage D;
    private final aagf E;
    private final aagl F;
    private final String G;
    private final tcq H;
    private final PowerManager$WakeLock I;
    private final WifiManager$WifiLock J;
    private aqra K;
    private volatile zme L;
    private volatile boolean M;
    private boolean N;
    private final Queue O;
    private final Map P;
    private ScheduledFuture Q;
    private final arwh R;
    private final msr S;
    private final acid T;
    private final zaz U;
    final aafq b;
    public final aagh c;
    public final aafr d;
    public volatile String e;
    public final Set f;
    boolean g;
    public boolean h;
    public boolean i;
    public final Object j;
    public ListenableFuture k;
    public final aanx l;
    private final Context p;
    private final ScheduledExecutorService q;
    private final tjm r;
    private final oby s;
    private final tcq t;
    private final aaei u;
    private final atke v;
    private final aaag w;
    private final tgd x;
    private final aait y;
    private final aagg z;
    
    static {
        m = TimeUnit.SECONDS.toMillis(10L);
        final long n2 = n = TimeUnit.SECONDS.toMillis(30L);
        o = TimeUnit.MINUTES.toMillis(1L);
        a = TimeUnit.MILLISECONDS.toSeconds(n2);
    }
    
    public aafx(final Context p32, final ScheduledExecutorService q, final tjm r, final oby s, final msr s2, final tcq t, final aaei u, final atke v, final acid t2, final aaag w, final aafq b, final arwh r2, final tgd x, final aait y, final zaz u2, final aagg z, final aaft c, final aage d, final aagf e, final aanx l, final aagh c2, final zmf a, final atiw b2, final tcq h, final aafr d2, final String g, final aagl f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.K = aqra.d;
        this.j = new Object();
        this.O = new ArrayDeque();
        this.k = null;
        this.P = new HashMap();
        this.Q = null;
        this.p = p32;
        this.q = q;
        this.r = r;
        this.s = s;
        this.S = s2;
        this.t = t;
        this.u = u;
        this.v = v;
        this.T = t2;
        this.w = w;
        this.b = b;
        this.R = r2;
        this.x = x;
        this.y = y;
        this.U = u2;
        this.z = z;
        this.C = c;
        this.D = d;
        this.E = e;
        this.l = l;
        this.c = c2;
        this.A = a;
        this.B = b2;
        this.H = h;
        this.d = d2;
        this.G = g;
        this.F = f;
        this.M = false;
        this.f = new HashSet();
        final PowerManager powerManager = (PowerManager)p32.getSystemService("power");
        powerManager.getClass();
        this.I = powerManager.newWakeLock(1, this.getClass().getName());
        final WifiManager wifiManager = (WifiManager)p32.getSystemService("wifi");
        wifiManager.getClass();
        this.J = wifiManager.createWifiLock(3, this.getClass().getName());
        t.a("transfer_dm2");
        d.a = (aagd)this;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        p32.registerReceiver((BroadcastReceiver)d, intentFilter);
        e.c = e.a.am((asjm)new tod(e, (aagd)this, 13));
        e.d = e.b.am((asjm)new tod(e, (aagd)this, 14));
        q.execute((Runnable)new ztz(e, 14));
    }
    
    private final Bundle o() {
        final Bundle bundle = new Bundle();
        bundle.putString("servicePath", this.G);
        bundle.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
        return bundle;
    }
    
    private final void p() {
        synchronized (this.j) {
            final ScheduledFuture q = this.Q;
            if (q != null) {
                q.cancel(false);
            }
            this.Q = null;
        }
    }
    
    private final void q() {
        synchronized (this.j) {
            this.p();
            if (this.e() <= 0 && !this.h) {
                if (!this.M && !this.g) {
                    long n;
                    if (this.i) {
                        n = aafx.n;
                    }
                    else {
                        n = aafx.m;
                    }
                    TimeUnit.MILLISECONDS.toSeconds(n);
                    this.Q = this.q.schedule((Runnable)new ztz(this, 17), n, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
    
    private final void r() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        aafx.f:Ljava/util/Set;
        //     4: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //     9: astore          15
        //    11: aload           15
        //    13: invokeinterface java/util/Iterator.hasNext:()Z
        //    18: ifeq            67
        //    21: aload           15
        //    23: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    28: checkcast       Ljava/lang/String;
        //    31: astore          16
        //    33: aload_0        
        //    34: getfield        aafx.l:Laanx;
        //    37: aload           16
        //    39: invokevirtual   aanx.h:(Ljava/lang/String;)Laafd;
        //    42: astore          16
        //    44: aload           16
        //    46: ifnull          11
        //    49: aload           16
        //    51: getfield        aafd.e:Laaak;
        //    54: invokestatic    aaff.g:(Laaak;)I
        //    57: iconst_2       
        //    58: if_icmpne       11
        //    61: iconst_1       
        //    62: istore          4
        //    64: goto            70
        //    67: iconst_0       
        //    68: istore          4
        //    70: iconst_1       
        //    71: aload_0        
        //    72: invokespecial   aafx.t:()Z
        //    75: if_icmpeq       83
        //    78: iconst_0       
        //    79: istore_1       
        //    80: goto            85
        //    83: iconst_2       
        //    84: istore_1       
        //    85: aload_0        
        //    86: getfield        aafx.y:Laait;
        //    89: invokevirtual   aait.e:()Z
        //    92: istore          12
        //    94: bipush          8
        //    96: istore_3       
        //    97: iload           12
        //    99: ifeq            143
        //   102: aload_0        
        //   103: getfield        aafx.K:Laqra;
        //   106: getstatic       aqra.c:Laqra;
        //   109: if_acmpne       121
        //   112: iload_3        
        //   113: istore_2       
        //   114: aload_0        
        //   115: invokespecial   aafx.w:()Z
        //   118: ifeq            157
        //   121: aload_0        
        //   122: getfield        aafx.K:Laqra;
        //   125: getstatic       aqra.b:Laqra;
        //   128: if_acmpne       155
        //   131: aload_0        
        //   132: invokespecial   aafx.u:()Z
        //   135: ifeq            155
        //   138: iload_3        
        //   139: istore_2       
        //   140: goto            157
        //   143: aload_0        
        //   144: invokespecial   aafx.u:()Z
        //   147: ifeq            155
        //   150: iload_3        
        //   151: istore_2       
        //   152: goto            157
        //   155: iconst_0       
        //   156: istore_2       
        //   157: iload_1        
        //   158: iload_2        
        //   159: ior            
        //   160: istore_3       
        //   161: aload_0        
        //   162: getfield        aafx.T:Lacid;
        //   165: invokevirtual   acid.t:()J
        //   168: lstore          8
        //   170: aload_0        
        //   171: getfield        aafx.l:Laanx;
        //   174: invokevirtual   aanx.j:()Ljava/util/List;
        //   177: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   182: astore          15
        //   184: iconst_0       
        //   185: istore          12
        //   187: iconst_0       
        //   188: istore          13
        //   190: iconst_0       
        //   191: istore          6
        //   193: iconst_0       
        //   194: istore          5
        //   196: iconst_0       
        //   197: istore_2       
        //   198: aload           15
        //   200: invokeinterface java/util/Iterator.hasNext:()Z
        //   205: ifeq            1349
        //   208: aload           15
        //   210: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   215: checkcast       Laafd;
        //   218: astore          18
        //   220: aload           18
        //   222: invokevirtual   aafd.d:()Z
        //   225: ifeq            1346
        //   228: aload           18
        //   230: getfield        aafd.e:Laaak;
        //   233: invokestatic    aaff.f:(Laaak;)I
        //   236: iconst_1       
        //   237: if_icmpne       255
        //   240: aload_0        
        //   241: invokespecial   aafx.w:()Z
        //   244: ifne            255
        //   247: iload_3        
        //   248: bipush          8
        //   250: ior            
        //   251: istore_1       
        //   252: goto            286
        //   255: iload_3        
        //   256: istore_1       
        //   257: aload           18
        //   259: getfield        aafd.e:Laaak;
        //   262: invokestatic    aaff.f:(Laaak;)I
        //   265: iconst_2       
        //   266: if_icmpne       286
        //   269: iload_3        
        //   270: istore_1       
        //   271: aload_0        
        //   272: getfield        aafx.r:Ltjm;
        //   275: invokeinterface tjm.r:()Z
        //   280: ifne            286
        //   283: goto            247
        //   286: aload           18
        //   288: getfield        aafd.d:J
        //   291: lstore          10
        //   293: lload           10
        //   295: lconst_0       
        //   296: lcmp           
        //   297: ifle            321
        //   300: lload           8
        //   302: lload           10
        //   304: aload           18
        //   306: getfield        aafd.c:J
        //   309: lsub           
        //   310: lcmp           
        //   311: ifge            321
        //   314: sipush          4096
        //   317: istore_3       
        //   318: goto            323
        //   321: iconst_0       
        //   322: istore_3       
        //   323: iload_3        
        //   324: iload_1        
        //   325: ior            
        //   326: istore          7
        //   328: iload           7
        //   330: sipush          4096
        //   333: iand           
        //   334: ifeq            361
        //   337: aload_0        
        //   338: getfield        aafx.u:Laaei;
        //   341: aload_0        
        //   342: getfield        aafx.G:Ljava/lang/String;
        //   345: lload           10
        //   347: aload           18
        //   349: getfield        aafd.c:J
        //   352: lsub           
        //   353: invokevirtual   aaei.c:(Ljava/lang/String;J)V
        //   356: iconst_1       
        //   357: istore_2       
        //   358: goto            361
        //   361: iload           7
        //   363: iconst_2       
        //   364: iand           
        //   365: ifeq            373
        //   368: iconst_0       
        //   369: istore_3       
        //   370: goto            375
        //   373: iconst_1       
        //   374: istore_3       
        //   375: iload           5
        //   377: iload_3        
        //   378: iconst_1       
        //   379: ixor           
        //   380: ior            
        //   381: istore          5
        //   383: iload           7
        //   385: bipush          8
        //   387: iand           
        //   388: ifeq            396
        //   391: iconst_0       
        //   392: istore_3       
        //   393: goto            398
        //   396: iconst_1       
        //   397: istore_3       
        //   398: iload           6
        //   400: iload_3        
        //   401: iconst_1       
        //   402: ixor           
        //   403: ior            
        //   404: istore          6
        //   406: iload           7
        //   408: ifeq            427
        //   411: aload_0        
        //   412: aload           18
        //   414: iload           7
        //   416: invokespecial   aafx.s:(Laafd;I)V
        //   419: iconst_1       
        //   420: istore          13
        //   422: iload_1        
        //   423: istore_3       
        //   424: goto            198
        //   427: aload_0        
        //   428: getfield        aafx.c:Laagh;
        //   431: aload           18
        //   433: getfield        aafd.a:Ljava/lang/String;
        //   436: invokevirtual   aagh.d:(Ljava/lang/String;)Z
        //   439: ifeq            450
        //   442: iconst_1       
        //   443: istore          12
        //   445: iload_1        
        //   446: istore_3       
        //   447: goto            198
        //   450: aload_0        
        //   451: getfield        aafx.f:Ljava/util/Set;
        //   454: aload           18
        //   456: getfield        aafd.a:Ljava/lang/String;
        //   459: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   464: ifeq            511
        //   467: aload_0        
        //   468: getfield        aafx.j:Ljava/lang/Object;
        //   471: astore          16
        //   473: aload           16
        //   475: monitorenter   
        //   476: aload_0        
        //   477: getfield        aafx.P:Ljava/util/Map;
        //   480: aload           18
        //   482: getfield        aafd.a:Ljava/lang/String;
        //   485: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   490: iload           12
        //   492: ior            
        //   493: istore          12
        //   495: aload           16
        //   497: monitorexit    
        //   498: iload_1        
        //   499: istore_3       
        //   500: goto            1341
        //   503: astore          15
        //   505: aload           16
        //   507: monitorexit    
        //   508: aload           15
        //   510: athrow         
        //   511: aload           18
        //   513: getfield        aafd.e:Laaak;
        //   516: invokestatic    aaff.g:(Laaak;)I
        //   519: iconst_2       
        //   520: if_icmpne       535
        //   523: iload           4
        //   525: ifeq            535
        //   528: iload_1        
        //   529: istore_3       
        //   530: iload_1        
        //   531: istore_3       
        //   532: goto            198
        //   535: aload           18
        //   537: getfield        aafd.a:Ljava/lang/String;
        //   540: astore          17
        //   542: aload_0        
        //   543: getfield        aafx.c:Laagh;
        //   546: aload           17
        //   548: invokevirtual   aagh.d:(Ljava/lang/String;)Z
        //   551: iconst_1       
        //   552: ixor           
        //   553: invokestatic    adkp.Q:(Z)V
        //   556: aload_0        
        //   557: invokespecial   aafx.v:()Z
        //   560: ifeq            571
        //   563: aload           18
        //   565: getfield        aafd.e:Laaak;
        //   568: invokestatic    aaff.ai:(Laaak;)V
        //   571: aload           18
        //   573: getfield        aafd.a:Ljava/lang/String;
        //   576: astore          19
        //   578: aload           18
        //   580: getfield        aafd.e:Laaak;
        //   583: invokestatic    aaff.h:(Laaak;)I
        //   586: istore_3       
        //   587: aload_0        
        //   588: getfield        aafx.c:Laagh;
        //   591: iload_3        
        //   592: invokevirtual   aagh.c:(I)Z
        //   595: ifne            604
        //   598: iconst_0       
        //   599: istore          14
        //   601: goto            1035
        //   604: aload_0        
        //   605: getfield        aafx.F:Laagl;
        //   608: astore          20
        //   610: aload           18
        //   612: invokevirtual   aafd.a:()Laabi;
        //   615: astore          16
        //   617: aload           20
        //   619: getfield        aagl.b:Latke;
        //   622: invokeinterface atke.a:()Ljava/lang/Object;
        //   627: checkcast       Laabo;
        //   630: astore          21
        //   632: aload           21
        //   634: invokevirtual   aabo.d:()Ljava/lang/String;
        //   637: astore          22
        //   639: ldc_w           "NO_OP_STORE_TAG"
        //   642: aload           22
        //   644: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   647: ifne            1004
        //   650: aload           22
        //   652: aload           16
        //   654: getfield        aabi.h:Ljava/lang/String;
        //   657: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   660: ifne            666
        //   663: goto            1004
        //   666: aload           21
        //   668: invokevirtual   aabo.a:()Laaeh;
        //   671: astore          21
        //   673: aload           21
        //   675: invokeinterface aaeh.c:()Lztp;
        //   680: astore          22
        //   682: aload           22
        //   684: ifnonnull       696
        //   687: ldc_w           "[Offline] cache supplier missing"
        //   690: invokestatic    ttr.b:(Ljava/lang/String;)V
        //   693: goto            1010
        //   696: aload           22
        //   698: invokeinterface ztp.c:()Laaam;
        //   703: astore          26
        //   705: aload           26
        //   707: ifnonnull       719
        //   710: ldc_w           "[Offline] storage location missing"
        //   713: invokestatic    ttr.b:(Ljava/lang/String;)V
        //   716: goto            693
        //   719: aload           20
        //   721: getfield        aagl.c:Lafaq;
        //   724: astore          24
        //   726: aload           20
        //   728: getfield        aagl.d:Loby;
        //   731: astore          31
        //   733: getstatic       aagl.a:Ljava/lang/Object;
        //   736: astore          28
        //   738: aload           20
        //   740: getfield        aagl.e:Latke;
        //   743: invokeinterface atke.a:()Ljava/lang/Object;
        //   748: checkcast       Lxyf;
        //   751: astore          23
        //   753: aload           20
        //   755: getfield        aagl.j:Lagoe;
        //   758: astore          29
        //   760: aload           20
        //   762: getfield        aagl.h:Lj$/util/Optional;
        //   765: astore          25
        //   767: aload           20
        //   769: getfield        aagl.f:Lxyx;
        //   772: astore          30
        //   774: aload           20
        //   776: getfield        aagl.g:Lzct;
        //   779: astore          27
        //   781: new             Laagr;
        //   784: astore          22
        //   786: aload           24
        //   788: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   791: pop            
        //   792: aload           31
        //   794: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   797: pop            
        //   798: aload           23
        //   800: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   803: pop            
        //   804: aload           29
        //   806: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   809: pop            
        //   810: aload           30
        //   812: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   815: pop            
        //   816: aload           27
        //   818: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   821: pop            
        //   822: aload           22
        //   824: aload           24
        //   826: aload           26
        //   828: aload           31
        //   830: aload           28
        //   832: aload           23
        //   834: aload           29
        //   836: aload           25
        //   838: aload           30
        //   840: aload           27
        //   842: aconst_null    
        //   843: aconst_null    
        //   844: aconst_null    
        //   845: invokespecial   aagr.<init>:(Lafaq;Llxr;Loby;Ljava/lang/Object;Lxyf;Lagoe;Lj$/util/Optional;Lxyx;Lzct;[B[B[B)V
        //   848: aload           16
        //   850: getfield        aabi.f:Laaak;
        //   853: invokestatic    aaff.h:(Laaak;)I
        //   856: istore          7
        //   858: aload           20
        //   860: getfield        aagl.i:Ljava/util/Map;
        //   863: iload           7
        //   865: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   868: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   873: checkcast       Latke;
        //   876: astore          20
        //   878: aload           20
        //   880: ifnull          910
        //   883: aload           20
        //   885: invokeinterface atke.a:()Ljava/lang/Object;
        //   890: checkcast       Laahb;
        //   893: aload           16
        //   895: aload_0        
        //   896: aload           22
        //   898: aload           21
        //   900: invokeinterface aahb.a:(Laabi;Laafn;Laagr;Laaeh;)Laafo;
        //   905: astore          16
        //   907: goto            1013
        //   910: getstatic       zll.b:Lzll;
        //   913: astore          18
        //   915: getstatic       zlk.B:Lzlk;
        //   918: astore          16
        //   920: new             Ljava/lang/StringBuilder;
        //   923: astore          19
        //   925: aload           19
        //   927: invokespecial   java/lang/StringBuilder.<init>:()V
        //   930: aload           19
        //   932: ldc_w           "Unrecognized transfer type: "
        //   935: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   938: pop            
        //   939: aload           19
        //   941: iload           7
        //   943: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   946: pop            
        //   947: aload           18
        //   949: aload           16
        //   951: aload           19
        //   953: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   956: invokestatic    zlm.b:(Lzll;Lzlk;Ljava/lang/String;)V
        //   959: new             Ljava/lang/IllegalArgumentException;
        //   962: astore          18
        //   964: new             Ljava/lang/StringBuilder;
        //   967: astore          16
        //   969: aload           16
        //   971: invokespecial   java/lang/StringBuilder.<init>:()V
        //   974: aload           16
        //   976: ldc_w           "Unrecognized transfer type: "
        //   979: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   982: pop            
        //   983: aload           16
        //   985: iload           7
        //   987: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   990: pop            
        //   991: aload           18
        //   993: aload           16
        //   995: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   998: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //  1001: aload           18
        //  1003: athrow         
        //  1004: ldc_w           "[Offline] incorrect account"
        //  1007: invokestatic    ttr.b:(Ljava/lang/String;)V
        //  1010: aconst_null    
        //  1011: astore          16
        //  1013: aload           16
        //  1015: ifnonnull       1021
        //  1018: goto            598
        //  1021: aload_0        
        //  1022: getfield        aafx.c:Laagh;
        //  1025: aload           19
        //  1027: aload           16
        //  1029: iload_3        
        //  1030: invokevirtual   aagh.e:(Ljava/lang/String;Laafo;I)Z
        //  1033: istore          14
        //  1035: aload           18
        //  1037: getfield        aafd.b:I
        //  1040: ifeq            1054
        //  1043: aload           18
        //  1045: iconst_0       
        //  1046: putfield        aafd.b:I
        //  1049: iconst_1       
        //  1050: istore_3       
        //  1051: goto            1056
        //  1054: iconst_0       
        //  1055: istore_3       
        //  1056: aload_0        
        //  1057: getfield        aafx.c:Laagh;
        //  1060: aload           17
        //  1062: invokevirtual   aagh.a:(Ljava/lang/String;)Laafo;
        //  1065: astore          17
        //  1067: iload           14
        //  1069: ifeq            1242
        //  1072: aload           17
        //  1074: ifnull          1242
        //  1077: aload           18
        //  1079: getfield        aafd.f:Laaak;
        //  1082: invokestatic    aaff.X:(Laaak;)Z
        //  1085: ifeq            1097
        //  1088: aload           18
        //  1090: getfield        aafd.f:Laaak;
        //  1093: iconst_0       
        //  1094: invokestatic    aaff.C:(Laaak;Z)V
        //  1097: aload           18
        //  1099: getstatic       aowy.d:Laowy;
        //  1102: putfield        aafd.j:Laowy;
        //  1105: aload_0        
        //  1106: getfield        aafx.N:Z
        //  1109: ifne            1201
        //  1112: aload_0        
        //  1113: getfield        aafx.G:Ljava/lang/String;
        //  1116: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //  1119: astore          16
        //  1121: goto            1167
        //  1124: astore          16
        //  1126: ldc_w           "[Offline] Cannot find class: "
        //  1129: aload_0        
        //  1130: getfield        aafx.G:Ljava/lang/String;
        //  1133: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1136: invokestatic    ttr.b:(Ljava/lang/String;)V
        //  1139: getstatic       zll.b:Lzll;
        //  1142: getstatic       zlk.B:Lzlk;
        //  1145: ldc_w           "Transfer executor cannot find transfer service class: "
        //  1148: aload           16
        //  1150: invokevirtual   java/lang/ClassNotFoundException.getMessage:()Ljava/lang/String;
        //  1153: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1156: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1159: aload           16
        //  1161: invokestatic    zlm.c:(Lzll;Lzlk;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1164: aconst_null    
        //  1165: astore          16
        //  1167: aload           16
        //  1169: ifnonnull       1175
        //  1172: goto            1331
        //  1175: aload_0        
        //  1176: getfield        aafx.p:Landroid/content/Context;
        //  1179: astore          19
        //  1181: aload_0        
        //  1182: aload           19
        //  1184: new             Landroid/content/Intent;
        //  1187: dup            
        //  1188: aload           19
        //  1190: aload           16
        //  1192: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1195: invokestatic    aaiy.a:(Landroid/content/Context;Landroid/content/Intent;)Z
        //  1198: putfield        aafx.N:Z
        //  1201: aload_0        
        //  1202: getfield        aafx.C:Laaft;
        //  1205: aload           17
        //  1207: invokeinterface aaft.a:(Laafo;)V
        //  1212: aload_0        
        //  1213: getfield        aafx.N:Z
        //  1216: ifne            1249
        //  1219: aload_0        
        //  1220: getfield        aafx.H:Ltcq;
        //  1223: ldc_w           "offline_transfer_keep_alive"
        //  1226: lconst_0       
        //  1227: iconst_0       
        //  1228: iconst_1       
        //  1229: iconst_0       
        //  1230: aconst_null    
        //  1231: aconst_null    
        //  1232: iconst_0       
        //  1233: invokeinterface tcq.d:(Ljava/lang/String;JZIZLandroid/os/Bundle;Lypi;Z)Z
        //  1238: pop            
        //  1239: goto            1249
        //  1242: iload_3        
        //  1243: ifne            1249
        //  1246: goto            1285
        //  1249: aload_0        
        //  1250: getfield        aafx.b:Laafq;
        //  1253: aload           18
        //  1255: invokeinterface aafq.h:(Laafd;)V
        //  1260: aload_0        
        //  1261: getfield        aafx.d:Laafr;
        //  1264: aload           18
        //  1266: invokevirtual   aafd.a:()Laabi;
        //  1269: getstatic       amvn.a:Lamvn;
        //  1272: aload           18
        //  1274: getfield        aafd.e:Laaak;
        //  1277: invokestatic    aaff.o:(Laaak;)Laaaq;
        //  1280: invokeinterface aafr.l:(Laabi;Lamvn;Laaaq;)V
        //  1285: iconst_1       
        //  1286: istore_3       
        //  1287: goto            1333
        //  1290: astore          16
        //  1292: bipush          10
        //  1294: invokestatic    aafw.a:(I)Laafv;
        //  1297: astore          16
        //  1299: aload           16
        //  1301: aload           17
        //  1303: invokevirtual   aafv.f:(Ljava/lang/String;)V
        //  1306: aload           16
        //  1308: getstatic       aaaq.h:Laaaq;
        //  1311: invokevirtual   aafv.d:(Laaaq;)V
        //  1314: aload           16
        //  1316: getstatic       amvn.g:Lamvn;
        //  1319: invokevirtual   aafv.c:(Lamvn;)V
        //  1322: aload_0        
        //  1323: aload           16
        //  1325: invokevirtual   aafv.a:()Laafw;
        //  1328: invokevirtual   aafx.k:(Laafw;)V
        //  1331: iconst_0       
        //  1332: istore_3       
        //  1333: iload_3        
        //  1334: iload           12
        //  1336: ior            
        //  1337: istore          12
        //  1339: iload_1        
        //  1340: istore_3       
        //  1341: iload_1        
        //  1342: istore_3       
        //  1343: goto            530
        //  1346: goto            198
        //  1349: aload_0        
        //  1350: iload           12
        //  1352: putfield        aafx.h:Z
        //  1355: aload_0        
        //  1356: iload           13
        //  1358: putfield        aafx.i:Z
        //  1361: iload           12
        //  1363: ifeq            1386
        //  1366: aload_0        
        //  1367: getfield        aafx.J:Landroid/net/wifi/WifiManager$WifiLock;
        //  1370: invokevirtual   android/net/wifi/WifiManager$WifiLock.isHeld:()Z
        //  1373: ifne            1403
        //  1376: aload_0        
        //  1377: getfield        aafx.J:Landroid/net/wifi/WifiManager$WifiLock;
        //  1380: invokevirtual   android/net/wifi/WifiManager$WifiLock.acquire:()V
        //  1383: goto            1403
        //  1386: aload_0        
        //  1387: getfield        aafx.J:Landroid/net/wifi/WifiManager$WifiLock;
        //  1390: invokevirtual   android/net/wifi/WifiManager$WifiLock.isHeld:()Z
        //  1393: ifeq            1403
        //  1396: aload_0        
        //  1397: getfield        aafx.J:Landroid/net/wifi/WifiManager$WifiLock;
        //  1400: invokevirtual   android/net/wifi/WifiManager$WifiLock.release:()V
        //  1403: iload           12
        //  1405: ifeq            1421
        //  1408: aload_0        
        //  1409: getfield        aafx.B:Latiw;
        //  1412: getstatic       aafu.e:Laafu;
        //  1415: invokevirtual   atiw.tu:(Ljava/lang/Object;)V
        //  1418: goto            1484
        //  1421: iload           6
        //  1423: ifeq            1439
        //  1426: aload_0        
        //  1427: getfield        aafx.B:Latiw;
        //  1430: getstatic       aafu.b:Laafu;
        //  1433: invokevirtual   atiw.tu:(Ljava/lang/Object;)V
        //  1436: goto            1484
        //  1439: iload           5
        //  1441: ifeq            1457
        //  1444: aload_0        
        //  1445: getfield        aafx.B:Latiw;
        //  1448: getstatic       aafu.c:Laafu;
        //  1451: invokevirtual   atiw.tu:(Ljava/lang/Object;)V
        //  1454: goto            1484
        //  1457: iload_2        
        //  1458: ifeq            1474
        //  1461: aload_0        
        //  1462: getfield        aafx.B:Latiw;
        //  1465: getstatic       aafu.d:Laafu;
        //  1468: invokevirtual   atiw.tu:(Ljava/lang/Object;)V
        //  1471: goto            1484
        //  1474: aload_0        
        //  1475: getfield        aafx.B:Latiw;
        //  1478: getstatic       aafu.a:Laafu;
        //  1481: invokevirtual   atiw.tu:(Ljava/lang/Object;)V
        //  1484: iload           5
        //  1486: ifeq            1517
        //  1489: aload_0        
        //  1490: getfield        aafx.t:Ltcq;
        //  1493: ldc_w           "transfer_connectivity_wakeup"
        //  1496: getstatic       aafx.a:J
        //  1499: iconst_1       
        //  1500: iconst_1       
        //  1501: iconst_0       
        //  1502: aload_0        
        //  1503: invokespecial   aafx.o:()Landroid/os/Bundle;
        //  1506: aconst_null    
        //  1507: iconst_0       
        //  1508: invokeinterface tcq.d:(Ljava/lang/String;JZIZLandroid/os/Bundle;Lypi;Z)Z
        //  1513: pop            
        //  1514: goto            1529
        //  1517: aload_0        
        //  1518: getfield        aafx.t:Ltcq;
        //  1521: ldc_w           "transfer_connectivity_wakeup"
        //  1524: invokeinterface tcq.b:(Ljava/lang/String;)V
        //  1529: iload           6
        //  1531: ifeq            1571
        //  1534: aload_0        
        //  1535: getfield        aafx.t:Ltcq;
        //  1538: ldc_w           "transfer_wifi_wakeup"
        //  1541: getstatic       aafx.a:J
        //  1544: iconst_1       
        //  1545: iconst_2       
        //  1546: iconst_0       
        //  1547: aload_0        
        //  1548: invokespecial   aafx.o:()Landroid/os/Bundle;
        //  1551: aconst_null    
        //  1552: iconst_0       
        //  1553: invokeinterface tcq.d:(Ljava/lang/String;JZIZLandroid/os/Bundle;Lypi;Z)Z
        //  1558: pop            
        //  1559: aload_0        
        //  1560: getfield        aafx.z:Laagg;
        //  1563: aload_0        
        //  1564: getfield        aafx.G:Ljava/lang/String;
        //  1567: invokevirtual   aagg.b:(Ljava/lang/String;)V
        //  1570: return         
        //  1571: aload_0        
        //  1572: getfield        aafx.t:Ltcq;
        //  1575: ldc_w           "transfer_wifi_wakeup"
        //  1578: invokeinterface tcq.b:(Ljava/lang/String;)V
        //  1583: aload_0        
        //  1584: getfield        aafx.z:Laagg;
        //  1587: invokevirtual   aagg.a:()Ljava/lang/String;
        //  1590: pop            
        //  1591: return         
        //  1592: astore          16
        //  1594: goto            1292
        //  1597: astore          16
        //  1599: goto            1292
        //  1602: astore          16
        //  1604: goto            1292
        //  1607: astore          16
        //  1609: goto            1292
        //  1612: astore          16
        //  1614: goto            1292
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  476    498    503    511    Any
        //  505    508    503    511    Any
        //  571    598    1290   1292   Ljava/lang/IllegalArgumentException;
        //  604    663    1290   1292   Ljava/lang/IllegalArgumentException;
        //  666    682    1290   1292   Ljava/lang/IllegalArgumentException;
        //  687    693    1290   1292   Ljava/lang/IllegalArgumentException;
        //  696    705    1290   1292   Ljava/lang/IllegalArgumentException;
        //  710    716    1290   1292   Ljava/lang/IllegalArgumentException;
        //  719    738    1290   1292   Ljava/lang/IllegalArgumentException;
        //  738    760    1592   1597   Ljava/lang/IllegalArgumentException;
        //  760    767    1597   1602   Ljava/lang/IllegalArgumentException;
        //  767    774    1602   1607   Ljava/lang/IllegalArgumentException;
        //  774    781    1607   1612   Ljava/lang/IllegalArgumentException;
        //  781    878    1612   1617   Ljava/lang/IllegalArgumentException;
        //  883    907    1612   1617   Ljava/lang/IllegalArgumentException;
        //  910    1004   1612   1617   Ljava/lang/IllegalArgumentException;
        //  1004   1010   1612   1617   Ljava/lang/IllegalArgumentException;
        //  1021   1035   1612   1617   Ljava/lang/IllegalArgumentException;
        //  1112   1121   1124   1167   Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 729, Size: 729
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
    
    private final void s(final aafd aafd, final int b) {
        final aowy j = aafd.j;
        final aowy b2 = aowy.b;
        final int n = 1;
        int n2;
        if (j != b2) {
            aafd.j = aowy.b;
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final String a = aafd.a;
        final aafo b3 = this.c.b(a);
        if (b3 != null) {
            b3.a(b);
        }
        aafd.i = 0;
        if (this.f.remove(a)) {
            aaff.w(aafd.e, this.s.c());
            n2 = 1;
        }
        if (aafd.b != b) {
            aafd.b = b;
            n2 = n;
        }
        this.b.h(aafd);
        if (n2 != 0) {
            final aafr d = this.d;
            final aabi a2 = aafd.a();
            final amvn a3 = amvn.a;
            aaaq aaaq;
            if ((aafd.b & 0x180) != 0x0) {
                aaaq = aaaq.i;
            }
            else {
                aaaq = aaff.o(aafd.e);
            }
            d.l(a2, a3, aaaq);
        }
    }
    
    private final boolean t() {
        return !this.r.o();
    }
    
    private final boolean u() {
        return this.K != aqra.d && (this.t() || !this.r.r() || this.r.i());
    }
    
    private final boolean v() {
        return this.U.p() && this.r.q();
    }
    
    private final boolean w() {
        return (this.r.r() && !this.r.i()) || this.v();
    }
    
    public final void a(final String s, final aaak d) {
        final aafv a = aafw.a(8);
        a.f(s);
        a.d = d;
        this.k(a.a());
    }
    
    public final void b(final String s, final long n, final double n2, final boolean b) {
        final aafv a = aafw.a(7);
        a.f(s);
        a.b(n);
        a.h(n2);
        a.i(b);
        this.k(a.a());
    }
    
    public final void c(final String s, final long n) {
        final aafv a = aafw.a(6);
        a.f(s);
        a.g(n);
        this.k(a.a());
    }
    
    public final void d(final String s, final aafp aafp, final aaak d) {
        final aafd h = this.l.h(s);
        if (h == null) {
            return;
        }
        final aaak e = h.e;
        final int i = h.i;
        final amvn c = aafp.c;
        final boolean a = aafp.a;
        if (c == amvn.C) {
            d.l("stream_verification_attempts", aaff.b(d) + 1);
        }
        amvn amvn = c;
        boolean b = a;
        Label_0476: {
            if (!a) {
                if (aakr.N(e)) {
                    final ahaz o = aakr.O(h.a());
                    o.copyOnWrite();
                    final amvq amvq = (amvq)o.instance;
                    final amvq a2 = amvq.a;
                    amvq.h = 13;
                    amvq.b |= 0x10;
                    o.copyOnWrite();
                    final amvq amvq2 = (amvq)o.instance;
                    amvq2.i = c.H;
                    amvq2.b |= 0x20;
                    o.copyOnWrite();
                    final amvq amvq3 = (amvq)o.instance;
                    amvq3.g = 3;
                    amvq3.b |= 0x8;
                    final boolean a3 = aaja.a;
                    o.copyOnWrite();
                    final amvq amvq4 = (amvq)o.instance;
                    amvq4.c |= 0x40;
                    amvq4.A = a3;
                    if (aafp.getCause() != null && c == amvn.v) {
                        final String simpleName = aafp.getCause().getClass().getSimpleName();
                        o.copyOnWrite();
                        final amvq amvq5 = (amvq)o.instance;
                        simpleName.getClass();
                        amvq5.b |= 0x80;
                        amvq5.j = simpleName;
                    }
                    this.w.b((amvq)o.build());
                }
                final long j = aaff.i(e);
                amue amue;
                if ((amue = this.y.d.f().g) == null) {
                    amue = amue.a;
                }
                final long millis = TimeUnit.HOURS.toMillis(amue.y);
                if (aaff.g(e) == 0) {
                    amvn = amvn.D;
                }
                else if (i + 1 <= aaff.a(e) && (millis <= 0L || j < millis)) {
                    amvn = c;
                    b = a;
                    if (aaff.b(d) <= 2L) {
                        break Label_0476;
                    }
                    amvn = amvn.B;
                }
                else {
                    amvn = amvn.h;
                }
                b = true;
            }
        }
        if (amvn == amvn.v) {
            final ztp c2 = ((aabo)this.v.a()).a().c();
            final zzu f = ((aabo)this.v.a()).a().f();
            if (c2 != null) {
                if (f != null) {
                    if (c2.e() != null && f.u()) {
                        aaff.C(d, true);
                    }
                }
            }
        }
        final aafv a4 = aafw.a(17);
        a4.f(s);
        a4.d = d;
        this.k(a4.a());
        if (aafp.getCause() instanceof aafg) {
            final aafg aafg = (aafg)aafp.getCause();
            final aafv a5 = aafw.a(13);
            a5.f(s);
            a5.e(4096);
            this.k(a5.a());
            this.m();
            this.u.c(this.G, aafg.a);
            return;
        }
        if (b) {
            final aafv a6 = aafw.a(10);
            a6.f(s);
            a6.d(aafp.b);
            a6.c(amvn);
            this.k(a6.a());
            return;
        }
        final aafv a7 = aafw.a(9);
        a7.f(s);
        this.k(a7.a());
    }
    
    public final int e() {
        synchronized (this.j) {
            final int size = this.O.size();
            final int size2 = this.P.size();
            monitorexit(this.j);
            return size + size2;
        }
    }
    
    public final void f(final String s, final Bundle bundle) {
        if (s == null) {
            return;
        }
        final int hashCode = s.hashCode();
        int n = 0;
        Label_0059: {
            if (hashCode != 1134224607) {
                if (hashCode == 1897312741) {
                    if (s.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage")) {
                        n = 0;
                        break Label_0059;
                    }
                }
            }
            else if (s.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup")) {
                n = 1;
                break Label_0059;
            }
            n = -1;
        }
        if (n != 0) {
            if (n == 1) {
                this.k(aafw.a(4).a());
            }
        }
        else if (bundle != null && bundle.getInt("messageId") == 10) {
            final String string = bundle.getString("messageData");
            if (string != null) {
                final aafv a = aafw.a(11);
                a.f(string);
                this.k(a.a());
            }
        }
    }
    
    public final void g() {
        this.M = true;
        this.N = false;
        final aage d = this.D;
        final Context p = this.p;
        try {
            p.unregisterReceiver((BroadcastReceiver)d);
        }
        catch (final IllegalArgumentException ex) {
            ((BroadcastReceiver)d).getClass().getSimpleName();
        }
        d.a = null;
        final aagf e = this.E;
        final asir c = e.c;
        if (c != null) {
            athz.f((AtomicReference)c);
        }
        final asir d2 = e.d;
        if (d2 != null) {
            athz.f((AtomicReference)d2);
        }
        this.k(aafw.a(14).a());
    }
    
    public final void h(final String s) {
        final aafv a = aafw.a(1);
        a.a = aezp.k((Object)s);
        this.k(a.a());
    }
    
    public final void i(final String s) {
        synchronized (this.j) {
            if (this.f.contains(s)) {
                final ScheduledFuture scheduledFuture = this.P.remove(s);
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                final aafv a = aafw.a(11);
                a.f(s);
                this.k(a.a());
            }
        }
    }
    
    public final void j(final aqra aqra) {
        final aafv a = aafw.a(21);
        a.c = aezp.k((Object)aqra);
        this.k(a.a());
    }
    
    public final void k(final aafw aafw) {
        if (this.g) {
            return;
        }
        synchronized (this.j) {
            this.p();
            this.O.add(aafw);
            this.l();
        }
    }
    
    public final void l() {
        synchronized (this.j) {
            if (!this.O.isEmpty()) {
                final ListenableFuture k = this.k;
                if (k == null || k.isDone()) {
                    (this.k = afwm.p((Runnable)new ztz(this, 15), (Executor)this.q)).addListener((Runnable)new ztz(this, 16), (Executor)this.q);
                }
            }
        }
    }
    
    public final void m() {
        this.k(aafw.a(4).a());
    }
    
    public final boolean n() {
        Object l = this.j;
        monitorenter(l);
        try {
            final aafw aafw = this.O.poll();
            monitorexit(l);
            if (aafw != null) {
                try {
                    if (this.M && aafw.l != 14) {
                        return aafw != null;
                    }
                    if (this.g) {
                        return aafw != null;
                    }
                    this.I.acquire();
                    while (true) {
                        try {
                            this.b.e();
                            l = amvn.a;
                            final int i = aafw.l;
                            if (i != 0) {
                                switch (i - 1) {
                                    case 21: {
                                        if (!aafw.a.h() || this.l.n((String)aafw.a.c())) {
                                            break;
                                        }
                                        l = this.b.a((String)aafw.a.c());
                                        if (((aezp)l).h()) {
                                            this.l.l((aafd)((aezp)l).c());
                                            this.d.e(((aafd)((aezp)l).c()).a());
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 20: {
                                        if (!aafw.j.h()) {
                                            break;
                                        }
                                        l = aafw.j.c();
                                        if (this.K != l) {
                                            this.K = (aqra)l;
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 19: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            if (((aafd)l).b()) {
                                                ((aafd)l).j = aowy.b;
                                                ((aafd)l).b = 64;
                                                this.b.h((aafd)l);
                                            }
                                            this.d.i(((aafd)l).a());
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 18: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            if (((aafd)l).d()) {
                                                ((aafd)l).j = aowy.e;
                                                final String a = ((aafd)l).a;
                                                final aafo b = this.c.b(a);
                                                if (b != null) {
                                                    b.a(128);
                                                }
                                                ((aafd)l).i = 0;
                                                this.f.remove(a);
                                                ((aafd)l).b = 128;
                                                this.b.h((aafd)l);
                                                this.d.f(((aafd)l).a());
                                            }
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 17: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            this.d.k(((aafd)l).a());
                                            break;
                                        }
                                        break;
                                    }
                                    case 16: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        final aafd h = this.l.h((String)l);
                                        if (h == null) {
                                            break;
                                        }
                                        l = aafw.k;
                                        l.getClass();
                                        h.f = (aaak)l;
                                        this.b.h(h);
                                        if (!aaff.X(h.f)) {
                                            break;
                                        }
                                        l = ((aabo)this.v.a()).a().l().e(aaff.u(h.e));
                                        if (l != null) {
                                            this.x.d((Object)new zyo((aabf)l));
                                            break;
                                        }
                                        break;
                                    }
                                    case 15: {
                                        final Iterator iterator = this.l.j().iterator();
                                        while (iterator.hasNext()) {
                                            l = iterator.next();
                                            final String a2 = ((aafd)l).a;
                                            final String g = ((aafd)l).g;
                                            ((aafd)l).j.name();
                                            if (((aafd)l).d()) {
                                                this.s((aafd)l, 256);
                                            }
                                        }
                                        this.l.m();
                                        this.f.clear();
                                        this.h = false;
                                        this.B.tu((Object)aafu.a);
                                        break;
                                    }
                                    case 14: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            this.d.m(((aafd)l).a());
                                            break;
                                        }
                                        break;
                                    }
                                    case 13: {
                                        while (this.J.isHeld()) {
                                            ttr.l("[Offline] wifiLock held in quit");
                                            this.J.release();
                                        }
                                        this.e();
                                        this.g = true;
                                        synchronized (this.j) {
                                            this.O.clear();
                                            final Iterator iterator2 = this.P.values().iterator();
                                            while (iterator2.hasNext()) {
                                                final ScheduledFuture scheduledFuture = (ScheduledFuture)iterator2.next();
                                                if (scheduledFuture != null) {
                                                    scheduledFuture.cancel(false);
                                                }
                                                iterator2.remove();
                                            }
                                            this.p();
                                            break;
                                        }
                                    }
                                    case 12: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            this.s((aafd)l, aafw.h);
                                            break;
                                        }
                                        break;
                                    }
                                    case 11: {
                                        l = this.l.j().iterator();
                                        while (((Iterator)l).hasNext()) {
                                            final aafd aafd = ((Iterator<aafd>)l).next();
                                            final String a3 = aafd.a;
                                            final String g2 = aafd.g;
                                            aafd.j.name();
                                            if (aafd.c()) {
                                                this.s(aafd, 256);
                                            }
                                        }
                                        this.e = null;
                                        this.l.m();
                                        this.f.clear();
                                        this.h = false;
                                        break;
                                    }
                                    case 10: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        if (!this.f.remove(l)) {
                                            break;
                                        }
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            aaff.w(((aafd)l).e, this.s.c());
                                            this.b.h((aafd)l);
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 9: {
                                        if (!aafw.a.h() || !aafw.f.h() || !aafw.g.h()) {
                                            break;
                                        }
                                        final String s = (String)aafw.a.c();
                                        final aaaq aaaq = (aaaq)aafw.f.c();
                                        final amvn amvn = (amvn)aafw.g.c();
                                        final aafd h2 = this.l.h(s);
                                        if (h2 != null) {
                                            final int h3 = amvn.H;
                                            l = aaaq.toString();
                                            final StringBuilder sb = new StringBuilder("[Offline] transfer fatal fail Id:");
                                            sb.append(s);
                                            sb.append(" Reason: ");
                                            sb.append(h3);
                                            sb.append(" Media Status: ");
                                            sb.append((String)l);
                                            ttr.b(sb.toString());
                                            h2.j = aowy.f;
                                            h2.i = 0;
                                            switch (amvn.ordinal()) {
                                                default: {
                                                    l = aowz.a;
                                                    break;
                                                }
                                                case 24: {
                                                    l = aowz.j;
                                                    break;
                                                }
                                                case 21:
                                                case 31: {
                                                    l = aowz.b;
                                                    break;
                                                }
                                                case 16: {
                                                    l = aowz.h;
                                                    break;
                                                }
                                                case 8:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 22:
                                                case 27:
                                                case 28: {
                                                    l = aowz.f;
                                                    break;
                                                }
                                                case 7:
                                                case 29: {
                                                    l = aowz.e;
                                                    break;
                                                }
                                                case 6:
                                                case 10: {
                                                    l = aowz.d;
                                                    break;
                                                }
                                                case 5:
                                                case 26: {
                                                    l = aowz.g;
                                                    break;
                                                }
                                            }
                                            h2.k = (aowz)l;
                                            this.l.i(s);
                                            this.b.c(h2);
                                            this.c.b(s);
                                            this.f.remove(s);
                                            this.d.l(h2.a(), amvn, aaaq);
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 8: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        final aafd h4 = this.l.h((String)l);
                                        if (h4 != null) {
                                            final int j = h4.i;
                                            final StringBuilder sb2 = new StringBuilder("[Offline] transfer retry ");
                                            sb2.append((String)l);
                                            sb2.append(", previous failure count: ");
                                            sb2.append(j);
                                            ttr.l(sb2.toString());
                                            final aaak e = h4.e;
                                            this.c.b((String)l);
                                            final int k = h4.i + 1;
                                            h4.i = k;
                                            final int min = Math.min(Math.max(k, 1), 20);
                                            if (min > 1) {
                                                final long min2 = Math.min((1 << min - 1) * aaff.j(e), e.e("max_retry_milli_secs", aaff.d));
                                                aaff.x(e, this.s.c());
                                                this.f.add(l);
                                                if (min2 > aafx.o) {
                                                    final Bundle bundle = new Bundle();
                                                    bundle.putString("servicePath", this.G);
                                                    bundle.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage");
                                                    bundle.putInt("messageId", 10);
                                                    bundle.putString("messageData", (String)l);
                                                    this.t.d("transfer_dm2", TimeUnit.MILLISECONDS.toSeconds(min2), true, 0, false, bundle, (ypi)null, true);
                                                }
                                                else {
                                                    final msr s2 = this.S;
                                                    final double n = (double)min2;
                                                    Double.isNaN(n);
                                                    Double.isNaN(n);
                                                    final long n2 = (long)s2.x(n, 0.5 * n + n);
                                                    synchronized (this.j) {
                                                        this.p();
                                                        this.P.put(l, this.q.schedule((Runnable)new zum(this, (String)l, 14), n2, TimeUnit.MILLISECONDS));
                                                    }
                                                }
                                            }
                                            this.b.h(h4);
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 7: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        final aafd h5 = this.l.h((String)l);
                                        if (h5 != null) {
                                            if ((l = aafw.k) == null) {
                                                l = new aabh();
                                            }
                                            h5.f = (aaak)l;
                                            h5.j = aowy.g;
                                            l = h5.a;
                                            this.c.b((String)l);
                                            h5.i = 0;
                                            this.f.remove(l);
                                            this.l.i((String)l);
                                            this.b.c(h5);
                                            this.d.l(h5.a(), amvn.a, aaff.n(h5.e));
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 6: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            final long c = aafw.c;
                                            if (((aafd)l).c < c) {
                                                ((aafd)l).i = 0;
                                                ((aafd)l).c = c;
                                            }
                                            aaff.S(((aafd)l).f, aafw.d);
                                            this.b.h((aafd)l);
                                            this.d.g(((aafd)l).a(), aafw.e);
                                            break;
                                        }
                                        break;
                                    }
                                    case 5: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        l = this.l.h((String)l);
                                        if (l != null) {
                                            final long b2 = aafw.b;
                                            if (b2 != ((aafd)l).d) {
                                                ((aafd)l).c = 0L;
                                            }
                                            ((aafd)l).d = b2;
                                            this.b.h((aafd)l);
                                            this.d.j(((aafd)l).a());
                                            break;
                                        }
                                        break;
                                    }
                                    case 4: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = this.b.a((String)aafw.a.c());
                                        if (((aezp)l).h()) {
                                            this.l.l((aafd)((aezp)l).c());
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 3: {
                                        this.r();
                                        break;
                                    }
                                    case 2: {
                                        if (!aafw.a.h()) {
                                            break;
                                        }
                                        l = aafw.a.c();
                                        final int h6 = aafw.h;
                                        if (!this.l.n((String)l)) {
                                            this.b.g((String)l);
                                            break;
                                        }
                                        final aafo b3 = this.c.b((String)l);
                                        if (b3 != null) {
                                            b3.a(h6);
                                        }
                                        this.f.remove(l);
                                        l = this.l.i((String)l);
                                        if (l != null) {
                                            ((aafd)l).b = h6;
                                            this.b.f((aafd)l);
                                            l = ((aafd)l).a();
                                            this.d.h((aabi)l);
                                        }
                                        this.r();
                                        break;
                                    }
                                    case 1: {
                                        if (!aafw.i.h()) {
                                            break;
                                        }
                                        final aafd aafd2 = (aafd)aafw.i.c();
                                        if (this.l.n(aafd2.a)) {
                                            l = this.l.h(aafd2.a);
                                            if (l != null) {
                                                if (((aafd)l).c()) {
                                                    this.s((aafd)l, 256);
                                                }
                                                this.b.f((aafd)l);
                                                this.b.d(aafd2);
                                                this.l.l(aafd2);
                                                this.d.e(aafd2.a());
                                                this.f.remove(aafd2.a);
                                            }
                                            this.r();
                                            break;
                                        }
                                        this.b.d(aafd2);
                                        if (TextUtils.equals((CharSequence)this.e, (CharSequence)aafd2.g)) {
                                            this.l.l(aafd2);
                                            this.d.e(aafd2.a());
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 0: {
                                        l = this.A.c();
                                        if (this.L == null || !this.L.equals(l)) {
                                            this.L = (zme)l;
                                            this.e = this.L.d();
                                            l = this.b.b(this.L).iterator();
                                            while (((Iterator)l).hasNext()) {
                                                final aafd aafd3 = ((Iterator<aafd>)l).next();
                                                final String a4 = aafd3.a;
                                                final String g3 = aafd3.g;
                                                aafd3.j.name();
                                                this.l.l(aafd3);
                                                if (aafd3.c()) {
                                                    aafd3.j = aowy.b;
                                                    aafd3.b = 1;
                                                    this.b.h(aafd3);
                                                }
                                            }
                                            this.d.d(this.l.k());
                                            this.r();
                                            break;
                                        }
                                        break;
                                    }
                                }
                                this.I.release();
                                this.q();
                                return aafw != null;
                            }
                            throw null;
                        }
                        catch (final RuntimeException ex) {
                            l = this.R;
                            if (((arwh)l).f() != null && (((arwh)l).f().b & 0x200) != 0x0) {
                                if ((l = ((arwh)l).f().g) == null) {
                                    l = amue.a;
                                }
                                if (((amue)l).s) {
                                    final zll b4 = zll.b;
                                    final zlk b5 = zlk.B;
                                    final int m = aafw.l;
                                    if (m == 0) {
                                        throw null;
                                    }
                                    l = ex.getMessage();
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Transfer executor error handling message ");
                                    sb3.append(m - 1);
                                    sb3.append(": ");
                                    sb3.append((String)l);
                                    zlm.c(b4, b5, sb3.toString(), (Throwable)ex);
                                }
                            }
                            this.I.release();
                            continue;
                        }
                        break;
                    }
                    this.I.release();
                    this.q();
                }
                catch (final Error l) {}
                catch (final RuntimeException ex2) {}
                ttr.d("[Offline] Error while executing queued action!", (Throwable)l);
            }
            return aafw != null;
        }
        finally {
            monitorexit(l);
            while (true) {}
        }
    }
}
