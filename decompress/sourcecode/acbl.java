import android.view.View;
import java.util.function.Predicate;
import com.google.protos.youtube.api.innertube.ShowSheetCommandOuterClass$ShowSheetCommand;
import java.util.Map;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbl implements vau
{
    public final vax a;
    public final abzo b;
    private final aum d;
    private final atjj e;
    private final Executor f;
    private final aeby g;
    
    public acbl(final aum d, final atjj e, final vax a, final Executor f, final abzo b, final aeby g, final byte[] array, final byte[] array2) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.b = b;
        this.g = g;
    }
    
    public final abzb b(final amwh amwh, final Optional optional) {
        final agza builder = ((agzi)abzb.a).createBuilder();
        if (optional.isPresent()) {
            final String c = (String)optional.get();
            builder.copyOnWrite();
            final abzb abzb = (abzb)builder.instance;
            abzb.b |= 0x1;
            abzb.c = c;
        }
        if ((amwh.b & 0x1) != 0x0) {
            anss anss;
            if ((anss = amwh.c) == null) {
                anss = anss.a;
            }
            final agyc c2 = this.c(anss);
            builder.copyOnWrite();
            final abzb abzb2 = (abzb)builder.instance;
            c2.getClass();
            abzb2.b |= 0x2;
            abzb2.d = c2;
        }
        if (amwh.f.size() > 0) {
            builder.af((Iterable)Collection$_EL.stream((Collection)amwh.f).map((Function)new ysf(this, 17)).collect(afaj.a));
        }
        if ((amwh.b & 0x2) != 0x0) {
            anss anss2;
            if ((anss2 = amwh.d) == null) {
                anss2 = anss.a;
            }
            final agyc c3 = this.c(anss2);
            builder.copyOnWrite();
            final abzb abzb3 = (abzb)builder.instance;
            c3.getClass();
            abzb3.a();
            abzb3.e.add(c3);
        }
        if ((amwh.b & 0x4) != 0x0) {
            anss anss3;
            if ((anss3 = amwh.e) == null) {
                anss3 = anss.a;
            }
            final agyc c4 = this.c(anss3);
            builder.copyOnWrite();
            final abzb abzb4 = (abzb)builder.instance;
            c4.getClass();
            abzb4.b |= 0x4;
            abzb4.f = c4;
        }
        return (abzb)builder.build();
    }
    
    public final agyc c(final anss anss) {
        final byte[] c = this.g.ae((ajkj)((agzd)anss).rr((agyr)ElementRendererOuterClass.elementRenderer)).c;
        agyc agyc;
        if (c == null) {
            agyc = agyc.b;
        }
        else {
            agyc = agyc.x(c);
        }
        return agyc;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)ShowSheetCommandOuterClass$ShowSheetCommand.showSheetCommand)) {
            return;
        }
        final ShowSheetCommandOuterClass$ShowSheetCommand showSheetCommandOuterClass$ShowSheetCommand = (ShowSheetCommandOuterClass$ShowSheetCommand)((agzd)aioe).rr((agyr)ShowSheetCommandOuterClass$ShowSheetCommand.showSheetCommand);
        Optional optional = Optional.empty();
        Optional optional2 = Optional.empty();
        if (map != null) {
            optional = Optional.ofNullable(map.get("com.google.android.libraries.youtube.rendering.elements.sender_view")).filter((Predicate)acbk.a).map((Function)new ysf((Class)View.class, 16));
            optional2 = Optional.ofNullable(map.get("com.google.android.libraries.youtube.innertube.endpoint.tag"));
        }
        amwi amwi;
        if ((amwi = showSheetCommandOuterClass$ShowSheetCommand.c) == null) {
            amwi = amwi.a;
        }
        final boolean b = (amwi.b & 0x8) != 0x0;
        Optional optional3;
        if (b) {
            amwk amwk;
            if ((amwk = amwi.f) == null) {
                amwk = amwk.a;
            }
            optional3 = Optional.of((Object)amwk.c);
        }
        else {
            optional3 = Optional.empty();
        }
        amwm a;
        if (amwi.c == 1) {
            a = (amwm)amwi.d;
        }
        else {
            a = amwm.a;
        }
        amwh a2;
        if (a.b == 441573002) {
            a2 = (amwh)a.c;
        }
        else {
            a2 = amwh.a;
        }
        final abzb b2 = this.b(a2, optional3);
        final abzo b3 = this.b;
        Optional optional4;
        if ((showSheetCommandOuterClass$ShowSheetCommand.b & 0x2) != 0x0) {
            anuk anuk;
            if ((anuk = showSheetCommandOuterClass$ShowSheetCommand.d) == null) {
                anuk = anuk.a;
            }
            optional4 = Optional.of((Object)anuk);
        }
        else {
            optional4 = Optional.empty();
        }
        b3.k(b2, optional4, Optional.empty(), optional, optional2, Optional.of((Object)aioe));
        if (b) {
            final vrr vrr = (vrr)this.e.a();
            amwk amwk2;
            if ((amwk2 = amwi.f) == null) {
                amwk2 = amwk.a;
            }
            final vrq e = vrr.e(amwk2);
            byte[] array;
            if (aioe != null && (0x1 & aioe.b) != 0x0) {
                array = aioe.c.I();
            }
            else {
                array = uyp.b;
            }
            ((vii)e).k(array);
            tcp.n(this.d, vrr.f(e, this.f), (trb)new swl(this, optional3, amwi, 9), (trb)new uef(this, optional3, 7));
        }
    }
}
