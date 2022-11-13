import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public class aavu extends aavz
{
    public final int a;
    private final int b;
    private final int d;
    
    public aavu(final String s, final String s2) {
        super(s, s2);
        this.b = this.e("aPosition");
        this.d = this.f("uMVP");
        this.a = this.f("uOpacity");
    }
    
    public void c(final aatu aatu) {
        aatu.d.a(this.b);
        GLES20.glDrawArrays(aatu.g, 0, aatu.f);
        final Boolean a = aatt.a;
    }
    
    public void d() {
        GLES20.glEnableVertexAttribArray(this.b);
        final Boolean a = aatt.a;
    }
    
    public void k() {
        GLES20.glDisableVertexAttribArray(this.b);
        final Boolean a = aatt.a;
    }
    
    public final void l(final float[] array) {
        GLES20.glUniformMatrix4fv(this.d, 1, false, array, 0);
        final Boolean a = aatt.a;
    }
}
