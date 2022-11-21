import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blp implements afci
{
    public final int a;
    private final int b;
    
    public blp(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object a() {
        if (this.b != 0) {
            return new HandlerThread(blr.d(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
        return new HandlerThread(blr.d(this.a, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
