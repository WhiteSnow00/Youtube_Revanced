// 
// Decompiled by Procyon v0.6.0
// 

public final class aelp extends agot
{
    private final String d;
    
    public aelp() {
    }
    
    public aelp(final byte[] array) {
        this.d = "camera-initialisation";
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof aelp && this.d.equals(((aelp)o).d));
    }
    
    public final int hashCode() {
        return this.d.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        final String d = this.d;
        final StringBuilder sb = new StringBuilder("SingleStringKey{stringRepresentation=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
