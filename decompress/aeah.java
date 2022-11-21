import java.util.Iterator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeah extends aean
{
    final List a;
    final Matrix b;
    
    public aeah(final List a, final Matrix b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Matrix matrix, final adzr adzr, final int n, final Canvas canvas) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aean)iterator.next()).a(this.b, adzr, n, canvas);
        }
    }
}
