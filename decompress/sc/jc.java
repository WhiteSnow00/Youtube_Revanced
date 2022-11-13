import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import android.content.Context;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

public class jc extends id implements Menu
{
    private final ajd d;
    
    public jc(final Context context, final ajd d) {
        super(context);
        if (d != null) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public final MenuItem add(final int n) {
        return this.a(this.d.add(n));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.a(this.d.add(n, n2, n3, n4));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(this.d.add(n, n2, n3, charSequence));
    }
    
    public final MenuItem add(final CharSequence charSequence) {
        return this.a(this.d.add(charSequence));
    }
    
    public final int addIntentOptions(int i, int addIntentOptions, final int n, final ComponentName componentName, final Intent[] array, final Intent intent, final int n2, final MenuItem[] array2) {
        MenuItem[] array3;
        if (array2 != null) {
            array3 = new MenuItem[array2.length];
        }
        else {
            array3 = null;
        }
        addIntentOptions = this.d.addIntentOptions(i, addIntentOptions, n, componentName, array, intent, n2, array3);
        if (array3 != null) {
            for (i = 0; i < array3.length; ++i) {
                array2[i] = this.a(array3[i]);
            }
        }
        return addIntentOptions;
    }
    
    public final SubMenu addSubMenu(final int n) {
        return this.b(this.d.addSubMenu(n));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.b(this.d.addSubMenu(n, n2, n3, n4));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.b(this.d.addSubMenu(n, n2, n3, charSequence));
    }
    
    public final SubMenu addSubMenu(final CharSequence charSequence) {
        return this.b(this.d.addSubMenu(charSequence));
    }
    
    public final void clear() {
        final abo b = super.b;
        if (b != null) {
            b.clear();
        }
        final abo c = super.c;
        if (c != null) {
            c.clear();
        }
        this.d.clear();
    }
    
    public final void close() {
        this.d.close();
    }
    
    public final MenuItem findItem(final int n) {
        return this.a(this.d.findItem(n));
    }
    
    public final MenuItem getItem(final int n) {
        return this.a(this.d.getItem(n));
    }
    
    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }
    
    public final boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.d.isShortcutKey(n, keyEvent);
    }
    
    public final boolean performIdentifierAction(final int n, final int n2) {
        return this.d.performIdentifierAction(n, n2);
    }
    
    public final boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        return this.d.performShortcut(n, keyEvent, n2);
    }
    
    public final void removeGroup(final int n) {
        if (super.b != null) {
            int n2 = 0;
            while (true) {
                final abo b = super.b;
                if (n2 >= b.d) {
                    break;
                }
                int n3 = n2;
                if (((aje)b.c(n2)).getGroupId() == n) {
                    super.b.d(n2);
                    n3 = n2 - 1;
                }
                n2 = n3 + 1;
            }
        }
        this.d.removeGroup(n);
    }
    
    public final void removeItem(final int n) {
        if (super.b != null) {
            int n2 = 0;
            while (true) {
                final abo b = super.b;
                if (n2 >= b.d) {
                    break;
                }
                if (((aje)b.c(n2)).getItemId() == n) {
                    super.b.d(n2);
                    break;
                }
                ++n2;
            }
        }
        this.d.removeItem(n);
    }
    
    public final void setGroupCheckable(final int n, final boolean b, final boolean b2) {
        this.d.setGroupCheckable(n, b, b2);
    }
    
    public final void setGroupEnabled(final int n, final boolean b) {
        this.d.setGroupEnabled(n, b);
    }
    
    public final void setGroupVisible(final int n, final boolean b) {
        this.d.setGroupVisible(n, b);
    }
    
    public final void setQwertyMode(final boolean qwertyMode) {
        this.d.setQwertyMode(qwertyMode);
    }
    
    public final int size() {
        return this.d.size();
    }
}
