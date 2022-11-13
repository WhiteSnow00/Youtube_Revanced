import java.util.Iterator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class adyp extends adyv
{
    final List a;
    final Matrix b;
    
    public adyp(final List a, final Matrix b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Matrix matrix, final adya adya, final int n, final Canvas canvas) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((adyv)iterator.next()).a(this.b, adya, n, canvas);
        }
    }
}
