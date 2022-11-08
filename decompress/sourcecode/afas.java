import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afas extends aezw
{
    final /* synthetic */ afau a;
    private final Object b;
    private int c;
    
    public afas(final afau a, final int c) {
        this.a = a;
        this.b = a.g(c);
        this.c = c;
    }
    
    private final void a() {
        final int c = this.c;
        if (c != -1 && c < this.a.size() && aeda.v(this.b, this.a.g(this.c))) {
            return;
        }
        this.c = this.a.d(this.b);
    }
    
    public final Object getKey() {
        return this.b;
    }
    
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
