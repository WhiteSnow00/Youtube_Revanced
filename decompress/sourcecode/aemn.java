// 
// Decompiled by Procyon v0.6.0
// 

final class aemn extends aemp
{
    private final Throwable a;
    
    public aemn() {
    }
    
    public aemn(final Throwable a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null error");
    }
    
    public final Object a() {
        throw new IllegalStateException("This Result was a failure, and is being polled for data.");
    }
    
    public final boolean b() {
        return false;
    }
    
    public final Throwable c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof aemn && this.a.equals(((aemn)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("Failure{error=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
