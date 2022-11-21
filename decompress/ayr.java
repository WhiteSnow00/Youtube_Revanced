import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public class ayr
{
    public final Uri a;
    public final String b;
    public final ayo c;
    public final ayj d;
    public final List e;
    public final String f;
    public final afgh g;
    public final Object h;
    
    public ayr(final Uri a, final String b, final ayo c, final List e, final afgh g, final Object h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = e;
        this.f = null;
        this.g = g;
        final afgc d = afgh.d();
        if (((afjx)g).c <= 0) {
            d.g();
            this.h = h;
            return;
        }
        final ayu ayu = g.get(0);
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ayr)) {
            return false;
        }
        final ayr ayr = (ayr)o;
        if (this.a.equals((Object)ayr.a) && baz.aa(this.b, ayr.b) && baz.aa(this.c, ayr.c)) {
            final ayj d = ayr.d;
            if (baz.aa(null, null) && this.e.equals(ayr.e)) {
                final String f = ayr.f;
                if (baz.aa(null, null) && agpx.T(this.g, ayr.g) && baz.aa(this.h, ayr.h)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final ayo c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int hashCode5 = this.e.hashCode();
        final int hashCode6 = this.g.hashCode();
        final Object h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return ((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 961 + hashCode5) * 961 + hashCode6) * 31 + hashCode2;
    }
}
