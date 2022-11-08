import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aive extends agzi implements ahax
{
    public static final aive a;
    private static volatile ahbe f;
    public int b;
    public aivf c;
    public aivd d;
    public aivg e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aive.class, a = new aive());
    }
    
    private aive() {
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
                if ((f = aive.f) == null) {
                    synchronized (aive.class) {
                        if (aive.f == null) {
                            aive.f = (ahbe)new agzb((agzi)aive.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aive.a;
            }
            case 4: {
                return new agza((agzi)aive.a);
            }
            case 3: {
                return new aive();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aive.a, "\u0001\u0003\u0000\u0001\ue5ee\u2bbc\ue4e4\u2bbf\u0003\u0000\u0000\u0003\ue5ee\u2bbc\u1409\u0002\ufe23\u2bbc\u1409\u0001\ue4e4\u2bbf\u1409\u0000", new Object[] { "b", "e", "d", "c" });
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
