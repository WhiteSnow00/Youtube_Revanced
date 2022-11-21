import android.widget.Button;
import android.content.res.ColorStateList;
import android.content.DialogInterface;
import android.content.Context;
import android.content.DialogInterface$OnShowListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acog implements DialogInterface$OnShowListener
{
    public final Context a;
    public final kkq b;
    public final agmq c;
    public final aefs d;
    
    public acog(final agmq c, final Context a, final aefs d, final kkq b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public final void onShow(final DialogInterface dialogInterface) {
        final agmq c = this.c;
        final Context a = this.a;
        final aefs d = this.d;
        final kkq b = this.b;
        final Button b2 = ((ey)c.e).b(-2);
        b2.setTextColor(tqf.cr(a, 2130970850));
        final ColorStateList textColor = new ColorStateList(new int[][] { { -16842910 }, new int[0] }, new int[] { tqf.cr(a, 2130970920), tqf.cr(a, 2130970850) });
        final Button b3 = ((ey)c.e).b(-1);
        b3.setTextColor(textColor);
        if (d.Y()) {
            b2.setAllCaps(false);
            b3.setAllCaps(false);
        }
        b.a = true;
    }
}
