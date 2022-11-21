import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer;
import j$.util.Optional;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acvc implements acmb
{
    public final adzx a;
    private final arna b;
    private final accx c;
    private final atmj d;
    private View e;
    
    public acvc(final arna b, final accx c, final adzx a, final byte[] array) {
        this.d = atmj.aW((Object)Optional.empty());
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final View a() {
        final View e = this.e;
        e.getClass();
        return e;
    }
    
    public final askp b() {
        return ((askp)this.d).aq(new absa(this, 6));
    }
    
    @Override
    public final void c(final acmh acmh) {
    }
    
    public final void d(final aclz aclz, final FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer filterChipBarElementRendererOuterClass$FilterChipBarElementRenderer) {
        final int b = filterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.b;
        if ((b & 0x1) != 0x0 && (b & 0x2) != 0x0) {
            this.d.tt((Object)Optional.of((Object)filterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.d));
            anxb anxb;
            if ((anxb = filterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.c) == null) {
                anxb = anxb.a;
            }
            this.c.b(aclz, ((acdr)this.b.a()).d((ajon)((ahcu)anxb).rx((ahci)ElementRendererOuterClass.elementRenderer)));
            this.e = this.c.a();
            return;
        }
        this.d.tt((Object)Optional.empty());
    }
    
    @Override
    public final /* bridge */ void mK(final aclz aclz, final Object o) {
        this.d(aclz, (FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer)o);
    }
}
