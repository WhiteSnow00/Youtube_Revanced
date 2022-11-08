import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.List;
import java.util.Collections;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.app.Activity;
import android.widget.LinearLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyt
{
    public final jyv a;
    public final LinearLayoutManager b;
    public agza c;
    private final acjb d;
    private final aciw e;
    private final RecyclerView f;
    private final LinearLayout g;
    private final boolean h;
    private final Integer i;
    
    public jyt(final Activity activity, final LinearLayout linearLayout, final jyv a, final aeby aeby, final acno acno, final boolean h, final wwv wwv, final Integer i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final acjb d = new acjb();
        this.d = d;
        final RecyclerView f = new RecyclerView((Context)activity);
        this.f = f;
        this.a = a;
        this.h = h;
        this.i = i;
        final LinearLayout g = (LinearLayout)linearLayout.findViewById(2131428185);
        this.g = g;
        final fye fye = new fye(activity.getResources().getDimensionPixelSize(2131165804));
        final LinearLayoutManager b = new LinearLayoutManager();
        (this.b = b).ac(0);
        f.af((nw)b);
        f.setLayoutParams(new ViewGroup$LayoutParams(-1, activity.getResources().getDimensionPixelSize(2131165507)));
        final int n = (int)activity.getResources().getDimension(2131165510);
        f.setPadding((int)activity.getResources().getDimension(2131165811), n, (int)activity.getResources().getDimension(2131165810), n);
        f.setClipToPadding(false);
        f.setContentDescription((CharSequence)activity.getResources().getString(2132017387));
        f.setImportantForAccessibility(1);
        g.addView((View)f);
        final aciw u = aeby.U((acir)acno.a(), new ViewGroup$LayoutParams(-2, -2));
        (this.e = u).h((achk)d);
        f.aC(fye);
        f.aE(new jyr(a));
        u.f((acik)new fas(wwv, 18));
        if (!h && g.getChildCount() > 2) {
            g.removeViewAt(1);
        }
    }
    
    public final int a() {
        for (int i = 0; i < ((tdv)this.d).size(); ++i) {
            final Object value = ((tdv)this.d).get(i);
            if (value instanceof aiit && ((aiit)value).i) {
                return i;
            }
        }
        return -1;
    }
    
    public final boolean b(final agza c) {
        int n = 0;
        if (c == null) {
            return false;
        }
        this.c = c;
        this.f.ac((nq)this.e);
        ((tdv)this.d).clear();
        for (final aiix aiix : Collections.unmodifiableList((List<? extends aiix>)((aiiw)c.instance).b)) {
            final int b = aiix.b;
            if (b == 91394224) {
                final acjb d = this.d;
                final aiit aiit = (aiit)aiix.c;
                final int size = ((aiiw)c.instance).b.size();
                aioe aioe;
                if ((aioe = aiit.g) == null) {
                    aioe = aioe.a;
                }
                aiit aiit2 = aiit;
                if (((agzd)aioe).rs((agyr)SearchEndpointOuterClass.searchEndpoint)) {
                    final agza builder = ((agzi)aiit).toBuilder();
                    final agzc agzc = (agzc)((agzi)aioe).toBuilder();
                    final agzg searchEndpoint = SearchEndpointOuterClass.searchEndpoint;
                    final agzc agzc2 = (agzc)((agzi)((agzd)aioe).rr((agyr)searchEndpoint)).toBuilder();
                    agzc2.e((agyr)anva.b, true);
                    agzc2.e((agyr)anva.c, aiit.i ^ true);
                    agzc2.e((agyr)anva.d, size);
                    agzc2.e((agyr)anva.e, n);
                    agzc.e((agyr)searchEndpoint, agzc2.build());
                    final aioe g = (aioe)agzc.build();
                    builder.copyOnWrite();
                    final aiit aiit3 = (aiit)builder.instance;
                    g.getClass();
                    aiit3.g = g;
                    aiit3.b |= 0x10;
                    aiit2 = (aiit)builder.build();
                }
                d.add((Object)aiit2);
            }
            else if (b == 65153809) {
                this.d.add((Object)aiix.c);
            }
            ++n;
        }
        if (this.g.getChildCount() > 2) {
            this.g.removeViewAt(1);
        }
        if (this.h) {
            final Integer i = this.i;
            if (i != null) {
                this.f.aa(i);
            }
        }
        return true;
    }
}
