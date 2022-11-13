import android.view.View$OnLayoutChangeListener;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class adbz extends adcd implements addj
{
    public ViewGroup ae;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final ViewGroup ae = (ViewGroup)layoutInflater.inflate(2131625368, viewGroup, false);
        ae.setBackgroundColor(tpe.cx(ae.getContext(), 2130970845).orElse(0));
        final RecyclerView recyclerView = (RecyclerView)ae.findViewById(2131427875);
        recyclerView.af((nw)new LinearLayoutManager(1));
        recyclerView.ac((nq)null);
        recyclerView.setPadding(0, ((br)this).nZ().getDimensionPixelSize(2131165545), 0, 0);
        (this.ae = ae).addOnLayoutChangeListener((View$OnLayoutChangeListener)new adby(0));
        throw null;
    }
    
    public final void aK(final bu bu) {
        super.rJ(bu.getSupportFragmentManager(), (String)null);
    }
}
