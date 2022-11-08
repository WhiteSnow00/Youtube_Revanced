import android.view.View;
import java.util.Map;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkv extends acqu
{
    private final TextView k;
    private final acts l;
    
    public gkv(final vax vax, final acts l, final acng acng, final aeby aeby, final uyf uyf, final uyi uyi, final TextView k, final byte[] array, final byte[] array2, final byte[] array3) {
        super(vax, acng, aeby, uyf, uyi, k, (byte[])null, (byte[])null, (byte[])null);
        this.l = l;
        this.k = k;
    }
    
    public final void a(final aibb aibb, final wwv wwv, final Map map) {
        super.a(aibb, wwv, map);
        if (aibb != null) {
            ajzn ajzn;
            if ((ajzn = aibb.m) == null) {
                ajzn = ajzn.a;
            }
            if (ajzn.b == 102716411) {
                final acts l = this.l;
                ajzn ajzn2;
                if ((ajzn2 = aibb.m) == null) {
                    ajzn2 = ajzn.a;
                }
                ajzl a;
                if (ajzn2.b == 102716411) {
                    a = (ajzl)ajzn2.c;
                }
                else {
                    a = ajzl.a;
                }
                l.b(a, (View)this.k, aibb, wwv);
            }
        }
    }
}
