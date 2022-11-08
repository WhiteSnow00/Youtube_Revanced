import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqk extends agzi implements ahax
{
    public static final ahqk a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahqk.class, a = new ahqk());
    }
    
    private ahqk() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahqk.c) == null) {
                    synchronized (ahqk.class) {
                        if (ahqk.c == null) {
                            ahqk.c = (ahbe)new agzb((agzi)ahqk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahqk.a;
            }
            case 4: {
                return new agza((agzi)ahqk.a);
            }
            case 3: {
                return new ahqk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqk.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahql.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
