import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqa extends agzi implements ahax
{
    public static final akqa a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aibc e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akqa.class, a = new akqa());
    }
    
    private akqa() {
        this.f = 2;
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
                final ahbe b2;
                if ((b2 = akqa.b) == null) {
                    synchronized (akqa.class) {
                        if (akqa.b == null) {
                            akqa.b = (ahbe)new agzb((agzi)akqa.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return akqa.a;
            }
            case 4: {
                return new agza((agzi)akqa.a);
            }
            case 3: {
                return new akqa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akqa.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0000\u0004\u1409\u0001", new Object[] { "c", "d", "e" });
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
