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

public final class gnv implements vau
{
    final arhr a;
    final abzk b;
    private final bu d;
    private final vax e;
    private final acng f;
    private final jvu g;
    private final wwu h;
    private final veo i;
    private final hnj j;
    private final uyi k;
    private final aeim l;
    private final bx m;
    private final aeby n;
    private final aeby o;
    private final aeby p;
    
    public gnv(final bu d, final vax e, final acng f, final aeby n, final jvu g, final wwu h, final veo i, final bx m, final aeby p22, final uyi k, final aeim l, final hnj j, final aeby o, final arhr a, final abzk b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
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
        this.p = p22;
        this.k = k;
        this.l = l;
        this.j = j;
        this.o = o;
        this.a = a;
        this.b = b;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        amer amer;
        if ((amer = ((MenuEndpointOuterClass$MenuEndpoint)((agzd)aioe).rr((agyr)MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c) == null) {
            amer = amer.a;
        }
        if ((amer.b & 0x1) != 0x0) {
            amer amer2;
            if ((amer2 = ((MenuEndpointOuterClass$MenuEndpoint)((agzd)aioe).rr((agyr)MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c) == null) {
                amer2 = amer.a;
            }
            ameo ameo;
            if ((ameo = amer2.c) == null) {
                ameo = ameo.a;
            }
            final Optional a = this.j.a();
            if (a.isPresent() && ((hnk)a.get()).E()) {
                ((hnk)a.get()).B(ameo);
                return;
            }
            final View view = (View)tmy.O(map, (Object)"com.google.android.libraries.youtube.rendering.elements.sender_view", (Class)View.class);
            final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
            final boolean b = ameo.k || (boolean)Optional.ofNullable((Object)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class)).map((Function)gnq.d).orElse((Object)false);
            if (this.k.aL()) {
                if (!b && acqn.g((Context)this.d, Optional.of((Object)this.k)) && view != null) {
                    final jvu g = this.g;
                    final Optional ofNullable = Optional.ofNullable((Object)tmy.O(map, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wwv.class));
                    final wwu h = this.h;
                    h.getClass();
                    ((acnn)g).a(ameo, view, m, (wwv)ofNullable.orElseGet((Supplier)new gnu(h, 0)));
                    return;
                }
                acpx.c(this.d, ameo, this.e, this.f, map, this.h, this.l, this.i, this.m, (Integer)null, true, true, this.a, this.b, this.p);
            }
            else {
                if (b) {
                    acpx.c(this.d, ameo, this.e, this.f, map, this.h, this.l, this.i, this.m, (Integer)null, true, true, this.a, this.b, this.p);
                    return;
                }
                if (view == null) {
                    final bu d = this.d;
                    final vax e = this.e;
                    final acng f = this.f;
                    final aeby n = this.n;
                    final aeby p2 = this.p;
                    final aeby o = this.o;
                    final fue fue = new fue(ameo, e, p2, m, null, null, null);
                    final abyy af = o.af((Context)d);
                    ameu ameu;
                    if ((ameu = ameo.d) == null) {
                        ameu = ameu.a;
                    }
                    amet a2;
                    if (ameu.b == 82258301) {
                        a2 = (amet)ameu.c;
                    }
                    else {
                        a2 = amet.a;
                    }
                    final int b2 = a2.b;
                    final ajsq ajsq = null;
                    ajsq ajsq2;
                    if ((b2 & 0x1) != 0x0) {
                        ameu ameu2;
                        if ((ameu2 = ameo.d) == null) {
                            ameu2 = ameu.a;
                        }
                        amet a3;
                        if (ameu2.b == 82258301) {
                            a3 = (amet)ameu2.c;
                        }
                        else {
                            a3 = amet.a;
                        }
                        if ((ajsq2 = a3.c) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    final Spanned b3 = abyh.b(ajsq2);
                    if (b3 != null) {
                        ((AlertDialog$Builder)af).setTitle((CharSequence)b3);
                    }
                    if (ameo.c.size() > 0) {
                        final achs achs = new achs();
                        ((acir)achs).f((Class)amel.class, (acip)new esz((Context)d, f, 3));
                        final achz x = n.X((acir)achs);
                        final acjb acjb = new acjb();
                        final Iterator<Object> iterator = ((List<Object>)ameo.c).iterator();
                        while (iterator.hasNext()) {
                            acjb.add((Object)iterator.next());
                        }
                        x.h((achk)acjb);
                        ((AlertDialog$Builder)af).setAdapter((ListAdapter)x, (DialogInterface$OnClickListener)fue);
                    }
                    ameg ameg;
                    if ((ameg = ameo.e) == null) {
                        ameg = ameg.a;
                    }
                    amef amef;
                    if ((amef = ameg.b) == null) {
                        amef = amef.a;
                    }
                    ajsq ajsq3 = ajsq;
                    if ((amef.b & 0x1) != 0x0) {
                        ameg ameg2;
                        if ((ameg2 = ameo.e) == null) {
                            ameg2 = ameg.a;
                        }
                        amef amef2;
                        if ((amef2 = ameg2.b) == null) {
                            amef2 = amef.a;
                        }
                        if ((ajsq3 = amef2.c) == null) {
                            ajsq3 = ajsq.a;
                        }
                    }
                    final Spanned b4 = abyh.b(ajsq3);
                    if (b4 != null) {
                        ((AlertDialog$Builder)af).setNegativeButton((CharSequence)b4, (DialogInterface$OnClickListener)fue);
                    }
                    ((AlertDialog$Builder)af).setCancelable(true);
                    fue.j(((AlertDialog$Builder)af).create());
                    fue.k();
                    return;
                }
                final jvu g2 = this.g;
                final Optional ofNullable2 = Optional.ofNullable((Object)tmy.O(map, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wwv.class));
                final wwu h2 = this.h;
                h2.getClass();
                ((acnn)g2).a(ameo, view, m, (wwv)ofNullable2.orElseGet((Supplier)new gnu(h2, 0)));
            }
        }
    }
}
