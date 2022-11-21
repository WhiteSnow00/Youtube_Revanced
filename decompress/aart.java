import android.opengl.Matrix;
import com.google.vr.sdk.base.FieldOfView;
import com.google.cardboard.sdk.CardboardView$Eye;
import com.google.vr.sdk.base.Eye;

// 
// Decompiled by Procyon v0.6.0
// 

final class aart extends Eye
{
    private final CardboardView$Eye a;
    private final FieldOfView b;
    
    public aart(final CardboardView$Eye a, final int n, final float[] array) {
        super(n);
        this.a = a;
        Matrix.multiplyMM(this.getEyeView(), 0, a.getEyeFromHead(), 0, array, 0);
        final float[] fieldOfView = a.getFieldOfView();
        this.b = new FieldOfView(fieldOfView[0], fieldOfView[1], fieldOfView[2], fieldOfView[3]);
    }
    
    public final FieldOfView getFov() {
        return this.b;
    }
    
    public final float[] getPerspective(final float n, final float n2) {
        return this.a.getPerspective(0.1f, 20000.0f);
    }
}
