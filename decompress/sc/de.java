import java.util.Iterator;
import java.util.Collection;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class de
{
    public final ViewGroup a;
    final ArrayList b;
    public final ArrayList c;
    boolean d;
    
    public de(final ViewGroup a) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = false;
        this.a = a;
    }
    
    public static de b(final ViewGroup viewGroup, final cl cl) {
        cl.ao();
        return f(viewGroup);
    }
    
    public static void e(final dd dd) {
        di.d(dd.e, dd.a.O);
    }
    
    static de f(final ViewGroup viewGroup) {
        final Object tag = viewGroup.getTag(2131431626);
        if (tag instanceof de) {
            return (de)tag;
        }
        final de de = new de(viewGroup);
        viewGroup.setTag(2131431626, (Object)de);
        return de;
    }
    
    public final dd a(final br br) {
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final dd dd = (dd)b.get(i);
            if (dd.a.equals(br) && !dd.c) {
                return dd;
            }
        }
        return null;
    }
    
    public final void c() {
        final boolean am = anb.am((View)this.a);
        final ArrayList b = this.b;
        monitorenter(b);
        try {
            this.d();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((dd)iterator.next()).b();
            }
            for (final dd dd : new ArrayList(this.c)) {
                if (cl.W(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    String string;
                    if (am) {
                        string = "";
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.a);
                        sb2.append(" is not attached to window. ");
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append("Cancelling running operation ");
                    sb.append(dd);
                }
                dd.d();
            }
            for (final dd dd2 : new ArrayList(this.b)) {
                if (cl.W(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    String string2;
                    if (am) {
                        string2 = "";
                    }
                    else {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.a);
                        sb4.append(" is not attached to window. ");
                        string2 = sb4.toString();
                    }
                    sb3.append(string2);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(dd2);
                }
                dd2.d();
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void d() {
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final dd dd = (dd)b.get(i);
            if (dd.f == 2) {
                dd.f(di.b(dd.a.mJ().getVisibility()), 1);
            }
        }
    }
    
    public final void g(final int n, final int n2, final mrs mrs) {
        synchronized (this.b) {
            final ajl ajl = new ajl();
            final dd a = this.a((br)mrs.b);
            if (a != null) {
                a.f(n, n2);
                return;
            }
            final db db = new db(n, n2, mrs, ajl, (byte[])null, (byte[])null);
            this.b.add(db);
            ((dd)db).c((Runnable)new da(this, db, 0));
            ((dd)db).c((Runnable)new da(this, db, 2));
        }
    }
}
