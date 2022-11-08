import java.util.Iterator;
import android.text.Spanned;
import java.util.List;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayy implements aayx
{
    private final aays a;
    private final /* synthetic */ int b;
    
    public aayy(final aays a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private static final aioe b(final CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command != null && ((agzd)commandOuterClass$Command).rs((agyr)akhk.a)) {
            return (aioe)((agzd)commandOuterClass$Command).rr((agyr)akhk.a);
        }
        return null;
    }
    
    private static final aioe c(final CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command != null && ((agzd)commandOuterClass$Command).rs((agyr)akhk.a)) {
            return (aioe)((agzd)commandOuterClass$Command).rr((agyr)akhk.a);
        }
        return null;
    }
    
    public final void a(final alvd alvd) {
        final int b = this.b;
        final aioe aioe = null;
        final aioe aioe2 = null;
        if (b != 0) {
            if (alvd.c()) {
                if (!alvd.getMarkersListModel().f().isEmpty()) {
                    final String e = alvd.e();
                    final List f = alvd.getMarkersListModel().f();
                    final ArrayList list = new ArrayList();
                    final ArrayList list2 = new ArrayList();
                    final afif d = ((afcr)f).D();
                    int n = 0;
                    while (((Iterator)d).hasNext()) {
                        final aluv aluv = (aluv)((Iterator)d).next();
                        final Spanned b2 = abyh.b(aluv.a());
                        aioe c;
                        if (!aluv.g()) {
                            c = null;
                        }
                        else {
                            c = c(aluv.c());
                        }
                        list2.add(aluv.b());
                        list.add(new TimelineMarker((long)aluv.f(), Math.max(aluv.f(), aluv.f() + Math.abs(aluv.e())), n, (CharSequence)b2, c));
                        ++n;
                    }
                    abyh.b(alvd.getMarkersListModel().a());
                    final alvg markersListModel = alvd.getMarkersListModel();
                    aioe c2;
                    if (!markersListModel.h()) {
                        c2 = null;
                    }
                    else {
                        c2 = c(markersListModel.e());
                    }
                    this.a.p(e, abcg.f, new aaym(list, list2, c2));
                    final alvg markersListModel2 = alvd.getMarkersListModel();
                    aioe c3;
                    if (!markersListModel2.g()) {
                        c3 = aioe2;
                    }
                    else {
                        c3 = c(markersListModel2.d());
                    }
                    this.a.e(e, c3);
                }
            }
            return;
        }
        if (alvd.c()) {
            if (!alvd.getMarkersListModel().f().isEmpty()) {
                final String e2 = alvd.e();
                final List f2 = alvd.getMarkersListModel().f();
                final ArrayList list3 = new ArrayList();
                final ArrayList list4 = new ArrayList();
                final afif d2 = ((afcr)f2).D();
                int n2 = 0;
                while (((Iterator)d2).hasNext()) {
                    final aluv aluv2 = (aluv)((Iterator)d2).next();
                    final Spanned b3 = abyh.b(aluv2.a());
                    aioe b4;
                    if (!aluv2.g()) {
                        b4 = null;
                    }
                    else {
                        b4 = b(aluv2.c());
                    }
                    list4.add(aluv2.b());
                    list3.add(new TimelineMarker((long)aluv2.f(), Math.max(aluv2.f(), aluv2.f() + Math.abs(aluv2.e())), n2, (CharSequence)b3, b4));
                    ++n2;
                }
                abyh.b(alvd.getMarkersListModel().a());
                final alvg markersListModel3 = alvd.getMarkersListModel();
                aioe b5;
                if (!markersListModel3.h()) {
                    b5 = null;
                }
                else {
                    b5 = b(markersListModel3.e());
                }
                this.a.p(e2, abcg.g, new aaym(list3, list4, b5));
                final alvg markersListModel4 = alvd.getMarkersListModel();
                aioe b6;
                if (!markersListModel4.g()) {
                    b6 = aioe;
                }
                else {
                    b6 = b(markersListModel4.d());
                }
                this.a.e(e2, b6);
            }
        }
    }
}
