import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmg extends agzi implements ahax
{
    public static final apmg a;
    private static volatile ahbe b;
    private int c;
    private aibb d;
    private aokb e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)apmg.class, (agzi)(a = new apmg()));
    }
    
    private apmg() {
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
                final ahbe b2;
                if ((b2 = apmg.b) == null) {
                    synchronized (apmg.class) {
                        if (apmg.b == null) {
                            apmg.b = (ahbe)new agzb((agzi)apmg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apmg.a;
            }
            case 4: {
                return new agza((agzi)apmg.a);
            }
            case 3: {
                return new apmg();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmg.a, "\u0001\u0002\u0000\u0001\ue2d9\u1a6d\ueb11\u1f11\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u1409\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "e", "d" });
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
