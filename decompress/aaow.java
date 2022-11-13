import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import j$.util.stream.Stream;
import java.util.List;
import j$.util.function.Predicate$_CC;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaow implements aewy
{
    public final asiq a;
    private final abzl b;
    private final aqck c;
    private final absb d;
    private final obq e;
    
    public aaow(final man man, final abzl b, final absb d, final byte[] array, final byte[] array2) {
        this.a = new asiq();
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        final ahaz builder = aqck.a.createBuilder();
        final String aa = b.aa();
        builder.copyOnWrite();
        final aqck aqck = (aqck)builder.instance;
        aa.getClass();
        aqck.b |= 0x1;
        aqck.c = aa;
        final PlayerResponseModel c = b.c();
        if (c != null) {
            final akxi z = c.z();
            if (z != null) {
                builder.copyOnWrite();
                final aqck aqck2 = (aqck)builder.instance;
                aqck2.d = z;
                aqck2.b |= 0x2;
            }
        }
        final int a = b.a();
        if (a == 0) {
            builder.copyOnWrite();
            final aqck aqck3 = (aqck)builder.instance;
            aqck3.e = 1;
            aqck3.b |= 0x4;
        }
        else if (a == 1) {
            builder.copyOnWrite();
            final aqck aqck4 = (aqck)builder.instance;
            aqck4.e = 2;
            aqck4.b |= 0x4;
        }
        else {
            builder.copyOnWrite();
            final aqck aqck5 = (aqck)builder.instance;
            aqck5.e = 0;
            aqck5.b |= 0x4;
        }
        this.c = (aqck)builder.build();
        this.e = man.n((obp)new xvd(12), (Function)new yud(b, 12));
    }
    
    public static final aiem a(final SubtitleTrack subtitleTrack) {
        final ahaz builder = aiem.a.createBuilder();
        final String string = tvb.d(subtitleTrack.d()).toString();
        builder.copyOnWrite();
        final aiem aiem = (aiem)builder.instance;
        string.getClass();
        aiem.b |= 0x1;
        aiem.c = string;
        final String e = subtitleTrack.e();
        builder.copyOnWrite();
        final aiem aiem2 = (aiem)builder.instance;
        aiem2.b |= 0x4;
        aiem2.e = e;
        final String l = subtitleTrack.l();
        builder.copyOnWrite();
        final aiem aiem3 = (aiem)builder.instance;
        aiem3.b |= 0x2;
        aiem3.d = l;
        return (aiem)builder.build();
    }
    
    public final aqbg b() {
        final ahaz builder = ((ahbh)aqbg.a).createBuilder();
        final List c = this.d.c();
        if (c != null) {
            final Stream map = Collection$_EL.stream((Collection)c).filter((Predicate)wzn.o).map((Function)new zze(8));
            builder.getClass();
            map.forEach((Consumer)new ynq(builder, 18));
        }
        final List b = this.d.b();
        final Stream map2 = Collection$_EL.stream((Collection)b).filter((Predicate)new wzn(16)).sorted((Comparator)new zks(13)).map((Function)new zze(8));
        builder.getClass();
        map2.forEach((Consumer)new ynq(builder, 19));
        Collection$_EL.stream((Collection)b).filter(Predicate$_CC.not((Predicate)new wzn(16))).map((Function)new zze(8)).forEach((Consumer)new ynq(builder, 17));
        final SubtitleTrack i = this.d.i;
        if (i != null) {
            final aiem a = a(i);
            builder.copyOnWrite();
            final aqbg aqbg = (aqbg)builder.instance;
            a.getClass();
            aqbg.f = a;
            aqbg.b |= 0x1;
        }
        return (aqbg)builder.build();
    }
    
    public final aqbh c() {
        final ahaz builder = ((ahbh)aqbh.a).createBuilder();
        final obq e = this.e;
        final ahaz builder2 = ((ahbh)aqaz.a).createBuilder();
        final String e2 = ((BaseClient)e).e();
        builder2.copyOnWrite();
        final aqaz aqaz = (aqaz)builder2.instance;
        e2.getClass();
        aqaz.b |= 0x1;
        aqaz.c = e2;
        final aqaz c = (aqaz)builder2.build();
        builder.copyOnWrite();
        final aqbh aqbh = (aqbh)builder.instance;
        c.getClass();
        aqbh.c = c;
        aqbh.b |= 0x1;
        return (aqbh)builder.build();
    }
    
    public final aqbk d() {
        final int intValue = ((Iterable<Integer>)new asng(this.b.X().L((asjr)aaxs.b), (Object)0)).iterator().next();
        final ahaz builder = ((ahbh)aqbk.a).createBuilder();
        final apta e = aakv.e(intValue);
        builder.copyOnWrite();
        final aqbk aqbk = (aqbk)builder.instance;
        aqbk.c = e.k;
        aqbk.b |= 0x1;
        return (aqbk)builder.build();
    }
    
    public final aqck e() {
        return this.c;
    }
    
    public final void f() {
    }
    
    public final void g(final RuntimeStreamWriter runtimeStreamWriter) {
        final asir ao = this.b.X().ao((asjm)new aaoe(runtimeStreamWriter, 10), (asjm)new aaoe(runtimeStreamWriter, 11), (asjg)new toa(runtimeStreamWriter, 13));
        this.a.c(ao);
        runtimeStreamWriter.a((Consumer)new xak(this, ao, 4));
    }
}
