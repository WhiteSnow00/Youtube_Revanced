import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdz extends agzi implements ahax
{
    public static final apdz a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public String d;
    public agzy e;
    public agzy f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apdz.class, a = new apdz());
    }
    
    private apdz() {
        this.h = 2;
        this.d = "";
        this.e = agzi.emptyProtobufList();
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
                final ahbe g;
                if ((g = apdz.g) == null) {
                    synchronized (apdz.class) {
                        if (apdz.g == null) {
                            apdz.g = (ahbe)new agzb((agzi)apdz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apdz.a;
            }
            case 4: {
                return new agza((boolean[][])null, (char[][])null);
            }
            case 3: {
                return new apdz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdz.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u001b", new Object[] { "b", "c", "d", "e", aoaf.class, "f", aoaf.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
