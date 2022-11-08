import java.util.Iterator;
import java.util.HashSet;
import android.content.Context;
import android.media.AudioDeviceCallback;
import java.util.Set;
import android.os.PowerManager;
import android.media.AudioManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itj
{
    public final wvu a;
    public final thh b;
    public final AudioManager c;
    public final PowerManager d;
    public final abhq e;
    public final fbj f;
    public final asgt g;
    public final Set h;
    public final boolean i;
    public AudioDeviceCallback j;
    public asic k;
    
    public itj(final Context context, final wvu a, final thh b, final abhq e, final fbj f, final abns abns, final uyi uyi, final Set set) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = f;
        final AudioManager c = (AudioManager)context.getSystemService("audio");
        c.getClass();
        this.c = c;
        final PowerManager d = (PowerManager)context.getSystemService("power");
        d.getClass();
        this.d = d;
        this.h = new HashSet();
        final boolean f2 = uyi.f(45359741L);
        this.i = f2;
        if (f2) {
            this.j = new itf(this);
        }
        final afcm d2 = afcr.d();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            d2.h((Object)((itn)iterator.next()).a());
        }
        final asgt m = asgt.M((Iterable)d2.g());
        final boolean i = this.i;
        final Set h = this.h;
        final AudioManager c2 = this.c;
        final aboh q = abns.q();
        this.g = m.af((aujo)asgt.e((aujo)((asgt)q.a).B((asjd)iie.s).L((asjc)new uvu(i, h, c2, 1)), (aujo)((asgt)q.k).L((asjc)iqc.g), (asit)exh.r), (asit)exh.s);
    }
}
