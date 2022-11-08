import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahuq extends agzi implements ahax
{
    public static final ahuq a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahuq.class, a = new ahuq());
    }
    
    private ahuq() {
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
                if ((b2 = ahuq.b) == null) {
                    synchronized (ahuq.class) {
                        if (ahuq.b == null) {
                            ahuq.b = (ahbe)new agzb((agzi)ahuq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahuq.a;
            }
            case 4: {
                return new agza((agzi)ahuq.a);
            }
            case 3: {
                return new ahuq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahuq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
