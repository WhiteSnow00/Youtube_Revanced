// 
// Decompiled by Procyon v0.6.0
// 

public final class agpe
{
    public final String a;
    public final String b;
    
    public agpe() {
    }
    
    public agpe(final String a, final String b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null version");
    }
    
    public static agpe a(final String s, final String s2) {
        return new agpe(s, s2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof agpe) {
            final agpe agpe = (agpe)o;
            if (this.a.equals(agpe.a) && this.b.equals(agpe.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(a);
        sb.append(", version=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
