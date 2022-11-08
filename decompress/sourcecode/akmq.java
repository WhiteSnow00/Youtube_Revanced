import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmq extends agzi implements ahax
{
    public static final akmq a;
    private static volatile ahbe h;
    public int b;
    public agzy c;
    public int d;
    public anss e;
    public aioe f;
    public anss g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(akmq.class, a = new akmq());
    }
    
    private akmq() {
        this.i = 2;
        this.c = agzi.emptyProtobufList();
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
                final ahbe h;
                if ((h = akmq.h) == null) {
                    synchronized (akmq.class) {
                        if (akmq.h == null) {
                            akmq.h = (ahbe)new agzb((agzi)akmq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akmq.a;
            }
            case 4: {
                return new agza((agzi)akmq.a);
            }
            case 3: {
                return new akmq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmq.a, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0001\u0003\u0003\u001b\u0005\u1004\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006", new Object[] { "b", "c", akmr.class, "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
