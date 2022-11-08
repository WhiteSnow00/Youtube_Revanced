// 
// Decompiled by Procyon v0.6.0
// 

public class dcm implements Cloneable
{
    public dol a;
    
    public dcm() {
        this.a = doi.b;
    }
    
    public final dcm a() {
        try {
            return (dcm)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final void b(final dol a) {
        cll.h((Object)a);
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof dcm && dpg.n((Object)this.a, (Object)((dcm)o).a);
    }
    
    @Override
    public final int hashCode() {
        final dol a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
}
