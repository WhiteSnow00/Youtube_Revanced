import android.os.Bundle;
import android.media.MediaCodec$CodecException;
import java.util.Collection;
import java.util.List;
import android.os.SystemClock;
import android.media.MediaCodec$CryptoException;
import android.media.MediaCryptoException;
import java.nio.ByteOrder;
import android.media.MediaCodec$BufferInfo;
import java.util.ArrayList;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import android.media.MediaCrypto;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bmc extends bdx
{
    private final long[] A;
    private ayg B;
    private ayg C;
    private bkm D;
    private bkm E;
    private MediaCrypto F;
    private boolean G;
    private float H;
    private boolean I;
    private float J;
    private ArrayDeque K;
    private bmb L;
    private boolean M;
    private boolean N;
    private long O;
    private int P;
    private int Q;
    private ByteBuffer R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;
    private int aa;
    private boolean ab;
    private boolean ac;
    private long ad;
    private long ae;
    private boolean af;
    private boolean ag;
    private long ah;
    private int ai;
    private zlh aj;
    private final blv d;
    private final bme e;
    private final boolean f;
    public float g;
    public blw h;
    public ayg i;
    public MediaFormat j;
    public blz k;
    public boolean l;
    public boolean m;
    public bef n;
    public bdy o;
    public long p;
    private final float q;
    private final bdc r;
    private final bdc s;
    private final bdc t;
    private final bls u;
    private final bav v;
    private final ArrayList w;
    private final MediaCodec$BufferInfo x;
    private final long[] y;
    private final long[] z;
    
    public bmc(final int n, final blv d, final bme e, final boolean f, final float q) {
        super(n);
        this.d = d;
        dk.d((Object)e);
        this.e = e;
        this.f = f;
        this.q = q;
        this.r = bdc.a();
        this.s = new bdc(0);
        this.t = new bdc(2);
        final bls u = new bls();
        this.u = u;
        this.v = new bav();
        this.w = new ArrayList();
        this.x = new MediaCodec$BufferInfo();
        this.g = 1.0f;
        this.H = 1.0f;
        this.y = new long[10];
        this.z = new long[10];
        this.A = new long[10];
        this.aB(this.ah = -9223372036854775807L);
        ((bdc)u).b(0);
        u.c.order(ByteOrder.nativeOrder());
        this.J = -1.0f;
        this.Y = 0;
        this.P = -1;
        this.Q = -1;
        this.O = -9223372036854775807L;
        this.ad = -9223372036854775807L;
        this.ae = -9223372036854775807L;
        this.Z = 0;
        this.aa = 0;
    }
    
    private final void aA(final bkm d) {
        bhu.b(this.D, d);
        this.D = d;
    }
    
    private final void aB(final long p) {
        this.p = p;
        if (p != -9223372036854775807L) {
            this.ag();
        }
    }
    
    private final void aC(final bkm e) {
        bhu.b(this.E, e);
        this.E = e;
    }
    
    private final void aD() {
        try {
            this.F.setMediaDrmSession(aH(this.E).c);
            this.aA(this.E);
            this.Z = 0;
            this.aa = 0;
        }
        catch (final MediaCryptoException ex) {
            throw this.l((Throwable)ex, this.B, 6006);
        }
    }
    
    private final boolean aE() {
        final blw h = this.h;
        if (h != null && this.Z != 2) {
            if (!this.af) {
                if (this.P < 0) {
                    final int a = h.a();
                    if ((this.P = a) < 0) {
                        return false;
                    }
                    this.s.c = this.h.e(a);
                    ((bcw)this.s).clear();
                }
                if (this.Z == 1) {
                    if (!this.N) {
                        this.h.n(this.P, 0, 0L, 4);
                        this.ay();
                    }
                    this.Z = 2;
                    return false;
                }
                if (this.Y == 1) {
                    for (int i = 0; i < this.i.p.size(); ++i) {
                        this.s.c.put((byte[])this.i.p.get(i));
                    }
                    this.Y = 2;
                }
                final int position = this.s.c.position();
                final bxc q = this.Q();
                try {
                    final int p = this.P(q, this.s, 0);
                    if (this.K()) {
                        this.ae = this.ad;
                    }
                    if (p == -3) {
                        return false;
                    }
                    if (p == -5) {
                        if (this.Y == 2) {
                            ((bcw)this.s).clear();
                            this.Y = 1;
                        }
                        this.ah(q);
                        return true;
                    }
                    final bdc s = this.s;
                    if (((bcw)s).isEndOfStream()) {
                        if (this.Y == 2) {
                            ((bcw)s).clear();
                            this.Y = 1;
                        }
                        this.af = true;
                        if (!this.ab) {
                            this.aw();
                            return false;
                        }
                        try {
                            if (!this.N) {
                                this.h.n(this.P, 0, 0L, 4);
                                this.ay();
                            }
                            return false;
                        }
                        catch (final MediaCodec$CryptoException ex) {
                            throw this.l((Throwable)ex, this.B, bax.i(ex.getErrorCode()));
                        }
                    }
                    if (!this.ab && !((bcw)s).isKeyFrame()) {
                        ((bcw)s).clear();
                        if (this.Y == 2) {
                            this.Y = 1;
                        }
                        return true;
                    }
                    final boolean d = s.d();
                    if (d) {
                        final bcy b = s.b;
                        if (position != 0) {
                            if (b.d == null) {
                                b.d = new int[1];
                                b.i.numBytesOfClearData = b.d;
                            }
                            final int[] d2 = b.d;
                            d2[0] += position;
                        }
                    }
                    final bdc s2 = this.s;
                    long c = s2.e;
                    final zlh aj = this.aj;
                    long n = c;
                    if (aj != null) {
                        final ayg b2 = this.B;
                        if (aj.a == 0L) {
                            aj.c = c;
                        }
                        if (!aj.b) {
                            final ByteBuffer c2 = s2.c;
                            dk.d((Object)c2);
                            int j = 0;
                            int n2 = 0;
                            while (j < 4) {
                                n2 = (n2 << 8 | (c2.get(j) & 0xFF));
                                ++j;
                            }
                            final int c3 = btv.c(n2);
                            if (c3 == -1) {
                                aj.b = true;
                                aj.a = 0L;
                                aj.c = s2.e;
                                bap.c("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                c = s2.e;
                            }
                            else {
                                c = aj.d((long)b2.B);
                                aj.a += c3;
                            }
                        }
                        this.ad = Math.max(this.ad, this.aj.d((long)this.B.B));
                        n = c;
                    }
                    if (((bcw)this.s).isDecodeOnly()) {
                        this.w.add(n);
                    }
                    if (this.ag) {
                        this.v.e(n, (Object)this.B);
                        this.ag = false;
                    }
                    this.ad = Math.max(this.ad, n);
                    this.s.c();
                    final bdc s3 = this.s;
                    if (((bcw)s3).hasSupplementalData()) {
                        this.aj(s3);
                    }
                    this.ac(this.s);
                    Label_0819: {
                        if (!d) {
                            break Label_0819;
                        }
                        try {
                            this.h.o(this.P, this.s.b, n);
                            this.ay();
                            this.ab = true;
                            this.Y = 0;
                            final bdy o = this.o;
                            ++o.c;
                            return true;
                            this.h.n(this.P, this.s.c.limit(), n, 0);
                        }
                        catch (final MediaCodec$CryptoException ex2) {
                            throw this.l((Throwable)ex2, this.B, bax.i(ex2.getErrorCode()));
                        }
                    }
                }
                catch (final bdb bdb) {
                    this.X((Exception)bdb);
                    this.aG(0);
                    this.au();
                    return true;
                }
            }
        }
        return false;
    }
    
    private final boolean aF() {
        return this.Q >= 0;
    }
    
    private final boolean aG(int p) {
        final bxc q = this.Q();
        ((bcw)this.r).clear();
        p = this.P(q, this.r, p | 0x4);
        if (p == -5) {
            this.ah(q);
            return true;
        }
        if (p == -4 && ((bcw)this.r).isEndOfStream()) {
            this.af = true;
            this.aw();
        }
        return false;
    }
    
    private static final blb aH(final bkm bkm) {
        return (blb)bkm.b();
    }
    
    private final void aI() {
        if (this.ab) {
            this.Z = 1;
            this.aa = 2;
            return;
        }
        this.aD();
    }
    
    protected static boolean ar(final ayg ayg) {
        final int g = ayg.G;
        return g == 0 || g == 2;
    }
    
    private final void au() {
        try {
            this.h.g();
        }
        finally {
            this.an();
        }
    }
    
    private final void av(final blz k, final MediaCrypto mediaCrypto) {
        final String a = k.a;
        final int a2 = bax.a;
        float e;
        if ((e = this.e(this.H, this.B, this.N())) <= this.q) {
            e = -1.0f;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final blu v = this.V(k, this.B, mediaCrypto, e);
        if (bax.a >= 31) {
            bma.a(v, this.p());
        }
        try {
            this.h = this.d.b(v);
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.k = k;
            this.J = e;
            this.i = this.B;
            final int a3 = bax.a;
            final boolean b = false;
            this.M = (a3 == 29 && "c2.android.aac.decoder".equals(a));
            final String a4 = k.a;
            boolean n = false;
            Label_0247: {
                if (bax.a > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(a4) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(a4))) {
                    n = b;
                    if (!"Amazon".equals(bax.c)) {
                        break Label_0247;
                    }
                    n = b;
                    if (!"AFTS".equals(bax.d)) {
                        break Label_0247;
                    }
                    n = b;
                    if (!k.f) {
                        break Label_0247;
                    }
                }
                n = true;
            }
            this.N = n;
            if (this.h.m()) {
                this.X = true;
                this.Y = 1;
            }
            if ("c2.android.mp3.decoder".equals(k.a)) {
                this.aj = new zlh();
            }
            if (super.b == 2) {
                this.O = SystemClock.elapsedRealtime() + 1000L;
            }
            final bdy o = this.o;
            ++o.a;
            this.Y(a, v, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        }
        finally {
            while (true) {}
        }
    }
    
    private final void aw() {
        final int aa = this.aa;
        if (aa == 1) {
            this.au();
            return;
        }
        if (aa == 2) {
            this.au();
            this.aD();
            return;
        }
        if (aa != 3) {
            this.l = true;
            this.ad();
            return;
        }
        this.ax();
    }
    
    private final void ax() {
        this.am();
        this.ak();
    }
    
    private final void ay() {
        this.P = -1;
        this.s.c = null;
    }
    
    private final void az() {
        this.Q = -1;
        this.R = null;
    }
    
    private final void b() {
        this.W = false;
        ((bcw)this.u).clear();
        ((bcw)this.t).clear();
        this.V = false;
        this.U = false;
    }
    
    private final void c() {
        if (this.ab) {
            this.Z = 1;
            this.aa = 3;
            return;
        }
        this.ax();
    }
    
    protected void C(final ayg[] array, final long ah, final long n) {
        final long p3 = this.p;
        boolean b = true;
        if (p3 == -9223372036854775807L) {
            if (this.ah != -9223372036854775807L) {
                b = false;
            }
            dk.h(b);
            this.ah = ah;
            this.aB(n);
            return;
        }
        final int ai = this.ai;
        if (ai == 10) {
            final long n2 = this.z[9];
            final StringBuilder sb = new StringBuilder("Too many stream changes, so dropping offset: ");
            sb.append(n2);
            bap.c("MediaCodecRenderer", sb.toString());
        }
        else {
            this.ai = ai + 1;
        }
        final long[] y = this.y;
        final int n3 = this.ai - 1;
        y[n3] = ah;
        this.z[n3] = n;
        this.A[n3] = this.ad;
    }
    
    public void H(final float g, final float h) {
        this.g = g;
        this.H = h;
        this.as(this.i);
    }
    
    public final void R(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          12
        //     3: aload           12
        //     5: astore          11
        //     7: aload           12
        //     9: getfield        bmc.l:Z
        //    12: ifeq            24
        //    15: aload           12
        //    17: astore          11
        //    19: aload_0        
        //    20: invokevirtual   bmc.ad:()V
        //    23: return         
        //    24: aload           12
        //    26: astore          11
        //    28: aload           12
        //    30: getfield        bmc.B:Layg;
        //    33: ifnonnull       53
        //    36: aload           12
        //    38: astore          11
        //    40: aload           12
        //    42: iconst_2       
        //    43: invokespecial   bmc.aG:(I)Z
        //    46: ifeq            52
        //    49: goto            53
        //    52: return         
        //    53: aload           12
        //    55: astore          11
        //    57: aload_0        
        //    58: invokevirtual   bmc.ak:()V
        //    61: aload           12
        //    63: astore          11
        //    65: aload           12
        //    67: getfield        bmc.U:Z
        //    70: istore          7
        //    72: iload           7
        //    74: ifeq            753
        //    77: aload           12
        //    79: astore          11
        //    81: getstatic       bax.a:I
        //    84: istore          5
        //    86: aload           12
        //    88: astore          13
        //    90: aload           13
        //    92: astore          11
        //    94: aload           13
        //    96: getfield        bmc.l:Z
        //    99: iconst_1       
        //   100: ixor           
        //   101: invokestatic    dk.h:(Z)V
        //   104: aload           13
        //   106: astore          11
        //   108: aload           13
        //   110: getfield        bmc.u:Lbls;
        //   113: astore          14
        //   115: aload           13
        //   117: astore          11
        //   119: aload           14
        //   121: invokevirtual   bls.g:()Z
        //   124: istore          7
        //   126: aload           13
        //   128: astore          12
        //   130: iload           7
        //   132: ifeq            290
        //   135: aload           13
        //   137: astore          11
        //   139: aload           14
        //   141: getfield        bls.c:Ljava/nio/ByteBuffer;
        //   144: astore          12
        //   146: aload           13
        //   148: astore          11
        //   150: aload           13
        //   152: getfield        bmc.Q:I
        //   155: istore          5
        //   157: aload           13
        //   159: astore          11
        //   161: aload           14
        //   163: getfield        bls.h:I
        //   166: istore          6
        //   168: aload           13
        //   170: astore          11
        //   172: aload           14
        //   174: getfield        bls.e:J
        //   177: lstore          9
        //   179: aload           13
        //   181: astore          11
        //   183: aload           14
        //   185: invokevirtual   bcw.isDecodeOnly:()Z
        //   188: istore          8
        //   190: aload           13
        //   192: astore          11
        //   194: aload           14
        //   196: invokevirtual   bcw.isEndOfStream:()Z
        //   199: istore          7
        //   201: aload           13
        //   203: astore          11
        //   205: aload           13
        //   207: getfield        bmc.C:Layg;
        //   210: astore          13
        //   212: aload_0        
        //   213: lload_1        
        //   214: lload_3        
        //   215: aconst_null    
        //   216: aload           12
        //   218: iload           5
        //   220: iconst_0       
        //   221: iload           6
        //   223: lload           9
        //   225: iload           8
        //   227: iload           7
        //   229: aload           13
        //   231: invokevirtual   bmc.ae:(JJLblw;Ljava/nio/ByteBuffer;IIIJZZLayg;)Z
        //   234: istore          7
        //   236: iload           7
        //   238: ifeq            276
        //   241: aload_0        
        //   242: astore          12
        //   244: aload           12
        //   246: astore          11
        //   248: aload           12
        //   250: aload           12
        //   252: getfield        bmc.u:Lbls;
        //   255: getfield        bls.g:J
        //   258: invokevirtual   bmc.al:(J)V
        //   261: aload           12
        //   263: astore          11
        //   265: aload           12
        //   267: getfield        bmc.u:Lbls;
        //   270: invokevirtual   bcw.clear:()V
        //   273: goto            290
        //   276: aload_0        
        //   277: astore          11
        //   279: goto            1559
        //   282: astore          11
        //   284: aload_0        
        //   285: astore          12
        //   287: goto            1598
        //   290: aload           12
        //   292: astore          11
        //   294: aload           12
        //   296: getfield        bmc.af:Z
        //   299: ifeq            319
        //   302: aload           12
        //   304: astore          11
        //   306: aload           12
        //   308: iconst_1       
        //   309: putfield        bmc.l:Z
        //   312: aload           12
        //   314: astore          11
        //   316: goto            1559
        //   319: aload           12
        //   321: astore          11
        //   323: aload           12
        //   325: getfield        bmc.V:Z
        //   328: ifeq            364
        //   331: aload           12
        //   333: astore          11
        //   335: aload           12
        //   337: getfield        bmc.u:Lbls;
        //   340: aload           12
        //   342: getfield        bmc.t:Lbdc;
        //   345: invokevirtual   bls.f:(Lbdc;)Z
        //   348: invokestatic    dk.h:(Z)V
        //   351: aload           12
        //   353: astore          11
        //   355: aload           12
        //   357: iconst_0       
        //   358: putfield        bmc.V:Z
        //   361: goto            364
        //   364: aload           12
        //   366: astore          11
        //   368: aload           12
        //   370: getfield        bmc.W:Z
        //   373: ifeq            439
        //   376: aload           12
        //   378: astore          11
        //   380: aload           12
        //   382: getfield        bmc.u:Lbls;
        //   385: invokevirtual   bls.g:()Z
        //   388: ifne            432
        //   391: aload           12
        //   393: astore          11
        //   395: aload_0        
        //   396: invokespecial   bmc.b:()V
        //   399: aload           12
        //   401: astore          11
        //   403: aload           12
        //   405: iconst_0       
        //   406: putfield        bmc.W:Z
        //   409: aload           12
        //   411: astore          11
        //   413: aload_0        
        //   414: invokevirtual   bmc.ak:()V
        //   417: aload           12
        //   419: astore          11
        //   421: aload           12
        //   423: getfield        bmc.U:Z
        //   426: ifeq            312
        //   429: goto            439
        //   432: aload           12
        //   434: astore          13
        //   436: goto            90
        //   439: aload           12
        //   441: astore          11
        //   443: aload           12
        //   445: getfield        bmc.af:Z
        //   448: iconst_1       
        //   449: ixor           
        //   450: invokestatic    dk.h:(Z)V
        //   453: aload           12
        //   455: astore          11
        //   457: aload_0        
        //   458: invokevirtual   bdx.Q:()Lbxc;
        //   461: astore          13
        //   463: aload           12
        //   465: astore          11
        //   467: aload           12
        //   469: getfield        bmc.t:Lbdc;
        //   472: invokevirtual   bcw.clear:()V
        //   475: aload           12
        //   477: astore          11
        //   479: aload           12
        //   481: getfield        bmc.t:Lbdc;
        //   484: invokevirtual   bcw.clear:()V
        //   487: aload           12
        //   489: astore          11
        //   491: aload           12
        //   493: aload           13
        //   495: aload           12
        //   497: getfield        bmc.t:Lbdc;
        //   500: iconst_0       
        //   501: invokevirtual   bdx.P:(Lbxc;Lbdc;I)I
        //   504: istore          5
        //   506: iload           5
        //   508: bipush          -5
        //   510: if_icmpeq       662
        //   513: iload           5
        //   515: bipush          -4
        //   517: if_icmpeq       523
        //   520: goto            674
        //   523: aload           12
        //   525: astore          11
        //   527: aload           12
        //   529: getfield        bmc.t:Lbdc;
        //   532: invokevirtual   bcw.isEndOfStream:()Z
        //   535: ifeq            551
        //   538: aload           12
        //   540: astore          11
        //   542: aload           12
        //   544: iconst_1       
        //   545: putfield        bmc.af:Z
        //   548: goto            674
        //   551: aload           12
        //   553: astore          11
        //   555: aload           12
        //   557: getfield        bmc.ag:Z
        //   560: ifeq            617
        //   563: aload           12
        //   565: astore          11
        //   567: aload           12
        //   569: getfield        bmc.B:Layg;
        //   572: astore          14
        //   574: aload           12
        //   576: astore          11
        //   578: aload           14
        //   580: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   583: pop            
        //   584: aload           12
        //   586: astore          11
        //   588: aload           12
        //   590: aload           14
        //   592: putfield        bmc.C:Layg;
        //   595: aload           12
        //   597: astore          11
        //   599: aload           12
        //   601: aload           14
        //   603: aconst_null    
        //   604: invokevirtual   bmc.aa:(Layg;Landroid/media/MediaFormat;)V
        //   607: aload           12
        //   609: astore          11
        //   611: aload           12
        //   613: iconst_0       
        //   614: putfield        bmc.ag:Z
        //   617: aload           12
        //   619: astore          11
        //   621: aload           12
        //   623: getfield        bmc.t:Lbdc;
        //   626: invokevirtual   bdc.c:()V
        //   629: aload           12
        //   631: astore          11
        //   633: aload           12
        //   635: getfield        bmc.u:Lbls;
        //   638: aload           12
        //   640: getfield        bmc.t:Lbdc;
        //   643: invokevirtual   bls.f:(Lbdc;)Z
        //   646: ifne            475
        //   649: aload           12
        //   651: astore          11
        //   653: aload           12
        //   655: iconst_1       
        //   656: putfield        bmc.V:Z
        //   659: goto            674
        //   662: aload           12
        //   664: astore          11
        //   666: aload           12
        //   668: aload           13
        //   670: invokevirtual   bmc.ah:(Lbxc;)Lbdz;
        //   673: pop            
        //   674: aload           12
        //   676: astore          11
        //   678: aload           12
        //   680: getfield        bmc.u:Lbls;
        //   683: astore          13
        //   685: aload           12
        //   687: astore          11
        //   689: aload           13
        //   691: invokevirtual   bls.g:()Z
        //   694: ifeq            706
        //   697: aload           12
        //   699: astore          11
        //   701: aload           13
        //   703: invokevirtual   bdc.c:()V
        //   706: aload           12
        //   708: astore          11
        //   710: aload           12
        //   712: getfield        bmc.u:Lbls;
        //   715: invokevirtual   bls.g:()Z
        //   718: ifne            432
        //   721: aload           12
        //   723: astore          11
        //   725: aload           12
        //   727: getfield        bmc.af:Z
        //   730: ifne            432
        //   733: aload           12
        //   735: astore          11
        //   737: aload           12
        //   739: getfield        bmc.W:Z
        //   742: ifeq            312
        //   745: goto            432
        //   748: astore          13
        //   750: goto            1590
        //   753: aload           12
        //   755: astore          11
        //   757: aload           12
        //   759: getfield        bmc.h:Lblw;
        //   762: astore          13
        //   764: aload           13
        //   766: ifnull          1521
        //   769: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   772: pop2           
        //   773: getstatic       bax.a:I
        //   776: istore          5
        //   778: aload_0        
        //   779: astore          12
        //   781: aload_0        
        //   782: invokespecial   bmc.aF:()Z
        //   785: istore          7
        //   787: iload           7
        //   789: ifne            1347
        //   792: aload           12
        //   794: astore          11
        //   796: aload           12
        //   798: getfield        bmc.h:Lblw;
        //   801: aload           12
        //   803: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //   806: invokeinterface blw.b:(Landroid/media/MediaCodec$BufferInfo;)I
        //   811: istore          5
        //   813: iload           5
        //   815: ifge            918
        //   818: iload           5
        //   820: bipush          -2
        //   822: if_icmpne       867
        //   825: aload           12
        //   827: astore          11
        //   829: aload           12
        //   831: iconst_1       
        //   832: putfield        bmc.ac:Z
        //   835: aload           12
        //   837: astore          11
        //   839: aload           12
        //   841: aload           12
        //   843: getfield        bmc.h:Lblw;
        //   846: invokeinterface blw.c:()Landroid/media/MediaFormat;
        //   851: putfield        bmc.j:Landroid/media/MediaFormat;
        //   854: aload           12
        //   856: astore          11
        //   858: aload           12
        //   860: iconst_1       
        //   861: putfield        bmc.I:Z
        //   864: goto            778
        //   867: aload           12
        //   869: astore          11
        //   871: aload           12
        //   873: getfield        bmc.N:Z
        //   876: ifne            882
        //   879: goto            1489
        //   882: aload           12
        //   884: astore          11
        //   886: aload           12
        //   888: getfield        bmc.af:Z
        //   891: ifne            907
        //   894: aload           12
        //   896: astore          11
        //   898: aload           12
        //   900: getfield        bmc.Z:I
        //   903: iconst_2       
        //   904: if_icmpne       879
        //   907: aload           12
        //   909: astore          11
        //   911: aload_0        
        //   912: invokespecial   bmc.aw:()V
        //   915: goto            879
        //   918: aload           12
        //   920: astore          11
        //   922: aload           12
        //   924: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //   927: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   930: ifne            961
        //   933: aload           12
        //   935: astore          11
        //   937: aload           12
        //   939: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //   942: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   945: iconst_4       
        //   946: iand           
        //   947: ifeq            961
        //   950: aload           12
        //   952: astore          11
        //   954: aload_0        
        //   955: invokespecial   bmc.aw:()V
        //   958: goto            879
        //   961: aload           12
        //   963: astore          11
        //   965: aload           12
        //   967: iload           5
        //   969: putfield        bmc.Q:I
        //   972: aload           12
        //   974: astore          11
        //   976: aload           12
        //   978: getfield        bmc.h:Lblw;
        //   981: iload           5
        //   983: invokeinterface blw.f:(I)Ljava/nio/ByteBuffer;
        //   988: astore          13
        //   990: aload           12
        //   992: astore          11
        //   994: aload           12
        //   996: aload           13
        //   998: putfield        bmc.R:Ljava/nio/ByteBuffer;
        //  1001: aload           13
        //  1003: ifnull          1054
        //  1006: aload           12
        //  1008: astore          11
        //  1010: aload           13
        //  1012: aload           12
        //  1014: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1017: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //  1020: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //  1023: pop            
        //  1024: aload           12
        //  1026: astore          11
        //  1028: aload           12
        //  1030: getfield        bmc.R:Ljava/nio/ByteBuffer;
        //  1033: aload           12
        //  1035: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1038: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //  1041: aload           12
        //  1043: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1046: getfield        android/media/MediaCodec$BufferInfo.size:I
        //  1049: iadd           
        //  1050: invokevirtual   java/nio/ByteBuffer.limit:(I)Ljava/nio/Buffer;
        //  1053: pop            
        //  1054: aload           12
        //  1056: astore          11
        //  1058: aload           12
        //  1060: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1063: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //  1066: lstore          9
        //  1068: aload           12
        //  1070: astore          11
        //  1072: aload           12
        //  1074: getfield        bmc.w:Ljava/util/ArrayList;
        //  1077: invokevirtual   java/util/ArrayList.size:()I
        //  1080: istore          6
        //  1082: iconst_0       
        //  1083: istore          5
        //  1085: iload           5
        //  1087: iload           6
        //  1089: if_icmpge       1145
        //  1092: aload           12
        //  1094: astore          11
        //  1096: aload           12
        //  1098: getfield        bmc.w:Ljava/util/ArrayList;
        //  1101: iload           5
        //  1103: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1106: checkcast       Ljava/lang/Long;
        //  1109: invokevirtual   java/lang/Long.longValue:()J
        //  1112: lload           9
        //  1114: lcmp           
        //  1115: ifne            1139
        //  1118: aload           12
        //  1120: astore          11
        //  1122: aload           12
        //  1124: getfield        bmc.w:Ljava/util/ArrayList;
        //  1127: iload           5
        //  1129: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //  1132: pop            
        //  1133: iconst_1       
        //  1134: istore          7
        //  1136: goto            1148
        //  1139: iinc            5, 1
        //  1142: goto            1085
        //  1145: iconst_0       
        //  1146: istore          7
        //  1148: aload           12
        //  1150: astore          11
        //  1152: aload           12
        //  1154: iload           7
        //  1156: putfield        bmc.S:Z
        //  1159: aload           12
        //  1161: astore          11
        //  1163: aload           12
        //  1165: getfield        bmc.ae:J
        //  1168: aload           12
        //  1170: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1173: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //  1176: lcmp           
        //  1177: ifne            1186
        //  1180: iconst_1       
        //  1181: istore          7
        //  1183: goto            1189
        //  1186: iconst_0       
        //  1187: istore          7
        //  1189: aload           12
        //  1191: astore          11
        //  1193: aload           12
        //  1195: iload           7
        //  1197: putfield        bmc.T:Z
        //  1200: aload           12
        //  1202: astore          11
        //  1204: aload           12
        //  1206: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1209: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //  1212: lstore          9
        //  1214: aload           12
        //  1216: astore          11
        //  1218: aload           12
        //  1220: getfield        bmc.v:Lbav;
        //  1223: lload           9
        //  1225: invokevirtual   bav.d:(J)Ljava/lang/Object;
        //  1228: checkcast       Layg;
        //  1231: astore          14
        //  1233: aload           14
        //  1235: astore          13
        //  1237: aload           14
        //  1239: ifnonnull       1275
        //  1242: aload           14
        //  1244: astore          13
        //  1246: aload           12
        //  1248: astore          11
        //  1250: aload           12
        //  1252: getfield        bmc.I:Z
        //  1255: ifeq            1275
        //  1258: aload           12
        //  1260: astore          11
        //  1262: aload           12
        //  1264: getfield        bmc.v:Lbav;
        //  1267: invokevirtual   bav.c:()Ljava/lang/Object;
        //  1270: checkcast       Layg;
        //  1273: astore          13
        //  1275: aload           13
        //  1277: ifnull          1294
        //  1280: aload           12
        //  1282: astore          11
        //  1284: aload           12
        //  1286: aload           13
        //  1288: putfield        bmc.C:Layg;
        //  1291: goto            1318
        //  1294: aload           12
        //  1296: astore          11
        //  1298: aload           12
        //  1300: getfield        bmc.I:Z
        //  1303: ifeq            1347
        //  1306: aload           12
        //  1308: astore          11
        //  1310: aload           12
        //  1312: getfield        bmc.C:Layg;
        //  1315: ifnull          1347
        //  1318: aload           12
        //  1320: astore          11
        //  1322: aload           12
        //  1324: aload           12
        //  1326: getfield        bmc.C:Layg;
        //  1329: aload           12
        //  1331: getfield        bmc.j:Landroid/media/MediaFormat;
        //  1334: invokevirtual   bmc.aa:(Layg;Landroid/media/MediaFormat;)V
        //  1337: aload           12
        //  1339: astore          11
        //  1341: aload           12
        //  1343: iconst_0       
        //  1344: putfield        bmc.I:Z
        //  1347: aload           12
        //  1349: getfield        bmc.h:Lblw;
        //  1352: astore          13
        //  1354: aload           12
        //  1356: getfield        bmc.R:Ljava/nio/ByteBuffer;
        //  1359: astore          11
        //  1361: aload           12
        //  1363: getfield        bmc.Q:I
        //  1366: istore          6
        //  1368: aload           12
        //  1370: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1373: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //  1376: istore          5
        //  1378: aload           12
        //  1380: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1383: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //  1386: lstore          9
        //  1388: aload           12
        //  1390: getfield        bmc.S:Z
        //  1393: istore          8
        //  1395: aload           12
        //  1397: getfield        bmc.T:Z
        //  1400: istore          7
        //  1402: aload           12
        //  1404: getfield        bmc.C:Layg;
        //  1407: astore          12
        //  1409: aload_0        
        //  1410: lload_1        
        //  1411: lload_3        
        //  1412: aload           13
        //  1414: aload           11
        //  1416: iload           6
        //  1418: iload           5
        //  1420: iconst_1       
        //  1421: lload           9
        //  1423: iload           8
        //  1425: iload           7
        //  1427: aload           12
        //  1429: invokevirtual   bmc.ae:(JJLblw;Ljava/nio/ByteBuffer;IIIJZZLayg;)Z
        //  1432: istore          7
        //  1434: iload           7
        //  1436: ifeq            1486
        //  1439: aload_0        
        //  1440: astore          11
        //  1442: aload           11
        //  1444: aload           11
        //  1446: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1449: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //  1452: invokevirtual   bmc.al:(J)V
        //  1455: aload           11
        //  1457: getfield        bmc.x:Landroid/media/MediaCodec$BufferInfo;
        //  1460: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //  1463: istore          5
        //  1465: aload_0        
        //  1466: invokespecial   bmc.az:()V
        //  1469: iload           5
        //  1471: iconst_4       
        //  1472: iand           
        //  1473: ifeq            1483
        //  1476: aload_0        
        //  1477: invokespecial   bmc.aw:()V
        //  1480: goto            1489
        //  1483: goto            778
        //  1486: aload_0        
        //  1487: astore          11
        //  1489: aload_0        
        //  1490: astore          11
        //  1492: aload_0        
        //  1493: invokespecial   bmc.aE:()Z
        //  1496: ifeq            1502
        //  1499: goto            1489
        //  1502: goto            1559
        //  1505: astore          11
        //  1507: aload_0        
        //  1508: astore          12
        //  1510: goto            1582
        //  1513: astore          11
        //  1515: aload_0        
        //  1516: astore          12
        //  1518: goto            1582
        //  1521: aload           12
        //  1523: astore          11
        //  1525: aload           11
        //  1527: getfield        bmc.o:Lbdy;
        //  1530: astore          12
        //  1532: aload           12
        //  1534: aload           12
        //  1536: getfield        bdy.d:I
        //  1539: aload_0        
        //  1540: lload_1        
        //  1541: invokevirtual   bdx.i:(J)I
        //  1544: iadd           
        //  1545: putfield        bdy.d:I
        //  1548: aload           11
        //  1550: astore          12
        //  1552: aload           11
        //  1554: iconst_1       
        //  1555: invokespecial   bmc.aG:(I)Z
        //  1558: pop            
        //  1559: aload           11
        //  1561: astore          12
        //  1563: aload           11
        //  1565: getfield        bmc.o:Lbdy;
        //  1568: invokevirtual   bdy.a:()V
        //  1571: return         
        //  1572: astore          11
        //  1574: goto            1598
        //  1577: aload_0        
        //  1578: astore          11
        //  1580: astore          11
        //  1582: aload_0        
        //  1583: astore          12
        //  1585: goto            1598
        //  1588: astore          13
        //  1590: aload           11
        //  1592: astore          12
        //  1594: aload           13
        //  1596: astore          11
        //  1598: getstatic       bax.a:I
        //  1601: istore          5
        //  1603: aload           11
        //  1605: instanceof      Landroid/media/MediaCodec$CodecException;
        //  1608: istore          7
        //  1610: iload           7
        //  1612: ifeq            1618
        //  1615: goto            1647
        //  1618: aload           11
        //  1620: invokevirtual   java/lang/IllegalStateException.getStackTrace:()[Ljava/lang/StackTraceElement;
        //  1623: astore          13
        //  1625: aload           13
        //  1627: arraylength    
        //  1628: ifle            1716
        //  1631: aload           13
        //  1633: iconst_0       
        //  1634: aaload         
        //  1635: invokevirtual   java/lang/StackTraceElement.getClassName:()Ljava/lang/String;
        //  1638: ldc_w           "android.media.MediaCodec"
        //  1641: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1644: ifeq            1716
        //  1647: aload           12
        //  1649: aload           11
        //  1651: invokevirtual   bmc.X:(Ljava/lang/Exception;)V
        //  1654: iload           7
        //  1656: ifeq            1676
        //  1659: aload           11
        //  1661: checkcast       Landroid/media/MediaCodec$CodecException;
        //  1664: invokevirtual   android/media/MediaCodec$CodecException.isRecoverable:()Z
        //  1667: ifeq            1676
        //  1670: iconst_1       
        //  1671: istore          7
        //  1673: goto            1679
        //  1676: iconst_0       
        //  1677: istore          7
        //  1679: iload           7
        //  1681: ifeq            1688
        //  1684: aload_0        
        //  1685: invokevirtual   bmc.am:()V
        //  1688: aload           12
        //  1690: aload           12
        //  1692: aload           11
        //  1694: aload           12
        //  1696: getfield        bmc.k:Lblz;
        //  1699: invokevirtual   bmc.ai:(Ljava/lang/Throwable;Lblz;)Lblx;
        //  1702: aload           12
        //  1704: getfield        bmc.B:Layg;
        //  1707: iload           7
        //  1709: sipush          4003
        //  1712: invokevirtual   bdx.m:(Ljava/lang/Throwable;Layg;ZI)Lbef;
        //  1715: athrow         
        //  1716: goto            1722
        //  1719: aload           11
        //  1721: athrow         
        //  1722: goto            1719
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      15     1588   1590   Ljava/lang/IllegalStateException;
        //  19     23     1588   1590   Ljava/lang/IllegalStateException;
        //  28     36     1588   1590   Ljava/lang/IllegalStateException;
        //  40     49     1588   1590   Ljava/lang/IllegalStateException;
        //  57     61     1588   1590   Ljava/lang/IllegalStateException;
        //  65     72     1588   1590   Ljava/lang/IllegalStateException;
        //  81     86     748    753    Ljava/lang/IllegalStateException;
        //  94     104    748    753    Ljava/lang/IllegalStateException;
        //  108    115    748    753    Ljava/lang/IllegalStateException;
        //  119    126    748    753    Ljava/lang/IllegalStateException;
        //  139    146    1588   1590   Ljava/lang/IllegalStateException;
        //  150    157    1588   1590   Ljava/lang/IllegalStateException;
        //  161    168    1588   1590   Ljava/lang/IllegalStateException;
        //  172    179    1588   1590   Ljava/lang/IllegalStateException;
        //  183    190    1588   1590   Ljava/lang/IllegalStateException;
        //  194    201    1588   1590   Ljava/lang/IllegalStateException;
        //  205    212    1588   1590   Ljava/lang/IllegalStateException;
        //  212    236    282    290    Ljava/lang/IllegalStateException;
        //  248    261    1588   1590   Ljava/lang/IllegalStateException;
        //  265    273    1588   1590   Ljava/lang/IllegalStateException;
        //  294    302    1588   1590   Ljava/lang/IllegalStateException;
        //  306    312    1588   1590   Ljava/lang/IllegalStateException;
        //  323    331    1588   1590   Ljava/lang/IllegalStateException;
        //  335    351    1588   1590   Ljava/lang/IllegalStateException;
        //  355    361    1588   1590   Ljava/lang/IllegalStateException;
        //  368    376    1588   1590   Ljava/lang/IllegalStateException;
        //  380    391    1588   1590   Ljava/lang/IllegalStateException;
        //  395    399    1588   1590   Ljava/lang/IllegalStateException;
        //  403    409    1588   1590   Ljava/lang/IllegalStateException;
        //  413    417    1588   1590   Ljava/lang/IllegalStateException;
        //  421    429    1588   1590   Ljava/lang/IllegalStateException;
        //  443    453    1588   1590   Ljava/lang/IllegalStateException;
        //  457    463    1588   1590   Ljava/lang/IllegalStateException;
        //  467    475    1588   1590   Ljava/lang/IllegalStateException;
        //  479    487    1588   1590   Ljava/lang/IllegalStateException;
        //  491    506    1588   1590   Ljava/lang/IllegalStateException;
        //  527    538    1588   1590   Ljava/lang/IllegalStateException;
        //  542    548    1588   1590   Ljava/lang/IllegalStateException;
        //  555    563    1588   1590   Ljava/lang/IllegalStateException;
        //  567    574    1588   1590   Ljava/lang/IllegalStateException;
        //  578    584    1588   1590   Ljava/lang/IllegalStateException;
        //  588    595    1588   1590   Ljava/lang/IllegalStateException;
        //  599    607    1588   1590   Ljava/lang/IllegalStateException;
        //  611    617    1588   1590   Ljava/lang/IllegalStateException;
        //  621    629    1588   1590   Ljava/lang/IllegalStateException;
        //  633    649    1588   1590   Ljava/lang/IllegalStateException;
        //  653    659    1588   1590   Ljava/lang/IllegalStateException;
        //  666    674    1588   1590   Ljava/lang/IllegalStateException;
        //  678    685    1588   1590   Ljava/lang/IllegalStateException;
        //  689    697    1588   1590   Ljava/lang/IllegalStateException;
        //  701    706    1588   1590   Ljava/lang/IllegalStateException;
        //  710    721    1588   1590   Ljava/lang/IllegalStateException;
        //  725    733    1588   1590   Ljava/lang/IllegalStateException;
        //  737    745    1588   1590   Ljava/lang/IllegalStateException;
        //  757    764    1588   1590   Ljava/lang/IllegalStateException;
        //  769    778    1513   1521   Ljava/lang/IllegalStateException;
        //  781    787    1513   1521   Ljava/lang/IllegalStateException;
        //  796    813    1588   1590   Ljava/lang/IllegalStateException;
        //  829    835    1588   1590   Ljava/lang/IllegalStateException;
        //  839    854    1588   1590   Ljava/lang/IllegalStateException;
        //  858    864    1588   1590   Ljava/lang/IllegalStateException;
        //  871    879    1588   1590   Ljava/lang/IllegalStateException;
        //  886    894    1588   1590   Ljava/lang/IllegalStateException;
        //  898    907    1588   1590   Ljava/lang/IllegalStateException;
        //  911    915    1588   1590   Ljava/lang/IllegalStateException;
        //  922    933    1588   1590   Ljava/lang/IllegalStateException;
        //  937    950    1588   1590   Ljava/lang/IllegalStateException;
        //  954    958    1588   1590   Ljava/lang/IllegalStateException;
        //  965    972    1588   1590   Ljava/lang/IllegalStateException;
        //  976    990    1588   1590   Ljava/lang/IllegalStateException;
        //  994    1001   1588   1590   Ljava/lang/IllegalStateException;
        //  1010   1024   1588   1590   Ljava/lang/IllegalStateException;
        //  1028   1054   1588   1590   Ljava/lang/IllegalStateException;
        //  1058   1068   1588   1590   Ljava/lang/IllegalStateException;
        //  1072   1082   1588   1590   Ljava/lang/IllegalStateException;
        //  1096   1118   1588   1590   Ljava/lang/IllegalStateException;
        //  1122   1133   1588   1590   Ljava/lang/IllegalStateException;
        //  1152   1159   1588   1590   Ljava/lang/IllegalStateException;
        //  1163   1180   1588   1590   Ljava/lang/IllegalStateException;
        //  1193   1200   1588   1590   Ljava/lang/IllegalStateException;
        //  1204   1214   1588   1590   Ljava/lang/IllegalStateException;
        //  1218   1233   1588   1590   Ljava/lang/IllegalStateException;
        //  1250   1258   1588   1590   Ljava/lang/IllegalStateException;
        //  1262   1275   1588   1590   Ljava/lang/IllegalStateException;
        //  1284   1291   1588   1590   Ljava/lang/IllegalStateException;
        //  1298   1306   1588   1590   Ljava/lang/IllegalStateException;
        //  1310   1318   1588   1590   Ljava/lang/IllegalStateException;
        //  1322   1337   1588   1590   Ljava/lang/IllegalStateException;
        //  1341   1347   1588   1590   Ljava/lang/IllegalStateException;
        //  1347   1409   1513   1521   Ljava/lang/IllegalStateException;
        //  1409   1434   1505   1513   Ljava/lang/IllegalStateException;
        //  1442   1469   1577   1582   Ljava/lang/IllegalStateException;
        //  1476   1480   1577   1582   Ljava/lang/IllegalStateException;
        //  1492   1499   1577   1582   Ljava/lang/IllegalStateException;
        //  1525   1548   1577   1582   Ljava/lang/IllegalStateException;
        //  1552   1559   1572   1577   Ljava/lang/IllegalStateException;
        //  1563   1571   1572   1577   Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1483:
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
    
    public boolean S() {
        return this.l;
    }
    
    public boolean T() {
        final ayg b = this.B;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b != null) {
            if (!this.M() && !this.aF()) {
                b3 = b2;
                if (this.O != -9223372036854775807L) {
                    if (SystemClock.elapsedRealtime() < this.O) {
                        return true;
                    }
                    b3 = b2;
                }
            }
            else {
                b3 = true;
            }
        }
        return b3;
    }
    
    protected bdz U(final blz blz, final ayg ayg, final ayg ayg2) {
        throw null;
    }
    
    protected abstract blu V(final blz p0, final ayg p1, final MediaCrypto p2, final float p3);
    
    protected abstract List W(final bme p0, final ayg p1, final boolean p2);
    
    protected void X(final Exception ex) {
        throw null;
    }
    
    protected void Y(final String s, final blu blu, final long n, final long n2) {
        throw null;
    }
    
    protected void Z(final String s) {
        throw null;
    }
    
    public final int a(final ayg ayg) {
        try {
            return this.f(this.e, ayg);
        }
        catch (final bmi bmi) {
            throw this.l((Throwable)bmi, ayg, 4002);
        }
    }
    
    protected void aa(final ayg ayg, final MediaFormat mediaFormat) {
        throw null;
    }
    
    protected void ab() {
    }
    
    protected void ac(final bdc bdc) {
        throw null;
    }
    
    protected void ad() {
    }
    
    protected abstract boolean ae(final long p0, final long p1, final blw p2, final ByteBuffer p3, final int p4, final int p5, final int p6, final long p7, final boolean p8, final boolean p9, final ayg p10);
    
    protected boolean af(final ayg ayg) {
        return false;
    }
    
    protected void ag() {
    }
    
    protected bdz ah(final bxc bxc) {
        this.ag = true;
        final ayg a = bxc.a;
        dk.d((Object)a);
        if (a.n == null) {
            throw this.l((Throwable)new IllegalArgumentException(), a, 4005);
        }
        this.aC((bkm)bxc.b);
        this.B = a;
        if (this.U) {
            this.W = true;
            return null;
        }
        final blw h = this.h;
        if (h == null) {
            this.K = null;
            this.ak();
            return null;
        }
        final blz k = this.k;
        final ayg i = this.i;
        final bkm d = this.D;
        final bkm e = this.E;
        Label_0215: {
            if (d != e) {
                if (e != null) {
                    if (d != null) {
                        if (e.e().equals(d.e())) {
                            final int a2 = bax.a;
                            if (!axz.e.equals(d.e()) && !axz.e.equals(e.e()) && aH(e) != null) {
                                final boolean n = e.n(a.n);
                                if (k.f || !n) {
                                    break Label_0215;
                                }
                            }
                        }
                    }
                }
                this.c();
                return new bdz(k.a, i, a, 0, 128);
            }
        }
        final bkm e2 = this.E;
        final bkm d2 = this.D;
        final int n2 = 0;
        final boolean b = e2 != d2;
        if (b) {
            final int a3 = bax.a;
        }
        dk.h(true);
        final bdz u = this.U(k, i, a);
        final int d3 = u.d;
        int n3 = 0;
        Label_0435: {
            if (d3 != 0) {
                if (d3 != 1) {
                    if (d3 != 2) {
                        if (this.as(a)) {
                            this.i = a;
                            n3 = n2;
                            if (b) {
                                this.aI();
                                n3 = n2;
                            }
                            break Label_0435;
                        }
                    }
                    else if (this.as(a)) {
                        this.X = true;
                        this.Y = 1;
                        this.i = a;
                        n3 = n2;
                        if (b) {
                            this.aI();
                            n3 = n2;
                        }
                        break Label_0435;
                    }
                }
                else if (this.as(a)) {
                    this.i = a;
                    if (b) {
                        this.aI();
                        n3 = n2;
                        break Label_0435;
                    }
                    n3 = n2;
                    if (this.ab) {
                        this.Z = 1;
                        this.aa = 1;
                        n3 = n2;
                    }
                    break Label_0435;
                }
                n3 = 16;
            }
            else {
                this.c();
                n3 = n2;
            }
        }
        if (u.d != 0 && (this.h != h || this.aa == 3)) {
            return new bdz(k.a, i, a, 0, n3);
        }
        return u;
    }
    
    protected blx ai(final Throwable t, final blz blz) {
        return new blx(t, blz);
    }
    
    protected void aj(final bdc bdc) {
    }
    
    protected final void ak() {
        if (this.h == null && !this.U) {
            final ayg b = this.B;
            if (b != null) {
                if (this.E == null && this.af(b)) {
                    final ayg b2 = this.B;
                    this.b();
                    final String n = b2.n;
                    if (!"audio/mp4a-latm".equals(n) && !"audio/mpeg".equals(n) && !"audio/opus".equals(n)) {
                        this.u.e(1);
                    }
                    else {
                        this.u.e(32);
                    }
                    this.U = true;
                    return;
                }
                this.aA(this.E);
                final String n2 = this.B.n;
                final bkm d = this.D;
                if (d != null) {
                    if (this.F == null) {
                        final blb ah = aH(d);
                        if (ah == null) {
                            if (this.D.c() == null) {
                                return;
                            }
                        }
                        else {
                            try {
                                final MediaCrypto f = new MediaCrypto(ah.b, ah.c);
                                this.F = f;
                                this.G = f.requiresSecureDecoderComponent(n2);
                            }
                            catch (final MediaCryptoException ex) {
                                throw this.l((Throwable)ex, this.B, 6006);
                            }
                        }
                    }
                    if (blb.a) {
                        final int a = this.D.a();
                        if (a == 1) {
                            final bkl c = this.D.c();
                            dk.d((Object)c);
                            throw this.l((Throwable)c, this.B, c.a);
                        }
                        if (a != 4) {
                            return;
                        }
                    }
                }
                try {
                    final MediaCrypto f2 = this.F;
                    final boolean g = this.G;
                    if (this.K == null) {
                        try {
                            List list2;
                            final List list = list2 = this.W(this.e, this.B, g);
                            if (list.isEmpty()) {
                                list2 = list;
                                if (g) {
                                    final List list3 = list2 = this.W(this.e, this.B, (boolean)(0 != 0));
                                    if (!list3.isEmpty()) {
                                        final String n3 = this.B.n;
                                        final String string = list3.toString();
                                        final StringBuilder sb = new StringBuilder("Drm session requires secure decoder for ");
                                        sb.append(n3);
                                        sb.append(", but no secure decoder available. Trying to proceed with ");
                                        sb.append(string);
                                        sb.append(".");
                                        bap.c("MediaCodecRenderer", sb.toString());
                                        list2 = list3;
                                    }
                                }
                            }
                            final ArrayDeque k = new ArrayDeque();
                            this.K = k;
                            if (this.f) {
                                k.addAll(list2);
                            }
                            else if (!list2.isEmpty()) {
                                this.K.add(list2.get(0));
                            }
                            this.L = null;
                        }
                        catch (final bmi bmi) {
                            throw new bmb(this.B, bmi, g, -49998);
                        }
                    }
                    if (!this.K.isEmpty()) {
                        final blz blz = this.K.peekFirst();
                        while (this.h == null) {
                            final blz blz2 = this.K.peekFirst();
                            if (!this.aq(blz2)) {
                                return;
                            }
                            try {
                                this.av(blz2, f2);
                                continue;
                            }
                            catch (final Exception ex2) {
                                Label_0663: {
                                    if (blz2 != blz) {
                                        break Label_0663;
                                    }
                                    try {
                                        bap.c("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                        Thread.sleep(50L);
                                        this.av(blz2, f2);
                                        continue;
                                        throw ex2;
                                    }
                                    catch (final Exception ex3) {
                                        bap.d("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(blz2))), (Throwable)ex3);
                                        this.K.removeFirst();
                                        final ayg b3 = this.B;
                                        final String a2 = blz2.a;
                                        final String value = String.valueOf(b3);
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Decoder init failed: ");
                                        sb2.append(a2);
                                        sb2.append(", ");
                                        sb2.append(value);
                                        final String string2 = sb2.toString();
                                        final String n4 = b3.n;
                                        final int a3 = bax.a;
                                        String diagnosticInfo;
                                        if (ex3 instanceof MediaCodec$CodecException) {
                                            diagnosticInfo = ((MediaCodec$CodecException)ex3).getDiagnosticInfo();
                                        }
                                        else {
                                            diagnosticInfo = null;
                                        }
                                        final bmb l = new bmb(string2, ex3, n4, g, blz2, diagnosticInfo);
                                        this.X(l);
                                        final bmb i = this.L;
                                        if (i == null) {
                                            this.L = l;
                                        }
                                        else {
                                            this.L = new bmb(i.getMessage(), i.getCause(), i.a, i.b, i.c, i.d);
                                        }
                                        if (!this.K.isEmpty()) {
                                            continue;
                                        }
                                        throw this.L;
                                    }
                                }
                            }
                            break;
                        }
                        this.K = null;
                        return;
                    }
                    throw new bmb(this.B, null, g, -49999);
                }
                catch (final bmb bmb) {
                    throw this.l((Throwable)bmb, this.B, 4001);
                }
            }
        }
    }
    
    protected void al(final long n) {
        while (this.ai != 0 && n >= this.A[0]) {
            this.ah = this.y[0];
            this.aB(this.z[0]);
            final int ai = this.ai - 1;
            this.ai = ai;
            final long[] y = this.y;
            System.arraycopy(y, 1, y, 0, ai);
            final long[] z = this.z;
            System.arraycopy(z, 1, z, 0, this.ai);
            final long[] a = this.A;
            System.arraycopy(a, 1, a, 0, this.ai);
            this.ab();
        }
    }
    
    protected final void am() {
        try {
            final blw h = this.h;
            if (h != null) {
                h.h();
                final bdy o = this.o;
                ++o.b;
                this.Z(this.k.a);
            }
            this.h = null;
            try {
                final MediaCrypto f = this.F;
                if (f != null) {
                    f.release();
                }
            }
            finally {
                this.F = null;
                this.aA(null);
                this.ao();
            }
        }
        finally {
            this.h = null;
            try {
                final MediaCrypto f2 = this.F;
                if (f2 != null) {
                    f2.release();
                }
                this.F = null;
                this.aA(null);
                this.ao();
            }
            finally {
                this.F = null;
                this.aA(null);
                this.ao();
            }
        }
    }
    
    protected void an() {
        this.ay();
        this.az();
        this.O = -9223372036854775807L;
        this.ab = false;
        this.S = false;
        this.T = false;
        this.w.clear();
        this.ad = -9223372036854775807L;
        this.ae = -9223372036854775807L;
        final zlh aj = this.aj;
        if (aj != null) {
            aj.c = 0L;
            aj.a = 0L;
            aj.b = false;
        }
        this.Z = 0;
        this.aa = 0;
        this.Y = (this.X ? 1 : 0);
    }
    
    protected final void ao() {
        this.an();
        this.n = null;
        this.aj = null;
        this.K = null;
        this.k = null;
        this.i = null;
        this.j = null;
        this.I = false;
        this.ac = false;
        this.J = -1.0f;
        this.M = false;
        this.N = false;
        this.X = false;
        this.Y = 0;
        this.G = false;
    }
    
    protected final boolean ap() {
        if (this.h == null) {
            return false;
        }
        final int aa = this.aa;
        if (aa != 3 && (!this.M || this.ac)) {
            if (aa == 2) {
                final int a = bax.a;
                dk.h(true);
                try {
                    this.aD();
                }
                catch (final bef bef) {
                    bap.d("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", (Throwable)bef);
                    this.am();
                    return true;
                }
            }
            this.au();
            return false;
        }
        this.am();
        return true;
    }
    
    protected boolean aq(final blz blz) {
        return true;
    }
    
    public final boolean as(final ayg ayg) {
        final int a = bax.a;
        if (this.h != null && this.aa != 3) {
            if (super.b != 0) {
                final float e = this.e(this.H, ayg, this.N());
                final float j = this.J;
                if (j == e) {
                    return true;
                }
                if (e == -1.0f) {
                    this.c();
                    return false;
                }
                if (j == -1.0f && e <= this.q) {
                    return true;
                }
                final Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", e);
                this.h.k(bundle);
                this.J = e;
            }
        }
        return true;
    }
    
    protected final void at() {
        if (this.ap()) {
            this.ak();
        }
    }
    
    protected float e(final float n, final ayg ayg, final ayg[] array) {
        throw null;
    }
    
    protected abstract int f(final bme p0, final ayg p1);
    
    public final int j() {
        return 8;
    }
    
    protected void w() {
        this.B = null;
        this.aB(this.ah = -9223372036854775807L);
        this.ai = 0;
        this.ap();
    }
    
    protected void x(final boolean b, final boolean b2) {
        this.o = new bdy();
    }
    
    protected void y(final long n, final boolean b) {
        this.af = false;
        this.l = false;
        this.m = false;
        if (this.U) {
            ((bcw)this.u).clear();
            ((bcw)this.t).clear();
            this.V = false;
        }
        else {
            this.at();
        }
        final bav v = this.v;
        if (v.a() > 0) {
            this.ag = true;
        }
        v.f();
        final int ai = this.ai;
        if (ai != 0) {
            this.aB(this.z[ai - 1]);
            this.ah = this.y[this.ai - 1];
            this.ai = 0;
        }
    }
    
    protected void z() {
        try {
            this.b();
            this.am();
        }
        finally {
            this.aC(null);
        }
    }
}
