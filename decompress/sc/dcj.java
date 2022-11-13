import android.graphics.Bitmap;
import android.widget.ImageView;
import android.net.Uri;
import j$.util.Objects;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Map;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class dcj extends dnh implements Cloneable
{
    private List A;
    private dcj B;
    private dcj C;
    private Float D;
    private boolean E;
    private boolean F;
    private boolean G;
    private final Context u;
    private final dcm v;
    private final Class w;
    private final dby x;
    private dcn y;
    private Object z;
    
    static {
        final dnq dnq = (dnq)((dnh)((dnh)((dnh)new dnq()).v(dfi.b)).J(dca.d)).V();
    }
    
    protected dcj(final dbp dbp, final dcm v, final Class w, final Context u) {
        this.E = true;
        this.v = v;
        this.w = w;
        this.u = u;
        final dby b = v.a.b;
        dcn dcn2;
        dcn dcn = dcn2 = b.d.get(w);
        if (dcn == null) {
            final Iterator iterator = b.d.entrySet().iterator();
            while (true) {
                dcn2 = dcn;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<Class, V> entry = (Map.Entry<Class, V>)iterator.next();
                if (!entry.getKey().isAssignableFrom(w)) {
                    continue;
                }
                dcn = (dcn)entry.getValue();
            }
        }
        dcn a;
        if ((a = dcn2) == null) {
            a = dby.a;
        }
        this.y = a;
        this.x = dbp.b;
        final Iterator iterator2 = v.d.iterator();
        while (iterator2.hasNext()) {
            this.a((dnp)iterator2.next());
        }
        this.b((dnh)v.h());
    }
    
    private final dnl X(final Object o, final dod dod, final dnp dnp, final dnn dnn, final dcn dcn, final dca dca, int j, int n, final dnh dnh, final Executor executor) {
        dni dni;
        Object o2;
        if (this.C != null) {
            o2 = (dni = new dni(o, dnn));
        }
        else {
            dni = null;
            o2 = dnn;
        }
        final dcj b = this.B;
        dnl y3;
        if (b != null) {
            if (this.G) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            dcn y = b.y;
            if (b.E) {
                y = dcn;
            }
            dca dca2;
            if (b.R(8)) {
                dca2 = b.c;
            }
            else {
                final int n2 = dci.b[dca.ordinal()];
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3 && n2 != 4) {
                            throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(super.c))));
                        }
                        dca2 = dca.a;
                    }
                    else {
                        dca2 = dca.b;
                    }
                }
                else {
                    dca2 = dca.c;
                }
            }
            final dcj b2 = this.B;
            int n3 = b2.j;
            int n4 = b2.i;
            if (dph.q(j, n) && !this.B.S()) {
                n3 = dnh.j;
                n4 = dnh.i;
            }
            final dnt dnt = new dnt(o, (dnn)o2);
            final dnl y2 = this.Y(o, dod, dnp, dnh, (dnn)dnt, dcn, dca, j, n, executor);
            this.G = true;
            final dcj b3 = this.B;
            final dnl x = b3.X(o, dod, dnp, (dnn)dnt, y, dca2, n3, n4, b3, executor);
            this.G = false;
            dnt.a = y2;
            dnt.b = x;
            y3 = (dnl)dnt;
        }
        else {
            y3 = this.Y(o, dod, dnp, dnh, (dnn)o2, dcn, dca, j, n, executor);
        }
        if (dni == null) {
            return y3;
        }
        final dcj c = this.C;
        final int i = c.j;
        final int k = c.i;
        if (dph.q(j, n) && !this.C.S()) {
            j = dnh.j;
            final int l = dnh.i;
            n = j;
            j = l;
        }
        else {
            j = k;
            n = i;
        }
        final dcj c2 = this.C;
        final dnl x2 = c2.X(o, dod, dnp, (dnn)dni, c2.y, c2.c, n, j, c2, executor);
        dni.a = y3;
        dni.b = x2;
        return (dnl)dni;
    }
    
    private final dnl Y(final Object o, final dod dod, final dnp dnp, final dnh dnh, final dnn dnn, final dcn dcn, final dca dca, final int n, final int n2, final Executor executor) {
        final Context u = this.u;
        final dby x = this.x;
        return (dnl)new dns(u, x, o, this.z, this.w, dnh, n, n2, dca, dod, dnp, this.A, dnn, x.h, dcn.a, executor, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    private final void Z(final dod dod, final dnp dnp, final dnh dnh, final Executor executor) {
        clm.h((Object)dod);
        if (!this.F) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        final dnl x = this.X(new Object(), dod, dnp, null, this.y, dnh.c, dnh.j, dnh.i, dnh, executor);
        final dnl d = dod.d();
        if (x.m(d) && (dnh.h || !d.l())) {
            clm.h((Object)d);
            if (!d.n()) {
                d.b();
            }
            return;
        }
        this.v.j(dod);
        dod.h(x);
        this.v.q(dod, x);
    }
    
    public dcj a(final dnp dnp) {
        if (super.r) {
            return this.c().a(dnp);
        }
        if (dnp != null) {
            if (this.A == null) {
                this.A = new ArrayList();
            }
            this.A.add(dnp);
        }
        this.U();
        return this;
    }
    
    public dcj b(final dnh dnh) {
        clm.h((Object)dnh);
        return (dcj)super.m(dnh);
    }
    
    public dcj c() {
        final dcj dcj = (dcj)super.n();
        dcj.y = dcj.y.a();
        final List a = dcj.A;
        if (a != null) {
            dcj.A = new ArrayList(a);
        }
        final dcj b = dcj.B;
        if (b != null) {
            dcj.B = b.c();
        }
        final dcj c = dcj.C;
        if (c != null) {
            dcj.C = c.c();
        }
        return dcj;
    }
    
    public /* bridge */ Object clone() {
        return this.c();
    }
    
    public dcj d(final dnp dnp) {
        if (super.r) {
            return this.c().d(dnp);
        }
        this.A = null;
        return this.a(dnp);
    }
    
    public dcj e(final Drawable drawable) {
        return this.k(drawable).b((dnh)dnq.b(dfi.a));
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof dcj) {
            final dcj dcj = (dcj)o;
            if (super.equals((Object)dcj) && Objects.equals((Object)this.w, (Object)dcj.w) && this.y.equals((Object)dcj.y) && Objects.equals(this.z, dcj.z) && Objects.equals((Object)this.A, (Object)dcj.A) && Objects.equals((Object)this.B, (Object)dcj.B) && Objects.equals((Object)this.C, (Object)dcj.C)) {
                final Float d = dcj.D;
                if (Objects.equals((Object)null, (Object)null) && this.E == dcj.E && this.F == dcj.F) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public dcj f(final Uri uri) {
        return this.k(uri);
    }
    
    public dcj g(final Integer n) {
        final dcj k = this.k(n);
        final Context u = this.u;
        final int b = dop.b;
        return k.b((dnh)dnq.c((ddk)new dop(u.getResources().getConfiguration().uiMode & 0x30, doq.a(u))));
    }
    
    public dcj h(final Object o) {
        return this.k(o);
    }
    
    public final int hashCode() {
        return dph.e((int)(this.F ? 1 : 0), dph.e((int)(this.E ? 1 : 0), dph.f((Object)null, dph.f((Object)this.C, dph.f((Object)this.B, dph.f((Object)this.A, dph.f(this.z, dph.f((Object)this.y, dph.f((Object)this.w, super.hashCode())))))))));
    }
    
    public dcj i(final String s) {
        return this.k(s);
    }
    
    public dcj j(final byte[] array) {
        dcj dcj2;
        final dcj dcj = dcj2 = this.k(array);
        if (!dcj.R(4)) {
            dcj2 = dcj.b((dnh)dnq.b(dfi.a));
        }
        dcj b = dcj2;
        if (!dcj2.R(256)) {
            if (dnq.u == null) {
                dnq.u = (dnq)((dnh)((dnh)new dnq()).V()).s();
            }
            b = dcj2.b((dnh)dnq.u);
        }
        return b;
    }
    
    public final dcj k(final Object z) {
        if (super.r) {
            return this.c().k(z);
        }
        this.z = z;
        this.F = true;
        this.U();
        return this;
    }
    
    public dcj l(final dcn y) {
        if (super.r) {
            return this.c().l(y);
        }
        clm.h((Object)y);
        this.y = y;
        this.E = false;
        this.U();
        return this;
    }
    
    public /* bridge */ dnh m(final dnh dnh) {
        return this.b(dnh);
    }
    
    public /* bridge */ dnh n() {
        return this.c();
    }
    
    public final dnk o() {
        final dno dno = new dno();
        this.Z((dod)dno, (dnp)dno, this, doz.b);
        return (dnk)dno;
    }
    
    public final void p(final ImageView imageView) {
        dph.j();
        clm.h((Object)imageView);
        dnh dnh = null;
        Label_0129: {
            if (!super.R(2048) && super.m && imageView.getScaleType() != null) {
                switch (dci.a[imageView.getScaleType().ordinal()]) {
                    case 6: {
                        dnh = this.n().D();
                        break Label_0129;
                    }
                    case 3:
                    case 4:
                    case 5: {
                        dnh = this.n().E();
                        break Label_0129;
                    }
                    case 2: {
                        dnh = this.n().D();
                        break Label_0129;
                    }
                    case 1: {
                        dnh = this.n().C();
                        break Label_0129;
                    }
                }
            }
            dnh = this;
        }
        final dby x = this.x;
        final Class w = this.w;
        final cll f = x.f;
        Object o;
        if (Bitmap.class.equals(w)) {
            o = new dnv(imageView);
        }
        else {
            if (!Drawable.class.isAssignableFrom(w)) {
                final String string = w.toString();
                final StringBuilder sb = new StringBuilder("Unhandled class: ");
                sb.append(string);
                sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(sb.toString());
            }
            o = new dny(imageView);
        }
        this.Z((dod)o, null, dnh, doz.a);
    }
    
    public final void q(final int n, final int n2) {
        this.r((dod)new dob(this.v, n, n2));
    }
    
    public final void r(final dod dod) {
        this.Z(dod, null, this, doz.a);
    }
}
