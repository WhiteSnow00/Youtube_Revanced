import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adyp extends ArrayAdapter
{
    final /* synthetic */ adyq a;
    private final ColorStateList b;
    private final ColorStateList c;
    
    public adyp(final adyq a, final Context context, int n, final String[] array) {
        this.a = a;
        super(context, n, (Object[])array);
        final boolean b = this.b();
        final ColorStateList list = null;
        ColorStateList c;
        if (!b) {
            c = null;
        }
        else {
            final int[] array2 = { 16842919 };
            n = a.d.getColorForState(array2, 0);
            c = new ColorStateList(new int[][] { array2, new int[0] }, new int[] { n, 0 });
        }
        this.c = c;
        ColorStateList b2 = list;
        if (this.a()) {
            b2 = list;
            if (this.b()) {
                final int[] array4;
                final int[] array3 = array4 = new int[2];
                array4[0] = 16843623;
                array4[1] = -16842919;
                final int[] array6;
                final int[] array5 = array6 = new int[2];
                array6[0] = 16842913;
                array6[1] = -16842919;
                n = a.d.getColorForState(array5, 0);
                final int colorForState = a.d.getColorForState(array3, 0);
                n = ahy.e(n, a.c);
                b2 = new ColorStateList(new int[][] { array5, array3, new int[0] }, new int[] { n, ahy.e(colorForState, a.c), a.c });
            }
        }
        this.b = b2;
    }
    
    private final boolean a() {
        return this.a.c != 0;
    }
    
    private final boolean b() {
        return this.a.d != null;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final View view2 = super.getView(n, view, viewGroup);
        if (view2 instanceof TextView) {
            final TextView textView = (TextView)view2;
            final boolean contentEquals = this.a.getText().toString().contentEquals(textView.getText());
            Object o2;
            final Object o = o2 = null;
            if (contentEquals) {
                o2 = o;
                if (this.a()) {
                    o2 = new ColorDrawable(this.a.c);
                    if (this.c != null) {
                        aip.g((Drawable)o2, this.b);
                        o2 = new RippleDrawable(this.c, (Drawable)o2, (Drawable)null);
                    }
                }
            }
            ana.Q((View)textView, (Drawable)o2);
        }
        return view2;
    }
}
