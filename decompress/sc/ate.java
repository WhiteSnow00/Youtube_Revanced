// 
// Decompiled by Procyon v0.6.0
// 

public final class ate extends atp
{
    public ate(final br br, final String s) {
        final StringBuilder sb = new StringBuilder("Attempting to reuse fragment ");
        sb.append(br);
        sb.append(" with previous ID ");
        sb.append(s);
        super(br, sb.toString());
    }
}
