import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomk extends agzi implements ahax
{
    public static final aomk a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public agzy d;
    public int e;
    public int f;
    public aomm g;
    private ajsq i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aomk.class, (agzi)(a = new aomk()));
    }
    
    private aomk() {
        this.j = 2;
        this.d = emptyProtobufList();
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
                if ((h = aomk.h) == null) {
                    synchronized (aomk.class) {
                        if (aomk.h == null) {
                            aomk.h = (ahbe)new agzb((agzi)aomk.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aomk.a;
            }
            case 4: {
                return new agza((agzi)aomk.a);
            }
            case 3: {
                return new aomk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomk.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u100b\u0003\u0005\u1009\u0005\u0007\u100c\u0004", new Object[] { "b", "c", "i", "d", ajsq.class, "e", "g", "f", ahne.a() });
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
