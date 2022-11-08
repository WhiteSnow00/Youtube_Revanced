import android.os.SystemClock;
import java.lang.reflect.Method;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

final class bhm
{
    public long A;
    public boolean B;
    public long C;
    public long D;
    public final qpt E;
    public final long[] a;
    public AudioTrack b;
    public int c;
    public bhl d;
    public int e;
    public boolean f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;
    
    public bhm(final qpt e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.E = e;
        final int a = baw.a;
        while (true) {
            try {
                final Class[] array6 = null;
                this.l = AudioTrack.class.getMethod("getLatency", (Class<?>[])null);
                this.a = new long[10];
            }
            catch (final NoSuchMethodException ex) {
                continue;
            }
            break;
        }
    }
    
    public final long a(final long n) {
        return n * 1000000L / this.e;
    }
    
    public final long b() {
        final AudioTrack b = this.b;
        dk.d((Object)b);
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + (SystemClock.elapsedRealtime() * 1000L - this.v) * this.e / 1000000L);
        }
        final int playState = b.getPlayState();
        final long n = 0L;
        if (playState == 1) {
            return 0L;
        }
        long q;
        long n2 = q = ((long)b.getPlaybackHeadPosition() & 0xFFFFFFFFL);
        if (baw.a <= 29) {
            if (n2 == 0L) {
                n2 = n;
                if (this.q > 0L) {
                    n2 = n;
                    if (playState == 3) {
                        if (this.w == -9223372036854775807L) {
                            this.w = SystemClock.elapsedRealtime();
                        }
                        return this.q;
                    }
                }
            }
            this.w = -9223372036854775807L;
            q = n2;
        }
        if (this.q > q) {
            ++this.r;
        }
        this.q = q;
        return q + (this.r << 32);
    }
    
    public final long c() {
        return this.a(this.b());
    }
    
    public final void d() {
        this.j = 0L;
        this.u = 0;
        this.t = 0;
        this.k = 0L;
        this.A = 0L;
        this.D = 0L;
        this.i = false;
    }
    
    public final boolean e(final long n) {
        return n > this.b();
    }
}
