// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auft implements aufp
{
    protected auft() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aufp)) {
            return false;
        }
        final aufp aufp = (aufp)o;
        return this.tO() == aufp.tO() && aujh.i((Object)this.tP(), (Object)aufp.tP());
    }
    
    @Override
    public final int hashCode() {
        return (int)(this.tO() ^ this.tO() >>> 32) + this.tP().hashCode();
    }
    
    public final aufc k() {
        return this.tP().z();
    }
    
    public final int l() {
        return this.tP().f().a(this.tO());
    }
    
    public final int m() {
        return this.tP().k().a(this.tO());
    }
    
    public final int n() {
        return this.tP().p().a(this.tO());
    }
    
    public final int o() {
        return this.tP().q().a(this.tO());
    }
    
    public final int p() {
        return this.tP().w().a(this.tO());
    }
    
    @Override
    public final String toString() {
        return auil.d.a((aufp)this);
    }
}
