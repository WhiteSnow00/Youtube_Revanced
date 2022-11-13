import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavv extends aavu
{
    public final int b;
    
    public aavv(final aanx aanx, final byte[] array, final byte[] array2) {
        super(aanx.d(2131951663), aanx.d(2131951662));
        this.b = this.e("aColor");
    }
    
    @Override
    public final void d() {
        super.d();
        GLES20.glEnableVertexAttribArray(this.b);
        final Boolean a = aatt.a;
    }
    
    @Override
    public final void k() {
        super.k();
        GLES20.glDisableVertexAttribArray(this.b);
        final Boolean a = aatt.a;
    }
}
