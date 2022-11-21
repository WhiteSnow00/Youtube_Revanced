// 
// Decompiled by Procyon v0.6.0
// 

final class affi extends afdn
{
    final Object a;
    int b;
    final affr c;
    
    public affi(final affr c, final int b) {
        this.c = c;
        this.a = c.a[b];
        this.b = b;
    }
    
    final void a() {
        final int b = this.b;
        if (b != -1) {
            final affr c = this.c;
            if (b <= c.c) {
                if (aexq.c(c.a[b], this.a)) {
                    return;
                }
            }
        }
        this.b = this.c.c(this.a);
    }
    
    @Override
    public final Object getKey() {
        return this.a;
    }
    
    @Override
    public final Object getValue() {
        this.a();
        final int b = this.b;
        if (b == -1) {
            return null;
        }
        return this.c.b[b];
    }
    
    @Override
    public final Object setValue(final Object o) {
        this.a();
        final int b = this.b;
        if (b == -1) {
            this.c.put(this.a, o);
            return null;
        }
        final Object o2 = this.c.b[b];
        if (aexq.c(o2, o)) {
            return o;
        }
        this.c.o(this.b, o);
        return o2;
    }
}
