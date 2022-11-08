// 
// Decompiled by Procyon v0.6.0
// 

final class jbs extends jbr
{
    private final boolean a;
    private final aols b;
    private final int c;
    
    public jbs(final boolean a, final aols b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.c;
    }
    
    public aols d() {
        return this.b;
    }
    
    public boolean e() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jbr) {
            final jbr jbr = (jbr)o;
            if (this.a == jbr.e() && ((agzi)this.b).equals((Object)jbr.d()) && this.c == jbr.a()) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((n ^ 0xF4243) * 1000003 ^ ((agzi)this.b).hashCode()) * 1000003 ^ this.c;
    }
    
    public String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.b);
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("ActionEnabledStateEvent{isEnabled=");
        sb.append(a);
        sb.append(", actionRenderer=");
        sb.append(value);
        sb.append(", animationAction=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
