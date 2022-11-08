// 
// Decompiled by Procyon v0.6.0
// 

public final class cmp extends ckx
{
    public final cmh a;
    
    public cmp() {
        this(cmh.a);
    }
    
    public cmp(final cmh a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals((Object)((cmp)o).a));
    }
    
    public final int hashCode() {
        return 3057530 + this.a.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Success {mOutputData=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
