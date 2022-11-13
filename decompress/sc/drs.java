// 
// Decompiled by Procyon v0.6.0
// 

public final class drs
{
    public long a;
    public long b;
    public drn c;
    public long d;
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final String value = String.valueOf(this.c);
        final long d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 108);
        sb.append("Entry{duration=");
        sb.append(a);
        sb.append(", size=");
        sb.append(b);
        sb.append(", dlags=");
        sb.append(value);
        sb.append(", compTimeOffset=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
