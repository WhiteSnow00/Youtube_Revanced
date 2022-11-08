import j$.util.concurrent.ThreadLocalRandom;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$System;
import android.content.Context;
import android.os.PowerManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adep extends adel
{
    private final atjj a;
    private final oas b;
    private final tdz c;
    private final atjj d;
    private final atjj e;
    private final PowerManager f;
    private final Object g;
    private final Object h;
    private final adeo i;
    private ahqa j;
    private adeo k;
    private adem l;
    private boolean m;
    private long n;
    private final atjj o;
    private aden p;
    
    public adep(final Context context, final atjj a, final oas b, final tdz c, final atjj d, final atjj e, final atjj o) {
        this.g = new Object();
        this.h = new Object();
        final aden aden = new aden(0);
        this.i = (adeo)aden;
        this.k = (adeo)aden;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.o = o;
        this.f = (PowerManager)context.getSystemService("power");
    }
    
    private final float g() {
        final float a = ((tqy)this.e.a()).a();
        if (a == -1.0f) {
            return -1.0f;
        }
        return a * 1000000.0f;
    }
    
    private final ahqa h(final Context context, final float n) {
        final agza builder = ahqa.a.createBuilder();
        builder.copyOnWrite();
        final ahqa ahqa = (ahqa)builder.instance;
        ahqa.b |= 0x1;
        ahqa.c = (int)n;
        final int c = ((adfc)this.a.a()).c;
        builder.copyOnWrite();
        final ahqa ahqa2 = (ahqa)builder.instance;
        if (c != 0) {
            ahqa2.h = c - 1;
            ahqa2.b |= 0x20;
            final ajbv f = ((thh)this.d.a()).f();
            builder.copyOnWrite();
            final ahqa ahqa3 = (ahqa)builder.instance;
            ahqa3.d = f.B;
            final int b = ahqa3.b;
            final int n2 = 2;
            ahqa3.b = (b | 0x2);
            try {
                final int int1 = Settings$System.getInt(context.getContentResolver(), "screen_brightness");
                final int int2 = Settings$System.getInt(context.getContentResolver(), "screen_brightness_mode");
                builder.copyOnWrite();
                final ahqa ahqa4 = (ahqa)builder.instance;
                ahqa4.b |= 0x4;
                ahqa4.e = int1;
                int n3;
                if (int2 == 1) {
                    n3 = 2;
                }
                else {
                    n3 = 3;
                }
                builder.copyOnWrite();
                final ahqa ahqa5 = (ahqa)builder.instance;
                ahqa5.f = n3 - 1;
                ahqa5.b |= 0x8;
            }
            catch (final Settings$SettingNotFoundException ex) {
                builder.copyOnWrite();
                final ahqa ahqa6 = (ahqa)builder.instance;
                ahqa6.b |= 0x4;
                ahqa6.e = -1;
                builder.copyOnWrite();
                final ahqa ahqa7 = (ahqa)builder.instance;
                ahqa7.f = 0;
                ahqa7.b |= 0x8;
            }
            final PowerManager f2 = this.f;
            if (f2 != null) {
                int n4 = n2;
                if (!f2.isPowerSaveMode()) {
                    n4 = 3;
                }
                builder.copyOnWrite();
                final ahqa ahqa8 = (ahqa)builder.instance;
                ahqa8.g = n4 - 1;
                ahqa8.b |= 0x10;
            }
            else {
                builder.copyOnWrite();
                final ahqa ahqa9 = (ahqa)builder.instance;
                ahqa9.g = 0;
                ahqa9.b |= 0x10;
            }
            return (ahqa)builder.build();
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
            if (((adfc)this.a.a()).b != 2) {
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
                final ahqa j = this.j;
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
    
    @Override
    public final void a() {
        if (this.j()) {
            this.c.d((Object)new adfj(null));
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.h) {
            final adem l = this.l;
            if (l != null) {
                l.b = l.a.d();
                this.k = (adeo)this.l;
            }
            else {
                this.k = this.i;
            }
            monitorexit(this.h);
            this.i();
        }
    }
    
    @Override
    public final void c() {
        synchronized (this.h) {
            final aden p = this.p;
            if (p != null) {
                this.k = (adeo)p;
            }
            else {
                this.k = this.i;
            }
            monitorexit(this.h);
            this.i();
        }
    }
    
    public final void d(final aoox aoox) {
        synchronized (this.h) {
            this.k = this.i;
            boolean c = false;
            this.m = false;
            if (aoox != null && (aoox.b & 0x200) != 0x0) {
                aoon aoon;
                if ((aoon = aoox.h) == null) {
                    aoon = aoon.a;
                }
                if (aoon.c) {
                    aoon aoon2;
                    if ((aoon2 = aoox.h) == null) {
                        aoon2 = aoon.a;
                    }
                    final float f = aoon2.f;
                    if (f == 0.0) {
                        final tbv tbv = (tbv)this.o.a();
                        aoon aoon3;
                        if ((aoon3 = aoox.h) == null) {
                            aoon3 = aoon.a;
                        }
                        c = tbv.c(aoon3.d, tbw.a);
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
                    this.p = new aden(1);
                    final aoon h = aoox.h;
                    aoon a;
                    if (h == null) {
                        a = aoon.a;
                    }
                    else {
                        a = h;
                    }
                    Label_0353: {
                        if ((a.b & 0x4) != 0x0) {
                            aoon a2;
                            if ((a2 = h) == null) {
                                a2 = aoon.a;
                            }
                            aoom aoom;
                            if ((aoom = a2.e) == null) {
                                aoom = aoom.a;
                            }
                            if (aoom.b) {
                                final atjj a3 = this.a;
                                aoon aoon4;
                                if ((aoon4 = aoox.h) == null) {
                                    aoon4 = aoon.a;
                                }
                                aoom aoom2;
                                if ((aoom2 = aoon4.e) == null) {
                                    aoom2 = aoom.a;
                                }
                                this.l = new adem(a3, aoom2, this.b);
                                break Label_0353;
                            }
                        }
                        this.l = null;
                    }
                    Object o;
                    if (((adfc)this.a.a()).b()) {
                        o = this.p;
                    }
                    else {
                        o = this.l;
                    }
                    adeo i = (adeo)o;
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
    
    public final boolean f(final Context context, final agza agza) {
        final boolean j = this.j();
        boolean b = false;
        if (!j) {
            return false;
        }
        final long d = this.b.d();
        final ahqa h = this.h(context, this.g());
        synchronized (this.g) {
            final ahqa i = this.j;
            if (i != null) {
                final agza builder = ahpz.a.createBuilder();
                builder.copyOnWrite();
                final ahpz ahpz = (ahpz)builder.instance;
                ahpz.d = i;
                ahpz.b |= 0x2;
                builder.copyOnWrite();
                final ahpz ahpz2 = (ahpz)builder.instance;
                h.getClass();
                ahpz2.e = h;
                ahpz2.b |= 0x4;
                final long n = this.n;
                builder.copyOnWrite();
                final ahpz ahpz3 = (ahpz)builder.instance;
                ahpz3.b |= 0x1;
                ahpz3.c = d - n;
                agza.copyOnWrite();
                final aooh aooh = (aooh)agza.instance;
                final ahpz k = (ahpz)builder.build();
                final aooh a = aooh.a;
                k.getClass();
                aooh.i = k;
                aooh.b |= 0x100;
                b = true;
            }
            this.j = h;
            this.n = d;
            return b;
        }
    }
}
