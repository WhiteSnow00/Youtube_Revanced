import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asau
{
    private final ArrayList a;
    
    public asau() {
        this.a = new ArrayList();
    }
    
    public final void a(final Object o) {
        this.a.add(o.toString());
    }
    
    public final void b(final String s, final Object o) {
        final ArrayList a = this.a;
        final String value = String.valueOf(o);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("=");
        sb.append(value);
        a.add(sb.toString());
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
