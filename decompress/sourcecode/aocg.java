import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocg extends agzi implements ahax
{
    public static final aocg a;
    private static volatile ahbe e;
    public int b;
    public aodt c;
    public long d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aocg.class, a = new aocg());
    }
    
    private aocg() {
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
                final ahbe e;
                if ((e = aocg.e) == null) {
                    synchronized (aocg.class) {
                        if (aocg.e == null) {
                            aocg.e = (ahbe)new agzb((agzi)aocg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aocg.a;
            }
            case 4: {
                return new agza((agzi)aocg.a);
            }
            case 3: {
                return new aocg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
