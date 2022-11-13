import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.PivotMenuBottomSheetController$1;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htk
{
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    
    public htk() {
        final hyx b = new hyx();
        this.b = b;
        this.c = b.L();
        this.d = new ejo();
        this.a = new fzw((byte[])null, (char[])null);
        final csi csi = new csi(this, 4, (byte[])null, (byte[])null);
        final hyx hyx = b;
        b.D("internal.registerCallback", (Callable)csi);
        final csi csi2 = new csi(this, 5, (byte[])null, (byte[])null);
        final hyx hyx2 = b;
        b.D("internal.eventLogger", (Callable)csi2);
    }
    
    public htk(final Activity b) {
        this.b = b;
        final eg eg = new eg((byte[])null, (char[])null);
        this.a = eg;
        this.d = new eg((byte[])null, (char[])null);
        this.c = eg;
    }
    
    public htk(final vcy b, final acpk a, final wyv d) {
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public htk(final ziy d, final asid a, final msr b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Activity activity) {
        this.c = activity.findViewById(2131432125);
        ((msr)this.b).Q((Callable)new hly(this, activity, 12));
    }
    
    public final void b(final bu bu, final amgs amgs) {
        if (this.c != null) {
            return;
        }
        final hmr an = hmr.aN(amgs, (acpk)this.a, (wyv)this.d);
        this.c = an;
        ((acsf)an).ag = (acse)new hok(this, 1, (byte[])null);
        ((aui)((br)an).X).b((aum)new PivotMenuBottomSheetController$1(this, (byte[])null));
        ((hmr)this.c).rJ(bu.getSupportFragmentManager(), (String)null);
    }
    
    public final void c(final int n) {
        ((eg)this.a).O(n);
        ((eg)this.d).O(n);
    }
    
    public final void d(final String s, final Callable callable) {
        ((hyx)this.b).D(s, callable);
    }
    
    public final boolean e() {
        return !((ejo)this.d).c.isEmpty();
    }
    
    public final boolean f() {
        final ejo ejo = (ejo)this.d;
        return !ejo.b.equals((Object)ejo.a);
    }
}
