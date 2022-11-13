import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class iir implements ijj
{
    private final String a;
    
    public iir(final String a) {
        this.a = a;
    }
    
    protected abstract vfp a();
    
    public final asht b() {
        return this.a().h(this.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof iir && ((iir)o).a.equals(this.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.a() });
    }
}
