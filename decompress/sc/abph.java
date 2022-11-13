import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abph implements arls
{
    private final atke a;
    private final atke b;
    private final int c;
    
    public abph(final atke a, final atke b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abph(final atke b, final atke a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abph(final atke b, final atke a, final int c, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abph(final atke b, final atke a, final int c, final int[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abph(final atke b, final atke a, final int c, final short[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abph(final atke b, final atke a, final int c, final boolean[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static abph A(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 14);
    }
    
    public static abph B(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 15, (boolean[])null);
    }
    
    public static abph C(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 16);
    }
    
    public static ablw D(final asid asid) {
        return aale.u(asid);
    }
    
    public static acid E(final vai vai, final tmx tmx) {
        return new acid(vai, tmx);
    }
    
    public static acxl F(final abpq abpq, final aboe aboe) {
        return aale.v(abpq, aboe);
    }
    
    public static abjj G(final ablw ablw, final aanx aanx) {
        return aale.w(ablw, aanx);
    }
    
    public static abru H(final aujg aujg, final abqg abqg) {
        return new abru(aujg, abqg, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aujg I(final xvz xvz, final abjj abjj) {
        return aale.A(xvz, abjj);
    }
    
    public static abpg b(final abpq abpq, final abqb abqb) {
        return new abpg(abpq, abqb);
    }
    
    public static abph c(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 0);
    }
    
    public static ashi d(final ashi ashi, final asid asid) {
        return ashi.Q().P(asid).V();
    }
    
    public static void e(final atiw atiw) {
        atiw.getClass();
    }
    
    public static void f(final atiw atiw) {
        atiw.getClass();
    }
    
    public static abzj g(abry abry, final vaf vaf) {
        if (abrj.B(vaf)) {
            abry = (abry)new abzj();
        }
        abry.getClass();
        return (abzj)abry;
    }
    
    public static void h(final atiw atiw) {
        atiw.getClass();
    }
    
    public static void i(final atiw atiw) {
        atiw.getClass();
    }
    
    public static void j(final ativ ativ) {
        ativ.getClass();
    }
    
    public static void k(final atiw atiw) {
        atiw.getClass();
    }
    
    public static void l(final atiw atiw) {
        atiw.getClass();
    }
    
    public static void m(final ativ ativ) {
        ativ.getClass();
    }
    
    public static abph n(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 1, (byte[])null);
    }
    
    public static abph o(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 2);
    }
    
    public static abph p(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 3, (char[])null);
    }
    
    public static abph q(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 4);
    }
    
    public static abph r(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 5);
    }
    
    public static abph s(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 6);
    }
    
    public static abph t(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 7, (short[])null);
    }
    
    public static abph u(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 8, (int[])null);
    }
    
    public static abph v(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 9);
    }
    
    public static abph w(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 10);
    }
    
    public static abph x(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 11);
    }
    
    public static abph y(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 12);
    }
    
    public static abph z(final atke atke, final atke atke2) {
        return new abph(atke, atke2, 13);
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                final abru h = H(((abrt)this.a).c(), (abqg)this.b.a());
                h.a();
                return h;
            }
            case 15: {
                return E(((arti)this.b).c(), (tmx)this.a.a());
            }
            case 14: {
                final Context context = (Context)((arlt)this.a).a;
                final ativ ativ = (ativ)this.b.a();
                ativ.getClass();
                return ativ;
            }
            case 13: {
                final Context context2 = (Context)((arlt)this.a).a;
                final atiw atiw = (atiw)this.b.a();
                atiw.getClass();
                return atiw;
            }
            case 12: {
                final Context context3 = (Context)((arlt)this.a).a;
                final atiw atiw2 = (atiw)this.b.a();
                atiw2.getClass();
                return atiw2;
            }
            case 11: {
                final Context context4 = (Context)((arlt)this.a).a;
                final ativ ativ2 = (ativ)this.b.a();
                ativ2.getClass();
                return ativ2;
            }
            case 10: {
                final Context context5 = (Context)((arlt)this.a).a;
                final atiw atiw3 = (atiw)this.b.a();
                atiw3.getClass();
                return atiw3;
            }
            case 9: {
                final Context context6 = (Context)((arlt)this.a).a;
                final atiw atiw4 = (atiw)this.b.a();
                atiw4.getClass();
                return atiw4;
            }
            case 8: {
                return g((abry)this.b.a(), (vaf)this.a.a());
            }
            case 7: {
                return aale.v((abpq)this.b.a(), (aboe)this.a.a());
            }
            case 6: {
                final Context context7 = (Context)((arlt)this.a).a;
                final atiw atiw5 = (atiw)this.b.a();
                atiw5.getClass();
                return atiw5;
            }
            case 5: {
                final Context context8 = (Context)((arlt)this.a).a;
                final atiw atiw6 = (atiw)this.b.a();
                atiw6.getClass();
                return atiw6;
            }
            case 4: {
                final Context context9 = (Context)((arlt)this.a).a;
                return aale.u((asid)this.b.a());
            }
            case 3: {
                return aale.w((ablw)this.b.a(), (aanx)this.a.a());
            }
            case 2: {
                return aale.A(((xub)this.a).c(), (abjj)this.b.a());
            }
            case 1: {
                return d((ashi)this.b.a(), (asid)this.a.a());
            }
            case 0: {
                return b((abpq)this.a.a(), (abqb)this.b.a());
            }
        }
    }
}
