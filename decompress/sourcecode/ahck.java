// 
// Decompiled by Procyon v0.6.0
// 

final class ahck extends IllegalArgumentException
{
    public ahck(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
        sb.append(n);
        sb.append(" of ");
        sb.append(n2);
        super(sb.toString());
    }
}
