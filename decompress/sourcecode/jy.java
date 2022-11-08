// 
// Decompiled by Procyon v0.6.0
// 

public final class jy
{
    public int a;
    public int b;
    public Object c;
    public int d;
    
    public jy(final int a, final int b, final int d, final Object c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jy)) {
            return false;
        }
        final jy jy = (jy)o;
        final int a = this.a;
        if (a != jy.a) {
            return false;
        }
        if (a == 8 && Math.abs(this.d - this.b) == 1 && this.d == jy.b && this.b == jy.d) {
            return true;
        }
        if (this.d != jy.d) {
            return false;
        }
        if (this.b != jy.b) {
            return false;
        }
        final Object c = this.c;
        if (c != null) {
            if (!c.equals(jy.c)) {
                return false;
            }
        }
        else if (jy.c != null) {
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return (this.a * 31 + this.b) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        final int a = this.a;
        String s;
        if (a != 1) {
            if (a != 2) {
                if (a != 4) {
                    if (a != 8) {
                        s = "??";
                    }
                    else {
                        s = "mv";
                    }
                }
                else {
                    s = "up";
                }
            }
            else {
                s = "rm";
            }
        }
        else {
            s = "add";
        }
        sb.append(s);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
