// 
// Decompiled by Procyon v0.6.0
// 

public final class gdy implements gdz
{
    private final akav a;
    
    public gdy(final akav a) {
        this.a = a;
    }
    
    public final aiqj a() {
        final akav a = this.a;
        if (a == null) {
            return null;
        }
        aiqj a2;
        if (a.c == 3) {
            a2 = (aiqj)a.d;
        }
        else {
            a2 = aiqj.a;
        }
        return a2;
    }
    
    public final aiqj b() {
        final akav a = this.a;
        if (a == null) {
            return null;
        }
        aiqj a2;
        if (a.c == 2) {
            a2 = (aiqj)a.d;
        }
        else {
            a2 = aiqj.a;
        }
        return a2;
    }
    
    public final akdi c() {
        final akav a = this.a;
        if (a == null) {
            return null;
        }
        akdi akdi;
        if ((akdi = a.e) == null) {
            akdi = akdi.a;
        }
        return akdi;
    }
    
    public final Object d() {
        return this.a;
    }
    
    public final String e() {
        final akav a = this.a;
        if (a != null && (a.b & 0x8) != 0x0) {
            ahik ahik;
            if ((ahik = a.f) == null) {
                ahik = ahik.a;
            }
            return ahik.c;
        }
        return null;
    }
}
