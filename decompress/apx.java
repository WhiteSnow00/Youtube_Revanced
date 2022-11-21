import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.text.Editable;
import android.content.pm.ResolveInfo;
import android.app.Activity;
import java.util.ArrayList;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ActionMode;
import android.content.Intent;
import java.lang.reflect.Method;
import android.widget.TextView;
import android.view.ActionMode$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class apx implements ActionMode$Callback
{
    public final ActionMode$Callback a;
    private final TextView b;
    private Class c;
    private Method d;
    private boolean e;
    private boolean f;
    
    public apx(final ActionMode$Callback a, final TextView b) {
        this.a = a;
        this.b = b;
        this.f = false;
    }
    
    private static final Intent a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
    
    public final boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }
    
    public final boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }
    
    public final void onDestroyActionMode(final ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }
    
    public final boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        final Context context = this.b.getContext();
        final PackageManager packageManager = context.getPackageManager();
        if (!this.f) {
            this.f = true;
            try {
                final Class<?> forName = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.c = forName;
                this.d = forName.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.e = true;
            }
            catch (final ClassNotFoundException | NoSuchMethodException ex) {
                this.c = null;
                this.d = null;
                this.e = false;
            }
        }
        try {
            Method method;
            if (this.e && this.c.isInstance(menu)) {
                method = this.d;
            }
            else {
                method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            int size = menu.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final MenuItem item = menu.getItem(n);
                size = n;
                if (item.getIntent() == null) {
                    continue;
                }
                size = n;
                if (!"android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    continue;
                }
                method.invoke(menu, n);
                size = n;
            }
            final ArrayList list = new ArrayList();
            if (context instanceof Activity) {
                for (final ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        if (!resolveInfo.activityInfo.exported || (resolveInfo.activityInfo.permission != null && context.checkSelfPermission(resolveInfo.activityInfo.permission) != 0)) {
                            continue;
                        }
                    }
                    list.add(resolveInfo);
                }
            }
            for (int i = 0; i < list.size(); ++i) {
                final ResolveInfo resolveInfo2 = (ResolveInfo)list.get(i);
                final MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                final TextView b = this.b;
                add.setIntent(a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", (b instanceof Editable && b.onCheckIsTextEditor() && b.isEnabled()) ^ true).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
            }
            return this.a.onPrepareActionMode(actionMode, menu);
        }
        catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex2) {
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }
}
