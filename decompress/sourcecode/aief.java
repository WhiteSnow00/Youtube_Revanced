import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aief extends agzi implements ahax
{
    public static final aief a;
    private static volatile ahbe h;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    public agyc g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aief.class, (agzi)(a = new aief()));
    }
    
    private aief() {
        this.j = 2;
        this.g = agyc.b;
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
                final ahbe h;
                if ((h = aief.h) == null) {
                    synchronized (aief.class) {
                        if (aief.h == null) {
                            aief.h = (ahbe)new agzb((agzi)aief.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aief.a;
            }
            case 4: {
                return new agza((agzi)aief.a);
            }
            case 3: {
                return new aief();
            }
            case 2: {
                return newMessageInfo((MessageLite)aief.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f", "i", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
