// 
// Decompiled by Procyon v0.6.0
// 

final class aaxo extends aaxr
{
    private final int a;
    
    public aaxo(final int a) {
        this.a = a;
    }
    
    public int a() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        return o == this || (o instanceof aaxr && this.a == ((aaxr)o).a());
    }
    
    public int hashCode() {
        return this.a ^ 0xF4243;
    }
    
    public String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("PlaybackLoopDismissedEvent{reason=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
