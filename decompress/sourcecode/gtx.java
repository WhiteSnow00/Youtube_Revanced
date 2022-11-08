import android.app.AlertDialog$Builder;
import android.widget.TextView;
import android.widget.Button;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog;
import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtx
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    
    public gtx(final aaal a, final lht f, final zyj g, final hyc h, final vcf e, final zki d, final uyi c, final Executor b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.f = f;
        this.g = g;
        this.h = h;
        this.e = e;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public gtx(final Activity e, final vsc a, final tny b, final tdz c, final vax f, final addp d, final arud h, final aeby g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        f.getClass();
        this.f = f;
        d.getClass();
        this.d = d;
        this.h = h;
        this.g = g;
    }
    
    public gtx(final atjj f, final atjj b, final atjj c, final atjj a, final atjj g, final atjj d, final atjj e, final atjj h) {
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        h.getClass();
        this.h = h;
    }
    
    public gtx(final tox b, final tdz e, final vup d, final tny c, final zki a, final arud h, final vbq f, final Executor g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public final void a(final String s, final almd almd) {
        if (gkt.ar((arud)this.h)) {
            final String h = vek.h(62, s);
            final vdv c = ((vbq)this.f).a(((zki)this.a).c()).c();
            final allz d = alma.d(h);
            d.b(almd);
            c.j((vdj)d);
            c.b().U();
            return;
        }
        ((tdz)this.e).f((Object)new gfn(s, almd, false));
    }
    
    public final AlertDialog b(final String s) {
        return ((AlertDialog$Builder)((aeby)this.g).af((Context)this.e)).setMessage((CharSequence)((Activity)this.e).getString(2132017843)).setPositiveButton(2132017847, (DialogInterface$OnClickListener)new fbh(this, s, 3, (byte[])null)).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).create();
    }
    
    public final void c(final Button button, final boolean enabled) {
        button.setEnabled(enabled);
        if (enabled) {
            button.setTextColor(tmy.ct((Context)this.e, 2130970852).orElse(0));
            return;
        }
        button.setTextColor(tmy.ct((Context)this.e, 2130970865).orElse(0));
    }
    
    public final fwh d(final TextView textView) {
        final bu bu = (bu)((atjj)this.f).a();
        bu.getClass();
        final hmb hmb = (hmb)((atjj)this.b).a();
        hmb.getClass();
        final acts acts = (acts)((atjj)this.c).a();
        acts.getClass();
        final thh thh = (thh)((atjj)this.a).a();
        thh.getClass();
        final aeby aeby = (aeby)((atjj)this.g).a();
        aeby.getClass();
        final zoj zoj = (zoj)((atjj)this.d).a();
        zoj.getClass();
        final zra zra = (zra)((atjj)this.e).a();
        zra.getClass();
        final vbq vbq = (vbq)((atjj)this.h).a();
        vbq.getClass();
        textView.getClass();
        return new fwh(bu, hmb, acts, thh, aeby, zoj, zra, vbq, textView, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
