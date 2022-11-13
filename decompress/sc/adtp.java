import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class adtp extends akw
{
    final adts a;
    
    public adtp(final adts a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        if (this.a.d) {
            aom.g(1048576);
            aom.v(true);
            return;
        }
        aom.v(false);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        int n2 = n;
        if (n == 1048576) {
            final adts a = this.a;
            if (a.d) {
                a.cancel();
                return true;
            }
            n2 = 1048576;
        }
        return super.i(view, n2, bundle);
    }
}
