import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ader extends adev
{
    public arkg a;
    ohr b;
    private aqfw c;
    private oup d;
    
    public static ader a(final aqfw aqfw, final oup d) {
        final ader ader = new ader();
        final Bundle bundle = new Bundle();
        o(bundle, aqfw);
        ((br)ader).ag(bundle);
        ader.d = d;
        return ader;
    }
    
    private static void o(final Bundle bundle, final aqfw aqfw) {
        bundle.putParcelable("element", (Parcelable)new ParcelableMessageLite((MessageLite)aqfw));
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = (FrameLayout)layoutInflater.inflate(2131624381, viewGroup, false);
        final ohr b = this.b;
        if (b == null) {
            final ouj a = ouk.a(((omw)this.a.a()).a);
            a.b = "StudioElements";
            a.d(false);
            a.d = this.d;
            this.b = new ohr(((br)this).nT(), a.a());
            final oup d = this.d;
            wyw a2;
            if (d instanceof acfn) {
                a2 = ((acfn)d).a;
            }
            else {
                a2 = null;
            }
            if (a2 != null) {
                this.b.b = acdg.I(a2);
            }
            this.b.a(((agzk)this.c).toByteArray());
        }
        else if (b.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.b.getParent()).removeView((View)this.b);
        }
        frameLayout.addView((View)this.b);
        return (View)frameLayout;
    }
    
    public final void nm() {
        super.nm();
        ((omn)new aln((avv)this).h((Class)omn.class)).dispose();
    }
    
    public final void nn() {
        super.nn();
        final ohr b = this.b;
        if (b != null) {
            b.onDetachedFromWindow();
        }
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        Bundle m = bundle;
        if (bundle == null) {
            m = ((br)this).m;
        }
        final ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite)m.getParcelable("element");
        aqfw c;
        if (parcelableMessageLite == null) {
            c = null;
        }
        else {
            c = (aqfw)parcelableMessageLite.a((MessageLite)aqfw.a);
        }
        if (c != null) {
            this.c = c;
        }
    }
    
    public final void pP(final Bundle bundle) {
        o(bundle, this.c);
    }
}
