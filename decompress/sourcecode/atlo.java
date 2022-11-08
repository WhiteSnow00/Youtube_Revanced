// 
// Decompiled by Procyon v0.6.0
// 

public final class atlo implements atld
{
    public static final atlo a;
    
    static {
        a = new atlo();
    }
    
    private atlo() {
    }
    
    @Override
    public final atli getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }
    
    @Override
    public final void resumeWith(final Object o) {
        throw new IllegalStateException("This continuation is already complete");
    }
    
    @Override
    public final String toString() {
        return "This continuation is already complete";
    }
}
