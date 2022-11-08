import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbb
{
    public final Object a;
    public final alff b;
    public final wwv c;
    public final aioe d;
    public final List e;
    
    public acbb() {
    }
    
    public acbb(final Object a, final alff b, final wwv c, final aioe d, final List e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acbb) {
            final acbb acbb = (acbb)o;
            final Object a = this.a;
            if (a == null) {
                if (acbb.a != null) {
                    return false;
                }
            }
            else if (!a.equals(acbb.a)) {
                return false;
            }
            final alff b = this.b;
            if (b == null) {
                if (acbb.b != null) {
                    return false;
                }
            }
            else if (!((agzi)b).equals((Object)acbb.b)) {
                return false;
            }
            final wwv c = this.c;
            if (c == null) {
                if (acbb.c != null) {
                    return false;
                }
            }
            else if (!c.equals(acbb.c)) {
                return false;
            }
            final aioe d = this.d;
            if (d == null) {
                if (acbb.d != null) {
                    return false;
                }
            }
            else if (!((agzi)d).equals((Object)acbb.d)) {
                return false;
            }
            final List e = this.e;
            final List e2 = acbb.e;
            if (e == null) {
                if (e2 != null) {
                    return false;
                }
            }
            else if (!e.equals(e2)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final alff b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = ((agzi)b).hashCode();
        }
        final wwv c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final aioe d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = ((agzi)d).hashCode();
        }
        final List e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("YouTubeCustomCommandEventDataImpl{tag=");
        sb.append(value);
        sb.append(", interactionLoggingClientData=");
        sb.append(value2);
        sb.append(", interactionLogger=");
        sb.append(value3);
        sb.append(", command=");
        sb.append(value4);
        sb.append(", customConverters=");
        sb.append(value5);
        sb.append("}");
        return sb.toString();
    }
}
