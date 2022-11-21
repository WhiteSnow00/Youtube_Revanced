import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class advg extends akx
{
    final advj a;
    
    public advg(final advj a) {
        this.a = a;
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        if (this.a.d) {
            aon.h(1048576);
            aon.w(true);
            return;
        }
        aon.w(false);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        int n2 = n;
        if (n == 1048576) {
            final advj a = this.a;
            if (a.d) {
                a.cancel();
                return true;
            }
            n2 = 1048576;
        }
        return super.i(view, n2, bundle);
    }
}
