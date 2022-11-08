import android.widget.SeekBar;
import android.graphics.Rect;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsw extends aqf
{
    public final /* synthetic */ gsy f;
    
    public gsw(final gsy f) {
        this.f = f;
        super(f);
    }
    
    @Override
    protected final int j(final float n, final float n2) {
        if (this.f.s.contains(n, n2)) {
            return 0;
        }
        if (this.f.t.contains(n, n2)) {
            return 1;
        }
        if (this.f.u.contains(n, n2)) {
            return 2;
        }
        return -1;
    }
    
    @Override
    protected final void m(final List list) {
        list.add(0);
        list.add(2);
        list.add(1);
    }
    
    @Override
    protected final void p(final int n, final aol aol) {
        final Rect rect = new Rect();
        String s;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    final StringBuilder sb = new StringBuilder("invalid virtual view id: ");
                    sb.append(n);
                    throw new IllegalArgumentException(sb.toString());
                }
                final gsy f = this.f;
                s = f.m;
                f.u.round(rect);
            }
            else {
                final gsy f2 = this.f;
                s = f2.o;
                f2.t.round(rect);
            }
        }
        else {
            final gsy f3 = this.f;
            s = f3.n;
            f3.s.round(rect);
        }
        aol.u((CharSequence)s);
        aol.q((CharSequence)SeekBar.class.getName());
        aol.m(rect);
        aol.g(4096);
        aol.g(8192);
    }
    
    @Override
    protected final boolean t(final int n, final int n2) {
        gnx gnx;
        if (n == 0) {
            gnx = new gnx(this, 5);
        }
        else if (n == 1) {
            gnx = new gnx(this, 6);
        }
        else {
            if (n != 2) {
                final StringBuilder sb = new StringBuilder("invalid virtual view id:");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            gnx = new gnx(this, 7);
        }
        if (n2 != 4096 && n2 != 8192) {
            return false;
        }
        float l = this.f.l;
        if (n2 == 8192) {
            l = -l;
        }
        ((trb)gnx).a((Object)l);
        final gsx p2 = this.f.p;
        if (p2 != null) {
            p2.a();
        }
        this.o(n, 0);
        this.v(n, 4);
        return true;
    }
}
