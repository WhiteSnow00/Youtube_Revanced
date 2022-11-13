import java.util.List;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.graphics.Rect;
import java.util.Collection;
import java.util.ArrayList;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import android.webkit.WebView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdq implements asjm
{
    public final Object a;
    private final int b;
    
    public jdq(final WebView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final SuggestVideoStateSubscriber a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final AtomicBoolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final AtomicLong a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final AtomicReference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final jds a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final jdv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final jer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final jgg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final jih a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final jmv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jdq(final vad a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object o) {
        final int b = this.b;
        int n = 0;
        final int n2 = 1;
        switch (b) {
            default: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 19: {
                final Object a = this.a;
                final Throwable t = (Throwable)o;
                ((jmv)a).s(3);
                return;
            }
            case 18: {
                ((WebView)this.a).loadUrl((String)o);
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final aans aans = (aans)o;
                final abke c = aans.c();
                final PlayerResponseModel b2 = aans.b();
                if (c.a(new abke[] { abke.c }) && b2 != null) {
                    final String k = b2.K();
                    final SuggestVideoStateSubscriber suggestVideoStateSubscriber = (SuggestVideoStateSubscriber)a2;
                    if (!adkp.ae(suggestVideoStateSubscriber.b, k)) {
                        suggestVideoStateSubscriber.b = k;
                        suggestVideoStateSubscriber.a = suggestVideoStateSubscriber.b;
                        suggestVideoStateSubscriber.c = -1L;
                    }
                }
                else if (c.a(new abke[] { abke.a, abke.j })) {
                    final SuggestVideoStateSubscriber suggestVideoStateSubscriber2 = (SuggestVideoStateSubscriber)a2;
                    if (suggestVideoStateSubscriber2.b != null) {
                        suggestVideoStateSubscriber2.b = null;
                        suggestVideoStateSubscriber2.c = suggestVideoStateSubscriber2.d.c();
                    }
                }
                return;
            }
            case 16: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 15: {
                final Object a3 = this.a;
                o = o;
                final vad vad = (vad)a3;
                final boolean c2 = vad.c;
                final boolean c3 = ((anxo)o).c;
                if (c2 != c3) {
                    vad.c = c3;
                    n = 1;
                }
                final boolean b3 = vad.b;
                final boolean e = ((anxo)o).e;
                if (b3 != e) {
                    vad.b = e;
                    n = 1;
                }
                final String s = (String)((acya)vad.e).e().e((Object)"");
                try {
                    if (!((String)((vad)a3).d).equals(((anxo)o).d) && aqsz.d(((anxo)o).d, s)) {
                        ((vad)a3).d = ((anxo)o).d;
                        n = n2;
                    }
                }
                catch (final aqwi aqwi) {}
                if ((vad.c || vad.b) && n != 0 && !((anxo)o).d.isEmpty()) {
                    ((ziy)vad.a.a()).an();
                }
                return;
            }
            case 14: {
                ((AtomicReference<String>)this.a).set((String)o);
                return;
            }
            case 13: {
                ((AtomicLong)this.a).set((long)o);
                return;
            }
            case 12: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 11: {
                ((AtomicLong)this.a).set((long)o);
                return;
            }
            case 10: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 9: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 8: {
                final Object a4 = this.a;
                final agoe agoe = (agoe)o;
                final jih jih = (jih)a4;
                jih.aM.pF().l((wzz)new wyt(((akyu)agoe.a).d));
                if (jih.aJ.h()) {
                    final String af = jih.aF;
                    if (af == null || af.equalsIgnoreCase((String)agoe.c)) {
                        ((RecyclerView)jih.aJ.c()).setVisibility(0);
                        final ArrayList list = new ArrayList();
                        final anyc c4 = agoe.c();
                        if (c4 != null) {
                            final Iterator<Object> iterator = ((List<Object>)c4.b).iterator();
                            while (iterator.hasNext()) {
                                final MessageLite i = vxg.i((anyd)iterator.next());
                                if (i != null) {
                                    list.add(i);
                                }
                            }
                            final acyp af2 = jih.af;
                            final anyc c5 = agoe.c();
                            af2.e = new ArrayList();
                            if (c5 != null) {
                                final Iterator<Object> iterator2 = ((List<Object>)c5.b).iterator();
                                while (iterator2.hasNext()) {
                                    final MessageLite j = vxg.i((anyd)iterator2.next());
                                    if (j != null) {
                                        final List e2 = af2.e;
                                        if (e2 == null) {
                                            continue;
                                        }
                                        e2.add(j);
                                    }
                                }
                            }
                            if (!((String)agoe.c).isEmpty()) {
                                af2.g(agoe.b);
                            }
                            if (((String)agoe.c).isEmpty()) {
                                jih.af.j = c4.b.size();
                            }
                        }
                        ((acle)jih.aL.c()).p((Collection)list);
                    }
                }
                return;
            }
            case 7: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 6: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 5: {
                ((jgg)this.a).b((amlt)o);
                return;
            }
            case 4: {
                ((jer)this.a).h(((jfl)o).a());
                return;
            }
            case 3: {
                final Object a5 = this.a;
                final Rect rect = (Rect)o;
                final jdv jdv = (jdv)a5;
                if (jdv.c.equals((Object)rect)) {
                    return;
                }
                jdv.c.set(rect);
                jdv.a.r(true);
                return;
            }
            case 2: {
                final Object a6 = this.a;
                final boolean booleanValue = (boolean)o;
                final jds jds = (jds)a6;
                if (jds.h == booleanValue) {
                    return;
                }
                jds.h = booleanValue;
                ((jdo)jds.d).f = booleanValue;
                ((jdo)jds.e).f = booleanValue;
                jds.u();
                return;
            }
            case 1: {
                final Object a7 = this.a;
                final aani aani = (aani)o;
                if (aani.a() != null) {
                    final angl l = aani.a().i;
                    if (l != null && (l.c & 0x800) != 0x0) {
                        final boolean z = l.z;
                        final jds jds2 = (jds)a7;
                        if (jds2.i != z) {
                            jds2.i = z;
                            jds2.e.i = z;
                            jds2.u();
                        }
                    }
                }
                return;
            }
            case 0: {
                final Object a8 = this.a;
                final boolean booleanValue2 = (boolean)o;
                final jds jds3 = (jds)a8;
                if (jds3.g == booleanValue2) {
                    return;
                }
                jds3.g = booleanValue2;
                ((jdo)jds3.d).e = booleanValue2;
                ((jdo)jds3.e).e = booleanValue2;
                if (booleanValue2) {
                    jds3.c.d = false;
                }
                jds3.u();
            }
        }
    }
}
