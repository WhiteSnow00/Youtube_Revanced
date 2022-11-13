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

public final class fzg
{
    private final fa a;
    private final SparseArray b;
    private int c;
    private boolean d;
    
    public fzg(final fa a) {
        this.a = a;
        this.b = new SparseArray();
    }
    
    public final void a(final fzi fzi) {
        synchronized (this) {
            fzi.getClass();
            final int j = fzi.j();
            if (this.b.get(j) != fzi) {
                this.b.put(j, (Object)fzi);
                ((bu)this.a).supportInvalidateOptionsMenu();
            }
        }
    }
    
    public final void b(final Menu menu) {
        monitorenter(this);
        int i = 0;
        try {
            while (i < menu.size()) {
                final fzi fzi = (fzi)this.b.get(menu.getItem(i).getItemId());
                if (fzi != null) {
                    fzi.m();
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
            for (final fzi fzi : collection) {
                this.b.put(fzi.j(), (Object)fzi);
            }
            ((bu)this.a).supportInvalidateOptionsMenu();
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
            ((bu)this.a).supportInvalidateOptionsMenu();
        }
        this.d = true;
    }
    
    public final boolean e(final MenuItem menuItem) {
        synchronized (this) {
            final fzi fzi = (fzi)this.b.get(menuItem.getItemId());
            return fzi != null && fzi.p();
        }
    }
    
    public final void f(final Menu menu, final MenuInflater menuInflater, final tqb tqb) {
        synchronized (this) {
            final ep supportActionBar = this.a.getSupportActionBar();
            supportActionBar.getClass();
            final Context b = supportActionBar.b();
            b.getClass();
            if (!this.d) {
                this.d(tpe.cx(b, 2130969041).orElse(0));
            }
            ezt.p(menu, menuInflater, tqb, this.b, this.c);
        }
    }
}
