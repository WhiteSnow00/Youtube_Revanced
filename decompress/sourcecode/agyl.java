import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agyl extends IOException
{
    private static final long serialVersionUID = -6947486886997889499L;
    
    agyl() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
    
    public agyl(final String s, final Throwable t) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(s)), t);
    }
    
    public agyl(final Throwable t) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", t);
    }
}
