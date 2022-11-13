// 
// Decompiled by Procyon v0.6.0
// 

public final class dye
{
    public final dxh a;
    public final dxw b;
    
    public dye(final dxh a, final dxw b) {
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
                final dye dye = (dye)o;
                if (this.a.equals(dye.a) && this.b.equals(dye.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.d * 31 + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PropertyHandle{ mTransitionId='");
        sb.append(value);
        sb.append("', mProperty=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
