// 
// Decompiled by Procyon v0.6.0
// 

final class aspl implements asjz, asln
{
    final asjz a;
    asln b;
    final aspm c;
    
    public aspl(final aspm c, final asjz a) {
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b == asmr.a) {
            aqvq.w(t);
            return;
        }
        aslv aslv = null;
        try {
            this.c.c.a(t);
        }
        finally {
            final Throwable t2;
            asjv.a(t2);
            aslv = new aslv(new Throwable[] { t, t2 });
        }
        this.a.b(aslv);
    }
    
    @Override
    public final void d(final asln b) {
        try {
            this.c.b.a(b);
            if (asmr.g(this.b, b)) {
                this.b = b;
                this.a.d(this);
            }
        }
        finally {
            final Throwable t;
            asjv.a(t);
            b.dispose();
            this.b = asmr.a;
            asms.f(t, this.a);
        }
    }
    
    @Override
    public final void dispose() {
        try {
            this.c.e.a();
        }
        finally {
            final Throwable t;
            asjv.a(t);
            aqvq.w(t);
        }
        this.b.dispose();
    }
    
    @Override
    public final void tw() {
        if (this.b == asmr.a) {
            return;
        }
        try {
            this.c.d.a();
            this.a.tw();
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.a.b(t);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.b.tz();
    }
}
