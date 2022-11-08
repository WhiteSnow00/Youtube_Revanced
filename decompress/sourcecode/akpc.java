import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpc extends agzi implements ahax
{
    public static final akpc a;
    private static volatile ahbe h;
    public int b;
    public akjd c;
    public boolean d;
    public agzy e;
    public boolean f;
    public akpd g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(akpc.class, a = new akpc());
    }
    
    private akpc() {
        this.i = 2;
        this.e = agzi.emptyProtobufList();
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
                if ((h = akpc.h) == null) {
                    synchronized (akpc.class) {
                        if (akpc.h == null) {
                            akpc.h = (ahbe)new agzb((agzi)akpc.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akpc.a;
            }
            case 4: {
                return new agza((byte[])null, (int[][])null);
            }
            case 3: {
                return new akpc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpc.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u1007\u0001\u0004\u041b\u0006\u1007\u0003\b\u1009\u0005", new Object[] { "b", "c", "d", "e", ahij.class, "f", "g" });
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
