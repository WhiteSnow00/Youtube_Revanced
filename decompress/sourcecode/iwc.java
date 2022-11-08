// 
// Decompiled by Procyon v0.6.0
// 

final class iwc
{
    public final boolean a;
    public final mri b;
    
    public iwc() {
    }
    
    public iwc(final mri b, final boolean a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iwc) {
            final iwc iwc = (iwc)o;
            if (this.b.equals((Object)iwc.b) && this.a == iwc.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder("StateTransition{midUiAction=");
        sb.append(string);
        sb.append(", shouldAnimate=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
