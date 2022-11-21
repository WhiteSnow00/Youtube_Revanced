// 
// Decompiled by Procyon v0.6.0
// 

public final class audf extends RuntimeException
{
    public audf(final String s) {
        super(s);
    }
    
    public audf(final Throwable t) {
        super("Failed to read input", t);
    }
}
