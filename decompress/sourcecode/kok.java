import java.util.Iterator;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import java.util.List;
import java.util.Collections;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.ArrayList;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.support.v7.widget.GridLayoutManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kok extends acja
{
    final RecyclerView a;
    private final Context b;
    private final acio c;
    private final gud d;
    private final acjb e;
    private final aciw f;
    
    public kok(final Context b, final giz c, final acno acno, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = (acio)c;
        final RecyclerView a = (RecyclerView)LayoutInflater.from(b).inflate(2131625282, (ViewGroup)null);
        this.a = a;
        final acjb e = new acjb();
        this.e = e;
        a.af((nw)new GridLayoutManager(this.g()));
        final aciw t = aeby.T((acir)acno.a());
        (this.f = t).h((achk)e);
        a.ac((nq)t);
        t.f((acik)(this.d = new gud()));
        a.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jbw(this, 9));
        c.c((View)a);
        a.setFocusable(false);
    }
    
    private final int g() {
        return this.b.getResources().getInteger(2131493062);
    }
    
    public final View a() {
        return ((giz)this.c).a;
    }
    
    public final void c(final acir acir) {
        ((tdv)this.e).clear();
        this.d.b();
    }
    
    public final void f() {
        final int g = this.g();
        final GridLayoutManager gridLayoutManager = (GridLayoutManager)this.a.n;
        if (gridLayoutManager.b != g) {
            gridLayoutManager.r(g);
            this.a.af((nw)gridLayoutManager);
        }
    }
    
    protected final boolean pS() {
        return true;
    }
}
