import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilu implements vke
{
    public final ipc a;
    private final Executor b;
    private final Executor c;
    private final adcr d;
    
    public ilu(final adcr d, final Executor b, final Executor c, final ipc a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final vjn a(final abxx abxx) {
        final adcr d = this.d;
        final aexq h = jfi.H(abxx);
        if (h.h()) {
            final int b = ((ajfj)h.c()).b;
            if (b == 3) {
                return new ilw("downloads_page_recommendations_item_section_identifier", ajfm.a.createBuilder(), d, h, null, null, null, null, null, null);
            }
            if (b == 4) {
                return new ilw("downloads_page_smart_downloads_item_section_identifier", ajfm.a.createBuilder(), d, h, null, null, null, null, null, null);
            }
            if (b == 5) {
                return new ilw("downloads_page_disclaimer_item_section_identifier", ajfm.a.createBuilder(), d, h, null, null, null, null, null, null);
            }
        }
        return new ilw("downloads_page_downloads_item_section_identifier", ajfm.a.createBuilder(), d, h, null, null, null, null, null, null);
    }
    
    public final void b(final vjn vjn, final vkd vkd, final znj znj) {
        if (!(vjn instanceof ilw)) {
            return;
        }
        ashp.F((Callable)new hlc(this, (ilw)vjn, 20)).Q(atio.b(this.b)).L(atio.b(this.c)).aa((asix)new ign(znj, 5), (asix)new ign(znj, 6));
    }
    
    public final ilw c(final ajfl ajfl) {
        final agza builder = ajfm.a.createBuilder();
        builder.copyOnWrite();
        final ajfm ajfm = (ajfm)builder.instance;
        ajfm.c = ajfl.e;
        ajfm.b |= 0x1;
        return new ilw("downloads_page_section_identifier_unknown", builder, this.d, aewp.a, null, null, null, null, null, null);
    }
}
