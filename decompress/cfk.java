import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class cfk extends akx
{
    final cfl a;
    
    public cfk(final cfl a) {
        this.a = a;
    }
    
    public final void c(final View view, final aon aon) {
        this.a.e.c(view, aon);
        final int c = this.a.d.c(view);
        final nr m = this.a.d.m;
        if (!(m instanceof cfe)) {
            return;
        }
        ((cfe)m).x(c);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        return this.a.e.i(view, n, bundle);
    }
}
