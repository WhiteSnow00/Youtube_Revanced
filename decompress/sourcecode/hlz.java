import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import j$.util.Optional;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlz extends hng
{
    public hml A;
    public final hlo B;
    public final ViewGroup t;
    public final hlf u;
    public final hpg v;
    public final LinearLayout w;
    public final View x;
    public final View y;
    public final boolean z;
    
    public hlz(final hlf u, final hpg v, final hlp hlp, final hqi hqi, final ViewGroup viewGroup, final boolean b) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(2131625217, viewGroup, false));
        this.u = u;
        this.v = v;
        this.B = (hlo)hlp.a();
        this.t = (ViewGroup)this.a.findViewById(2131430073);
        final View viewById = this.a.findViewById(2131430812);
        viewById.setOnClickListener((View$OnClickListener)new hht(hqi, 9));
        iba.c(viewById);
        iba.e(viewById, b);
        iba.e(this.a.findViewById(2131430993), true);
        iba.e(this.a.findViewById(2131431044), b);
        iba.e(this.a.findViewById(2131431043), false);
        iba.e(this.a.findViewById(2131431042), false);
        iba.e(this.a.findViewById(2131431039), false);
        this.w = (LinearLayout)this.a.findViewById(2131430845);
        (this.x = this.a.findViewById(2131431022)).setOnClickListener((View$OnClickListener)new hht(v, 10));
        (this.y = this.a.findViewById(2131430963)).setOnClickListener((View$OnClickListener)new hht(v, 11));
        this.a.findViewById(2131431023).setVisibility(4);
        this.a.findViewById(2131430964).setVisibility(4);
        this.a.findViewById(2131430975).setVisibility(4);
        this.z = tqt.e(viewGroup.getContext());
    }
    
    @Override
    public final hml E() {
        return this.A;
    }
    
    @Override
    public final hqo F() {
        return null;
    }
    
    @Override
    public final void G() {
        final hml a = this.A;
        if (a != null) {
            a.g = null;
            this.u.h(a.e);
            this.A = null;
        }
        final ViewGroup t = this.t;
        if (t != null) {
            t.removeAllViews();
        }
        this.B.b();
    }
    
    public final Optional I() {
        final Optional k = this.K();
        if (k.isPresent()) {
            anss anss;
            if ((anss = ((anqm)k.get()).c) == null) {
                anss = anss.a;
            }
            if (((agzd)anss).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                anss anss2;
                if ((anss2 = ((anqm)k.get()).c) == null) {
                    anss2 = anss.a;
                }
                return Optional.of((Object)((agzd)anss2).rr((agyr)ElementRendererOuterClass.elementRenderer));
            }
        }
        return Optional.empty();
    }
    
    @Override
    public final boolean J() {
        return false;
    }
    
    public final Optional K() {
        final hml a = this.A;
        if (a == null) {
            return Optional.empty();
        }
        final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint a2 = a.a();
        anss anss;
        if ((anss = a2.b) == null) {
            anss = anss.a;
        }
        if (((agzd)anss).rs((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer)) {
            anss anss2;
            if ((anss2 = a2.b) == null) {
                anss2 = anss.a;
            }
            return Optional.of((Object)((agzd)anss2).rr((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer));
        }
        return Optional.empty();
    }
}
