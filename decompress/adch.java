import android.view.View$OnClickListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adch extends adcf
{
    public tvr ae;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131625312, viewGroup, false);
        final Toolbar toolbar = (Toolbar)inflate.findViewById(2131432125);
        toolbar.t((View$OnClickListener)new acun(this, 10));
        toolbar.q(2132017208);
        return inflate;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(2, this.ae.a);
    }
}
