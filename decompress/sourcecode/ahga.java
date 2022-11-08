import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahga extends agzi implements ahax
{
    public static final ahga a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public anss d;
    public String e;
    public String f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahga.class, a = new ahga());
    }
    
    private ahga() {
        this.h = 2;
        this.c = "";
        agzi.emptyProtobufList();
        this.e = "";
        this.f = "";
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
                if ((g = ahga.g) == null) {
                    synchronized (ahga.class) {
                        if (ahga.g == null) {
                            ahga.g = (ahbe)new agzb((agzi)ahga.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahga.a;
            }
            case 4: {
                return new agza((agzi)ahga.a);
            }
            case 3: {
                return new ahga();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahga.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0001\u0004\u1008\u0002\u0005\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
