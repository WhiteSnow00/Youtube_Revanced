import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.ComponentName;
import android.content.res.Configuration;
import android.content.Intent;
import android.view.MenuInflater;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.KeyEvent;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public class fa extends bu implements fb, agt
{
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private fe mDelegate;
    private Resources mResources;
    
    public fa() {
        this.initDelegate();
    }
    
    public fa(final int n) {
        super(n);
        this.initDelegate();
    }
    
    private void initDelegate() {
        ((qt)this).getSavedStateRegistry().c("androidx:appcompat", (cgh)new cb(this, 2));
        ((qt)this).addOnContextAvailableListener((rc)new ez(this));
    }
    
    private void initViewTreeOwners() {
        di.f(this.getWindow().getDecorView(), (aun)this);
        di.e(this.getWindow().getDecorView(), (avv)this);
        cax.c(this.getWindow().getDecorView(), (cgk)this);
        kp.b(this.getWindow().getDecorView(), (ra)this);
    }
    
    private boolean performMenuItemShortcut(final KeyEvent keyEvent) {
        return false;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().l(view, viewGroup$LayoutParams);
    }
    
    protected void attachBaseContext(final Context context) {
        super.attachBaseContext(this.getDelegate().b(context));
    }
    
    public void closeOptionsMenu() {
        final ep supportActionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.s())) {
            super.closeOptionsMenu();
        }
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final ep supportActionBar = this.getSupportActionBar();
        return (keyCode == 82 && supportActionBar != null && supportActionBar.w(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }
    
    public View findViewById(final int n) {
        return this.getDelegate().j(n);
    }
    
    public fe getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = fe.f((Activity)this, (fb)this);
        }
        return this.mDelegate;
    }
    
    public eq getDrawerToggleDelegate() {
        return this.getDelegate().e();
    }
    
    public MenuInflater getMenuInflater() {
        return this.getDelegate().i();
    }
    
    public Resources getResources() {
        Resources resources;
        if ((resources = this.mResources) == null) {
            resources = super.getResources();
        }
        return resources;
    }
    
    public ep getSupportActionBar() {
        return this.getDelegate().d();
    }
    
    public Intent getSupportParentActivityIntent() {
        return sy.c((Activity)this);
    }
    
    public void invalidateOptionsMenu() {
        this.getDelegate().n();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.getDelegate().I();
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }
    
    public void onContentChanged() {
        this.onSupportContentChanged();
    }
    
    public void onCreateSupportNavigateUpTaskStack(final agu agu) {
        Intent intent;
        if ((intent = this.getSupportParentActivityIntent()) == null) {
            intent = sy.c((Activity)this);
        }
        if (intent != null) {
            ComponentName componentName;
            if ((componentName = intent.getComponent()) == null) {
                componentName = intent.resolveActivity(agu.b.getPackageManager());
            }
            agu.c(componentName);
            agu.b(intent);
        }
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.getDelegate().o();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return super.onKeyDown(n, keyEvent);
    }
    
    protected void onLocalesChanged(final ajp ajp) {
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        final ep supportActionBar = this.getSupportActionBar();
        return menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.a() & 0x4) != 0x0 && this.onSupportNavigateUp();
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return super.onMenuOpened(n, menu);
    }
    
    protected void onNightModeChanged(final int n) {
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        super.onPanelClosed(n, menu);
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.getDelegate().G();
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.getDelegate().p();
    }
    
    public void onPrepareSupportNavigateUpTaskStack(final agu agu) {
    }
    
    protected void onStart() {
        super.onStart();
        this.getDelegate().q();
    }
    
    protected void onStop() {
        super.onStop();
        this.getDelegate().r();
    }
    
    public void onSupportActionModeFinished(final hm hm) {
    }
    
    public void onSupportActionModeStarted(final hm hm) {
    }
    
    @Deprecated
    public void onSupportContentChanged() {
    }
    
    public boolean onSupportNavigateUp() {
        final Intent supportParentActivityIntent = this.getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (this.supportShouldUpRecreateTask(supportParentActivityIntent)) {
                final agu a = agu.a((Context)this);
                this.onCreateSupportNavigateUpTaskStack(a);
                this.onPrepareSupportNavigateUpTaskStack(a);
                if (a.a.isEmpty()) {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
                final Intent[] array = a.a.toArray(new Intent[0]);
                array[0] = new Intent(array[0]).addFlags(268484608);
                agv.a(a.b, array, (Bundle)null);
                try {
                    aeo.a((Activity)this);
                }
                catch (final IllegalStateException ex) {
                    this.finish();
                }
            }
            else {
                this.supportNavigateUpTo(supportParentActivityIntent);
            }
            return true;
        }
        return false;
    }
    
    protected void onTitleChanged(final CharSequence charSequence, final int n) {
        super.onTitleChanged(charSequence, n);
        this.getDelegate().z(charSequence);
    }
    
    public hm onWindowStartingSupportActionMode(final hl hl) {
        return null;
    }
    
    public void openOptionsMenu() {
        final ep supportActionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.x())) {
            super.openOptionsMenu();
        }
    }
    
    public void setContentView(final int n) {
        this.initViewTreeOwners();
        this.getDelegate().t(n);
    }
    
    public void setContentView(final View view) {
        this.initViewTreeOwners();
        this.getDelegate().u(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().v(view, viewGroup$LayoutParams);
    }
    
    public void setSupportActionBar(final Toolbar toolbar) {
        this.getDelegate().x(toolbar);
    }
    
    @Deprecated
    public void setSupportProgress(final int n) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminate(final boolean b) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(final boolean b) {
    }
    
    @Deprecated
    public void setSupportProgressBarVisibility(final boolean b) {
    }
    
    public void setTheme(final int theme) {
        super.setTheme(theme);
        this.getDelegate().y(theme);
    }
    
    public hm startSupportActionMode(final hl hl) {
        return this.getDelegate().h(hl);
    }
    
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().n();
    }
    
    public void supportNavigateUpTo(final Intent intent) {
        afg.b((Activity)this, intent);
    }
    
    public boolean supportRequestWindowFeature(final int n) {
        return this.getDelegate().C(n);
    }
    
    public boolean supportShouldUpRecreateTask(final Intent intent) {
        return afg.c((Activity)this, intent);
    }
}
