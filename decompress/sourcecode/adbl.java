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

public final class adbl
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    
    public adbl() {
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
    
    public adbl(final aave aave, final abns d, final asho asho, final asib asib) {
        this.d = d;
        final asgt c = d.E().R().P(asho).L((asjc)new zff(aave, 6)).L((asjc)new zff(this, 7, (byte[])null, (byte[])null)).V().ap().c(0, (asix)new aavd(asib, 3));
        this.c = c;
        final zon n = zon.n;
        final asgt asgt = c;
        this.a = c.Y((asjc)n).V().ap().c(0, (asix)new aavd(asib, 3));
        final zon o = zon.o;
        final asgt asgt2 = c;
        this.b = c.Y((asjc)o).V().ap().c(0, (asix)new aavd(asib, 3));
    }
    
    public adbl(final adee d, final Executor c, final Executor a) {
        this.b = atid.aD();
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public adbl(final Context a, final phq c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        final AccessibilityManager d = (AccessibilityManager)a.getApplicationContext().getSystemService("accessibility");
        d.getClass();
        this.d = d;
        final AccessibilityManager accessibilityManager = d;
        this.b = new abbu(d);
        this.e = a.getResources().getDisplayMetrics();
        this.c = c;
    }
    
    public adbl(final PackageManager packageManager, final ResolveInfo resolveInfo, final aioe aioe, final byte[] c) {
        packageManager.getClass();
        resolveInfo.getClass();
        aioe.getClass();
        this.e = resolveInfo.activityInfo.name;
        this.a = resolveInfo.loadIcon(packageManager);
        this.b = resolveInfo.loadLabel(packageManager);
        this.c = c;
        final Object e = this.e;
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        final agza builder = ahpv.a.createBuilder();
        if (resolveInfo.activityInfo.applicationInfo.packageName != null) {
            final String packageName = resolveInfo.activityInfo.applicationInfo.packageName;
            builder.copyOnWrite();
            final ahpv ahpv = (ahpv)builder.instance;
            packageName.getClass();
            ahpv.b |= 0x1;
            ahpv.c = packageName;
        }
        if (e != null) {
            builder.copyOnWrite();
            final ahpv ahpv2 = (ahpv)builder.instance;
            ahpv2.b |= 0x2;
            ahpv2.d = (String)e;
        }
        agzc.e((agyr)AndroidApplicationEndpointOuterClass.androidAppEndpoint, (Object)builder.build());
        ((agza)agzc).mergeFrom((agzi)aioe);
        this.d = ((agza)agzc).build();
    }
    
    public adbl(View c) {
        this.c = c;
        final View view = c;
        final View viewById = c.findViewById(2131428284);
        this.d = viewById;
        final View view2 = c;
        this.a = c.findViewById(2131428308);
        c = viewById;
        this.b = viewById.findViewById(2131428328);
    }
    
    public adbl(final atjj b, final tgb a) {
        this.b = b;
        this.a = a;
        this.c = ((atie)atid.aD()).aK();
        this.d = ((atie)atid.aD()).aK();
    }
    
    public adbl(final aujp c, final aepj d, final abji b, final agjt a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public adbl(final enx d, final File b, final File c, final File a) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public adbl(final OutputStream c, final Date d, final soy b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.a = new ByteArrayOutputStream();
    }
    
    public adbl(final ExecutorService c, final thn d, final Context a, final albc b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public adbl(final lfy c, final blt a, final atjj d, final cxz b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public static String a(final aioe aioe) {
        if (aioe != null && ((agzd)aioe).rs((agyr)AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
            return ((ahpv)((agzd)aioe).rr((agyr)AndroidApplicationEndpointOuterClass.androidAppEndpoint)).c;
        }
        return null;
    }
    
    public static int q(final DisplayMetrics displayMetrics, final int n) {
        return (int)(n / displayMetrics.density + 0.5f);
    }
    
    public static aoa r() {
        Object o;
        if (Build$VERSION.SDK_INT >= 30) {
            o = new anr();
        }
        else if (Build$VERSION.SDK_INT >= 29) {
            o = new anq();
        }
        else {
            o = new anp();
        }
        ((ans)o).g(7, aia.d(0, 0, 0, 0));
        return ((ans)o).a();
    }
    
    public static long v(final long n, final int n2, final int n3) {
        return n << n2 | (-1L >>> 64 - n2 & (long)n3);
    }
    
    private final asgt x() {
        return ((asgt)this.d).R().V().J();
    }
    
    public final ashe b() {
        return ((asgt)this.b).J().ai();
    }
    
    public final void c() {
        final Object e = this.e;
        if (e != null && !((ListenableFuture)e).isCancelled() && !((ListenableFuture)this.e).isDone()) {
            ((ListenableFuture)this.e).cancel(true);
        }
    }
    
    public final void d(final String s) {
        ((Executor)this.a).execute((Runnable)new abwg(this, s, 20, (byte[])null));
    }
    
    public final void e() {
        final Object e = this.e;
        if (e == null) {
            return;
        }
        final abip abip = (abip)e;
        this.f(abip);
        final Object a = ((agjt)this.a).a;
        if (a == null) {
            return;
        }
        if (abip.i == 4) {
            ((abta)a).C(abip);
        }
    }
    
    public final void f(final abip abip) {
        ((aujp)this.c).tr((Object)abip);
    }
    
    public final void g() {
        this.e = null;
    }
    
    public final void h(final abip e) {
        if (((aepj)this.d).v() == 2) {
            return;
        }
        this.e = e;
        ((abji)this.b).m(abij.c);
        this.e();
    }
    
    public final void i(final adar adar) {
        szc.f();
        ((Set<adar>)this.a).add(adar);
        this.j(adar);
    }
    
    public final void j(final adar adar) {
        adar.tf(this);
    }
    
    public final void k(final adar adar) {
        szc.f();
        ((Set)this.a).remove(adar);
    }
    
    public final asgt l() {
        return this.x().L((asjc)sjx.h).p();
    }
    
    public final asgt m() {
        return this.x().L((asjc)sjx.j).p();
    }
    
    public final asgt n() {
        return asgt.e((aujo)this.x().L((asjc)sjx.k).p(), (aujo)((asgt)((tgb)this.a).c).J(), (asit)lfi.h).R().p();
    }
    
    public final asgt o() {
        return this.x().L((asjc)sjx.i).p();
    }
    
    public final void p(final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n) {
        final Object e = this.e;
        if (e == null || b != ((tge)e).a()) {
            this.e = new tge(b);
            ((tdz)((atjj)this.b).a()).f(this.e);
        }
        ((atie)this.d).tr((Object)new tgd(b, b2, b3, b4, n));
    }
    
    public final ashe s(final orz orz) {
        return ashe.v((ashg)new zcm(this, orz, 1, (byte[])null, (byte[])null)).A((asiu)lfu.c);
    }
    
    public final byte[] t(final View view, final int n, final int n2, final aoa aoa) {
        return this.u(view, 0, null, n, n2, aoa);
    }
    
    public final byte[] u(final View view, int n, final Context context, int n2, int q, final aoa aoa) {
        int q2 = n2;
        if (view != null) {
            final Object e = this.e;
            n2 = view.getWidth();
            q2 = q((DisplayMetrics)e, n2);
            final Object e2 = this.e;
            n2 = view.getHeight();
            q = q((DisplayMetrics)e2, n2);
        }
        if (context != null) {
            this.e = context.getResources().getDisplayMetrics();
        }
        final DisplayMetrics displayMetrics = (DisplayMetrics)this.e;
        final int q3 = q(displayMetrics, displayMetrics.widthPixels);
        final DisplayMetrics displayMetrics2 = (DisplayMetrics)this.e;
        final int q4 = q(displayMetrics2, displayMetrics2.heightPixels);
        if ((n2 = n) == 0) {
            if (q3 != 0 && q4 != 0) {
                if (q4 > q3) {
                    n2 = 4;
                }
                else {
                    n2 = 2;
                }
            }
            else {
                n2 = 1;
            }
        }
        final agza builder = ((agzi)aqdl.a).createBuilder();
        builder.copyOnWrite();
        final aqdl aqdl = (aqdl)builder.instance;
        aqdl.g = 0;
        aqdl.b |= 0x10;
        builder.copyOnWrite();
        final aqdl aqdl2 = (aqdl)builder.instance;
        aqdl2.b |= 0x1;
        aqdl2.c = (float)q2;
        builder.copyOnWrite();
        final aqdl aqdl3 = (aqdl)builder.instance;
        aqdl3.b |= 0x2;
        aqdl3.d = (float)q;
        final agza builder2 = ((agzi)aqdc.a).createBuilder();
        builder2.copyOnWrite();
        final aqdc aqdc = (aqdc)builder2.instance;
        aqdc.c = n2 - 1;
        aqdc.b |= 0x1;
        final aqdc e3 = (aqdc)builder2.build();
        builder.copyOnWrite();
        final aqdl aqdl4 = (aqdl)builder.instance;
        e3.getClass();
        aqdl4.e = e3;
        aqdl4.b |= 0x4;
        final agza builder3 = ((agzi)aqet.a).createBuilder();
        builder3.copyOnWrite();
        final aqet aqet = (aqet)builder3.instance;
        aqet.b |= 0x1;
        aqet.c = (float)q3;
        builder3.copyOnWrite();
        final aqet aqet2 = (aqet)builder3.instance;
        aqet2.b |= 0x2;
        aqet2.d = (float)q4;
        final aqet f = (aqet)builder3.build();
        builder.copyOnWrite();
        final aqdl aqdl5 = (aqdl)builder.instance;
        f.getClass();
        aqdl5.f = f;
        aqdl5.b |= 0x8;
        if (((Context)this.a).getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600) {
            n = 1;
        }
        else {
            n = 2;
        }
        builder.copyOnWrite();
        final aqdl aqdl6 = (aqdl)builder.instance;
        aqdl6.h = n - 1;
        aqdl6.b |= 0x20;
        final Object e4 = this.e;
        final aia f2 = aoa.f(7);
        final agza builder4 = ((agzi)aqdd.a).createBuilder();
        final agza builder5 = ((agzi)aqde.a).createBuilder();
        n = f2.c;
        final DisplayMetrics displayMetrics3 = (DisplayMetrics)e4;
        n = q(displayMetrics3, n);
        builder5.copyOnWrite();
        final aqde aqde = (aqde)builder5.instance;
        aqde.b |= 0x1;
        aqde.c = (float)n;
        final aqde c = (aqde)builder5.build();
        builder4.copyOnWrite();
        final aqdd aqdd = (aqdd)builder4.instance;
        c.getClass();
        aqdd.c = c;
        aqdd.b |= 0x1;
        final agza builder6 = ((agzi)aqde.a).createBuilder();
        n = q(displayMetrics3, f2.e);
        builder6.copyOnWrite();
        final aqde aqde2 = (aqde)builder6.instance;
        aqde2.b |= 0x1;
        aqde2.c = (float)n;
        final aqde e5 = (aqde)builder6.build();
        builder4.copyOnWrite();
        final aqdd aqdd2 = (aqdd)builder4.instance;
        e5.getClass();
        aqdd2.e = e5;
        aqdd2.b |= 0x4;
        final agza builder7 = ((agzi)aqde.a).createBuilder();
        n = q(displayMetrics3, f2.b);
        builder7.copyOnWrite();
        final aqde aqde3 = (aqde)builder7.instance;
        aqde3.b |= 0x1;
        aqde3.c = (float)n;
        final aqde d = (aqde)builder7.build();
        builder4.copyOnWrite();
        final aqdd aqdd3 = (aqdd)builder4.instance;
        d.getClass();
        aqdd3.d = d;
        aqdd3.b |= 0x2;
        final agza builder8 = ((agzi)aqde.a).createBuilder();
        final float c2 = (float)q(displayMetrics3, f2.d);
        builder8.copyOnWrite();
        final aqde aqde4 = (aqde)builder8.instance;
        aqde4.b |= 0x1;
        aqde4.c = c2;
        final aqde f3 = (aqde)builder8.build();
        builder4.copyOnWrite();
        final aqdd aqdd4 = (aqdd)builder4.instance;
        f3.getClass();
        aqdd4.f = f3;
        aqdd4.b |= 0x8;
        final aqdd j = (aqdd)builder4.build();
        builder.copyOnWrite();
        final aqdl aqdl7 = (aqdl)builder.instance;
        j.getClass();
        aqdl7.j = j;
        aqdl7.b |= 0x80;
        final Boolean e6 = ((abbu)this.b).e();
        if (e6 != null) {
            final boolean booleanValue = e6;
            builder.copyOnWrite();
            final aqdl aqdl8 = (aqdl)builder.instance;
            aqdl8.b |= 0x40;
            aqdl8.i = booleanValue;
        }
        return ((agxl)builder.build()).toByteArray();
    }
    
    public final aeby w() {
        if (this.e == null) {
            final CronetEngine a = ((thn)this.d).a((tae)new adod(this, new URL(((albc)this.b).d), (byte[])null));
            Object o;
            if (a != null) {
                o = new aquq(a, (oas)new tsy(1), (ExecutorService)this.c);
            }
            else {
                o = new aqud();
            }
            this.e = aqqm.z((aqua)o);
        }
        return (aeby)this.e;
    }
}
