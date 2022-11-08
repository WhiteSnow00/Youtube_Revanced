import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgw extends agzi implements ahax
{
    public static final aqgw a;
    public static final agzg b;
    private static volatile ahbe c;
    private int d;
    private aqfs e;
    private byte f;
    
    static {
        final aqgw a2 = new aqgw();
        agzi.registerDefaultInstance((Class)aqgw.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 238551640, ahcm.k, (Class)aqgw.class);
    }
    
    private aqgw() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aqgw.c) == null) {
                    synchronized (aqgw.class) {
                        if (aqgw.c == null) {
                            aqgw.c = (ahbe)new agzb((agzi)aqgw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqgw.a;
            }
            case 4: {
                return new agza((agzi)aqgw.a);
            }
            case 3: {
                return new aqgw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
