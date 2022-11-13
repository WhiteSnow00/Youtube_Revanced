import java.util.List;
import java.util.Map;
import android.net.Uri;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjd implements tes
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public fjd(final fjg a, final Intent b, final Uri c, final aiqj d, final Map e, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public fjd(final wxz c, final vtc b, final List e, final String d, final zli a, final int f) {
        this.f = f;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
        this.a = a;
    }
    
    public final void a(final Object o) {
        final int f = this.f;
        if (f == 0) {
            this.b((Throwable)o);
            return;
        }
        if (f != 1) {
            this.b((Throwable)o);
            return;
        }
        this.b((Throwable)o);
    }
    
    public final void b(final Throwable t) {
        final int f = this.f;
        if (f == 0) {
            ((fjg)this.a).b((Intent)this.b, (Uri)this.c, (aiqj)this.d, (Map)this.e, false);
            return;
        }
        if (f == 1) {
            ((fjg)this.a).c((Intent)this.b, (Uri)this.c, (aiqj)this.d, (Map)this.e, false);
            return;
        }
        final Object c = this.c;
        final Object b = this.b;
        final Object e = this.e;
        final Object d = this.d;
        final Object a = this.a;
        ttr.f("GEL_DELAYED_EVENT_DEBUG", "Volley request failed for type ".concat(String.valueOf(aknw.class.getCanonicalName())), t);
        final wxz wxz = (wxz)c;
        if (!wxz.b.b()) {
            return;
        }
        String.valueOf(t);
        wxz.j();
        wxz.d.a(2, (Runnable)new zet(wxz, (vtc)b, (List)e, (String)d, (zli)a, t, 1));
    }
}
