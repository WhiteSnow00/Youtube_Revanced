import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.Iterator;
import android.view.View$OnAttachStateChangeListener;
import com.google.android.libraries.youtube.engagementpanel.LinearScrollToItemLayoutManager;
import android.support.v7.widget.RecyclerView;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvl implements usp
{
    private final atjj a;
    private final atjj b;
    
    public kvl(final atjj b, final atjj a) {
        this.a = a;
        this.b = b;
    }
    
    public final Optional a(final Object o, final usn usn, final wwv j) {
        if (o instanceof ver) {
            final ver ver = (ver)o;
            if (ldz.u(ver)) {
                final ldz ldz = (ldz)this.b.a();
                ((acnw)ldz).j(ver);
                return Optional.of((Object)ldz);
            }
        }
        if (o instanceof angx) {
            final kvu kvu = (kvu)this.a.a();
            final Iterator iterator = kvu.h.iterator();
            while (iterator.hasNext()) {
                usn.e((acik)iterator.next());
            }
            if (usn.d().isPresent()) {
                final RecyclerView l = (RecyclerView)usn.d().get();
                final LoadingFrameLayout c = usn.c();
                kvu.l = l;
                kvu.w.j(l, kvu.v);
                kvu.y.a(l);
                l.af((nw)LinearScrollToItemLayoutManager.r(l.getContext()));
                kvu.q = l.r;
                l.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ie(kvu, 7));
                c.getClass();
                kvu.m = c;
                kvu.j = j;
                kvu.k = new lgk(kvu.f, kvu.a, tdz.c(), kvu.c, kvu.j, kvu.e);
                final RecyclerView i = kvu.l;
                if (i != null) {
                    i.aE(new kvr(kvu));
                }
                kvu.r = ((asgt)kvu.i).al((asix)new kuc(kvu, 14));
                kvu.n = true;
                kvu.a.g((Object)kvu);
            }
            return Optional.of((Object)kvu);
        }
        return Optional.empty();
    }
}
