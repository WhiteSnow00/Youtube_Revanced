import android.text.TextUtils;
import android.widget.TextView$BufferType;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.widget.TextView;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxm extends abbk implements abuc
{
    public boolean a;
    public CharSequence b;
    private final Rect c;
    private TextView d;
    
    public fxm(final Context context) {
        super(context);
        this.c = new Rect();
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131625652, (ViewGroup)null);
        this.d = (TextView)inflate.findViewById(2131429843);
        return inflate;
    }
    
    public final void e(final Context context, final View view) {
        if (this.ab(1)) {
            this.d.setText(this.b, TextView$BufferType.SPANNABLE);
        }
        if (this.ab(2)) {
            view.setPadding(this.c.left, this.c.top, this.c.right, this.c.bottom);
        }
    }
    
    public final void f() {
        this.b = "";
        this.h();
    }
    
    public final void g(final boolean a) {
        this.a = a;
        this.h();
    }
    
    public final void h() {
        if (this.oV()) {
            this.aa();
            return;
        }
        this.X();
    }
    
    public final void j(final int n, final int n2) {
        this.c.set(n, 0, 0, n2);
        this.Z(2);
    }
    
    public final boolean oV() {
        return this.a && !TextUtils.isEmpty(this.b);
    }
}
