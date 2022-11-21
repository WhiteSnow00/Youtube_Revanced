import java.util.List;
import java.util.Iterator;
import android.text.Spanned;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class acrn extends acqk
{
    public acrn(final vnq vnq, final acrd acrd, final thg thg, final tre tre, final xab xab, final allx allx) {
        acrd.a();
        super(vnq, thg, tre, xab);
        acrd.b(allx.class);
        final acrm acrm = new acrm();
        ajws ajws;
        if ((allx.b & 0x10) != 0x0) {
            if ((ajws = allx.d) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        final Spanned b = acbu.b(ajws);
        b.getClass();
        acrm.a = b;
        this.E(acrm);
        if (allx == null) {
            return;
        }
        final ahdp c = allx.c;
        final ArrayList list = new ArrayList(((List)c).size());
        for (final allw allw : c) {
            Object o = null;
            Label_0331: {
                if (allw != null) {
                    final int b2 = allw.b;
                    if ((b2 & 0x1) != 0x0) {
                        if ((o = allw.c) == null) {
                            o = aiyk.a;
                        }
                        break Label_0331;
                    }
                    else if ((b2 & 0x2) != 0x0) {
                        if ((o = allw.d) == null) {
                            o = aixs.a;
                        }
                        break Label_0331;
                    }
                    else if ((b2 & 0x4) != 0x0) {
                        if ((o = allw.e) == null) {
                            o = aixu.a;
                        }
                        break Label_0331;
                    }
                    else if ((b2 & 0x8) != 0x0) {
                        if ((o = allw.f) == null) {
                            o = aixv.a;
                        }
                        break Label_0331;
                    }
                    else if ((b2 & 0x10) != 0x0) {
                        if ((o = allw.g) == null) {
                            o = aixx.a;
                        }
                        break Label_0331;
                    }
                    else if ((b2 & 0x20) != 0x0) {
                        if ((o = allw.h) == null) {
                            o = aixy.a;
                        }
                        break Label_0331;
                    }
                    else if ((b2 & 0x40) != 0x0) {
                        if ((o = allw.i) == null) {
                            o = aiwr.a;
                        }
                        break Label_0331;
                    }
                }
                o = null;
            }
            if (o != null) {
                list.add(o);
            }
        }
        this.G(list);
    }
    
    @Override
    protected final /* bridge */ Object lE(final anxa anxa) {
        return anxa;
    }
}
