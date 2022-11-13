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

public final class iuh
{
    public final wxx a;
    public final tjm b;
    public final AudioManager c;
    public final PowerManager d;
    public final abjj e;
    public final fbo f;
    public final ashi g;
    public final Set h;
    public final boolean i;
    public AudioDeviceCallback j;
    public asir k;
    
    public iuh(final Context context, final wxx a, final tjm b, final abjj e, final fbo f, final abpu abpu, final vai vai, final Set set) {
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
        final boolean f2 = vai.f(45359741L);
        this.i = f2;
        if (f2) {
            this.j = new iud(this);
        }
        final afel d2 = afeq.d();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            d2.h((Object)((iul)iterator.next()).a());
        }
        final ashi m = ashi.M((Iterable)d2.g());
        final boolean i = this.i;
        final Set h = this.h;
        final AudioManager c2 = this.c;
        final abqg p8 = abpu.p();
        this.g = m.af((auke)ashi.e((auke)((ashi)p8.a).B((asjs)ija.s).L((asjr)new uxo(i, h, c2, 1)), (auke)((ashi)p8.k).L((asjr)iqm.i), (asji)exl.r), (asji)exl.s);
    }
}
