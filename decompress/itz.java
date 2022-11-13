// 
// Decompiled by Procyon v0.6.0
// 

final class itz extends iuf
{
    private final iuj a;
    private final iue b;
    
    public itz(final iuj a, final iue b) {
        if (a == null) {
            throw new NullPointerException("Null interruptionEvent");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null interruptionContext");
    }
    
    @Override
    public iue a() {
        return this.b;
    }
    
    @Override
    public iuj b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iuf) {
            final iuf iuf = (iuf)o;
            if (this.a.equals(iuf.b()) && this.b.equals(iuf.a())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("LoggableInterruptionEvent{interruptionEvent=");
        sb.append(value);
        sb.append(", interruptionContext=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
