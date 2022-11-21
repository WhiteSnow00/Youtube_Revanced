import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnc
{
    public final admj a;
    public final adnd b;
    public final Set c;
    private final adkp d;
    private final tpl e;
    private final tid f;
    private final tic g;
    private boolean h;
    private asln i;
    private final vmm j;
    
    public adnc(final admj a, final adnd b, final vmm j, final adkp d, final tpl e, final byte[] array) {
        this.c = new CopyOnWriteArraySet();
        this.h = false;
        this.a = a;
        this.b = b;
        this.j = j;
        this.d = d;
        this.e = e;
        this.f = (tid)new tuc(this, 3);
        this.g = (tic)new tub(this, 3);
    }
    
    public final void a(final Collection collection) {
        this.e.d(tpl.h).K(adlc.m).ar(1L).aH(new achd(this, collection, 2));
    }
    
    public final void b(final apkf apkf) {
        for (final String s : this.c) {
            try {
                final adoj b = this.a.b(s);
                if (b == null || adme.B(b)) {
                    continue;
                }
                this.b.e(s, b.e, apkf);
            }
            catch (final admk admk) {
                tut.f("UploadApplicationLifeCycleLogger", "JobStorageException for job ".concat(String.valueOf(s)), (Throwable)admk);
            }
        }
    }
    
    public final void c(final String s) {
        synchronized (this) {
            this.c.add(s);
            if (!this.h) {
                this.j.d((tif)this.f);
                this.j.d((tif)this.g);
                this.h = true;
                if (this.i == null) {
                    this.i = ((askp)((toz)this.d.f).f).K(adlc.l).aH((asmi)new acbf(this, 13));
                }
            }
        }
    }
    
    public final void d(final String s) {
        synchronized (this) {
            this.c.remove(s);
            if (this.c.isEmpty() && this.h) {
                this.j.e((tif)this.f);
                this.j.e((tif)this.g);
                this.h = false;
            }
        }
    }
}
