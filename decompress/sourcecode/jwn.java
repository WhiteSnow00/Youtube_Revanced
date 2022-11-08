import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import com.google.apps.tiktok.account.AccountId;
import android.os.Bundle;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.content.Context;
import android.net.Uri;
import android.graphics.BitmapFactory;
import android.app.Activity;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;
import android.view.MenuItem;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.view.View;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwn implements View$OnClickListener, View$OnLongClickListener, fzi
{
    public final amjl a;
    protected View b;
    public ImageView c;
    public Bitmap d;
    private final arhr e;
    private final bu f;
    private final LayoutInflater g;
    private final Resources h;
    private final aceo i;
    private final zkw j;
    private final atjj k;
    private final acng l;
    private final wwv m;
    private final szv n;
    private MenuItem o;
    private final MultiPageMenuDialogFragmentController p;
    private final ardu q;
    
    public jwn(final bu f, final aceo i, final MultiPageMenuDialogFragmentController p14, final zkw j, final atjj k, final acng l, final arhr e, final arcq arcq, final LayoutInflater g, final Resources h, final wwv m, final amjl a, final byte[] array, final byte[] array2) {
        this.f = f;
        this.h = h;
        this.g = g;
        this.i = i;
        this.e = e;
        this.p = p14;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.a = a;
        this.q = arcq.u();
        this.n = szv.c((Activity)f, (szx)new hba(this, 14));
        this.d = BitmapFactory.decodeResource(h, 2131232578);
        this.b();
    }
    
    private final void b() {
        final amjl a = this.a;
        aorm a2;
        if (a.c == 2) {
            a2 = (aorm)a.d;
        }
        else {
            a2 = aorm.a;
        }
        if (a2.c.size() != 0) {
            final amjl a3 = this.a;
            aorm a4;
            if (a3.c == 2) {
                a4 = (aorm)a3.d;
            }
            else {
                a4 = aorm.a;
            }
            this.i.k(Uri.parse(((aorl)a4.c.get(0)).c), (szx)this.n);
        }
        final amjl a5 = this.a;
        if (a5.c == 1) {
            final acng l = this.l;
            akbe akbe;
            if ((akbe = akbe.b(((akbf)a5.d).c)) == null) {
                akbe = akbe.a;
            }
            final int a6 = l.a(akbe);
            if (this.o != null && this.b != null && a6 != 0) {
                this.c.setImageResource(a6);
                this.c.setColorFilter(tmy.ct((Context)this.f, 2130970924).orElse(0));
                this.o.setActionView(this.b);
            }
        }
    }
    
    public final void a() {
        if (this.o != null && this.b != null) {
            this.c.setImageDrawable((Drawable)new BitmapDrawable(this.h, this.d));
            this.c.clearColorFilter();
            this.o.setActionView(this.b);
        }
    }
    
    public final int j() {
        return this.q.m();
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return false;
    }
    
    public final void o(final MenuItem o) {
        if (this.b == null) {
            this.b = this.g.inflate(2131624836, (ViewGroup)null, false);
        }
        this.c = (ImageView)this.b.findViewById(2131429296);
        o.setShowAsAction(2);
        this.c.setContentDescription(this.r());
        this.b.setOnClickListener((View$OnClickListener)this);
        this.b.setOnLongClickListener((View$OnLongClickListener)this);
        this.o = o;
        this.a();
        final kcj kcj = (kcj)this.k.a();
        kcj.c((trb)new jnf(this, kcj, 9));
        this.b();
        if ((this.a.b & 0x1000) != 0x0) {
            ((acuj)this.e.a()).d(this.a.j, this.b);
        }
    }
    
    public final void onClick(final View view) {
        final MultiPageMenuDialogFragmentController p = this.p;
        final amjl a = this.a;
        ((DialogFragmentController)p).k();
        if (((DialogFragmentController)p).i() == null) {
            final AccountId a2 = p.a.a(p.b.c());
            final jtu jtu = new jtu();
            arin.g((br)jtu);
            aenz.e((br)jtu, a2);
            final Bundle bundle = new Bundle();
            bundle.putByteArray("MenuButtonRendererKey", ((agxl)a).toByteArray());
            jtu.ag(bundle);
            ((DialogFragmentController)p).pL((bi)jtu);
        }
        final amjl a3 = this.a;
        if ((a3.b & 0x20) != 0x0) {
            this.m.J(3, (wxz)new wws(a3.g.I()), (alff)null);
        }
    }
    
    public final boolean onLongClick(final View view) {
        this.j.b((Activity)this.f, this.a.g.I(), (zku)null);
        final amjl a = this.a;
        if ((a.b & 0x20) != 0x0) {
            this.m.J(1025, (wxz)new wws(a.g.I()), (alff)null);
        }
        return false;
    }
    
    public final boolean p() {
        return false;
    }
    
    public final int q() {
        return this.q.a + 1000;
    }
    
    public final CharSequence r() {
        return this.h.getString(2132017427);
    }
}
