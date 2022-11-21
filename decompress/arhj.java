import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhj implements auom
{
    private static final float[] d;
    public final arhg a;
    public final auoz b;
    public volatile boolean c;
    
    static {
        d = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    public arhj() {
        this.a = new arhg();
        (this.b = new auoz()).b();
    }
    
    public final void a(final int n, float[] d, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final arhg a = this.a;
        d = arhj.d;
        final int[] array = { 0 };
        GLES20.glGetIntegerv(36006, array, 0);
        a.a(n2, n3);
        final auom b = a.b;
        final auny a2 = a.a;
        b.a(n, d, n2, n3, 0, 0, a2.c, a2.d);
        GLES20.glBindFramebuffer(36160, array[0]);
    }
    
    public final void b(final int n, final float[] array, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final arhg a = this.a;
        final float[] d = arhj.d;
        final int[] array2 = { 0 };
        GLES20.glGetIntegerv(36006, array2, 0);
        a.a(n2, n3);
        final auom b = a.b;
        final auny a2 = a.a;
        b.b(n, d, n2, n3, 0, 0, a2.c, a2.d);
        GLES20.glBindFramebuffer(36160, array2[0]);
    }
    
    public final void c() {
        this.b.a();
        final arhg a = this.a;
        a.a.a();
        final auom b = a.b;
        if (b != null) {
            b.c();
        }
        this.b.b();
    }
}
