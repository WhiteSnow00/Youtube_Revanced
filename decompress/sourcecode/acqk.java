import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqk
{
    public final Optional a;
    public final Optional b;
    
    public acqk() {
    }
    
    public acqk(final Optional a, final Optional b) {
        this.a = a;
        this.b = b;
    }
    
    public static acwj a() {
        return new acwj((byte[])null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acqk) {
            final acqk acqk = (acqk)o;
            if (this.a.equals((Object)acqk.a) && this.b.equals((Object)acqk.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("LoggerArgs{screenVe=");
        sb.append(value);
        sb.append(", command=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
