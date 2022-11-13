import android.text.Spanned;
import com.google.android.libraries.youtube.player.subtitles.model.AutoValue_SubtitleTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtj
{
    public final aned a;
    public aneb b;
    public int c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private final abrj h;
    
    private abtj(final String d, final boolean e, final aned a, final String f, final String g, final abrj h, final byte[] array) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        final int e2 = a.e;
        aneb b = null;
        if (e2 >= 0) {
            if (e2 >= a.c.size()) {
                b = b;
            }
            else {
                b = (aneb)a.c.get(a.e);
            }
        }
        this.b = b;
        this.c = a.e;
    }
    
    public static abtj g(final PlayerResponseModel playerResponseModel, final Context context, final abrj abrj) {
        return h(playerResponseModel.K(), playerResponseModel.D(), playerResponseModel.R(), context.getString(2132020004), context.getString(2132017524), abrj);
    }
    
    public static abtj h(final String s, final aned aned, final boolean b, final String s2, final String s3, final abrj abrj) {
        if (s != null && aned != null) {
            return new abtj(s, b, aned, s2, s3, abrj, null);
        }
        return null;
    }
    
    private final SubtitleTrack i(final anec anec) {
        final abth a = this.a(anec);
        a.e(false);
        return a.a();
    }
    
    public final abth a(final anec anec) {
        final abth o = SubtitleTrack.o();
        o.f(anec.f);
        o.k(this.d);
        o.l(anec.e);
        o.j(anec.c);
        ajut ajut;
        if ((anec.b & 0x10) != 0x0) {
            if ((ajut = anec.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        o.b = (CharSequence)acak.b(ajut);
        o.d(this.e);
        return o;
    }
    
    public final SubtitleTrack b() {
        final aneb b = this.b;
        if (b != null && b.f) {
            final int e = b.e;
            if (e >= 0) {
                if (e < this.a.b.size()) {
                    return this.i((anec)this.a.b.get(b.e));
                }
            }
        }
        return null;
    }
    
    public final SubtitleTrack c(final String s) {
        if (s != null) {
            final aneb b = this.b;
            if (b != null) {
                for (final int intValue : b.d) {
                    if (intValue >= 0 && intValue < this.a.b.size() && ((anec)this.a.b.get(intValue)).f.equals(s)) {
                        return this.i((anec)this.a.b.get(intValue));
                    }
                }
            }
        }
        return null;
    }
    
    public final abti d() {
        final aneb b = this.b;
        if (b == null) {
            return abti.a;
        }
        final abrj h = this.h;
        final abti a = abti.a;
        abti abti;
        if (h.w() && (b.b & 0x40) != 0x0) {
            final Map f = abti.f;
            aien aien;
            if ((aien = aien.b(b.j)) == null) {
                aien = aien.a;
            }
            abti = (abti)tpe.L(f, (Object)aien, (Object)abti.a);
        }
        else {
            final Map e = abti.e;
            anea anea;
            if ((anea = anea.b(b.i)) == null) {
                anea = anea.a;
            }
            abti = (abti)tpe.L(e, (Object)anea, (Object)abti.a);
        }
        abti a2 = abti;
        if (abti == null) {
            a2 = abti.a;
        }
        return a2;
    }
    
    public final List e() {
        final ArrayList list = new ArrayList();
        if (this.a.b.size() != 0 && this.a.d.size() != 0 && this.a.c.size() != 0 && this.b != null) {
            if (this.a.f.size() != 0) {
                for (final anee anee : this.a.d) {
                    if (!((List)anee.f).contains(this.c)) {
                        final aneb b = this.b;
                        ajut ajut = null;
                        SubtitleTrack subtitleTrack = null;
                        Label_0302: {
                            if (b != null) {
                                for (final int intValue : anee.e) {
                                    if (((List)b.d).contains(intValue)) {
                                        subtitleTrack = this.i((anec)this.a.b.get(intValue));
                                        break Label_0302;
                                    }
                                }
                                for (final int intValue2 : this.a.f) {
                                    if (((List)b.d).contains(intValue2)) {
                                        subtitleTrack = this.i((anec)this.a.b.get(intValue2));
                                        break Label_0302;
                                    }
                                }
                            }
                            subtitleTrack = null;
                        }
                        if (subtitleTrack == null) {
                            continue;
                        }
                        if ((anee.b & 0x2) != 0x0 && (ajut = anee.d) == null) {
                            ajut = ajut.a;
                        }
                        final Spanned b2 = acak.b(ajut);
                        final String c = anee.c;
                        final String string = b2.toString();
                        final abth o = SubtitleTrack.o();
                        o.f(c);
                        final AutoValue_SubtitleTrack autoValue_SubtitleTrack = (AutoValue_SubtitleTrack)subtitleTrack;
                        o.k(autoValue_SubtitleTrack.d);
                        o.l(SubtitleTrack.q(autoValue_SubtitleTrack.j, c));
                        final String k = autoValue_SubtitleTrack.k;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(k);
                        sb.append("&tlang=");
                        sb.append(c);
                        o.j(sb.toString());
                        o.b = string;
                        list.add(o.a());
                    }
                }
            }
        }
        return list;
    }
    
    public final List f() {
        final ArrayList list = new ArrayList();
        if (this.a.b.size() != 0 && this.a.c.size() != 0) {
            if (this.b != null) {
                list.add(SubtitleTrack.p(this.f));
                final aneb b = this.b;
                if (b != null) {
                    for (final int intValue : b.d) {
                        if (intValue >= 0 && intValue < this.a.b.size()) {
                            list.add(this.i((anec)this.a.b.get(intValue)));
                        }
                    }
                }
                if (this.a.f.size() > 0 && !this.e) {
                    final String d = this.d;
                    final String g = this.g;
                    final abth o = SubtitleTrack.o();
                    o.f("AUTO_TRANSLATE_CAPTIONS_OPTION");
                    o.k(d);
                    o.l("");
                    o.j("");
                    o.b = g;
                    o.e(false);
                    list.add(o.a());
                }
            }
        }
        return list;
    }
}
