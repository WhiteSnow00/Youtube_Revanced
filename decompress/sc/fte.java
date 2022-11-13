import java.util.BitSet;
import j$.util.Optional;
import android.os.Handler;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fte implements omj
{
    public final fsh a;
    
    public fte(final fsh a) {
        this.a = a;
    }
    
    public final dsr a(final dsx dsx, final oti oti, final MessageLite messageLite, final agnu agnu, final List a) {
        final fsh a2 = this.a;
        final aqnp aqnp = (aqnp)messageLite;
        while (true) {
            for (int i = 0; i < agnu.N(); ++i) {
                final agnu ak = agnu.ak(i);
                if (ak.K() == 168772996) {
                    final int as = arjy.at(ak.M()).as();
                    CommandOuterClass$Command e;
                    if ((aqnp.c & 0x2) != 0x0) {
                        if ((e = aqnp.e) == null) {
                            e = CommandOuterClass$Command.getDefaultInstance();
                        }
                    }
                    else {
                        e = null;
                    }
                    CommandOuterClass$Command f;
                    if ((aqnp.c & 0x1) != 0x0) {
                        if ((f = aqnp.d) == null) {
                            f = CommandOuterClass$Command.getDefaultInstance();
                        }
                    }
                    else {
                        f = null;
                    }
                    final boolean g = aqnp.g;
                    final boolean f2 = aqnp.f;
                    final boolean bd = ((vai)((atke)a2.a).a()).bD();
                    final fse fse = new fse();
                    fse.c(fse, dsx, new fsg());
                    fse.a.b = (arkg)a2.b;
                    fse.d.set(1);
                    fse.a.z = (arkg)a2.c;
                    fse.d.set(7);
                    fse.a.d = (arkg)a2.d;
                    final BitSet d = fse.d;
                    int c = 4;
                    d.set(4);
                    fse.a.B = (Handler)a2.e;
                    fse.d.set(9);
                    if (as != 1) {
                        if (as != 2) {
                            if (as != 4) {
                                c = 1;
                            }
                            else {
                                c = 2;
                            }
                        }
                    }
                    else {
                        c = 3;
                    }
                    fse.a.C = c;
                    fse.d.set(3);
                    fse.a.a = a;
                    fse.d.set(0);
                    final fsg a3 = fse.a;
                    a3.e = e;
                    a3.f = f;
                    a3.c = (g ^ true);
                    fse.d.set(2);
                    fse.a.A = f2;
                    fse.d.set(8);
                    Optional g2;
                    if (bd && ((Optional)((arkg)a2.f).a()).isPresent()) {
                        final fsl fsl = new fsl();
                        fsl.d(fsl, dsx, new fsm());
                        fsl.a.b = (elx)((Optional)((arkg)a2.f).a()).get();
                        fsl.d.set(0);
                        ((dsr)fsl).N(3);
                        ((dsr)fsl).S(100.0f);
                        ((dsr)fsl).I(100.0f);
                        g2 = Optional.of((Object)fsl.c());
                    }
                    else {
                        g2 = Optional.empty();
                    }
                    fse.a.g = g2;
                    fse.d.set(5);
                    final fso fso = new fso();
                    fso.d(fso, dsx, new fsp());
                    fso.a.a = (atke)a2.g;
                    fso.d.set(0);
                    ((dsr)fso).N(3);
                    ((dsr)fso).S(100.0f);
                    ((dsr)fso).I(100.0f);
                    final fsp c2 = fso.c();
                    final fsg a4 = fse.a;
                    dst j;
                    if (c2 == null) {
                        j = null;
                    }
                    else {
                        j = ((dst)c2).j();
                    }
                    a4.y = j;
                    fse.d.set(6);
                    return (dsr)fse;
                }
            }
            final int as = 0;
            continue;
        }
    }
}
