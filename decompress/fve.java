import java.util.Iterator;
import com.google.protobuf.MessageLite;
import android.widget.ImageView;
import android.view.View$OnTouchListener;
import java.util.List;
import java.util.ArrayList;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.Spinner;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fve implements acko
{
    public final vcy a;
    public final fvh b;
    public final ViewGroup c;
    final Spinner d;
    public ackm e;
    private final flg f;
    private final acpk g;
    private final fvd h;
    
    public fve(final Context context, final vcy a, final flg f, final acpk g, final aeea aeea, final ViewGroup viewGroup, final int n, final int n2, final byte[] array) {
        this.a = a;
        this.f = f;
        this.g = g;
        final ViewGroup c = (ViewGroup)LayoutInflater.from(context).inflate(2131625464, viewGroup, false);
        this.c = c;
        final Spinner d = (Spinner)c.findViewById(2131431627);
        aeea.N((View)(this.d = d), aeea.M((View)d, (Drawable)null));
        final fvh c2 = fwc.c(c, d, n2, n, context.getResources().getDimensionPixelOffset(2131169794));
        this.b = c2;
        c2.a.add(new pvh(this));
        d.setAdapter((SpinnerAdapter)c2);
        this.h = new fvd(this);
    }
    
    public final View a() {
        return (View)this.c;
    }
    
    public final void b(final ackm e, final aoix aoix) {
        this.e = e;
        this.b.b = aoix.d;
        this.d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)null);
        final fvh b = this.b;
        final ahbx c = aoix.c;
        final ArrayList list = new ArrayList();
        final Iterator iterator = ((List)c).iterator();
        boolean b2;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            b2 = true;
            if (!hasNext) {
                break;
            }
            list.add(new iks((aoiw)iterator.next(), 1));
        }
        b.a(list);
        while (true) {
            for (int i = 0; i < aoix.c.size(); ++i) {
                if (((aoiw)aoix.c.get(i)).g) {
                    this.h.a = i;
                    this.d.setSelection(i, false);
                    this.d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this.h);
                    this.d.setOnTouchListener((View$OnTouchListener)new jkt(this, aoix, 1));
                    if (!fvc.b(e)) {
                        this.f.a((acko)this);
                    }
                    int a;
                    if ((aoix.b & 0x4) != 0x0) {
                        final acpk g = this.g;
                        akdi akdi;
                        if ((akdi = aoix.e) == null) {
                            akdi = akdi.a;
                        }
                        akdh akdh;
                        if ((akdh = akdh.b(akdi.c)) == null) {
                            akdh = akdh.a;
                        }
                        a = g.a(akdh);
                    }
                    else {
                        a = 0;
                    }
                    final View viewById = this.d.findViewById(2131429270);
                    if (viewById instanceof ImageView) {
                        if (a != 0) {
                            ((ImageView)viewById).setImageResource(a);
                        }
                        if (a == 0) {
                            b2 = false;
                        }
                        tpe.v(viewById, b2);
                    }
                    this.b.c = a;
                    ike.b(e, (MessageLite)aoix);
                    return;
                }
            }
            int i = 0;
            continue;
        }
    }
    
    public final void c(final acku acku) {
        final ackm e = this.e;
        if (e != null && !fvc.b(e)) {
            this.f.d((acko)this);
        }
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.b(ackm, (aoix)o);
    }
}
