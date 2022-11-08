// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.account.profilecard;

import android.content.Context;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class DefaultProfileCardController extends DialogFragmentController implements ete
{
    public final fyc a;
    public final wwv b;
    public final ohn c;
    public final vax d;
    private final Executor f;
    private final zki g;
    private final zjy h;
    private final bu i;
    private final vup j;
    private final adcr k;
    
    public DefaultProfileCardController(final bu i, final ohn c, final vax d, final vup j, final Executor f, final adcr k, final zki g, final fyc a, final wwv b, final zjy h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
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
    
    public final void g(final String s, final String s2, final String s3, final byte[] array, final etf etf) {
        final vup j = this.j;
        final addp d = ((vky)agnj.J((Context)j.a, (Class)vky.class, ((zjy)j.b).a(this.g.c()))).D();
        final vkx vkx = new vkx(this.k, ((eg)d.d).aq(), s, s2, s3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (array != null && array.length > 0) {
            ((vii)vkx).k(array);
        }
        else {
            ((vii)vkx).i();
        }
        if (etf != null) {
            final eth ak = etf.aK();
            tcp.k(d.w(vkx, this.f), this.f, (tcn)new etc(this, ak, 1), (tco)new erz(ak, 3));
            return;
        }
        tcp.k(d.w(vkx, this.f), this.f, (tcn)new etc(this, s3, 0), (tco)new exa(this, s3, 1));
    }
    
    public final void h(final String s, final String s2, final String s3, final boolean b, final aioe aioe) {
        final byte[] i = aioe.c.I();
        if (!b) {
            this.g(s, s2, s3, i, null);
            return;
        }
        tcp.n((aum)this.i, this.h.b(this.g.c()), (trb)etd.a, (trb)new slo(this, s, s2, s3, aioe, i, 1));
    }
}
