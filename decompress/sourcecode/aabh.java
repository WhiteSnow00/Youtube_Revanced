import java.util.List;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Collection;
import android.text.TextUtils;
import java.util.ArrayList;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabh
{
    private static final long a;
    private final atjj b;
    private final Executor c;
    private final tny d;
    private final uyi e;
    private final arud f;
    private final adjo g;
    private final fzo h;
    
    static {
        a = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public aabh(final ScheduledExecutorService c, final atjj b, final adjo g, final tny d, final fzo h, final arud f, final uyi e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.b = b;
        this.g = g;
        this.d = d;
        this.h = h;
        this.f = f;
        this.e = e;
    }
    
    private final zyo d(final String s) {
        final ListenableFuture h = this.e().l().h(s);
        try {
            final aexq aexq = (aexq)h.get(aabh.a, TimeUnit.MILLISECONDS);
            if (aexq.h()) {
                return (zyo)aexq.c();
            }
            return null;
        }
        catch (final InterruptedException | ExecutionException | TimeoutException ex) {
            return null;
        }
    }
    
    private final aack e() {
        return ((zzu)this.b.a()).a();
    }
    
    public final ListenableFuture a(final PlaybackStartDescriptor playbackStartDescriptor) {
        final szy c = szy.c();
        this.c.execute((Runnable)new zry(this, playbackStartDescriptor, c, 8));
        return (ListenableFuture)c;
    }
    
    public final ListenableFuture b(final PlaybackStartDescriptor playbackStartDescriptor) {
        final szy c = szy.c();
        this.c.execute((Runnable)new zry(this, playbackStartDescriptor, (szx)c, 7));
        return (ListenableFuture)c;
    }
    
    public final void c(final PlaybackStartDescriptor ex, final szx szx) {
        Object o = null;
        boolean b = false;
        Label_0053: {
            if (!((PlaybackStartDescriptor)ex).s()) {
                o = this.f.f();
                if (o != null) {
                    if ((o = ((akak)o).j) == null) {
                        o = ancy.a;
                    }
                    if (((ancy)o).h) {
                        b = true;
                        break Label_0053;
                    }
                }
            }
            b = false;
            try {
                try {
                    final adjo g = this.g;
                    o = ((PlaybackStartDescriptor)ex).k();
                    o = ((vcf)g.d).a(((zki)g.g).c()).f(vek.h(119, (String)o)).j((Class)anau.class).af();
                    Label_0676: {
                        if (o == null || !((anau)o).i()) {
                            break Label_0676;
                        }
                        final Object f = g.f;
                        final amtx f2 = ((anau)o).f();
                        Label_0666: {
                            if (f2 == null || f2.getAction() != amtu.b) {
                                break Label_0666;
                            }
                            final long c = ((aahb)f).b.c();
                            final TimeUnit seconds = TimeUnit.SECONDS;
                            final Long expirationTimestamp = f2.getExpirationTimestamp();
                            try {
                                final long millis = seconds.toMillis(expirationTimestamp);
                                final long c2 = ((aahb)f).b.c();
                                final long millis2 = TimeUnit.SECONDS.toMillis(f2.getLastUpdatedTimestampSeconds());
                                final long a = aahb.a;
                                if (millis <= c2 || c < millis2 - a) {
                                    throw new zxe();
                                }
                                final aouz h = ((anau)o).h();
                                if (h == null) {
                                    throw new zxb();
                                }
                                if (h.getTransferState() != aouv.g) {
                                    throw new zxa();
                                }
                                final PlayerResponseModel af = PlayerResponseModelImpl.af(((anau)o).getPlayerResponseBytes().I(), 0L);
                                if (af == null) {
                                    throw new zxb();
                                }
                                final PlayerResponseModel m = g.m(h, af);
                                if (m != null) {
                                    final ArrayList list = new ArrayList();
                                    for (final algz algz : ((PlayerResponseModelImpl)m).b.G) {
                                        if (algz.d.size() != 0) {
                                            final agza builder = ((agzi)algz).toBuilder();
                                            builder.copyOnWrite();
                                            ((algz)builder.instance).d = algz.emptyProtobufList();
                                            final Iterator<Object> iterator2 = ((List<Object>)algz.d).iterator();
                                            while (iterator2.hasNext()) {
                                                PlayerResponseModel af2 = PlayerResponseModelImpl.af(iterator2.next().c.I(), 0L);
                                                if (af2 != null) {
                                                    final PlayerResponseModel i = g.m(h, af2);
                                                    if (i != null) {
                                                        af2 = i;
                                                    }
                                                    final agzc agzc = (agzc)((agzi)algy.a).createBuilder();
                                                    final agyc byteString = ((agxl)((PlayerResponseModelImpl)af2).b).toByteString();
                                                    ((agza)agzc).copyOnWrite();
                                                    final algy algy = (algy)agzc.instance;
                                                    algy.b |= 0x1;
                                                    algy.c = byteString;
                                                    builder.bg(agzc);
                                                }
                                            }
                                            list.add(builder.build());
                                        }
                                    }
                                    Object o2;
                                    if (list.isEmpty()) {
                                        o2 = m;
                                    }
                                    else {
                                        final agzc agzc2 = (agzc)((agzi)((PlayerResponseModelImpl)m).b).toBuilder();
                                        ((agza)agzc2).copyOnWrite();
                                        ((akve)agzc2.instance).G = akve.emptyProtobufList();
                                        agzc2.j((Iterable)list);
                                        o2 = new PlayerResponseModelImpl((akve)((agza)agzc2).build(), ((oas)g.b).d(), (vhm)((atjj)g.a).a());
                                    }
                                    final boolean b2 = b;
                                    Object a2 = o2;
                                    if (o2 == null) {
                                        zyo d;
                                        if (!TextUtils.isEmpty((CharSequence)((PlaybackStartDescriptor)ex).k())) {
                                            d = this.d(((PlaybackStartDescriptor)ex).k());
                                        }
                                        else {
                                            final fzo h2 = this.h;
                                            final String j = ((PlaybackStartDescriptor)ex).i();
                                            ((PlaybackStartDescriptor)ex).k();
                                            final aaat ao = h2.ao(j);
                                            int a3;
                                            if (((PlaybackStartDescriptor)ex).a() != -1) {
                                                a3 = ((PlaybackStartDescriptor)ex).a();
                                            }
                                            else {
                                                a3 = 0;
                                            }
                                            final afcr o3 = afcr.o((Collection)ao.c());
                                            if (tmy.aP(a3, 0, ((List)o3).size())) {
                                                d = (zyo)((List)o3).get(a3);
                                            }
                                            else {
                                                d = null;
                                            }
                                        }
                                        if (d == null) {
                                            throw new zxc();
                                        }
                                        if (!d.c()) {
                                            if (b2) {
                                                throw new zxa();
                                            }
                                        }
                                        else if (b2 && !d.b()) {
                                            if (this.e.f(45355600L)) {
                                                throw new zxa();
                                            }
                                        }
                                        a2 = this.e().k().a(d);
                                    }
                                    szx.b((Object)null, a2);
                                    return;
                                }
                                throw new zxb();
                                Object o2 = null;
                            }
                            catch (final zxd o) {}
                            catch (final zxg o) {}
                        }
                    }
                }
                catch (final Exception ex) {
                    szx.rX((Object)null, ex);
                    return;
                }
            }
            catch (final zxd o) {}
            catch (final zxg zxg) {}
        }
        if (!b) {
            final agza builder2 = ((agzi)akvk.a).createBuilder();
            final String k = ((PlaybackStartDescriptor)ex).k();
            builder2.copyOnWrite();
            final akvk akvk = (akvk)builder2.instance;
            k.getClass();
            akvk.b |= 0x1;
            akvk.c = k;
            builder2.copyOnWrite();
            final akvk akvk2 = (akvk)builder2.instance;
            akvk2.b |= 0x2;
            akvk2.d = "Unplayable Video";
            final akvk g2 = (akvk)builder2.build();
            final agza builder3 = ((agzi)akuv.a).createBuilder();
            builder3.copyOnWrite();
            final akuv akuv = (akuv)builder3.instance;
            akuv.c = 2;
            akuv.b |= 0x1;
            if (this.d.b((Throwable)o) != null) {
                final String b3 = this.d.b((Throwable)o);
                builder3.copyOnWrite();
                final akuv akuv2 = (akuv)builder3.instance;
                b3.getClass();
                akuv2.b |= 0x4;
                akuv2.d = b3;
            }
            final agza builder4 = amth.a.createBuilder();
            builder4.copyOnWrite();
            final amth amth = (amth)builder4.instance;
            amth.h = 1;
            amth.b |= 0x8;
            final amth l = (amth)builder4.build();
            final agzc agzc3 = (agzc)((agzi)akve.a).createBuilder();
            ((agza)agzc3).copyOnWrite();
            final akve akve = (akve)agzc3.instance;
            g2.getClass();
            akve.g = g2;
            akve.b |= 0x8;
            ((agza)agzc3).copyOnWrite();
            final akve akve2 = (akve)agzc3.instance;
            final akuv f3 = (akuv)builder3.build();
            f3.getClass();
            akve2.f = f3;
            akve2.b |= 0x4;
            ((agza)agzc3).copyOnWrite();
            final akve akve3 = (akve)agzc3.instance;
            l.getClass();
            akve3.k = l;
            akve3.b |= 0x80;
            szx.b((Object)null, (Object)new PlayerResponseModelImpl((akve)((agza)agzc3).build(), 0L, (VideoStreamingData)null));
            return;
        }
        szx.rX((Object)null, (Exception)o);
    }
}
