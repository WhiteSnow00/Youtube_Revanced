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

public class acsl extends acrc
{
    private final FrameLayout a;
    private final Context f;
    private final Optional g;
    private final boolean h;
    private final vhw i;
    
    public acsl(final Context f, final veh veh, final acrd acrd, final aefs aefs, final aefs aefs2, final bx bx, final vhw i, final adgg adgg, final Optional g, final Optional optional, final boolean h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(f, veh, acrd, aefs, aefs2, bx, i, adgg, g, optional, h, null, null, null, null, null, null, null);
        this.f = f;
        this.g = g;
        this.a = new FrameLayout(f);
        this.i = i;
        this.h = h;
    }
    
    @Override
    public void a(final amiv amiv, final View anchorView, final Object d, final xab e) {
        if (!acud.g(this.f, this.g)) {
            final acmr c = super.c;
            final ListPopupWindow i = this.i();
            c.clear();
            if (this.h) {
                final aflv d2 = ((afgh)this.k(amiv, d)).D();
                while (((Iterator)d2).hasNext()) {
                    final amis amis = (amis)((Iterator)d2).next();
                    c.add((Object)amis);
                    aamz.s(amis, d, (aup)this.j(this.f).orElseThrow((Supplier)achh.e), this.i, c, c.size() - 1, (afax)accj.e);
                }
            }
            else {
                c.addAll((Collection)this.k(amiv, d));
            }
            super.d = d;
            super.e = e;
            i.setWidth((int)tqf.f(this.f, (float)tqf.h(this.f, (ListAdapter)super.b, (ViewGroup)this.a), this.f.getResources().getDimension(2131166976)));
            i.setDropDownGravity(8388661);
            i.setAnchorView(anchorView);
            i.show();
            return;
        }
        super.a(amiv, anchorView, d, e);
    }
}
