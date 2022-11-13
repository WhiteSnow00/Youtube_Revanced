import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jer implements aboq, abon, abor
{
    public final asid a;
    public final asht b;
    public asir c;
    private aboq d;
    private abon e;
    private abor f;
    private boolean g;
    private final arkg h;
    private final abfz i;
    private final Set j;
    private final vai k;
    
    public jer(final aboq d, final abon e, final abor f, final arkg h, final abfz i, final vai k, final asid a, final asht b) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        this.k = k;
        this.a = a;
        this.b = b;
        this.g = (d instanceof abgd);
        this.j = new HashSet();
    }
    
    private final boolean q(final aboo aboo) {
        return (this.g || aboo == aboo.d || aboo == aboo.c) && ((twn)this.h.a()).a() != twl.a;
    }
    
    @Override
    public final PlaybackStartDescriptor a(final abop abop) {
        if (this.q(abop.e)) {
            return null;
        }
        return this.d.a(abop);
    }
    
    @Override
    public final abjt b(final abop abop) {
        return this.d.b(abop);
    }
    
    @Override
    public final abop c(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        return this.d.c(playbackStartDescriptor, abjt);
    }
    
    @Override
    public final SequenceNavigatorState d() {
        return this.d.d();
    }
    
    @Override
    public final void e(final boolean b) {
        this.d.e(b);
    }
    
    @Override
    public final void f(final abop abop, final PlaybackStartDescriptor playbackStartDescriptor) {
        this.d.f(abop, playbackStartDescriptor);
    }
    
    @Override
    public final void g() {
        this.d.g();
        final asir c = this.c;
        if (c != null) {
            asjv.b((AtomicReference)c);
            this.c = null;
        }
    }
    
    @Override
    public final void h(final WatchNextResponseModel watchNextResponseModel) {
        if (!this.g && this.k.f(45377877L) && watchNextResponseModel != null && watchNextResponseModel.g != null) {
            final aboq d = this.d;
            final abfz i = this.i;
            final abjp d2 = PlaybackStartDescriptor.d();
            d2.a = watchNextResponseModel.c;
            this.d = i.b(d2.a());
            for (final afhd afhd : this.j) {
                d.m(afhd);
                this.d.l(afhd);
            }
            final aboq d3 = this.d;
            this.e = (abon)d3;
            this.f = (abor)d3;
            this.g = true;
        }
        this.d.h(watchNextResponseModel);
    }
    
    @Override
    public final boolean i() {
        return this.d.i();
    }
    
    @Override
    public final int j(final abop abop) {
        if (this.q(abop.e)) {
            return 1;
        }
        return this.d.j(abop);
    }
    
    @Override
    public final void k(final PlaybackStartDescriptor playbackStartDescriptor) {
        this.d.k(playbackStartDescriptor);
    }
    
    @Override
    public final void l(final afhd afhd) {
        this.j.add(afhd);
        this.d.l(afhd);
    }
    
    @Override
    public final void m(final afhd afhd) {
        this.j.remove(afhd);
        this.d.m(afhd);
    }
    
    @Override
    public final int n() {
        return this.e.n();
    }
    
    @Override
    public final void o(final int n) {
        this.e.o(n);
    }
    
    @Override
    public final boolean p(final int n) {
        return this.e.p(n);
    }
    
    @Override
    public final void pC(final boolean b) {
        this.f.pC(b);
    }
    
    @Override
    public final boolean pD() {
        return this.f.pD();
    }
    
    @Override
    public final boolean pE() {
        return this.f.pE();
    }
}
