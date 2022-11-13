import java.util.Iterator;
import android.text.Spanned;
import java.util.List;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abaw implements abau
{
    private final abap a;
    private final int b;
    
    public abaw(final abap a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private static final aiqj b(final CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command != null && ((ahbc)commandOuterClass$Command).ry((ahaq)akjn.a)) {
            return (aiqj)((ahbc)commandOuterClass$Command).rx((ahaq)akjn.a);
        }
        return null;
    }
    
    private static final aiqj c(final CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command != null && ((ahbc)commandOuterClass$Command).ry((ahaq)akjn.a)) {
            return (aiqj)((ahbc)commandOuterClass$Command).rx((ahaq)akjn.a);
        }
        return null;
    }
    
    @Override
    public final void a(final alxh alxh) {
        final int b = this.b;
        final aiqj aiqj = null;
        final aiqj aiqj2 = null;
        if (b != 0) {
            if (alxh.c()) {
                if (!alxh.getMarkersListModel().f().isEmpty()) {
                    final String e = alxh.e();
                    final List f = alxh.getMarkersListModel().f();
                    final ArrayList list = new ArrayList();
                    final ArrayList list2 = new ArrayList();
                    final afkf d = ((afeq)f).D();
                    int n = 0;
                    while (((Iterator)d).hasNext()) {
                        final alwz alwz = (alwz)((Iterator)d).next();
                        final Spanned b2 = acak.b(alwz.a());
                        aiqj c;
                        if (!alwz.g()) {
                            c = null;
                        }
                        else {
                            c = c(alwz.c());
                        }
                        list2.add(alwz.b());
                        list.add(new TimelineMarker((long)alwz.f(), Math.max(alwz.f(), alwz.f() + Math.abs(alwz.e())), n, (CharSequence)b2, c));
                        ++n;
                    }
                    acak.b(alxh.getMarkersListModel().a());
                    final alxk markersListModel = alxh.getMarkersListModel();
                    aiqj c2;
                    if (!markersListModel.h()) {
                        c2 = null;
                    }
                    else {
                        c2 = c(markersListModel.e());
                    }
                    this.a.p(e, abea.f, new abaj(list, list2, c2));
                    final alxk markersListModel2 = alxh.getMarkersListModel();
                    aiqj c3;
                    if (!markersListModel2.g()) {
                        c3 = aiqj2;
                    }
                    else {
                        c3 = c(markersListModel2.d());
                    }
                    this.a.e(e, c3);
                }
            }
            return;
        }
        if (alxh.c()) {
            if (!alxh.getMarkersListModel().f().isEmpty()) {
                final String e2 = alxh.e();
                final List f2 = alxh.getMarkersListModel().f();
                final ArrayList list3 = new ArrayList();
                final ArrayList list4 = new ArrayList();
                final afkf d2 = ((afeq)f2).D();
                int n2 = 0;
                while (((Iterator)d2).hasNext()) {
                    final alwz alwz2 = (alwz)((Iterator)d2).next();
                    final Spanned b3 = acak.b(alwz2.a());
                    aiqj b4;
                    if (!alwz2.g()) {
                        b4 = null;
                    }
                    else {
                        b4 = b(alwz2.c());
                    }
                    list4.add(alwz2.b());
                    list3.add(new TimelineMarker((long)alwz2.f(), Math.max(alwz2.f(), alwz2.f() + Math.abs(alwz2.e())), n2, (CharSequence)b3, b4));
                    ++n2;
                }
                acak.b(alxh.getMarkersListModel().a());
                final alxk markersListModel3 = alxh.getMarkersListModel();
                aiqj b5;
                if (!markersListModel3.h()) {
                    b5 = null;
                }
                else {
                    b5 = b(markersListModel3.e());
                }
                this.a.p(e2, abea.g, new abaj(list3, list4, b5));
                final alxk markersListModel4 = alxh.getMarkersListModel();
                aiqj b6;
                if (!markersListModel4.g()) {
                    b6 = aiqj;
                }
                else {
                    b6 = b(markersListModel4.d());
                }
                this.a.e(e2, b6);
            }
        }
    }
}
