import java.util.Iterator;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hal implements tyy
{
    public final ham a;
    
    public hal(final ham a) {
        this.a = a;
    }
    
    public final View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View viewById = layoutInflater.inflate(2131625758, viewGroup, false).findViewById(2131432411);
        viewById.setOnTouchListener((View$OnTouchListener)new gmn(4));
        (this.a.h = viewById.findViewById(2131427924)).setOnClickListener((View$OnClickListener)new gyj(this, 4));
        this.a.p(2131431500, apoy.b, viewById);
        this.a.p(2131431499, apoy.c, viewById);
        this.a.p(2131431528, apoy.d, viewById);
        this.a.n();
        return viewById;
    }
    
    public final void k() {
        final ham a = this.a;
        if (!a.m) {
            return;
        }
        final twx k = a.k;
        if (k != null) {
            k.a();
        }
        this.a.g.tu((Object)false);
        this.a.m = false;
    }
    
    public final void l() {
        final ham a = this.a;
        if (!a.m) {
            return;
        }
        a.g.tu((Object)true);
        final ham a2 = this.a;
        final twx k = a2.k;
        if (k != null) {
            k.a = ham.t(a2.u());
            k.b();
        }
        final ham a3 = this.a;
        final Iterator iterator = a3.f.iterator();
        while (iterator.hasNext()) {
            ((wyw)a3.n.a).l(a3.b((apoy)iterator.next()));
        }
    }
    
    public final void y() {
    }
    
    public final void z() {
    }
}
