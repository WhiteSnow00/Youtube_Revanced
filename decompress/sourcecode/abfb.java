import j$.util.Optional;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

final class abfb
{
    public final boolean a;
    public final Duration b;
    public final Optional c;
    public final boolean d;
    
    public abfb() {
    }
    
    public abfb(final boolean a, final Duration b, final Optional c, final boolean d) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null seekDuration");
    }
    
    public static abfb a(final Duration duration) {
        return new abfb(false, duration, Optional.empty(), false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abfb) {
            final abfb abfb = (abfb)o;
            if (this.a == abfb.a && this.b.equals((Object)abfb.b) && this.c.equals((Object)abfb.c) && this.d == abfb.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        if (this.d) {
            n = 1231;
        }
        return (((n2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String string = this.b.toString();
        final String string2 = this.c.toString();
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder("ChapterSeekResult{isSeekingToChapterStart=");
        sb.append(a);
        sb.append(", seekDuration=");
        sb.append(string);
        sb.append(", seekText=");
        sb.append(string2);
        sb.append(", isOverlayCentered=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
