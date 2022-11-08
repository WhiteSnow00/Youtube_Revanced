import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieb extends agzi implements ahax
{
    public static final aieb a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private aibc e;
    private aioe f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aieb.class, (agzi)(a = new aieb()));
    }
    
    private aieb() {
        this.g = 2;
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
                final ahbe b2;
                if ((b2 = aieb.b) == null) {
                    synchronized (aieb.class) {
                        if (aieb.b == null) {
                            aieb.b = (ahbe)new agzb((agzi)aieb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aieb.a;
            }
            case 4: {
                return new agza((agzi)aieb.a);
            }
            case 3: {
                return new aieb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
