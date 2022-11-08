// 
// Decompiled by Procyon v0.6.0
// 

public final class hkf implements fxn
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public hkf(final fax a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hkf(final krc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hkf(final rev a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hkf(final rgn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hkf(final sli a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b == 3) {
                        ((rev)this.a).a();
                        return;
                    }
                    if (b != 4) {
                        ((sli)this.a).g = true;
                        return;
                    }
                    ((rgn)this.a).c = true;
                }
                else {
                    final Object a = this.a;
                    ((krc)a).g.n((fjo)a);
                }
            }
            return;
        }
        ((rev)this.a).a();
    }
    
    public final void c() {
        final int b = this.b;
        if (b == 0) {
            ((rev)this.a).f();
            return;
        }
        boolean b2 = true;
        if (b == 1) {
            ((fax)this.a).b(aijk.b);
            return;
        }
        if (b == 2) {
            final Object a = this.a;
            ((krc)a).g.l((fjo)a);
            final krc krc = (krc)this.a;
            if (krc.l != null) {
                if (krc.q != null) {
                    if (!krc.k.f() || !krc.q.ar()) {
                        b2 = false;
                    }
                    krc.s(b2);
                }
            }
            return;
        }
        if (b == 3) {
            ((rev)this.a).f();
            return;
        }
        if (b != 4) {
            ((sli)this.a).g = false;
            return;
        }
        ((rgn)this.a).f();
    }
}
