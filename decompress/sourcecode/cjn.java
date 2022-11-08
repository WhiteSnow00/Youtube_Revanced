import java.util.ArrayList;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjn extends cin
{
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ cjq d;
    
    public cjn(final cjq d, final ViewGroup a, final View b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final cim cim) {
        this.c.setTag(2131431233, (Object)null);
        this.a.getOverlay().remove(this.b);
        cim.A((cil)this);
    }
    
    public final void c() {
        this.a.getOverlay().remove(this.b);
    }
    
    public final void d() {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
            return;
        }
        final cjq d = this.d;
        int size = ((cim)d).j.size();
        while (--size >= 0) {
            ((Animator)((cim)d).j.get(size)).cancel();
        }
        final ArrayList k = ((cim)d).k;
        if (k != null && k.size() > 0) {
            final ArrayList list = (ArrayList)((cim)d).k.clone();
            for (int size2 = list.size(), i = 0; i < size2; ++i) {
                ((cil)list.get(i)).b();
            }
        }
    }
}
