import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmk implements jmt
{
    public jms a;
    private final Context b;
    private final MicrophoneView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    
    public jmk(final Context b, final View view, final wwv wwv) {
        this.b = b;
        final MicrophoneView c = (MicrophoneView)view.findViewById(2131429875);
        this.c = c;
        ((FloatingActionButton)c.findViewById(2131428685)).setImageDrawable(tmy.k(c.getContext(), 2131233821, 2130970924));
        ((FloatingActionButton)c.findViewById(2131428876)).setImageResource(2131233563);
        this.f = (TextView)view.findViewById(2131431697);
        this.d = (TextView)view.findViewById(2131431674);
        this.e = (TextView)view.findViewById(2131432231);
        this.g = (TextView)view.findViewById(2131429591);
        view.findViewById(2131427738).setOnClickListener((View$OnClickListener)new jlq(this, 10));
        c.setOnClickListener((View$OnClickListener)new jlq(this, 11));
        wwv.l((wxz)new wws(wya.c(22156)));
        wwv.l((wxz)new wws(wya.c(88272)));
    }
    
    @Override
    public final int a() {
        return 1;
    }
    
    @Override
    public final String b() {
        return " ";
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d(final StringBuilder sb) {
    }
    
    @Override
    public final void e(final jms a) {
        this.a = a;
    }
    
    @Override
    public final void f(final StringBuilder text) {
        this.g.setText((CharSequence)text);
    }
    
    @Override
    public final void g(final int n) {
        this.c.b(n);
    }
    
    @Override
    public final void h() {
        this.f.setText(this.b.getText(2132020210));
        this.c.setEnabled(true);
        this.c.setVisibility(0);
    }
    
    @Override
    public final void i() {
        this.f.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
    }
    
    @Override
    public final void j() {
        this.d.setVisibility(8);
        this.d.setText((CharSequence)"");
        this.e.setText((CharSequence)"");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.f.setText(this.b.getResources().getText(2132018356));
        this.f.setVisibility(0);
        this.c.f();
    }
    
    @Override
    public final void k() {
        this.g.setVisibility(0);
    }
    
    @Override
    public final void l() {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.f.setText(this.b.getResources().getText(2132020208));
        this.f.setVisibility(0);
        this.c.setVisibility(8);
        this.c.d();
    }
    
    @Override
    public final void m() {
        this.c.setEnabled(false);
        this.c.e();
    }
    
    @Override
    public final void n() {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.c.c();
    }
    
    @Override
    public final void o(final String text) {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.e.setText((CharSequence)"");
        this.d.setText((CharSequence)text);
    }
    
    @Override
    public final void p(final boolean b, final boolean b2) {
        this.f.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
        final Resources resources = this.b.getResources();
        if (!b) {
            this.f.setText(resources.getText(2132020208));
            this.c.setEnabled(false);
            return;
        }
        if (!b2) {
            this.f.setText(resources.getText(2132017886));
            return;
        }
        this.f.setText(resources.getText(2132019999));
    }
    
    @Override
    public final void q(final String text) {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.e.setText((CharSequence)text);
    }
    
    @Override
    public final void r() {
    }
    
    @Override
    public final boolean s() {
        return true;
    }
    
    @Override
    public final boolean t() {
        return this.c.b == 1;
    }
}
