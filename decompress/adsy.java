// 
// Decompiled by Procyon v0.6.0
// 

public final class adsy
{
    public final odx a;
    public final String b;
    public final ocy c;
    public final adsl d;
    
    public adsy() {
    }
    
    public adsy(final odx a, final ocy c, final adsl d) {
        this.a = a;
        this.b = "youtube";
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adsy) {
            final adsy adsy = (adsy)o;
            if (this.a.equals(adsy.a) && this.b.equals(adsy.b) && ((ahcz)this.c).equals(adsy.c) && this.d.equals(adsy.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((ahcz)this.c).hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("LiveSharingConnection{ipcManager=");
        sb.append(value);
        sb.append(", activityName=");
        sb.append(b);
        sb.append(", startInfo=");
        sb.append(value2);
        sb.append(", meetingDisconnectHandler=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
