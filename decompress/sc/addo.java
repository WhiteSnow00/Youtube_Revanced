import java.util.Set;
import com.google.common.util.concurrent.ListenableFuture;
import org.chromium.net.CronetEngine;
import java.net.URL;
import android.os.Build$VERSION;
import android.util.DisplayMetrics;
import java.util.concurrent.ExecutorService;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.io.OutputStream;
import java.io.File;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityManager;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addo
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    
    public addo() {
        new HashSet();
        new ArrayList();
        new HashMap();
        this.b = new HashSet();
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        new HashMap();
        new ArrayList();
        this.d = "";
    }
    
    public addo(final aawy aawy, final abpu d, final asid asid, final asiq asiq) {
        this.d = d;
        final ashi c = d.D().R().P(asid).L((asjr)new zgy(aawy, 6)).L((asjr)new zgy(this, 7, (byte[])null, (byte[])null)).V().aq().c(0, new aauu(asiq, 8));
        this.c = c;
        final aaxs a = aaxs.a;
        final ashi ashi = c;
        this.a = c.Y((asjr)a).V().aq().c(0, new aauu(asiq, 8));
        final aaxs c2 = aaxs.c;
        final ashi ashi2 = c;
        this.b = c.Y((asjr)c2).V().aq().c(0, new aauu(asiq, 8));
    }
    
    public addo(final abrj c, final blu a, final atke d, final cya b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public addo(final adgg d, final Executor c, final Executor a) {
        this.b = ativ.aE();
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public addo(final Context a, final pja c, final byte[] array, final byte[] array2) {
        this.a = a;
        final AccessibilityManager d = (AccessibilityManager)a.getApplicationContext().getSystemService("accessibility");
        d.getClass();
        this.d = d;
        final AccessibilityManager accessibilityManager = d;
        this.b = new abdo(d);
        this.e = a.getResources().getDisplayMetrics();
        this.c = c;
    }
    
    public addo(final PackageManager packageManager, final ResolveInfo resolveInfo, final aiqj aiqj, final byte[] c) {
        packageManager.getClass();
        resolveInfo.getClass();
        aiqj.getClass();
        this.e = resolveInfo.activityInfo.name;
        this.a = resolveInfo.loadIcon(packageManager);
        this.b = resolveInfo.loadLabel(packageManager);
        this.c = c;
        final Object e = this.e;
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        final ahaz builder = ((ahbh)ahrt.a).createBuilder();
        if (resolveInfo.activityInfo.applicationInfo.packageName != null) {
            final String packageName = resolveInfo.activityInfo.applicationInfo.packageName;
            builder.copyOnWrite();
            final ahrt ahrt = (ahrt)builder.instance;
            packageName.getClass();
            ahrt.b |= 0x1;
            ahrt.c = packageName;
        }
        if (e != null) {
            builder.copyOnWrite();
            final ahrt ahrt2 = (ahrt)builder.instance;
            ahrt2.b |= 0x2;
            ahrt2.d = (String)e;
        }
        ahbb.e((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint, (Object)builder.build());
        ((ahaz)ahbb).mergeFrom((ahbh)aiqj);
        this.d = ((ahaz)ahbb).build();
    }
    
    public addo(View c) {
        this.c = c;
        final View view = c;
        final View viewById = c.findViewById(2131428284);
        this.d = viewById;
        final View view2 = c;
        this.a = c.findViewById(2131428308);
        c = viewById;
        this.b = viewById.findViewById(2131428328);
    }
    
    public addo(final atke b, final tig a) {
        this.b = b;
        this.a = a;
        this.c = ((atiw)ativ.aE()).aL();
        this.d = ((atiw)ativ.aE()).aL();
    }
    
    public addo(final aukf c, final xra d, final ablh b, final aglu a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public addo(final eny d, final File b, final File c, final File a) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public addo(final OutputStream c, final Date d, final tan b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.a = new ByteArrayOutputStream();
    }
    
    public addo(final ExecutorService c, final tjr d, final Context a, final aldf b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public static String a(final aiqj aiqj) {
        if (aiqj != null && ((ahbc)aiqj).ry((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
            return ((ahrt)((ahbc)aiqj).rx((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint)).c;
        }
        return null;
    }
    
    public static int q(final DisplayMetrics displayMetrics, final int n) {
        return (int)(n / displayMetrics.density + 0.5f);
    }
    
    public static aob r() {
        Object o;
        if (Build$VERSION.SDK_INT >= 30) {
            o = new ans();
        }
        else if (Build$VERSION.SDK_INT >= 29) {
            o = new anr();
        }
        else {
            o = new anq();
        }
        ((ant)o).g(7, aib.d(0, 0, 0, 0));
        return ((ant)o).a();
    }
    
    public static long v(final long n, final int n2, final int n3) {
        return n << n2 | ((long)n3 & -1L >>> 64 - n2);
    }
    
    private final ashi x() {
        return ((ashi)this.d).R().V().J();
    }
    
    public final asht b() {
        return ((ashi)this.b).J().ai();
    }
    
    public final void c() {
        final Object e = this.e;
        if (e != null && !((ListenableFuture)e).isCancelled() && !((ListenableFuture)this.e).isDone()) {
            ((ListenableFuture)this.e).cancel(true);
        }
    }
    
    public final void d(final String s) {
        ((Executor)this.a).execute(new adfy(this, s, 0, null));
    }
    
    public final void e() {
        final Object e = this.e;
        if (e == null) {
            return;
        }
        final abkh abkh = (abkh)e;
        this.f(abkh);
        final Object a = ((aglu)this.a).a;
        if (a == null) {
            return;
        }
        if (abkh.i == 4) {
            ((abvb)a).C(abkh);
        }
    }
    
    public final void f(final abkh abkh) {
        ((aukf)this.c).tu((Object)abkh);
    }
    
    public final void g() {
        this.e = null;
    }
    
    public final void h(final abkh e) {
        if (((xra)this.d).c() == 2) {
            return;
        }
        this.e = e;
        ((ablh)this.b).n(abkb.c);
        this.e();
    }
    
    public final void i(final adcu adcu) {
        tbi.f();
        ((Set<adcu>)this.a).add(adcu);
        this.j(adcu);
    }
    
    public final void j(final adcu adcu) {
        adcu.tk(this);
    }
    
    public final void k(final adcu adcu) {
        tbi.f();
        ((Set)this.a).remove(adcu);
    }
    
    public final ashi l() {
        return this.x().L((asjr)rro.k).p();
    }
    
    public final ashi m() {
        return this.x().L((asjr)rro.m).p();
    }
    
    public final ashi n() {
        return ashi.e((auke)this.x().L((asjr)rro.n).p(), (auke)((ashi)((tig)this.a).c).J(), (asji)lgl.h).R().p();
    }
    
    public final ashi o() {
        return this.x().L((asjr)rro.l).p();
    }
    
    public final void p(final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n) {
        final Object e = this.e;
        if (e == null || b != ((tij)e).a()) {
            this.e = new tij(b);
            ((tgd)((atke)this.b).a()).f(this.e);
        }
        ((atiw)this.d).tu((Object)new tii(b, b2, b3, b4, n));
    }
    
    public final asht s(final oti oti) {
        return asht.w((ashv)new zef(this, oti, 1, (byte[])null, (byte[])null)).B((asjj)lgw.c);
    }
    
    public final byte[] t(final View view, final int n, final int n2, final aob aob) {
        return this.u(view, 0, null, n, n2, aob);
    }
    
    public final byte[] u(final View view, int c, final Context context, int n, int q, final aob aob) {
        int q2 = n;
        if (view != null) {
            final Object e = this.e;
            n = view.getWidth();
            q2 = q((DisplayMetrics)e, n);
            final Object e2 = this.e;
            n = view.getHeight();
            q = q((DisplayMetrics)e2, n);
        }
        if (context != null) {
            this.e = context.getResources().getDisplayMetrics();
        }
        final DisplayMetrics displayMetrics = (DisplayMetrics)this.e;
        final int q3 = q(displayMetrics, displayMetrics.widthPixels);
        final DisplayMetrics displayMetrics2 = (DisplayMetrics)this.e;
        final int q4 = q(displayMetrics2, displayMetrics2.heightPixels);
        if ((n = c) == 0) {
            if (q3 != 0 && q4 != 0) {
                if (q4 > q3) {
                    n = 4;
                }
                else {
                    n = 2;
                }
            }
            else {
                n = 1;
            }
        }
        final ahaz builder = ((ahbh)aqfx.a).createBuilder();
        builder.copyOnWrite();
        final aqfx aqfx = (aqfx)builder.instance;
        aqfx.g = 0;
        aqfx.b |= 0x10;
        final float c2 = (float)q2;
        builder.copyOnWrite();
        final aqfx aqfx2 = (aqfx)builder.instance;
        aqfx2.b |= 0x1;
        aqfx2.c = c2;
        final float d = (float)q;
        builder.copyOnWrite();
        final aqfx aqfx3 = (aqfx)builder.instance;
        aqfx3.b |= 0x2;
        aqfx3.d = d;
        final ahaz builder2 = aqfo.a.createBuilder();
        builder2.copyOnWrite();
        final aqfo aqfo = (aqfo)builder2.instance;
        aqfo.c = n - 1;
        aqfo.b |= 0x1;
        final aqfo e3 = (aqfo)builder2.build();
        builder.copyOnWrite();
        final aqfx aqfx4 = (aqfx)builder.instance;
        e3.getClass();
        aqfx4.e = e3;
        aqfx4.b |= 0x4;
        final ahaz builder3 = ((ahbh)aqhf.a).createBuilder();
        builder3.copyOnWrite();
        final aqhf aqhf = (aqhf)builder3.instance;
        aqhf.b |= 0x1;
        aqhf.c = (float)q3;
        builder3.copyOnWrite();
        final aqhf aqhf2 = (aqhf)builder3.instance;
        aqhf2.b |= 0x2;
        aqhf2.d = (float)q4;
        final aqhf f = (aqhf)builder3.build();
        builder.copyOnWrite();
        final aqfx aqfx5 = (aqfx)builder.instance;
        f.getClass();
        aqfx5.f = f;
        aqfx5.b |= 0x8;
        if (((Context)this.a).getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600) {
            c = 1;
        }
        else {
            c = 2;
        }
        builder.copyOnWrite();
        final aqfx aqfx6 = (aqfx)builder.instance;
        aqfx6.h = c - 1;
        aqfx6.b |= 0x20;
        final Object e4 = this.e;
        final aib f2 = aob.f(7);
        final ahaz builder4 = aqfp.a.createBuilder();
        final ahaz builder5 = aqfq.a.createBuilder();
        c = f2.c;
        final DisplayMetrics displayMetrics3 = (DisplayMetrics)e4;
        final float c3 = (float)q(displayMetrics3, c);
        builder5.copyOnWrite();
        final aqfq aqfq = (aqfq)builder5.instance;
        aqfq.b |= 0x1;
        aqfq.c = c3;
        final aqfq c4 = (aqfq)builder5.build();
        builder4.copyOnWrite();
        final aqfp aqfp = (aqfp)builder4.instance;
        c4.getClass();
        aqfp.c = c4;
        aqfp.b |= 0x1;
        final ahaz builder6 = aqfq.a.createBuilder();
        final float c5 = (float)q(displayMetrics3, f2.e);
        builder6.copyOnWrite();
        final aqfq aqfq2 = (aqfq)builder6.instance;
        aqfq2.b |= 0x1;
        aqfq2.c = c5;
        final aqfq e5 = (aqfq)builder6.build();
        builder4.copyOnWrite();
        final aqfp aqfp2 = (aqfp)builder4.instance;
        e5.getClass();
        aqfp2.e = e5;
        aqfp2.b |= 0x4;
        final ahaz builder7 = aqfq.a.createBuilder();
        final float c6 = (float)q(displayMetrics3, f2.b);
        builder7.copyOnWrite();
        final aqfq aqfq3 = (aqfq)builder7.instance;
        aqfq3.b |= 0x1;
        aqfq3.c = c6;
        final aqfq d2 = (aqfq)builder7.build();
        builder4.copyOnWrite();
        final aqfp aqfp3 = (aqfp)builder4.instance;
        d2.getClass();
        aqfp3.d = d2;
        aqfp3.b |= 0x2;
        final ahaz builder8 = aqfq.a.createBuilder();
        final float c7 = (float)q(displayMetrics3, f2.d);
        builder8.copyOnWrite();
        final aqfq aqfq4 = (aqfq)builder8.instance;
        aqfq4.b |= 0x1;
        aqfq4.c = c7;
        final aqfq f3 = (aqfq)builder8.build();
        builder4.copyOnWrite();
        final aqfp aqfp4 = (aqfp)builder4.instance;
        f3.getClass();
        aqfp4.f = f3;
        aqfp4.b |= 0x8;
        final aqfp j = (aqfp)builder4.build();
        builder.copyOnWrite();
        final aqfx aqfx7 = (aqfx)builder.instance;
        j.getClass();
        aqfx7.j = j;
        aqfx7.b |= 0x80;
        final Boolean e6 = ((abdo)this.b).e();
        if (e6 != null) {
            final boolean booleanValue = e6;
            builder.copyOnWrite();
            final aqfx aqfx8 = (aqfx)builder.instance;
            aqfx8.b |= 0x40;
            aqfx8.i = booleanValue;
        }
        return ((agzk)builder.build()).toByteArray();
    }
    
    public final aeea w() {
        if (this.e == null) {
            final CronetEngine a = ((tjr)this.d).a((tcj)new adqf(this, new URL(((aldf)this.b).d), (byte[])null));
            Object o;
            if (a != null) {
                o = new aqxe(a, (oby)new tvc(1), (ExecutorService)this.c);
            }
            else {
                o = new aqwq();
            }
            this.e = aqsy.x((aqwn)o);
        }
        return (aeea)this.e;
    }
}
