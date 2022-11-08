import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmk implements gue
{
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public float E;
    public ReelPlayerView F;
    public final uyi G;
    public final uyi H;
    public final iw I;
    public trg J;
    public trg K;
    public trg L;
    public qpt M;
    public final qpt N;
    private final hlx O;
    private final hqa P;
    private final hpd Q;
    private final hqe R;
    private final abno S;
    private final boolean T;
    private final abni U;
    private final wwu V;
    private long W;
    private int X;
    private int Y;
    private final arud Z;
    public final hlf a;
    private qpt aa;
    public final hnb b;
    public final hmb c;
    public final aeyr d;
    public final hok e;
    public final hmq f;
    public final hmm g;
    public final ReelSnackbarController h;
    public final oas i;
    public final Executor j;
    public final AtomicInteger k;
    public final AtomicInteger l;
    public final List m;
    public final fjz n;
    public hmj o;
    public hma p;
    public ReelRecyclerView q;
    public hme r;
    public hmg s;
    public SubtitlesOverlayPresenter t;
    public boolean u;
    public int v;
    public boolean w;
    public long x;
    public long y;
    public long z;
    
    public hmk(final arud z, final aeyr d, final abno s, final abni u, final hqa p26, final hpd q, final hmq f, final hmm g, final hqe r, final hmb c, final hnc hnc, final hok e, final hlx o, final hlf a, final wwu v, final Executor j, final oas i, final ReelSnackbarController h, final mrm mrm, final uyi g2, final uyi h2, final fjz n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.k = new AtomicInteger(-1);
        this.l = new AtomicInteger(-1);
        this.m = new ArrayList();
        this.K = null;
        this.L = null;
        this.v = 0;
        this.x = -1L;
        this.W = -1L;
        this.y = -1L;
        this.X = 0;
        this.z = Long.MIN_VALUE;
        this.A = true;
        this.B = -1;
        this.C = -1;
        this.Y = 0;
        this.J = trg.y(0);
        this.D = true;
        this.I = new hmc(this);
        this.N = new qpt(this);
        this.Z = z;
        this.d = d;
        this.S = s;
        this.U = u;
        this.P = p26;
        this.Q = q;
        this.g = g;
        this.R = r;
        this.f = f;
        this.c = c;
        this.e = e;
        this.O = o;
        this.a = a;
        final aaca aaca = (aaca)((atjj)hnc.a).a();
        aaca.getClass();
        final Object b = hnc.b;
        final hlf hlf = (hlf)((atjj)hnc.c).a();
        hlf.getClass();
        final oas oas = (oas)((atjj)hnc.d).a();
        oas.getClass();
        final Executor executor = (Executor)((atjj)hnc.e).a();
        executor.getClass();
        final uyi uyi = (uyi)((atjj)hnc.f).a();
        uyi.getClass();
        final cya cya = (cya)((atjj)hnc.g).a();
        cya.getClass();
        final uyi uyi2 = (uyi)((atjj)hnc.h).a();
        uyi2.getClass();
        final aeyk aeyk = (aeyk)((atjj)hnc.i).a();
        aeyk.getClass();
        final tny tny = (tny)((atjj)hnc.j).a();
        tny.getClass();
        this.b = new hnb(aaca, (atjj)b, hlf, oas, executor, uyi, cya, uyi2, aeyk, tny, this, null, null, null, null, null);
        this.j = j;
        final anqt anqt = (anqt)d.a();
        this.T = (anqt != null && (anqt.b & 0x200000) != 0x0 && anqt.o);
        this.V = v;
        this.i = i;
        this.h = h;
        this.G = g2;
        this.H = h2;
        this.n = n;
        mrm.C((Callable)new guf(this, 13));
    }
    
    public static boolean r(final anqt anqt) {
        return anqt != null && (anqt.b & 0x10000000) != 0x0 && anqt.t;
    }
    
    private static int u(final int n, final boolean b) {
        if (n != 1) {
            if (n == 2 || n == 3) {
                return 58160;
            }
            if (!b) {
                return 56922;
            }
            return 56921;
        }
        else {
            if (!b) {
                return 37417;
            }
            return 37416;
        }
    }
    
    private final void v() {
        final int y = this.Y;
        if (y != 0) {
            this.P.c(y);
            this.Y = 0;
        }
    }
    
    private final void w() {
        if (this.Y == 0) {
            this.Y = this.P.a();
        }
    }
    
    @Override
    public final long a(final aioe aioe) {
        if (!iba.y(aioe)) {
            return Long.MIN_VALUE;
        }
        final hma p = this.p;
        final int b = this.B;
        if (aioe != null) {
            if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                final hml f = p.F(aioe, b);
                if (f != null) {
                    return f.a;
                }
            }
        }
        return Long.MIN_VALUE;
    }
    
    @Override
    public final void b(final long n, final afsz afsz) {
        final aioe i = this.p.I(n);
        if (i == null && this.b.b(new hmd(this, afsz, n, 1))) {
            return;
        }
        afsz.b((Object)Optional.ofNullable((Object)i));
    }
    
    @Override
    public final void c(final long n, final afsz afsz) {
        final aioe j = this.p.J(n);
        if (j == null && this.b.b(new hmd(this, afsz, n, 0))) {
            return;
        }
        afsz.b((Object)Optional.ofNullable((Object)j));
    }
    
    final long d() {
        final int b = this.B;
        if (b == -1) {
            return Long.MIN_VALUE;
        }
        return this.p.E(b);
    }
    
    public final Optional e() {
        final hma p = this.p;
        if (p == null) {
            return Optional.empty();
        }
        return Optional.ofNullable((Object)this.p.H(p.C(this.z)));
    }
    
    public final Optional f(final long n) {
        return Optional.ofNullable((Object)this.p.G(n));
    }
    
    public final List g() {
        final ArrayList list = new ArrayList();
        this.p.K((trb)new hks((List)list, 9));
        return list;
    }
    
    public final List h() {
        final ArrayList list = new ArrayList();
        this.p.K((trb)new hks((List)list, 8));
        return list;
    }
    
    public final void i(List a, final List list) {
        final hma p2 = this.p;
        if (list != null) {
            agot.D(a.size() == list.size());
        }
        Label_0527: {
            if (a.isEmpty()) {
                break Label_0527;
            }
            final List a2 = p2.a;
            monitorenter(a2);
            try {
                final int size = p2.a.size();
                long a3;
                if (size == 0) {
                    a3 = -1L;
                }
                else {
                    a3 = p2.a.get(size - 1).a;
                }
                int n = 0;
                while (true) {
                    final int size2 = a.size();
                    agyc agyc = null;
                    if (n >= size2) {
                        break;
                    }
                    final aioe aioe = a.get(n);
                    agot.D(iba.y(aioe));
                    final long n2 = a3 + 1L;
                    if (list != null) {
                        agyc = (agyc)list.get(n).orElse((Object)null);
                    }
                    final hml hml = new hml(n2, aioe, agyc, false, p2.h);
                    a3 = n2;
                    if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                        a3 = n2;
                        if ((((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).b & 0x20000) != 0x0) {
                            a3 = n2 + 1L;
                            hml.h = a3;
                        }
                    }
                    p2.a.add(hml);
                    ++n;
                }
                monitorexit(a2);
                ((nq)p2).m(p2.A(size), a.size());
                if ((p2.M() || p2.N()) && !p2.f.b.c()) {
                    if (p2.M()) {
                        synchronized (p2.a) {
                            if (p2.a.size() > p2.B()) {
                                while (p2.a.size() > p2.B() - 10) {
                                    p2.a.remove(0);
                                    ((nq)p2).o(p2.A(0));
                                }
                            }
                        }
                    }
                    if (p2.N()) {
                        a = p2.a;
                        monitorenter(a);
                        int i = 0;
                        try {
                            while (i < p2.a.size() - p2.B()) {
                                final hml hml2 = p2.a.get(i);
                                if (hml2 != null) {
                                    hml2.f = null;
                                    final hng g = hml2.g;
                                    if (g != null) {
                                        g.G();
                                        hml2.g = null;
                                    }
                                }
                                ++i;
                            }
                            final int n3 = p2.a.size() - p2.B();
                            monitorexit(a);
                            if (n3 > 0) {
                                ((nq)p2).l(p2.A(0), n3);
                            }
                        }
                        finally {
                            monitorexit(a);
                        }
                    }
                }
                final hmj o = this.o;
                if (o != null && o.b.l.get() >= 0) {
                    o.b.j.execute((Runnable)new hmi(o, 1));
                }
            }
            finally {
                monitorexit(a2);
                while (true) {}
            }
        }
    }
    
    public final void j(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        hmk.B:I
        //     4: istore_2       
        //     5: iload_2        
        //     6: iconst_m1      
        //     7: if_icmpne       11
        //    10: return         
        //    11: aload_0        
        //    12: getfield        hmk.p:Lhma;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnonnull       26
        //    20: aconst_null    
        //    21: astore          4
        //    23: goto            33
        //    26: aload_3        
        //    27: iload_2        
        //    28: invokevirtual   hma.H:(I)Lhml;
        //    31: astore          4
        //    33: aload           4
        //    35: ifnonnull       39
        //    38: return         
        //    39: aload           4
        //    41: getfield        hml.g:Lhng;
        //    44: astore          5
        //    46: aload           5
        //    48: ifnonnull       52
        //    51: return         
        //    52: aload_0        
        //    53: iconst_0       
        //    54: putfield        hmk.D:Z
        //    57: aload           5
        //    59: invokevirtual   hng.F:()Lhqo;
        //    62: astore          6
        //    64: aload_0        
        //    65: getfield        hmk.F:Lcom/google/android/apps/youtube/app/extensions/reel/watch/player/ReelPlayerView;
        //    68: astore          7
        //    70: aload           7
        //    72: astore_3       
        //    73: aload           7
        //    75: ifnonnull       80
        //    78: aconst_null    
        //    79: astore_3       
        //    80: aload_0        
        //    81: getfield        hmk.z:J
        //    84: lstore          8
        //    86: aload_0        
        //    87: getfield        hmk.p:Lhma;
        //    90: iload_2        
        //    91: invokevirtual   hma.E:(I)J
        //    94: lstore          10
        //    96: aload_0        
        //    97: lload           10
        //    99: putfield        hmk.z:J
        //   102: lload           10
        //   104: lload           8
        //   106: lcmp           
        //   107: istore          12
        //   109: aload_0        
        //   110: iload           12
        //   112: putfield        hmk.X:I
        //   115: lload           10
        //   117: lload           8
        //   119: lcmp           
        //   120: ifne            129
        //   123: iconst_0       
        //   124: istore          13
        //   126: goto            132
        //   129: iconst_1       
        //   130: istore          13
        //   132: lload           10
        //   134: lload           8
        //   136: lcmp           
        //   137: ifne            151
        //   140: aload_0        
        //   141: getfield        hmk.aa:Lqpt;
        //   144: ifnull          150
        //   147: goto            174
        //   150: return         
        //   151: lload           10
        //   153: lload           8
        //   155: lcmp           
        //   156: ifle            165
        //   159: iconst_1       
        //   160: istore          14
        //   162: goto            168
        //   165: iconst_0       
        //   166: istore          14
        //   168: aload_0        
        //   169: iload           14
        //   171: putfield        hmk.A:Z
        //   174: aload_0        
        //   175: getfield        hmk.aa:Lqpt;
        //   178: astore          7
        //   180: aload           7
        //   182: ifnull          638
        //   185: aload           7
        //   187: getfield        qpt.a:Ljava/lang/Object;
        //   190: checkcast       Lhoa;
        //   193: astore          15
        //   195: aload           15
        //   197: getfield        hoa.bl:Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //   200: astore          7
        //   202: aload           7
        //   204: ifnonnull       233
        //   207: aload           15
        //   209: getfield        hoa.aZ:Ladfy;
        //   212: getfield        adfy.r:Laeyr;
        //   215: invokeinterface aeyr.a:()Ljava/lang/Object;
        //   220: checkcast       Lqqq;
        //   223: iconst_0       
        //   224: anewarray       Ljava/lang/Object;
        //   227: invokevirtual   qqq.b:([Ljava/lang/Object;)V
        //   230: goto            378
        //   233: aload           15
        //   235: getfield        hoa.bK:Z
        //   238: ifeq            258
        //   241: aload           7
        //   243: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //   246: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   249: ifne            258
        //   252: iconst_1       
        //   253: istore          14
        //   255: goto            261
        //   258: iconst_0       
        //   259: istore          14
        //   261: aload           7
        //   263: iload           14
        //   265: putfield        com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.f:Z
        //   268: aload           15
        //   270: iconst_0       
        //   271: putfield        hoa.bK:Z
        //   274: aload           15
        //   276: getfield        hoa.as:Labni;
        //   279: astore          16
        //   281: aload           15
        //   283: getfield        hoa.bl:Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //   286: astore          7
        //   288: aload           15
        //   290: getfield        hoa.aj:Lhmm;
        //   293: invokevirtual   hmm.a:()Lj$/util/Optional;
        //   296: aconst_null    
        //   297: invokevirtual   j$/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //   300: checkcast       Lwyn;
        //   303: astore          17
        //   305: aload           15
        //   307: getfield        hoa.bR:Luyi;
        //   310: astore          18
        //   312: aload           18
        //   314: ifnull          340
        //   317: aload           18
        //   319: ldc2_w          45374448
        //   322: invokevirtual   uyi.l:(J)Lashe;
        //   325: invokevirtual   ashe.aG:()Ljava/lang/Object;
        //   328: checkcast       Ljava/lang/Boolean;
        //   331: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   334: ifeq            340
        //   337: goto            357
        //   340: aload           15
        //   342: invokevirtual   hoa.aQ:()Lanqt;
        //   345: invokestatic    hrf.e:(Lanqt;)Z
        //   348: ifeq            357
        //   351: iconst_1       
        //   352: istore          14
        //   354: goto            360
        //   357: iconst_0       
        //   358: istore          14
        //   360: aload           16
        //   362: aload           7
        //   364: aload           17
        //   366: iload           14
        //   368: iconst_0       
        //   369: aconst_null    
        //   370: invokestatic    hrf.a:(Lwyn;ZZLzbq;)Labib;
        //   373: invokeinterface abni.e:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Labib;)V
        //   378: new             Lhmi;
        //   381: dup            
        //   382: aload           15
        //   384: iconst_3       
        //   385: invokespecial   hmi.<init>:(Lhoa;I)V
        //   388: astore          7
        //   390: aload           15
        //   392: getfield        hoa.bn:Z
        //   395: ifne            411
        //   398: aload           7
        //   400: invokeinterface java/lang/Runnable.run:()V
        //   405: aconst_null    
        //   406: astore          7
        //   408: goto            622
        //   411: aload           15
        //   413: getfield        hoa.ah:Lhmo;
        //   416: astore          16
        //   418: aload           16
        //   420: aconst_null    
        //   421: putfield        hmo.g:Ljava/lang/Runnable;
        //   424: aload           16
        //   426: getfield        hmo.d:Landroid/view/View;
        //   429: ifnonnull       445
        //   432: aload           7
        //   434: invokeinterface java/lang/Runnable.run:()V
        //   439: aconst_null    
        //   440: astore          7
        //   442: goto            622
        //   445: aload           16
        //   447: getfield        hmo.j:Laagm;
        //   450: invokevirtual   aagm.b:()Lcom/google/common/util/concurrent/ListenableFuture;
        //   453: astore          17
        //   455: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   458: astore          18
        //   460: aload           17
        //   462: ldc2_w          1000
        //   465: aload           18
        //   467: invokeinterface com/google/common/util/concurrent/ListenableFuture.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   472: checkcast       Lhsd;
        //   475: getfield        hsd.b:Z
        //   478: istore          14
        //   480: iload           14
        //   482: ifne            607
        //   485: aload           16
        //   487: getfield        hmo.f:Landroid/view/accessibility/AccessibilityManager;
        //   490: astore          18
        //   492: aload           18
        //   494: ifnull          607
        //   497: aload           18
        //   499: invokevirtual   android/view/accessibility/AccessibilityManager.isTouchExplorationEnabled:()Z
        //   502: ifeq            508
        //   505: goto            607
        //   508: aload           16
        //   510: aload           7
        //   512: putfield        hmo.g:Ljava/lang/Runnable;
        //   515: aload           16
        //   517: invokevirtual   hmo.f:()Z
        //   520: ifeq            531
        //   523: aload           16
        //   525: invokevirtual   hmo.a:()V
        //   528: goto            439
        //   531: aload           16
        //   533: getfield        hmo.d:Landroid/view/View;
        //   536: iconst_1       
        //   537: invokestatic    iba.e:(Landroid/view/View;Z)V
        //   540: aload           16
        //   542: iconst_0       
        //   543: invokevirtual   hmo.c:(Z)V
        //   546: aload           16
        //   548: getfield        hmo.d:Landroid/view/View;
        //   551: ifnull          586
        //   554: aload           16
        //   556: invokevirtual   hmo.f:()Z
        //   559: ifne            565
        //   562: goto            586
        //   565: aload           16
        //   567: getfield        hmo.i:I
        //   570: ifne            586
        //   573: aload           16
        //   575: aload           16
        //   577: getfield        hmo.b:Lhqa;
        //   580: invokevirtual   hqa.a:()I
        //   583: putfield        hmo.i:I
        //   586: aload           16
        //   588: ldc_w           84842
        //   591: invokestatic    wya.c:(I)Lwyb;
        //   594: putfield        hmo.h:Lwyb;
        //   597: aload           16
        //   599: invokevirtual   hmo.e:()V
        //   602: goto            439
        //   605: astore          18
        //   607: aload           16
        //   609: invokevirtual   hmo.a:()V
        //   612: aload           7
        //   614: invokeinterface java/lang/Runnable.run:()V
        //   619: goto            439
        //   622: aload           15
        //   624: aload           7
        //   626: putfield        hoa.bl:Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //   629: aload_0        
        //   630: aload           7
        //   632: putfield        hmk.aa:Lqpt;
        //   635: goto            638
        //   638: aload_3        
        //   639: astore          16
        //   641: aload_0        
        //   642: getfield        hmk.K:Ltrg;
        //   645: astore          7
        //   647: aload           7
        //   649: ifnull          693
        //   652: aload           7
        //   654: getfield        trg.b:Ljava/lang/Object;
        //   657: astore_3       
        //   658: aload_3        
        //   659: ifnull          693
        //   662: aload           7
        //   664: getfield        trg.c:Ljava/lang/Object;
        //   667: astore          7
        //   669: aload           7
        //   671: ifnull          693
        //   674: aload           7
        //   676: aload           4
        //   678: if_acmpeq       693
        //   681: aload_3        
        //   682: invokeinterface hqo.e:()Lj$/util/Optional;
        //   687: getstatic       gyc.f:Lgyc;
        //   690: invokevirtual   j$/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
        //   693: aload           5
        //   695: instanceof      Lhnf;
        //   698: istore          19
        //   700: iload           19
        //   702: ifeq            722
        //   705: aload           5
        //   707: checkcast       Lhnf;
        //   710: getfield        hnf.u:Lhqk;
        //   713: invokevirtual   hqk.f:()Lj$/util/Optional;
        //   716: getstatic       gyc.g:Lgyc;
        //   719: invokevirtual   j$/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
        //   722: aload_0        
        //   723: getfield        hmk.Z:Larud;
        //   726: invokevirtual   arud.f:()Lakak;
        //   729: getfield        akak.u:Lanqh;
        //   732: astore          7
        //   734: aload           7
        //   736: astore_3       
        //   737: aload           7
        //   739: ifnonnull       746
        //   742: getstatic       anqh.a:Lanqh;
        //   745: astore_3       
        //   746: aload_3        
        //   747: getfield        anqh.i:Z
        //   750: ifeq            772
        //   753: aload_0        
        //   754: getfield        hmk.t:Lcom/google/android/libraries/youtube/player/features/overlay/subtitles/SubtitlesOverlayPresenter;
        //   757: astore_3       
        //   758: aload_3        
        //   759: ifnull          772
        //   762: aload_3        
        //   763: ldc_w           ""
        //   766: invokestatic    com/google/android/libraries/youtube/player/subtitles/model/SubtitleTrack.p:(Ljava/lang/String;)Lcom/google/android/libraries/youtube/player/subtitles/model/SubtitleTrack;
        //   769: invokevirtual   com/google/android/libraries/youtube/player/features/overlay/subtitles/SubtitlesOverlayPresenter.s:(Lcom/google/android/libraries/youtube/player/subtitles/model/SubtitleTrack;)V
        //   772: aload_0        
        //   773: getfield        hmk.K:Ltrg;
        //   776: astore_3       
        //   777: aload_3        
        //   778: ifnull          1345
        //   781: aload_3        
        //   782: getfield        trg.c:Ljava/lang/Object;
        //   785: astore_3       
        //   786: aload_3        
        //   787: ifnull          1181
        //   790: aload_3        
        //   791: aload           4
        //   793: if_acmpeq       1181
        //   796: aload_0        
        //   797: getfield        hmk.J:Ltrg;
        //   800: getfield        trg.a:I
        //   803: istore          20
        //   805: iload           20
        //   807: iconst_2       
        //   808: if_icmpeq       838
        //   811: iload           20
        //   813: iconst_3       
        //   814: if_icmpne       820
        //   817: goto            838
        //   820: iload           20
        //   822: iconst_4       
        //   823: if_icmpne       832
        //   826: iconst_2       
        //   827: istore          20
        //   829: goto            841
        //   832: iconst_0       
        //   833: istore          20
        //   835: goto            841
        //   838: iconst_1       
        //   839: istore          20
        //   841: aload_0        
        //   842: getfield        hmk.a:Lhlf;
        //   845: astore          15
        //   847: aload_3        
        //   848: checkcast       Lhml;
        //   851: astore          7
        //   853: aload           15
        //   855: aload           7
        //   857: getfield        hml.e:Laioe;
        //   860: iload           20
        //   862: invokeinterface hlf.k:(Laioe;I)V
        //   867: aload_0        
        //   868: getfield        hmk.K:Ltrg;
        //   871: astore          15
        //   873: aload           15
        //   875: getfield        trg.a:I
        //   878: istore          21
        //   880: iload           21
        //   882: istore          20
        //   884: iload           21
        //   886: iconst_2       
        //   887: if_icmpeq       925
        //   890: iload           21
        //   892: istore          20
        //   894: iload           21
        //   896: iconst_3       
        //   897: if_icmpeq       925
        //   900: iload           21
        //   902: istore          20
        //   904: iload           21
        //   906: iconst_5       
        //   907: if_icmpeq       925
        //   910: iload           21
        //   912: istore          20
        //   914: iload           21
        //   916: bipush          7
        //   918: if_icmpne       1077
        //   921: bipush          7
        //   923: istore          20
        //   925: aload           15
        //   927: getfield        trg.b:Ljava/lang/Object;
        //   930: ifnull          1077
        //   933: aload           7
        //   935: invokevirtual   hml.b:()Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;
        //   938: getfield        com/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint.e:Ljava/lang/String;
        //   941: astore          18
        //   943: aload           7
        //   945: getfield        hml.f:Lakok;
        //   948: astore          15
        //   950: aload           7
        //   952: invokevirtual   hml.b:()Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;
        //   955: invokestatic    iba.z:(Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;)Z
        //   958: istore          14
        //   960: iload_1        
        //   961: ifne            1020
        //   964: aload           15
        //   966: ifnull          1005
        //   969: aload_0        
        //   970: getfield        hmk.K:Ltrg;
        //   973: getfield        trg.b:Ljava/lang/Object;
        //   976: aload           18
        //   978: aload           15
        //   980: aload           7
        //   982: getfield        hml.a:J
        //   985: iload           14
        //   987: aload           4
        //   989: getfield        hml.c:Z
        //   992: aload           7
        //   994: invokevirtual   hml.b:()Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;
        //   997: invokeinterface hqo.k:(Ljava/lang/String;Lakok;JZZLcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;)V
        //  1002: goto            1005
        //  1005: aload_0        
        //  1006: getfield        hmk.K:Ltrg;
        //  1009: getfield        trg.b:Ljava/lang/Object;
        //  1012: invokeinterface hqo.i:()V
        //  1017: goto            1020
        //  1020: aload           7
        //  1022: getfield        hml.h:J
        //  1025: lstore          22
        //  1027: lload           22
        //  1029: ldc2_w          -9223372036854775808
        //  1032: lcmp           
        //  1033: ifeq            1181
        //  1036: aload_0        
        //  1037: getfield        hmk.p:Lhma;
        //  1040: lload           22
        //  1042: invokevirtual   hma.G:(J)Lhml;
        //  1045: astore          7
        //  1047: aload           7
        //  1049: ifnull          1181
        //  1052: aload           7
        //  1054: aload           4
        //  1056: if_acmpeq       1181
        //  1059: aload_0        
        //  1060: getfield        hmk.e:Lhok;
        //  1063: aload           7
        //  1065: aload_0        
        //  1066: getfield        hmk.A:Z
        //  1069: invokeinterface hok.g:(Lhml;Z)V
        //  1074: goto            1181
        //  1077: iload           20
        //  1079: iconst_4       
        //  1080: if_icmpne       1125
        //  1083: aload_0        
        //  1084: getfield        hmk.e:Lhok;
        //  1087: aload           7
        //  1089: invokeinterface hok.d:(Lhml;)V
        //  1094: aload_0        
        //  1095: getfield        hmk.K:Ltrg;
        //  1098: getfield        trg.c:Ljava/lang/Object;
        //  1101: checkcast       Lhml;
        //  1104: getfield        hml.e:Laioe;
        //  1107: aload           4
        //  1109: getfield        hml.e:Laioe;
        //  1112: invokevirtual   agzi.equals:(Ljava/lang/Object;)Z
        //  1115: ifeq            1181
        //  1118: aload_0        
        //  1119: invokespecial   hmk.v:()V
        //  1122: goto            1181
        //  1125: iload           20
        //  1127: bipush          6
        //  1129: if_icmpne       1181
        //  1132: aload_0        
        //  1133: getfield        hmk.O:Lhlx;
        //  1136: aload           7
        //  1138: invokeinterface hlx.b:(Lhml;)V
        //  1143: aload_0        
        //  1144: getfield        hmk.K:Ltrg;
        //  1147: getfield        trg.c:Ljava/lang/Object;
        //  1150: checkcast       Lhml;
        //  1153: getfield        hml.g:Lhng;
        //  1156: astore          7
        //  1158: aload           7
        //  1160: instanceof      Lhlz;
        //  1163: ifeq            1181
        //  1166: aload           7
        //  1168: checkcast       Lhlz;
        //  1171: getfield        hlz.B:Lhlo;
        //  1174: iconst_0       
        //  1175: invokevirtual   hlo.e:(Z)V
        //  1178: goto            1181
        //  1181: aload_0        
        //  1182: getfield        hmk.J:Ltrg;
        //  1185: getfield        trg.a:I
        //  1188: iconst_4       
        //  1189: if_icmpne       1345
        //  1192: aload_0        
        //  1193: aload_3        
        //  1194: checkcast       Lhml;
        //  1197: invokevirtual   hmk.m:(Lhml;)V
        //  1200: aload_0        
        //  1201: getfield        hmk.J:Ltrg;
        //  1204: getfield        trg.b:Ljava/lang/Object;
        //  1207: astore_3       
        //  1208: aload_3        
        //  1209: ifnull          1345
        //  1212: aload_3        
        //  1213: checkcast       Lanqd;
        //  1216: astore          15
        //  1218: aload           15
        //  1220: getfield        anqd.c:Lanss;
        //  1223: astore          7
        //  1225: aload           7
        //  1227: astore_3       
        //  1228: aload           7
        //  1230: ifnonnull       1237
        //  1233: getstatic       anss.a:Lanss;
        //  1236: astore_3       
        //  1237: aload_3        
        //  1238: getstatic       com/google/protos/youtube/api/innertube/NotificationActionRendererOuterClass.notificationActionRenderer:Lagzg;
        //  1241: invokevirtual   agzd.rs:(Lagyr;)Z
        //  1244: ifeq            1280
        //  1247: aload           15
        //  1249: getfield        anqd.c:Lanss;
        //  1252: astore          7
        //  1254: aload           7
        //  1256: astore_3       
        //  1257: aload           7
        //  1259: ifnonnull       1266
        //  1262: getstatic       anss.a:Lanss;
        //  1265: astore_3       
        //  1266: aload_3        
        //  1267: getstatic       com/google/protos/youtube/api/innertube/NotificationActionRendererOuterClass.notificationActionRenderer:Lagzg;
        //  1270: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //  1273: checkcast       Lamph;
        //  1276: astore_3       
        //  1277: goto            1282
        //  1280: aconst_null    
        //  1281: astore_3       
        //  1282: aload_3        
        //  1283: ifnull          1345
        //  1286: new             Ljava/util/HashMap;
        //  1289: dup            
        //  1290: invokespecial   java/util/HashMap.<init>:()V
        //  1293: astore          7
        //  1295: aload           7
        //  1297: ldc_w           "feedback_undo"
        //  1300: aload_0        
        //  1301: getfield        hmk.J:Ltrg;
        //  1304: getfield        trg.b:Ljava/lang/Object;
        //  1307: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1312: pop            
        //  1313: aload_0        
        //  1314: getfield        hmk.h:Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelSnackbarController;
        //  1317: astore          15
        //  1319: aload           15
        //  1321: aload_3        
        //  1322: getfield        amph.e:Lagyc;
        //  1325: invokevirtual   agyc.I:()[B
        //  1328: aload           15
        //  1330: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelSnackbarController.c:Lfzo;
        //  1333: aload_3        
        //  1334: aload           7
        //  1336: invokevirtual   fzo.a:(Lamph;Ljava/util/Map;)Lgbo;
        //  1339: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelSnackbarController.h:([BLgbo;)V
        //  1342: goto            1345
        //  1345: lload           8
        //  1347: lstore          22
        //  1349: aload           4
        //  1351: invokevirtual   hml.b:()Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;
        //  1354: getfield        com/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint.e:Ljava/lang/String;
        //  1357: aload_0        
        //  1358: getfield        hmk.S:Labno;
        //  1361: invokevirtual   abno.s:()Ljava/lang/String;
        //  1364: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1367: iconst_1       
        //  1368: ixor           
        //  1369: iload           13
        //  1371: ior            
        //  1372: istore          20
        //  1374: iload           20
        //  1376: ifeq            1393
        //  1379: aload_0        
        //  1380: getfield        hmk.a:Lhlf;
        //  1383: aload           4
        //  1385: getfield        hml.e:Laioe;
        //  1388: invokeinterface hlf.j:(Laioe;)V
        //  1393: aload           5
        //  1395: invokevirtual   hng.J:()Z
        //  1398: ifeq            1914
        //  1401: iload           20
        //  1403: ifeq            1579
        //  1406: aload_0        
        //  1407: getfield        hmk.H:Luyi;
        //  1410: ldc2_w          45373861
        //  1413: invokevirtual   uyi.l:(J)Lashe;
        //  1416: invokevirtual   ashe.aG:()Ljava/lang/Object;
        //  1419: checkcast       Ljava/lang/Boolean;
        //  1422: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1425: ifne            1435
        //  1428: aload_0        
        //  1429: getfield        hmk.S:Labno;
        //  1432: invokevirtual   abno.a:()V
        //  1435: aload_0        
        //  1436: getfield        hmk.J:Ltrg;
        //  1439: getfield        trg.a:I
        //  1442: ifne            1579
        //  1445: aload_0        
        //  1446: getfield        hmk.Q:Lhpd;
        //  1449: astore_3       
        //  1450: aload_3        
        //  1451: getfield        hpd.i:I
        //  1454: istore          13
        //  1456: iload           13
        //  1458: ifeq            1474
        //  1461: aload_3        
        //  1462: bipush          65
        //  1464: iload           13
        //  1466: invokevirtual   hpd.h:(II)V
        //  1469: aload_3        
        //  1470: iconst_0       
        //  1471: putfield        hpd.i:I
        //  1474: aload_0        
        //  1475: getfield        hmk.u:Z
        //  1478: ifeq            1579
        //  1481: aload_0        
        //  1482: getfield        hmk.R:Lhqe;
        //  1485: astore_3       
        //  1486: aload_3        
        //  1487: getfield        hqe.d:Z
        //  1490: ifeq            1500
        //  1493: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //  1496: pop            
        //  1497: goto            1579
        //  1500: aload_3        
        //  1501: getfield        hqe.f:I
        //  1504: iconst_1       
        //  1505: iadd           
        //  1506: istore          21
        //  1508: aload_3        
        //  1509: iload           21
        //  1511: putfield        hqe.f:I
        //  1514: aload_3        
        //  1515: getfield        hqe.c:Lanrd;
        //  1518: astore          7
        //  1520: aload           7
        //  1522: getfield        anrd.b:I
        //  1525: iconst_2       
        //  1526: iand           
        //  1527: ifeq            1554
        //  1530: aload           7
        //  1532: getfield        anrd.d:I
        //  1535: istore          13
        //  1537: iload           13
        //  1539: ifle            1554
        //  1542: iload           21
        //  1544: iload           13
        //  1546: if_icmplt       1554
        //  1549: aload_3        
        //  1550: iconst_1       
        //  1551: putfield        hqe.d:Z
        //  1554: aload_3        
        //  1555: getfield        hqe.g:Laagm;
        //  1558: new             Lgkq;
        //  1561: dup            
        //  1562: aload_3        
        //  1563: bipush          16
        //  1565: invokespecial   gkq.<init>:(Lhqe;I)V
        //  1568: aload_3        
        //  1569: getfield        hqe.a:Ljava/util/concurrent/Executor;
        //  1572: invokevirtual   aagm.c:(Laexg;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  1575: invokestatic    j$/util/Optional.of:(Ljava/lang/Object;)Lj$/util/Optional;
        //  1578: pop            
        //  1579: aload           4
        //  1581: invokevirtual   hml.b:()Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;
        //  1584: astore_3       
        //  1585: aload_3        
        //  1586: invokestatic    iba.I:(Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;)Z
        //  1589: ifne            1615
        //  1592: aload_3        
        //  1593: invokestatic    iba.z:(Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;)Z
        //  1596: ifne            1615
        //  1599: aload_3        
        //  1600: invokestatic    iba.E:(Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;)Z
        //  1603: ifeq            1609
        //  1606: goto            1615
        //  1609: iconst_0       
        //  1610: istore          14
        //  1612: goto            1618
        //  1615: iconst_1       
        //  1616: istore          14
        //  1618: aload_0        
        //  1619: getfield        hmk.F:Lcom/google/android/apps/youtube/app/extensions/reel/watch/player/ReelPlayerView;
        //  1622: astore_3       
        //  1623: aload_3        
        //  1624: iload           14
        //  1626: putfield        com/google/android/apps/youtube/app/extensions/reel/watch/player/ReelPlayerView.a:Z
        //  1629: aload_3        
        //  1630: aload_0        
        //  1631: getfield        hmk.d:Laeyr;
        //  1634: invokeinterface aeyr.a:()Ljava/lang/Object;
        //  1639: checkcast       Lanqt;
        //  1642: invokestatic    hmk.r:(Lanqt;)Z
        //  1645: putfield        com/google/android/apps/youtube/app/extensions/reel/watch/player/ReelPlayerView.b:Z
        //  1648: iload           19
        //  1650: ifeq            2538
        //  1653: aload           5
        //  1655: checkcast       Lhnf;
        //  1658: getfield        hnf.u:Lhqk;
        //  1661: getfield        hqk.a:Lhpm;
        //  1664: astore          18
        //  1666: aload           18
        //  1668: getfield        hpm.m:Landroid/view/View;
        //  1671: astore_3       
        //  1672: aload_3        
        //  1673: ifnonnull       1679
        //  1676: goto            2538
        //  1679: aload_3        
        //  1680: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //  1683: astore          17
        //  1685: aload           17
        //  1687: invokestatic    tqt.e:(Landroid/content/Context;)Z
        //  1690: ifeq            2538
        //  1693: aload           18
        //  1695: getfield        hpm.u:Landroid/widget/TextView;
        //  1698: astore_3       
        //  1699: aload_3        
        //  1700: ifnonnull       1711
        //  1703: aload           18
        //  1705: getfield        hpm.v:Landroid/widget/TextView;
        //  1708: ifnull          2538
        //  1711: aload_3        
        //  1712: ifnonnull       1720
        //  1715: aconst_null    
        //  1716: astore_3       
        //  1717: goto            1725
        //  1720: aload_3        
        //  1721: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //  1724: astore_3       
        //  1725: aload           18
        //  1727: getfield        hpm.v:Landroid/widget/TextView;
        //  1730: astore          7
        //  1732: aload           7
        //  1734: ifnonnull       1743
        //  1737: aconst_null    
        //  1738: astore          7
        //  1740: goto            1750
        //  1743: aload           7
        //  1745: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //  1748: astore          7
        //  1750: aload_3        
        //  1751: astore          15
        //  1753: aload_3        
        //  1754: ifnull          1776
        //  1757: aload_3        
        //  1758: astore          15
        //  1760: aload_3        
        //  1761: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1764: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1767: invokevirtual   java/lang/String.isEmpty:()Z
        //  1770: ifeq            1776
        //  1773: aconst_null    
        //  1774: astore          15
        //  1776: aload           7
        //  1778: astore_3       
        //  1779: aload           7
        //  1781: ifnull          1803
        //  1784: aload           7
        //  1786: astore_3       
        //  1787: aload           7
        //  1789: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1792: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1795: invokevirtual   java/lang/String.isEmpty:()Z
        //  1798: ifeq            1803
        //  1801: aconst_null    
        //  1802: astore_3       
        //  1803: aload           15
        //  1805: ifnull          1837
        //  1808: aload_3        
        //  1809: ifnull          1837
        //  1812: aload           17
        //  1814: ldc_w           2132019357
        //  1817: iconst_2       
        //  1818: anewarray       Ljava/lang/Object;
        //  1821: dup            
        //  1822: iconst_0       
        //  1823: aload           15
        //  1825: aastore        
        //  1826: dup            
        //  1827: iconst_1       
        //  1828: aload_3        
        //  1829: aastore        
        //  1830: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1833: astore_3       
        //  1834: goto            1896
        //  1837: aload           15
        //  1839: ifnull          1863
        //  1842: aload           17
        //  1844: ldc_w           2132019359
        //  1847: iconst_1       
        //  1848: anewarray       Ljava/lang/Object;
        //  1851: dup            
        //  1852: iconst_0       
        //  1853: aload           15
        //  1855: aastore        
        //  1856: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1859: astore_3       
        //  1860: goto            1896
        //  1863: aload_3        
        //  1864: ifnull          1887
        //  1867: aload           17
        //  1869: ldc_w           2132019329
        //  1872: iconst_1       
        //  1873: anewarray       Ljava/lang/Object;
        //  1876: dup            
        //  1877: iconst_0       
        //  1878: aload_3        
        //  1879: aastore        
        //  1880: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1883: astore_3       
        //  1884: goto            1896
        //  1887: aload           17
        //  1889: ldc_w           2132019358
        //  1892: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //  1895: astore_3       
        //  1896: aload_3        
        //  1897: ifnull          2538
        //  1900: aload           17
        //  1902: aload           18
        //  1904: getfield        hpm.m:Landroid/view/View;
        //  1907: aload_3        
        //  1908: invokestatic    tqt.c:(Landroid/content/Context;Landroid/view/View;Ljava/lang/CharSequence;)V
        //  1911: goto            2538
        //  1914: aload           5
        //  1916: instanceof      Lhne;
        //  1919: ifeq            1940
        //  1922: aload_0        
        //  1923: invokespecial   hmk.w:()V
        //  1926: aload_0        
        //  1927: getfield        hmk.e:Lhok;
        //  1930: aload           4
        //  1932: invokeinterface hok.e:(Lhml;)V
        //  1937: goto            2538
        //  1940: aload           5
        //  1942: instanceof      Lhlz;
        //  1945: ifeq            2538
        //  1948: aload_0        
        //  1949: invokespecial   hmk.w:()V
        //  1952: iload           20
        //  1954: ifeq            2538
        //  1957: aload_0        
        //  1958: getfield        hmk.J:Ltrg;
        //  1961: getfield        trg.a:I
        //  1964: istore          13
        //  1966: lload           10
        //  1968: lload           22
        //  1970: lcmp           
        //  1971: ifle            1980
        //  1974: iconst_1       
        //  1975: istore          14
        //  1977: goto            1983
        //  1980: iconst_0       
        //  1981: istore          14
        //  1983: aload_0        
        //  1984: getfield        hmk.V:Lwwu;
        //  1987: invokeinterface wwu.n:()Lwwv;
        //  1992: invokeinterface wwv.i:()Ljava/lang/String;
        //  1997: astore          17
        //  1999: aload           4
        //  2001: getfield        hml.e:Laioe;
        //  2004: astore          7
        //  2006: aload           7
        //  2008: invokestatic    iba.U:(Laioe;)Lagza;
        //  2011: astore_3       
        //  2012: aload_3        
        //  2013: invokevirtual   agza.copyOnWrite:()V
        //  2016: aload_3        
        //  2017: getfield        agza.instance:Lagzi;
        //  2020: checkcast       Lamob;
        //  2023: astore          18
        //  2025: getstatic       amob.a:Lamob;
        //  2028: astore          15
        //  2030: aload           17
        //  2032: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2035: pop            
        //  2036: aload           18
        //  2038: aload           18
        //  2040: getfield        amob.b:I
        //  2043: iconst_1       
        //  2044: ior            
        //  2045: putfield        amob.b:I
        //  2048: aload           18
        //  2050: aload           17
        //  2052: putfield        amob.c:Ljava/lang/String;
        //  2055: aload_3        
        //  2056: invokevirtual   agza.copyOnWrite:()V
        //  2059: aload_3        
        //  2060: getfield        agza.instance:Lagzi;
        //  2063: checkcast       Lamob;
        //  2066: astore          15
        //  2068: aload           15
        //  2070: aload           15
        //  2072: getfield        amob.b:I
        //  2075: iconst_2       
        //  2076: ior            
        //  2077: putfield        amob.b:I
        //  2080: aload           15
        //  2082: iload           13
        //  2084: iload           14
        //  2086: invokestatic    hmk.u:(IZ)I
        //  2089: putfield        amob.d:I
        //  2092: aload           7
        //  2094: invokevirtual   agzi.toBuilder:()Lagza;
        //  2097: checkcast       Lagzc;
        //  2100: astore          7
        //  2102: aload           7
        //  2104: getstatic       amoa.b:Lagzg;
        //  2107: aload_3        
        //  2108: invokevirtual   agza.build:()Lagzi;
        //  2111: checkcast       Lamob;
        //  2114: invokevirtual   agzc.e:(Lagyr;Ljava/lang/Object;)V
        //  2117: aload           7
        //  2119: invokevirtual   agza.build:()Lagzi;
        //  2122: checkcast       Laioe;
        //  2125: astore          15
        //  2127: aload_0        
        //  2128: getfield        hmk.s:Lhmg;
        //  2131: astore_3       
        //  2132: aload           15
        //  2134: getstatic       com/google/protos/youtube/api/innertube/ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint:Lagzg;
        //  2137: invokevirtual   agzd.rs:(Lagyr;)Z
        //  2140: invokestatic    agot.D:(Z)V
        //  2143: aload_3        
        //  2144: checkcast       Lhoa;
        //  2147: astore          17
        //  2149: aload           17
        //  2151: getfield        hoa.bR:Luyi;
        //  2154: invokevirtual   uyi.cs:()Lashe;
        //  2157: invokevirtual   ashe.aG:()Ljava/lang/Object;
        //  2160: checkcast       Ljava/lang/Boolean;
        //  2163: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2166: ifeq            2182
        //  2169: aload           17
        //  2171: aload           17
        //  2173: getfield        hoa.d:Lhmk;
        //  2176: invokevirtual   hmk.d:()J
        //  2179: putfield        hoa.bs:J
        //  2182: aload           17
        //  2184: invokevirtual   hoa.aP:()Lwwv;
        //  2187: astore          18
        //  2189: aload           17
        //  2191: getfield        hoa.bv:Lhob;
        //  2194: aload           18
        //  2196: invokevirtual   hob.b:(Lwwv;)V
        //  2199: aload           17
        //  2201: getfield        hoa.bv:Lhob;
        //  2204: astore          7
        //  2206: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //  2209: astore_3       
        //  2210: aload           7
        //  2212: aload           15
        //  2214: invokevirtual   hob.a:(Laioe;)Laioe;
        //  2217: astore          24
        //  2219: aload           7
        //  2221: aload           18
        //  2223: aload           24
        //  2225: aconst_null    
        //  2226: aconst_null    
        //  2227: iconst_0       
        //  2228: invokevirtual   hob.c:(Lwwv;Laioe;Ljava/lang/String;Ljava/lang/String;Z)V
        //  2231: aload           7
        //  2233: getfield        hob.b:Ljava/lang/Object;
        //  2236: checkcast       Lhrf;
        //  2239: aload_3        
        //  2240: aload           24
        //  2242: aconst_null    
        //  2243: iconst_0       
        //  2244: invokevirtual   hrf.d:(Lj$/util/Optional;Laioe;Ljava/lang/String;Z)V
        //  2247: aload           17
        //  2249: getfield        hoa.d:Lhmk;
        //  2252: aload           17
        //  2254: getfield        hoa.bs:J
        //  2257: invokevirtual   hmk.f:(J)Lj$/util/Optional;
        //  2260: astore_3       
        //  2261: aload_3        
        //  2262: invokevirtual   j$/util/Optional.isPresent:()Z
        //  2265: ifeq            2426
        //  2268: aload_3        
        //  2269: invokevirtual   j$/util/Optional.get:()Ljava/lang/Object;
        //  2272: checkcast       Lhml;
        //  2275: astore          24
        //  2277: aload           24
        //  2279: getfield        hml.d:Lagyc;
        //  2282: ifnull          2426
        //  2285: aload           17
        //  2287: getfield        hoa.bU:Larud;
        //  2290: invokevirtual   arud.f:()Lakak;
        //  2293: getfield        akak.A:Lajpg;
        //  2296: astore          7
        //  2298: aload           7
        //  2300: astore_3       
        //  2301: aload           7
        //  2303: ifnonnull       2310
        //  2306: getstatic       ajpg.a:Lajpg;
        //  2309: astore_3       
        //  2310: getstatic       ajph.a:Lajph;
        //  2313: invokevirtual   agzi.createBuilder:()Lagza;
        //  2316: astore          7
        //  2318: aload           7
        //  2320: invokevirtual   agza.copyOnWrite:()V
        //  2323: aload           7
        //  2325: getfield        agza.instance:Lagzi;
        //  2328: checkcast       Lajph;
        //  2331: invokestatic    ajph.a:(Lajph;)V
        //  2334: aload           7
        //  2336: invokevirtual   agza.build:()Lagzi;
        //  2339: checkcast       Lajph;
        //  2342: astore          7
        //  2344: aload_3        
        //  2345: getfield        ajpg.b:Lahas;
        //  2348: astore          25
        //  2350: ldc2_w          45383811
        //  2353: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2356: astore          26
        //  2358: aload           7
        //  2360: astore_3       
        //  2361: aload           25
        //  2363: aload           26
        //  2365: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //  2370: ifeq            2386
        //  2373: aload           25
        //  2375: aload           26
        //  2377: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2382: checkcast       Lajph;
        //  2385: astore_3       
        //  2386: aload_3        
        //  2387: getfield        ajph.b:I
        //  2390: iconst_1       
        //  2391: if_icmpne       2426
        //  2394: aload_3        
        //  2395: getfield        ajph.c:Ljava/lang/Object;
        //  2398: checkcast       Ljava/lang/Boolean;
        //  2401: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2404: ifeq            2426
        //  2407: aload           18
        //  2409: new             Lwws;
        //  2412: dup            
        //  2413: aload           24
        //  2415: getfield        hml.d:Lagyc;
        //  2418: invokespecial   wws.<init>:(Lagyc;)V
        //  2421: invokeinterface wwv.l:(Lwxz;)V
        //  2426: aload           17
        //  2428: getfield        hoa.bz:Latje;
        //  2431: aload           15
        //  2433: getstatic       com/google/protos/youtube/api/innertube/ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint:Lagzg;
        //  2436: invokevirtual   agzd.rr:(Lagyr;)Ljava/lang/Object;
        //  2439: checkcast       Lcom/google/protos/youtube/api/innertube/ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
        //  2442: invokevirtual   atje.tr:(Ljava/lang/Object;)V
        //  2445: aload           17
        //  2447: getfield        hoa.bA:Latje;
        //  2450: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //  2453: invokevirtual   atje.tr:(Ljava/lang/Object;)V
        //  2456: aload           5
        //  2458: checkcast       Lhlz;
        //  2461: astore          15
        //  2463: aload           15
        //  2465: invokevirtual   hlz.K:()Lj$/util/Optional;
        //  2468: astore_3       
        //  2469: aload_3        
        //  2470: invokevirtual   j$/util/Optional.isPresent:()Z
        //  2473: ifeq            2529
        //  2476: aload_3        
        //  2477: invokevirtual   j$/util/Optional.get:()Ljava/lang/Object;
        //  2480: checkcast       Lanqm;
        //  2483: getfield        anqm.d:Lanql;
        //  2486: astore          7
        //  2488: aload           7
        //  2490: astore_3       
        //  2491: aload           7
        //  2493: ifnonnull       2500
        //  2496: getstatic       anql.a:Lanql;
        //  2499: astore_3       
        //  2500: aload_3        
        //  2501: getstatic       anqj.b:Lagzg;
        //  2504: invokevirtual   agzd.rs:(Lagyr;)Z
        //  2507: ifne            2529
        //  2510: aload           15
        //  2512: invokevirtual   hlz.I:()Lj$/util/Optional;
        //  2515: new             Lgft;
        //  2518: dup            
        //  2519: aload           15
        //  2521: bipush          20
        //  2523: invokespecial   gft.<init>:(Lhlz;I)V
        //  2526: invokevirtual   j$/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
        //  2529: aload           15
        //  2531: getfield        hlz.B:Lhlo;
        //  2534: iconst_1       
        //  2535: invokevirtual   hlo.e:(Z)V
        //  2538: iload_1        
        //  2539: ifne            2559
        //  2542: aload           16
        //  2544: ifnull          2559
        //  2547: aload           16
        //  2549: iconst_0       
        //  2550: invokevirtual   android/view/View.setScrollX:(I)V
        //  2553: aload           16
        //  2555: iconst_0       
        //  2556: invokevirtual   android/view/View.setScrollY:(I)V
        //  2559: iload           20
        //  2561: ifeq            3245
        //  2564: aload           5
        //  2566: invokevirtual   hng.J:()Z
        //  2569: ifeq            3245
        //  2572: aload_0        
        //  2573: aload_0        
        //  2574: getfield        hmk.i:Loas;
        //  2577: invokeinterface oas.c:()J
        //  2582: putfield        hmk.W:J
        //  2585: ldc2_w          -1
        //  2588: lstore          8
        //  2590: lload           10
        //  2592: lload           22
        //  2594: lcmp           
        //  2595: ifeq            2709
        //  2598: aload_0        
        //  2599: getfield        hmk.x:J
        //  2602: ldc2_w          -1
        //  2605: lcmp           
        //  2606: ifeq            2709
        //  2609: aload           4
        //  2611: invokevirtual   hml.b:()Lcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;
        //  2614: astore_3       
        //  2615: aload_0        
        //  2616: getfield        hmk.x:J
        //  2619: lstore          22
        //  2621: aload_0        
        //  2622: getfield        hmk.J:Ltrg;
        //  2625: getfield        trg.a:I
        //  2628: istore          20
        //  2630: iload           20
        //  2632: iconst_1       
        //  2633: if_icmpne       2653
        //  2636: iload           12
        //  2638: ifge            2647
        //  2641: iconst_1       
        //  2642: istore          20
        //  2644: goto            2688
        //  2647: iconst_2       
        //  2648: istore          20
        //  2650: goto            2688
        //  2653: iload           20
        //  2655: iconst_2       
        //  2656: if_icmpeq       2685
        //  2659: iload           20
        //  2661: iconst_3       
        //  2662: if_icmpne       2668
        //  2665: goto            2685
        //  2668: iload           12
        //  2670: ifge            2679
        //  2673: iconst_3       
        //  2674: istore          20
        //  2676: goto            2688
        //  2679: iconst_4       
        //  2680: istore          20
        //  2682: goto            2688
        //  2685: iconst_5       
        //  2686: istore          20
        //  2688: aload_0        
        //  2689: getfield        hmk.g:Lhmm;
        //  2692: iload           20
        //  2694: iconst_3       
        //  2695: aload_3        
        //  2696: aconst_null    
        //  2697: lload           22
        //  2699: invokevirtual   hmm.k:(IILcom/google/protos/youtube/api/innertube/ReelWatchEndpointOuterClass$ReelWatchEndpoint;Lwyn;J)V
        //  2702: aload_0        
        //  2703: ldc2_w          -1
        //  2706: putfield        hmk.x:J
        //  2709: aload_0        
        //  2710: getfield        hmk.H:Luyi;
        //  2713: invokevirtual   uyi.cr:()Lashe;
        //  2716: invokevirtual   ashe.aG:()Ljava/lang/Object;
        //  2719: checkcast       Ljava/lang/Boolean;
        //  2722: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2725: ifne            2756
        //  2728: iload_1        
        //  2729: ifeq            2735
        //  2732: goto            2746
        //  2735: aload_0        
        //  2736: getfield        hmk.i:Loas;
        //  2739: invokeinterface oas.c:()J
        //  2744: lstore          8
        //  2746: aload_0        
        //  2747: lload           8
        //  2749: putfield        hmk.y:J
        //  2752: aload_0        
        //  2753: invokevirtual   hmk.k:()V
        //  2756: aload           4
        //  2758: getfield        hml.e:Laioe;
        //  2761: astore          7
        //  2763: aload_0        
        //  2764: getfield        hmk.M:Lqpt;
        //  2767: getfield        qpt.a:Ljava/lang/Object;
        //  2770: checkcast       Lhoa;
        //  2773: astore_3       
        //  2774: aload_3        
        //  2775: aload           7
        //  2777: putfield        hoa.bC:Laioe;
        //  2780: aload_3        
        //  2781: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //  2784: putfield        hoa.bf:Lj$/util/Optional;
        //  2787: aload_0        
        //  2788: getfield        hmk.J:Ltrg;
        //  2791: astore_3       
        //  2792: aload_3        
        //  2793: getfield        trg.a:I
        //  2796: istore          13
        //  2798: iload           13
        //  2800: istore          20
        //  2802: iload           13
        //  2804: iconst_3       
        //  2805: if_icmpne       2818
        //  2808: aload_0        
        //  2809: getfield        hmk.T:Z
        //  2812: ifeq            3219
        //  2815: iconst_3       
        //  2816: istore          20
        //  2818: aload_0        
        //  2819: getfield        hmk.V:Lwwu;
        //  2822: astore          4
        //  2824: iload           20
        //  2826: iconst_2       
        //  2827: if_icmpeq       2849
        //  2830: iload           20
        //  2832: iconst_3       
        //  2833: if_icmpne       2844
        //  2836: iconst_1       
        //  2837: istore_1       
        //  2838: iconst_3       
        //  2839: istore          20
        //  2841: goto            2851
        //  2844: iconst_0       
        //  2845: istore_1       
        //  2846: goto            2851
        //  2849: iconst_1       
        //  2850: istore_1       
        //  2851: aload_3        
        //  2852: getfield        trg.c:Ljava/lang/Object;
        //  2855: astore          15
        //  2857: aload           7
        //  2859: astore_3       
        //  2860: aload           15
        //  2862: ifnull          2917
        //  2865: aload           7
        //  2867: invokevirtual   agzi.toBuilder:()Lagza;
        //  2870: checkcast       Lagzc;
        //  2873: astore_3       
        //  2874: aload_3        
        //  2875: invokevirtual   agza.copyOnWrite:()V
        //  2878: aload_3        
        //  2879: getfield        agzc.instance:Lagzi;
        //  2882: checkcast       Laioe;
        //  2885: astore          7
        //  2887: aload           7
        //  2889: aload           7
        //  2891: getfield        aioe.b:I
        //  2894: iconst_1       
        //  2895: ior            
        //  2896: putfield        aioe.b:I
        //  2899: aload           7
        //  2901: aload           15
        //  2903: checkcast       Lagyc;
        //  2906: putfield        aioe.c:Lagyc;
        //  2909: aload_3        
        //  2910: invokevirtual   agza.build:()Lagzi;
        //  2913: checkcast       Laioe;
        //  2916: astore_3       
        //  2917: invokestatic    com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.d:()Labhx;
        //  2920: astore          7
        //  2922: aload           7
        //  2924: aload_3        
        //  2925: putfield        abhx.a:Laioe;
        //  2928: aload           7
        //  2930: iload_1        
        //  2931: putfield        abhx.f:Z
        //  2934: aload           7
        //  2936: iload_1        
        //  2937: putfield        abhx.e:Z
        //  2940: aload           7
        //  2942: invokevirtual   abhx.a:()Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //  2945: astore          7
        //  2947: aload           7
        //  2949: astore_3       
        //  2950: aload           15
        //  2952: ifnonnull       3165
        //  2955: iload           12
        //  2957: ifle            2965
        //  2960: iconst_1       
        //  2961: istore_1       
        //  2962: goto            2967
        //  2965: iconst_0       
        //  2966: istore_1       
        //  2967: iload           20
        //  2969: iload_1        
        //  2970: invokestatic    hmk.u:(IZ)I
        //  2973: istore          20
        //  2975: aload           4
        //  2977: invokeinterface wwu.n:()Lwwv;
        //  2982: invokeinterface wwv.i:()Ljava/lang/String;
        //  2987: astore          16
        //  2989: aload           7
        //  2991: getfield        com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.b:Laioe;
        //  2994: astore          4
        //  2996: aload           4
        //  2998: ifnonnull       3007
        //  3001: aload           7
        //  3003: astore_3       
        //  3004: goto            3165
        //  3007: aload           4
        //  3009: invokestatic    iba.U:(Laioe;)Lagza;
        //  3012: astore_3       
        //  3013: aload_3        
        //  3014: invokevirtual   agza.copyOnWrite:()V
        //  3017: aload_3        
        //  3018: getfield        agza.instance:Lagzi;
        //  3021: checkcast       Lamob;
        //  3024: astore          18
        //  3026: getstatic       amob.a:Lamob;
        //  3029: astore          15
        //  3031: aload           16
        //  3033: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3036: pop            
        //  3037: aload           18
        //  3039: aload           18
        //  3041: getfield        amob.b:I
        //  3044: iconst_1       
        //  3045: ior            
        //  3046: putfield        amob.b:I
        //  3049: aload           18
        //  3051: aload           16
        //  3053: putfield        amob.c:Ljava/lang/String;
        //  3056: aload_3        
        //  3057: invokevirtual   agza.copyOnWrite:()V
        //  3060: aload_3        
        //  3061: getfield        agza.instance:Lagzi;
        //  3064: checkcast       Lamob;
        //  3067: astore          15
        //  3069: aload           15
        //  3071: aload           15
        //  3073: getfield        amob.b:I
        //  3076: iconst_2       
        //  3077: ior            
        //  3078: putfield        amob.b:I
        //  3081: aload           15
        //  3083: iload           20
        //  3085: putfield        amob.d:I
        //  3088: aload           7
        //  3090: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.e:()Labhx;
        //  3093: astore          15
        //  3095: aload           4
        //  3097: invokevirtual   agzi.toBuilder:()Lagza;
        //  3100: checkcast       Lagzc;
        //  3103: astore          4
        //  3105: aload           4
        //  3107: getstatic       amoa.b:Lagzg;
        //  3110: aload_3        
        //  3111: invokevirtual   agza.build:()Lagzi;
        //  3114: checkcast       Lamob;
        //  3117: invokevirtual   agzc.e:(Lagyr;Ljava/lang/Object;)V
        //  3120: aload           15
        //  3122: aload           4
        //  3124: invokevirtual   agza.build:()Lagzi;
        //  3127: checkcast       Laioe;
        //  3130: putfield        abhx.a:Laioe;
        //  3133: aload           15
        //  3135: aload           7
        //  3137: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.r:()Z
        //  3140: putfield        abhx.f:Z
        //  3143: aload           15
        //  3145: aload           7
        //  3147: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.q:()Z
        //  3150: putfield        abhx.e:Z
        //  3153: aload           15
        //  3155: invokevirtual   abhx.a:()Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //  3158: astore_3       
        //  3159: aload_3        
        //  3160: aload           7
        //  3162: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.n:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;)V
        //  3165: aload_0        
        //  3166: getfield        hmk.U:Labni;
        //  3169: new             Labmp;
        //  3172: dup            
        //  3173: getstatic       abmo.e:Labmo;
        //  3176: aload_3        
        //  3177: aload_0        
        //  3178: getfield        hmk.g:Lhmm;
        //  3181: invokevirtual   hmm.a:()Lj$/util/Optional;
        //  3184: aconst_null    
        //  3185: invokevirtual   j$/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3188: checkcast       Lwyn;
        //  3191: aload_0        
        //  3192: getfield        hmk.d:Laeyr;
        //  3195: invokeinterface aeyr.a:()Ljava/lang/Object;
        //  3200: checkcast       Lanqt;
        //  3203: invokestatic    hrf.e:(Lanqt;)Z
        //  3206: iconst_0       
        //  3207: aconst_null    
        //  3208: invokestatic    hrf.a:(Lwyn;ZZLzbq;)Labib;
        //  3211: invokespecial   abmp.<init>:(Labmo;Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Labib;)V
        //  3214: invokeinterface abni.a:(Labmp;)V
        //  3219: aload           6
        //  3221: ifnull          3234
        //  3224: aload           6
        //  3226: invokeinterface hqo.t:()Lpqq;
        //  3231: invokevirtual   pqq.h:()V
        //  3234: aload_0        
        //  3235: invokespecial   hmk.v:()V
        //  3238: aload_0        
        //  3239: getfield        hmk.S:Labno;
        //  3242: invokevirtual   abno.D:()V
        //  3245: aload_0        
        //  3246: iconst_0       
        //  3247: invokestatic    trg.y:(I)Ltrg;
        //  3250: putfield        hmk.J:Ltrg;
        //  3253: aload_0        
        //  3254: aload_0        
        //  3255: getfield        hmk.K:Ltrg;
        //  3258: putfield        hmk.L:Ltrg;
        //  3261: aload_0        
        //  3262: new             Ltrg;
        //  3265: dup            
        //  3266: aload           5
        //  3268: getfield        on.f:I
        //  3271: aload           5
        //  3273: invokevirtual   hng.E:()Lhml;
        //  3276: aload           6
        //  3278: invokespecial   trg.<init>:(ILhml;Lhqo;)V
        //  3281: putfield        hmk.K:Ltrg;
        //  3284: aload_0        
        //  3285: getfield        hmk.p:Lhma;
        //  3288: invokevirtual   hma.D:()I
        //  3291: iconst_m1      
        //  3292: if_icmpeq       3382
        //  3295: iload_2        
        //  3296: iconst_2       
        //  3297: if_icmpgt       3382
        //  3300: aload_0        
        //  3301: getfield        hmk.b:Lhnb;
        //  3304: invokevirtual   hnb.c:()Z
        //  3307: ifeq            3382
        //  3310: aload_0        
        //  3311: getfield        hmk.b:Lhnb;
        //  3314: astore          7
        //  3316: aload           7
        //  3318: getfield        hnb.d:Ljava/lang/Object;
        //  3321: astore_3       
        //  3322: aload_3        
        //  3323: monitorenter   
        //  3324: aload           7
        //  3326: getfield        hnb.e:Lcom/google/android/apps/youtube/app/extensions/reel/watch/fragment/ReelSequenceController$PendingContinuation;
        //  3329: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/fragment/ReelSequenceController$PendingContinuation.b:Ljava/lang/String;
        //  3332: astore          4
        //  3334: aload_3        
        //  3335: monitorexit    
        //  3336: aload           4
        //  3338: invokestatic    aexs.f:(Ljava/lang/String;)Z
        //  3341: ifne            3382
        //  3344: aload           7
        //  3346: getfield        hnb.m:Laaca;
        //  3349: invokevirtual   aaca.m:()Lhsb;
        //  3352: astore_3       
        //  3353: aload_3        
        //  3354: aload           4
        //  3356: putfield        hsb.a:Ljava/lang/String;
        //  3359: aload           7
        //  3361: aload           7
        //  3363: getfield        hnb.e:Lcom/google/android/apps/youtube/app/extensions/reel/watch/fragment/ReelSequenceController$PendingContinuation;
        //  3366: aload_3        
        //  3367: iconst_2       
        //  3368: iconst_1       
        //  3369: invokevirtual   hnb.d:(Lcom/google/android/apps/youtube/app/extensions/reel/watch/fragment/ReelSequenceController$PendingContinuation;Lhsb;II)V
        //  3372: goto            3382
        //  3375: astore          7
        //  3377: aload_3        
        //  3378: monitorexit    
        //  3379: aload           7
        //  3381: athrow         
        //  3382: aload_0        
        //  3383: getfield        hmk.p:Lhma;
        //  3386: invokevirtual   hma.x:()I
        //  3389: istore          20
        //  3391: iload           20
        //  3393: iconst_m1      
        //  3394: if_icmpeq       3450
        //  3397: iload_2        
        //  3398: iload           20
        //  3400: iconst_2       
        //  3401: isub           
        //  3402: if_icmplt       3450
        //  3405: aload_0        
        //  3406: getfield        hmk.b:Lhnb;
        //  3409: astore          7
        //  3411: aload           7
        //  3413: getfield        hnb.d:Ljava/lang/Object;
        //  3416: astore_3       
        //  3417: aload_3        
        //  3418: monitorenter   
        //  3419: aload           7
        //  3421: getfield        hnb.f:Lcom/google/android/apps/youtube/app/extensions/reel/watch/fragment/ReelSequenceController$PendingContinuation;
        //  3424: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/watch/fragment/ReelSequenceController$PendingContinuation.a:()Z
        //  3427: istore_1       
        //  3428: aload_3        
        //  3429: monitorexit    
        //  3430: iload_1        
        //  3431: ifeq            3450
        //  3434: aload_0        
        //  3435: getfield        hmk.b:Lhnb;
        //  3438: iconst_1       
        //  3439: invokevirtual   hnb.e:(I)V
        //  3442: return         
        //  3443: astore          7
        //  3445: aload_3        
        //  3446: monitorexit    
        //  3447: aload           7
        //  3449: athrow         
        //  3450: return         
        //  3451: astore          18
        //  3453: goto            607
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  445    460    605    607    Ljava/lang/Exception;
        //  460    480    3451   3456   Ljava/lang/Exception;
        //  3324   3336   3375   3382   Any
        //  3377   3379   3375   3382   Any
        //  3419   3430   3443   3450   Any
        //  3445   3447   3443   3450   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at java.util.Vector.contains(Unknown Source)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:828)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2213)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2213)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2213)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1067)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryArguments(TypeAnalysis.java:2854)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2215)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:373)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
    
    public final void k() {
        final Optional e = this.e();
        if (this.X != 0 && e.isPresent() && ((hml)e.get()).f() && ((hml)e.get()).b() != null) {
            if (this.g != null) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint b = ((hml)e.get()).b();
                final long w = this.W;
                if (w != -1L) {
                    this.g.d("r_nav", w);
                }
                final long y = this.y;
                if (y != -1L) {
                    this.g.g(b.e, y);
                }
                this.X = 0;
                this.W = -1L;
                this.y = -1L;
            }
        }
    }
    
    public final void l(final int n) {
        if (n != -1) {
            final hml h = this.p.H(n);
            hng g;
            if (h == null) {
                g = null;
            }
            else {
                g = h.g;
            }
            if (g != null) {
                final hqo f = g.F();
                if (f != null) {
                    f.e().ifPresent((Consumer)new kst(this, n, 1));
                }
            }
        }
    }
    
    public final void m(final hml hml) {
        final long d = this.d();
        final hma p = this.p;
        final int c = p.C(hml.a);
        Label_0125: {
            if (c == -1) {
                break Label_0125;
            }
            synchronized (p.a) {
                final int b = p.b(c);
                boolean b2 = false;
                if (b >= 0) {
                    b2 = b2;
                    if (b < p.a.size()) {
                        b2 = true;
                    }
                }
                agot.u(b2);
                p.e = (hml)p.a.remove(b);
                final int a = p.A(b);
                monitorexit(p.a);
                ((nq)p).o(a);
                final int c2 = this.p.C(d);
                if (c2 != -1) {
                    this.B = c2;
                }
            }
        }
    }
    
    public final void n(final long n, final aioe e) {
        if (e == null) {
            return;
        }
        final Optional f = this.f(n);
        if (f.isPresent()) {
            final hml hml = (hml)f.get();
            final boolean rs = ((agzd)e).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            boolean b = true;
            if (!rs) {
                b = (((agzd)e).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint) && b);
            }
            agot.D(b);
            hml.e = e;
        }
    }
    
    public final boolean o() {
        final hma p = this.p;
        return p == null || this.B == p.z();
    }
    
    public final boolean p() {
        return this.v == 1;
    }
    
    public final boolean q() {
        return this.p.g;
    }
    
    public final int s(final trg trg) {
        final int c = this.B + 1;
        if (c <= this.p.z()) {
            this.h.g();
            this.J = trg;
            this.q.a(true);
            this.C = c;
            this.q.aj(c);
            return 3;
        }
        if (this.q() && !this.b.h) {
            this.h.g();
            if (c <= this.p.x()) {
                this.J = trg;
                this.q.aj(c);
            }
            return 3;
        }
        return 1;
    }
    
    public final void t(final long z, final qpt aa) {
        this.aa = aa;
        final int c = this.p.C(z);
        if (this.z == Long.MIN_VALUE) {
            this.z = z;
        }
        if (c >= 0) {
            this.B = c;
            this.q.aa(c);
        }
    }
}
