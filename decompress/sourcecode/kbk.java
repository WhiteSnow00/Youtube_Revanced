// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kbk
{
    public abstract int a();
    
    public abstract void b();
    
    public abstract void c(final int p0);
    
    final String d(final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(kbo.r(n));
        sb.append(" is an invalid exit state for ");
        sb.append(kbo.r(this.a()));
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SpotlightModeState{value=");
        sb.append(kbo.r(this.a()));
        sb.append("}");
        return sb.toString();
    }
}
