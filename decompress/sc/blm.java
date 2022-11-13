import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blm implements afaq
{
    public final int a;
    private final int b;
    
    public blm(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        if (this.b != 0) {
            return new HandlerThread(blo.d(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
        return new HandlerThread(blo.d(this.a, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
