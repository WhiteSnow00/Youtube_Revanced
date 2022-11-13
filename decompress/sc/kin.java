import android.view.View$OnTouchListener;
import java.util.Map;
import android.widget.AdapterView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class kin
{
    protected final Context a;
    protected final View b;
    protected final TextView c;
    protected final TextView d;
    protected final Spinner e;
    protected final vcy f;
    public final wyw g;
    protected final ajvl h;
    protected int i;
    protected int j;
    protected boolean k;
    
    public kin(final Context a, final vcy f, final wyw g, final ViewGroup viewGroup, final ajvl h) {
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.f = f;
        this.g = g;
        this.a = a;
        final View inflate = LayoutInflater.from(a).inflate(2131624452, viewGroup, false);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131429479);
        this.d = (TextView)inflate.findViewById(2131429233);
        this.e = (Spinner)inflate.findViewById(2131431627);
        this.h = h;
    }
    
    protected static final kiw j(final boolean b, final aiqj aiqj, final algl algl) {
        if (b) {
            return kiw.a(false, aiqj, algl);
        }
        return kiw.a(true, null, null);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final algj b(final algj algj) {
        return algj;
    }
    
    public final alhf c(final alhf alhf) {
        return alhf;
    }
    
    public final boolean h() {
        return this.i != this.j;
    }
    
    protected final void i(final boolean b, final boolean b2, final ajut ajut) {
        if (b) {
            this.e.setBackground(agx.a(this.a, 2131230922));
            this.c.setTextColor(tpe.cr(this.a, 2130970856));
            if (b2) {
                this.d.setTextColor(tpe.cr(this.a, 2130970856));
                tpe.t(this.d, (CharSequence)acak.b(ajut));
            }
            this.b.setBackgroundColor(tpe.cr(this.a, 2130970838));
            return;
        }
        this.c.setTextColor(tpe.cr(this.a, 2130968635));
        this.d.setTextColor(tpe.cr(this.a, 2130968635));
        this.e.setBackground(agx.a(this.a, 2131230920));
        tpe.t(this.d, (CharSequence)"");
        this.b.setBackgroundColor(0);
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
    
    protected final void pZ(final ahab ahab) {
        this.g.t((wzz)new wyt(ahab), (alhi)null);
    }
    
    protected final void qa(final int i) {
        this.i = i;
        if (!this.k) {
            final vcy f = this.f;
            aiqj aiqj;
            if ((aiqj = this.h.h) == null) {
                aiqj = aiqj.a;
            }
            f.c(aiqj, (Map)null);
            this.k = true;
        }
    }
    
    protected final void qb(final ajut ajut) {
        tpe.t(this.c, (CharSequence)acak.b(ajut));
    }
    
    protected final void qc(final ahab ahab) {
        this.e.setOnTouchListener((View$OnTouchListener)new jkt(this, ahab, 2));
    }
}
