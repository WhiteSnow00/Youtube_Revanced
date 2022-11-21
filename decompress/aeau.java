import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeau extends akx
{
    final aeax a;
    
    public aeau(final aeax a) {
        this.a = a;
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        aon.h(1048576);
        aon.w(true);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        if (n == 1048576) {
            this.a.d();
            return true;
        }
        return super.i(view, n, bundle);
    }
}
