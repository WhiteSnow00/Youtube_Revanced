// 
// Decompiled by Procyon v0.6.0
// 

public final class bmb extends Exception
{
    public final String a;
    public final boolean b;
    public final blz c;
    public final String d;
    
    public bmb(final ayg ayg, final Throwable t, final boolean b, int abs) {
        final String value = String.valueOf(ayg);
        final StringBuilder sb = new StringBuilder("Decoder init failed: [");
        sb.append(abs);
        sb.append("], ");
        sb.append(value);
        final String string = sb.toString();
        final String n = ayg.n;
        abs = Math.abs(abs);
        final StringBuilder sb2 = new StringBuilder("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_");
        sb2.append(abs);
        this(string, t, n, b, null, sb2.toString());
    }
    
    public bmb(final String s, final Throwable t, final String a, final boolean b, final blz c, final String d) {
        super(s, t);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
