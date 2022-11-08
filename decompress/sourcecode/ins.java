import java.util.concurrent.ExecutorService;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.concurrent.Future;
import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ins implements tec
{
    public final Context a;
    public final fml b;
    public final tdz c;
    public final acih d;
    public final fmd e;
    public final oas f;
    public final TextView g;
    public final TextView h;
    public fmc i;
    public acij j;
    public acio k;
    public aitp l;
    public String m;
    public acih n;
    public Future o;
    public final hyr p;
    public final aeby q;
    private final atjj r;
    private final iki s;
    private final TextView t;
    private final e u;
    
    public ins(final Context a, final fml b, final atjj r, final iki s, final hyr p17, final tdz c, final e u, final aeby q, final fmd e, final oas f, final View view, final acih d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.o = (Future)afva.k();
        this.a = a;
        this.b = b;
        this.r = r;
        this.s = s;
        this.p = p17;
        this.c = c;
        this.q = q;
        this.e = e;
        this.u = u;
        this.f = f;
        this.d = d;
        this.t = (TextView)view.findViewById(2131430230);
        this.g = (TextView)view.findViewById(2131432299);
        this.h = (TextView)view.findViewById(2131431819);
    }
    
    public final void a(final zyy zyy) {
        final TextView g = this.g;
        boolean b = true;
        if (zyy != null) {
            b = (zyy.e() && b);
        }
        tmy.v((View)g, b);
        if (zyy != null && !zyy.e()) {
            final ijj c = this.s.c(zyy);
            tmy.t(this.h, (CharSequence)((String[])c.c)[0]);
            this.h.setTextColor(tmy.ct(this.a, c.a).orElse(0));
            final TextView h = this.h;
            h.setTypeface(h.getTypeface(), 0);
        }
        else {
            tmy.v((View)this.h, false);
        }
        final aitp l = this.l;
        l.getClass();
        final TextView t = this.t;
        ajsq ajsq;
        if ((l.b & 0x10) != 0x0) {
            if ((ajsq = l.h) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        t.setText((CharSequence)abyh.b(ajsq));
        if (zyy != null && zyy.e() && zyy.c + zyy.a() == zyy.c()) {
            this.o.cancel(false);
            final e u = this.u;
            this.o = ((ExecutorService)u.a).submit(new gox(u, zyy.d(), (szx)new hba(this, 11), 15, null, null, null, null));
        }
    }
    
    public final void b() {
        final String m = this.m;
        if (!aexs.f(m)) {
            this.a(((zzu)this.r.a()).a().i().d(m));
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zwb zwb = (zwb)o;
                if (zwb.a.d().equals(this.m)) {
                    this.a(zwb.a);
                    return null;
                }
            }
            else {
                final tge tge = (tge)o;
                this.b();
            }
        }
        else {
            array = new Class[] { tge.class, zwb.class };
        }
        return array;
    }
}
