import android.os.Bundle;
import android.content.Context;
import android.app.Application;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cv implements aue, cgk, avv
{
    public auo a;
    public cgj b;
    private final br c;
    private final avu d;
    private avr e;
    
    public cv(final br c, final avu d) {
        this.a = null;
        this.b = null;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final aug aug) {
        this.a.e(aug);
    }
    
    final void b() {
        if (this.a == null) {
            this.a = new auo((aun)this);
            (this.b = cgj.a((cgk)this)).b();
            avk.c((cgk)this);
        }
    }
    
    @Override
    public final avy getDefaultViewModelCreationExtras() {
        while (true) {
            for (Context context = this.c.nY().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    final awa awa = new awa();
                    if (application != null) {
                        awa.b(avq.b, (Object)application);
                    }
                    awa.b(avk.a, (Object)this);
                    awa.b(avk.b, (Object)this);
                    final Bundle m = this.c.m;
                    if (m != null) {
                        awa.b(avk.c, (Object)m);
                    }
                    return (avy)awa;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    @Override
    public final avr getDefaultViewModelProviderFactory() {
        final avr defaultViewModelProviderFactory = this.c.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.c.aa)) {
            return this.e = defaultViewModelProviderFactory;
        }
        if (this.e == null) {
            while (true) {
                for (Context context = this.c.nY().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                    if (context instanceof Application) {
                        final Application application = (Application)context;
                        this.e = (avr)new avn(application, (cgk)this, this.c.m);
                        return this.e;
                    }
                }
                final Application application = null;
                continue;
            }
        }
        return this.e;
    }
    
    public final aui getLifecycle() {
        this.b();
        return this.a;
    }
    
    public final cgi getSavedStateRegistry() {
        this.b();
        return (cgi)this.b.c;
    }
    
    public final avu getViewModelStore() {
        this.b();
        return this.d;
    }
}
