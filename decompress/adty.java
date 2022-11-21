import android.graphics.Matrix;
import android.animation.TypeEvaluator;

// 
// Decompiled by Procyon v0.6.0
// 

public class adty implements TypeEvaluator
{
    private final float[] a;
    private final float[] b;
    private final Matrix c;
    
    public adty() {
        this.a = new float[9];
        this.b = new float[9];
        this.c = new Matrix();
    }
    
    public Matrix a(final float n, final Matrix matrix, final Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; ++i) {
            final float[] b = this.b;
            final float n2 = b[i];
            final float n3 = this.a[i];
            b[i] = n3 + (n2 - n3) * n;
        }
        this.c.setValues(this.b);
        return this.c;
    }
    
    public /* bridge */ Object evaluate(final float n, final Object o, final Object o2) {
        return this.a(n, (Matrix)o, (Matrix)o2);
    }
}
