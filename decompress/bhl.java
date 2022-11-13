import android.media.AudioTimestamp;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

final class bhl
{
    public final AudioTrack a;
    public final AudioTimestamp b;
    public long c;
    public long d;
    public long e;
    
    public bhl(final AudioTrack a) {
        this.a = a;
        this.b = new AudioTimestamp();
    }
    
    public final long a() {
        return this.b.nanoTime / 1000L;
    }
}
