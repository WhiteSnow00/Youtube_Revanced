// 
// Decompiled by Procyon v0.6.0
// 

public final class dyd
{
    public final dye a;
    public final float b;
    
    public dyd(final dye a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final dxh a() {
        return this.a.a;
    }
    
    public final dxw b() {
        return this.a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final dyd dyd = (dyd)o;
                if (Float.compare(dyd.b, this.b) == 0 && this.a.equals(dyd.a)) {
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
