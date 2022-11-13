// 
// Decompiled by Procyon v0.6.0
// 

public final class dbr implements dbo
{
    final dnq a;
    
    public dbr(final dnq a) {
        this.a = a;
    }
    
    @Override
    public final dnq a() {
        final dnq a = this.a;
        if (a != null) {
            return a;
        }
        return new dnq();
    }
}
