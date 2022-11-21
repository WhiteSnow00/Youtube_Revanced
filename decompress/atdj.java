// 
// Decompiled by Procyon v0.6.0
// 

final class atdj implements askd, asln
{
    final asku a;
    final asme b;
    Object c;
    volatile boolean d;
    boolean e;
    boolean f;
    
    public atdj(final asku a, final asme b, final Object c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        throw null;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.e) {
            aqvq.w(t);
            return;
        }
        this.e = true;
        this.a.b(t);
    }
    
    @Override
    public final void c(final Object o) {
        if (!this.e) {
            if (this.f) {
                this.b(new IllegalStateException("onNext already called in this generate turn"));
                return;
            }
            if (o == null) {
                this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f = true;
            this.a.tt(o);
        }
    }
    
    @Override
    public final void dispose() {
        this.d = true;
    }
    
    @Override
    public final boolean tz() {
        return this.d;
    }
}
