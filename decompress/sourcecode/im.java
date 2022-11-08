import android.util.SparseArray;
import android.os.Bundle;
import java.util.Collection;
import android.view.KeyCharacterMap$KeyData;
import android.view.KeyEvent;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.view.SubMenu;
import android.view.MenuItem;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class im implements ajc
{
    private static final int[] k;
    public final Context a;
    public ik b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public final CopyOnWriteArrayList h;
    public io i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private final boolean n;
    private final ArrayList o;
    private boolean p;
    private final ArrayList q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    
    static {
        k = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public im(final Context a) {
        final boolean b = false;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = new ArrayList();
        this.h = new CopyOnWriteArrayList();
        this.y = false;
        this.a = a;
        final Resources resources = a.getResources();
        this.l = resources;
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.p = true;
        this.d = new ArrayList();
        this.q = new ArrayList();
        this.r = true;
        boolean n = b;
        Label_0210: {
            if (resources.getConfiguration().keyboard != 1) {
                final ViewConfiguration value = ViewConfiguration.get(a);
                if (Build$VERSION.SDK_INT >= 28) {
                    n = b;
                    if (!anc.b(value)) {
                        break Label_0210;
                    }
                }
                else {
                    final Resources resources2 = a.getResources();
                    final int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                    n = b;
                    if (identifier == 0) {
                        break Label_0210;
                    }
                    n = b;
                    if (!resources2.getBoolean(identifier)) {
                        break Label_0210;
                    }
                }
                n = true;
            }
        }
        this.n = n;
    }
    
    private final void E(final int n, final boolean b) {
        if (n >= 0) {
            if (n < this.c.size()) {
                this.c.remove(n);
                if (b) {
                    this.l(true);
                }
            }
        }
    }
    
    public final boolean A(final MenuItem menuItem, iz iz, final int n) {
        final io io = (io)menuItem;
        if (io != null) {
            if (io.isEnabled()) {
                final boolean n2 = io.n();
                final akw o = io.o;
                final boolean b = o != null && o.c();
                boolean b2;
                if (io.m()) {
                    b2 = (n2 | io.expandActionView());
                    if (b2) {
                        this.i(true);
                        return true;
                    }
                }
                else if (!io.hasSubMenu() && !b) {
                    if ((n & 0x1) == 0x0) {
                        this.i(true);
                        return n2;
                    }
                    b2 = n2;
                }
                else {
                    if ((n & 0x4) == 0x0) {
                        this.i(false);
                    }
                    if (!io.hasSubMenu()) {
                        io.l(new jg(this.a, this, io));
                    }
                    final jg k = io.k;
                    if (b) {
                        o.b((SubMenu)k);
                    }
                    boolean b3;
                    if (this.h.isEmpty()) {
                        b3 = false;
                    }
                    else {
                        boolean g = iz != null && iz.g(k);
                        final Iterator iterator = this.h.iterator();
                        while (true) {
                            b3 = g;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final WeakReference weakReference = (WeakReference)iterator.next();
                            iz = (iz)weakReference.get();
                            if (iz == null) {
                                this.h.remove(weakReference);
                            }
                            else {
                                if (g) {
                                    continue;
                                }
                                g = iz.g(k);
                            }
                        }
                    }
                    b2 = (n2 | b3);
                    if (!b2) {
                        this.i(true);
                        return false;
                    }
                }
                return b2;
            }
        }
        return false;
    }
    
    final void B() {
        this.l(this.r = true);
    }
    
    final void C() {
        this.l(this.p = true);
    }
    
    public final void D() {
        this.s = 1;
    }
    
    public im a() {
        return this;
    }
    
    public final MenuItem add(final int n) {
        return this.c(0, 0, 0, this.l.getString(n));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.c(n, n2, n3, this.l.getString(n4));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.c(n, n2, n3, charSequence);
    }
    
    public final MenuItem add(final CharSequence charSequence) {
        return this.c(0, 0, 0, charSequence);
    }
    
    public final int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, final int n4, final MenuItem[] array2) {
        final PackageManager packageManager = this.a.getPackageManager();
        final int n5 = 0;
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        int i = n5;
        if ((n4 & 0x1) == 0x0) {
            this.removeGroup(n);
            i = n5;
        }
        while (i < size) {
            final ResolveInfo resolveInfo = queryIntentActivityOptions.get(i);
            Intent intent2;
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[resolveInfo.specificIndex];
            }
            final Intent e = new Intent(intent2);
            e.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            final MenuItem c = this.c(n, n2, n3, resolveInfo.loadLabel(packageManager));
            c.setIcon(resolveInfo.loadIcon(packageManager));
            ((io)c).e = e;
            if (array2 != null && resolveInfo.specificIndex >= 0) {
                array2[resolveInfo.specificIndex] = c;
            }
            ++i;
        }
        return size;
    }
    
    public final SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.l.getString(n));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.l.getString(n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final MenuItem c = this.c(n, n2, n3, charSequence);
        final Context a = this.a;
        final io io = (io)c;
        final jg jg = new jg(a, this, io);
        io.l(jg);
        return (SubMenu)jg;
    }
    
    public final SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    final io b(final int n, final KeyEvent keyEvent) {
        final ArrayList x = this.x;
        x.clear();
        this.j(x, n, keyEvent);
        if (x.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = x.size();
        if (size == 1) {
            return (io)x.get(0);
        }
        final boolean x2 = this.x();
        for (int i = 0; i < size; ++i) {
            final io io = x.get(i);
            char c;
            if (x2) {
                c = io.h;
            }
            else {
                c = io.f;
            }
            if ((c == keyCharacterMap$KeyData.meta[0] && (metaState & 0x2) == 0x0) || (c == keyCharacterMap$KeyData.meta[2] && (metaState & 0x2) != 0x0) || (x2 && c == '\b' && n == 67)) {
                return io;
            }
        }
        return null;
    }
    
    protected final MenuItem c(int size, int n, final int n2, final CharSequence charSequence) {
        final int n3 = n2 >> 16;
        if (n3 >= 0 && n3 < 6) {
            final int n4 = im.k[n3] << 16 | (char)n2;
            final io io = new io(this, size, n, n2, n4, charSequence, this.s);
            final ArrayList c = this.c;
            size = c.size();
            while (true) {
                do {
                    n = size - 1;
                    if (n < 0) {
                        size = 0;
                        c.add(size, io);
                        this.l(true);
                        return (MenuItem)io;
                    }
                    size = n;
                } while (((io)c.get(n)).c > n4);
                size = n + 1;
                continue;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    public final void clear() {
        final io i = this.i;
        if (i != null) {
            this.t(i);
        }
        this.c.clear();
        this.l(true);
    }
    
    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        this.l(false);
    }
    
    public final void close() {
        this.i(true);
    }
    
    protected String d() {
        return "android:menu:actionviewstates";
    }
    
    public final ArrayList e() {
        this.k();
        return this.q;
    }
    
    public final ArrayList f() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final io io = this.c.get(i);
            if (io.isVisible()) {
                this.o.add(io);
            }
        }
        this.p = false;
        this.r = true;
        return this.o;
    }
    
    public final MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final io io = this.c.get(i);
            if (io.a == n) {
                return (MenuItem)io;
            }
            if (io.hasSubMenu()) {
                final MenuItem item = ((SubMenu)io.k).findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public final void g(final iz iz) {
        this.h(iz, this.a);
    }
    
    public final MenuItem getItem(final int n) {
        return this.c.get(n);
    }
    
    public final void h(final iz iz, final Context context) {
        this.h.add(new WeakReference(iz));
        iz.c(context, this);
        this.r = true;
    }
    
    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (((io)this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public final void i(final boolean b) {
        if (this.w) {
            return;
        }
        this.w = true;
        for (final WeakReference weakReference : this.h) {
            final iz iz = (iz)weakReference.get();
            if (iz == null) {
                this.h.remove(weakReference);
            }
            else {
                iz.d(this, b);
            }
        }
        this.w = false;
    }
    
    public final boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.b(n, keyEvent) != null;
    }
    
    final void j(final List list, final int n, final KeyEvent keyEvent) {
        final boolean x = this.x();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final io io = this.c.get(i);
            if (io.hasSubMenu()) {
                ((im)io.k).j(list, n, keyEvent);
            }
            char c;
            if (x) {
                c = io.h;
            }
            else {
                c = io.f;
            }
            int n2;
            if (x) {
                n2 = io.i;
            }
            else {
                n2 = io.g;
            }
            if ((modifiers & 0x1100F) == (n2 & 0x1100F) && c != '\0' && (c == keyCharacterMap$KeyData.meta[0] || c == keyCharacterMap$KeyData.meta[2] || (x && c == '\b' && n == 67)) && io.isEnabled()) {
                list.add(io);
            }
        }
    }
    
    public final void k() {
        final ArrayList f = this.f();
        if (!this.r) {
            return;
        }
        final Iterator iterator = this.h.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference weakReference = (WeakReference)iterator.next();
            final iz iz = (iz)weakReference.get();
            if (iz == null) {
                this.h.remove(weakReference);
            }
            else {
                b |= iz.f();
            }
        }
        if (b) {
            this.d.clear();
            this.q.clear();
            for (int size = f.size(), i = 0; i < size; ++i) {
                final io io = f.get(i);
                if (io.o()) {
                    this.d.add(io);
                }
                else {
                    this.q.add(io);
                }
            }
        }
        else {
            this.d.clear();
            this.q.clear();
            this.q.addAll(this.f());
        }
        this.r = false;
    }
    
    public void l(final boolean b) {
        if (!this.t) {
            if (b) {
                this.p = true;
                this.r = true;
            }
            if (!this.h.isEmpty()) {
                this.s();
                for (final WeakReference weakReference : this.h) {
                    final iz iz = (iz)weakReference.get();
                    if (iz == null) {
                        this.h.remove(weakReference);
                    }
                    else {
                        iz.j();
                    }
                }
                this.r();
            }
        }
        else {
            this.u = true;
            if (b) {
                this.v = true;
            }
        }
    }
    
    public final void m(final iz iz) {
        for (final WeakReference weakReference : this.h) {
            final iz iz2 = (iz)weakReference.get();
            if (iz2 == null || iz2 == iz) {
                this.h.remove(weakReference);
            }
        }
    }
    
    public final void n(final Bundle bundle) {
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.d());
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((im)item.getSubMenu()).n(bundle);
            }
        }
        final int int1 = bundle.getInt("android:menu:expandedactionview");
        if (int1 > 0) {
            final MenuItem item2 = this.findItem(int1);
            if (item2 != null) {
                item2.expandActionView();
            }
        }
    }
    
    public final void o(final Bundle bundle) {
        final int size = this.size();
        SparseArray sparseArray = null;
        SparseArray sparseArray2;
        for (int i = 0; i < size; ++i, sparseArray = sparseArray2) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            sparseArray2 = sparseArray;
            if (actionView != null) {
                sparseArray2 = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray sparseArray3;
                    if ((sparseArray3 = sparseArray) == null) {
                        sparseArray3 = new SparseArray();
                    }
                    actionView.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (item.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((im)item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.d(), sparseArray);
        }
    }
    
    public void p(final ik b) {
        this.b = b;
    }
    
    public final boolean performIdentifierAction(final int n, final int n2) {
        return this.z(this.findItem(n), n2);
    }
    
    public final boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final io b = this.b(n, keyEvent);
        final boolean b2 = b != null && this.z((MenuItem)b, n2);
        if ((n2 & 0x2) != 0x0) {
            this.i(true);
        }
        return b2;
    }
    
    public final void q(final int n, final CharSequence e, final int n2, final Drawable f, final View g) {
        final Resources l = this.l;
        if (g != null) {
            this.g = g;
            this.e = null;
            this.f = null;
        }
        else {
            if (n > 0) {
                this.e = l.getText(n);
            }
            else if (e != null) {
                this.e = e;
            }
            if (n2 > 0) {
                this.f = agw.a(this.a, n2);
            }
            else if (f != null) {
                this.f = f;
            }
            this.g = null;
        }
        this.l(false);
    }
    
    public final void r() {
        this.t = false;
        if (this.u) {
            this.u = false;
            this.l(this.v);
        }
    }
    
    public final void removeGroup(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                final int n2 = i;
                if (((io)this.c.get(i)).b == n) {
                    if (n2 >= 0) {
                        for (int size2 = this.c.size(), n3 = 0; n3 < size2 - n2 && this.c.get(n2).b == n; ++n3) {
                            this.E(n2, false);
                        }
                        this.l(true);
                    }
                    return;
                }
            }
            final int n2 = -1;
            continue;
        }
    }
    
    public final void removeItem(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (((io)this.c.get(i)).a == n) {
                    this.E(i, true);
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public final void s() {
        if (!this.t) {
            this.t = true;
            this.u = false;
            this.v = false;
        }
    }
    
    public final void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final io io = this.c.get(i);
            if (io.b == n) {
                io.j(b);
                io.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupDividerEnabled(final boolean y) {
        this.y = y;
    }
    
    public final void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final io io = this.c.get(i);
            if (io.b == n) {
                io.setEnabled(enabled);
            }
        }
    }
    
    public final void setGroupVisible(final int n, final boolean b) {
        final int size = this.c.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final io io = this.c.get(i);
            int n3 = n2;
            if (io.b == n) {
                n3 = n2;
                if (io.s(b)) {
                    n3 = 1;
                }
            }
            ++i;
            n2 = n3;
        }
        if (n2 != 0) {
            this.l(true);
        }
    }
    
    public void setQwertyMode(final boolean m) {
        this.m = m;
        this.l(false);
    }
    
    public final int size() {
        return this.c.size();
    }
    
    public boolean t(final io io) {
        final boolean empty = this.h.isEmpty();
        final boolean b = false;
        final int n = 0;
        boolean b2 = b;
        if (!empty) {
            if (this.i != io) {
                b2 = b;
            }
            else {
                this.s();
                final Iterator iterator = this.h.iterator();
                boolean h = n != 0;
                boolean b3;
                while (true) {
                    b3 = h;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final WeakReference weakReference = (WeakReference)iterator.next();
                    final iz iz = (iz)weakReference.get();
                    if (iz == null) {
                        this.h.remove(weakReference);
                    }
                    else {
                        b3 = (h = iz.h(io));
                        if (b3) {
                            break;
                        }
                        continue;
                    }
                }
                this.r();
                b2 = b3;
                if (b3) {
                    this.i = null;
                    b2 = b3;
                }
            }
        }
        return b2;
    }
    
    public boolean u(final im im, final MenuItem menuItem) {
        final ik b = this.b;
        return b != null && b.Y(im, menuItem);
    }
    
    public boolean v(final io i) {
        final boolean empty = this.h.isEmpty();
        boolean j = false;
        if (empty) {
            return false;
        }
        this.s();
        final Iterator iterator = this.h.iterator();
        boolean b;
        while (true) {
            b = j;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference weakReference = (WeakReference)iterator.next();
            final iz iz = (iz)weakReference.get();
            if (iz == null) {
                this.h.remove(weakReference);
            }
            else {
                b = (j = iz.i(i));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.r();
        if (b) {
            this.i = i;
        }
        return b;
    }
    
    public boolean w() {
        return this.y;
    }
    
    public boolean x() {
        return this.m;
    }
    
    public boolean y() {
        return this.n;
    }
    
    public final boolean z(final MenuItem menuItem, final int n) {
        return this.A(menuItem, null, n);
    }
}
