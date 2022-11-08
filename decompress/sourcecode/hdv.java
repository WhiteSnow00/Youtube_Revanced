import java.util.Deque;
import java.util.Set;
import java.util.WeakHashMap;
import java.lang.ref.WeakReference;
import android.widget.EdgeEffect;
import android.os.Process;
import android.app.AppOpsManager;
import com.google.common.util.concurrent.ListenableFuture;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.function.Function;
import java.util.HashSet;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.SegmentProcessingService;
import java.net.URI;
import android.webkit.CookieManager;
import java.util.ArrayDeque;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import j$.util.Optional;
import java.util.concurrent.Callable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.PaintDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdv
{
    public final Object a;
    public final Object b;
    public final Object c;
    
    public hdv() {
        final PaintDrawable c = new PaintDrawable();
        this.c = c;
        final RectShape shape = new RectShape();
        final PaintDrawable paintDrawable = c;
        c.setShape((Shape)shape);
        this.a = new int[] { 0, 0 };
        final GradientDrawable b = new GradientDrawable();
        this.b = b;
        final GradientDrawable gradientDrawable = b;
        b.mutate();
        final GradientDrawable$Orientation top_BOTTOM = GradientDrawable$Orientation.TOP_BOTTOM;
        final GradientDrawable gradientDrawable2 = b;
        b.setOrientation(top_BOTTOM);
    }
    
    public hdv(final abns abns, final fjp fjp, final mrm mrm, final uyi a, final byte[] array, final byte[] array2, final byte[] array3) {
        final atid ad = atid.aD();
        this.b = ad;
        this.a = a;
        final asib asib = new asib();
        this.c = asgt.tz((aujo)abns.q().k, (aujo)fjp.k().i(asgm.e), (aujo)ad, (asiy)exg.o).aa((asjd)kbz.p).p().ax().c(0, (asix)new kxr(asib, 15));
        mrm.A((Callable)new kbe(asib, 9));
    }
    
    public hdv(final aiiz b, final Optional a, final Optional c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hdv(final Activity b, final hyc c, final ggv a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hdv(final Context context) {
        agnj.E((aeyr)new grk(context, 17));
        this.a = agnj.E((aeyr)new grk(context, 18));
        this.c = agnj.E((aeyr)new grk(context, 19));
        this.b = agnj.E((aeyr)new grk(context, 20));
    }
    
    public hdv(final Context a, final arud b, final atjj c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public hdv(final Context b, final Executor c, final uje a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public hdv(final Context c, final vax b) {
        this.c = c;
        this.a = LayoutInflater.from(c);
        this.b = b;
    }
    
    public hdv(final Context c, final vax b, final byte[] array) {
        this.c = c;
        this.a = LayoutInflater.from(c);
        this.b = b;
    }
    
    public hdv(final Context a, final zjy b, final zki c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public hdv(View viewById) {
        this.a = viewById;
        this.b = viewById.findViewById(2131429153);
        viewById = viewById.findViewById(2131429677);
        Object c;
        if (viewById == null) {
            c = null;
        }
        else {
            c = new gxm(viewById);
        }
        this.c = c;
    }
    
    public hdv(final View c, final CharSequence b, final CharSequence a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hdv(final ViewGroup viewGroup, final fuv a, final acts b) {
        this.a = a;
        this.b = b;
        final FrameLayout c = (FrameLayout)viewGroup.findViewById(2131431798);
        this.c = c;
        final ViewGroup c2 = a.c;
        final FrameLayout frameLayout = c;
        c.addView((View)c2);
        final FrameLayout frameLayout2 = c;
        c.setVisibility(8);
    }
    
    public hdv(final ViewGroup c, final kpr a) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = new ArrayDeque();
    }
    
    public hdv(final CookieManager b, final URI uri, final atjj a) {
        this.b = b;
        this.c = uri.getHost();
        this.a = a;
    }
    
    public hdv(final arhr c, final arhr a, final uyf b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hdv(final asho c, final asho b, final asgt a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hdv(final atjj c, final atjj b, final atjj a) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public hdv(final atjj c, final atjj a, final atjj b, final byte[] array) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public hdv(final atjj a, final atjj c, final atjj b, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = b;
    }
    
    public hdv(final atjj c, final atjj b, final Executor a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hdv(final SegmentProcessingService a, final Context b) {
        this.a = a;
        this.b = b;
        this.c = new adkm(a);
    }
    
    public hdv(final a c, final Executor a, final uyf b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hdv(final gqt b, final cya a, final bx c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hdv(final Executor c, final adno a, final zki b, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hdv(final lzh c, final lzh b, final uyi a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hdv(final mrm mrm, final qw b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = atir.aR((Object)false);
        this.b = b;
        this.a = new HashSet();
        mrm.A((Callable)new kbe(this, 16, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public hdv(final mrm mrm, final uyf uyf, final Optional optional, final gie gie, final gie gie2, final abrx abrx, final abrx abrx2, final byte[] array, final byte[] array2, final byte[] array3) {
        final asib b = new asib();
        this.b = b;
        anqa anqa;
        if ((anqa = uyf.b().A) == null) {
            anqa = anqa.a;
        }
        final boolean g = anqa.g;
        final Optional map = optional.map((Function)gfu.q);
        final Boolean value = false;
        final asgt i = ((ashe)map.orElse((Object)ashe.U((Object)value))).ai((Object)value).z().W((asjc)new gih(g)).i(asgm.e);
        final asip ax = i.L((asjc)new fdk(gie2, gie, 12)).p().ax();
        final asib asib = b;
        this.a = ax.c(0, (asix)new ghp(b, 12));
        final asip ax2 = i.L((asjc)new fdk(abrx2, abrx, 13)).p().ax();
        final asib asib2 = b;
        this.c = ax2.c(0, (asix)new ghp(b, 12));
        mrm.A((Callable)new csh(this, 13, (byte[])null));
    }
    
    public hdv(final tgw c, final gxa b, final tzj a) {
        this.b = b;
        ((tgw)(this.c = c)).c();
        this.a = a;
    }
    
    public hdv(final vbq b, final vcf a, final Executor c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hdv(final byte[] array) {
        final Bitmap bitmap = Bitmap.createBitmap(400, 400, Bitmap$Config.ARGB_8888);
        this.c = bitmap;
        final Bitmap bitmap2 = bitmap;
        this.a = new Canvas(bitmap);
        this.b = Bitmap.createBitmap(400, 400, Bitmap$Config.ARGB_8888);
    }
    
    static void a(final Context context) {
        ((NotificationManager)context.getSystemService((Class)NotificationManager.class)).createNotificationChannel(new NotificationChannel("segmentProcessingServiceChannel", (CharSequence)"Segment Processing Service Channel", 2));
    }
    
    public final void b() {
        final Object b = this.b;
        if (b != null) {
            ((View)b).setVisibility(8);
        }
    }
    
    public final ListenableFuture c() {
        return afrp.e(((adno)this.a).j(((zki)this.b).c()), (aexg)gku.k, (Executor)this.c);
    }
    
    public final ListenableFuture d() {
        final AppOpsManager appOpsManager = (AppOpsManager)((Context)this.a).getSystemService("appops");
        if (appOpsManager != null) {
            if (appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), ((Context)this.a).getPackageName()) != 2) {
                return afrp.e(((cxz)((atjj)this.c).a()).H(), (aexg)fna.s, (Executor)afsl.a);
            }
        }
        return afva.m(ghy.a);
    }
    
    public final int e() {
        if (((Context)this.a).getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            final akak f = ((arud)this.b).f();
            if (f != null) {
                alvs alvs;
                if ((alvs = f.e) == null) {
                    alvs = alvs.a;
                }
                if (alvs.n) {
                    return 3;
                }
            }
            return 2;
        }
        return 1;
    }
    
    public final void f(final int n) {
        ((Bitmap)this.c).eraseColor(n);
        ((Bitmap)this.b).eraseColor(n);
    }
    
    public final gbj g(final amdk amdk, final wwv wwv, final actk actk) {
        final vax vax = (vax)((atjj)this.c).a();
        vax.getClass();
        final oas oas = (oas)((atjj)this.b).a();
        oas.getClass();
        ((atjj)this.a).a().getClass();
        wwv.getClass();
        return new gbj(vax, oas, amdk, wwv, actk);
    }
    
    public final void h() {
        ((atir)this.c).tr((Object)(((Set)this.a).isEmpty() ^ true));
    }
    
    public final fza i() {
        return (fza)new jwe((Activity)this.b, (hyc)this.c, (aeyr)new ljc(this, 0, (byte[])null, (byte[])null), 0, null, null, null);
    }
    
    public final String j() {
        final ggh n = ((ggv)this.a).n();
        if (n != null) {
            return n.bd();
        }
        return null;
    }
    
    public final boolean k() {
        alvl alvl;
        if ((alvl = ((uyf)this.b).b().e) == null) {
            alvl = alvl.a;
        }
        return !alvl.ap || !((fjm)((arhr)this.c).a()).b().a.isEmpty();
    }
    
    public final void l() {
        if (((tul)((atjj)this.c).a()).a() != tuj.a) {
            return;
        }
        tcp.q(((tul)((atjj)this.c).a()).b(), (Executor)this.a, (tco)new jor(this, 10, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final EdgeEffect n(final int n) {
        if (n == 1) {
            return (EdgeEffect)((aeyr)this.a).a();
        }
        if (n != 2) {
            return (EdgeEffect)((aeyr)this.b).a();
        }
        return (EdgeEffect)((aeyr)this.c).a();
    }
    
    public final void o(final int n, final View view, final EdgeEffect edgeEffect) {
        WeakHashMap weakHashMap;
        if (n != 1) {
            if (n != 2) {
                weakHashMap = ((kqv)((aeyr)this.b).a()).a;
            }
            else {
                weakHashMap = ((kqv)((aeyr)this.c).a()).a;
            }
        }
        else {
            weakHashMap = ((kqv)((aeyr)this.a).a()).a;
        }
        weakHashMap.put(view, new WeakReference(edgeEffect));
    }
    
    public final kps p() {
        kps kps2;
        final kps kps = kps2 = ((Deque<kps>)this.b).pollLast();
        if (kps != null) {
            kps2 = kps;
            if (kps.pZ().getParent() != null) {
                ((Deque<kps>)this.b).offerFirst(kps);
                kps2 = null;
            }
        }
        kps a;
        if ((a = kps2) == null) {
            a = ((kpr)this.a).a((ViewGroup)this.c);
        }
        return a;
    }
    
    public final void q(final boolean b) {
        final Object c = this.c;
        Object contentDescription;
        if (b) {
            contentDescription = this.a;
        }
        else {
            contentDescription = this.b;
        }
        ((View)c).setContentDescription((CharSequence)contentDescription);
    }
    
    public final void r(final acij acij, final aogu aogu, final amnt amnt) {
        if (aogu == null) {
            ((FrameLayout)this.c).setVisibility(8);
            return;
        }
        ((FrameLayout)this.c).setVisibility(0);
        ((fuv)this.a).b(acij, aogu);
        ajzl a;
        if (amnt != null) {
            if (amnt.b == 102716411) {
                a = (ajzl)amnt.c;
            }
            else {
                a = ajzl.a;
            }
        }
        else {
            a = null;
        }
        if (a != null) {
            ((acts)this.b).b(a, (View)this.c, amnt, ((wwx)acij).a);
        }
    }
}
