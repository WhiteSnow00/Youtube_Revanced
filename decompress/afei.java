import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afei extends afdn
{
    final afek a;
    private final Object b;
    private int c;
    
    public afei(final afek a, final int c) {
        this.a = a;
        this.b = a.g(c);
        this.c = c;
    }
    
    private final void a() {
        final int c = this.c;
        if (c != -1 && c < this.a.size() && aexq.c(this.b, this.a.g(this.c))) {
            return;
        }
        this.c = this.a.d(this.b);
    }
    
    @Override
    public final Object getKey() {
        return this.b;
    }
    
    @Override
    public final Object getValue() {
        final Map l = this.a.l();
        if (l != null) {
            return l.get(this.b);
        }
        this.a();
        final int c = this.c;
        if (c == -1) {
            return null;
        }
        return this.a.j(c);
    }
    
    @Override
    public final Object setValue(final Object o) {
        final Map l = this.a.l();
        if (l != null) {
            return l.put(this.b, o);
        }
        this.a();
        final int c = this.c;
        if (c == -1) {
            this.a.put(this.b, o);
            return null;
        }
        final Object j = this.a.j(c);
        this.a.p(this.c, o);
        return j;
    }
}
