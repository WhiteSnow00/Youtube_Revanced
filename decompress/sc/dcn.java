// 
// Decompiled by Procyon v0.6.0
// 

public class dcn implements Cloneable
{
    public dom a;
    
    public dcn() {
        this.a = doj.b;
    }
    
    public final dcn a() {
        try {
            return (dcn)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final void b(final dom a) {
        clm.h((Object)a);
        this.a = a;
    }
    
    public final /* bridge */ Object clone() {
        return this.a();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof dcn && dph.m((Object)this.a, (Object)((dcn)o).a);
    }
    
    @Override
    public final int hashCode() {
        final dom a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
}
