import java.util.concurrent.Callable;
import org.webrtc.VideoFrame$I420Buffer;
import org.webrtc.VideoFrame$Buffer;
import android.os.Handler;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aulm implements aulr
{
    public final int a;
    public final int b;
    public final Matrix c;
    public final Handler d;
    public final aull e;
    public final zhb f;
    private final int g;
    private final int h;
    private final int i;
    private final aula j;
    private final int k;
    
    public aulm(final int a, final int b, final int g, final int h, final int k, final int i, final Matrix c, final Handler d, final zhb f, final aull e, final byte[] array) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.h = h;
        this.k = k;
        this.i = i;
        this.c = c;
        this.d = d;
        this.f = f;
        this.j = new aula((Runnable)new aulh(e, 4));
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
    
    public final VideoFrame$Buffer cropAndScale(int n, int n2, int h, final int n3, final int n4, final int n5) {
        final Matrix matrix = new Matrix();
        final int h2 = this.h;
        matrix.preTranslate(n / (float)this.g, (h2 - (n2 + n3)) / (float)h2);
        matrix.preScale(h / (float)this.g, n3 / (float)this.h);
        n2 = this.a;
        n = this.g;
        n = Math.round(n2 * h / (float)n);
        n2 = this.b;
        h = this.h;
        n2 = Math.round(n2 * n3 / (float)h);
        final Matrix matrix2 = new Matrix(this.c);
        matrix2.preConcat(matrix);
        this.retain();
        return (VideoFrame$Buffer)new aulm(n, n2, n4, n5, this.k, this.i, matrix2, this.d, this.f, (aull)new aulk(this, 2), null);
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
        return (VideoFrame$I420Buffer)aulo.a(this.d, (Callable)new atym(this, 3));
    }
}
