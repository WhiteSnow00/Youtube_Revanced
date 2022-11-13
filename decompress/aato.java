import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.Buffer;
import android.opengl.Matrix;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aato implements bse, aaty
{
    public final int[] a;
    private final float[] b;
    private final Handler c;
    private final AtomicReference d;
    private int e;
    private float f;
    private aauo g;
    private long h;
    private ByteBuffer i;
    
    public aato(final Handler c) {
        final int[] a = new int[3];
        this.a = a;
        this.e = 2;
        this.c = c;
        GLES20.glGenTextures(3, a, 0);
        for (int i = 0; i < 3; ++i) {
            aatt.g(this.a[i]);
        }
        this.d = new AtomicReference();
        final float[] b = new float[16];
        Matrix.setIdentityM(this.b = b, 0);
        b[5] = -1.0f;
        b[13] = 1.0f;
    }
    
    public final float a() {
        return this.f;
    }
    
    public final int b() {
        return this.e;
    }
    
    public final long c() {
        return this.h;
    }
    
    public final aauo d() {
        return this.g;
    }
    
    public final ByteBuffer e() {
        return this.i;
    }
    
    public final void f() {
        final AtomicReference d = this.d;
        ByteBuffer supplementalData = null;
        final aaup aaup = d.getAndSet(null);
        for (int i = 0; i < 3; ++i) {
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.a[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            if (aaup != null) {
                int a;
                if (i == 0) {
                    a = aaup.a();
                }
                else {
                    a = (aaup.a() + 1) / 2;
                }
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, aaup.c()[i], a, 0, 6409, 5121, (Buffer)aaup.b.yuvPlanes[i]);
            }
        }
        if (aaup == null) {
            return;
        }
        final VideoDecoderOutputBuffer b = aaup.b;
        this.e = b.colorspace;
        this.g = aaup.c;
        this.f = (b.width - 0.5f) / aaup.c()[0];
        final VideoDecoderOutputBuffer b2 = aaup.b;
        this.h = b2.timeUs;
        if (b2 != null) {
            supplementalData = b2.supplementalData;
        }
        if (supplementalData != null) {
            final int limit = supplementalData.limit();
            final ByteBuffer j = this.i;
            if (j == null || j.capacity() < limit) {
                this.i = ByteBuffer.allocate(limit);
            }
            this.i.clear();
            this.i.put(supplementalData);
            this.i.flip();
        }
        aaup.b();
        final Boolean a2 = aatt.a;
    }
    
    public final void g() {
        this.c.obtainMessage(1, (Object)this).sendToTarget();
    }
    
    public final void h() {
    }
    
    public final float[] i() {
        return this.b;
    }
    
    public final int j() {
        return 2;
    }
    
    public final void k(aaup aaup) {
        synchronized (this) {
            aaup = this.d.getAndSet(aaup);
            if (aaup != null) {
                aaup.b();
            }
        }
    }
    
    public final void sY(final VideoDecoderOutputBuffer b) {
        synchronized (this) {
            aaup aaup;
            if ((aaup = (aaup)aaup.a.a()) == null) {
                aaup = new aaup(b);
            }
            b.getClass();
            aaup.b = b;
            final aya z = b.format.z;
            if (z != null) {
                aaup.c = new aauo(z);
            }
            else {
                aaup.c = null;
            }
            this.k(aaup);
        }
    }
}
