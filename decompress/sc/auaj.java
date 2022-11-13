// 
// Decompiled by Procyon v0.6.0
// 

public final class auaj extends RuntimeException
{
    public auaj(final String s) {
        super(s);
    }
    
    public auaj(final Throwable t) {
        super("Failed to read input", t);
    }
}
