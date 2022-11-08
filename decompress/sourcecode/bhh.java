// 
// Decompiled by Procyon v0.6.0
// 

public final class bhh extends Exception
{
    public bhh(final long n, final long n2) {
        final StringBuilder sb = new StringBuilder("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(n2);
        sb.append(", got ");
        sb.append(n);
        super(sb.toString());
    }
}
