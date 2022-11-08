import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ainu extends agzi implements ahax
{
    public static final ainu a;
    private static volatile ahbe d;
    public anss b;
    public int c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ainu.class, a = new ainu());
    }
    
    private ainu() {
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
                final ahbe d;
                if ((d = ainu.d) == null) {
                    synchronized (ainu.class) {
                        if (ainu.d == null) {
                            ainu.d = (ahbe)new agzb((agzi)ainu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ainu.a;
            }
            case 4: {
                return new agza((agzi)ainu.a);
            }
            case 3: {
                return new ainu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ainu.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002\u100c\u0001\u0003\u1409\u0000", new Object[] { "e", "c", ahho.g, "b" });
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
