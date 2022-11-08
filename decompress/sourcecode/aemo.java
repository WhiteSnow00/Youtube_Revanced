// 
// Decompiled by Procyon v0.6.0
// 

final class aemo extends aemp
{
    private final Object a;
    
    public aemo() {
    }
    
    public aemo(final Object a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null data");
    }
    
    public final Object a() {
        return this.a;
    }
    
    public final boolean b() {
        return true;
    }
    
    public final Throwable c() {
        throw new IllegalStateException("This Result was a success, and is being polled for an error.");
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof aemo && this.a.equals(((aemo)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("Success{data=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
