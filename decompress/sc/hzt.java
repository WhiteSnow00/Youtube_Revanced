import java.util.List;
import java.util.Iterator;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzt implements vws
{
    private final boolean a;
    private final boolean b;
    private final arkg c;
    private final arkg d;
    
    public hzt(final vaf vaf, final arkg c, final cyb cyb, final arkg d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = fbu.af(vaf);
        this.b = cyb.q();
        this.c = c;
        this.d = d;
    }
    
    public final void oM(final vwv vwv) {
        final ahaz builder = ((ahbh)aldw.a).createBuilder();
        final boolean a = this.a;
        final boolean b = true;
        boolean b2;
        if (a) {
            final boolean a2 = ((gtx)this.c.a()).a();
            builder.copyOnWrite();
            final aldw aldw = (aldw)builder.instance;
            aldw.b |= 0x1;
            aldw.c = a2;
            b2 = false;
        }
        else {
            b2 = true;
        }
        if (this.b) {
            final mcb mcb = (mcb)this.d.a();
            final grv grv = (grv)mcb.c;
            boolean d = false;
            Label_0367: {
                Label_0115: {
                    if (grv.c) {
                        Label_0220: {
                            if (((vai)((cyb)mcb.b).a).f(45378171L)) {
                                final Iterator<Object> iterator = ((List<Object>)grv.e).iterator();
                                while (iterator.hasNext()) {
                                    if (((List)((vai)((cyb)mcb.b).a).c(45378102L, new byte[0]).b).contains(Integer.toString(iterator.next()))) {
                                        break Label_0220;
                                    }
                                }
                                break Label_0115;
                            }
                        }
                        if (((zmf)mcb.a).c() != null) {
                            final zme c = ((zmf)mcb.a).c();
                            if (!c.g()) {
                                if (!c.y()) {
                                    if (c instanceof AccountIdentity) {
                                        final AccountIdentity accountIdentity = (AccountIdentity)c;
                                        if (!accountIdentity.j()) {
                                            if (!accountIdentity.f()) {
                                                if (!accountIdentity.x()) {
                                                    final grv grv2 = (grv)mcb.c;
                                                    d = b;
                                                    if ((grv2.b & 0x2) == 0x0) {
                                                        break Label_0367;
                                                    }
                                                    d = b;
                                                    if (grv2.d.equals(accountIdentity.a())) {
                                                        break Label_0367;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                d = false;
            }
            builder.copyOnWrite();
            final aldw aldw2 = (aldw)builder.instance;
            aldw2.b |= 0x2;
            aldw2.d = d;
        }
        else if (b2) {
            return;
        }
        vwv.E = (aldw)builder.build();
    }
}
