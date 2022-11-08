// 
// Decompiled by Procyon v0.6.0
// 

public final class atm extends ato
{
    public atm(final br br, final boolean b) {
        final StringBuilder sb = new StringBuilder("Attempting to set user visible hint to ");
        sb.append(b);
        sb.append(" for fragment ");
        sb.append(br);
        super(br, sb.toString());
    }
}
