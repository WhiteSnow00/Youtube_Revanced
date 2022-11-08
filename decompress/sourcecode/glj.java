// 
// Decompiled by Procyon v0.6.0
// 

final class glj extends acpi
{
    public final afcw a;
    
    public glj() {
    }
    
    public glj(final afcw a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null undoMap");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof glj && this.a.equals((Object)((glj)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("MyTransientState{undoMap=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
