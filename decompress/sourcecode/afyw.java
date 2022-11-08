// 
// Decompiled by Procyon v0.6.0
// 

public final class afyw extends RuntimeException
{
    public afyw(final String s) {
        super(s);
    }
    
    public afyw(final Throwable t) {
        super("Creating a LegacyProtoKey failed", t);
    }
}
