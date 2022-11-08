// 
// Decompiled by Procyon v0.6.0
// 

public final class cmn extends ckx
{
    public final cmh a;
    
    public cmn() {
        final cmh a = cmh.a;
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals((Object)((cmn)o).a));
    }
    
    public final int hashCode() {
        return 3057468 + this.a.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Failure {mOutputData=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
