import com.google.protobuf.MessageLite;
import android.content.Context;
import j$.util.Optional;
import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gps implements iru
{
    public final Activity a;
    public sin b;
    public final aeby c;
    private final acng d;
    private final wwv e;
    private final ftc f;
    private boolean g;
    private boolean h;
    private irv i;
    
    public gps(final Activity a, final AccountLinkingController accountLinkingController, final acng d, final mrm mrm, final wwv e, final ftc f, final aeby c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = c;
        this.b = new sin(Optional.empty());
        ((ashe)accountLinkingController.d).i(asgm.e).j(tmy.ck(mrm.u())).al((asix)new gly(this, 12));
        f.a("menu_item_account_linking", false);
    }
    
    @Override
    public final irv a() {
        if (this.i == null) {
            (this.i = new irv("", (irt)new irq(this, 1))).g(false);
            ((qjg)this.i).e = tmy.k((Context)this.a, this.d.a(akbe.kV), 2130970924);
        }
        return this.i;
    }
    
    public final void c() {
        if (this.i != null) {
            Optional optional = null;
            Label_0059: {
                if (((Optional)this.b.b).isPresent()) {
                    final wws a = wws.a((MessageLite)((Optional)this.b.b).get());
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
            final wxz wxz = (wxz)optional.get();
            this.e.D(wxz);
            if (this.h) {
                this.e.t(wxz, (alff)null);
                return;
            }
            this.e.o(wxz, (alff)null);
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
            final irv i = this.i;
            ajsq ajsq;
            if ((ajsq = ((ahhc)((Optional)this.b.b).get()).b) == null) {
                ajsq = ajsq.a;
            }
            ((qjg)i).c = abyh.b(ajsq).toString();
            this.i.g(true);
            return;
        }
        final irv j = this.i;
        ((qjg)j).c = "";
        j.g(false);
    }
    
    @Override
    public final String oQ() {
        return "menu_item_account_linking";
    }
}
