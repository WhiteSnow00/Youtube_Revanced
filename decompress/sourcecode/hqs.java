import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqs
{
    public final abzk a;
    public final hqr b;
    public ViewGroup c;
    public ViewGroup d;
    private final acae e;
    private final wwu f;
    
    public hqs(final atjj atjj, final acae e, final wwu f, final hqr b) {
        this.a = (abzk)atjj.a();
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public final void a(ViewGroup d, final ajkj ajkj) {
        if (d == null) {
            trn.b("Header container is null, header cannot be presented.");
            return;
        }
        this.c = d;
        d.findViewById(2131429346).setOnClickListener((View$OnClickListener)new hqg(this, 5));
        iba.e((View)d, true);
        d = (ViewGroup)d.findViewById(2131429347);
        if ((this.d = d) == null) {
            trn.b("Header elements container is null, header cannot be presented.");
            return;
        }
        if (ajkj == null) {
            trn.b("Header renderer is null, header cannot be presented.");
            iba.e((View)this.d, false);
            return;
        }
        final abzh d2 = this.e.d(ajkj);
        final acij acij = new acij();
        final wwv n = this.f.n();
        n.getClass();
        acij.a(n);
        this.a.b(acij, d2);
        d = this.d;
        if (d != null) {
            d.removeAllViews();
            this.d.addView(this.a.a());
            iba.e((View)this.d, true);
        }
    }
}
