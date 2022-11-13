import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxz implements ttg
{
    public final hyb a;
    
    public hxz(final hyb a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        final hyb a = this.a;
        alfk a2;
        if ((a2 = (alfk)o) == null) {
            a2 = alfk.a;
        }
        a.ai.pF().D((wzz)new wyt(a2.g));
        if (!((List)a2.f).isEmpty()) {
            a.af.b((List)a2.f);
            a.dismiss();
            return;
        }
        if ((a2.b & 0x2) == 0x0) {
            a.dismiss();
            return;
        }
        alfa alfa;
        if ((alfa = a2.d) == null) {
            alfa = alfa.a;
        }
        final int b = alfa.b;
        final ajut ajut = null;
        apxx apxx;
        if ((b & 0x80) != 0x0) {
            alfa alfa2;
            if ((alfa2 = a2.d) == null) {
                alfa2 = alfa.a;
            }
            if ((apxx = alfa2.e) == null) {
                apxx = apxx.a;
            }
        }
        else {
            apxx = null;
        }
        final alfa d = a2.d;
        alfa a3;
        if (d == null) {
            a3 = alfa.a;
        }
        else {
            a3 = d;
        }
        amge a5;
        if (a3.c == 94946882) {
            alfa a4;
            if ((a4 = d) == null) {
                a4 = alfa.a;
            }
            if (a4.c == 94946882) {
                a5 = (amge)a4.d;
            }
            else {
                a5 = amge.a;
            }
        }
        else {
            a5 = null;
        }
        final alfa d2 = a2.d;
        alfa a6;
        if (d2 == null) {
            a6 = alfa.a;
        }
        else {
            a6 = d2;
        }
        aoye a8;
        if (a6.c == 161497951) {
            alfa a7;
            if ((a7 = d2) == null) {
                a7 = alfa.a;
            }
            if (a7.c == 161497951) {
                a8 = (aoye)a7.d;
            }
            else {
                a8 = aoye.a;
            }
        }
        else {
            a8 = null;
        }
        if (a5 != null) {
            a.aO();
            a.aM();
            a.aQ("");
            a.at.add((Object)a5);
            return;
        }
        if (a8 != null) {
            a.aO();
            a.at.l();
            a.aM();
            a.aQ("");
            a.at.add((Object)a8);
            return;
        }
        final alfa d3 = a2.d;
        alfa a9;
        if (d3 == null) {
            a9 = alfa.a;
        }
        else {
            a9 = d3;
        }
        apxa a11;
        if (a9.c == 58521717) {
            alfa a10;
            if ((a10 = d3) == null) {
                a10 = alfa.a;
            }
            if (a10.c == 58521717) {
                a11 = (apxa)a10.d;
            }
            else {
                a11 = apxa.a;
            }
        }
        else {
            a11 = null;
        }
        alfn alfn;
        if ((alfn = a2.e) == null) {
            alfn = alfn.a;
        }
        aixf a12;
        if (alfn.b == 64099105) {
            alfn alfn2;
            if ((alfn2 = a2.e) == null) {
                alfn2 = alfn.a;
            }
            if (alfn2.b == 64099105) {
                a12 = (aixf)alfn2.c;
            }
            else {
                a12 = aixf.a;
            }
        }
        else {
            a12 = null;
        }
        if (a11 != null) {
            if (a12 != null) {
                if (a.as == null) {
                    final acba al = a.aC.al((Context)a.ae);
                    ajut ajut2;
                    if ((a12.b & 0x1) != 0x0) {
                        if ((ajut2 = a12.c) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    final AlertDialog$Builder setMessage = ((AlertDialog$Builder)al).setTitle((CharSequence)acak.b(ajut2)).setMessage(aakt.t(a12, null));
                    ajut ajut3;
                    if ((a12.b & 0x1000000) != 0x0) {
                        if ((ajut3 = a12.q) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    final AlertDialog$Builder setPositiveButton = setMessage.setPositiveButton((CharSequence)acak.b(ajut3), (DialogInterface$OnClickListener)new fbm(a, a11, 9));
                    ajut ajut4 = ajut;
                    if ((a12.b & 0x2000000) != 0x0 && (ajut4 = a12.r) == null) {
                        ajut4 = ajut.a;
                    }
                    a.as = setPositiveButton.setNegativeButton((CharSequence)acak.b(ajut4), (DialogInterface$OnClickListener)new ceh(a, 13)).setOnCancelListener((DialogInterface$OnCancelListener)new fao(a, 2)).create();
                }
                a.as.show();
            }
            else {
                a.aS(a11);
            }
            if (apxx != null) {
                ((tqd)a.aT().c).d(qdt.K(apxx).toString());
            }
            return;
        }
        if (apxx != null) {
            a.aT().l(qdt.K(apxx));
        }
        a.dismiss();
    }
}
