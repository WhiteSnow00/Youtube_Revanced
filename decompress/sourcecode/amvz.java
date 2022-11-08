import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvz extends agzi implements ahax
{
    public static final amvz a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public ajsq d;
    public aibc e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(amvz.class, a = new amvz());
    }
    
    private amvz() {
        this.h = 2;
        this.c = agzi.emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((f = amvz.f) == null) {
                    synchronized (amvz.class) {
                        if (amvz.f == null) {
                            amvz.f = (ahbe)new agzb((agzi)amvz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amvz.a;
            }
            case 4: {
                return new agza((agzi)amvz.a);
            }
            case 3: {
                return new amvz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvz.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0005\u1409\u0003", new Object[] { "b", "c", amvu.class, "d", "g", "e" });
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
