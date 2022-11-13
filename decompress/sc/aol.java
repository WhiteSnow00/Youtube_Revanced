import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aol
{
    public static final aol a;
    public static final aol b;
    public static final aol c;
    public static final aol d;
    public static final aol e;
    public static final aol f;
    public static final aol g;
    public static final aol h;
    public static final aol i;
    public static final aol j;
    final Object k;
    public final int l;
    public final Class m;
    public final apb n;
    
    static {
        final Object o = null;
        a = new aol(1, (CharSequence)null);
        b = new aol(2, (CharSequence)null);
        new aol(4, (CharSequence)null);
        new aol(8, (CharSequence)null);
        c = new aol(16, (CharSequence)null);
        new aol(32, (CharSequence)null);
        new aol(64, (CharSequence)null);
        new aol(128, (CharSequence)null);
        new aol(256, aou.class);
        new aol(512, aou.class);
        new aol(1024, aov.class);
        new aol(2048, aov.class);
        d = new aol(4096, (CharSequence)null);
        e = new aol(8192, (CharSequence)null);
        new aol(16384, (CharSequence)null);
        new aol(32768, (CharSequence)null);
        new aol(65536, (CharSequence)null);
        new aol(131072, aoz.class);
        f = new aol(262144, (CharSequence)null);
        g = new aol(524288, (CharSequence)null);
        h = new aol(1048576, (CharSequence)null);
        new aol(2097152, apa.class);
        new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, aox.class);
        i = new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        j = new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_PAGE_UP;
        if (Build$VERSION.SDK_INT >= 29) {
            action_PAGE_UP = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_UP;
        }
        else {
            action_PAGE_UP = null;
        }
        new aol(action_PAGE_UP, 16908358, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_PAGE_DOWN;
        if (Build$VERSION.SDK_INT >= 29) {
            action_PAGE_DOWN = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_DOWN;
        }
        else {
            action_PAGE_DOWN = null;
        }
        new aol(action_PAGE_DOWN, 16908359, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_PAGE_LEFT;
        if (Build$VERSION.SDK_INT >= 29) {
            action_PAGE_LEFT = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_LEFT;
        }
        else {
            action_PAGE_LEFT = null;
        }
        new aol(action_PAGE_LEFT, 16908360, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_PAGE_RIGHT;
        if (Build$VERSION.SDK_INT >= 29) {
            action_PAGE_RIGHT = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        else {
            action_PAGE_RIGHT = null;
        }
        new aol(action_PAGE_RIGHT, 16908361, null, null, null);
        new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, aoy.class);
        new aol(AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, aow.class);
        AccessibilityNodeInfo$AccessibilityAction action_SHOW_TOOLTIP;
        if (Build$VERSION.SDK_INT >= 28) {
            action_SHOW_TOOLTIP = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP;
        }
        else {
            action_SHOW_TOOLTIP = null;
        }
        new aol(action_SHOW_TOOLTIP, 16908356, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_HIDE_TOOLTIP;
        if (Build$VERSION.SDK_INT >= 28) {
            action_HIDE_TOOLTIP = AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        else {
            action_HIDE_TOOLTIP = null;
        }
        new aol(action_HIDE_TOOLTIP, 16908357, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_PRESS_AND_HOLD;
        if (Build$VERSION.SDK_INT >= 30) {
            action_PRESS_AND_HOLD = AccessibilityNodeInfo$AccessibilityAction.ACTION_PRESS_AND_HOLD;
        }
        else {
            action_PRESS_AND_HOLD = null;
        }
        new aol(action_PRESS_AND_HOLD, 16908362, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_IME_ENTER;
        if (Build$VERSION.SDK_INT >= 30) {
            action_IME_ENTER = AccessibilityNodeInfo$AccessibilityAction.ACTION_IME_ENTER;
        }
        else {
            action_IME_ENTER = null;
        }
        new aol(action_IME_ENTER, 16908372, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_DRAG_START;
        if (Build$VERSION.SDK_INT >= 32) {
            action_DRAG_START = AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_START;
        }
        else {
            action_DRAG_START = null;
        }
        new aol(action_DRAG_START, 16908373, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_DRAG_DROP;
        if (Build$VERSION.SDK_INT >= 32) {
            action_DRAG_DROP = AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_DROP;
        }
        else {
            action_DRAG_DROP = null;
        }
        new aol(action_DRAG_DROP, 16908374, null, null, null);
        AccessibilityNodeInfo$AccessibilityAction action_DRAG_CANCEL;
        if (Build$VERSION.SDK_INT >= 32) {
            action_DRAG_CANCEL = AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        else {
            action_DRAG_CANCEL = null;
        }
        new aol(action_DRAG_CANCEL, 16908375, null, null, null);
        Object action_SHOW_TEXT_SUGGESTIONS = o;
        if (Build$VERSION.SDK_INT >= 33) {
            action_SHOW_TEXT_SUGGESTIONS = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        }
        new aol(action_SHOW_TEXT_SUGGESTIONS, 16908376, null, null, null);
    }
    
    public aol(final int n, final CharSequence charSequence) {
        this(null, n, charSequence, null, null);
    }
    
    private aol(final int n, final Class clazz) {
        this(null, n, null, null, clazz);
    }
    
    public aol(final Object o, final int l, final CharSequence charSequence, final apb n, final Class m) {
        this.l = l;
        this.n = n;
        Object k = o;
        if (o == null) {
            k = new AccessibilityNodeInfo$AccessibilityAction(l, charSequence);
        }
        this.k = k;
        this.m = m;
    }
    
    public final int a() {
        return ((AccessibilityNodeInfo$AccessibilityAction)this.k).getId();
    }
    
    public final CharSequence b() {
        return ((AccessibilityNodeInfo$AccessibilityAction)this.k).getLabel();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof aol && this.k.equals(((aol)o).k);
    }
    
    @Override
    public final int hashCode() {
        return this.k.hashCode();
    }
}
