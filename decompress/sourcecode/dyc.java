// 
// Decompiled by Procyon v0.6.0
// 

public final class dyc
{
    public final dyd a;
    public final float b;
    
    public dyc(final dyd a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final dxg a() {
        return this.a.a;
    }
    
    public final dxv b() {
        return this.a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final dyc dyc = (dyc)o;
                if (Float.compare(dyc.b, this.b) == 0 && this.a.equals(dyc.a)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final float b = this.b;
        int floatToIntBits;
        if (b != 0.0f) {
            floatToIntBits = Float.floatToIntBits(b);
        }
        else {
            floatToIntBits = 0;
        }
        return hashCode * 31 + floatToIntBits;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final float b = this.b;
        final StringBuilder sb = new StringBuilder("PropertyAnimation{ PropertyHandle=");
        sb.append(string);
        sb.append(", TargetValue=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
