import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.Iterator;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import android.view.View$OnAttachStateChangeListener;
import android.graphics.drawable.Drawable;
import java.util.Map;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.widget.TextView;
import android.view.ViewStub;
import android.view.View;
import java.util.concurrent.Callable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.ArrayList;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcr
{
    public static abcr f;
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public abcr(final abcp c, final vax d) {
        this.a = false;
        this.c = c;
        this.d = d;
        this.b = new abcq(this, 0);
        this.e = new wod(this, 11);
    }
    
    public abcr(final Activity activity, final blt blt, final lbn b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        final atid ae = atid.aE((Object)b.d(1));
        this.c = new lfc(ae, b);
        final asgt ad = asgt.e((aujo)ae, (aujo)((asgt)blt.e).B((asjd)lep.c).L((asjc)leo.n), (asit)new gcn(activity, 15)).x((asix)new ldk(this, 12, (byte[])null, (byte[])null)).y((asir)new jbd(this, 20, (byte[])null, (byte[])null)).t((asir)new jbd(this, 20, (byte[])null, (byte[])null)).ax().aD();
        this.e = ad;
        final leo o = leo.o;
        final asgt asgt = ad;
        this.d = ad.L((asjc)o).p().ax().aD();
    }
    
    public abcr(final dyt e) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = new HashMap();
        this.a = false;
        this.e = e;
    }
    
    public abcr(final Object b, final pwt c, final ImageView imageView, final Executor d) {
        imageView.getClass();
        this.e = new WeakReference(imageView);
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public abcr(final vbq e, final zki c, final mrm mrm, final uyi uyi, final aeby d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = new HashMap();
        this.a = false;
        this.e = e;
        this.c = c;
        this.d = d;
        if (uyi != null) {
            mrm.A((Callable)new hlc(this, uyi, 4, (byte[])null, (byte[])null));
        }
    }
    
    public abcr(final vzv b, View view) {
        this.b = b;
        final ViewStub viewStub = (ViewStub)view.findViewById(2131428860);
        viewStub.setLayoutResource(b.a(5));
        viewStub.inflate();
        final View viewById = view.findViewById(2131428859);
        this.d = viewById;
        view = viewById;
        this.e = viewById.findViewById(2131429843);
        view = viewById;
        this.c = viewById.findViewById(2131431799);
    }
    
    private static final String l(final aqhj aqhj) {
        aqhh aqhh;
        if ((aqhh = aqhj.c) == null) {
            aqhh = aqhh.a;
        }
        aqga aqga;
        if ((aqga = aqhh.b) == null) {
            aqga = aqga.a;
        }
        return aqga.b;
    }
    
    public final void a(final boolean b) {
        final Object d = this.d;
        final boolean a = this.a;
        int visibility = 8;
        if (a) {
            visibility = visibility;
            if (b) {
                visibility = 0;
            }
        }
        ((View)d).setVisibility(visibility);
    }
    
    public final Bitmap b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        final afcr c = ((pwt)this.c).c;
        Bitmap bitmap2 = bitmap;
        if (c != null) {
            bitmap2 = bitmap;
            if (!((List)c).isEmpty()) {
                final int c2 = ((afgh)c).c;
                int n = 0;
                while (true) {
                    bitmap2 = bitmap;
                    if (n >= c2) {
                        break;
                    }
                    final pws pws = ((List<pws>)c).get(n);
                    final pws a = pws.a;
                    if (pws.ordinal() == 0) {
                        final Map a2 = pts.a;
                        final int width = bitmap.getWidth();
                        final int height = bitmap.getHeight();
                        final int min = Math.min(width, height);
                        final Bitmap bitmap3 = Bitmap.createBitmap(min, min, Bitmap$Config.ARGB_8888);
                        final Canvas canvas = new Canvas(bitmap3);
                        final Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        final float n2 = (float)(min / 2);
                        canvas.drawCircle(n2, n2, n2, paint);
                        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, (float)((min - width) / 2), (float)((min - height) / 2), paint);
                        bitmap = bitmap3;
                    }
                    ++n;
                }
            }
        }
        return bitmap2;
    }
    
    public final void c() {
        qcj.s();
        final ImageView imageView = (ImageView)((WeakReference)this.e).get();
        if (!this.a) {
            if (imageView != null) {
                pts.b(imageView, (abcr)null);
            }
        }
    }
    
    public final void d(final Runnable runnable) {
        if (qcj.w()) {
            ((Executor)this.d).execute(runnable);
            return;
        }
        runnable.run();
    }
    
    public final void e(final Drawable drawable, final boolean b) {
        final ImageView imageView = (ImageView)((WeakReference)this.e).get();
        if (!this.a) {
            if (imageView != null) {
                final ptr ptr = new ptr(this, drawable, b, (byte[])null);
                imageView.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)ptr);
                if (ana.am((View)imageView)) {
                    imageView.post((Runnable)new ojn((View$OnAttachStateChangeListener)ptr, imageView, 11));
                }
            }
        }
    }
    
    public final void f(final String s, Optional optional) {
        if (this.a && !s.isEmpty()) {
            if (optional.isPresent() && (((anrb)optional.get()).b & Integer.MIN_VALUE) != 0x0) {
                final ajkj p2 = iba.p((anrb)optional.get());
                agnj.A((Object)p2);
                final byte[] array = (byte[])agnj.A((Object)((aeby)this.d).ae(p2).c);
                try {
                    final aqdk aqdk = (aqdk)agzi.parseFrom((agzi)aqdk.a, array, ExtensionRegistryLite.getGeneratedRegistry());
                    aqez aqez;
                    if ((aqez = aqdk.c) == null) {
                        aqez = aqez.a;
                    }
                    aqcu aqcu;
                    if ((aqcu = ((aqcp)aqez.rr((agyr)aqcp.b)).e) == null) {
                        aqcu = aqcu.a;
                    }
                    if (((agzd)aqcu).rs((agyr)aqhj.b)) {
                        aqez aqez2;
                        if ((aqez2 = aqdk.c) == null) {
                            aqez2 = aqez.a;
                        }
                        aqcu aqcu2;
                        if ((aqcu2 = ((aqcp)aqez2.rr((agyr)aqcp.b)).e) == null) {
                            aqcu2 = aqcu.a;
                        }
                        optional = Optional.of((Object)((agzd)aqcu2).rr((agyr)aqhj.b));
                    }
                    else {
                        optional = Optional.empty();
                    }
                }
                catch (final ahab ahab) {
                    trn.d("Error parsing Element ProtoBytes. \n", (Throwable)ahab);
                    optional = Optional.empty();
                }
            }
            else {
                optional = Optional.empty();
            }
            if (optional.isPresent()) {
                final aqhj aqhj = (aqhj)optional.get();
                final lwf lwf = ((Map<K, lwf>)this.b).get(s);
                if (lwf == null) {
                    final lwf lwf2 = new lwf((char[])null);
                    if (!l(aqhj).isEmpty()) {
                        lwf2.d = l(aqhj);
                        ((Map<String, lwf>)this.b).put(s, lwf2);
                    }
                }
                else {
                    lwf.a = 0;
                    lwf.c = lwf.b;
                }
                this.h(s);
            }
        }
    }
    
    public final void g() {
        if (this.a) {
            for (final lwf lwf : ((Map<K, lwf>)this.b).values()) {
                final vdv c = ((vdo)((vbq)this.e).a(((zki)this.c).c())).c();
                c.g((String)lwf.d);
                c.b().W((asir)gep.j, (asix)hnn.b);
            }
        }
    }
    
    public final void h(final String s) {
        if (this.a && ((Map)this.b).containsKey(s)) {
            final lwf lwf = ((Map<K, lwf>)this.b).get(s);
            int b;
            if (lwf == null) {
                b = 0;
            }
            else {
                b = lwf.b;
            }
            final String h = vek.h(168, "products_in_video".concat(s));
            h.getClass();
            agot.E(h.isEmpty() ^ true, (Object)"key cannot be empty");
            final agza builder = ((agzi)anmb.a).createBuilder();
            builder.copyOnWrite();
            final anmb anmb = (anmb)builder.instance;
            anmb.b |= 0x1;
            anmb.c = h;
            final anly anly = new anly(builder);
            final agza a = anly.a;
            final int intValue = b;
            a.copyOnWrite();
            final anmb anmb2 = (anmb)a.instance;
            anmb2.b |= 0x2;
            anmb2.d = intValue;
            final vdv c = ((vdo)((vbq)this.e).a(((zki)this.c).c())).c();
            c.j((vdj)anly);
            c.b().U();
        }
    }
    
    public final void i(final long d) {
        monitorenter(this);
        try {
            if (this.a) {
                ((ArrayList)this.d).clear();
                if (((ArrayList)this.c).size() != 0) {
                    final abi abi = new abi();
                    final abn abn = new abn();
                    for (int size = ((ArrayList)this.c).size(), i = 0; i < size; ++i) {
                        final ArrayList a = ((ArrayList)this.c).get(i).a;
                        for (int size2 = a.size(), j = 0; j < size2; ++j) {
                            final dzc dzc = a.get(j);
                            final ArrayList b = dzc.b;
                            int size3;
                            if (b == null) {
                                size3 = 0;
                            }
                            else {
                                size3 = b.size();
                            }
                            if (size3 == 0) {
                                abi.add((Object)dzc);
                            }
                            else {
                                abn.put((Object)dzc, (Object)size3);
                            }
                        }
                    }
                    if (!abn.isEmpty() && abi.isEmpty()) {
                        throw new dyv("Graph has nodes, but they represent a cycle with no leaf nodes!");
                    }
                    final ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.addAll((Collection)abi);
                    while (!arrayDeque.isEmpty()) {
                        final dzc dzc2 = (dzc)arrayDeque.pollFirst();
                        ((ArrayList)this.d).add(dzc2);
                        for (final dzc dzc3 : dzc2.h()) {
                            final int n = (int)abn.get((Object)dzc3) - 1;
                            abn.put((Object)dzc3, (Object)n);
                            if (n == 0) {
                                arrayDeque.addLast(dzc3);
                            }
                            else {
                                if (n >= 0) {
                                    continue;
                                }
                                throw new dyv("Detected cycle.");
                            }
                        }
                    }
                    if (((ArrayList)this.d).size() != abn.d + abi.b) {
                        throw new dyv("Had unreachable nodes in graph -- this likely means there was a cycle");
                    }
                    Collections.reverse((List<?>)this.d);
                    this.a = false;
                }
            }
            for (int size4 = ((ArrayList)this.d).size(), k = 0; k < size4; ++k) {
                final dzc dzc4 = ((ArrayList)this.d).get(k);
                final float a2 = dzc4.a(d);
                if (d == dzc4.d) {
                    throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
                }
                dzc4.d = d;
                dzc4.c = a2;
            }
        Label_0675:
            for (int size5 = ((ArrayList)this.d).size(), l = 0; l < size5; ++l) {
                final dzc dzc5 = ((ArrayList)this.d).get(l);
                final aeee aeee = ((Map<K, aeee>)this.b).get(dzc5);
                if (aeee != null && !aeee.b) {
                    final Iterator iterator2 = dzc5.h().iterator();
                    while (iterator2.hasNext()) {
                        if (!((aeee)((Map<Object, Object>)this.b).get(iterator2.next())).b) {
                            continue Label_0675;
                        }
                    }
                    if (!(dzc5 instanceof dyz) || ((dyz)dzc5).b()) {
                        aeee.b = true;
                    }
                }
            }
            int size6 = ((ArrayList)this.c).size();
        Label_0693:
            while (true) {
                final int n2 = size6 - 1;
                if (n2 >= 0) {
                    final dyw dyw = ((ArrayList)this.c).get(n2);
                    final ArrayList a3 = dyw.a;
                    while (true) {
                        for (int size7 = a3.size(), n3 = 0; n3 < size7; ++n3) {
                            if (!((aeee)((Map<Object, Object>)this.b).get(a3.get(n3))).b) {
                                size6 = n2;
                                continue Label_0693;
                            }
                        }
                        final qpt f = dyw.f;
                        if (f != null) {
                            final Object a4 = f.a;
                            ((dyg)a4).h();
                            ((dyg)a4).d();
                        }
                        dyw.b();
                        continue;
                    }
                }
                break;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void j(final dyw dyw) {
        monitorenter(this);
        try {
            if (dyw.b) {
                ((ArrayList)this.c).add(dyw);
                final ArrayList a = dyw.a;
                for (int size = a.size(), i = 0; i < size; ++i) {
                    final dzc dzc = a.get(i);
                    final aeee aeee = ((Map<K, aeee>)this.b).get(dzc);
                    if (aeee != null) {
                        ++aeee.a;
                    }
                    else {
                        final aeee aeee2 = new aeee((byte[])null, (byte[])null);
                        aeee2.a = 1;
                        ((Map<dzc, aeee>)this.b).put(dzc, aeee2);
                    }
                }
                if (((ArrayList)this.c).size() == 1) {
                    final Object e = this.e;
                    if (((dyt)e).f == null) {
                        throw new RuntimeException("Must set a binding graph first.");
                    }
                    if (((dyt)e).c) {
                        throw new RuntimeException("Tried to start but was already running.");
                    }
                    ((dyt)e).c = true;
                    ((dyt)e).a();
                }
                this.a = true;
                monitorexit(this);
                return;
            }
            throw new RuntimeException("Expected added GraphBinding to be active: ".concat(dyw.toString()));
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void k(final dyw dyw) {
        monitorenter(this);
        try {
            if (((ArrayList)this.c).remove(dyw)) {
                final ArrayList a = dyw.a;
                for (int size = a.size(), i = 0; i < size; ++i) {
                    final dzc dzc = a.get(i);
                    final aeee aeee = ((Map<K, aeee>)this.b).get(dzc);
                    if (--aeee.a == 0) {
                        ((Map<Object, Object>)this.b).remove(dzc);
                    }
                }
                if (((ArrayList)this.c).isEmpty()) {
                    final Object e = this.e;
                    if (!((dyt)e).c) {
                        throw new RuntimeException("Tried to stop but wasn't running.");
                    }
                    ((dyt)e).c = false;
                    final dym a2 = ((dyt)e).a;
                    final dyl b = ((dyt)e).b;
                    b.a.set(null);
                    if (((dyn)a2).b != null) {
                        ((dyn)a2).b.removeFrameCallback(b.a());
                    }
                    else {
                        ((dyn)a2).a.removeCallbacks(b.b());
                    }
                    ((dyt)e).d = false;
                    ((ArrayList)this.d).clear();
                    if (!((Map)this.b).isEmpty()) {
                        throw new RuntimeException("Failed to clean up all nodes");
                    }
                }
                this.a = true;
                monitorexit(this);
                return;
            }
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
