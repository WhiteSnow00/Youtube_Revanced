import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class adux extends adsh
{
    final advf a;
    
    public adux(final advf a) {
        this.a = a;
    }
    
    public final Matrix a(final float y, final Matrix matrix, final Matrix matrix2) {
        this.a.y = y;
        return super.a(y, matrix, matrix2);
    }
    
    public final /* bridge */ Object evaluate(final float n, final Object o, final Object o2) {
        return this.a(n, (Matrix)o, (Matrix)o2);
    }
}
