import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxj extends hxu implements AdapterView$OnItemClickListener
{
    private acle ae;
    
    static {
        ttr.a("MDX.RemoteWatchBottomSheet");
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View k = super.K(layoutInflater, viewGroup, bundle);
        if (k instanceof ViewGroup) {
            final View inflate = layoutInflater.inflate(2131624086, (ViewGroup)k);
            inflate.findViewById(2131427867).setOnClickListener((View$OnClickListener)new hrb(this, 18));
            ((TextView)inflate.findViewById(2131429586)).setText(2132017567);
            final ImageView imageView = (ImageView)inflate.findViewById(2131429582);
            final Drawable drawable = ((br)this).nT().getDrawable(2131232661);
            drawable.setTintMode(PorterDuff$Mode.SRC_IN);
            drawable.setTint(tpe.cr((Context)((br)this).od(), 2130970864));
            imageView.setImageDrawable(drawable);
        }
        return k;
    }
    
    protected final /* bridge */ ListAdapter aM() {
        this.ae = new acle();
        return (ListAdapter)new acrw((Context)((br)this).od(), (acjn)this.ae);
    }
    
    protected final int nQ() {
        return 0;
    }
    
    protected final AdapterView$OnItemClickListener nR() {
        return (AdapterView$OnItemClickListener)this;
    }
    
    protected final String nS() {
        return null;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        ((bi)this).dismiss();
    }
}
