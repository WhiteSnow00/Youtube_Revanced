// 
// Decompiled by Procyon v0.6.0
// 

final class glr extends acrm
{
    public final afev a;
    
    public glr() {
    }
    
    public glr(final afev a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null undoMap");
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof glr && this.a.equals(((glr)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("MyTransientState{undoMap=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
