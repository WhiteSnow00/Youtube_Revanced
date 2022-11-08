// 
// Decompiled by Procyon v0.6.0
// 

public final class adze
{
    public final int a;
    
    public adze() {
    }
    
    public adze(final int a) {
        this.a = a;
    }
    
    public static adze a(final int n) {
        return new adze(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof adze && this.a == ((adze)o).a);
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ 0x4D5;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("AppUpdateOptions{appUpdateType=");
        sb.append(a);
        sb.append(", allowAssetPackDeletion=false}");
        return sb.toString();
    }
}
