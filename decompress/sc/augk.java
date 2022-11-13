// 
// Decompiled by Procyon v0.6.0
// 

public abstract class augk implements augg
{
    protected augk() {
    }
    
    public final /* bridge */ int compareTo(final Object o) {
        final augg augg = (augg)o;
        int n = 0;
        if (this != augg) {
            final long tr = augg.tR();
            final long tr2 = this.tR();
            if (tr2 != tr) {
                if (tr2 >= tr) {
                    return 1;
                }
                n = -1;
            }
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof augg)) {
            return false;
        }
        final augg augg = (augg)o;
        return this.tR() == augg.tR() && atoc.l((Object)this.tS(), (Object)augg.tS());
    }
    
    @Override
    public final int hashCode() {
        return (int)(this.tR() ^ this.tR() >>> 32) + this.tS().hashCode();
    }
    
    public final auft k() {
        return this.tS().z();
    }
    
    public final int l() {
        return this.tS().f().a(this.tR());
    }
    
    public final int m() {
        return this.tS().k().a(this.tR());
    }
    
    public final int n() {
        return this.tS().p().a(this.tR());
    }
    
    public final int o() {
        return this.tS().q().a(this.tR());
    }
    
    public final int p() {
        return this.tS().w().a(this.tR());
    }
    
    @Override
    public final String toString() {
        return aujc.d.a((augg)this);
    }
}
