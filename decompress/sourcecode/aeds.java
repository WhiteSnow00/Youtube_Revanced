import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeds extends akv
{
    final /* synthetic */ ExpandableSwitchItem a;
    
    public aeds(final ExpandableSwitchItem a) {
        this.a = a;
    }
    
    public final void c(final View view, final aol aol) {
        super.c(view, aol);
        aok aok;
        if (this.a.a) {
            aok = aok.g;
        }
        else {
            aok = aok.f;
        }
        aol.h(aok);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        boolean i;
        if (n != 262144 && n != 524288) {
            i = super.i(view, n, bundle);
        }
        else {
            final ExpandableSwitchItem a = this.a;
            a.c(a.a ^ true);
            i = true;
        }
        return i;
    }
}
