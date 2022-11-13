// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.account.profilecard;

import android.content.Context;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class DefaultProfileCardController extends DialogFragmentController implements eth
{
    public final fyk a;
    public final wyw b;
    public final oiu c;
    public final vcy d;
    private final Executor f;
    private final zmf g;
    private final zlv h;
    private final bu i;
    private final vwa j;
    private final aeea k;
    
    public DefaultProfileCardController(final bu i, final oiu c, final vcy d, final vwa j, final Executor f, final aeea k, final zmf g, final fyk a, final wyw b, final zlv h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(i, "DefaultProfileCardController");
        this.i = i;
        this.c = c;
        this.d = d;
        this.j = j;
        this.f = f;
        this.k = k;
        this.g = g;
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    public final void g(final String s, final String s2, final String s3, final byte[] array, final eti eti) {
        final vwa j = this.j;
        final adfq d = ((vnd)aefb.O((Context)j.a, (Class)vnd.class, ((zlv)j.b).a(this.g.c()))).D();
        final vnc vnc = new vnc(this.k, ((eg)d.d).ab(), s, s2, s3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (array != null && array.length > 0) {
            ((vkk)vnc).k(array);
        }
        else {
            ((vkk)vnc).i();
        }
        if (eti != null) {
            final etk ak = eti.aK();
            teu.k(d.w(vnc, this.f), this.f, (tes)new etf(this, ak, 1), (tet)new esc(ak, 3));
            return;
        }
        teu.k(d.w(vnc, this.f), this.f, (tes)new etf(this, s3, 0), (tet)new exe(this, s3, 1));
    }
    
    public final void h(final String s, final String s2, final String s3, final boolean b, final aiqj aiqj) {
        final byte[] i = aiqj.c.I();
        if (!b) {
            this.g(s, s2, s3, i, null);
            return;
        }
        teu.n((aun)this.i, this.h.b(this.g.c()), (ttg)etg.a, (ttg)new snt(this, s, s2, s3, aiqj, i, 1));
    }
}
