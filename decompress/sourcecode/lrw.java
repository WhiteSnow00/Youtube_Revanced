import android.os.SystemClock;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

class lrw
{
    protected AudioTrack a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    
    public lrw() {
    }
    
    public final long a() {
        if (this.e != -1L) {
            return Math.min(this.h, this.g + (SystemClock.elapsedRealtime() * 1000L - this.e) * this.b / 1000000L);
        }
        final int playState = this.a.getPlayState();
        final long n = 0L;
        if (playState == 1) {
            return 0L;
        }
        long c;
        final long n2 = c = ((long)this.a.getPlaybackHeadPosition() & 0xFFFFFFFFL);
        if (lwj.a <= 26) {
            if (n2 == 0L) {
                c = n;
                if (this.c > 0L) {
                    c = n;
                    if (playState == 3) {
                        if (this.f == -1L) {
                            this.f = SystemClock.elapsedRealtime();
                        }
                        return this.c;
                    }
                }
            }
            else {
                c = n2;
            }
            this.f = -1L;
        }
        if (this.c > c) {
            ++this.d;
        }
        this.c = c;
        return c + (this.d << 32);
    }
    
    public final long b() {
        return this.a() * 1000000L / this.b;
    }
    
    public long c() {
        throw null;
    }
    
    public void d(final AudioTrack audioTrack) {
        throw null;
    }
}
