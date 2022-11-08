import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iti
{
    public final Optional a;
    public final afdu b;
    public final String c;
    public final boolean d;
    public final boolean e;
    
    public iti() {
    }
    
    public iti(final Optional a, final afdu b, final String c, final boolean d, final boolean e) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            return;
        }
        throw new NullPointerException("Null audioDevices");
    }
    
    public static iti a(final anbc anbc, final afdu afdu, final aaly aaly) {
        if (!aaly.c().equals((Object)abim.a) && !aaly.c().equals((Object)abim.j)) {
            final PlayerResponseModel b = aaly.b();
            return new iti(Optional.ofNullable((Object)anbc), afdu, aaly.e(), b != null && b.R(), b != null && aaja.m(b.y()));
        }
        return new iti(Optional.ofNullable((Object)anbc), afdu, null, false, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iti) {
            final iti iti = (iti)o;
            if (this.a.equals((Object)iti.a) && this.b.equals((Object)iti.b)) {
                final String c = this.c;
                if (c == null) {
                    if (iti.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(iti.c)) {
                    return false;
                }
                if (this.d == iti.d && this.e == iti.e) {
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
        final boolean d = this.d;
        int n = 1237;
        int n2;
        if (!d) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.e) {
            n = 1231;
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ n2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder("VideoStageEventContext{audioRouteType=");
        sb.append(string);
        sb.append(", audioDevices=");
        sb.append(string2);
        sb.append(", cpn=");
        sb.append(c);
        sb.append(", isOfflinePlayback=");
        sb.append(d);
        sb.append(", backgroundability=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
