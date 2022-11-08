// 
// Decompiled by Procyon v0.6.0
// 

public final class dqp
{
    public final int a;
    
    public dqp(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((dqp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder(122);
        sb.append("Entry{reserved=");
        sb.append(a >> 6);
        sb.append(", sampleDependsOn=");
        sb.append(a >> 4 & 0x3);
        sb.append(", sampleIsDependentOn=");
        sb.append(a >> 2 & 0x3);
        sb.append(", sampleHasRedundancy=");
        sb.append(a & 0x3);
        sb.append("}");
        return sb.toString();
    }
}
