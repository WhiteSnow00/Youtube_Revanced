import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrm
{
    public final acbm a;
    public final hrl b;
    public ViewGroup c;
    public ViewGroup d;
    private final accf e;
    private final wyv f;
    
    public hrm(final atke atke, final accf e, final wyv f, final hrl b) {
        this.a = (acbm)atke.a();
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public final void a(ViewGroup d, final ajmo ajmo) {
        if (d == null) {
            ttr.b("Header container is null, header cannot be presented.");
            return;
        }
        this.c = d;
        d.findViewById(2131429346).setOnClickListener((View$OnClickListener)new hrb(this, 5));
        hnu.f((View)d, true);
        d = (ViewGroup)d.findViewById(2131429347);
        if ((this.d = d) == null) {
            ttr.b("Header elements container is null, header cannot be presented.");
            return;
        }
        if (ajmo == null) {
            ttr.b("Header renderer is null, header cannot be presented.");
            hnu.f((View)this.d, false);
            return;
        }
        final acbj d2 = this.e.d(ajmo);
        final ackm ackm = new ackm();
        final wyw pf = this.f.pF();
        pf.getClass();
        ackm.a(pf);
        this.a.b(ackm, d2);
        d = this.d;
        if (d != null) {
            d.removeAllViews();
            this.d.addView(this.a.a());
            hnu.f((View)this.d, true);
        }
    }
}
