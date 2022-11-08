import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankb extends agzi implements ahax
{
    private static final ankb a;
    private static volatile ahbe b;
    private int c;
    private String d;
    private apni e;
    private int f;
    private float g;
    private int h;
    
    static {
        agzi.registerDefaultInstance(ankb.class, a = new ankb());
    }
    
    private ankb() {
        this.d = "";
    }
    
    public static anka a() {
        return (anka)ankb.a.createBuilder();
    }
    
    private void h(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void i(final int h) {
        this.c |= 0x10;
        this.h = h;
    }
    
    private void j(final anjz anjz) {
        this.f = anjz.d;
        this.c |= 0x4;
    }
    
    private void k(final apni e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void l(final float g) {
        this.c |= 0x8;
        this.g = g;
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
                if ((b = ankb.b) == null) {
                    synchronized (ankb.class) {
                        if (ankb.b == null) {
                            ankb.b = (ahbe)new agzb((agzi)ankb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ankb.a;
            }
            case 4: {
                return new anka();
            }
            case 3: {
                return new ankb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1001\u0003\u0005\u1004\u0004", new Object[] { "c", "d", "e", "f", anjz.a(), "g", "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
