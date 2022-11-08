import java.util.Iterator;
import android.util.DisplayMetrics;
import java.util.List;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayu implements aayx
{
    private final aays a;
    private final Context b;
    
    public aayu(final Context b, final aays a) {
        this.b = b;
        this.a = a;
    }
    
    private static final aioe b(final CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command != null && ((agzd)commandOuterClass$Command).rs((agyr)akhk.a)) {
            return (aioe)((agzd)commandOuterClass$Command).rr((agyr)akhk.a);
        }
        return null;
    }
    
    public final void a(final alvd alvd) {
        if (alvd.c()) {
            if (!alvd.getMarkersListModel().f().isEmpty()) {
                final String e = alvd.e();
                final List f = alvd.getMarkersListModel().f();
                final afgh afgh = (afgh)f;
                final ArrayList list = new ArrayList(afgh.c);
                final ArrayList list2 = new ArrayList(afgh.c);
                final afif d = ((afcr)f).D();
                aioe aioe;
                while (true) {
                    final boolean hasNext = ((Iterator)d).hasNext();
                    aioe = null;
                    aioe b = null;
                    if (!hasNext) {
                        break;
                    }
                    final aluv aluv = (aluv)((Iterator)d).next();
                    final int b2 = aluv.b.b;
                    float an = 0.0f;
                    if ((b2 & 0x10) != 0x0) {
                        aluv.d();
                        an = tmy.aN(aluv.d().floatValue(), 0.0f, 1.0f);
                    }
                    list2.add((Object)an);
                    if (aluv.g()) {
                        b = b(aluv.c());
                    }
                    final long max = Math.max(aluv.f(), aluv.f() + Math.abs(aluv.e()));
                    if (b != null) {
                        list.add((Object)new TimelineMarker((long)aluv.f(), max, b));
                    }
                    else {
                        list.add((Object)new TimelineMarker((long)aluv.f(), max));
                    }
                }
                final aays a = this.a;
                final abcg h = abcg.h;
                final ArrayList list3 = new ArrayList();
                if ((alvd.getMarkersListModel().b.b & 0x100) != 0x0) {
                    if (!alvd.getMarkersListModel().b().a().isEmpty()) {
                        final afif d2 = ((afcr)alvd.getMarkersListModel().b().a()).D();
                        while (((Iterator)d2).hasNext()) {
                            final aosa aosa = (aosa)((Iterator)d2).next();
                            final aayn a2 = aayo.a();
                            a2.b((long)aosa.b.d);
                            a2.d((long)aosa.b.b);
                            a2.c((long)aosa.b.c);
                            akbe akbe;
                            if ((akbe = akbe.b(aosa.b.f)) == null) {
                                akbe = akbe.a;
                            }
                            a2.e(akbe);
                            ajsq ajsq;
                            if ((ajsq = aosa.b.e) == null) {
                                ajsq = ajsq.a;
                            }
                            a2.f((CharSequence)abyh.b(ajsq));
                            list3.add(a2.a());
                        }
                    }
                }
                final DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
                aayf aayf;
                if ((alvd.getMarkersListModel().b.b & 0x80) != 0x0 && alvd.getMarkersListModel().c().b == 1) {
                    final alzt c = alvd.getMarkersListModel().c();
                    ajyx a3;
                    if (c.b == 1) {
                        a3 = (ajyx)c.c;
                    }
                    else {
                        a3 = ajyx.a;
                    }
                    final int c2 = a3.c;
                    final alzt c3 = alvd.getMarkersListModel().c();
                    ajyx a4;
                    if (c3.b == 1) {
                        a4 = (ajyx)c3.c;
                    }
                    else {
                        a4 = ajyx.a;
                    }
                    final int d3 = a4.d;
                    final alzt c4 = alvd.getMarkersListModel().c();
                    ajyx a5;
                    if (c4.b == 1) {
                        a5 = (ajyx)c4.c;
                    }
                    else {
                        a5 = ajyx.a;
                    }
                    int f2;
                    if ((a5.b & 0x8) != 0x0) {
                        final alzt c5 = alvd.getMarkersListModel().c();
                        ajyx a6;
                        if (c5.b == 1) {
                            a6 = (ajyx)c5.c;
                        }
                        else {
                            a6 = ajyx.a;
                        }
                        f2 = a6.f;
                    }
                    else {
                        f2 = 0;
                    }
                    final alzt c6 = alvd.getMarkersListModel().c();
                    ajyx a7;
                    if (c6.b == 1) {
                        a7 = (ajyx)c6.c;
                    }
                    else {
                        a7 = ajyx.a;
                    }
                    final int e2 = a7.e;
                    final aaye b3 = aayf.a(displayMetrics).b();
                    b3.c(tmy.aZ(displayMetrics, c2));
                    b3.d(tmy.aZ(displayMetrics, d3));
                    b3.b(tmy.aZ(displayMetrics, f2));
                    b3.e((long)e2);
                    aayf = b3.a();
                }
                else {
                    aayf = aayf.a(displayMetrics);
                }
                a.p(e, h, new aayg(list, list3, aayf, list2));
                final alvg markersListModel = alvd.getMarkersListModel();
                aioe b4;
                if (!markersListModel.g()) {
                    b4 = aioe;
                }
                else {
                    b4 = b(markersListModel.d());
                }
                this.a.e(e, b4);
            }
        }
    }
}
