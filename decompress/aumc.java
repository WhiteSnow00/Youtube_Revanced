import java.util.concurrent.Callable;
import org.webrtc.VideoFrame$I420Buffer;
import org.webrtc.VideoFrame$Buffer;
import android.os.Handler;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aumc implements aumg
{
    public final int a;
    public final int b;
    public final Matrix c;
    public final Handler d;
    public final aumb e;
    public final ziy f;
    private final int g;
    private final int h;
    private final int i;
    private final aulq j;
    private final int k;
    
    public aumc(final int a, final int b, final int g, final int h, final int k, final int i, final Matrix c, final Handler d, final ziy f, final aumb e, final byte[] array) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.h = h;
        this.k = k;
        this.i = i;
        this.c = c;
        this.d = d;
        this.f = f;
        this.j = new aulq((Runnable)new aulz(e, 0));
        this.e = e;
    }
    
    public final int a() {
        return this.i;
    }
    
    public final Matrix b() {
        return this.c;
    }
    
    public final int c() {
        return this.k;
    }
    
    public final VideoFrame$Buffer cropAndScale(int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        final Matrix matrix = new Matrix();
        final int h = this.h;
        matrix.preTranslate(n / (float)this.g, (h - (n2 + n4)) / (float)h);
        matrix.preScale(n3 / (float)this.g, n4 / (float)this.h);
        n = this.a;
        n = Math.round(n * n3 / (float)this.g);
        n2 = this.b;
        n2 = Math.round(n2 * n4 / (float)this.h);
        final Matrix matrix2 = new Matrix(this.c);
        matrix2.preConcat(matrix);
        this.retain();
        return (VideoFrame$Buffer)new aumc(n, n2, n5, n6, this.k, this.i, matrix2, this.d, this.f, (aumb)new auma(this, 2), null);
    }
    
    public final int getBufferType() {
        return 0;
    }
    
    public final int getHeight() {
        return this.h;
    }
    
    public final int getWidth() {
        return this.g;
    }
    
    public final void release() {
        this.e.b();
        this.j.release();
    }
    
    public final void retain() {
        this.e.c();
        this.j.retain();
    }
    
    public final VideoFrame$I420Buffer toI420() {
        return (VideoFrame$I420Buffer)aumt.i(this.d, (Callable)new aerg(this, 8));
    }
}
