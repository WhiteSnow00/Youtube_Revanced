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

public final class abri
{
    public final anbz a;
    public anbx b;
    public int c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private final abpj h;
    
    private abri(final String d, final boolean e, final anbz a, final String f, final String g, final abpj h, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        final int e2 = a.e;
        anbx b = null;
        if (e2 >= 0) {
            if (e2 >= a.c.size()) {
                b = b;
            }
            else {
                b = (anbx)a.c.get(a.e);
            }
        }
        this.b = b;
        this.c = a.e;
    }
    
    public static abri g(final PlayerResponseModel playerResponseModel, final Context context, final abpj abpj) {
        return h(playerResponseModel.K(), playerResponseModel.D(), playerResponseModel.R(), context.getString(2132020003), context.getString(2132017524), abpj);
    }
    
    public static abri h(final String s, final anbz anbz, final boolean b, final String s2, final String s3, final abpj abpj) {
        if (s != null && anbz != null) {
            return new abri(s, b, anbz, s2, s3, abpj, null, null);
        }
        return null;
    }
    
    private final SubtitleTrack i(final anby anby) {
        final abrg a = this.a(anby);
        a.e(false);
        return a.a();
    }
    
    public final abrg a(final anby anby) {
        final abrg o = SubtitleTrack.o();
        o.f(anby.f);
        o.k(this.d);
        o.l(anby.e);
        o.j(anby.c);
        ajsq ajsq;
        if ((anby.b & 0x10) != 0x0) {
            if ((ajsq = anby.d) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        o.b = (CharSequence)abyh.b(ajsq);
        o.d(this.e);
        return o;
    }
    
    public final SubtitleTrack b() {
        final anbx b = this.b;
        if (b != null && b.f) {
            final int e = b.e;
            if (e >= 0) {
                if (e < this.a.b.size()) {
                    return this.i((anby)this.a.b.get(b.e));
                }
            }
        }
        return null;
    }
    
    public final SubtitleTrack c(final String s) {
        if (s != null) {
            final anbx b = this.b;
            if (b != null) {
                for (final int intValue : b.d) {
                    if (intValue >= 0 && intValue < this.a.b.size() && ((anby)this.a.b.get(intValue)).f.equals(s)) {
                        return this.i((anby)this.a.b.get(intValue));
                    }
                }
            }
        }
        return null;
    }
    
    public final abrh d() {
        final anbx b = this.b;
        if (b == null) {
            return abrh.a;
        }
        final abpj h = this.h;
        final abrh a = abrh.a;
        abrh abrh;
        if (h.v() && (b.b & 0x40) != 0x0) {
            final Map f = abrh.f;
            aicp aicp;
            if ((aicp = aicp.b(b.j)) == null) {
                aicp = aicp.a;
            }
            abrh = (abrh)tmy.L(f, (Object)aicp, (Object)abrh.a);
        }
        else {
            final Map e = abrh.e;
            anbw anbw;
            if ((anbw = anbw.b(b.i)) == null) {
                anbw = anbw.a;
            }
            abrh = (abrh)tmy.L(e, (Object)anbw, (Object)abrh.a);
        }
        abrh a2 = abrh;
        if (abrh == null) {
            a2 = abrh.a;
        }
        return a2;
    }
    
    public final List e() {
        final ArrayList list = new ArrayList();
        if (this.a.b.size() != 0 && this.a.d.size() != 0 && this.a.c.size() != 0 && this.b != null) {
            if (this.a.f.size() != 0) {
                for (final anca anca : this.a.d) {
                    if (!((List)anca.f).contains(this.c)) {
                        final anbx b = this.b;
                        ajsq ajsq = null;
                        Object o = null;
                        Label_0309: {
                            if (b != null) {
                                for (final int intValue : anca.e) {
                                    if (((List)b.d).contains(intValue)) {
                                        o = this.i((anby)this.a.b.get(intValue));
                                        break Label_0309;
                                    }
                                }
                                for (final int intValue2 : this.a.f) {
                                    if (((List)b.d).contains(intValue2)) {
                                        o = this.i((anby)this.a.b.get(intValue2));
                                        break Label_0309;
                                    }
                                }
                            }
                            o = null;
                        }
                        if (o == null) {
                            continue;
                        }
                        if ((anca.b & 0x2) != 0x0 && (ajsq = anca.d) == null) {
                            ajsq = ajsq.a;
                        }
                        final Spanned b2 = abyh.b(ajsq);
                        final String c = anca.c;
                        final String string = b2.toString();
                        final abrg o2 = SubtitleTrack.o();
                        o2.f(c);
                        final AutoValue_SubtitleTrack autoValue_SubtitleTrack = (AutoValue_SubtitleTrack)o;
                        o2.k(autoValue_SubtitleTrack.d);
                        o2.l(SubtitleTrack.q(autoValue_SubtitleTrack.j, c));
                        final String k = autoValue_SubtitleTrack.k;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(k);
                        sb.append("&tlang=");
                        sb.append(c);
                        o2.j(sb.toString());
                        o2.b = string;
                        list.add(o2.a());
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
                final anbx b = this.b;
                if (b != null) {
                    for (final int intValue : b.d) {
                        if (intValue >= 0 && intValue < this.a.b.size()) {
                            list.add(this.i((anby)this.a.b.get(intValue)));
                        }
                    }
                }
                if (this.a.f.size() > 0 && !this.e) {
                    final String d = this.d;
                    final String g = this.g;
                    final abrg o = SubtitleTrack.o();
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
