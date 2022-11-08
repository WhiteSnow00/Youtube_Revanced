import android.content.res.TypedArray;
import android.content.Context;
import android.view.Window;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acpo extends qje
{
    public void no() {
        super.no();
        final Window window = ((bi)this).d.getWindow();
        final Context nt = ((br)this).nT();
        final TypedArray obtainStyledAttributes = nt.getTheme().obtainStyledAttributes(new int[] { 16843499 });
        final int n = (int)obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        final int bd = tmy.bd(nt);
        int n3 = 0;
        Label_0095: {
            int n2;
            if (tmy.bp(nt)) {
                n2 = n * 4;
            }
            else {
                if (!tmy.bq(nt)) {
                    n3 = -1;
                    break Label_0095;
                }
                n2 = n + n;
            }
            n3 = bd - n2;
        }
        window.setLayout(n3, -2);
        ((bi)this).d.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(tmy.cn(((br)this).nT(), 2130970893)));
    }
}
