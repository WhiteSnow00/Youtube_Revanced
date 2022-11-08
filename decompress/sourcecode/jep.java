import android.widget.TextView;
import android.view.View$OnClickListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jep extends jer
{
    public ttn ae;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final View inflate = layoutInflater.inflate(2131625045, viewGroup, false);
        final Toolbar toolbar = (Toolbar)inflate.findViewById(2131432122);
        toolbar.t((View$OnClickListener)new izp(this, 14));
        toolbar.z(((br)this).nZ().getString(2132019162));
        final Bundle m = ((br)this).m;
        if (m != null) {
            final aioe b = vba.b(m.getByteArray("navigation_endpoint"));
            if (((agzd)b).rs((agyr)angn.a)) {
                final angm angm = (angm)((agzd)b).rr((agyr)angn.a);
                final TextView textView = (TextView)inflate.findViewById(2131430492);
                ajsq ajsq;
                if ((ajsq = angm.c) == null) {
                    ajsq = ajsq.a;
                }
                tmy.t(textView, (CharSequence)abyh.b(ajsq));
                final TextView textView2 = (TextView)inflate.findViewById(2131428624);
                ajsq ajsq2;
                if ((ajsq2 = angm.b) == null) {
                    ajsq2 = ajsq.a;
                }
                tmy.t(textView2, (CharSequence)abyh.r(ajsq2));
            }
        }
        return inflate;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(2, this.ae.a);
    }
}
