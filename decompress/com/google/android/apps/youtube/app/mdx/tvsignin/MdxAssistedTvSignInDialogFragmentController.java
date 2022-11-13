// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.tvsignin;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class MdxAssistedTvSignInDialogFragmentController extends DialogFragmentController
{
    public final xrd a;
    public final SharedPreferences b;
    public final oby c;
    public final int d;
    public final arkg f;
    public final arkg g;
    private final xri h;
    
    public MdxAssistedTvSignInDialogFragmentController(final bu bu, final xri h, final xrd a, final SharedPreferences b, final xbv xbv, final oby c, final arkg f, final arkg g) {
        super(bu, "MdxAssistedTvSignInDialogFragmentController");
        this.h = h;
        this.a = a;
        this.b = b;
        this.d = xbv.w;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public final void g() {
        final xrh g = this.h.g();
        if (g != null) {
            this.a.a(g.b, "canceled");
        }
        this.h.h();
    }
}
