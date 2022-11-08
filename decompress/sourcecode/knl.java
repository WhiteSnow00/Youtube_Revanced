import android.view.View$OnClickListener;
import java.util.Map;
import java.util.HashMap;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.dismissal.DismissalFollowUpDialogFragmentController;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knl implements acil
{
    public final View a;
    public final vax b;
    public final wwv c;
    public final DismissalFollowUpDialogFragmentController d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final acqu h;
    private final acqu i;
    private final uyi j;
    
    public knl(View a, final vax b, final wwv c, final DismissalFollowUpDialogFragmentController d, final zhb zhb, final uyi j, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (TextView)a.findViewById(2131431832);
        final TextView f = (TextView)a.findViewById(2131432219);
        this.f = f;
        this.h = zhb.g(f);
        final TextView g = (TextView)a.findViewById(2131428703);
        this.g = g;
        this.i = zhb.g(g);
        this.j = j;
        final int dimensionPixelSize = a.getContext().getResources().getDimensionPixelSize(2131168323);
        a = (View)f.getParent();
        a.post((Runnable)new qo(f, dimensionPixelSize, a, 16));
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void b(final acij acij, final amqj amqj) {
        final wwv a = ((wwx)acij).a;
        final wws wws = new wws(amqj.f);
        final juq juq = null;
        a.t((wxz)wws, (alff)null);
        final TextView e = this.e;
        ajsq ajsq;
        if ((ajsq = amqj.c) == null) {
            ajsq = ajsq.a;
        }
        tmy.t(e, (CharSequence)abyh.b(ajsq));
        final TextView e2 = this.e;
        ajsq ajsq2;
        if ((ajsq2 = amqj.c) == null) {
            ajsq2 = ajsq.a;
        }
        e2.setContentDescription((CharSequence)knm.g(ajsq2));
        if (this.j.aP()) {
            ((acqt)this.h).b(knm.f(), null);
        }
        final TextView f = this.f;
        ajsq ajsq3;
        if ((ajsq3 = amqj.d) == null) {
            ajsq3 = ajsq.a;
        }
        tmy.t(f, (CharSequence)abyh.b(ajsq3));
        final TextView f2 = this.f;
        ajsq ajsq4;
        if ((ajsq4 = amqj.d) == null) {
            ajsq4 = ajsq.a;
        }
        f2.setContentDescription((CharSequence)knm.g(ajsq4));
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", amqj);
        this.f.setOnClickListener((View$OnClickListener)new klr(this, amqj, (Map)hashMap, 2));
        if (!((agzd)amqj).rs((agyr)amqi.b)) {
            tmy.v((View)this.g, false);
            return;
        }
        final aklx aklx = (aklx)((agzd)amqj).rr((agyr)amqi.b);
        if (this.j.aP()) {
            ((acqt)this.i).b(knm.f(), null);
        }
        final TextView g = this.g;
        ajsq ajsq5;
        if ((aklx.b & 0x4) != 0x0) {
            if ((ajsq5 = aklx.d) == null) {
                ajsq5 = ajsq.a;
            }
        }
        else {
            ajsq5 = null;
        }
        tmy.t(g, (CharSequence)abyh.b(ajsq5));
        final TextView g2 = this.g;
        ajsq ajsq6;
        if ((aklx.b & 0x4) != 0x0) {
            if ((ajsq6 = aklx.d) == null) {
                ajsq6 = ajsq.a;
            }
        }
        else {
            ajsq6 = null;
        }
        g2.setContentDescription((CharSequence)knm.g(ajsq6));
        final Object c = acij.c("sectionController");
        juq juq2 = juq;
        if (c instanceof juq) {
            juq2 = (juq)c;
        }
        this.g.setOnClickListener((View$OnClickListener)new klr(this, amqj, juq2, 3));
        ((wwx)acij).a.F((wxz)new wws(aklx.c), (wxz)new wws(amqj.f));
    }
    
    public final void c(final acir acir) {
    }
}
