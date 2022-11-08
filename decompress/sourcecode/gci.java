// 
// Decompiled by Procyon v0.6.0
// 

public final class gci
{
    public final asgt a;
    public final asgt b;
    public final asgt c;
    
    public gci() {
    }
    
    public gci(final asgt a, final asgt b, final asgt c) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null flatScrimColorFlowable");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gci) {
            final gci gci = (gci)o;
            if (this.a.equals(gci.a) && this.b.equals(gci.b) && this.c.equals(gci.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = this.c.toString();
        final StringBuilder sb = new StringBuilder("CinematicContainerOutput{backgroundDrawableFlowable=");
        sb.append(string);
        sb.append(", scrimDrawableFlowable=");
        sb.append(string2);
        sb.append(", flatScrimColorFlowable=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }
}
