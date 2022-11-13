import android.view.ViewStub;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ioe implements fjz
{
    public final bu a;
    public final fmr b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public ProgressBar h;
    public acsy i;
    public Button j;
    public pvh k;
    private final FrameLayout l;
    private boolean m;
    private final ziy n;
    
    public ioe(final bu a, final fmr b, final ziy n, final FrameLayout l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.l = l;
    }
    
    public static aicz b(final String s, final aiqj o) {
        final ahbb ahbb = (ahbb)((ahbh)aicz.a).createBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz = (aicz)ahbb.instance;
        aicz.d = 2;
        aicz.c = 1;
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz2 = (aicz)ahbb.instance;
        aicz2.e = 3;
        aicz2.b |= 0x8;
        final ajut g = acak.g(new String[] { s });
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz3 = (aicz)ahbb.instance;
        g.getClass();
        aicz3.i = g;
        aicz3.b |= 0x200;
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz4 = (aicz)ahbb.instance;
        o.getClass();
        aicz4.o = o;
        aicz4.b |= 0x8000;
        return (aicz)((ahaz)ahbb).build();
    }
    
    public static void c(final wyw wyw, final int n) {
        if (wyw == null) {
            ttr.b("No valid interaction logger.");
            return;
        }
        wyw.l((wzz)new wyt(xaa.c(n)));
    }
    
    @Override
    public final void a(final wyw wyw) {
        this.f(false, wyw);
        final TextView g = this.g;
        if (g != null) {
            g.setText((CharSequence)this.a.getString(2132018890));
            this.g.setOnClickListener((View$OnClickListener)new iob(this, 3));
            this.g.setVisibility(0);
            c(wyw, 49504);
        }
        final ProgressBar h = this.h;
        if (h != null) {
            h.setVisibility(8);
        }
    }
    
    public final void d() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.d = (TextView)this.l.findViewById(2131428917);
        this.c = (ImageView)this.l.findViewById(2131428913);
        this.e = (TextView)this.l.findViewById(2131428921);
        final TextView f = (TextView)this.l.findViewById(2131429552);
        this.f = f;
        this.i = this.n.ap(f);
        this.j = (Button)this.l.findViewById(2131428919);
        this.g = (TextView)((ViewStub)this.l.findViewById(2131431326)).inflate();
        this.h = (ProgressBar)((ViewStub)this.l.findViewById(2131429669)).inflate();
    }
    
    public final void e() {
        this.d();
        this.c.getClass();
        final TextView d = this.d;
        d.getClass();
        this.e.getClass();
        this.f.getClass();
        this.j.getClass();
        d.setText((CharSequence)this.a.getString(2132018876));
        this.c.setImageResource(2131231838);
        this.e.setText((CharSequence)this.a.getString(2132018870));
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.j.setVisibility(8);
    }
    
    public final void f(final boolean b, final wyw wyw) {
        teu.n((aun)this.a, this.b.c(), (ttg)new hui(this, 14), (ttg)new iod(this, this.b.i(), b, wyw));
    }
}
