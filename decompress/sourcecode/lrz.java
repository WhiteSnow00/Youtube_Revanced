// 
// Decompiled by Procyon v0.6.0
// 

public final class lrz extends Exception
{
    public lrz(final int n, final int n2, final int n3, final int n4) {
        final StringBuilder sb = new StringBuilder("AudioTrack init failed: ");
        sb.append(n);
        sb.append(", Config(");
        sb.append(n2);
        sb.append(", ");
        sb.append(n3);
        sb.append(", ");
        sb.append(n4);
        sb.append(")");
        super(sb.toString());
    }
}
