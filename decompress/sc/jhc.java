import com.google.protobuf.MessageLite;
import android.view.ViewStub;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhc extends jgn
{
    private final acpn b;
    private final View c;
    private final ilc d;
    private iop e;
    private final blu f;
    
    public jhc(final Context context, final vcy vcy, final gjh gjh, final acpn b, final qcy qcy, final aln aln, final blu f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, vcy, gjh, aln, 2131624944, new nx(context.getResources().getDimensionPixelSize(2131168344), context.getResources().getDimensionPixelSize(2131168343)), new nx(context.getResources().getDimensionPixelSize(2131168344), context.getResources().getDimensionPixelSize(2131168342)), context.getResources().getDimensionPixelSize(2131165561), (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.c = this.a().findViewById(2131428448);
        this.d = qcy.Q((ViewStub)this.a().findViewById(2131430123), (ill)null);
        this.f = f;
    }
    
    public final void c(final acku acku) {
        final iop e = this.e;
        if (e != null) {
            e.b.m((Object)e);
            tpe.v((View)e.c, false);
            tpe.v(e.d, true);
            e.e = null;
            this.e = null;
        }
    }
    
    protected final void lR(final ackm ackm, Object d) {
        final amte amte = (amte)d;
        super.lR(ackm, (Object)amte);
        ackm.f("PlaylistPresenterConstants.PLAYLIST_ID", amte.g);
        this.d.b(ackm);
        final wyw a = ackm.a;
        final acpn b = this.b;
        final View a2 = this.a();
        final View c = this.c;
        amgv amgv;
        if ((amgv = amte.j) == null) {
            amgv = amgv.a;
        }
        amgs amgs;
        if ((amgv.b & 0x1) != 0x0) {
            amgv amgv2;
            if ((amgv2 = amte.j) == null) {
                amgv2 = amgv.a;
            }
            if ((amgs = amgv2.c) == null) {
                amgs = amgs.a;
            }
        }
        else {
            amgs = null;
        }
        b.f(a2, c, amgs, (Object)amte, a);
        if (this.e == null) {
            if (amte.g.isEmpty()) {
                return;
            }
            final blu f = this.f;
            final View a3 = this.a();
            final Context context = (Context)((arlt)f.a).a;
            context.getClass();
            final fmr fmr = (fmr)((atke)f.e).a();
            fmr.getClass();
            d = f.d;
            final ilg ilg = (ilg)((atke)f.b).a();
            ilg.getClass();
            final tgd tgd = (tgd)((atke)f.c).a();
            tgd.getClass();
            a3.getClass();
            this.e = new iop(context, fmr, (atke)d, ilg, tgd, a3);
        }
        final iop e = this.e;
        if (!amte.g.isEmpty() && e.a.j(amte.g) && ackm.c("sectionListController") instanceof ipp) {
            e.e = amte.g;
            e.a();
            e.b.g((Object)e);
            ike.b(ackm, (MessageLite)amte);
        }
    }
}
