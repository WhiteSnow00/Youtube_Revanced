import android.media.MediaCodec$CryptoInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lua
{
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    
    public lua() {
        this.f = new int[255];
    }
    
    public lua(final byte[] array) {
        this.f = new MediaCodec$CryptoInfo();
    }
    
    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }
    
    public final void b(final int d, final int a, final long b, final int e) {
        this.d = d;
        this.c = 0;
        this.a = a;
        this.b = b;
        this.e = e;
    }
}
