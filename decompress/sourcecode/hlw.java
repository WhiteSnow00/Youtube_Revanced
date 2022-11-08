import com.google.protobuf.ExtensionRegistryLite;
import android.widget.AdapterView;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
import android.widget.ListAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.protobuf.MessageLite;
import android.os.Bundle;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlw extends hkw implements AdapterView$OnItemClickListener
{
    public Context ae;
    public ish af;
    private ameo ak;
    
    public static hlw aN(final ameo ameo, final acng ah, final wwu wwu) {
        final hlw hlw = new hlw();
        if (ameo != null) {
            final Bundle bundle = new Bundle();
            aeda.av(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)ameo);
            ((br)hlw).ag(bundle);
        }
        ah.getClass();
        ((acqb)hlw).ah = ah;
        ((acqb)hlw).aj = 2130970924;
        ((br)hlw).am(false);
        if (wwu != null) {
            ((acqb)hlw).ai = wwu.n();
        }
        return hlw;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return super.K(layoutInflater.cloneInContext(this.ae), viewGroup, bundle);
    }
    
    protected final acps aO() {
        final acjb acjb = new acjb();
        final ameo ak = this.ak;
        if (ak != null) {
            for (final amel amel : ak.c) {
                final aioe b = vwh.b(amel);
                final aexq ap = ((acqb)this).aP(amel);
                if (b != null && ((agzd)b).rs((agyr)CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint)) {
                    acjb.add((Object)this.af.a());
                }
                else {
                    if (!ap.h()) {
                        continue;
                    }
                    acjb.add(ap.c());
                }
            }
        }
        return new acps(this.ae, (achk)acjb);
    }
    
    public final Context nT() {
        return this.ae;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        super.onItemClick(adapterView, view, n, n2);
        final qjf c = ((acps)((qje)this).au).c(n);
        if (c instanceof irv) {
            ((irv)c).a();
        }
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null && m.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            try {
                this.ak = (ameo)aeda.aq(m, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)ameo.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab) {
                trn.d("Error decoding menu", (Throwable)ahab);
                this.ak = ameo.a;
            }
        }
    }
}
