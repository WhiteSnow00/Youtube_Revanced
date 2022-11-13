import java.util.Iterator;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.$AutoValue_AccountIdentity;
import java.util.Arrays;
import android.app.Activity;
import android.content.Intent;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gna implements zpf
{
    public final Object a;
    final Object b;
    private final int c;
    
    public gna(final aadx a, final zpf b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gna(final adbp a, final Map b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gna(final adll a, final List b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gna(final aslr b, final alcw a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gna(final fcl a, final vpl b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gna(final gnb b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gna(final gug a, final String b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gna(final hln a, final Map b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gna(final hxh b, final Activity a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gna(final String b, final tcc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gna(final vmi a, final zpf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gna(final zme b, final tcc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final dbj dbj) {
        switch (this.c) {
            default: {
                ttr.f("UploadFeedbackPoller", "onErrorResponse", (Throwable)dbj);
                ((adll)this.a).d.execute(new adlo(this, (List)this.b, dbj, 1, null));
                return;
            }
            case 11: {
                ttr.f("GetOnceUploadFeedbackForPrechecksCommandHandler", "GetUploadFeedback failed", (Throwable)dbj);
                ((aslr)this.b).a();
                return;
            }
            case 10: {
                ((adbp)this.a).a.e((Throwable)dbj);
                final adbo adbo = (adbo)tpe.O((Map)this.b, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)adbo.class);
                if (adbo != null) {
                    adbo.i();
                }
                return;
            }
            case 9: {
                ((tqd)((hln)this.a).b).e((Throwable)dbj);
                return;
            }
            case 8: {
                ((zpf)this.b).a(dbj);
                return;
            }
            case 7: {
                ((zpf)this.b).a(dbj);
                return;
            }
            case 6: {
                ((zpf)this.b).a(dbj);
                return;
            }
            case 5: {
                ((tcc)this.a).sd(this.b, (Exception)dbj);
            }
            case 4: {
                return;
            }
            case 3: {
                ((hxh)this.b).a.c.e((Throwable)dbj);
                return;
            }
            case 2: {
                ttr.d("Error creating post", (Throwable)dbj);
                ((tqd)((fcl)this.a).e).e((Throwable)dbj);
                final Object b = this.b;
                if (b != null) {
                    ((vpl)b).e((Throwable)dbj);
                }
                return;
            }
            case 1: {
                ((tqd)((gug)this.a).b).e((Throwable)dbj);
                return;
            }
            case 0: {
                ttr.l("Failed to load get_settings response");
                ((gnb)this.b).b((Intent)this.a);
            }
        }
    }
    
    public final void mX(Object o) {
        final int c = this.c;
        int n = 1;
        final vzx vzx = null;
        final int n2 = 0;
        switch (c) {
            default: {
                ((adll)this.a).d.execute((Runnable)new adfy(this, (alcx)o, 8, (byte[])null));
                return;
            }
            case 11: {
                final alcx alcx = (alcx)o;
                String.valueOf(((alcw)this.a).d);
                ((aslr)this.b).a();
                return;
            }
            case 10: {
                final akjj akjj = (akjj)o;
                final Object a = this.a;
                o = this.b;
                ((adbp)a).b((Map)o, akjj);
                return;
            }
            case 9: {
                final aksr aksr = (aksr)o;
                if (aksr.c.size() > 0) {
                    final vzx value = ((Map<K, vzx>)this.b).get("com.google.android.libraries.youtube.innertube.endpoint.tag");
                    vzx d;
                    if (value instanceof waq) {
                        d = ((waq)value).d();
                    }
                    else {
                        d = vzx;
                        if (value instanceof vzx) {
                            d = value;
                        }
                    }
                    if (d == null) {
                        zlm.b(zll.b, zlk.E, "Moderate live chat command called with no context. \n".concat(String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()))));
                        return;
                    }
                    ((xib)((hln)this.a).a).X((List)aksr.c, d, true);
                }
                return;
            }
            case 8: {
                final alah alah = (alah)o;
                o = this.a;
                ((aadx)o).h((List)alah.d);
                ((zpf)this.b).mX((Object)alah);
                return;
            }
            case 7: {
                final alaf alaf = (alaf)o;
                ((aadx)this.a).h((List)alaf.d);
                ((zpf)this.b).mX((Object)alaf);
                return;
            }
            case 6: {
                final vph vph = new vph((akkb)o, 0);
                ((vmi)this.a).b((Object)vph);
                ((zpf)this.b).mX((Object)vph);
                return;
            }
            case 5: {
                for (final vmt vmt : ((adqh)o).h()) {
                    if (vmt.l()) {
                        final $AutoValue_AccountIdentity $AutoValue_AccountIdentity = ($AutoValue_AccountIdentity)this.b;
                        if (!TextUtils.equals((CharSequence)$AutoValue_AccountIdentity.c, (CharSequence)vmt.j())) {
                            if (!TextUtils.isEmpty((CharSequence)$AutoValue_AccountIdentity.c) || !TextUtils.isEmpty((CharSequence)vmt.j())) {
                                continue;
                            }
                        }
                        ((tcc)this.a).b(this.b, (Object)vmt);
                        return;
                    }
                }
                ((tcc)this.a).sd(this.b, (Exception)null);
                return;
            }
            case 4: {
                for (final vmt vmt2 : ((adqh)o).h()) {
                    if (vmt2.l() && vmt2.i().equals(this.b)) {
                        ((tcc)this.a).b(this.b, (Object)vmt2);
                        break;
                    }
                }
                return;
            }
            case 3: {
                final akxs akxs = (akxs)o;
                final hxi a2 = ((hxh)this.b).a;
                final acwb af = a2.af;
                final aeea ar = a2.ar;
                final gbv d2 = gbx.d();
                d2.j();
                d2.k((CharSequence)((Activity)this.a).getString(2132017971));
                d2.c(-1);
                af.n(ar.V((acwc)d2));
                ((hxh)this.b).a.ax.c(false);
                return;
            }
            case 2: {
                final akkg akkg = (akkg)o;
                int i = n2;
                if ((akkg.b & 0x4) != 0x0) {
                    akjp akjp;
                    if ((akjp = akkg.f) == null) {
                        akjp = akjp.a;
                    }
                    i = n2;
                    if ((akjp.b & 0x20) != 0x0) {
                        final Object b = ((fcl)this.a).b;
                        aiqj aiqj;
                        if ((aiqj = akjp.f) == null) {
                            aiqj = aiqj.a;
                        }
                        ((vcy)b).c(aiqj, (Map)null);
                        i = n2;
                    }
                }
                while (i < akkg.e.size()) {
                    ((vcy)((fcl)this.a).b).c((aiqj)akkg.e.get(i), (Map)null);
                    ++i;
                }
                o = this.b;
                if (o != null) {
                    ((vpl)o).f(akkg);
                }
                return;
            }
            case 1: {
                final akxz akxz = (akxz)o;
                ((tgd)((gug)this.a).c).f((Object)new giv((String)this.b));
                tpe.x((Context)((gug)this.a).e, 2132017847, 1);
                return;
            }
            case 0: {
                final vvl vvl = (vvl)o;
                if (vvl.c == null) {
                    akzt akzt;
                    if ((akzt = vvl.a.e) == null) {
                        akzt = akzt.a;
                    }
                    final List c2 = vxg.c(akzt, (List)null);
                    if (!c2.isEmpty()) {
                        vvl.c = c2.get(0);
                    }
                }
                o = vvl.c;
                if (o instanceof anzs) {
                    ((Intent)this.a).putExtra(":android:show_fragment", NotificationPrefsFragment.class.getName());
                }
                else if (o instanceof anzw) {
                    final anzw anzw = (anzw)o;
                    o = this.a;
                    final int bc = aqsx.bC(anzw.e);
                    if (bc != 0) {
                        n = bc;
                    }
                    gnb.c((Intent)o, String.valueOf(n - 1));
                }
                ((gnb)this.b).b((Intent)this.a);
            }
        }
    }
    
    public final void mY() {
    }
}
