import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arry
{
    public final arrx a;
    public final Status b;
    
    public arry(final arrx a, final Status b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public static arry a(final arrx arrx) {
        agot.v(arrx != arrx.c, (Object)"state is TRANSIENT_ERROR. Use forError() instead");
        return new arry(arrx, Status.OK);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof arry)) {
            return false;
        }
        final arry arry = (arry)o;
        return this.a.equals(arry.a) && this.b.equals(arry.b);
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
