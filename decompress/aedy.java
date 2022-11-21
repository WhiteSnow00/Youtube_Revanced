import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedy
{
    public final IBinder a;
    public final boolean b;
    public final String c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    
    public aedy() {
    }
    
    public aedy(final IBinder a, final boolean b, final String c, final int d, final float e, final int f, final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aedy) {
            final aedy aedy = (aedy)o;
            if (this.a.equals(aedy.a) && this.b == aedy.b) {
                final String c = this.c;
                if (c == null) {
                    if (aedy.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(aedy.c)) {
                    return false;
                }
                if (this.d == aedy.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(aedy.e) && this.f == aedy.f && this.g == aedy.g) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ hashCode2) * 1000003 ^ this.d) * 1000003 ^ Float.floatToIntBits(this.e)) * 1000003 ^ this.f) * -721379959 ^ this.g) * 1000003;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final boolean b = this.b;
        final String c = this.c;
        final int d = this.d;
        final float e = this.e;
        final int f = this.f;
        final int g = this.g;
        final StringBuilder sb = new StringBuilder("OverlayDisplayShowRequest{windowToken=");
        sb.append(value);
        sb.append(", stableSessionToken=");
        sb.append(b);
        sb.append(", appId=");
        sb.append(c);
        sb.append(", layoutGravity=");
        sb.append(d);
        sb.append(", layoutVerticalMargin=");
        sb.append(e);
        sb.append(", displayMode=");
        sb.append(f);
        sb.append(", sessionToken=null, windowWidthPx=");
        sb.append(g);
        sb.append(", adFieldEnifd=null}");
        return sb.toString();
    }
}
