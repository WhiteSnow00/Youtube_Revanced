import com.google.protos.youtube.api.innertube.GhostCardRendererOuterClass;
import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.api.innertube.RelatedChipEndpoint$RelatedChipCommand;
import java.util.Map;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goq implements vcv
{
    public static final int c = 0;
    private static final acpa d;
    public final tqd a;
    public final wyw b;
    private final acov e;
    
    static {
        d = new hwc(1);
    }
    
    public goq(final tqd a, final wyw b, final gop e) {
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public static void b(final ackq ackq, final View view) {
        final gon gon = new gon(view.getResources().getInteger(17694720));
        ackq.th((ackp)gon);
        view.post((Runnable)new fsi(ackq, (ackp)gon, 12));
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = (RelatedChipEndpoint$RelatedChipCommand)((ahbc)aiqj).rx((ahaq)RelatedChipEndpoint$RelatedChipCommand.relatedChipCommand);
        if (relatedChipEndpoint$RelatedChipCommand == null) {
            return;
        }
        final lex lex = map.get("sectionController");
        if (lex == null) {
            return;
        }
        final acns acns = map.get("sectionListController");
        if (acns == null) {
            return;
        }
        final View s = acns.s();
        final acke f = acns.f;
        if (s instanceof RecyclerView) {
            if (f instanceof acke) {
                b(acns.g, s);
                final int c = relatedChipEndpoint$RelatedChipCommand.c;
                final Object o = null;
                if (c == 3 && (boolean)relatedChipEndpoint$RelatedChipCommand.d) {
                    lex.k();
                }
                else {
                    ajyi ajyi;
                    if ((relatedChipEndpoint$RelatedChipCommand.b & 0x8) != 0x0) {
                        anuv anuv;
                        if ((anuv = relatedChipEndpoint$RelatedChipCommand.e) == null) {
                            anuv = anuv.a;
                        }
                        ajyi = (ajyi)((ahbc)anuv).rx((ahaq)GhostCardRendererOuterClass.ghostCardRenderer);
                    }
                    else {
                        ajyi = null;
                    }
                    lex.l(ajyi);
                }
                final int max = Math.max(0, f.j(lex.a()));
                final RecyclerView recyclerView = (RecyclerView)s;
                recyclerView.aa(max);
                if (relatedChipEndpoint$RelatedChipCommand.c == 3 && (boolean)relatedChipEndpoint$RelatedChipCommand.d) {
                    return;
                }
                Object o2 = o;
                if (relatedChipEndpoint$RelatedChipCommand.c == 1) {
                    o2 = ((ahbc)relatedChipEndpoint$RelatedChipCommand.d).rx((ahaq)anul.b);
                }
                if (o2 == null) {
                    return;
                }
                this.e.H = new goo(lex, new gom(this, acns, recyclerView, map));
                final acov e = this.e;
                e.G = new hwg(this, 1);
                e.ac(aakt.x(o2), goq.d);
            }
        }
    }
}
