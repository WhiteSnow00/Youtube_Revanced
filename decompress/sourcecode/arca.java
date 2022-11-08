import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arca implements aulb
{
    private static final float[] d;
    public final arbx a;
    public final auln b;
    public volatile boolean c;
    
    static {
        d = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    public arca() {
        this.a = new arbx();
        (this.b = new auln()).b();
    }
    
    public final void a(final int n, float[] d, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final arbx a = this.a;
        d = arca.d;
        final int[] array = { 0 };
        GLES20.glGetIntegerv(36006, array, 0);
        a.a(n2, n3);
        final aulb b = a.b;
        final aukn a2 = a.a;
        b.a(n, d, n2, n3, 0, 0, a2.c, a2.d);
        GLES20.glBindFramebuffer(36160, array[0]);
    }
    
    public final void b(final int n, float[] d, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final arbx a = this.a;
        d = arca.d;
        final int[] array = { 0 };
        GLES20.glGetIntegerv(36006, array, 0);
        a.a(n2, n3);
        final aulb b = a.b;
        final aukn a2 = a.a;
        b.b(n, d, n2, n3, 0, 0, a2.c, a2.d);
        GLES20.glBindFramebuffer(36160, array[0]);
    }
    
    public final void c() {
        this.b.a();
        final arbx a = this.a;
        a.a.a();
        final aulb b = a.b;
        if (b != null) {
            b.c();
        }
        this.b.b();
    }
}
