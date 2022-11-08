import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.Collection;
import android.view.Menu;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyy
{
    private final fa a;
    private final SparseArray b;
    private int c;
    private boolean d;
    
    public fyy(final fa a) {
        this.a = a;
        this.b = new SparseArray();
    }
    
    public final void a(final fza fza) {
        synchronized (this) {
            fza.getClass();
            final int j = fza.j();
            if (this.b.get(j) != fza) {
                this.b.put(j, (Object)fza);
                this.a.supportInvalidateOptionsMenu();
            }
        }
    }
    
    public final void b(final Menu menu) {
        monitorenter(this);
        int i = 0;
        try {
            while (i < menu.size()) {
                final fza fza = (fza)this.b.get(menu.getItem(i).getItemId());
                if (fza != null) {
                    fza.m();
                }
                ++i;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final Collection collection) {
        monitorenter(this);
        try {
            this.b.clear();
            for (final fza fza : collection) {
                this.b.put(fza.j(), (Object)fza);
            }
            this.a.supportInvalidateOptionsMenu();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d(final int c) {
        final boolean d = this.d;
        if (d && this.c == c) {
            return;
        }
        this.c = c;
        if (d) {
            this.a.supportInvalidateOptionsMenu();
        }
        this.d = true;
    }
    
    public final boolean e(final MenuItem menuItem) {
        synchronized (this) {
            final fza fza = (fza)this.b.get(menuItem.getItemId());
            return fza != null && fza.p();
        }
    }
    
    public final void f(final Menu menu, final MenuInflater menuInflater, final tnw tnw) {
        synchronized (this) {
            final ep supportActionBar = this.a.getSupportActionBar();
            supportActionBar.getClass();
            final Context b = supportActionBar.b();
            b.getClass();
            if (!this.d) {
                this.d(tmy.ct(b, 2130969041).orElse(0));
            }
            ezp.p(menu, menuInflater, tnw, this.b, this.c);
        }
    }
}
