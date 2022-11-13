import android.widget.RelativeLayout$LayoutParams;
import android.text.TextUtils;
import java.util.ArrayDeque;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcl extends abtz implements View$OnClickListener, abcg
{
    private View a;
    private TextView b;
    private TextView c;
    private TextView d;
    private View e;
    private ImageView f;
    private ImageView g;
    private abcf h;
    private int i;
    private int j;
    private CharSequence k;
    private CharSequence l;
    private View m;
    private TextView n;
    
    public abcl(final Context context) {
        super(context);
        this.setClickable(false);
        this.setBackgroundColor(0);
        this.mk();
    }
    
    private final void e(final boolean selected) {
        this.e.setSelected(selected);
        int i = this.i;
        if (i != 0) {
            final int j = this.j;
            if (j != 0) {
                final ImageView f = this.f;
                if (!selected) {
                    i = j;
                }
                f.setImageResource(i);
            }
        }
        final TextView d = this.d;
        CharSequence text;
        if (selected) {
            text = this.k;
        }
        else {
            text = this.l;
        }
        d.setText(text);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void c() {
        if (this.a != null) {
            return;
        }
        final View inflate = LayoutInflater.from(this.getContext()).inflate(2131624766, (ViewGroup)this, true);
        this.a = inflate;
        final View viewById = inflate.findViewById(2131429658);
        this.b = (TextView)viewById.findViewById(2131429653);
        this.c = (TextView)viewById.findViewById(2131429654);
        this.g = (ImageView)viewById.findViewById(2131429652);
        this.e = viewById.findViewById(2131429655);
        this.f = (ImageView)viewById.findViewById(2131429656);
        this.d = (TextView)viewById.findViewById(2131429657);
        this.e.setOnClickListener((View$OnClickListener)this);
        this.m = viewById.findViewById(2131429661);
        this.n = (TextView)viewById.findViewById(2131429662);
        this.m.setOnClickListener((View$OnClickListener)this);
        this.f.setImageAlpha(128);
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m() {
    }
    
    public final void mk() {
        this.setVisibility(8);
    }
    
    public final void n() {
    }
    
    public final void o(final long n) {
    }
    
    public final void onClick(final View view) {
        final View e = this.e;
        if (view == e) {
            this.e(e.isSelected() ^ true);
            this.h.tc();
            return;
        }
        if (view == this.m) {
            this.h.a();
        }
    }
    
    public final void p(final Bitmap imageBitmap) {
        this.c();
        final ImageView g = this.g;
        if (g != null) {
            g.setImageBitmap(imageBitmap);
            this.setClickable(imageBitmap != null);
        }
    }
    
    public final void q(final abcf h) {
        h.getClass();
        this.h = h;
    }
    
    public final void r(final boolean b) {
    }
    
    public final void t(final CharSequence text, final CharSequence text2, final boolean b, final CharSequence l, int n, final CharSequence k, final int i) {
        this.c();
        this.b.setText(text);
        this.c.setText(text2);
        final ArrayDeque arrayDeque = new ArrayDeque();
        if (TextUtils.isEmpty(text2) && !TextUtils.isEmpty(text)) {
            arrayDeque.add(tpe.az(2));
            arrayDeque.add(tpe.ao(15));
        }
        else {
            arrayDeque.add(tpe.ap(2, 2131429663));
            arrayDeque.add(tpe.az(15));
        }
        tpe.aF((View)this.b, tpe.aK(arrayDeque), (Class)RelativeLayout$LayoutParams.class);
        final int n2 = 0;
        this.setVisibility(0);
        this.i = i;
        this.j = n;
        this.k = k;
        this.l = l;
        this.e(b);
        this.m.setVisibility(8);
        final View e = this.e;
        if (n > 0) {
            n = n2;
        }
        else {
            n = 8;
        }
        e.setVisibility(n);
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final CharSequence text, final CharSequence text2, final CharSequence text3) {
        this.c();
        this.b.setText(text);
        this.c.setText(text2);
        this.setVisibility(0);
        this.n.setText(text3);
        this.e.setVisibility(8);
        this.m.setVisibility(0);
    }
    
    public final void w(final boolean b) {
    }
    
    public final boolean x() {
        return false;
    }
}
