import android.content.res.Configuration;
import android.text.Spanned;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jst extends aclw
{
    private static final jss a;
    private final jsr b;
    
    static {
        a = new jss();
    }
    
    public jst(final Context context, final acno acno, final tdz tdz, final acae acae, final acae acae2, final aobk aobk, final ajxm ajxm, final jsr b, final acpi acpi) {
        final agzy c = ajxm.c;
        final int size = c.size();
        final aewp a = aewp.a;
        ajsq ajsq;
        if ((ajxm.b & 0x2) != 0x0) {
            if ((ajsq = ajxm.d) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        final Spanned b2 = abyh.b(ajsq);
        aioe aioe;
        if ((aioe = aobk.o) == null) {
            aioe = aioe.a;
        }
        int f = 0;
        Label_0143: {
            if ((ajxm.b & 0x80) != 0x0) {
                ajxn ajxn;
                if ((ajxn = ajxm.f) == null) {
                    ajxn = ajxn.a;
                }
                f = afld.F(ajxn.b);
                if (f != 0) {
                    break Label_0143;
                }
            }
            f = 1;
        }
        super(acno, tdz, aobk, (List)c, size, (acnc)b, (aexq)a, (CharSequence)null, (CharSequence)b2, aioe, 1, false, (acpb)acae, acae2, acpi, (aclu)new jvi(context, f, 1, null));
        this.b = b;
    }
    
    protected final Class d() {
        return ajxm.class;
    }
    
    protected final void f() {
        this.o((acpb)jst.a);
    }
    
    public final void lI(final Configuration configuration) {
        final jsr b = this.b;
        b.d(b.a());
    }
}
