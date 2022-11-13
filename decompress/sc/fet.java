import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fet implements fms
{
    static final String[] a;
    public final zmf b;
    public final oby c;
    public final Executor d;
    public final vlq e;
    fes f;
    fes g;
    fes h;
    fes i;
    fes j;
    fes k;
    public final fzw l;
    private final File m;
    
    static {
        a = new String[] { ".loadingWhatToWatchBrowse", ".offlineAccountBrowse", ".loadingAccountBrowse" };
    }
    
    public fet(final Context context, final zmf b, final oby c, final Executor d, final fzw l, final tnx tnx, final vlq e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.m = new File(context.getFilesDir(), "offline");
        this.l = l;
        this.e = e;
        if (tnx.e()) {
            final String[] a = fet.a;
            for (int i = 0; i < 3; ++i) {
                this.l(a[i]).i();
            }
            this.e().d();
            this.d().d();
            this.m().d();
            this.c().d();
            this.b().d();
            this.a().d();
        }
    }
    
    private final fes m() {
        synchronized (this) {
            if (this.h == null) {
                this.h = new fep(this, this.l(".generatedSingleTabAccountBrowseResponse"), null);
            }
            return this.h;
        }
    }
    
    public final fes a() {
        synchronized (this) {
            if (this.k == null) {
                this.k = new fen(this, this.l(".guide"), null);
            }
            return this.k;
        }
    }
    
    public final fes b() {
        synchronized (this) {
            if (this.j == null) {
                this.j = new fer(this, this.l(".loadingLibraryBrowse"), null);
            }
            return this.j;
        }
    }
    
    public final fes c() {
        synchronized (this) {
            if (this.i == null) {
                this.i = new feq(this, this.l(".offlineCloudSingleTabBrowse"), null);
            }
            return this.i;
        }
    }
    
    public final fes d() {
        synchronized (this) {
            if (this.g == null) {
                this.g = new feo(this, this.l(".offlineLibraryBrowse"), null);
            }
            return this.g;
        }
    }
    
    public final fes e() {
        synchronized (this) {
            if (this.f == null) {
                this.f = new fem(this, this.l(".settings"), null);
            }
            return this.f;
        }
    }
    
    public final BrowseResponseModel f() {
        BrowseResponseModel browseResponseModel;
        if ((browseResponseModel = (BrowseResponseModel)this.d().c()) == null) {
            browseResponseModel = new BrowseResponseModel(this.l.w());
        }
        return browseResponseModel;
    }
    
    public final ListenableFuture g() {
        try {
            final akhz h = this.h();
            return afwm.m((Object)(h != null && h.s));
        }
        catch (final IOException ex) {
            ttr.d("Failed to fetch offline browse", (Throwable)ex);
            return afwm.m((Object)false);
        }
    }
    
    public final akhz h() {
        return (akhz)this.c().c();
    }
    
    public final void i(final vvl vvl) {
        vvl.getClass();
        this.e().e((Object)vvl);
    }
    
    public final boolean j() {
        try {
            return (boolean)this.g().get(500L, TimeUnit.MILLISECONDS);
        }
        catch (final TimeoutException ex) {
            ttr.d("Timed out getting access to offline", (Throwable)ex);
        }
        catch (final ExecutionException ex2) {
            ttr.d("Failed to set access to offline", (Throwable)ex2);
        }
        catch (final InterruptedException ex3) {
            Thread.currentThread().interrupt();
        }
        return false;
    }
    
    public final void k(final akhz akhz) {
        this.b().e((Object)akhz);
    }
    
    final avu l(final String s) {
        return new avu(new File(this.m, s));
    }
}
