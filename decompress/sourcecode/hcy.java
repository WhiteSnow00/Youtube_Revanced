import com.google.protobuf.MessageLite;
import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcy implements hcx
{
    public cl a;
    public final AccountId b;
    
    public hcy(br br, final AccountId b) {
        while (true) {
            final br c = br.C;
            if (c == null) {
                break;
            }
            br = c;
        }
        this.a = br.og();
        this.b = b;
    }
    
    public final void a(final aioe c) {
        final agza builder = ((agzi)hdm.a).createBuilder();
        builder.copyOnWrite();
        final hdm hdm = (hdm)builder.instance;
        c.getClass();
        hdm.c = c;
        hdm.b |= 0x1;
        final hdm hdm2 = (hdm)builder.build();
        final AccountId b = this.b;
        final gxr gxr = new gxr();
        arin.g((br)gxr);
        aenz.e((br)gxr, b);
        aenu.b((br)gxr, (MessageLite)hdm2);
        this.b((br)gxr, "editFragment");
    }
    
    public final void b(final br br, final String s) {
        final cl a = this.a;
        if (a != null && !a.w && !a.Z()) {
            final ct i = a.i();
            i.w(2131430844, br, s);
            i.d();
            return;
        }
        final StringBuilder sb = new StringBuilder("Attempted fragment replace after instance state saved (");
        sb.append(s);
        sb.append(")");
        trn.b(sb.toString());
        final zjo a2 = zjo.a;
        final zjn f = zjn.f;
        final StringBuilder sb2 = new StringBuilder("[ShortsCreation][Android][Navigation]Attempted fragment replace after instance state saved (");
        sb2.append(s);
        sb2.append(")");
        zjp.b(a2, f, sb2.toString());
    }
}
