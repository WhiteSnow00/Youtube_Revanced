import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abin
{
    public final float a;
    public final float b;
    public final Duration c;
    
    public abin() {
    }
    
    public abin(final float a, final float b, final Duration c) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null duration");
    }
    
    public static abin a(final float n, final float n2, final Duration duration) {
        final boolean b = true;
        final boolean b2 = n >= 0.0f && n <= 1.0f;
        final Float value = n;
        adme.P(b2, "input is not a valid opacity: %s", value);
        adme.P(n2 >= 0.0f && n2 <= 1.0f, "input is not a valid opacity: %s", value);
        adme.P(duration.toMillis() >= 0L && b, "duration is negative: %s", duration);
        return new abin(n, n2, duration);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abin) {
            final abin abin = (abin)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(abin.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(abin.b) && this.c.equals((Object)abin.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final String string = this.c.toString();
        final StringBuilder sb = new StringBuilder("AlphaAnimationStep{startAlpha=");
        sb.append(a);
        sb.append(", endAlpha=");
        sb.append(b);
        sb.append(", duration=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
