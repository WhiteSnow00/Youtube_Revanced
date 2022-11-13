import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdh implements abps
{
    public final jdg a;
    public final arkg b;
    public final acbm c;
    public final wyw d;
    
    public jdh(final jdg a, final arkg b, final acbm c, final wyw d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        tpe.v((View)a, false);
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an((asjm)new jce(this, 16), (asjm)ixp.s);
        }
        else {
            asir = abpu.P().R().j(aale.q(1)).an((asjm)new jce(this, 16), (asjm)ixp.t);
        }
        return new asir[] { asir };
    }
}
