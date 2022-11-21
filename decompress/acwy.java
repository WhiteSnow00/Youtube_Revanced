// 
// Decompiled by Procyon v0.6.0
// 

public final class acwy extends RuntimeException
{
    public acwy(final int n) {
        final StringBuilder sb = new StringBuilder("Unrecognized theme type ");
        sb.append(n);
        super(sb.toString());
    }
}
