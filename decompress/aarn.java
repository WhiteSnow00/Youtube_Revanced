import java.util.ArrayList;
import java.util.Iterator;
import android.graphics.Bitmap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class aarn extends aass implements aarp
{
    public final aasy a;
    public boolean b;
    public aaro c;
    private boolean e;
    private List f;
    
    public aarn(final aasy a) {
        this.a = a;
        this.b = false;
        this.e = true;
    }
    
    public aarn(final aavf aavf, final atnb atnb, final Bitmap bitmap, float n, final Bitmap bitmap2) {
        this(new aasy(aavf.a(), n, n));
        final aaue aaue = new aaue(bitmap, aave.a(n, n, aave.c), aavf.a(), atnb);
        aaue.a((aarg)new aato((aatn)aaue, aato.b(0.8f), aato.b(1.0f)));
        aaue.a((aarg)new aatj((aati)aaue, 0.1f, 0.2f));
        aaue.d = 0.0f;
        n = (float)bitmap2.getWidth();
        final Boolean a = aavd.a;
        final aaue aaue2 = new aaue(bitmap2, aave.a(aavd.a(n), aavd.a((float)bitmap2.getHeight()), aave.c), aavf.a(), atnb);
        aaue2.a((aarg)new aato((aatn)aaue2, aato.b(1.0f), aato.b(1.2f)));
        aaue2.d = 0.3f;
        this.m((aatp)aaue);
        this.m((aatp)aaue2);
    }
    
    public final void i(final boolean e) {
        this.e = e;
        for (final aatp aatp : this) {
            if (aatp instanceof aarp) {
                ((aarp)aatp).i(e);
            }
        }
    }
    
    public final void j(final aarg aarg) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(aarg);
    }
    
    public final void k(final float n, final float n2, final float n3) {
        super.k(n, n2, n3);
        this.a.a.f(n, n2, n3);
    }
    
    public final void l(final float n, final float n2) {
        this.a.a(n, n2);
    }
    
    public void o(final foq foq) {
        final aaro c = this.c;
        if (c != null && this.e && this.b) {
            c.a();
        }
    }
    
    public void p(final foq foq) {
        if (!((aatr)this).v()) {
            final List f = this.f;
            if (f != null) {
                final Iterator iterator = f.iterator();
                while (iterator.hasNext()) {
                    ((aarg)iterator.next()).a(this.b, foq.a);
                }
            }
        }
        super.p(foq);
    }
    
    public final boolean q(final foq foq) {
        return !((aatr)this).v() && this.e && this.a.b(foq).c();
    }
    
    public void rR(final boolean b, final foq foq) {
        this.b = b;
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            ((aatp)iterator.next()).rR(b, foq);
        }
    }
}
