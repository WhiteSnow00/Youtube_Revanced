import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsb
{
    private long A;
    private float B;
    private int C;
    private ByteBuffer D;
    private boolean E;
    public final ConditionVariable a;
    private final long[] b;
    private final lrw c;
    private AudioTrack d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private long m;
    private int n;
    private int o;
    private long p;
    private long q;
    private boolean r;
    private long s;
    private Method t;
    private long u;
    private long v;
    private int w;
    private int x;
    private long y;
    private long z;
    
    public lsb() {
        this(null);
    }
    
    public lsb(final byte[] array) {
        this.a = new ConditionVariable(true);
        final int a = lwj.a;
        while (true) {
            try {
                final Class[] array2 = null;
                this.t = AudioTrack.class.getMethod("getLatency", (Class<?>[])null);
                this.c = (lrw)new lry();
                this.b = new long[10];
                this.g = 3;
                this.B = 1.0f;
                this.x = 0;
            }
            catch (final NoSuchMethodException ex) {
                continue;
            }
            break;
        }
    }
    
    private final long p(final long n) {
        return n * this.e / 1000000L;
    }
    
    private final long q(final long n) {
        return n * 1000000L / this.e;
    }
    
    private final long r() {
        long n;
        if (this.j) {
            n = this.v;
        }
        else {
            n = this.s(this.u);
        }
        return n;
    }
    
    private final long s(final long n) {
        return n / this.k;
    }
    
    private final void t() {
        this.p = 0L;
        this.o = 0;
        this.n = 0;
        this.q = 0L;
        this.r = false;
        this.s = 0L;
    }
    
    private final void u() {
        if (!this.n()) {
            return;
        }
        final int a = lwj.a;
        this.d.setVolume(this.B);
    }
    
    public final int a(ByteBuffer byteBuffer, int i, int c, long r) {
        final int a = lwj.a;
        final int c2 = this.C;
        final int n = 0;
        ByteBuffer d2;
        if (c2 == 0) {
            if (c == 0) {
                return 2;
            }
            final int j = this.i;
            final boolean e = j != this.h;
            this.E = e;
            if (e) {
                jfi.U(j == 2);
                final int h = this.h;
                final ByteBuffer d = this.D;
                int n2;
                if (h != Integer.MIN_VALUE) {
                    if (h != 3) {
                        if (h != 1073741824) {
                            throw new IllegalStateException();
                        }
                        n2 = c / 2;
                    }
                    else {
                        n2 = c + c;
                    }
                }
                else {
                    final int n3 = c / 3;
                    n2 = n3 + n3;
                }
                ByteBuffer allocateDirect = null;
                Label_0174: {
                    if (d != null) {
                        allocateDirect = d;
                        if (d.capacity() >= n2) {
                            break Label_0174;
                        }
                    }
                    allocateDirect = ByteBuffer.allocateDirect(n2);
                }
                allocateDirect.position(0);
                allocateDirect.limit(n2);
                c += i;
                if (h != Integer.MIN_VALUE) {
                    if (h != 3) {
                        if (h != 1073741824) {
                            throw new IllegalStateException();
                        }
                        while (i < c) {
                            allocateDirect.put(byteBuffer.get(i + 2));
                            allocateDirect.put(byteBuffer.get(i + 3));
                            i += 4;
                        }
                    }
                    else {
                        while (i < c) {
                            allocateDirect.put((byte)0);
                            allocateDirect.put((byte)((byteBuffer.get(i) & 0xFF) - 128));
                            ++i;
                        }
                    }
                }
                else {
                    while (i < c) {
                        allocateDirect.put(byteBuffer.get(i + 1));
                        allocateDirect.put(byteBuffer.get(i + 2));
                        i += 3;
                    }
                }
                allocateDirect.position(0);
                this.D = allocateDirect;
                i = allocateDirect.position();
                c = this.D.limit();
                byteBuffer = allocateDirect;
            }
            this.C = c;
            byteBuffer.position(i);
            if (this.j && this.w == 0) {
                c = this.i;
                i = 6;
                if (c != 7 && c != 8) {
                    if (c == 5) {
                        final int[] a2 = lvx.a;
                        i = 1536;
                    }
                    else {
                        if (c != 6) {
                            final StringBuilder sb = new StringBuilder("Unexpected audio encoding: ");
                            sb.append(c);
                            throw new IllegalStateException(sb.toString());
                        }
                        final int[] a3 = lvx.a;
                        if ((byteBuffer.get(byteBuffer.position() + 4) & 0xC0) >> 6 != 3) {
                            i = lvx.a[(byteBuffer.get(byteBuffer.position() + 4) & 0x30) >> 4];
                        }
                        i *= 256;
                    }
                }
                else {
                    final int[] a4 = lvz.a;
                    c = byteBuffer.position();
                    i = byteBuffer.get(c + 4);
                    i = (((byteBuffer.get(c + 5) & 0xFC) >> 2 | (i & 0x1) << 6) + 1) * 32;
                }
                this.w = i;
            }
            if (this.x == 0) {
                this.y = Math.max(0L, r);
                this.x = 1;
                i = n;
                d2 = byteBuffer;
            }
            else {
                final long n4 = this.y + this.q(this.r());
                if (this.x == 1 && Math.abs(n4 - r) > 200000L) {
                    final StringBuilder sb2 = new StringBuilder("Discontinuity detected [expected ");
                    sb2.append(n4);
                    sb2.append(", got ");
                    sb2.append(r);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.x = 2;
                }
                i = n;
                d2 = byteBuffer;
                if (this.x == 2) {
                    this.y += r - n4;
                    this.x = 1;
                    i = 1;
                    d2 = byteBuffer;
                }
            }
        }
        else {
            d2 = byteBuffer;
            i = n;
        }
        if (this.E) {
            d2 = this.D;
        }
        c = this.d.write(d2, this.C, 1);
        if (c < 0) {
            throw new lsa(c);
        }
        final int c3 = this.C - c;
        this.C = c3;
        final boolean k = this.j;
        if (!k) {
            this.u += c;
        }
        c = i;
        if (c3 == 0) {
            if (k) {
                this.v += this.w;
            }
            c = (i | 0x2);
        }
        final lrw c4 = this.c;
        r = this.r();
        if (c4.f != -1L && r > 0L && SystemClock.elapsedRealtime() - c4.f >= 200L) {
            Log.w("AudioTrack", "Resetting stalled audio track");
            this.j();
            return c | 0x2;
        }
        return c;
    }
    
    public final int b() {
        return this.c(0);
    }
    
    public final int c(int n) {
        this.a.block();
        if (n == 0) {
            this.d = new AudioTrack(this.g, this.e, this.f, this.i, this.l, 1);
        }
        else {
            this.d = new AudioTrack(this.g, this.e, this.f, this.i, this.l, 1, n);
        }
        n = this.d.getState();
        if (n == 1) {
            final int audioSessionId = this.d.getAudioSessionId();
            final lrw c = this.c;
            final AudioTrack d = this.d;
            n = lwj.a;
            c.d(d);
            this.u();
            return audioSessionId;
        }
        try {
            this.d.release();
        }
        catch (final Exception ex) {
            this.d = null;
        }
        finally {
            this.d = null;
        }
        throw new lrz(n, this.e, this.f, this.l);
    }
    
    public final long d(final boolean b) {
        if (this.n() && this.x != 0) {
            if (this.d.getPlayState() == 3) {
                final long b2 = this.c.b();
                if (b2 != 0L) {
                    final long n = System.nanoTime() / 1000L;
                    if (n - this.q >= 30000L) {
                        final long[] b3 = this.b;
                        final int n2 = this.n;
                        b3[n2] = b2 - n;
                        this.n = (n2 + 1) % 10;
                        final int o = this.o;
                        if (o < 10) {
                            this.o = o + 1;
                        }
                        this.q = n;
                        this.p = 0L;
                        int n3 = 0;
                        while (true) {
                            final int o2 = this.o;
                            if (n3 >= o2) {
                                break;
                            }
                            this.p += this.b[n3] / o2;
                            ++n3;
                        }
                    }
                    final int a = lwj.a;
                    if (n - this.s >= 500000L) {
                        final lrx lrx = (lrx)this.c;
                        final boolean timestamp = lrx.a.getTimestamp(lrx.i);
                        if (timestamp) {
                            final long framePosition = lrx.i.framePosition;
                            if (lrx.k > framePosition) {
                                ++lrx.j;
                            }
                            lrx.k = framePosition;
                            lrx.l = framePosition + (lrx.j << 32);
                        }
                        this.r = timestamp;
                        if (timestamp) {
                            final long n4 = this.c.c() / 1000L;
                            final long l = ((lrx)this.c).l;
                            if (n4 < this.z) {
                                this.r = false;
                            }
                            else if (Math.abs(n4 - n) > 5000000L) {
                                final StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(l);
                                sb.append(", ");
                                sb.append(n4);
                                sb.append(", ");
                                sb.append(n);
                                sb.append(", ");
                                sb.append(b2);
                                Log.w("AudioTrack", sb.toString());
                                this.r = false;
                            }
                            else if (Math.abs(this.q(l) - b2) > 5000000L) {
                                final StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(l);
                                sb2.append(", ");
                                sb2.append(n4);
                                sb2.append(", ");
                                sb2.append(n);
                                sb2.append(", ");
                                sb2.append(b2);
                                Log.w("AudioTrack", sb2.toString());
                                this.r = false;
                            }
                        }
                        final Method t = this.t;
                        if (t != null && !this.j) {
                            try {
                                final AudioTrack d = this.d;
                                final Object[] array = null;
                                final long a2 = (int)t.invoke(d, (Object[])null) * 1000L - this.m;
                                this.A = a2;
                                final long max = Math.max(a2, 0L);
                                this.A = max;
                                if (max > 5000000L) {
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Ignoring impossibly large audio latency: ");
                                    sb3.append(max);
                                    Log.w("AudioTrack", sb3.toString());
                                    this.A = 0L;
                                }
                            }
                            catch (final Exception ex) {
                                this.t = null;
                            }
                        }
                        this.s = n;
                    }
                }
            }
            final long n5 = System.nanoTime() / 1000L;
            long n6;
            if (this.r) {
                final long c = this.c.c();
                final lrw c2 = this.c;
                n6 = this.q(((lrx)c2).l + this.p((long)((n5 - c / 1000L) * ((lry)c2).n))) + this.y;
            }
            else {
                long b4;
                if (this.o == 0) {
                    b4 = this.c.b();
                }
                else {
                    b4 = n5 + this.p;
                }
                n6 = b4 + this.y;
                if (!b) {
                    return n6 - this.A;
                }
            }
            return n6;
        }
        return Long.MIN_VALUE;
    }
    
    public final void e(final String s, int l, int e, int k) {
        int a = 0;
        switch (l) {
            default: {
                final StringBuilder sb = new StringBuilder("Unsupported channel count: ");
                sb.append(l);
                throw new IllegalArgumentException(sb.toString());
            }
            case 8: {
                a = lqp.a;
                break;
            }
            case 7: {
                a = 1276;
                break;
            }
            case 6: {
                a = 252;
                break;
            }
            case 5: {
                a = 220;
                break;
            }
            case 4: {
                a = 204;
                break;
            }
            case 3: {
                a = 28;
                break;
            }
            case 2: {
                a = 12;
                break;
            }
            case 1: {
                a = 4;
                break;
            }
        }
        final int a2 = lwj.a;
        final boolean equals = "audio/raw".equals(s);
        final boolean j = equals ^ true;
        boolean b = false;
        final int n = 2;
        int n2;
        if (j) {
            Label_0282: {
                switch (s.hashCode()) {
                    case 1505942594: {
                        if (s.equals("audio/vnd.dts.hd")) {
                            k = 3;
                            break Label_0282;
                        }
                        break;
                    }
                    case 1504578661: {
                        if (s.equals("audio/eac3")) {
                            k = 1;
                            break Label_0282;
                        }
                        break;
                    }
                    case 187078296: {
                        if (s.equals("audio/ac3")) {
                            k = 0;
                            break Label_0282;
                        }
                        break;
                    }
                    case -1095064472: {
                        if (s.equals("audio/vnd.dts")) {
                            k = 2;
                            break Label_0282;
                        }
                        break;
                    }
                }
                k = -1;
            }
            if (k != 0) {
                if (k != 1) {
                    if (k != 2) {
                        if (k != 3) {
                            n2 = 0;
                        }
                        else {
                            n2 = 8;
                        }
                    }
                    else {
                        n2 = 7;
                    }
                }
                else {
                    n2 = 6;
                }
            }
            else {
                n2 = 5;
            }
        }
        else {
            n2 = k;
            if (k != 3 && (n2 = k) != 2 && (n2 = k) != Integer.MIN_VALUE) {
                if (k != 1073741824) {
                    final StringBuilder sb2 = new StringBuilder("Unsupported PCM encoding: ");
                    sb2.append(k);
                    throw new IllegalArgumentException(sb2.toString());
                }
                n2 = k;
            }
        }
        if (this.n() && this.h == n2 && this.e == e && this.f == a) {
            return;
        }
        this.j();
        this.h = n2;
        this.j = j;
        this.e = e;
        this.f = a;
        if (equals) {
            n2 = n;
        }
        this.i = n2;
        this.k = l + l;
        if (j) {
            if (n2 != 5 && n2 != 6) {
                l = 49152;
                this.l = 49152;
            }
            else {
                l = 20480;
                this.l = 20480;
            }
        }
        else {
            final int minBufferSize = AudioTrack.getMinBufferSize(e, a, n2);
            if (minBufferSize != -2) {
                b = true;
            }
            jfi.U(b);
            e = minBufferSize * 4;
            final long p4 = this.p(250000L);
            k = this.k;
            l = (int)p4 * k;
            k = (int)Math.max(minBufferSize, this.p(750000L) * k);
            if (e >= l) {
                if (e > k) {
                    l = k;
                }
                else {
                    l = e;
                }
            }
            this.l = l;
        }
        long q;
        if (j) {
            q = -1L;
        }
        else {
            q = this.q(this.s(l));
        }
        this.m = q;
    }
    
    public final void f() {
        if (this.x == 1) {
            this.x = 2;
        }
    }
    
    public final void g() {
        if (this.n()) {
            final lrw c = this.c;
            final long r = this.r();
            c.g = c.a();
            c.e = SystemClock.elapsedRealtime() * 1000L;
            c.h = r;
            c.a.stop();
        }
    }
    
    public final void h() {
        if (this.n()) {
            this.t();
            final lrw c = this.c;
            if (c.e == -1L) {
                c.a.pause();
            }
        }
    }
    
    public final void i() {
        if (this.n()) {
            this.z = System.nanoTime() / 1000L;
            this.d.play();
        }
    }
    
    public final void j() {
        if (this.n()) {
            this.u = 0L;
            this.v = 0L;
            this.w = 0;
            this.C = 0;
            this.x = 0;
            this.A = 0L;
            this.t();
            if (this.d.getPlayState() == 3) {
                this.d.pause();
            }
            final AudioTrack d = this.d;
            this.d = null;
            this.c.d(null);
            this.a.close();
            new lrv(this, d).start();
        }
    }
    
    public final void k(PlaybackParams allowDefaults) {
        final lrw c = this.c;
        if (allowDefaults == null) {
            allowDefaults = new PlaybackParams();
        }
        allowDefaults = allowDefaults.allowDefaults();
        final lry lry = (lry)c;
        lry.m = allowDefaults;
        lry.n = allowDefaults.getSpeed();
        lry.e();
    }
    
    public final void l(final float b) {
        if (this.B != b) {
            this.B = b;
            this.u();
        }
    }
    
    public final boolean m() {
        final boolean n = this.n();
        boolean b = false;
        if (n) {
            if (this.r() > this.c.a()) {
                b = true;
            }
            else {
                final int a = lwj.a;
                b = b;
            }
        }
        return b;
    }
    
    public final boolean n() {
        return this.d != null;
    }
    
    public final boolean o(final int g) {
        if (this.g == g) {
            return false;
        }
        this.g = g;
        this.j();
        return true;
    }
}
