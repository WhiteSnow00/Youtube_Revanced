// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.tvsignin;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class MdxAssistedTvSignInDialogFragmentController extends DialogFragmentController
{
    public final xpe a;
    public final SharedPreferences b;
    public final oas c;
    public final int d;
    public final arhr f;
    public final arhr g;
    private final xpj h;
    
    public MdxAssistedTvSignInDialogFragmentController(final bu bu, final xpj h, final xpe a, final SharedPreferences b, final wzw wzw, final oas c, final arhr f, final arhr g) {
        super(bu, "MdxAssistedTvSignInDialogFragmentController");
        this.h = h;
        this.a = a;
        this.b = b;
        this.d = wzw.w;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public final void g() {
        final xpi g = this.h.g();
        if (g != null) {
            this.a.a(g.b, "canceled");
        }
        this.h.h();
    }
}
