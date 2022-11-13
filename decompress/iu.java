import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ActionProvider;
import android.content.Context;
import java.lang.reflect.Method;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iu extends id implements MenuItem
{
    public final aje d;
    public Method e;
    
    public iu(final Context context, final aje d) {
        super(context);
        if (d != null) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }
    
    public final boolean expandActionView() {
        return this.d.expandActionView();
    }
    
    public final ActionProvider getActionProvider() {
        final akx a = this.d.a();
        if (a instanceof ip) {
            return ((ip)a).a;
        }
        return null;
    }
    
    public final View getActionView() {
        View actionView;
        final View view = actionView = this.d.getActionView();
        if (view instanceof ir) {
            actionView = (View)((ir)view).a;
        }
        return actionView;
    }
    
    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }
    
    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }
    
    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }
    
    public final int getGroupId() {
        return this.d.getGroupId();
    }
    
    public final Drawable getIcon() {
        return this.d.getIcon();
    }
    
    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }
    
    public final PorterDuff$Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }
    
    public final Intent getIntent() {
        return this.d.getIntent();
    }
    
    public final int getItemId() {
        return this.d.getItemId();
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }
    
    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }
    
    public final int getOrder() {
        return this.d.getOrder();
    }
    
    public final SubMenu getSubMenu() {
        return this.b(this.d.getSubMenu());
    }
    
    public final CharSequence getTitle() {
        return this.d.getTitle();
    }
    
    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }
    
    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }
    
    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }
    
    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }
    
    public final boolean isCheckable() {
        return this.d.isCheckable();
    }
    
    public final boolean isChecked() {
        return this.d.isChecked();
    }
    
    public final boolean isEnabled() {
        return this.d.isEnabled();
    }
    
    public final boolean isVisible() {
        return this.d.isVisible();
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        final iq iq = new iq(this, actionProvider);
        Object o;
        if (actionProvider != null) {
            o = iq;
        }
        else {
            o = null;
        }
        this.d.c((akx)o);
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final int actionView) {
        this.d.setActionView(actionView);
        final View actionView2 = this.d.getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            this.d.setActionView((View)new ir(actionView2));
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final View view) {
        Object actionView = view;
        if (view instanceof CollapsibleActionView) {
            actionView = new ir(view);
        }
        this.d.setActionView((View)actionView);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        this.d.setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.d.setAlphabeticShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean checkable) {
        this.d.setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean checked) {
        this.d.setChecked(checked);
        return (MenuItem)this;
    }
    
    public final MenuItem setContentDescription(final CharSequence charSequence) {
        this.d.b(charSequence);
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean enabled) {
        this.d.setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int icon) {
        this.d.setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable icon) {
        this.d.setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintList(final ColorStateList iconTintList) {
        this.d.setIconTintList(iconTintList);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintMode(final PorterDuff$Mode iconTintMode) {
        this.d.setIconTintMode(iconTintMode);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent intent) {
        this.d.setIntent(intent);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char numericShortcut) {
        this.d.setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c, final int n) {
        this.d.setNumericShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        final aje d = this.d;
        Object onActionExpandListener;
        if (menuItem$OnActionExpandListener != null) {
            onActionExpandListener = new is(this, menuItem$OnActionExpandListener);
        }
        else {
            onActionExpandListener = null;
        }
        d.setOnActionExpandListener((MenuItem$OnActionExpandListener)onActionExpandListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        final aje d = this.d;
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new it(this, menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        d.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.d.setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.d.setShortcut(c, c2, n, n2);
        return (MenuItem)this;
    }
    
    public final void setShowAsAction(final int showAsAction) {
        this.d.setShowAsAction(showAsAction);
    }
    
    public final MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        this.d.setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int title) {
        this.d.setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence title) {
        this.d.setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        this.d.setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public final MenuItem setTooltipText(final CharSequence charSequence) {
        this.d.d(charSequence);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean visible) {
        final aje d = this.d;
        d.setVisible(visible);
        return (MenuItem)d;
    }
}
