// 
// Decompiled by Procyon v0.6.0
// 

public final class bhf extends Exception
{
    public final int a;
    public final boolean b;
    public final ayf c;
    
    public bhf(final int a, final int n, final int n2, final int n3, final ayf c, final boolean b, final Exception ex) {
        String s;
        if (!b) {
            s = "";
        }
        else {
            s = " (recoverable)";
        }
        final StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(a);
        sb.append(" Config(");
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        sb.append(", ");
        sb.append(n3);
        sb.append(")");
        sb.append(s);
        super(sb.toString(), ex);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
