import android.view.MotionEvent;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.graphics.Bitmap;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.accessibility.AccessibilityManager;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.util.LruCache;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.lang.ref.WeakReference;
import android.view.View;
import android.view.PointerIcon;
import android.support.v4.media.MediaMetadataCompat;
import android.media.session.MediaController$TransportControls;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build$VERSION;
import android.hardware.camera2.CameraCaptureSession;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import android.view.GestureDetector;
import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bx
{
    public final Object a;
    
    public bx() {
        this.a = new Bundle();
    }
    
    public bx(final abey a, final byte[] array) {
        this.a = a;
    }
    
    public bx(final afts a) {
        this.a = a;
    }
    
    public bx(final ahr a) {
        this.a = a;
    }
    
    public bx(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public bx(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener) {
        this(context, gestureDetector$OnGestureListener, null);
    }
    
    public bx(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener, final Handler handler) {
        this.a = new bx(context, gestureDetector$OnGestureListener, handler, null);
    }
    
    public bx(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener, final Handler handler, final byte[] array) {
        this.a = new GestureDetector(context, gestureDetector$OnGestureListener, handler);
    }
    
    public bx(final Context context, final Object o, final Set set) {
        this.a = new HashMap();
        aff.k((Object)context);
        for (final String s : set) {
            ((Map<String, us>)this.a).put(s, new us(context, s, (baa)o, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public bx(final Context a, final byte[] array) {
        this.a = a;
    }
    
    public bx(final Context context, final byte[] array, final byte[] array2) {
        this.a = LayoutInflater.from(context);
    }
    
    public bx(final Context context, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = LayoutInflater.from(context);
    }
    
    public bx(final Context a, final char[] array) {
        this.a = a;
    }
    
    public bx(final CameraCaptureSession cameraCaptureSession, final Handler handler) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.a = new vq(cameraCaptureSession);
            return;
        }
        this.a = new vr(cameraCaptureSession, (Object)new bx(handler));
    }
    
    public bx(final CameraCharacteristics a) {
        this.a = a;
    }
    
    public bx(final CameraDevice cameraDevice, final Handler handler) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.a = new vv(cameraDevice);
            return;
        }
        this.a = new vu(cameraDevice, (Object)new bx(handler));
    }
    
    public bx(final MediaController$TransportControls a) {
        this.a = a;
    }
    
    public bx(final Handler a) {
        this.a = a;
    }
    
    public bx(final MediaMetadataCompat mediaMetadataCompat) {
        final Bundle a = new Bundle(mediaMetadataCompat.b);
        this.a = a;
        final Bundle bundle = a;
        eg.c(a);
    }
    
    public bx(final PointerIcon a) {
        this.a = a;
    }
    
    public bx(final View view) {
        this.a = new WeakReference(view);
    }
    
    public bx(final arud a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public bx(final atjj a) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final atjj a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final atjj a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public bx(final atjj a, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final atjj a, final byte[] array, final char[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final atjj a, final char[] array) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final atjj a, final char[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final atjj a, final char[] array, final char[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final atjj a, final short[] array) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final bx bx, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = bx.E(ws.class);
    }
    
    public bx(final bx a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    private bx(final bz a) {
        this.a = a;
    }
    
    public bx(final e a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public bx(final fap a) {
        this.a = a;
    }
    
    public bx(final ggs a) {
        this.a = a;
    }
    
    public bx(final Class a) {
        this.a = a;
    }
    
    public bx(final Object a) {
        this.a = a;
    }
    
    public bx(final List list) {
        this.a = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((List<mc>)this.a).add((mc)iterator.next());
        }
    }
    
    public bx(final List list, final byte[] array) {
        this.a = new ArrayList(list);
    }
    
    public bx(final Executor a) {
        this.a = a;
    }
    
    public bx(final va a) {
        this.a = a;
    }
    
    public bx(final xlv a) {
        a.getClass();
        this.a = a;
    }
    
    public bx(final zh a) {
        this.a = a;
        final Class clazz = (Class)((zi)a).d(aan.j, (Object)null);
        if (clazz != null && !clazz.equals(ye.class)) {
            final StringBuilder sb = new StringBuilder("Invalid target class configuration for ");
            sb.append(this);
            sb.append(": ");
            sb.append(clazz);
            throw new IllegalArgumentException(sb.toString());
        }
        ((zg)a).b(aan.j, (Object)ye.class);
        if (((zg)a).d(aan.i, (Object)null) == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(ye.class.getCanonicalName());
            sb2.append("-");
            sb2.append(UUID.randomUUID());
            ((zg)a).b(aan.i, (Object)sb2.toString());
        }
    }
    
    public bx(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new LinkedHashMap(0, 0.75f, true);
    }
    
    public bx(final byte[] array, final byte[] array2, final char[] array3) {
        this.a = new WeakHashMap();
    }
    
    public bx(final byte[] array, final char[] array2) {
        this.a = new aux();
        new HashMap();
    }
    
    public bx(final byte[] array, final char[] array2, final byte[] array3) {
        zh.k();
        this.a = new xt(0);
    }
    
    public bx(final byte[] array, final char[] array2, final char[] array3) {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public bx(final byte[] array, final short[] array2) {
        this.a = new abi();
    }
    
    public bx(final char[] array) {
        this.a = ww.a((Class)wy.class);
    }
    
    public bx(final char[] array, final byte[] array2) {
        this.a = new ArrayList();
    }
    
    public bx(final char[] array, final byte[] array2, final byte[] array3) {
        this.a = zh.k();
    }
    
    public bx(final char[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final wx a = (wx)ww.a((Class)wx.class);
        this.a = a;
    }
    
    public bx(final char[] array, final byte[] array2, final char[] array3) {
        this.a = DesugarCollections.synchronizedMap((Map)new HashMap());
    }
    
    public bx(final char[] array, final char[] array2) {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public bx(final int[] array) {
        this.a = new LruCache(3);
    }
    
    public static bx J(final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        return new bx(AccessibilityNodeInfo$CollectionItemInfo.obtain(n, n2, n3, n4, b, b2));
    }
    
    public static bx K(final int n, final int n2, final int n3) {
        return new bx(AccessibilityNodeInfo$CollectionInfo.obtain(n, n2, false, n3));
    }
    
    public static final void N(final View view) {
        final Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
            view.setAnimation((Animation)null);
        }
    }
    
    public static final long Z(final izf izf) {
        if ((izf.b & 0x2) != 0x0) {
            return izf.d;
        }
        return -1L;
    }
    
    public static bx a(final bz bz) {
        return new bx(bz);
    }
    
    public final Object A(final Object o) {
        o.getClass();
        return ((LinkedHashMap)this.a).remove(o);
    }
    
    public final Set B() {
        final Set entrySet = ((LinkedHashMap)this.a).entrySet();
        entrySet.getClass();
        return entrySet;
    }
    
    public final boolean C() {
        return ((LinkedHashMap)this.a).isEmpty();
    }
    
    public final void D(final zo zo) {
        ((List<zo>)this.a).add(zo);
    }
    
    public final zj E(final Class clazz) {
        for (final zj zj : this.a) {
            if (zj.getClass() == clazz) {
                return zj;
            }
        }
        return null;
    }
    
    public final boolean F(final Class clazz) {
        final Iterator<Object> iterator = ((List<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            if (clazz.isAssignableFrom(iterator.next().getClass())) {
                return true;
            }
        }
        return false;
    }
    
    public final void G(final Object o) {
        ((aux)this.a).k((Object)new zd(o));
    }
    
    public final yg H() {
        return new yg(zi.m((yy)this.a));
    }
    
    public final boolean I() {
        return this.a != null;
    }
    
    public final void L(final View view, final int n) {
        this.M(view, n, 1000L);
    }
    
    public final void M(final View view, final int n, final long n2) {
        final Object a = this.a;
        final agza builder = far.a.createBuilder();
        builder.copyOnWrite();
        final far far = (far)builder.instance;
        far.c = 2;
        far.b |= 0x1;
        ((fap)a).a(builder.build(), (fao)new kne(view, n, n2));
    }
    
    public final void O() {
        ((gau)((atjj)this.a).a()).e(false);
    }
    
    public final aexq P() {
        final Object a = this.a;
        if (((abi)a).b != 1) {
            final zjo a2 = zjo.a;
            final zjn y = zjn.y;
            final int b = ((abi)this.a).b;
            final StringBuilder sb = new StringBuilder("Expected only one FeedFilterBarLogicController, found ");
            sb.append(b);
            zjp.b(a2, y, sb.toString());
            return aewp.a;
        }
        aexq aexq;
        if (((Set)a).isEmpty()) {
            aexq = aewp.a;
        }
        else {
            aexq = aexq.k((Object)((Set)a).iterator().next());
        }
        return aexq;
    }
    
    public final boolean Q() {
        return ((xlv)this.a).g() != null;
    }
    
    public final Intent R() {
        return new Intent((Context)this.a, (Class)SettingsActivity.class);
    }
    
    public final void S(final String s, final Throwable t) {
        if (this.T()) {
            zjp.c(zjo.b, zjn.G, s, t);
        }
    }
    
    public final boolean T() {
        final Object a = this.a;
        return a != null && gkt.aG((arud)a);
    }
    
    public final PaneDescriptor U(final aioe aioe, final aofi aofi, final byte[] array, final boolean b, final akac akac, final boolean b2, final boolean b3, final int n, final int n2, final String s, final acvr acvr, final boolean b4, final String s2) {
        aioe.getClass();
        final String c = ((anvb)((agzd)aioe).rr((agyr)SearchEndpointOuterClass.searchEndpoint)).c;
        final Bundle a = PaneDescriptor.a();
        a.putString("search_query", c);
        if (aofi != null) {
            a.putParcelable("innertube_search_filters", (Parcelable)aeda.as((MessageLite)aofi));
        }
        if (array != null) {
            a.putByteArray("searchbox_stats", array);
        }
        a.putBoolean("preserve_search_nav_history", b);
        a.putInt("network_connectivity_requirement", 2);
        final double random = Math.random();
        final StringBuilder sb = new StringBuilder("SEARCH_RESULTS_");
        sb.append(c);
        sb.append(random);
        a.putString("search_cache_key", sb.toString());
        if (akac != null) {
            a.putByteArray("sticky_horizontal_card_list", ((agxl)akac).toByteArray());
        }
        a.putBoolean("search_filter_chip_clicked", b2);
        a.putBoolean("search_filter_chip_applied", b3);
        a.putInt("search_filter_chip_count", n);
        a.putInt("search_chip_bar_selected_position", n2);
        a.putString("search_original_chip_query", s);
        a.putBoolean("is_shorts_context", acvr.a);
        a.putBoolean("is_shorts_chip_selected", acvr.b);
        a.putString("thumbnail_video_id", s2);
        a.putBoolean("from_voice_search", b4);
        return PaneDescriptor.d((Class)this.a, aioe, a, true);
    }
    
    public final boolean V(final PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
    
    public final boolean W(final izf izf) {
        boolean b;
        if ((izf.b & 0x1) != 0x0) {
            b = izf.c;
        }
        else {
            b = this.Y();
        }
        return b;
    }
    
    public final boolean X() {
        final AccessibilityManager a = tqt.a((Context)((bx)this.a).a);
        return a != null && a.isEnabled();
    }
    
    public final boolean Y() {
        return tqt.e((Context)((bx)this.a).a);
    }
    
    public final void aa(final qpt qpt) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            Object o;
            if (qpt != null) {
                o = new qh(qpt, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            else {
                o = null;
            }
            anj.a(view.animate(), (ValueAnimator$AnimatorUpdateListener)o);
        }
    }
    
    public final cl b() {
        return ((bz)this.a).e;
    }
    
    public final void c() {
        ((bz)this.a).e.noteStateNotSaved();
    }
    
    public final void d() {
        ((bz)this.a).e.ah(true);
    }
    
    public final MediaMetadataCompat e() {
        return new MediaMetadataCompat((Bundle)this.a);
    }
    
    public final void f(final String s, final Bitmap bitmap) {
        if (MediaMetadataCompat.a.containsKey((Object)s) && (int)MediaMetadataCompat.a.get((Object)s) != 2) {
            final StringBuilder sb = new StringBuilder("The ");
            sb.append(s);
            sb.append(" key cannot be used to put a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        ((Bundle)this.a).putParcelable(s, (Parcelable)bitmap);
    }
    
    public final void g(final String s, final long n) {
        if (MediaMetadataCompat.a.containsKey((Object)s) && (int)MediaMetadataCompat.a.get((Object)s) != 0) {
            final StringBuilder sb = new StringBuilder("The ");
            sb.append(s);
            sb.append(" key cannot be used to put a long");
            throw new IllegalArgumentException(sb.toString());
        }
        ((Bundle)this.a).putLong(s, n);
    }
    
    public final void h(final String s, final String s2) {
        if (MediaMetadataCompat.a.containsKey((Object)s) && (int)MediaMetadataCompat.a.get((Object)s) != 1) {
            final StringBuilder sb = new StringBuilder("The ");
            sb.append(s);
            sb.append(" key cannot be used to put a String");
            throw new IllegalArgumentException(sb.toString());
        }
        ((Bundle)this.a).putCharSequence(s, (CharSequence)s2);
    }
    
    public final boolean i() {
        return lg.b((Context)this.a);
    }
    
    public final Object j(final CameraCharacteristics$Key cameraCharacteristics$Key) {
        return ((CameraCharacteristics)this.a).get(cameraCharacteristics$Key);
    }
    
    public final CameraCaptureSession k() {
        return ((vr)this.a).a;
    }
    
    public final Executor l() {
        return ((va)this.a).q();
    }
    
    public final boolean m() {
        return ((va)this.a).u();
    }
    
    public final void n() {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }
    
    public final void o() {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().start();
        }
    }
    
    public final void p(final float n) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().alpha(n);
        }
    }
    
    public final void q(final long duration) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().setDuration(duration);
        }
    }
    
    public final void r(final Interpolator interpolator) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().setInterpolator((TimeInterpolator)interpolator);
        }
    }
    
    public final void s(final ank ank) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            if (ank != null) {
                view.animate().setListener((Animator$AnimatorListener)new anh(ank, view));
                return;
            }
            view.animate().setListener((Animator$AnimatorListener)null);
        }
    }
    
    public final void t(final long startDelay) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().setStartDelay(startDelay);
        }
    }
    
    public final void u(final float n) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().translationX(n);
        }
    }
    
    public final void v(final float n) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().translationY(n);
        }
    }
    
    public final void w(final Runnable runnable) {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            ani.a(view.animate(), runnable);
        }
    }
    
    public final void x() {
        final View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            ani.b(view.animate());
        }
    }
    
    public final void y(final MotionEvent motionEvent) {
        ((GestureDetector)((bx)this.a).a).onTouchEvent(motionEvent);
    }
    
    public final Object z(final Object o, final Object o2) {
        return ((LinkedHashMap)this.a).put(o, o2);
    }
}
