import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public class aawg extends aavu
{
    public final int h;
    public final int i;
    
    public aawg(final String s, final String s2) {
        super(s, s2);
        this.h = this.e("aTextureCoords");
        this.i = this.f("uBrightness");
    }
    
    @Override
    public final void c(final aatu aatu) {
        aatu.e.a(this.h);
        super.c(aatu);
    }
    
    @Override
    public final void d() {
        super.d();
        GLES20.glEnableVertexAttribArray(this.h);
        final Boolean a = aatt.a;
    }
    
    @Override
    public final void k() {
        super.k();
        GLES20.glDisableVertexAttribArray(this.h);
        final Boolean a = aatt.a;
    }
}
