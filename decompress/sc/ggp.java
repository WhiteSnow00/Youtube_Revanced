import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import j$.util.Optional;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggp implements aezf
{
    public final Object a;
    private final int b;
    
    public ggp(final GalFlowActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final EditVideoActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final UploadActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final ggq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final gkv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final gqs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final gyu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final hao a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final hiu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final hqz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final Optional a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ggp(final Map a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object apply(final Object o) {
        final int b = this.b;
        boolean e = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final adnw adnw = (adnw)o;
                final ahaz builder = ((ahbh)adnt.a).createBuilder();
                final UploadActivity uploadActivity = (UploadActivity)a;
                if (!TextUtils.isEmpty((CharSequence)uploadActivity.aq)) {
                    final String aq = uploadActivity.aq;
                    builder.copyOnWrite();
                    final adnt adnt = (adnt)builder.instance;
                    aq.getClass();
                    adnt.b |= 0x2;
                    adnt.c = aq;
                }
                final ahaz builder2 = ((ahbh)adnw).toBuilder();
                final String b2 = uploadActivity.k.c().b();
                final adnt adnt2 = (adnt)builder.build();
                adnt2.getClass();
                builder2.copyOnWrite();
                final adnw adnw2 = (adnw)builder2.instance;
                final ahcr c = adnw2.c;
                if (!c.b) {
                    adnw2.c = c.a();
                }
                ((Map<String, adnt>)adnw2.c).put(b2, adnt2);
                return builder2.build();
            }
            case 19: {
                final Object a2 = this.a;
                final ahaz builder3 = ((ahbh)o).toBuilder();
                final UploadActivity uploadActivity2 = (UploadActivity)a2;
                final String ar = uploadActivity2.ar;
                ar.getClass();
                builder3.copyOnWrite();
                final adnw adnw3 = (adnw)builder3.instance;
                adnw3.b |= 0x1;
                adnw3.d = ar;
                final aldc h = uploadActivity2.H;
                ahab e2;
                if (h == null) {
                    e2 = ahab.b;
                }
                else {
                    e2 = ((agzk)h).toByteString();
                }
                builder3.copyOnWrite();
                final adnw adnw4 = (adnw)builder3.instance;
                e2.getClass();
                adnw4.b |= 0x2;
                adnw4.e = e2;
                if (uploadActivity2.al.h()) {
                    final ahab byteString = ((agzk)uploadActivity2.al.c()).toByteString();
                    builder3.copyOnWrite();
                    final adnw adnw5 = (adnw)builder3.instance;
                    adnw5.b |= 0x4;
                    adnw5.f = byteString;
                }
                return builder3.build();
            }
            case 18: {
                final Object a3 = this.a;
                final ahaz builder4 = ((ahbh)o).toBuilder();
                final EditVideoActivity editVideoActivity = (EditVideoActivity)a3;
                final String a4 = editVideoActivity.A;
                a4.getClass();
                builder4.copyOnWrite();
                final adnr adnr = (adnr)builder4.instance;
                adnr.b |= 0x1;
                adnr.c = a4;
                final aktm y = editVideoActivity.y;
                ahab d;
                if (y == null) {
                    d = ahab.b;
                }
                else {
                    d = ((agzk)y).toByteString();
                }
                builder4.copyOnWrite();
                final adnr adnr2 = (adnr)builder4.instance;
                d.getClass();
                adnr2.b |= 0x2;
                adnr2.d = d;
                return builder4.build();
            }
            case 17: {
                final Object a5 = this.a;
                final ahaz builder5 = ((ahbh)o).toBuilder();
                final hqz hqz = (hqz)a5;
                final int f = hqz.f;
                builder5.copyOnWrite();
                ((hsy)builder5.instance).c = f;
                final String b3 = hqz.b;
                builder5.copyOnWrite();
                final hsy hsy = (hsy)builder5.instance;
                b3.getClass();
                hsy.e = b3;
                if (hqz.d) {
                    builder5.copyOnWrite();
                    ((hsy)builder5.instance).b = true;
                }
                return builder5.build();
            }
            case 16: {
                final Object a6 = this.a;
                final ahaz builder6 = ((ahbh)o).toBuilder();
                final hqz hqz2 = (hqz)a6;
                final int e3 = hqz2.e;
                builder6.copyOnWrite();
                ((hsy)builder6.instance).d = e3;
                final String b4 = hqz2.b;
                builder6.copyOnWrite();
                final hsy hsy2 = (hsy)builder6.instance;
                b4.getClass();
                hsy2.e = b4;
                return builder6.build();
            }
            case 15: {
                final Object a7 = this.a;
                final ahaz builder7 = ((ahbh)o).toBuilder();
                final boolean b5 = ((hiu)a7).B;
                builder7.copyOnWrite();
                ((uie)builder7.instance).d = b5;
                return builder7.build();
            }
            case 14: {
                final Object a8 = this.a;
                final uie uie = (uie)o;
                final hiu hiu = (hiu)a8;
                uie uie2 = uie;
                if (hiu.b.c() != null) {
                    hiu.b.c().b();
                    final ahaz builder8 = ((ahbh)uie).toBuilder();
                    final String b6 = hiu.b.c().b();
                    final boolean h2 = hiu.H;
                    builder8.copyOnWrite();
                    final uie uie3 = (uie)builder8.instance;
                    final ahcr q = uie3.q;
                    if (!q.b) {
                        uie3.q = q.a();
                    }
                    ((Map<String, Boolean>)uie3.q).put(b6, Boolean.valueOf(h2));
                    uie2 = (uie)builder8.build();
                }
                return uie2;
            }
            case 13: {
                final Object a9 = this.a;
                final ahaz builder9 = ((ahbh)o).toBuilder();
                final hao hao = (hao)a9;
                final float b7 = hao.b;
                builder9.copyOnWrite();
                ((uie)builder9.instance).p = b7;
                final float c2 = hao.c;
                builder9.copyOnWrite();
                ((uie)builder9.instance).s = c2;
                return builder9.build();
            }
            case 12: {
                return ((bej)o).o() + ((gyu)this.a).g;
            }
            case 11: {
                final Object a10 = this.a;
                final uie uie4 = (uie)o;
                final xab a11 = gvy.a;
                final ahaz builder10 = ((ahbh)uie4).toBuilder();
                builder10.copyOnWrite();
                final uie uie5 = (uie)builder10.instance;
                final ahcr o2 = uie5.o;
                if (!o2.b) {
                    uie5.o = o2.a();
                }
                ((Map<Object, Object>)uie5.o).putAll((Map<?, ?>)a10);
                return builder10.build();
            }
            case 10: {
                final Object a12 = this.a;
                final ahaz builder11 = ((ahbh)o).toBuilder();
                final gqs gqs = (gqs)a12;
                final String b8 = gqs.b;
                builder11.copyOnWrite();
                final ahfl ahfl = (ahfl)builder11.instance;
                b8.getClass();
                ahfl.b |= 0x1;
                ahfl.c = b8;
                final String f2 = gqs.f;
                builder11.copyOnWrite();
                final ahfl ahfl2 = (ahfl)builder11.instance;
                f2.getClass();
                ahfl2.b |= 0x2;
                ahfl2.d = f2;
                final aiqj c3 = gqs.c;
                builder11.copyOnWrite();
                final ahfl ahfl3 = (ahfl)builder11.instance;
                c3.getClass();
                ahfl3.e = c3;
                ahfl3.b |= 0x4;
                final aiqj d2 = gqs.d;
                builder11.copyOnWrite();
                final ahfl ahfl4 = (ahfl)builder11.instance;
                d2.getClass();
                ahfl4.f = d2;
                ahfl4.b |= 0x8;
                final aiqj e4 = gqs.e;
                builder11.copyOnWrite();
                final ahfl ahfl5 = (ahfl)builder11.instance;
                e4.getClass();
                ahfl5.g = e4;
                ahfl5.b |= 0x10;
                return builder11.build();
            }
            case 9: {
                final Object a13 = this.a;
                final ahfl ahfl6 = (ahfl)o;
                Boolean b9;
                if (ahfl6.c.isEmpty()) {
                    b9 = false;
                }
                else {
                    final String c4 = ahfl6.c;
                    final gqs gqs2 = (gqs)a13;
                    gqs2.b = c4;
                    gqs2.f = ahfl6.d;
                    aiqj c5;
                    if ((c5 = ahfl6.e) == null) {
                        c5 = aiqj.a;
                    }
                    gqs2.c = c5;
                    aiqj d3;
                    if ((d3 = ahfl6.f) == null) {
                        d3 = aiqj.a;
                    }
                    gqs2.d = d3;
                    aiqj e5;
                    if ((e5 = ahfl6.g) == null) {
                        e5 = aiqj.a;
                    }
                    gqs2.e = e5;
                    b9 = true;
                }
                return b9;
            }
            case 8: {
                ((GalFlowActivity)this.a).a((Intent)o);
                return gqg.b;
            }
            case 7: {
                ((GalFlowActivity)this.a).a((Intent)o);
                return gqg.b;
            }
            case 6: {
                final Object a14 = this.a;
                final Boolean b10 = (Boolean)o;
                final int e6 = gnp.e;
                return gno.a((Optional)a14, b10);
            }
            case 5: {
                final Object a15 = this.a;
                final ahaz builder12 = ((gkw)o).toBuilder();
                final gkv b11 = gkv.b;
                builder12.copyOnWrite();
                final gkw gkw = (gkw)builder12.instance;
                gkw.b |= 0x4;
                if (a15 == b11) {
                    e = true;
                }
                gkw.e = e;
                return builder12.build();
            }
            case 4: {
                final Object a16 = this.a;
                final ahaz builder13 = ((gkw)o).toBuilder();
                builder13.copyOnWrite();
                final gkw gkw2 = (gkw)builder13.instance;
                a16.getClass();
                gkw2.b |= 0x8;
                gkw2.f = (String)a16;
                return builder13.build();
            }
            case 3: {
                final Object a17 = this.a;
                final ahaz builder14 = ((gkw)o).toBuilder();
                builder14.copyOnWrite();
                final gkw gkw3 = (gkw)builder14.instance;
                a17.getClass();
                gkw3.b |= 0x8;
                gkw3.f = (String)a17;
                return builder14.build();
            }
            case 2: {
                final Object a18 = this.a;
                final ahaz builder15 = ((gkw)o).toBuilder();
                builder15.copyOnWrite();
                final gkw gkw4 = (gkw)builder15.instance;
                a18.getClass();
                gkw4.b |= 0x8;
                gkw4.f = (String)a18;
                return builder15.build();
            }
            case 1: {
                final Object a19 = this.a;
                final jsa jsa = (jsa)o;
                final ahaz builder16 = ((ahbh)jsa).toBuilder();
                jsb jsb;
                if ((jsb = jsa.c) == null) {
                    jsb = jsb.a;
                }
                final ahaz builder17 = ((ahbh)jsb).toBuilder();
                builder17.copyOnWrite();
                final jsb jsb2 = (jsb)builder17.instance;
                a19.getClass();
                jsb2.b |= 0x1;
                jsb2.c = (String)a19;
                builder16.copyOnWrite();
                final jsa jsa2 = (jsa)builder16.instance;
                final jsb c6 = (jsb)builder17.build();
                c6.getClass();
                jsa2.c = c6;
                jsa2.b |= 0x1;
                return builder16.build();
            }
            case 0: {
                final Object a20 = this.a;
                final tqt tqt = (tqt)o;
                tqt.f = ((ggq)a20).bb();
                return tqt;
            }
        }
    }
}
