import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiku extends agzi implements ahax
{
    public static final aiku a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public agzy d;
    public agyc e;
    public agzy f;
    public ajsq g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aiku.class, a = new aiku());
    }
    
    private aiku() {
        this.j = 2;
        this.d = agzi.emptyProtobufList();
        this.e = agyc.b;
        this.f = agzi.emptyProtobufList();
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
                if ((h = aiku.h) == null) {
                    synchronized (aiku.class) {
                        if (aiku.h == null) {
                            aiku.h = (ahbe)new agzb((agzi)aiku.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aiku.a;
            }
            case 4: {
                return new agza((int[])null, (boolean[])null);
            }
            case 3: {
                return new aiku();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiku.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u041b\u0006\u1409\u0003", new Object[] { "b", "c", "d", aiks.class, "i", "e", "f", aibc.class, "g" });
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
