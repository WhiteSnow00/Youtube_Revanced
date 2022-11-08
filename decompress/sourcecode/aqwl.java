import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwl extends agzi implements ahax
{
    private static final aqwl a;
    private static volatile ahbe b;
    private int c;
    private Object d;
    
    static {
        agzi.registerDefaultInstance(aqwl.class, a = new aqwl());
    }
    
    private aqwl() {
        this.c = 0;
    }
    
    private void A(final aqxp d) {
        d.getClass();
        this.d = d;
        this.c = 3;
    }
    
    private void B(final aqxw d) {
        d.getClass();
        this.d = d;
        this.c = 1;
    }
    
    private void C(final aqxh aqxh) {
        this.d = aqxh.e;
        this.c = 13;
    }
    
    private void D(final aqyb d) {
        d.getClass();
        this.d = d;
        this.c = 7;
    }
    
    public static aqwg a() {
        return (aqwg)aqwl.a.createBuilder();
    }
    
    private void r(final aqvh d) {
        d.getClass();
        this.d = d;
        this.c = 6;
    }
    
    private void s(final aqvx d) {
        d.getClass();
        this.d = d;
        this.c = 11;
    }
    
    private void t(final aqwa d) {
        d.getClass();
        this.d = d;
        this.c = 8;
    }
    
    private void u(final aqwi d) {
        d.getClass();
        this.d = d;
        this.c = 4;
    }
    
    private void v(final aqxf d) {
        d.getClass();
        this.d = d;
        this.c = 2;
    }
    
    private void w(final aqwj d) {
        d.getClass();
        this.d = d;
        this.c = 12;
    }
    
    private void x(final aqxj d) {
        d.getClass();
        this.d = d;
        this.c = 15;
    }
    
    private void y(final aqxm d) {
        d.getClass();
        this.d = d;
        this.c = 9;
    }
    
    private void z(final aqxo d) {
        d.getClass();
        this.d = d;
        this.c = 14;
    }
    
    public aqxm c() {
        if (this.c == 9) {
            return (aqxm)this.d;
        }
        return aqxm.e();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqwl.b) == null) {
                    synchronized (aqwl.class) {
                        if (aqwl.b == null) {
                            aqwl.b = (ahbe)new agzb((agzi)aqwl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwl.a;
            }
            case 4: {
                return new aqwg();
            }
            case 3: {
                return new aqwl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwl.a, "\u0001\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000\f\u103c\u0000\r\u103f\u0000\u000e\u103c\u0000\u000f\u103c\u0000", new Object[] { "d", "c", aqxw.class, aqxf.class, aqxp.class, aqwi.class, aqwk.class, aqvh.class, aqyb.class, aqwa.class, aqxm.class, aqvn.class, aqvx.class, aqwj.class, aqxh.a(), aqxo.class, aqxj.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public boolean q() {
        return this.c == 9;
    }
}
