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

public final class adcp extends adct
{
    public arhr a;
    ogl b;
    private aqdk c;
    private otg d;
    
    public static adcp a(final aqdk aqdk, final otg d) {
        final adcp adcp = new adcp();
        final Bundle bundle = new Bundle();
        o(bundle, aqdk);
        ((br)adcp).ag(bundle);
        adcp.d = d;
        return adcp;
    }
    
    private static void o(final Bundle bundle, final aqdk aqdk) {
        bundle.putParcelable("element", (Parcelable)new ParcelableMessageLite((MessageLite)aqdk));
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = (FrameLayout)layoutInflater.inflate(2131624382, viewGroup, false);
        final ogl b = this.b;
        if (b == null) {
            final ota a = otb.a(((olq)this.a.a()).a);
            a.b = "StudioElements";
            a.d(false);
            a.d = this.d;
            this.b = new ogl(((br)this).nT(), a.a());
            final otg d = this.d;
            wwv a2;
            if (d instanceof acdk) {
                a2 = ((acdk)d).a;
            }
            else {
                a2 = null;
            }
            if (a2 != null) {
                this.b.b = acbf.I(a2);
            }
            this.b.a(((agxl)this.c).toByteArray());
        }
        else if (b.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.b.getParent()).removeView((View)this.b);
        }
        frameLayout.addView((View)this.b);
        return (View)frameLayout;
    }
    
    public final void nm() {
        super.nm();
        ((olh)new alm((avu)this).h((Class)olh.class)).dispose();
    }
    
    public final void nn() {
        super.nn();
        final ogl b = this.b;
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
        aqdk c;
        if (parcelableMessageLite == null) {
            c = null;
        }
        else {
            c = (aqdk)parcelableMessageLite.a((MessageLite)aqdk.a);
        }
        if (c != null) {
            this.c = c;
        }
    }
    
    public final void pK(final Bundle bundle) {
        o(bundle, this.c);
    }
}
