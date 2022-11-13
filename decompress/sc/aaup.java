import androidx.media3.decoder.VideoDecoderOutputBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaup
{
    public static final akr a;
    public VideoDecoderOutputBuffer b;
    public aauo c;
    
    static {
        a = (akr)new akt(4);
    }
    
    public aaup(final VideoDecoderOutputBuffer b) {
        this.b = b;
    }
    
    public final int a() {
        return this.b.height;
    }
    
    public final void b() {
        this.b.release();
        aaup.a.b((Object)this);
    }
    
    public final int[] c() {
        return this.b.yuvStrides;
    }
}
