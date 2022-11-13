import j$.util.concurrent.ThreadLocalRandom;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$System;
import android.content.Context;
import android.os.PowerManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgr extends adgn
{
    private final atke a;
    private final oby b;
    private final tgd c;
    private final atke d;
    private final atke e;
    private final PowerManager f;
    private final Object g;
    private final Object h;
    private final adgq i;
    private ahry j;
    private adgq k;
    private adgo l;
    private boolean m;
    private long n;
    private final atke o;
    private adgp p;
    
    public adgr(final Context context, final atke a, final oby b, final tgd c, final atke d, final atke e, final atke o) {
        this.g = new Object();
        this.h = new Object();
        final adgp adgp = new adgp(0);
        this.i = (adgq)adgp;
        this.k = (adgq)adgp;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.o = o;
        this.f = (PowerManager)context.getSystemService("power");
    }
    
    private final float g() {
        final float a = ((ttd)this.e.a()).a();
        if (a == -1.0f) {
            return -1.0f;
        }
        return a * 1000000.0f;
    }
    
    private final ahry h(final Context context, final float n) {
        final ahaz builder = ((ahbh)ahry.a).createBuilder();
        builder.copyOnWrite();
        final ahry ahry = (ahry)builder.instance;
        ahry.b |= 0x1;
        ahry.c = (int)n;
        final int c = ((adhf)this.a.a()).c;
        builder.copyOnWrite();
        final ahry ahry2 = (ahry)builder.instance;
        if (c != 0) {
            ahry2.h = c - 1;
            ahry2.b |= 0x20;
            final ajdz f = ((tjm)this.d.a()).f();
            builder.copyOnWrite();
            final ahry ahry3 = (ahry)builder.instance;
            ahry3.d = f.B;
            final int b = ahry3.b;
            final int n2 = 2;
            ahry3.b = (b | 0x2);
            try {
                final int int1 = Settings$System.getInt(context.getContentResolver(), "screen_brightness");
                final int int2 = Settings$System.getInt(context.getContentResolver(), "screen_brightness_mode");
                builder.copyOnWrite();
                final ahry ahry4 = (ahry)builder.instance;
                ahry4.b |= 0x4;
                ahry4.e = int1;
                int n3;
                if (int2 == 1) {
                    n3 = 2;
                }
                else {
                    n3 = 3;
                }
                builder.copyOnWrite();
                final ahry ahry5 = (ahry)builder.instance;
                ahry5.f = n3 - 1;
                ahry5.b |= 0x8;
            }
            catch (final Settings$SettingNotFoundException ex) {
                builder.copyOnWrite();
                final ahry ahry6 = (ahry)builder.instance;
                ahry6.b |= 0x4;
                ahry6.e = -1;
                builder.copyOnWrite();
                final ahry ahry7 = (ahry)builder.instance;
                ahry7.f = 0;
                ahry7.b |= 0x8;
            }
            final PowerManager f2 = this.f;
            if (f2 != null) {
                int n4 = n2;
                if (!f2.isPowerSaveMode()) {
                    n4 = 3;
                }
                builder.copyOnWrite();
                final ahry ahry8 = (ahry)builder.instance;
                ahry8.g = n4 - 1;
                ahry8.b |= 0x10;
            }
            else {
                builder.copyOnWrite();
                final ahry ahry9 = (ahry)builder.instance;
                ahry9.g = 0;
                ahry9.b |= 0x10;
            }
            return (ahry)builder.build();
        }
        throw null;
    }
    
    private final void i() {
        synchronized (this.g) {
            this.j = null;
        }
    }
    
    private final boolean j() {
        if (!this.m) {
            return false;
        }
        synchronized (this.h) {
            if (!this.k.b()) {
                this.k = this.i;
                return false;
            }
            monitorexit(this.h);
            if (((adhf)this.a.a()).b != 2) {
                this.i();
                return false;
            }
            final float g = this.g();
            if (g == -1.0f) {
                this.i();
                return false;
            }
            final Object g2 = this.g;
            synchronized (this.h) {
                final ahry j = this.j;
                if (j == null) {
                    return true;
                }
                final float n = (float)j.c;
                synchronized (this.h) {
                    final int a = this.k.a();
                    monitorexit(this.h);
                    return n - g >= a;
                }
            }
        }
    }
    
    public final void a() {
        if (this.j()) {
            this.c.d((Object)new adhm((aoql)null));
        }
    }
    
    public final void b() {
        synchronized (this.h) {
            final adgo l = this.l;
            if (l != null) {
                l.b = l.a.d();
                this.k = (adgq)this.l;
            }
            else {
                this.k = this.i;
            }
            monitorexit(this.h);
            this.i();
        }
    }
    
    public final void c() {
        synchronized (this.h) {
            final adgp p = this.p;
            if (p != null) {
                this.k = (adgq)p;
            }
            else {
                this.k = this.i;
            }
            monitorexit(this.h);
            this.i();
        }
    }
    
    public final void d(final aora aora) {
        synchronized (this.h) {
            this.k = this.i;
            boolean c = false;
            this.m = false;
            if (aora != null && (aora.b & 0x200) != 0x0) {
                aoqq aoqq;
                if ((aoqq = aora.h) == null) {
                    aoqq = aoqq.a;
                }
                if (aoqq.c) {
                    aoqq aoqq2;
                    if ((aoqq2 = aora.h) == null) {
                        aoqq2 = aoqq.a;
                    }
                    final float f = aoqq2.f;
                    if (f == 0.0) {
                        final tdz tdz = (tdz)this.o.a();
                        aoqq aoqq3;
                        if ((aoqq3 = aora.h) == null) {
                            aoqq3 = aoqq.a;
                        }
                        c = tdz.c(aoqq3.d, tea.a);
                        this.m = c;
                    }
                    else {
                        if (ThreadLocalRandom.current().nextFloat() <= f) {
                            c = true;
                        }
                        this.m = c;
                    }
                    if (!c) {
                        return;
                    }
                    this.p = new adgp(1);
                    final aoqq h = aora.h;
                    aoqq a;
                    if (h == null) {
                        a = aoqq.a;
                    }
                    else {
                        a = h;
                    }
                    Label_0353: {
                        if ((a.b & 0x4) != 0x0) {
                            aoqq a2;
                            if ((a2 = h) == null) {
                                a2 = aoqq.a;
                            }
                            aoqp aoqp;
                            if ((aoqp = a2.e) == null) {
                                aoqp = aoqp.a;
                            }
                            if (aoqp.b) {
                                final atke a3 = this.a;
                                aoqq aoqq4;
                                if ((aoqq4 = aora.h) == null) {
                                    aoqq4 = aoqq.a;
                                }
                                aoqp aoqp2;
                                if ((aoqp2 = aoqq4.e) == null) {
                                    aoqp2 = aoqp.a;
                                }
                                this.l = new adgo(a3, aoqp2, this.b);
                                break Label_0353;
                            }
                        }
                        this.l = null;
                    }
                    Object o;
                    if (((adhf)this.a.a()).b()) {
                        o = this.p;
                    }
                    else {
                        o = this.l;
                    }
                    adgq i = (adgq)o;
                    if (o == null) {
                        i = this.i;
                    }
                    this.k = i;
                }
            }
        }
    }
    
    public final boolean e() {
        return this.m;
    }
    
    public final boolean f(final Context context, final ahaz ahaz) {
        final boolean j = this.j();
        boolean b = false;
        if (!j) {
            return false;
        }
        final long d = this.b.d();
        final ahry h = this.h(context, this.g());
        synchronized (this.g) {
            final ahry i = this.j;
            if (i != null) {
                final ahaz builder = ((ahbh)ahrx.a).createBuilder();
                builder.copyOnWrite();
                final ahrx ahrx = (ahrx)builder.instance;
                ahrx.d = i;
                ahrx.b |= 0x2;
                builder.copyOnWrite();
                final ahrx ahrx2 = (ahrx)builder.instance;
                h.getClass();
                ahrx2.e = h;
                ahrx2.b |= 0x4;
                final long n = this.n;
                builder.copyOnWrite();
                final ahrx ahrx3 = (ahrx)builder.instance;
                ahrx3.b |= 0x1;
                ahrx3.c = d - n;
                ahaz.copyOnWrite();
                final aoqk aoqk = (aoqk)ahaz.instance;
                final ahrx k = (ahrx)builder.build();
                final aoqk a = aoqk.a;
                k.getClass();
                aoqk.i = k;
                aoqk.b |= 0x100;
                b = true;
            }
            this.j = h;
            this.n = d;
            return b;
        }
    }
}
