import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Collection;
import android.view.View$OnTouchListener;
import com.google.protos.youtube.api.innertube.TvfilmOffersRendererOuterClass;
import java.util.Map;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout;
import android.view.View$OnClickListener;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.app.player.overlay.ads.AdHighlightLayout;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdn implements acil
{
    public final View a;
    public final Object b;
    private final /* synthetic */ int c;
    private final Object d;
    private final Object e;
    
    public kdn(final Context context, final int c) {
        this.c = c;
        this.b = new achy(context);
        final LinearLayout a = (LinearLayout)LayoutInflater.from(context).inflate(2131624491, (ViewGroup)null);
        this.a = (View)a;
        final LinearLayout linearLayout = a;
        this.d = a.findViewById(2131430009);
        final LinearLayout linearLayout2 = a;
        this.e = a.findViewById(2131428827);
    }
    
    public kdn(final Context context, final arhr b, final abzk d, final wwv e, final ViewGroup viewGroup, final int c) {
        this.c = c;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.a = LayoutInflater.from(context).inflate(2131624468, viewGroup, false);
    }
    
    public kdn(final Context context, final tdg b, final mck d, final ViewGroup viewGroup, final sut e, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = LayoutInflater.from(context).inflate(2131625651, viewGroup, false);
    }
    
    public kdn(final Context context, final vax b, final adcr adcr, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624224, (ViewGroup)null);
        this.a = inflate;
        this.d = inflate.findViewById(2131432092);
        this.e = inflate.findViewById(2131427952);
        if (adcr.d()) {
            adcr.c(inflate, adcr.a(inflate, (Drawable)null));
            return;
        }
        tmy.e(inflate, tmy.j(context, 0));
    }
    
    public kdn(final Context context, final wxs d, final acqz b, final int c) {
        this.c = c;
        final View inflate = View.inflate(context, 2131624398, (ViewGroup)null);
        this.a = inflate;
        this.e = inflate.findViewById(2131428065);
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131428848);
        recyclerView.af((nw)new GridLayoutManager(7));
        recyclerView.ac((nq)b);
        this.b = b;
        this.d = d;
    }
    
    public kdn(final Context context, final wxs d, final acrk b, final int c) {
        this.c = c;
        this.d = d;
        final View inflate = View.inflate(context, 2131624398, (ViewGroup)null);
        this.a = inflate;
        this.e = inflate.findViewById(2131428065);
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131428848);
        recyclerView.af((nw)new GridLayoutManager(7));
        recyclerView.ac((nq)b);
        this.b = b;
    }
    
    public kdn(final Context context, final zhb zhb, final acqs c, final int c2, final byte[] array) {
        this.c = c2;
        final View inflate = View.inflate(context, 2131624817, (ViewGroup)null);
        this.a = inflate;
        this.d = inflate.findViewById(2131432092);
        final TextView e = (TextView)inflate.findViewById(2131427916);
        this.e = e;
        final TextView textView = e;
        final acqu g = zhb.g(e);
        this.b = g;
        final acqu acqu = g;
        g.h();
        ((acqt)g).c = c;
    }
    
    public final View a() {
        final int c = this.c;
        if (c == 0) {
            return this.a;
        }
        if (c == 1) {
            return this.a;
        }
        if (c == 2) {
            return this.a;
        }
        if (c == 3) {
            return this.a;
        }
        if (c == 4) {
            return this.a;
        }
        if (c != 5) {
            return this.a;
        }
        return this.a;
    }
    
    public final void c(final acir acir) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (c != 2 && c != 3 && c != 4) {
                    if (c != 5) {
                        ((acrk)this.b).a = null;
                        return;
                    }
                    ((acqz)this.b).e = null;
                }
                return;
            }
            ((abzk)this.d).c(acir);
        }
    }
}
