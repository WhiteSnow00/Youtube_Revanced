import android.content.DialogInterface$OnClickListener;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.DialogInterface;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.core.widget.NestedScrollView;
import android.os.Message;
import android.widget.Button;
import android.view.View;
import android.widget.ListView;
import android.view.Window;
import android.content.Context;
import android.view.View$OnClickListener;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ew
{
    public final int A;
    final int B;
    final int C;
    final int D;
    final int E;
    public final boolean F;
    public final Handler G;
    public final View$OnClickListener H;
    public final Context a;
    public final fy b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    public boolean h;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;
    public CharSequence p;
    NestedScrollView q;
    public int r;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    ListAdapter x;
    int y;
    public final int z;
    
    public ew(final Context a, final fy b, final Window c) {
        this.h = false;
        this.r = 0;
        this.y = -1;
        this.H = (View$OnClickListener)new jl(this, 1);
        this.a = a;
        this.b = b;
        this.c = c;
        this.G = (Handler)new eu((DialogInterface)b);
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes((AttributeSet)null, gl.e, 2130968645, 0);
        this.z = obtainStyledAttributes.getResourceId(0, 0);
        this.A = obtainStyledAttributes.getResourceId(2, 0);
        this.B = obtainStyledAttributes.getResourceId(4, 0);
        this.C = obtainStyledAttributes.getResourceId(5, 0);
        this.D = obtainStyledAttributes.getResourceId(7, 0);
        this.E = obtainStyledAttributes.getResourceId(3, 0);
        this.F = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b.e();
    }
    
    static boolean c(final View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        int i = viewGroup.getChildCount();
        while (i > 0) {
            if (c(viewGroup.getChildAt(--i))) {
                return true;
            }
        }
        return false;
    }
    
    public static final void d(final Button button) {
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public static final ViewGroup e(View inflate, View inflate2) {
        if (inflate == null) {
            inflate = inflate2;
            if (inflate2 instanceof ViewStub) {
                inflate = ((ViewStub)inflate2).inflate();
            }
            return (ViewGroup)inflate;
        }
        if (inflate2 != null) {
            final ViewParent parent = inflate2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(inflate2);
            }
        }
        inflate2 = inflate;
        if (inflate instanceof ViewStub) {
            inflate2 = ((ViewStub)inflate).inflate();
        }
        return (ViewGroup)inflate2;
    }
    
    public final void a(final CharSequence charSequence) {
        this.d = charSequence;
        final TextView u = this.u;
        if (u != null) {
            u.setText(charSequence);
        }
    }
    
    public final void b(final View g) {
        this.g = g;
        this.h = false;
    }
    
    public final void f(final int n, final CharSequence charSequence, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        Message obtainMessage;
        if (dialogInterface$OnClickListener != null) {
            obtainMessage = this.G.obtainMessage(n, (Object)dialogInterface$OnClickListener);
        }
        else {
            obtainMessage = null;
        }
        if (n != -2) {
            this.j = charSequence;
            this.k = obtainMessage;
            return;
        }
        this.m = charSequence;
        this.n = obtainMessage;
    }
}
