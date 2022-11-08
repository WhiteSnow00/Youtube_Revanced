import android.text.Spanned;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class acpl extends aclw
{
    public acpl(final acno acno, final tdz tdz, final aobk aobk, final aphw aphw, final acpb acpb, final acae acae, final acpi acpi) {
        final agzy c = aphw.c;
        final int e = actc.e(aphw);
        final acpg a = acpg.a;
        final aewp a2 = aewp.a;
        ajsq ajsq;
        if ((aphw.b & 0x2) != 0x0) {
            if ((ajsq = aphw.e) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        final Spanned b = abyh.b(ajsq);
        ajsq ajsq2;
        if ((aphw.b & 0x4) != 0x0) {
            if ((ajsq2 = aphw.f) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        final Spanned b2 = abyh.b(ajsq2);
        aioe aioe;
        if ((aphw.b & 0x10) != 0x0) {
            if ((aioe = aphw.h) == null) {
                aioe = aioe.a;
            }
        }
        else {
            aioe = null;
        }
        int as;
        if ((as = aqql.as(aphw.i)) == 0) {
            as = 1;
        }
        int n;
        if (--as != 2) {
            if (as != 3) {
                n = 1;
            }
            else {
                n = 3;
            }
        }
        else {
            n = 2;
        }
        super(acno, tdz, aobk, (List)c, e, (acnc)a, (aexq)a2, (CharSequence)b, (CharSequence)b2, aioe, n, aphw.g, acpb, acae, acpi);
    }
    
    protected final Class d() {
        return aphw.class;
    }
    
    protected void f() {
        this.o((acpb)new acpk());
    }
}
