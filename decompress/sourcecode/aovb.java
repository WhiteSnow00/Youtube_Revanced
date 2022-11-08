import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovb extends agzi implements ahax
{
    public static final aovb a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aovb.class, a = new aovb());
    }
    
    private aovb() {
        this.f = 2;
    }
    
    @Override
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
                if ((b2 = aovb.b) == null) {
                    synchronized (aovb.class) {
                        if (aovb.b == null) {
                            aovb.b = (ahbe)new agzb((agzi)aovb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovb.a;
            }
            case 4: {
                return new agza((agzi)aovb.a);
            }
            case 3: {
                return new aovb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovb.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
