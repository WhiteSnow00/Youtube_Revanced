import java.util.Iterator;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exx extends jtn implements tec
{
    private static final acik b;
    private Map c;
    private acib d;
    private final e g;
    private final lht h;
    private final auip m;
    
    static {
        b = (acik)fut.a;
    }
    
    public exx(final acno acno, final tdz tdz, final tny tny, final acae acae, final oas oas, final hyw hyw, final aexq aexq, final aeby aeby, final avt avt, final asho asho, final e g, final lht h, final auip m, final vke vke, final wwv wwv, final acpi acpi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(acno, tdz, tny, acae, oas, hyw, aexq, aeby, avt, asho, vke, wwv, acpi.a(acpi), (byte[])null, (byte[])null, (byte[])null);
        this.c = new HashMap();
        this.d = new acib();
        if (acpi instanceof exw) {
            final exw exw = (exw)acpi;
            this.c = exw.a;
            this.d = exw.b;
        }
        this.g = g;
        this.h = h;
        this.m = m;
        final acjb i = ((acmv)this).i;
        if (i != null) {
            ((achk)i).qK((achj)new jjf(this, 1));
        }
        ((acnw)this).P((acpb)new lcx(1));
    }
    
    public final achk a() {
        return (achk)this.d;
    }
    
    public final void d() {
        this.d.t();
        final acjb i = ((acmv)this).i;
        for (int j = 0; j < ((tdv)i).size(); ++j) {
            final Object value = ((tdv)i).get(j);
            final boolean b = value instanceof vez;
            if (!b && !(value instanceof veq)) {
                if (!(value instanceof achk)) {
                    final acjb acjb = new acjb();
                    acjb.add(value);
                    this.d.m((achk)acjb);
                }
                else {
                    this.d.m((achk)value);
                }
            }
            else if (this.c.containsKey(value)) {
                this.d.m(((aclr)this.c.get(value)).a());
            }
            else {
                Object o = null;
                if (b) {
                    final aobk a = ((vez)value).a;
                    final e g = this.g;
                    aobm aobm;
                    if ((aobm = a.r) == null) {
                        aobm = aobm.a;
                    }
                    aphw aphw;
                    if ((aphw = aobm.f) == null) {
                        aphw = aphw.a;
                    }
                    o = g.d(a, aphw, (acpi)null, exx.b);
                }
                else if (value instanceof veq) {
                    final aobk a2 = ((veq)value).a;
                    final lht h = this.h;
                    aobm aobm2;
                    if ((aobm2 = a2.r) == null) {
                        aobm2 = aobm.a;
                    }
                    akah akah;
                    if ((akah = aobm2.e) == null) {
                        akah = akah.a;
                    }
                    o = h.b(a2, akah, (acnc)this.m.I(a2, acmc.a), (acpi)null);
                }
                if (o != null) {
                    this.d.m(((aclr)o).a());
                    this.c.put(value, o);
                }
            }
        }
    }
    
    public final void f() {
        final HashSet set = new HashSet();
        for (int i = 0; i < ((tdv)((acmv)this).i).size(); ++i) {
            set.add(((tdv)((acmv)this).i).get(i));
        }
        for (final Object next : this.c.keySet()) {
            if (!set.contains(next)) {
                ((aclr)this.c.get(next)).rU();
            }
        }
        Collection$_EL.removeIf((Collection)this.c.entrySet(), (Predicate)new fqe((Set)set, 1));
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (clazz == exx.class) {
            Class[] array = null;
            switch (n) {
                default: {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                case 5: {
                    ((acnw)this).Q((acnr)o);
                    break;
                }
                case 4: {
                    this.p((voi)o);
                    break;
                }
                case 3: {
                    ((acnw)this).R((voh)o);
                    break;
                }
                case 2: {
                    ((acnw)this).n((uxr)o);
                    break;
                }
                case 1: {
                    ((acnw)this).qO((uxq)o);
                    break;
                }
                case 0: {
                    this.o((hxz)o);
                    break;
                }
                case -1: {
                    array = new Class[] { hxz.class, uxq.class, uxr.class, voh.class, voi.class, acnr.class };
                    break;
                }
            }
            return array;
        }
        return super.ms(clazz, o, n);
    }
    
    public final acpi qv() {
        return new exw(super.qv(), this.c, this.d);
    }
    
    public final void rU() {
        super.rU();
        final Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((aclr)iterator.next()).rU();
        }
    }
}
