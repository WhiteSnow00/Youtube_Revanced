import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adln
{
    public final adku a;
    public final adlp b;
    public final Set c;
    private final adiz d;
    private final tok e;
    private final tha f;
    private final tgz g;
    private boolean h;
    private asir i;
    private final vlf j;
    
    public adln(final adku a, final adlp b, final vlf j, final adiz d, final tok e, final byte[] array) {
        this.c = new CopyOnWriteArraySet();
        this.h = false;
        this.a = a;
        this.b = b;
        this.j = j;
        this.d = d;
        this.e = e;
        this.f = (tha)new tta(this, 3);
        this.g = (tgz)new tsz(this, 3);
    }
    
    public final void a(final Collection collection) {
        this.e.d(tok.h).K((asjs)adjn.m).ar(1L).aH((asjm)new acfs(this, collection, 2));
    }
    
    public final void b(final apht apht) {
        for (final String s : this.c) {
            try {
                final admv b = this.a.b(s);
                if (b == null) {
                    continue;
                }
                this.b.e(s, b.e, apht);
            }
            catch (final adkv adkv) {
                ttr.f("UploadApplicationLifeCycleLogger", "JobStorageException for job ".concat(String.valueOf(s)), (Throwable)adkv);
            }
        }
    }
    
    public final void c(final String s) {
        synchronized (this) {
            this.c.add(s);
            if (!this.h) {
                this.j.d((thc)this.f);
                this.j.d((thc)this.g);
                this.h = true;
                if (this.i == null) {
                    this.i = ((asht)((tnz)this.d.f).f).K((asjs)adjn.l).aH((asjm)new acpc(this, 7));
                }
            }
        }
    }
    
    public final void d(final String s) {
        synchronized (this) {
            this.c.remove(s);
            if (this.c.isEmpty() && this.h) {
                this.j.e((thc)this.f);
                this.j.e((thc)this.g);
                this.h = false;
            }
        }
    }
}
