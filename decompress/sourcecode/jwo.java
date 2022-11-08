import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import android.widget.TextView;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.MenuItem;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwo implements View$OnClickListener, fyz, fzp, fzi
{
    public View$OnLongClickListener a;
    private final acts b;
    private final LayoutInflater c;
    private final Resources d;
    private final wwv e;
    private final aibb f;
    private final vax g;
    private final acng h;
    private final acuj i;
    private final List j;
    private final zoz k;
    private ImageView l;
    private String m;
    private int n;
    private View o;
    private mnk p;
    private final mrm q;
    private final ardu r;
    
    public jwo(final vax g, final acng h, final acts b, final Context context, final arcq arcq, final acuj i, final zoz k, final mrm q, final wwv e, final aibb f, final List j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = LayoutInflater.from(context);
        this.d = context.getResources();
        this.g = g;
        this.h = h;
        this.i = i;
        this.e = e;
        this.f = f;
        this.q = q;
        this.r = arcq.u();
        this.j = j;
        this.k = k;
    }
    
    public final void a(final tnw tnw, final int n) {
        if (n == tmy.cn(this.l.getContext(), 2130970864)) {
            final ImageView l = this.l;
            l.setImageDrawable(tnw.b(l.getDrawable(), tmy.cn(this.l.getContext(), 2130970924)));
            return;
        }
        final ImageView i = this.l;
        i.setImageDrawable(tnw.b(i.getDrawable(), n));
    }
    
    public final void f(final String m) {
        this.m = m;
    }
    
    public final void g() {
        this.n = 10349;
    }
    
    public final int j() {
        return this.r.m();
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return this;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        final View o = this.o;
        int i = 0;
        if (o == null) {
            final View inflate = this.c.inflate(2131624837, (ViewGroup)null, false);
            this.o = inflate;
            this.l = (ImageView)inflate.findViewById(2131429831);
            this.p = new mnk(adof.f((ViewStub)this.o.findViewById(2131430049), (Class)View.class), adof.f((ViewStub)this.o.findViewById(2131430048), (Class)TextView.class), this.q, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        menuItem.setShowAsAction(2);
        final acng h = this.h;
        akbf akbf;
        if ((akbf = this.f.g) == null) {
            akbf = akbf.a;
        }
        akbe akbe;
        if ((akbe = akbe.b(akbf.c)) == null) {
            akbe = akbe.a;
        }
        this.l.setImageDrawable(this.d.getDrawable(h.a(akbe)));
        this.l.setContentDescription(this.r());
        this.l.setOnClickListener((View$OnClickListener)this);
        final View$OnLongClickListener a = this.a;
        if (a != null) {
            this.l.setOnLongClickListener(a);
        }
        menuItem.setActionView(this.o);
        final aibb f = this.f;
        if ((f.b & 0x2000) != 0x0) {
            ajzn ajzn;
            if ((ajzn = f.m) == null) {
                ajzn = ajzn.a;
            }
            if (ajzn.b == 102716411) {
                final acts b = this.b;
                ajzn ajzn2;
                if ((ajzn2 = this.f.m) == null) {
                    ajzn2 = ajzn.a;
                }
                ajzl a2;
                if (ajzn2.b == 102716411) {
                    a2 = (ajzl)ajzn2.c;
                }
                else {
                    a2 = ajzl.a;
                }
                final ImageView l = this.l;
                ajzn ajzn3;
                if ((ajzn3 = this.f.m) == null) {
                    ajzn3 = ajzn.a;
                }
                b.b(a2, (View)l, ajzn3, this.e);
            }
        }
        final aibb f2 = this.f;
        if ((f2.b & 0x1000) != 0x0) {
            this.i.d(f2.k, (View)this.l);
        }
        if (!this.j.isEmpty()) {
            final mnk p = this.p;
            final zoz k = this.k;
            final List j = this.j;
            final String[] array = j.toArray(new String[j.size()]);
            final ArrayList list = new ArrayList();
            while (i < array.length) {
                list.add(((asgt)k.b(array[i])).J().R().p());
                ++i;
            }
            final zon zon = new zon(2);
            final int a3 = asgt.a;
            asjv.c(a3, "bufferSize");
            final asnd asnd = new asnd((Iterable)list, (asjc)zon, a3);
            final asjc m = aulo.j;
            final Object d = p.d;
            if (d != null) {
                athh.f((AtomicReference)d);
                p.d = null;
            }
            p.d = ((asgt)asnd).al((asix)new jyo(p, 19, (byte[])null));
            final Object d2 = p.d;
            if (d2 != null) {
                ((mrm)p.a).A((Callable)new kbe((asic)d2, 3));
            }
        }
    }
    
    public final void onClick(final View view) {
        final aibb f = this.f;
        if ((f.b & 0x800000) != 0x0) {
            this.e.J(3, (wxz)new wws(f.w), (alff)null);
        }
        final HashMap hashMap = new HashMap(2);
        hashMap.put("parent_csn", this.m);
        hashMap.put("parent_ve_type", this.n);
        final aibb f2 = this.f;
        if ((f2.b & 0x10000) != 0x0) {
            final vax g = this.g;
            aioe aioe;
            if ((aioe = f2.p) == null) {
                aioe = aioe.a;
            }
            g.c(aioe, (Map)hashMap);
        }
        final aibb f3 = this.f;
        if ((f3.b & 0x4000) != 0x0) {
            final vax g2 = this.g;
            aioe aioe2;
            if ((aioe2 = f3.n) == null) {
                aioe2 = aioe.a;
            }
            g2.c(aioe2, (Map)hashMap);
        }
        final aibb f4 = this.f;
        if ((f4.b & 0x8000) != 0x0) {
            final vax g3 = this.g;
            aioe aioe3;
            if ((aioe3 = f4.o) == null) {
                aioe3 = aioe.a;
            }
            g3.c(aioe3, (Map)hashMap);
        }
    }
    
    public final boolean p() {
        return false;
    }
    
    public final int q() {
        return this.r.a + 1000;
    }
    
    public final CharSequence r() {
        ahgn ahgn;
        if ((ahgn = this.f.t) == null) {
            ahgn = ahgn.a;
        }
        ahgm ahgm;
        if ((ahgm = ahgn.c) == null) {
            ahgm = ahgm.a;
        }
        if ((ahgm.b & 0x2) != 0x0) {
            ahgn ahgn2;
            if ((ahgn2 = this.f.t) == null) {
                ahgn2 = ahgn.a;
            }
            ahgm ahgm2;
            if ((ahgm2 = ahgn2.c) == null) {
                ahgm2 = ahgm.a;
            }
            return ahgm2.c;
        }
        final ahgm s = this.f.s;
        ahgm a;
        if (s == null) {
            a = ahgm.a;
        }
        else {
            a = s;
        }
        if ((a.b & 0x2) != 0x0) {
            ahgm a2;
            if ((a2 = s) == null) {
                a2 = ahgm.a;
            }
            return a2.c;
        }
        return "";
    }
}
