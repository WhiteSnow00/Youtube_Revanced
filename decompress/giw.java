import java.util.Set;
import android.content.SharedPreferences;
import java.util.Iterator;
import android.view.View;
import com.google.protos.youtube.api.innertube.NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import android.content.DialogInterface;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import java.util.Map;
import android.widget.EditText;
import android.widget.CheckBox;
import android.util.Pair;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class giw implements DialogInterface$OnClickListener
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public giw(final aanx b, final aaiq c, final Pair a, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public giw(final adlp c, final CheckBox a, final pvh b, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public giw(final gch c, final EditText a, final gcb b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public giw(final gnm a, final aiqj b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final gof a, final aiqj b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final goi a, final aiqj b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final gow a, final aiqj b, final Object c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final gug a, final String b, final byte[] c, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final ifr a, final wyw b, final wzz c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final ifr a, final wyw b, final wzz c, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final jrj a, final jrw b, final List c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public giw(final otc b, final CommandOuterClass$Command c, final ota a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public giw(final wjq a, final aiqj c, final wlo b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final void onClick(final DialogInterface dialogInterface, int a) {
        switch (this.d) {
            default: {
                ((otc)this.b).a((CommandOuterClass$Command)this.c, (ota)this.a).U();
                return;
            }
            case 15: {
                ((otc)this.b).a((CommandOuterClass$Command)this.c, (ota)this.a).U();
                return;
            }
            case 14: {
                final Object b = this.b;
                final Object c = this.c;
                final Object a2 = this.a;
                if (a == -1) {
                    if (c != null) {
                        ((aaiq)c).b();
                    }
                    ((Runnable)((Pair)a2).second).run();
                }
                else if (a == -2 && c != null) {
                    ((aaiq)c).a();
                }
                ((aanx)b).g();
                return;
            }
            case 13: {
                ((wjq)this.a).a.b(((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint)((ahbc)this.c).rx((ahaq)DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)).c, (wlo)this.b);
                return;
            }
            case 12: {
                if (a != -2) {
                    if (a == -1) {
                        final adlp adlp = (adlp)this.c;
                        adlp.H((String)adlp.g);
                    }
                }
                else if (((CheckBox)this.a).isChecked()) {
                    ((SharedPreferences)((adlp)this.c).a).edit().putBoolean("cellular_upload_dialog_do_not_show_again", true).apply();
                }
                ((pvh)this.b).z();
                return;
            }
            case 11: {
                final Object a3 = this.a;
                final Object b2 = this.b;
                final Object c2 = this.c;
                final HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
                a = ((jrw)b2).a();
                final jrj jrj = (jrj)a3;
                final vcy a4 = jrj.a;
                aiqj aiqj;
                if ((aiqj = ((List<aoac>)c2).get(a).e) == null) {
                    aiqj = aiqj.a;
                }
                a4.c(aiqj, (Map)hashMap);
                if (jrj.d != a) {
                    final Iterator<Object> iterator = ((Set<Object>)jrj.e.a).iterator();
                    while (iterator.hasNext()) {
                        iterator.next().d(a);
                    }
                }
                jrj.h(Boolean.valueOf(true));
                jrj.d = a;
                dialogInterface.dismiss();
                return;
            }
            case 10: {
                if (((ifr)this.a).r.bY()) {
                    ((wyw)this.b).J(3, (wzz)this.c, (alhi)null);
                }
                final aair o = ((ifr)this.a).o;
                if (o != null) {
                    o.a();
                }
                return;
            }
            case 9: {
                final Object a5 = this.a;
                final Object b3 = this.b;
                final Object c3 = this.c;
                if (((ifr)a5).r.bY()) {
                    ((wyw)b3).J(3, (wzz)c3, (alhi)null);
                }
                return;
            }
            case 8: {
                ((gow)this.a).g((aiqj)this.b, this.c);
                return;
            }
            case 7: {
                ((gow)this.a).g((aiqj)this.b, this.c);
                return;
            }
            case 6: {
                ((goi)this.a).b((aiqj)this.b, (Map)this.c);
                return;
            }
            case 5: {
                ((goi)this.a).b((aiqj)this.b, (Map)this.c);
                return;
            }
            case 4: {
                final Object a6 = this.a;
                final Object b4 = this.b;
                final Object c4 = this.c;
                final gof gof = (gof)a6;
                final vtn e = gof.e;
                final vtl vtl = new vtl(e.c, e.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint)((ahbc)b4).rx((ahaq)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
                vtl.a = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.c;
                vtl.b = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.e;
                final aiqj aiqj2 = (aiqj)b4;
                ((vkk)vtl).j(vdh.a(aiqj2));
                teu.n((aun)gof.a, gof.e.e.b((vls)vtl, gof.d), (ttg)new goe(gof, 0), (ttg)new eyf(gof, aiqj2, (Map)c4, 4));
                return;
            }
            case 3: {
                ((gnm)this.a).b((aiqj)this.b, tpe.M((Map)this.c, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"));
                return;
            }
            case 2: {
                ((gnm)this.a).b((aiqj)this.b, tpe.M((Map)this.c, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"));
                return;
            }
            case 1: {
                ((gch)this.c).d((View)this.a, (gcb)this.b);
                return;
            }
            case 0: {
                final Object a7 = this.a;
                final Object b5 = this.b;
                final Object c5 = this.c;
                final gug gug = (gug)a7;
                final vqm p2 = ((adfq)gug.d).p();
                p2.a = (String)b5;
                ((vkk)p2).k((byte[])c5);
                ((adfq)gug.d).q(p2, (zpf)new fch(gug, 4, (byte[])null));
            }
        }
    }
}
