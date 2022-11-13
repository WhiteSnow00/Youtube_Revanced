// 
// Decompiled by Procyon v0.6.0
// 

final class aazk extends aazn
{
    private final int a;
    
    public aazk(final int a) {
        this.a = a;
    }
    
    @Override
    public int a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof aazn && this.a == ((aazn)o).a());
    }
    
    @Override
    public int hashCode() {
        return this.a ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("PlaybackLoopDismissedEvent{reason=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
