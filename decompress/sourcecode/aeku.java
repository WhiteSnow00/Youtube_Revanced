// 
// Decompiled by Procyon v0.6.0
// 

public final class aeku
{
    public final String a;
    
    public aeku() {
    }
    
    public aeku(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof aeku && this.a.equals(((aeku)o).a));
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x1;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("UniqueWorkSpec{uniquenessKey=");
        sb.append(a);
        sb.append(", existingWorkPolicy=REPLACE}");
        return sb.toString();
    }
}
