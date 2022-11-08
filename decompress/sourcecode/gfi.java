import android.view.View$OnClickListener;
import android.view.View;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfi
{
    public boolean a;
    public Optional b;
    public final List c;
    private final vax d;
    private final wwu e;
    private final hnc f;
    
    public gfi(final hnc f, final vax d, final wwu e, final byte[] array, final byte[] array2) {
        this.a = false;
        this.b = Optional.empty();
        this.f = f;
        this.d = d;
        this.e = e;
        this.c = new LinkedList();
    }
    
    public static boolean g(final allx allx) {
        if (allx != null && (allx.b & 0x1) != 0x0) {
            alme alme;
            if ((alme = allx.c) == null) {
                alme = alme.a;
            }
            if (!alme.d.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    private final void k(final almd almd, final agzc agzc) {
        for (final gfg gfg : this.c) {
            gfg.e(almd, agzc);
            final Resources resources = gfg.d.getResources();
            int n;
            if (!gfg.d(almd)) {
                n = 2132017381;
            }
            else {
                n = 2132017373;
            }
            gfg.a(resources.getString(n));
        }
    }
    
    public final void a(final View view) {
        this.c.add(new gfh(view, true));
    }
    
    public final void b(final View view) {
        this.c.add(new gfg(view, false));
    }
    
    public final void c(final View view) {
        this.c.add(new gfh(view, false));
    }
    
    public final void d() {
        this.a = false;
    }
    
    public final void e() {
        this.a = true;
    }
    
    public final void f(final almd almd) {
        this.k(almd, null);
    }
    
    public final void h(final almd almd, final agzc agzc) {
        if ((((allx)agzc.instance).b & 0x1000) != 0x0) {
            this.e.n().J(3, (wxz)new wws(((allx)agzc.instance).n), (alff)null);
        }
        final allx allx = (allx)agzc.instance;
        Optional optional;
        if ((allx.b & 0x40000) != 0x0) {
            aioe aioe;
            if ((aioe = allx.r) == null) {
                aioe = aioe.a;
            }
            optional = Optional.of((Object)aioe);
        }
        else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            this.d.a((aioe)optional.get());
            return;
        }
        this.b = Optional.ofNullable((Object)almd);
        this.f.b(almd, (allx)agzc.build(), new gfe(this, 1, null), new gfe(this, 0), new gfe(this, 1, null));
    }
    
    public final void i(final agzc agzc) {
        if (agzc == null) {
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((gfg)iterator.next()).c(8);
            }
            return;
        }
        for (final gfg gfg : this.c) {
            gfg.c(0);
            gfg.b(((allx)agzc.instance).o);
            almd almd;
            if (gfg.c) {
                almd = almd.b;
            }
            else {
                almd = almd.a;
            }
            gfg.d.setOnClickListener((View$OnClickListener)new gff(this, agzc, almd));
        }
        if (g((allx)agzc.build())) {
            this.k(vwh.l(agzc), agzc);
            return;
        }
        this.j(vwh.l(agzc), agzc);
    }
    
    public final void j(final almd almd, final agzc agzc) {
        for (final gfg gfg : this.c) {
            gfg.e(almd, agzc);
            int[] array;
            if (!gfg.c) {
                array = gfg.a;
            }
            else {
                array = gfg.b;
            }
            final Resources resources = gfg.d.getResources();
            int n;
            if (agzc == null) {
                n = 0;
            }
            else if (!gfg.c) {
                n = ((allx)agzc.instance).e;
            }
            else {
                n = ((allx)agzc.instance).i;
            }
            String s;
            if (gfg.d(almd)) {
                if (n > 0) {
                    s = resources.getQuantityString(array[3], n, new Object[] { n });
                }
                else {
                    s = resources.getString(array[1]);
                }
            }
            else if (n > 0) {
                s = resources.getQuantityString(array[2], n, new Object[] { n });
            }
            else {
                s = resources.getString(array[0]);
            }
            gfg.a(s);
        }
    }
}
