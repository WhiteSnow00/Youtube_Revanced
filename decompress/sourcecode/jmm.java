import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmm implements acxe
{
    final /* synthetic */ jmp a;
    
    public jmm(final jmp a) {
        this.a = a;
    }
    
    public final void a(final aett aett) {
        if (this.a.B.cj()) {
            final jmp a = this.a;
            tcp.o(a.i, a.D.l(aett.b), (trb)jmg.h, (trb)jmg.i);
        }
    }
    
    public final void b() {
        if (this.a.B.cj()) {
            final jmp a = this.a;
            tcp.o(a.i, a.D.m(), (trb)jmg.j, (trb)jmg.k);
        }
        final jmp a2 = this.a;
        if (!a2.n && !a2.q) {
            a2.i();
            final jmp a3 = this.a;
            a3.b.p(a3.o, a3.p);
        }
    }
    
    public final void c(final Throwable t) {
        if (t.getMessage() != null) {
            final String format = String.format(new Locale("en"), "%s (YtConnectionType = %d)", t.getMessage(), this.a.e.a());
            zjp.c(zjo.b, zjn.F, format, t);
            trn.d("VoiceSearchController error: ".concat(String.valueOf(format)), t);
        }
        final jmp a = this.a;
        if (a.n) {
            a.m();
        }
        this.a.i();
    }
    
    public final void d(final agyc agyc) {
        try {
            final aqtk aqtk = (aqtk)agzi.parseFrom((agzi)aqtk.a, agyc, ExtensionRegistryLite.getGeneratedRegistry());
            final vjl f = this.a.f;
            agyc b;
            if (aqtk.b == 1) {
                b = (agyc)aqtk.c;
            }
            else {
                b = agyc.b;
            }
            final akfe akfe = (akfe)f.a(b.I(), (MessageLite)akfe.a);
            if (akfe != null) {
                if ((akfe.b & 0x4) != 0x0 && akfe.g.size() <= 0) {
                    this.a.g.l((wxz)new wws(akfe.c.I()));
                }
                if ((akfe.b & 0x100) != 0x0) {
                    this.a.a.f(agyc.I());
                    return;
                }
                if (akfe.g.size() <= 0 && (akfe.b & 0x8000000) == 0x0) {
                    this.a.i();
                    this.a.m();
                    return;
                }
                if (akfe.g.size() > 0) {
                    final jmp a = this.a;
                    a.r = akfe.g;
                    a.c();
                    a.b.k();
                    if (gkt.aw(a.C) && a.h.t(alku.K)) {
                        a.h.y("voz_vt", alku.K);
                    }
                }
                if ((akfe.b & 0x8000000) != 0x0) {
                    final jmp a2 = this.a;
                    akfc akfc;
                    if ((akfc = akfe.h) == null) {
                        akfc = akfc.a;
                    }
                    if (!akfc.b.isEmpty()) {
                        if (!a2.w && a2.h.t(alku.K)) {
                            a2.h.y("voz_fvc", alku.K);
                            a2.w = true;
                        }
                        a2.u = akfc.b;
                        a2.b.r();
                    }
                }
            }
        }
        catch (final ahab ahab) {}
    }
}
