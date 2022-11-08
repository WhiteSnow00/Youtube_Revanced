import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable$ShaderFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcl extends ShapeDrawable$ShaderFactory
{
    final /* synthetic */ int[] a;
    final /* synthetic */ float[] b;
    
    public gcl(final int[] a, final float[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final Shader resize(final int n, final int n2) {
        final float n3 = n / 2.0f;
        return (Shader)new LinearGradient(n3, 0.0f, n3, (float)n2, this.a, this.b, Shader$TileMode.CLAMP);
    }
}
