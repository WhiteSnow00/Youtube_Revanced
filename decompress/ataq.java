// 
// Decompiled by Procyon v0.6.0
// 

final class ataq implements asku, asln
{
    asln a;
    boolean b;
    final Object c;
    private final int d;
    
    public ataq(final asku c, final int d) {
        this.d = d;
        this.c = c;
    }
    
    public ataq(final aslb c, final int d) {
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d != 0) {
            if (this.b) {
                aqvq.w(t);
                return;
            }
            this.b = true;
            ((asku)this.c).b(t);
        }
        else {
            if (this.b) {
                aqvq.w(t);
                return;
            }
            this.b = true;
            ((aslb)this.c).b(t);
        }
    }
    
    @Override
    public final void d(final asln asln) {
        if (this.d != 0) {
            if (asmr.g(this.a, asln)) {
                this.a = asln;
                ((asku)this.c).d(this);
            }
            return;
        }
        if (asmr.g(this.a, asln)) {
            this.a = asln;
            ((aslb)this.c).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.d != 0) {
            this.a.dispose();
            return;
        }
        this.a.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        final int d = this.d;
        final Boolean value = false;
        if (d != 0) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.dispose();
            ((asku)this.c).tt(value);
            ((asku)this.c).tw();
        }
        else {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.dispose();
            ((aslb)this.c).tr(value);
        }
    }
    
    @Override
    public final void tw() {
        final int d = this.d;
        final Boolean value = true;
        if (d != 0) {
            if (this.b) {
                return;
            }
            this.b = true;
            ((asku)this.c).tt(value);
            ((asku)this.c).tw();
        }
        else {
            if (this.b) {
                return;
            }
            this.b = true;
            ((aslb)this.c).tr(value);
        }
    }
    
    @Override
    public final boolean tz() {
        if (this.d != 0) {
            return this.a.tz();
        }
        return this.a.tz();
    }
}
