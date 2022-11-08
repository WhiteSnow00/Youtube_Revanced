// 
// Decompiled by Procyon v0.6.0
// 

public final class bhi extends Exception
{
    public final int a;
    public final boolean b;
    public final ayf c;
    
    public bhi(final int a, final ayf c, final boolean b) {
        final StringBuilder sb = new StringBuilder("AudioTrack write failed: ");
        sb.append(a);
        super(sb.toString());
        this.b = b;
        this.a = a;
        this.c = c;
    }
}
