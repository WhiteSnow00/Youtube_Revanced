// 
// Decompiled by Procyon v0.6.0
// 

final class affj extends afdn
{
    final affr a;
    final Object b;
    int c;
    
    public affj(final affr a, final int c) {
        this.a = a;
        this.b = a.b[c];
        this.c = c;
    }
    
    private final void a() {
        final int c = this.c;
        if (c != -1) {
            final affr a = this.a;
            if (c <= a.c) {
                if (aexq.c(this.b, a.b[c])) {
                    return;
                }
            }
        }
        this.c = this.a.e(this.b);
    }
    
    @Override
    public final Object getKey() {
        return this.b;
    }
    
    @Override
    public final Object getValue() {
        this.a();
        final int c = this.c;
        if (c == -1) {
            return null;
        }
        return this.a.a[c];
    }
    
    @Override
    public final Object setValue(final Object o) {
        this.a();
        final int c = this.c;
        if (c == -1) {
            this.a.m(this.b, o);
            return null;
        }
        final Object o2 = this.a.a[c];
        if (aexq.c(o2, o)) {
            return o;
        }
        this.a.n(this.c, o);
        return o2;
    }
}
