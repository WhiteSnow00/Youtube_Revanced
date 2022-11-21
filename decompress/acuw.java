import java.util.Map;
import java.util.Iterator;
import java.util.List;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.EditText;
import android.view.ViewGroup;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acuw implements acmb
{
    public final Handler a;
    public final ViewGroup b;
    public final Runnable c;
    public acuv d;
    public EditText e;
    private final Context f;
    private final xab g;
    private final LinearLayout h;
    private final ImageView i;
    private final ImageView j;
    private ackw k;
    private final agop l;
    
    public acuw(final Context f, final xab g, final Handler a, final agop l, final ViewGroup b, final byte[] array, final byte[] array2) {
        this.c = (Runnable)new acan(this, 11);
        this.f = f;
        this.g = g;
        this.a = a;
        this.b = b;
        this.l = l;
        this.h = (LinearLayout)b.findViewById(2131428846);
        this.i = (ImageView)b.findViewById(2131429478);
        this.j = (ImageView)b.findViewById(2131427754);
    }
    
    private final void d(final ajqj ajqj, final aclz aclz) {
        final ackw k = this.k;
        this.h.addView(k.f(k.d(aclz), ajqj, (ViewGroup)this.h), new ViewGroup$LayoutParams(-1, -2));
    }
    
    @Override
    public final View a() {
        return (View)this.b;
    }
    
    public final void b(final aclz aclz, final ajql ajql) {
        this.h.removeAllViews();
        this.i.setOnClickListener((View$OnClickListener)new zhw(this, 20));
        this.j.setOnTouchListener((View$OnTouchListener)new acut(this, 0));
        this.k = new acuu(this.f, (acmh)aclz.c("VIEW_POOL_KEY"));
        aclz.a(this.g);
        Label_0210: {
            if ((ajql.b & 0x1000) == 0x0 || ajql.e.H()) {
                if ((ajql.b & 0x800) == 0x0) {
                    break Label_0210;
                }
                ahjl ahjl;
                if ((ahjl = ajql.d) == null) {
                    ahjl = ahjl.a;
                }
                if (ahjl.c == 0) {
                    break Label_0210;
                }
            }
            wzy wzy;
            if ((ajql.b & 0x1000) != 0x0) {
                wzy = new wzy(ajql.e.I());
            }
            else {
                ahjl ahjl2;
                if ((ahjl2 = ajql.d) == null) {
                    ahjl2 = ahjl.a;
                }
                wzy = new wzy(xbf.c(ahjl2.c));
            }
            this.g.l((xbe)wzy);
        }
        for (final ajqk ajqk : ajql.c) {
            if (ajqk.b == 126326585) {
                this.d((ajqj)ajqk.c, aclz);
            }
            if (ajqk.b == 171549018) {
                final ajqn ajqn = (ajqn)ajqk.c;
                final Iterator<Object> iterator2 = ((List<Object>)ajqn.e).iterator();
                long n = 0L;
                while (iterator2.hasNext()) {
                    final ajqh ajqh = ((Map<K, ajqh>)this.l.a).get(iterator2.next());
                    if (ajqh == null || !ajqh.h) {
                        ++n;
                    }
                }
                if (n < ajqn.e.size()) {
                    final ackw k = this.k;
                    this.h.addView(k.f(k.d(aclz), ajqn, (ViewGroup)this.h), new ViewGroup$LayoutParams(-1, -2));
                }
                else {
                    final ahcr builder = ((ahcz)ajqj.a).createBuilder();
                    final String c = ajqn.c;
                    builder.copyOnWrite();
                    final ajqj ajqj = (ajqj)builder.instance;
                    c.getClass();
                    ajqj.b |= 0x1;
                    ajqj.c = c;
                    ajws d;
                    if ((d = ajqn.d) == null) {
                        d = ajws.a;
                    }
                    builder.copyOnWrite();
                    final ajqj ajqj2 = (ajqj)builder.instance;
                    d.getClass();
                    ajqj2.d = d;
                    ajqj2.b |= 0x2;
                    final ahdp e = ajqn.e;
                    builder.copyOnWrite();
                    final ajqj ajqj3 = (ajqj)builder.instance;
                    final ahdp e2 = ajqj3.e;
                    if (!e2.c()) {
                        ajqj3.e = ahcz.mutableCopy(e2);
                    }
                    ahbc.addAll((Iterable)e, (List)ajqj3.e);
                    ahjl f;
                    if ((f = ajqn.g) == null) {
                        f = ahjl.a;
                    }
                    builder.copyOnWrite();
                    final ajqj ajqj4 = (ajqj)builder.instance;
                    f.getClass();
                    ajqj4.f = f;
                    ajqj4.b |= 0x20;
                    final ahbt h = ajqn.h;
                    builder.copyOnWrite();
                    final ajqj ajqj5 = (ajqj)builder.instance;
                    h.getClass();
                    ajqj5.b |= 0x40;
                    ajqj5.g = h;
                    this.d((ajqj)builder.build(), aclz);
                }
            }
        }
    }
    
    @Override
    public final void c(final acmh acmh) {
        final ackw k = this.k;
        if (k != null) {
            k.e(this.b);
        }
        this.h.removeAllViews();
    }
    
    @Override
    public final /* bridge */ void mK(final aclz aclz, final Object o) {
        this.b(aclz, (ajql)o);
    }
}
