import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afph extends agzi implements ahax
{
    public static final afph a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public long e;
    public agzy f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(afph.class, a = new afph());
    }
    
    private afph() {
        this.h = 2;
        this.c = "";
        this.d = "";
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
                if ((g = afph.g) == null) {
                    synchronized (afph.class) {
                        if (afph.g == null) {
                            afph.g = (ahbe)new agzb((agzi)afph.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return afph.a;
            }
            case 4: {
                return new agza((agzi)afph.a);
            }
            case 3: {
                return new afph();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afph.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u1508\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u0431", new Object[] { "b", "c", "d", "e", "f", afpg.class });
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
