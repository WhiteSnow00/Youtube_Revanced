import java.util.Iterator;
import java.util.List;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaza
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    
    public aaza() {
    }
    
    public aaza(final aima a) {
        this.a = a;
    }
    
    public aaza(final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint m) {
        this.m = m;
    }
    
    public final void a(final afeq m) {
        if (m != null) {
            this.m = m;
            return;
        }
        throw new NullPointerException("Null postCreatePollOptions");
    }
    
    public final void b(final afeq d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null postCreateQuizOptions");
    }
    
    public final String c() {
        if (this.i == null) {
            this.d();
        }
        return (String)this.i;
    }
    
    public final void d() {
        final Object m = this.m;
        final Boolean value = true;
        if (m != null) {
            if (((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint)m).b.size() != 0) {
                for (final ahkh ahkh : ((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint)this.m).b) {
                    if ((ahkh.b & 0x4) != 0x0) {
                        ahkj ahkj;
                        if ((ahkj = ahkh.d) == null) {
                            ahkj = ahkj.a;
                        }
                        this.i = ahkj.c;
                    }
                    if ((ahkh.b & 0x8) != 0x0) {
                        ahkk ahkk;
                        if ((ahkk = ahkh.e) == null) {
                            ahkk = ahkk.a;
                        }
                        if (!ahkk.b.isEmpty()) {
                            ahkk ahkk2;
                            if ((ahkk2 = ahkh.e) == null) {
                                ahkk2 = ahkk.a;
                            }
                            this.j = ahkk2.b;
                        }
                    }
                    if ((ahkh.b & 0x1) != 0x0) {
                        ahki ahki;
                        if ((ahki = ahkh.c) == null) {
                            ahki = ahki.a;
                        }
                        if (!ahki.c.isEmpty()) {
                            ahki ahki2;
                            if ((ahki2 = ahkh.c) == null) {
                                ahki2 = ahki.a;
                            }
                            this.h = ahki2.c;
                        }
                    }
                    if ((ahkh.b & 0x400) != 0x0) {
                        ahkm ahkm;
                        if ((ahkm = ahkh.h) == null) {
                            ahkm = ahkm.a;
                        }
                        this.b = ahkm.b;
                    }
                    if ((ahkh.b & 0x800) != 0x0) {
                        ajci ajci;
                        if ((ajci = ahkh.i) == null) {
                            ajci = ajci.a;
                        }
                        this.g = ajci.b;
                    }
                    if ((ahkh.b & 0x80) != 0x0 && this.c == null) {
                        ahkg c;
                        if ((c = ahkh.g) == null) {
                            c = ahkg.b;
                        }
                        this.c = c;
                        final ahkg ahkg = c;
                        if (((List)new ahbr((List)c.d, ahkg.a)).contains(ahkf.b)) {
                            this.l = value;
                        }
                        if (((List)new ahbr((List)((ahkg)this.c).d, ahkg.a)).contains(ahkf.g)) {
                            this.e = value;
                        }
                    }
                    if ((ahkh.b & 0x10) != 0x0) {
                        this.k = value;
                        ahkl ahkl;
                        if ((ahkl = ahkh.f) == null) {
                            ahkl = ahkl.a;
                        }
                        this.f = ahkl.b;
                        final ahkl f = ahkh.f;
                        ahkl a;
                        if (f == null) {
                            a = ahkl.a;
                        }
                        else {
                            a = f;
                        }
                        this.i = a.b;
                        ahkl a2 = f;
                        if (f == null) {
                            a2 = ahkl.a;
                        }
                        final String c2 = a2.c;
                    }
                }
            }
        }
        else {
            final Object a3 = this.a;
            if (a3 != null) {
                final aima aima = (aima)a3;
                this.i = aima.h;
                if (((List)new ahbr((List)aima.g, aima.a)).contains(ahkf.e)) {
                    this.j = ((aima)this.a).d;
                }
                if (((List)new ahbr((List)((aima)this.a).g, aima.a)).contains(ahkf.d)) {
                    this.k = value;
                    final aima aima2 = (aima)this.a;
                    final String d = aima2.d;
                    this.f = d;
                    this.i = d;
                    final String e = aima2.e;
                }
                if (((List)new ahbr((List)((aima)this.a).g, aima.a)).contains(ahkf.b)) {
                    this.l = value;
                    final aima aima3 = (aima)this.a;
                    final int aw = aeuz.aw(aima3.f);
                    if (aw != 0) {
                        if (aw == 3) {
                            this.i = aima3.d;
                            this.d = value;
                        }
                    }
                }
                if (((List)new ahbr((List)((aima)this.a).g, aima.a)).contains(ahkf.g)) {
                    this.e = value;
                    final aima aima4 = (aima)this.a;
                    final int aw2 = aeuz.aw(aima4.f);
                    if (aw2 != 0) {
                        if (aw2 == 3) {
                            this.i = aima4.d;
                            this.d = value;
                        }
                    }
                }
                final aima aima5 = (aima)this.a;
                this.h = aima5.i;
                ajci ajci2;
                if ((ajci2 = aima5.j) == null) {
                    ajci2 = ajci.a;
                }
                this.g = ajci2.b;
            }
        }
    }
}
