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
public final class addl extends addo implements adev
{
    public ViewGroup ae;
    
    public final View K(final LayoutInflater layoutInflater, ViewGroup ae, final Bundle bundle) {
        ae = (ViewGroup)layoutInflater.inflate(2131625370, ae, false);
        ae.setBackgroundColor(tqf.cx(ae.getContext(), 2130970843).orElse(0));
        final RecyclerView recyclerView = (RecyclerView)ae.findViewById(2131427875);
        recyclerView.af((nx)new LinearLayoutManager(1));
        recyclerView.ac((nr)null);
        recyclerView.setPadding(0, ((br)this).nW().getDimensionPixelSize(2131165545), 0, 0);
        (this.ae = ae).addOnLayoutChangeListener((View$OnLayoutChangeListener)new addk(0));
        throw null;
    }
    
    public final void aK(final bu bu) {
        super.rJ(bu.getSupportFragmentManager(), (String)null);
    }
}
