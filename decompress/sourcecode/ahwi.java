import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwi extends agzi implements ahax
{
    public static final ahwi a;
    private static volatile ahbe c;
    public agzy b;
    private int d;
    private ahij e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahwi.class, a = new ahwi());
    }
    
    private ahwi() {
        this.f = 2;
        this.b = agzi.emptyProtobufList();
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
                final ahbe c;
                if ((c = ahwi.c) == null) {
                    synchronized (ahwi.class) {
                        if (ahwi.c == null) {
                            ahwi.c = (ahbe)new agzb((agzi)ahwi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahwi.a;
            }
            case 4: {
                return new agza((agzi)ahwi.a);
            }
            case 3: {
                return new ahwi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "d", "b", aioe.class, "e" });
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
