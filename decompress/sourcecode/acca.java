import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class acca
{
    private static final afcr a;
    private static final afcr b;
    private static final afcr c;
    private static final afcr d;
    private static final afcr e;
    public static final afcr p;
    public static final Map q;
    
    static {
        final Integer value = 1;
        final zhb c2 = zhb.C((Object)value, (acch)acbq.b, (accf)acbr.e, (accg)acbs.h);
        final Boolean value2 = false;
        final zhb c3 = zhb.C((Object)value2, (acch)acbq.m, (accf)acbr.o, (accg)acbs.r);
        final zhb c4 = zhb.C((Object)value2, (acch)acbt.a, (accf)acbu.c, (accg)acbv.c);
        final Integer value3 = 4;
        final zhb c5 = zhb.C((Object)value3, (acch)acbq.a, (accf)acbr.b, (accg)acbs.b);
        final zhb c6 = zhb.C((Object)value2, (acch)acbq.c, (accf)acbr.a, (accg)acbs.a);
        final zhb c7 = zhb.C((Object)value2, (acch)acbq.d, (accf)acbr.c, (accg)acbs.c);
        final zhb c8 = zhb.C((Object)value2, (acch)acbq.e, (accf)acbr.d, (accg)acbs.d);
        final zhb c9 = zhb.C((Object)value2, (acch)acbq.f, (accf)acbr.f, (accg)acbs.e);
        final zhb c10 = zhb.C((Object)0.45f, (acch)acbq.g, (accf)acbr.g, (accg)acbs.f);
        final zhb c11 = zhb.C((Object)value2, (acch)acbq.h, (accf)acbr.h, (accg)acbs.g);
        final zhb c12 = zhb.C((Object)value2, (acch)acbq.i, (accf)acbr.i, (accg)acbs.i);
        final Integer value4 = 0;
        final zhb c13 = zhb.C((Object)value4, (acch)acbq.j, (accf)acbr.j, (accg)acbs.j);
        final zhb c14 = zhb.C((Object)value2, (acch)acbq.k, (accf)acbr.k, (accg)acbs.k);
        final zhb c15 = zhb.C((Object)value2, (acch)acbq.l, (accf)acbr.l, (accg)acbs.l);
        final Float value5 = 0.0f;
        a = afcr.A((Object)c2, (Object)c3, (Object)c4, (Object)c5, (Object)c6, (Object)c7, (Object)c8, (Object)c9, (Object)c10, (Object)c11, (Object)c12, (Object)c13, (Object[])new zhb[] { c14, c15, new zhb((Object)value5, (acch)acbq.n, (accf)acbr.m, (accg)acbs.m, (aext)aacc.h), zhb.C((Object)"{\"NativeLibLoading\":0.1,\"PbToFb\":0.0,\"FirstRootPreparation\":0.002,\"NativeLibChecking\":0.025,\"FirstRootMeasurement\":0.002,\"TemplateResolution\":3.0E-4,\"FirstRootMaterialization\":0.002,\"TemplateFetching\":3.0E-4,\"ComponentMaterialization\":3.0E-4}", (acch)acbq.o, (accf)acbr.n, (accg)acbs.n), zhb.C((Object)value, (acch)acbq.p, (accf)acbr.p, (accg)acbs.o), zhb.C((Object)value2, (acch)acbq.q, (accf)acbr.q, (accg)acbs.p), zhb.C((Object)value5, (acch)acbq.r, (accf)acbr.r, (accg)acbs.q), zhb.C((Object)value2, (acch)acbq.s, (accf)acbr.s, (accg)acbs.s), zhb.C((Object)value2, (acch)acbq.t, (accf)acbr.t, (accg)acbs.t), zhb.C((Object)value2, (acch)acbq.u, (accf)acbr.u, (accg)acbs.u), zhb.C((Object)value2, (acch)acbt.b, (accf)acbu.b, (accg)acbv.b), zhb.C((Object)value2, (acch)acbt.c, (accf)acbu.a, (accg)acbv.a) });
        b = afcr.v((Object)acga.v("litho_layout_thread_pool_multiplier", 1.0f, (accb)acbp.j), (Object)acga.v("litho_set_layout_thread_pool_on_rb", value2, (accb)acbp.k), (Object)acga.v("eko_processor_max_lru_cache_size", 30, (accb)acbp.l), (Object)new acga("thumbnail_resolution_type", value4, (accb)acbp.m, afcw.p((Object)"default", (Object)value4, (Object)"high_resolution_all", (Object)value, (Object)"high_resolution_center_crop", (Object)2, (Object)"high_resolution_on_center_crop_ratio", (Object)3)), (Object)acga.v("setup_default_properties", value2, (accb)acbp.o));
        final acga v = acga.v("litho_init_range", value3, (accb)acbp.p);
        final Float value6 = 0.5f;
        final acga v2 = acga.v("litho_range_ratio", value6, (accb)acbp.q);
        final Boolean value7 = true;
        p = afcr.A((Object)v, (Object)v2, (Object)acga.v("use_incremental_mount_for_rb", value7, (accb)acbp.e), (Object)acga.v("use_legacy_visible", value2, (accb)acbp.r), (Object)acga.v("use_size_spec_youtube_element", value2, (accb)acbp.b), (Object)acga.v("use_async_presenter_preparation", value2, (accb)acbp.a), (Object)acga.v("async_prepare_init_range", value3, (accb)acbp.c), (Object)acga.v("async_prepare_range_ratio", value6, (accb)acbp.d), (Object)acga.v("use_incremental_mount_for_async_prepare", value7, (accb)acbp.f), (Object)acga.v("use_flatbuffer_runtime", value2, (accb)acbp.g), (Object)acga.v("rebind_after_detach", value2, (accb)acbp.h), (Object)acga.v("horizontal_collection_touch_interceptor", value2, (accb)acbp.i), (Object[])new acga[] { acga.v("use_swipe_to_camera_local_config", value7, (accb)acbp.n) });
        final afcr afcr = c = afcr.s((Object)acga.v("use_incremental_mount_for_rb", value2, (accb)acbp.e), (Object)acga.v("use_incremental_mount_for_async_prepare", value2, (accb)acbp.f));
        final afcr afcr2 = d = afcr.s((Object)acga.v("use_incremental_mount_for_rb", value2, (accb)acbp.e), (Object)acga.v("use_incremental_mount_for_async_prepare", value2, (accb)acbp.f));
        final afcr afcr3 = e = afcr.r((Object)acga.v("horizontal_collection_touch_interceptor", value7, (accb)acbp.i));
        final EnumMap q2 = new EnumMap((Class<K>)acbx.class);
        (q = q2).put(acbx.f, afcr);
        q2.put((Object)acbx.e, afcr2);
        q2.put((Object)acbx.b, afcr3);
    }
    
    public static acca F(uyf h) {
        final ains b = ((uyf)h).b();
        if (b == null) {
            return G().a();
        }
        final acbw g = G();
        answ answ;
        if ((answ = b.j) == null) {
            answ = answ.a;
        }
        h = (accc)answ.h;
        final boolean empty = TextUtils.isEmpty((CharSequence)h);
        final int n = 0;
        if (!empty) {
            try {
                final JSONObject jsonObject = new JSONObject((String)h);
                final afcr b2 = acca.b;
                for (int c = ((afgh)b2).c, i = 0; i < c; ++i) {
                    final acga acga = ((List<acga>)b2).get(i);
                    try {
                        acga.g(jsonObject, g, "");
                        continue;
                    }
                    catch (final accc h) {}
                    catch (final JSONException ex) {}
                    zjp.c(zjo.b, zjn.w, "Error parsing ElementsLaunchConfig".concat((String)acga.c), (Throwable)h);
                }
                final EnumMap enumMap = new EnumMap(acbx.class);
                for (final acbx c2 : acbx.values()) {
                    final acby a = acbz.a(c2);
                    H(a, jsonObject, null);
                    H(a, jsonObject, c2);
                    answ answ2;
                    if ((answ2 = b.j) == null) {
                        answ2 = answ.a;
                    }
                    if (answ2.i) {
                        a.b(true);
                    }
                    enumMap.put(a.c = c2, a.a());
                }
                g.b(enumMap);
            }
            catch (final JSONException ex2) {
                zjp.c(zjo.b, zjn.w, "Error parsing ElementsLaunchConfig", (Throwable)ex2);
            }
        }
        answ answ3;
        if ((answ3 = b.j) == null) {
            answ3 = answ.a;
        }
        final afcr a2 = acca.a;
        final int c3 = ((afgh)a2).c;
        int k = n;
        while (k < c3) {
            final zhb zhb = ((List<zhb>)a2).get(k);
            try {
                if (((accg)zhb.a).a(answ3)) {
                    final Object a3 = ((accf)zhb.d).a(answ3);
                    final Object c4 = zhb.c;
                    if (c4 != null && !((aext)c4).a(a3)) {
                        throw new acci("Value outside of constraint: ".concat(String.valueOf(String.valueOf(a3))));
                    }
                    ((acch)zhb.e).a(g, a3);
                }
                ++k;
                continue;
            }
            catch (final acci acci) {
                zjp.c(zjo.b, zjn.w, "Error parsing Mendel ElementsLaunchConfig", (Throwable)acci);
            }
            break;
        }
        return g.a();
    }
    
    public static acbw G() {
        final acbw acbw = new acbw();
        final afcr b = acca.b;
        final int c = ((afgh)b).c;
        final int n = 0;
        for (int i = 0; i < c; ++i) {
            ((List<acga>)b).get(i).f(acbw);
        }
        final afcr a = acca.a;
        for (int c2 = ((afgh)a).c, j = 0; j < c2; ++j) {
            final zhb zhb = ((List<zhb>)a).get(j);
            ((acch)zhb.e).a(acbw, zhb.b);
        }
        final EnumMap enumMap = new EnumMap(acbx.class);
        final acbx[] values = acbx.values();
        for (int length = values.length, k = n; k < length; ++k) {
            final acbx c3 = values[k];
            final acby a2 = acbz.a(c3);
            enumMap.put(a2.c = c3, a2.a());
        }
        acbw.b(enumMap);
        return acbw;
    }
    
    public static void H(final acby acby, final JSONObject jsonObject, acbx k) {
        if (k != null) {
            k = (acbx)k.k;
        }
        else {
            k = (acbx)"";
        }
        final afcr p2 = acca.p;
        for (int c = ((afgh)p2).c, i = 0; i < c; ++i) {
            final acga acga = ((List<acga>)p2).get(i);
            try {
                acga.g(jsonObject, acby, (String)k);
                continue;
            }
            catch (final accc accc) {}
            catch (final JSONException ex) {}
            final accc accc;
            zjp.c(zjo.b, zjn.w, "Error parsing ElementsLaunchConfig.SurfaceConfig.".concat((String)acga.c), (Throwable)accc);
        }
    }
    
    public abstract boolean A();
    
    public abstract boolean B();
    
    public abstract boolean C();
    
    public abstract boolean D();
    
    public final acbz E(final acbx acbx) {
        return (acbz)this.k().get((Object)acbx);
    }
    
    public abstract float a();
    
    public abstract float b();
    
    public abstract float c();
    
    public abstract float d();
    
    public abstract int e();
    
    public abstract int f();
    
    public abstract int g();
    
    public abstract int h();
    
    public abstract int i();
    
    public abstract int j();
    
    public abstract afcw k();
    
    public abstract String l();
    
    public abstract boolean m();
    
    public abstract boolean n();
    
    public abstract boolean o();
    
    public abstract boolean p();
    
    public abstract boolean q();
    
    public abstract boolean r();
    
    public abstract boolean s();
    
    public abstract boolean t();
    
    public abstract boolean u();
    
    public abstract boolean v();
    
    public abstract boolean w();
    
    public abstract boolean x();
    
    public abstract boolean y();
    
    public abstract boolean z();
}
