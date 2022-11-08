import android.content.Intent;
import com.google.protobuf.MessageLite;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmh implements acxe
{
    final /* synthetic */ VoiceSearchActivity a;
    
    public jmh(final VoiceSearchActivity a) {
        this.a = a;
    }
    
    public final void a(final aett aett) {
        if (this.a.an.cj()) {
            final VoiceSearchActivity a = this.a;
            tcp.o((aum)a, a.at.l(aett.b), (trb)ifc.t, (trb)jmg.b);
        }
    }
    
    public final void b() {
        if (this.a.an.cj()) {
            final VoiceSearchActivity a = this.a;
            tcp.o((aum)a, a.at.m(), (trb)jmg.a, (trb)jmg.c);
        }
        final VoiceSearchActivity a2 = this.a;
        if (!a2.h && !a2.O) {
            if (a2.c.b != 1) {
                a2.p(a2.g);
            }
            this.a.u();
        }
    }
    
    public final void c(final Throwable t) {
        final VoiceSearchActivity a = this.a;
        if (a.c.b != 1) {
            a.p(a.g);
        }
        if (t.getMessage() != null) {
            final String format = String.format("%s (YtConnectionType = %d)", t.getMessage(), this.a.u.a());
            zjp.c(zjo.b, zjn.F, format, t);
            trn.d("VoiceSearchActivity error: ".concat(String.valueOf(format)), t);
        }
        final VoiceSearchActivity a2 = this.a;
        if (a2.h) {
            a2.r();
        }
    }
    
    public final void d(final agyc agyc) {
        try {
            final aqtk aqtk = (aqtk)agzi.parseFrom((agzi)aqtk.a, agyc);
            final vjl t = this.a.t;
            agyc b;
            if (aqtk.b == 1) {
                b = (agyc)aqtk.c;
            }
            else {
                b = agyc.b;
            }
            final akfe akfe = (akfe)t.a(b.I(), (MessageLite)akfe.a);
            if (akfe != null) {
                if ((akfe.b & 0x4) != 0x0 && akfe.g.size() <= 0) {
                    this.a.r.l((wxz)new wws(akfe.c.I()));
                }
                if ((akfe.b & 0x100) != 0x0) {
                    if (gkt.aw(this.a.ap) && this.a.p.t(alku.K)) {
                        this.a.p.y("voz_rqf", alku.K);
                    }
                    final VoiceSearchActivity a = this.a;
                    final byte[] i = agyc.I();
                    final Intent intent = a.getIntent();
                    intent.putExtra("RecognizedText", i);
                    intent.putExtra("AssistantCsn", a.r.i());
                    intent.putExtra("SearchboxStats", a.V);
                    a.setResult(-1, intent);
                    a.p(a.e);
                    a.n();
                }
                else if (akfe.g.size() <= 0 && (akfe.b & 0x8000000) == 0x0) {
                    final VoiceSearchActivity a2 = this.a;
                    if (a2.c.b != 1) {
                        a2.p(a2.g);
                    }
                    this.a.r();
                }
                else {
                    if (akfe.g.size() > 0) {
                        final VoiceSearchActivity a3 = this.a;
                        a3.R = akfe.g;
                        if (!a3.ae) {
                            a3.k();
                        }
                        this.a.J.setVisibility(0);
                        if (gkt.aw(this.a.ap) && this.a.p.t(alku.K)) {
                            this.a.p.y("voz_vt", alku.K);
                        }
                    }
                    if ((akfe.b & 0x8000000) != 0x0) {
                        final VoiceSearchActivity a4 = this.a;
                        akfc akfc;
                        if ((akfc = akfe.h) == null) {
                            akfc = akfc.a;
                        }
                        if (!akfc.b.isEmpty()) {
                            if (!a4.n && a4.p.t(alku.K)) {
                                a4.p.y("voz_fvc", alku.K);
                                a4.n = true;
                            }
                            a4.ai = akfc.b;
                            if (a4.L != null) {
                                a4.r.l((wxz)new wws(wya.c(137832)));
                            }
                            a4.o();
                        }
                    }
                }
                if (this.a.z() && (akfe.b & 0x40) != 0x0) {
                    akfd akfd;
                    if ((akfd = akfe.d) == null) {
                        akfd = akfd.a;
                    }
                    if ((akfd.b & 0x1) != 0x0) {
                        final VoiceSearchActivity a5 = this.a;
                        akfd akfd2;
                        if ((akfd2 = akfe.d) == null) {
                            akfd2 = akfd.a;
                        }
                        final boolean c = akfd2.c;
                        final tku tku = (tku)a5.B.a();
                        tcp.n((aum)a5, tku.a(), (trb)ifc.q, (trb)new jme(tku, c, 0));
                    }
                }
            }
        }
        catch (final ahab ahab) {}
    }
}
