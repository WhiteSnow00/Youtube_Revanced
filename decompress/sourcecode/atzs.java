// 
// Decompiled by Procyon v0.6.0
// 

public final class atzs extends RuntimeException
{
    public atzs(final String s) {
        super(s);
    }
    
    public atzs(final Throwable t) {
        super("Failed to read input", t);
    }
}
