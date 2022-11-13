import java.util.Iterator;
import java.util.List;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import android.content.Intent;
import java.util.ArrayList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addr
{
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public addr(final Context context, final vcy vcy, final wyw wyw, final bi bi, final int a, final tgd tgd) {
        context.getClass();
        vcy.getClass();
        wyw.getClass();
        adkp.H(a > 0);
        final adba adba = new adba(2);
        final acjv acjv = new acjv();
        ((acku)acjv).f(addo.class, new gyw(vcy, wyw, bi, tgd, 7));
        final acle c = new acle();
        this.c = c;
        ((acku)acjv).f(acjo.class, (acks)new fuf(context, (afaq)adba, (acku)acjv, 15));
        ((acku)acjv).f(adds.class, (acks)new jfv(context, 9, (int[])null));
        final ackz b = new ackz((acku)acjv);
        this.b = b;
        final ackz ackz = b;
        b.h((acjn)c);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = a;
    }
    
    public addr(final Context b, final zct e) {
        this.a = -1;
        this.b = b;
        this.e = e;
        final Intent d = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        this.d = d;
        final String packageName = b.getPackageName();
        final Intent intent = d;
        d.putExtra("android.media.extra.PACKAGE_NAME", packageName);
        final Intent c = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        this.c = c;
        final String packageName2 = b.getPackageName();
        final Intent intent2 = c;
        c.putExtra("android.media.extra.PACKAGE_NAME", packageName2);
    }
    
    public addr(final Executor c) {
        this.d = afeb.k();
        this.e = new Object();
        adkp.H(true);
        this.c = c;
        this.a = 5;
        this.b = new ArrayDeque();
    }
    
    public addr(final lzt b, final bws c, final bud d, final byte[] array) {
        this.b = b;
        this.c = c;
        this.d = d;
        lzh e;
        if ("audio/true-hd".equals(b.f.n)) {
            e = new lzh();
        }
        else {
            e = null;
        }
        this.e = e;
    }
    
    public final void a() {
        ((tfz)this.c).clear();
        final Iterator<Object> iterator = new addq((List)this.d, this.a).iterator();
        while (iterator.hasNext()) {
            ((acle)this.c).add((Object)aald.G(this.a, (List)iterator.next(), 0, 0, 0, 0, 0));
        }
        if (!((List)this.d).isEmpty() && !((List)this.e).isEmpty()) {
            ((acle)this.c).add((Object)new adds());
        }
        final Iterator<Object> iterator2 = new addq((List)this.e, this.a).iterator();
        while (iterator2.hasNext()) {
            ((acle)this.c).add((Object)aald.G(this.a, (List)iterator2.next(), 0, 0, 0, 0, 0));
        }
    }
    
    public final void b(final int n) {
        if (!((zbd)this.e).T()) {
            final int ai = aevy.ai(((zbd)this.e).v().d);
            if (ai == 0) {
                return;
            }
            if (ai != 3) {
                return;
            }
        }
        if (this.a == n && n != -1) {
            ((Intent)this.c).putExtra("android.media.extra.AUDIO_SESSION", n);
            ((Context)this.b).sendBroadcast((Intent)this.c);
            this.a = -1;
        }
    }
}
