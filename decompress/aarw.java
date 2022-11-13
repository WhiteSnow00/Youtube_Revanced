import java.nio.ByteBuffer;
import android.opengl.GLES20;
import android.view.Surface;
import android.os.Handler;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aarw implements SurfaceTexture$OnFrameAvailableListener, aaty
{
    public final int a;
    public final float[] b;
    public SurfaceTexture c;
    public boolean d;
    public long e;
    private final aats f;
    private final Handler g;
    private final Surface h;
    private final aaog i;
    
    public aarw(final Handler g, final aats f) {
        this.g = g;
        this.f = f;
        this.i = new aaog(this, 13);
        this.b = new float[16];
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        aatt.g(array[0]);
        final int a = array[0];
        this.a = a;
        (this.c = new SurfaceTexture(a)).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
        this.h = new Surface(this.c);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, a);
    }
    
    public final float a() {
        return 0.0f;
    }
    
    public final int b() {
        return 0;
    }
    
    public final long c() {
        return this.e;
    }
    
    public final aauo d() {
        return null;
    }
    
    public final ByteBuffer e() {
        return null;
    }
    
    public final void f() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.a);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        final Boolean a = aatt.a;
    }
    
    public final void g() {
        this.g.obtainMessage(0, (Object)this.h).sendToTarget();
    }
    
    public final void h() {
        if (this.d) {
            this.d = false;
            this.onFrameAvailable(null);
        }
    }
    
    public final float[] i() {
        return this.b;
    }
    
    public final int j() {
        return 1;
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.f.b((Runnable)this.i);
    }
}
