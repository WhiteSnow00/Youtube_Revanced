import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hud extends ades
{
    private View a;
    private View b;
    private View c;
    private int d;
    private boolean e;
    
    public hud(final bu bu) {
        super(bu);
        this.d = 0;
        this.e = false;
    }
    
    private final void h(final aezp aezp) {
        if (aezp.h()) {
            super.c((anmz)aezp.c());
        }
        else {
            super.b();
        }
        final int d = this.d;
        if (d > 0) {
            this.d = d - 1;
            this.i();
        }
    }
    
    private final void i() {
        if (this.d == 0) {
            final View a = this.a;
            a.getClass();
            a.setVisibility(0);
            final View b = this.b;
            b.getClass();
            b.setVisibility(0);
            final View c = this.c;
            c.getClass();
            c.setVisibility(8);
            return;
        }
        final View a2 = this.a;
        a2.getClass();
        a2.setVisibility(8);
        final View b2 = this.b;
        b2.getClass();
        b2.setVisibility(8);
        final View c2 = this.c;
        c2.getClass();
        c2.setVisibility(0);
    }
    
    private final void j(final aqfw aqfw, final oup oup, final aezp aezp) {
        if (aezp.h()) {
            super.g(aqfw, oup, (anmz)aezp.c());
        }
        else {
            super.f(aqfw, oup);
        }
        ++this.d;
        this.i();
    }
    
    public final void a() {
        while (this.d > 0) {
            this.b();
        }
    }
    
    public final void b() {
        adkp.Q(this.e);
        this.h((aezp)aeyo.a);
    }
    
    public final void c(final anmz anmz) {
        adkp.Q(this.e);
        this.h(aezp.k((Object)anmz));
    }
    
    public final void d(final View a, final View b, final View c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.i();
        this.e = true;
    }
    
    public final boolean e() {
        return this.d > 0;
    }
    
    public final void f(final aqfw aqfw, final oup oup) {
        adkp.Q(this.e);
        this.j(aqfw, oup, (aezp)aeyo.a);
    }
    
    public final void g(final aqfw aqfw, final oup oup, final anmz anmz) {
        adkp.Q(this.e);
        this.j(aqfw, oup, aezp.k((Object)anmz));
    }
}
