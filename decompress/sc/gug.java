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

public final class gug
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    
    public gug(final aacf a, final lkx f, final aaad g, final hyx h, final vef e, final zmf d, final vai c, final Executor b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.f = f;
        this.g = g;
        this.h = h;
        this.e = e;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public gug(final Activity e, final vuf a, final tqd b, final tgd c, final vcy f, final adfq d, final arwh h, final aeea g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
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
    
    public gug(final atke f, final atke b, final atke c, final atke a, final atke g, final atke d, final atke e, final atke h) {
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
    
    public gug(final trc b, final tgd e, final vwa d, final tqd c, final zmf a, final arwh h, final vdr f, final Executor g, final byte[] array, final byte[] array2) {
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public final void a(final String s, final alog alog) {
        if (fbu.aK((arwh)this.h)) {
            final String h = vgl.h(62, s);
            final vfw c = ((vdr)this.f).a(((zmf)this.a).c()).c();
            final aloc d = alod.d(h);
            d.b(alog);
            c.j((vfk)d);
            c.b().U();
            return;
        }
        ((tgd)this.e).f((Object)new gfv(s, alog, false));
    }
    
    public final AlertDialog b(final String s) {
        return ((AlertDialog$Builder)((aeea)this.g).al((Context)this.e)).setMessage((CharSequence)((Activity)this.e).getString(2132017844)).setPositiveButton(2132017848, (DialogInterface$OnClickListener)new fbm(this, s, 3, (byte[])null)).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).create();
    }
    
    public final void c(final Button button, final boolean enabled) {
        button.setEnabled(enabled);
        if (enabled) {
            button.setTextColor(tpe.cx((Context)this.e, 2130970852).orElse(0));
            return;
        }
        button.setTextColor(tpe.cx((Context)this.e, 2130970865).orElse(0));
    }
    
    public final fwp d(final TextView textView) {
        final bu bu = (bu)((atke)this.f).a();
        bu.getClass();
        final hmw hmw = (hmw)((atke)this.b).a();
        hmw.getClass();
        final acvw acvw = (acvw)((atke)this.c).a();
        acvw.getClass();
        final tjm tjm = (tjm)((atke)this.a).a();
        tjm.getClass();
        final aeea aeea = (aeea)((atke)this.g).a();
        aeea.getClass();
        final zqe zqe = (zqe)((atke)this.d).a();
        zqe.getClass();
        final zst zst = (zst)((atke)this.e).a();
        zst.getClass();
        final vdr vdr = (vdr)((atke)this.h).a();
        vdr.getClass();
        textView.getClass();
        return new fwp(bu, hmw, acvw, tjm, aeea, zqe, zst, vdr, textView, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
