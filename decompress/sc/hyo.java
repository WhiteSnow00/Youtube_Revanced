import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import android.text.TextUtils;
import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyo implements vlc
{
    public final atke a;
    private final Context b;
    private final SharedPreferences c;
    private final arkg d;
    private final atke e;
    private final atke f;
    private final atke g;
    
    public hyo(final Context b, final SharedPreferences c, final atke a, final arkg d, final atke e, final atke f, final atke g, final vai vai) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (!vai.f(45382512L)) {
            g.a();
        }
    }
    
    public final void a(final ahaz ahaz) {
        final String string = this.c.getString("country", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            ahaz.copyOnWrite();
            final akld akld = (akld)ahaz.instance;
            final akld a = akld.a;
            string.getClass();
            akld.b |= 0x10;
            akld.i = string;
        }
        try {
            final String j = (String)afwm.a((Future)((vxu)this.f.a()).d());
            if (!TextUtils.isEmpty((CharSequence)j)) {
                ahaz.copyOnWrite();
                final akld akld2 = (akld)ahaz.instance;
                final akld a2 = akld.a;
                j.getClass();
                akld2.b |= 0x80;
                akld2.j = j;
            }
        }
        catch (final ExecutionException ex) {
            ttr.d("Failed to read the internal geo.", (Throwable)ex);
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            ahaz.copyOnWrite();
            final akld akld3 = (akld)ahaz.instance;
            final akld a3 = akld.a;
            throw null;
        }
        if (this.b.getResources().getString(2132017506).startsWith("\u200e\u200f\u200e\u200e")) {
            ahaz.copyOnWrite();
            final akld akld4 = (akld)ahaz.instance;
            final akld a4 = akld.a;
            akld4.b |= 0x4;
            akld4.g = true;
        }
        final akla akla = (akla)this.a.a();
        ahaz.copyOnWrite();
        final akld akld5 = (akld)ahaz.instance;
        final akld a5 = akld.a;
        akld5.N = akla.f;
        akld5.d |= 0x40;
        final alvi e = ((wwv)this.d.a()).e();
        if (e != null) {
            ahaz.copyOnWrite();
            final akld akld6 = (akld)ahaz.instance;
            akld6.k = e;
            akld6.b |= 0x400;
        }
        final aggw aggw = ((Map<K, aggw>)((rzv)this.e.a()).b).get("com.youtube.mainapp.android");
        if (aggw != null) {
            ahaz.copyOnWrite();
            final akld akld7 = (akld)ahaz.instance;
            final ahbx o = akld7.o;
            if (!o.c()) {
                akld7.o = ahbh.mutableCopy(o);
            }
            akld7.o.add((Object)aggw);
        }
        final gkv a6 = gkv.a;
        final int ordinal = ((gkx)this.g.a()).a().ordinal();
        if (ordinal == 0) {
            ahaz.copyOnWrite();
            final akld akld8 = (akld)ahaz.instance;
            akld8.Q = 1;
            akld8.d |= 0x8000;
            return;
        }
        if (ordinal != 1) {
            return;
        }
        ahaz.copyOnWrite();
        final akld akld9 = (akld)ahaz.instance;
        akld9.Q = 2;
        akld9.d |= 0x8000;
    }
}
