// 
// Decompiled by Procyon v0.6.0
// 

final class fdt extends fdw
{
    private final String a;
    private final anul b;
    
    public fdt(final String a, final anul b) {
        if (a == null) {
            throw new NullPointerException("Null sectionId");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null reloadContinuationData");
    }
    
    public anul a() {
        return this.b;
    }
    
    public String b() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fdw) {
            final fdw fdw = (fdw)o;
            if (this.a.equals(fdw.b()) && this.b.equals((Object)fdw.a())) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("SectionReloadEvent{sectionId=");
        sb.append(a);
        sb.append(", reloadContinuationData=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
