import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aadc implements aacf
{
    public final aacx a;
    public final amze b;
    public final int c;
    public final byte[] d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final aadb j;
    public final akyz k;
    public final aacn l;
    public final aacw m;
    public final aacv n;
    public final aadf o;
    public final PlayerResponseModel p;
    
    public aadc(final aacx a, final amze b, final int c, final byte[] d, final boolean e, final long f, final long g, final long h, final long i, final aadb j, final akyz k, final aacn l, final aacw m, final aacv n, final aadf o, final PlayerResponseModel p16) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    public final boolean A() {
        return this.l == aacn.i;
    }
    
    public final boolean B() {
        if (this.y()) {
            final aadf o = this.o;
            if (o != null && o.b == aozk.b) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean C() {
        return this.l == aacn.j;
    }
    
    public final agr D() {
        final aadb j = this.j;
        if (j != null && j.g()) {
            return null;
        }
        return this.a.e;
    }
    
    public final String a() {
        return this.a.f();
    }
    
    public final boolean b() {
        final aacv n = this.n;
        return n == null || n.e;
    }
    
    public final boolean c() {
        return this.l == aacn.b;
    }
    
    public final int d() {
        if (this.e() > 0L) {
            return (int)(this.f() * 100L / this.e());
        }
        return 0;
    }
    
    public final long e() {
        final aacv n = this.n;
        if (n == null) {
            return 0L;
        }
        return n.d;
    }
    
    public final long f() {
        final aacv n = this.n;
        if (n == null) {
            return 0L;
        }
        return n.c;
    }
    
    public final long g() {
        final aadb j = this.j;
        if (j != null && j.g()) {
            return 0L;
        }
        return this.a.a();
    }
    
    public final Uri h() {
        final aadb j = this.j;
        if (j != null && j.g()) {
            return null;
        }
        final aacx a = this.a;
        final vig a2 = a.a;
        if (a2 != null && !((List)a2.b).isEmpty()) {
            return a.a.c(240).a();
        }
        return null;
    }
    
    @Deprecated
    public final aacy i() {
        if (this.s()) {
            if (this.C()) {
                return aacy.f;
            }
            if (this.p()) {
                return aacy.m;
            }
            if (this.u()) {
                return aacy.p;
            }
            if (this.j != null && this.v()) {
                if (this.j.f()) {
                    return aacy.r;
                }
                return aacy.q;
            }
            else {
                if (!this.b()) {
                    return aacy.n;
                }
                if (this.l == aacn.o) {
                    return aacy.o;
                }
                final aacy a = aacy.a;
                final int ordinal = this.l.ordinal();
                if (ordinal == 5) {
                    return aacy.u;
                }
                if (ordinal != 6) {
                    return aacy.w;
                }
                return aacy.t;
            }
        }
        else {
            if (this.c()) {
                return aacy.b;
            }
            if (this.q()) {
                return aacy.c;
            }
            if (this.A()) {
                return aacy.k;
            }
            if (!this.z()) {
                if (this.B()) {
                    final aadf o = this.o;
                    if (o != null) {
                        final int c = o.c;
                        if ((c & 0x2) != 0x0) {
                            return aacy.g;
                        }
                        if ((c & 0x8) != 0x0) {
                            return aacy.h;
                        }
                        if ((c & 0x1000) != 0x0) {
                            return aacy.j;
                        }
                    }
                }
                return aacy.e;
            }
            if (this.x()) {
                return aacy.v;
            }
            return aacy.d;
        }
    }
    
    public final aowb j() {
        final aadb j = this.j;
        if (j != null && j.g()) {
            return null;
        }
        return this.a.d();
    }
    
    public final String k(final aacy aacy, final Context context) {
        final akyz k = this.k;
        final aadb j = this.j;
        final int d = this.d();
        final aacy a = aacy.a;
        final aacn a2 = aacn.a;
        String s = null;
        switch (aacy.ordinal()) {
            default: {
                s = context.getString(2132018856);
                break;
            }
            case 21: {
                s = context.getString(2132018906);
                break;
            }
            case 20: {
                s = context.getString(2132018857);
                break;
            }
            case 19: {
                s = context.getString(2132018860);
                break;
            }
            case 17: {
                s = context.getString(2132018855);
                break;
            }
            case 16: {
                if (j != null) {
                    final amxq b = j.b;
                    if ((b.b & 0x10) != 0x0) {
                        s = b.i;
                        break;
                    }
                }
                s = context.getString(2132018856);
                break;
            }
            case 15: {
                if (j != null) {
                    final amxq b2 = j.b;
                    if ((b2.b & 0x10) != 0x0) {
                        s = b2.i;
                        break;
                    }
                }
                if (k != null && (k.b & 0x4) != 0x0 && !k.d.isEmpty()) {
                    s = k.d;
                    break;
                }
                s = context.getString(2132018911);
                break;
            }
            case 14: {
                s = context.getString(2132018898);
                break;
            }
            case 13: {
                s = context.getString(2132018859);
                break;
            }
            case 12: {
                if (k != null) {
                    s = k.d;
                    break;
                }
                s = context.getString(2132018856);
                break;
            }
            case 10: {
                s = context.getString(2132018883, new Object[] { d });
                break;
            }
            case 9: {
                s = context.getString(2132018923);
                break;
            }
            case 8: {
                s = context.getString(2132018925);
                break;
            }
            case 7: {
                s = context.getString(2132018924);
                break;
            }
            case 6: {
                s = context.getString(2132018922);
                break;
            }
            case 5: {
                s = context.getString(2132018899);
                break;
            }
            case 4: {
                s = context.getString(2132018920, new Object[] { d });
                break;
            }
            case 3: {
                s = context.getString(2132018831, new Object[] { d });
                break;
            }
            case 1:
            case 2: {
                s = "";
                break;
            }
            case 0: {
                s = context.getString(2132018910);
                break;
            }
        }
        return s;
    }
    
    public final String l() {
        final aadb j = this.j;
        if (j != null && j.g()) {
            return "";
        }
        return this.a.g();
    }
    
    public final String m(final Context context) {
        final aadb j = this.j;
        if (j != null && j.g()) {
            return context.getString(2132018033);
        }
        return this.a.j();
    }
    
    public final boolean n() {
        final aadb j = this.j;
        return j != null && j.e() != null && this.l != aacn.a && this.l != aacn.h;
    }
    
    public final boolean o(final xyj xyj) {
        final aacv n = this.n;
        if (n != null) {
            final FormatStreamModel c = n.c();
            if (c != null && TimeUnit.MICROSECONDS.toSeconds(xyj.d(c, 0L)) >= this.h) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean p() {
        return this.u() && aamr.q(this.k);
    }
    
    public final boolean q() {
        return this.l == aacn.n;
    }
    
    public final boolean r() {
        final aadb j = this.j;
        return (j != null && !j.h()) || this.l == aacn.h;
    }
    
    @Deprecated
    public final boolean s() {
        final boolean y = this.y();
        boolean b2;
        final boolean b = b2 = false;
        if (!y) {
            b2 = b;
            if (!this.A()) {
                b2 = b;
                if (!this.q()) {
                    if (!this.v() && !this.u() && this.c()) {
                        if (!this.b()) {
                            return true;
                        }
                        b2 = b;
                    }
                    else {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final boolean t() {
        if (!this.s()) {
            final aacv n = this.n;
            if (n != null) {
                final aacu b = n.b;
                final aacu a = n.a;
                if (b != null && b.i() && a != null && a.d > 0L && !a.i()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean u() {
        final akyz k = this.k;
        return k != null && !aamr.o(k);
    }
    
    public final boolean v() {
        final aadb j = this.j;
        return j != null && !j.i();
    }
    
    public final boolean w() {
        if (!this.y() && !this.v() && !this.A()) {
            if (this.l != aacn.h) {
                if (!this.c()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean x() {
        final aadf o = this.o;
        return o != null && o.g.o("sd_card_offline_disk_error");
    }
    
    public final boolean y() {
        return this.l == aacn.c;
    }
    
    public final boolean z() {
        if (this.y()) {
            final aadf o = this.o;
            if (o != null && o.b()) {
                return true;
            }
        }
        return false;
    }
}
