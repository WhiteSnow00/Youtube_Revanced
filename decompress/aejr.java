// 
// Decompiled by Procyon v0.6.0
// 

public final class aejr
{
    public final int a;
    public int b;
    
    public aejr(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aejr)) {
            return false;
        }
        final aejr aejr = (aejr)o;
        return this.a == aejr.a && this.b == aejr.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("ActiveCallbacks(callbacksId=");
        sb.append(a);
        sb.append(", callbacksState=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
