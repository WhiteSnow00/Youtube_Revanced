import android.view.View;
import java.util.Map;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gld extends acsy
{
    private final TextView k;
    private final acvw l;
    
    public gld(final vcy vcy, final acvw l, final acpk acpk, final aeea aeea, final vaf vaf, final vai vai, final TextView k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(vcy, acpk, aeea, vaf, vai, k, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.l = l;
        this.k = k;
    }
    
    public final void a(final aicz aicz, final wyw wyw, final Map map) {
        super.a(aicz, wyw, map);
        if (aicz != null) {
            akbq akbq;
            if ((akbq = aicz.m) == null) {
                akbq = akbq.a;
            }
            if (akbq.b == 102716411) {
                final acvw l = this.l;
                akbq akbq2;
                if ((akbq2 = aicz.m) == null) {
                    akbq2 = akbq.a;
                }
                akbo a;
                if (akbq2.b == 102716411) {
                    a = (akbo)akbq2.c;
                }
                else {
                    a = akbo.a;
                }
                l.b(a, (View)this.k, (Object)aicz, wyw);
            }
        }
    }
}
