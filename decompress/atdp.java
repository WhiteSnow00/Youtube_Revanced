// 
// Decompiled by Procyon v0.6.0
// 

final class atdp implements asku, asln
{
    asln a;
    final Object b;
    private final int c;
    
    public atdp(final asjz b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public atdp(final asku b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int c = this.c;
        if (c == 0) {
            ((asku)this.b).b(t);
            return;
        }
        if (c == 1) {
            ((asku)this.b).b(t);
            return;
        }
        if (c != 2) {
            asng.b(t, "error is null");
            ((asku)this.b).tt(new asko(atli.b(t)));
            ((asku)this.b).tw();
            return;
        }
        ((asjz)this.b).b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        final int c = this.c;
        if (c == 0) {
            this.a = asln;
            ((asku)this.b).d(this);
            return;
        }
        if (c == 1) {
            if (asmr.g(this.a, asln)) {
                this.a = asln;
                ((asku)this.b).d(this);
            }
            return;
        }
        if (c != 2) {
            if (asmr.g(this.a, asln)) {
                this.a = asln;
                ((asku)this.b).d(this);
            }
            return;
        }
        this.a = asln;
        ((asjz)this.b).d(this);
    }
    
    @Override
    public final void dispose() {
        final int c = this.c;
        if (c == 0) {
            this.a.dispose();
            return;
        }
        if (c == 1) {
            this.a.dispose();
            return;
        }
        if (c != 2) {
            this.a.dispose();
            return;
        }
        this.a.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    final Object b = this.b;
                    asng.b(o, "value is null");
                    ((asku)b).tt(new asko(o));
                }
                return;
            }
            ((asku)this.b).tt(o);
        }
    }
    
    @Override
    public final void tw() {
        final int c = this.c;
        if (c == 0) {
            ((asku)this.b).tw();
            return;
        }
        if (c == 1) {
            ((asku)this.b).tw();
            return;
        }
        if (c != 2) {
            ((asku)this.b).tt(asko.a);
            ((asku)this.b).tw();
            return;
        }
        ((asjz)this.b).tw();
    }
    
    @Override
    public final boolean tz() {
        final int c = this.c;
        if (c == 0) {
            return this.a.tz();
        }
        if (c == 1) {
            return this.a.tz();
        }
        if (c != 2) {
            return this.a.tz();
        }
        return this.a.tz();
    }
}
