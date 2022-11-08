import java.util.function.Supplier;
import j$.util.Optional;
import android.os.Bundle;
import android.view.View$OnClickListener;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fas implements acik
{
    public final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public fas(final jvc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fas(final lzi a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final acij acij, final achk achk, final int n) {
        final int b = this.b;
        final Object o = null;
        final kde kde = null;
        int n2 = -1;
        switch (b) {
            default: {
                final kde kde2 = (kde)this.a;
                Object j = o;
                if (((tdv)kde2.f).size() > 1) {
                    j = kde2.j;
                }
                acij.f("carousel_scroll_listener", j);
                return;
            }
            case 19: {
                Object a = this.a;
                if (((tdv)((kde)a).f).size() <= 1) {
                    a = kde;
                }
                acij.f("carousel_auto_rotate_callback", a);
                return;
            }
            case 18: {
                ((wwx)acij).a((wwv)this.a);
                return;
            }
            case 17: {
                final jxp jxp = (jxp)this.a;
                if (jxp.l == null) {
                    trn.b("Skipping present context decoration when sectionListController is not set.");
                    return;
                }
                ((wwx)acij).a(jxp.i);
                final aexq s = jxp.s(n);
                if (s.h()) {
                    final afcr a2 = ftv.a;
                    aiiv aiiv;
                    if ((aiiv = ((aiit)s.c()).e) == null) {
                        aiiv = aiiv.a;
                    }
                    aiiu aiiu;
                    if ((aiiu = aiiu.b(aiiv.c)) == null) {
                        aiiu = aiiu.a;
                    }
                    if (!a2.contains((Object)aiiu)) {
                        if (jxp.w(n)) {
                            ftv.g(acij, (View$OnClickListener)new jtw(jxp, 7));
                        }
                        else {
                            ftv.f(acij, (acie)new inr(jxp, 3));
                        }
                        acij.g((Map)afcw.m((Object)"sectionListController", (Object)jxp.l));
                    }
                }
                return;
            }
            case 16: {
                ((jvc)this.a).g(acij, achk, n);
                return;
            }
            case 15: {
                acij.f(jut.a, this.a);
                return;
            }
            case 14: {
                final Object a3 = this.a;
                if (((jtp)a3).f) {
                    jsg.k(acij, ((acoj)a3).h);
                }
                return;
            }
            case 13: {
                acij.f(jtd.a, this.a);
                return;
            }
            case 12: {
                jsg.l(acij, "DragReorderCoordinator.PRESENT_CONTEXT_KEY", this.a);
                return;
            }
            case 11: {
                acij.f("SEARCH_SUGGESTION_PRESENTER_EVENT_LISTENER", this.a);
                return;
            }
            case 10: {
                ((wwx)acij).a((wwv)this.a);
                return;
            }
            case 9: {
                final Object a4 = this.a;
                final Object c = achk.c(n);
                if (!(c instanceof ajtr) && !(c instanceof ajkj)) {
                    if (c instanceof ajtn) {
                        final alff g = ((jar)a4).g;
                        if (g != null) {
                            ((wwx)acij).e = g;
                        }
                    }
                    return;
                }
                acij.f("ITEM_COUNT", (Object)achk.a());
                return;
            }
            case 8: {
                if (((iom)this.a).a.o()) {
                    n2 = 20;
                }
                acij.f("BackgroundPromoPresenter.BottomPaddingKey", (Object)n2);
                return;
            }
            case 7: {
                if (((iom)this.a).a.g()) {
                    n2 = 16;
                }
                acij.f("BackgroundPromoPresenter.BodyTextTopPaddingKey", (Object)n2);
                return;
            }
            case 6: {
                final wyb wyb = (wyb)iji.a.get((Object)((iom)this.a).b);
                wyb.getClass();
                ((wwx)acij).d = (wxz)new wws(wyb);
                return;
            }
            case 5: {
                acij.f("downloads_page_section_key", (Object)((iom)this.a).b);
                return;
            }
            case 4: {
                acij.f("OfflineVideoPresenter.playlistId", (Object)((ifi)this.a).g);
                return;
            }
            case 3: {
                final Object a5 = this.a;
                acij.f("nested_fragment_key", (Object)((hvp)a5).bm());
                acij.f("selection_panel", (Object)((Bundle)Optional.ofNullable((Object)((br)a5).m).orElseGet((Supplier)fde.t)).getBoolean("selection_panel", false));
                return;
            }
            case 2: {
                acij.g((Map)this.a);
                return;
            }
            case 1: {
                final ezt ezt = (ezt)this.a;
                if (!ezt.j()) {
                    return;
                }
                acij.f("CHANNEL_LIST_SUB_MENU_AVATAR_ON_CLICK_INTERCEPT_KEY", (Object)new kgh(ezt, n, 1));
                acij.f("CHANNEL_LIST_SUB_MENU_AVATAR_CURRENT_STATE_KEY", (Object)ezt.f(n, ezt.e));
                acij.f("CHANNEL_LIST_SUB_MENU_AVATAR_STATE_CHANGED_OBSERVABLE_KEY", (Object)((ashe)ezt.d).W((asjc)new fli(n, 1)));
                return;
            }
            case 0: {
                acij.f("adTracker", this.a);
            }
        }
    }
}
