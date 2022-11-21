// 
// Decompiled by Procyon v0.6.0
// 

public abstract class admn extends admh
{
    private final adog a;
    
    public admn(final adnd adnd, final adog a) {
        super(adnd);
        this.a = a;
    }
    
    @Override
    public final void c(final ahcr ahcr) {
        try {
            this.d().a(ahcr, this.a);
            this.e(ahcr);
        }
        catch (final Exception ex) {
            throw new RuntimeException("Could not apply the setState BiFunction.", ex);
        }
    }
    
    public abstract asme d();
    
    public void e(final ahcr ahcr) {
    }
}
