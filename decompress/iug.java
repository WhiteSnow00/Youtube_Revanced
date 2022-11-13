import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iug
{
    public final Optional a;
    public final afft b;
    public final String c;
    public final boolean d;
    public final boolean e;
    
    public iug() {
    }
    
    public iug(final Optional a, final afft b, final String c, final boolean d, final boolean e) {
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
    
    public static iug a(final andg andg, final afft afft, final aans aans) {
        if (!aans.c().equals((Object)abke.a) && !aans.c().equals((Object)abke.j)) {
            final PlayerResponseModel b = aans.b();
            return new iug(Optional.ofNullable((Object)andg), afft, aans.e(), b != null && b.R(), b != null && aakv.m(b.y()));
        }
        return new iug(Optional.ofNullable((Object)andg), afft, null, false, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iug) {
            final iug iug = (iug)o;
            if (this.a.equals((Object)iug.a) && this.b.equals((Object)iug.b)) {
                final String c = this.c;
                if (c == null) {
                    if (iug.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(iug.c)) {
                    return false;
                }
                if (this.d == iug.d && this.e == iug.e) {
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
