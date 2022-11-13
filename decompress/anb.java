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

public final class anb
{
    public static final int[] a;
    private static WeakHashMap b;
    private static Field c;
    private static boolean d;
    private static final aly e;
    private static final amg f;
    
    static {
        new AtomicInteger(1);
        anb.b = null;
        anb.d = false;
        a = new int[] { 2131427379, 2131427380, 2131427391, 2131427402, 2131427405, 2131427406, 2131427407, 2131427408, 2131427409, 2131427410, 2131427381, 2131427382, 2131427383, 2131427384, 2131427385, 2131427386, 2131427387, 2131427388, 2131427389, 2131427390, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427400, 2131427401, 2131427403, 2131427404 };
        e = (aly)amb.a;
        f = new amg();
    }
    
    public static List A(final View view) {
        ArrayList list;
        if ((list = (ArrayList)view.getTag(2131431928)) == null) {
            list = new ArrayList();
            view.setTag(2131431928, (Object)list);
        }
        return list;
    }
    
    public static void B(final View view, final aol aol) {
        C(view);
        aF(aol.a(), view);
        A(view).add(aol);
        D(view, 0);
    }
    
    static void C(final View view) {
        akw q;
        if ((q = q(view)) == null) {
            q = new akw();
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
        final int a = amm.a(source);
        int eventType = 32;
        if (a != 0 || b2) {
            if (!b2) {
                eventType = 2048;
            }
            final AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(eventType);
            amm.d(obtain, n);
            if (b2) {
                obtain.getText().add(y(source));
                if (amj.a(source) == 0) {
                    amj.o(source, 1);
                }
                for (ViewParent viewParent = source.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                    if (amj.a((View)viewParent) == 4) {
                        amj.o(source, 2);
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
            amm.d(obtain2, 32);
            obtain2.setSource(source);
            source.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(y(source));
            accessibilityManager.sendAccessibilityEvent(obtain2);
            return;
        }
        if (source.getParent() != null) {
            final ViewParent parent = source.getParent();
            try {
                amm.b(parent, source, source, n);
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
    
    public static void G(final View view, final aom aom) {
        view.onInitializeAccessibilityNodeInfo(aom.a);
    }
    
    public static void H(final View view) {
        amj.g(view);
    }
    
    public static void I(final View view, final Runnable runnable) {
        amj.i(view, runnable);
    }
    
    public static void J(final View view, final Runnable runnable, final long n) {
        amj.j(view, runnable, n);
    }
    
    public static void K(final View view, final int n) {
        aF(n, view);
        D(view, 0);
    }
    
    public static void L(final View view) {
        amn.c(view);
    }
    
    public static void M(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 29) {
            amv.c(view, context, array, set, typedArray, n, n2);
        }
    }
    
    public static void N(final View view, final akw akw) {
        akw akw2 = akw;
        if (akw == null) {
            akw2 = akw;
            if (p(view) instanceof aku) {
                akw2 = new akw();
            }
        }
        View$AccessibilityDelegate c;
        if (akw2 == null) {
            c = null;
        }
        else {
            c = akw2.c;
        }
        view.setAccessibilityDelegate(c);
    }
    
    public static void O(final View view, final CharSequence charSequence) {
        aE().e(view, charSequence);
        if (charSequence != null) {
            final amg f = anb.f;
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
            if (amm.e(view)) {
                f.a(view);
            }
            return;
        }
        final amg f2 = anb.f;
        f2.a.remove(view);
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)f2);
        amj.k(view.getViewTreeObserver(), (ViewTreeObserver$OnGlobalLayoutListener)f2);
    }
    
    @Deprecated
    public static void P(final View view, final float alpha) {
        view.setAlpha(alpha);
    }
    
    public static void Q(final View view, final Drawable drawable) {
        amj.m(view, drawable);
    }
    
    public static void R(final View view, final ColorStateList list) {
        amp.j(view, list);
    }
    
    public static void S(final View view, final PorterDuff$Mode porterDuff$Mode) {
        amp.k(view, porterDuff$Mode);
    }
    
    public static void T(final View view, final Rect rect) {
        aml.b(view, rect);
    }
    
    public static void U(final View view, final float n) {
        amp.l(view, n);
    }
    
    @Deprecated
    public static void V(final View view, final boolean fitsSystemWindows) {
        view.setFitsSystemWindows(fitsSystemWindows);
    }
    
    public static void W(final View view, final boolean b) {
        amj.n(view, b);
    }
    
    public static void X(final View view, final int n) {
        amj.o(view, n);
    }
    
    public static void Y(final View view, final int n) {
        ams.g(view, n);
    }
    
    public static void Z(final View view, final alw alw) {
        amp.n(view, alw);
    }
    
    public static float a(final View view) {
        return amp.a(view);
    }
    
    public static void aA(final View view) {
        amp.p(view, -1.0f);
    }
    
    public static bx aB(final View view) {
        if (anb.b == null) {
            anb.b = new WeakHashMap();
        }
        bx bx;
        if ((bx = anb.b.get(view)) == null) {
            bx = new bx(view);
            anb.b.put(view, bx);
        }
        return bx;
    }
    
    public static void aC(final View view, final bx bx) {
        amr.d(view, (PointerIcon)bx.a);
    }
    
    private static aly aD(final View view) {
        if (view instanceof aly) {
            return (aly)view;
        }
        return anb.e;
    }
    
    private static amh aE() {
        return new amd(CharSequence.class);
    }
    
    private static void aF(final int n, final View view) {
        final List a = A(view);
        for (int i = 0; i < a.size(); ++i) {
            if (((aol)a.get(i)).a() == n) {
                a.remove(i);
                return;
            }
        }
    }
    
    public static void aa(final View view, final String[] array, final alx alx) {
        if (Build$VERSION.SDK_INT >= 31) {
            amx.b(view, array, alx);
            return;
        }
        final boolean b = true;
        afg.e(true, "When the listener is set, MIME types must also be set");
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
        afg.e(b2, "A MIME type set here must not start with *: ".concat(String.valueOf(Arrays.toString(array))));
        view.setTag(2131431936, (Object)array);
        view.setTag(2131431935, (Object)alx);
    }
    
    public static void ab(final View view, final int n, final int n2, final int n3, final int n4) {
        amk.j(view, n, n2, n3, n4);
    }
    
    public static void ac(final View view, final CharSequence charSequence) {
        u().e(view, charSequence);
    }
    
    public static void ad(final View view, final String s) {
        amp.o(view, null);
    }
    
    public static void ae(final View view) {
        amp.r(view);
    }
    
    public static void af(final View view, final View$DragShadowBuilder view$DragShadowBuilder) {
        amr.e(view, view$DragShadowBuilder);
    }
    
    static boolean ag(View b, final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT >= 28) {
            return false;
        }
        final ana c = ana.c(b);
        if (keyEvent.getAction() == 0) {
            final WeakHashMap b2 = c.b;
            if (b2 != null) {
                b2.clear();
            }
            if (!ana.a.isEmpty()) {
                synchronized (ana.a) {
                    if (c.b == null) {
                        c.b = new WeakHashMap();
                    }
                    int size = ana.a.size();
                    while (true) {
                        final int n = size - 1;
                        if (n < 0) {
                            break;
                        }
                        final View view = ana.a.get(n).get();
                        if (view == null) {
                            ana.a.remove(n);
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
        final ana c = ana.c(view);
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
                if (view != null && amm.e(view)) {
                    ana.d(view);
                    return true;
                }
                b = true;
            }
        }
        return b;
    }
    
    public static boolean ai(final View view) {
        return amj.p(view);
    }
    
    public static boolean aj(final View view) {
        return ami.a(view);
    }
    
    public static boolean ak(final View view) {
        return amj.q(view);
    }
    
    public static boolean al(final View view) {
        return amj.r(view);
    }
    
    public static boolean am(final View view) {
        return amm.e(view);
    }
    
    public static boolean an(final View view) {
        return aml.c(view);
    }
    
    public static boolean ao(final View view) {
        return amm.f(view);
    }
    
    public static boolean ap(final View view) {
        return amm.g(view);
    }
    
    public static boolean aq(final View view) {
        return amp.y(view);
    }
    
    public static boolean ar(final View view) {
        return amk.k(view);
    }
    
    public static boolean as(final View view, final int n, final Bundle bundle) {
        return amj.s(view, n, bundle);
    }
    
    public static String[] at(final View view) {
        if (Build$VERSION.SDK_INT >= 31) {
            return amx.c(view);
        }
        return (String[])view.getTag(2131431936);
    }
    
    public static void au(final View view, final aob aob, final Rect rect) {
        amp.f(view, aob, rect);
    }
    
    public static void av(final View view, final aol aol, final apb apb) {
        if (apb == null) {
            K(view, aol.a());
            return;
        }
        B(view, new aol((Object)null, aol.l, (CharSequence)null, apb, aol.m));
    }
    
    public static void aw(final View view) {
        amm.c(view, 1);
    }
    
    public static void ax(final View view) {
        amk.i(view, 0);
    }
    
    public static void ay(final View view, final int n) {
        amq.d(view, n, 3);
    }
    
    public static boolean az(final View view, final ClipData clipData, final View$DragShadowBuilder view$DragShadowBuilder) {
        return amr.f(view, clipData, view$DragShadowBuilder, null, 257);
    }
    
    public static float b(final View view) {
        return amp.c(view);
    }
    
    public static int c() {
        return amk.a();
    }
    
    public static int d(final View view) {
        return amj.a(view);
    }
    
    public static int e(final View view) {
        return ams.a(view);
    }
    
    public static int f(final View view) {
        return amk.c(view);
    }
    
    public static int g(final View view) {
        return amj.b(view);
    }
    
    public static int h(final View view) {
        return amj.c(view);
    }
    
    public static int i(final View view) {
        return amk.d(view);
    }
    
    public static int j(final View view) {
        return amk.e(view);
    }
    
    @Deprecated
    public static int k(final View view) {
        return amj.d(view);
    }
    
    public static ColorStateList l(final View view) {
        return amp.d(view);
    }
    
    public static PorterDuff$Mode m(final View view) {
        return amp.e(view);
    }
    
    public static Rect n(final View view) {
        return aml.a(view);
    }
    
    public static Display o(final View view) {
        return amk.f(view);
    }
    
    public static View$AccessibilityDelegate p(final View view) {
        if (Build$VERSION.SDK_INT < 29) {
            final boolean d = anb.d;
            final View$AccessibilityDelegate view$AccessibilityDelegate = null;
            View$AccessibilityDelegate view$AccessibilityDelegate2 = null;
            if (d) {
                view$AccessibilityDelegate2 = view$AccessibilityDelegate;
            }
            else {
                Label_0047: {
                    if (anb.c != null) {
                        break Label_0047;
                    }
                    try {
                        (anb.c = View.class.getDeclaredField("mAccessibilityDelegate")).setAccessible(true);
                        final Object value = anb.c.get(view);
                        if (value instanceof View$AccessibilityDelegate) {
                            final View$AccessibilityDelegate view$AccessibilityDelegate3 = (View$AccessibilityDelegate)value;
                        }
                    }
                    finally {
                        anb.d = true;
                        view$AccessibilityDelegate2 = view$AccessibilityDelegate;
                    }
                }
            }
            return view$AccessibilityDelegate2;
        }
        return amv.a(view);
    }
    
    public static akw q(final View view) {
        final View$AccessibilityDelegate p = p(view);
        if (p == null) {
            return null;
        }
        if (p instanceof aku) {
            return ((aku)p).a;
        }
        return new akw(p);
    }
    
    public static ale r(final View view, ale a) {
        if (Build$VERSION.SDK_INT >= 31) {
            return amx.a(view, a);
        }
        final alx alx = (alx)view.getTag(2131431935);
        if (alx == null) {
            return aD(view).a(a);
        }
        a = alx.a(view, a);
        if (a == null) {
            return null;
        }
        return aD(view).a(a);
    }
    
    public static amh s() {
        return (amh)new amf((Class)Boolean.class);
    }
    
    public static amh t() {
        return new amc(Boolean.class);
    }
    
    public static amh u() {
        return new ame(CharSequence.class);
    }
    
    public static aob v(final View view, final aob aob) {
        final WindowInsets e = aob.e();
        if (e != null) {
            final WindowInsets a = amn.a(view, e);
            if (!a.equals((Object)e)) {
                return aob.p(a, view);
            }
        }
        return aob;
    }
    
    public static aob w(final View view) {
        return amq.b(view);
    }
    
    public static aob x(final View view, final aob aob) {
        final WindowInsets e = aob.e();
        if (e != null) {
            final WindowInsets b = amn.b(view, e);
            if (!b.equals((Object)e)) {
                return aob.p(b, view);
            }
        }
        return aob;
    }
    
    public static CharSequence y(final View view) {
        return (CharSequence)aE().d(view);
    }
    
    public static String z(final View view) {
        return amp.h(view);
    }
}
