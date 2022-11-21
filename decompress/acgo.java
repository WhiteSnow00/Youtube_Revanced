import android.view.ViewParent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgo implements ott
{
    public final veh a;
    
    public acgo(final veh a, final acfc acfc, final vbs vbs) {
        this.a = a;
        final acfo a2 = acfc.a();
        final aqsg a3 = aqsg.a;
        dys.b = a3.c;
        dys.c = a3.d;
        dys.d = a3.e;
        final acfa acfa = (acfa)a2;
        final int g = acfa.g;
        final int a4 = dyu.a();
        final int n = 1;
        int n2 = a4;
        if (a4 <= 0) {
            n2 = 1;
        }
        int min = Math.min((int)Math.ceil(n2 * acfa.a), g);
        if (min <= 0) {
            min = n;
        }
        dys.u = new aeve(min, min, -2);
        if (acfa.b) {
            dys.v = dys.u;
        }
        dys.j = vbs.f(45383649L);
        dys.l = acfa.f;
        eaq.a = acfa.i;
        dys.o = acfa.k;
        egs.a = vbs.f(45360801L);
    }
    
    private static View c(final View view) {
        if (view.getTag(2131428821) instanceof aqjc) {
            return view;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View c = c(viewGroup.getChildAt(i));
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }
    
    public final ahci a() {
        return aklo.a;
    }
    
    public final asjy b(Object tag, final ots ots) {
        final aisc aisc = (aisc)tag;
        final View a = ots.a;
        final HashMap hashMap = new HashMap();
        final Object d = ots.d;
        if (d instanceof acep) {
            final acep acep = (acep)d;
            final Object a2 = acep.a;
            if (a2 != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a2);
            }
            final List e = acep.e;
            if (e != null) {
                hashMap.put("MacrosConverters.CustomConvertersKey", e.toArray());
            }
        }
        if (a != null) {
            hashMap.put("com.google.android.libraries.youtube.rendering.elements.sender_view", a);
        }
        asjy asjy;
        try {
            final ahct ahct = (ahct)((ahbb)((ahcz)aisc.a).createBuilder()).mergeFrom(((ahbc)aisc).toByteArray(), ExtensionRegistryLite.getGeneratedRegistry());
            final aisc aisc2 = (aisc)((ahcr)ahct).build();
            if (a != null) {
                if (((ahcu)aisc2).ry((ahci)WatchEndpointOuterClass.watchEndpoint)) {
                    final View c = c(a);
                    if (c != null) {
                        hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", c);
                        tag = c.getTag(2131428821);
                        Object o;
                        if (!(tag instanceof aqjc)) {
                            o = null;
                        }
                        else {
                            final aqjc aqjc = (aqjc)tag;
                            final ahct ahct2 = (ahct)((ahcz)aowb.a).createBuilder();
                            for (final aqje aqje : aqjc.c) {
                                final ahcr builder = ((ahcz)aowa.a).createBuilder();
                                final int c2 = aqje.c;
                                String s = "";
                                String s2;
                                if (c2 == 1) {
                                    s2 = (String)aqje.d;
                                }
                                else {
                                    s2 = "";
                                }
                                String s3;
                                if (!s2.startsWith("//")) {
                                    s3 = "";
                                }
                                else {
                                    s3 = "https:";
                                }
                                if (aqje.c == 1) {
                                    s = (String)aqje.d;
                                }
                                final String concat = s3.concat(String.valueOf(s));
                                builder.copyOnWrite();
                                final aowa aowa = (aowa)builder.instance;
                                aowa.b |= 0x1;
                                aowa.c = concat;
                                final int e2 = aqje.e;
                                builder.copyOnWrite();
                                final aowa aowa2 = (aowa)builder.instance;
                                aowa2.b |= 0x2;
                                aowa2.d = e2;
                                final int f = aqje.f;
                                builder.copyOnWrite();
                                final aowa aowa3 = (aowa)builder.instance;
                                aowa3.b |= 0x4;
                                aowa3.e = f;
                                ahct2.cK(builder);
                            }
                            o = ((ahcr)ahct2).build();
                        }
                        if (o != null) {
                            hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", o);
                        }
                    }
                }
            }
            if (a != null) {
                for (ViewParent viewParent = a.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                    final Map map = (Map)((View)viewParent).getTag(2131428823);
                    if (map != null) {
                        hashMap.putAll(map);
                        break;
                    }
                }
            }
            final ouu f2 = ots.f;
            if (f2 instanceof acet) {
                final String i = ((acet)f2).a.i();
                final ahcr builder2 = ((ahcz)aobn.a).createBuilder();
                builder2.copyOnWrite();
                final aobn aobn = (aobn)builder2.instance;
                i.getClass();
                aobn.b |= 0x1;
                aobn.c = i;
                ahct.e((ahci)aobo.b, (Object)builder2.build());
            }
            final oua j = ots.i;
            if (j != null) {
                final ovh b = j.b();
                if (b instanceof acgy) {
                    final aqji d2 = j.d();
                    if (d2 != null) {
                        final int c3 = acgy.c(d2);
                        if (c3 != -1) {
                            ahcr ahcr;
                            if (!((ahcu)((ahcr)ahct).build()).ry((ahci)amsk.b)) {
                                ahcr = ((ahcz)amsl.a).createBuilder();
                            }
                            else {
                                ahcr = ((ahcz)((ahcu)((ahcr)ahct).build()).rx((ahci)amsk.b)).toBuilder();
                            }
                            int e3;
                            if (acgy.h(d2) && acgy.g(d2)) {
                                alxw alxw;
                                if ((alxw = acgy.f(d2).e) == null) {
                                    alxw = alxw.b;
                                }
                                aiot aiot;
                                if ((aiot = alxw.h) == null) {
                                    aiot = aiot.a;
                                }
                                e3 = aiot.d;
                            }
                            else {
                                e3 = Math.abs(d2.d);
                            }
                            ahcr.copyOnWrite();
                            final amsl amsl = (amsl)ahcr.instance;
                            amsl.b |= 0x2;
                            amsl.d = c3;
                            ahcr.copyOnWrite();
                            final amsl amsl2 = (amsl)ahcr.instance;
                            amsl2.b |= 0x4;
                            amsl2.e = e3;
                            ahct.e((ahci)amsk.b, (Object)ahcr.build());
                            final acgy acgy = (acgy)b;
                            if (acgy.a.K() != null && ((vbs)acgy.a.K().a).f(45360422L)) {
                                ((ahcr)ahct).copyOnWrite();
                                final aisc aisc3 = (aisc)ahct.instance;
                                aisc3.b &= 0xFFFFFFFE;
                                aisc3.c = aisc.a.c;
                            }
                        }
                    }
                }
            }
            aamr.u(ahct, ots, a);
            aamr.t(hashMap, ots);
            asjy = asjy.j((aska)new opd(this, (Map)hashMap, ahct, 7));
        }
        catch (final ahds ahds) {
            asjy = asjy.t((Throwable)ahds);
        }
        return asjy;
    }
}
