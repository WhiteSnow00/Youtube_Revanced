// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.manualpairing;

import android.os.Bundle;
import android.content.Context;
import android.app.Activity;

public final class PairWithTvActivity extends xeb
{
    private int b;
    
    protected final int a() {
        return this.b;
    }
    
    protected final br b(final int n) {
        if (n == 0) {
            return (br)new xej();
        }
        if (n == 1) {
            return (br)new xen();
        }
        if (n == 2) {
            return (br)new xdz();
        }
        final StringBuilder sb = new StringBuilder("Unknown current index ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected final void e(final int n, final Activity activity) {
        if (n == 0) {
            activity.setTitle(2132018525);
            return;
        }
        if (n == 1) {
            activity.setTitle(2132018573);
            return;
        }
        if (n == 2) {
            activity.setTitle(2132018529);
            return;
        }
        final StringBuilder sb = new StringBuilder("Unknown current index ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected final boolean f(final int n, final br br) {
        if (n == 0) {
            return br instanceof xej;
        }
        if (n != 1) {
            return n == 2 && br instanceof xdz;
        }
        return br instanceof xen;
    }
    
    protected final boolean g(final int n) {
        final int b = this.b;
        if (n == b) {
            return false;
        }
        xkm.am((Context)this, (Class)PairWithTvActivity.class, b);
        return true;
    }
    
    protected final void onCreate(final Bundle bundle) {
        if (this.getIntent().getExtras() != null && this.getIntent().getExtras().getInt("useTvCode") == 1) {
            this.b = 1;
        }
        else {
            this.b = 0;
        }
        super.onCreate(bundle);
        final boolean booleanExtra = this.getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkTheme", false);
        if (this.getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkerColorPalette", false)) {
            int theme;
            if (!booleanExtra) {
                theme = 2132083344;
            }
            else {
                theme = 2132083343;
            }
            ((fa)this).setTheme(theme);
        }
        else {
            int theme2;
            if (!booleanExtra) {
                theme2 = 2132083341;
            }
            else {
                theme2 = 2132083342;
            }
            ((fa)this).setTheme(theme2);
        }
        ((fa)this).getSupportActionBar().j(true);
    }
}
