import j$.util.concurrent.ThreadLocalRandom;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$System;
import android.content.Context;
import android.os.PowerManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adie extends adia
{
    private final atnb a;
    private final oco b;
    private final thg c;
    private final atnb d;
    private final atnb e;
    private final PowerManager f;
    private final Object g;
    private final Object h;
    private final adid i;
    private ahtr j;
    private adid k;
    private adib l;
    private boolean m;
    private long n;
    private final atnb o;
    private adic p;
    
    public adie(final Context context, final atnb a, final oco b, final thg c, final atnb d, final atnb e, final atnb o) {
        this.g = new Object();
        this.h = new Object();
        final adic adic = new adic(0);
        this.i = (adid)adic;
        this.k = (adid)adic;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.o = o;
        this.f = (PowerManager)context.getSystemService("power");
    }
    
    private final float i() {
        final float a = ((tuf)this.e.a()).a();
        if (a == -1.0f) {
            return -1.0f;
        }
        return a * 1000000.0f;
    }
    
    private final ahtr j(final Context context, final float n) {
        final ahcr builder = ((ahcz)ahtr.a).createBuilder();
        builder.copyOnWrite();
        final ahtr ahtr = (ahtr)builder.instance;
        ahtr.b |= 0x1;
        ahtr.c = (int)n;
        final int c = ((adiu)this.a.a()).c;
        builder.copyOnWrite();
        final ahtr ahtr2 = (ahtr)builder.instance;
        if (c != 0) {
            ahtr2.h = c - 1;
            ahtr2.b |= 0x20;
            final ajfx f = ((tkq)this.d.a()).f();
            builder.copyOnWrite();
            final ahtr ahtr3 = (ahtr)builder.instance;
            ahtr3.d = f.B;
            final int b = ahtr3.b;
            final int n2 = 2;
            ahtr3.b = (b | 0x2);
            try {
                final int int1 = Settings$System.getInt(context.getContentResolver(), "screen_brightness");
                final int int2 = Settings$System.getInt(context.getContentResolver(), "screen_brightness_mode");
                builder.copyOnWrite();
                final ahtr ahtr4 = (ahtr)builder.instance;
                ahtr4.b |= 0x4;
                ahtr4.e = int1;
                int n3;
                if (int2 == 1) {
                    n3 = 2;
                }
                else {
                    n3 = 3;
                }
                builder.copyOnWrite();
                final ahtr ahtr5 = (ahtr)builder.instance;
                ahtr5.f = n3 - 1;
                ahtr5.b |= 0x8;
            }
            catch (final Settings$SettingNotFoundException ex) {
                builder.copyOnWrite();
                final ahtr ahtr6 = (ahtr)builder.instance;
                ahtr6.b |= 0x4;
                ahtr6.e = -1;
                builder.copyOnWrite();
                final ahtr ahtr7 = (ahtr)builder.instance;
                ahtr7.f = 0;
                ahtr7.b |= 0x8;
            }
            final PowerManager f2 = this.f;
            if (f2 != null) {
                int n4 = n2;
                if (!f2.isPowerSaveMode()) {
                    n4 = 3;
                }
                builder.copyOnWrite();
                final ahtr ahtr8 = (ahtr)builder.instance;
                ahtr8.g = n4 - 1;
                ahtr8.b |= 0x10;
            }
            else {
                builder.copyOnWrite();
                final ahtr ahtr9 = (ahtr)builder.instance;
                ahtr9.g = 0;
                ahtr9.b |= 0x10;
            }
            return (ahtr)builder.build();
        }
        throw null;
    }
    
    private final void k() {
        synchronized (this.g) {
            this.j = null;
        }
    }
    
    private final boolean l() {
        if (!this.m) {
            return false;
        }
        synchronized (this.h) {
            if (!this.k.b()) {
                this.k = this.i;
                return false;
            }
            monitorexit(this.h);
            if (((adiu)this.a.a()).b != 2) {
                this.k();
                return false;
            }
            final float i = this.i();
            if (i == -1.0f) {
                this.k();
                return false;
            }
            final Object g = this.g;
            synchronized (this.h) {
                final ahtr j = this.j;
                if (j == null) {
                    return true;
                }
                final float n = (float)j.c;
                synchronized (this.h) {
                    final int a = this.k.a();
                    monitorexit(this.h);
                    return n - i >= a;
                }
            }
        }
    }
    
    public final void a() {
        if (this.l()) {
            this.c.d((Object)new adjb((aosw)null));
        }
    }
    
    public final void c() {
        synchronized (this.h) {
            final adib l = this.l;
            if (l != null) {
                l.b = l.a.d();
                this.k = (adid)this.l;
            }
            else {
                this.k = this.i;
            }
            monitorexit(this.h);
            this.k();
        }
    }
    
    public final void d() {
        synchronized (this.h) {
            final adic p = this.p;
            if (p != null) {
                this.k = (adid)p;
            }
            else {
                this.k = this.i;
            }
            monitorexit(this.h);
            this.k();
        }
    }
    
    public final void f(final aotm aotm) {
        synchronized (this.h) {
            this.k = this.i;
            boolean c = false;
            this.m = false;
            if (aotm != null && (aotm.b & 0x200) != 0x0) {
                aotb aotb;
                if ((aotb = aotm.h) == null) {
                    aotb = aotb.a;
                }
                if (aotb.c) {
                    aotb aotb2;
                    if ((aotb2 = aotm.h) == null) {
                        aotb2 = aotb.a;
                    }
                    final float f = aotb2.f;
                    if (f == 0.0) {
                        final tfd tfd = (tfd)this.o.a();
                        aotb aotb3;
                        if ((aotb3 = aotm.h) == null) {
                            aotb3 = aotb.a;
                        }
                        c = tfd.c(aotb3.d, tfe.a);
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
                    this.p = new adic(1);
                    final aotb h = aotm.h;
                    aotb a;
                    if (h == null) {
                        a = aotb.a;
                    }
                    else {
                        a = h;
                    }
                    Label_0353: {
                        if ((a.b & 0x4) != 0x0) {
                            aotb a2;
                            if ((a2 = h) == null) {
                                a2 = aotb.a;
                            }
                            aota aota;
                            if ((aota = a2.e) == null) {
                                aota = aota.a;
                            }
                            if (aota.b) {
                                final atnb a3 = this.a;
                                aotb aotb4;
                                if ((aotb4 = aotm.h) == null) {
                                    aotb4 = aotb.a;
                                }
                                aota aota2;
                                if ((aota2 = aotb4.e) == null) {
                                    aota2 = aota.a;
                                }
                                this.l = new adib(a3, aota2, this.b);
                                break Label_0353;
                            }
                        }
                        this.l = null;
                    }
                    Object o;
                    if (((adiu)this.a.a()).b()) {
                        o = this.p;
                    }
                    else {
                        o = this.l;
                    }
                    adid i = (adid)o;
                    if (o == null) {
                        i = this.i;
                    }
                    this.k = i;
                }
            }
        }
    }
    
    public final boolean g() {
        return this.m;
    }
    
    public final boolean h(final Context context, final ahcr ahcr) {
        final boolean l = this.l();
        boolean b = false;
        if (!l) {
            return false;
        }
        final long d = this.b.d();
        final ahtr j = this.j(context, this.i());
        synchronized (this.g) {
            final ahtr i = this.j;
            if (i != null) {
                final ahcr builder = ((ahcz)ahtq.a).createBuilder();
                builder.copyOnWrite();
                final ahtq ahtq = (ahtq)builder.instance;
                ahtq.d = i;
                ahtq.b |= 0x2;
                builder.copyOnWrite();
                final ahtq ahtq2 = (ahtq)builder.instance;
                j.getClass();
                ahtq2.e = j;
                ahtq2.b |= 0x4;
                final long n = this.n;
                builder.copyOnWrite();
                final ahtq ahtq3 = (ahtq)builder.instance;
                ahtq3.b |= 0x1;
                ahtq3.c = d - n;
                ahcr.copyOnWrite();
                final aosv aosv = (aosv)ahcr.instance;
                final ahtq k = (ahtq)builder.build();
                final aosv a = aosv.a;
                k.getClass();
                aosv.i = k;
                aosv.b |= 0x100;
                b = true;
            }
            this.j = j;
            this.n = d;
            return b;
        }
    }
}
