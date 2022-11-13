import java.util.Iterator;
import android.widget.ListPopupWindow;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.Collection;
import java.util.function.Supplier;
import android.view.View;
import j$.util.Optional;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class acra extends acpr
{
    private final FrameLayout a;
    private final Context f;
    private final Optional g;
    private final boolean h;
    private final vgo i;
    
    public acra(final Context f, final vcy vcy, final acps acps, final aeea aeea, final aeea aeea2, final bx bx, final vgo i, final aeea aeea3, final Optional g, final Optional optional, final boolean h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(f, vcy, acps, aeea, aeea2, bx, i, aeea3, g, optional, h, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.g = g;
        this.a = new FrameLayout(f);
        this.i = i;
        this.h = h;
    }
    
    public void a(final amgs amgs, final View anchorView, final Object d, final wyw e) {
        if (!acsr.g(this.f, this.g)) {
            final acle c = super.c;
            final ListPopupWindow i = this.i();
            ((tfz)c).clear();
            if (this.h) {
                final afkf d2 = ((afeq)this.k(amgs, d)).D();
                while (((Iterator)d2).hasNext()) {
                    final amgp amgp = (amgp)((Iterator)d2).next();
                    c.add((Object)amgp);
                    aald.p(amgp, d, (aun)this.j(this.f).orElseThrow((Supplier)acoe.d), this.i, c, ((tfz)c).size() - 1, (aezf)abvp.f);
                }
            }
            else {
                ((tfz)c).addAll((Collection)this.k(amgs, d));
            }
            super.d = d;
            super.e = e;
            i.setWidth((int)tpe.f(this.f, (float)tpe.h(this.f, (ListAdapter)super.b, (ViewGroup)this.a), this.f.getResources().getDimension(2131166973)));
            i.setDropDownGravity(8388661);
            i.setAnchorView(anchorView);
            i.show();
            return;
        }
        super.a(amgs, anchorView, d, e);
    }
}
