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

public final class fuv implements acil
{
    public final vax a;
    public final fuy b;
    public final ViewGroup c;
    final Spinner d;
    public acij e;
    private final fkz f;
    private final acng g;
    private final fuu h;
    
    public fuv(final Context context, final vax a, final fkz f, final acng g, final adcr adcr, final ViewGroup viewGroup, final int n, final int n2, final byte[] array) {
        this.a = a;
        this.f = f;
        this.g = g;
        final ViewGroup c = (ViewGroup)LayoutInflater.from(context).inflate(2131625459, viewGroup, false);
        this.c = c;
        final Spinner d = (Spinner)c.findViewById(2131431624);
        adcr.b((View)(this.d = d), adcr.a((View)d, (Drawable)null));
        final fuy c2 = fvu.c(c, d, n2, n, context.getResources().getDimensionPixelOffset(2131169793));
        this.b = c2;
        c2.a.add(new qpt(this));
        d.setAdapter((SpinnerAdapter)c2);
        this.h = new fuu(this);
    }
    
    public final View a() {
        return (View)this.c;
    }
    
    public final void b(final acij e, final aogu aogu) {
        this.e = e;
        this.b.b = aogu.d;
        this.d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)null);
        final fuy b = this.b;
        final agzy c = aogu.c;
        final ArrayList list = new ArrayList();
        final Iterator iterator = ((List)c).iterator();
        boolean b2;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            b2 = true;
            if (!hasNext) {
                break;
            }
            list.add(new ijv((aogt)iterator.next(), 1));
        }
        b.a(list);
        while (true) {
            for (int i = 0; i < aogu.c.size(); ++i) {
                if (((aogt)aogu.c.get(i)).g) {
                    this.h.a = i;
                    this.d.setSelection(i, false);
                    this.d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this.h);
                    this.d.setOnTouchListener((View$OnTouchListener)new jjr(this, aogu, 1));
                    if (!fut.b(e)) {
                        this.f.a((acil)this);
                    }
                    int a;
                    if ((aogu.b & 0x4) != 0x0) {
                        final acng g = this.g;
                        akbf akbf;
                        if ((akbf = aogu.e) == null) {
                            akbf = akbf.a;
                        }
                        akbe akbe;
                        if ((akbe = akbe.b(akbf.c)) == null) {
                            akbe = akbe.a;
                        }
                        a = g.a(akbe);
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
                        tmy.v(viewById, b2);
                    }
                    this.b.c = a;
                    iji.b(e, (MessageLite)aogu);
                    return;
                }
            }
            int i = 0;
            continue;
        }
    }
    
    public final void c(final acir acir) {
        final acij e = this.e;
        if (e != null && !fut.b(e)) {
            this.f.d((acil)this);
        }
    }
}
