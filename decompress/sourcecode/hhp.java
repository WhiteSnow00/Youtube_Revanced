import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhp implements View$OnClickListener, tvl
{
    public Context a;
    public float b;
    public boolean c;
    public hho d;
    public TextView e;
    public TextView f;
    public View g;
    public wwv h;
    
    public final float a() {
        if (this.c) {
            return 0.0f;
        }
        return this.b;
    }
    
    public final float b() {
        if (this.c) {
            return this.b;
        }
        return 0.0f;
    }
    
    public final View c() {
        return this.g;
    }
    
    public final void d() {
        tmy.v(this.g, this.c);
    }
    
    public final void e() {
    }
    
    public final void f() {
        if (this.c) {
            this.c = false;
            uji.I((tvl)this);
        }
    }
    
    public final void g(final boolean b) {
        if (!this.c) {
            this.c = true;
            tmy.v(this.g, true);
            uji.I((tvl)this);
        }
        CharSequence contentDescription;
        if (b) {
            contentDescription = this.a.getResources().getText(2132019410);
            this.f.setText(contentDescription);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(2131233044, 0, 0, 0);
        }
        else {
            contentDescription = this.a.getResources().getText(2132019402);
            this.f.setText(contentDescription);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(2131233041, 0, 0, 0);
        }
        this.f.setContentDescription(contentDescription);
    }
    
    public final void onClick(final View view) {
        if (view == this.e) {
            final hho d = this.d;
            if (((uqx)d).aH.h != null) {
                ((hid)d).bi();
            }
            else {
                final hid hid = (hid)d;
                hid.onClick(hid.ah.g);
                hid.bh();
            }
            this.f();
            return;
        }
        if (view == this.f) {
            this.d.d();
            this.f();
            this.h.J(3, (wxz)new wws(wya.c(36854)), (alff)null);
        }
    }
}
