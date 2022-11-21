import java.util.Collections;
import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayk
{
    public Uri a;
    public String b;
    public Object c;
    public ayp d;
    private String e;
    private ayl f;
    private List g;
    private afgh h;
    private ayy i;
    private final ayt j;
    private elw k;
    
    public ayk() {
        this.f = new ayl();
        this.k = new elw((byte[])null);
        this.g = Collections.emptyList();
        this.h = afgh.q();
        this.d = new ayp();
        this.j = ayt.a;
    }
    
    public ayk(final ayv ayv) {
        this();
        this.f = ayv.e.a();
        this.e = ayv.a;
        this.i = ayv.d;
        this.d = ayv.c.a();
        this.j = ayv.f;
        final ayr b = ayv.b;
        if (b != null) {
            this.b = b.b;
            this.a = b.a;
            this.g = b.e;
            this.h = b.g;
            this.c = b.h;
            final ayo c = b.c;
            elw k;
            if (c != null) {
                k = new elw(c);
            }
            else {
                k = new elw((byte[])null);
            }
            this.k = k;
        }
    }
    
    public final ayv a() {
        final Object a = this.k.a;
        bad.f(true);
        final Uri a2 = this.a;
        ays ays;
        if (a2 != null) {
            final String b = this.b;
            final elw k = this.k;
            ayo ayo;
            if (k.d != null) {
                ayo = new ayo(k, null, null);
            }
            else {
                ayo = null;
            }
            ays = new ays(a2, b, ayo, this.g, this.h, this.c);
        }
        else {
            ays = null;
        }
        String e;
        if ((e = this.e) == null) {
            e = "";
        }
        final ayn a3 = this.f.a();
        final ayq a4 = this.d.a();
        ayy ayy;
        if ((ayy = this.i) == null) {
            ayy = ayy.a;
        }
        return new ayv(e, a3, ays, a4, ayy, this.j);
    }
    
    public final void b(final aym aym) {
        this.f = aym.a();
    }
    
    public final void c(final String e) {
        bad.b(e);
        this.e = e;
    }
    
    public final void d(final String s) {
        Uri parse;
        if (s == null) {
            parse = null;
        }
        else {
            parse = Uri.parse(s);
        }
        this.a = parse;
    }
}
