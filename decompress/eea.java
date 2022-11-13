import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eea extends nx implements dvs
{
    public final int a;
    public final int b;
    
    public eea(final int n, final int n2, final int a, final int b) {
        super(n, n2);
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final boolean c() {
        final Field a = eeb.a;
        on on;
        try {
            if (eeb.a == null) {
                (eeb.a = nx.class.getDeclaredField("c")).setAccessible(true);
            }
            on = (on)eeb.a.get(this);
        }
        catch (final Exception ex) {
            on = null;
        }
        return on != null && on.b() == -1;
    }
}
