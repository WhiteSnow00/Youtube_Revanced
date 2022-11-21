import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acri implements acsq
{
    private static final afbk a;
    private final afbh b;
    
    static {
        a = new acrh(0);
    }
    
    public acri() {
        this(afag.a);
    }
    
    public acri(final afbh b) {
        b.getClass();
        this.b = b;
    }
    
    public final /* bridge */ void b(final Object o, final acsp acsp) {
        final almh almh = (almh)o;
        if ((almh.c & 0x40000000) != 0x0) {
            aoft aoft;
            if ((aoft = almh.L) == null) {
                aoft = aoft.a;
            }
            aofv aofv;
            if ((aofv = aoft.r) == null) {
                aofv = aofv.a;
            }
            if ((aofv.b & 0x4) != 0x0) {
                acsp.a((Object)new vhy(aoft));
                return;
            }
            aofv aofv2;
            if ((aofv2 = aoft.r) == null) {
                aofv2 = aofv.a;
            }
            if ((aofv2.b & 0x8) != 0x0) {
                acsp.a((Object)new vih(aoft));
            }
        }
        else {
            final MessageLite j = vqf.j(almh);
            if (j != null) {
                acsp.a(aamz.v(this.b, j));
            }
        }
    }
    
    public final void c() {
    }
    
    public final afbk e() {
        return acri.a;
    }
}
