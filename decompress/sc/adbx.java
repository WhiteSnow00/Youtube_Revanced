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

public final class adbx extends adcc implements View$OnClickListener, tgg
{
    public static final long ae;
    public wyw af;
    public acps ag;
    public tgd ah;
    public vcy ai;
    public oby aj;
    public tvr ak;
    public aeea al;
    private aiqj am;
    private View an;
    private RecyclerView ao;
    private acle ap;
    private Toolbar aq;
    private Snackbar ar;
    
    static {
        ae = TimeUnit.SECONDS.toMillis(10L);
    }
    
    public static adbx aK(final aiqj aiqj) {
        adkp.H(((ahbc)aiqj).ry((ahaq)AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint));
        final adbx adbx = new adbx();
        final Bundle bundle = new Bundle();
        adyf.aA(bundle, "add_contacts_endpoint", (MessageLite)aiqj);
        ((br)adbx).ag(bundle);
        return adbx;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624014, viewGroup, false);
        this.an = inflate;
        this.ao = (RecyclerView)inflate.findViewById(2131427542);
        this.aq = (Toolbar)this.an.findViewById(2131432125);
        this.ar = (Snackbar)this.an.findViewById(2131431597);
        this.ag.b((Class)ahom.class);
        this.ao.af((nw)new LinearLayoutManager());
        this.ap = new acle();
        final ackz z = this.al.Z((acku)this.ag.a());
        z.h((acjn)this.ap);
        z.f((ackn)new acjz(this.af));
        this.ao.ac((nq)z);
        this.aq.t((View$OnClickListener)this);
        this.aq.q(2132017208);
        final Bundle m = ((br)this).m;
        if (m != null && m.containsKey("add_contacts_endpoint")) {
            try {
                this.am = (aiqj)adyf.av(m, "add_contacts_endpoint", (MessageLite)aiqj.a, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahca ahca) {
                this.am = aiqj.a;
            }
        }
        else {
            this.am = aiqj.a;
        }
        String b;
        if (((ahbc)this.am).ry((ahaq)AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint)) {
            b = ((AddContactsEndpointOuterClass$AddContactsEndpoint)((ahbc)this.am).rx((ahaq)AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint)).b;
        }
        else {
            b = null;
        }
        akha akha;
        if (TextUtils.isEmpty((CharSequence)b)) {
            akha = null;
        }
        else {
            akha = (akha)vyg.p(b, akha.a.getParserForType());
        }
        if (akha != null) {
            if ((akha.b & 0x8) != 0x0) {
                this.af.D((wzz)new wyt(akha.d));
            }
            this.af.b(xaa.b(26926), this.am, (alhi)null);
            if ((akha.b & 0x8) != 0x0) {
                this.af.t((wzz)new wyt(akha.d), (alhi)null);
            }
            akgz akgz;
            if ((akgz = akha.c) == null) {
                akgz = akgz.a;
            }
            if ((akgz.b & 0x1) != 0x0) {
                akgz akgz2;
                if ((akgz2 = akha.c) == null) {
                    akgz2 = akgz.a;
                }
                anyv anyv;
                if ((anyv = akgz2.c) == null) {
                    anyv = anyv.a;
                }
                if (anyv.d.size() > 0 && (((anyy)anyv.d.get(0)).c & 0x1) != 0x0) {
                    ahom ahom;
                    if ((ahom = ((anyy)anyv.d.get(0)).L) == null) {
                        ahom = ahom.a;
                    }
                    if (ahom.b.size() != 0) {
                        for (final ahon ahon : ahom.b) {
                            final int b2 = ahon.b;
                            Object o;
                            byte[] array;
                            if (b2 == 105876287) {
                                o = ahon.c;
                                array = ((ahol)o).b.I();
                            }
                            else if (b2 == 79129962) {
                                o = ahon.c;
                                array = ((aivd)o).n.I();
                            }
                            else {
                                if (b2 != 154581033) {
                                    continue;
                                }
                                o = ahon.c;
                                array = ((ahok)o).b.I();
                            }
                            this.ap.add(o);
                            this.af.D((wzz)new wyt(array));
                        }
                    }
                }
                anyu anyu;
                if ((anyu = anyv.g) == null) {
                    anyu = anyu.a;
                }
                if (anyu.b == 128619045) {
                    final Toolbar aq = this.aq;
                    anyu anyu2;
                    if ((anyu2 = anyv.g) == null) {
                        anyu2 = anyu.a;
                    }
                    ahoo a;
                    if (anyu2.b == 128619045) {
                        a = (ahoo)anyu2.c;
                    }
                    else {
                        a = ahoo.a;
                    }
                    ajut ajut;
                    if ((ajut = a.b) == null) {
                        ajut = ajut.a;
                    }
                    aq.z((CharSequence)acak.b(ajut));
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
            adds.g(this.aj, this.ar, (uzm)o, adbx.ae, this.ai, Integer.valueOf(tpe.cx(((br)this).nT(), 2130970901).orElse(0)));
            array = null;
        }
        else {
            array = new Class[] { uzm.class };
        }
        return array;
    }
    
    public final void onClick(final View view) {
        ((bi)this).dismiss();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(2, this.ak.a);
        this.ah.g((Object)this);
    }
}
