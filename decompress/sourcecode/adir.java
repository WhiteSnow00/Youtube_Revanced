// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adir extends adiy
{
    public adir(final adjo adjo) {
        super(adjo);
    }
    
    public final adku b(final adku adku) {
        if (adku == null) {
            return null;
        }
        final agza builder = adku.toBuilder();
        this.c(builder);
        return (adku)builder.build();
    }
    
    public abstract void c(final agza p0);
}
