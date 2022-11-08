import java.util.Iterator;
import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.protobuf.MessageLite;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczu extends aczy implements View$OnClickListener, tec
{
    public static final long ae;
    public wwv af;
    public acno ag;
    public tdz ah;
    public vax ai;
    public oas aj;
    public ttn ak;
    public aeby al;
    private aioe am;
    private View an;
    private RecyclerView ao;
    private acjb ap;
    private Toolbar aq;
    private Snackbar ar;
    
    static {
        ae = TimeUnit.SECONDS.toMillis(10L);
    }
    
    public static aczu aK(final aioe aioe) {
        agot.u(((agzd)aioe).rs((agyr)AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint));
        final aczu aczu = new aczu();
        final Bundle bundle = new Bundle();
        aeda.av(bundle, "add_contacts_endpoint", (MessageLite)aioe);
        ((br)aczu).ag(bundle);
        return aczu;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624014, viewGroup, false);
        this.an = inflate;
        this.ao = (RecyclerView)inflate.findViewById(2131427542);
        this.aq = (Toolbar)this.an.findViewById(2131432122);
        this.ar = (Snackbar)this.an.findViewById(2131431594);
        this.ag.b((Class)ahmo.class);
        this.ao.af((nw)new LinearLayoutManager());
        this.ap = new acjb();
        final aciw t = this.al.T((acir)this.ag.a());
        t.h((achk)this.ap);
        t.f((acik)new achw(this.af));
        this.ao.ac((nq)t);
        this.aq.t((View$OnClickListener)this);
        this.aq.q(2132017208);
        final Bundle m = ((br)this).m;
        if (m != null && m.containsKey("add_contacts_endpoint")) {
            try {
                this.am = (aioe)aeda.aq(m, "add_contacts_endpoint", (MessageLite)aioe.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab) {
                this.am = aioe.a;
            }
        }
        else {
            this.am = aioe.a;
        }
        String b;
        if (((agzd)this.am).rs((agyr)AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint)) {
            b = ((AddContactsEndpointOuterClass$AddContactsEndpoint)((agzd)this.am).rr((agyr)AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint)).b;
        }
        else {
            b = null;
        }
        akex akex;
        if (TextUtils.isEmpty((CharSequence)b)) {
            akex = null;
        }
        else {
            akex = (akex)vwh.n(b, ((agzi)akex.a).getParserForType());
        }
        if (akex != null) {
            if ((akex.b & 0x8) != 0x0) {
                this.af.D((wxz)new wws(akex.d));
            }
            this.af.b(wya.b(26926), this.am, (alff)null);
            if ((akex.b & 0x8) != 0x0) {
                this.af.t((wxz)new wws(akex.d), (alff)null);
            }
            akew akew;
            if ((akew = akex.c) == null) {
                akew = akew.a;
            }
            if ((akew.b & 0x1) != 0x0) {
                akew akew2;
                if ((akew2 = akex.c) == null) {
                    akew2 = akew.a;
                }
                anws anws;
                if ((anws = akew2.c) == null) {
                    anws = anws.a;
                }
                if (anws.d.size() > 0 && (((anwv)anws.d.get(0)).c & 0x1) != 0x0) {
                    ahmo ahmo;
                    if ((ahmo = ((anwv)anws.d.get(0)).L) == null) {
                        ahmo = ahmo.a;
                    }
                    if (ahmo.b.size() != 0) {
                        for (final ahmp ahmp : ahmo.b) {
                            final int b2 = ahmp.b;
                            Object o;
                            byte[] array;
                            if (b2 == 105876287) {
                                o = ahmp.c;
                                array = ((ahmn)o).b.I();
                            }
                            else if (b2 == 79129962) {
                                o = ahmp.c;
                                array = ((aisy)o).n.I();
                            }
                            else {
                                if (b2 != 154581033) {
                                    continue;
                                }
                                o = ahmp.c;
                                array = ((ahmm)o).b.I();
                            }
                            this.ap.add(o);
                            this.af.D((wxz)new wws(array));
                        }
                    }
                }
                anwr anwr;
                if ((anwr = anws.g) == null) {
                    anwr = anwr.a;
                }
                if (anwr.b == 128619045) {
                    final Toolbar aq = this.aq;
                    anwr anwr2;
                    if ((anwr2 = anws.g) == null) {
                        anwr2 = anwr.a;
                    }
                    ahmq a;
                    if (anwr2.b == 128619045) {
                        a = (ahmq)anwr2.c;
                    }
                    else {
                        a = ahmq.a;
                    }
                    ajsq ajsq;
                    if ((ajsq = a.b) == null) {
                        ajsq = ajsq.a;
                    }
                    aq.z((CharSequence)abyh.b(ajsq));
                }
            }
        }
        return this.an;
    }
    
    public final void W() {
        super.W();
        this.ah.m((Object)this);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            adio.ab(this.aj, this.ar, (uxp)o, aczu.ae, this.ai, Integer.valueOf(tmy.ct(((br)this).nT(), 2130970901).orElse(0)));
            array = null;
        }
        else {
            array = new Class[] { uxp.class };
        }
        return array;
    }
    
    public final void onClick(final View view) {
        this.dismiss();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.nc(2, this.ak.a);
        this.ah.g((Object)this);
    }
}
