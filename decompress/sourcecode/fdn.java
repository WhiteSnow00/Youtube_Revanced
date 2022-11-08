// 
// Decompiled by Procyon v0.6.0
// 

final class fdn extends fdp
{
    private final String a;
    private final ansi b;
    
    public fdn(final String a, final ansi b) {
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
    
    @Override
    public ansi a() {
        return this.b;
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fdp) {
            final fdp fdp = (fdp)o;
            if (this.a.equals(fdp.b()) && ((agzi)this.b).equals(fdp.a())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ ((agzi)this.b).hashCode();
    }
    
    @Override
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
