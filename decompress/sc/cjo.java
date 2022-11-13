import java.util.ArrayList;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjo extends cio
{
    final ViewGroup a;
    final View b;
    final View c;
    final cjr d;
    
    public cjo(final cjr d, final ViewGroup a, final View b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final cin cin) {
        this.c.setTag(2131431236, (Object)null);
        this.a.getOverlay().remove(this.b);
        cin.A((cim)this);
    }
    
    public final void c() {
        this.a.getOverlay().remove(this.b);
    }
    
    public final void d() {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
            return;
        }
        final cjr d = this.d;
        int size = ((cin)d).j.size();
        while (--size >= 0) {
            ((Animator)((cin)d).j.get(size)).cancel();
        }
        final ArrayList k = ((cin)d).k;
        if (k != null && k.size() > 0) {
            final ArrayList list = (ArrayList)((cin)d).k.clone();
            for (int size2 = list.size(), i = 0; i < size2; ++i) {
                ((cim)list.get(i)).b();
            }
        }
    }
}
