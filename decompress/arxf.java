import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxf
{
    public final arxe a;
    public final Status b;
    
    public arxf(final arxe a, final Status b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public static arxf a(final arxe arxe) {
        adme.L(arxe != arxe.c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new arxf(arxe, Status.OK);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof arxf)) {
            return false;
        }
        final arxf arxf = (arxf)o;
        return this.a.equals(arxf.a) && this.b.equals((Object)arxf.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        if (this.b.f()) {
            return this.a.toString();
        }
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("(");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}
