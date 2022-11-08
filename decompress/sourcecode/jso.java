// 
// Decompiled by Procyon v0.6.0
// 

public final class jso
{
    public final String a;
    public final iio b;
    
    public jso() {
    }
    
    public jso(final String a, final iio b) {
        if (a == null) {
            throw new NullPointerException("Null videoEntityKey");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null videoDisplayState");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jso) {
            final jso jso = (jso)o;
            if (this.a.equals(jso.a) && this.b.equals((Object)jso.b)) {
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
        final String a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("VideoEntityKeyAndDisplayStateData{videoEntityKey=");
        sb.append(a);
        sb.append(", videoDisplayState=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
