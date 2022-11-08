import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lri extends IOException
{
    public lri(final Throwable t) {
        super("Failed to query underlying media codecs", t);
    }
}
