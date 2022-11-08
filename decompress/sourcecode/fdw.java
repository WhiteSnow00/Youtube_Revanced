import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdw implements vau
{
    private final /* synthetic */ int a;
    
    public fdw(final int a) {
        this.a = a;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final int a = this.a;
        int n = 1;
        switch (a) {
            default: {
                if (!((agzd)aioe).rs((agyr)OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)) {
                    return;
                }
                anss anss;
                if ((anss = ((OpenDialogCommandOuterClass$OpenDialogCommand)((agzd)aioe).rr((agyr)OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).c) == null) {
                    anss = anss.a;
                }
                ((agzd)anss).rs((agyr)amqe.a);
                return;
            }
            case 9: {
                return;
            }
            case 8: {
                if (!((agzd)aioe).rs((agyr)LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)) {
                    return;
                }
                final LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint)((agzd)aioe).rr((agyr)LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
                if ((liveChatEndpointOuterClass$LiveChatEndpoint.b & 0x2) == 0x0) {
                    return;
                }
                final vyd vyd = (vyd)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)vyd.class);
                if (vyd == null) {
                    return;
                }
                alpz alpz;
                if ((alpz = liveChatEndpointOuterClass$LiveChatEndpoint.d) == null) {
                    alpz = alpz.a;
                }
                if ((alpz.b & 0x1) != 0x0) {
                    alpz alpz2;
                    if ((alpz2 = liveChatEndpointOuterClass$LiveChatEndpoint.d) == null) {
                        alpz2 = alpz.a;
                    }
                    ansi ansi;
                    if ((ansi = alpz2.c) == null) {
                        ansi = ansi.a;
                    }
                    vyd.y(aaiy.y((Object)ansi));
                    return;
                }
                final alpz d = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                alpz a2;
                if (d == null) {
                    a2 = alpz.a;
                }
                else {
                    a2 = d;
                }
                if ((a2.b & 0x2) != 0x0) {
                    alpz a3;
                    if ((a3 = d) == null) {
                        a3 = alpz.a;
                    }
                    aorx aorx;
                    if ((aorx = a3.d) == null) {
                        aorx = aorx.a;
                    }
                    vyd.y(aaiy.y((Object)aorx));
                    return;
                }
                alpz a4;
                if (d == null) {
                    a4 = alpz.a;
                }
                else {
                    a4 = d;
                }
                if ((a4.b & 0x4) != 0x0) {
                    alpz a5;
                    if ((a5 = d) == null) {
                        a5 = alpz.a;
                    }
                    alhg alhg;
                    if ((alhg = a5.e) == null) {
                        alhg = alhg.a;
                    }
                    vyd.y(aaiy.y((Object)alhg));
                    return;
                }
                alpz a6;
                if (d == null) {
                    a6 = alpz.a;
                }
                else {
                    a6 = d;
                }
                if ((a6.b & 0x8) != 0x0) {
                    alpz a7;
                    if ((a7 = d) == null) {
                        a7 = alpz.a;
                    }
                    alqa alqa;
                    if ((alqa = a7.f) == null) {
                        alqa = alqa.a;
                    }
                    vyd.y(aaiy.y((Object)alqa));
                    return;
                }
                alpz a8;
                if (d == null) {
                    a8 = alpz.a;
                }
                else {
                    a8 = d;
                }
                if ((a8.b & 0x10) != 0x0) {
                    alpz a9;
                    if ((a9 = d) == null) {
                        a9 = alpz.a;
                    }
                    aney aney;
                    if ((aney = a9.g) == null) {
                        aney = aney.a;
                    }
                    vyd.y(aaiy.y((Object)aney));
                }
                return;
            }
            case 7: {
                return;
            }
            case 6: {
                final snm snm = (snm)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)snm.class);
                if (((agzd)aioe).rs((agyr)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction) && snm != null) {
                    snm.a((UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction)((agzd)aioe).rr((agyr)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction));
                }
                return;
            }
            case 5: {
                final hok hok = (hok)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)hok.class);
                agot.u(((agzd)aioe).rs((agyr)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.reelWatchSurveyActionCommand));
                final ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand = (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand)((agzd)aioe).rr((agyr)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.reelWatchSurveyActionCommand);
                final int bs = aqql.bS(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.c);
                if (bs != 0) {
                    n = bs;
                }
                if (n == 2) {
                    hok.f(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.b);
                    return;
                }
                if (n == 3) {
                    hok.c(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.b);
                }
                return;
            }
            case 4: {
                ((his)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)his.class)).f();
            }
            case 3: {
                return;
            }
            case 2: {
                ((agzd)aioe).rs((agyr)ajcl.b);
            }
            case 1: {
                return;
            }
            case 0: {
                final UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction = (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction)((agzd)aioe).rr((agyr)UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.updateHorizontalCardListAction);
                String s;
                if (updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.b == 3) {
                    s = (String)updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.c;
                }
                else {
                    s = "";
                }
                final acpd acpd = (acpd)tmy.O(map, (Object)"sectionListController", (Class)acpd.class);
                if (acpd == null) {
                    trn.b("Cannot perform UpdateHorizontalCardListAction on a null section list controller.");
                    return;
                }
                if (s.isEmpty()) {
                    trn.b("Cannot perform UpdateHorizontalCardListAction without a section identifier.");
                    return;
                }
                apdx apdx;
                if ((apdx = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d) == null) {
                    apdx = apdx.a;
                }
                if (apdx.b != 50195462) {
                    trn.b("Cannot perform UpdateHorizontalCardListAction with a null replacement ItemSectionRenderer.");
                    return;
                }
                apdx apdx2;
                if ((apdx2 = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d) == null) {
                    apdx2 = apdx.a;
                }
                alib a10;
                if (apdx2.b == 50195462) {
                    a10 = (alib)apdx2.c;
                }
                else {
                    a10 = alib.a;
                }
                final acnw acnw = (acnw)acpd.u(s);
                if (acnw == null) {
                    final StringBuilder sb = new StringBuilder("Cannot perform UpdateHorizontalCardListAction. An ItemSectionController identified by \"");
                    sb.append(s);
                    sb.append("\" was not found.");
                    trn.b(sb.toString());
                    return;
                }
                acnw.j(new ver(a10));
                if (((acmv)acnw).a().a() > 0 && acpd instanceof acor) {
                    final RecyclerView n2 = ((acor)acpd).N;
                    if (!n2.canScrollVertically(-1)) {
                        final nw n3 = n2.n;
                        if (n3 instanceof LinearLayoutManager) {
                            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)n3;
                            int i = 0;
                            int j;
                            if (linearLayoutManager == null) {
                                j = 0;
                            }
                            else {
                                j = linearLayoutManager.J();
                            }
                            final achk t = acpd.t();
                            final Object c = ((acmv)acnw).a().c(0);
                            while (i <= j) {
                                if (t.c(i) == c) {
                                    acpd.mC(s);
                                    return;
                                }
                                ++i;
                            }
                        }
                    }
                }
            }
        }
    }
}
