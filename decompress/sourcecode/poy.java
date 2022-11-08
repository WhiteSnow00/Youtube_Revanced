// 
// Decompiled by Procyon v0.6.0
// 

final class poy
{
    public final agwv a;
    public final String b;
    public final int c;
    
    public poy() {
    }
    
    public poy(final agwv a, final String b, final int c) {
        if (a == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null actionId");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof poy) {
            final poy poy = (poy)o;
            if (((agzi)this.a).equals((Object)poy.a) && this.b.equals(poy.b) && this.c == poy.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((agzi)this.a).hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String b = this.b;
        final String string2 = Integer.toString(this.c - 1);
        final StringBuilder sb = new StringBuilder("SdkBatchUpdateKey{threadStateUpdate=");
        sb.append(string);
        sb.append(", actionId=");
        sb.append(b);
        sb.append(", eventSource=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
