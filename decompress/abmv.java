import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmv
{
    public final PlaybackStartDescriptor a;
    public final abla b;
    public final String c;
    public final boolean d;
    
    public abmv() {
    }
    
    public abmv(final PlaybackStartDescriptor a, final abla b, final String c, final boolean d) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null playbackStartParameters");
    }
    
    public static abmv a(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final String s, final boolean b) {
        return new abmv(playbackStartDescriptor, abla, s, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abmv) {
            final abmv abmv = (abmv)o;
            if (this.a.equals(abmv.a) && this.b.equals(abmv.b)) {
                final String c = this.c;
                if (c == null) {
                    if (abmv.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(abmv.c)) {
                    return false;
                }
                if (this.d == abmv.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ~((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String value = String.valueOf(this.b);
        final String c = this.c;
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder("PlayerFetcherDescriptor{playbackStartDescriptor=");
        sb.append(string);
        sb.append(", playbackStartParameters=");
        sb.append(value);
        sb.append(", cpn=");
        sb.append(c);
        sb.append(", dataExpiredForSeconds=-1, synchronousRequestCreation=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
