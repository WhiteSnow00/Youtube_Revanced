import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidb extends agzi implements ahax
{
    public static final aidb a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance((Class)aidb.class, (agzi)(a = new aidb()));
    }
    
    private aidb() {
        this.d = 2;
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
                final ahbe c;
                if ((c = aidb.c) == null) {
                    synchronized (aidb.class) {
                        if (aidb.c == null) {
                            aidb.c = (ahbe)new agzb((agzi)aidb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aidb.a;
            }
            case 4: {
                return new agza((agzi)aidb.a);
            }
            case 3: {
                return new aidb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aidc.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
