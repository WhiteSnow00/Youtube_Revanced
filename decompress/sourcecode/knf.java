import java.util.List;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnTouchListener;
import android.widget.SpinnerAdapter;
import android.widget.ArrayAdapter;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.TextView;
import android.widget.Spinner;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knf implements acil
{
    public final View a;
    public final View b;
    public final Object c;
    public final Object d;
    private final View e;
    private final /* synthetic */ int f;
    private final Object g;
    
    public knf(final Context context, final bx d, final int f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        final View inflate = LayoutInflater.from(context).inflate(2131624266, (ViewGroup)null);
        this.a = inflate;
        this.e = inflate.findViewById(2131432026);
        this.b = inflate.findViewById(2131432092);
        this.g = inflate.findViewById(2131427696);
        this.c = inflate.findViewById(2131430104);
        this.d = d;
    }
    
    public knf(final Context context, final bx d, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        final View inflate = LayoutInflater.from(context).inflate(2131625738, (ViewGroup)null);
        this.a = inflate;
        this.e = inflate.findViewById(2131432026);
        this.g = inflate.findViewById(2131428086);
        this.b = inflate.findViewById(2131432092);
        this.c = inflate.findViewById(2131431819);
        this.d = d;
    }
    
    public knf(final Context g, final tdz d, final ViewGroup viewGroup, final int f) {
        this.f = f;
        this.g = g;
        final View inflate = LayoutInflater.from(g).inflate(2131625773, viewGroup, false);
        this.e = inflate;
        this.d = d;
        this.b = inflate.findViewById(2131428763);
        this.a = inflate.findViewById(2131431824);
        this.c = g.getResources();
        inflate.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new gzz(this, inflate, 6, (byte[])null));
    }
    
    public final View a() {
        final int f = this.f;
        if (f == 0) {
            return this.a;
        }
        if (f != 1) {
            return this.a;
        }
        return this.e;
    }
    
    public final void c(final acir acir) {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                bx.N(this.e);
                bx.N((View)this.g);
                bx.N(this.b);
                bx.N((View)this.c);
            }
            return;
        }
        bx.N(this.e);
        bx.N(this.b);
        bx.N((View)this.g);
        bx.N((View)this.c);
    }
}
