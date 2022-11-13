import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class cfh extends akw
{
    final cfi a;
    
    public cfh(final cfi a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        this.a.e.c(view, aom);
        final int c = this.a.d.c(view);
        final nq m = this.a.d.m;
        if (!(m instanceof cfb)) {
            return;
        }
        ((cfb)m).x(c);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        return this.a.e.i(view, n, bundle);
    }
}
