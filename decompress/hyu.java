// 
// Decompiled by Procyon v0.6.0
// 

public final class hyu
{
    private final Object a;
    private final aezp b;
    private final aezp c;
    private final aezp d;
    private final aezp e;
    private final aezp f;
    private final aezp g;
    private final aezp h;
    
    private hyu(final Object a, final anvg anvg) {
        this.a = a;
        anvg.getClass();
        final int b = anvg.b;
        boolean b2 = false;
        Label_0093: {
            if ((b & 0x4) == 0x0) {
                if ((b & 0x1) == 0x0) {
                    if ((b & 0x10) == 0x0) {
                        if ((b & 0x20) == 0x0) {
                            if ((b & 0x8) == 0x0) {
                                if ((b & 0x2) == 0x0) {
                                    if ((b & 0x200) == 0x0) {
                                        b2 = false;
                                        break Label_0093;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b2 = true;
        }
        adkp.I(b2, "At least one renderer must be non-null");
        final int b3 = anvg.b;
        final Object o = null;
        amgu amgu;
        if ((b3 & 0x4) != 0x0) {
            if ((amgu = anvg.e) == null) {
                amgu = amgu.a;
            }
        }
        else {
            amgu = null;
        }
        this.b = aezp.j((Object)amgu);
        amsn amsn;
        if ((anvg.b & 0x1) != 0x0) {
            if ((amsn = anvg.c) == null) {
                amsn = amsn.a;
            }
        }
        else {
            amsn = null;
        }
        this.c = aezp.j((Object)amsn);
        aiht aiht;
        if ((anvg.b & 0x10) != 0x0) {
            if ((aiht = anvg.g) == null) {
                aiht = aiht.a;
            }
        }
        else {
            aiht = null;
        }
        this.d = aezp.j((Object)aiht);
        akgk akgk;
        if ((anvg.b & 0x20) != 0x0) {
            if ((akgk = anvg.h) == null) {
                akgk = akgk.a;
            }
        }
        else {
            akgk = null;
        }
        this.e = aezp.j((Object)akgk);
        amgq amgq;
        if ((anvg.b & 0x8) != 0x0) {
            if ((amgq = anvg.f) == null) {
                amgq = amgq.a;
            }
        }
        else {
            amgq = null;
        }
        this.f = aezp.j((Object)amgq);
        amrw amrw;
        if ((anvg.b & 0x2) != 0x0) {
            if ((amrw = anvg.d) == null) {
                amrw = amrw.a;
            }
        }
        else {
            amrw = null;
        }
        this.g = aezp.j((Object)amrw);
        Object o2 = o;
        if ((anvg.b & 0x200) != 0x0 && (o2 = anvg.i) == null) {
            o2 = ansg.a;
        }
        this.h = aezp.j(o2);
    }
    
    public static hyu a(final Object o, final anvg anvg) {
        return new hyu(o, anvg);
    }
    
    public aezp b() {
        return this.e;
    }
    
    public aezp c() {
        return this.f;
    }
    
    public aezp d() {
        return this.b;
    }
    
    public aezp e() {
        return this.g;
    }
    
    public aezp f() {
        return this.c;
    }
    
    public aezp g() {
        return this.h;
    }
    
    public Object h() {
        return this.a;
    }
}
