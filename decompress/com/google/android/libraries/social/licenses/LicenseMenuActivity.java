// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.social.licenses;

import android.view.MenuItem;
import android.os.Bundle;

public final class LicenseMenuActivity extends fa
{
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((qt)this).setContentView(2131624666);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().j(true);
        }
        final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
        if (!(supportFragmentManager.e(2131429535) instanceof qln)) {
            final qln qln = new qln();
            final ct i = supportFragmentManager.i();
            i.q(2131429535, (br)qln);
            i.d();
        }
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
