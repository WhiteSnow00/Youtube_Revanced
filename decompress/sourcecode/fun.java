import java.util.List;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fun implements acil
{
    public final Object a;
    private final /* synthetic */ int b;
    
    public fun(final abzk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fun(final alm alm, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = alm.p((Map)null, 2131625615);
    }
    
    public fun(final Context context, final int b) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131624175, (ViewGroup)null);
    }
    
    public fun(final Context context, final int b, final byte[] array) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131623977, (ViewGroup)null);
    }
    
    public fun(final Context context, final int b, final char[] array) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131624964, (ViewGroup)null);
    }
    
    public fun(final Context context, final int b, final short[] array) {
        this.b = b;
        this.a = View.inflate(context, 2131625371, (ViewGroup)null);
    }
    
    public fun(final Context context, final aceo aceo, final vax vax, final acng acng, final acnj acnj, final rxu rxu, final oxp oxp, final vwb vwb, final hyc hyc, final tdz tdz, final ViewGroup viewGroup, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController, final fjp fjp, final hyc hyc2, final adcr adcr, final uyi uyi, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.a = new kkc(context, aceo, vax, acng, acnj, rxu, oxp, vwb, hyc, tdz, viewGroup, inlinePlaybackLifecycleController, fjp, hyc2, adcr, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public fun(final Context context, final aceo aceo, final vax vax, final acng acng, final qbo qbo, final oas oas, final uyi uyi, final int n, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = new khj(context, aceo, View.inflate(context, n, (ViewGroup)null), vax, acng, oas, qbo, uyi, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public fun(final Context context, final ViewGroup viewGroup, final int b) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131625781, viewGroup, false);
    }
    
    public fun(final Context context, final giz a, final int b) {
        this.b = b;
        ((giz)(this.a = a)).c(new View(context));
    }
    
    public fun(final blt blt, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = blt.j(2131624821);
    }
    
    public fun(final blt blt, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = blt.j(2131624822);
    }
    
    public fun(final ftx ftx, final int b, final byte[] array) {
        this.b = b;
        Object a;
        if (achi.class.equals(achn.class)) {
            a = new achn((Context)ftx.a, (acio)((aeyr)ftx.c).a(), (acir)ftx.b);
        }
        else {
            if (!achi.class.equals(achi.class)) {
                throw new IllegalArgumentException("Unknown presenter class requested.");
            }
            a = new achi((Context)ftx.a, (acio)((aeyr)ftx.c).a(), (acir)ftx.b);
        }
        this.a = a;
    }
    
    public final View a() {
        switch (this.b) {
            default: {
                return (View)this.a;
            }
            case 11: {
                return ((abzk)this.a).a();
            }
            case 10: {
                return (View)this.a;
            }
            case 9: {
                return (View)this.a;
            }
            case 8: {
                return (View)((ftp)this.a).b;
            }
            case 7: {
                return (View)((kkc)this.a).j;
            }
            case 6: {
                return ((kcs)this.a).i;
            }
            case 5: {
                return ((giz)this.a).a;
            }
            case 4: {
                return ((achb)this.a).a();
            }
            case 3: {
                return (View)this.a;
            }
            case 2: {
                return ((fum)this.a).a;
            }
            case 1: {
                return (View)this.a;
            }
            case 0: {
                return ((fum)this.a).a;
            }
        }
    }
    
    public final void c(final acir acir) {
        final int b = this.b;
        if (b == 0) {
            ((fum)this.a).c(acir);
            return;
        }
        if (b == 2) {
            ((fum)this.a).c(acir);
            return;
        }
        if (b == 4) {
            ((achb)this.a).c(acir);
            return;
        }
        if (b == 11) {
            ((abzk)this.a).c(acir);
            return;
        }
        if (b == 6) {
            ((kcs)this.a).c(acir);
            return;
        }
        if (b == 7) {
            ((kkc)this.a).c(acir);
            return;
        }
        if (b != 8) {
            return;
        }
        ((ftp)this.a).c(acir);
    }
}
