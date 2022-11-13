import java.util.function.Consumer;
import android.content.Context;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eox implements eos
{
    private final Optional a;
    private final Optional b;
    private final arxu c;
    private final Context d;
    private eoq e;
    
    public eox(final Context d, final Optional a, final Optional b, final arxu c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (eoq)eow.a;
    }
    
    public final epe a() {
        final arut b = arut.b(arxn.c("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.platform.appintegration.mosaic.endpoint.MosaicService"), this.d);
        b.d = this.c;
        this.a.ifPresent((Consumer)new eou(b, 5));
        if (this.b.isPresent()) {
            b.c = new asfq(this.b.get(), 1);
            b.a.d = new asfq(this.b.get(), 1);
        }
        return (epe)epe.c((asgf)new oan(1), aruf.b((arty)b.a(), new arub[] { (arub)new agnz((atke)new aavb((atke)new esd(this.e, 1), 12), 0) }));
    }
    
    public final void b(final eoq e) {
        this.e = e;
    }
}
