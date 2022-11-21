import java.util.List;
import android.view.View;
import android.widget.AdapterView;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Bundle;
import java.util.Iterator;
import android.content.Context;
import android.widget.ListAdapter;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class actr extends actd implements AdapterView$OnItemClickListener
{
    private amiv ae;
    private acmr af;
    public actq ag;
    public acqv ah;
    public xab ai;
    public Integer aj;
    
    private final void aQ(final akfj akfj, final tui tui) {
        if (akfj != null && (akfj.b & 0x1) != 0x0) {
            final acqv ah = this.ah;
            if (ah != null) {
                akfi akfi;
                if ((akfi = akfi.b(akfj.c)) == null) {
                    akfi = akfi.a;
                }
                final int a = ah.a(akfi);
                if (a != 0) {
                    final Integer aj = this.aj;
                    if (aj != null) {
                        tui.a((Object)tqf.k(((br)this).nQ(), a, (int)aj));
                        return;
                    }
                    tui.a((Object)agy.a(((br)this).nQ(), a));
                    return;
                }
            }
        }
        tui.a((Object)null);
    }
    
    public final void Y() {
        super.Y();
        if (((br)this).oa().isInPictureInPictureMode()) {
            ((bi)this).dismiss();
        }
    }
    
    protected /* bridge */ ListAdapter aM() {
        return (ListAdapter)this.aO();
    }
    
    protected acth aO() {
        this.af = new acmr();
        final amiv ae = this.ae;
        if (ae != null) {
            final Iterator<Object> iterator = ((List<Object>)ae.c).iterator();
            while (iterator.hasNext()) {
                final afbh ap = this.aP(iterator.next());
                if (ap.h()) {
                    this.af.add(ap.c());
                }
            }
        }
        if (this.af.isEmpty()) {
            znh.b(zng.b, znf.y, "Bottom Sheet Menu is empty. No menu items were supported.");
        }
        return new acth((Context)((br)this).oa(), (acla)this.af);
    }
    
    protected final afbh aP(final amis amis) {
        final akfj o = wbe.o(amis);
        final CharSequence q = wbe.q(amis);
        if (q == null) {
            if (o != null && (o.b & 0x1) != 0x0) {
                final zng b = zng.b;
                final znf y = znf.y;
                akfi akfi;
                if ((akfi = akfi.b(o.c)) == null) {
                    akfi = akfi.a;
                }
                final int sb = akfi.sB;
                final StringBuilder sb2 = new StringBuilder("Text missing for BottomSheetMenuItem with iconType: ");
                sb2.append(sb);
                znh.b(b, y, sb2.toString());
            }
            else {
                znh.b(zng.b, znf.y, "Text missing for BottomSheetMenuItem.");
            }
            return afag.a;
        }
        final ahbt l = wbe.l(amis);
        if (this.ai != null && !l.H()) {
            this.ai.t((xbe)new wzy(l), (alji)null);
        }
        final actk actk = new actk(q.toString(), amis);
        actk.d(wbe.s(amis) != 2);
        this.aQ(o, (tui)new actp(actk, 1));
        this.aQ(wbe.p(amis), (tui)new actp(actk, 0));
        return afbh.k(actk);
    }
    
    protected final int nN() {
        return 0;
    }
    
    protected final AdapterView$OnItemClickListener nO() {
        return (AdapterView$OnItemClickListener)this;
    }
    
    protected final String nP() {
        return null;
    }
    
    public void ol(Bundle m) {
        super.ol(m);
        m = ((br)this).m;
        if (m != null && m.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            try {
                this.ae = (amiv)adzw.az(m, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)amiv.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahds ahds) {
                tut.d("Error decoding menu", (Throwable)ahds);
                this.ae = amiv.a;
            }
        }
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final qlk qlk = (qlk)((acth)((qli)this).au).c(n);
        if (qlk instanceof actk) {
            final amis k = ((actk)qlk).k;
            final actq ag = this.ag;
            if (ag != null) {
                ag.a(k);
            }
        }
        ((bi)this).dismiss();
    }
}
