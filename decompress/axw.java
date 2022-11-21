// 
// Decompiled by Procyon v0.6.0
// 

public final class axw
{
    public final int a;
    public final float b;
    
    public axw() {
        this.a = 0;
        this.b = 0.0f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final axw axw = (axw)o;
                if (Float.compare(0.0f, 0.0f) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
