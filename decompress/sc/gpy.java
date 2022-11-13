import com.google.protobuf.MessageLite;
import android.content.Context;
import j$.util.Optional;
import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpy implements iss
{
    public final Activity a;
    public skt b;
    public final aeea c;
    private final acpk d;
    private final wyw e;
    private final ftk f;
    private boolean g;
    private boolean h;
    private ist i;
    
    public gpy(final Activity a, final AccountLinkingController accountLinkingController, final acpk d, final msr msr, final wyw e, final ftk f, final aeea c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = c;
        this.b = new skt(Optional.empty());
        ((asht)accountLinkingController.d).i(ashb.e).j(tpe.co(msr.K())).am((asjm)new gmf(this, 13));
        f.a("menu_item_account_linking", false);
    }
    
    @Override
    public final ist a() {
        if (this.i == null) {
            (this.i = new ist("", new iso(this, 1))).g(false);
            ((qkq)this.i).e = tpe.k((Context)this.a, this.d.a(akdh.kW), 2130970924);
        }
        return this.i;
    }
    
    public final void c() {
        if (this.i != null) {
            Optional optional = null;
            Label_0059: {
                if (((Optional)this.b.b).isPresent()) {
                    final wyt a = wyt.a((MessageLite)((Optional)this.b.b).get());
                    if (a != null) {
                        optional = Optional.of((Object)a);
                        break Label_0059;
                    }
                }
                optional = Optional.empty();
            }
            if (!optional.isPresent()) {
                return;
            }
            final wzz wzz = (wzz)optional.get();
            this.e.D(wzz);
            if (this.h) {
                this.e.t(wzz, (alhi)null);
                return;
            }
            this.e.o(wzz, (alhi)null);
        }
    }
    
    public final void d(final boolean g) {
        this.g = g;
        this.f();
    }
    
    public final void f() {
        this.f.a("menu_item_account_linking", this.g && this.b.a);
        final boolean h = this.g && this.i != null && this.b.a;
        if (h == this.h) {
            return;
        }
        this.h = h;
        if (h) {
            final ist i = this.i;
            ajut ajut;
            if ((ajut = ((ahja)((Optional)this.b.b).get()).b) == null) {
                ajut = ajut.a;
            }
            ((qkq)i).c = acak.b(ajut).toString();
            this.i.g(true);
            return;
        }
        final ist j = this.i;
        ((qkq)j).c = "";
        j.g(false);
    }
    
    @Override
    public final void oO() {
    }
    
    @Override
    public final boolean oP() {
        return false;
    }
    
    @Override
    public final String oQ() {
        return "menu_item_account_linking";
    }
}
