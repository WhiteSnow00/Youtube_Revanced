import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class hpc extends ckp
{
    final hpe a;
    private final cl c;
    private ct d;
    private br e;
    private boolean f;
    
    public hpc(final hpe a, final cl c) {
        this.a = a;
        this.f = false;
        this.c = c;
    }
    
    public final Object c(final ViewGroup viewGroup, final int n) {
        if (this.d == null) {
            this.d = this.c.i();
        }
        final long n2 = n;
        final cl c = this.c;
        String s;
        if (n2 == 0L) {
            s = "reel_watch_fragment_in_pager";
        }
        else {
            s = "reel_browse_fragment_in_pager";
        }
        final br f = c.f(s);
        Object o;
        if (f == null) {
            final hpe a = this.a;
            Object al;
            if (n == 0) {
                al = how.aL(a.af);
            }
            else {
                final gvm aq = gvm.aQ(aiqj.a);
                Bundle m;
                if ((m = ((br)aq).m) == null) {
                    m = new Bundle();
                }
                m.putBoolean("ReelBrowseFragment.isInReelWatchPagerFragment", true);
                aq.ag(m);
                al = aq;
            }
            if (n == 0) {
                this.a.aO((br)al);
            }
            else if (al instanceof gva) {
                this.a.aN((gva)al);
            }
            final ct d = this.d;
            o = al;
            if (d != null) {
                d.r(viewGroup.getId(), (br)al, s);
                o = al;
            }
        }
        else {
            final ct d2 = this.d;
            o = f;
            if (d2 != null) {
                d2.u(f);
                o = f;
            }
        }
        if (!adkp.ae(o, this.e)) {
            ((br)o).aj(false);
            ((br)o).ao(false);
        }
        return o;
    }
    
    public final void d(final ViewGroup viewGroup, final int n, final Object o) {
        final br br = (br)o;
        if (this.d == null) {
            this.d = this.c.i();
        }
        this.d.l(br);
        if (adkp.ae(br, this.e)) {
            this.e = null;
        }
    }
    
    public final boolean g(final View view, final Object o) {
        return ((br)o).O == view;
    }
    
    public final void h() {
        if (this.d != null) {
            if (!this.f && !this.c.Z()) {
                try {
                    this.f = true;
                    final ct d = this.d;
                    if (d != null) {
                        d.d();
                    }
                }
                finally {
                    this.f = false;
                }
            }
            this.d = null;
        }
    }
    
    public final void i(final ViewGroup viewGroup, final Object o) {
        final br e = (br)o;
        if (!adkp.ae(e, this.e)) {
            final br e2 = this.e;
            if (e2 != null) {
                e2.aj(false);
                this.e.ao(false);
            }
            if (e != null) {
                e.aj(true);
                e.ao(true);
            }
            this.e = e;
        }
    }
    
    public final int j() {
        return 2;
    }
}
