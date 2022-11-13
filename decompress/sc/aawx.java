import android.view.View;
import android.widget.AdapterView;
import java.util.Iterator;
import java.util.List;
import com.google.vr.sdk.base.HeadsetSelector$HeadsetInfo;
import android.content.Context;
import android.widget.ListAdapter;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawx extends aawl implements AdapterView$OnItemClickListener
{
    public static final String ae = "aawx";
    public tmx af;
    public aawv ag;
    
    protected final /* bridge */ ListAdapter aM() {
        return (ListAdapter)new acru((Context)((br)this).od());
    }
    
    protected final int nQ() {
        return 0;
    }
    
    protected final AdapterView$OnItemClickListener nR() {
        return (AdapterView$OnItemClickListener)this;
    }
    
    protected final String nS() {
        return ((br)this).P(2132020176);
    }
    
    public final void no() {
        super.no();
        final Context nt = ((br)this).nT();
        final List b = aaws.b(nt, this.af);
        adkp.H(b.size() >= 2);
        final HeadsetSelector$HeadsetInfo a = aaws.a(nt, this.af);
        final acru acru = (acru)((qko)this).au;
        acru.clear();
        for (final HeadsetSelector$HeadsetInfo headsetSelector$HeadsetInfo : b) {
            final aawi aawi = new aawi(nt, headsetSelector$HeadsetInfo);
            aawi.a(headsetSelector$HeadsetInfo.equals((Object)a));
            acru.add((Object)aawi);
        }
        acru.notifyDataSetChanged();
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        aaws.f(((br)this).nT(), this.af, ((aawi)((acru)((qko)this).au).getItem(n)).a);
        final aawv ag = this.ag;
        if (ag != null) {
            ag.b();
        }
        ((bi)this).dismiss();
    }
}
