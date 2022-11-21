// 
// Decompiled by Procyon v0.6.0
// 

public abstract class admh extends admo
{
    public admh(final adnd adnd) {
        super(adnd);
    }
    
    public final adoj b(final adoj adoj) {
        if (adoj == null) {
            return null;
        }
        final ahcr builder = adoj.toBuilder();
        this.c(builder);
        return (adoj)builder.build();
    }
    
    public abstract void c(final ahcr p0);
}
