import android.util.Pair;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.media.AudioTrack$StreamEventCallback;
import java.lang.reflect.Method;
import android.media.AudioManager;
import android.media.AudioAttributes;
import android.os.SystemClock;
import android.media.AudioFormat$Builder;
import android.media.AudioFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.ArrayDeque;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhz implements bhj
{
    public static final Object a;
    public static ExecutorService b;
    public static int c;
    private int A;
    private boolean B;
    private boolean C;
    private long D;
    private float E;
    private azu[] F;
    private ByteBuffer[] G;
    private ByteBuffer H;
    private int I;
    private ByteBuffer J;
    private int K;
    private boolean L;
    private boolean M;
    private int N;
    private axu O;
    private bhu P;
    private boolean Q;
    private boolean R;
    private final gpd S;
    private dfl T;
    private final argq U;
    private final argq V;
    private final eg W;
    public bgz d;
    public bhg e;
    public AudioTrack f;
    public boolean g;
    public long h;
    private final bhb i;
    private final bho j;
    private final bik k;
    private final azu[] l;
    private final azu[] m;
    private final bhm n;
    private final ArrayDeque o;
    private final int p;
    private final bhv q;
    private bhw r;
    private bhw s;
    private axt t;
    private bhx u;
    private bhx v;
    private long w;
    private long x;
    private long y;
    private long z;
    
    static {
        a = new Object();
    }
    
    public bhz(final tgu tgu, final byte[] array, final byte[] array2) {
        this.i = (bhb)tgu.b;
        final eg w = (eg)tgu.d;
        this.W = w;
        final int a = baw.a;
        int a2;
        if (baw.a >= 29) {
            a2 = tgu.a;
        }
        else {
            a2 = 0;
        }
        this.p = a2;
        this.q = (bhv)tgu.c;
        (this.S = new gpd((byte[])null)).e();
        this.n = new bhm(new qpt(this), null, null, null, null, null);
        final bho j = new bho();
        this.j = j;
        final bik k = new bik();
        this.k = k;
        final ArrayList<Object> list = new ArrayList<Object>();
        Collections.addAll(list, (bhn)new big(), (bhn)j, (bhn)k);
        Collections.addAll(list, (Object[])w.b);
        this.l = list.toArray(new azu[0]);
        this.m = new azu[] { (azu)new bib() };
        this.E = 1.0f;
        this.t = axt.a;
        this.N = 0;
        this.O = new axu();
        this.v = new bhx(azb.a, false, 0L, 0L);
        this.K = -1;
        this.F = new azu[0];
        this.G = new ByteBuffer[0];
        this.o = new ArrayDeque();
        this.U = new argq((char[])null, null);
        this.V = new argq((char[])null, null);
    }
    
    public static AudioFormat B(final int sampleRate, final int channelMask, final int encoding) {
        return new AudioFormat$Builder().setSampleRate(sampleRate).setChannelMask(channelMask).setEncoding(encoding).build();
    }
    
    private final AudioTrack E(final bhw bhw) {
        try {
            return bhw.b(false, this.t, this.N);
        }
        catch (final bhf bhf) {
            final bhg e = this.e;
            if (e != null) {
                e.a(bhf);
            }
            throw bhf;
        }
    }
    
    private final bhx F() {
        bhx bhx = this.u;
        if (bhx == null) {
            if (!this.o.isEmpty()) {
                bhx = this.o.getLast();
            }
            else {
                bhx = this.v;
            }
        }
        return bhx;
    }
    
    private final void G(final long n) {
        azb a;
        if (this.Q()) {
            final eg w = this.W;
            final azb c = this.C();
            ((bij)w.d).i(c.b);
            final Object d = w.d;
            final float c2 = c.c;
            final bij bij = (bij)d;
            a = c;
            if (bij.d != c2) {
                bij.d = c2;
                bij.g = true;
                a = c;
            }
        }
        else {
            a = azb.a;
        }
        final boolean q = this.Q();
        int i = 0;
        boolean d2;
        if (q) {
            final eg w2 = this.W;
            d2 = this.D();
            ((bih)w2.c).e = d2;
        }
        else {
            d2 = false;
        }
        this.o.add(new bhx(a, d2, Math.max(0L, n), this.s.a(this.A())));
        final azu[] j = this.s.i;
        final ArrayList<azu> list = new ArrayList<azu>();
        while (i < j.length) {
            final azu azu = j[i];
            if (azu.g()) {
                list.add(azu);
            }
            else {
                azu.c();
            }
            ++i;
        }
        final int size = list.size();
        this.F = list.toArray(new azu[size]);
        this.G = new ByteBuffer[size];
        this.H();
        final bhg e = this.e;
        if (e != null) {
            e.f(d2);
        }
    }
    
    private final void H() {
        int n = 0;
        while (true) {
            final azu[] f = this.F;
            if (n >= f.length) {
                break;
            }
            final azu azu = f[n];
            azu.c();
            this.G[n] = azu.b();
            ++n;
        }
    }
    
    private final void I() {
        if (!this.M) {
            this.M = true;
            final bhm n = this.n;
            final long a = this.A();
            n.x = n.b();
            n.v = SystemClock.elapsedRealtime() * 1000L;
            n.y = a;
            this.f.stop();
        }
    }
    
    private final void J(final long n) {
        int i;
        final int n2 = i = this.F.length;
        while (i >= 0) {
            ByteBuffer byteBuffer;
            if (i > 0) {
                byteBuffer = this.G[i - 1];
            }
            else if ((byteBuffer = this.H) == null) {
                byteBuffer = azu.a;
            }
            if (i == n2) {
                this.M(byteBuffer, n);
            }
            else {
                final azu azu = this.F[i];
                if (i > this.K) {
                    azu.e(byteBuffer);
                }
                final ByteBuffer b = azu.b();
                this.G[i] = b;
                if (b.hasRemaining()) {
                    ++i;
                    continue;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            --i;
        }
    }
    
    private final void K(final azb azb, final boolean b) {
        final bhx f = this.F();
        if (azb.equals((Object)f.a) && b == f.b) {
            return;
        }
        final bhx bhx = new bhx(azb, b, -9223372036854775807L, -9223372036854775807L);
        if (this.O()) {
            this.u = bhx;
            return;
        }
        this.v = bhx;
    }
    
    private final void L() {
        if (!this.O()) {
            return;
        }
        final int a = baw.a;
        this.f.setVolume(this.E);
    }
    
    private final void M(final ByteBuffer j, final long n) {
        if (!j.hasRemaining()) {
            return;
        }
        final ByteBuffer i = this.J;
        final boolean b = true;
        final boolean b2 = true;
        if (i != null) {
            dk.f(i == j);
        }
        else {
            this.J = j;
            final int a = baw.a;
        }
        final int remaining = j.remaining();
        final int a2 = baw.a;
        final int write = this.f.write(j, remaining, 1);
        this.h = SystemClock.elapsedRealtime();
        if (write >= 0) {
            this.V.d();
            if (P(this.f)) {
                if (this.z > 0L) {
                    this.R = false;
                }
                if (this.g) {
                    final bhg e = this.e;
                    if (e != null && write < remaining && !this.R) {
                        e.c();
                    }
                }
            }
            final int c = this.s.c;
            if (c == 0) {
                this.y += write;
            }
            if (write == remaining) {
                if (c != 0) {
                    dk.h(j == this.H && b);
                    this.z += this.A * (long)this.I;
                }
                this.J = null;
            }
            return;
        }
        final bhi bhi = new bhi(write, this.s.a, (write == -6 || write == -32) && this.z > 0L && b2);
        final bhg e2 = this.e;
        if (e2 != null) {
            e2.a(bhi);
        }
        if (!bhi.b) {
            this.V.e(bhi);
            return;
        }
        throw bhi;
    }
    
    private final boolean N() {
        while (true) {
            boolean b = false;
            Label_0020: {
                if (this.K != -1) {
                    b = false;
                    break Label_0020;
                }
                this.K = 0;
                b = true;
            }
            final int k = this.K;
            final azu[] f = this.F;
            if (k >= f.length) {
                final ByteBuffer j = this.J;
                if (j != null) {
                    this.M(j, -9223372036854775807L);
                    if (this.J != null) {
                        return false;
                    }
                }
                this.K = -1;
                return true;
            }
            final azu azu = f[k];
            if (b) {
                azu.d();
            }
            this.J(-9223372036854775807L);
            if (!azu.h()) {
                return false;
            }
            ++this.K;
            continue;
        }
    }
    
    private final boolean O() {
        return this.f != null;
    }
    
    private static boolean P(final AudioTrack audioTrack) {
        return baw.a >= 29 && audioTrack.isOffloadedPlayback();
    }
    
    private final boolean Q() {
        if ("audio/raw".equals(this.s.a.n)) {
            final int c = this.s.a.C;
            return true;
        }
        return false;
    }
    
    private final boolean R(final ayf ayf, final axt axt) {
        if (baw.a >= 29) {
            if (this.p != 0) {
                final String n = ayf.n;
                dk.d((Object)n);
                final int a = ayy.a(n, ayf.k);
                if (a == 0) {
                    return false;
                }
                final int g = baw.g(ayf.A);
                if (g == 0) {
                    return false;
                }
                final AudioFormat b = B(ayf.B, g, a);
                final Object a2 = axt.a().a;
                final int a3 = baw.a;
                final AudioAttributes audioAttributes = (AudioAttributes)a2;
                Label_0163: {
                    if (a3 >= 31) {
                        final int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(b, audioAttributes);
                        if (playbackOffloadSupport == 0) {
                            return false;
                        }
                        if (playbackOffloadSupport == 1) {
                            break Label_0163;
                        }
                        if (playbackOffloadSupport != 2) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        if (!AudioManager.isOffloadedPlaybackSupported(b, audioAttributes)) {
                            return false;
                        }
                        if (baw.a != 30 || !baw.d.startsWith("Pixel")) {
                            break Label_0163;
                        }
                    }
                    return true;
                }
                final boolean b2 = ayf.D != 0 || ayf.E != 0;
                final int p2 = this.p;
                return !b2 || p2 != 1;
            }
        }
        return false;
    }
    
    public final long A() {
        final bhw s = this.s;
        long z;
        if (s.c == 0) {
            z = this.y / s.d;
        }
        else {
            z = this.z;
        }
        return z;
    }
    
    public final azb C() {
        return this.F().a;
    }
    
    public final boolean D() {
        return this.F().b;
    }
    
    @Override
    public final int a(final ayf ayf) {
        if ("audio/raw".equals(ayf.n)) {
            if (!baw.ae(ayf.C)) {
                final int c = ayf.C;
                final StringBuilder sb = new StringBuilder("Invalid PCM encoding: ");
                sb.append(c);
                bao.c("DefaultAudioSink", sb.toString());
                return 0;
            }
            if (ayf.C != 2) {
                return 1;
            }
            return 2;
        }
        else {
            if (!this.Q && this.R(ayf, this.t)) {
                return 2;
            }
            if (this.i.a(ayf) != null) {
                return 2;
            }
            return 0;
        }
    }
    
    @Override
    public final long b(final boolean b) {
        if (!this.O() || this.C) {
            return Long.MIN_VALUE;
        }
        Object o = this.n;
        final AudioTrack b2 = ((bhm)o).b;
        dk.d((Object)b2);
        Label_1004: {
            if (b2.getPlayState() != 3) {
                break Label_1004;
            }
            final long c = ((bhm)o).c();
            if (c == 0L) {
                break Label_1004;
            }
            long n = System.nanoTime() / 1000L;
            if (n - ((bhm)o).k >= 30000L) {
                final long[] a = ((bhm)o).a;
                final int t = ((bhm)o).t;
                a[t] = c - n;
                ((bhm)o).t = (t + 1) % 10;
                final int u = ((bhm)o).u;
                if (u < 10) {
                    ((bhm)o).u = u + 1;
                }
                ((bhm)o).k = n;
                ((bhm)o).j = 0L;
                int n2 = 0;
                while (true) {
                    final int u2 = ((bhm)o).u;
                    if (n2 >= u2) {
                        break;
                    }
                    ((bhm)o).j += ((bhm)o).a[n2] / u2;
                    ++n2;
                }
            }
            final boolean f = ((bhm)o).f;
            final bhl d = ((bhm)o).d;
            dk.d((Object)d);
            final bhk a2 = d.a;
            Label_0221: {
                if (n - d.e >= d.d) {
                    d.e = n;
                    final boolean timestamp = a2.a.getTimestamp(a2.b);
                    if (timestamp) {
                        final long framePosition = a2.b.framePosition;
                        if (a2.d > framePosition) {
                            ++a2.c;
                        }
                        a2.d = framePosition;
                        a2.e = framePosition + (a2.c << 32);
                    }
                    final int b3 = d.b;
                    if (b3 != 0) {
                        if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (!timestamp) {
                                        break Label_0221;
                                    }
                                }
                                else {
                                    if (!timestamp) {
                                        break Label_0221;
                                    }
                                    d.d();
                                }
                            }
                            else if (!timestamp) {
                                d.d();
                                break Label_0221;
                            }
                        }
                        else {
                            if (!timestamp) {
                                d.d();
                                break Label_0221;
                            }
                            if (d.a.e > d.f) {
                                d.e(2);
                            }
                        }
                    }
                    else if (timestamp) {
                        if (d.a.a() < d.c) {
                            break Label_0221;
                        }
                        d.f = d.a.e;
                        d.e(1);
                    }
                    else {
                        if (n - d.c > 500000L) {
                            d.e(3);
                        }
                        break Label_0221;
                    }
                    final long b4 = d.b();
                    final long a3 = d.a();
                    if (Math.abs(b4 - n) > 5000000L) {
                        final qpt e = ((bhm)o).E;
                        final long z = ((bhz)e.a).z();
                        final long a4 = ((bhz)e.a).A();
                        final StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                        sb.append(a3);
                        sb.append(", ");
                        sb.append(b4);
                        sb.append(", ");
                        sb.append(n);
                        sb.append(", ");
                        sb.append(c);
                        sb.append(", ");
                        sb.append(z);
                        sb.append(", ");
                        sb.append(a4);
                        bao.c("DefaultAudioSink", sb.toString());
                        d.c();
                    }
                    else if (Math.abs(((bhm)o).a(a3) - c) > 5000000L) {
                        final qpt e2 = ((bhm)o).E;
                        final long z2 = ((bhz)e2.a).z();
                        final long a5 = ((bhz)e2.a).A();
                        final StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                        sb2.append(a3);
                        sb2.append(", ");
                        sb2.append(b4);
                        sb2.append(", ");
                        sb2.append(n);
                        sb2.append(", ");
                        sb2.append(c);
                        sb2.append(", ");
                        sb2.append(z2);
                        sb2.append(", ");
                        sb2.append(a5);
                        bao.c("DefaultAudioSink", sb2.toString());
                        d.c();
                    }
                    else if (d.b == 4) {
                        d.d();
                    }
                }
            }
            bhm bhm = (bhm)o;
        Label_0995_Outer:
            while (true) {
                if (!((bhm)o).o) {
                    break Label_1006;
                }
                final Method l = ((bhm)o).l;
                bhm = (bhm)o;
                if (l == null) {
                    break Label_1006;
                }
                bhm = (bhm)o;
                if (n - ((bhm)o).p < 500000L) {
                    break Label_1006;
                }
                AudioTrack b5 = null;
                Method method;
                AudioTrack audioTrack;
                int n3;
                Object[] array;
                Object o2;
                Integer n4;
                int n5;
                Integer n6;
                int n7;
                long n8;
                long n9;
                long n10;
                bhm bhm2;
                long n11;
                long n12;
                bhm bhm3;
                long n13;
                long n14;
                long n15;
                long n16;
                bhm bhm4;
                long n17;
                long n18;
                long n19;
                long n20;
                bhm bhm5;
                qpt qpt;
                StringBuilder sb3;
                StringBuilder sb5;
                StringBuilder sb4;
                StringBuilder sb6;
                String s;
                StringBuilder sb7;
                long n21;
                String s2;
                StringBuilder sb8;
                String s3;
                bhm bhm6;
                long n22;
                boolean b6;
                long a6;
                bhl d2;
                long max;
                long c2;
                long n23;
                long z3;
                long u3;
                long currentTimeMillis;
                long a7;
                bhg e3;
                long n24;
                long n25;
                bii h;
                int n26;
                int b7;
                int b8;
                long n27;
                double n28;
                double n29;
                Label_1008_Outer:Label_0990_Outer:
                while (true) {
                    try {
                        b5 = ((bhm)o).b;
                        dk.d((Object)b5);
                        method = l;
                        audioTrack = b5;
                        n3 = 0;
                        array = new Object[n3];
                        o2 = method.invoke(audioTrack, array);
                        n4 = (Integer)o2;
                        n5 = baw.a;
                        n6 = n4;
                        n7 = n6;
                        n8 = n7;
                        n9 = 1000L;
                        n10 = n8 * n9;
                        bhm2 = (bhm)o;
                        n11 = bhm2.g;
                        n12 = n10 - n11;
                        bhm3 = (bhm)o;
                        n13 = n12;
                        bhm3.m = n13;
                        n14 = n12;
                        n15 = 0L;
                        n16 = Math.max(n14, n15);
                        bhm4 = (bhm)o;
                        n17 = n16;
                        bhm4.m = n17;
                        n18 = n16;
                        n19 = 5000000L;
                        n20 = lcmp(n18, n19);
                        if (n20 > 0) {
                            bhm5 = (bhm)o;
                            qpt = bhm5.E;
                            sb3 = new(java.lang.StringBuilder.class)();
                            sb4 = (sb5 = sb3);
                            new StringBuilder();
                            sb6 = sb4;
                            s = "Ignoring impossibly large audio latency: ";
                            sb6.append(s);
                            sb7 = sb4;
                            n21 = n16;
                            sb7.append(n21);
                            s2 = "DefaultAudioSink";
                            sb8 = sb4;
                            s3 = sb8.toString();
                            bao.c(s2, s3);
                            bhm6 = (bhm)o;
                            n22 = 0L;
                            bhm6.m = n22;
                            break Label_0995;
                        }
                        break Label_0995;
                    }
                    catch (final Exception ex) {}
                    while (true) {
                        try {
                            method = l;
                            audioTrack = b5;
                            n3 = 0;
                            array = new Object[n3];
                            o2 = method.invoke(audioTrack, array);
                            n4 = (Integer)o2;
                            n5 = baw.a;
                            n6 = n4;
                            n7 = n6;
                            n8 = n7;
                            n9 = 1000L;
                            n10 = n8 * n9;
                            bhm2 = (bhm)o;
                            n11 = bhm2.g;
                            n12 = n10 - n11;
                            bhm3 = (bhm)o;
                            n13 = n12;
                            bhm3.m = n13;
                            n14 = n12;
                            n15 = 0L;
                            n16 = Math.max(n14, n15);
                            bhm4 = (bhm)o;
                            n17 = n16;
                            bhm4.m = n17;
                            n18 = n16;
                            n19 = 5000000L;
                            n20 = lcmp(n18, n19);
                            if (n20 > 0) {
                                bhm5 = (bhm)o;
                                qpt = bhm5.E;
                                sb3 = new(java.lang.StringBuilder.class)();
                                sb4 = (sb5 = sb3);
                                new StringBuilder();
                                sb6 = sb4;
                                s = "Ignoring impossibly large audio latency: ";
                                sb6.append(s);
                                sb7 = sb4;
                                n21 = n16;
                                sb7.append(n21);
                                s2 = "DefaultAudioSink";
                                sb8 = sb4;
                                s3 = sb8.toString();
                                bao.c(s2, s3);
                                bhm6 = (bhm)o;
                                n22 = 0L;
                                bhm6.m = n22;
                            }
                            ((bhm)o).p = n;
                            while (true) {
                                b6 = false;
                                a6 = System.nanoTime() / 1000L;
                                d2 = ((bhm)o).d;
                                dk.d((Object)d2);
                                if (d2.b == 2) {
                                    b6 = true;
                                }
                                if (b6) {
                                    max = ((bhm)o).a(d2.a()) + baw.s(a6 - d2.b(), ((bhm)o).h);
                                }
                                else {
                                    if (((bhm)o).u == 0) {
                                        c2 = ((bhm)o).c();
                                    }
                                    else {
                                        c2 = ((bhm)o).j + a6;
                                    }
                                    n = (max = c2);
                                    if (!b) {
                                        max = Math.max(0L, n - ((bhm)o).m);
                                    }
                                }
                                if (((bhm)o).B != b6) {
                                    ((bhm)o).D = ((bhm)o).A;
                                    ((bhm)o).C = ((bhm)o).z;
                                }
                                n23 = a6 - ((bhm)o).D;
                                n = max;
                                if (n23 < 1000000L) {
                                    n = n23 * 1000L / 1000000L;
                                    n = (max * n + (1000L - n) * (((bhm)o).C + baw.s(n23, ((bhm)o).h))) / 1000L;
                                }
                                if (!((bhm)o).i) {
                                    z3 = ((bhm)o).z;
                                    if (n > z3) {
                                        ((bhm)o).i = true;
                                        u3 = baw.u(baw.A(n - z3), ((bhm)o).h);
                                        currentTimeMillis = System.currentTimeMillis();
                                        a7 = baw.A(u3);
                                        e3 = ((bhz)((bhm)o).E.a).e;
                                        if (e3 != null) {
                                            e3.d(currentTimeMillis - a7);
                                        }
                                    }
                                }
                                ((bhm)o).A = a6;
                                ((bhm)o).z = n;
                                ((bhm)o).B = b6;
                                n = Math.min(n, this.s.a(this.A()));
                                while (!this.o.isEmpty() && n >= this.o.getFirst().d) {
                                    this.v = this.o.remove();
                                }
                                o = this.v;
                                n24 = n - ((bhx)o).d;
                                if (((bhx)o).a.equals((Object)azb.a)) {
                                    n25 = this.v.c + n24;
                                }
                                else if (this.o.isEmpty()) {
                                    o = this.W.d;
                                    if (((bij)o).j >= 1024L) {
                                        n = ((bij)o).i;
                                        h = ((bij)o).h;
                                        dk.d((Object)h);
                                        n26 = h.g * h.a;
                                        n -= n26 + n26;
                                        b7 = ((bij)o).f.b;
                                        b8 = ((bij)o).e.b;
                                        if (b7 == b8) {
                                            n27 = baw.y(n24, n, ((bij)o).j);
                                        }
                                        else {
                                            n27 = baw.y(n24, n * b7, ((bij)o).j * b8);
                                        }
                                    }
                                    else {
                                        n28 = ((bij)o).c;
                                        n29 = (double)n24;
                                        Double.isNaN(n28);
                                        Double.isNaN(n29);
                                        n27 = (long)(n28 * n29);
                                    }
                                    n25 = n27 + this.v.c;
                                }
                                else {
                                    o = this.o.getFirst();
                                    n25 = ((bhx)o).c - baw.s(((bhx)o).d - n, this.v.a.b);
                                }
                                return n25 + this.s.a(((bih)this.W.c).f);
                                ((bhm)o).l = null;
                                continue Label_1008_Outer;
                                o = bhm;
                                continue Label_0990_Outer;
                            }
                            bhm = (bhm)o;
                            continue Label_0995_Outer;
                        }
                        catch (final Exception ex2) {
                            continue;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public final azb c() {
        return this.C();
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e() {
        if (this.O()) {
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.R = false;
            this.A = 0;
            this.v = new bhx(this.C(), this.D(), 0L, 0L);
            this.D = 0L;
            this.u = null;
            this.o.clear();
            this.H = null;
            this.I = 0;
            this.J = null;
            this.M = false;
            this.L = false;
            this.K = -1;
            this.k.g = 0L;
            this.H();
            final AudioTrack b = this.n.b;
            dk.d((Object)b);
            if (b.getPlayState() == 3) {
                this.f.pause();
            }
            if (P(this.f)) {
                final dfl t = this.T;
                dk.d((Object)t);
                this.f.unregisterStreamEventCallback((AudioTrack$StreamEventCallback)t.a);
                ((Handler)t.b).removeCallbacksAndMessages((Object)null);
            }
            final int a = baw.a;
            final bhw r = this.r;
            if (r != null) {
                this.s = r;
                this.r = null;
            }
            final bhm n = this.n;
            n.d();
            n.b = null;
            n.d = null;
            final AudioTrack f = this.f;
            final gpd s = this.S;
            s.f();
            synchronized (bhz.a) {
                if (bhz.b == null) {
                    bhz.b = baw.W("ExoPlayer:AudioTrackReleaseThread");
                }
                ++bhz.c;
                bhz.b.execute(new bhc(f, s, 6, null));
                monitorexit(bhz.a);
                this.f = null;
            }
        }
        this.V.d();
        this.U.d();
    }
    
    @Override
    public final void f() {
        this.B = true;
    }
    
    @Override
    public final void g() {
        this.g = false;
        if (this.O()) {
            final bhm n = this.n;
            n.d();
            if (n.v == -9223372036854775807L) {
                final bhl d = n.d;
                dk.d((Object)d);
                d.d();
                this.f.pause();
            }
        }
    }
    
    @Override
    public final void h() {
        this.g = true;
        if (this.O()) {
            final bhl d = this.n.d;
            dk.d((Object)d);
            d.d();
            this.f.play();
        }
    }
    
    @Override
    public final void i() {
        if (!this.L && this.O() && this.N()) {
            this.I();
            this.L = true;
        }
    }
    
    @Override
    public final void j() {
        this.e();
        final azu[] l = this.l;
        for (int length = l.length, i = 0; i < length; ++i) {
            l[i].f();
        }
        final azu[] m = this.m;
        final int length2 = m.length;
        for (int j = 0; j <= 0; ++j) {
            m[j].f();
        }
        this.g = false;
        this.Q = false;
    }
    
    @Override
    public final void k(final axt t) {
        if (this.t.equals((Object)t)) {
            return;
        }
        this.t = t;
        this.e();
    }
    
    @Override
    public final void l(final int n) {
        if (this.N != n) {
            this.N = n;
            this.e();
        }
    }
    
    @Override
    public final void m(final axu o) {
        if (this.O.equals((Object)o)) {
            return;
        }
        final int a = o.a;
        final float b = o.b;
        if (this.f != null) {
            final int a2 = this.O.a;
        }
        this.O = o;
    }
    
    @Override
    public final void n(final bhg e) {
        this.e = e;
    }
    
    @Override
    public final void o(final azb azb) {
        this.K(new azb(baw.a(azb.b, 0.1f, 8.0f), baw.a(azb.c, 0.1f, 8.0f)), this.D());
    }
    
    @Override
    public final void p(final bgz d) {
        this.d = d;
    }
    
    @Override
    public final void q(final AudioDeviceInfo audioDeviceInfo) {
        bhu p;
        if (audioDeviceInfo == null) {
            p = null;
        }
        else {
            p = new bhu(audioDeviceInfo);
        }
        this.P = p;
        final AudioTrack f = this.f;
        if (f != null) {
            bhs.a(f, p);
        }
    }
    
    @Override
    public final void r(final boolean b) {
        this.K(this.C(), b);
    }
    
    @Override
    public final void s(final float e) {
        if (this.E != e) {
            this.E = e;
            this.L();
        }
    }
    
    @Override
    public final boolean t(final ByteBuffer p0, final long p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        bhz.H:Ljava/nio/ByteBuffer;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          26
        //    11: aload_1        
        //    12: aload           5
        //    14: if_acmpne       20
        //    17: goto            26
        //    20: iconst_0       
        //    21: istore          6
        //    23: goto            29
        //    26: iconst_1       
        //    27: istore          6
        //    29: iload           6
        //    31: invokestatic    dk.f:(Z)V
        //    34: aload_0        
        //    35: getfield        bhz.r:Lbhw;
        //    38: ifnull          234
        //    41: aload_0        
        //    42: invokespecial   bhz.N:()Z
        //    45: ifne            50
        //    48: iconst_0       
        //    49: ireturn        
        //    50: aload_0        
        //    51: getfield        bhz.r:Lbhw;
        //    54: astore          5
        //    56: aload_0        
        //    57: getfield        bhz.s:Lbhw;
        //    60: astore          7
        //    62: aload           7
        //    64: getfield        bhw.c:I
        //    67: aload           5
        //    69: getfield        bhw.c:I
        //    72: if_icmpne       212
        //    75: aload           7
        //    77: getfield        bhw.g:I
        //    80: aload           5
        //    82: getfield        bhw.g:I
        //    85: if_icmpne       212
        //    88: aload           7
        //    90: getfield        bhw.e:I
        //    93: aload           5
        //    95: getfield        bhw.e:I
        //    98: if_icmpne       212
        //   101: aload           7
        //   103: getfield        bhw.f:I
        //   106: aload           5
        //   108: getfield        bhw.f:I
        //   111: if_icmpne       212
        //   114: aload           7
        //   116: getfield        bhw.d:I
        //   119: aload           5
        //   121: getfield        bhw.d:I
        //   124: if_icmpne       212
        //   127: aload_0        
        //   128: aload           5
        //   130: putfield        bhz.s:Lbhw;
        //   133: aload_0        
        //   134: aconst_null    
        //   135: putfield        bhz.r:Lbhw;
        //   138: aload_0        
        //   139: getfield        bhz.f:Landroid/media/AudioTrack;
        //   142: invokestatic    bhz.P:(Landroid/media/AudioTrack;)Z
        //   145: ifeq            229
        //   148: aload_0        
        //   149: getfield        bhz.p:I
        //   152: iconst_3       
        //   153: if_icmpeq       229
        //   156: aload_0        
        //   157: getfield        bhz.f:Landroid/media/AudioTrack;
        //   160: invokevirtual   android/media/AudioTrack.getPlayState:()I
        //   163: iconst_3       
        //   164: if_icmpne       174
        //   167: aload_0        
        //   168: getfield        bhz.f:Landroid/media/AudioTrack;
        //   171: invokevirtual   android/media/AudioTrack.setOffloadEndOfStream:()V
        //   174: aload_0        
        //   175: getfield        bhz.f:Landroid/media/AudioTrack;
        //   178: astore          7
        //   180: aload_0        
        //   181: getfield        bhz.s:Lbhw;
        //   184: getfield        bhw.a:Layf;
        //   187: astore          5
        //   189: aload           7
        //   191: aload           5
        //   193: getfield        ayf.D:I
        //   196: aload           5
        //   198: getfield        ayf.E:I
        //   201: invokevirtual   android/media/AudioTrack.setOffloadDelayPadding:(II)V
        //   204: aload_0        
        //   205: iconst_1       
        //   206: putfield        bhz.R:Z
        //   209: goto            229
        //   212: aload_0        
        //   213: invokespecial   bhz.I:()V
        //   216: aload_0        
        //   217: invokevirtual   bhz.u:()Z
        //   220: ifeq            225
        //   223: iconst_0       
        //   224: ireturn        
        //   225: aload_0        
        //   226: invokevirtual   bhz.e:()V
        //   229: aload_0        
        //   230: lload_2        
        //   231: invokespecial   bhz.G:(J)V
        //   234: aload_0        
        //   235: invokespecial   bhz.O:()Z
        //   238: ifne            844
        //   241: aload_0        
        //   242: getfield        bhz.S:Lgpd;
        //   245: invokevirtual   gpd.d:()Z
        //   248: istore          6
        //   250: iload           6
        //   252: ifne            257
        //   255: iconst_0       
        //   256: ireturn        
        //   257: aload_0        
        //   258: getfield        bhz.s:Lbhw;
        //   261: astore          5
        //   263: aload           5
        //   265: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   268: pop            
        //   269: aload_0        
        //   270: aload           5
        //   272: invokespecial   bhz.E:(Lbhw;)Landroid/media/AudioTrack;
        //   275: astore          5
        //   277: goto            366
        //   280: astore          7
        //   282: aload_0        
        //   283: getfield        bhz.s:Lbhw;
        //   286: astore          5
        //   288: aload           5
        //   290: getfield        bhw.h:I
        //   293: ldc_w           1000000
        //   296: if_icmple       806
        //   299: new             Lbhw;
        //   302: astore          8
        //   304: aload           8
        //   306: aload           5
        //   308: getfield        bhw.a:Layf;
        //   311: aload           5
        //   313: getfield        bhw.b:I
        //   316: aload           5
        //   318: getfield        bhw.c:I
        //   321: aload           5
        //   323: getfield        bhw.d:I
        //   326: aload           5
        //   328: getfield        bhw.e:I
        //   331: aload           5
        //   333: getfield        bhw.f:I
        //   336: aload           5
        //   338: getfield        bhw.g:I
        //   341: ldc_w           1000000
        //   344: aload           5
        //   346: getfield        bhw.i:[Lazu;
        //   349: invokespecial   bhw.<init>:(Layf;IIIIIII[Lazu;)V
        //   352: aload_0        
        //   353: aload           8
        //   355: invokespecial   bhz.E:(Lbhw;)Landroid/media/AudioTrack;
        //   358: astore          5
        //   360: aload_0        
        //   361: aload           8
        //   363: putfield        bhz.s:Lbhw;
        //   366: aload_0        
        //   367: aload           5
        //   369: putfield        bhz.f:Landroid/media/AudioTrack;
        //   372: aload           5
        //   374: invokestatic    bhz.P:(Landroid/media/AudioTrack;)Z
        //   377: ifeq            492
        //   380: aload_0        
        //   381: getfield        bhz.f:Landroid/media/AudioTrack;
        //   384: astore          5
        //   386: aload_0        
        //   387: getfield        bhz.T:Ldfl;
        //   390: ifnonnull       410
        //   393: new             Ldfl;
        //   396: astore          7
        //   398: aload           7
        //   400: aload_0        
        //   401: invokespecial   dfl.<init>:(Lbhz;)V
        //   404: aload_0        
        //   405: aload           7
        //   407: putfield        bhz.T:Ldfl;
        //   410: aload_0        
        //   411: getfield        bhz.T:Ldfl;
        //   414: astore          7
        //   416: aload           7
        //   418: getfield        dfl.b:Ljava/lang/Object;
        //   421: astore          8
        //   423: new             Lbqn;
        //   426: astore          9
        //   428: aload           9
        //   430: aload           8
        //   432: checkcast       Landroid/os/Handler;
        //   435: iconst_1       
        //   436: invokespecial   bqn.<init>:(Landroid/os/Handler;I)V
        //   439: aload           5
        //   441: aload           9
        //   443: aload           7
        //   445: getfield        dfl.a:Ljava/lang/Object;
        //   448: checkcast       Landroid/media/AudioTrack$StreamEventCallback;
        //   451: invokevirtual   android/media/AudioTrack.registerStreamEventCallback:(Ljava/util/concurrent/Executor;Landroid/media/AudioTrack$StreamEventCallback;)V
        //   454: aload_0        
        //   455: getfield        bhz.p:I
        //   458: iconst_3       
        //   459: if_icmpeq       492
        //   462: aload_0        
        //   463: getfield        bhz.f:Landroid/media/AudioTrack;
        //   466: astore          7
        //   468: aload_0        
        //   469: getfield        bhz.s:Lbhw;
        //   472: getfield        bhw.a:Layf;
        //   475: astore          5
        //   477: aload           7
        //   479: aload           5
        //   481: getfield        ayf.D:I
        //   484: aload           5
        //   486: getfield        ayf.E:I
        //   489: invokevirtual   android/media/AudioTrack.setOffloadDelayPadding:(II)V
        //   492: getstatic       baw.a:I
        //   495: bipush          31
        //   497: if_icmplt       520
        //   500: aload_0        
        //   501: getfield        bhz.d:Lbgz;
        //   504: astore          5
        //   506: aload           5
        //   508: ifnull          520
        //   511: aload_0        
        //   512: getfield        bhz.f:Landroid/media/AudioTrack;
        //   515: aload           5
        //   517: invokestatic    bht.a:(Landroid/media/AudioTrack;Lbgz;)V
        //   520: aload_0        
        //   521: aload_0        
        //   522: getfield        bhz.f:Landroid/media/AudioTrack;
        //   525: invokevirtual   android/media/AudioTrack.getAudioSessionId:()I
        //   528: putfield        bhz.N:I
        //   531: aload_0        
        //   532: getfield        bhz.n:Lbhm;
        //   535: astore          5
        //   537: aload_0        
        //   538: getfield        bhz.f:Landroid/media/AudioTrack;
        //   541: astore          7
        //   543: aload_0        
        //   544: getfield        bhz.s:Lbhw;
        //   547: astore          8
        //   549: aload           8
        //   551: getfield        bhw.c:I
        //   554: istore          10
        //   556: aload           8
        //   558: getfield        bhw.g:I
        //   561: istore          11
        //   563: aload           8
        //   565: getfield        bhw.d:I
        //   568: istore          10
        //   570: aload           8
        //   572: getfield        bhw.h:I
        //   575: istore          12
        //   577: aload           5
        //   579: aload           7
        //   581: putfield        bhm.b:Landroid/media/AudioTrack;
        //   584: aload           5
        //   586: iload           12
        //   588: putfield        bhm.c:I
        //   591: new             Lbhl;
        //   594: astore          8
        //   596: aload           8
        //   598: aload           7
        //   600: invokespecial   bhl.<init>:(Landroid/media/AudioTrack;)V
        //   603: aload           5
        //   605: aload           8
        //   607: putfield        bhm.d:Lbhl;
        //   610: aload           5
        //   612: aload           7
        //   614: invokevirtual   android/media/AudioTrack.getSampleRate:()I
        //   617: putfield        bhm.e:I
        //   620: aload           5
        //   622: iconst_0       
        //   623: putfield        bhm.f:Z
        //   626: iload           11
        //   628: invokestatic    baw.ae:(I)Z
        //   631: istore          6
        //   633: aload           5
        //   635: iload           6
        //   637: putfield        bhm.o:Z
        //   640: iload           6
        //   642: ifeq            661
        //   645: aload           5
        //   647: iload           12
        //   649: iload           10
        //   651: idiv           
        //   652: i2l            
        //   653: invokevirtual   bhm.a:(J)J
        //   656: lstore          13
        //   658: goto            666
        //   661: ldc2_w          -9223372036854775807
        //   664: lstore          13
        //   666: aload           5
        //   668: lload           13
        //   670: putfield        bhm.g:J
        //   673: aload           5
        //   675: lconst_0       
        //   676: putfield        bhm.q:J
        //   679: aload           5
        //   681: lconst_0       
        //   682: putfield        bhm.r:J
        //   685: aload           5
        //   687: lconst_0       
        //   688: putfield        bhm.s:J
        //   691: aload           5
        //   693: iconst_0       
        //   694: putfield        bhm.n:Z
        //   697: aload           5
        //   699: ldc2_w          -9223372036854775807
        //   702: putfield        bhm.v:J
        //   705: aload           5
        //   707: ldc2_w          -9223372036854775807
        //   710: putfield        bhm.w:J
        //   713: aload           5
        //   715: lconst_0       
        //   716: putfield        bhm.p:J
        //   719: aload           5
        //   721: lconst_0       
        //   722: putfield        bhm.m:J
        //   725: aload           5
        //   727: fconst_1       
        //   728: putfield        bhm.h:F
        //   731: aload_0        
        //   732: invokespecial   bhz.L:()V
        //   735: aload_0        
        //   736: getfield        bhz.O:Laxu;
        //   739: getfield        axu.a:I
        //   742: istore          10
        //   744: aload_0        
        //   745: getfield        bhz.P:Lbhu;
        //   748: astore          5
        //   750: aload           5
        //   752: ifnull          764
        //   755: aload_0        
        //   756: getfield        bhz.f:Landroid/media/AudioTrack;
        //   759: aload           5
        //   761: invokestatic    bhs.a:(Landroid/media/AudioTrack;Lbhu;)V
        //   764: aload_0        
        //   765: iconst_1       
        //   766: putfield        bhz.C:Z
        //   769: goto            844
        //   772: astore_1       
        //   773: ldc_w           Ljava/lang/Throwable;.class
        //   776: ldc_w           "addSuppressed"
        //   779: iconst_1       
        //   780: anewarray       Ljava/lang/Class;
        //   783: dup            
        //   784: iconst_0       
        //   785: ldc_w           Ljava/lang/Throwable;.class
        //   788: aastore        
        //   789: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   792: aload           7
        //   794: iconst_1       
        //   795: anewarray       Ljava/lang/Object;
        //   798: dup            
        //   799: iconst_0       
        //   800: aload_1        
        //   801: aastore        
        //   802: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   805: pop            
        //   806: aload_0        
        //   807: getfield        bhz.s:Lbhw;
        //   810: invokevirtual   bhw.c:()Z
        //   813: ifeq            821
        //   816: aload_0        
        //   817: iconst_1       
        //   818: putfield        bhz.Q:Z
        //   821: aload           7
        //   823: athrow         
        //   824: astore_1       
        //   825: aload_1        
        //   826: getfield        bhf.b:Z
        //   829: ifne            842
        //   832: aload_0        
        //   833: getfield        bhz.U:Largq;
        //   836: aload_1        
        //   837: invokevirtual   argq.e:(Ljava/lang/Exception;)V
        //   840: iconst_0       
        //   841: ireturn        
        //   842: aload_1        
        //   843: athrow         
        //   844: aload_0        
        //   845: getfield        bhz.U:Largq;
        //   848: invokevirtual   argq.d:()V
        //   851: aload_0        
        //   852: getfield        bhz.C:Z
        //   855: ifeq            893
        //   858: aload_0        
        //   859: lconst_0       
        //   860: lload_2        
        //   861: invokestatic    java/lang/Math.max:(JJ)J
        //   864: putfield        bhz.D:J
        //   867: aload_0        
        //   868: iconst_0       
        //   869: putfield        bhz.B:Z
        //   872: aload_0        
        //   873: iconst_0       
        //   874: putfield        bhz.C:Z
        //   877: aload_0        
        //   878: lload_2        
        //   879: invokespecial   bhz.G:(J)V
        //   882: aload_0        
        //   883: getfield        bhz.g:Z
        //   886: ifeq            893
        //   889: aload_0        
        //   890: invokevirtual   bhz.h:()V
        //   893: aload_0        
        //   894: getfield        bhz.n:Lbhm;
        //   897: astore          5
        //   899: aload_0        
        //   900: invokevirtual   bhz.A:()J
        //   903: lstore          13
        //   905: aload           5
        //   907: getfield        bhm.b:Landroid/media/AudioTrack;
        //   910: astore          7
        //   912: aload           7
        //   914: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   917: pop            
        //   918: aload           7
        //   920: invokevirtual   android/media/AudioTrack.getPlayState:()I
        //   923: istore          10
        //   925: aload           5
        //   927: getfield        bhm.f:Z
        //   930: istore          6
        //   932: aload           5
        //   934: getfield        bhm.n:Z
        //   937: istore          6
        //   939: aload           5
        //   941: lload           13
        //   943: invokevirtual   bhm.e:(J)Z
        //   946: istore          15
        //   948: aload           5
        //   950: iload           15
        //   952: putfield        bhm.n:Z
        //   955: iload           6
        //   957: ifeq            1050
        //   960: iload           15
        //   962: ifne            1050
        //   965: iload           10
        //   967: iconst_1       
        //   968: if_icmpeq       1050
        //   971: aload           5
        //   973: getfield        bhm.E:Lqpt;
        //   976: astore          7
        //   978: aload           5
        //   980: getfield        bhm.c:I
        //   983: istore          10
        //   985: aload           5
        //   987: getfield        bhm.g:J
        //   990: invokestatic    baw.A:(J)J
        //   993: lstore          16
        //   995: aload           7
        //   997: getfield        qpt.a:Ljava/lang/Object;
        //  1000: checkcast       Lbhz;
        //  1003: getfield        bhz.e:Lbhg;
        //  1006: ifnull          1050
        //  1009: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  1012: lstore          13
        //  1014: aload           7
        //  1016: getfield        qpt.a:Ljava/lang/Object;
        //  1019: checkcast       Lbhz;
        //  1022: astore          5
        //  1024: aload           5
        //  1026: getfield        bhz.h:J
        //  1029: lstore          18
        //  1031: aload           5
        //  1033: getfield        bhz.e:Lbhg;
        //  1036: iload           10
        //  1038: lload           16
        //  1040: lload           13
        //  1042: lload           18
        //  1044: lsub           
        //  1045: invokeinterface bhg.g:(IJJ)V
        //  1050: aload_0        
        //  1051: getfield        bhz.H:Ljava/nio/ByteBuffer;
        //  1054: ifnonnull       2006
        //  1057: aload_1        
        //  1058: invokevirtual   java/nio/ByteBuffer.order:()Ljava/nio/ByteOrder;
        //  1061: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //  1064: if_acmpne       1073
        //  1067: iconst_1       
        //  1068: istore          6
        //  1070: goto            1076
        //  1073: iconst_0       
        //  1074: istore          6
        //  1076: iload           6
        //  1078: invokestatic    dk.f:(Z)V
        //  1081: aload_1        
        //  1082: invokevirtual   java/nio/ByteBuffer.hasRemaining:()Z
        //  1085: ifne            1090
        //  1088: iconst_1       
        //  1089: ireturn        
        //  1090: aload_0        
        //  1091: getfield        bhz.s:Lbhw;
        //  1094: astore          5
        //  1096: aload           5
        //  1098: getfield        bhw.c:I
        //  1101: ifeq            1768
        //  1104: aload_0        
        //  1105: getfield        bhz.A:I
        //  1108: ifne            1768
        //  1111: aload           5
        //  1113: getfield        bhw.g:I
        //  1116: istore          10
        //  1118: iload           10
        //  1120: tableswitch {
        //               10: 1662
        //               11: 1662
        //               12: 1480
        //               13: 1480
        //               14: 1450
        //               15: 1442
        //               16: 1434
        //               17: 1434
        //               18: 1192
        //               19: 1282
        //               20: 1274
        //               21: 1442
        //               22: 1222
        //               23: 1662
        //          default: 1192
        //        }
        //  1192: new             Ljava/lang/StringBuilder;
        //  1195: dup            
        //  1196: ldc_w           "Unexpected audio encoding: "
        //  1199: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1202: astore_1       
        //  1203: aload_1        
        //  1204: iload           10
        //  1206: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1209: pop            
        //  1210: new             Ljava/lang/IllegalStateException;
        //  1213: dup            
        //  1214: aload_1        
        //  1215: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1218: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1221: athrow         
        //  1222: getstatic       bss.a:I
        //  1225: istore          10
        //  1227: bipush          16
        //  1229: newarray        B
        //  1231: astore          5
        //  1233: aload_1        
        //  1234: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1237: istore          10
        //  1239: aload_1        
        //  1240: aload           5
        //  1242: invokevirtual   java/nio/ByteBuffer.get:([B)Ljava/nio/ByteBuffer;
        //  1245: pop            
        //  1246: aload_1        
        //  1247: iload           10
        //  1249: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //  1252: pop            
        //  1253: new             Lathu;
        //  1256: dup            
        //  1257: aload           5
        //  1259: aconst_null    
        //  1260: invokespecial   athu.<init>:([B[B)V
        //  1263: invokestatic    bss.c:(Lathu;)Laerl;
        //  1266: getfield        aerl.b:I
        //  1269: istore          10
        //  1271: goto            1752
        //  1274: sipush          512
        //  1277: istore          10
        //  1279: goto            1752
        //  1282: getstatic       bsr.a:[I
        //  1285: astore          5
        //  1287: aload_1        
        //  1288: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1291: istore          11
        //  1293: aload_1        
        //  1294: invokevirtual   java/nio/ByteBuffer.limit:()I
        //  1297: istore          12
        //  1299: iload           11
        //  1301: istore          10
        //  1303: iload           10
        //  1305: iload           12
        //  1307: bipush          10
        //  1309: isub           
        //  1310: if_icmpgt       1346
        //  1313: aload_1        
        //  1314: iload           10
        //  1316: iconst_4       
        //  1317: iadd           
        //  1318: invokestatic    baw.h:(Ljava/nio/ByteBuffer;I)I
        //  1321: bipush          -2
        //  1323: iand           
        //  1324: ldc_w           -126718022
        //  1327: if_icmpne       1340
        //  1330: iload           10
        //  1332: iload           11
        //  1334: isub           
        //  1335: istore          10
        //  1337: goto            1349
        //  1340: iinc            10, 1
        //  1343: goto            1303
        //  1346: iconst_m1      
        //  1347: istore          10
        //  1349: iload           10
        //  1351: iconst_m1      
        //  1352: if_icmpne       1361
        //  1355: iconst_0       
        //  1356: istore          10
        //  1358: goto            1752
        //  1361: aload_1        
        //  1362: aload_1        
        //  1363: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1366: iload           10
        //  1368: iadd           
        //  1369: bipush          7
        //  1371: iadd           
        //  1372: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1375: istore          11
        //  1377: aload_1        
        //  1378: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1381: istore          12
        //  1383: iload           11
        //  1385: sipush          255
        //  1388: iand           
        //  1389: sipush          187
        //  1392: if_icmpne       1402
        //  1395: bipush          9
        //  1397: istore          11
        //  1399: goto            1406
        //  1402: bipush          8
        //  1404: istore          11
        //  1406: bipush          40
        //  1408: aload_1        
        //  1409: iload           12
        //  1411: iload           10
        //  1413: iadd           
        //  1414: iload           11
        //  1416: iadd           
        //  1417: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1420: iconst_4       
        //  1421: ishr           
        //  1422: bipush          7
        //  1424: iand           
        //  1425: ishl           
        //  1426: bipush          16
        //  1428: imul           
        //  1429: istore          10
        //  1431: goto            1752
        //  1434: sipush          2048
        //  1437: istore          10
        //  1439: goto            1752
        //  1442: sipush          1024
        //  1445: istore          10
        //  1447: goto            1752
        //  1450: aload_1        
        //  1451: aload_1        
        //  1452: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1455: invokestatic    baw.h:(Ljava/nio/ByteBuffer;I)I
        //  1458: invokestatic    btu.c:(I)I
        //  1461: istore          10
        //  1463: iload           10
        //  1465: iconst_m1      
        //  1466: if_icmpeq       1472
        //  1469: goto            1752
        //  1472: new             Ljava/lang/IllegalArgumentException;
        //  1475: dup            
        //  1476: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //  1479: athrow         
        //  1480: getstatic       btg.a:[I
        //  1483: astore          5
        //  1485: aload_1        
        //  1486: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1489: istore          11
        //  1491: aload_1        
        //  1492: iload           11
        //  1494: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1497: istore          10
        //  1499: iload           10
        //  1501: bipush          -2
        //  1503: if_icmpeq       1612
        //  1506: iload           10
        //  1508: iconst_m1      
        //  1509: if_icmpeq       1576
        //  1512: iload           10
        //  1514: bipush          31
        //  1516: if_icmpeq       1547
        //  1519: aload_1        
        //  1520: iload           11
        //  1522: iconst_4       
        //  1523: iadd           
        //  1524: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1527: iconst_1       
        //  1528: iand           
        //  1529: bipush          6
        //  1531: ishl           
        //  1532: istore          10
        //  1534: aload_1        
        //  1535: iload           11
        //  1537: iconst_5       
        //  1538: iadd           
        //  1539: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1542: istore          11
        //  1544: goto            1637
        //  1547: aload_1        
        //  1548: iload           11
        //  1550: iconst_5       
        //  1551: iadd           
        //  1552: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1555: bipush          7
        //  1557: iand           
        //  1558: iconst_4       
        //  1559: ishl           
        //  1560: istore          10
        //  1562: aload_1        
        //  1563: iload           11
        //  1565: bipush          6
        //  1567: iadd           
        //  1568: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1571: istore          11
        //  1573: goto            1602
        //  1576: aload_1        
        //  1577: iload           11
        //  1579: iconst_4       
        //  1580: iadd           
        //  1581: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1584: bipush          7
        //  1586: iand           
        //  1587: iconst_4       
        //  1588: ishl           
        //  1589: istore          10
        //  1591: aload_1        
        //  1592: iload           11
        //  1594: bipush          7
        //  1596: iadd           
        //  1597: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1600: istore          11
        //  1602: iload           11
        //  1604: bipush          60
        //  1606: iand           
        //  1607: istore          11
        //  1609: goto            1645
        //  1612: aload_1        
        //  1613: iload           11
        //  1615: iconst_5       
        //  1616: iadd           
        //  1617: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1620: iconst_1       
        //  1621: iand           
        //  1622: bipush          6
        //  1624: ishl           
        //  1625: istore          10
        //  1627: aload_1        
        //  1628: iload           11
        //  1630: iconst_4       
        //  1631: iadd           
        //  1632: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1635: istore          11
        //  1637: iload           11
        //  1639: sipush          252
        //  1642: iand           
        //  1643: istore          11
        //  1645: iload           11
        //  1647: iconst_2       
        //  1648: ishr           
        //  1649: iload           10
        //  1651: ior            
        //  1652: iconst_1       
        //  1653: iadd           
        //  1654: bipush          32
        //  1656: imul           
        //  1657: istore          10
        //  1659: goto            1752
        //  1662: getstatic       bsr.a:[I
        //  1665: astore          5
        //  1667: aload_1        
        //  1668: aload_1        
        //  1669: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1672: iconst_5       
        //  1673: iadd           
        //  1674: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1677: sipush          248
        //  1680: iand           
        //  1681: iconst_3       
        //  1682: ishr           
        //  1683: bipush          10
        //  1685: if_icmple       1747
        //  1688: aload_1        
        //  1689: aload_1        
        //  1690: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1693: iconst_4       
        //  1694: iadd           
        //  1695: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1698: sipush          192
        //  1701: iand           
        //  1702: bipush          6
        //  1704: ishr           
        //  1705: iconst_3       
        //  1706: if_icmpne       1715
        //  1709: iconst_3       
        //  1710: istore          10
        //  1712: goto            1732
        //  1715: aload_1        
        //  1716: aload_1        
        //  1717: invokevirtual   java/nio/ByteBuffer.position:()I
        //  1720: iconst_4       
        //  1721: iadd           
        //  1722: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //  1725: bipush          48
        //  1727: iand           
        //  1728: iconst_4       
        //  1729: ishr           
        //  1730: istore          10
        //  1732: getstatic       bsr.a:[I
        //  1735: iload           10
        //  1737: iaload         
        //  1738: sipush          256
        //  1741: imul           
        //  1742: istore          10
        //  1744: goto            1752
        //  1747: sipush          1536
        //  1750: istore          10
        //  1752: aload_0        
        //  1753: iload           10
        //  1755: putfield        bhz.A:I
        //  1758: iload           10
        //  1760: ifeq            1766
        //  1763: goto            1768
        //  1766: iconst_1       
        //  1767: ireturn        
        //  1768: aload_0        
        //  1769: getfield        bhz.u:Lbhx;
        //  1772: ifnull          1794
        //  1775: aload_0        
        //  1776: invokespecial   bhz.N:()Z
        //  1779: ifne            1784
        //  1782: iconst_0       
        //  1783: ireturn        
        //  1784: aload_0        
        //  1785: lload_2        
        //  1786: invokespecial   bhz.G:(J)V
        //  1789: aload_0        
        //  1790: aconst_null    
        //  1791: putfield        bhz.u:Lbhx;
        //  1794: aload_0        
        //  1795: getfield        bhz.D:J
        //  1798: lstore          13
        //  1800: aload_0        
        //  1801: getfield        bhz.s:Lbhw;
        //  1804: astore          5
        //  1806: lload           13
        //  1808: aload_0        
        //  1809: invokevirtual   bhz.z:()J
        //  1812: aload_0        
        //  1813: getfield        bhz.k:Lbik;
        //  1816: getfield        bik.g:J
        //  1819: lsub           
        //  1820: ldc2_w          1000000
        //  1823: lmul           
        //  1824: aload           5
        //  1826: getfield        bhw.a:Layf;
        //  1829: getfield        ayf.B:I
        //  1832: i2l            
        //  1833: ldiv           
        //  1834: ladd           
        //  1835: lstore          13
        //  1837: aload_0        
        //  1838: getfield        bhz.B:Z
        //  1841: ifne            1882
        //  1844: lload           13
        //  1846: lload_2        
        //  1847: lsub           
        //  1848: invokestatic    java/lang/Math.abs:(J)J
        //  1851: ldc2_w          200000
        //  1854: lcmp           
        //  1855: ifle            1882
        //  1858: aload_0        
        //  1859: getfield        bhz.e:Lbhg;
        //  1862: new             Lbhh;
        //  1865: dup            
        //  1866: lload_2        
        //  1867: lload           13
        //  1869: invokespecial   bhh.<init>:(JJ)V
        //  1872: invokeinterface bhg.a:(Ljava/lang/Exception;)V
        //  1877: aload_0        
        //  1878: iconst_1       
        //  1879: putfield        bhz.B:Z
        //  1882: aload_0        
        //  1883: getfield        bhz.B:Z
        //  1886: ifeq            1950
        //  1889: aload_0        
        //  1890: invokespecial   bhz.N:()Z
        //  1893: ifne            1898
        //  1896: iconst_0       
        //  1897: ireturn        
        //  1898: lload_2        
        //  1899: lload           13
        //  1901: lsub           
        //  1902: lstore          13
        //  1904: aload_0        
        //  1905: aload_0        
        //  1906: getfield        bhz.D:J
        //  1909: lload           13
        //  1911: ladd           
        //  1912: putfield        bhz.D:J
        //  1915: aload_0        
        //  1916: iconst_0       
        //  1917: putfield        bhz.B:Z
        //  1920: aload_0        
        //  1921: lload_2        
        //  1922: invokespecial   bhz.G:(J)V
        //  1925: aload_0        
        //  1926: getfield        bhz.e:Lbhg;
        //  1929: astore          5
        //  1931: aload           5
        //  1933: ifnull          1950
        //  1936: lload           13
        //  1938: lconst_0       
        //  1939: lcmp           
        //  1940: ifeq            1950
        //  1943: aload           5
        //  1945: invokeinterface bhg.e:()V
        //  1950: aload_0        
        //  1951: getfield        bhz.s:Lbhw;
        //  1954: getfield        bhw.c:I
        //  1957: ifne            1977
        //  1960: aload_0        
        //  1961: aload_0        
        //  1962: getfield        bhz.w:J
        //  1965: aload_1        
        //  1966: invokevirtual   java/nio/ByteBuffer.remaining:()I
        //  1969: i2l            
        //  1970: ladd           
        //  1971: putfield        bhz.w:J
        //  1974: goto            1995
        //  1977: aload_0        
        //  1978: aload_0        
        //  1979: getfield        bhz.x:J
        //  1982: aload_0        
        //  1983: getfield        bhz.A:I
        //  1986: i2l            
        //  1987: iload           4
        //  1989: i2l            
        //  1990: lmul           
        //  1991: ladd           
        //  1992: putfield        bhz.x:J
        //  1995: aload_0        
        //  1996: aload_1        
        //  1997: putfield        bhz.H:Ljava/nio/ByteBuffer;
        //  2000: aload_0        
        //  2001: iload           4
        //  2003: putfield        bhz.I:I
        //  2006: aload_0        
        //  2007: lload_2        
        //  2008: invokespecial   bhz.J:(J)V
        //  2011: aload_0        
        //  2012: getfield        bhz.H:Ljava/nio/ByteBuffer;
        //  2015: invokevirtual   java/nio/ByteBuffer.hasRemaining:()Z
        //  2018: ifne            2033
        //  2021: aload_0        
        //  2022: aconst_null    
        //  2023: putfield        bhz.H:Ljava/nio/ByteBuffer;
        //  2026: aload_0        
        //  2027: iconst_0       
        //  2028: putfield        bhz.I:I
        //  2031: iconst_1       
        //  2032: ireturn        
        //  2033: aload_0        
        //  2034: getfield        bhz.n:Lbhm;
        //  2037: astore_1       
        //  2038: aload_0        
        //  2039: invokevirtual   bhz.A:()J
        //  2042: lstore_2       
        //  2043: aload_1        
        //  2044: getfield        bhm.w:J
        //  2047: ldc2_w          -9223372036854775807
        //  2050: lcmp           
        //  2051: ifeq            2090
        //  2054: lload_2        
        //  2055: lconst_0       
        //  2056: lcmp           
        //  2057: ifle            2090
        //  2060: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  2063: aload_1        
        //  2064: getfield        bhm.w:J
        //  2067: lsub           
        //  2068: ldc2_w          200
        //  2071: lcmp           
        //  2072: iflt            2090
        //  2075: ldc_w           "DefaultAudioSink"
        //  2078: ldc_w           "Resetting stalled audio track"
        //  2081: invokestatic    bao.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2084: aload_0        
        //  2085: invokevirtual   bhz.e:()V
        //  2088: iconst_1       
        //  2089: ireturn        
        //  2090: iconst_0       
        //  2091: ireturn        
        //  2092: astore_1       
        //  2093: goto            806
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  241    250    824    844    Lbhf;
        //  257    277    280    824    Lbhf;
        //  282    352    824    844    Lbhf;
        //  352    366    772    806    Lbhf;
        //  366    410    824    844    Lbhf;
        //  410    492    824    844    Lbhf;
        //  492    506    824    844    Lbhf;
        //  511    520    824    844    Lbhf;
        //  520    640    824    844    Lbhf;
        //  645    658    824    844    Lbhf;
        //  666    750    824    844    Lbhf;
        //  755    764    824    844    Lbhf;
        //  764    769    824    844    Lbhf;
        //  773    806    2092   2096   Ljava/lang/Exception;
        //  806    821    824    844    Lbhf;
        //  821    824    824    844    Lbhf;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0806:
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
    
    @Override
    public final boolean u() {
        return this.O() && this.n.e(this.A());
    }
    
    @Override
    public final boolean v() {
        final boolean o = this.O();
        boolean b = true;
        if (o) {
            if (this.L) {
                if (this.u()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final boolean w(final ayf ayf) {
        return this.a(ayf) != 0;
    }
    
    @Override
    public final void y(final ayf ayf) {
        int m;
        int n;
        int n2;
        int g;
        int j;
        azu[] array;
        int n3;
        if ("audio/raw".equals(ayf.n)) {
            dk.f(baw.ae(ayf.C));
            m = baw.m(ayf.C, ayf.A);
            final int c = ayf.C;
            final azu[] l = this.l;
            final bik k = this.k;
            final int d = ayf.D;
            final int e = ayf.E;
            k.e = d;
            k.f = e;
            this.j.e = null;
            azs azs = new azs(ayf.B, ayf.A, ayf.C);
            final int length = l.length;
            int i = 0;
            while (i < length) {
                final azu azu = l[i];
                try {
                    final azs a = azu.a(azs);
                    if (azu.g()) {
                        azs = a;
                    }
                    ++i;
                    continue;
                }
                catch (final azt azt) {
                    throw new bhe((Throwable)azt, ayf);
                }
                break;
            }
            n = azs.d;
            n2 = azs.b;
            final int c2 = azs.c;
            g = baw.g(c2);
            j = baw.m(n, c2);
            array = l;
            n3 = 0;
        }
        else {
            array = new azu[0];
            n2 = ayf.B;
            int n5;
            int n6;
            if (this.R(ayf, this.t)) {
                final String n4 = ayf.n;
                dk.d((Object)n4);
                n = ayy.a(n4, ayf.k);
                n5 = baw.g(ayf.A);
                n6 = 1;
            }
            else {
                final Pair a2 = this.i.a(ayf);
                if (a2 == null) {
                    throw new bhe("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(ayf))), ayf);
                }
                n = (int)a2.first;
                n5 = (int)a2.second;
                n6 = 2;
            }
            final int n7 = -1;
            g = n5;
            final int n8 = -1;
            m = n7;
            j = n8;
            n3 = n6;
        }
        final bhv q = this.q;
        final int minBufferSize = AudioTrack.getMinBufferSize(n2, g, n);
        dk.h(minBufferSize != -2);
        final int n9 = 250000;
        int n15;
        if (n3 != 0) {
            if (n3 != 1) {
                final bia bia = (bia)q;
                final int e2 = bia.e;
                final int n10 = 5;
                int n12;
                int n13;
                if (n == 5) {
                    final int g2 = bia.g;
                    final int n11 = 500000;
                    n12 = 5;
                    n = n10;
                    n13 = n11;
                }
                else {
                    final int n14 = n;
                    n13 = n9;
                    n12 = n;
                    n = n14;
                }
                n15 = aesy.w(n13 * (long)bia.b(n12) / 1000000L);
            }
            else {
                final int b = bia.b(n);
                final int f = ((bia)q).f;
                n15 = aesy.w(b * 50000000L / 1000000L);
            }
        }
        else {
            final bia bia2 = (bia)q;
            final int d2 = bia2.d;
            final int b2 = bia2.b;
            n15 = baw.e(minBufferSize * 4, bia.a(250000, n2, j), bia.a(bia2.c, n2, j));
        }
        final int n16 = (Math.max(minBufferSize, n15) + j - 1) / j;
        if (n == 0) {
            final String value = String.valueOf(ayf);
            final StringBuilder sb = new StringBuilder("Invalid output encoding (mode=");
            sb.append(n3);
            sb.append(") for: ");
            sb.append(value);
            throw new bhe(sb.toString(), ayf);
        }
        if (g == 0) {
            final String value2 = String.valueOf(ayf);
            final StringBuilder sb2 = new StringBuilder("Invalid output channel config (mode=");
            sb2.append(n3);
            sb2.append(") for: ");
            sb2.append(value2);
            throw new bhe(sb2.toString(), ayf);
        }
        this.Q = false;
        final bhw bhw = new bhw(ayf, m, n3, j, n2, g, n, n16 * j, array);
        if (this.O()) {
            this.r = bhw;
            return;
        }
        this.s = bhw;
    }
    
    public final long z() {
        final bhw s = this.s;
        long x;
        if (s.c == 0) {
            x = this.w / s.b;
        }
        else {
            x = this.x;
        }
        return x;
    }
}
