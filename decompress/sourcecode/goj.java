import com.google.protos.youtube.api.innertube.GhostCardRendererOuterClass;
import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.api.innertube.RelatedChipEndpoint$RelatedChipCommand;
import java.util.Map;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goj implements vau
{
    private static final acmx d;
    public final tny a;
    public final wwv b;
    private final acms e;
    
    static {
        d = (acmx)new hvg(1);
    }
    
    public goj(final tny a, final wwv b, final goi e) {
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public static void b(final acin acin, final View view) {
        final gog gog = new gog(view.getResources().getInteger(17694720));
        acin.tb((acim)gog);
        view.post((Runnable)new fsa(acin, (acim)gog, 12));
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = (RelatedChipEndpoint$RelatedChipCommand)((agzd)aioe).rr((agyr)RelatedChipEndpoint$RelatedChipCommand.relatedChipCommand);
        if (relatedChipEndpoint$RelatedChipCommand == null) {
            return;
        }
        final ldv ldv = map.get("sectionController");
        if (ldv == null) {
            return;
        }
        final aclp aclp = map.get("sectionListController");
        if (aclp == null) {
            return;
        }
        final View s = aclp.s();
        final acib f = aclp.f;
        if (s instanceof RecyclerView) {
            if (f instanceof acib) {
                b(aclp.g, s);
                final int c = relatedChipEndpoint$RelatedChipCommand.c;
                final Object o = null;
                if (c == 3 && (boolean)relatedChipEndpoint$RelatedChipCommand.d) {
                    ldv.k();
                }
                else {
                    ajwf ajwf;
                    if ((relatedChipEndpoint$RelatedChipCommand.b & 0x8) != 0x0) {
                        anss anss;
                        if ((anss = relatedChipEndpoint$RelatedChipCommand.e) == null) {
                            anss = anss.a;
                        }
                        ajwf = (ajwf)((agzd)anss).rr((agyr)GhostCardRendererOuterClass.ghostCardRenderer);
                    }
                    else {
                        ajwf = null;
                    }
                    ldv.l(ajwf);
                }
                final int max = Math.max(0, f.j(ldv.a()));
                final RecyclerView recyclerView = (RecyclerView)s;
                recyclerView.aa(max);
                if (relatedChipEndpoint$RelatedChipCommand.c == 3 && (boolean)relatedChipEndpoint$RelatedChipCommand.d) {
                    return;
                }
                Object o2 = o;
                if (relatedChipEndpoint$RelatedChipCommand.c == 1) {
                    o2 = ((agzd)relatedChipEndpoint$RelatedChipCommand.d).rr((agyr)ansi.b);
                }
                if (o2 == null) {
                    return;
                }
                this.e.H = new goh(ldv, new gof(this, aclp, recyclerView, map));
                final acms e = this.e;
                e.G = (acmm)new hvk(this, 1);
                e.ac(aaiy.y(o2), goj.d);
            }
        }
    }
}
