import j$.util.Optional;
import android.util.DisplayMetrics;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.List;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.protos.youtube.api.innertube.HeatMarkerRendererOuterClass;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.HeatmapRendererOuterClass;
import java.util.Map;
import java.util.Collections;
import com.google.protos.youtube.api.innertube.DecoratedPlayerBarRendererOuterClass;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivy extends fnh implements fjk, itw, tec
{
    public final aays a;
    public final Context b;
    private final aayd c;
    private final fjl d;
    private final itx e;
    private final tdz f;
    
    public ivy(final qv qv, final tdz f, final aays a, final fjl d, final aayd c, final Context b, final itx e, final byte[] array, final byte[] array2) {
        super(qv, (byte[])null, (byte[])null);
        this.f = f;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    public final void i(final ControlsOverlayStyle controlsOverlayStyle) {
        this.a.j = ControlsOverlayStyle.a(controlsOverlayStyle);
    }
    
    public final void lV() {
        this.f.m((Object)this);
        this.e.b((itw)this);
        this.a.l(abcg.f, (aayr)this.c);
        this.a.l(abcg.g, (aayr)this.c);
        this.d.b((fjk)this);
    }
    
    public final Class[] ms(final Class clazz, final Object o, int i) {
        Class[] array2;
        if (i != -1) {
            if (i != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            final WatchNextResponseModel a = ((aalo)o).a();
            final Class[] array = null;
            if (a == null) {
                array2 = array;
            }
            else {
                final aneh j = a.i;
                array2 = array;
                if (j != null) {
                    anss anss;
                    if ((anss = j.u) == null) {
                        anss = anss.a;
                    }
                    final ajap ajap = (ajap)((agzd)anss).rr((agyr)DecoratedPlayerBarRendererOuterClass.decoratedPlayerBarRenderer);
                    anss anss2;
                    if ((anss2 = ajap.c) == null) {
                        anss2 = anss.a;
                    }
                    array2 = array;
                    if (((agzd)anss2).rs((agyr)DecoratedPlayerBarRendererOuterClass.multiMarkersPlayerBarRenderer)) {
                        anss anss3;
                        if ((anss3 = ajap.c) == null) {
                            anss3 = anss.a;
                        }
                        final Iterator<Map.Entry<Object, Object>> iterator = Collections.unmodifiableMap((Map<?, ?>)((ajas)((agzd)anss3).rr((agyr)DecoratedPlayerBarRendererOuterClass.multiMarkersPlayerBarRenderer)).b).entrySet().iterator();
                        while (true) {
                            array2 = array;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final Map.Entry<String, V> entry = iterator.next();
                            final String s = entry.getKey();
                            final ajao ajao = (ajao)entry.getValue();
                            if ((ajao.b & 0x1) == 0x0) {
                                continue;
                            }
                            anss anss4;
                            if ((anss4 = ajao.c) == null) {
                                anss4 = anss.a;
                            }
                            if (!((agzd)anss4).rs((agyr)HeatmapRendererOuterClass.heatmapRenderer)) {
                                continue;
                            }
                            anss anss5;
                            if ((anss5 = ajao.c) == null) {
                                anss5 = anss.a;
                            }
                            final ajyy ajyy = (ajyy)((agzd)anss5).rr((agyr)HeatmapRendererOuterClass.heatmapRenderer);
                            final int size = ajyy.f.size();
                            final ArrayList list = new ArrayList(size);
                            final ArrayList list2 = new ArrayList<Float>(size);
                            ajyw ajyw;
                            float an;
                            long n;
                            aioe aioe;
                            TimelineMarker timelineMarker;
                            long n2;
                            for (i = 0; i < size; ++i) {
                                ajyw = (ajyw)((agzd)ajyy.f.get(i)).rr((agyr)HeatMarkerRendererOuterClass.heatMarkerRenderer);
                                an = tmy.aN((float)ajyw.d, 0.0f, 1.0f);
                                if ((ajyw.b & 0x8) != 0x0) {
                                    n = ajyw.c;
                                    if ((aioe = ajyw.e) == null) {
                                        aioe = aioe.a;
                                    }
                                    timelineMarker = new TimelineMarker(n, n, aioe);
                                }
                                else {
                                    n2 = ajyw.c;
                                    timelineMarker = new TimelineMarker(n2, n2);
                                }
                                list.add((Object)timelineMarker);
                                list2.add(Float.valueOf(an));
                            }
                            final ArrayList list3 = new ArrayList();
                            for (final anss anss6 : ajyy.g) {
                                if (((agzd)anss6).rs((agyr)aosd.a)) {
                                    final aosc aosc = (aosc)((agzd)anss6).rr((agyr)aosd.a);
                                    ajsq ajsq;
                                    if ((ajsq = aosc.e) == null) {
                                        ajsq = ajsq.a;
                                    }
                                    String c;
                                    if (ajsq.c.size() > 0) {
                                        ajsq ajsq2;
                                        if ((ajsq2 = aosc.e) == null) {
                                            ajsq2 = ajsq.a;
                                        }
                                        c = ((ajss)ajsq2.c.get(0)).c;
                                    }
                                    else {
                                        c = "";
                                    }
                                    final aayn a2 = aayo.a();
                                    a2.b((long)aosc.d);
                                    a2.d((long)aosc.b);
                                    a2.c((long)aosc.c);
                                    akbe akbe;
                                    if ((akbe = akbe.b(aosc.f)) == null) {
                                        akbe = akbe.a;
                                    }
                                    a2.e(akbe);
                                    a2.f((CharSequence)c);
                                    list3.add(a2.a());
                                }
                            }
                            if (list.isEmpty()) {
                                continue;
                            }
                            final DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
                            final aaye b = aayf.a(displayMetrics).b();
                            b.c(tmy.aZ(displayMetrics, ajyy.c));
                            b.d(tmy.aZ(displayMetrics, ajyy.d));
                            b.e((long)ajyy.e);
                            if ((ajyy.b & 0x8) != 0x0) {
                                i = tmy.aZ(displayMetrics, ajyy.h);
                            }
                            else {
                                i = 0;
                            }
                            b.b(i);
                            this.a.p(s, abcg.h, new aayg(list, list3, b.a(), list2));
                        }
                    }
                }
            }
        }
        else {
            array2 = new Class[] { aalo.class };
        }
        return array2;
    }
    
    public final void qB() {
        this.f.g((Object)this);
        this.e.a((itw)this);
        this.a.i(abcg.f, (aayr)this.c);
        this.a.i(abcg.g, (aayr)this.c);
        this.d.a((fjk)this);
    }
    
    public final void qp(final elw elw) {
        final aays a = this.a;
        a.d.clear();
        a.e.clear();
        final afcw k = afcw.k(a.b);
        a.b.clear();
        for (final abcg abcg : a.a.keySet()) {
            a.f(null, abcg, 1, (TimelineMarker)k.get((Object)abcg));
        }
        a.c.clear();
        a.f.clear();
        a.h = Optional.empty();
        a.i = Optional.empty();
        a.g.d(afcr.q());
        a.l = false;
    }
}
