import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqyb extends agzi implements ahax
{
    private static final aqyb a;
    private static volatile ahbe b;
    private int c;
    private String d;
    private float e;
    
    static {
        agzi.registerDefaultInstance(aqyb.class, a = new aqyb());
    }
    
    private aqyb() {
        this.d = "";
    }
    
    public static aqya a() {
        return (aqya)aqyb.a.createBuilder();
    }
    
    private void e(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final float e) {
        this.c |= 0x2;
        this.e = e;
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
                if ((b = aqyb.b) == null) {
                    synchronized (aqyb.class) {
                        if (aqyb.b == null) {
                            aqyb.b = (ahbe)new agzb((agzi)aqyb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqyb.a;
            }
            case 4: {
                return new aqya();
            }
            case 3: {
                return new aqyb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqyb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "c", "d", "e" });
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
