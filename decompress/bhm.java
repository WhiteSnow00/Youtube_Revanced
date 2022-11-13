import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

final class bhm
{
    public final bhl a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    
    public bhm(final AudioTrack audioTrack) {
        final int a = bax.a;
        this.a = new bhl(audioTrack);
        this.d();
    }
    
    public final long a() {
        return this.a.e;
    }
    
    public final long b() {
        return this.a.a();
    }
    
    public final void c() {
        this.e(4);
    }
    
    public final void d() {
        this.e(0);
    }
    
    public final void e(final int b) {
        this.b = b;
        long d = 10000L;
        if (b != 0) {
            if (b == 1) {
                this.d = 10000L;
                return;
            }
            if (b != 2 && b != 3) {
                d = 500000L;
            }
            else {
                d = 10000000L;
            }
        }
        else {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000L;
        }
        this.d = d;
    }
}
