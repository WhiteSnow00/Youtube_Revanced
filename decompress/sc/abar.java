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

public final class abar implements abau
{
    private final abap a;
    private final Context b;
    
    public abar(final Context b, final abap a) {
        this.b = b;
        this.a = a;
    }
    
    private static final aiqj b(final CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command != null && ((ahbc)commandOuterClass$Command).ry((ahaq)akjn.a)) {
            return (aiqj)((ahbc)commandOuterClass$Command).rx((ahaq)akjn.a);
        }
        return null;
    }
    
    @Override
    public final void a(final alxh alxh) {
        if (alxh.c()) {
            if (!alxh.getMarkersListModel().f().isEmpty()) {
                final String e = alxh.e();
                final List f = alxh.getMarkersListModel().f();
                final afih afih = (afih)f;
                final ArrayList list = new ArrayList(afih.c);
                final ArrayList list2 = new ArrayList(afih.c);
                final afkf d = ((afeq)f).D();
                aiqj aiqj;
                while (true) {
                    final boolean hasNext = ((Iterator)d).hasNext();
                    aiqj = null;
                    aiqj b = null;
                    if (!hasNext) {
                        break;
                    }
                    final alwz alwz = (alwz)((Iterator)d).next();
                    final int b2 = alwz.b.b;
                    float an = 0.0f;
                    if ((b2 & 0x10) != 0x0) {
                        alwz.d();
                        an = tpe.aN(alwz.d().floatValue(), 0.0f, 1.0f);
                    }
                    list2.add((Object)an);
                    if (alwz.g()) {
                        b = b(alwz.c());
                    }
                    final long max = Math.max(alwz.f(), alwz.f() + Math.abs(alwz.e()));
                    if (b != null) {
                        list.add((Object)new TimelineMarker((long)alwz.f(), max, b));
                    }
                    else {
                        list.add((Object)new TimelineMarker((long)alwz.f(), max));
                    }
                }
                final abap a = this.a;
                final abea h = abea.h;
                final ArrayList list3 = new ArrayList();
                if ((alxh.getMarkersListModel().b.b & 0x100) != 0x0) {
                    if (!alxh.getMarkersListModel().b().a().isEmpty()) {
                        final afkf d2 = ((afeq)alxh.getMarkersListModel().b().a()).D();
                        while (((Iterator)d2).hasNext()) {
                            final aoud aoud = (aoud)((Iterator)d2).next();
                            final abak a2 = abal.a();
                            a2.b(aoud.b.d);
                            a2.d(aoud.b.b);
                            a2.c(aoud.b.c);
                            akdh akdh;
                            if ((akdh = akdh.b(aoud.b.f)) == null) {
                                akdh = akdh.a;
                            }
                            a2.e(akdh);
                            ajut ajut;
                            if ((ajut = aoud.b.e) == null) {
                                ajut = ajut.a;
                            }
                            a2.f((CharSequence)acak.b(ajut));
                            list3.add(a2.a());
                        }
                    }
                }
                final DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
                abac abac;
                if ((alxh.getMarkersListModel().b.b & 0x80) != 0x0 && alxh.getMarkersListModel().c().b == 1) {
                    final ambx c = alxh.getMarkersListModel().c();
                    akba a3;
                    if (c.b == 1) {
                        a3 = (akba)c.c;
                    }
                    else {
                        a3 = akba.a;
                    }
                    final int c2 = a3.c;
                    final ambx c3 = alxh.getMarkersListModel().c();
                    akba a4;
                    if (c3.b == 1) {
                        a4 = (akba)c3.c;
                    }
                    else {
                        a4 = akba.a;
                    }
                    final int d3 = a4.d;
                    final ambx c4 = alxh.getMarkersListModel().c();
                    akba a5;
                    if (c4.b == 1) {
                        a5 = (akba)c4.c;
                    }
                    else {
                        a5 = akba.a;
                    }
                    int f2;
                    if ((a5.b & 0x8) != 0x0) {
                        final ambx c5 = alxh.getMarkersListModel().c();
                        akba a6;
                        if (c5.b == 1) {
                            a6 = (akba)c5.c;
                        }
                        else {
                            a6 = akba.a;
                        }
                        f2 = a6.f;
                    }
                    else {
                        f2 = 0;
                    }
                    final ambx c6 = alxh.getMarkersListModel().c();
                    akba a7;
                    if (c6.b == 1) {
                        a7 = (akba)c6.c;
                    }
                    else {
                        a7 = akba.a;
                    }
                    final int e2 = a7.e;
                    final abab b3 = abac.a(displayMetrics).b();
                    b3.c(tpe.aZ(displayMetrics, c2));
                    b3.d(tpe.aZ(displayMetrics, d3));
                    b3.b(tpe.aZ(displayMetrics, f2));
                    b3.e(e2);
                    abac = b3.a();
                }
                else {
                    abac = abac.a(displayMetrics);
                }
                a.p(e, h, new abad(list, list3, abac, list2));
                final alxk markersListModel = alxh.getMarkersListModel();
                aiqj b4;
                if (!markersListModel.g()) {
                    b4 = aiqj;
                }
                else {
                    b4 = b(markersListModel.d());
                }
                this.a.e(e, b4);
            }
        }
    }
}
