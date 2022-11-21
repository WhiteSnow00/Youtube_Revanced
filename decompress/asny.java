// 
// Decompiled by Procyon v0.6.0
// 

public final class asny implements asku, asln
{
    final asku a;
    final asmi b;
    final asmc c;
    asln d;
    
    public asny(final asku a, final asmi b, final asmc c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d != asmr.a) {
            this.d = asmr.a;
            this.a.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln d) {
        try {
            this.b.a(d);
            if (asmr.g(this.d, d)) {
                this.d = d;
                this.a.d(this);
            }
        }
        finally {
            final Throwable t;
            asjv.a(t);
            d.dispose();
            this.d = asmr.a;
            asms.g(t, this.a);
        }
    }
    
    @Override
    public final void dispose() {
        final asln d = this.d;
        if (d != asmr.a) {
            this.d = asmr.a;
            try {
                this.c.a();
            }
            finally {
                final Throwable t;
                asjv.a(t);
                aqvq.w(t);
            }
            d.dispose();
        }
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        if (this.d != asmr.a) {
            this.d = asmr.a;
            this.a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.d.tz();
    }
}
