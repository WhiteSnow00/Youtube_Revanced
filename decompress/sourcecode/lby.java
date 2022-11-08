import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lby extends akv
{
    final /* synthetic */ View a;
    final /* synthetic */ lbz b;
    
    public lby(final lbz b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public final void c(final View view, final aol aol) {
        super.c(view, aol);
        aol.u((CharSequence)this.a.getResources().getString(2132017330));
        aol.A((CharSequence)this.a.getResources().getString(2132017333));
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        if (n == 16) {
            this.b.h.b().j();
            return true;
        }
        return super.i(view, n, bundle);
    }
}
