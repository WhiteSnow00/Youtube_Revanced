import java.util.Set;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.nio.ByteBuffer;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DecoratedPlayerBarRendererOuterClass;
import j$.util.Optional;
import com.google.android.libraries.youtube.player.features.markers.entities.MarkersVisibilityOverrideObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aauu implements asjm
{
    public final Object a;
    private final int b;
    
    public aauu(final aauw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aavh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aavr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aawr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aawy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aayh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aazh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aazt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final aazy a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final abel a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final addo a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final asiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aauu(final MarkersVisibilityOverrideObserver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object e) {
        final int b = this.b;
        final String s = null;
        final angr angr = null;
        switch (b) {
            default: {
                final Object a = this.a;
                final aany aany = (aany)e;
                String k = s;
                if (aany.a() != null) {
                    final PlayerResponseModel c = aany.a().c();
                    k = s;
                    if (c != null) {
                        k = c.K();
                    }
                }
                final MarkersVisibilityOverrideObserver markersVisibilityOverrideObserver = (MarkersVisibilityOverrideObserver)a;
                markersVisibilityOverrideObserver.f = k;
                markersVisibilityOverrideObserver.j();
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final aani aani = (aani)e;
                if (aani.c() == abkb.e) {
                    final WatchNextResponseModel a3 = aani.a();
                    if (a3 != null) {
                        final ativ a4 = ((aazy)a2).a;
                        final angl i = a3.i;
                        Optional optional = null;
                        Label_0331: {
                            if (i == null) {
                                optional = Optional.empty();
                            }
                            else {
                                anuv anuv;
                                if ((anuv = i.u) == null) {
                                    anuv = anuv.a;
                                }
                                final ajct ajct = (ajct)anuv.rx((ahaq)DecoratedPlayerBarRendererOuterClass.decoratedPlayerBarRenderer);
                                if ((0x2 & ajct.b) != 0x0) {
                                    anuv anuv2;
                                    if ((anuv2 = ajct.d) == null) {
                                        anuv2 = anuv.a;
                                    }
                                    if (anuv2.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                                        anuv anuv3;
                                        if ((anuv3 = ajct.d) == null) {
                                            anuv3 = anuv.a;
                                        }
                                        aiqj aiqj;
                                        if ((aiqj = ((aicz)anuv3.rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).p) == null) {
                                            aiqj = aiqj.a;
                                        }
                                        optional = Optional.of((Object)aiqj);
                                        break Label_0331;
                                    }
                                }
                                optional = Optional.empty();
                            }
                        }
                        a4.tu((Object)optional);
                    }
                }
                return;
            }
            case 18: {
                final Object a5 = this.a;
                final aanw aanw = (aanw)e;
                final aazt aazt = (aazt)a5;
                if (aazt.h && aanw.a() == 2) {
                    aazt.i();
                    aazt.f();
                    aazt.h = false;
                }
                return;
            }
            case 17: {
                final Object a6 = this.a;
                final aany aany2 = (aany)e;
                final aazt aazt2 = (aazt)a6;
                aazt2.h();
                if (aazt2.g) {
                    aazt2.g = false;
                    aazt2.b.tu((Object)aazn.b(3));
                }
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final aany aany3 = (aany)e;
                final abvz l = aany3.a().l();
                final aazt aazt3 = (aazt)a7;
                aazt3.e = l;
                aazt3.f = aany3.a().o();
                return;
            }
            case 15: {
                ((aazh)this.a).a((aamh)e);
                return;
            }
            case 14: {
                ((aazh)this.a).c((aant)e);
                return;
            }
            case 13: {
                ((aazh)this.a).b((aans)e);
                return;
            }
            case 12: {
                ((abel)this.a).a((aamh)e);
                return;
            }
            case 11: {
                ((abel)this.a).b((aans)e);
                return;
            }
            case 10: {
                final Object a8 = this.a;
                final aans aans = (aans)e;
                if (aans.c().a(new abke[] { abke.c }) && aans.d().i() != null && aans.d().f() != null && !aans.d().f().z()) {
                    if (!((List)aans.b().z().G).isEmpty()) {
                        aans.d().i().c((abzd)new aayg((aayh)a8, aans, 0));
                    }
                }
                return;
            }
            case 9: {
                final Object a9 = this.a;
                final aang aang = (aang)e;
                e = ((addo)a9).e;
                if (e != null) {
                    ((aayd)e).c();
                }
                return;
            }
            case 8: {
                ((asiq)this.a).c((asir)e);
                return;
            }
            case 7: {
                final Object a10 = this.a;
                final aang aang2 = (aang)e;
                final aawy aawy = (aawy)a10;
                if (!aawy.c) {
                    final aaxl e2 = aawy.e;
                    if (e2 != null) {
                        e2.b();
                    }
                }
                return;
            }
            case 6: {
                final Object a11 = this.a;
                final aani aani2 = (aani)e;
                final aawy aawy2 = (aawy)a11;
                if (aawy2.b) {
                    return;
                }
                aawy2.g(aani2);
                return;
            }
            case 5: {
                final Object a12 = this.a;
                final aans aans2 = (aans)e;
                final String e3 = aans2.e();
                final aawy aawy3 = (aawy)a12;
                aawy3.g = e3;
                if (!TextUtils.isEmpty((CharSequence)e3)) {
                    final aaxt d = aawy3.d;
                    aaxt.b((wyw)d.e, (wzz)d.b, e3);
                }
                if (aawy3.h != aaxu.a) {
                    final PlayerResponseModel a13 = aans2.a();
                    final String j = aans2.k();
                    final aaxt d2 = aawy3.d;
                    final aiqj h = aawy3.h();
                    if (a13 != null) {
                        if (!TextUtils.isEmpty((CharSequence)j)) {
                            if (!((Set)d2.a).contains(ByteBuffer.wrap(a13.Y()))) {
                                final Object e4 = d2.e;
                                if (!TextUtils.isEmpty((CharSequence)j)) {
                                    aaxt.b((wyw)d2.e, aaxt.a(h), j);
                                }
                                aaxt.d((xag)e4, (Runnable)tjv.g, new wyt(a13.Y()), h);
                                ((Set<ByteBuffer>)d2.a).add(ByteBuffer.wrap(a13.Y()));
                            }
                        }
                    }
                }
                return;
            }
            case 4: {
                ((aawr)this.a).d((aamh)e);
                return;
            }
            case 3: {
                final Object a14 = this.a;
                final aani aani3 = (aani)e;
                angr angr2 = angr;
                if (aani3.a() != null) {
                    angr2 = angr;
                    if (aani3.a().i != null) {
                        angi angi;
                        if ((angi = aani3.a().i.h) == null) {
                            angi = angi.a;
                        }
                        angr2 = angr;
                        if ((angi.b & 0x1) != 0x0) {
                            angi angi2;
                            if ((angi2 = aani3.a().i.h) == null) {
                                angi2 = angi.a;
                            }
                            if ((angr2 = angi2.c) == null) {
                                angr2 = angr.a;
                            }
                        }
                    }
                }
                if (aani3.c() == abkb.b) {
                    final aavt b2 = ((aavr)a14).b;
                    if (b2 != null) {
                        final aarm h2 = b2.h;
                        if (h2 != null) {
                            final aarl m = h2.k;
                            if (m != null) {
                                m.removeAllViews();
                            }
                        }
                    }
                }
                if (angr2 != null) {
                    final int min = Math.min(4, angr2.d.size());
                    final angt[] c2 = new angt[min];
                    final aavr aavr = (aavr)a14;
                    aavr.c = c2;
                    System.arraycopy(((List)angr2.d).toArray(new angt[0]), 0, aavr.c, 0, min);
                    final aavt b3 = aavr.b;
                    if (b3 != null) {
                        b3.b(aavr.c);
                    }
                    aavr.a.D((wzz)new wyt(angr2.g));
                }
                return;
            }
            case 2: {
                ((aavh)this.a).a((aans)e);
                return;
            }
            case 1: {
                ((aauw)this.a).c((aans)e);
                return;
            }
            case 0: {
                ((aauw)this.a).b((aamh)e);
            }
        }
    }
}
