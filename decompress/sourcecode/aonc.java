import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonc extends agzi implements ahax
{
    public static final aonc a;
    private static volatile ahbe d;
    public agzy b;
    public int c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aonc.class, (agzi)(a = new aonc()));
    }
    
    private aonc() {
        this.f = 2;
        this.b = emptyProtobufList();
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
                final ahbe d;
                if ((d = aonc.d) == null) {
                    synchronized (aonc.class) {
                        if (aonc.d == null) {
                            aonc.d = (ahbe)new agzb((agzi)aonc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aonc.a;
            }
            case 4: {
                return new agza((agzi)aonc.a);
            }
            case 3: {
                return new aonc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u041b\u0002\u100c\u0000", new Object[] { "e", "b", aonh.class, "c", aoiz.q });
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
