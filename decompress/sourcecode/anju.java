// 
// Decompiled by Procyon v0.6.0
// 

public final class anju
{
    private final anjv a;
    
    public anju(final anjv a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof anju && this.a.equals(((anju)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("PostEphemeralitySettingsModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
