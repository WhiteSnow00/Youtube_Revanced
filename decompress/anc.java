import android.view.WindowInsets;
import android.view.Display;
import android.content.ClipData;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import android.view.KeyEvent;
import android.view.View$DragShadowBuilder;
import java.util.Arrays;
import android.view.PointerIcon;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$AccessibilityDelegate;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewParent;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anc
{
    public static final int[] a;
    private static WeakHashMap b;
    private static Field c;
    private static boolean d;
    private static final alz e;
    private static final amh f;
    
    static {
        new AtomicInteger(1);
        anc.b = null;
        anc.d = false;
        a = new int[] { 2131427379, 2131427380, 2131427391, 2131427402, 2131427405, 2131427406, 2131427407, 2131427408, 2131427409, 2131427410, 2131427381, 2131427382, 2131427383, 2131427384, 2131427385, 2131427386, 2131427387, 2131427388, 2131427389, 2131427390, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427400, 2131427401, 2131427403, 2131427404 };
        e = (alz)amc.a;
        f = new amh();
    }
    
    public static List A(final View view) {
        ArrayList list;
        if ((list = (ArrayList)view.getTag(2131431929)) == null) {
            list = new ArrayList();
            view.setTag(2131431929, (Object)list);
        }
        return list;
    }
    
    public static void B(final View view, final aom aom) {
        C(view);
        aF(aom.a(), view);
        A(view).add(aom);
        D(view, 0);
    }
    
    static void C(final View view) {
        akx q;
        if ((q = q(view)) == null) {
            q = new akx();
        }
        N(view, q);
    }
    
    static void D(final View source, final int n) {
        final AccessibilityManager accessibilityManager = (AccessibilityManager)source.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        final CharSequence y = y(source);
        boolean b2;
        final boolean b = b2 = false;
        if (y != null) {
            b2 = b;
            if (source.isShown()) {
                b2 = b;
                if (source.getWindowVisibility() == 0) {
                    b2 = true;
                }
            }
        }
        final int a = amn.a(source);
        int eventType = 32;
        if (a != 0 || b2) {
            if (!b2) {
                eventType = 2048;
            }
            final AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(eventType);
            amn.d(obtain, n);
            if (b2) {
                obtain.getText().add(y(source));
                if (amk.a(source) == 0) {
                    amk.o(source, 1);
                }
                for (ViewParent viewParent = source.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                    if (amk.a((View)viewParent) == 4) {
                        amk.o(source, 2);
                        break;
                    }
                }
            }
            source.sendAccessibilityEventUnchecked(obtain);
            return;
        }
        if (n == 32) {
            final AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            source.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            amn.d(obtain2, 32);
            obtain2.setSource(source);
            source.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(y(source));
            accessibilityManager.sendAccessibilityEvent(obtain2);
            return;
        }
        if (source.getParent() != null) {
            final ViewParent parent = source.getParent();
            try {
                amn.b(parent, source, source, n);
            }
            catch (final AbstractMethodError abstractMethodError) {
                Log.e("ViewCompat", String.valueOf(source.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static void E(final View view, final int n) {
        view.offsetLeftAndRight(n);
    }
    
    public static void F(final View view, final int n) {
        view.offsetTopAndBottom(n);
    }
    
    public static void G(final View view, final aon aon) {
        view.onInitializeAccessibilityNodeInfo(aon.a);
    }
    
    public static void H(final View view) {
        amk.g(view);
    }
    
    public static void I(final View view, final Runnable runnable) {
        amk.i(view, runnable);
    }
    
    public static void J(final View view, final Runnable runnable, final long n) {
        amk.j(view, runnable, n);
    }
    
    public static void K(final View view, final int n) {
        aF(n, view);
        D(view, 0);
    }
    
    public static void L(final View view) {
        amo.c(view);
    }
    
    public static void M(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 29) {
            amw.c(view, context, array, set, typedArray, n, n2);
        }
    }
    
    public static void N(final View view, final akx akx) {
        akx akx2 = akx;
        if (akx == null) {
            akx2 = akx;
            if (p(view) instanceof akv) {
                akx2 = new akx();
            }
        }
        View$AccessibilityDelegate c;
        if (akx2 == null) {
            c = null;
        }
        else {
            c = akx2.c;
        }
        view.setAccessibilityDelegate(c);
    }
    
    public static void O(final View view, final CharSequence charSequence) {
        aE().e(view, charSequence);
        if (charSequence != null) {
            final amh f = anc.f;
            final WeakHashMap a = f.a;
            final boolean shown = view.isShown();
            boolean b = false;
            if (shown) {
                b = b;
                if (view.getWindowVisibility() == 0) {
                    b = true;
                }
            }
            a.put(view, b);
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)f);
            if (amn.e(view)) {
                f.a(view);
            }
            return;
        }
        final amh f2 = anc.f;
        f2.a.remove(view);
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)f2);
        amk.k(view.getViewTreeObserver(), (ViewTreeObserver$OnGlobalLayoutListener)f2);
    }
    
    @Deprecated
    public static void P(final View view, final float alpha) {
        view.setAlpha(alpha);
    }
    
    public static void Q(final View view, final Drawable drawable) {
        amk.m(view, drawable);
    }
    
    public static void R(final View view, final ColorStateList list) {
        amq.j(view, list);
    }
    
    public static void S(final View view, final PorterDuff$Mode porterDuff$Mode) {
        amq.k(view, porterDuff$Mode);
    }
    
    public static void T(final View view, final Rect rect) {
        amm.b(view, rect);
    }
    
    public static void U(final View view, final float n) {
        amq.l(view, n);
    }
    
    @Deprecated
    public static void V(final View view, final boolean fitsSystemWindows) {
        view.setFitsSystemWindows(fitsSystemWindows);
    }
    
    public static void W(final View view, final boolean b) {
        amk.n(view, b);
    }
    
    public static void X(final View view, final int n) {
        amk.o(view, n);
    }
    
    public static void Y(final View view, final int n) {
        amt.g(view, n);
    }
    
    public static void Z(final View view, final alx alx) {
        amq.n(view, alx);
    }
    
    public static float a(final View view) {
        return amq.a(view);
    }
    
    public static void aA(final View view) {
        amq.p(view, -1.0f);
    }
    
    public static bx aB(final View view) {
        if (anc.b == null) {
            anc.b = new WeakHashMap();
        }
        bx bx;
        if ((bx = anc.b.get(view)) == null) {
            bx = new bx(view);
            anc.b.put(view, bx);
        }
        return bx;
    }
    
    public static void aC(final View view, final bx bx) {
        ams.d(view, (PointerIcon)bx.a);
    }
    
    private static alz aD(final View view) {
        if (view instanceof alz) {
            return (alz)view;
        }
        return anc.e;
    }
    
    private static ami aE() {
        return (ami)new ame((Class)CharSequence.class);
    }
    
    private static void aF(final int n, final View view) {
        final List a = A(view);
        for (int i = 0; i < a.size(); ++i) {
            if (((aom)a.get(i)).a() == n) {
                a.remove(i);
                return;
            }
        }
    }
    
    public static void aa(final View view, final String[] array, final aly aly) {
        if (Build$VERSION.SDK_INT >= 31) {
            amy.b(view, array, aly);
            return;
        }
        final boolean b = true;
        afc.d(true, "When the listener is set, MIME types must also be set");
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n > 0) {
                break;
            }
            if (array[n].startsWith("*")) {
                b2 = false;
                break;
            }
            ++n;
        }
        afc.d(b2, "A MIME type set here must not start with *: ".concat(String.valueOf(Arrays.toString(array))));
        view.setTag(2131431937, (Object)array);
        view.setTag(2131431936, (Object)aly);
    }
    
    public static void ab(final View view, final int n, final int n2, final int n3, final int n4) {
        aml.j(view, n, n2, n3, n4);
    }
    
    public static void ac(final View view, final CharSequence charSequence) {
        u().e(view, charSequence);
    }
    
    public static void ad(final View view, final String s) {
        amq.o(view, null);
    }
    
    public static void ae(final View view) {
        amq.r(view);
    }
    
    public static void af(final View view, final View$DragShadowBuilder view$DragShadowBuilder) {
        ams.e(view, view$DragShadowBuilder);
    }
    
    static boolean ag(View b, final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT >= 28) {
            return false;
        }
        final anb c = anb.c(b);
        if (keyEvent.getAction() == 0) {
            final WeakHashMap b2 = c.b;
            if (b2 != null) {
                b2.clear();
            }
            if (!anb.a.isEmpty()) {
                synchronized (anb.a) {
                    if (c.b == null) {
                        c.b = new WeakHashMap();
                    }
                    int size = anb.a.size();
                    while (true) {
                        final int n = size - 1;
                        if (n < 0) {
                            break;
                        }
                        final View view = anb.a.get(n).get();
                        if (view == null) {
                            anb.a.remove(n);
                            size = n;
                        }
                        else {
                            c.b.put(view, Boolean.TRUE);
                            ViewParent viewParent = view.getParent();
                            while (true) {
                                size = n;
                                if (!(viewParent instanceof View)) {
                                    break;
                                }
                                c.b.put(viewParent, Boolean.TRUE);
                                viewParent = viewParent.getParent();
                            }
                        }
                    }
                }
            }
        }
        b = c.b(b, keyEvent);
        if (keyEvent.getAction() == 0) {
            final int keyCode = keyEvent.getKeyCode();
            if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                c.a().put(keyCode, (Object)new WeakReference(b));
            }
        }
        return b != null;
    }
    
    public static boolean ah(View view, final KeyEvent keyEvent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 28) {
            return false;
        }
        final anb c = anb.c(view);
        final WeakReference c2 = c.c;
        if (c2 == null || c2.get() != keyEvent) {
            c.c = new WeakReference((T)keyEvent);
            final SparseArray a = c.a();
            final int action = keyEvent.getAction();
            WeakReference weakReference = null;
            if (action == 1) {
                final int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                weakReference = weakReference;
                if (indexOfKey >= 0) {
                    weakReference = (WeakReference)a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            WeakReference weakReference2;
            if ((weakReference2 = weakReference) == null) {
                weakReference2 = (WeakReference)a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 != null) {
                view = (View)weakReference2.get();
                if (view != null && amn.e(view)) {
                    anb.d(view);
                    return true;
                }
                b = true;
            }
        }
        return b;
    }
    
    public static boolean ai(final View view) {
        return amk.p(view);
    }
    
    public static boolean aj(final View view) {
        return amj.a(view);
    }
    
    public static boolean ak(final View view) {
        return amk.q(view);
    }
    
    public static boolean al(final View view) {
        return amk.r(view);
    }
    
    public static boolean am(final View view) {
        return amn.e(view);
    }
    
    public static boolean an(final View view) {
        return amm.c(view);
    }
    
    public static boolean ao(final View view) {
        return amn.f(view);
    }
    
    public static boolean ap(final View view) {
        return amn.g(view);
    }
    
    public static boolean aq(final View view) {
        return amq.y(view);
    }
    
    public static boolean ar(final View view) {
        return aml.k(view);
    }
    
    public static boolean as(final View view, final int n, final Bundle bundle) {
        return amk.s(view, n, bundle);
    }
    
    public static String[] at(final View view) {
        if (Build$VERSION.SDK_INT >= 31) {
            return amy.c(view);
        }
        return (String[])view.getTag(2131431937);
    }
    
    public static void au(final View view, final aoc aoc, final Rect rect) {
        amq.f(view, aoc, rect);
    }
    
    public static void av(final View view, final aom aom, final apc apc) {
        if (apc == null) {
            K(view, aom.a());
            return;
        }
        B(view, new aom((Object)null, aom.l, (CharSequence)null, apc, aom.m));
    }
    
    public static void aw(final View view) {
        amn.c(view, 1);
    }
    
    public static void ax(final View view) {
        aml.i(view, 0);
    }
    
    public static void ay(final View view, final int n) {
        amr.d(view, n, 3);
    }
    
    public static boolean az(final View view, final ClipData clipData, final View$DragShadowBuilder view$DragShadowBuilder) {
        return ams.f(view, clipData, view$DragShadowBuilder, null, 257);
    }
    
    public static float b(final View view) {
        return amq.c(view);
    }
    
    public static int c() {
        return aml.a();
    }
    
    public static int d(final View view) {
        return amk.a(view);
    }
    
    public static int e(final View view) {
        return amt.a(view);
    }
    
    public static int f(final View view) {
        return aml.c(view);
    }
    
    public static int g(final View view) {
        return amk.b(view);
    }
    
    public static int h(final View view) {
        return amk.c(view);
    }
    
    public static int i(final View view) {
        return aml.d(view);
    }
    
    public static int j(final View view) {
        return aml.e(view);
    }
    
    @Deprecated
    public static int k(final View view) {
        return amk.d(view);
    }
    
    public static ColorStateList l(final View view) {
        return amq.d(view);
    }
    
    public static PorterDuff$Mode m(final View view) {
        return amq.e(view);
    }
    
    public static Rect n(final View view) {
        return amm.a(view);
    }
    
    public static Display o(final View view) {
        return aml.f(view);
    }
    
    public static View$AccessibilityDelegate p(final View view) {
        if (Build$VERSION.SDK_INT < 29) {
            final boolean d = anc.d;
            final View$AccessibilityDelegate view$AccessibilityDelegate = null;
            View$AccessibilityDelegate view$AccessibilityDelegate2 = null;
            if (d) {
                view$AccessibilityDelegate2 = view$AccessibilityDelegate;
            }
            else {
                Label_0047: {
                    if (anc.c != null) {
                        break Label_0047;
                    }
                    try {
                        (anc.c = View.class.getDeclaredField("mAccessibilityDelegate")).setAccessible(true);
                        final Object value = anc.c.get(view);
                        if (value instanceof View$AccessibilityDelegate) {
                            final View$AccessibilityDelegate view$AccessibilityDelegate3 = (View$AccessibilityDelegate)value;
                        }
                    }
                    finally {
                        anc.d = true;
                        view$AccessibilityDelegate2 = view$AccessibilityDelegate;
                    }
                }
            }
            return view$AccessibilityDelegate2;
        }
        return amw.a(view);
    }
    
    public static akx q(final View view) {
        final View$AccessibilityDelegate p = p(view);
        if (p == null) {
            return null;
        }
        if (p instanceof akv) {
            return ((akv)p).a;
        }
        return new akx(p);
    }
    
    public static alf r(final View view, alf a) {
        if (Build$VERSION.SDK_INT >= 31) {
            return amy.a(view, a);
        }
        final aly aly = (aly)view.getTag(2131431936);
        if (aly == null) {
            return aD(view).a(a);
        }
        a = aly.a(view, a);
        if (a == null) {
            return null;
        }
        return aD(view).a(a);
    }
    
    public static ami s() {
        return (ami)new amg((Class)Boolean.class);
    }
    
    public static ami t() {
        return (ami)new amd((Class)Boolean.class);
    }
    
    public static ami u() {
        return (ami)new amf((Class)CharSequence.class);
    }
    
    public static aoc v(final View view, final aoc aoc) {
        final WindowInsets e = aoc.e();
        if (e != null) {
            final WindowInsets a = amo.a(view, e);
            if (!a.equals((Object)e)) {
                return aoc.p(a, view);
            }
        }
        return aoc;
    }
    
    public static aoc w(final View view) {
        return amr.b(view);
    }
    
    public static aoc x(final View view, final aoc aoc) {
        final WindowInsets e = aoc.e();
        if (e != null) {
            final WindowInsets b = amo.b(view, e);
            if (!b.equals((Object)e)) {
                return aoc.p(b, view);
            }
        }
        return aoc;
    }
    
    public static CharSequence y(final View view) {
        return (CharSequence)aE().d(view);
    }
    
    public static String z(final View view) {
        return amq.h(view);
    }
}
