import android.os.Handler;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jux extends acpm
{
    private final vke a;
    private final tdz f;
    private final acno g;
    private final RecyclerView h;
    private final kzl i;
    private final qbo j;
    private final e k;
    private final lht l;
    
    public jux(final vke a, final tdz f, final acno g, final tny tny, final wwv wwv, final kzl i, final e k, final qbo j, final RecyclerView h, final auip auip, final acmc acmc, final lht l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(a, f, g, tny, wwv, acmc, (acmc)null, auip, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.f = f;
        this.g = g;
        this.i = i;
        this.k = k;
        this.l = l;
        this.h = h;
        this.j = j;
    }
    
    public final acnp a(final Object o, final acpi acpi, final acpd acpd) {
        if (o instanceof apot) {
            final qbo j = this.j;
            final apot apot = (apot)o;
            final RecyclerView h = this.h;
            final Context context = (Context)((atjj)j.e).a();
            final acno acno = (acno)((atjj)j.f).a();
            final tdz tdz = (tdz)((atjj)j.a).a();
            tdz.getClass();
            final Handler handler = (Handler)((atjj)j.d).a();
            handler.getClass();
            final aeby aeby = (aeby)((atjj)j.b).a();
            final bx bx = (bx)((atjj)j.c).a();
            final acae acae = (acae)((atjj)j.g).a();
            apot.getClass();
            return (acnp)new jjh(context, acno, tdz, handler, aeby, bx, acae, apot, h, acpd, null, null, null, null, null, null);
        }
        if (o instanceof ajpj) {
            return (acnp)new jsq(this.g, this.f, (ajpj)o);
        }
        if (o instanceof ver) {
            final jtn d = this.i.d(this.a, this.d, acpi);
            if (acpi == null) {
                ((acnw)d).j((ver)o);
            }
            return (acnp)d;
        }
        if (o instanceof anvw) {
            return (acnp)new jjb((anvw)o);
        }
        if (o instanceof veq) {
            final aobk a = ((veq)o).a;
            return (acnp)this.l.b(a, actc.f(a), this.b(a), acpi);
        }
        if (o instanceof vez) {
            final aobk a2 = ((vez)o).a;
            return (acnp)this.k.d(a2, actc.g(a2), acpi, (acik)null);
        }
        return super.a(o, acpi, acpd);
    }
}
