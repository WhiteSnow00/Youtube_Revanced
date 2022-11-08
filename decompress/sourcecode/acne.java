import android.text.Spanned;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class acne extends aclw
{
    public acne(final acno acno, final tdz tdz, final aobk aobk, final akah akah, final acnc acnc, final acpb acpb, final acpi acpi, final aexq aexq, final acae acae, final aclu aclu) {
        final agzy c = akah.c;
        final int d = actc.d(akah);
        ajsq ajsq;
        if ((akah.b & 0x4) != 0x0) {
            if ((ajsq = akah.f) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        final Spanned b = abyh.b(ajsq);
        aioe aioe;
        if ((aioe = aobk.o) == null) {
            aioe = aioe.a;
        }
        super(acno, tdz, aobk, (List)c, d, acnc, aexq, (CharSequence)null, (CharSequence)b, aioe, 1, false, acpb, acae, acpi, aclu);
    }
    
    public acne(final acno acno, final tdz tdz, final aobk aobk, final akah akah, final acnc acnc, final acpi acpi) {
        final aewp a = aewp.a;
        final agzy c = akah.c;
        final int d = actc.d(akah);
        ajsq ajsq;
        if ((akah.b & 0x4) != 0x0) {
            if ((ajsq = akah.f) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        final Spanned b = abyh.b(ajsq);
        aioe aioe;
        if ((aioe = aobk.o) == null) {
            aioe = aioe.a;
        }
        super(acno, tdz, aobk, (List)c, d, acnc, (aexq)a, (CharSequence)null, (CharSequence)b, aioe, 1, false, (acpb)null, (acae)null, acpi);
    }
    
    protected final Class d() {
        return akah.class;
    }
    
    protected final void f() {
        this.o((acpb)new acnd(this.k));
    }
}
