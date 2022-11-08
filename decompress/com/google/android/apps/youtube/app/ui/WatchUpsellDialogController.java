// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

public class WatchUpsellDialogController implements tfh
{
    public final abno a;
    public final aafo b;
    public final wwv c;
    public final trp d;
    public final acro e;
    public boolean f;
    public boolean g;
    public String h;
    public final fzo i;
    private final abns j;
    private final asib k;
    private final vax l;
    
    public WatchUpsellDialogController(final abno a, final aafo b, final wwv c, final fzo i, final abns j, final vax l, final acro e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.j = j;
        this.l = l;
        this.e = e;
        this.k = new asib();
        this.d = (trp)new jvx(this, i, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void j(final aioh aioh) {
        final int b = aioh.b;
        if ((b & 0x1) != 0x0) {
            this.a.a();
            final vax l = this.l;
            aioe aioe;
            if ((aioe = aioh.c) == null) {
                aioe = aioe.a;
            }
            l.a(aioe);
        }
        else if ((b & 0x2) != 0x0) {
            final vax i = this.l;
            aioe aioe2;
            if ((aioe2 = aioh.d) == null) {
                aioe2 = aioe.a;
            }
            i.a(aioe2);
            final wwv c = this.c;
            if (c != null) {
                c.t((wxz)new wws(aioh.f), (alff)null);
            }
        }
        this.f = true;
    }
    
    public final void oS(final aum aum) {
        this.k.c(((asgt)this.j.q().b).am((asix)new jvw(this), (asix)jky.h));
    }
    
    public final void oW(final aum aum) {
        this.k.b();
    }
}
