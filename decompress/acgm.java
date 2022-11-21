import java.util.Map;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgm implements ott
{
    public final ove a;
    public final boolean b;
    public final vbs c;
    private final aefs d;
    
    public acgm(final aefs d, final vbs c, final ove a, final boolean b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final ahci a() {
        return aqqh.b;
    }
    
    public final asjy b(final Object o, final ots ots) {
        int j;
        if ((j = aqvq.j(((aqqh)o).c)) == 0) {
            j = 1;
        }
        asjy asjy;
        if (j == 1) {
            asjy = asjy.t(new IllegalArgumentException("Trigger type must be set"));
        }
        else {
            final View a = ots.a;
            if (a == null) {
                asjy = asjy.t(new IllegalArgumentException("Origin view cannot be null."));
            }
            else {
                final fsn fsn = ((Map<K, fsn>)this.d.a).get(System.identityHashCode(a));
                asjy asjy2;
                if (fsn != null) {
                    if (--j != 1) {
                        if (j != 3) {
                            asjy2 = fsn.pV(2);
                        }
                        else {
                            asjy2 = fsn.pV(0);
                        }
                    }
                    else {
                        asjy2 = fsn.pV(1);
                    }
                }
                else {
                    asjy2 = asjy.t(new IllegalArgumentException("InlinePlaybackDelegateController called with unregistered view."));
                }
                asjy = asjy2.r((asmi)new tpd(this, ots, 19)).D();
            }
        }
        return asjy;
    }
}
