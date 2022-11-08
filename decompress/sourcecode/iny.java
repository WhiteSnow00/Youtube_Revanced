import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iny implements tec
{
    public final Context a;
    public final tdz b;
    public final fmd c;
    public final fly d;
    public final flo e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ViewTreeObserver$OnGlobalLayoutListener i;
    public fmc j;
    public flx k;
    public anip l;
    public String m;
    private final atjj n;
    private final iki o;
    
    public iny(final Context a, final tdz b, final atjj n, final iki o, final fmd c, final fly d, final flo e, final View view) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.o = o;
        this.c = c;
        this.d = d;
        this.e = e;
        final TextView f = (TextView)view.findViewById(2131427696);
        this.f = f;
        this.g = (TextView)view.findViewById(2131428648);
        final TextView h = (TextView)view.findViewById(2131430217);
        this.h = h;
        this.i = (ViewTreeObserver$OnGlobalLayoutListener)new gzz(f, h, 3);
    }
    
    public final void a(final zzl zzl) {
        final boolean b = zzl != null && zzl.i() == zzh.b;
        boolean b2 = false;
        Label_0116: {
            Label_0038: {
                if (zzl == null || zzl.i() == zzh.a) {
                    final anip l = this.l;
                    if (l != null) {
                        final String s = (String)l.rr((agyr)anim.b);
                        if (!aexs.f(s)) {
                            if (((zzu)this.n.a()).a().i().e(s) != null) {
                                break Label_0038;
                            }
                        }
                    }
                    b2 = true;
                    break Label_0116;
                }
            }
            b2 = false;
        }
        if (!b && !b2) {
            final ijj d = this.o.d(0, zzl);
            final StringBuilder sb = new StringBuilder();
            int n = 0;
            while (true) {
                final String[] array = (String[])d.c;
                if (n >= array.length) {
                    break;
                }
                sb.append(array[n]);
                int n2;
                if ((n2 = n) < ((String[])d.c).length - 1) {
                    sb.append('\n');
                    n2 = 0;
                }
                n = n2 + 1;
            }
            tmy.t(this.g, (CharSequence)sb.toString());
            this.g.setMaxLines(((String[])d.c).length);
            this.g.setTextColor(tmy.ct(this.a, d.a).orElse(0));
            final TextView g = this.g;
            g.setTypeface(g.getTypeface(), 0);
        }
        else {
            tmy.v((View)this.g, false);
        }
        if (this.g.getVisibility() == 0) {
            tmy.v((View)this.f, false);
            tmy.v((View)this.h, false);
            return;
        }
        final anip i = this.l;
        if (i != null) {
            final TextView f = this.f;
            ajsq ajsq;
            if ((i.b & 0x10) != 0x0) {
                if ((ajsq = i.g) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            tmy.t(f, (CharSequence)abyh.b(ajsq));
            tmy.v((View)this.h, false);
            return;
        }
        tmy.t(this.f, (CharSequence)"");
    }
    
    public final void b() {
        final String m = this.m;
        if (!aexs.f(m)) {
            this.a(((zzu)this.n.a()).a().l().e(m));
        }
    }
    
    public final boolean c(final afdu afdu, final String s) {
        return !aexs.f(this.m) && this.m.equals(s) && !afdu.contains((Object)this.m);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final Class[] array = null;
        Class[] array2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 7: {
                final zwn zwn = (zwn)o;
                array2 = array;
                if (aexs.f(this.m)) {
                    break;
                }
                if (!this.m.equals(zwn.a)) {
                    array2 = array;
                    break;
                }
                this.b();
                return null;
            }
            case 6: {
                this.e.d().J((asjc)new inw(this, (zwm)o, 2)).Z((asix)new ign(this, 9));
                array2 = array;
                break;
            }
            case 5: {
                final zwd zwd = (zwd)o;
                final anip l = this.l;
                array2 = array;
                if (l == null) {
                    break;
                }
                final String d = zwd.a.d();
                Object rr;
                if (l.rs((agyr)anim.b)) {
                    rr = l.rr((agyr)anim.b);
                }
                else {
                    rr = null;
                }
                if (!d.equals(rr)) {
                    array2 = array;
                    break;
                }
                this.b();
                return null;
            }
            case 4: {
                final zwc zwc = (zwc)o;
                final anip i = this.l;
                array2 = array;
                if (i == null) {
                    break;
                }
                final String a = zwc.a;
                Object rr2;
                if (i.rs((agyr)anim.b)) {
                    rr2 = this.l.rr((agyr)anim.b);
                }
                else {
                    rr2 = null;
                }
                if (!a.equals(rr2)) {
                    array2 = array;
                    break;
                }
                this.b();
                return null;
            }
            case 3: {
                final zvz zvz = (zvz)o;
                this.b();
                array2 = array;
                break;
            }
            case 2: {
                final zvv zvv = (zvv)o;
                this.b();
                array2 = array;
                break;
            }
            case 1: {
                final ijc ijc = (ijc)o;
                array2 = array;
                if (aexs.f(this.m)) {
                    break;
                }
                if (!this.m.equals(ijc.a)) {
                    array2 = array;
                    break;
                }
                this.b();
                return null;
            }
            case 0: {
                final ijb ijb = (ijb)o;
                array2 = array;
                if (aexs.f(this.m)) {
                    break;
                }
                if (!this.m.equals(ijb.a)) {
                    array2 = array;
                    break;
                }
                this.a(null);
                return null;
            }
            case -1: {
                array2 = new Class[] { ijb.class, ijc.class, zvv.class, zvz.class, zwc.class, zwd.class, zwm.class, zwn.class };
                break;
            }
        }
        return array2;
    }
}
