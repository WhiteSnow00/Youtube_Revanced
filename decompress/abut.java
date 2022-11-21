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

public final class abut
{
    public final angk a;
    public angi b;
    public int c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private final absv h;
    
    private abut(final String d, final boolean e, final angk a, final String f, final String g, final absv h, final byte[] array) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        final int e2 = a.e;
        angi b = null;
        if (e2 >= 0) {
            if (e2 >= a.c.size()) {
                b = b;
            }
            else {
                b = (angi)a.c.get(a.e);
            }
        }
        this.b = b;
        this.c = a.e;
    }
    
    public static abut g(final PlayerResponseModel playerResponseModel, final Context context, final absv absv) {
        return h(playerResponseModel.K(), playerResponseModel.D(), playerResponseModel.R(), context.getString(2132020007), context.getString(2132017524), absv);
    }
    
    public static abut h(final String s, final angk angk, final boolean b, final String s2, final String s3, final absv absv) {
        if (s != null && angk != null) {
            return new abut(s, b, angk, s2, s3, absv, null);
        }
        return null;
    }
    
    private final SubtitleTrack i(final angj angj) {
        final abur a = this.a(angj);
        a.e(false);
        return a.a();
    }
    
    public final abur a(final angj angj) {
        final abur o = SubtitleTrack.o();
        o.f(angj.f);
        o.k(this.d);
        o.l(angj.e);
        o.j(angj.c);
        ajws ajws;
        if ((angj.b & 0x10) != 0x0) {
            if ((ajws = angj.d) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        o.b = (CharSequence)acbu.b(ajws);
        o.d(this.e);
        return o;
    }
    
    public final SubtitleTrack b() {
        final angi b = this.b;
        if (b != null && b.f) {
            final int e = b.e;
            if (e >= 0) {
                if (e < this.a.b.size()) {
                    return this.i((angj)this.a.b.get(b.e));
                }
            }
        }
        return null;
    }
    
    public final SubtitleTrack c(final String s) {
        if (s != null) {
            final angi b = this.b;
            if (b != null) {
                for (final int intValue : b.d) {
                    if (intValue >= 0 && intValue < this.a.b.size() && ((angj)this.a.b.get(intValue)).f.equals(s)) {
                        return this.i((angj)this.a.b.get(intValue));
                    }
                }
            }
        }
        return null;
    }
    
    public final abus d() {
        final angi b = this.b;
        if (b == null) {
            return abus.a;
        }
        final absv h = this.h;
        final abus a = abus.a;
        abus abus;
        if (h.w() && (b.b & 0x40) != 0x0) {
            final Map f = abus.f;
            aigg aigg;
            if ((aigg = aigg.b(b.j)) == null) {
                aigg = aigg.a;
            }
            abus = (abus)tqf.L(f, (Object)aigg, (Object)abus.a);
        }
        else {
            final Map e = abus.e;
            angh angh;
            if ((angh = angh.b(b.i)) == null) {
                angh = angh.a;
            }
            abus = (abus)tqf.L(e, (Object)angh, (Object)abus.a);
        }
        abus a2 = abus;
        if (abus == null) {
            a2 = abus.a;
        }
        return a2;
    }
    
    public final List e() {
        final ArrayList list = new ArrayList();
        if (this.a.b.size() != 0 && this.a.d.size() != 0 && this.a.c.size() != 0 && this.b != null) {
            if (this.a.f.size() != 0) {
                for (final angl angl : this.a.d) {
                    if (!((List)angl.f).contains(this.c)) {
                        final angi b = this.b;
                        ajws ajws = null;
                        Object o = null;
                        Label_0302: {
                            if (b != null) {
                                for (final int intValue : angl.e) {
                                    if (((List)b.d).contains(intValue)) {
                                        o = this.i((angj)this.a.b.get(intValue));
                                        break Label_0302;
                                    }
                                }
                                for (final int intValue2 : this.a.f) {
                                    if (((List)b.d).contains(intValue2)) {
                                        o = this.i((angj)this.a.b.get(intValue2));
                                        break Label_0302;
                                    }
                                }
                            }
                            o = null;
                        }
                        if (o == null) {
                            continue;
                        }
                        if ((angl.b & 0x2) != 0x0 && (ajws = angl.d) == null) {
                            ajws = ajws.a;
                        }
                        final Spanned b2 = acbu.b(ajws);
                        final String c = angl.c;
                        final String string = b2.toString();
                        final abur o2 = SubtitleTrack.o();
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
                final angi b = this.b;
                if (b != null) {
                    for (final int intValue : b.d) {
                        if (intValue >= 0 && intValue < this.a.b.size()) {
                            list.add(this.i((angj)this.a.b.get(intValue)));
                        }
                    }
                }
                if (this.a.f.size() > 0 && !this.e) {
                    final String d = this.d;
                    final String g = this.g;
                    final abur o = SubtitleTrack.o();
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
