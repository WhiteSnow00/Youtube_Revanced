// 
// Decompiled by Procyon v0.6.0
// 

public final class btx
{
    public final bua a;
    public final bua b;
    
    public btx(final bua a, final bua b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final btx btx = (btx)o;
                if (this.a.equals(btx.a) && this.b.equals(btx.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        String concat;
        if (this.a.equals(this.b)) {
            concat = "";
        }
        else {
            concat = ", ".concat(this.b.toString());
        }
        final StringBuilder sb = new StringBuilder("[");
        sb.append(string);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
