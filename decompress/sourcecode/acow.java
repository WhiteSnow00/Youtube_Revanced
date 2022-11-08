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

public class acow extends acnn
{
    private final FrameLayout a;
    private final Context f;
    private final Optional g;
    private final boolean h;
    private final veo i;
    
    public acow(final Context f, final vax vax, final acno acno, final aeby aeby, final aeby aeby2, final bx bx, final veo i, final aeby aeby3, final Optional g, final Optional optional, final boolean h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(f, vax, acno, aeby, aeby2, bx, i, aeby3, g, optional, h, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.g = g;
        this.a = new FrameLayout(f);
        this.i = i;
        this.h = h;
    }
    
    public void a(final ameo ameo, final View anchorView, final Object d, final wwv e) {
        if (!acqn.g(this.f, this.g)) {
            final acjb c = super.c;
            final ListPopupWindow i = this.i();
            ((tdv)c).clear();
            if (this.h) {
                final afif d2 = ((afcr)this.k(ameo, d)).D();
                while (((Iterator)d2).hasNext()) {
                    final amel amel = (amel)((Iterator)d2).next();
                    c.add((Object)amel);
                    actc.j(amel, d, (aum)this.j(this.f).orElseThrow((Supplier)acmb.d), this.i, c, ((tdv)c).size() - 1, (aexg)acrp.b);
                }
            }
            else {
                ((tdv)c).addAll((Collection)this.k(ameo, d));
            }
            super.d = d;
            super.e = e;
            i.setWidth((int)tmy.f(this.f, (float)tmy.h(this.f, (ListAdapter)super.b, (ViewGroup)this.a), this.f.getResources().getDimension(2131166974)));
            i.setDropDownGravity(8388661);
            i.setAnchorView(anchorView);
            i.show();
            return;
        }
        super.a(ameo, anchorView, d, e);
    }
}
