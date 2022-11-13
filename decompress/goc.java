import java.util.List;
import android.app.AlertDialog$Builder;
import java.util.Iterator;
import android.text.Spanned;
import android.content.DialogInterface$OnClickListener;
import android.widget.ListAdapter;
import java.util.function.Supplier;
import android.content.Context;
import java.util.function.Function;
import j$.util.Optional;
import android.os.Bundle;
import android.view.View;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goc implements vcv
{
    public static final int c = 0;
    final arkg a;
    final acbm b;
    private final bu d;
    private final vcy e;
    private final acpk f;
    private final jwv g;
    private final wyv h;
    private final vgo i;
    private final hof j;
    private final vai k;
    private final aekp l;
    private final bx m;
    private final aeea n;
    private final aeea o;
    private final aeea p;
    
    public goc(final bu d, final vcy e, final acpk f, final aeea n, final jwv g, final wyv h, final vgo i, final bx m, final aeea p21, final vai k, final aekp l, final hof j, final aeea o, final arkg a, final acbm b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        this.n = n;
        this.g = g;
        this.h = h;
        this.i = i;
        this.m = m;
        this.p = p21;
        this.k = k;
        this.l = l;
        this.j = j;
        this.o = o;
        this.a = a;
        this.b = b;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        amgv amgv;
        if ((amgv = ((MenuEndpointOuterClass$MenuEndpoint)((ahbc)aiqj).rx((ahaq)MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c) == null) {
            amgv = amgv.a;
        }
        if ((amgv.b & 0x1) != 0x0) {
            amgv amgv2;
            if ((amgv2 = ((MenuEndpointOuterClass$MenuEndpoint)((ahbc)aiqj).rx((ahaq)MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c) == null) {
                amgv2 = amgv.a;
            }
            amgs amgs;
            if ((amgs = amgv2.c) == null) {
                amgs = amgs.a;
            }
            final Optional a = this.j.a();
            if (a.isPresent() && ((hog)a.get()).E()) {
                ((hog)a.get()).B(amgs);
                return;
            }
            final View view = (View)tpe.O(map, (Object)"com.google.android.libraries.youtube.rendering.elements.sender_view", (Class)View.class);
            final Object m = tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
            final boolean b = amgs.k || (boolean)Optional.ofNullable((Object)tpe.O(map, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class)).map((Function)gnx.d).orElse((Object)false);
            if (this.k.aL()) {
                if (!b && acsr.g((Context)this.d, Optional.of((Object)this.k)) && view != null) {
                    final jwv g = this.g;
                    final Optional ofNullable = Optional.ofNullable((Object)tpe.O(map, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wyw.class));
                    final wyv h = this.h;
                    h.getClass();
                    ((acpr)g).a(amgs, view, m, (wyw)ofNullable.orElseGet((Supplier)new gob(h, 0)));
                    return;
                }
                acsb.c(this.d, amgs, this.e, this.f, map, this.h, this.l, this.i, this.m, (Integer)null, true, true, this.a, this.b, this.p);
            }
            else {
                if (b) {
                    acsb.c(this.d, amgs, this.e, this.f, map, this.h, this.l, this.i, this.m, (Integer)null, true, true, this.a, this.b, this.p);
                    return;
                }
                if (view == null) {
                    final bu d = this.d;
                    final vcy e = this.e;
                    final acpk f = this.f;
                    final aeea n = this.n;
                    final aeea p2 = this.p;
                    final aeea o = this.o;
                    final fum fum = new fum(amgs, e, p2, m, null, null, null, null);
                    final acba al = o.al((Context)d);
                    amgy amgy;
                    if ((amgy = amgs.d) == null) {
                        amgy = amgy.a;
                    }
                    amgx a2;
                    if (amgy.b == 82258301) {
                        a2 = (amgx)amgy.c;
                    }
                    else {
                        a2 = amgx.a;
                    }
                    final int b2 = a2.b;
                    final ajut ajut = null;
                    ajut ajut2;
                    if ((b2 & 0x1) != 0x0) {
                        amgy amgy2;
                        if ((amgy2 = amgs.d) == null) {
                            amgy2 = amgy.a;
                        }
                        amgx a3;
                        if (amgy2.b == 82258301) {
                            a3 = (amgx)amgy2.c;
                        }
                        else {
                            a3 = amgx.a;
                        }
                        if ((ajut2 = a3.c) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    final Spanned b3 = acak.b(ajut2);
                    if (b3 != null) {
                        ((AlertDialog$Builder)al).setTitle((CharSequence)b3);
                    }
                    if (amgs.c.size() > 0) {
                        final acjv acjv = new acjv();
                        ((acku)acjv).f((Class)amgp.class, (acks)new etc((Context)d, f, 3));
                        final ackc ad = n.ad((acku)acjv);
                        final acle acle = new acle();
                        final Iterator<Object> iterator = ((List<Object>)amgs.c).iterator();
                        while (iterator.hasNext()) {
                            acle.add((Object)iterator.next());
                        }
                        ad.h((acjn)acle);
                        ((AlertDialog$Builder)al).setAdapter((ListAdapter)ad, (DialogInterface$OnClickListener)fum);
                    }
                    amgk amgk;
                    if ((amgk = amgs.e) == null) {
                        amgk = amgk.a;
                    }
                    amgj amgj;
                    if ((amgj = amgk.b) == null) {
                        amgj = amgj.a;
                    }
                    ajut ajut3 = ajut;
                    if ((amgj.b & 0x1) != 0x0) {
                        amgk amgk2;
                        if ((amgk2 = amgs.e) == null) {
                            amgk2 = amgk.a;
                        }
                        amgj amgj2;
                        if ((amgj2 = amgk2.b) == null) {
                            amgj2 = amgj.a;
                        }
                        if ((ajut3 = amgj2.c) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    final Spanned b4 = acak.b(ajut3);
                    if (b4 != null) {
                        ((AlertDialog$Builder)al).setNegativeButton((CharSequence)b4, (DialogInterface$OnClickListener)fum);
                    }
                    ((AlertDialog$Builder)al).setCancelable(true);
                    fum.j(((AlertDialog$Builder)al).create());
                    fum.k();
                    return;
                }
                final jwv g2 = this.g;
                final Optional ofNullable2 = Optional.ofNullable((Object)tpe.O(map, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wyw.class));
                final wyv h2 = this.h;
                h2.getClass();
                ((acpr)g2).a(amgs, view, m, (wyw)ofNullable2.orElseGet((Supplier)new gob(h2, 0)));
            }
        }
    }
}
