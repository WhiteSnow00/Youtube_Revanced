import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocl extends agzi implements ahax
{
    public static final aocl a;
    private static volatile ahbe f;
    public int b;
    public aonw c;
    public anss d;
    public anss e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aocl.class, a = new aocl());
    }
    
    private aocl() {
        this.g = 2;
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
                final ahbe f;
                if ((f = aocl.f) == null) {
                    synchronized (aocl.class) {
                        if (aocl.f == null) {
                            aocl.f = (ahbe)new agzb((agzi)aocl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aocl.a;
            }
            case 4: {
                return new agza((agzi)aocl.a);
            }
            case 3: {
                return new aocl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
