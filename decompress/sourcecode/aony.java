import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aony extends agzi implements ahax
{
    public static final aony a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aony.class, (agzi)(a = new aony()));
    }
    
    private aony() {
        this.f = 2;
        final agyc b = agyc.b;
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
                if ((b2 = aony.b) == null) {
                    synchronized (aony.class) {
                        if (aony.b == null) {
                            aony.b = (ahbe)new agzb((agzi)aony.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aony.a;
            }
            case 4: {
                return new agza((agzi)aony.a);
            }
            case 3: {
                return new aony();
            }
            case 2: {
                return newMessageInfo((MessageLite)aony.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
