import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsu extends agzi implements ahax
{
    public static final ahsu a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public aioe e;
    public agzy f;
    public agzy g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahsu.class, a = new ahsu());
    }
    
    private ahsu() {
        this.i = 2;
        this.c = "";
        this.d = "";
        this.f = agzi.emptyProtobufList();
        this.g = agzi.emptyProtobufList();
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
                if ((h = ahsu.h) == null) {
                    synchronized (ahsu.class) {
                        if (ahsu.h == null) {
                            ahsu.h = (ahbe)new agzb((agzi)ahsu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahsu.a;
            }
            case 4: {
                return new agza((agzi)ahsu.a);
            }
            case 3: {
                return new ahsu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsu.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0004\u1409\u0003\u0005\u041b\u0006\u041b", new Object[] { "b", "c", "d", "e", "f", aioe.class, "g", aioe.class });
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
