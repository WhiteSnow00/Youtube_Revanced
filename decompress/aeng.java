import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeng
{
    public final aemp a;
    public final ListenableFuture b;
    
    public aeng() {
    }
    
    public aeng(final aemp a, final ListenableFuture b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null monitor");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeng) {
            final aeng aeng = (aeng)o;
            if (this.a.equals(aeng.a) && this.b.equals(aeng.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MonitorReport{monitor=");
        sb.append(string);
        sb.append(", startReport=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}