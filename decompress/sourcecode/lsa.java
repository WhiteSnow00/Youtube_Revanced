// 
// Decompiled by Procyon v0.6.0
// 

public final class lsa extends Exception
{
    public lsa(final int n) {
        final StringBuilder sb = new StringBuilder("AudioTrack write failed: ");
        sb.append(n);
        super(sb.toString());
    }
}
