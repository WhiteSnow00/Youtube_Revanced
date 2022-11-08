import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.Eye;
import android.opengl.Matrix;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aanz extends aara
{
    private final float[] m;
    
    public aanz(final Bitmap bitmap, final aasa aasa, final aasb aasb, final atjj atjj) {
        super(bitmap, aasa, aasb, atjj);
        this.m = new float[16];
    }
    
    public final void p(final foi foi) {
        Matrix.setIdentityM(this.m, 0);
        super.p(new foi(this.m, foi.a, null));
    }
    
    public final boolean q(final foi foi) {
        return false;
    }
    
    public final void r(final agiy agiy) {
        Matrix.setIdentityM(this.m, 0);
        super.r(new agiy(this.m, (float[])agiy.b, (aarv)agiy.f, (Eye)agiy.c, (GvrViewerParams)agiy.a));
    }
}
