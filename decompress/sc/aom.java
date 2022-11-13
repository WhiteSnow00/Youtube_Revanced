import android.text.Spannable;
import android.os.Build$VERSION;
import java.util.Collections;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aom
{
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;
    
    private aom(final AccessibilityNodeInfo a) {
        this.b = -1;
        this.c = -1;
        this.a = a;
    }
    
    private final List O(final String s) {
        ArrayList integerArrayList;
        if ((integerArrayList = this.a.getExtras().getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList();
            this.a.getExtras().putIntegerArrayList(s, integerArrayList);
        }
        return integerArrayList;
    }
    
    public static aom b() {
        return c(AccessibilityNodeInfo.obtain());
    }
    
    public static aom c(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return new aom(accessibilityNodeInfo);
    }
    
    public final void A(final CharSequence hintText) {
        this.a.setHintText(hintText);
    }
    
    public final void B(final View labelFor) {
        this.a.setLabelFor(labelFor);
    }
    
    public final void C(final View parent) {
        this.b = -1;
        this.a.setParent(parent);
    }
    
    public final void D(final boolean scrollable) {
        this.a.setScrollable(scrollable);
    }
    
    public final void E(final CharSequence text) {
        this.a.setText(text);
    }
    
    public final void F(final View traversalAfter) {
        this.a.setTraversalAfter(traversalAfter);
    }
    
    public final void G(final boolean visibleToUser) {
        this.a.setVisibleToUser(visibleToUser);
    }
    
    public final boolean H() {
        return this.a.isChecked();
    }
    
    public final boolean I() {
        return this.a.isEnabled();
    }
    
    public final boolean J() {
        return this.a.isFocusable();
    }
    
    public final boolean K() {
        return this.a.isPassword();
    }
    
    public final boolean L() {
        return this.a.isScrollable();
    }
    
    public final void M(final aol aol) {
        this.a.removeAction((AccessibilityNodeInfo$AccessibilityAction)aol.k);
    }
    
    public final void N() {
        this.a.setSelected(false);
    }
    
    public final Bundle a() {
        return this.a.getExtras();
    }
    
    public final CharSequence d() {
        return this.a.getClassName();
    }
    
    public final CharSequence e() {
        return this.a.getContentDescription();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof aom)) {
            return false;
        }
        final aom aom = (aom)o;
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            if (aom.a != null) {
                return false;
            }
        }
        else if (!a.equals((Object)aom.a)) {
            return false;
        }
        return this.c == aom.c && this.b == aom.b;
    }
    
    public final CharSequence f() {
        if (!this.O("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            final List o = this.O("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final List o2 = this.O("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final List o3 = this.O("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final List o4 = this.O("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            final CharSequence text = this.a.getText();
            final int length = this.a.getText().length();
            int i = 0;
            final SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring(text, 0, length));
            while (i < o.size()) {
                ((Spannable)spannableString).setSpan((Object)new aof((int)o4.get(i), this, this.a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)o.get(i), (int)o2.get(i), (int)o3.get(i));
                ++i;
            }
            return (CharSequence)spannableString;
        }
        return this.a.getText();
    }
    
    public final void g(final int n) {
        this.a.addAction(n);
    }
    
    public final void h(final aol aol) {
        this.a.addAction((AccessibilityNodeInfo$AccessibilityAction)aol.k);
    }
    
    @Override
    public final int hashCode() {
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Deprecated
    public final void i(final Rect rect) {
        this.a.getBoundsInParent(rect);
    }
    
    public final void j(final Rect rect) {
        this.a.getBoundsInScreen(rect);
    }
    
    public final void k(final boolean accessibilityFocused) {
        this.a.setAccessibilityFocused(accessibilityFocused);
    }
    
    public final void l(final int n, final boolean b) {
        final Bundle a = this.a();
        if (a != null) {
            final int int1 = a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n2 = n;
            if (!b) {
                n2 = 0;
            }
            a.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n2 | (int1 & ~n));
        }
    }
    
    @Deprecated
    public final void m(final Rect boundsInParent) {
        this.a.setBoundsInParent(boundsInParent);
    }
    
    public final void n(final Rect boundsInScreen) {
        this.a.setBoundsInScreen(boundsInScreen);
    }
    
    public final void o(final boolean checkable) {
        this.a.setCheckable(checkable);
    }
    
    public final void p(final boolean checked) {
        this.a.setChecked(checked);
    }
    
    public final void q(final CharSequence className) {
        this.a.setClassName(className);
    }
    
    public final void r(final boolean clickable) {
        this.a.setClickable(clickable);
    }
    
    public final void s(final Object o) {
        this.a.setCollectionInfo((AccessibilityNodeInfo$CollectionInfo)((bx)o).a);
    }
    
    public final void t(final Object o) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo$CollectionItemInfo)((bx)o).a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.i(rect);
        new StringBuilder("; boundsInParent: ").append(rect);
        sb.append("; boundsInParent: ".concat(rect.toString()));
        this.j(rect);
        new StringBuilder("; boundsInScreen: ").append(rect);
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(this.d());
        sb.append("; text: ");
        sb.append(this.f());
        sb.append("; contentDescription: ");
        sb.append(this.e());
        sb.append("; viewId: ");
        sb.append(this.a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        String s;
        if (aeo.g()) {
            s = this.a.getUniqueId();
        }
        else {
            s = this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(s);
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.H());
        sb.append("; focusable: ");
        sb.append(this.J());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.I());
        sb.append("; password: ");
        sb.append(this.K());
        final StringBuilder sb2 = new StringBuilder("; scrollable: ");
        sb2.append(this.L());
        sb.append(sb2.toString());
        sb.append("; [");
        final List actionList = this.a.getActionList();
        final int n = 0;
        int i;
        List<Object> emptyList;
        if (actionList != null) {
            final ArrayList list = new ArrayList();
            final int size = actionList.size();
            int n2 = 0;
            while (true) {
                i = n;
                emptyList = list;
                if (n2 >= size) {
                    break;
                }
                list.add(new aol(actionList.get(n2), 0, null, null, null));
                ++n2;
            }
        }
        else {
            emptyList = Collections.emptyList();
            i = n;
        }
        while (i < emptyList.size()) {
            final aol aol = emptyList.get(i);
            final int a = aol.a();
            String s2 = null;
            Label_1241: {
                if (a != 1) {
                    if (a != 2) {
                        switch (a) {
                            default: {
                                switch (a) {
                                    default: {
                                        switch (a) {
                                            default: {
                                                switch (a) {
                                                    default: {
                                                        s2 = "ACTION_UNKNOWN";
                                                        break Label_1241;
                                                    }
                                                    case 16908375: {
                                                        s2 = "ACTION_DRAG_CANCEL";
                                                        break Label_1241;
                                                    }
                                                    case 16908374: {
                                                        s2 = "ACTION_DRAG_DROP";
                                                        break Label_1241;
                                                    }
                                                    case 16908373: {
                                                        s2 = "ACTION_DRAG_START";
                                                        break Label_1241;
                                                    }
                                                    case 16908372: {
                                                        s2 = "ACTION_IME_ENTER";
                                                        break Label_1241;
                                                    }
                                                }
                                                break;
                                            }
                                            case 16908362: {
                                                s2 = "ACTION_PRESS_AND_HOLD";
                                                break Label_1241;
                                            }
                                            case 16908361: {
                                                s2 = "ACTION_PAGE_RIGHT";
                                                break Label_1241;
                                            }
                                            case 16908360: {
                                                s2 = "ACTION_PAGE_LEFT";
                                                break Label_1241;
                                            }
                                            case 16908359: {
                                                s2 = "ACTION_PAGE_DOWN";
                                                break Label_1241;
                                            }
                                            case 16908358: {
                                                s2 = "ACTION_PAGE_UP";
                                                break Label_1241;
                                            }
                                            case 16908357: {
                                                s2 = "ACTION_HIDE_TOOLTIP";
                                                break Label_1241;
                                            }
                                            case 16908356: {
                                                s2 = "ACTION_SHOW_TOOLTIP";
                                                break Label_1241;
                                            }
                                        }
                                        break;
                                    }
                                    case 16908349: {
                                        s2 = "ACTION_SET_PROGRESS";
                                        break Label_1241;
                                    }
                                    case 16908348: {
                                        s2 = "ACTION_CONTEXT_CLICK";
                                        break Label_1241;
                                    }
                                    case 16908347: {
                                        s2 = "ACTION_SCROLL_RIGHT";
                                        break Label_1241;
                                    }
                                    case 16908346: {
                                        s2 = "ACTION_SCROLL_DOWN";
                                        break Label_1241;
                                    }
                                    case 16908345: {
                                        s2 = "ACTION_SCROLL_LEFT";
                                        break Label_1241;
                                    }
                                    case 16908344: {
                                        s2 = "ACTION_SCROLL_UP";
                                        break Label_1241;
                                    }
                                    case 16908343: {
                                        s2 = "ACTION_SCROLL_TO_POSITION";
                                        break Label_1241;
                                    }
                                    case 16908342: {
                                        s2 = "ACTION_SHOW_ON_SCREEN";
                                        break Label_1241;
                                    }
                                }
                                break;
                            }
                            case 16908354: {
                                s2 = "ACTION_MOVE_WINDOW";
                                break;
                            }
                            case 2097152: {
                                s2 = "ACTION_SET_TEXT";
                                break;
                            }
                            case 524288: {
                                s2 = "ACTION_COLLAPSE";
                                break;
                            }
                            case 262144: {
                                s2 = "ACTION_EXPAND";
                                break;
                            }
                            case 131072: {
                                s2 = "ACTION_SET_SELECTION";
                                break;
                            }
                            case 65536: {
                                s2 = "ACTION_CUT";
                                break;
                            }
                            case 32768: {
                                s2 = "ACTION_PASTE";
                                break;
                            }
                            case 16384: {
                                s2 = "ACTION_COPY";
                                break;
                            }
                            case 8192: {
                                s2 = "ACTION_SCROLL_BACKWARD";
                                break;
                            }
                            case 4096: {
                                s2 = "ACTION_SCROLL_FORWARD";
                                break;
                            }
                            case 2048: {
                                s2 = "ACTION_PREVIOUS_HTML_ELEMENT";
                                break;
                            }
                            case 1024: {
                                s2 = "ACTION_NEXT_HTML_ELEMENT";
                                break;
                            }
                            case 512: {
                                s2 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                                break;
                            }
                            case 256: {
                                s2 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                                break;
                            }
                            case 128: {
                                s2 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                                break;
                            }
                            case 64: {
                                s2 = "ACTION_ACCESSIBILITY_FOCUS";
                                break;
                            }
                            case 32: {
                                s2 = "ACTION_LONG_CLICK";
                                break;
                            }
                            case 16: {
                                s2 = "ACTION_CLICK";
                                break;
                            }
                            case 8: {
                                s2 = "ACTION_CLEAR_SELECTION";
                                break;
                            }
                            case 4: {
                                s2 = "ACTION_SELECT";
                                break;
                            }
                        }
                    }
                    else {
                        s2 = "ACTION_CLEAR_FOCUS";
                    }
                }
                else {
                    s2 = "ACTION_FOCUS";
                }
            }
            String string = s2;
            if (s2.equals("ACTION_UNKNOWN")) {
                string = s2;
                if (aol.b() != null) {
                    string = aol.b().toString();
                }
            }
            sb.append(string);
            if (i != emptyList.size() - 1) {
                sb.append(", ");
            }
            ++i;
        }
        sb.append("]");
        return sb.toString();
    }
    
    public final void u(final CharSequence contentDescription) {
        this.a.setContentDescription(contentDescription);
    }
    
    public final void v(final boolean dismissable) {
        this.a.setDismissable(dismissable);
    }
    
    public final void w(final boolean enabled) {
        this.a.setEnabled(enabled);
    }
    
    public final void x(final boolean focusable) {
        this.a.setFocusable(focusable);
    }
    
    public final void y(final boolean focused) {
        this.a.setFocused(focused);
    }
    
    public final void z(final boolean heading) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.a.setHeading(heading);
            return;
        }
        this.l(2, heading);
    }
}
