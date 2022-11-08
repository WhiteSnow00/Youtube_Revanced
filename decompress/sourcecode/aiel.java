import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiel extends agzi implements ahax
{
    public static final aiel a;
    private static volatile ahbe f;
    public int b;
    public ajsq c;
    public aiek d;
    public agzy e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aiel.class, (agzi)(a = new aiel()));
    }
    
    private aiel() {
        this.g = 2;
        this.e = emptyProtobufList();
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
                final ahbe f;
                if ((f = aiel.f) == null) {
                    synchronized (aiel.class) {
                        if (aiel.f == null) {
                            aiel.f = (ahbe)new agzb((agzi)aiel.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiel.a;
            }
            case 4: {
                return new agza((agzi)aiel.a);
            }
            case 3: {
                return new aiel();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiel.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b", new Object[] { "b", "c", "d", "e", aibc.class });
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
