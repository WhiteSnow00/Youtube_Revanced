import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atak extends AtomicReference implements asku, aslb, asln
{
    private static final long serialVersionUID = -8948264376121066672L;
    final asku a;
    final asmn b;
    
    public atak(final asku a, final asmn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tr(final Object o) {
        try {
            final asks asks = (asks)this.b.a(o);
            asng.b(asks, "The mapper returned a null Publisher");
            asks.aP(this);
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.a.b(t);
        }
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
