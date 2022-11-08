import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahen extends agzi implements ahax
{
    public static final ahen a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahen.class, a = new ahen());
    }
    
    private ahen() {
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
                if ((c = ahen.c) == null) {
                    synchronized (ahen.class) {
                        if (ahen.c == null) {
                            ahen.c = (ahbe)new agzb((agzi)ahen.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahen.a;
            }
            case 4: {
                return new agza((char[][][])null, (byte[])null);
            }
            case 3: {
                return new ahen();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahen.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
