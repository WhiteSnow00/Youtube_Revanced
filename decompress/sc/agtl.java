import android.opengl.GLES20;
import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtl implements Runnable
{
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public agtl(final agto c, final SurfaceTexture d, final int a, final int b, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public agtl(final aqxh c, final aqsy d, final int a, final int b, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public agtl(final wuv c, final SurfaceHolder d, final int b, final int a, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int e = this.e;
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {
                    final Object c = this.c;
                    final Object d = this.d;
                    final int a = this.a;
                    final int b = this.b;
                    final aqxh aqxh = (aqxh)c;
                    final aqxg a2 = aqxh.a;
                    a2.b = (aqxa)c;
                    final aqsy c2 = (aqsy)d;
                    a2.c = c2;
                    final aqxj b2 = aqxh.b;
                    if (b2 != null) {
                        b2.d = a;
                        b2.e = b;
                        b2.a = new aqxi(c2, (aqxa)c, 0, (byte[])null, (byte[])null);
                    }
                    return;
                }
                final Object c3 = this.c;
                final Object d2 = this.d;
                final int a3 = this.a;
                final int b3 = this.b;
                final agtn a4 = ((agto)c3).a;
                a4.f((SurfaceTexture)d2, a3, b3);
                final int[] array = { 0 };
                GLES20.glGenTextures(1, array, 0);
                a4.a.attachToGLContext(array[0]);
                return;
            }
            else {
                final whk d3 = ((wuv)this.c).d;
                final Object d4 = this.d;
                final int b4 = this.b;
                final int a5 = this.a;
                synchronized (d3.b) {
                    d3.d = b4;
                    d3.e = a5;
                    d3.c = (SurfaceHolder)d4;
                    monitorexit(d3.b);
                    d3.a.a();
                    return;
                }
            }
        }
        ((agto)this.c).a.f((SurfaceTexture)this.d, this.a, this.b);
    }
}
