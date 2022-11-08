import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiv extends agzi implements ahax
{
    public static final ahiv a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public agzy d;
    public int e;
    public String f;
    public agzy g;
    public agzy h;
    public ahlg i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)ahiv.class, (agzi)(a = new ahiv()));
    }
    
    private ahiv() {
        this.k = 2;
        this.d = emptyProtobufList();
        this.f = "";
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
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
                final ahbe j;
                if ((j = ahiv.j) == null) {
                    synchronized (ahiv.class) {
                        if (ahiv.j == null) {
                            ahiv.j = (ahbe)new agzb((agzi)ahiv.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahiv.a;
            }
            case 4: {
                return new agza((agzi)ahiv.a);
            }
            case 3: {
                return new ahiv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiv.a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0003\u0001\u0001\u100b\u0000\u0002\u041b\u0003\u100c\u0003\u0004\u1008\u0004\u0006\u001b\u0007\u001b\u000e\u1009\t", new Object[] { "b", "c", "d", ahiw.class, "e", ahho.f, "f", "g", ahky.class, "h", ahky.class, "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
