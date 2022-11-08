import java.util.Iterator;
import android.support.v7.widget.RecyclerView;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class kda extends iw
{
    public final Set a;
    final /* synthetic */ kde b;
    
    public kda(final kde b) {
        this.b = b;
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void b(final RecyclerView recyclerView, int o) {
        if (o != 0) {
            if (o == 1) {
                final kde b = this.b;
                if (!b.p) {
                    b.p = true;
                    b.h();
                    final kde b2 = this.b;
                    b2.o = b2.t.K();
                }
            }
        }
        else {
            if (this.b.t.K() != -1) {
                final kde b3 = this.b;
                b3.l = b3.t.K();
            }
            this.b.m();
            final kde b4 = this.b;
            if (b4.n != null && b4.k != null && b4.p) {
                o = b4.o;
                if (o != b4.l) {
                    final Object value = ((tdv)b4.f).get(o);
                    if (value instanceof ajax) {
                        final ajax ajax = (ajax)value;
                        if ((ajax.b & 0x400000) != 0x0) {
                            b4.k.J(65, (wxz)new wws(ajax.x.I()), (alff)null);
                        }
                    }
                }
            }
            final kde b5 = this.b;
            b5.p = false;
            b5.l();
            this.b.r();
        }
        final kde b6 = this.b;
        ((tdv)b6.f).get(b6.l);
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((jzy)iterator.next()).a();
        }
    }
}
