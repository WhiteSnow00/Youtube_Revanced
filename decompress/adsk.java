// 
// Decompiled by Procyon v0.6.0
// 

public final class adsk
{
    public final String a;
    public final int b;
    private final String c;
    
    public adsk() {
    }
    
    public adsk(final String c, final String a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static adsj a() {
        return new adsj();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adsk) {
            final adsk adsk = (adsk)o;
            if (this.c.equals(adsk.c) && this.a.equals(adsk.a)) {
                final int b = this.b;
                final int b2 = adsk.b;
                if (b == 0) {
                    throw null;
                }
                if (b == b2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.c.hashCode();
        final int hashCode2 = this.a.hashCode();
        final int b = this.b;
        if (b != 0) {
            return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ b;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String c = this.c;
        final String a = this.a;
        final int b = this.b;
        String s;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    s = "null";
                }
                else {
                    s = "CONNECTED_WITH_LIVE_SHARING";
                }
            }
            else {
                s = "CONNECTED";
            }
        }
        else {
            s = "NOT_CONNECTED";
        }
        final StringBuilder sb = new StringBuilder("LiveSharingMeetingInfo{meetingCode=");
        sb.append(c);
        sb.append(", meetingUrl=");
        sb.append(a);
        sb.append(", meetingStatus=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
