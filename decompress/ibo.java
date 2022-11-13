import android.content.DialogInterface;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibo extends ibq implements View$OnClickListener
{
    public xri ae;
    public wyw af;
    public xrd ag;
    boolean ah;
    
    public ibo() {
        this.ah = true;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624790, viewGroup, false);
        inflate.findViewById(2131431545).setOnClickListener((View$OnClickListener)this);
        inflate.findViewById(2131429057).setOnClickListener((View$OnClickListener)this);
        this.af.l((wzz)new wyt(xaa.c(57568)));
        this.af.l((wzz)new wyt(xaa.c(57570)));
        this.af.l((wzz)new wyt(xaa.c(57569)));
        return inflate;
    }
    
    public final void no() {
        super.no();
        ((bi)this).d.getWindow().setLayout(((br)this).nZ().getDimensionPixelSize(2131167871), -2);
    }
    
    public final void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131431545) {
            this.af.J(3, (wzz)new wyt(xaa.c(57570)), (alhi)null);
            if (this.ae.g() != null) {
                final ScreenId b = this.ae.g().b;
                this.ah = false;
                this.ae.i();
            }
            ((bi)this).pO();
            return;
        }
        if (id == 2131429057) {
            this.af.J(3, (wzz)new wyt(xaa.c(57569)), (alhi)null);
            this.ah = true;
            ((bi)this).pO();
        }
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ah) {
            if (this.ae.g() != null) {
                final ScreenId b = this.ae.g().b;
                this.ag.a(this.ae.g().b, "canceled");
            }
            this.ae.h();
        }
        this.ah = true;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.af.b(xaa.b(62397), aiqj.a, (alhi)null);
    }
}
