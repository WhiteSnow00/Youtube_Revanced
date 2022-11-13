// 
// Decompiled by Procyon v0.6.0
// 

public final class cwm
{
    public Object a;
    public Object b;
    
    private static boolean a(final Object o, final Object o2) {
        boolean b = true;
        if (o != o2) {
            if (o != null) {
                if (!o.equals(o2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof akq)) {
            return false;
        }
        final akq akq = (akq)o;
        return a(akq.a, this.a) && a(akq.b, this.b);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("Pair{");
        sb.append(value);
        sb.append(" ");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
