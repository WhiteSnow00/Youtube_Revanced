import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aako implements arls
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final atke e;
    private final atke f;
    private final atke g;
    private final atke h;
    private final atke i;
    private final atke j;
    private final atke k;
    private final atke l;
    private final int m;
    
    public aako(final atke a, final atke b, final atke c, final atke d, final atke e, final atke f, final atke g, final atke h, final atke i, final atke j, final atke k, final atke l, final int m) {
        this.m = m;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public aako(final atke j, final atke a, final atke g, final atke e, final atke h, final atke c, final atke i, final atke l, final atke k, final atke f, final atke b, final atke d, final int m, final byte[] array) {
        this.m = m;
        this.j = j;
        this.a = a;
        this.g = g;
        this.e = e;
        this.h = h;
        this.c = c;
        this.i = i;
        this.l = l;
        this.k = k;
        this.f = f;
        this.b = b;
        this.d = d;
    }
    
    public aako(final atke h, final atke c, final atke e, final atke b, final atke d, final atke l, final atke a, final atke f, final atke j, final atke k, final atke g, final atke i, final int m, final char[] array) {
        this.m = m;
        this.h = h;
        this.c = c;
        this.e = e;
        this.b = b;
        this.d = d;
        this.l = l;
        this.a = a;
        this.f = f;
        this.j = j;
        this.k = k;
        this.g = g;
        this.i = i;
    }
    
    public static aako b(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6, final atke atke7, final atke atke8, final atke atke9, final atke atke10, final atke atke11, final atke atke12) {
        return new aako(atke, atke2, atke3, atke4, atke5, atke6, atke7, atke8, atke9, atke10, atke11, atke12, 0);
    }
    
    public static aako c(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6, final atke atke7, final atke atke8, final atke atke9, final atke atke10, final atke atke11, final atke atke12) {
        return new aako(atke, atke2, atke3, atke4, atke5, atke6, atke7, atke8, atke9, atke10, atke11, atke12, 1, (byte[])null);
    }
    
    public static aako d(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6, final atke atke7, final atke atke8, final atke atke9, final atke atke10, final atke atke11, final atke atke12) {
        return new aako(atke, atke2, atke3, atke4, atke5, atke6, atke7, atke8, atke9, atke10, atke11, atke12, 2, (char[])null);
    }
    
    public static abqz e(final abqu abqu, final abrj abrj, final abre abre, final abrn abrn, final abrj abrj2, final arwh arwh, final abrj abrj3, final ashi ashi, final ablw ablw, final ashi ashi2, final ashi ashi3, final asie asie) {
        return new abqz(abqu, abrj, abre, abrn, abrj2, arwh, abrj3, ashi, ablw, ashi2, ashi3, asie, null, null, null, null);
    }
    
    public final Object a() {
        final int m = this.m;
        if (m == 0) {
            return new aakn((Context)((arlt)this.a).a, this.b, (abjj)this.c.a(), this.d, this.e, (aboe)this.f.a(), (aulc)this.g.a(), (aglu)this.h.a(), (arwh)this.i.a(), arlr.b(this.j), arlr.b(this.k), (abrj)this.l.a(), null, null, null, null);
        }
        if (m != 1) {
            final abqz e = e((abqu)this.h.a(), (abrj)this.c.a(), ((abrf)this.e).b(), ((abro)this.b).b(), ((abrk)this.d).b(), (arwh)this.l.a(), (abrj)this.a.a(), (ashi)this.f.a(), (ablw)this.j.a(), (ashi)this.k.a(), (ashi)this.g.a(), (asie)this.i.a());
            e.f();
            return e;
        }
        return new wyl((wxx)this.j.a(), ((tbu)this.a).b(), (ScheduledExecutorService)this.g.a(), (trc)this.e.a(), (oby)this.h.a(), (arwh)this.c.a(), (tgd)this.i.a(), (tev)this.l.a(), (zmf)this.k.a(), (tmx)this.f.a(), ((artm)this.b).c(), ((zlw)this.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
