// 
// Decompiled by Procyon v0.6.0
// 

public final class kqd
{
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    
    public kqd() {
    }
    
    public kqd(final byte[] array) {
        this.a = 2130970884;
        this.b = 2130970884;
        this.c = 2130970884;
        this.d = 2130970884;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kqd) {
            final kqd kqd = (kqd)o;
            if (this.a == kqd.a && this.b == kqd.b && this.c == kqd.c && this.d == kqd.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder("SlimMetadataToggleButtonColorConfiguration{defaultIconColorRes=");
        sb.append(a);
        sb.append(", selectedIconColorRes=");
        sb.append(b);
        sb.append(", defaultTextColorRes=");
        sb.append(c);
        sb.append(", selectedTextColorRes=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
