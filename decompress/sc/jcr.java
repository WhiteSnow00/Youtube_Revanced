// 
// Decompiled by Procyon v0.6.0
// 

final class jcr extends jcq
{
    private final boolean a;
    private final aonv b;
    private final int c;
    
    public jcr(final boolean a, final aonv b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int a() {
        return this.c;
    }
    
    @Override
    public aonv d() {
        return this.b;
    }
    
    @Override
    public boolean e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jcq) {
            final jcq jcq = (jcq)o;
            if (this.a == jcq.e() && ((ahbh)this.b).equals((Object)jcq.d()) && this.c == jcq.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((n ^ 0xF4243) * 1000003 ^ ((ahbh)this.b).hashCode()) * 1000003 ^ this.c;
    }
    
    @Override
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
