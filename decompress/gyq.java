import java.util.Iterator;
import android.net.Uri;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.net.Uri$Builder;
import java.util.List;
import java.util.ArrayList;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.creation.common.media.ShortsVideoMetadata;
import com.google.android.libraries.youtube.creation.editor.volume.Volumes;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyq implements tyu
{
    private final hgv a;
    private final ueu b;
    private final Context c;
    private final aujg d;
    
    public gyq(final hgv a, final ueu b, final aujg d, final Context c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final void a(final amqg c, final File file, final arad arad, String h, final ucd ucd, final ShortsCreationSelectedTrack shortsCreationSelectedTrack, final upm upm, final Volumes volumes, final afeq afeq) {
        if (ucd == null) {
            ttr.b("Unexpected null ProjectState");
            zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Edit]Null ProjectState on navigate to upload");
            return;
        }
        final aezp cf = tpe.cf(ucd, this.c);
        if (!cf.h()) {
            ttr.b("Unexpected null VideoMetadata");
            zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Edit]Null ComposedVideo on navigate to upload");
            return;
        }
        final ShortsVideoMetadata shortsVideoMetadata = (ShortsVideoMetadata)cf.c();
        this.b.t(shortsVideoMetadata.d());
        final Long value = shortsVideoMetadata.c();
        final int b = shortsVideoMetadata.b();
        final int a = shortsVideoMetadata.a();
        final boolean ae = ucd.ae(ucd);
        final hgw a2 = hgx.a();
        aphs aphs;
        if (ae) {
            aphs = aphs.i;
        }
        else {
            aphs = aphs.h;
        }
        a2.c(aphs);
        a2.p = 7;
        a2.a = shortsVideoMetadata.d();
        a2.c = c;
        a2.e = ucd.h();
        a2.f = b;
        a2.g = a;
        a2.i = value;
        a2.h = ucd.q;
        a2.l = ucd.aa();
        final String p9 = ucd.p;
        if (p9 != null) {
            a2.j = p9;
        }
        if (h != null && !h.isEmpty()) {
            a2.k = h;
        }
        final File g = ucd.g();
        if (g != null) {
            a2.d = g.getPath();
        }
        final String string = shortsVideoMetadata.d().toString();
        Uri$Builder uri$Builder;
        if (ucd.b() != null) {
            final Uri$Builder d = utj.d(string);
            final EditableVideo b2 = ucd.b();
            uri$Builder = d;
            if (b2 != null) {
                utj.j(b2, d);
                uri$Builder = d;
            }
        }
        else {
            uri$Builder = null;
        }
        int n2;
        final int n = n2 = value.intValue();
        if (shortsCreationSelectedTrack != null) {
            n2 = Math.min((int)shortsCreationSelectedTrack.b(), n);
        }
        Uri$Builder d2 = uri$Builder;
        if (shortsCreationSelectedTrack != null) {
            d2 = uri$Builder;
            if (shortsCreationSelectedTrack.f().h()) {
                d2 = uri$Builder;
                if (shortsCreationSelectedTrack.d() != null) {
                    final long n3 = -TimeUnit.MILLISECONDS.toMicros(shortsCreationSelectedTrack.c());
                    if ((d2 = uri$Builder) == null) {
                        d2 = utj.d(string);
                    }
                    final float a3 = volumes.a(apoy.c);
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a3);
                    sb.append("f");
                    d2.appendQueryParameter("audioSwapVolume", sb.toString()).appendQueryParameter("audioSwapOffsetUs", Long.toString(n3));
                    final Uri d3 = shortsCreationSelectedTrack.d();
                    if (d3 != null) {
                        d2.appendQueryParameter("audioSwapSourceUri", d3.toString());
                    }
                    d2.appendQueryParameter("audioSwapDurationUs", Long.toString(TimeUnit.MILLISECONDS.toMicros(n2)));
                    if (ucd.n().h()) {
                        d2.appendQueryParameter("audioSwapVideoId", ((arbc)ucd.n().c()).c);
                    }
                    a2.d(true);
                }
            }
        }
        Uri$Builder d4 = d2;
        if (!TextUtils.isEmpty((CharSequence)"")) {
            if ((d4 = d2) == null) {
                d4 = utj.d(string);
            }
            d4.appendQueryParameter("audioFilePath", "");
        }
        Uri$Builder uri$Builder2 = d4;
        Label_0719: {
            if (file != null) {
                Uri$Builder d5;
                if ((d5 = d4) == null) {
                    d5 = utj.d(string);
                }
                d5.appendQueryParameter("videoEffectsStateFilePath", file.getAbsolutePath());
                uri$Builder2 = d5;
                if (arad != null) {
                    uri$Builder2 = d5;
                    if (arad.b() != 0) {
                        final Iterator iterator = arad.i().iterator();
                        do {
                            uri$Builder2 = d5;
                            if (iterator.hasNext()) {
                                continue;
                            }
                            break Label_0719;
                        } while (((aqzt)iterator.next()).i().c != 1);
                        d5.appendQueryParameter("editTextPosLayerUsed", Boolean.toString(true));
                        uri$Builder2 = d5;
                    }
                }
            }
        }
        upf i;
        if (this.d.bF()) {
            i = upm.i();
        }
        else {
            i = null;
        }
        Uri$Builder d6 = uri$Builder2;
        if (i != null) {
            d6 = uri$Builder2;
            if (!FilterMapTable$FilterDescriptor.g(i.b)) {
                if ((d6 = uri$Builder2) == null) {
                    d6 = utj.d(string);
                }
                d6.appendQueryParameter("filter", i.b);
            }
        }
        String c2 = null;
        Label_0971: {
            if (ucd.ae(ucd)) {
                final afeq r = ((uby)ucd).r();
                for (int size = ((List)r).size(), j = 0; j < size; ++j) {
                    final arbk arbk = (arbk)((List)r).get(j);
                    ajmi ajmi;
                    if ((ajmi = arbk.g) == null) {
                        ajmi = ajmi.a;
                    }
                    if ((ajmi.b & 0x1) != 0x0) {
                        ajmi ajmi2;
                        if ((ajmi2 = arbk.g) == null) {
                            ajmi2 = ajmi.a;
                        }
                        ajmh ajmh;
                        if ((ajmh = ajmi2.c) == null) {
                            ajmh = ajmh.a;
                        }
                        ajmj ajmj;
                        if ((ajmj = ajmh.c) == null) {
                            ajmj = ajmj.a;
                        }
                        if (!FilterMapTable$FilterDescriptor.g(ajmj.c)) {
                            c2 = ajmj.c;
                            break Label_0971;
                        }
                    }
                }
            }
            c2 = null;
        }
        Uri$Builder d7 = d6;
        if (c2 != null) {
            if ((d7 = d6) == null) {
                d7 = utj.d(string);
            }
            d7.appendQueryParameter("camera_filter", c2);
        }
        if (d7 != null) {
            a2.b = d7.build();
            this.b.v(d7.build());
        }
        if (ucd.o().h() && (((arbf)ucd.o().c()).b & 0x1) != 0x0) {
            aitg aitg;
            if ((aitg = ((arbf)ucd.o().c()).c) == null) {
                aitg = aitg.a;
            }
            h = aitg.h;
        }
        else {
            h = null;
        }
        if (h != null) {
            this.b.r(h);
        }
        else {
            this.b.d();
        }
        final hgx a4 = a2.a();
        final boolean b3 = ucd instanceof uby;
        hgw hgw = null;
        Label_4075: {
            Label_1502: {
                Label_1456: {
                    if (b3) {
                        final uby uby = (uby)ucd;
                        if (uby.r().size() > 1) {
                            break Label_1502;
                        }
                        if (uby.r().size() <= 0) {
                            break Label_1456;
                        }
                        final arbk arbk2 = (arbk)uby.r().get(0);
                        final int am = aqsx.am(arbk2.i);
                        if (am != 0) {
                            if (am == 2) {
                                break Label_1502;
                            }
                        }
                        if (arbk2.c == 6 && tpe.cg((apkx)arbk2.d)) {
                            break Label_1502;
                        }
                        apkt apkt;
                        if ((apkt = arbk2.k) == null) {
                            apkt = apkt.a;
                        }
                        if ((apkt.b & 0x1) != 0x0) {
                            apkt apkt2;
                            if ((apkt2 = arbk2.k) == null) {
                                apkt2 = apkt.a;
                            }
                            apkx apkx;
                            if ((apkx = apkt2.c) == null) {
                                apkx = apkx.a;
                            }
                            if (tpe.cg(apkx)) {
                                break Label_1502;
                            }
                        }
                        arbm arbm;
                        if ((arbm = arbk2.n) == null) {
                            arbm = arbm.a;
                        }
                        arbl arbl;
                        if ((arbl = arbl.b(arbm.h)) == null) {
                            arbl = arbl.a;
                        }
                        if (arbl != arbl.a) {
                            break Label_1502;
                        }
                    }
                    if (a4.o) {
                        break Label_1502;
                    }
                    final EditableVideo b4 = ucd.b();
                    if ((ucd.ag(ucd) && b4 != null && b4.L()) || file != null || (i != null && !FilterMapTable$FilterDescriptor.g(i.b))) {
                        break Label_1502;
                    }
                    if (!afeq.isEmpty()) {
                        break Label_1502;
                    }
                }
                a2.p = 2;
                a2.b(true);
                this.b.u(false);
                this.b.f();
                this.b.e();
                hgw = a2;
                break Label_4075;
            }
            final ahaz builder = apos.a.createBuilder();
            final ahaz builder2 = ((ahbh)apkz.a).createBuilder();
            final float a5 = volumes.a(apoy.b);
            builder2.copyOnWrite();
            final apkz apkz = (apkz)builder2.instance;
            apkz.b |= 0x1;
            apkz.d = a5;
            upf upf;
            hgw hgw2;
            if (ucd.ah(ucd)) {
                final afeq r2 = ((uby)ucd).r();
                final int size2 = ((List)r2).size();
                int k = 0;
                long c3 = 0L;
                while (k < size2) {
                    final arbk arbk3 = (arbk)((List)r2).get(k);
                    int am2;
                    if ((am2 = aqsx.am(arbk3.i)) == 0) {
                        am2 = 1;
                    }
                    int n4;
                    if ((n4 = am2) == 1) {
                        n4 = 2;
                    }
                    final ahaz builder3 = ((ahbh)apky.a).createBuilder();
                    builder3.copyOnWrite();
                    final apky apky = (apky)builder3.instance;
                    apky.f = n4 - 1;
                    apky.b |= 0x2;
                    arbj arbj;
                    if ((arbj = arbk3.f) == null) {
                        arbj = arbj.a;
                    }
                    final int d8 = arbj.d;
                    final ahaz builder4 = ((ahbh)apkv.a).createBuilder();
                    builder4.copyOnWrite();
                    final apkv apkv = (apkv)builder4.instance;
                    apkv.b |= 0x1;
                    apkv.c = c3;
                    final long n5 = d8;
                    final ahan b5 = ahey.b(n5);
                    builder4.copyOnWrite();
                    final apkv apkv2 = (apkv)builder4.instance;
                    b5.getClass();
                    apkv2.d = b5;
                    apkv2.b |= 0x2;
                    final apkv e = (apkv)builder4.build();
                    builder3.copyOnWrite();
                    final apky apky2 = (apky)builder3.instance;
                    e.getClass();
                    apky2.e = e;
                    apky2.b |= 0x1;
                    final int c4 = arbk3.c;
                    if (c4 == 6) {
                        final apkx d9 = (apkx)arbk3.d;
                        builder3.copyOnWrite();
                        final apky apky3 = (apky)builder3.instance;
                        d9.getClass();
                        apky3.d = d9;
                        apky3.c = 4;
                    }
                    else if (c4 == 3) {
                        final apks d10 = (apks)arbk3.d;
                        builder3.copyOnWrite();
                        final apky apky4 = (apky)builder3.instance;
                        d10.getClass();
                        apky4.d = d10;
                        apky4.c = 3;
                    }
                    if ((arbk3.b & 0x100) != 0x0) {
                        apkt h2;
                        if ((h2 = arbk3.k) == null) {
                            h2 = apkt.a;
                        }
                        builder3.copyOnWrite();
                        final apky apky5 = (apky)builder3.instance;
                        h2.getClass();
                        apky5.h = h2;
                        apky5.b |= 0x20;
                    }
                    ajmi g2;
                    if ((g2 = arbk3.g) == null) {
                        g2 = ajmi.a;
                    }
                    builder3.copyOnWrite();
                    final apky apky6 = (apky)builder3.instance;
                    g2.getClass();
                    apky6.g = g2;
                    apky6.b |= 0x10;
                    c3 += n5;
                    builder2.bO(builder3);
                    ++k;
                }
                upf = i;
                hgw2 = a2;
            }
            else {
                upf = i;
                hgw2 = a2;
                final uce uce = (uce)ucd;
                final ahaz builder5 = ((ahbh)apky.a).createBuilder();
                builder5.copyOnWrite();
                final apky apky7 = (apky)builder5.instance;
                apky7.f = 2;
                apky7.b |= 0x2;
                int n6;
                if (uce.c().h()) {
                    n6 = (int)((ShortsVideoMetadata)uce.c().c()).c();
                }
                else {
                    n6 = 0;
                }
                final apkv bh = tpe.bH(0, n6);
                builder5.copyOnWrite();
                final apky apky8 = (apky)builder5.instance;
                bh.getClass();
                apky8.e = bh;
                apky8.b |= 0x1;
                final EditableVideo b6 = uce.b;
                if (b6 != null && b6.L()) {
                    final ahaz builder6 = ((ahbh)apkx.a).createBuilder();
                    builder6.copyOnWrite();
                    final apkx apkx2 = (apkx)builder6.instance;
                    apkx2.b |= 0x1;
                    apkx2.c = true;
                    builder5.copyOnWrite();
                    final apky apky9 = (apky)builder5.instance;
                    final apkx d11 = (apkx)builder6.build();
                    d11.getClass();
                    apky9.d = d11;
                    apky9.c = 4;
                }
                builder2.bO(builder5);
            }
            final ahaz builder7 = apor.a.createBuilder();
            final float a6 = volumes.a(apoy.c);
            Object o;
            if (shortsCreationSelectedTrack == null) {
                o = null;
            }
            else {
                final ahaz builder8 = apoo.a.createBuilder();
                final ahaz builder9 = apon.a.createBuilder();
                final String n7 = shortsCreationSelectedTrack.n();
                builder9.copyOnWrite();
                final apon apon = (apon)builder9.instance;
                apon.b |= 0x1;
                apon.c = n7;
                final apkv bh2 = tpe.bH((int)shortsCreationSelectedTrack.c(), n2);
                builder9.copyOnWrite();
                final apon apon2 = (apon)builder9.instance;
                bh2.getClass();
                apon2.d = bh2;
                apon2.b |= 0x2;
                final apkv bh3 = tpe.bH(0, n2);
                builder9.copyOnWrite();
                final apon apon3 = (apon)builder9.instance;
                bh3.getClass();
                apon3.e = bh3;
                apon3.b |= 0x4;
                builder8.copyOnWrite();
                final apoo apoo = (apoo)builder8.instance;
                final apon c5 = (apon)builder9.build();
                c5.getClass();
                apoo.c = c5;
                apoo.b |= 0x1;
                builder8.copyOnWrite();
                final apoo apoo2 = (apoo)builder8.instance;
                apoo2.b |= 0x2;
                apoo2.d = a6;
                boolean e2 = false;
                Label_2730: {
                    Label_2727: {
                        if (ucd.n().h()) {
                            final arbc arbc = (arbc)ucd.n().c();
                            if (arbc.c.equals(shortsCreationSelectedTrack.n()) && tpe.bO(arbc) == shortsCreationSelectedTrack.c()) {
                                break Label_2727;
                            }
                        }
                        else if (shortsCreationSelectedTrack.n().isEmpty()) {
                            break Label_2727;
                        }
                        e2 = true;
                        break Label_2730;
                    }
                    e2 = false;
                }
                builder8.copyOnWrite();
                final apoo apoo3 = (apoo)builder8.instance;
                apoo3.b |= 0x8;
                apoo3.e = e2;
                o = builder8.build();
            }
            if (o != null) {
                builder7.copyOnWrite();
                final apor apor = (apor)builder7.instance;
                apor.a();
                apor.b.add(o);
            }
            if (b3) {
                final uby uby2 = (uby)ucd;
                final ArrayList list = new ArrayList();
                final afeq r3 = uby2.r();
                final int size3 = ((List)r3).size();
                int l = 0;
                int n8 = 0;
                int n9 = -1;
                while (l < size3) {
                    final arbk arbk4 = (arbk)((List)r3).get(l);
                    arbm arbm2;
                    if ((arbm2 = arbk4.n) == null) {
                        arbm2 = arbm.a;
                    }
                    arbj arbj2;
                    if ((arbj2 = arbm2.f) == null) {
                        arbj2 = arbj.a;
                    }
                    final arbl a7 = arbl.a;
                    arbm arbm3;
                    if ((arbm3 = arbk4.n) == null) {
                        arbm3 = arbm.a;
                    }
                    arbl arbl2;
                    if ((arbl2 = arbl.b(arbm3.h)) == null) {
                        arbl2 = arbl.a;
                    }
                    final int ordinal = arbl2.ordinal();
                    Label_3154: {
                        if (ordinal != 1) {
                            if (ordinal == 2 || ordinal == 3) {
                                final int c6 = arbj2.c;
                                final int d12 = arbj2.d;
                                int n10;
                                if (n9 < 0 || (n10 = n9) >= c6 + d12) {
                                    n10 = c6;
                                }
                                arbj arbj3;
                                if ((arbj3 = arbk4.f) == null) {
                                    arbj3 = arbj.a;
                                }
                                list.add(tpe.bI(arbk4, n8, volumes, n10, Math.min(arbj3.d, d12)));
                                arbj arbj4;
                                if ((arbj4 = arbk4.f) == null) {
                                    arbj4 = arbj.a;
                                }
                                n9 = n10 + arbj4.d;
                                break Label_3154;
                            }
                            if (ordinal != 4) {
                                break Label_3154;
                            }
                        }
                        list.add(tpe.bI(arbk4, n8, volumes, arbj2.c, arbj2.d));
                    }
                    arbj arbj5;
                    if ((arbj5 = arbk4.f) == null) {
                        arbj5 = arbj.a;
                    }
                    n8 += arbj5.d;
                    ++l;
                }
                builder7.copyOnWrite();
                final apor apor2 = (apor)builder7.instance;
                apor2.a();
                agzk.addAll((Iterable)list, (List)apor2.b);
                final ArrayList list2 = new ArrayList();
                final afeq r4 = uby2.r();
                final int size4 = ((List)r4).size();
                int n11 = 0;
                int n12 = -1;
                for (int n13 = 0; n13 < size4; ++n13) {
                    final arbk arbk5 = (arbk)((List)r4).get(n13);
                    arbm arbm4;
                    if ((arbm4 = arbk5.n) == null) {
                        arbm4 = arbm.a;
                    }
                    arbj arbj6;
                    if ((arbj6 = arbm4.d) == null) {
                        arbj6 = arbj.a;
                    }
                    final arbl a8 = arbl.a;
                    arbm arbm5;
                    if ((arbm5 = arbk5.n) == null) {
                        arbm5 = arbm.a;
                    }
                    arbl arbl3;
                    if ((arbl3 = arbl.b(arbm5.h)) == null) {
                        arbl3 = arbl.a;
                    }
                    final int ordinal2 = arbl3.ordinal();
                    Label_3546: {
                        if (ordinal2 != 1) {
                            if (ordinal2 == 2 || ordinal2 == 3) {
                                final int c7 = arbj6.c;
                                final int d13 = arbj6.d;
                                int n14;
                                if (n12 < 0 || (n14 = n12) >= c7 + d13) {
                                    n14 = c7;
                                }
                                arbj arbj7;
                                if ((arbj7 = arbk5.f) == null) {
                                    arbj7 = arbj.a;
                                }
                                list2.add(tpe.bJ(arbk5, n11, n14, Math.min(arbj7.d, d13)));
                                arbj arbj8;
                                if ((arbj8 = arbk5.f) == null) {
                                    arbj8 = arbj.a;
                                }
                                n12 = n14 + arbj8.d;
                                break Label_3546;
                            }
                            if (ordinal2 != 4) {
                                break Label_3546;
                            }
                        }
                        list2.add(tpe.bJ(arbk5, n11, arbj6.c, arbj6.d));
                    }
                    arbj arbj9;
                    if ((arbj9 = arbk5.f) == null) {
                        arbj9 = arbj.a;
                    }
                    n11 += arbj9.d;
                }
                builder7.copyOnWrite();
                final apor apor3 = (apor)builder7.instance;
                final ahbx c8 = apor3.c;
                if (!c8.c()) {
                    apor3.c = ahbh.mutableCopy(c8);
                }
                agzk.addAll((Iterable)list2, (List)apor3.c);
                if (ucd.p().h()) {
                    final aoes aoes = (aoes)ucd.p().c();
                    final ahaz builder10 = ((ahbh)aoes.a).createBuilder();
                    if ((aoes.b & 0x1) != 0x0) {
                        int bu;
                        if ((bu = aqsx.bu(aoes.c)) == 0) {
                            bu = 1;
                        }
                        builder10.copyOnWrite();
                        final aoes aoes2 = (aoes)builder10.instance;
                        aoes2.c = bu - 1;
                        aoes2.b |= 0x1;
                    }
                    builder.copyOnWrite();
                    final apos apos = (apos)builder.instance;
                    final aoes f = (aoes)builder10.build();
                    f.getClass();
                    apos.f = f;
                    apos.b |= 0x8;
                }
            }
            builder.copyOnWrite();
            final apos apos2 = (apos)builder.instance;
            final apkz d14 = (apkz)builder2.build();
            d14.getClass();
            apos2.d = d14;
            apos2.b |= 0x2;
            builder.copyOnWrite();
            final apos apos3 = (apos)builder.instance;
            final apor c9 = (apor)builder7.build();
            c9.getClass();
            apos3.c = c9;
            apos3.b |= 0x1;
            final apos apos4 = (apos)builder.build();
            hgw2.p = 7;
            apos m;
            if (arad == null && upf == null && afeq.isEmpty()) {
                m = apos4;
            }
            else {
                final ahaz builder11 = apos4.toBuilder();
                final ajmd bf = tpe.bF(arad, upf, afeq, volumes);
                builder11.copyOnWrite();
                final apos apos5 = (apos)builder11.instance;
                bf.getClass();
                apos5.e = bf;
                apos5.b |= 0x4;
                m = (apos)builder11.build();
            }
            hgw2.m = m;
            this.b.u(true);
            this.b.x(apos4);
            if (ucd.ah(ucd)) {
                this.b.s(shortsVideoMetadata.d());
            }
            else {
                this.b.e();
            }
            hgw = hgw2;
            if (!afeq.isEmpty()) {
                this.b.y(afeq, volumes.a(apoy.d));
                hgw = hgw2;
            }
        }
        final String a9 = this.b.a();
        if (a9 != null) {
            hgw.n = a9;
        }
        if (ucd.q().h()) {
            hgw.o = (String)ucd.q().c();
        }
        this.a.a(hgw.a());
    }
}
