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

public final class adbo
{
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public adbo(final Context context, final vax vax, final wwv wwv, final bi bi, final int a, final tdz tdz) {
        context.getClass();
        vax.getClass();
        wwv.getClass();
        agot.u(a > 0);
        final acyx acyx = new acyx(2);
        final achs achs = new achs();
        ((acir)achs).f((Class)adbl.class, (acip)new gyg(vax, wwv, bi, tdz, 7));
        final acjb c = new acjb();
        this.c = c;
        ((acir)achs).f((Class)achl.class, (acip)new ftx(context, (aeyr)acyx, (acir)achs, 15));
        ((acir)achs).f((Class)adbp.class, (acip)new jet(context, 9, (int[])null));
        final aciw b = new aciw((acir)achs);
        this.b = b;
        final aciw aciw = b;
        b.h((achk)c);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = a;
    }
    
    public adbo(final Context b, final zba e) {
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
    
    public adbo(final Executor c) {
        this.d = afcc.k();
        this.e = new Object();
        agot.u(true);
        this.c = c;
        this.a = 5;
        this.b = new ArrayDeque();
    }
    
    public adbo(final lyo b, final bwr c, final buc d, final byte[] array) {
        this.b = b;
        this.c = c;
        this.d = d;
        lyc e;
        if ("audio/true-hd".equals(b.f.n)) {
            e = new lyc();
        }
        else {
            e = null;
        }
        this.e = e;
    }
    
    public final void a() {
        ((tdv)this.c).clear();
        final Iterator<Object> iterator = new adbn((List)this.d, this.a).iterator();
        while (iterator.hasNext()) {
            ((acjb)this.c).add((Object)actc.A(this.a, (List)iterator.next(), 0, 0, 0, 0, 0));
        }
        if (!((List)this.d).isEmpty() && !((List)this.e).isEmpty()) {
            ((acjb)this.c).add((Object)new adbp());
        }
        final Iterator<Object> iterator2 = new adbn((List)this.e, this.a).iterator();
        while (iterator2.hasNext()) {
            ((acjb)this.c).add((Object)actc.A(this.a, (List)iterator2.next(), 0, 0, 0, 0, 0));
        }
    }
    
    public final void b(final int n) {
        if (!((yzk)this.e).T()) {
            final int c = ajox.c(((yzk)this.e).v().d);
            if (c == 0) {
                return;
            }
            if (c != 3) {
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
