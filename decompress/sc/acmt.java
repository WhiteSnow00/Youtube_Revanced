import android.widget.Button;
import android.content.res.ColorStateList;
import android.content.DialogInterface;
import android.content.Context;
import android.content.DialogInterface$OnShowListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmt implements DialogInterface$OnShowListener
{
    public final Context a;
    public final kkg b;
    public final agkz c;
    public final aeea d;
    
    public acmt(final agkz c, final Context a, final aeea d, final kkg b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public final void onShow(final DialogInterface dialogInterface) {
        final agkz c = this.c;
        final Context a = this.a;
        final aeea d = this.d;
        final kkg b = this.b;
        final Button b2 = ((ey)c.e).b(-2);
        b2.setTextColor(tpe.cr(a, 2130970852));
        final ColorStateList textColor = new ColorStateList(new int[][] { { -16842910 }, new int[0] }, new int[] { tpe.cr(a, 2130970922), tpe.cr(a, 2130970852) });
        final Button b3 = ((ey)c.e).b(-1);
        b3.setTextColor(textColor);
        if (d.ao()) {
            b2.setAllCaps(false);
            b3.setAllCaps(false);
        }
        b.a = true;
    }
}
