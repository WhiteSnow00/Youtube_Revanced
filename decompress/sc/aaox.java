import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import j$.util.Optional;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import j$.util.stream.Stream$_CC;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaox implements aexa
{
    private static final SubtitleTrack d;
    public final abpu a;
    public final asiq b;
    public final man c;
    
    static {
        d = SubtitleTrack.p("");
    }
    
    public aaox(final man c, final abpu a, final byte[] array, final byte[] array2) {
        this.b = new asiq();
        this.a = a;
        this.c = c;
    }
    
    public final ahao a(final aqcj aqcj) {
        this.a.n().Z(aqcj.b);
        return ahao.a;
    }
    
    public final ahao b(final aqar aqar) {
        if ((aqar.b & 0x1) != 0x0) {
            List c;
            if ((c = this.a.r().c()) == null) {
                c = new ArrayList();
            }
            final Optional first = Stream$_CC.concat(Collection$_EL.stream((Collection)c), Collection$_EL.stream((Collection)this.a.r().b())).filter((Predicate)new zzn(aqar, 2)).findFirst();
            final abpq n = this.a.n();
            n.getClass();
            first.ifPresent((Consumer)new ynq(n, 20));
            return ahao.a;
        }
        return ahao.a;
    }
    
    public final ahao c(final aqbx aqbx) {
        if (this.a.n() != null) {
            this.a.n().K(aqbx.b);
        }
        return ahao.a;
    }
    
    public final ahao d() {
        this.a.n().L(aaox.d);
        return ahao.a;
    }
    
    public final aqby e() {
        final ahaz builder = aqby.a.createBuilder();
        final float h = this.a.n().h();
        builder.copyOnWrite();
        final aqby aqby = (aqby)builder.instance;
        aqby.b |= 0x1;
        aqby.c = h;
        return (aqby)builder.build();
    }
    
    public final aqcf f() {
        throw new UnsupportedOperationException();
    }
    
    public final ahao g() {
        return ahao.a;
    }
    
    public final void h(final RuntimeStreamWriter runtimeStreamWriter) {
        final asir ao = this.a.w().ao((asjm)new tod(this, runtimeStreamWriter, 15), (asjm)new aaoe(runtimeStreamWriter, 12), (asjg)new toa(runtimeStreamWriter, 14));
        this.b.c(ao);
        runtimeStreamWriter.a((Consumer)new xak(this, ao, 5));
    }
}
