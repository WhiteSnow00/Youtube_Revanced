import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class adzc extends akw
{
    final adzf a;
    
    public adzc(final adzf a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        aom.g(1048576);
        aom.v(true);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        if (n == 1048576) {
            this.a.d();
            return true;
        }
        return super.i(view, n, bundle);
    }
}
