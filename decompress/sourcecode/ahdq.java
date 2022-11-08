import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdq extends agzi implements ahax
{
    public static final ahdq a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public agzy d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahdq.class, a = new ahdq());
    }
    
    private ahdq() {
        this.f = 2;
        this.d = agzi.emptyProtobufList();
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
                if ((e = ahdq.e) == null) {
                    synchronized (ahdq.class) {
                        if (ahdq.e == null) {
                            ahdq.e = (ahbe)new agzb((agzi)ahdq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahdq.a;
            }
            case 4: {
                return new agza((int[][][])null, (short[][][])null);
            }
            case 3: {
                return new ahdq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u150b\u0000\u0002\u041b", new Object[] { "b", "c", "d", ahdp.class });
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
