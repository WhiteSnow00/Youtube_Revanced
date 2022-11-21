import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.function.Consumer;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.Optional;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkw
{
    public aisc a;
    public int b;
    List c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    Boolean h;
    Boolean i;
    public Boolean j;
    Boolean k;
    public long l;
    final lrr m;
    public abku n;
    public lrt o;
    public String p;
    public String q;
    public String r;
    Optional s;
    final Optional t;
    public int u;
    
    public abkw() {
        this.l = -1L;
        this.u = 1;
        this.m = lrr.a;
        this.s = Optional.empty();
        this.t = Optional.empty();
    }
    
    public final PlaybackStartDescriptor a() {
        Label_0106: {
            if (this.o == null) {
                break Label_0106;
            }
            adme.L(this.c == null, "Only one of localProto, command, videoIdList can be set");
        Label_0097_Outer:
            while (true) {
                if (this.a != null) {
                    break Label_0136;
                }
                final lrt o = this.o;
                Object a;
                Object o2 = a = null;
                while (true) {
                    if (o == null) {
                        break Label_0097;
                    }
                    a = o2;
                    if ((o.b & 0x100000) == 0x0) {
                        break Label_0097;
                    }
                    try {
                        a = ahcz.parseFrom((ahcz)aisc.a, o.v, ExtensionRegistryLite.getGeneratedRegistry());
                        this.a = (aisc)a;
                        if (this.p != null || this.q != null) {
                            adme.L(this.o != null, "Can only set videoId/playlistId/playerParams when localProto is set");
                        }
                        final lrt o3 = this.o;
                        ahcr ahcr;
                        if (o3 == null) {
                            final aisc a2 = this.a;
                            if (a2 != null) {
                                o2 = ((ahcz)abky.a(a2)).toBuilder();
                                final ahbt byteString = ((ahbc)a2).toByteString();
                                ((ahcr)o2).copyOnWrite();
                                final lrt lrt = (lrt)((ahcr)o2).instance;
                                lrt.b |= 0x100000;
                                lrt.v = byteString;
                                ahcr = (ahcr)o2;
                                if (((ahcu)a2).ry((ahci)WatchEndpointOuterClass.watchEndpoint)) {
                                    int v;
                                    if ((v = aqvq.V(((apuw)((ahcu)a2).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).p)) == 0) {
                                        v = 1;
                                    }
                                    this.u = v;
                                    this.k = ((apuw)((ahcu)a2).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).x;
                                    ahcr = (ahcr)o2;
                                }
                            }
                            else if (this.c != null) {
                                ahcr = ((ahcz)lrt.a).createBuilder();
                                o2 = this.c;
                                ahcr.copyOnWrite();
                                final lrt lrt2 = (lrt)ahcr.instance;
                                final ahdp e = lrt2.e;
                                if (!e.c()) {
                                    lrt2.e = ahcz.mutableCopy(e);
                                }
                                ahbc.addAll((Iterable)o2, (List)lrt2.e);
                                ahcr.copyOnWrite();
                                o2 = ahcr.instance;
                                ((lrt)o2).b |= 0x2;
                                ((lrt)o2).f = "";
                                final int b = this.b;
                                boolean b2 = false;
                                Label_0468: {
                                    Label_0465: {
                                        int n;
                                        if ((n = b) < 0) {
                                            if (b != -1) {
                                                break Label_0465;
                                            }
                                            n = -1;
                                        }
                                        if (n < this.c.size()) {
                                            b2 = true;
                                            break Label_0468;
                                        }
                                    }
                                    b2 = false;
                                }
                                adme.T(b2);
                                final String d = this.c.get(Math.max(0, this.b));
                                ahcr.copyOnWrite();
                                o2 = ahcr.instance;
                                d.getClass();
                                ((lrt)o2).b |= 0x1;
                                ((lrt)o2).d = d;
                                final int b3 = this.b;
                                ahcr.copyOnWrite();
                                o2 = ahcr.instance;
                                ((lrt)o2).b |= 0x4;
                                ((lrt)o2).g = b3;
                                ahcr.copyOnWrite();
                                o2 = ahcr.instance;
                                ((lrt)o2).b |= 0x80;
                                ((lrt)o2).l = false;
                                ahcr.copyOnWrite();
                                o2 = ahcr.instance;
                                ((lrt)o2).b |= 0x40;
                                ((lrt)o2).k = false;
                            }
                            else {
                                ahcr = ((ahcz)lrt.a).createBuilder();
                            }
                        }
                        else {
                            ahcr = ((ahcz)o3).toBuilder();
                        }
                        final boolean d2 = this.d;
                        ahcr.copyOnWrite();
                        o2 = ahcr.instance;
                        ((lrt)o2).b |= 0x2000;
                        ((lrt)o2).r = d2;
                        final boolean e2 = this.e;
                        ahcr.copyOnWrite();
                        o2 = ahcr.instance;
                        ((lrt)o2).b |= 0x800000;
                        ((lrt)o2).x = e2;
                        final boolean f = this.f;
                        ahcr.copyOnWrite();
                        o2 = ahcr.instance;
                        ((lrt)o2).b |= 0x400000;
                        ((lrt)o2).w = f;
                        final long l = this.l;
                        if (l > -1L) {
                            ahcr.copyOnWrite();
                            o2 = ahcr.instance;
                            ((lrt)o2).b |= 0x200;
                            ((lrt)o2).n = l;
                        }
                        o2 = this.h;
                        if (o2 != null) {
                            final boolean booleanValue = (boolean)o2;
                            ahcr.copyOnWrite();
                            o2 = ahcr.instance;
                            ((lrt)o2).b |= 0x800;
                            ((lrt)o2).p = booleanValue;
                        }
                        o2 = this.j;
                        if (o2 != null) {
                            final boolean booleanValue2 = (boolean)o2;
                            ahcr.copyOnWrite();
                            o2 = ahcr.instance;
                            ((lrt)o2).b |= 0x80;
                            ((lrt)o2).l = booleanValue2;
                        }
                        o2 = this.i;
                        if (o2 != null) {
                            final boolean booleanValue3 = (boolean)o2;
                            ahcr.copyOnWrite();
                            o2 = ahcr.instance;
                            ((lrt)o2).b |= 0x1000;
                            ((lrt)o2).q = booleanValue3;
                        }
                        o2 = this.p;
                        if (o2 != null) {
                            ahcr.copyOnWrite();
                            final lrt lrt3 = (lrt)ahcr.instance;
                            lrt3.b |= 0x1;
                            lrt3.d = (String)o2;
                        }
                        final String q = this.q;
                        if (q != null) {
                            ahcr.copyOnWrite();
                            o2 = ahcr.instance;
                            ((lrt)o2).b |= 0x400;
                            ((lrt)o2).o = q;
                        }
                        if (this.m != lrr.a) {
                            o2 = this.m;
                            ahcr.copyOnWrite();
                            final lrt lrt4 = (lrt)ahcr.instance;
                            lrt4.y = ((lrr)o2).d;
                            lrt4.b |= 0x4000000;
                        }
                        o2 = this.k;
                        if (o2 != null) {
                            final boolean booleanValue4 = (boolean)o2;
                            ahcr.copyOnWrite();
                            o2 = ahcr.instance;
                            ((lrt)o2).b |= 0x10000000;
                            ((lrt)o2).B = booleanValue4;
                        }
                        o2 = this.a;
                        if (o2 != null) {
                            o2 = ((aisc)o2).c;
                            ahcr.copyOnWrite();
                            final lrt lrt5 = (lrt)ahcr.instance;
                            o2.getClass();
                            lrt5.b |= 0x20;
                            lrt5.j = (ahbt)o2;
                        }
                        o2 = this.s;
                        ahcr.getClass();
                        ((Optional)o2).ifPresent((Consumer)new aaqr(ahcr, 8));
                        this.t.ifPresent((Consumer)new aaqr(ahcr, 9));
                        this.o = (lrt)ahcr.build();
                        final PlaybackStartDescriptor playbackStartDescriptor = new PlaybackStartDescriptor(this.o, this.u, this.a, this.n);
                        playbackStartDescriptor.c = this.r;
                        playbackStartDescriptor.g = this.g;
                        return playbackStartDescriptor;
                        iftrue(Label_0136:)(this.a == null);
                        adme.L(this.c == null, "Only one of localProto, command, videoIdList can be set");
                        continue Label_0097_Outer;
                    }
                    catch (final ahds ahds) {
                        a = o2;
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public final void b(final ahbt ahbt) {
        this.s = Optional.ofNullable((Object)ahbt);
    }
    
    public final void c(final boolean b) {
        this.h = b;
    }
    
    public final void d(final List list) {
        final ArrayList c = new ArrayList(list.size());
        for (final String s : list) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                c.add(s);
            }
        }
        adme.K(c.isEmpty() ^ true);
        this.c = c;
    }
    
    public final void e() {
        this.i = true;
    }
}
